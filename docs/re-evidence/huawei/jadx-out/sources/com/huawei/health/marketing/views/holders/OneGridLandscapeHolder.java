package com.huawei.health.marketing.views.holders;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.CornerTemplate;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fwz;
import defpackage.fxk;
import defpackage.fya;
import defpackage.gat;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class OneGridLandscapeHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f8482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8483c;
    private HealthTextView d;
    private Context e;
    private HealthTextView f;
    private HealthImageView g;
    private HealthTextView h;
    private LinearLayout i;
    private HealthTextView j;
    private LinearLayout k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private LinearLayout o;
    private HealthTextView p;
    private int q;
    private HealthTextView r;
    private ResourceBriefInfo s;
    private RelativeLayout t;

    public OneGridLandscapeHolder(Context context, View view, ResourceBriefInfo resourceBriefInfo, int i) {
        super(view);
        this.e = context;
        this.q = i;
        this.s = resourceBriefInfo;
        this.f8483c = resourceBriefInfo.getCategory();
        this.f8481a = resourceBriefInfo.getContentType();
        this.t = (RelativeLayout) view.findViewById(R.id.item_one_landscape_layout);
        this.g = (HealthImageView) view.findViewById(R.id.item_one_landscape_image);
        this.f8482b = (ImageView) view.findViewById(R.id.audition_btn);
        this.k = (LinearLayout) view.findViewById(R.id.item_one_landscape_in_layout);
        this.r = (HealthTextView) view.findViewById(R.id.item_one_landscape_title);
        this.d = (HealthTextView) view.findViewById(R.id.item_one_landscape_corner);
        this.f = (HealthTextView) view.findViewById(R.id.item_one_landscape_description);
        this.o = (LinearLayout) view.findViewById(R.id.item_one_landscape_out_layout);
        this.m = (HealthTextView) view.findViewById(R.id.item_one_landscape_out_title);
        this.n = (HealthTextView) view.findViewById(R.id.item_one_landscape_out_description);
        this.p = (HealthTextView) view.findViewById(R.id.item_one_landscape_peoples_num);
        this.i = (LinearLayout) view.findViewById(R.id.item_one_landscape_ll_course);
        this.h = (HealthTextView) view.findViewById(R.id.item_one_landscape_course_title);
        this.j = (HealthTextView) view.findViewById(R.id.item_one_landscape_course_details);
        this.l = (HealthTextView) view.findViewById(R.id.item_one_landscape_join_num);
        fya.b(this.r, false, true);
        fya.b(this.f, true, false);
        fya.b(this.m, false, true);
        fya.b(this.n, true, false);
        fya.b(this.p, false, false);
        fya.b(this.h, false, true);
        fya.b(this.j, true, false);
        fya.b(this.l, false, false);
    }

    public void a(List<SingleGridContent> list, int i) {
        SingleGridContent singleGridContent = njy.c(list, i) ? list.get(i) : null;
        if (singleGridContent == null) {
            LogUtil.j("OneGridLandscapeHolder", "setOneGridLandscapeLayout singleGridContent is null.");
            return;
        }
        LogUtil.a("OneGridLandscapeHolder", "setOneGridLandscapeLayout mContentType  = ", Integer.valueOf(this.f8481a));
        LogUtil.a("OneGridLandscapeHolder", "setOneGridLandscapeLayout content  = ", singleGridContent);
        int iC = fxk.c(this.e, this.f8481a, list.size());
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        int i2 = (iC * 9) / 16;
        layoutParams.width = iC;
        layoutParams.height = i2;
        this.g.setLayoutParams(layoutParams);
        qqf.b(singleGridContent.getPicture(), this.g, qqf.d);
        fya.b(this.d, (CornerTemplate) singleGridContent, false);
        if (this.f8481a == 19) {
            b(singleGridContent, i);
            if (TextUtils.equals(this.f8483c, SingleDailyMomentContent.ACTIVITY_TYPE)) {
                fya.b(this.l, singleGridContent, this.f8483c);
            }
        } else {
            this.k.setVisibility(8);
            this.p.setVisibility(8);
            this.i.setVisibility(8);
            this.o.setVisibility(0);
            fya.e(this.m, singleGridContent.getTheme(), singleGridContent.isThemeVisibility());
            fya.d(this.n, singleGridContent.getDescription(), singleGridContent.getDescriptionVisibility());
            fya.b(this.n, true, false);
            i2 = -2;
        }
        ViewGroup.LayoutParams layoutParams2 = this.t.getLayoutParams();
        layoutParams2.width = iC;
        layoutParams2.height = i2;
        this.t.setLayoutParams(layoutParams2);
        String strValueOf = this.d.getVisibility() == 0 ? String.valueOf(this.d.getText()) : "";
        String strValueOf2 = this.l.getVisibility() == 0 ? String.valueOf(this.l.getText()) : "";
        CharSequence charSequenceD = fya.d(singleGridContent);
        if (!TextUtils.isEmpty(strValueOf) && !TextUtils.isEmpty(strValueOf2)) {
            charSequenceD = qre.a(R.string.accessibility_status_theme_description_join, strValueOf, charSequenceD, strValueOf2);
        } else if (!TextUtils.isEmpty(strValueOf)) {
            charSequenceD = qre.a(R.string.accessibility_status_theme_description, strValueOf, charSequenceD);
        } else if (!TextUtils.isEmpty(strValueOf2)) {
            charSequenceD = qre.a(R.string.accessibility_theme_description_join, charSequenceD, strValueOf2);
        }
        lrd.a(this.t, charSequenceD, (Class<?>) ImageView.class);
        LogUtil.a("OneGridLandscapeHolder", "setOneGridLandscapeLayout contentDescription ", charSequenceD);
    }

    private void b(SingleGridContent singleGridContent, int i) {
        this.k.setVisibility(0);
        this.o.setVisibility(8);
        fya.e(this.r, singleGridContent.getTheme(), singleGridContent.isThemeVisibility());
        fya.d(this.f, singleGridContent.getDescription(), singleGridContent.getDescriptionVisibility());
        fya.b(this.f, true, false);
        if (TextUtils.equals(this.f8483c, SingleDailyMomentContent.COURSE_TYPE) || TextUtils.equals(singleGridContent.getItemCategory(), SingleDailyMomentContent.COURSE_TYPE)) {
            this.i.setVisibility(0);
            this.k.setVisibility(8);
            d();
            fya.d(this.h, singleGridContent.getTheme(), singleGridContent.isThemeVisibility(), true);
            String strC = fwz.c(singleGridContent, 19);
            LogUtil.a("OneGridLandscapeHolder", "get courseInfo = ", strC);
            HealthTextView healthTextView = this.j;
            if (TextUtils.isEmpty(strC)) {
                strC = singleGridContent.getDescription();
            }
            fya.a(healthTextView, strC, singleGridContent.getDescriptionVisibility(), true);
            fya.b(this.j, true, false);
            if (!qrs.v() && singleGridContent.isThemeVisibility()) {
                fya.b(this.p, singleGridContent, this.f8483c);
                this.p.setVisibility(0);
            }
        } else {
            this.p.setVisibility(8);
        }
        if (singleGridContent.isAuditionVisibility()) {
            this.f8482b.setVisibility(0);
            HashMap map = new HashMap(16);
            map.put(WebViewHelp.BI_KEY_PULL_FROM, String.valueOf(this.q));
            map.put("resourceId", this.s.getResourceId());
            map.put("resourceName", this.s.getResourceName());
            map.put("pullOrder", String.valueOf(i + 1));
            gat.b(this.itemView, this.f8482b, singleGridContent, map);
            return;
        }
        this.f8482b.setVisibility(8);
    }

    private void d() {
        if (qrs.ac()) {
            qrs.a(this.h);
        }
    }
}
