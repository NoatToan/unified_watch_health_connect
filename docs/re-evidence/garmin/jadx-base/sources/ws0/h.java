package ws0;

import b63.o;
import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lo61/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.repo.LactateThresholdRepoImpl$getLatestPowerToWeight$2", f = "LactateThresholdRepoImpl.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements l<t13.d<? super a0<List<? extends o61.h>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f186935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f186936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f186937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xs0.a f186938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, String str, o oVar, xs0.a aVar, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f186935b = jVar;
        this.f186936c = str;
        this.f186937d = oVar;
        this.f186938e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f186935b, this.f186936c, this.f186937d, this.f186938e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends o61.h>>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186934a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        us0.a aVar2 = this.f186935b.f186946a;
        fz0.c cVarA = fz0.d.a(this.f186937d);
        String str = this.f186938e.f192068a;
        this.f186934a = 1;
        Object objF = aVar2.f(this.f186936c, cVarA, str, this);
        return objF == aVar ? aVar : objF;
    }
}
