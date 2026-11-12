package s52;

import com.garmin.android.apps.connectmobile.golf.truswing.SwingDetailsActivity;
import com.garmin.android.apps.connectmobile.powerguide.create.ScheduledEventsActivity;
import java.util.function.Predicate;
import s5.e0;
import sk0.r1;
import t70.w0;
import t70.x0;
import u1.y1;
import z70.c0;
import zd0.u0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f157405b;

    public /* synthetic */ e(Object obj, int i14) {
        this.f157404a = i14;
        this.f157405b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i14 = this.f157404a;
        Object obj2 = this.f157405b;
        switch (i14) {
            case 0:
                f fVar = f.f157406a;
                return ((Boolean) ((e0) obj2).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((r1) obj2).invoke(obj)).booleanValue();
            case 2:
                return ((Boolean) ((r1) obj2).invoke(obj)).booleanValue();
            case 3:
                int i15 = x0.A;
                return ((Boolean) ((w0) obj2).invoke(obj)).booleanValue();
            case 4:
                int i16 = x0.A;
                return ((Boolean) ((w0) obj2).invoke(obj)).booleanValue();
            case 5:
                ScheduledEventsActivity.a aVar = ScheduledEventsActivity.f40379d;
                return ((Boolean) ((j82.d) obj2).invoke(obj)).booleanValue();
            case 6:
                return ((Boolean) ((ta0.j) obj2).invoke(obj)).booleanValue();
            case 7:
                return ((Boolean) ((y1) obj2).invoke(obj)).booleanValue();
            case 8:
                return ((Boolean) ((y1) obj2).invoke(obj)).booleanValue();
            case 9:
                return ((Boolean) ((y1) obj2).invoke(obj)).booleanValue();
            case 10:
                return ((Boolean) ((y1) obj2).invoke(obj)).booleanValue();
            case 11:
                return ((Boolean) ((y1) obj2).invoke(obj)).booleanValue();
            case 12:
                return ((Boolean) ((y1) obj2).invoke(obj)).booleanValue();
            case 13:
                return ((Boolean) ((y1) obj2).invoke(obj)).booleanValue();
            case 14:
                return ((Boolean) ((y1) obj2).invoke(obj)).booleanValue();
            case 15:
                return ((Boolean) ((y1) obj2).invoke(obj)).booleanValue();
            case 16:
                return ((Boolean) ((y1) obj2).invoke(obj)).booleanValue();
            case 17:
                return ((Boolean) ((uo1.a) obj2).invoke(obj)).booleanValue();
            case 18:
                return ((Boolean) ((uo1.a) obj2).invoke(obj)).booleanValue();
            case 19:
                return ((Boolean) ((uo1.a) obj2).invoke(obj)).booleanValue();
            case 20:
                return ((Boolean) ((uo1.a) obj2).invoke(obj)).booleanValue();
            case 21:
                cv.c cVar = (cv.c) obj;
                String str = ((SwingDetailsActivity) obj2).f35779e;
                str.getClass();
                return str.equals("GCM_action_swings_record") && (cVar instanceof cv.o);
            case 22:
                int i17 = c0.f202783e;
                return ((Boolean) ((y01.k) obj2).invoke(obj)).booleanValue();
            case 23:
                int i18 = c0.f202783e;
                return ((Boolean) ((y01.k) obj2).invoke(obj)).booleanValue();
            default:
                int i19 = u0.f204141p;
                return ((Boolean) ((y01.k) obj2).invoke(obj)).booleanValue();
        }
    }
}
