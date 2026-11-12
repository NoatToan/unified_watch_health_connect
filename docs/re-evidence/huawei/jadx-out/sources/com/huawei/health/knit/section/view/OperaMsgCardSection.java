package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class OperaMsgCardSection extends BaseSection {
    public ViewFlipper e;

    public OperaMsgCardSection(Context context) {
        super(context);
    }

    public OperaMsgCardSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OperaMsgCardSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.home_item_layout_opera_msg, (ViewGroup) this, false);
        ViewFlipper viewFlipper = (ViewFlipper) viewInflate.findViewById(R.id.opera_msg_flipper);
        this.e = viewFlipper;
        BaseActivity.setViewSafeRegion(true, viewFlipper);
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "OperaMsgCardSection";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        ViewFlipper viewFlipper;
        ViewFlipper viewFlipper2;
        ViewFlipper viewFlipper3;
        if (map == null || map.size() == 0) {
            LogUtil.a("OperaMsgCardSection", "no need to bind");
            return;
        }
        qsp.c((View) this.e, qqw.c(map, "VIEW_FLIPPER_VISIBILITY", 8));
        if (qqw.a(map, "REMOVE_ALL_VIEWS", false) && (viewFlipper3 = this.e) != null) {
            viewFlipper3.removeAllViews();
        }
        int iC = qqw.c(map, "FLIPPING_INTERVAL", 3000);
        ViewFlipper viewFlipper4 = this.e;
        if (viewFlipper4 != null) {
            viewFlipper4.setFlipInterval(iC);
        }
        ArrayList arrayList = (ArrayList) qqw.a(map, "ADD_VIEW", (Class<Object>) ArrayList.class, (Object) null);
        if (!njy.e(arrayList) && this.e != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.e.addView((View) it.next());
            }
        }
        if (qqw.a(map, "STOP_FLIPPING", false) && (viewFlipper2 = this.e) != null && viewFlipper2.isFlipping()) {
            this.e.stopFlipping();
        }
        if (!qqw.a(map, "START_FLIPPING", false) || (viewFlipper = this.e) == null) {
            return;
        }
        viewFlipper.startFlipping();
    }
}
