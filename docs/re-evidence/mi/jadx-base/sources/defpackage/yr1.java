package defpackage;

import android.os.Build;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface yr1 {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final boolean q3;

    static {
        q3 = Build.VERSION.SDK_INT >= 27;
    }
}
