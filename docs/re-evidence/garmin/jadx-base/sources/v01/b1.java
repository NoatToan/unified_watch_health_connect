package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv01/b1;", "", "Lkd1/b;", "Lq01/g;", "getReminders", "Lv01/p0;", "getMeals", "Ls01/a;", "defaultRemindersProvider", "Lf12/b;", "userAccount", "Le01/a;", "nutritionPreferences", "<init>", "(Lkd1/b;Lv01/p0;Ls01/a;Lf12/b;Le01/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd1.b<q01.g> f174232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f174233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s01.a f174234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.b f174235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e01.a f174236e;

    public b1(kd1.b<q01.g> bVar, p0 p0Var, s01.a aVar, f12.b bVar2, e01.a aVar2) {
        bVar.getClass();
        p0Var.getClass();
        aVar.getClass();
        bVar2.getClass();
        aVar2.getClass();
        this.f174232a = bVar;
        this.f174233b = p0Var;
        this.f174234c = aVar;
        this.f174235d = bVar2;
        this.f174236e = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(pd1.a aVar, v13.c cVar) {
        w0 w0Var;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i14 = w0Var.f174577d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w0Var.f174577d = i14 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(this, cVar);
            }
        } else {
            w0Var = new w0(this, cVar);
        }
        Object objE0 = w0Var.f174575b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = w0Var.f174577d;
        if (i15 == 0) {
            o13.r.b(objE0);
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            w0Var.f174574a = aVar;
            w0Var.f174577d = 1;
            p0 p0Var = this.f174233b;
            objE0 = ge1.b.e0(p0Var.f174501d, new o0(false, p0Var, oVarD, true, null), w0Var);
            if (objE0 == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = w0Var.f174574a;
            o13.r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return new r53.c2(new y0(null));
            }
            lc.u0.r();
            return null;
        }
        g01.z zVar = (g01.z) ((v2.b) v2Var).f47386a;
        l01.e eVar = zVar.f74298e;
        List<g01.x> list = zVar.f74294a;
        if (list == null || eVar == null) {
            return new r53.c2(new x0(null));
        }
        return this.f174232a.a(aVar, new tn2.s0(this, 10, eVar, list));
    }
}
