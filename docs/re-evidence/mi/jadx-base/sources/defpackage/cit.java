package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes5.dex */
public final class cit {
    public static bit a() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26) {
            return (i == 27 && Build.VERSION.PREVIEW_SDK_INT == 0) ? new oit() : new rit();
        }
        return new nit();
    }
}
