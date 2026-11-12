package com.huawei.pluginachievement.ui.kakatask;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.out;
import defpackage.ozs;
import defpackage.ozu;
import defpackage.pap;
import defpackage.qqs;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveKaKaTaskContentHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AchieveKaKaTaskClickListener f22213a;
    private String aa;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f22214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f22215c;
    private RelativeLayout d;
    private boolean e;
    private ImageView f;
    private int g;
    private HealthTextView h;
    private ImageView i;
    private int j;
    private String k;
    private String l;
    private int m;
    private Typeface n;
    private int o;
    private ImageView p;
    private LinearLayout q;
    private LinearLayout r;
    private View s;
    private ImageView t;
    private HealthButton u;
    private HealthTextView v;
    private HealthTextView w;
    private HealthButton x;
    private ImageView y;

    AchieveKaKaTaskContentHolder(View view, AchieveKaKaTaskClickListener achieveKaKaTaskClickListener) {
        super(view);
        this.l = "1";
        this.aa = "";
        this.k = "0";
        this.o = 0;
        this.q = (LinearLayout) out.b(view, R.id.achieve_task_kaka_content_task_ll);
        this.v = (HealthTextView) out.b(view, R.id.achieve_task_kaka_content_task_text);
        this.y = (ImageView) out.b(view, R.id.achieve_task_kaka_content_task_tips_icon);
        this.h = (HealthTextView) out.b(view, R.id.kaka_task_finish_tips);
        this.d = (RelativeLayout) out.b(view, R.id.content_layout);
        this.p = (ImageView) out.b(view, R.id.achieve_task_kaka_content_buy_tips_icon);
        this.r = (LinearLayout) out.b(view, R.id.achieve_task_kaka_content_task_kaka_desc);
        this.w = (HealthTextView) out.b(view, R.id.achieve_task_kaka_content_task_kaka_value);
        this.t = (ImageView) out.b(view, R.id.achieve_task_kaka_content_finished_iv);
        this.s = out.b(view, R.id.achieve_task_kaka_content_line);
        this.f = (ImageView) out.b(view, R.id.kaka_task_arrow);
        this.i = (ImageView) out.b(view, R.id.kaka_new_task_arrow);
        this.f22215c = (LinearLayout) out.b(view, R.id.back_kaka_mid_layout);
        this.f22214b = (LinearLayout) out.b(view, R.id.arrow_layout);
        HealthButton healthButton = (HealthButton) out.b(view, R.id.achieve_task_kaka_content_tag_button);
        this.u = healthButton;
        healthButton.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_kaka_complete));
        this.u.setOnClickListener(this);
        HealthButton healthButton2 = (HealthButton) out.b(view, R.id.achieve_task_kaka_content_tag_emphasize_button);
        this.x = healthButton2;
        healthButton2.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_kaka_pick));
        this.t.setImageResource(qqs.e(BaseApplication.getContext()) ? R.drawable.achieve_kk_task_picked_night : R.drawable.achieve_kk_task_picked);
        this.x.setOnClickListener(this);
        this.f22214b.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.f22213a = achieveKaKaTaskClickListener;
    }

    private void e(ozu ozuVar) {
        this.aa = ozuVar.c();
        String strB = ozuVar.b();
        this.k = ozuVar.j();
        if (TextUtils.isEmpty(strB)) {
            this.y.setVisibility(8);
        } else {
            this.y.setVisibility(0);
            this.y.setOnClickListener(this);
        }
        if (pap.e(ozuVar.k())) {
            this.l = "0";
        }
        if (a(ozuVar)) {
            this.p.setVisibility(0);
        } else {
            this.p.setVisibility(8);
        }
        this.q.setVisibility(0);
        this.v.setVisibility(0);
        this.s.setVisibility(0);
        this.v.setText(ozuVar.d());
        this.u.setText(ozuVar.g());
        this.x.setText(ozuVar.h());
        this.w.setVisibility(0);
        int iE = ozuVar.e();
        b(this.w);
        String strE = UnitUtil.e(iE, 1, 0);
        this.w.setText(Marker.ANY_NON_NULL_MARKER + strE);
        if ("0".equals(this.k)) {
            this.t.setVisibility(8);
            if (ozuVar.k() != 10001) {
                this.u.setVisibility(0);
                this.x.setVisibility(8);
                return;
            }
            return;
        }
        if ("1".equals(this.k)) {
            this.t.setVisibility(8);
            this.x.setVisibility(0);
            this.u.setVisibility(8);
        } else {
            LogUtil.d("AchieveKaKaTaskContentHolder", "status:", this.k);
            this.t.setVisibility(0);
            this.u.setVisibility(8);
            this.x.setVisibility(8);
        }
    }

    private void b(HealthTextView healthTextView) {
        if (this.n == null) {
            this.n = qrr.c();
        }
        healthTextView.setTypeface(this.n);
    }

    private boolean a(ozu ozuVar) {
        int iK = ozuVar.k();
        return iK == 20009 || iK == 30016 || iK == 30017 || ozuVar.o() == 1;
    }

    public void c(ozs ozsVar, int i, int i2, int i3, boolean z) {
        if (ozsVar == null) {
            return;
        }
        this.e = z;
        this.j = qqs.e(BaseApplication.getContext()) ? R.mipmap.kaka_task_open_night : R.mipmap.kaka_task_open;
        this.g = qqs.e(BaseApplication.getContext()) ? R.mipmap.kaka_task_close_night : R.mipmap.kaka_task_close;
        ozu ozuVarE = ozsVar.e();
        if (ozuVarE != null) {
            this.o = i;
            e(ozuVarE);
            d(ozuVarE.k(), ozsVar.b(), i2, i3);
        } else {
            this.q.setVisibility(8);
            this.t.setVisibility(8);
            this.u.setVisibility(8);
            this.x.setVisibility(8);
            this.s.setVisibility(8);
        }
        if (ozsVar.f()) {
            this.f22215c.setBackgroundResource(R.drawable.kaka_white_background_up);
        }
        if (ozsVar.b()) {
            this.f22215c.setBackgroundResource(R.drawable.kaka_white_background_bottom);
        }
        if (ozsVar.f() && ozsVar.b()) {
            this.f22215c.setBackgroundResource(R.drawable.kaka_task_middle_background);
            d(ozuVarE);
        }
        if (pap.j(this.aa)) {
            this.r.setVisibility(8);
            this.u.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_kaka_see));
        }
    }

    private void d(ozu ozuVar) {
        if (ozuVar != null && pap.e(ozuVar.k()) && this.m == 1) {
            this.f22214b.setVisibility(8);
        }
    }

    private void d(int i, boolean z, int i2, int i3) {
        if (z) {
            if (pap.e(i)) {
                this.i.setVisibility(0);
                if (i2 == 1) {
                    this.i.setImageResource(this.j);
                    this.i.setTag(Integer.valueOf(this.j));
                    return;
                } else {
                    this.i.setImageResource(this.g);
                    this.i.setTag(Integer.valueOf(this.g));
                    return;
                }
            }
            this.f.setVisibility(0);
            if (i3 == 1) {
                this.f.setImageResource(this.j);
                this.f.setTag(Integer.valueOf(this.j));
                if (this.e) {
                    this.h.setVisibility(8);
                    this.d.setVisibility(0);
                    return;
                }
                return;
            }
            this.f.setImageResource(this.g);
            this.f.setTag(Integer.valueOf(this.g));
            if (this.e) {
                this.h.setVisibility(0);
                this.d.setVisibility(8);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        HealthButton healthButton = this.u;
        if (view == healthButton || view == this.x) {
            e(this.k, this.aa, this.o);
            return;
        }
        if (view == this.y) {
            e("3", this.aa, this.o);
        } else if (view == this.f22214b || view == this.f || view == this.i) {
            d();
        } else {
            LogUtil.d("AchieveKaKaTaskContentHolder", "status:", healthButton);
        }
    }

    private void d() {
        if ("0".equals(this.l)) {
            c(this.i);
        } else {
            c(this.f);
        }
    }

    private void c(ImageView imageView) {
        if (imageView.getTag() instanceof Integer) {
            if (((Integer) imageView.getTag()).intValue() == this.g) {
                this.f22213a.onTaskClick("4", this.l, 1);
            } else {
                this.f22213a.onTaskClick("4", this.l, 0);
            }
        }
    }

    private void e(String str, String str2, int i) {
        if (qrs.c(1000)) {
            LogUtil.j("AchieveKaKaTaskContentHolder", "button click too fast");
        } else {
            this.f22213a.onTaskClick(str, str2, i);
        }
    }

    public void a(int i) {
        this.m = i;
    }
}
