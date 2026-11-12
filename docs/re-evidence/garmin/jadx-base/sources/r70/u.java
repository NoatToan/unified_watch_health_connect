package r70;

import am.x0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pendingactivity.api.UploadPendingActivityWorker;
import com.garmin.android.apps.connectmobile.v2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import lc.u0;
import n70.i1;
import o53.b0;
import okhttp3.Headers;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.o2;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardViewModel$onPendingActivityAccepted$1", f = "DashboardViewModel.kt", l = {387, 407}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f151099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.dashboard.presentation.d f151101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f151102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pb2.a.d f151103f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar, Context context, pb2.a.d dVar2, t13.d<? super u> dVar3) {
        super(2, dVar3);
        this.f151101d = dVar;
        this.f151102e = context;
        this.f151103f = dVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f151101d, this.f151102e, this.f151103f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0133, code lost:
    
        if (o53.m0.b(1000, r17) == r8) goto L70;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        boolean z14;
        Object objC;
        int i14;
        List<pb2.a.d> list;
        Object value2;
        Object value3;
        String str2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f151100c;
        Context context = this.f151102e;
        com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar = this.f151101d;
        pb2.a.d dVar2 = this.f151103f;
        if (i15 != 0) {
            if (i15 == 1) {
                boolean z15 = this.f151099b;
                i14 = this.f151098a;
                o13.r.b(obj);
                z14 = z15;
                objC = obj;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            sn.a.o(f12.l.f68084a, true);
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        j70.k.c cVar = (j70.k.c) ((o2) dVar.f33544a.f124276c.f124077o.getValue()).getValue();
        int i16 = ((cVar == null || (list = cVar.f97557h) == null) ? 0 : list.size()) <= 1 ? 1 : 0;
        sz0.f.a aVar2 = sz0.f.f161394a;
        String str3 = dVar2.f136893a;
        List<String> list2 = dVar2.f136904l;
        String str4 = dVar2.f136893a;
        int iHashCode = str3.hashCode();
        aVar2.getClass();
        boolean zE = sz0.f.a.e(iHashCode, context);
        i1 i1Var = dVar.f33544a;
        i1Var.getClass();
        p2 p2Var = i1Var.f124276c.f124076n;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, h0.b1(h0.f1(h0.D0((List) value, str4)))));
        if (list2 == null || (str = (String) h0.d0(list2)) == null) {
            str = x0.f4336u2.f4358a;
        }
        String str5 = str;
        String string = list2 == null || list2.isEmpty() ? context.getString(R.string.activity_type_timed_activity) : null;
        if (i16 != 0 || zE) {
            sz0.f.f161394a.getClass();
            sz0.f.a.b(context);
        }
        y51.a aVar3 = dVar.f33553j;
        b63.o oVarS = g22.k.s(dVar2.f136894b);
        LocalDateTime localDateTime = dVar2.f136897e;
        b63.u uVarU = localDateTime != null ? g22.k.u(localDateTime) : null;
        LocalDateTime localDateTime2 = dVar2.f136898f;
        b63.u uVarU2 = localDateTime2 != null ? g22.k.u(localDateTime2) : null;
        this.f151098a = i16;
        this.f151099b = zE;
        this.f151100c = 1;
        b63.u uVar = uVarU2;
        z14 = zE;
        objC = aVar3.c(oVarS, str4, uVarU, uVar, str5, string, this);
        if (objC != aVar) {
            i14 = i16;
        }
        return aVar;
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            Headers headers = ((v2.b) v2Var).f47389d;
            String str6 = headers != null ? headers.get(FirebaseAnalytics.Param.LOCATION) : null;
            Long lJ = (headers == null || (str2 = headers.get("location-in-milliseconds")) == null) ? null : d53.t.j(str2);
            UploadPendingActivityWorker.f39807j.getClass();
            UploadPendingActivityWorker.a.b(context);
            if (str6 != null) {
                UploadPendingActivityWorker.a.a(context, lJ != null ? lJ.longValue() : 1000L, str6);
            } else {
                this.f151098a = i14;
                this.f151099b = z14;
                this.f151100c = 2;
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            i1 i1Var2 = dVar.f33544a;
            String str7 = dVar2.f136893a;
            i1Var2.getClass();
            p2 p2Var2 = i1Var2.f124276c.f124076n;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, h0.y0((List) value2, str7)));
            p2 p2Var3 = dVar.F;
            do {
                value3 = p2Var3.getValue();
                ((Boolean) value3).getClass();
            } while (!p2Var3.b(value3, Boolean.TRUE));
        }
        return Unit.INSTANCE;
    }
}
