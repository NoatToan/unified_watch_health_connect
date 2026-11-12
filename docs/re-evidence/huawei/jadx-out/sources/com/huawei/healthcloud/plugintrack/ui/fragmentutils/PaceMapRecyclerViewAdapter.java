package com.huawei.healthcloud.plugintrack.ui.fragmentutils;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.views.MarketingView;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.izn;
import defpackage.izw;
import defpackage.jpq;
import defpackage.njj;
import defpackage.njy;
import defpackage.qqs;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class PaceMapRecyclerViewAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f11186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<njj> f11187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f11188c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private double i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private float o;
    private float p;
    private float q;
    private double r;
    private List<b> s;
    private Resources t;
    private float u;
    private float v;
    private int x;
    private float y;

    public PaceMapRecyclerViewAdapter(Context context, List<njj> list, String str, String str2, float f, float f2, float f3, float f4, float f5, boolean z, double d, double d2, int i, boolean z2) {
        if (context == null || list == null) {
            throw new RuntimeException("PaceMapRecyclerViewAdapter invalid params in constructor");
        }
        this.f11188c = context;
        this.t = context.getResources();
        this.k = UnitUtil.f();
        this.f11187b = list;
        this.d = str;
        this.e = str2;
        this.f11186a = f;
        this.u = f2;
        this.o = f5;
        this.p = f3;
        this.v = f4;
        this.f = z;
        this.x = i;
        this.j = i == 258 || i == 264 || i == 227;
        this.i = d;
        this.r = d2;
        this.n = z2;
        if (f2 != f) {
            this.q = (f / f2) - (f4 / f3);
            this.y = (f3 - f4) / (f2 - f);
        }
        LogUtil.a("Track_PaceMapRecyclerViewAdapter", "mRateDiff =", Float.valueOf(this.q), "  DisplayMin =", Float.valueOf(f4), "DisplayMax = ", Float.valueOf(f3));
        this.h = LanguageUtil.ba(this.f11188c);
        b();
        if (qqs.e(this.f11188c)) {
            this.g = true;
        }
    }

    private void b() {
        if (e()) {
            this.l = false;
            LogUtil.a("Track_PaceMapRecyclerViewAdapter", "show old pace view");
            return;
        }
        this.s = new ArrayList(16);
        Resources resources = this.f11188c.getResources();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (njj njjVar : this.f11187b) {
            this.s.add(new b(3, njjVar));
            i++;
            int iRound = Math.round(njjVar.d());
            i2 += iRound;
            i3 += iRound;
            if (this.k) {
                if (i % 5 == 0) {
                    this.s.add(new b(5, resources.getString(R.string.IDS_hwh_motiontrack_show_use_time, resources.getQuantityString(R.plurals.IDS_hwh_motiontrack_show_use_time_mi, i, UnitUtil.e(i, 1, 0)), UnitUtil.e(i2)), resources.getString(R.string.IDS_hwh_motiontrack_show_segment_time, UnitUtil.e(i3))));
                    i3 = 0;
                }
            } else if (i % 5 == 0) {
                this.s.add(new b(5, resources.getString(R.string.IDS_hwh_motiontrack_show_use_time, resources.getQuantityString(R.plurals.IDS_hwh_motiontrack_show_use_time_km, i, UnitUtil.e(i, 1, 0)), UnitUtil.e(i2)), resources.getString(R.string.IDS_hwh_motiontrack_show_segment_time, UnitUtil.e(i3))));
                i3 = 0;
            }
        }
        if (this.o != 0.0f) {
            this.s.add(new b(4, "", ""));
        }
        this.s.add(new b(6, "", ""));
        this.l = true;
    }

    private boolean e() {
        int size;
        List<njj> list = this.f11187b;
        return list == null || (size = list.size()) == 0 || this.f11187b.get(size + (-1)).c() / 1000 != size || this.x == 274;
    }

    private void c(HealthTextView healthTextView, int i) {
        healthTextView.setTextColor(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (!this.l) {
            if (i != this.f11187b.size() + 2) {
                return i == this.f11187b.size() + 3 ? 6 : 3;
            }
            LogUtil.a("Track_PaceMapRecyclerViewAdapter", "position == TYPE_FOOT_LAYOUT");
            return 4;
        }
        return this.s.get(i - 2).f11193a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            return null;
        }
        int i2 = 1;
        if (1 == i) {
            return new a(this.f11188c, c(viewGroup), i2);
        }
        int i3 = 2;
        if (2 == i) {
            return new a(this.f11188c, a(viewGroup), i3);
        }
        int i4 = 4;
        if (4 == i) {
            a aVar = new a(this.f11188c, b(viewGroup), i4);
            aVar.e(this.f);
            aVar.d(this.g);
            return aVar;
        }
        int i5 = 5;
        if (5 == i) {
            return new a(this.f11188c, e(viewGroup), i5);
        }
        int i6 = 6;
        if (6 == i) {
            if (!a()) {
                return new a(this.f11188c, new LinearLayout(this.f11188c), i6);
            }
            MarketingView marketingView = new MarketingView(this.f11188c);
            marketingView.setInvalidateCallback(new IBaseResponseCallback() { // from class: jpu
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i7, Object obj) {
                    this.f38811b.c(i7, obj);
                }
            });
            marketingView.d(c());
            return new a(this.f11188c, marketingView, i6);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.track_show_pace_item, viewGroup, false);
        if (this.f || this.g) {
            c((HealthTextView) viewInflate.findViewById(R.id.listview_id), izw.f38267a);
            if (this.h) {
                viewInflate.findViewById(R.id.tv_title).setBackgroundResource(R.drawable.track_show_pace_progressbackground_rtl_device);
            } else {
                viewInflate.findViewById(R.id.tv_title).setBackgroundResource(R.drawable.track_show_pace_progressbackground_device);
            }
        }
        a aVar2 = new a(this.f11188c, viewInflate, 3);
        aVar2.e(this.f);
        aVar2.d(this.g);
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i, Object obj) {
        notifyDataSetChanged();
    }

    private int c() {
        return this.x == 264 ? 4174 : 4153;
    }

    private boolean a() {
        int i = this.x;
        return (i == 258 || i == 264 || i == 227) && !this.m;
    }

    private View e(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.track_show_pace_item_5n, viewGroup, false);
        if (!this.f && !this.g) {
            return viewInflate;
        }
        ((HealthTextView) viewInflate.findViewById(R.id.tv_use_time)).setTextColor(izw.f38267a);
        ((HealthTextView) viewInflate.findViewById(R.id.tv_title)).setTextColor(izw.f38267a);
        return viewInflate;
    }

    private View b(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.track_show_pace_item_foot, viewGroup, false);
        if (this.m) {
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.track_show_pace_item_foot_layout);
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
                LogUtil.e("Track_PaceMapRecyclerViewAdapter", "object is not instanceof LinearLayout.LayoutParams");
                return null;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(izn.b(this.f11188c, 16.0f), 0, izn.b(this.f11188c, 16.0f), izn.b(this.f11188c, 4.0f));
            relativeLayout.setLayoutParams(layoutParams2);
        }
        if (!this.f && !this.g) {
            return viewInflate;
        }
        c((HealthTextView) viewInflate.findViewById(R.id.listview_id), izw.f38267a);
        c((HealthTextView) viewInflate.findViewById(R.id.tv_use_time), izw.f38267a);
        if (this.h) {
            viewInflate.findViewById(R.id.tv_title).setBackgroundResource(R.drawable.track_show_pace_progressbackground_rtl_device);
            return viewInflate;
        }
        viewInflate.findViewById(R.id.tv_title).setBackgroundResource(R.drawable.track_show_pace_progressbackground_device);
        return viewInflate;
    }

    private View a(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.track_detail_pace_mid_item_layout, viewGroup, false);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.track_detail_pace_mid_layout_distance_des);
        b((HealthTextView) viewInflate.findViewById(R.id.track_detail_pace_mid_layout_distance_unit), healthTextView);
        if (this.m) {
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.track_detail_pace_mid_item_linear);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
                LogUtil.e("Track_PaceMapRecyclerViewAdapter", "object is not instanceof LinearLayout.LayoutParams");
                return null;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(izn.b(this.f11188c, 16.0f), 0, izn.b(this.f11188c, 16.0f), izn.b(this.f11188c, 10.0f));
            linearLayout.setLayoutParams(layoutParams2);
        }
        if (this.f || this.g) {
            c((HealthTextView) viewInflate.findViewById(R.id.track_detail_pace_mid_layout_distance_unit), izw.f38267a);
            c((HealthTextView) viewInflate.findViewById(R.id.track_detail_pace_mid_layout_distance_des), izw.f38267a);
        }
        if (this.m) {
            healthTextView.setVisibility(8);
            return viewInflate;
        }
        healthTextView.setVisibility(0);
        return viewInflate;
    }

    private void b(HealthTextView healthTextView, HealthTextView healthTextView2) {
        String string;
        String string2;
        if (this.x == 274) {
            if (this.k) {
                string = this.f11188c.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
                string2 = this.f11188c.getString(R.string.IDS_hwh_motiontrack_swim_pace_with_unit_mi, 100);
            } else {
                string = this.f11188c.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500);
                string2 = this.f11188c.getString(R.string.IDS_hwh_motiontrack_swim_pace_with_unit, 500);
            }
        } else if (this.k) {
            string = this.f11188c.getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_pace_mi);
            string2 = this.f11188c.getString(R.string.IDS_hwh_motiontrack_show_pace_mi_hour);
        } else {
            string = this.f11188c.getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_pace_km);
            string2 = this.f11188c.getString(R.string.IDS_hwh_motiontrack_show_pace_km_hour);
        }
        healthTextView.setText(string);
        healthTextView2.setText(string2);
    }

    private View c(ViewGroup viewGroup) {
        View viewInflate;
        String str;
        if (this.m) {
            viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.track_detail_pace_top_share_item_layout, viewGroup, false);
        } else {
            viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.track_detail_pace_top_item_layout, viewGroup, false);
        }
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_averagepace_unit);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_fastpace_unit);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_fastpace_title);
        if (this.k) {
            str = "/" + this.f11188c.getString(R.string.IDS_motiontrack_show_sport_unit_mi);
        } else {
            str = "/" + this.f11188c.getString(R.string.IDS_motiontrack_show_sport_unit_km);
        }
        if (this.x == 274) {
            if (this.k) {
                str = String.format(this.f11188c.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100), new Object[0]);
            } else {
                str = String.format(String.format(this.f11188c.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500), new Object[0]), new Object[0]);
            }
        }
        healthTextView3.setText(this.f11188c.getResources().getString(R.string.IDS_motiontrack_fastpace_with_unit, str));
        healthTextView.setText(str);
        healthTextView2.setText(str);
        if (this.m) {
            healthTextView.setVisibility(8);
            healthTextView2.setVisibility(8);
            if (this.f || this.g) {
                c(healthTextView, this.f11188c.getResources().getColor(R.color.color_normal_titlebar_title));
                c(healthTextView2, this.f11188c.getResources().getColor(R.color.color_normal_titlebar_title));
            }
        } else {
            if (this.n) {
                b(viewInflate);
            }
            a(viewInflate);
        }
        d(viewInflate);
        return viewInflate;
    }

    private void a(View view) {
        if (!qrs.x() || this.f11188c.getResources().getConfiguration().fontScale < 1.2f) {
            return;
        }
        c(view.findViewById(R.id.hw_show_pace_averagepace_title));
        c(view.findViewById(R.id.hw_show_pace_fastpace_title));
        c(view.findViewById(R.id.hw_show_pace_half_title));
        c(view.findViewById(R.id.hw_show_pace_marathon_title));
        c(view.findViewById(R.id.hw_show_pace_half));
        c(view.findViewById(R.id.hw_show_pace_marathon));
        c(view.findViewById(R.id.hw_show_pace_averagepace));
        c(view.findViewById(R.id.hw_show_pace_averagepace_unit));
        c(view.findViewById(R.id.hw_show_pace_fastpace));
        c(view.findViewById(R.id.hw_show_pace_fastpace_unit));
    }

    private void c(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setTextSize(1, (qrs.e(this.f11188c, textView.getTextSize()) / this.f11188c.getResources().getConfiguration().fontScale) * 1.2f);
        }
    }

    private void d(View view) {
        if (this.f || this.g) {
            c((HealthTextView) view.findViewById(R.id.hw_show_pace_averagepace_title), izw.f38267a);
            c((HealthTextView) view.findViewById(R.id.hw_show_pace_averagepace), izw.f38268b);
            c((HealthTextView) view.findViewById(R.id.hw_show_pace_fastpace_title), izw.f38267a);
            c((HealthTextView) view.findViewById(R.id.hw_show_pace_fastpace), izw.f38268b);
            c((HealthTextView) view.findViewById(R.id.hw_show_pace_half_title), izw.f38267a);
            c((HealthTextView) view.findViewById(R.id.hw_show_pace_marathon_title), izw.f38267a);
            c((HealthTextView) view.findViewById(R.id.hw_show_pace_marathon), izw.f38268b);
            c((HealthTextView) view.findViewById(R.id.hw_show_pace_half), izw.f38268b);
        }
        if (this.m) {
            if (this.f || this.g) {
                c((HealthTextView) view.findViewById(R.id.hw_show_pace_averagepace), this.f11188c.getResources().getColor(R.color.color_normal_titlebar_title));
                c((HealthTextView) view.findViewById(R.id.hw_show_pace_fastpace), this.f11188c.getResources().getColor(R.color.color_normal_titlebar_title));
            }
        }
    }

    private void b(View view) {
        String string;
        final View viewInflate = View.inflate(this.f11188c, R.layout.track_detail_pace_top_item_layout_tips, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.pace_tips);
        if (UnitUtil.f()) {
            if (this.x == 274) {
                string = this.f11188c.getResources().getString(R.string.IDS_indoor_rowing_machine_pace_unnormal_tips_inch, 100, 100);
            } else {
                string = this.f11188c.getResources().getString(R.string.IDS_hwh_track_detail_pace_fast_tip_inch, 1);
            }
        } else if (this.x == 274) {
            string = this.f11188c.getResources().getString(R.string.IDS_indoor_rowing_machine_pace_unnormal_tips, 500, 500);
        } else {
            string = this.f11188c.getResources().getString(R.string.IDS_hwh_track_detail_pace_fast_tip);
        }
        healthTextView.setText(string);
        ImageView imageView = (ImageView) view.findViewById(R.id.hw_show_pace_fastpace_title_tips);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragmentutils.PaceMapRecyclerViewAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                PaceMapRecyclerViewAdapter.this.e(viewInflate);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(View view) {
        if (this.f11188c == null || view == null) {
            LogUtil.e("Track_PaceMapRecyclerViewAdapter", "showPaceDialog, mContext or view is null");
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeAllViews();
        }
        new CustomViewDialog.Builder(this.f11188c).d(view).a(this.f11188c.getString(R.string.IDS_service_area_notice_title)).c(this.f11188c.getString(R.string.IDS_common_notification_know_tips), new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.fragmentutils.PaceMapRecyclerViewAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
            }
        }).d().show();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        njj njjVar;
        float f;
        if (aVar == null) {
            return;
        }
        if (aVar.n == 1) {
            aVar.c(this.d, this.e, this.j, this.i, this.r);
            return;
        }
        if (aVar.n == 2) {
            LogUtil.d("Track_PaceMapRecyclerViewAdapter", "Type is two");
            return;
        }
        if (aVar.n == 4) {
            aVar.c(this.t);
            aVar.d(this.x);
            aVar.a((this.l ? this.f11187b.size() : this.f11187b.get(i - 3).c() / 1000) + 1, this.o, this.k);
            return;
        }
        if (aVar.n == 5) {
            b bVar = this.s.get(i - 2);
            aVar.c(bVar.e, bVar.f11194b);
            return;
        }
        if (aVar.n == 6) {
            LogUtil.a("Track_PaceMapRecyclerViewAdapter", "Type is TYPE_MARKETING_LAYOUT");
            return;
        }
        LogUtil.a("Track_PaceMapRecyclerViewAdapter", "Type is ", Integer.valueOf(aVar.n));
        int i2 = i - 2;
        if (this.l) {
            if (!njy.c(this.s, i2) || this.s.get(i2) == null) {
                njjVar = null;
            } else {
                njjVar = this.s.get(i2).f11195c;
            }
        } else if (njy.c(this.f11187b, i2)) {
            njjVar = this.f11187b.get(i2);
        } else {
            njjVar = null;
        }
        if (njjVar == null) {
            return;
        }
        double dC = (((double) njjVar.c()) * 1.0d) / 1000.0d;
        if (this.x == 274 && !this.k) {
            dC = ((((double) njjVar.c()) * 1.0d) / 1000.0d) * 0.5d;
        }
        aVar.c(this.t);
        float fD = njjVar.d();
        float f2 = this.u;
        if (fD != f2) {
            float f3 = this.f11186a;
            if (fD == f3) {
                c(aVar, fD, c(dC, this.x));
                return;
            }
            if (this.q < 0.0f) {
                f = (this.y * (fD - f3)) + this.v;
            } else {
                f = (fD / f2) * this.p;
            }
            aVar.a(3, c(dC, this.x), c(fD), f);
            return;
        }
        aVar.a(3, c(dC, this.x), c(fD), this.p);
    }

    private String c(double d, int i) {
        if (i == 274 && !this.k) {
            return UnitUtil.e(d, 1, 1);
        }
        return UnitUtil.e(d, 1, 0);
    }

    private void c(a aVar, float f, String str) {
        float f2;
        if (this.q < 0.0f) {
            f2 = this.v;
        } else {
            f2 = (this.f11186a / this.u) * this.p;
        }
        aVar.a(1, str, c(f), f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.l) {
            return this.s.size() + 2;
        }
        return this.f11187b.size() + 3 + (this.o == 0.0f ? 0 : 1);
    }

    public void c(boolean z) {
        this.m = z;
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f11190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f11191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f11192c;
        private boolean d;
        private HealthTextView e;
        private int f;
        private HealthTextView g;
        private HealthTextView h;
        private boolean i;
        private HealthTextView j;
        private View m;
        private int n;

        private a(Context context, View view, int i) {
            super(view);
            this.n = i;
            this.m = view;
            this.f11191b = context;
            this.i = LanguageUtil.ba(context);
            e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(boolean z) {
            this.d = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(boolean z) {
            this.f11192c = z;
        }

        private void e() {
            int i = this.n;
            if (i == 1) {
                this.e = (HealthTextView) this.m.findViewById(R.id.hw_show_pace_fastpace);
                this.f11190a = (HealthTextView) this.m.findViewById(R.id.hw_show_pace_averagepace);
                return;
            }
            if (i == 3) {
                this.g = (HealthTextView) this.m.findViewById(R.id.listview_id);
                this.h = (HealthTextView) this.m.findViewById(R.id.listview_value);
                this.j = (HealthTextView) this.m.findViewById(R.id.tv_title);
            } else if (i == 4) {
                this.g = (HealthTextView) this.m.findViewById(R.id.listview_id);
                this.h = (HealthTextView) this.m.findViewById(R.id.tv_use_time);
                this.j = (HealthTextView) this.m.findViewById(R.id.tv_title);
            } else if (i == 5) {
                this.h = (HealthTextView) this.m.findViewById(R.id.tv_use_time);
                this.j = (HealthTextView) this.m.findViewById(R.id.tv_title);
            } else {
                LogUtil.a("Track_PaceMapRecyclerViewAdapter", "initView type error");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, float f, boolean z) {
            String string;
            Resources resources = this.f11191b.getResources();
            if (this.f == 274) {
                string = z ? resources.getString(R.string.IDS_indoor_equip_paddle_last_less_than_inch, 100) : resources.getString(R.string.IDS_indoor_equip_paddle_last_less_than, 500);
            } else {
                string = z ? resources.getString(R.string.IDS_hwh_motiontrack_show_sport_pace_last_time_mi, 1) : resources.getString(R.string.IDS_hwh_motiontrack_show_sport_pace_last_time_km, 1);
            }
            String string2 = resources.getString(R.string.IDS_hwh_motiontrack_show_sport_pace_last_use_time, jpq.d(f));
            this.g.setText(UnitUtil.e(i, 1, 0));
            this.h.setText(string + " " + string2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(String str, String str2, boolean z, double d, double d2) {
            this.e.setText(str);
            this.f11190a.setText(str2);
            if (!z || d <= 0.0d) {
                return;
            }
            this.m.findViewById(R.id.hw_show_pace_half_ll).setVisibility(0);
            this.m.findViewById(R.id.hw_show_mid_guide_line).setVisibility(0);
            ((HealthTextView) this.m.findViewById(R.id.hw_show_pace_half)).setText(UnitUtil.e((int) Math.round(d)));
            if (d2 > 0.0d) {
                this.m.findViewById(R.id.hw_show_pace_marathon_ll).setVisibility(0);
                ((HealthTextView) this.m.findViewById(R.id.hw_show_pace_marathon)).setText(UnitUtil.e((int) Math.round(d2)));
                return;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) this.m.findViewById(R.id.hw_show_pace_cl);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(constraintLayout);
            constraintSet.clear(R.id.hw_show_pace_averagepace_ll);
            constraintSet.constrainWidth(R.id.hw_show_pace_averagepace_ll, -2);
            constraintSet.constrainHeight(R.id.hw_show_pace_averagepace_ll, -2);
            constraintSet.connect(R.id.hw_show_pace_averagepace_ll, 3, R.id.hw_show_pace_cl, 3);
            constraintSet.connect(R.id.hw_show_pace_averagepace_ll, 6, R.id.hw_show_guide_line, 7);
            constraintSet.connect(R.id.hw_show_pace_averagepace_ll, 7, R.id.hw_show_pace_cl, 7);
            constraintSet.clear(R.id.hw_show_pace_fastpace_ll, 6);
            constraintSet.clear(R.id.hw_show_pace_fastpace_ll, 7);
            constraintSet.connect(R.id.hw_show_pace_fastpace_ll, 6, R.id.hw_show_pace_cl, 6);
            constraintSet.connect(R.id.hw_show_pace_fastpace_ll, 7, R.id.hw_show_guide_line, 6);
            constraintSet.applyTo(constraintLayout);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Resources resources) {
            if (this.f11191b == null || this.d || this.f11192c || !this.i) {
                return;
            }
            this.j.setBackground(resources.getDrawable(R.drawable.track_show_pace_progressbackground_rtl));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, String str, String str2, float f) {
            Context context = this.f11191b;
            if (context == null) {
                LogUtil.e("Track_PaceMapRecyclerViewAdapter", "mContext is null");
                return;
            }
            Resources resources = context.getResources();
            this.h.setTextSize(2, 13.0f / resources.getConfiguration().fontScale);
            this.g.setText(str);
            this.h.setText(str2);
            b(resources, i);
            ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                LogUtil.e("Track_PaceMapRecyclerViewAdapter", "object is not instanceof RelativeLayout.LayoutParams");
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.width = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
            this.h.setLayoutParams(layoutParams2);
        }

        private void b(Resources resources, int i) {
            if (i == 1) {
                if (this.i) {
                    this.h.setBackground(resources.getDrawable(R.drawable.track_show_short_pace_progress_rtl));
                    return;
                } else {
                    this.h.setBackground(resources.getDrawable(R.drawable.track_show_short_pace_progress));
                    return;
                }
            }
            if (this.i) {
                this.h.setBackground(resources.getDrawable(R.drawable.track_show_pace_hor_progress_rtl));
            } else {
                this.h.setBackground(resources.getDrawable(R.drawable.track_show_pace_hor_progress));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(String str, String str2) {
            this.j.setText(str2);
            this.h.setText(str);
        }

        public void d(int i) {
            this.f = i;
        }
    }

    private String c(float f) {
        return izn.a(f);
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private njj f11195c;
        private String e;

        b(int i, njj njjVar) {
            this.f11195c = njjVar;
            this.f11193a = i;
        }

        b(int i, String str, String str2) {
            this.f11193a = i;
            this.e = str;
            this.f11194b = str2;
        }
    }
}
