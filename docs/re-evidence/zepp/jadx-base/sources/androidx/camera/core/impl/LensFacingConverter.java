package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class LensFacingConverter {
    private LensFacingConverter() {
    }

    @NonNull
    public static String nameOf(final int lensFacing) {
        if (lensFacing == 0) {
            return "FRONT";
        }
        if (lensFacing == 1) {
            return "BACK";
        }
        throw new IllegalArgumentException("Unknown lens facing " + lensFacing);
    }

    public static int valueOf(@Nullable final String name) {
        Objects.requireNonNull(name, "name cannot be null");
        if (name.equals("BACK")) {
            return 1;
        }
        if (name.equals("FRONT")) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown len facing name " + name);
    }

    @NonNull
    public static Integer[] values() {
        return new Integer[]{0, 1};
    }
}
