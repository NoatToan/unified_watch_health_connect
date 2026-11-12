package defpackage;

import com.google.protobuf.u;
import com.google.protobuf.v;
import com.google.protobuf.w;

/* JADX INFO: loaded from: classes5.dex */
public final class mk8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u<?> f26949a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u<?> f26950b = c();

    public static u<?> a() {
        u<?> uVar = f26950b;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static u<?> b() {
        return f26949a;
    }

    public static u<?> c() {
        try {
            int i = v.f9763b;
            return (u) v.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
