package m63;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lm63/t0;", "Lk63/e;", "elementDescriptor", "<init>", "(Lk63/e;)V", "Lm63/c;", "Lm63/d;", "Lm63/h0;", "Lm63/r0;", "Lm63/o1;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class t0 implements k63.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k63.e f117016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117017b;

    private t0(k63.e eVar) {
        this.f117016a = eVar;
        this.f117017b = 1;
    }

    @Override // k63.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF117017b() {
        return this.f117017b;
    }

    @Override // k63.e
    public final String d(int i14) {
        return String.valueOf(i14);
    }

    @Override // k63.e
    public final List<Annotation> e(int i14) {
        if (i14 >= 0) {
            return p13.j0.f134944a;
        }
        kg.f.w(b71.i.i(i14, "Illegal index ", ", "), getF117038a(), " expects only non-negative indices");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return p005kotlin.jvm.internal.s.g(this.f117016a, t0Var.f117016a) && p005kotlin.jvm.internal.s.g(getF117038a(), t0Var.getF117038a());
    }

    @Override // k63.e
    public final int g(String str) {
        str.getClass();
        Integer numI = d53.t.i(str);
        if (numI != null) {
            return numI.intValue();
        }
        vb.h.s(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // k63.e
    public final k63.l getKind() {
        return k63.m.b.f103254a;
    }

    @Override // k63.e
    public final k63.e h(int i14) {
        if (i14 >= 0) {
            return this.f117016a;
        }
        kg.f.w(b71.i.i(i14, "Illegal index ", ", "), getF117038a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return getF117038a().hashCode() + (this.f117016a.hashCode() * 31);
    }

    @Override // k63.e
    public final boolean i(int i14) {
        if (i14 >= 0) {
            return false;
        }
        kg.f.w(b71.i.i(i14, "Illegal index ", ", "), getF117038a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return getF117038a() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f117016a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ t0(k63.e eVar, p005kotlin.jvm.internal.j jVar) {
        this(eVar);
    }
}
