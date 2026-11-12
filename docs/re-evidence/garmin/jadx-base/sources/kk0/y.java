package kk0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ljk0/s;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.GearRepositoryImpl$getGearList$2", f = "GearRepositoryImpl.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends jk0.s>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f105123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f105124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f105125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f105126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c80.u f105127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jk0.o f105128g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h0 h0Var, int i14, int i15, List<String> list, c80.u uVar, jk0.o oVar, t13.d<? super y> dVar) {
        super(1, dVar);
        this.f105123b = h0Var;
        this.f105124c = i14;
        this.f105125d = i15;
        this.f105126e = list;
        this.f105127f = uVar;
        this.f105128g = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y(this.f105123b, this.f105124c, this.f105125d, this.f105126e, this.f105127f, this.f105128g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends jk0.s>>> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105122a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f105123b.f105050a;
        String str = this.f105128g.f99305b;
        this.f105122a = 1;
        Object objB = aVar2.B(this.f105124c, this.f105125d, this.f105126e, this.f105127f, str, this);
        return objB == aVar ? aVar : objB;
    }
}
