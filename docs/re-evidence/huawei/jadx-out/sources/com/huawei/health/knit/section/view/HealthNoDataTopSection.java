package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qqw;
import defpackage.qrs;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class HealthNoDataTopSection extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f7608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f7609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f7610c;
    private boolean d;
    private Context e;
    private LinearLayout f;
    private ImageView g;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    public HealthNoDataTopSection(Context context) {
        super(context);
    }

    public HealthNoDataTopSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HealthNoDataTopSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.e = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.health_no_data_top_section_layout, (ViewGroup) this, false);
        this.f7610c = viewInflate;
        this.g = (ImageView) viewInflate.findViewById(R.id.no_data_page_head_img);
        this.f7609b = (ImageView) this.f7610c.findViewById(R.id.round_corner_img);
        this.f7608a = (ImageView) this.f7610c.findViewById(R.id.rect_corner_img);
        this.f = (LinearLayout) this.f7610c.findViewById(R.id.toast_view_container);
        return this.f7610c;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "HealthNoDataTopSection";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(final HashMap<String, Object> map) {
        LogUtil.a("HealthNoDataTopSection", "bindParamsToView");
        if (map == null || map.size() == 0) {
            return;
        }
        this.f7609b.post(new Runnable() { // from class: com.huawei.health.knit.section.view.HealthNoDataTopSection.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HealthNoDataTopSection", "register scroll listener");
                if (!(HealthNoDataTopSection.this.getKnitFragment().getActivity() instanceof KnitHealthDetailActivity) || ((KnitHealthDetailActivity) HealthNoDataTopSection.this.getKnitFragment().getActivity()) == null) {
                    return;
                }
                LogUtil.a("HealthNoDataTopSection", "mRoundCornerImage height: ", Integer.valueOf(HealthNoDataTopSection.this.f7609b.getHeight()));
                ((KnitHealthDetailActivity) HealthNoDataTopSection.this.getKnitFragment().getActivity()).configScrollViewListener(HealthNoDataTopSection.this.g, HealthNoDataTopSection.this.f7609b.getHeight());
                if (qqw.a(map, "IS_SHOW_TOAST", false)) {
                    ((KnitHealthDetailActivity) HealthNoDataTopSection.this.getKnitFragment().getActivity()).configureNoDataToast(HealthNoDataTopSection.this.f);
                }
            }
        });
        boolean zA = qqw.a(map, "DEVICE_INFO_FLAG", false);
        this.d = zA;
        if (zA) {
            d(qqw.c(map, "RECT_CORNER_IMAGE", 0), this.f7608a);
            this.g.setVisibility(8);
            this.f7609b.setVisibility(8);
            this.f7608a.setVisibility(0);
            return;
        }
        a(map);
        d(qqw.c(map, "ROUND_CORNER_IMAGE", 0), this.f7609b);
        this.g.setVisibility(0);
        this.f7609b.setVisibility(0);
        this.f7608a.setVisibility(8);
    }

    private void a(HashMap<String, Object> map) {
        if (!qrs.af(this.e)) {
            d(qqw.c(map, "TOP_IMAGE", 0), this.g);
            if (this.g.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.g.getLayoutParams();
                layoutParams.height = (qrs.i(this.e) / 16) * 9;
                this.g.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        d(qqw.c(map, "TOP_IMAGE_TAHITI", 0), this.g);
    }

    private void d(int i, ImageView imageView) {
        if (i == 0) {
            return;
        }
        imageView.setImageDrawable(this.e.getResources().getDrawable(i));
    }
}
