package com.huawei.basichealthmodel.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.huawei.basichealthmodel.R;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.car;
import defpackage.cbg;
import defpackage.ccr;
import defpackage.ccy;
import defpackage.cfp;
import defpackage.ffv;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes23.dex */
public class HealthModelShareView extends BasicHealthModelShareView {
    public HealthModelShareView(Context context) {
        super(context);
    }

    public HealthModelShareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HealthModelShareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static int getChallengeId() {
        int iA = qrs.a(ccy.c("health_model_challenge_id"));
        if (iA == 200001 || iA <= 0) {
            iA = ccr.e();
        }
        return iA <= 0 ? AwarenessConstants.ERROR_UNKNOWN_CODE : iA;
    }

    public void setTaskData(car carVar) {
        if (carVar == null) {
            LogUtil.j("HL_HealthModelShareView", "setTaskData bean is null");
            return;
        }
        int iD = carVar.d();
        if (iD > 0) {
            setTaskText(carVar.c(), iD, this.f5363c.getString(ffv.i().get(carVar.c())));
        }
        if (carVar.b() > 0) {
            this.i.setText(this.f5363c.getString(R.string.IDS_health_model_target_exceed_number, cbg.d(carVar.b(), 2, 0)));
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
        c(carVar);
        setTaskBenefit(carVar.c());
    }

    public void setTaskText(int i, int i2, String str) {
        int i3;
        String string;
        if (i == 2) {
            i3 = R.string.IDS_share_task_step;
        } else if (i == 3) {
            i3 = R.string.IDS_share_task_intensity;
        } else if (i == 5) {
            i3 = R.string.IDS_share_task_breath;
        } else if (i == 6) {
            i3 = R.string.IDS_share_task_wake_up;
        } else if (i == 7) {
            i3 = R.string.IDS_share_task_sleep;
        } else if (i == 9) {
            i3 = R.string.IDS_share_task_mindfulness;
        } else if (i != 10) {
            return;
        } else {
            i3 = R.string.IDS_share_task_drink;
        }
        if (i3 == 0) {
            string = "";
        } else {
            string = this.f5363c.getString(i3, this.f5363c.getQuantityString(R.plurals.IDS_day_no_space, i2, Integer.valueOf(i2)));
        }
        this.f5362b.setText(e(string, str, String.valueOf(i2)));
    }

    private void c(car carVar) {
        this.g.setBackground(null);
        this.j.setBackground(null);
        Bitmap bitmapE = carVar.e();
        Bitmap bitmapA = carVar.a();
        if (bitmapE == null) {
            Bitmap bitmapC = qqf.c(com.huawei.ui.commonui.R.drawable.health_life_background);
            if (bitmapC == null) {
                LogUtil.j("HL_HealthModelShareView", "initBackground bitmap is null");
                this.g.setBackgroundResource(com.huawei.ui.commonui.R.drawable.health_life_background);
                return;
            } else {
                this.g.setBackground(new BitmapDrawable(this.f5363c, b(bitmapC)));
                return;
            }
        }
        this.g.setBackground(new BitmapDrawable(this.f5363c, b(bitmapE)));
        if (bitmapA != null) {
            this.j.setBackground(new BitmapDrawable(this.f5363c, b(bitmapA)));
        }
    }

    public void setChallengeData(int i, int i2, int i3) {
        e(i, i2, ccr.a(i));
        if (i3 > 0) {
            this.i.setText(this.f5363c.getQuantityString(R.plurals.IDS_share_join_people_two, i3, cbg.d(i3, 1, 0)));
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
        String strC = ccr.c(i);
        if (TextUtils.isEmpty(strC)) {
            this.e.setVisibility(8);
        } else {
            this.e.setText(strC);
            this.e.setVisibility(0);
        }
        c(ccr.a());
    }

    private void e(int i, int i2, String str) {
        int i3;
        String string;
        switch (i) {
            case AwarenessConstants.ERROR_INVALID_FREQUENCY_CODE /* 200002 */:
                i3 = R.string.IDS_share_plan_relieve;
                break;
            case AwarenessConstants.ERROR_TIMEOUT_CODE /* 200003 */:
                i3 = R.string.IDS_share_plan_weight_new;
                break;
            case AwarenessConstants.ERROR_UNKNOWN_CODE /* 200004 */:
                i3 = R.string.IDS_share_plan_sleep;
                break;
            case AwarenessConstants.ERROR_LIMITED_REGISTRY_CODE /* 200005 */:
                i3 = R.string.IDS_share_plan_immunity;
                break;
            default:
                i3 = 0;
                break;
        }
        if (i3 == 0) {
            string = "";
        } else {
            string = this.f5363c.getString(i3, this.f5363c.getQuantityString(R.plurals.IDS_day_no_space, i2, Integer.valueOf(i2)));
        }
        this.f5362b.setText(a(string, str, String.valueOf(i2), LanguageUtil.f(this.d)));
    }

    private void c(String str) {
        Bitmap bitmapF;
        if (cbg.f(str)) {
            LogUtil.j("HL_HealthModelShareView", "initChallengeBackground sharePath ", str);
            bitmapF = null;
        } else {
            bitmapF = qqf.f(str);
        }
        if (bitmapF == null && (bitmapF = qqf.c(com.huawei.ui.commonui.R.drawable.health_life_background)) == null) {
            LogUtil.j("HL_HealthModelShareView", "initBackground bitmap is null");
            this.g.setBackgroundResource(com.huawei.ui.commonui.R.drawable.health_life_background);
        } else {
            this.g.setBackground(new BitmapDrawable(this.f5363c, b(bitmapF)));
        }
    }

    private void setTaskBenefit(int i) {
        String strD = cfp.d(i, getChallengeId(), true);
        if (TextUtils.isEmpty(strD)) {
            this.e.setVisibility(8);
        } else {
            this.e.setText(strD);
            this.e.setVisibility(0);
        }
    }
}
