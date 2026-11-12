package defpackage;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes.dex */
public class xxa implements yrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xxa f39556a = new xxa();

    public static xxa c() {
        return f39556a;
    }

    @Override // defpackage.yrf
    public urf a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (urf) GeneratedMessageLite.q(cls.asSubclass(GeneratedMessageLite.class)).i();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // defpackage.yrf
    public boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
