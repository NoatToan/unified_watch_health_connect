package j02;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.Scroller", f = "Scroller.kt", l = {121, 127, 140}, m = "scrollLoop", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.b0 f96094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0.c f96095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0.b f96096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.a f96097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f96098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f96099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f96100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f96101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j0 f96102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f96103j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var, t13.d<? super k0> dVar) {
        super(dVar);
        this.f96102i = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96101h = obj;
        this.f96103j |= Integer.MIN_VALUE;
        return j0.a(this.f96102i, null, this);
    }
}
