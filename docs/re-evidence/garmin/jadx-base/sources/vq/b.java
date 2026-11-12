package vq;

import androidx.lifecycle.y0;
import c83.a0;
import e23.p;
import fw.m;
import o13.r;
import o53.b0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.y1;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.splits.repository.ActivityStatsSplitsRepository$getSplitsForActivityId$1", f = "ActivityStatsSplitsRepository.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f179421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f179422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, long j8, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f179421b = dVar;
        this.f179422c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f179421b, this.f179422c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179420a;
        d dVar = this.f179421b;
        try {
            if (i14 == 0) {
                r.b(obj);
                i0<a0<y1>> i0VarA = ((a) dVar.f179426a.getValue()).a(this.f179422c);
                this.f179420a = 1;
                obj = i0VarA.await(this);
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
            a0 a0Var = (a0) obj;
            if (a0Var.f25745a.isSuccessful()) {
                dVar.f179427b.j(new m<>(null, fw.p.SUCCESS, a0Var.f25746b, null, 8, null));
            } else {
                y0<m<y1>> y0Var = dVar.f179427b;
                m.a aVar2 = m.f73767e;
                fw.r rVar = new fw.r();
                aVar2.getClass();
                y0Var.j(new m<>(null, fw.p.ERROR, null, rVar));
            }
        } catch (Exception e4) {
            y0<m<y1>> y0Var2 = dVar.f179427b;
            m.f73767e.getClass();
            y0Var2.j(m.a.a(null, e4));
        }
        return Unit.INSTANCE;
    }
}
