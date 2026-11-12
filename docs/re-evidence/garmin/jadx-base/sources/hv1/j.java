package hv1;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import java.util.List;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lhv1/j;", "", "", "minDistance", "maxDistance", "prePlannedWeeklyMileage", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum j {
    ZERO(0, 0, 0),
    ONE_TO_FIVE(1, 5, 5),
    SIX_TO_TEN(6, 10, 10),
    ELEVEN_TO_FIFTEEN(11, 15, 15),
    SIXTEEN_TO_TWENTY(16, 20, 20),
    TWENTY_ONE_TO_TWENTY_FIVE(21, 25, 25),
    TWENTY_FIVE_PLUS(25, 25, 25),
    ONE_TO_EIGHT_KM(1, 8, 8),
    NINE_TO_SIX_TEEN_KM(9, 16, 16),
    SEVEN_TEEN_TO_TWENTY_FOUR_KM(17, 24, 24),
    TWENTY_FIVE_TO_THIRTY_TWO_KM(25, 32, 32),
    THIRTY_THREE_TO_FORTY_KM(33, 40, 40),
    FORTY_PLUS_KM(40, 40, 40);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f85874d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85891c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85892a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.ZERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.ONE_TO_FIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.SIX_TO_TEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.ELEVEN_TO_FIFTEEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.SIXTEEN_TO_TWENTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j.TWENTY_ONE_TO_TWENTY_FIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[j.TWENTY_FIVE_PLUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[j.ONE_TO_EIGHT_KM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[j.NINE_TO_SIX_TEEN_KM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[j.SEVEN_TEEN_TO_TWENTY_FOUR_KM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[j.TWENTY_FIVE_TO_THIRTY_TWO_KM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[j.THIRTY_THREE_TO_FORTY_KM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[j.FORTY_PLUS_KM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f85892a = iArr;
        }
    }

    j(int i14, int i15, int i16) {
        this.f85889a = i14;
        this.f85890b = i15;
        this.f85891c = i16;
    }

    public final String a(Context context) {
        int i14 = b.f85892a[ordinal()];
        a aVar = f85874d;
        switch (i14) {
            case 1:
                aVar.getClass();
                return a.a(context, this);
            case 2:
                aVar.getClass();
                return a.a(context, this);
            case 3:
                aVar.getClass();
                return a.a(context, this);
            case 4:
                aVar.getClass();
                return a.a(context, this);
            case 5:
                aVar.getClass();
                return a.a(context, this);
            case 6:
                aVar.getClass();
                return a.a(context, this);
            case 7:
                aVar.getClass();
                return a.a(context, this);
            case 8:
                aVar.getClass();
                return a.a(context, this);
            case 9:
                aVar.getClass();
                return a.a(context, this);
            case 10:
                aVar.getClass();
                return a.a(context, this);
            case 11:
                aVar.getClass();
                return a.a(context, this);
            case 12:
                aVar.getClass();
                return a.a(context, this);
            case 13:
                aVar.getClass();
                return a.a(context, this);
            default:
                u0.r();
                return null;
        }
    }

    public final int b() {
        if (this == ZERO) {
            return 0;
        }
        f85874d.getClass();
        boolean zContains = a.c().contains(this);
        int i14 = this.f85891c;
        if (!zContains) {
            return i14;
        }
        l3.f23124b.getClass();
        return (int) (((double) i14) / 1.609344d);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhv1/j$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(Context context, j jVar) {
            jVar.getClass();
            int i14 = jVar.f85890b;
            if (context == null) {
                return "";
            }
            String string = context.getString(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? R.string.common_lbl_kilometers : R.string.common_lbl_miles);
            string.getClass();
            int i15 = jVar.f85889a;
            if (i15 == 0) {
                return org.apache.commons.lang3.e.d(i15, StringUtils.SPACE, string);
            }
            if (jVar != j.FORTY_PLUS_KM && jVar != j.TWENTY_FIVE_PLUS) {
                return i15 + "-" + i14 + StringUtils.SPACE + string;
            }
            return org.apache.commons.lang3.e.d(i14, "+ ", string);
        }

        public static j b(double d14) {
            Object obj = null;
            if (((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y()) {
                l3.f23124b.getClass();
                double d15 = d14 / 1000.0d;
                if (d15 <= 0.0d) {
                    return j.ZERO;
                }
                j jVar = j.FORTY_PLUS_KM;
                if (d15 >= jVar.f85891c) {
                    return jVar;
                }
                for (Object obj2 : c()) {
                    j jVar2 = (j) obj2;
                    double d16 = jVar2.f85889a;
                    if (d15 <= jVar2.f85890b && d16 <= d15) {
                        obj = obj2;
                        break;
                    }
                }
                return (j) obj;
            }
            l3.f23124b.getClass();
            double d17 = d14 / 1609.344d;
            if (d17 <= 0.0d) {
                return j.ZERO;
            }
            j jVar3 = j.TWENTY_FIVE_PLUS;
            if (d17 >= jVar3.f85891c) {
                return jVar3;
            }
            for (Object obj3 : x.k(j.ZERO, j.ONE_TO_FIVE, j.SIX_TO_TEN, j.ELEVEN_TO_FIFTEEN, j.SIXTEEN_TO_TWENTY, j.TWENTY_ONE_TO_TWENTY_FIVE, jVar3)) {
                j jVar4 = (j) obj3;
                double d18 = jVar4.f85889a;
                if (d17 <= jVar4.f85890b && d18 <= d17) {
                    obj = obj3;
                    break;
                }
            }
            return (j) obj;
        }

        public static List c() {
            return x.k(j.ZERO, j.ONE_TO_EIGHT_KM, j.NINE_TO_SIX_TEEN_KM, j.SEVEN_TEEN_TO_TWENTY_FOUR_KM, j.TWENTY_FIVE_TO_THIRTY_TWO_KM, j.THIRTY_THREE_TO_FORTY_KM, j.FORTY_PLUS_KM);
        }

        private a() {
        }
    }
}
