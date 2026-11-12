package com.huawei.ui.homehealth.threecirclecard;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.view.Clover;
import com.huawei.ui.commonui.view.clover.LeafClover;
import com.huawei.ui.homehealth.R;
import defpackage.fft;
import defpackage.ffv;
import defpackage.fru;
import defpackage.lrd;
import defpackage.lua;
import defpackage.qji;
import defpackage.qqs;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.qtg;
import defpackage.tbf;
import defpackage.tdp;
import defpackage.tdr;
import defpackage.tdy;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ThreeLeafCardViewHolder extends CardViewBaseHolder {
    private ImageView at;
    private Clover av;
    private int aw;
    private boolean ay;
    private LeafClover az;
    private LinearLayout ba;
    private HealthTextView bb;
    private int bc;
    private HealthTextView bd;
    private HealthTextView be;
    private tdp bf;
    private boolean bg;
    private boolean bh;
    private FrameLayout bi;
    private HealthTextView bj;
    private HealthTextView bk;
    private LinearLayout bm;

    public ThreeLeafCardViewHolder(View view, Context context, boolean z) {
        super(view, context, z);
        this.aw = 4;
        this.bc = 1;
        this.bf = new tdp(this.e, this.f26109a, this.k, this.n, this.ay);
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.CardViewBaseHolder
    protected String b() {
        return "ThreeLeafCardViewHolder";
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.CardViewBaseHolder
    protected void j() {
        super.j();
        this.r.setBackgroundResource(R.drawable.ic_health_sleep_point);
        this.q.setText(getContext().getString(R.string.IDS_hw_show_main_home_page_sleep));
        this.bb = (HealthTextView) this.s.findViewById(R.id.value_des);
        this.ai.setBackgroundResource(R.drawable.ic_health_point_sport);
        this.ba = (LinearLayout) this.ag.findViewById(R.id.data_origin_icon_layout);
        this.at = (ImageView) this.ag.findViewById(R.id.data_origin_icon);
        this.an.setBackgroundResource(R.drawable.ic_health_point_emotion);
        this.ak.setText(getContext().getString(R.string.IDS_mood));
        this.be = (HealthTextView) this.am.findViewById(R.id.value_des);
        this.bd = (HealthTextView) this.am.findViewById(R.id.value_array);
        this.ad.setVisibility(8);
        this.u.setVisibility(8);
        a(this.bb);
        a(this.bd);
        s();
        l();
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.CardViewBaseHolder
    protected void f() {
        View viewFindViewById;
        super.f();
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.three_leaf_layout);
        if (viewStub.getParent() != null) {
            viewFindViewById = viewStub.inflate();
        } else {
            viewFindViewById = this.itemView.findViewById(R.id.three_leaf_layout_inflated);
        }
        if (viewFindViewById instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewFindViewById;
            this.bi = frameLayout;
            frameLayout.setVisibility(0);
            this.av = (Clover) this.bi.findViewById(R.id.view_task_status_clover);
            this.az = (LeafClover) this.bi.findViewById(R.id.health_life_clover);
        }
    }

    private void s() {
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.three_leaf_default_layout);
        if (viewStub.getParent() != null) {
            this.bm = (LinearLayout) viewStub.inflate();
        } else {
            this.bm = (LinearLayout) this.itemView.findViewById(R.id.three_leaf_default_layout_inflated);
        }
        this.bm.setVisibility(8);
        this.bj = (HealthTextView) this.bm.findViewById(R.id.default_health_model_title);
        this.bk = (HealthTextView) this.bm.findViewById(R.id.default_health_model_des);
    }

    public void b(int i, String str, int i2) {
        LogUtil.a(b(), "bindSleepLayout time: ", str);
        this.r.setBackgroundResource(R.drawable.ic_health_sleep_point);
        this.q.setText(qre.f(i));
        this.m.setText(str);
        this.p.setText(qre.f(i2));
        this.m.setVisibility(0);
        this.p.setVisibility(0);
        this.bb.setVisibility(8);
        t();
        lrd.b(this.s, qre.a(R.string.IDS_settings_alarm_comma, str, qre.f(i2)));
    }

    public void c(int i, int i2, boolean z) {
        Drawable drawableC;
        LogUtil.a(b(), "bindSleepArrayLayout isShowIcon: ", Boolean.valueOf(z));
        this.r.setBackgroundResource(R.drawable.ic_health_sleep_point);
        this.q.setText(qre.f(i));
        this.m.setVisibility(8);
        this.p.setVisibility(8);
        this.bb.setText(qre.f(i2));
        this.bb.setVisibility(0);
        lrd.b(this.s, qre.f(i2));
        if (z) {
            if (qqs.e(getContext())) {
                if (LanguageUtil.ba(getContext())) {
                    drawableC = qqz.e(getContext(), R.drawable.ic_right_grey_update_dark);
                } else {
                    drawableC = qre.c(R.drawable.ic_right_grey_update_dark);
                }
            } else if (LanguageUtil.ba(getContext())) {
                drawableC = qqz.e(getContext(), R.drawable.ic_right_grey_update);
            } else {
                drawableC = qre.c(R.drawable.ic_right_grey_update);
            }
            drawableC.setBounds(0, 0, qre.b(R.dimen.health_common_8dp), qre.b(R.dimen.health_common_16dp));
            this.bb.setCompoundDrawablesRelative(null, null, drawableC, null);
        }
    }

    public void d(int i, int i2, int i3) {
        LogUtil.a(b(), "bindSportLayout value: ", Integer.valueOf(i2));
        this.ai.setBackgroundResource(R.drawable.ic_health_point_sport);
        this.ae.setText(qre.f(i));
        String strE = UnitUtil.e(i2, 1, 0);
        this.ah.setText(strE);
        lrd.b(this.ag, qre.e(i3, i2, strE.replaceAll(",", "")));
        String strE2 = qre.e(i3, i2, "");
        this.al.setText(strE2.startsWith(" ") ? strE2.substring(1) : strE2);
        LogUtil.a(b(), "bindThreeCircleSportLayout value: ", Integer.valueOf(i2), strE2);
    }

    public void e(int i) {
        LogUtil.a(b(), "bindThreeCircleEmotionLayout");
        this.an.setBackgroundResource(R.drawable.ic_health_point_emotion);
        this.ak.setText(qre.f(i));
    }

    public void c(int i, int i2, String str, int i3) {
        LogUtil.a(b(), "bindEmotionLayoutPressure pressureValue: ", Integer.valueOf(i2), " pressureDes:", str);
        this.an.setBackgroundResource(R.drawable.ic_health_point_emotion);
        this.ak.setText(qre.f(i));
        c(i2, str, i3);
        t();
        lrd.b(this.am, qre.a(R.string.accessibility_status_theme_description_join, this.ak.getText(), this.aj.getText(), this.ao.getText()));
    }

    private void c(int i, String str, int i2) {
        LogUtil.a(b(), "updateEmotionLayoutPressureValue pressureValue: ", Integer.valueOf(i), " pressureDes:", str);
        String strF = qre.f(R.string.IDS_settings_one_level_menu_settings_item_text_id14);
        String strE = UnitUtil.e(i, 1, 0);
        SpannableString spannableString = new SpannableString(str);
        qri.a(spannableString, str, new ForegroundColorSpan(i2));
        this.bd.setText(strF);
        this.aj.setText(strE);
        this.ao.setText(spannableString);
        this.bd.setCompoundDrawablesRelative(null, null, null, null);
        this.bd.setVisibility(0);
        this.aj.setVisibility(0);
        this.ao.setVisibility(0);
        this.be.setVisibility(8);
    }

    public void a(int i, String str) {
        LogUtil.a(b(), "bindEmotionLayoutBreathTrainCount breathValue: ", Integer.valueOf(i), " breathDes:", str);
        this.an.setBackgroundResource(R.drawable.ic_health_point_emotion);
        String strE = UnitUtil.e(i, 1, 0);
        this.aj.setText(strE);
        this.ao.setText(str);
        this.aj.setVisibility(0);
        this.ao.setVisibility(0);
        this.bd.setVisibility(8);
        this.be.setVisibility(8);
        t();
        lrd.b(this.am, qre.e(R.plurals.IDS_breath_task_count, i, strE));
    }

    public void a(int i) {
        Drawable drawableC;
        LogUtil.a(b(), "bindEmotionLayoutBreathArray");
        this.an.setBackgroundResource(R.drawable.ic_health_point_emotion);
        if (qqs.e(getContext())) {
            if (LanguageUtil.ba(getContext())) {
                drawableC = qqz.e(getContext(), R.drawable.ic_right_grey_update_dark);
            } else {
                drawableC = qre.c(R.drawable.ic_right_grey_update_dark);
            }
        } else if (LanguageUtil.ba(getContext())) {
            drawableC = qqz.e(getContext(), R.drawable.ic_right_grey_update);
        } else {
            drawableC = qre.c(R.drawable.ic_right_grey_update);
        }
        this.aj.setVisibility(8);
        this.ao.setVisibility(8);
        this.be.setVisibility(8);
        this.bd.setVisibility(0);
        this.bd.setText(qre.f(i));
        lrd.b(this.am, qre.f(i));
        drawableC.setBounds(0, 0, qre.b(R.dimen.health_common_8dp), qre.b(R.dimen.health_common_16dp));
        this.bd.setCompoundDrawablesRelative(null, null, drawableC, null);
    }

    public void b(boolean z) {
        LogUtil.a(b(), "bindHealthModelDefaultContent");
        this.f26111c.setVisibility(8);
        this.bm.setVisibility(0);
        if (z) {
            this.bj.setTextSize(2, 14.0f);
            this.bj.setTypeface(qrr.g());
            this.bj.setTextColor(qre.e(R.color.textColorSecondary));
            this.bk.setTextSize(2, 16.0f);
            this.bk.setTypeface(qrr.e());
            this.bk.setTextColor(qre.e(R.color.common_colorAccent));
            this.bj.setText(R.string.IDS_open_health_life_tip);
            this.bk.setText(LoginInit.getInstance(getContext()).isBrowseMode() ? R.string.IDS_login_to_health_life : R.string.IDS_open_health_life);
            return;
        }
        this.bj.setTextSize(2, 16.0f);
        this.bj.setTypeface(qrr.e());
        this.bj.setTextColor(qre.e(R.color.textColorPrimary));
        this.bk.setTextSize(2, 14.0f);
        this.bk.setTypeface(qrr.g());
        String strF = qre.f(R.string.IDS_hw_health_open_health_clover);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_introduce_health_model, strF));
        qri.b(spannableString, strF, R.color.common_colorAccent);
        this.bk.setText(spannableString);
    }

    public void b(int i, boolean z) {
        if (i == 0) {
            this.f26111c.setVisibility(0);
            this.n.setVisibility(0);
            this.bm.setVisibility(8);
        } else {
            this.f26111c.setVisibility(8);
            this.n.setVisibility(8);
            this.bm.setVisibility(0);
            b(z);
            lua.a(fft.f34005c, "perfect_three_leaf", 0L);
        }
    }

    private void a(HealthTextView healthTextView) {
        if (qrs.v()) {
            healthTextView.setTextSize(1, 21.0f);
        } else {
            healthTextView.setTextSize(2, 12.0f);
        }
    }

    public Clover n() {
        return this.av;
    }

    public LinearLayout m() {
        return this.bm;
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.CardViewBaseHolder
    public LinearLayout a() {
        return this.ba;
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.CardViewBaseHolder
    public ImageView c() {
        return this.at;
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.CardViewBaseHolder
    public void d(int i) {
        if (tdy.b()) {
            this.at.setVisibility(8);
        } else {
            this.at.setVisibility(i);
        }
    }

    public void l() {
        this.g.setText(getContext().getString(R.string.IDS_three_leaf_todo_title));
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ic_health_three_leef_task);
        if (LanguageUtil.ba(getContext())) {
            BitmapDrawable bitmapDrawableE = qqz.e(getContext(), drawable);
            this.d.setBackground(bitmapDrawableE);
            this.k.e(bitmapDrawableE);
        } else {
            this.d.setBackground(drawable);
            this.k.e(drawable);
        }
        c(qji.b(new View.OnClickListener() { // from class: tcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48972b.a(view);
            }
        }, (BaseActivity) getContext(), true, ""));
        this.k.c((CharSequence) getContext().getString(R.string.IDS_three_leaf_todo_title));
        this.k.d(R.dimen.textSizeBody3);
    }

    public /* synthetic */ void a(View view) {
        ffv.a(getContext(), Uri.parse("").buildUpon().appendQueryParameter("from", "cloverLife").build());
    }

    public void r() {
        LogUtil.a(b(), "resetBottomLayout");
        this.k.a("");
        this.e.setVisibility(0);
        this.f26109a.setVisibility(8);
        l();
        this.j.setText("");
    }

    public void a(int i, int i2) {
        LogUtil.a(b(), "updateBottomData curValue=", Integer.valueOf(i), "  goal=", Integer.valueOf(i2));
        String strE = UnitUtil.e(i2, 1, 0);
        String strE2 = UnitUtil.e(i, 1, 0);
        SpannableString spannableStringE = tdy.e(qre.a(R.string.IDS_three_leaf_todo_pro, strE2, strE), strE2);
        this.k.a(spannableStringE);
        tdp tdpVar = this.bf;
        if (tdpVar != null && !tdpVar.b()) {
            LogUtil.j(b(), "has showing message animate");
            return;
        }
        tdp tdpVar2 = this.bf;
        LinearLayout linearLayoutA = tdpVar2 == null ? this.e : tdpVar2.a();
        HealthTextView healthTextView = (HealthTextView) linearLayoutA.findViewById(R.id.bottom_step_value);
        if (healthTextView == null) {
            LogUtil.j(b(), "updateBottomData bottomValue is null, return");
            return;
        }
        healthTextView.setText(spannableStringE);
        healthTextView.setVisibility(0);
        lrd.b(healthTextView, spannableStringE);
        boolean zB = b(linearLayoutA);
        this.ay = zB;
        tdp tdpVar3 = this.bf;
        if (tdpVar3 != null) {
            tdpVar3.c(zB);
        }
    }

    public void c(List<tdr> list) {
        if (this.bg) {
            LogUtil.j(b(), "setMessageList page is destroyed");
        } else {
            this.bf.c(list, this.bh && "threeLeafCard".equals(tbf.e()));
        }
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.CardViewBaseHolder
    public void c(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
        this.k.e(onClickListener);
        if (this.j == null) {
            ReleaseLogUtil.d(b(), "setBottomClickListener mBottomValue is null");
        } else {
            this.j.setOnClickListener(onClickListener);
        }
    }

    public void e(boolean z) {
        this.bh = z;
        if (!"threeLeafCard".equals(tbf.e())) {
            LogUtil.j(b(), "updateLeafCardShowStatus  Three leaf card not show");
        } else {
            if (this.bg) {
                return;
            }
            if (z) {
                this.bf.d();
            } else {
                this.bf.e();
            }
        }
    }

    public void d(boolean z) {
        if (z) {
            this.bf.d();
        } else {
            this.bf.e();
        }
    }

    public void q() {
        this.bg = true;
        this.bf.c();
    }

    private void t() {
        LogUtil.a(b(), "wrapLineForThreeLeaf");
        a(this.t, this.p, false);
        a(this.af, this.al, false);
        a(this.ap, this.ao, false);
        a(this.w, this.aa, false);
    }

    public void e(fru fruVar) {
        if (fruVar == null) {
            LogUtil.j(b(), "updateFirstItem modelCardBean is null");
            return;
        }
        this.r.setBackgroundResource(fruVar.c());
        this.q.setText(fruVar.a());
        this.m.setText(fruVar.h());
        this.p.setText(fruVar.e());
        this.s.setOnClickListener(fruVar.b());
        this.m.setVisibility(0);
        this.p.setVisibility(0);
        this.bb.setVisibility(8);
        lrd.b(this.s, qre.a(R.string.accessibility_status_theme_description_join, this.q.getText(), this.m.getText(), this.p.getText()));
    }

    public void c(fru fruVar) {
        if (fruVar == null) {
            LogUtil.j(b(), "updateSecondItem modelCardBean is null");
            return;
        }
        this.ai.setBackgroundResource(fruVar.c());
        this.ae.setText(fruVar.a());
        this.ah.setText(fruVar.h());
        this.al.setText(fruVar.e());
        this.ag.setOnClickListener(fruVar.b());
        lrd.b(this.ag, qre.a(R.string.accessibility_status_theme_description_join, this.ae.getText(), this.ah.getText(), this.al.getText()));
    }

    public void b(fru fruVar) {
        if (fruVar == null) {
            LogUtil.j(b(), "updateThirdItem modelCardBean is null");
            return;
        }
        this.an.setBackgroundResource(fruVar.c());
        this.ak.setText(fruVar.a());
        this.aj.setText(fruVar.h());
        this.ao.setText(fruVar.e());
        this.am.setOnClickListener(fruVar.b());
        this.aj.setVisibility(0);
        this.ao.setVisibility(0);
        this.bd.setVisibility(8);
        if (TextUtils.isEmpty(fruVar.d())) {
            this.be.setVisibility(8);
        } else {
            this.be.setVisibility(0);
            this.be.setText(fruVar.d());
        }
        lrd.b(this.am, qre.a(R.string.accessibility_status_theme_description_join, this.ak.getText(), this.aj.getText(), this.ao.getText()));
    }

    public void d(fru fruVar) {
        if (fruVar == null) {
            LogUtil.j(b(), "updateFourthItem modelCardBean is null");
            return;
        }
        this.v.setBackgroundResource(fruVar.c());
        this.y.setText(fruVar.a());
        this.x.setText(fruVar.h());
        this.aa.setText(fruVar.e());
        this.u.setOnClickListener(fruVar.b());
        lrd.b(this.u, qre.a(R.string.accessibility_status_theme_description_join, this.y.getText(), this.x.getText(), this.aa.getText()));
    }

    public void f(int i) {
        this.aw = i;
        b(this.q);
        b(this.ae);
        b(this.ak);
        b(this.y);
    }

    private void b(final HealthTextView healthTextView) {
        healthTextView.post(new Runnable() { // from class: tcu
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e(healthTextView);
            }
        });
    }

    public /* synthetic */ void e(HealthTextView healthTextView) {
        this.bc = Math.max(this.bc, healthTextView.getLineCount());
        this.aw--;
        LogUtil.a(b(), "maxLines:", Integer.valueOf(this.bc), " mCheckCount:", Integer.valueOf(this.aw));
        if (this.aw == 0) {
            LogUtil.a(b(), "updateTitleLines maxLines:", Integer.valueOf(this.bc));
            this.q.setLines(this.bc);
            this.ae.setLines(this.bc);
            this.ak.setLines(this.bc);
            this.y.setLines(this.bc);
        }
    }

    public void e(qtg qtgVar) {
        this.az.setVisibility(0);
        this.av.setVisibility(8);
        if (qtgVar == null) {
            ReleaseLogUtil.d("R_ThreeLeafCardViewHolder", "updateHealthClover data is null");
            return;
        }
        LogUtil.a(b(), "updateHealthClover cloverData :", qtgVar.toString());
        ReleaseLogUtil.c("R_ThreeLeafCardViewHolder", "updateHealthClover leaf count is:", Integer.valueOf(qtgVar.e()));
        this.az.setCloverLeafData(qtgVar);
    }

    public void j(int i) {
        t();
        this.ad.setVisibility(i);
        this.u.setVisibility(i);
    }

    public void p() {
        if (this.av.getVisibility() != 0) {
            this.az.setVisibility(8);
            this.av.setVisibility(0);
            j(8);
            ReleaseLogUtil.c("R_ThreeLeafCardViewHolder", "showThreeLeaf");
        }
    }

    public View k() {
        return this.bi;
    }
}
