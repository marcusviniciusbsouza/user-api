package com.br.api.v1.listener;

import com.br.api.v1.model.DepartmentModel;
import org.springframework.stereotype.Component;

@Component
public class DepartmentListener {
    public void onDepartmentCreated(DepartmentModel departmentModel) {
        System.out.println("departamento recebido:" + departmentModel.getNome());
    }
}
