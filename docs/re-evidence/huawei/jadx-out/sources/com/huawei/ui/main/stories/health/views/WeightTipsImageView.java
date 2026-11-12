package com.huawei.ui.main.stories.health.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.main.R;
import com.huawei.uikit.hwbubblelayout.widget.HwBubbleLayout;
import defpackage.qrs;

/* JADX INFO: loaded from: classes43.dex */
public class WeightTipsImageView extends HealthImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28192b;
    private static final int e = BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f28190a = BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.weight_tips_bubble_margin);
    private static final int d = BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.health_common_16dp);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f28191c = BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.health_common_50dp);

    public WeightTipsImageView(Context context) {
        super(context);
        c();
    }

    public WeightTipsImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public WeightTipsImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    public void setTips(String str) {
        this.f28192b = str;
    }

    protected void c() {
        setOnClickListener(new View.OnClickListener() { // from class: ver
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.weight_tips_bubble_layout, (ViewGroup) null);
        if (viewInflate instanceof HwBubbleLayout) {
            HwBubbleLayout hwBubbleLayout = (HwBubbleLayout) viewInflate;
            PopupWindow popupWindow = new PopupWindow(getContext());
            View viewFindViewById = hwBubbleLayout.findViewById(R.id.tips_content);
            if ((viewFindViewById instanceof HealthTextView) && !TextUtils.isEmpty(this.f28192b)) {
                ((HealthTextView) viewFindViewById).setText(this.f28192b);
            }
            popupWindow.setContentView(hwBubbleLayout);
            popupWindow.setBackgroundDrawable(null);
            popupWindow.setFocusable(true);
            popupWindow.setClippingEnabled(false);
            hwBubbleLayout.measure(0, 0);
            int measuredWidth = hwBubbleLayout.getMeasuredWidth();
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            hwBubbleLayout.setArrowDirection(HwBubbleLayout.ArrowDirection.TOP);
            hwBubbleLayout.setArrowPositionCenter(false);
            if (iArr[0] < qrs.q() / 2) {
                int i = d;
                hwBubbleLayout.setArrowPosition(i);
                int i2 = (-getWidth()) / 2;
                popupWindow.showAsDropDown(this, (i2 - i) - f28190a, e);
                return;
            }
            int i3 = f28190a;
            int width = getWidth() / 2;
            int i4 = f28191c;
            hwBubbleLayout.setArrowPosition(((measuredWidth - i3) - width) - i4);
            popupWindow.showAsDropDown(this, (-measuredWidth) + i4, e);
        }
    }
}
