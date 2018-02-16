package com.qudiancan.backend.repository;

import com.qudiancan.backend.BackEndApplicationTests;
import com.qudiancan.backend.pojo.po.BranchTablePO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author NINGTIANMIN
 */
public class BranchTableRepositoryTest extends BackEndApplicationTests {
    @Autowired
    private BranchTableRepository repository;

    @Test
    public void testFindAll() {
        List<BranchTablePO> all = repository.findAll();
        Assert.assertNotEquals(0, all.size());
    }
}