package u1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu1/t;", "Lh5/x0;", "Lu1/s;", "Lg6/f;", "width", "Lo4/w;", "brush", "Lo4/r1;", "shape", "<init>", "(FLo4/w;Lo4/r1;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class t extends h5.x0<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f167678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o4.w f167679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o4.r1 f167680c;

    private t(float f14, o4.w wVar, o4.r1 r1Var) {
        this.f167678a = f14;
        this.f167679b = wVar;
        this.f167680c = r1Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new s(this.f167678a, this.f167679b, this.f167680c, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return g6.f.c(this.f167678a, tVar.f167678a) && p005kotlin.jvm.internal.s.g(this.f167679b, tVar.f167679b) && p005kotlin.jvm.internal.s.g(this.f167680c, tVar.f167680c);
    }

    @Override // h5.x0
    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return this.f167680c.hashCode() + ((this.f167679b.hashCode() + (Float.hashCode(this.f167678a) * 31)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "border";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(g6.f.a(this.f167678a), "width");
        o4.w wVar = this.f167679b;
        if (wVar instanceof o4.t1) {
            v3Var.c(o4.d0.a(((o4.t1) wVar).f129007b), TtmlNode.ATTR_TTS_COLOR);
            m2Var.f91342b = o4.d0.a(((o4.t1) wVar).f129007b);
        } else {
            v3Var.c(wVar, "brush");
        }
        v3Var.c(this.f167680c, "shape");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BorderModifierNodeElement(width=");
        tn.k.l(this.f167678a, ", brush=", sb3);
        sb3.append(this.f167679b);
        sb3.append(", shape=");
        sb3.append(this.f167680c);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        s sVar = (s) cVar;
        float f14 = sVar.f167673d;
        l4.b bVar = sVar.f167676g;
        float f15 = this.f167678a;
        if (!g6.f.c(f14, f15)) {
            sVar.f167673d = f15;
            bVar.l0();
        }
        o4.w wVar = sVar.f167674e;
        o4.w wVar2 = this.f167679b;
        if (!p005kotlin.jvm.internal.s.g(wVar, wVar2)) {
            sVar.f167674e = wVar2;
            bVar.l0();
        }
        o4.r1 r1Var = sVar.f167675f;
        o4.r1 r1Var2 = this.f167680c;
        if (p005kotlin.jvm.internal.s.g(r1Var, r1Var2)) {
            return;
        }
        sVar.f167675f = r1Var2;
        bVar.l0();
        h5.k.g(sVar).U();
    }

    public /* synthetic */ t(float f14, o4.w wVar, o4.r1 r1Var, p005kotlin.jvm.internal.j jVar) {
        this(f14, wVar, r1Var);
    }
}
