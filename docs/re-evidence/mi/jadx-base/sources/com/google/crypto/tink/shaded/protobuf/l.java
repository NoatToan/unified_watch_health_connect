package com.google.crypto.tink.shaded.protobuf;

import defpackage.hk8;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f9406b = true;
    public static volatile l c;
    public static final l d = new l(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.e<?, ?>> f9407a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f9408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9409b;

        public a(Object obj, int i) {
            this.f9408a = obj;
            this.f9409b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9408a == aVar.f9408a && this.f9409b == aVar.f9409b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f9408a) * 65535) + this.f9409b;
        }
    }

    public l() {
        this.f9407a = new HashMap();
    }

    public static l b() {
        l lVarA = c;
        if (lVarA == null) {
            synchronized (l.class) {
                try {
                    lVarA = c;
                    if (lVarA == null) {
                        lVarA = f9406b ? hk8.a() : d;
                        c = lVarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lVarA;
    }

    public <ContainingType extends b0> GeneratedMessageLite.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.e) this.f9407a.get(new a(containingtype, i));
    }

    public l(boolean z) {
        this.f9407a = Collections.emptyMap();
    }
}
