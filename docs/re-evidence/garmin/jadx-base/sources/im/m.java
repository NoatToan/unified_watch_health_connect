package im;

import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lim/m;", "Lcom/garmin/android/apps/connectmobile/activities/charts/b;", "Landroid/view/View;", "chartRow", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends com.garmin.android.apps.connectmobile.activities.charts.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f94156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f94157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f94158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f94159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f94160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f94161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f94162r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f94163t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.left_container);
        this.f94156l = viewFindViewById;
        this.f94157m = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(R.id.stats_unit) : null;
        this.f94158n = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(R.id.stats_value) : null;
        this.f94159o = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(R.id.stats_label) : null;
        View viewFindViewById2 = view2.findViewById(R.id.right_container);
        this.f94160p = viewFindViewById2;
        this.f94161q = viewFindViewById2 != null ? (TextView) viewFindViewById2.findViewById(R.id.stats_unit) : null;
        this.f94162r = viewFindViewById2 != null ? (TextView) viewFindViewById2.findViewById(R.id.stats_value) : null;
        this.f94163t = viewFindViewById2 != null ? (TextView) viewFindViewById2.findViewById(R.id.stats_label) : null;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.b
    public final void d(String str, String str2) {
        View view2 = this.f94156l;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        TextView textView = this.f94157m;
        if (textView != null) {
            textView.setText(str2);
        }
        TextView textView2 = this.f94158n;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.b
    public final void e(String str, String str2, String str3, String str4) {
        TextView textView = this.f94159o;
        if (textView != null) {
            v22.e.v(textView, str3 != null);
        }
        if (textView != null) {
            textView.setText(str3);
        }
        d(str, str2);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.b
    public final void f(String str, String str2) {
        View view2 = this.f94160p;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        TextView textView = this.f94161q;
        if (textView != null) {
            textView.setText(str2);
        }
        TextView textView2 = this.f94162r;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.b
    public final void g(String str, String str2, String str3, String str4) {
        TextView textView = this.f94163t;
        if (textView != null) {
            v22.e.v(textView, str3 != null);
        }
        if (textView != null) {
            textView.setText(str3);
        }
        f(str, str2);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.b
    public final void h(boolean z14) {
        View view2 = this.f94156l;
        if (view2 != null) {
            v22.e.v(view2, z14);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.b
    public final void i(boolean z14) {
        View view2 = this.f94160p;
        if (view2 != null) {
            v22.e.v(view2, z14);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.b
    public final void j(boolean z14) {
        View view2 = this.f94156l;
        if (view2 != null) {
            v22.e.v(view2, z14);
        }
        View view3 = this.f94160p;
        if (view3 != null) {
            v22.e.v(view3, z14);
        }
    }
}
