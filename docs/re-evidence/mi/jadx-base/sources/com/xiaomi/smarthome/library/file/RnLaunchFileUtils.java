package com.xiaomi.smarthome.library.file;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class RnLaunchFileUtils {
    private static final String EXPORT_FILE_NAME_OF_RN_LAUNCH_PERF_TRACE = "rn-plugin-launch-perf-tracer-";
    private static final String KEY_CONFIG_ENABLE_LAUNCH_PERF_TRACE = "enable-launch-perf-trace";
    private static final String SP_NAME_OF_PERF_TRACE_CONFIG = "rn-plugin-perf-trace-config";
    private static final String SP_NAME_OF_RN_LAUNCH_PERF_TRACE = "rn-plugin-launch-perf-tracer.json";

    public static File exportRecords(Context context) {
        return new File(context.getExternalFilesDir("launchRecord"), SP_NAME_OF_RN_LAUNCH_PERF_TRACE);
    }

    public static boolean isPerfTraceEnable(Context context) {
        return context.getSharedPreferences(SP_NAME_OF_PERF_TRACE_CONFIG, 0).getBoolean(KEY_CONFIG_ENABLE_LAUNCH_PERF_TRACE, false);
    }

    public static void setPerfTraceEnabled(Context context, boolean z) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SP_NAME_OF_PERF_TRACE_CONFIG, 0).edit();
        editorEdit.putBoolean(KEY_CONFIG_ENABLE_LAUNCH_PERF_TRACE, z);
        editorEdit.apply();
    }
}
