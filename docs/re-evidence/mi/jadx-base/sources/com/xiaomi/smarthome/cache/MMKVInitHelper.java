package com.xiaomi.smarthome.cache;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.MMKVLogLevel;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class MMKVInitHelper {
    private static final String TAG = "MMKVInitHelper";

    public static void initialize(Context context) {
        initialize(context, MMKVLogLevel.LevelInfo);
    }

    public static void initialize(final Context context, MMKVLogLevel mMKVLogLevel) {
        MMKV.A(context, new MMKV.b() { // from class: com.xiaomi.smarthome.cache.MMKVInitHelper.1
            @Override // com.tencent.mmkv.MMKV.b
            public void loadLibrary(String str) {
                try {
                    try {
                        System.loadLibrary(str);
                    } catch (Throwable unused) {
                        SoLoader.k(context, 0);
                        SoLoader.q(str);
                    }
                } catch (IOException unused2) {
                }
            }
        }, mMKVLogLevel);
        MMKV.n();
    }
}
