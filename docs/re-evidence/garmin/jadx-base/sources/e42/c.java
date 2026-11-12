package e42;

import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import zd0.n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.vo2.reports.presentation.viewmodel.VO2MaxReportsViewModel$fetchScreenlessPairedDevices$1", f = "VO2MaxReportsViewModel.kt", l = {133}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f62900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, d<? super c> dVar) {
        super(2, dVar);
        this.f62900b = bVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new c(this.f62900b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62899a;
        b bVar = this.f62900b;
        try {
            if (i14 == 0) {
                r.b(obj);
                n nVar = bVar.f62880g;
                this.f62899a = 1;
                obj = nVar.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            List list = (List) obj;
            p2 p2Var = bVar.f62883j;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, new a.c(list)));
        } catch (Exception e4) {
            p2 p2Var2 = bVar.f62883j;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, new a.C1324a(e4)));
        }
        return Unit.INSTANCE;
    }
}
