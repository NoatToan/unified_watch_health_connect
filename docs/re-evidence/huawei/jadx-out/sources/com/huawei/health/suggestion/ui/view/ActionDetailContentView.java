package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.Pictures;
import com.huawei.pluginfitnessadvice.Video;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ied;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ActionDetailContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f10158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f10159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f10160c;
    private HealthTextView d;
    private String e;
    private String f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private LinearLayout k;
    private HealthTextView l;
    private ImageView m;
    private ImageView n;
    private ImageView o;
    private HealthTextView q;
    private HealthTextView s;
    private HealthTextView t;

    public ActionDetailContentView(Context context) {
        super(context);
        b(context);
    }

    public ActionDetailContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    private void b(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_action_detail_content, (ViewGroup) this, true);
        this.t = (HealthTextView) findViewById(R.id.sug_action_tv_title);
        this.f10159b = (LinearLayout) findViewById(R.id.action_layout);
        this.f10158a = (HealthTextView) findViewById(R.id.sug_action_tv_error_content);
        this.i = (HealthTextView) findViewById(R.id.sug_action_tv_error);
        this.h = (HealthTextView) findViewById(R.id.sug_action_tv_feeling_content);
        this.g = (HealthTextView) findViewById(R.id.sug_action_tv_feeling);
        this.d = (HealthTextView) findViewById(R.id.sug_action_tv_breath_content);
        this.f10160c = (HealthTextView) findViewById(R.id.sug_action_tv_breath);
        this.j = (HealthTextView) findViewById(R.id.sug_action_tv_introduceLyric_content);
        this.l = (HealthTextView) findViewById(R.id.sug_action_tv_introduceLyric);
        this.q = (HealthTextView) findViewById(R.id.sug_action_tv_step_content);
        this.s = (HealthTextView) findViewById(R.id.sug_action_tv_step);
        this.n = (ImageView) findViewById(R.id.sug_action_muscle_left);
        this.m = (ImageView) findViewById(R.id.sug_action_muscle_right);
        this.o = (ImageView) findViewById(R.id.sug_action_orign_image);
        this.k = (LinearLayout) findViewById(R.id.sug_detail_info_layout_course_partner);
        d(this.f10159b);
    }

    public View getContentLayout() {
        return this.f10159b;
    }

    public static void d(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_ActionDetailContentView", "initWidescreenLayout contentLayout == null");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            LogUtil.j("Suggestion_ActionDetailContentView", "initWidescreenLayout contentLayout == null");
            return;
        }
        if (qrs.af(BaseApplication.getContext())) {
            e(layoutParams, 5);
        } else if (EnvironmentInfo.m()) {
            e(layoutParams, 3);
        } else {
            layoutParams = e(layoutParams);
        }
        view.setLayoutParams(layoutParams);
    }

    private static ViewGroup.LayoutParams e(ViewGroup.LayoutParams layoutParams) {
        int dimension = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.maxPaddingStart);
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            return layoutParams;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMarginStart(dimension);
        layoutParams2.setMarginEnd(dimension);
        return layoutParams2;
    }

    private static void e(ViewGroup.LayoutParams layoutParams, int i) {
        layoutParams.width = (int) new HealthColumnSystem(BaseApplication.getContext(), 0).a(i);
    }

    public void setContent(AtomicAction atomicAction) {
        if (atomicAction == null) {
            return;
        }
        this.t.setText(atomicAction.getName());
        e(this.s, this.q, atomicAction.getExtendPropertyString("actionStep"));
        e(this.l, this.j, atomicAction.getExtendPropertyString("introduceLyric"));
        e(this.f10160c, this.d, atomicAction.getExtendPropertyString("breath"));
        e(this.g, this.h, atomicAction.getExtendPropertyString("feeling"));
        e(this.i, this.f10158a, atomicAction.getExtendPropertyString("commonError"));
        b(atomicAction.getExtendPropertyList("pictures", Pictures[].class));
        a(atomicAction);
    }

    private void a(AtomicAction atomicAction) {
        if (atomicAction == null) {
            LogUtil.j("Suggestion_ActionDetailContentView", "updateOrignLogo actionInfo can not null");
            return;
        }
        List extendPropertyList = atomicAction.getExtendPropertyList("actionVideo", Video[].class);
        if (njy.e(extendPropertyList)) {
            LogUtil.j("Suggestion_ActionDetailContentView", "updateOrignLogo videos array can not null");
            return;
        }
        Video video = (Video) extendPropertyList.get(0);
        if (video == null) {
            LogUtil.j("Suggestion_ActionDetailContentView", "updateOrignLogo video can not null");
        } else if (TextUtils.isEmpty(video.getLogoImgUrl())) {
            LogUtil.j("Suggestion_ActionDetailContentView", "updateOrignLogo LogoImgUrl is empty");
        } else {
            this.k.setVisibility(0);
            qqf.d(video.getLogoImgUrl(), this.o);
        }
    }

    private void e(HealthTextView healthTextView, HealthTextView healthTextView2, String str) {
        if (healthTextView == null || healthTextView2 == null) {
            LogUtil.j("Suggestion_ActionDetailContentView", "updateViewState HealthTextView can not null");
            return;
        }
        healthTextView.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        healthTextView2.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        healthTextView2.setText(str);
    }

    private void b(List<Pictures> list) {
        if (njy.e(list, 0)) {
            this.n.setVisibility(8);
            this.m.setVisibility(8);
            return;
        }
        Pictures pictures = list.get(0);
        int iE = ied.e();
        for (Pictures pictures2 : list) {
            if (pictures2 != null && CommonUtil.j(pictures2.getSex()) == iE) {
                pictures = pictures2;
            }
        }
        String frontMusclePicUrl = pictures.getFrontMusclePicUrl();
        this.f = frontMusclePicUrl;
        this.n.setVisibility(TextUtils.isEmpty(frontMusclePicUrl) ? 8 : 0);
        qqf.d(this.f, this.n);
        String backMusclePicUrl = pictures.getBackMusclePicUrl();
        this.e = backMusclePicUrl;
        this.m.setVisibility(TextUtils.isEmpty(backMusclePicUrl) ? 8 : 0);
        qqf.d(this.e, this.m);
    }
}
