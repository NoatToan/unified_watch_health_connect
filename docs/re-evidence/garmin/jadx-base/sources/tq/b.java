package tq;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import fw.m;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.x1;
import uq.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.splits.ActivityStatsSplitsViewModel$saveSplits$1", f = "ActivityStatsSplitsViewModel.kt", l = {170}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f166006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<m<List<x1>>> f166007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f166008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<l> f166009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<x1> f166010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y0<m<List<x1>>> y0Var, a aVar, List<l> list, List<x1> list2, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f166007c = y0Var;
        this.f166008d = aVar;
        this.f166009e = list;
        this.f166010f = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f166007c, this.f166008d, this.f166009e, this.f166010f, dVar);
        bVar.f166006b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f166006b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166005a;
        y0<m<List<x1>>> y0Var = this.f166007c;
        try {
            if (i14 == 0) {
                r.b(obj);
                y0Var.j(m.a.f(m.f73767e, null, null, 3));
                a aVar2 = this.f166008d;
                vq.e eVar = aVar2.f165996d;
                long j8 = aVar2.f165993a;
                uq.m mVar = new uq.m(this.f166009e);
                this.f166006b = b0Var;
                this.f166005a = 1;
                obj = eVar.a(j8, mVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var, "ActivityStatsSplitsViewModel", "saveActivityTypedSplits%Success");
                m.a aVar4 = m.f73767e;
                List<x1> list = this.f166010f;
                aVar4.getClass();
                y0Var.j(new m<>(null, fw.p.SUCCESS, list, null, 8, null));
            } else {
                i2.a aVar5 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var2, "ActivityStatsSplitsViewModel", "saveActivityTypedSplits%Exception fetching data");
                y0Var.j(m.a.b(m.f73767e, new fw.r(), null, 5));
            }
        } catch (Throwable th3) {
            String strN = fb1.c.n("saveActivityTypedSplits%Exception fetching data: ", th3.getMessage());
            i2.a aVar6 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar6.getClass();
            i2.a.f(a2Var3, "ActivityStatsSplitsViewModel", strN);
            m.f73767e.getClass();
            y0Var.j(m.a.a(null, th3));
        }
        return Unit.INSTANCE;
    }
}
