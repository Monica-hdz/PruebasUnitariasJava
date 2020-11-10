/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.pruebasunitarias.MetodosPrueba;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER-PC
 */
public class Operations {

    MetodosPrueba m = new MetodosPrueba();

    @Test
    public void lessThanOrEqualToZeroAssertTrue() {
        assertFalse(m.lessThanOrEqualToZero(5));
    }

    @Test
    public void lessThanOrEqualToZeroAssertFalse() {
        assertTrue(m.lessThanOrEqualToZero(0));
    }

    @Test
    public void lessThanOrEqualToZeroAssertTrue2() {
        assertTrue(m.lessThanOrEqualToZero(-2));
    }
    

    @Test
    public void stutterAssert1() {
        assertEquals("in.. in.. increible?", m.stutter("increible"));
    }

    @Test
    public void stutterAssert2() {
        assertEquals("en.. en.. entusiasmado?", m.stutter("entusiasmado"));
    }

    @Test
    public void stutterAssert3() {
        assertEquals("ac.. ac.. actividades?", m.stutter("actividades"));
    }
    

    @Test
    public void totalCupsAssert1() {
        assertEquals(7, m.totalCups(6));
    }

    @Test
    public void totalCupsAssert2() {
        assertEquals(14, m.totalCups(12));
    }

    @Test
    public void totalCupsAssert3() {
        assertEquals(248, m.totalCups(213));
    }
    
    @Test
    public void countWordsAssert1(){
         assertEquals(6, m.countWords("El ejemplo hace movernos hacia adelante"));
    }
    
    @Test
    public void countWordsAssert2(){
         assertEquals(4, m.countWords("Esto es un test"));
    }
    
    @Test
    public void countWordsAssert3(){
         assertEquals(5, m.countWords("Ersto es facil de aprender"));
    }

}
