package d60;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lk30/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$getRoute$2", f = "CoursesRepo.kt", l = {262}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.l<t13.d<? super c83.a0<k30.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k30.e f57811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f57812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f57813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Boolean f57814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Boolean f57815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Boolean f57816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(b bVar, k30.e eVar, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, t13.d<? super b0> dVar) {
        super(1, dVar);
        this.f57810b = bVar;
        this.f57811c = eVar;
        this.f57812d = str;
        this.f57813e = str2;
        this.f57814f = bool;
        this.f57815g = bool2;
        this.f57816h = bool3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b0(this.f57810b, this.f57811c, this.f57812d, this.f57813e, this.f57814f, this.f57815g, this.f57816h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<k30.d>> dVar) {
        return ((b0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57809a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b.a aVar2 = b.f57806c;
        o53.i0<c83.a0<k30.d>> i0VarM = this.f57810b.b().m(this.f57811c, this.f57812d, this.f57813e, this.f57814f, this.f57815g, this.f57816h);
        this.f57809a = 1;
        Object objAwait = i0VarM.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
