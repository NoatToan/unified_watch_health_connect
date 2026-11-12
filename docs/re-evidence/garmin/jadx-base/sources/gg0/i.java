package gg0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;
import qs.y;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gg0.i[], still in use, count: 1, list:
  (r0v1 gg0.i[]) from 0x0062: CONSTRUCTOR (r0v1 gg0.i[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lgg0/i;", "", "", "jsonValue", "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {
    METER("meter", R.string.unit_enum_meter),
    KILOMETER("kilometer", R.string.unit_enum_kilo_meter),
    MILE("mile", R.string.unit_enum_mile),
    YARD("yard", R.string.unit_enum_yard),
    SECOND("second", R.string.unit_enum_second),
    HOUR("hour", R.string.unit_enum_hour);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f77162b = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w13.c f77170j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77171a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77173a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.MILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.HOUR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f77173a = iArr;
        }
    }

    static {
        f77170j = new w13.c(new i[]{r0, r1, r2, r3, r4, r5});
    }

    private i(String str, int i14) {
        super(str, i);
        this.f77171a = str;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f77169i.clone();
    }

    public final String a(Context context) {
        switch (b.f77173a[ordinal()]) {
            case 1:
                String string = context.getString(R.string.unit_enum_meter);
                string.getClass();
                return string;
            case 2:
                String string2 = context.getString(R.string.unit_enum_kilo_meter);
                string2.getClass();
                return string2;
            case 3:
                String string3 = context.getString(R.string.unit_enum_mile);
                string3.getClass();
                return string3;
            case 4:
                String string4 = context.getString(R.string.unit_enum_yard);
                string4.getClass();
                return string4;
            case 5:
                String string5 = context.getString(R.string.unit_enum_second);
                string5.getClass();
                return string5;
            case 6:
                String string6 = context.getString(R.string.unit_enum_hour);
                string6.getClass();
                return string6;
            default:
                u0.r();
                return null;
        }
    }

    public final bg0.a.b b() {
        int i14 = b.f77173a[ordinal()];
        if (i14 == 1) {
            return bg0.a.b.METER;
        }
        if (i14 == 2) {
            return bg0.a.b.KILOMETER;
        }
        if (i14 == 3) {
            return bg0.a.b.MILE;
        }
        if (i14 != 4) {
            return null;
        }
        return bg0.a.b.YARD;
    }

    public final String c(Context context) {
        context.getClass();
        switch (b.f77173a[ordinal()]) {
            case 1:
                String string = context.getString(R.string.unit_enum_m);
                string.getClass();
                return string;
            case 2:
                String string2 = context.getString(R.string.unit_enum_km);
                string2.getClass();
                return string2;
            case 3:
                String string3 = context.getString(R.string.unit_enum_mi);
                string3.getClass();
                return string3;
            case 4:
                String string4 = context.getString(R.string.unit_enum_yd);
                string4.getClass();
                return string4;
            case 5:
                String string5 = context.getString(R.string.unit_enum_second);
                string5.getClass();
                return string5;
            case 6:
                String string6 = context.getString(R.string.unit_enum_hour);
                string6.getClass();
                return string6;
            default:
                u0.r();
                return null;
        }
    }

    public final y d() {
        int i14 = b.f77173a[ordinal()];
        if (i14 == 1) {
            return y.UNIT_DISTANCE_METER;
        }
        if (i14 == 2) {
            return y.UNIT_DISTANCE_KILOMETER;
        }
        if (i14 == 3) {
            return y.UNIT_DISTANCE_MILE;
        }
        if (i14 != 4) {
            return null;
        }
        return y.UNIT_DISTANCE_YARD;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgg0/i$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: gg0.i$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1559a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f77172a;

            static {
                int[] iArr = new int[bg0.a.b.values().length];
                try {
                    iArr[bg0.a.b.METER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[bg0.a.b.KILOMETER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[bg0.a.b.MILE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[bg0.a.b.YARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f77172a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static i a(bg0.a.b bVar) {
            int i14 = C1559a.f77172a[bVar.ordinal()];
            if (i14 == 1) {
                return i.METER;
            }
            if (i14 == 2) {
                return i.KILOMETER;
            }
            if (i14 == 3) {
                return i.MILE;
            }
            if (i14 == 4) {
                return i.YARD;
            }
            u0.r();
            return null;
        }

        private a() {
        }
    }
}
