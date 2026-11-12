package km;

import com.garmin.android.apps.connectmobile.R;
import im.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.w;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkm/b;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105278a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.AUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.LUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f105278a = iArr;
        }
    }

    public static km.a a(int i14, n nVar) {
        List listK;
        if (i14 == 28) {
            Integer numValueOf = Integer.valueOf(R.color.gds_data_viz_yellow_primary);
            Integer numValueOf2 = Integer.valueOf(R.color.gds_data_viz_teal_primary);
            int i15 = nVar == null ? -1 : a.f105278a[nVar.ordinal()];
            if (i15 != 1) {
                listK = i15 != 2 ? x.k(Integer.valueOf(R.color.gds_data_viz_orange_primary), numValueOf2) : x.k(Integer.valueOf(R.color.gds_data_viz_purple_primary), numValueOf, numValueOf2);
            } else {
                listK = x.k(Integer.valueOf(R.color.gds_data_viz_violet_primary), numValueOf, numValueOf2);
            }
            ArrayList arrayList = new ArrayList(y.r(listK, 10));
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                arrayList.add(new c(R.color.transparent, 0, R.color.gcm_chart_highlight_line, new int[0], 1.0f, 1.0f, new int[]{iIntValue, iIntValue}, true, true, true, true, false, false, 0, null, 30722, null));
            }
            return new km.a(R.color.transparent, arrayList);
        }
        if (i14 == 54) {
            c cVar = new c(R.color.transparent, R.color.palette_mango_2, R.color.gcm_chart_highlight_line, new int[0], 1.5f, 1.0f, im.a.f94092i, true, true, true, false, false, false, 0, null, 30720, null);
            w13.c cVar2 = zp1.a.f206594h;
            ArrayList arrayList2 = new ArrayList(y.r(cVar2, 10));
            Iterator<T> it3 = cVar2.iterator();
            while (it3.hasNext()) {
                int i16 = ((zp1.a) it3.next()).f206597c;
                arrayList2.add(new c(R.color.transparent, i16, R.color.gcm_chart_highlight_line, new int[0], 1.5f, 1.0f, new int[]{i16, i16}, true, true, true, false, false, true, 0, null, 26624, null));
            }
            ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList3.add(c.b((c) it4.next(), false, 26623));
            }
            c cVar3 = new c(R.color.gcm_chart_stamina_line_color, 0, R.color.gcm_chart_highlight_line, new int[0], 1.5f, 1.0f, new int[0], false, true, true, false, false, false, 0, null, 30722, null);
            return new km.a(R.color.palette_mango_2, h0.C0(h0.C0(h0.C0(h0.C0(w.c(cVar), w.c(c.b(cVar3, false, 30719))), arrayList2), arrayList3), w.c(c.b(cVar3, true, 28671))));
        }
        if (i14 == 56) {
            return new km.a(R.color.transparent, x.k(new c(R.color.transparent, 0, R.color.gcm_chart_highlight_line, new int[0], 1.0f, 1.0f, new int[]{R.color.blue_10_static, R.color.blue_10_static}, true, true, true, true, false, false, 0, null, 30722, null), new c(R.color.transparent, 0, R.color.gcm_chart_highlight_line, new int[0], 1.0f, 1.0f, new int[]{R.color.green_10_static, R.color.green_10_static}, true, true, true, true, false, false, 0, null, 30722, null), new c(R.color.transparent, 0, R.color.gcm_chart_highlight_line, new int[0], 1.0f, 1.0f, new int[]{R.color.yellow_50, R.color.yellow_50}, true, true, true, true, false, false, 0, null, 30722, null)));
        }
        if (i14 == 80) {
            return new km.a(R.color.transparent, x.k(new c(R.color.transparent, 0, R.color.gcm_chart_highlight_line, new int[0], 1.0f, 1.0f, new int[]{R.color.blue_10_static, R.color.blue_10_static}, true, true, true, true, false, false, 0, null, 22530, null), new c(R.color.transparent, 0, R.color.gcm_chart_highlight_line, new int[0], 1.0f, 1.0f, new int[]{R.color.gds_data_viz_violet_primary, R.color.gds_data_viz_violet_primary}, true, true, true, true, false, false, 0, null, 22530, null), new c(R.color.transparent, 0, R.color.gcm_chart_highlight_line, new int[0], 1.0f, 1.0f, new int[]{R.color.gds_data_viz_yellow_primary, R.color.gds_data_viz_yellow_primary}, true, true, true, true, false, false, 0, null, 22530, null)));
        }
        if (i14 != 89) {
            if (i14 != 92) {
                return null;
            }
            return new km.a(R.color.gcm_text_secondary, x.k(new c(R.color.transparent, R.color.gds_data_viz_red_primary, R.color.gcm_chart_highlight_line, new int[0], 2.0f, 1.0f, new int[]{R.color.gds_data_viz_red_primary, R.color.gds_data_viz_red_primary}, true, true, true, false, false, false, 0, 1, 14336, null), new c(R.color.black, R.color.gds_data_viz_neutral_secondary, R.color.gcm_chart_highlight_line, new int[0], 1.5f, 1.0f, new int[]{R.color.gds_data_viz_neutral_secondary, R.color.gds_data_viz_neutral_secondary}, true, true, true, false, false, false, 0, null, 30720, null)));
        }
        c cVar4 = new c(R.color.gds_data_viz_neutral_primary, 0, R.color.gcm_chart_highlight_line, new int[0], 1.5f, 1.0f, new int[0], false, true, true, false, true, false, 0, null, 28674, null);
        w13.c cVar5 = zp1.a.f206594h;
        ArrayList arrayList4 = new ArrayList(y.r(cVar5, 10));
        Iterator<T> it5 = cVar5.iterator();
        while (it5.hasNext()) {
            int i17 = ((zp1.a) it5.next()).f206597c;
            arrayList4.add(new c(R.color.transparent, 0, R.color.gcm_chart_highlight_line, new int[0], 0.0f, 1.0f, new int[]{i17, i17}, true, true, true, false, false, true, 0, null, 26626, null));
        }
        return new km.a(R.color.gds_data_viz_neutral_primary, h0.C0(w.c(cVar4), arrayList4));
    }
}
