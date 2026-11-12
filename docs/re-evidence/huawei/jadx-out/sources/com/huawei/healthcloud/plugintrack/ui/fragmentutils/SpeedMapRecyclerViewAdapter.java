package com.huawei.healthcloud.plugintrack.ui.fragmentutils;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.izn;
import defpackage.izw;
import defpackage.jpq;
import defpackage.jqp;
import defpackage.njj;
import defpackage.njy;
import defpackage.qqs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SpeedMapRecyclerViewAdapter extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<njj> f11198c;
    private float d;
    private Context e;
    private boolean f;
    private boolean g;
    private boolean h;
    private double i;
    private boolean j;
    private float k;
    private float l;
    private float m;
    private Resources n;
    private float o;
    private jqp q;
    private float r;
    private float s;

    public SpeedMapRecyclerViewAdapter(Context context, List<njj> list, String str, String str2, float f, float f2, float f3, float f4, float f5, boolean z, jqp jqpVar) {
        this.q = null;
        if (context == null || list == null) {
            throw new RuntimeException("SpeedMapRecyclerViewAdapter invalid params in constructor");
        }
        this.e = context;
        this.n = context.getResources();
        this.f11198c = list;
        this.f11196a = str;
        this.f11197b = str2;
        this.d = 3600.0f / f;
        this.s = 3600.0f / f2;
        this.m = f5;
        this.i = jpq.c(jqpVar);
        this.l = f3;
        this.k = f4;
        this.f = z;
        this.q = jqpVar;
        if (f2 != f) {
            float f6 = this.s;
            float f7 = this.d;
            this.o = (f6 / f7) - (f4 / f3);
            this.r = (f3 - f4) / (f7 - f6);
        }
        this.h = LanguageUtil.ba(this.e);
        if (qqs.e(this.e)) {
            this.j = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 0) {
            return 1;
        }
        return i == this.f11198c.size() + 2 ? 4 : 3;
    }

    private void c(HealthTextView healthTextView, int i) {
        healthTextView.setTextColor(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            return null;
        }
        int i2 = 1;
        if (1 == i) {
            return new e(this.e, d(viewGroup), i2);
        }
        int i3 = 4;
        if (4 == i) {
            e eVar = new e(this.e, b(viewGroup), i3);
            eVar.e(this.f);
            eVar.c(this.j);
            return eVar;
        }
        int i4 = 2;
        if (2 == i) {
            return new e(this.e, a(viewGroup), i4);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.track_show_pace_item, viewGroup, false);
        if (this.f || this.j) {
            c((HealthTextView) viewInflate.findViewById(R.id.listview_id), izw.f38267a);
            if (this.h) {
                viewInflate.findViewById(R.id.tv_title).setBackgroundResource(R.drawable.track_show_pace_progressbackground_rtl_device);
            } else {
                viewInflate.findViewById(R.id.tv_title).setBackgroundResource(R.drawable.track_show_pace_progressbackground_device);
            }
        }
        e eVar2 = new e(this.e, viewInflate, 3);
        eVar2.e(this.f);
        eVar2.c(this.j);
        return eVar2;
    }

    private View b(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.track_show_pace_item_foot, viewGroup, false);
        if (this.g) {
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.track_show_pace_item_foot_layout);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.setMargins(izn.b(this.e, 16.0f), 0, izn.b(this.e, 16.0f), izn.b(this.e, 4.0f));
            relativeLayout.setLayoutParams(layoutParams);
        }
        if (!this.f && !this.j) {
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
        if (UnitUtil.f()) {
            healthTextView.setText(this.e.getString(R.string.IDS_hwh_motiontrack_show_speed_mi_hour));
        } else {
            healthTextView.setText(this.e.getString(R.string.IDS_hwh_motiontrack_show_speed_km_hour));
        }
        if (this.g) {
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.track_detail_pace_mid_item_linear);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMargins(izn.b(this.e, 16.0f), 0, izn.b(this.e, 16.0f), izn.b(this.e, 10.0f));
            linearLayout.setLayoutParams(layoutParams);
        }
        if (!this.f && !this.j) {
            return viewInflate;
        }
        c((HealthTextView) viewInflate.findViewById(R.id.track_detail_pace_mid_layout_distance_unit), izw.f38267a);
        c(healthTextView, izw.f38267a);
        return viewInflate;
    }

    private View d(ViewGroup viewGroup) {
        View viewInflate;
        String string;
        if (this.g) {
            viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.track_detail_pace_top_share_item_layout, viewGroup, false);
            ((HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_averagepace_title)).setText(R.string.IDS_motiontrack_show_detail_averagespeed);
            ((HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_fastpace_title)).setText(R.string.IDS_hwh_motiontrack_fast_speed);
            ((LinearLayout) viewInflate.findViewById(R.id.hw_show_linear2)).setVisibility(4);
            if (this.q.d().requestSportType() == 260) {
                LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.hw_show_pace_averagepace_ll);
                LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.hw_show_pace_fastpace_ll);
                linearLayout.setVisibility(8);
                linearLayout2.setVisibility(8);
            }
            if (this.f || this.j) {
                c((HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_averagepace_unit), this.e.getResources().getColor(R.color.color_normal_titlebar_title));
                c((HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_fastpace_unit), this.e.getResources().getColor(R.color.color_normal_titlebar_title));
            }
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_averagepace_unit);
            HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_fastpace_unit);
            healthTextView.setVisibility(8);
            healthTextView2.setVisibility(8);
        } else {
            viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.track_detail_speed_top_item_layout, viewGroup, false);
            ((LinearLayout) viewInflate.findViewById(R.id.hw_show_linear2)).setVisibility(4);
            HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_averagepace_unit);
            HealthTextView healthTextView4 = (HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_fastpace_unit);
            if (UnitUtil.f()) {
                string = this.e.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
            } else {
                string = this.e.getString(R.string.IDS_motiontrack_show_detail_average_speed);
            }
            healthTextView3.setText(string);
            healthTextView4.setText(string);
        }
        a(viewInflate);
        return viewInflate;
    }

    private void a(View view) {
        if (this.f || this.j) {
            c((HealthTextView) view.findViewById(R.id.hw_show_pace_averagepace_title), izw.f38267a);
            c((HealthTextView) view.findViewById(R.id.hw_show_pace_averagepace), izw.f38268b);
            c((HealthTextView) view.findViewById(R.id.hw_show_pace_fastpace_title), izw.f38267a);
            c((HealthTextView) view.findViewById(R.id.hw_show_pace_fastpace), izw.f38268b);
        }
        if (this.g) {
            if (this.f || this.j) {
                c((HealthTextView) view.findViewById(R.id.hw_show_pace_averagepace), this.e.getResources().getColor(R.color.color_normal_titlebar_title));
                c((HealthTextView) view.findViewById(R.id.hw_show_pace_fastpace), this.e.getResources().getColor(R.color.color_normal_titlebar_title));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, int i) {
        if (eVar == null) {
            return;
        }
        if (eVar.h == 1) {
            eVar.b(this.f11196a, this.f11197b);
            return;
        }
        if (eVar.h == 4) {
            eVar.e(this.n);
            eVar.b(c(UnitUtil.e((this.f11198c.get(i - 3).c() / 1000) + 1, 1, 0)), this.m, this.i, izn.a(this.q) ? 5 : 1);
            return;
        }
        if (eVar.h == 2) {
            LogUtil.a("Track_SpeedMapRecyclerViewAdapter", "onBindViewHolder TYPE_MIDDLE_LAYOUT");
        } else {
            b(eVar, i);
        }
    }

    private void b(e eVar, int i) {
        float f;
        float f2;
        int i2 = i - 2;
        if (njy.e(this.f11198c, i2)) {
            LogUtil.j("Track_SpeedMapRecyclerViewAdapter", "mEntryList.size", Integer.valueOf(this.f11198c.size()), "positionTemp", Integer.valueOf(i2));
            return;
        }
        int iC = this.f11198c.get(i2).c() / 1000;
        eVar.e(this.n);
        float fD = this.f11198c.get(i2).d();
        if (Math.abs(fD) <= 1.0E-6d) {
            LogUtil.a("Track_SpeedMapRecyclerViewAdapter", "Math.abs(value) <= 1e-6");
            return;
        }
        float f3 = 3600.0f / fD;
        if (Math.abs(f3 - this.s) < 1.0E-6d) {
            if (this.o < 0.0f) {
                f2 = this.k;
            } else {
                f2 = (this.s / this.d) * this.l;
            }
            eVar.e(3, c(UnitUtil.e(iC, 1, 0)), e(f3), f2);
            return;
        }
        if (Math.abs(f3 - this.d) < 1.0E-6d) {
            eVar.e(1, c(UnitUtil.e(iC, 1, 0)), e(f3), this.l);
            return;
        }
        if (this.o < 0.0f) {
            f = (this.r * (f3 - this.s)) + this.k;
        } else {
            f = (f3 / this.d) * this.l;
        }
        eVar.e(3, c(UnitUtil.e(iC, 1, 0)), e(f3), f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f11198c.size() + 2 + (this.m == 0.0f ? 0 : 1);
    }

    public void d(boolean z) {
        this.g = z;
    }

    static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f11199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f11200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f11201c;
        private boolean d;
        private boolean e;
        private HealthTextView f;
        private HealthTextView g;
        private int h;
        private HealthTextView i;
        private boolean j;
        private View k;

        private e(Context context, View view, int i) {
            super(view);
            this.h = i;
            this.k = view;
            this.f11200b = context;
            this.j = LanguageUtil.ba(context);
            d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(boolean z) {
            this.e = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(boolean z) {
            this.d = z;
        }

        private void d() {
            int i = this.h;
            if (i == 1) {
                this.f11201c = (HealthTextView) this.k.findViewById(R.id.hw_show_pace_fastpace);
                this.f11199a = (HealthTextView) this.k.findViewById(R.id.hw_show_pace_averagepace);
                return;
            }
            if (i == 2) {
                HealthTextView healthTextView = (HealthTextView) this.k.findViewById(R.id.track_detail_pace_mid_layout_distance_unit);
                if (UnitUtil.f()) {
                    healthTextView.setText(this.f11200b.getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_pace_mi));
                    return;
                }
                return;
            }
            if (i == 3) {
                this.g = (HealthTextView) this.k.findViewById(R.id.listview_id);
                this.i = (HealthTextView) this.k.findViewById(R.id.listview_value);
                this.f = (HealthTextView) this.k.findViewById(R.id.tv_title);
            } else {
                if (i == 4) {
                    this.g = (HealthTextView) this.k.findViewById(R.id.listview_id);
                    this.i = (HealthTextView) this.k.findViewById(R.id.tv_use_time);
                    this.f = (HealthTextView) this.k.findViewById(R.id.tv_title);
                    return;
                }
                LogUtil.a("Track_SpeedMapRecyclerViewAdapter", "initView type error");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, float f, double d, int i) {
            String string;
            Resources resources = this.f11200b.getResources();
            if (UnitUtil.f()) {
                string = resources.getString(R.string.IDS_hwh_motiontrack_show_sport_pace_last_time_mi, Integer.valueOf(i));
            } else {
                string = resources.getString(R.string.IDS_hwh_motiontrack_show_sport_pace_last_time_km, Integer.valueOf(i));
            }
            String strE = UnitUtil.e((d * 3600.0d) / ((double) f), 1, 2);
            this.g.setText(str);
            this.i.setText(string + " " + strE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, String str2) {
            this.f11201c.setText(str);
            this.f11199a.setText(str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Resources resources) {
            if (this.f11200b == null || this.e || this.d || !this.j) {
                return;
            }
            this.f.setBackground(resources.getDrawable(R.drawable.track_show_pace_progressbackground_rtl));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(int i, String str, String str2, float f) {
            Context context = this.f11200b;
            if (context == null) {
                LogUtil.e("Track_SpeedMapRecyclerViewAdapter", "mContext is null");
                return;
            }
            Resources resources = context.getResources();
            this.i.setTextSize(2, 13.0f / resources.getConfiguration().fontScale);
            this.g.setText(str);
            this.i.setText(str2);
            e(resources, i);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
            layoutParams.width = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
            this.i.setLayoutParams(layoutParams);
        }

        private void e(Resources resources, int i) {
            if (i == 1) {
                if (this.j) {
                    this.i.setBackground(resources.getDrawable(R.drawable.track_show_short_pace_progress_rtl));
                    return;
                } else {
                    this.i.setBackground(resources.getDrawable(R.drawable.track_show_short_pace_progress));
                    return;
                }
            }
            if (this.j) {
                this.i.setBackground(resources.getDrawable(R.drawable.track_show_pace_hor_progress_rtl));
            } else {
                this.i.setBackground(resources.getDrawable(R.drawable.track_show_pace_hor_progress));
            }
        }
    }

    private String e(float f) {
        return UnitUtil.e(f, 1, 2);
    }

    private String c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_SpeedMapRecyclerViewAdapter", "dealBikeTrackSpeedListId speedId is empty.");
            return str;
        }
        if (!izn.a(this.q)) {
            return str;
        }
        int iJ = (CommonUtil.j(str) * 5) - 4;
        int iJ2 = CommonUtil.j(str) * 5;
        if (this.h) {
            return UnitUtil.e(iJ, 1, 0) + Constants.LINK + UnitUtil.e(iJ2, 1, 0);
        }
        return iJ + Constants.LINK + iJ2;
    }
}
