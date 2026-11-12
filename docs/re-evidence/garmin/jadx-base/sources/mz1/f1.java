package mz1;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$subscribeToEvent$1", f = "EventDetailsViewModel.kt", l = {693}, m = "invokeSuspend", v = 2)
public final class f1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f121742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f121743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(e0 e0Var, String str, t13.d<? super f1> dVar) {
        super(2, dVar);
        this.f121742b = e0Var;
        this.f121743c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f1(this.f121742b, this.f121743c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121741a;
        String str = this.f121743c;
        e0 e0Var = this.f121742b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = e0.K1;
                e0Var.r5().j(g3.a.c(g3.f35298f));
                zf0.d dVar = e0Var.f204384a;
                this.f121741a = 1;
                obj = dVar.f204344a.d(str).await(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (((c83.a0) obj).f25745a.isSuccessful()) {
                int i16 = e0.K1;
                androidx.lifecycle.y0<g3<o13.p<Boolean, fg0.k>>> y0VarR5 = e0Var.r5();
                g3.a aVar2 = g3.f35298f;
                o13.p pVar = new o13.p(Boolean.TRUE, null);
                aVar2.getClass();
                y0VarR5.j(g3.a.d(pVar));
                str.getClass();
                ge1.b.T(v1.a(e0Var), null, null, new a1(e0Var, str, null, null), 3);
                e0Var.q5();
            } else {
                int i17 = e0.K1;
                e0Var.r5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
        } catch (Throwable unused) {
            int i18 = e0.K1;
            e0Var.r5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
