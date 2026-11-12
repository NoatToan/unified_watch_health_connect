package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.LabelPosition;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.js;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class PPSSplashAdSourceView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PPSSplashLabelView f21007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f21008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f21009c;
    private Integer d;
    private WeakReference<js> e;
    private boolean f;
    private boolean g;

    protected int getRootLayoutId() {
        this.g = a(getContext(), this.f21009c, this.d);
        return b() ? R.layout.hiad_splash_ad_source_with_click : R.layout.hiad_splash_ad_source;
    }

    public void a(js jsVar, Integer num, Integer num2, boolean z) {
        hw.b("PPSSplashAdSourceView", "setAdLabelConfig %s %s %s", num, num2, Boolean.valueOf(z));
        this.e = new WeakReference<>(jsVar);
        this.f21009c = num;
        this.d = num2;
        this.f = z;
    }

    public void a(ContentRecord contentRecord, boolean z, int i, int i2, boolean z2) {
        hw.b("PPSSplashAdSourceView", "positionAndSet");
        a(getContext());
        String strR = contentRecord.R() == null ? LabelPosition.LOWER_LEFT : contentRecord.R();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hiad_splash_label_side_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.hiad_splash_label_side_margin);
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if ("tr".equals(strR)) {
                a(i, i2, z2, dimensionPixelSize, dimensionPixelSize2, layoutParams2);
            } else {
                a(z, i, i2, z2, dimensionPixelSize, dimensionPixelSize2, layoutParams2);
            }
            setLayoutParams(layoutParams2);
        }
        a(contentRecord);
        b(contentRecord);
    }

    public void a() {
        PPSSplashLabelView pPSSplashLabelView = this.f21007a;
        if (pPSSplashLabelView != null) {
            pPSSplashLabelView.b();
        }
    }

    private boolean b() {
        hw.b("PPSSplashAdSourceView", "isSplashClickable: %s, isShowTransparency: %s", Boolean.valueOf(this.g), Boolean.valueOf(this.f));
        return this.g || this.f;
    }

    private void b(ContentRecord contentRecord) {
        TextView textView;
        int i;
        MetaData metaDataJ = contentRecord.j();
        if (metaDataJ == null || this.f21008b == null) {
            return;
        }
        String strE = dg.e(metaDataJ.l());
        if (TextUtils.isEmpty(strE)) {
            textView = this.f21008b;
            i = 8;
        } else {
            this.f21008b.setText(strE);
            textView = this.f21008b;
            i = 0;
        }
        textView.setVisibility(i);
    }

    public static boolean a(Context context, Integer num, Integer num2) {
        if (!cc.a(context).d() || num == null || num2 == null) {
            return false;
        }
        return ((num.intValue() == 1 || num.intValue() == 4) && (num2.intValue() == 2 || num2.intValue() == 3)) || ((num.intValue() == 2 || num.intValue() == 3) && (num2.intValue() == 1 || num2.intValue() == 3));
    }

    private void a(boolean z, int i, int i2, boolean z2, int i3, int i4, RelativeLayout.LayoutParams layoutParams) {
        layoutParams.addRule(12);
        layoutParams.addRule(20);
        layoutParams.leftMargin = i3;
        layoutParams.setMarginStart(i3);
        layoutParams.bottomMargin = i4;
        if (i2 == 0) {
            if (cc.b(getContext()) && z2) {
                layoutParams.setMarginStart(layoutParams.leftMargin + i);
                layoutParams.leftMargin += i;
            } else if (!cc.b(getContext()) || (cc.b(getContext()) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1)) {
                layoutParams.setMarginStart(dk.f(getContext()));
                layoutParams.leftMargin = dk.f(getContext());
            }
            if (z) {
                return;
            }
            if (!com.huawei.openalliance.ad.utils.ab.n(getContext()) && !com.huawei.openalliance.ad.utils.ab.q(getContext())) {
                return;
            }
        } else if (z) {
            return;
        }
        layoutParams.bottomMargin += dk.f(getContext());
    }

    private void a(ContentRecord contentRecord) {
        PPSSplashLabelView pPSSplashLabelView;
        int i;
        String strP = !dg.b(contentRecord.P()) ? contentRecord.P() : getResources().getString(R.string.hiad_ad_label_new);
        MetaData metaDataJ = contentRecord.j();
        AdSource adSourceA = (metaDataJ == null || metaDataJ.L() == null) ? null : AdSource.a(metaDataJ.L());
        this.f21007a.setDataAndRefreshUi(contentRecord);
        if (this.f21007a.a()) {
            PPSSplashLabelView pPSSplashLabelView2 = this.f21007a;
            WeakReference<js> weakReference = this.e;
            pPSSplashLabelView2.a(weakReference != null ? weakReference.get() : null, contentRecord, this.f);
            this.f21007a.a(adSourceA, strP, this.f21009c, this.g);
            pPSSplashLabelView = this.f21007a;
            i = 0;
        } else {
            pPSSplashLabelView = this.f21007a;
            i = 8;
        }
        pPSSplashLabelView.setVisibility(i);
    }

    private void a(Context context) {
        hw.b("PPSSplashAdSourceView", "init");
        inflate(context, getRootLayoutId(), this);
        PPSSplashLabelView pPSSplashLabelView = (PPSSplashLabelView) findViewById(R.id.hiad_ad_label);
        this.f21007a = pPSSplashLabelView;
        pPSSplashLabelView.setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.hiad_ad_source);
        this.f21008b = textView;
        textView.setVisibility(8);
    }

    private void a(int i, int i2, boolean z, int i3, int i4, RelativeLayout.LayoutParams layoutParams) {
        int iF;
        layoutParams.addRule(10);
        layoutParams.addRule(21);
        layoutParams.rightMargin = i3;
        layoutParams.setMarginEnd(i3);
        layoutParams.topMargin = i4;
        if (i2 != 0) {
            layoutParams.topMargin += i;
            return;
        }
        if (!z) {
            layoutParams.setMarginEnd(layoutParams.rightMargin + i);
            layoutParams.rightMargin += i;
        }
        if (cc.b(getContext())) {
            layoutParams.setMarginEnd(layoutParams.rightMargin + dk.f(getContext()));
            iF = layoutParams.rightMargin + dk.f(getContext());
        } else {
            layoutParams.setMarginEnd(dk.f(getContext()));
            iF = dk.f(getContext());
        }
        layoutParams.rightMargin = iF;
        layoutParams.topMargin += as.a(getContext(), 12.0f);
    }

    public PPSSplashAdSourceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f = false;
        this.g = false;
    }

    public PPSSplashAdSourceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = false;
        this.g = false;
    }

    public PPSSplashAdSourceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        this.g = false;
    }

    public PPSSplashAdSourceView(Context context) {
        super(context, null);
        this.f = false;
        this.g = false;
    }
}
