package com.ThePrince.PortfolioManagementSystem.Services.Directory;

import com.ThePrince.PortfolioManagementSystem.DAOs.Directory.Directory;
import com.ThePrince.PortfolioManagementSystem.DAOs.UserEntity.Owner;
import com.ThePrince.PortfolioManagementSystem.DTOs.Directory.DirectoryDTO;
import com.ThePrince.PortfolioManagementSystem.DTOs.Directory.DirectoryPathDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DirectoryService {

    public Directory intializeGenesisDirectory(Owner owner); //creates the first Directory given to a new Portfolio Owner

    public ResponseEntity<Object> createNewDirectory(Owner owner, DirectoryPathDTO parentDirectory, DirectoryDTO directoryDTO);

    public ResponseEntity<Object> getDirectoryById(long id);

    public ResponseEntity<Object> findDirectoryPath(long id,List<DirectoryPathDTO> directoryPathDTOS); //returns the directory Path

    public ResponseEntity<Object> moveDirectory(long id, long newParentDirectoryId);   //returns the new Parent Directory

    public ResponseEntity<Object> deleteDirectoryById(long id); //returns all the child directories that were deleted with it

    public ResponseEntity<Object> copyDirectory(long id, long parentId, @AuthenticationPrincipal UserDetails userDetails);

    public ResponseEntity<Object> updateDirectory(long id, DirectoryDTO directoryDTO);
}
