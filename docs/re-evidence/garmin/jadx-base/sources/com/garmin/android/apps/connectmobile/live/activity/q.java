package com.garmin.android.apps.connectmobile.live.activity;

import am.x0;
import au0.h0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.w;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/live/activity/q;", "Ltf2/h;", "Lkr/a;", "activityConfigurationDataSource", "<init>", "(Lkr/a;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements tf2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kr.a f38456a;

    static {
        new a(null);
    }

    public q(kr.a aVar) {
        aVar.getClass();
        this.f38456a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0105  */
    @Override // tf2.h
    public final ArrayList a(String str) {
        jr.q qVar;
        List listC;
        Object next;
        h0.f12930a.getClass();
        x0 x0VarA = h0.a.a(str);
        if (x0VarA == null) {
            String strN = fb1.c.n("Received unknown activity type key ", str);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "LiveActivityHomeCardProviderImpl", strN);
            return null;
        }
        List<jr.q> listA = this.f38456a.a(x0VarA).a();
        if (listA != null) {
            Iterator<T> it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((jr.q) next).d() != jr.s.Home);
            qVar = (jr.q) next;
        } else {
            qVar = null;
        }
        List<jr.r> listG = qVar != null ? qVar.g() : null;
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it3 = listG.iterator();
        while (it3.hasNext()) {
            jr.p pVarA = ((jr.r) it3.next()).a();
            if (pVarA != null) {
                switch (r.f38457a[pVarA.ordinal()]) {
                    case 1:
                        listC = w.c(rf2.a.CALORIES);
                        break;
                    case 2:
                        listC = w.c(rf2.a.DISTANCE);
                        break;
                    case 3:
                        listC = w.c(rf2.a.DISTANCE);
                        break;
                    case 4:
                        listC = w.c(rf2.a.TIME);
                        break;
                    case 5:
                        listC = w.c(rf2.a.PACE_AVG);
                        break;
                    case 6:
                        listC = w.c(rf2.a.HEART_RATE_AVG);
                        break;
                    case 7:
                        listC = w.c(rf2.a.SPEED_AVG);
                        break;
                    case 8:
                        listC = w.c(rf2.a.DISTANCE_LAP);
                        break;
                    case 9:
                        listC = w.c(rf2.a.LAPS);
                        break;
                    case 10:
                        listC = x.k(rf2.a.TIME_ACTIVE, rf2.a.TIME_LAP);
                        break;
                    case 11:
                        listC = w.c(rf2.a.WORKOUT_SET_COUNT);
                        break;
                    case 12:
                        listC = w.c(rf2.a.POWER_AVG);
                        break;
                    case 13:
                        listC = w.c(rf2.a.FLOORS_CLIMBED);
                        break;
                    case 14:
                        listC = w.c(rf2.a.PACE_AVG);
                        break;
                    case 15:
                        listC = w.c(rf2.a.JUMP_ROPE_NUM_COUNT);
                        break;
                    case 16:
                        listC = w.c(rf2.a.TOTAL_ASCENT);
                        break;
                    case 17:
                        listC = w.c(rf2.a.TIME);
                        break;
                    case 18:
                        listC = w.c(rf2.a.LAPS);
                        break;
                    default:
                        listC = null;
                        break;
                }
            } else {
                listC = null;
            }
            if (listC != null) {
                arrayList.add(listC);
            }
        }
        return y.s(arrayList);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/live/activity/q$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
