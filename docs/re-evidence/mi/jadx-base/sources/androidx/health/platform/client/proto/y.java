package androidx.health.platform.client.proto;

import defpackage.gk8;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f2551b = true;
    public static volatile y c;
    public static final y d = new y(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.e<?, ?>> f2552a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f2553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2554b;

        public a(Object obj, int i) {
            this.f2553a = obj;
            this.f2554b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2553a == aVar.f2553a && this.f2554b == aVar.f2554b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f2553a) * 65535) + this.f2554b;
        }
    }

    public y() {
        this.f2552a = new HashMap();
    }

    public static y b() {
        if (!f2551b) {
            return d;
        }
        y yVarA = c;
        if (yVarA == null) {
            synchronized (y.class) {
                try {
                    yVarA = c;
                    if (yVarA == null) {
                        yVarA = gk8.a();
                        c = yVarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return yVarA;
    }

    public <ContainingType extends o0> GeneratedMessageLite.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.e) this.f2552a.get(new a(containingtype, i));
    }

    public y(boolean z) {
        this.f2552a = Collections.emptyMap();
    }
}
