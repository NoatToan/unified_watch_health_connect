package com.xiaomi.fitness.health.threetarget.adpter;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.RTLUtil;
import com.xiaomi.fitness.common.log.TalkbackLogger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.LocalLanguageUtil;
import com.xiaomi.fitness.health.threetarget.model.TargetDetailModel;
import com.xiaomi.fitness.util.TargetUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.n4j;
import defpackage.qxi;
import defpackage.x44;

/* JADX INFO: loaded from: classes9.dex */
public class TargetDetailItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12309b;
    public ImageView c;
    public LinearLayout d;
    public View e;
    public int f;
    public int g;
    public float h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12310k;
    public int l;
    public Context m;

    public TargetDetailItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(jui.T6, this);
        this.m = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.t5);
            this.f = typedArrayObtainStyledAttributes.getColor(n4j.y5, x44.a(iji.r3));
            this.g = typedArrayObtainStyledAttributes.getColor(n4j.w5, x44.a(iji.x3));
            this.h = typedArrayObtainStyledAttributes.getDimension(n4j.A5, DisplayUtil.sp2px(18.0f));
            this.i = typedArrayObtainStyledAttributes.getDimension(n4j.x5, DisplayUtil.sp2px(12.0f));
            this.j = typedArrayObtainStyledAttributes.getDimension(n4j.v5, DisplayUtil.dip2px(90.0f));
            this.f12310k = typedArrayObtainStyledAttributes.getInt(n4j.u5, 0);
            this.l = typedArrayObtainStyledAttributes.getResourceId(n4j.z5, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void a(TargetDetailModel targetDetailModel, int i) {
        setItemGravity(i);
        this.f12309b.setText(targetDetailModel.elementName);
        this.c.setImageResource(targetDetailModel.getNameImg(targetDetailModel.type));
        if (RTLUtil.INSTANCE.isRtl(this.m)) {
            TargetUtil.displayTargetValueStrRTL(this.f12308a, targetDetailModel.elementValueStr);
        } else {
            TargetUtil.displayTargetValueStr(this.f12308a, targetDetailModel.elementValueStr);
        }
        this.f12309b.setImportantForAccessibility(2);
        this.f12308a.setImportantForAccessibility(2);
        String[] strArrSplit = targetDetailModel.elementValueStr.split("/");
        int i2 = Integer.parseInt(strArrSplit[0]);
        int i3 = Integer.parseInt(strArrSplit[1]);
        String strC = c(targetDetailModel.type, i2);
        String strC2 = c(targetDetailModel.type, i3);
        String string = targetDetailModel.type == 2 ? AppUtil.getApp().getString(c0j.Lq, strC, strC2) : AppUtil.getApp().getString(c0j.Mq, b(targetDetailModel.type), strC, strC2);
        this.e.setContentDescription(string);
        TalkbackLogger.INSTANCE.d("TargetDetailItemView", "bindData rainbowItemTalkback=" + string, new Object[0]);
    }

    public final String b(int i) {
        if (i == 2) {
            return AppUtil.getApp().getString(c0j.g7);
        }
        if (i == 1) {
            return AppUtil.getApp().getString(c0j.u7);
        }
        return i == 3 ? AppUtil.getApp().getString(c0j.t7) : AppUtil.getApp().getString(c0j.Vl);
    }

    public final String c(int i, int i2) {
        if (i == 2) {
            return getResources().getQuantityString(qxi.common_unit_calorie_desc, i2, Integer.valueOf(i2));
        }
        if (i == 1) {
            return getResources().getQuantityString(qxi.common_unit_step_desc, i2, Integer.valueOf(i2));
        }
        return i == 4 ? getResources().getQuantityString(qxi.q, i2, Integer.valueOf(i2)) : getResources().getQuantityString(qxi.a1, i2, Integer.valueOf(i2));
    }

    public final void d() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12308a.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
        int i = this.f12310k;
        if (i == 0) {
            layoutParams.gravity = 17;
            layoutParams2.gravity = 1;
        } else if (i == 1) {
            layoutParams.gravity = 8388627;
            layoutParams2.gravity = 8388627;
        } else if (i == 2) {
            layoutParams.gravity = 8388629;
            layoutParams2.gravity = 8388629;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12308a = (TextView) findViewById(eri.Gn);
        this.f12309b = (TextView) findViewById(eri.Fn);
        this.c = (ImageView) findViewById(eri.m7);
        this.d = (LinearLayout) findViewById(eri.cc);
        this.e = findViewById(eri.ue);
        this.f12308a.setTextColor(this.f);
        this.f12309b.setTextColor(this.g);
        if (LocalLanguageUtil.INSTANCE.languageFrench()) {
            this.i = DisplayUtil.sp2px(10.0f);
        }
        this.f12308a.setTextSize(0, this.h);
        this.f12309b.setTextSize(0, this.i);
        int i = this.l;
        if (i > 0) {
            this.f12308a.setTypeface(DisplayUtil.getTypefaceAsResourceId(this.m, i));
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12308a.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
        int i2 = this.f12310k;
        if (i2 == 0) {
            layoutParams.gravity = 17;
            layoutParams2.gravity = 17;
        } else if (i2 == 1) {
            layoutParams.gravity = 8388611;
            layoutParams2.gravity = 8388611;
            layoutParams2.setMargins(0, 0, -DisplayUtil.dip2px(1.0f), 0);
        } else if (i2 == 2) {
            layoutParams.gravity = 8388613;
            layoutParams2.gravity = 8388613;
            layoutParams2.setMargins(0, 0, 0, 0);
        }
    }

    public void setItemGravity(int i) {
        this.f12310k = i;
        d();
        invalidate();
    }
}
