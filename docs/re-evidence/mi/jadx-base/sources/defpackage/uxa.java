package defpackage;

import androidx.health.platform.client.proto.GeneratedMessageLite;

/* JADX INFO: loaded from: classes.dex */
public class uxa implements vrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uxa f36248a = new uxa();

    public static uxa c() {
        return f36248a;
    }

    @Override // defpackage.vrf
    public rrf a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (rrf) GeneratedMessageLite.u(cls.asSubclass(GeneratedMessageLite.class)).i();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // defpackage.vrf
    public boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
