package defpackage;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes5.dex */
public class vxa implements wrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vxa f37327a = new vxa();

    public static vxa c() {
        return f37327a;
    }

    @Override // defpackage.wrf
    public srf a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (srf) GeneratedMessageLite.n(cls.asSubclass(GeneratedMessageLite.class)).g();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // defpackage.wrf
    public boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
