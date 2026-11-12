package s70;

import i3.fe;
import i3.se;
import i3.yd;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.SecondaryStatsScreenKt$SecondaryStats$action$1$showSnackbar$1", f = "SecondaryStatsScreen.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class o1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l f157762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f157763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<se, Unit> f157764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe f157765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f157766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f157767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f157768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yd f157769h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o1(e23.l<? super se, Unit> lVar, fe feVar, String str, String str2, boolean z14, yd ydVar, t13.d<? super o1> dVar) {
        super(2, dVar);
        this.f157764c = lVar;
        this.f157765d = feVar;
        this.f157766e = str;
        this.f157767f = str2;
        this.f157768g = z14;
        this.f157769h = ydVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o1(this.f157764c, this.f157765d, this.f157766e, this.f157767f, this.f157768g, this.f157769h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        e23.l lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f157763b;
        if (i14 == 0) {
            o13.r.b(obj);
            e23.l<se, Unit> lVar2 = this.f157764c;
            this.f157762a = lVar2;
            this.f157763b = 1;
            fe feVar = this.f157765d;
            feVar.getClass();
            Object objA = feVar.a(new fe.b(this.f157766e, this.f157767f, this.f157768g, this.f157769h), this);
            if (objA == aVar) {
                return aVar;
            }
            lVar = lVar2;
            obj = objA;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar = this.f157762a;
            o13.r.b(obj);
        }
        lVar.invoke(obj);
        return Unit.INSTANCE;
    }
}
