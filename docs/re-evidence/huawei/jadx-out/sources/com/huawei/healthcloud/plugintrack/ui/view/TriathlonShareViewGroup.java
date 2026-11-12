package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes10.dex */
public class TriathlonShareViewGroup extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DetailItemContainer f11363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f11364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f11365c;
    private HealthTextView d;
    private Context e;

    public TriathlonShareViewGroup(Context context, int i) {
        super(context);
        c(context, i);
    }

    public TriathlonShareViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        c(context, i);
    }

    private void c(Context context, int i) {
        if (context == null) {
            LogUtil.j("Track_TriathlonShareViewGroup", "initViewGroup context is null.");
            return;
        }
        this.e = context;
        View.inflate(context, R.layout.triatjlon_share_viewgroup_layout, this);
        this.d = (HealthTextView) findViewById(R.id.sport_type_triathlon_name);
        this.f11363a = (DetailItemContainer) findViewById(R.id.triathlon_detail_container);
        this.f11364b = (LinearLayout) findViewById(R.id.chart_view);
        this.f11365c = (ImageView) findViewById(R.id.divide_line);
        if (i == 101) {
            this.d.setTextColor(getResources().getColor(R.color.color_normal_titlebar_title));
            this.f11365c.setBackgroundColor(getResources().getColor(R.color.color_normal_titlebar_title));
        } else if (i != 100) {
            LogUtil.j("Track_TriathlonShareViewGroup", "no match style execute.");
        } else {
            this.d.setTextColor(getResources().getColor(R.color.home_track_show_text_black_color));
            this.f11365c.setBackgroundColor(getResources().getColor(R.color.home_track_show_text_black_color));
        }
    }

    public DetailItemContainer c() {
        return this.f11363a;
    }

    public HealthTextView a() {
        return this.d;
    }

    public LinearLayout d() {
        return this.f11364b;
    }
}
