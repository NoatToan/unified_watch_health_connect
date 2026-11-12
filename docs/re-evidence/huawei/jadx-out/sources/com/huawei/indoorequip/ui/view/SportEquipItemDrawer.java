package com.huawei.indoorequip.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.huawei.hidatamanager.util.LogUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;

/* JADX INFO: loaded from: classes12.dex */
public class SportEquipItemDrawer extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f17826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f17828c;
    private float d;
    private int e;
    private int h;

    public SportEquipItemDrawer(Context context) {
        this(context, null);
    }

    public SportEquipItemDrawer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SportEquipItemDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 2;
        this.h = 0;
        e(context, attributeSet);
        this.f17827b = LanguageUtil.ba(context);
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (attributeSet == null || context == null) {
            return;
        }
        if (!(context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager)) {
            LogUtils.e("Track_IDEQ_SportEquipItemDrawer", "object is invalid type");
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SportEquipItemDrawer);
        try {
            int i = qrs.i(context);
            this.e = typedArrayObtainStyledAttributes.getInteger(R.styleable.SportEquipItemDrawer_columns, 2);
            this.f17828c = typedArrayObtainStyledAttributes.getFloat(R.styleable.SportEquipItemDrawer_sport_item_height, context.getResources().getDimensionPixelSize(R.dimen.wheelview_width));
            float f = typedArrayObtainStyledAttributes.getFloat(R.styleable.SportEquipItemDrawer_sport_item_width, i / 2.0f);
            this.f17826a = f;
            this.d = f;
            if (qrs.af(context)) {
                this.f17826a = (i - (qrs.d(context, 90.0f) * 2)) / 2.0f;
                this.f17828c = qrs.d(context, 80.0f);
            }
        } catch (Resources.NotFoundException e) {
            LogUtil.e("Track_IDEQ_SportEquipItemDrawer", "handleCustomAttrs notFoundException", LogAnonymous.b(e));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void b(int i) {
        this.e = i;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        measureChildren(i, i2);
        int childCount = getChildCount();
        int measuredHeight = 0;
        if (childCount > 0) {
            int measuredWidth = this.h;
            if (measuredWidth == 0) {
                measuredWidth = 0;
                for (int i4 = 0; i4 < this.e; i4++) {
                    measuredWidth += getChildAt(i4).getMeasuredWidth();
                }
            }
            int i5 = this.e;
            if (i5 < 1) {
                LogUtils.e("Track_IDEQ_SportEquipItemDrawer", "mNumberOfColumns is error");
                return;
            }
            int i6 = childCount / i5;
            if (childCount % i5 != 0) {
                i6++;
            }
            int measuredHeight2 = getChildAt(0).getMeasuredHeight() * i6;
            if (this.e == 1) {
                for (int i7 = 0; i7 < childCount; i7++) {
                    measuredHeight += getChildAt(i7).getMeasuredHeight();
                }
            } else {
                measuredHeight = measuredHeight2;
            }
            i3 = measuredHeight;
            measuredHeight = measuredWidth;
        } else {
            i3 = 0;
        }
        setMeasuredDimension(measuredHeight, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        if (this.e < 1) {
            LogUtils.e("Track_IDEQ_SportEquipItemDrawer", "mNumberOfColumns is error");
            return;
        }
        LogUtils.d("Track_IDEQ_SportEquipItemDrawer", "layout " + childCount);
        boolean z2 = this.f17827b && childCount % (this.e + 1) == 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            int measuredWidth2 = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i6 >= measuredWidth || this.e == 1) {
                i7 += i8;
                i6 = 0;
                i8 = 0;
            }
            int i9 = measuredWidth2 + i6;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
            if (i5 != childCount - 1 || !z2) {
                childAt.layout(i6, i7, i9, measuredHeight + i7);
            }
            i5++;
            i6 = i9;
        }
        if (z2) {
            View childAt2 = getChildAt(childCount - 1);
            childAt2.layout(measuredWidth - childAt2.getMeasuredWidth(), i7, measuredWidth, childAt2.getMeasuredHeight() + i7);
        }
    }

    public float getItemWidth() {
        return this.f17826a;
    }

    public float getRopeSkipItemWidth() {
        return this.d;
    }

    public float getItemHeight() {
        return this.f17828c;
    }
}
