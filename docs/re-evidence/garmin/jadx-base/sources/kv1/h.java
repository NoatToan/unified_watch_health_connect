package kv1;

import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lav1/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.network.FBTPlansRepo$getCompletedActivitiesForWorkouts$2", f = "FBTPlansRepo.kt", l = {107}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends av1.d>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f106745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f106746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f106747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f106748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<String> f106749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f106750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f106751h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, String str, String str2, String str3, List<String> list, boolean z14, boolean z15, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f106745b = bVar;
        this.f106746c = str;
        this.f106747d = str2;
        this.f106748e = str3;
        this.f106749f = list;
        this.f106750g = z14;
        this.f106751h = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f106745b, this.f106746c, this.f106747d, this.f106748e, this.f106749f, this.f106750g, this.f106751h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends av1.d>>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106744a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<List<av1.d>>> i0VarL = this.f106745b.f106720a.l(this.f106746c, this.f106747d, this.f106748e, this.f106749f, this.f106750g, this.f106751h);
        this.f106744a = 1;
        Object objAwait = i0VarL.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
