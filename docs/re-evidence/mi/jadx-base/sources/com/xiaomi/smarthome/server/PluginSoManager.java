package com.xiaomi.smarthome.server;

import android.content.Context;
import com.xiaomi.smarthome.CpuConstant;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.setting.PluginSetting;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PluginSoManager {
    public static final Map<String, String[]> INSTRUCTION_SET_TO_ABI_MAP;
    private static String instructionSet;
    private static volatile PluginSoManager sInstance;
    private static final Object sLock = new Object();

    static {
        HashMap map = new HashMap();
        INSTRUCTION_SET_TO_ABI_MAP = map;
        instructionSet = getCurrentInstructionSet();
        map.put("arm", new String[]{CpuConstant.CPU_ARMEABI, CpuConstant.CPU_ARMEABIV7});
        map.put("mips", new String[]{"mips"});
        map.put("mips64", new String[]{"mips64"});
        map.put("x86", new String[]{"x86"});
        map.put("x86_64", new String[]{"x86_64"});
        map.put("arm64", new String[]{CpuConstant.CPU_ARMEABI_V8A});
    }

    private PluginSoManager() {
    }

    public static void deleteDir(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            deleteDir(file2);
        }
        file.delete();
    }

    public static String getAbiPath(Context context, long j, long j2) {
        String[] strArr = INSTRUCTION_SET_TO_ABI_MAP.get(instructionSet);
        if (strArr == null) {
            return null;
        }
        for (String str : strArr) {
            String soDir = PluginSetting.getSoDir(context, j, j2, str);
            if (new File(soDir).exists()) {
                return soDir;
            }
        }
        return null;
    }

    public static String getCurrentInstructionSet() {
        try {
            String str = (String) Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", new Class[0]).invoke(null, new Object[0]);
            if (MiJiaEnvironment.isInGreyPublish()) {
                MiJiaLog.writeLogOnGrey(LogType.PLUGIN, "PluginSoManager", "getCurrentInstructionSet:" + str);
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            MiJiaLog.writeLogOnGrey(LogType.PLUGIN, "PluginSoManager", "getCurrentInstructionSet exception " + e.getMessage());
            return "";
        }
    }

    public static PluginSoManager getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new PluginSoManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void install(Context context, long j, long j2, String str) {
        System.currentTimeMillis();
        getCurrentInstructionSet();
        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().startCopySoTask(str, PluginSetting.getSoDir(context, j, j2));
        System.currentTimeMillis();
    }
}
