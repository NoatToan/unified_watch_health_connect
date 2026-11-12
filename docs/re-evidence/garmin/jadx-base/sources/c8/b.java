package c8;

import a8.i;
import android.annotation.SuppressLint;
import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f25264a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile b f25265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class<?> f25266c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f25266c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f25265b == null) {
            synchronized (f25264a) {
                try {
                    if (f25265b == null) {
                        f25265b = new b();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f25265b;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f25266c;
        return cls != null ? new i(cls, charSequence) : super.newEditable(charSequence);
    }
}
