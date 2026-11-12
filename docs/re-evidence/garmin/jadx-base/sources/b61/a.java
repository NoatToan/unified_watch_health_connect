package b61;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import gg1.o0;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb61/a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16163a = new a();

    /* JADX INFO: renamed from: b61.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0228a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16164a;

        static {
            int[] iArr = new int[o0.values().length];
            try {
                iArr[o0.METRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f16164a = iArr;
        }
    }

    private a() {
    }

    public static String a(l22.b bVar, Integer num, x61.a aVar) {
        bVar.getClass();
        b.f16165a.getClass();
        Integer num2 = (num == null || num.intValue() < 4000) ? aVar.f189175a : aVar.f189178d;
        if (num2 != null) {
            return bVar.getString(num2.intValue());
        }
        return null;
    }

    public static String b(l22.b bVar, Integer num, o0 o0Var, boolean z14) {
        bVar.getClass();
        o0Var.getClass();
        String str = "";
        if (C0228a.f16164a[o0Var.ordinal()] == 1) {
            if (num != null) {
                int iIntValue = num.intValue();
                l3.f23124b.getClass();
                String str2 = l3.f23131i.format(Integer.valueOf(iIntValue));
                if (str2 != null) {
                    str = str2;
                }
            }
            return z14 ? bVar.a(R.string.common_abbrev_n_meters_label, str) : bVar.a(R.string.common_n_meters_label, str);
        }
        if (num != null) {
            int iIntValue2 = num.intValue();
            l3.f23124b.getClass();
            String str3 = l3.f23131i.format(Integer.valueOf(MathKt.b(((double) iIntValue2) * 3.2808399d)));
            if (str3 != null) {
                str = str3;
            }
        }
        return z14 ? bVar.a(R.string.lbl_short_form_for_feet, str) : bVar.a(R.string.common_n_feet_label, str);
    }

    public static String c(l22.b bVar, String str, x61.a aVar, boolean z14) {
        Integer num;
        bVar.getClass();
        str.getClass();
        if (aVar == null || (num = aVar.f189183i) == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (aVar instanceof x61.a.b) {
            return bVar.a(iIntValue, str);
        }
        if (aVar instanceof x61.a.C3518a) {
            return bVar.getString(iIntValue);
        }
        if (!(aVar instanceof x61.a.d) || z14) {
            return null;
        }
        return bVar.a(iIntValue, str);
    }
}
