package org.acra.util;

import android.content.Context;
import android.widget.Toast;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import org.acra.ACRA;

/* JADX INFO: loaded from: classes23.dex */
public final class ToastSender {
    private ToastSender() {
    }

    public static void sendToast(@NonNull Context context, String str, @IntRange(from = 0, to = 1) int i) {
        try {
            Toast.makeText(context, str, i).show();
        } catch (RuntimeException e) {
            ACRA.log.w(ACRA.LOG_TAG, "Could not send crash Toast", e);
        }
    }
}
