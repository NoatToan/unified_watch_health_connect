package ya1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import gg1.o0;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lya1/v;", "Lcom/garmin/android/apps/connectmobile/f1;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f195617c = new ArrayList();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lya1/v$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int f195618j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f195619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f195620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f195621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f195622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f195623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f195624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f195625g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Context f195626h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final oi0.h f195627i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            this.f195619a = (TextView) view2.findViewById(R.id.split_number);
            this.f195620b = (TextView) view2.findViewById(R.id.split_distance);
            this.f195621c = (TextView) view2.findViewById(R.id.split_target_power);
            this.f195622d = (TextView) view2.findViewById(R.id.split_avg_grade);
            this.f195623e = (TextView) view2.findViewById(R.id.split_time);
            this.f195624f = (TextView) view2.findViewById(R.id.split_percent_ftp);
            this.f195625g = (TextView) view2.findViewById(R.id.split_elev_change);
            Context context = view2.getContext();
            this.f195626h = context;
            context.getClass();
            this.f195627i = new oi0.h(context);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f195617c.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        if (i14 != -1 && (f0Var instanceof a)) {
            a aVar = (a) f0Var;
            Context context = aVar.f195626h;
            ab1.n nVar = (ab1.n) this.f195617c.get(i14);
            TextView textView = aVar.f195625g;
            TextView textView2 = aVar.f195624f;
            TextView textView3 = aVar.f195622d;
            TextView textView4 = aVar.f195621c;
            TextView textView5 = aVar.f195623e;
            TextView textView6 = aVar.f195620b;
            TextView textView7 = aVar.f195619a;
            nVar.getClass();
            double d14 = nVar.f2613b;
            int i15 = nVar.f2615d;
            float f14 = nVar.f2614c;
            boolean z14 = am.j.z(f12.l.f68084a);
            o0 o0VarG = f12.l.a.a().g();
            View view2 = aVar.itemView;
            view2.getClass();
            int i16 = nVar.f2612a;
            v22.e.g(i16 % 2 == 0 ? R.color.gcm_table_row_even : R.color.gcm_table_row_odd, view2);
            textView7.setText(String.valueOf(i16));
            textView7.setContentDescription(context.getString(R.string.lbl_split) + StringUtils.SPACE + i16);
            s20.d.f156005a.getClass();
            textView6.setText(s20.d.d(context, d14, z14, false));
            String strA = oi0.c.A(context, new h(3), s20.d.d(context, d14, z14, true));
            textView6.setContentDescription(context.getString(R.string.lbl_distance) + StringUtils.SPACE + strA);
            double d15 = (double) f14;
            l3.f23124b.getClass();
            textView5.setText(l3.a.l1((long) (((double) 1000) * d15)));
            String strD = aVar.f195627i.d((long) d15, false);
            textView5.setContentDescription(context.getString(R.string.lbl_time_estimate) + StringUtils.SPACE + strD);
            textView4.setText(String.valueOf(i15));
            textView4.setContentDescription(context.getString(R.string.lbl_target_power_watts, String.valueOf(i15)));
            String string = context.getString(R.string.lbl_value_percent, l3.f23126d.format(nVar.f2616e));
            string.getClass();
            textView3.setText(string);
            textView3.setContentDescription(context.getString(R.string.lbl_average_grade) + StringUtils.SPACE + string);
            String string2 = context.getString(R.string.lbl_value_percent, String.valueOf(nVar.f2617f));
            string2.getClass();
            textView2.setText(string2);
            textView2.setContentDescription(context.getString(R.string.device_settings_functional_threshold_power) + StringUtils.SPACE + string2);
            textView.setText(l3.a.a0(aVar.f195626h, nVar.f2618g, o0VarG, false, true));
            String strA2 = oi0.c.A(context, new h(4), l3.a.a0(aVar.f195626h, nVar.f2618g, o0VarG, true, true));
            textView.setContentDescription(context.getString(R.string.pacepro_splits_elevation_changes) + StringUtils.SPACE + strA2);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(n23.j.b(viewGroup, R.layout.power_guide_split_item, viewGroup, false));
    }
}
