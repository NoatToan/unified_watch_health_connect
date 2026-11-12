package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.perf.util.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/DynamicHeightAdaptedTouchSwitchViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", Constants.ENABLE_DISABLE, "", "setTouchEnabled", "(Z)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DynamicHeightAdaptedTouchSwitchViewPager extends ViewPager {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f47401g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public View f47402h1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicHeightAdaptedTouchSwitchViewPager(Context context) {
        super(context);
        context.getClass();
        this.f47401g1 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i14) {
        return this.f47401g1 && super.canScrollHorizontally(i14);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        View view2 = this.f47402h1;
        if (view2 == null) {
            super.onMeasure(i14, i15);
            return;
        }
        view2.getClass();
        view2.measure(i14, View.MeasureSpec.makeMeasureSpec(0, 0));
        View view3 = this.f47402h1;
        view3.getClass();
        int measuredHeight = view3.getMeasuredHeight();
        int i16 = measuredHeight > 0 ? measuredHeight : 0;
        if (i16 > 0) {
            super.onMeasure(i14, View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
        }
    }

    public final void setTouchEnabled(boolean isEnabled) {
        this.f47401g1 = isEnabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicHeightAdaptedTouchSwitchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f47401g1 = true;
    }
}
