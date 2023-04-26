package com.portfolio.gise.Security.Service;

import com.portfolio.gise.Security.Entity.Rol;
import com.portfolio.gise.Security.Enums.RolNombre;
import com.portfolio.gise.Security.Repository.iRolRepository;
import javax.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        irolRepository.save(rol);
    }
}