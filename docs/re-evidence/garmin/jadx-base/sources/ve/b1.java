package ve;

import android.content.Context;
import android.os.Build;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Landroidx/work/d$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Landroidx/work/d$a;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", l = {300, 311}, m = "invokeSuspend")
public final class b1 extends v13.i implements e23.p<o53.b0, t13.d<? super androidx.work.d.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f177545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f177546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.work.d f177547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue.n f177548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(y0 y0Var, androidx.work.d dVar, ue.n nVar, t13.d<? super b1> dVar2) {
        super(2, dVar2);
        this.f177546b = y0Var;
        this.f177547c = dVar;
        this.f177548d = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b1(this.f177546b, this.f177547c, this.f177548d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super androidx.work.d.a> dVar) {
        return ((b1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f177545a;
        y0 y0Var = this.f177546b;
        if (i14 == 0) {
            o13.r.b(obj);
            Context context = y0Var.f177634b;
            cf.t tVar = y0Var.f177633a;
            ef.b bVar = y0Var.f177637e;
            this.f177545a = 1;
            int i15 = df.w.f59434a;
            if (!tVar.f26957q || Build.VERSION.SDK_INT >= 31) {
                objE0 = Unit.INSTANCE;
            } else {
                ef.c.a aVarC = bVar.c();
                aVarC.getClass();
                objE0 = ge1.b.e0(gl1.y.o(aVarC), new df.v(this.f177547c, tVar, this.f177548d, context, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
            }
            if (objE0 != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        int i16 = d1.f177564a;
        ue.u uVarA = ue.u.a();
        cf.t tVar2 = y0Var.f177633a;
        uVarA.getClass();
        androidx.work.d dVar = this.f177547c;
        androidx.concurrent.futures.b.d dVarB = dVar.b();
        this.f177545a = 2;
        Object objA = d1.a(dVarB, dVar, this);
        return objA == obj2 ? obj2 : objA;
    }
}
