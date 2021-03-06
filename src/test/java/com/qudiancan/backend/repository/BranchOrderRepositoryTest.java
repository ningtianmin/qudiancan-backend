package com.qudiancan.backend.repository;

import com.qudiancan.backend.BackEndApplicationTests;
import com.qudiancan.backend.pojo.po.BranchOrderPO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author NINGTIANMIN
 */
@Transactional
public class BranchOrderRepositoryTest extends BackEndApplicationTests {
    @Autowired
    private BranchOrderRepository repository;

    @Test
    public void testFindAll() {
        List<BranchOrderPO> all = repository.findAll();
    }
}