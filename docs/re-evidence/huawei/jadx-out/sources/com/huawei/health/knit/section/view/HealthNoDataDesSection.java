package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqf;
import defpackage.qqw;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HealthNoDataDesSection extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f7605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f7606c;
    private HealthTextView d;
    private boolean e;
    private ImageView g;
    private ImageView h;
    private View i;
    private LinearLayout j;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    public HealthNoDataDesSection(Context context) {
        super(context);
    }

    public HealthNoDataDesSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HealthNoDataDesSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.f7604a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.health_no_data_des_section_layout, (ViewGroup) this, false);
        this.i = viewInflate;
        this.g = (ImageView) viewInflate.findViewById(R.id.no_data_page_head_img);
        this.h = (ImageView) this.i.findViewById(R.id.round_corner_img);
        this.f7606c = (ImageView) this.i.findViewById(R.id.has_device_no_data_img);
        this.j = (LinearLayout) this.i.findViewById(R.id.toast_view_container);
        this.d = (HealthTextView) this.i.findViewById(R.id.no_data_title);
        this.f7605b = (HealthTextView) this.i.findViewById(R.id.no_data_desc);
        return this.i;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "HealthNoDataDesSection";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(final HashMap<String, Object> map) {
        LogUtil.a("HealthNoDataDesSection", "bindParamsToView");
        if (map == null || map.size() == 0) {
            return;
        }
        boolean zA = qqw.a(map, "DEVICE_INFO_FLAG", false);
        this.e = zA;
        if (!zA) {
            this.h.post(new Runnable() { // from class: com.huawei.health.knit.section.view.HealthNoDataDesSection.5
                @Override // java.lang.Runnable
                public void run() {
                    FragmentActivity activity;
                    LogUtil.a("HealthNoDataDesSection", "register scroll listener");
                    if (HealthNoDataDesSection.this.getKnitFragment() == null || (activity = HealthNoDataDesSection.this.getKnitFragment().getActivity()) == null || !(activity instanceof KnitHealthDetailActivity)) {
                        return;
                    }
                    KnitHealthDetailActivity knitHealthDetailActivity = (KnitHealthDetailActivity) activity;
                    LogUtil.a("HealthNoDataDesSection", "mRoundCornerImage height: ", Integer.valueOf(HealthNoDataDesSection.this.h.getHeight()));
                    knitHealthDetailActivity.configScrollViewListener(HealthNoDataDesSection.this.g, HealthNoDataDesSection.this.h.getHeight());
                    if (qqw.a(map, "IS_SHOW_TOAST", false)) {
                        knitHealthDetailActivity.configureNoDataToast(HealthNoDataDesSection.this.j);
                    }
                }
            });
        }
        this.f7605b.setText(qqw.d((Map) map, "NO_DATA_DESCRIPTION", ""));
        if (this.e) {
            d(qqw.d((Map) map, "HAS_DEVICE_NO_DATA_IMAGE", ""), this.f7606c);
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.f7606c.setVisibility(0);
            this.d.setVisibility(0);
            FragmentActivity activity = getKnitFragment().getActivity();
            if (activity != null && (activity instanceof KnitHealthDetailActivity)) {
                ((KnitHealthDetailActivity) activity).setTitleStyleNoData();
                return;
            }
            return;
        }
        d(qqw.d((Map) map, "TOP_IMAGE", ""), this.g);
        this.g.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(0);
        this.f7606c.setVisibility(8);
    }

    private void d(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qqf.e(str, new RequestOptions().skipMemoryCache(true), imageView);
    }
}
