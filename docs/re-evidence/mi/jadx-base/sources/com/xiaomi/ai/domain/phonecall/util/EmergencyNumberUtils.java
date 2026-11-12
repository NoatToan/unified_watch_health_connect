package com.xiaomi.ai.domain.phonecall.util;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.t08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class EmergencyNumberUtils {
    private static final String EMERGENCY_NUMBER_FILE = "phonecall-emergency.dat";
    private static Set<String> emergencyNumbersSet;

    static {
        try {
            HashSet hashSet = new HashSet();
            emergencyNumbersSet = hashSet;
            readNamesFile(EMERGENCY_NUMBER_FILE, hashSet);
        } catch (Exception e) {
            throw new RuntimeException("failed to load emergency numbers", e);
        }
    }

    public static boolean isEmergencyNumber(String str) {
        return emergencyNumbersSet.contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static void readNamesFile(String str, Set<String> set) throws IOException {
        try {
            InputStream inputStreamA = t08.a(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamA));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else if (!line.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX) && !line.isEmpty()) {
                            set.add(line);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    if (inputStreamA != null) {
                        try {
                            inputStreamA.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th;
                }
                bufferedReader.close();
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
            } catch (Throwable th4) {
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                throw th4;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
