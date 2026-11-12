package m82;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.ui.patterns.pager.PagerStateRangeControlState", f = "PagerStateRangeControlState.kt", l = {62}, m = "navigate", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f117197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f117198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f117199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f117198b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f117197a = obj;
        this.f117199c |= Integer.MIN_VALUE;
        return this.f117198b.d(0, this);
    }
}
