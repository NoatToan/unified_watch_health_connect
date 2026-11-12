package com.xiaomi.ai.utils;

import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes18.dex */
final class p implements o.a {
    private final boolean a = new File(Environment.getExternalStorageDirectory(), "log_on_adb").exists();

    @Override // com.xiaomi.ai.utils.o.a
    public void a(int i, String str, String str2) {
        if (this.a) {
            android.util.Log.println(i, str, str2);
        }
    }
}
