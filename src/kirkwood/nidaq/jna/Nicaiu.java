package kirkwood.nidaq.jna;
//import com.ochafik.lang.jnaerator.runtime.LibraryExtractor;
//import com.ochafik.lang.jnaerator.runtime.MangledFunctionMapper;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;

import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.NativeLongByReference;
import com.sun.jna.ptr.PointerByReference;
import com.sun.jna.win32.StdCallLibrary;

/**
 * JNA Wrapper for library <b>test</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface Nicaiu extends StdCallLibrary {
	Nicaiu INSTANCE = (Nicaiu) Native.loadLibrary("nicaiu", Nicaiu.class);
	
	public static final int DAQmx_Val_GroupByChannel = (int)0;
	public static final int DAQmx_Val_ChanForAllLines = (int)1;
	public static final int DAQmx_Val_Cfg_Default = (int)-1;
	public static final int DAQmx_Val_Volts = (int)10348;
	public static final int DAQmx_Val_Amps = (int)10342;
	public static final int DAQmx_Val_Default = (int)-1;
	public static final int DAQmx_Val_Rising = (int)10280;
	public static final int DAQmx_Val_FiniteSamps = (int)10178;
	
	/**
	 * Original signature : <code>int32 DAQmxCreateDOChan(TaskHandle, const char[], const char[], int32)</code><br>
	 * <i>native declaration : line 2511</i>
	 */
	int DAQmxCreateDOChan(Pointer taskHandle, byte lines[], byte nameToAssignToLines[], int lineGrouping);

	/**
	 * Original signature : <code>int32 DAQmxCreateTask(const char[], TaskHandle*)</code><br>
	 * <i>native declaration : line 2410</i>
	 */
	int DAQmxCreateTask(byte taskName[], PointerByReference taskHandle);
	
	/**
	 * Original signature : <code>int32 DAQmxStartTask(TaskHandle)</code><br>
	 * <i>native declaration : line 2414</i>
	 */
	int DAQmxStartTask(Pointer taskHandle);
	
	/**
	 * Original signature : <code>int32 DAQmxWriteDigitalLines(TaskHandle, int32, bool32, float64, bool32, const uInt8[], int32*, bool32*)</code><br>
	 * <i>native declaration : line 2666</i><br>
	 * @deprecated use the safer methods {@link #DAQmxWriteDigitalLines(com.sun.jna.Pointer, int, com.sun.jna.NativeLong, double, com.sun.jna.NativeLong, java.nio.ByteBuffer, java.nio.IntBuffer, com.sun.jna.ptr.NativeLongByReference)} and {@link #DAQmxWriteDigitalLines(com.sun.jna.Pointer, int, com.sun.jna.NativeLong, double, com.sun.jna.NativeLong, com.sun.jna.Pointer, com.sun.jna.ptr.IntByReference, com.sun.jna.ptr.NativeLongByReference)} instead
	 */
	@Deprecated 
	int DAQmxWriteDigitalLines(Pointer taskHandle, int numSampsPerChan, NativeLong autoStart, double timeout, NativeLong dataLayout, Pointer writeArray, IntByReference sampsPerChanWritten, NativeLongByReference reserved);
	
	/**
	 * Original signature : <code>int32 DAQmxCreateAIVoltageChan(TaskHandle, const char[], const char[], int32, float64, float64, int32, const char[])</code><br>
	 * <i>native declaration : line 2443</i>
	 */
	int DAQmxCreateAIVoltageChan(Pointer taskHandle, byte physicalChannel[], byte nameToAssignToChannel[], int terminalConfig, double minVal, double maxVal, int units, byte customScaleName[]);
	
	/**
	 * (Analog/Counter Timing)<br>
	 * Original signature : <code>int32 DAQmxCfgSampClkTiming(TaskHandle, const char[], float64, int32, int32, uInt64)</code><br>
	 * <i>native declaration : line 2547</i>
	 */
	int DAQmxCfgSampClkTiming(Pointer taskHandle, byte source[], double rate, int activeEdge, int sampleMode, long sampsPerChan);
	
	/**
	 * Original signature : <code>int32 DAQmxCreateAICurrentChan(TaskHandle, const char[], const char[], int32, float64, float64, int32, int32, float64, const char[])</code><br>
	 * <i>native declaration : line 2444</i>
	 */
	int DAQmxCreateAICurrentChan(Pointer taskHandle, byte physicalChannel[], byte nameToAssignToChannel[], int terminalConfig, double minVal, double maxVal, int units, int shuntResistorLoc, double extShuntResistorVal, byte customScaleName[]);

	
	/**
	 * Original signature : <code>int32 DAQmxReadAnalogF64(TaskHandle, int32, float64, bool32, float64[], uInt32, int32*, bool32*)</code><br>
	 * <i>native declaration : line 2601</i>
	 */
	int DAQmxReadAnalogF64(Pointer taskHandle, int numSampsPerChan, double timeout, NativeLong fillMode, DoubleBuffer readArray, NativeLong arraySizeInSamps, IntBuffer sampsPerChanRead, NativeLongByReference reserved);
	
	/**
	 * Original signature : <code>int32 DAQmxStopTask(TaskHandle)</code><br>
	 * <i>native declaration : line 2415</i>
	 */
	int DAQmxStopTask(Pointer taskHandle);
	
	/**
	 * Original signature : <code>int32 DAQmxClearTask(TaskHandle)</code><br>
	 * <i>native declaration : line 2417</i>
	 */
	int DAQmxClearTask(Pointer taskHandle);

}