package com.activequant.servicelayer.matlab;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.activequant.domainmodel.Instrument;
import com.activequant.domainmodel.TimeFrame;
import com.activequant.timeseries.TSContainer2;

public class MatlabServiceFacadeTest extends TestCase {
	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(MatlabServiceFacadeTest.class);
	}
	public void test1(){}

	/*public void testInitFromStringStringMap() throws Exception{
		MatlabServiceFacade msf = new MatlabServiceFacade("localhost");
		// BBGT_IRH12 Comdty
		// BBGT_IRM12 Comdty
		
		
		// 
		Map<Parameter, Object> map = new HashMap<Parameter, Object>();
		TimeSeriesContainer t = msf.fetchTSData(TimeFrame.EOD, "BBGT_IRH12 Comdty", "PX_SETTLE", 20120101000000L, 20120131000000L, map);
		assertNotNull(t.timeStamps());
		// 
		assertEquals(10, t.timeStamps().length);
		assertEquals(1, t.values().length);
		assertEquals(10, t.values()[0].length);
		assertEquals(1, t.values()[0][0].length);
		
		// 
		
		t = msf.fetchTSData(TimeFrame.EOD, new String[]{"BBGT_IRH12 Comdty"}, new String[]{"PX_SETTLE", "OPEN"}, 20120101000000L, 20120131000000L, map);
		assertNotNull(t.timeStamps());		
		assertEquals(10, t.timeStamps().length);
		assertEquals(1, t.values().length);
		assertEquals(10, t.values()[0].length);
		assertEquals(2, t.values()[0][0].length);
		
		// 
		
		
		Instrument[] instruments = msf.getActiveInstruments("SECCHAIN.DATE.BBGT_AD CURNCY_OPEN_INTEREST", 20120101);
		assertNotNull(instruments);
		
	}
	
	public void testTwoInstr() throws Exception{
		
		MatlabServiceFacade msf = new MatlabServiceFacade("192.168.10.150");
		Map<Parameter, Object> paramMap = new HashMap<Parameter, Object>();
		paramMap.put(Parameter.INTERPOLRULE, InterpolationRule.CARRY_FORWARD);
		paramMap.put(Parameter.DAYRULE, DayRule.WEEKDAYS);
		TimeSeriesContainer tsc = msf.fetchTSData(TimeFrame.EOD, new String[]{"SECCHAIN.DATE.BBGT_AD CURNCY_OPEN_INTEREST"}, new String[]{"OPEN"},20000101000000.0, paramMap);
		System.out.println(tsc.timeStamps().length);
		
	}
	*/
}
