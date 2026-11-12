package com.huawei.ui.commonui.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.lua;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qsp;
import defpackage.qta;
import health.compact.a.CommonUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public class PlanUpgradeGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f23990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f23991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnButtonClickListener f23992c;
    private HealthTextView d;
    private HealthButton e;
    private int f;
    private c i;

    public interface OnButtonClickListener {
        void onClick();
    }

    static /* synthetic */ int b(PlanUpgradeGuideView planUpgradeGuideView) {
        int i = planUpgradeGuideView.f + 1;
        planUpgradeGuideView.f = i;
        return i;
    }

    public PlanUpgradeGuideView(Context context) {
        super(context);
        b(context);
    }

    public PlanUpgradeGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public void setOnButtonClickListener(OnButtonClickListener onButtonClickListener) {
        this.f23992c = onButtonClickListener;
    }

    private void b(Context context) {
        setPadding(0, 0, 0, qre.b(R.dimen.health_common_12dp));
        LayoutInflater.from(context).inflate(R.layout.sug_smart_weight_plan_upgrade_guide, (ViewGroup) this, true);
        this.f23991b = findViewById(R.id.weight_plan_upgrade_root_layout);
        this.d = (HealthTextView) findViewById(R.id.weight_plan_upgrade_guide_text);
        this.f23990a = (HealthButton) findViewById(R.id.weight_plan_upgrade_cancel);
        this.e = (HealthButton) findViewById(R.id.weight_plan_upgrade_confirm);
        this.d.setTypeface(qrr.c());
        this.f23991b.setBackground(new qta());
        this.f = CommonUtils.j(lua.e(String.valueOf(1004), SmartMsgConstant.MSG_SHOW_COUNT, ""));
        String strE = lua.e(String.valueOf(1004), "buttonClick", "");
        boolean z = this.f < 3 && !TextUtils.equals("true", strE);
        LogUtil.a("SmartWeightPlanUpgradeGuide", "visibleCount:", Integer.valueOf(this.f), " buttonClick:", strE);
        if (!z) {
            setVisibility(8);
            return;
        }
        Drawable drawableC = qre.c(R.drawable.ic_training_plan_ai);
        drawableC.setBounds(0, 0, drawableC.getMinimumWidth(), drawableC.getMinimumHeight());
        SpannableString spannableString = new SpannableString(String.format(" %s", qre.f(R.string.IDS_fatloss_plan_upgrade_guide_desc)));
        spannableString.setSpan(new ImageSpan(drawableC), 0, 1, 1);
        this.d.setText(spannableString);
        this.f23990a.setOnClickListener(new View.OnClickListener() { // from class: qtc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46787b.c(view);
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: qtb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46786c.d(view);
            }
        });
        c cVar = new c(this);
        this.i = cVar;
        qsp.a((View) this, (ViewTreeObserver.OnGlobalLayoutListener) cVar);
    }

    public /* synthetic */ void c(View view) {
        setVisibility(8);
        lua.f(String.valueOf(1004), "buttonClick", "true");
    }

    public /* synthetic */ void d(View view) {
        setVisibility(8);
        lua.f(String.valueOf(1004), "buttonClick", "true");
        OnButtonClickListener onButtonClickListener = this.f23992c;
        if (onButtonClickListener != null) {
            onButtonClickListener.onClick();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.i;
        if (cVar != null) {
            qsp.b(this, cVar);
        }
    }

    static class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<PlanUpgradeGuideView> f23993b;

        public c(PlanUpgradeGuideView planUpgradeGuideView) {
            this.f23993b = new WeakReference<>(planUpgradeGuideView);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            c("onGlobalLayout");
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            c("onScrollChanged");
        }

        private void c(String str) {
            PlanUpgradeGuideView planUpgradeGuideView = this.f23993b.get();
            if (planUpgradeGuideView == null) {
                LogUtil.j("SmartWeightPlanUpgradeGuide", str, " view is null.");
            } else if (planUpgradeGuideView.getLocalVisibleRect(new Rect())) {
                qsp.b(planUpgradeGuideView, this);
                lua.f(String.valueOf(1004), SmartMsgConstant.MSG_SHOW_COUNT, String.valueOf(PlanUpgradeGuideView.b(planUpgradeGuideView)));
            }
        }
    }
}
