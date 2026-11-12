package com.huawei.uikit.phone.hwswiperefreshlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.uikit.phone.hwunifiedinteract.widget.HwGenericEventDetector;

/* JADX INFO: loaded from: classes20.dex */
public class HwSwipeRefreshLayout extends com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout {
    public HwSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public HwSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public HwGenericEventDetector c() {
        return new HwGenericEventDetector(getContext());
    }

    public HwSwipeRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
