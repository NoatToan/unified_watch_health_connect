package z33;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f202177b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, g.f<?, ?>> f202178a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f202179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f202180b;

        public a(Object obj, int i14) {
            this.f202179a = obj;
            this.f202180b = i14;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f202179a == aVar.f202179a && this.f202180b == aVar.f202180b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f202179a) * 65535) + this.f202180b;
        }
    }

    static {
        new e(true);
    }

    public e() {
        this.f202178a = new HashMap();
    }

    public final void a(g.f<?, ?> fVar) {
        this.f202178a.put(new a(fVar.f202200a, fVar.f202203d.f202196b), fVar);
    }

    private e(boolean z14) {
        this.f202178a = Collections.EMPTY_MAP;
    }
}
