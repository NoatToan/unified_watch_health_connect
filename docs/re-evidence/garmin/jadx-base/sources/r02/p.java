package r02;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableState", f = "ZoomableState.kt", l = {261}, m = "fling-sF-c-tU", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f148930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f148931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148932c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f148931b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148930a = obj;
        this.f148932c |= Integer.MIN_VALUE;
        int i14 = m.f148892q;
        return this.f148931b.c(0L, this);
    }
}
