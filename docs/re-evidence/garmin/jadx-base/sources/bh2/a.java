package bh2;

import ah2.h;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh2/a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: bh2.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0260a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17916a;

        static {
            int[] iArr = new int[ag2.c.a.values().length];
            try {
                iArr[ag2.c.a.DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ag2.c.a.DISTANCE_METERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ag2.c.a.LAP_DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ag2.c.a.STEP_DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17916a = iArr;
        }
    }

    public static ah2.e a(ag2.c.a aVar, List list, h hVar, h.b bVar, h.b bVar2, h.a aVar2, boolean z14) {
        Object next;
        Object next2;
        aVar.getClass();
        list.getClass();
        hVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        aVar2.getClass();
        int i14 = C0260a.f17916a[aVar.ordinal()];
        Object obj = null;
        Object obj2 = null;
        if (i14 == 1) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((rf2.b) next).f152455a != rf2.a.DISTANCE);
            rf2.b bVar3 = (rf2.b) next;
            if (bVar3 == null) {
                return new ah2.e("--", null, false, 6, null);
            }
            if (!bVar3.d()) {
                Float f14 = bVar3.f152460f;
                if (!z14) {
                    bVar = bVar2;
                }
                return new ah2.e(hVar.y(f14, bVar, aVar2, false), bVar3.f152460f, false, 4, null);
            }
        } else if (i14 == 2) {
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((rf2.b) next2).f152455a != rf2.a.DISTANCE);
            rf2.b bVar4 = (rf2.b) next2;
            if (bVar4 == null) {
                return new ah2.e("--", null, false, 6, null);
            }
            if (!bVar4.d()) {
                Float f15 = bVar4.f152460f;
                return new ah2.e(hVar.y(f15 != null ? Float.valueOf(f15.floatValue() * 1000) : null, h.b.METERS, aVar2, false), bVar4.f152460f, false, 4, null);
            }
        } else {
            if (i14 == 3) {
                for (Object obj3 : list) {
                    if (((rf2.b) obj3).f152455a == rf2.a.DISTANCE_LAP) {
                        obj2 = obj3;
                        break;
                    }
                }
                rf2.b bVar5 = (rf2.b) obj2;
                if (bVar5 == null) {
                    return new ah2.e("--", null, false, 6, null);
                }
                Float f16 = bVar5.f152460f;
                if (!z14) {
                    bVar = bVar2;
                }
                return new ah2.e(hVar.y(f16, bVar, aVar2, false), bVar5.f152460f, false, 4, null);
            }
            if (i14 == 4) {
                for (Object obj4 : list) {
                    if (((rf2.b) obj4).f152455a == rf2.a.WORKOUT_DIST_TO_GO) {
                        obj = obj4;
                        break;
                    }
                }
                rf2.b bVar6 = (rf2.b) obj;
                if (bVar6 == null) {
                    return new ah2.e("--", null, false, 6, null);
                }
                Float f17 = bVar6.f152460f;
                if (!z14) {
                    bVar = bVar2;
                }
                return new ah2.e(hVar.y(f17, bVar, h.a.INT, false), bVar6.f152460f, false, 4, null);
            }
        }
        return null;
    }
}
