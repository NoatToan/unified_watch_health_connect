package i3;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li3/jf;", "Lh5/x0;", "Li3/kf;", "Lp3/x3;", "", "Li3/wf;", "tabPositionsState", "", "selectedTabIndex", "", "followContentSize", "Ls1/f0;", "Lg6/f;", "animationSpec", "<init>", "(Lp3/x3;IZLs1/f0;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class jf extends h5.x0<kf> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.x3<List<wf>> f88604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f88606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s1.f0<g6.f> f88607d;

    /* JADX WARN: Multi-variable type inference failed */
    public jf(p3.x3<? extends List<wf>> x3Var, int i14, boolean z14, s1.f0<g6.f> f0Var) {
        this.f88604a = x3Var;
        this.f88605b = i14;
        this.f88606c = z14;
        this.f88607d = f0Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new kf(this.f88604a, this.f88605b, this.f88606c, this.f88607d);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf)) {
            return false;
        }
        jf jfVar = (jf) obj;
        return p005kotlin.jvm.internal.s.g(this.f88604a, jfVar.f88604a) && this.f88605b == jfVar.f88605b && this.f88606c == jfVar.f88606c && p005kotlin.jvm.internal.s.g(this.f88607d, jfVar.f88607d);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f88607d.hashCode() + q6.f.g(r1.q2.d(this.f88605b, this.f88604a.hashCode() * 31, 31), 31, this.f88606c);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.f88604a + ", selectedTabIndex=" + this.f88605b + ", followContentSize=" + this.f88606c + ", animationSpec=" + this.f88607d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        kf kfVar = (kf) cVar;
        kfVar.f88724a = this.f88604a;
        kfVar.f88725b = this.f88605b;
        kfVar.f88726c = this.f88606c;
        kfVar.f88727d = this.f88607d;
    }
}
