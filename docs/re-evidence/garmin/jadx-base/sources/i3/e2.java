package i3;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Li3/e2;", "Lh5/x0;", "Li3/g2;", "Li3/p;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "autoSwitchToMinute", "Li3/qi;", "selection", "Ls1/k;", "", "animationSpec", "<init>", "(Li3/p;ZILs1/k;Lkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class e2 extends h5.x0<g2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f87940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f87941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s1.k<Float> f87943d;

    private e2(p pVar, boolean z14, int i14, s1.k<Float> kVar) {
        this.f87940a = pVar;
        this.f87941b = z14;
        this.f87942c = i14;
        this.f87943d = kVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new g2(this.f87940a, this.f87941b, this.f87942c, this.f87943d, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        if (!p005kotlin.jvm.internal.s.g(this.f87940a, e2Var.f87940a) || this.f87941b != e2Var.f87941b) {
            return false;
        }
        int i14 = e2Var.f87942c;
        qi.a aVar = qi.f89469b;
        return this.f87942c == i14 && p005kotlin.jvm.internal.s.g(this.f87943d, e2Var.f87943d);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iG = q6.f.g(this.f87940a.hashCode() * 31, 31, this.f87941b);
        qi.a aVar = qi.f89469b;
        return this.f87943d.hashCode() + r1.q2.d(this.f87942c, iG, 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("ClockDialModifier(state=");
        sb3.append(this.f87940a);
        sb3.append(", autoSwitchToMinute=");
        sb3.append(this.f87941b);
        sb3.append(", selection=");
        int i14 = this.f87942c;
        if (i14 == 0) {
            qi.a aVar = qi.f89469b;
            str = "Hour";
        } else {
            str = i14 == qi.f89470c ? "Minute" : "";
        }
        sb3.append((Object) str);
        sb3.append(", animationSpec=");
        sb3.append(this.f87943d);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        g2 g2Var = (g2) cVar;
        p pVar = this.f87940a;
        g2Var.f88156c = pVar;
        g2Var.f88157d = this.f87941b;
        s1.k<Float> kVar = this.f87943d;
        g2Var.f88159f = kVar;
        int i14 = g2Var.f88158e;
        qi.a aVar = qi.f89469b;
        int i15 = this.f87942c;
        if (i14 == i15) {
            return;
        }
        g2Var.f88158e = i15;
        ge1.b.T(g2Var.getCoroutineScope(), null, null, new h2(pVar, kVar, null), 3);
    }

    public /* synthetic */ e2(p pVar, boolean z14, int i14, s1.k kVar, p005kotlin.jvm.internal.j jVar) {
        this(pVar, z14, i14, kVar);
    }
}
