package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.qqw;
import defpackage.qqz;
import defpackage.qre;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionActiveStandCard extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthImageView f7736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthButton f7738c;
    private HealthTextView d;
    private ConstraintLayout e;
    private HealthProgressBar f;
    private View g;
    private HealthTextView h;
    private HealthDivider i;
    private HealthTextView j;

    public SectionActiveStandCard(Context context) {
        super(context);
        this.f7737b = BaseApplication.b();
    }

    public SectionActiveStandCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7737b = BaseApplication.b();
    }

    public SectionActiveStandCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7737b = BaseApplication.b();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_active_stand_card, (ViewGroup) this, false);
        this.g = viewInflate;
        this.e = (ConstraintLayout) viewInflate.findViewById(R.id.section_active_stand_card_layout);
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.g.findViewById(R.id.section_active_stand_card_target_sub_header);
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(this.f7737b, R.color.common_transparent));
        LinearLayout parentLayout = healthSubHeader.getParentLayout();
        if (parentLayout != null) {
            parentLayout.setPadding(0, parentLayout.getPaddingTop(), 0, parentLayout.getPaddingBottom());
        }
        this.d = (HealthTextView) this.g.findViewById(R.id.section_active_stand_card_target_edit);
        HealthImageView healthImageView = (HealthImageView) this.g.findViewById(R.id.section_active_stand_card_target_edit_icon);
        this.f7736a = healthImageView;
        healthImageView.setImageDrawable(qqz.c(this.f7737b, R.drawable.ic_edit));
        this.h = (HealthTextView) this.g.findViewById(R.id.section_active_stand_card_target_progress);
        this.f = (HealthProgressBar) this.g.findViewById(R.id.section_active_stand_card_target_progress_bar);
        this.i = (HealthDivider) this.g.findViewById(R.id.section_active_stand_card_progress_bar_divider);
        this.j = (HealthTextView) this.g.findViewById(R.id.section_active_stand_card_target_tip);
        this.f7738c = (HealthButton) this.g.findViewById(R.id.section_active_stand_card_target_tip_button);
        View view = this.g;
        ViewTreeVisibilityListener.c(view, new ViewTreeVisibilityListener(view, this));
        return this.g;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SCUI_SectionActiveStandCard";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() <= 0) {
            LogUtil.j("SCUI_SectionActiveStandCard", "bindParamsToView map ", map);
            return;
        }
        this.h.setText(qqw.d((Map) map, "STAND_PROGRESS_TEXT", (CharSequence) ""));
        this.f.setProgress(qqw.c(map, "STAND_PROGRESS", 0));
        boolean zA = qqw.a(map, "STAND_TODAY_DATA", true);
        boolean zD = WheelChairStateManager.a().d();
        LogUtil.a("SCUI_SectionActiveStandCard", "bindParamsToView isWheelChair:", Boolean.valueOf(zD));
        if (zA) {
            Object objB = qqw.b(map, "RIGHT_ICON_CLICK_EVENT", null);
            if (objB instanceof View.OnClickListener) {
                View.OnClickListener onClickListener = (View.OnClickListener) objB;
                this.d.setVisibility(0);
                this.d.setOnClickListener(onClickListener);
                this.f7736a.setVisibility(0);
                this.f7736a.setOnClickListener(onClickListener);
            }
            if (zD) {
                this.i.setVisibility(8);
                this.j.setVisibility(8);
                this.f7738c.setVisibility(8);
                setLayoutParamsBottom(0);
                return;
            }
            this.i.setVisibility(0);
            this.j.setVisibility(0);
            this.j.setText(qqw.d((Map) map, "STAND_TIP", ""));
            Object objB2 = qqw.b(map, "CLICK_EVENT_LISTENER", null);
            if (objB2 instanceof View.OnClickListener) {
                this.f7738c.setVisibility(0);
                this.f7738c.setOnClickListener((View.OnClickListener) objB2);
                this.f7738c.setText(qqw.d((Map) map, "STAND_CONTENT", (CharSequence) ""));
            }
            setLayoutParamsBottom(qre.b(R.dimen.health_common_4dp));
            return;
        }
        this.d.setVisibility(8);
        this.f7736a.setVisibility(8);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.f7738c.setVisibility(8);
        setLayoutParamsBottom(0);
    }

    private void setLayoutParamsBottom(int i) {
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(0, 0, 0, i);
            this.e.setLayoutParams(layoutParams2);
        }
    }
}
