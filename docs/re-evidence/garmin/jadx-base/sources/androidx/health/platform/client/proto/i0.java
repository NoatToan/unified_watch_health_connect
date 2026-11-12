package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public class i0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f7665a = new i0();

    private i0() {
    }

    @Override // androidx.health.platform.client.proto.b1
    public final boolean isSupported(Class<?> cls) {
        return j0.class.isAssignableFrom(cls);
    }

    @Override // androidx.health.platform.client.proto.b1
    public final a1 messageInfoFor(Class<?> cls) {
        if (!j0.class.isAssignableFrom(cls)) {
            vb.h.s("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (a1) j0.j(cls.asSubclass(j0.class)).i(j0.f.BUILD_MESSAGE_INFO);
        } catch (Exception e4) {
            r1.q2.v("Unable to get message info for ".concat(cls.getName()), e4);
            return null;
        }
    }
}
