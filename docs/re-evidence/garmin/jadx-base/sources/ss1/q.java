package ss1;

import android.content.Context;
import c22.s1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lqs1/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl$getTrailInformation$2", f = "GarminTrailsRepoImpl.kt", l = {113}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.l<t13.d<? super c83.a0<qs1.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f160725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f160726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f160727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f160728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, String str, String str2, String str3, t13.d<? super q> dVar) {
        super(1, dVar);
        this.f160725b = zVar;
        this.f160726c = str;
        this.f160727d = str2;
        this.f160728e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q(this.f160725b, this.f160726c, this.f160727d, this.f160728e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<qs1.e>> dVar) {
        return ((q) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160724a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ps1.a aVar2 = this.f160725b.f160774a;
        this.f160724a = 1;
        s1 s1Var = s1.f23251a;
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        s1Var.getClass();
        String strC = s1.c(contextC);
        f12.l.f68084a.getClass();
        Object objF = aVar2.f(this.f160726c, this.f160727d, this.f160728e, strC, f12.l.a.a().g().f77293c, this);
        return objF == aVar ? aVar : objF;
    }
}
