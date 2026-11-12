package ws0;

import b63.o;
import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lo61/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.repo.LactateThresholdRepoImpl$getFunctionalThresholdPowerSummaryReport$2", f = "LactateThresholdRepoImpl.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements l<t13.d<? super a0<List<? extends o61.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f186903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f186904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f186905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f186906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<String> f186907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f186908g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, String str, o oVar, o oVar2, List<String> list, String str2, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f186903b = jVar;
        this.f186904c = str;
        this.f186905d = oVar;
        this.f186906e = oVar2;
        this.f186907f = list;
        this.f186908g = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f186903b, this.f186904c, this.f186905d, this.f186906e, this.f186907f, this.f186908g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends o61.b>>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186902a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        us0.a aVar2 = this.f186903b.f186946a;
        fz0.c cVarA = fz0.d.a(this.f186905d);
        fz0.c cVarA2 = fz0.d.a(this.f186906e);
        this.f186902a = 1;
        Object objE = aVar2.e(this.f186904c, cVarA, cVarA2, this.f186907f, this.f186908g, this);
        return objE == aVar ? aVar : objE;
    }
}
