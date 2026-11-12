package mt1;

import android.content.Context;
import androidx.lifecycle.v1;
import c.q;
import e23.p;
import lc.v;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;
import qr.n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.navigation.GarminTrailsNavHostKt$GarminTrailsNavHost$4$1", f = "GarminTrailsNavHost.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f120967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1.a f120968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q<String, Boolean> f120969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<v> f120970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f120971e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, qt1.a aVar, q<String, Boolean> qVar, x3<v> x3Var, p1<Boolean> p1Var, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f120967a = context;
        this.f120968b = aVar;
        this.f120969c = qVar;
        this.f120970d = x3Var;
        this.f120971e = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f120967a, this.f120968b, this.f120969c, this.f120970d, this.f120971e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        if (this.f120970d.getF182175a() != null) {
            p1<Boolean> p1Var = this.f120971e;
            if (!p1Var.getF182175a().booleanValue()) {
                int iCheckSelfPermission = this.f120967a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION");
                qt1.a aVar2 = this.f120968b;
                if (iCheckSelfPermission != 0) {
                    int i14 = qt1.a.I;
                    n nVar = new n(18);
                    aVar2.getClass();
                    w9.a aVarA = v1.a(aVar2);
                    x53.c cVar = s0.f129406a;
                    ge1.b.T(aVarA, x53.b.f189152a, null, new qt1.h(aVar2, nVar, null), 2);
                    this.f120969c.a("android.permission.ACCESS_FINE_LOCATION", null);
                } else {
                    aVar2.F4(true);
                    n nVar2 = new n(18);
                    w9.a aVarA2 = v1.a(aVar2);
                    x53.c cVar2 = s0.f129406a;
                    ge1.b.T(aVarA2, x53.b.f189152a, null, new qt1.h(aVar2, nVar2, null), 2);
                }
                p1Var.setValue(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }
}
