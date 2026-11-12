package com.huami.lib.qrcode.result;

import android.content.Intent;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class IntentIntegrator {
    public static final int REQUEST_CODE = 49374;
    private static final String a = "IntentIntegrator";

    @Nullable
    public static IntentResult parseActivityResult(int i, int i2, Intent intent) {
        if (i == 49374) {
            return i2 == -1 ? new IntentResult(intent.getStringExtra("SCAN_RESULT"), intent.getStringExtra("SCAN_RESULT_FORMAT"), intent.getByteArrayExtra("SCAN_RESULT_BYTES")) : new IntentResult();
        }
        return null;
    }
}
