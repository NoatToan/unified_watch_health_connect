package defpackage;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class v88 extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f36609a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("INSTANCE_LOCK")
    public static volatile Editable.Factory f36610b;
    public static Class<?> c;

    @SuppressLint({"PrivateApi"})
    public v88() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, v88.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f36610b == null) {
            synchronized (f36609a) {
                try {
                    if (f36610b == null) {
                        f36610b = new v88();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36610b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = c;
        return cls != null ? f5n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
