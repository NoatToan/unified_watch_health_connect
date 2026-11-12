package androidx.health.platform.client.proto;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r1 f7767c = new r1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f7769b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f7768a = new u0();

    private r1() {
    }

    public final <T> n2<T> a(Class<T> cls) {
        b0<?> b0Var;
        Class<?> cls2;
        l0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f7769b;
        n2<T> n2VarX = (n2) concurrentHashMap.get(cls);
        if (n2VarX == null) {
            u0 u0Var = this.f7768a;
            u0Var.getClass();
            Class<?> cls3 = o2.f7739a;
            if (!j0.class.isAssignableFrom(cls) && (cls2 = o2.f7739a) != null && !cls2.isAssignableFrom(cls)) {
                vb.h.s("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
            a1 a1VarMessageInfoFor = u0Var.f7791a.messageInfoFor(cls);
            if (a1VarMessageInfoFor.isMessageSetWireFormat()) {
                if (j0.class.isAssignableFrom(cls)) {
                    n2VarX = g1.g(o2.f7741c, d0.f7576a, a1VarMessageInfoFor.getDefaultInstance());
                } else {
                    v2<?, ?> v2Var = o2.f7740b;
                    b0<?> b0Var2 = d0.f7577b;
                    if (b0Var2 == null) {
                        vb.h.z("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    n2VarX = g1.g(v2Var, b0Var2, a1VarMessageInfoFor.getDefaultInstance());
                }
            } else if (j0.class.isAssignableFrom(cls)) {
                n2VarX = f1.x(a1VarMessageInfoFor, j1.f7697b, s0.f7777b, o2.f7741c, u0.b.f7792a[a1VarMessageInfoFor.getSyntax().ordinal()] != 1 ? d0.f7576a : null, z0.f7823b);
            } else {
                h1 h1Var = j1.f7696a;
                q0 q0Var = s0.f7776a;
                v2<?, ?> v2Var2 = o2.f7740b;
                if (u0.b.f7792a[a1VarMessageInfoFor.getSyntax().ordinal()] != 1) {
                    b0<?> b0Var3 = d0.f7577b;
                    if (b0Var3 == null) {
                        vb.h.z("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    b0Var = b0Var3;
                } else {
                    b0Var = null;
                }
                n2VarX = f1.x(a1VarMessageInfoFor, h1Var, q0Var, v2Var2, b0Var, z0.f7822a);
            }
            n2<T> n2Var = (n2) concurrentHashMap.putIfAbsent(cls, n2VarX);
            if (n2Var != null) {
                return n2Var;
            }
        }
        return n2VarX;
    }
}
