package androidx.datastore.preferences.protobuf;

import r1.q2;

/* JADX INFO: loaded from: classes.dex */
public class w implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f6910a = new w();

    private w() {
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public final boolean isSupported(Class<?> cls) {
        return x.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public final o0 messageInfoFor(Class<?> cls) {
        if (!x.class.isAssignableFrom(cls)) {
            vb.h.s("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (o0) x.g(cls.asSubclass(x.class)).f(x.f.BUILD_MESSAGE_INFO);
        } catch (Exception e4) {
            q2.v("Unable to get message info for ".concat(cls.getName()), e4);
            return null;
        }
    }
}
