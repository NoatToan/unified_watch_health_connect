package rt1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrt1/q;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f154552a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f154553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f154554c;

    static {
        fy1.i.f73924a.getClass();
        f154553b = ((m) KoinJavaComponent.get$default(m.class, null, null, 6, null)).o();
        f154554c = ((m) KoinJavaComponent.get$default(m.class, null, null, 6, null)).d();
    }

    private q() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(fg0.k kVar, List list) {
        Object next;
        kVar.getClass();
        list.getClass();
        gg0.f eventType = kVar.getEventType();
        boolean zF = eventType != null ? eventType.f() : false;
        gg0.f eventType2 = kVar.getEventType();
        boolean zE = eventType2 != null ? eventType2.e() : false;
        gg0.f eventType3 = kVar.getEventType();
        boolean zG = eventType3 != null ? eventType3.g() : false;
        vt1.n nVarV1 = kVar.v1();
        LocalDate date = kVar.getDate();
        if (date != null) {
            if (zG) {
                fy1.i.f73924a.getClass();
                if (fy1.i.a.r()) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((com.garmin.android.apps.connectmobile.workouts.data.model.f) next).getName() != m52.i.HALF_IRON);
                    com.garmin.android.apps.connectmobile.workouts.data.model.f fVar = (com.garmin.android.apps.connectmobile.workouts.data.model.f) next;
                    if (fVar != null) {
                        og0.a aVar = og0.a.f131967a;
                        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF = fVar.f();
                        aVar.getClass();
                        double dDoubleValue = ((Number) og0.a.x(og0.a.D(listF), 0.05d).f128595b).doubleValue();
                        fg0.d completionTarget = kVar.getCompletionTarget();
                        Double dB = completionTarget != null ? completionTarget.b() : null;
                        if (dB != null && dB.doubleValue() <= dDoubleValue && b(date, pu1.b.FBT_PLAN)) {
                            return true;
                        }
                    } else {
                        String str = "Could not find HALF_IRON in the list of triathlon types: " + list;
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.f(a2Var, "TrainingPlanFeatureSupportStrategy", str);
                    }
                }
            }
            if (zF) {
                fy1.i.f73924a.getClass();
                if (fy1.i.a.o() && bo1.a.a().c().q0() && b(date, pu1.b.FBT_PLAN)) {
                    return true;
                }
            }
            if (zE) {
                fy1.i.f73924a.getClass();
                if (fy1.i.a.o() && bo1.a.a().c().w() && bo1.a.a().c().h0() && b(date, pu1.b.FBT_PLAN)) {
                    return true;
                }
            }
            if (zE && f154554c && b(date, pu1.b.ITP_PLAN)) {
                return true;
            }
            if (zF && f154553b) {
                if (nVarV1 == vt1.n.FIVE_K && b(date, pu1.b.ATP_FIVE_K)) {
                    return true;
                }
                if (nVarV1 == vt1.n.TEN_K && b(date, pu1.b.ATP_TEN_K)) {
                    return true;
                }
                if (nVarV1 == vt1.n.HALF_MARATHON && b(date, pu1.b.ATP_HALF_MARATHON)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(LocalDate localDate, pu1.b bVar) {
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDatePlusWeeks = localDateNow.plusWeeks(bVar.f141301a);
        LocalDate localDatePlusWeeks2 = localDateNow.plusWeeks(bVar.f141302b);
        localDatePlusWeeks2.getClass();
        return localDate.compareTo(localDatePlusWeeks2) <= 0 && localDate.compareTo(localDatePlusWeeks) >= 0;
    }
}
