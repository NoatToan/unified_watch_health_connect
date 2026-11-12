package w02;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.reorderable.Scroller", f = "ReorderableLazyListState.kt", l = {119, 125, 140}, m = "scrollLoop", v = 2)
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0.c f181087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0.b f181088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.a f181089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f181090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f181091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f181092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f181093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0 f181094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f181095i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var, t13.d<? super d0> dVar) {
        super(dVar);
        this.f181094h = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f181093g = obj;
        this.f181095i |= Integer.MIN_VALUE;
        return c0.a(this.f181094h, this);
    }
}
