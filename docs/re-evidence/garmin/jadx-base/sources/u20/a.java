package u20;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import gg1.o0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu20/a;", "", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f167864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f167865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f167866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f167867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f167868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f167869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f167870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f167871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f167872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f167873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f167874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f167875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o0 f167876m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f167877n;

    public a(View view2) {
        view2.getClass();
        this.f167864a = view2;
        TextView textView = (TextView) view2.findViewById(R.id.elevation_gain_label);
        this.f167865b = textView;
        TextView textView2 = (TextView) view2.findViewById(R.id.elevation_gain_value);
        this.f167866c = textView2;
        TextView textView3 = (TextView) view2.findViewById(R.id.elevation_gain_uom);
        this.f167867d = textView3;
        TextView textView4 = (TextView) view2.findViewById(R.id.elevation_loss_label);
        this.f167868e = textView4;
        TextView textView5 = (TextView) view2.findViewById(R.id.elevation_loss_value);
        this.f167869f = textView5;
        TextView textView6 = (TextView) view2.findViewById(R.id.elevation_loss_uom);
        this.f167870g = textView6;
        TextView textView7 = (TextView) view2.findViewById(R.id.distance_label);
        this.f167871h = textView7;
        TextView textView8 = (TextView) view2.findViewById(R.id.distance_value);
        this.f167872i = textView8;
        TextView textView9 = (TextView) view2.findViewById(R.id.distance_uom);
        this.f167873j = textView9;
        this.f167875l = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        o0 o0VarG = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g();
        this.f167876m = o0VarG;
        boolean z14 = true;
        this.f167877n = o0VarG == o0.METRIC || o0VarG == o0.STATUTE_UK;
        View[] viewArr = {textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9};
        for (int i14 = 0; i14 < 9; i14++) {
            if (viewArr[i14] == null) {
                z14 = false;
                break;
            }
        }
        this.f167874k = z14;
        TextView textView10 = this.f167871h;
        textView10.getClass();
        v22.d.a(textView10, 1.0f);
        TextView textView11 = this.f167865b;
        textView11.getClass();
        v22.d.a(textView11, 1.0f);
        TextView textView12 = this.f167868e;
        textView12.getClass();
        v22.d.a(textView12, 1.0f);
        TextView textView13 = this.f167872i;
        textView13.getClass();
        v22.d.a(textView13, 1.3f);
        TextView textView14 = this.f167866c;
        textView14.getClass();
        v22.d.a(textView14, 1.3f);
        TextView textView15 = this.f167869f;
        textView15.getClass();
        v22.d.a(textView15, 1.3f);
        TextView textView16 = this.f167873j;
        textView16.getClass();
        v22.d.a(textView16, 1.3f);
        TextView textView17 = this.f167867d;
        textView17.getClass();
        v22.d.a(textView17, 1.3f);
        TextView textView18 = this.f167870g;
        textView18.getClass();
        v22.d.a(textView18, 1.3f);
    }

    public final void a() {
        if (this.f167874k) {
            TextView textView = this.f167865b;
            Context context = textView.getContext();
            textView.setText(context.getString(R.string.lbl_total_ascent));
            this.f167868e.setText(context.getString(R.string.lbl_total_descent));
            this.f167871h.setText(context.getString(R.string.lbl_distance));
            boolean z14 = this.f167877n;
            int i14 = z14 ? R.string.lbl_meter : R.string.lbl_foot;
            String string = z14 ? context.getString(R.string.common_meters_string) : context.getString(R.string.common_feet_string);
            string.getClass();
            boolean z15 = this.f167875l;
            int i15 = z15 ? R.string.lbl_km : R.string.lbl_mile;
            TextView textView2 = this.f167873j;
            textView2.setText(i15);
            textView2.setContentDescription(z15 ? context.getString(R.string.common_lbl_kilometers) : context.getString(R.string.common_lbl_miles));
            TextView textView3 = this.f167867d;
            textView3.setText(i14);
            textView3.setContentDescription(string);
            TextView textView4 = this.f167870g;
            textView4.setText(i14);
            textView4.setContentDescription(string);
        }
    }

    public final void b(double d14, double d15, double d16) {
        if (this.f167874k) {
            TextView textView = this.f167872i;
            Context context = textView.getContext();
            s20.e.f156007a.getClass();
            textView.setText(s20.e.b(d14, context, this.f167875l));
            this.f167866c.setText(s20.d.e(context, d15, this.f167876m, false, false));
            this.f167869f.setText(s20.d.e(context, d16, this.f167876m, false, false));
        }
    }
}
