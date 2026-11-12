package og2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132041a;

        static {
            int[] iArr = new int[ag2.c.a.values().length];
            try {
                iArr[ag2.c.a.HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ag2.c.a.SPEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ag2.c.a.POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ag2.c.a.PACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ag2.c.a.ROW_PACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ag2.c.a.GRADE_ADJUSTED_PACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ag2.c.a.ELEVATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f132041a = iArr;
        }
    }

    public static final List<ag2.c> a(List<ag2.c> list, Map<ag2.c.a, ah2.e> map) {
        list.getClass();
        map.getClass();
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeIf(new a73.n(new bh2.e(map, 3), 22));
        return p13.h0.b1(arrayList);
    }
}
