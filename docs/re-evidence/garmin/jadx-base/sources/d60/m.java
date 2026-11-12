package d60;

import com.google.android.gms.maps.model.LatLng;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lk30/v;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$getMultipleRoundTripCourses$2", f = "CoursesRepo.kt", l = {288}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super c83.a0<k30.v>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LatLng f57889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f57890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.i f57891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f57892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k30.k f57893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Boolean f57894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Boolean f57895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Boolean f57896j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, LatLng latLng, String str, com.garmin.android.apps.connectmobile.courses.model.i iVar, double d14, k30.k kVar, Boolean bool, Boolean bool2, Boolean bool3, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f57888b = bVar;
        this.f57889c = latLng;
        this.f57890d = str;
        this.f57891e = iVar;
        this.f57892f = d14;
        this.f57893g = kVar;
        this.f57894h = bool;
        this.f57895i = bool2;
        this.f57896j = bool3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f57888b, this.f57889c, this.f57890d, this.f57891e, this.f57892f, this.f57893g, this.f57894h, this.f57895i, this.f57896j, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<k30.v>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57887a;
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
        a aVarB = this.f57888b.b();
        LatLng latLng = this.f57889c;
        String strValueOf = String.valueOf(latLng.latitude);
        String strValueOf2 = String.valueOf(latLng.longitude);
        String str = this.f57891e.f32983e;
        String strValueOf3 = String.valueOf((int) this.f57892f);
        String str2 = this.f57893g.f102562a;
        if (str2 == null) {
            str2 = "";
        }
        o53.i0<c83.a0<k30.v>> i0VarS = aVarB.s(strValueOf, strValueOf2, this.f57890d, str, strValueOf3, str2, this.f57894h, this.f57895i, this.f57896j);
        this.f57887a = 1;
        Object objAwait = i0VarS.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
