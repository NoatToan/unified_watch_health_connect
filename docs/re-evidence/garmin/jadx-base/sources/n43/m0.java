package n43;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f123652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f123653b;

    static {
        new a(null);
        new m0(false, null, 2, null);
    }

    public m0(boolean z14, List<String> list) {
        list.getClass();
        this.f123652a = z14;
        this.f123653b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f123652a == m0Var.f123652a && p005kotlin.jvm.internal.s.g(this.f123653b, m0Var.f123653b);
    }

    public final int hashCode() {
        return this.f123653b.hashCode() + (Boolean.hashCode(this.f123652a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PreReleaseInfo(isInvisible=");
        sb3.append(this.f123652a);
        sb3.append(", poisoningFeatures=");
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f123653b, sb3);
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public m0(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, (i14 & 2) != 0 ? p13.j0.f134944a : list);
    }
}
