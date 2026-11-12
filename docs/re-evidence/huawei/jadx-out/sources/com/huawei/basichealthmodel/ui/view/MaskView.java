package com.huawei.basichealthmodel.ui.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.callback.MaskOnCallbackListener;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.healthmodel.bean.ImageBean;
import com.huawei.health.healthmodel.bean.PictureBean;
import com.huawei.health.healthmodel.bean.TextBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.cai;
import defpackage.cbg;
import defpackage.cfh;
import defpackage.njy;
import defpackage.qqf;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class MaskView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cai f5380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<BitmapDrawable> f5382c;
    private final SparseArray<String> d;
    private MaskOnCallbackListener e;
    private HealthViewPager h;

    public MaskView(Context context) {
        super(context);
        this.f5382c = new SparseArray<>(16);
        this.d = new SparseArray<>(16);
        e();
    }

    public MaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5382c = new SparseArray<>(16);
        this.d = new SparseArray<>(16);
        e();
    }

    public MaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5382c = new SparseArray<>(16);
        this.d = new SparseArray<>(16);
        e();
    }

    private void e() {
        Context contextB = BaseApplication.b();
        View viewInflate = View.inflate(contextB, R.layout.view_mask, this);
        this.h = (HealthViewPager) viewInflate.findViewById(R.id.view_mask_view_page);
        cai caiVar = new cai(this.f5382c, this.d);
        this.f5380a = caiVar;
        this.h.setAdapter(caiVar);
        viewInflate.findViewById(R.id.view_mask_button).setOnClickListener(this);
        HealthDotsPageIndicator healthDotsPageIndicator = (HealthDotsPageIndicator) viewInflate.findViewById(R.id.view_mask_dots_page_indicator);
        healthDotsPageIndicator.setRtlEnable(LanguageUtil.ba(contextB));
        healthDotsPageIndicator.setViewPager(this.h);
    }

    private void d() {
        MaskOnCallbackListener maskOnCallbackListener = this.e;
        if (maskOnCallbackListener == null) {
            LogUtil.j("HL_MaskView", "setMaskShowStatus mMaskOnCallbackListener is null");
        } else {
            maskOnCallbackListener.onMaskShowStatus(getVisibility() == 0);
        }
    }

    public void setImageBeanList(boolean z, List<ImageBean> list, MaskOnCallbackListener maskOnCallbackListener) {
        this.e = maskOnCallbackListener;
        if (njy.e(list)) {
            setVisibility(8);
            d();
            LogUtil.j("HL_MaskView", "setImageBeanList imageBeanList is empty");
            return;
        }
        for (ImageBean imageBean : list) {
            if (imageBean != null) {
                ArrayList<PictureBean> pictureList = imageBean.getPictureList();
                if (!njy.e(pictureList)) {
                    int order = imageBean.getOrder();
                    for (PictureBean pictureBean : pictureList) {
                        if (pictureBean != null) {
                            String path = pictureBean.getPath();
                            if (!cbg.f(path)) {
                                this.f5382c.append(order, qqf.b(path));
                            }
                        }
                    }
                    ArrayList<TextBean> textList = imageBean.getTextList();
                    if (!njy.e(textList)) {
                        ArrayList<String> arrayListE = cfh.e(textList, (HashMap<String, String>) null);
                        if (!njy.e(arrayListE)) {
                            this.d.append(order, arrayListE.get(0));
                        }
                    }
                }
            }
        }
        this.f5380a.a(z);
        int count = this.f5380a.getCount() - 1;
        this.f5381b = count;
        if (count < 0) {
            LogUtil.j("HL_MaskView", "setImageBeanList count is zero");
            setVisibility(8);
            d();
            return;
        }
        d();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int currentItem = this.h.getCurrentItem();
        if (currentItem < this.f5381b) {
            this.h.setCurrentItem(currentItem + 1);
            return;
        }
        setVisibility(8);
        MaskOnCallbackListener maskOnCallbackListener = this.e;
        if (maskOnCallbackListener == null) {
            LogUtil.j("HL_MaskView", "onClick mMaskOnCallbackListener is null");
        } else {
            maskOnCallbackListener.onMaskFinish();
        }
    }
}
