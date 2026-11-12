package kk0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ljk0/l;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.GearRepositoryImpl$getAvailableCollections$2", f = "GearRepositoryImpl.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends jk0.l>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f105097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b63.o f105098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(h0 h0Var, b63.o oVar, t13.d<? super q> dVar) {
        super(1, dVar);
        this.f105097b = h0Var;
        this.f105098c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q(this.f105097b, this.f105098c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends jk0.l>>> dVar) {
        return ((q) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105096a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f105097b.f105050a;
        fz0.c cVarA = fz0.d.a(this.f105098c);
        this.f105096a = 1;
        Object objI = aVar2.i(cVarA, this);
        return objI == aVar ? aVar : objI;
    }
}
