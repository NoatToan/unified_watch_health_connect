package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ft implements gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18823a = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static gm f18824c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f18825b = new byte[0];
    private Context d;

    @Override // com.huawei.openalliance.ad.gm
    public long b() {
        long j;
        synchronized (this.f18825b) {
            j = c().getLong("update_style_fc_time", 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gm
    public void a(String str, long j) {
        synchronized (this.f18825b) {
            SharedPreferences sharedPreferencesC = c();
            SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
            long j2 = sharedPreferencesC.getLong("last_time_" + str, 0L);
            editorEdit.putLong("last_time_" + str, j);
            if (com.huawei.openalliance.ad.utils.dp.a(j2)) {
                editorEdit.putInt("show_times_" + str, sharedPreferencesC.getInt("show_times_" + str, 0) + 1);
            } else {
                editorEdit.putInt("show_times_" + str, 1);
            }
            editorEdit.commit();
            d();
        }
    }

    @Override // com.huawei.openalliance.ad.gm
    public void a(long j) {
        synchronized (this.f18825b) {
            SharedPreferences.Editor editorEdit = c().edit();
            editorEdit.putLong("update_style_fc_time", j);
            editorEdit.apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gm
    public void a(int i) {
        synchronized (this.f18825b) {
            SharedPreferences.Editor editorEdit = c().edit();
            editorEdit.putInt("update_style_fc_flag", i);
            editorEdit.apply();
        }
    }

    @Override // com.huawei.openalliance.ad.gm
    public int a(String str) {
        synchronized (this.f18825b) {
            SharedPreferences sharedPreferencesC = c();
            if (!com.huawei.openalliance.ad.utils.dp.a(sharedPreferencesC.getLong("last_time_" + str, 0L))) {
                return 0;
            }
            return sharedPreferencesC.getInt("show_times_" + str, 0);
        }
    }

    @Override // com.huawei.openalliance.ad.gm
    public int a() {
        int i;
        synchronized (this.f18825b) {
            i = c().getInt("update_style_fc_flag", 0);
        }
        return i;
    }

    private void d() {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.ft.1
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences sharedPreferencesC = ft.this.c();
                SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                if (System.currentTimeMillis() - sharedPreferencesC.getLong("last_clean_time", 0L) <= 43200000) {
                    hw.b("TptSpHandler", "less than half day");
                    return;
                }
                hw.b("TptSpHandler", "begin clean");
                for (Map.Entry<String, ?> entry : sharedPreferencesC.getAll().entrySet()) {
                    if (entry != null && entry.getKey() != null) {
                        String key = entry.getKey();
                        if (key.startsWith("last_time_") && (entry.getValue() instanceof Long) && (((Long) entry.getValue()) == null || !com.huawei.openalliance.ad.utils.dp.a(((Long) entry.getValue()).longValue()))) {
                            editorEdit.remove(key);
                            String strA = ft.this.a(key, "last_time_");
                            hw.a("TptSpHandler", "slotId = %s", strA);
                            if (!TextUtils.isEmpty(strA)) {
                                editorEdit.remove("show_times_" + strA);
                            }
                        }
                    }
                }
                editorEdit.putLong("last_clean_time", System.currentTimeMillis());
                editorEdit.commit();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SharedPreferences c() {
        return this.d.getSharedPreferences("HiAd_def_tpt_sp", 0);
    }

    private static gm b(Context context) {
        gm gmVar;
        synchronized (f18823a) {
            if (f18824c == null) {
                f18824c = new ft(context);
            }
            gmVar = f18824c;
        }
        return gmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return null;
            }
            int iIndexOf = str.indexOf(str2);
            int length = str2.length();
            if (iIndexOf < 0 || iIndexOf >= str.length() - length) {
                return null;
            }
            return str.substring(iIndexOf + length);
        } catch (Throwable th) {
            hw.c("TptSpHandler", "get slotId by prefix err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public static gm a(Context context) {
        return b(context);
    }

    private ft(Context context) {
        this.d = com.huawei.openalliance.ad.utils.ab.i(context.getApplicationContext());
    }
}
