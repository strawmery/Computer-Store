package org.factoriaf5.computerstore;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ComputerStoreTests {
    @Test
    void TestComputerStoreConstructor() {
        String storeName = "Factoria F5 Computer Store";
        String propietary = "Maria Garcia";
        int tributaryId = 123456789;
        
        ComputerStore computerStore = new ComputerStore(storeName, propietary, tributaryId);
        
        assertEquals(storeName, computerStore.getStoreName());
        assertEquals(propietary, computerStore.getPropietary());
        assertEquals(tributaryId, computerStore.getTributaryId());
        assertEquals(0, computerStore.getComputers().size());
    }
    @Test
    void TestComputerStoreName() {
        ComputerStore computerStore = new ComputerStore();

        computerStore.setStoreName("Factoria F5 Computer Store");
        assertEquals("Factoria F5 Computer Store", computerStore.getStoreName());
    }
    @Test
    void TestComputerPropietary() {
        ComputerStore computerStore = new ComputerStore();
        
        computerStore.setPropietary("Maria Garcia");
        assertEquals("Maria Garcia", computerStore.getPropietary());
    }
    @Test
    void TestComputerTributaryId() {
        ComputerStore computerStore = new ComputerStore();

        computerStore.setTributaryId(123456789);
        assertEquals(123456789, computerStore.getTributaryId());
    }
    @Test
    void TestComputerStoreComputersList() {
        ComputerStore computerStore = new ComputerStore();
        
        List<Computers> listComputers = new ArrayList<>();
        listComputers.add(new Computers(1,"Lenovo",16, "Intel core i5", "Windows 10",300));
        listComputers.add(new Computers(2,"HP",32, "Intel core i7", "Windows 11",1000));

        computerStore.setComputers(listComputers);
        assertEquals(listComputers, computerStore.getComputers());
    }

    @Test
    void TestComputerStoreAddComputer() {
        ComputerStore computerStore = new ComputerStore(null, null, 0);

        Computers computer = new Computers(1,"Lenovo",16, "Intel core i5", "Windows 10",300);
        computerStore.addComputer(computer);

        assertEquals(1, computerStore.getComputers().size());
        assertEquals(computer, computerStore.getComputers().get(0));
    }
    @Test
    void TestComputerStoreRemoveComputer() {
        ComputerStore computerStore = new ComputerStore(null, null, 0);
        
        Computers computer1 = new Computers(1,"Lenovo",16, "Intel core i5", "Windows 10",300);
        computerStore.addComputer(computer1);
        computerStore.removeComputer(1);

        assertEquals(0, computerStore.getComputers().size());
    }
    @Test
    void TestComputerStoreFindComputerById() {
        ComputerStore computerStore = new ComputerStore(null, null, 0);
        
        Computers computer1 = new Computers(1,"Lenovo",16, "Intel core i5", "Windows 10",300);
        Computers computer2 = new Computers(2,"HP",32, "Intel core i7", "Windows 11",1000);
        computerStore.addComputer(computer1);
        computerStore.addComputer(computer2);
        computerStore.findComputerById(1);

        assertEquals(computer1, computerStore.getComputers().get(0));
        assertEquals(computer2, computerStore.getComputers().get(1));
        assertEquals(null, computerStore.findComputerById(3));
    }
    @Test
    void TestComputerStoreListComputers(){
        ComputerStore computerStore = new ComputerStore(null, null, 0);
        Computers computer1 = new Computers(1, "dell", 16, "Intel i7", "Windows 10", 500);
        Computers computer2 = new  Computers(2, "HP", 32, "AMD Ryzen 5", "Windows 11", 700);
        computerStore.addComputer(computer1);
        computerStore.addComputer(computer2);
        List<Computers> list = computerStore.listComputers();

        assertEquals(2, list.size());
        assertTrue(list.contains(computer1));
        assertTrue(list.contains(computer2));
    }
}
