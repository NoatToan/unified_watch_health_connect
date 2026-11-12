package defpackage;

import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes5.dex */
public class wxa implements xrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wxa f38455a = new wxa();

    public static wxa c() {
        return f38455a;
    }

    @Override // defpackage.xrf
    public trf a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (trf) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // defpackage.xrf
    public boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
