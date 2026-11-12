package com.scwang.smartrefresh.layout.header;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.extractor.mp3.b;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.internal.ProgressDrawable;
import com.scwang.smartrefresh.layout.internal.pathview.PathsDrawable;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class ClassicsHeader extends RelativeLayout implements RefreshHeader {
    public static String REFRESH_HEADER_FAILED = "刷新失败";
    public static String REFRESH_HEADER_FINISH = "刷新完成";
    public static String REFRESH_HEADER_LASTTIME = "上次更新 M-d HH:mm";
    public static String REFRESH_HEADER_LOADING = "正在加载...";
    public static String REFRESH_HEADER_PULLDOWN = "下拉可以刷新";
    public static String REFRESH_HEADER_REFRESHING = "正在刷新...";
    public static String REFRESH_HEADER_RELEASE = "释放立即刷新";
    public String KEY_LAST_UPDATE_TIME;
    public PathsDrawable mArrowDrawable;
    public ImageView mArrowView;
    public int mBackgroundColor;
    public boolean mEnableLastTime;
    public int mFinishDuration;
    public DateFormat mFormat;
    public Date mLastTime;
    public TextView mLastUpdateText;
    public int mPaddingBottom;
    public int mPaddingTop;
    public ProgressDrawable mProgressDrawable;
    public ImageView mProgressView;
    public RefreshKernel mRefreshKernel;
    public SharedPreferences mShared;
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
                a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RefreshState.ReleaseToRefresh.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RefreshState.Loading.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ClassicsHeader(Context context) {
        super(context);
        this.KEY_LAST_UPDATE_TIME = "LAST_UPDATE_TIME";
        this.mSpinnerStyle = SpinnerStyle.Translate;
        this.mFormat = new SimpleDateFormat(REFRESH_HEADER_LASTTIME, Locale.CHINA);
        this.mFinishDuration = 500;
        this.mPaddingTop = 20;
        this.mPaddingBottom = 20;
        this.mEnableLastTime = true;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        DensityUtil densityUtil = new DensityUtil();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.widget_frame);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.mTitleText = textView;
        textView.setText(REFRESH_HEADER_PULLDOWN);
        this.mTitleText.setTextColor(-10066330);
        TextView textView2 = new TextView(context);
        this.mLastUpdateText = textView2;
        textView2.setTextColor(-8618884);
        linearLayout.addView(this.mTitleText, new LinearLayout.LayoutParams(-2, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        linearLayout.addView(this.mLastUpdateText, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        addView(linearLayout, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(densityUtil.dip2px(20.0f), densityUtil.dip2px(20.0f));
        layoutParams3.addRule(15);
        layoutParams3.addRule(0, R.id.widget_frame);
        ImageView imageView = new ImageView(context);
        this.mArrowView = imageView;
        addView(imageView, layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((ViewGroup.LayoutParams) layoutParams3);
        layoutParams4.addRule(15);
        layoutParams4.addRule(0, R.id.widget_frame);
        ImageView imageView2 = new ImageView(context);
        this.mProgressView = imageView2;
        imageView2.animate().setInterpolator(new LinearInterpolator());
        addView(this.mProgressView, layoutParams4);
        if (isInEditMode()) {
            this.mArrowView.setVisibility(8);
            this.mTitleText.setText(REFRESH_HEADER_REFRESHING);
        } else {
            this.mProgressView.setVisibility(8);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader);
        layoutParams.topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlTextTimeMarginTop, densityUtil.dip2px(0.0f));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.scwang.smartrefresh.layout.R.styleable.ClassicsFooter_srlDrawableMarginRight, densityUtil.dip2px(20.0f));
        layoutParams4.rightMargin = dimensionPixelSize;
        layoutParams3.rightMargin = dimensionPixelSize;
        int i = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableArrowSize;
        layoutParams3.width = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams3.width);
        layoutParams3.height = typedArrayObtainStyledAttributes.getLayoutDimension(i, layoutParams3.height);
        int i2 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableProgressSize;
        layoutParams4.width = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams4.width);
        layoutParams4.height = typedArrayObtainStyledAttributes.getLayoutDimension(i2, layoutParams4.height);
        int i3 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableSize;
        layoutParams3.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams3.width);
        layoutParams3.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams3.height);
        layoutParams4.width = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams4.width);
        layoutParams4.height = typedArrayObtainStyledAttributes.getLayoutDimension(i3, layoutParams4.height);
        this.mFinishDuration = typedArrayObtainStyledAttributes.getInt(com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlFinishDuration, this.mFinishDuration);
        this.mEnableLastTime = typedArrayObtainStyledAttributes.getBoolean(com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlEnableLastTime, this.mEnableLastTime);
        this.mSpinnerStyle = SpinnerStyle.values()[typedArrayObtainStyledAttributes.getInt(com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlClassicsSpinnerStyle, this.mSpinnerStyle.ordinal())];
        this.mLastUpdateText.setVisibility(this.mEnableLastTime ? 0 : 8);
        int i4 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.mArrowView.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i4));
        } else {
            PathsDrawable pathsDrawable = new PathsDrawable();
            this.mArrowDrawable = pathsDrawable;
            pathsDrawable.parserColors(-10066330);
            this.mArrowDrawable.parserPaths("M20,12l-1.41,-1.41L13,16.17V4h-2v12.17l-5.58,-5.59L4,12l8,8 8,-8z");
            this.mArrowView.setImageDrawable(this.mArrowDrawable);
        }
        int i5 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            this.mProgressView.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i5));
        } else {
            ProgressDrawable progressDrawable = new ProgressDrawable();
            this.mProgressDrawable = progressDrawable;
            progressDrawable.setColor(-10066330);
            this.mProgressView.setImageDrawable(this.mProgressDrawable);
        }
        int i6 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            this.mTitleText.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, DensityUtil.dp2px(16.0f)));
        } else {
            this.mTitleText.setTextSize(16.0f);
        }
        int i7 = com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlTextSizeTime;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            this.mLastUpdateText.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, DensityUtil.dp2px(12.0f)));
        } else {
            this.mLastUpdateText.setTextSize(12.0f);
        }
        int color = typedArrayObtainStyledAttributes.getColor(com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlPrimaryColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(com.scwang.smartrefresh.layout.R.styleable.ClassicsHeader_srlAccentColor, 0);
        if (color != 0) {
            if (color2 != 0) {
                setPrimaryColors(color, color2);
            } else {
                setPrimaryColors(color);
            }
        } else if (color2 != 0) {
            setPrimaryColors(0, color2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (getPaddingTop() == 0) {
            if (getPaddingBottom() == 0) {
                int paddingLeft = getPaddingLeft();
                int iDip2px = densityUtil.dip2px(20.0f);
                this.mPaddingTop = iDip2px;
                int paddingRight = getPaddingRight();
                int iDip2px2 = densityUtil.dip2px(20.0f);
                this.mPaddingBottom = iDip2px2;
                setPadding(paddingLeft, iDip2px, paddingRight, iDip2px2);
            } else {
                int paddingLeft2 = getPaddingLeft();
                int iDip2px3 = densityUtil.dip2px(20.0f);
                this.mPaddingTop = iDip2px3;
                int paddingRight2 = getPaddingRight();
                int paddingBottom = getPaddingBottom();
                this.mPaddingBottom = paddingBottom;
                setPadding(paddingLeft2, iDip2px3, paddingRight2, paddingBottom);
            }
        } else if (getPaddingBottom() == 0) {
            int paddingLeft3 = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.mPaddingTop = paddingTop;
            int paddingRight3 = getPaddingRight();
            int iDip2px4 = densityUtil.dip2px(20.0f);
            this.mPaddingBottom = iDip2px4;
            setPadding(paddingLeft3, paddingTop, paddingRight3, iDip2px4);
        } else {
            this.mPaddingTop = getPaddingTop();
            this.mPaddingBottom = getPaddingBottom();
        }
        try {
            if ((context instanceof FragmentActivity) && (supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager()) != null && (fragments = supportFragmentManager.getFragments()) != null && fragments.size() > 0) {
                setLastUpdateTime(new Date());
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.KEY_LAST_UPDATE_TIME += context.getClass().getName();
        this.mShared = context.getSharedPreferences("ClassicsHeader", 0);
        setLastUpdateTime(new Date(this.mShared.getLong(this.KEY_LAST_UPDATE_TIME, System.currentTimeMillis())));
    }

    public ImageView getArrowView() {
        return this.mArrowView;
    }

    public TextView getLastUpdateText() {
        return this.mLastUpdateText;
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

    public int onFinish(RefreshLayout refreshLayout, boolean z) {
        ProgressDrawable progressDrawable = this.mProgressDrawable;
        if (progressDrawable != null) {
            progressDrawable.stop();
        } else {
            Object drawable = this.mProgressView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            } else {
                this.mProgressView.animate().rotation(0.0f).setDuration(300L);
            }
        }
        this.mProgressView.setVisibility(8);
        if (z) {
            this.mTitleText.setText(REFRESH_HEADER_FINISH);
            setLastUpdateTime(new Date());
        } else {
            this.mTitleText.setText(REFRESH_HEADER_FAILED);
        }
        return this.mFinishDuration;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onHorizontalDrag(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(RefreshKernel refreshKernel, int i, int i2) {
        this.mRefreshKernel = refreshKernel;
        refreshKernel.requestDrawBackgoundForHeader(this.mBackgroundColor);
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

    @Override // com.scwang.smartrefresh.layout.api.RefreshHeader
    public void onPullingDown(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshHeader
    public void onReleasing(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onStartAnimator(RefreshLayout refreshLayout, int i, int i2) {
        ProgressDrawable progressDrawable = this.mProgressDrawable;
        if (progressDrawable != null) {
            progressDrawable.start();
            return;
        }
        Object drawable = this.mProgressView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        } else {
            this.mProgressView.animate().rotation(36000.0f).setDuration(b.e);
        }
    }

    public void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2) {
        int i = a.a[refreshState2.ordinal()];
        if (i == 1) {
            this.mLastUpdateText.setVisibility(this.mEnableLastTime ? 0 : 8);
        } else if (i != 2) {
            if (i == 3) {
                this.mTitleText.setText(REFRESH_HEADER_REFRESHING);
                this.mProgressView.setVisibility(0);
                this.mArrowView.setVisibility(8);
                return;
            } else if (i == 4) {
                this.mTitleText.setText(REFRESH_HEADER_RELEASE);
                this.mArrowView.animate().rotation(180.0f);
                return;
            } else {
                if (i != 5) {
                    return;
                }
                this.mArrowView.setVisibility(8);
                this.mProgressView.setVisibility(8);
                this.mLastUpdateText.setVisibility(8);
                this.mTitleText.setText(REFRESH_HEADER_LOADING);
                return;
            }
        }
        this.mTitleText.setText(REFRESH_HEADER_PULLDOWN);
        this.mArrowView.setVisibility(0);
        this.mProgressView.setVisibility(8);
        this.mArrowView.animate().rotation(0.0f);
    }

    public ClassicsHeader setAccentColor(@ColorInt int i) {
        PathsDrawable pathsDrawable = this.mArrowDrawable;
        if (pathsDrawable != null) {
            pathsDrawable.parserColors(i);
        }
        ProgressDrawable progressDrawable = this.mProgressDrawable;
        if (progressDrawable != null) {
            progressDrawable.setColor(i);
        }
        this.mTitleText.setTextColor(i);
        this.mLastUpdateText.setTextColor((i & 16777215) | (-872415232));
        return this;
    }

    public ClassicsHeader setAccentColorId(@ColorRes int i) {
        setAccentColor(ContextCompat.getColor(getContext(), i));
        return this;
    }

    public ClassicsHeader setArrowBitmap(Bitmap bitmap) {
        this.mArrowDrawable = null;
        this.mArrowView.setImageBitmap(bitmap);
        return this;
    }

    public ClassicsHeader setArrowDrawable(Drawable drawable) {
        this.mArrowDrawable = null;
        this.mArrowView.setImageDrawable(drawable);
        return this;
    }

    public ClassicsHeader setArrowResource(@DrawableRes int i) {
        this.mArrowDrawable = null;
        this.mArrowView.setImageResource(i);
        return this;
    }

    public ClassicsHeader setDrawableArrowSize(float f) {
        return setDrawableArrowSizePx(DensityUtil.dp2px(f));
    }

    public ClassicsHeader setDrawableArrowSizePx(int i) {
        ViewGroup.LayoutParams layoutParams = this.mArrowView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.mArrowView.setLayoutParams(layoutParams);
        return this;
    }

    public ClassicsHeader setDrawableMarginRight(float f) {
        return setDrawableMarginRightPx(DensityUtil.dp2px(f));
    }

    public ClassicsHeader setDrawableMarginRightPx(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mArrowView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mProgressView.getLayoutParams();
        marginLayoutParams2.rightMargin = i;
        marginLayoutParams.rightMargin = i;
        this.mArrowView.setLayoutParams(marginLayoutParams);
        this.mProgressView.setLayoutParams(marginLayoutParams2);
        return this;
    }

    public ClassicsHeader setDrawableProgressSize(float f) {
        return setDrawableProgressSizePx(DensityUtil.dp2px(f));
    }

    public ClassicsHeader setDrawableProgressSizePx(int i) {
        ViewGroup.LayoutParams layoutParams = this.mProgressView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.mProgressView.setLayoutParams(layoutParams);
        return this;
    }

    public ClassicsHeader setDrawableSize(float f) {
        return setDrawableSizePx(DensityUtil.dp2px(f));
    }

    public ClassicsHeader setDrawableSizePx(int i) {
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

    public ClassicsHeader setEnableLastTime(boolean z) {
        this.mEnableLastTime = z;
        this.mLastUpdateText.setVisibility(z ? 0 : 8);
        RefreshKernel refreshKernel = this.mRefreshKernel;
        if (refreshKernel != null) {
            refreshKernel.requestRemeasureHeightForHeader();
        }
        return this;
    }

    public ClassicsHeader setFinishDuration(int i) {
        this.mFinishDuration = i;
        return this;
    }

    public ClassicsHeader setLastUpdateTime(Date date) {
        this.mLastTime = date;
        this.mLastUpdateText.setText(this.mFormat.format(date));
        if (this.mShared != null && !isInEditMode()) {
            this.mShared.edit().putLong(this.KEY_LAST_UPDATE_TIME, date.getTime()).apply();
        }
        return this;
    }

    public ClassicsHeader setPrimaryColor(@ColorInt int i) {
        this.mBackgroundColor = i;
        setBackgroundColor(i);
        RefreshKernel refreshKernel = this.mRefreshKernel;
        if (refreshKernel != null) {
            refreshKernel.requestDrawBackgoundForHeader(this.mBackgroundColor);
        }
        return this;
    }

    public ClassicsHeader setPrimaryColorId(@ColorRes int i) {
        setPrimaryColor(ContextCompat.getColor(getContext(), i));
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable)) {
                setPrimaryColor(iArr[0]);
            }
            if (iArr.length > 1) {
                setAccentColor(iArr[1]);
            } else {
                setAccentColor(iArr[0] == -1 ? -10066330 : -1);
            }
        }
    }

    public ClassicsHeader setProgressBitmap(Bitmap bitmap) {
        this.mProgressDrawable = null;
        this.mProgressView.setImageBitmap(bitmap);
        return this;
    }

    public ClassicsHeader setProgressDrawable(Drawable drawable) {
        this.mProgressDrawable = null;
        this.mProgressView.setImageDrawable(drawable);
        return this;
    }

    public ClassicsHeader setProgressResource(@DrawableRes int i) {
        this.mProgressDrawable = null;
        this.mProgressView.setImageResource(i);
        return this;
    }

    public ClassicsHeader setSpinnerStyle(SpinnerStyle spinnerStyle) {
        this.mSpinnerStyle = spinnerStyle;
        return this;
    }

    public ClassicsHeader setTextSizeTime(float f) {
        this.mLastUpdateText.setTextSize(f);
        RefreshKernel refreshKernel = this.mRefreshKernel;
        if (refreshKernel != null) {
            refreshKernel.requestRemeasureHeightForHeader();
        }
        return this;
    }

    public ClassicsHeader setTextSizeTitle(float f) {
        this.mTitleText.setTextSize(f);
        RefreshKernel refreshKernel = this.mRefreshKernel;
        if (refreshKernel != null) {
            refreshKernel.requestRemeasureHeightForHeader();
        }
        return this;
    }

    public ClassicsHeader setTextTimeMarginTop(float f) {
        return setTextTimeMarginTopPx(DensityUtil.dp2px(f));
    }

    public ClassicsHeader setTextTimeMarginTopPx(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mLastUpdateText.getLayoutParams();
        marginLayoutParams.topMargin = i;
        this.mLastUpdateText.setLayoutParams(marginLayoutParams);
        return this;
    }

    public ClassicsHeader setTimeFormat(DateFormat dateFormat) {
        this.mFormat = dateFormat;
        this.mLastUpdateText.setText(dateFormat.format(this.mLastTime));
        return this;
    }

    public ClassicsHeader setTextSizeTime(int i, float f) {
        this.mLastUpdateText.setTextSize(i, f);
        RefreshKernel refreshKernel = this.mRefreshKernel;
        if (refreshKernel != null) {
            refreshKernel.requestRemeasureHeightForHeader();
        }
        return this;
    }

    public ClassicsHeader setTextSizeTitle(int i, float f) {
        this.mTitleText.setTextSize(i, f);
        RefreshKernel refreshKernel = this.mRefreshKernel;
        if (refreshKernel != null) {
            refreshKernel.requestRemeasureHeightForHeader();
        }
        return this;
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.KEY_LAST_UPDATE_TIME = "LAST_UPDATE_TIME";
        this.mSpinnerStyle = SpinnerStyle.Translate;
        this.mFormat = new SimpleDateFormat(REFRESH_HEADER_LASTTIME, Locale.CHINA);
        this.mFinishDuration = 500;
        this.mPaddingTop = 20;
        this.mPaddingBottom = 20;
        this.mEnableLastTime = true;
        a(context, attributeSet);
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.KEY_LAST_UPDATE_TIME = "LAST_UPDATE_TIME";
        this.mSpinnerStyle = SpinnerStyle.Translate;
        this.mFormat = new SimpleDateFormat(REFRESH_HEADER_LASTTIME, Locale.CHINA);
        this.mFinishDuration = 500;
        this.mPaddingTop = 20;
        this.mPaddingBottom = 20;
        this.mEnableLastTime = true;
        a(context, attributeSet);
    }

    @RequiresApi(21)
    public ClassicsHeader(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.KEY_LAST_UPDATE_TIME = "LAST_UPDATE_TIME";
        this.mSpinnerStyle = SpinnerStyle.Translate;
        this.mFormat = new SimpleDateFormat(REFRESH_HEADER_LASTTIME, Locale.CHINA);
        this.mFinishDuration = 500;
        this.mPaddingTop = 20;
        this.mPaddingBottom = 20;
        this.mEnableLastTime = true;
        a(context, attributeSet);
    }
}
