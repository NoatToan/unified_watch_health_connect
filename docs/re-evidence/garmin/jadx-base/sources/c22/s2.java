package c22;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes10.dex */
public final class s2 {
    public static final boolean a(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1;
    }
}
