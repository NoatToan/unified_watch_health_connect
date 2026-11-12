package n82;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.ui.patterns.pager.date.DatePagerStateRangeControlState", f = "DatePagerStateRangeControlState.kt", l = {69}, m = "navigate", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f124969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f124970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f124971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f124970b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f124969a = obj;
        this.f124971c |= Integer.MIN_VALUE;
        return this.f124970b.d(null, this);
    }
}
