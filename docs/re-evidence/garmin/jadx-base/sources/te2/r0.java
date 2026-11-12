package te2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/d;", "<anonymous>", "(Lo53/b0;)Lve2/d;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.GarminAccountFactory$createWithITData$2", f = "GarminAccountFactory.kt", l = {}, m = "invokeSuspend")
public final class r0 extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.o f164270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc2.e f164271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ re2.b.c f164272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ve2.e f164273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve2.k f164274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(sc2.o oVar, sc2.e eVar, re2.b.c cVar, ve2.e eVar2, ve2.k kVar, t13.d<? super r0> dVar) {
        super(2, dVar);
        this.f164270a = oVar;
        this.f164271b = eVar;
        this.f164272c = cVar;
        this.f164273d = eVar2;
        this.f164274e = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r0(this.f164270a, this.f164271b, this.f164272c, this.f164273d, this.f164274e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.d> dVar) {
        return ((r0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        String str = this.f164270a.f158547d;
        if (str == null) {
            str = "";
        }
        return new ve2.d(this.f164273d, str, this.f164271b.f158496a, null, null, new dd2.a(null, this.f164270a, null, 5, null), re2.b.c.DEFAULT == this.f164272c, this.f164274e);
    }
}
