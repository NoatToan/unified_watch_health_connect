package a81;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import g81.j0;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La81/v;", "", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f1974a = new v();

    private v() {
    }

    public static int a(List list) {
        return MathKt.c((h0.r0(list) - h0.w0(list)) / 500);
    }

    public static int b(List list, List list2) {
        ArrayList arrayListC0 = h0.C0(list, list2);
        return MathKt.c((h0.r0(arrayListC0) - h0.w0(arrayListC0)) / 500);
    }

    public static int c(int i14, boolean z14) {
        if (i14 > 0) {
            return z14 ? R.color.gds_data_viz_green_primary : R.color.gds_data_viz_neutral_primary;
        }
        return (i14 == 0 || z14) ? R.color.gds_data_viz_neutral_primary : R.color.gds_data_viz_green_primary;
    }

    public static j0 d(n61.i iVar, l22.b bVar, pi0.e eVar, int i14, float f14) {
        LocalDate localDate = LocalDate.parse(iVar.f123868c);
        localDate.getClass();
        String strD = eVar.d(localDate, qi0.a.YEAR_ABBREV_MONTH_DAY);
        String strT0 = l3.a.t0(l3.f23124b, bVar, i14);
        String strE1 = l3.a.e1((long) f14);
        if (strE1 == null) {
            strE1 = "";
        }
        return new j0(strD, strT0, strE1);
    }

    public static j0 e(n61.i iVar, l22.b bVar, pi0.e eVar, int i14, float f14) {
        LocalDate localDate = LocalDate.parse(iVar.f123868c);
        localDate.getClass();
        String strD = eVar.d(localDate, qi0.a.YEAR_ABBREV_MONTH_DAY);
        l3.a aVar = l3.f23124b;
        double dAbs = Math.abs(i14);
        aVar.getClass();
        String strE0 = l3.a.E0(bVar, dAbs, false, "");
        String strE1 = l3.a.e1((long) f14);
        return new j0(strD, strE0, strE1 != null ? strE1 : "");
    }

    public static j0 f(n61.i iVar, l22.b bVar, pi0.e eVar, int i14, float f14, boolean z14) {
        LocalDate localDate = LocalDate.parse(iVar.f123868c);
        localDate.getClass();
        return new j0(eVar.d(localDate, qi0.a.YEAR_ABBREV_MONTH_DAY), l3.a.t0(l3.f23124b, bVar, i14), l3.a.S(bVar, f14, l3.f23125c, false, z14));
    }

    public static j0 g(n61.i iVar, l22.b bVar, pi0.e eVar, int i14, float f14, boolean z14) {
        LocalDate localDate = LocalDate.parse(iVar.f123868c);
        localDate.getClass();
        String strD = eVar.d(localDate, qi0.a.YEAR_ABBREV_MONTH_DAY);
        l3.a aVar = l3.f23124b;
        double dAbs = Math.abs(i14);
        aVar.getClass();
        return new j0(strD, l3.a.E0(bVar, dAbs, false, ""), l3.a.S(bVar, f14, l3.f23125c, false, z14));
    }

    public static String h(l22.b bVar, pi0.e eVar, n61.i iVar, LocalDate localDate) {
        LocalDate localDate2 = LocalDate.parse(iVar.f123868c);
        if (g22.k.g(localDate, localDate2)) {
            return null;
        }
        localDate2.getClass();
        return bVar.a(R.string.lbl_data_available_since, eVar.d(localDate2, qi0.a.YEAR_ABBREV_MONTH_DAY));
    }
}
