package com.ingenic.iwds;

import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
public class HardwareList {
    public static final String VALUE_LCD_EXTERIOR_ROUND = "round";
    public static final String VALUE_LCD_EXTERIOR_SQUARE = "square";
    private static String a = "HardwareList: ";
    private static Hashtable<String, String> c;
    public static final String KEY_BLUETOOTH_CHIP = "bluetooth.chip";
    public static final String KEY_LCD_EXTERIOR = "lcd.exterior";
    public static final String KEY_LCD_DPI = "lcd.dpi";
    public static final String KEY_LCD_PPI = "lcd.ppi";
    public static final String KEY_LCD_SIZE = "lcd.size";
    private static String[] b = {KEY_BLUETOOTH_CHIP, KEY_LCD_EXTERIOR, KEY_LCD_DPI, KEY_LCD_PPI, KEY_LCD_SIZE};

    /* JADX WARN: Code duplicated, block: B:49:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v5 */
    static {
        BufferedReader bufferedReader;
        boolean z;
        ?? r2 = 0;
        c = null;
        Hashtable<String, String> hashtable = new Hashtable<>();
        c = hashtable;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/hardware/list"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        String[] strArrSplit = line.split(":");
                        IwdsAssert.dieIf("HardwareList", strArrSplit == null || strArrSplit.length < 2, "Invalid line: " + line);
                        String strTrim = strArrSplit[0].trim();
                        String strTrim2 = strArrSplit[1].trim();
                        String[] strArr = b;
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = false;
                                break;
                            } else {
                                if (strTrim.equals(strArr[i])) {
                                    z = true;
                                    break;
                                }
                                i++;
                            }
                        }
                        if (z) {
                            IwdsAssert.dieIf("HardwareList", c.get(strTrim) != null, "Dunplicate Key: " + strTrim);
                            c.put(strTrim, strTrim2);
                        }
                    } catch (FileNotFoundException unused) {
                        IwdsLog.e(a, "Exception occurred trying to open /proc/hardware/list");
                        c = null;
                        if (bufferedReader == null) {
                            return;
                        }
                        try {
                            bufferedReader.close();
                        } catch (IOException unused2) {
                            IwdsLog.e(a, "Exception occurred trying to close /proc/hardware/list");
                            return;
                        }
                    } catch (IOException unused3) {
                        IwdsLog.e(a, "Exception occurred trying to read /proc/hardware/list");
                        c = null;
                        if (bufferedReader == null) {
                            return;
                        }
                        bufferedReader.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                r2 = hashtable;
                if (r2 != 0) {
                    try {
                        r2.close();
                    } catch (IOException unused4) {
                        IwdsLog.e(a, "Exception occurred trying to close /proc/hardware/list");
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            bufferedReader = null;
        } catch (IOException unused6) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        bufferedReader.close();
    }

    private HardwareList() {
    }

    public static void Dump() {
        Hashtable<String, String> hashtable = c;
        if (hashtable == null) {
            return;
        }
        Enumeration<String> enumerationKeys = hashtable.keys();
        String str = "Hashtable: ";
        while (enumerationKeys.hasMoreElements()) {
            String strNextElement = enumerationKeys.nextElement();
            str = str + "[" + strNextElement + SearchCriteria.EQ + c.get(strNextElement) + "] ";
        }
        IwdsLog.i(a, str);
    }

    public static boolean IsCircularScreen() {
        return getHardwareValue(KEY_LCD_EXTERIOR, "unknown").equals(VALUE_LCD_EXTERIOR_ROUND);
    }

    public static boolean IsSquareScreen() {
        return getHardwareValue(KEY_LCD_EXTERIOR, "unknown").equals("square");
    }

    public static synchronized String getHardwareValue(String str, String str2) {
        String hardwareValue = getHardwareValue(str);
        return hardwareValue == null ? str2 : hardwareValue;
    }

    public static synchronized String getHardwareValue(String str) {
        Hashtable<String, String> hashtable = c;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(str);
    }
}
