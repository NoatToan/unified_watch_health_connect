package e2;

import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ky0.w0;
import p005kotlin.Unit;
import p13.t0;
import r53.p2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f62478b;

    public /* synthetic */ k(Object obj, int i14) {
        this.f62477a = i14;
        this.f62478b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o13.l] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        int i14 = this.f62477a;
        ?? r14 = this.f62478b;
        switch (i14) {
            case 0:
                ((Integer) obj).intValue();
                return r14;
            case 1:
                k30.m mVar = (k30.m) obj;
                MultiDayActivitiesDetailActivity.a aVar = MultiDayActivitiesDetailActivity.f39233a;
                mVar.getClass();
                w0 w0Var = (w0) r14.getValue();
                w0Var.getClass();
                p2 p2Var = w0Var.f107627z1;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, k30.n.b((k30.n) value, mVar, null, 14)));
                return Unit.INSTANCE;
            case 2:
                i53.c cVar = (i53.c) obj;
                MultiDayActivitiesDetailActivity.a aVar2 = MultiDayActivitiesDetailActivity.f39233a;
                cVar.getClass();
                w0 w0Var2 = (w0) r14.getValue();
                w0Var2.getClass();
                p2 p2Var2 = w0Var2.f107627z1;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, k30.n.b((k30.n) value2, null, cVar, 13)));
                return Unit.INSTANCE;
            default:
                lc.h0 h0Var = (lc.h0) obj;
                h0Var.getClass();
                Map<String, lc.t> mapE = h0Var.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(mapE.size()));
                Iterator<T> it = mapE.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ((lc.t) entry.getValue()).f111866a);
                }
                return rc.l.e(r14, linkedHashMap);
        }
    }
}
