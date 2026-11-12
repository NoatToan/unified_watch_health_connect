package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dsa {
    private String d;

    public dsa(String str) {
        this.d = str;
    }

    public void d(Context context, String str, int i) {
        LogUtil.a("PluginDeviceSharePreferencesManager", "Enter flushMemoryToSharedPreferences sequenceNumber");
        if (str == null || context == null) {
            LogUtil.j("PluginDeviceSharePreferencesManager", "flushMemoryToSharedPreferences(sequenceNumber) macAddress or context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.d, 32768).edit();
        editorEdit.putInt(str, i);
        editorEdit.commit();
    }

    public void d(Context context, String str, long j) {
        LogUtil.a("PluginDeviceSharePreferencesManager", "Enter flushMemoryToSharedPreferences time");
        if (str == null || context == null) {
            LogUtil.j("PluginDeviceSharePreferencesManager", "flushMemoryToSharedPreferences(time) macAddress or context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.d, 32768).edit();
        editorEdit.putLong(str, j);
        editorEdit.commit();
    }

    public void b(Context context, String str, long j) {
        LogUtil.a("PluginDeviceSharePreferencesManager", "Enter flushDeviceUsedTimeToSharedPreferences");
        if (str == null || context == null) {
            LogUtil.j("PluginDeviceSharePreferencesManager", "flushDeviceUsedTimeToSharedPreferences invalid productId or context");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.d, 32768).edit();
        editorEdit.putLong(str, j);
        editorEdit.commit();
    }

    public int c(Context context, String str) {
        LogUtil.a("PluginDeviceSharePreferencesManager", "Enter getSequenceNumberFromSharedPreferences");
        if (str == null || context == null) {
            return 0;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.d, 32768);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getInt(str, 0);
        }
        return 0;
    }

    public long a(Context context, String str) {
        LogUtil.a("PluginDeviceSharePreferencesManager", "Enter getSequenceNumberFromSharedPreferences");
        if (str == null || context == null) {
            return 0L;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.d, 32768);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getLong(str, 0L);
        }
        return 0L;
    }

    public long b(Context context, String str) {
        LogUtil.a("PluginDeviceSharePreferencesManager", "Enter getDeviceUsedTimeStampFromSharedPreferences");
        if (str == null || context == null) {
            LogUtil.j("PluginDeviceSharePreferencesManager", "getDeviceUsedTimeStampFromSharedPreferences invalid productId or context");
            return 0L;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.d, 32768);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getLong(str, 0L);
        }
        return 0L;
    }

    public void e(Context context, String str) {
        LogUtil.a("PluginDeviceSharePreferencesManager", "Enter deleteDeviceUsedTimeStampToSharedPreferences");
        if (str == null || context == null) {
            LogUtil.j("PluginDeviceSharePreferencesManager", "deleteDeviceUsedTimeStampToSharedPreferences invalid productId or context");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.d, 32768);
        if (sharedPreferences.contains(str)) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(str);
            editorEdit.commit();
        }
    }
}
