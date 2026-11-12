package com.xiaomi.smarthome.core.server.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class SHConfig {
    private static volatile SHConfig sInstance;
    private Context mAppContext = MiJiaEnvironment.getAppContext();
    private SharedPreferences prefences;

    private SHConfig() {
        if (!AccountDepApi.getInstance().isMiLoggedIn()) {
            this.prefences = this.mAppContext.getSharedPreferences("SHConfig", 0);
            return;
        }
        SharedPreferences sharedPreferences = this.mAppContext.getSharedPreferences("SHConfig", 0);
        this.prefences = this.mAppContext.getSharedPreferences("SHConfig_" + AccountDepApi.getInstance().getMiId(), 0);
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null) {
            SharedPreferences.Editor editorEdit = this.prefences.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    editorEdit.putInt(entry.getKey(), ((Integer) entry.getValue()).intValue());
                } else if (value instanceof Long) {
                    editorEdit.putLong(entry.getKey(), ((Long) entry.getValue()).longValue());
                } else if (value instanceof String) {
                    editorEdit.putString(entry.getKey(), (String) entry.getValue());
                }
            }
            editorEdit.commit();
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.clear();
        editorEdit2.commit();
    }

    public static SHConfig getInstance() {
        if (sInstance == null) {
            synchronized (SHConfig.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new SHConfig();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void changeNewUser() {
        if (!AccountDepApi.getInstance().isMiLoggedIn()) {
            this.prefences = MiJiaEnvironment.getAppContext().getSharedPreferences("SHConfig", 0);
            return;
        }
        this.prefences = MiJiaEnvironment.getAppContext().getSharedPreferences("SHConfig_" + AccountDepApi.getInstance().getMiId(), 0);
    }

    public int getSettingInt(String str) {
        return this.prefences.getInt(str, -1);
    }

    public long getSettingLong(String str) {
        return this.prefences.getLong(str, -1L);
    }

    public String getSettingString(String str) {
        return this.prefences.getString(str, "");
    }

    public void setSetting(int i, String str) {
        SharedPreferences.Editor editorEdit = this.prefences.edit();
        editorEdit.remove(str);
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public void setSettingAsync(final int i, final String str) {
        ThreadPoolManager.executeTask(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.config.SHConfig.1
            @Override // java.lang.Runnable
            public void run() {
                SHConfig.this.setSetting(i, str);
            }
        });
    }

    public void setSetting(String str, long j) {
        SharedPreferences.Editor editorEdit = this.prefences.edit();
        editorEdit.remove(str);
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    public void setSetting(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.prefences.edit();
        editorEdit.remove(str);
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}
