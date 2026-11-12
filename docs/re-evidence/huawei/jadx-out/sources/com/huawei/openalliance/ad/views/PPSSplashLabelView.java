package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dg;

/* JADX INFO: loaded from: classes41.dex */
public class PPSSplashLabelView extends PPSLabelView {
    @Override // com.huawei.openalliance.ad.views.PPSLabelView
    protected void setTextWhenImgLoadFail(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) str);
        }
        setClick(spannableStringBuilder);
    }

    @Override // com.huawei.openalliance.ad.views.PPSLabelView
    protected void b(AdSource adSource, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (adSource == null) {
            hw.b("PPSSplashLabelView", "adSource is null");
            setClick(spannableStringBuilder);
            return;
        }
        String strE = dg.e(adSource.a()) == null ? "" : dg.e(adSource.a());
        if (str == null) {
            str = "";
        }
        String str2 = strE + str;
        String strB = adSource.b();
        if (TextUtils.isEmpty(strE) && TextUtils.isEmpty(strB)) {
            setClick(spannableStringBuilder);
        } else if (TextUtils.isEmpty(strE) || !TextUtils.isEmpty(strB)) {
            a(str2, strB);
        } else {
            setClick(new SpannableStringBuilder(str2));
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSLabelView
    protected void a(String str, Drawable drawable) {
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            boolean zIsEmpty = TextUtils.isEmpty(str);
            spannableStringBuilder.append((CharSequence) str);
            ImageSpan imageSpanA = a(drawable, !zIsEmpty);
            if (imageSpanA != null) {
                spannableStringBuilder.setSpan(imageSpanA, 0, 1, 33);
            }
            setClick(spannableStringBuilder);
        } catch (Throwable unused) {
            hw.c("PPSSplashLabelView", "setTextWhenImgLoaded error");
        }
    }

    public void a(AdSource adSource, String str, Integer num, boolean z) {
        this.f20903b = num;
        this.f20904c = z;
        b(adSource, str);
    }

    public PPSSplashLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PPSSplashLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PPSSplashLabelView(Context context) {
        super(context);
    }
}
