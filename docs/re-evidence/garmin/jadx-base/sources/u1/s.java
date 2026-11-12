package u1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu1/s;", "Lh5/m;", "Lh5/y1;", "Lg6/f;", "widthParameter", "Lo4/w;", "brushParameter", "Lo4/r1;", "shapeParameter", "<init>", "(FLo4/w;Lo4/r1;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s extends h5.m implements h5.y1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f167672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f167673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o4.w f167674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o4.r1 f167675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l4.b f167676g;

    private s(float f14, o4.w wVar, o4.r1 r1Var) {
        this.f167673d = f14;
        this.f167674e = wVar;
        this.f167675f = r1Var;
        l4.c cVar = new l4.c(new l4.f(), new tn2.t(this, 17));
        U1(cVar);
        this.f167676g = cVar;
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        p5.h0.y(k0Var, this.f167675f);
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h5.y1
    public final boolean o1() {
        return false;
    }

    public /* synthetic */ s(float f14, o4.w wVar, o4.r1 r1Var, p005kotlin.jvm.internal.j jVar) {
        this(f14, wVar, r1Var);
    }
}
