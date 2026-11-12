package up;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.renderer.DataRenderer;
import i53.d;
import mp.j;
import mp.k;
import o82.g;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import qz.b;
import u62.z;
import vp.c;
import vp.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lup/a;", "", "Landroid/view/View;", "rootView", "Lmp/k;", "metricType", "Lo82/g;", "dateIntervalType", "", "startDateString", "", "isUsingMetric", "isNotStatuteUS", "Li53/d;", "Lmp/j;", "chipsStatus", "<init>", "(Landroid/view/View;Lmp/k;Lo82/g;Ljava/lang/String;ZZLi53/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f172139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d<j, Boolean> f172140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CustomBarChart f172141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CustomCombinedChart f172142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b<? super yp.b, ? extends DataRenderer> f172143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f172144f;

    /* JADX INFO: renamed from: up.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3211a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172145a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.WIN_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.STRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.BODY_BATTERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.PACK_WEIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.AVG_WIN_STRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.AVG_LOSS_STRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k.AVG_DRAW_STRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f172145a = iArr;
        }
    }

    public a(View view2, k kVar, g gVar, String str, boolean z14, boolean z15, d<j, Boolean> dVar) {
        int i14;
        CustomBarChart customBarChart;
        b<? super yp.b, ? extends DataRenderer> aVar;
        view2.getClass();
        kVar.getClass();
        gVar.getClass();
        str.getClass();
        dVar.getClass();
        this.f172139a = kVar;
        this.f172140b = dVar;
        View viewFindViewById = view2.findViewById(R.id.reports_chart_bar_view);
        viewFindViewById.getClass();
        CustomBarChart customBarChart2 = (CustomBarChart) viewFindViewById;
        this.f172141c = customBarChart2;
        View viewFindViewById2 = view2.findViewById(R.id.reports_chart_combined_view);
        viewFindViewById2.getClass();
        CustomCombinedChart customCombinedChart = (CustomCombinedChart) viewFindViewById2;
        this.f172142d = customCombinedChart;
        int i15 = sp.b.f160497a[gVar.ordinal()];
        if (i15 != 1) {
            i14 = 5;
            if (i15 != 2) {
                if (i15 == 3 || i15 == 4) {
                    i14 = 6;
                } else {
                    i14 = i15 != 5 ? 0 : 3;
                }
            }
        } else {
            i14 = 4;
        }
        LocalDate localDateW = g22.k.w(str, "yyyy-MM-dd");
        localDateW = localDateW == null ? LocalDate.now() : localDateW;
        int i16 = C3211a.f172145a[kVar.ordinal()];
        if (i16 == 1 || i16 == 2 || i16 == 3 || i16 == 4) {
            LocalDate localDate = localDateW;
            int i17 = i14;
            customBarChart = customBarChart2;
            Context context = view2.getContext();
            context.getClass();
            localDate.getClass();
            aVar = new sz.a(customCombinedChart, new c(context, i17, localDate, kVar, dVar), new vp.d(customCombinedChart, localDate, kVar, i17, z14, z15), new vp.j(customCombinedChart), new e(customCombinedChart), null, 32, null);
        } else {
            Context context2 = view2.getContext();
            context2.getClass();
            localDateW.getClass();
            LocalDate localDate2 = localDateW;
            int i18 = i14;
            aVar = new rz.a<>(customBarChart2, new vp.a(context2, i18, localDate2, z14, z15, kVar, dVar), new vp.b(customBarChart2, kVar, localDate2, i18, 0.0f, z14, z15, 16, (p005kotlin.jvm.internal.j) null), new k00.k(customBarChart2, true), new e(customBarChart2), null, 32, null);
            customBarChart = customBarChart2;
        }
        this.f172143e = aVar;
        this.f172144f = z.b(R.string.common_no_data, view2);
        customCombinedChart.setVisibility(8);
        customBarChart.setVisibility(8);
    }
}
