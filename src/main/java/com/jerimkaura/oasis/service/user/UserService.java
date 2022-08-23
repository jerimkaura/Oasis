package com.jerimkaura.oasis.service.user;

import com.jerimkaura.oasis.domain.Church;
import com.jerimkaura.oasis.domain.Role;
import com.jerimkaura.oasis.domain.User;
import com.jerimkaura.oasis.web.models.dto.UserDto;
import com.jerimkaura.oasis.web.models.requests.UploadProfilePictureDto;

import java.io.IOException;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUserByUserName(String username);
    User getUserById(Long id);
    List<User> getUsers();
    List<User> getUsersByChurch(Church church);
    UserDto uploadProfilePicture(UploadProfilePictureDto pictureDto) throws IOException;
}
