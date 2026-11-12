package hm;

import a7.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import b7.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.dashboard.PolylineView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhm/a;", "Ldz/a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends dz.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dz.a.ViewOnClickListenerC1307a f84477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dz.a.ViewOnClickListenerC1307a f84478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewGroup f84479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PolylineView f84480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f84481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f84482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f84483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f84484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f84485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f84486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f84487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f84488r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f84489t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f84490v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f84491w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view2) {
        super(view2, (cz.a) null);
        view2.getClass();
        this.f84477g = new dz.a.ViewOnClickListenerC1307a(27);
        this.f84478h = new dz.a.ViewOnClickListenerC1307a(38);
    }

    @Override // dz.a
    public final int d(Resources resources) {
        resources.getClass();
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        return resources.getColor(R.color.gcm3_transparent, null);
    }

    @Override // dz.a
    public final int e(Resources resources) {
        resources.getClass();
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        return resources.getColor(R.color.gcm3_text_black, null);
    }

    @Override // dz.a
    public final void f(View view2) {
        view2.getClass();
        super.f(view2);
        this.f84479i = (ViewGroup) view2.findViewById(R.id.card_layout);
        this.f61655c.setVisibility(0);
        Drawable drawable = b.getDrawable(view2.getContext(), R.drawable.charts_reports);
        if (drawable != null) {
            drawable.setTint(b.getColor(view2.getContext(), R.color.gcm_icon_my_day_header_overview));
        }
        this.f61657e.setImageDrawable(drawable);
        this.f61657e.setVisibility(0);
        this.f84480j = (PolylineView) view2.findViewById(R.id.card_activity_polyline);
        this.f84481k = (TextView) view2.findViewById(R.id.card_primary_value);
        this.f84482l = (TextView) view2.findViewById(R.id.card_primary_unit);
        this.f84483m = (TextView) view2.findViewById(R.id.card_data_field_1_name);
        this.f84484n = (TextView) view2.findViewById(R.id.card_data_field_1_value);
        this.f84485o = (TextView) view2.findViewById(R.id.card_data_field_2_name);
        this.f84486p = (TextView) view2.findViewById(R.id.card_data_field_2_value);
        this.f84487q = (TextView) view2.findViewById(R.id.card_data_field_3_name);
        this.f84488r = (TextView) view2.findViewById(R.id.card_data_field_3_value);
        this.f84489t = (TextView) view2.findViewById(R.id.card_data_field_4_name);
        this.f84490v = (TextView) view2.findViewById(R.id.card_data_field_4_value);
        TextView textView = (TextView) view2.findViewById(R.id.card_footer_value);
        this.f84491w = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View viewFindViewById = view2.findViewById(R.id.root_layout);
        viewFindViewById.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = constraintLayout.findViewById(R.id.primary_stats_layout);
        viewFindViewById2.getClass();
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = constraintLayout.findViewById(R.id.stats_1_layout);
        viewFindViewById3.getClass();
        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewFindViewById3;
        View viewFindViewById4 = constraintLayout.findViewById(R.id.stats_2_layout);
        viewFindViewById4.getClass();
        ConstraintLayout constraintLayout4 = (ConstraintLayout) viewFindViewById4;
        View viewFindViewById5 = constraintLayout.findViewById(R.id.stats_3_layout);
        viewFindViewById5.getClass();
        ConstraintLayout constraintLayout5 = (ConstraintLayout) viewFindViewById5;
        View viewFindViewById6 = constraintLayout.findViewById(R.id.stats_4_layout);
        viewFindViewById6.getClass();
        ConstraintLayout constraintLayout6 = (ConstraintLayout) viewFindViewById6;
        Context context = view2.getContext();
        context.getClass();
        if (c22.b.a(context) >= 1.5f) {
            d dVar = new d();
            dVar.f(constraintLayout);
            dVar.e(constraintLayout3.getId(), 6);
            dVar.e(constraintLayout3.getId(), 3);
            dVar.e(constraintLayout3.getId(), 7);
            dVar.e(constraintLayout3.getId(), 4);
            dVar.h(constraintLayout3.getId(), 6, 0, 6);
            dVar.h(constraintLayout3.getId(), 7, 0, 7);
            dVar.h(constraintLayout3.getId(), 3, constraintLayout2.getId(), 4);
            dVar.s(constraintLayout3.getId(), 3, context.getResources().getDimensionPixelSize(R.dimen.spacing_small));
            dVar.s(constraintLayout3.getId(), 6, context.getResources().getDimensionPixelSize(R.dimen.spacing_normal));
            dVar.s(constraintLayout3.getId(), 4, context.getResources().getDimensionPixelSize(R.dimen.spacing_small));
            dVar.e(constraintLayout4.getId(), 6);
            dVar.e(constraintLayout4.getId(), 3);
            dVar.e(constraintLayout4.getId(), 7);
            dVar.h(constraintLayout4.getId(), 6, 0, 6);
            dVar.h(constraintLayout4.getId(), 7, 0, 7);
            dVar.h(constraintLayout4.getId(), 3, constraintLayout3.getId(), 4);
            dVar.s(constraintLayout4.getId(), 6, context.getResources().getDimensionPixelSize(R.dimen.spacing_normal));
            dVar.s(constraintLayout4.getId(), 4, context.getResources().getDimensionPixelSize(R.dimen.spacing_small));
            dVar.e(constraintLayout5.getId(), 6);
            dVar.e(constraintLayout5.getId(), 3);
            dVar.e(constraintLayout5.getId(), 7);
            dVar.h(constraintLayout5.getId(), 6, 0, 6);
            dVar.h(constraintLayout5.getId(), 7, 0, 7);
            dVar.h(constraintLayout5.getId(), 3, constraintLayout4.getId(), 4);
            dVar.s(constraintLayout5.getId(), 6, context.getResources().getDimensionPixelSize(R.dimen.spacing_normal));
            dVar.s(constraintLayout5.getId(), 4, context.getResources().getDimensionPixelSize(R.dimen.spacing_small));
            dVar.e(constraintLayout6.getId(), 6);
            dVar.e(constraintLayout6.getId(), 3);
            dVar.e(constraintLayout6.getId(), 7);
            dVar.h(constraintLayout6.getId(), 6, 0, 6);
            dVar.h(constraintLayout6.getId(), 7, 0, 7);
            dVar.h(constraintLayout6.getId(), 3, constraintLayout5.getId(), 4);
            dVar.s(constraintLayout6.getId(), 6, context.getResources().getDimensionPixelSize(R.dimen.spacing_normal));
            dVar.e(constraintLayout2.getId(), 5);
            dVar.e(constraintLayout2.getId(), 4);
            dVar.e(constraintLayout2.getId(), 7);
            dVar.h(constraintLayout2.getId(), 7, 0, 7);
            dVar.s(constraintLayout2.getId(), 4, context.getResources().getDimensionPixelSize(R.dimen.spacing_small));
            dVar.k(constraintLayout2.getId()).f6203e.f6226d = -2;
            dVar.b(constraintLayout);
        }
    }
}
