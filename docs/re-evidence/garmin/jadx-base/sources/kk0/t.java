package kk0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ljk0/m;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.GearRepositoryImpl$getConnectionActivityGearList$2", f = "GearRepositoryImpl.kt", l = {103}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends jk0.m>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f105108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f105109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f105110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h0 h0Var, long j8, String str, t13.d<? super t> dVar) {
        super(1, dVar);
        this.f105108b = h0Var;
        this.f105109c = j8;
        this.f105110d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t(this.f105108b, this.f105109c, this.f105110d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends jk0.m>>> dVar) {
        return ((t) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105107a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f105108b.f105050a;
        this.f105107a = 1;
        Object objC = aVar2.C(this.f105109c, this.f105110d, this);
        return objC == aVar ? aVar : objC;
    }
}
