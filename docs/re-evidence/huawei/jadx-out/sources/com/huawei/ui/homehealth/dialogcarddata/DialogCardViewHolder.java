package com.huawei.ui.homehealth.dialogcarddata;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import defpackage.qrs;

/* JADX INFO: loaded from: classes17.dex */
public class DialogCardViewHolder extends CardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25415a;
    private RelativeLayout aa;
    private LinearLayout ab;
    private LinearLayout ac;
    private HealthTextView ad;
    private HealthTextView ae;
    private RelativeLayout af;
    private HealthTextView ag;
    private HealthTextView ah;
    private HealthTextView ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f25416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthColumnSystem f25417c;
    private HealthTextView d;
    private RelativeLayout e;
    private RelativeLayout f;
    private HealthTextView g;
    private HealthTextView h;
    private RelativeLayout i;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private RelativeLayout o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;
    private RelativeLayout u;
    private HealthTextView v;
    private RelativeLayout w;
    private HealthTextView x;
    private HealthTextView y;
    private HealthTextView z;

    public DialogCardViewHolder(View view, Context context, boolean z) {
        super(view, context, z);
        this.f25415a = 0;
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(getContext(), 1);
        this.f25417c = healthColumnSystem;
        this.f25415a = healthColumnSystem.j();
        e(view);
        d(view, context);
    }

    private void e(View view) {
        if (this.itemView instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            if (ai()) {
                viewGroup.addView(View.inflate(view.getContext(), R.layout.layout_dialog_card_container_cd, null));
            } else if (qrs.v()) {
                viewGroup.addView(View.inflate(view.getContext(), R.layout.layout_dialog_card_container_large_font_scale, null));
            } else {
                viewGroup.addView(View.inflate(view.getContext(), R.layout.layout_dialog_card_container, null));
            }
        }
    }

    public boolean ah() {
        this.f25417c.b(getContext());
        if (this.f25415a == this.f25417c.j()) {
            return false;
        }
        this.f25415a = this.f25417c.j();
        if (this.itemView == null) {
            return false;
        }
        e(this.itemView);
        d(this.itemView, this.itemView.getContext());
        return true;
    }

    private void d(View view, Context context) {
        this.ab = (LinearLayout) view.findViewById(R.id.home_item_step_card_layout);
        this.i = (RelativeLayout) view.findViewById(R.id.hw_health_home_dameon_killed_layout);
        this.u = (RelativeLayout) view.findViewById(R.id.rl_oppo_vivo_help);
        this.f25416b = (HealthTextView) this.i.findViewById(R.id.img_show_tips_close);
        this.v = (HealthTextView) this.i.findViewById(R.id.img_show_tips_go);
        this.r = (HealthTextView) this.i.findViewById(R.id.img_hw_show_tips_close);
        this.t = (HealthTextView) this.i.findViewById(R.id.hw_show_tips_go_setting);
        this.aa = (RelativeLayout) this.i.findViewById(R.id.show_tips_btn_layout);
        this.l = (HealthTextView) this.u.findViewById(R.id.tv_go_to);
        this.p = (HealthTextView) this.u.findViewById(R.id.tv_ignore);
        this.w = (RelativeLayout) view.findViewById(R.id.rl_nps);
        this.ag = (HealthTextView) view.findViewById(R.id.tv_title);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.tv_content);
        this.h = healthTextView;
        healthTextView.setText(getContext().getString(R.string.IDS_hw_todocard_nps_dialog_content));
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.tv_join);
        this.y = healthTextView2;
        healthTextView2.setText(getContext().getString(R.string.IDS_hw_todocard_nps_dialog_ok));
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.tv_not_join);
        this.x = healthTextView3;
        healthTextView3.setText(getContext().getString(R.string.IDS_hw_todocard_nps_dialog_cancel));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.sync_cloud_data_fail_layout);
        this.ac = linearLayout;
        this.z = (HealthTextView) linearLayout.findViewById(R.id.sync_ignore_tv);
        HealthTextView healthTextView4 = (HealthTextView) this.ac.findViewById(R.id.sync_try_again_tv);
        this.ad = healthTextView4;
        healthTextView4.setText(getContext().getString(R.string.IDS_hw_show_set_about_privacy_retry));
        this.af = (RelativeLayout) view.findViewById(R.id.layout_wechat_bind);
        this.ah = (HealthTextView) view.findViewById(R.id.tv_wechat_join);
        this.ae = (HealthTextView) view.findViewById(R.id.tv_wechat_ignore);
        this.o = (RelativeLayout) view.findViewById(R.id.layout_hi_ai_plugin);
        this.k = (HealthTextView) view.findViewById(R.id.tv_hi_ai_title);
        this.n = (HealthTextView) view.findViewById(R.id.tv_cancel);
        this.ai = (HealthTextView) view.findViewById(R.id.tv_download);
        this.f = (RelativeLayout) view.findViewById(R.id.layout_ecg_diagram);
        this.m = (HealthTextView) view.findViewById(R.id.ecg_data_view_btn);
        this.j = (HealthTextView) view.findViewById(R.id.ecg_data_ignore_btn);
        this.s = (HealthTextView) view.findViewById(R.id.notice_message11);
        this.q = (HealthTextView) view.findViewById(R.id.notice_title);
        this.e = (RelativeLayout) view.findViewById(R.id.hw_health_companion_layout);
        this.g = (HealthTextView) view.findViewById(R.id.tv_companion_reconnect);
        this.d = (HealthTextView) view.findViewById(R.id.tv_companion_ignore);
    }

    private boolean ai() {
        return this.f25415a >= 8;
    }

    public LinearLayout o() {
        return this.ab;
    }

    public LinearLayout x() {
        return this.ac;
    }

    public HealthTextView v() {
        return this.z;
    }

    public HealthTextView u() {
        return this.ad;
    }

    public HealthTextView m() {
        return this.s;
    }

    public HealthTextView l() {
        return this.q;
    }

    public HealthTextView e() {
        return this.f25416b;
    }

    public HealthTextView k() {
        return this.r;
    }

    public HealthTextView n() {
        return this.t;
    }

    public HealthTextView p() {
        return this.v;
    }

    public RelativeLayout w() {
        return this.aa;
    }

    public HealthTextView j() {
        return this.l;
    }

    public HealthTextView t() {
        return this.p;
    }

    public RelativeLayout a() {
        return this.i;
    }

    public RelativeLayout y() {
        return this.u;
    }

    public View q() {
        return this.w;
    }

    public HealthTextView ad() {
        return this.ag;
    }

    public HealthTextView r() {
        return this.y;
    }

    public HealthTextView s() {
        return this.x;
    }

    public RelativeLayout ae() {
        return this.af;
    }

    public RelativeLayout b() {
        return this.e;
    }

    public HealthTextView c() {
        return this.d;
    }

    public HealthTextView d() {
        return this.g;
    }

    public HealthTextView ag() {
        return this.ah;
    }

    public HealthTextView ac() {
        return this.ae;
    }

    public RelativeLayout aa() {
        return this.o;
    }

    public HealthTextView z() {
        return this.n;
    }

    public HealthTextView ab() {
        return this.ai;
    }

    public HealthTextView f() {
        return this.k;
    }

    public RelativeLayout g() {
        return this.f;
    }

    public HealthTextView i() {
        return this.m;
    }

    public HealthTextView h() {
        return this.j;
    }
}
