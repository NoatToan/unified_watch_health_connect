package pv0;

import java.util.Iterator;
import java.util.List;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
public final class x {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141458a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.MORNING_CAFFEINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.LATE_CAFFEINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.ALCOHOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w.PERIOD_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[w.LIGHT_EXERCISE_BEFORE_BED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[w.MODERATE_EXERCISE_BEFORE_BED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[w.VIGOROUS_EXERCISE_BEFORE_BED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[w.LIGHT_EXERCISE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[w.MODERATE_EXERCISE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[w.VIGOROUS_EXERCISE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f141458a = iArr;
        }
    }

    public static final List<y> a(w wVar) {
        wVar.getClass();
        int i14 = a.f141458a[wVar.ordinal()];
        if (i14 == 1 || i14 == 2) {
            return y.b.f141472h;
        }
        return i14 != 3 ? j0.f134944a : y.a.f141464g;
    }

    public static final y b(w wVar, Integer num) {
        Object next;
        List<y> listA = a(wVar);
        listA.getClass();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            next = it.next();
            int f141473a = ((y) next).getF141473a();
            if (num != null && f141473a == num.intValue()) {
                return (y) next;
            }
        }
        next = null;
        return (y) next;
    }
}
