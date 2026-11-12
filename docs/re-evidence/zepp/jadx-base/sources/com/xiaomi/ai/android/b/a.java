package com.xiaomi.ai.android.b;

import android.util.Log;
import com.xiaomi.ai.log.LoggerHooker;

/* JADX INFO: loaded from: classes18.dex */
public class a implements LoggerHooker {
    @Override // com.xiaomi.ai.log.LoggerHooker
    public void d(String str, String str2) {
        Log.d(str, str2);
    }

    @Override // com.xiaomi.ai.log.LoggerHooker
    public void e(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // com.xiaomi.ai.log.LoggerHooker
    public void i(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.xiaomi.ai.log.LoggerHooker
    public void w(String str, String str2) {
        Log.w(str, str2);
    }
}
