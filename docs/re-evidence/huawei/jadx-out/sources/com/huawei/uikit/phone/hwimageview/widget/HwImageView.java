package com.huawei.uikit.phone.hwimageview.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.uikit.phone.hwunifiedinteract.widget.HwCompoundEventDetector;

/* JADX INFO: loaded from: classes45.dex */
public class HwImageView extends com.huawei.uikit.hwimageview.widget.HwImageView {
    public HwImageView(Context context) {
        this(context, null);
    }

    public HwImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.uikit.hwimageview.widget.HwImageView
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HwCompoundEventDetector e() {
        return new HwCompoundEventDetector(getContext());
    }

    public HwImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
