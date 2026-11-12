package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f6688c = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6690b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f6689a = new i0();

    private c1() {
    }

    public final <T> g1<T> a(Class<T> cls) {
        p<?> pVar;
        Class<?> cls2;
        z.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f6690b;
        g1<T> g1VarT = (g1) concurrentHashMap.get(cls);
        if (g1VarT == null) {
            i0 i0Var = this.f6689a;
            i0Var.getClass();
            Class<?> cls3 = h1.f6717a;
            if (!x.class.isAssignableFrom(cls) && (cls2 = h1.f6717a) != null && !cls2.isAssignableFrom(cls)) {
                vb.h.s("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
            o0 o0VarMessageInfoFor = i0Var.f6740a.messageInfoFor(cls);
            if (o0VarMessageInfoFor.isMessageSetWireFormat()) {
                if (x.class.isAssignableFrom(cls)) {
                    g1VarT = u0.f(h1.f6719c, r.f6809a, o0VarMessageInfoFor.getDefaultInstance());
                } else {
                    m1<?, ?> m1Var = h1.f6718b;
                    p<?> pVar2 = r.f6810b;
                    if (pVar2 == null) {
                        vb.h.z("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    g1VarT = u0.f(m1Var, pVar2, o0VarMessageInfoFor.getDefaultInstance());
                }
            } else if (x.class.isAssignableFrom(cls)) {
                g1VarT = t0.t(o0VarMessageInfoFor, x0.f6931b, g0.f6706b, h1.f6719c, i0.b.f6741a[o0VarMessageInfoFor.getSyntax().ordinal()] != 1 ? r.f6809a : null, n0.f6787b);
            } else {
                v0 v0Var = x0.f6930a;
                e0 e0Var = g0.f6705a;
                m1<?, ?> m1Var2 = h1.f6718b;
                if (i0.b.f6741a[o0VarMessageInfoFor.getSyntax().ordinal()] != 1) {
                    p<?> pVar3 = r.f6810b;
                    if (pVar3 == null) {
                        vb.h.z("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    pVar = pVar3;
                } else {
                    pVar = null;
                }
                g1VarT = t0.t(o0VarMessageInfoFor, v0Var, e0Var, m1Var2, pVar, n0.f6786a);
            }
            g1<T> g1Var = (g1) concurrentHashMap.putIfAbsent(cls, g1VarT);
            if (g1Var != null) {
                return g1Var;
            }
        }
        return g1VarT;
    }
}
