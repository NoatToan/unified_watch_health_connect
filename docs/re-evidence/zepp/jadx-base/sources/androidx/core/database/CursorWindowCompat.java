package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    @NonNull
    public static CursorWindow create(@Nullable String name, long windowSizeBytes) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new CursorWindow(name, windowSizeBytes);
        }
        return i >= 15 ? new CursorWindow(name) : new CursorWindow(false);
    }
}
