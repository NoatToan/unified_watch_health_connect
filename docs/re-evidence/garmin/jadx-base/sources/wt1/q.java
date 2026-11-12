package wt1;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;
import p13.u0;
import p13.x;
import p13.y;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wt1.q[], still in use, count: 1, list:
  (r0v1 wt1.q[]) from 0x008e: CONSTRUCTOR (r0v1 wt1.q[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lwt1/q;", "", "", "value", "", "displayResId", "abbreviatedResID", "dateTimeConstant", "weekDayCalendarConstant", "<init>", "(Ljava/lang/String;ILjava/lang/String;IIII)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {
    SATURDAY("SATURDAY", R.string.lbl_day_of_week_saturday, R.string.lbl_day_of_week_saturday_abbreviated, 6, 7),
    SUNDAY("SUNDAY", R.string.lbl_day_of_week_sunday, R.string.lbl_day_of_week_sunday_abbreviated, 7, 1),
    MONDAY("MONDAY", R.string.lbl_day_of_week_monday, R.string.lbl_day_of_week_monday_abbreviated, 1, 2),
    TUESDAY("TUESDAY", R.string.lbl_day_of_week_tuesday, R.string.lbl_day_of_week_tuesday_abbreviated, 2, 3),
    WEDNESDAY("WEDNESDAY", R.string.lbl_day_of_week_wednesday, R.string.lbl_day_of_week_wednesday_abbreviated, 3, 4),
    THURSDAY("THURSDAY", R.string.lbl_day_of_week_thursday, R.string.lbl_day_of_week_thursday_abbreviated, 4, 5),
    FRIDAY("FRIDAY", R.string.lbl_day_of_week_friday, R.string.lbl_day_of_week_friday_abbreviated, 5, 6);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f187120f = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w13.c f187129o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f187131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f187132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f187133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f187134e;

    static {
        f187129o = new w13.c(new q[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private q(String str, int i14, int i15, int i16, int i17) {
        super(str, i);
        this.f187130a = str;
        this.f187131b = i14;
        this.f187132c = i15;
        this.f187133d = i16;
        this.f187134e = i17;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f187128n.clone();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lwt1/q$a;", "", "<init>", "()V", "", "MIN_TRIATHLON_DAYS", "I", "DEFAULT_MIN_DAYS", "DEFAULT_MAX_DAYS", "DEFAULT_DAYS_RANGE_ONE", "DEFAULT_DAYS_RANGE_TWO", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: wt1.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3481a<T> implements Comparator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Map f187135a;

            public C3481a(Map map) {
                this.f187135a = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                Map map = this.f187135a;
                Integer num = (Integer) map.get((String) t7);
                Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                Integer num2 = (Integer) map.get((String) t14);
                return r13.a.b(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static q a(String str) {
            if (!TextUtils.isEmpty(str)) {
                w13.c cVar = q.f187129o;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    q qVar = (q) bVarN.next();
                    if (d53.u.q(qVar.f187130a, str, true)) {
                        return qVar;
                    }
                }
            }
            return q.MONDAY;
        }

        public static String b(Context context, List list) {
            ArrayList arrayList;
            context.getClass();
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(y.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    wr.g.z(q.f187120f, (String) it.next(), arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(context.getString(((q) it3.next()).f187132c));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            tu1.i.f166483a.getClass();
            if (arrayList != null && arrayList.size() == q.f187129o.getF168272d()) {
                return context.getString(R.string.frequency_every_day);
            }
            if (arrayList != null && arrayList.size() == 5) {
                q.f187120f.getClass();
                List listD = d();
                ArrayList arrayList4 = new ArrayList(y.r(listD, 10));
                Iterator it4 = listD.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(context.getString(((q) it4.next()).f187132c));
                }
                if (arrayList.containsAll(arrayList4)) {
                    return context.getString(R.string.frequency_weekdays);
                }
            }
            if (arrayList != null && arrayList.size() == 2) {
                q.f187120f.getClass();
                List listK = x.k(q.SATURDAY, q.SUNDAY);
                ArrayList arrayList5 = new ArrayList(y.r(listK, 10));
                Iterator it5 = listK.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(context.getString(((q) it5.next()).f187132c));
                }
                if (arrayList.containsAll(arrayList5)) {
                    return context.getString(R.string.device_settings_frequency_weekends);
                }
            }
            if (arrayList != null) {
                return h0.k0(arrayList, ", ", null, null, null, 62);
            }
            return null;
        }

        public static ArrayList c() {
            List listD = d();
            ArrayList arrayList = new ArrayList(y.r(listD, 10));
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(((q) it.next()).f187130a);
            }
            return arrayList;
        }

        public static List d() {
            return x.k(q.MONDAY, q.TUESDAY, q.WEDNESDAY, q.THURSDAY, q.FRIDAY);
        }

        public static ArrayList e() {
            List listK = x.k(q.SATURDAY, q.SUNDAY);
            ArrayList arrayList = new ArrayList(y.r(listK, 10));
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(((q) it.next()).f187130a);
            }
            return arrayList;
        }

        public static List f(List list) {
            list.getClass();
            ArrayList arrayListD1 = h0.d1(q.f187129o);
            gg1.m mVarE1 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1();
            if (mVarE1 == gg1.m.SUNDAY) {
                Collections.rotate(arrayListD1, -1);
            } else if (mVarE1 == gg1.m.MONDAY) {
                Collections.rotate(arrayListD1, -2);
            }
            i53.c cVarE = i53.a.e(arrayListD1);
            ArrayList arrayList = new ArrayList(y.r(cVarE, 10));
            int i14 = 0;
            for (Object obj : cVarE) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                arrayList.add(new o13.p(((q) obj).f187130a, Integer.valueOf(i14)));
                i14 = i15;
            }
            return h0.N0(list, new C3481a(u0.l(arrayList)));
        }

        public static List g() {
            w13.c cVar = q.f187129o;
            ArrayList arrayList = new ArrayList(y.r(cVar, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                arrayList.add(((q) bVar.next()).f187130a);
            }
            return h0.b1(arrayList);
        }

        private a() {
        }
    }
}
