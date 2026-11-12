package com.scwang.smartrefresh.layout.footer;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.extractor.mp3.b;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.internal.ProgressDrawable;
import com.scwang.smartrefresh.layout.internal.pathview.PathsDrawable;
import com.scwang.smartrefresh.layout.util.DensityUtil;

/* JADX INFO: loaded from: classes18.dex */
public class ClassicsFooter extends RelativeLayout implements RefreshFooter {
    public static String REFRESH_FOOTER_ALLLOADED = "全部加载完成";
    public static String REFRESH_FOOTER_FAILED = "加载失败";
    public static String REFRESH_FOOTER_FINISH = "加载完成";
    public static String REFRESH_FOOTER_LOADING = "正在加载...";
    public static String REFRESH_FOOTER_PULLUP = "上拉加载更多";
    public static String REFRESH_FOOTER_REFRESHING = "正在刷新...";
    public static String REFRESH_FOOTER_RELEASE = "释放立即加载";
    public PathsDrawable mArrowDrawable;
    public ImageView mArrowView;
    public int mBackgroundColor;
    public int mFinishDuration;
    public boolean mLoadmoreFinished;
    public int mPaddingBottom;
    public int mPaddingTop;
    public ProgressDrawable mProgressDrawable;
    public ImageView mProgressView;
    public RefreshKernel mRefreshKernel;
    public SpinnerStyle mSpinnerStyle;
    public TextView mTitleText;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RefreshState.PullToUpLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RefreshState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RefreshState.ReleaseToLoad.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RefreshState.Refreshing.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ClassicsFooter(Context context) {
        super(context);
        this.mSpinnerStyle = SpinnerStyle.Translate;
        this.mFinishDuration = 500;
        this.mBackgroundColor = 0;
        this.mLoadmoreFinished = false;
        this.mPaddingTop = 20;
        this.mPaddingBottom = 20;
        a(context, null, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        DensityUtil densityUtil = new DensityUtil();
        TextView textView = new TextView(context);
        this.mTitleText = textView;
        textView.setId(R.id.widget_frame);
        this.mTitleText.setTextColor(-10066330);
        this.mTitleText.setText(REFRESH_FOOTER_PULLUP);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.mTitleText, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(densityUtil.dip2px(20.0f), densityUtil.dip2px(20.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, R.id.widget_frame);
        ImageView imageView = new ImageView(context);
        this.mArrowView = imageView;
        addView(imageView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((ViewGroup.LayoutParams) layoutParams2);
        layoutParams3.addRule(15);
        layoutParams3.addRule(0, R.id.widget_frame);
        ImageView imageView2 = new ImageView(context);
        this.mProgressView = imageView2;
        imageView2.animate().setInterpolator(new LinearInterpolator());
        addView(this.mProgressView, layoutParams3);
        if (isInEditMode()) {
            this.mArrowView.setVisibility(8);
        } else {
            this.mProgressView.setVisibility(8);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlDrawableMarginRight, densityUtil.dip2px(20.0f));
        layoutParams3.rightMargin = dimensionPixelSize;
        layoutParams2.rightMargin = dimensionPixelSize;
        int i2 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableArrowSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams2.height);
        int i3 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableProgressSize;
        layoutParams3.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams3.width);
        layoutParams3.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams3.height);
        int i4 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i4, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i4, layoutParams2.height);
        layoutParams3.width = typedArrayObtainStyledAttributes.getLayoutDimension(i4, layoutParams3.width);
        layoutParams3.height = typedArrayObtainStyledAttributes.getLayoutDimension(i4, layoutParams3.height);
        this.mFinishDuration = typedArrayObtainStyledAttributes.getInt(com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlFinishDuration, this.mFinishDuration);
        this.mSpinnerStyle = SpinnerStyle.values()[typedArrayObtainStyledAttributes.getInt(com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlClassicsSpinnerStyle, this.mSpinnerStyle.ordinal())];
        int i5 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            this.mArrowView.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i5));
        } else {
            PathsDrawable pathsDrawable = new PathsDrawable();
            this.mArrowDrawable = pathsDrawable;
            pathsDrawable.parserColors(-10066330);
            this.mArrowDrawable.parserPaths("M20,12l-1.41,-1.41L13,16.17V4h-2v12.17l-5.58,-5.59L4,12l8,8 8,-8z");
            this.mArrowView.setImageDrawable(this.mArrowDrawable);
        }
        int i6 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            this.mProgressView.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i6));
        } else {
            ProgressDrawable progressDrawable = new ProgressDrawable();
            this.mProgressDrawable = progressDrawable;
            progressDrawable.setColor(-10066330);
            this.mProgressView.setImageDrawable(this.mProgressDrawable);
        }
        int i7 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            this.mTitleText.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, DensityUtil.dp2px(16.0f)));
        } else {
            this.mTitleText.setTextSize(16.0f);
        }
        int i8 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            setPrimaryColor(typedArrayObtainStyledAttributes.getColor(i8, 0));
        }
        int i9 = com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            setAccentColor(typedArrayObtainStyledAttributes.getColor(i9, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        if (getPaddingTop() != 0) {
            if (getPaddingBottom() != 0) {
                this.mPaddingTop = getPaddingTop();
                this.mPaddingBottom = getPaddingBottom();
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.mPaddingTop = paddingTop;
            int paddingRight = getPaddingRight();
            int iDip2px = densityUtil.dip2px(20.0f);
            this.mPaddingBottom = iDip2px;
            setPadding(paddingLeft, paddingTop, paddingRight, iDip2px);
            return;
        }
        if (getPaddingBottom() == 0) {
            int paddingLeft2 = getPaddingLeft();
            int iDip2px2 = densityUtil.dip2px(20.0f);
            this.mPaddingTop = iDip2px2;
            int paddingRight2 = getPaddingRight();
            int iDip2px3 = densityUtil.dip2px(20.0f);
            this.mPaddingBottom = iDip2px3;
            setPadding(paddingLeft2, iDip2px2, paddingRight2, iDip2px3);
            return;
        }
        int paddingLeft3 = getPaddingLeft();
        int iDip2px4 = densityUtil.dip2px(20.0f);
        this.mPaddingTop = iDip2px4;
        int paddingRight3 = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        this.mPaddingBottom = paddingBottom;
        setPadding(paddingLeft3, iDip2px4, paddingRight3, paddingBottom);
    }

    public ImageView getArrowView() {
        return this.mArrowView;
    }

    public ImageView getProgressView() {
        return this.mProgressView;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public SpinnerStyle getSpinnerStyle() {
        return this.mSpinnerStyle;
    }

    public TextView getTitleText() {
        return this.mTitleText;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NonNull
    public View getView() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(RefreshLayout refreshLayout, boolean z) {
        if (this.mLoadmoreFinished) {
            return 0;
        }
        ProgressDrawable progressDrawable = this.mProgressDrawable;
        if (progressDrawable != null) {
            progressDrawable.stop();
        } else {
            this.mProgressView.animate().rotation(0.0f).setDuration(300L);
        }
        this.mProgressView.setVisibility(8);
        if (z) {
            this.mTitleText.setText(REFRESH_FOOTER_FINISH);
        } else {
            this.mTitleText.setText(REFRESH_FOOTER_FAILED);
        }
        return this.mFinishDuration;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onHorizontalDrag(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(RefreshKernel refreshKernel, int i, int i2) {
        this.mRefreshKernel = refreshKernel;
        refreshKernel.requestDrawBackgoundForFooter(this.mBackgroundColor);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
        } else {
            setPadding(getPaddingLeft(), this.mPaddingTop, getPaddingRight(), this.mPaddingBottom);
        }
        super.onMeasure(i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshFooter
    public void onPullReleasing(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshFooter
    public void onPullingUp(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onStartAnimator(RefreshLayout refreshLayout, int i, int i2) {
        if (this.mLoadmoreFinished) {
            return;
        }
        this.mProgressView.setVisibility(0);
        ProgressDrawable progressDrawable = this.mProgressDrawable;
        if (progressDrawable != null) {
            progressDrawable.start();
        } else {
            this.mProgressView.animate().rotation(36000.0f).setDuration(b.e);
        }
    }

    @Override // com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2) {
        if (this.mLoadmoreFinished) {
            return;
        }
        int i = a.a[refreshState2.ordinal()];
        if (i == 1) {
            this.mArrowView.setVisibility(0);
        } else if (i != 2) {
            if (i == 3) {
                this.mArrowView.setVisibility(8);
                this.mTitleText.setText(REFRESH_FOOTER_LOADING);
                return;
            } else if (i == 4) {
                this.mTitleText.setText(REFRESH_FOOTER_RELEASE);
                this.mArrowView.animate().rotation(0.0f);
                return;
            } else {
                if (i != 5) {
                    return;
                }
                this.mTitleText.setText(REFRESH_FOOTER_REFRESHING);
                this.mProgressView.setVisibility(8);
                this.mArrowView.setVisibility(8);
                return;
            }
        }
        this.mTitleText.setText(REFRESH_FOOTER_PULLUP);
        this.mArrowView.animate().rotation(180.0f);
    }

    public ClassicsFooter setAccentColor(@ColorInt int i) {
        this.mTitleText.setTextColor(i);
        ProgressDrawable progressDrawable = this.mProgressDrawable;
        if (progressDrawable != null) {
            progressDrawable.setColor(i);
        }
        PathsDrawable pathsDrawable = this.mArrowDrawable;
        if (pathsDrawable != null) {
            pathsDrawable.parserColors(i);
        }
        return this;
    }

    public ClassicsFooter setAccentColorId(@ColorRes int i) {
        setAccentColor(ContextCompat.getColor(getContext(), i));
        return this;
    }

    public ClassicsFooter setArrowBitmap(Bitmap bitmap) {
        this.mArrowDrawable = null;
        this.mArrowView.setImageBitmap(bitmap);
        return this;
    }

    public ClassicsFooter setArrowDrawable(Drawable drawable) {
        this.mArrowDrawable = null;
        this.mArrowView.setImageDrawable(drawable);
        return this;
    }

    public ClassicsFooter setArrowResource(@DrawableRes int i) {
        this.mArrowDrawable = null;
        this.mArrowView.setImageResource(i);
        return this;
    }

    public ClassicsFooter setDrawableArrowSize(float f) {
        return setDrawableArrowSizePx(DensityUtil.dp2px(f));
    }

    public ClassicsFooter setDrawableArrowSizePx(int i) {
        ViewGroup.LayoutParams layoutParams = this.mArrowView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.mArrowView.setLayoutParams(layoutParams);
        return this;
    }

    public ClassicsFooter setDrawableMarginRight(float f) {
        return setDrawableMarginRightPx(DensityUtil.dp2px(f));
    }

    public ClassicsFooter setDrawableMarginRightPx(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mArrowView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mProgressView.getLayoutParams();
        marginLayoutParams2.rightMargin = i;
        marginLayoutParams.rightMargin = i;
        this.mArrowView.setLayoutParams(marginLayoutParams);
        this.mProgressView.setLayoutParams(marginLayoutParams2);
        return this;
    }

    public ClassicsFooter setDrawableProgressSize(float f) {
        return setDrawableProgressSizePx(DensityUtil.dp2px(f));
    }

    public ClassicsFooter setDrawableProgressSizePx(int i) {
        ViewGroup.LayoutParams layoutParams = this.mProgressView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.mProgressView.setLayoutParams(layoutParams);
        return this;
    }

    public ClassicsFooter setDrawableSize(float f) {
        return setDrawableSizePx(DensityUtil.dp2px(f));
    }

    public ClassicsFooter setDrawableSizePx(int i) {
        ViewGroup.LayoutParams layoutParams = this.mArrowView.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.mProgressView.getLayoutParams();
        layoutParams2.width = i;
        layoutParams.width = i;
        layoutParams2.height = i;
        layoutParams.height = i;
        this.mArrowView.setLayoutParams(layoutParams);
        this.mProgressView.setLayoutParams(layoutParams2);
        return this;
    }

    public ClassicsFooter setFinishDuration(int i) {
        this.mFinishDuration = i;
        return this;
    }

    public boolean setLoadmoreFinished(boolean z) {
        if (this.mLoadmoreFinished == z) {
            return true;
        }
        this.mLoadmoreFinished = z;
        if (z) {
            this.mTitleText.setText(REFRESH_FOOTER_ALLLOADED);
        } else {
            this.mTitleText.setText(REFRESH_FOOTER_PULLUP);
        }
        ProgressDrawable progressDrawable = this.mProgressDrawable;
        if (progressDrawable != null) {
            progressDrawable.stop();
        } else {
            this.mProgressView.animate().rotation(0.0f).setDuration(300L);
        }
        this.mProgressView.setVisibility(8);
        this.mArrowView.setVisibility(8);
        return true;
    }

    public ClassicsFooter setPrimaryColor(@ColorInt int i) {
        this.mBackgroundColor = i;
        setBackgroundColor(i);
        RefreshKernel refreshKernel = this.mRefreshKernel;
        if (refreshKernel != null) {
            refreshKernel.requestDrawBackgoundForFooter(this.mBackgroundColor);
        }
        return this;
    }

    public ClassicsFooter setPrimaryColorId(@ColorRes int i) {
        setPrimaryColor(ContextCompat.getColor(getContext(), i));
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (this.mSpinnerStyle != SpinnerStyle.FixedBehind || iArr.length <= 0) {
            return;
        }
        if (!(getBackground() instanceof BitmapDrawable)) {
            setPrimaryColor(iArr[0]);
        }
        if (iArr.length > 1) {
            setAccentColor(iArr[1]);
        } else {
            setAccentColor(iArr[0] == -1 ? -10066330 : -1);
        }
    }

    public ClassicsFooter setProgressBitmap(Bitmap bitmap) {
        this.mProgressDrawable = null;
        this.mProgressView.setImageBitmap(bitmap);
        return this;
    }

    public ClassicsFooter setProgressDrawable(Drawable drawable) {
        this.mProgressDrawable = null;
        this.mProgressView.setImageDrawable(drawable);
        return this;
    }

    public ClassicsFooter setProgressResource(@DrawableRes int i) {
        this.mProgressDrawable = null;
        this.mProgressView.setImageResource(i);
        return this;
    }

    public ClassicsFooter setSpinnerStyle(SpinnerStyle spinnerStyle) {
        this.mSpinnerStyle = spinnerStyle;
        return this;
    }

    public ClassicsFooter setTextSizeTitle(float f) {
        this.mTitleText.setTextSize(f);
        RefreshKernel refreshKernel = this.mRefreshKernel;
        if (refreshKernel != null) {
            refreshKernel.requestRemeasureHeightForFooter();
        }
        return this;
    }

    public ClassicsFooter setTextSizeTitle(int i, float f) {
        this.mTitleText.setTextSize(i, f);
        RefreshKernel refreshKernel = this.mRefreshKernel;
        if (refreshKernel != null) {
            refreshKernel.requestRemeasureHeightForFooter();
        }
        return this;
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSpinnerStyle = SpinnerStyle.Translate;
        this.mFinishDuration = 500;
        this.mBackgroundColor = 0;
        this.mLoadmoreFinished = false;
        this.mPaddingTop = 20;
        this.mPaddingBottom = 20;
        a(context, attributeSet, 0);
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSpinnerStyle = SpinnerStyle.Translate;
        this.mFinishDuration = 500;
        this.mBackgroundColor = 0;
        this.mLoadmoreFinished = false;
        this.mPaddingTop = 20;
        this.mPaddingBottom = 20;
        a(context, attributeSet, i);
    }
}
