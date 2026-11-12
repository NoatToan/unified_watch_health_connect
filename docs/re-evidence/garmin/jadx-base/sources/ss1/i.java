package ss1;

import android.content.Context;
import c22.s1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lqs1/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl$getTrailById$2", f = "GarminTrailsRepoImpl.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.l<t13.d<? super c83.a0<qs1.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f160658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f160659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z zVar, long j8, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f160658b = zVar;
        this.f160659c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f160658b, this.f160659c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<qs1.e>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160657a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ps1.a aVar2 = this.f160658b.f160774a;
        this.f160657a = 1;
        s1 s1Var = s1.f23251a;
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        s1Var.getClass();
        String strC = s1.c(contextC);
        f12.l.f68084a.getClass();
        Object objL = aVar2.l(this.f160659c, strC, f12.l.a.a().g().f77293c, this);
        return objL == aVar ? aVar : objL;
    }
}
