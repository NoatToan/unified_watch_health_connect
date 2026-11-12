package ft0;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import fo.x;
import oi0.c;
import oi0.h;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lft0/a;", "", "<init>", "()V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f73439a = new a();

    /* JADX INFO: renamed from: ft0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1483a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73440a;

        static {
            int[] iArr = new int[xs0.a.values().length];
            try {
                iArr[xs0.a.ROWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f73440a = iArr;
        }
    }

    private a() {
    }

    public static String a(Context context, xs0.a aVar, double d14, boolean z14, boolean z15, String str) {
        int iP;
        String strJ1;
        context.getClass();
        aVar.getClass();
        str.getClass();
        int[] iArr = C1483a.f73440a;
        if (iArr[aVar.ordinal()] == 1) {
            l3.f23124b.getClass();
            iP = l3.a.q(d14);
        } else {
            l3.f23124b.getClass();
            iP = l3.a.p(d14, z14);
        }
        String strC = c(context, aVar, z14, true);
        if (iP == 0) {
            return str;
        }
        if (iArr[aVar.ordinal()] == 1) {
            l3.a aVar2 = l3.f23124b;
            aVar2.getClass();
            strJ1 = aVar2.r0(context, iP, true, false, str);
        } else {
            strJ1 = l3.f23124b.J1(context, d14, false, z14, false, str);
        }
        if (!z15) {
            return strJ1;
        }
        String string = context.getString(R.string.string_space_string_pattern, strJ1, strC);
        string.getClass();
        return string;
    }

    public static String b(Context context, h hVar, xs0.a aVar, double d14, boolean z14, boolean z15, String str) {
        int iP;
        context.getClass();
        hVar.getClass();
        aVar.getClass();
        str.getClass();
        if (C1483a.f73440a[aVar.ordinal()] == 1) {
            l3.f23124b.getClass();
            iP = l3.a.q(d14);
        } else {
            l3.f23124b.getClass();
            iP = l3.a.p(d14, z14);
        }
        if (iP == 0) {
            return str;
        }
        String strD = hVar.d(iP, true);
        String strD2 = d(context, aVar, z14, true);
        if (!z15) {
            return strD;
        }
        String string = context.getString(R.string.string_per_string_pattern, strD, strD2);
        string.getClass();
        return string;
    }

    public static String c(Context context, xs0.a aVar, boolean z14, boolean z15) {
        String string;
        context.getClass();
        aVar.getClass();
        if (C1483a.f73440a[aVar.ordinal()] == 1) {
            string = context.getString(R.string.common_abbrev_n_meters_no_space_label, "500");
        } else {
            string = context.getString(z14 ? R.string.lbl_km : R.string.lbl_mile);
        }
        string.getClass();
        return z15 ? "/".concat(string) : string;
    }

    public static String d(Context context, xs0.a aVar, boolean z14, boolean z15) {
        context.getClass();
        aVar.getClass();
        String strC = c(context, aVar, z14, z15);
        return C1483a.f73440a[aVar.ordinal()] == 1 ? c.A(context, new x(11), strC) : c.A(context, new x(12), strC);
    }
}
