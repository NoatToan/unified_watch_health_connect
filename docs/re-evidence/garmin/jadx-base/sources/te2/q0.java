package te2;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/d;", "<anonymous>", "(Lo53/b0;)Lve2/d;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.GarminAccountFactory$createWithGCData$2", f = "GarminAccountFactory.kt", l = {}, m = "invokeSuspend")
public final class q0 extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc2.a f164247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc2.b f164248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sc2.j f164249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.m f164250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ re2.b.c f164251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ve2.e f164252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ve2.k f164253g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(zc2.a aVar, sc2.b bVar, sc2.j jVar, sc2.m mVar, re2.b.c cVar, ve2.e eVar, ve2.k kVar, t13.d<? super q0> dVar) {
        super(2, dVar);
        this.f164247a = aVar;
        this.f164248b = bVar;
        this.f164249c = jVar;
        this.f164250d = mVar;
        this.f164251e = cVar;
        this.f164252f = eVar;
        this.f164253g = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q0(this.f164247a, this.f164248b, this.f164249c, this.f164250d, this.f164251e, this.f164252f, this.f164253g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.d> dVar) {
        return ((q0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        zc2.a aVar2 = this.f164247a;
        String str = aVar2.f203965b;
        String str2 = aVar2.f203967d;
        String str3 = str2 == null ? "" : str2;
        Map<String, String> map = aVar2.f203970g;
        String str4 = map != null ? map.get("PROFILE") : null;
        sc2.b bVar = this.f164248b;
        return new ve2.d(this.f164252f, str, str3, str4, new ve2.a(bVar != null ? bVar.f158484c : -1L, bVar != null ? bVar.f158485d : "", bVar != null ? bVar.f158487f.contains("ROLE_MBTESTER") : false, bVar != null ? bVar.f158487f : p13.l0.f134950a), new dd2.a(this.f164249c, null, this.f164250d, 2, null), re2.b.c.DEFAULT == this.f164251e, this.f164253g);
    }
}
