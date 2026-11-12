package c2;

import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc2/c2;", "Lh5/c0;", "Lh4/r$c;", "Lkotlin/Function1;", "Lg6/c;", "Lg6/k;", MapboxMap.QFE_OFFSET, "", "rtlAware", "<init>", "(Le23/l;Z)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c2 extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l<? super g6.c, g6.k> f22611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22612b;

    public c2(e23.l<? super g6.c, g6.k> lVar, boolean z14) {
        this.f22611a = lVar;
        this.f22612b = z14;
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        f5.v1 v1VarQ = y0Var.Q(j8);
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new bp.h(5, this, v1VarQ));
    }
}
