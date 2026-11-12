package com.huawei.pluginachievement.ui.level;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.ui.kakatask.AchieveKaKaTaskClickListener;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.out;
import defpackage.ozs;
import defpackage.ozu;
import defpackage.pap;
import defpackage.qrs;
import java.util.Locale;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveLevelTaskContentHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Integer[] f22228a = {Integer.valueOf(R.mipmap.level_task_btn_huo), Integer.valueOf(R.mipmap.level_task_btn_zi), Integer.valueOf(R.mipmap.level_task_btn_neng), Integer.valueOf(R.mipmap.level_task_btn_wang), Integer.valueOf(R.mipmap.level_task_btn_quan), Integer.valueOf(R.mipmap.level_task_btn_chuan), Integer.valueOf(R.mipmap.level_task_btn_wang)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f22229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22230c;
    private int d;
    private AchieveKaKaTaskClickListener e;
    private HealthButton f;
    private String g;
    private ImageView h;
    private LinearLayout i;
    private LinearLayout j;
    private HealthButton k;
    private ImageView l;
    private HealthTextView m;
    private HealthButton n;
    private HealthTextView o;
    private String s;

    AchieveLevelTaskContentHolder(View view, AchieveKaKaTaskClickListener achieveKaKaTaskClickListener, int i) {
        super(view);
        this.s = "";
        this.g = "0";
        this.f22230c = 0;
        this.d = i;
        this.i = (LinearLayout) out.b(view, R.id.achieve_task_kaka_content_task_ll);
        this.m = (HealthTextView) out.b(view, R.id.achieve_task_kaka_content_task_text);
        this.l = (ImageView) out.b(view, R.id.achieve_task_kaka_content_task_tips_icon);
        this.h = (ImageView) out.b(view, R.id.achieve_task_kaka_content_buy_tips_icon);
        this.j = (LinearLayout) out.b(view, R.id.achieve_task_kaka_content_task_kaka_desc);
        this.o = (HealthTextView) out.b(view, R.id.achieve_task_kaka_content_task_kaka_value);
        this.f = (HealthButton) out.b(view, R.id.achieve_task_kaka_content_finished_iv);
        this.f22229b = out.b(view, R.id.content_line);
        HealthButton healthButton = (HealthButton) out.b(view, R.id.achieve_task_kaka_content_tag_button);
        this.k = healthButton;
        healthButton.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_kaka_complete));
        d();
        this.k.setOnClickListener(this);
        HealthButton healthButton2 = (HealthButton) out.b(view, R.id.achieve_task_kaka_content_tag_emphasize_button);
        this.n = healthButton2;
        healthButton2.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_kaka_pick));
        this.n.setOnClickListener(this);
        this.e = achieveKaKaTaskClickListener;
    }

    private void d() {
        int i = this.d;
        if (i >= 1) {
            Integer[] numArr = f22228a;
            if (i <= numArr.length) {
                Drawable drawable = BaseApplication.getContext().getResources().getDrawable(numArr[this.d - 1].intValue());
                if (drawable == null) {
                    return;
                }
                this.k.setBackground(drawable);
                this.f.setBackground(drawable);
                this.f.setAlpha(0.4f);
                return;
            }
        }
        LogUtil.d("AchieveLevelTaskContentHolder", "setButtonBg: mLevelType -> ", Integer.valueOf(i));
    }

    private void c(ozu ozuVar) {
        this.s = ozuVar.c();
        String strB = ozuVar.b();
        this.g = ozuVar.j();
        if (TextUtils.isEmpty(strB)) {
            this.l.setVisibility(8);
        } else {
            this.l.setVisibility(0);
            this.l.setOnClickListener(this);
        }
        if (b(ozuVar)) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        this.i.setVisibility(0);
        this.m.setVisibility(0);
        this.m.setText(ozuVar.d());
        this.k.setText(ozuVar.g());
        this.n.setText(ozuVar.h());
        this.o.setVisibility(0);
        String str = String.format(Locale.ROOT, BaseApplication.getContext().getString(R.string.IDS_plugin_achievement_level_value), Integer.valueOf(ozuVar.e()));
        this.o.setText(Marker.ANY_NON_NULL_MARKER + str);
        if ("0".equals(this.g)) {
            this.f.setVisibility(8);
            if (ozuVar.k() != 10001) {
                this.k.setVisibility(0);
                this.n.setVisibility(8);
                return;
            }
            return;
        }
        if ("1".equals(this.g)) {
            this.f.setVisibility(0);
            this.k.setVisibility(8);
            this.n.setVisibility(8);
        } else {
            LogUtil.d("AchieveLevelTaskContentHolder", "status:", this.g);
            this.f.setVisibility(0);
            this.k.setVisibility(8);
            this.n.setVisibility(8);
        }
    }

    private boolean b(ozu ozuVar) {
        int iK = ozuVar.k();
        return iK == 20009 || iK == 30016 || iK == 30017 || ozuVar.o() == 1;
    }

    public void a(ozs ozsVar, int i) {
        if (ozsVar == null) {
            LogUtil.j("AchieveLevelTaskContentHolder", "initView kakaLocationRelationshipData is null.");
            return;
        }
        ozu ozuVarE = ozsVar.e();
        if (ozuVarE != null) {
            this.f22230c = i;
            c(ozuVarE);
        } else {
            this.i.setVisibility(8);
            this.f.setVisibility(8);
            this.k.setVisibility(8);
            this.n.setVisibility(8);
        }
        if (ozsVar.b()) {
            this.f22229b.setVisibility(8);
        }
        if (pap.j(this.s)) {
            this.j.setVisibility(8);
            this.k.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_kaka_see));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.c(1000)) {
            LogUtil.j("AchieveLevelTaskContentHolder", "button click too fast");
            return;
        }
        HealthButton healthButton = this.k;
        if (view == healthButton || view == this.n) {
            b(this.g, this.s, this.f22230c);
        } else if (view == this.l) {
            b("3", this.s, this.f22230c);
        } else {
            LogUtil.d("AchieveLevelTaskContentHolder", "status:", healthButton);
        }
    }

    private void b(String str, String str2, int i) {
        this.e.onTaskClick(str, str2, i);
    }
}
