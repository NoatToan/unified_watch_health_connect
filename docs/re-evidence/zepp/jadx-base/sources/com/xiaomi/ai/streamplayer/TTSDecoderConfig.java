package com.xiaomi.ai.streamplayer;

import android.os.Build;
import com.xiaomi.ai.utils.Log;

/* JADX INFO: loaded from: classes18.dex */
public class TTSDecoderConfig {
    private static final String TAG = "TTSDecoderConfig";
    public static boolean sUseHardDecoder = false;

    public static void setTTSDecoderConfig(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i > 16) {
            sUseHardDecoder = z;
            return;
        }
        Log.e(TAG, "setTTSDecoderConfig failed os version = " + i);
    }
}
