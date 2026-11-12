package com.huami.module.homepage.sync.view.refresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.module.homepage.R;
import com.huami.tools.analytics.DbUtils;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshContent;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.constant.DimensionStatus;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.squareup.picasso.u;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0019J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014J0\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/huami/module/homepage/sync/view/refresh/HomeRefreshLayout;", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "a", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "", u.q, "l", "t", "r", "b", "onLayout", LogUtil.I, "mRealHeaderHeight", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class HomeRefreshLayout extends SmartRefreshLayout {

    @Deprecated
    public static final int DEFAULT_HEADER_HEIGHT = 100;

    @NotNull
    private static final a c = new a(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mRealHeaderHeight;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/sync/view/refresh/HomeRefreshLayout$a", "", "", "DEFAULT_HEADER_HEIGHT", LogUtil.I, "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HomeRefreshLayout(@NotNull Context context) {
        this(context, null);
    }

    private final void a(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.HomeRefreshLayout);
        this.mRealHeaderHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.HomeRefreshLayout_srlRealHeaderHeight, 100);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.scwang.smartrefresh.layout.SmartRefreshLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int iCoerceAtLeast;
        int iCoerceAtLeast2;
        RefreshHeader refreshHeader;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        boolean z = isInEditMode() && this.mEnablePreviewInEditMode;
        RefreshContent refreshContent = this.mRefreshContent;
        if (refreshContent != null) {
            ViewGroup.LayoutParams layoutParams = refreshContent.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.scwang.smartrefresh.layout.SmartRefreshLayout.LayoutParams");
            SmartRefreshLayout.LayoutParams layoutParams2 = (SmartRefreshLayout.LayoutParams) layoutParams;
            int i = paddingLeft + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            int i2 = paddingTop + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            int measuredWidth = this.mRefreshContent.getMeasuredWidth() + i;
            int measuredHeight = this.mRefreshContent.getMeasuredHeight() + i2;
            if (z && (refreshHeader = this.mRefreshHeader) != null && (this.mEnableHeaderTranslationContent || refreshHeader.getSpinnerStyle() == SpinnerStyle.FixedBehind)) {
                int i3 = this.mHeaderHeight;
                i2 += i3;
                measuredHeight += i3;
            }
            this.mRefreshContent.layout(i, i2, measuredWidth, measuredHeight);
        }
        RefreshHeader refreshHeader2 = this.mRefreshHeader;
        if (refreshHeader2 != null) {
            View view = refreshHeader2.getView();
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type com.scwang.smartrefresh.layout.SmartRefreshLayout.LayoutParams");
            SmartRefreshLayout.LayoutParams layoutParams4 = (SmartRefreshLayout.LayoutParams) layoutParams3;
            int i4 = ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin;
            int measuredHeight2 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
            int measuredWidth2 = view.getMeasuredWidth() + i4;
            int measuredHeight3 = view.getMeasuredHeight() + measuredHeight2;
            if (!z) {
                if (this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.Translate) {
                    measuredHeight2 = (measuredHeight2 - view.getMeasuredHeight()) + e.coerceAtLeast(0, this.mSpinner);
                    iCoerceAtLeast2 = view.getMeasuredHeight();
                } else if (this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.Scale) {
                    iCoerceAtLeast2 = e.coerceAtLeast(e.coerceAtLeast(0, this.mSpinner) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin, 0);
                }
                measuredHeight3 = measuredHeight2 + iCoerceAtLeast2;
            }
            view.layout(i4, measuredHeight2, measuredWidth2, measuredHeight3);
        }
        RefreshFooter refreshFooter = this.mRefreshFooter;
        if (refreshFooter != null) {
            View view2 = refreshFooter.getView();
            ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type com.scwang.smartrefresh.layout.SmartRefreshLayout.LayoutParams");
            SmartRefreshLayout.LayoutParams layoutParams6 = (SmartRefreshLayout.LayoutParams) layoutParams5;
            SpinnerStyle spinnerStyle = this.mRefreshFooter.getSpinnerStyle();
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin;
            int measuredHeight4 = ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin + getMeasuredHeight();
            if (!z && spinnerStyle != SpinnerStyle.FixedFront && spinnerStyle != SpinnerStyle.FixedBehind) {
                if (spinnerStyle == SpinnerStyle.Scale || spinnerStyle == SpinnerStyle.Translate) {
                    iCoerceAtLeast = e.coerceAtLeast(e.coerceAtLeast(-this.mSpinner, 0) - ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin, 0);
                }
                view2.layout(i5, measuredHeight4, view2.getMeasuredWidth() + i5, view2.getMeasuredHeight() + measuredHeight4);
            }
            iCoerceAtLeast = this.mFooterHeight;
            measuredHeight4 -= iCoerceAtLeast;
            view2.layout(i5, measuredHeight4, view2.getMeasuredWidth() + i5, view2.getMeasuredHeight() + measuredHeight4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    @Override // com.scwang.smartrefresh.layout.SmartRefreshLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredHeight;
        RefreshFooter refreshFooter;
        RefreshHeader refreshHeader;
        int i = 0;
        boolean z = isInEditMode() && this.mEnablePreviewInEditMode;
        RefreshHeader refreshHeader2 = this.mRefreshHeader;
        if (refreshHeader2 != null) {
            View view = refreshHeader2.getView();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.scwang.smartrefresh.layout.SmartRefreshLayout.LayoutParams");
            SmartRefreshLayout.LayoutParams layoutParams2 = (SmartRefreshLayout.LayoutParams) layoutParams;
            view.measure(ViewGroup.getChildMeasureSpec(widthMeasureSpec, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).width), View.MeasureSpec.makeMeasureSpec(e.coerceAtLeast(this.mRealHeaderHeight - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, 0), 1073741824));
            DimensionStatus dimensionStatus = this.mHeaderHeightStatus;
            if (!dimensionStatus.notifyed) {
                this.mHeaderHeightStatus = dimensionStatus.notifyed();
                this.mRefreshHeader.onInitialized(this.mKernel, this.mHeaderHeight, this.mHeaderExtendHeight);
            }
            if (z) {
                measuredHeight = view.getMeasuredHeight() + 0;
            } else {
                measuredHeight = 0;
            }
        } else {
            measuredHeight = 0;
        }
        RefreshContent refreshContent = this.mRefreshContent;
        if (refreshContent != null) {
            ViewGroup.LayoutParams layoutParams3 = refreshContent.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type com.scwang.smartrefresh.layout.SmartRefreshLayout.LayoutParams");
            SmartRefreshLayout.LayoutParams layoutParams4 = (SmartRefreshLayout.LayoutParams) layoutParams3;
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(widthMeasureSpec, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams4).width);
            int paddingTop = getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + ((z && (refreshHeader = this.mRefreshHeader) != null && (this.mEnableHeaderTranslationContent || refreshHeader.getSpinnerStyle() == SpinnerStyle.FixedBehind)) ? this.mHeaderHeight : 0);
            if (z && (refreshFooter = this.mRefreshFooter) != null && (this.mEnableFooterTranslationContent || refreshFooter.getSpinnerStyle() == SpinnerStyle.FixedBehind)) {
                i = this.mFooterHeight;
            }
            this.mRefreshContent.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(heightMeasureSpec, paddingTop + i, ((ViewGroup.MarginLayoutParams) layoutParams4).height));
            this.mRefreshContent.onInitialHeaderAndFooter(this.mHeaderHeight, this.mFooterHeight);
            measuredHeight += this.mRefreshContent.getMeasuredHeight();
        }
        setMeasuredDimension(ViewGroup.resolveSize(getSuggestedMinimumWidth(), widthMeasureSpec), ViewGroup.resolveSize(measuredHeight, heightMeasureSpec));
        this.mLastTouchX = getMeasuredWidth() >> 1;
    }

    public HomeRefreshLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HomeRefreshLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
