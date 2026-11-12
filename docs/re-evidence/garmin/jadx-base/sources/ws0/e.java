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
@v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.repo.LactateThresholdRepoImpl$getLactateThresholdSpeedPowerSummaryReport$2", f = "LactateThresholdRepoImpl.kt", l = {86}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements l<t13.d<? super a0<List<? extends o61.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f186917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f186918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f186919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f186920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<String> f186921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f186922g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, String str, o oVar, o oVar2, List<String> list, String str2, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f186917b = jVar;
        this.f186918c = str;
        this.f186919d = oVar;
        this.f186920e = oVar2;
        this.f186921f = list;
        this.f186922g = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f186917b, this.f186918c, this.f186919d, this.f186920e, this.f186921f, this.f186922g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends o61.b>>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186916a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        us0.a aVar2 = this.f186917b.f186946a;
        fz0.c cVarA = fz0.d.a(this.f186919d);
        fz0.c cVarA2 = fz0.d.a(this.f186920e);
        this.f186916a = 1;
        Object objG = aVar2.g(this.f186918c, cVarA, cVarA2, this.f186921f, this.f186922g, this);
        return objG == aVar ? aVar : objG;
    }
}
