package mq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class f extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rs.b f120176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f120177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final to.j f120178e;

    public f(Context context, List<l> list, rs.b bVar, to.j jVar, Boolean bool) {
        super(context, list);
        this.f120176c = bVar;
        this.f120178e = jVar;
        this.f120177d = bool;
    }

    @SuppressLint({"InflateParams"})
    public final LinearLayout c() {
        WeakReference<Context> weakReference = this.f120192b;
        Context context = weakReference.get();
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.activity_stats_laps_list_data_row_3_0, (ViewGroup) null);
        if (linearLayout == null) {
            return linearLayout;
        }
        Iterator<l> it = this.f120191a.iterator();
        while (it.hasNext()) {
            l next = it.next();
            int iE = fb2.g.e(16, context);
            linearLayout.setPadding(iE, 0, iE, 0);
            int f120187a = next.getF120187a();
            LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.activity_stats_laps_list_header_layout, (ViewGroup) null);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, next.getF120143b()));
            a aVar = a.INTERVAL;
            rs.b bVar = this.f120176c;
            String strA = (next == aVar && bVar.f154300f) ? "" : next.a(context);
            boolean z14 = next instanceof a;
            String strF = z14 ? h.f(context, next, bVar.f154298d, this.f120177d) : "";
            ls.e eVarA = z14 ? b.a((a) next) : null;
            TextView textViewA = a(R.layout.activity_stats_laps_list_header_item_3_0, f120187a, strA, eVarA != null ? new sr.b(weakReference.get()).j(eVarA) : strA);
            if (textViewA != null) {
                textViewA.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            }
            TextView textViewA2 = a(R.layout.activity_stats_laps_units_header_item, f120187a, strF, strF);
            if (textViewA2 != null) {
                textViewA2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            }
            if (textViewA != null) {
                if (n.b(f120187a)) {
                    textViewA.setTextAlignment(2);
                }
                linearLayout2.addView(textViewA);
            }
            if (textViewA2 != null) {
                if (n.b(f120187a)) {
                    textViewA2.setTextAlignment(2);
                }
                linearLayout2.addView(textViewA2);
            }
            linearLayout.addView(linearLayout2);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout3.addView(linearLayout);
        linearLayout3.setBackgroundColor(a7.b.getColor(context, R.color.gcm_surface_1));
        LayoutInflater.from(context).inflate(R.layout.gcm_divider_line_thin, linearLayout3);
        return linearLayout3;
    }
}
