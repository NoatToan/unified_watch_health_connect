package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bBC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Li3/cf;", "", "Li3/df;", "initialValue", "Lkotlin/Function1;", "", "positionalThreshold", "<init>", "(Li3/df;Le23/l;)V", "Lg6/c;", "density", "", "confirmValueChange", "(Li3/df;Lg6/c;Le23/l;Le23/l;)V", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f87780c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87781d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p008y1.r<df> f87782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<? super Float, Float> f87783b;

    @o13.e
    public cf(df dfVar, g6.c cVar, e23.l<? super df, Boolean> lVar, e23.l<? super Float, Float> lVar2) {
        p008y1.b.f193089a.getClass();
        s1.b2 b2Var = p008y1.b.f193090b;
        s1.z zVar = p008y1.b.f193092d;
        lc lcVar = new lc(cVar, 2);
        xd2.m0 m0Var = p008y1.e.f193170a;
        p008y1.r<df> rVar = new p008y1.r<>(dfVar, lVar);
        rVar.f193580b = lVar2;
        rVar.f193581c = lcVar;
        rVar.f193582d = b2Var;
        rVar.f193583e = zVar;
        this.f87782a = rVar;
    }

    public final df a() {
        p008y1.r<df> rVar = this.f87782a;
        if (rVar.f193588j.getFloatValue() == 0.0f || Float.isNaN(rVar.f193588j.getFloatValue())) {
            return df.Settled;
        }
        return rVar.f193588j.getFloatValue() > 0.0f ? df.StartToEnd : df.EndToStart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final df b() {
        return (df) this.f87782a.f193586h.getF182175a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/cf$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ cf(df dfVar, g6.c cVar, e23.l lVar, e23.l lVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dfVar, cVar, (i14 & 4) != 0 ? new bf(0) : lVar, lVar2);
    }

    public cf(df dfVar, e23.l<? super Float, Float> lVar) {
        this.f87782a = new p008y1.r<>(dfVar);
        this.f87783b = lVar;
    }
}
