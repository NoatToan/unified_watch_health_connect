package w51;

import android.content.Context;
import com.garmin.android.apps.connectmobile.pendingactivity.api.UploadPendingActivityWorker;
import com.garmin.android.apps.connectmobile.v2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesViewModel$acceptPendingActivity$1", f = "PendingActivitiesViewModel.kt", l = {119}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z51.h f182466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f182467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f182468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f182469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f182470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f182471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h0 h0Var, b63.o oVar, Context context, String str, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f182468c = h0Var;
        this.f182469d = oVar;
        this.f182470e = context;
        this.f182471f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f182468c, this.f182469d, this.f182470e, this.f182471f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List<z51.h> list;
        String str;
        Object next;
        z51.h hVar;
        Object objC;
        Object value;
        Object value2;
        String str2;
        y yVar = this;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = yVar.f182467b;
        Context context = yVar.f182470e;
        b63.o oVar = yVar.f182469d;
        Long lJ = null;
        h0 h0Var = yVar.f182468c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = h0Var.f182267b;
            p2 p2Var2 = h0Var.f182267b;
            Map<b63.o, List<z51.h>> map = ((w) p2Var.getValue()).f182449e;
            if (map != null && (list = map.get(oVar)) != null) {
                Iterator<T> it = list.iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    str = yVar.f182471f;
                    if (!zHasNext) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((z51.h) next).f202505a, str));
                hVar = (z51.h) next;
                if (hVar != null) {
                    sz0.f.a aVar2 = sz0.f.f161394a;
                    str.getClass();
                    int iHashCode = str.hashCode();
                    aVar2.getClass();
                    boolean zE = sz0.f.a.e(iHashCode, context);
                    String strE = w2.a0.e(hVar);
                    if (strE == null) {
                        strE = am.x0.f4336u2.f4358a;
                    }
                    String str3 = strE;
                    Integer numR = w2.a0.r(hVar);
                    String string = numR != null ? context.getString(numR.intValue()) : null;
                    Map mapZ4 = h0.z4(h0Var, oVar, hVar, ((w) p2Var2.getValue()).f182449e);
                    while (true) {
                        Object value3 = p2Var2.getValue();
                        if (p2Var2.b(value3, w.a((w) p2Var2.getValue(), mapZ4 == null || mapZ4.isEmpty(), false, null, mapZ4, false, 46))) {
                            break;
                        }
                        yVar = this;
                    }
                    if (mapZ4 == null || mapZ4.isEmpty() || zE) {
                        sz0.f.f161394a.getClass();
                        sz0.f.a.b(context);
                    }
                    y51.a aVar3 = h0Var.f182266a;
                    b63.o oVar2 = hVar.f202506b;
                    if (oVar2 == null) {
                        oVar2 = oVar;
                    }
                    b63.u uVar = hVar.f202512h;
                    b63.u uVar2 = hVar.f202513i;
                    yVar.f182466a = hVar;
                    yVar.f182467b = 1;
                    objC = aVar3.c(oVar2, yVar.f182471f, uVar, uVar2, str3, string, yVar);
                    if (objC == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z51.h hVar2 = yVar.f182466a;
        o13.r.b(obj);
        hVar = hVar2;
        objC = obj;
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            UploadPendingActivityWorker.f39807j.getClass();
            UploadPendingActivityWorker.a.b(context);
            Headers headers = ((v2.b) v2Var).f47389d;
            h0Var.f182270e = headers != null ? headers.get(FirebaseAnalytics.Param.LOCATION) : null;
            p2 p2Var3 = h0Var.f182267b;
            if (headers != null && (str2 = headers.get("location-in-milliseconds")) != null) {
                lJ = d53.t.j(str2);
            }
            h0Var.f182271f = lJ;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, w.a((w) p2Var3.getValue(), false, false, null, null, false, 62)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            p2 p2Var4 = h0Var.f182267b;
            do {
                value = p2Var4.getValue();
            } while (!p2Var4.b(value, w.a((w) h0Var.f182267b.getValue(), false, false, f.b.f182257b, h0.x4(h0Var, oVar, hVar, ((w) value).f182449e), false, 38)));
        }
        return Unit.INSTANCE;
    }
}
