package m63;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lm63/x0;", "Lk63/e;", "", "serialName", "keyDescriptor", "valueDescriptor", "<init>", "(Ljava/lang/String;Lk63/e;Lk63/e;)V", "Lm63/f0;", "Lm63/p0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class x0 implements k63.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k63.e f117039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k63.e f117040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f117041d;

    private x0(String str, k63.e eVar, k63.e eVar2) {
        this.f117038a = str;
        this.f117039b = eVar;
        this.f117040c = eVar2;
        this.f117041d = 2;
    }

    @Override // k63.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF117041d() {
        return this.f117041d;
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
        vb.h.x(am.j.o(this.f117038a, " expects only non-negative indices", b71.i.i(i14, "Illegal index ", ", ")));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return p005kotlin.jvm.internal.s.g(this.f117038a, x0Var.f117038a) && p005kotlin.jvm.internal.s.g(this.f117039b, x0Var.f117039b) && p005kotlin.jvm.internal.s.g(this.f117040c, x0Var.f117040c);
    }

    @Override // k63.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF117038a() {
        return this.f117038a;
    }

    @Override // k63.e
    public final int g(String str) {
        str.getClass();
        Integer numI = d53.t.i(str);
        if (numI != null) {
            return numI.intValue();
        }
        vb.h.s(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // k63.e
    public final k63.l getKind() {
        return k63.m.c.f103255a;
    }

    @Override // k63.e
    public final k63.e h(int i14) {
        if (i14 < 0) {
            vb.h.x(am.j.o(this.f117038a, " expects only non-negative indices", b71.i.i(i14, "Illegal index ", ", ")));
            return null;
        }
        int i15 = i14 % 2;
        if (i15 == 0) {
            return this.f117039b;
        }
        if (i15 == 1) {
            return this.f117040c;
        }
        vb.h.z("Unreached");
        return null;
    }

    public final int hashCode() {
        return this.f117040c.hashCode() + ((this.f117039b.hashCode() + (this.f117038a.hashCode() * 31)) * 31);
    }

    @Override // k63.e
    public final boolean i(int i14) {
        if (i14 >= 0) {
            return false;
        }
        vb.h.x(am.j.o(this.f117038a, " expects only non-negative indices", b71.i.i(i14, "Illegal index ", ", ")));
        return false;
    }

    public final String toString() {
        return this.f117038a + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f117039b + ", " + this.f117040c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ x0(String str, k63.e eVar, k63.e eVar2, p005kotlin.jvm.internal.j jVar) {
        this(str, eVar, eVar2);
    }
}
