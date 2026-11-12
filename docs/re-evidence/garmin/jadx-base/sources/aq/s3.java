package aq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.ColorShapeRectangleView;

/* JADX INFO: loaded from: classes7.dex */
public class s3 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f12204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12205b;

    public enum a {
        SUPERIOR(R.color.palette_berry_2, R.string.lbl_superior, ">95", "<0.290 CdA", "<0.220 CdA"),
        EXCELLENT(R.color.palette_delta_1, R.string.lbl_excellent, "70 - 95", "0.290 - 0.350 CdA", "0.221 - 0.240 CdA"),
        GOOD(R.color.palette_swagger_1, R.string.lbl_good, "30 - 69", "0.350 - 0.425 CdA", "0.241 - 0.260 CdA"),
        FAIR(R.color.palette_mango_2, R.string.lbl_fair, "5 - 29", "0.426 - 0.500 CdA", "0.261 - 0.280 CdA"),
        POOR(R.color.palette_ruby_2, R.string.lbl_poor, "<5", ">0.500 CdA", ">0.280 CdA");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f12214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f12215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f12216e;

        a(int i14, int i15, String str, String str2, String str3) {
            this.f12212a = i14;
            this.f12213b = i15;
            this.f12214c = str;
            this.f12215d = str2;
            this.f12216e = str3;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_zones_help_view_pager, viewGroup, false);
        this.f12204a = (LinearLayout) viewInflate.findViewById(R.id.zones_values_linear_layout);
        if (getArguments() != null) {
            this.f12205b = getArguments().getBoolean("isRoadCyclist");
        }
        a[] aVarArr = {a.SUPERIOR, a.EXCELLENT, a.GOOD, a.FAIR, a.POOR};
        for (int i14 = 0; i14 < 5; i14++) {
            a aVar = aVarArr[i14];
            View viewInflate2 = layoutInflater.inflate(R.layout.drag_cda_row_layout, (ViewGroup) this.f12204a, false);
            ((ColorShapeRectangleView) viewInflate2.findViewById(R.id.color_rectangle_view)).setRectangleColor(aVar.f12212a);
            TextView textView = (TextView) viewInflate2.findViewById(R.id.color_zone_detail_text);
            TextView textView2 = (TextView) viewInflate2.findViewById(R.id.percent_zone_detail_text);
            TextView textView3 = (TextView) viewInflate2.findViewById(R.id.cda_range_detail_text);
            textView.setText(getString(aVar.f12213b));
            textView2.setText(aVar.f12214c);
            if (this.f12205b) {
                textView3.setText(aVar.f12215d);
            } else {
                textView3.setText(aVar.f12216e);
            }
            this.f12204a.addView(viewInflate2);
        }
        return viewInflate;
    }
}
