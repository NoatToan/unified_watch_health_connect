package ac1;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import gg1.o0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lac1/a;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f2697a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2698a;

        static {
            int[] iArr = new int[o0.values().length];
            try {
                iArr[o0.METRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0.STATUTE_UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2698a = iArr;
        }
    }

    static {
        new C0037a(null);
    }

    public a(l22.b bVar) {
        bVar.getClass();
        this.f2697a = bVar;
    }

    public static String a(o0 o0Var, Integer num) {
        o0Var.getClass();
        int i14 = b.f2698a[o0Var.ordinal()];
        if (i14 == 1 || i14 == 2) {
            if (num == null) {
                return "";
            }
            int iIntValue = num.intValue();
            l3.f23124b.getClass();
            String str = l3.f23131i.format(Integer.valueOf(iIntValue));
            return str == null ? "" : str;
        }
        if (num == null) {
            return "";
        }
        int iIntValue2 = num.intValue();
        l3.f23124b.getClass();
        String str2 = l3.f23131i.format(Integer.valueOf(MathKt.b(((double) iIntValue2) * 3.2808399d)));
        return str2 == null ? "" : str2;
    }

    public final String b(o0 o0Var, Integer num) {
        o0Var.getClass();
        int i14 = b.f2698a[o0Var.ordinal()];
        l22.b bVar = this.f2697a;
        return (i14 == 1 || i14 == 2) ? bVar.a(R.string.common_n_meters_label, a(o0Var, num)) : bVar.a(R.string.common_n_feet_label, a(o0Var, num));
    }

    /* JADX INFO: renamed from: ac1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lac1/a$a;", "", "<init>", "()V", "", "MIN_ALTITUDE_ACCLIMATION_METERS", "I", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0037a {
        public /* synthetic */ C0037a(j jVar) {
            this();
        }

        private C0037a() {
        }
    }
}
