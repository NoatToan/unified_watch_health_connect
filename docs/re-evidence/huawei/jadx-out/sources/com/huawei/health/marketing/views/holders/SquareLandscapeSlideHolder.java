package com.huawei.health.marketing.views.holders;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.CornerTemplate;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fxk;
import defpackage.fya;
import defpackage.gat;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqk;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SquareLandscapeSlideHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResourceBriefInfo f8495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f8497c;
    private Context d;
    private HealthTextView e;
    private ImageView f;
    private HealthTextView g;
    private ImageView h;
    private RelativeLayout i;
    private HealthTextView j;
    private RelativeLayout l;
    private HealthTextView o;

    public SquareLandscapeSlideHolder(Context context, View view, ResourceBriefInfo resourceBriefInfo, int i) {
        super(view);
        this.d = context;
        this.f8496b = i;
        this.f8495a = resourceBriefInfo;
        this.l = (RelativeLayout) view.findViewById(R.id.item_square_landscape_slide_root_layout);
        this.i = (RelativeLayout) view.findViewById(R.id.item_square_landscape_slide_image_layout);
        this.f = (ImageView) view.findViewById(R.id.item_square_landscape_icon);
        this.f8497c = (ImageView) view.findViewById(R.id.item_square_landscape_audition_icon);
        this.g = (HealthTextView) view.findViewById(R.id.item_square_landscape_hot_amount);
        this.h = (ImageView) view.findViewById(R.id.item_square_landscape_slide_image);
        this.o = (HealthTextView) view.findViewById(R.id.item_square_landscape_slide_title);
        this.j = (HealthTextView) view.findViewById(R.id.item_square_landscape_slide_description);
        this.e = (HealthTextView) view.findViewById(R.id.item_square_landscape_corner);
        fya.b(this.g, false, false);
        fya.b(this.o, false, true);
        fya.b(this.j, true, false);
    }

    public void e(List<SingleGridContent> list, int i) {
        SingleGridContent singleGridContent = njy.c(list, i) ? list.get(i) : null;
        if (singleGridContent == null) {
            LogUtil.j("SingleHotSeriesRecommendHolder", "setSquareLandscapeSlideLayout singleGridContent is null.");
            return;
        }
        int iC = fxk.c(BaseApplication.getContext(), 21, list.size());
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        layoutParams.width = iC;
        layoutParams.height = iC;
        this.h.setLayoutParams(layoutParams);
        qqf.b(this.h, singleGridContent.getPicture(), 0, 1, 0);
        fya.e(this.o, singleGridContent.getTheme(), singleGridContent.isThemeVisibility());
        fya.d(this.j, singleGridContent.getDescription(), singleGridContent.getDescriptionVisibility());
        fya.b(this.j, true, false);
        int heatCount = singleGridContent.getHeatCount();
        if (heatCount > 0) {
            this.f.setVisibility(0);
            this.g.setVisibility(0);
            this.g.setText(qqk.b(heatCount));
        } else {
            this.f.setVisibility(8);
            this.g.setVisibility(8);
        }
        if (singleGridContent.isAuditionVisibility()) {
            b(singleGridContent, i);
        } else {
            this.f8497c.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams2 = this.i.getLayoutParams();
        layoutParams2.width = iC;
        layoutParams2.height = iC;
        this.i.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.l.getLayoutParams();
        layoutParams3.width = iC;
        layoutParams3.height = -2;
        this.l.setLayoutParams(layoutParams3);
        fya.b(this.e, (CornerTemplate) singleGridContent, true);
    }

    private void b(SingleGridContent singleGridContent, int i) {
        this.f8497c.setVisibility(0);
        this.f.setVisibility(8);
        HashMap map = new HashMap(16);
        map.put(WebViewHelp.BI_KEY_PULL_FROM, String.valueOf(this.f8496b));
        map.put("resourceId", this.f8495a.getResourceId());
        map.put("resourceName", this.f8495a.getResourceName());
        map.put("pullOrder", String.valueOf(i + 1));
        gat.b(this.itemView, this.f8497c, singleGridContent, map);
    }
}
