package defpackage;

import com.google.crypto.tink.shaded.protobuf.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class dlg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ykg f15659a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ykg f15660b = new f0();

    public static ykg a() {
        return f15659a;
    }

    public static ykg b() {
        return f15660b;
    }

    public static ykg c() {
        try {
            return (ykg) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
