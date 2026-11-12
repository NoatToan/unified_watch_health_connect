package defpackage;

import android.os.Looper;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class d6i {
    public static boolean a(z5h<?> z5hVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        z5hVar.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
        return false;
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
