package com.google.protobuf;

import defpackage.ik8;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f9751b = false;
    public static boolean c = true;
    public static volatile t d;
    public static final t e = new t(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.e<?, ?>> f9752a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f9753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9754b;

        public a(Object obj, int i) {
            this.f9753a = obj;
            this.f9754b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9753a == aVar.f9753a && this.f9754b == aVar.f9754b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f9753a) * 65535) + this.f9754b;
        }
    }

    public t() {
        this.f9752a = new HashMap();
    }

    public static t c() {
        t tVarA = d;
        if (tVarA == null) {
            synchronized (t.class) {
                try {
                    tVarA = d;
                    if (tVarA == null) {
                        tVarA = c ? ik8.a() : e;
                        d = tVarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return tVarA;
    }

    public static boolean d() {
        return f9751b;
    }

    public final void a(GeneratedMessageLite.e<?, ?> eVar) {
        this.f9752a.put(new a(eVar.b(), eVar.e()), eVar);
    }

    public <ContainingType extends q0> GeneratedMessageLite.e<ContainingType, ?> b(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.e) this.f9752a.get(new a(containingtype, i));
    }

    public t(t tVar) {
        if (tVar == e) {
            this.f9752a = Collections.emptyMap();
        } else {
            this.f9752a = Collections.unmodifiableMap(tVar.f9752a);
        }
    }

    public t(boolean z) {
        this.f9752a = Collections.emptyMap();
    }
}
