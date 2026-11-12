package miuix.appcompat.internal.app.widget.actionbar;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.dmi;
import defpackage.hm1;
import defpackage.s6g;
import defpackage.s8p;
import defpackage.t8p;
import defpackage.tc8;
import defpackage.vsi;
import defpackage.zhi;
import miuix.appcompat.internal.view.CollapseTitleColorTransitionTextView;
import miuix.appcompat.internal.view.ColorTransitionTextView;

/* JADX INFO: loaded from: classes3.dex */
public class CollapseTitle {
    private ColorTransitionTextView mCollapseSubtitleView;
    private LinearLayout mCollapseTitleLayout;
    private ColorTransitionTextView mCollapseTitleView;
    private Context mContext;
    private int mSubtitleStyle;
    private int mTitleStyle;
    private boolean mVisible = true;
    private float mDefaultSubtitleSize = 0.0f;
    private boolean mIsTitleDirty = false;
    private float mCollapseTitlePaintTextSize = -1.0f;
    private float mTitleLength = 0.0f;
    private boolean mSubtitleSizeable = true;
    private boolean mTextColorTransitEnable = false;
    private boolean mLargeFontAdaptEnable = false;
    private int mLargeFontTitleMaxLine = 2;
    View.OnTouchListener subtitleTouchListener = new a();

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !view.isClickable();
        }
    }

    public CollapseTitle(Context context, int i, int i2) {
        this.mContext = context;
        this.mTitleStyle = i;
        this.mSubtitleStyle = i2;
    }

    private LinearLayout.LayoutParams getChildLayoutParams() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0() {
        this.mCollapseTitleLayout.setBackground(hm1.h(this.mContext, R.attr.actionBarItemBackground));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListener$1() {
        this.mCollapseTitleLayout.setTouchDelegate(new TouchDelegate(new Rect(0, 0, this.mCollapseTitleLayout.getWidth(), this.mCollapseTitleLayout.getHeight()), this.mCollapseTitleView));
    }

    private void resetTitleMaxLine(boolean z) {
        ColorTransitionTextView colorTransitionTextView = this.mCollapseTitleView;
        if (colorTransitionTextView == null || !this.mLargeFontAdaptEnable) {
            return;
        }
        if (z && colorTransitionTextView.getMaxLines() > 1) {
            this.mCollapseTitleView.setSingleLine(true);
            this.mCollapseTitleView.setMaxLines(1);
        } else {
            if (z || this.mCollapseTitleView.getMaxLines() != 1) {
                return;
            }
            this.mCollapseTitleView.setSingleLine(false);
            this.mCollapseTitleView.setMaxLines(this.mLargeFontTitleMaxLine);
        }
    }

    public boolean canTitleBeShown(String str) {
        TextPaint paint = this.mCollapseTitleView.getPaint();
        float f = this.mCollapseTitlePaintTextSize;
        if (f == -1.0f || f != paint.getTextSize()) {
            this.mCollapseTitlePaintTextSize = paint.getTextSize();
            this.mIsTitleDirty = true;
        }
        if (this.mIsTitleDirty) {
            this.mTitleLength = this.mCollapseTitleView.getPaint().measureText(str);
            this.mIsTitleDirty = false;
        }
        return this.mCollapseTitleView.getMeasuredWidth() == 0 || this.mTitleLength <= ((float) this.mCollapseTitleView.getMeasuredWidth());
    }

    public Rect getHitRect() {
        Rect rect = new Rect();
        this.mCollapseTitleLayout.getHitRect(rect);
        return rect;
    }

    public View getLayout() {
        return this.mCollapseTitleLayout;
    }

    public float getSubtitleAdjustSize() {
        float f = this.mDefaultSubtitleSize;
        Resources resources = this.mContext.getResources();
        int measuredHeight = ((this.mCollapseTitleLayout.getMeasuredHeight() - this.mCollapseTitleView.getMeasuredHeight()) - this.mCollapseSubtitleView.getPaddingTop()) - this.mCollapseSubtitleView.getPaddingBottom();
        if (measuredHeight <= 0) {
            return f;
        }
        TextPaint textPaint = new TextPaint(this.mCollapseSubtitleView.getPaint());
        textPaint.setTextSize(f);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int iCeil = (int) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
        float f2 = f / 2.0f;
        float f3 = resources.getDisplayMetrics().scaledDensity;
        while (iCeil > measuredHeight && f >= f2) {
            f -= f3;
            textPaint.setTextSize(f);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            iCeil = (int) Math.ceil(fontMetrics2.descent - fontMetrics2.ascent);
        }
        return f;
    }

    public ViewGroup getTitleParent() {
        return (ViewGroup) this.mCollapseTitleView.getParent();
    }

    public int getTitleVisibility() {
        return this.mCollapseTitleView.getVisibility();
    }

    public int getVisibility() {
        return this.mCollapseTitleLayout.getVisibility();
    }

    public void init() {
        Resources resources = this.mContext.getResources();
        tc8.i(this.mContext);
        this.mDefaultSubtitleSize = resources.getDimensionPixelSize(dmi.u0);
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        this.mCollapseTitleLayout = linearLayout;
        linearLayout.setImportantForAccessibility(2);
        CollapseTitleColorTransitionTextView collapseTitleColorTransitionTextView = new CollapseTitleColorTransitionTextView(this.mContext, null, zhi.x);
        this.mCollapseTitleView = collapseTitleColorTransitionTextView;
        collapseTitleColorTransitionTextView.setVerticalScrollBarEnabled(false);
        this.mCollapseTitleView.setHorizontalScrollBarEnabled(false);
        this.mCollapseTitleView.setFocusableInTouchMode(false);
        boolean z = hm1.d(this.mContext, zhi.o, true) && (s6g.f(this.mContext) == 2);
        this.mLargeFontAdaptEnable = z;
        if (z) {
            this.mLargeFontTitleMaxLine = hm1.j(this.mContext, zhi.w, 2);
            this.mCollapseTitleView.setSingleLine(false);
            this.mCollapseTitleView.setMaxLines(this.mLargeFontTitleMaxLine);
        }
        ColorTransitionTextView colorTransitionTextView = new ColorTransitionTextView(this.mContext, null, zhi.v);
        this.mCollapseSubtitleView = colorTransitionTextView;
        colorTransitionTextView.setVerticalScrollBarEnabled(false);
        this.mCollapseSubtitleView.setHorizontalScrollBarEnabled(false);
        this.mCollapseTitleLayout.setOrientation(1);
        this.mCollapseTitleLayout.post(new Runnable() { // from class: x34
            @Override // java.lang.Runnable
            public final void run() {
                this.f38633a.lambda$init$0();
            }
        });
        this.mCollapseTitleView.setId(vsi.m);
        this.mCollapseTitleLayout.addView(this.mCollapseTitleView, getChildLayoutParams());
        this.mCollapseSubtitleView.setId(vsi.f37189k);
        this.mCollapseSubtitleView.setVisibility(8);
        this.mCollapseTitleLayout.addView(this.mCollapseSubtitleView, getChildLayoutParams());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mCollapseSubtitleView.getLayoutParams();
        layoutParams.topMargin = resources.getDimensionPixelOffset(dmi.f15695b);
        layoutParams.bottomMargin = resources.getDimensionPixelOffset(dmi.f15694a);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void setAllTitlesClickable(boolean z) {
        ColorTransitionTextView colorTransitionTextView = this.mCollapseTitleView;
        if (colorTransitionTextView != null) {
            colorTransitionTextView.setClickable(z);
        }
        ColorTransitionTextView colorTransitionTextView2 = this.mCollapseSubtitleView;
        if (colorTransitionTextView2 != null) {
            colorTransitionTextView2.setClickable(z);
        }
    }

    public void setEnabled(boolean z) {
        this.mCollapseTitleLayout.setEnabled(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener, boolean z) {
        this.mCollapseTitleView.setOnClickListener(onClickListener);
        this.mCollapseTitleView.post(new Runnable() { // from class: w34
            @Override // java.lang.Runnable
            public final void run() {
                this.f37506a.lambda$setOnClickListener$1();
            }
        });
        this.mCollapseTitleView.setClickable(z);
    }

    public void setSubTitle(CharSequence charSequence) {
        this.mCollapseSubtitleView.setText(charSequence);
        int i = TextUtils.isEmpty(charSequence) ? 8 : 0;
        setSubTitleVisibility(i);
        resetTitleMaxLine(i == 0);
    }

    public void setSubTitleClickable(boolean z) {
        ColorTransitionTextView colorTransitionTextView = this.mCollapseSubtitleView;
        if (colorTransitionTextView != null) {
            colorTransitionTextView.setClickable(z);
        }
    }

    public void setSubTitleDrawable(t8p t8pVar) {
        throw null;
    }

    public void setSubTitleOnClickListener(View.OnClickListener onClickListener, boolean z) {
        ColorTransitionTextView colorTransitionTextView = this.mCollapseSubtitleView;
        if (colorTransitionTextView != null) {
            colorTransitionTextView.setOnClickListener(onClickListener);
            this.mCollapseSubtitleView.setClickable(z);
            this.mCollapseSubtitleView.setOnTouchListener(this.subtitleTouchListener);
        }
    }

    public void setSubTitleStyle(int i) {
        this.mSubtitleStyle = i;
        s8p.o(this.mCollapseSubtitleView, i);
        this.mCollapseTitleView.invalidate();
    }

    public void setSubTitleTextSize(float f) {
        if (this.mSubtitleSizeable) {
            this.mCollapseSubtitleView.setTextSize(0, f);
        }
    }

    public void setSubTitleVisibility(int i) {
        this.mCollapseSubtitleView.setVisibility(i);
    }

    public void setTextColorTransitEnable(boolean z, int i) {
        if (this.mTextColorTransitEnable != z) {
            if (!z) {
                this.mCollapseTitleView.e(false, false);
            }
            this.mTextColorTransitEnable = z;
            if (z && i == 0) {
                this.mCollapseTitleView.e(true, false);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.mCollapseTitleView.getText())) {
            return;
        }
        this.mCollapseTitleView.setText(charSequence);
        setEnabled(!TextUtils.isEmpty(charSequence));
        this.mIsTitleDirty = true;
    }

    public void setTitleClickable(boolean z) {
        ColorTransitionTextView colorTransitionTextView = this.mCollapseTitleView;
        if (colorTransitionTextView != null) {
            colorTransitionTextView.setClickable(z);
        }
    }

    public void setTitleStyle(int i) {
        this.mTitleStyle = i;
        s8p.o(this.mCollapseTitleView, i);
        this.mCollapseTitleView.invalidate();
    }

    public void setTitleVisibility(int i) {
        this.mCollapseTitleView.setVisibility(i);
    }

    public void setVisibility(int i) {
        if (this.mVisible || i != 0) {
            this.mCollapseTitleLayout.setVisibility(i);
        } else {
            this.mCollapseTitleLayout.setVisibility(4);
        }
    }

    public void setVisible(boolean z) {
        if (this.mVisible != z) {
            this.mVisible = z;
            this.mCollapseTitleLayout.setVisibility(z ? 0 : 4);
        }
    }

    public void startColorTransition(boolean z, boolean z2) {
        if (this.mTextColorTransitEnable) {
            this.mCollapseTitleView.e(z, z2);
        }
    }

    public void updateTitleCenter(boolean z) {
        ViewGroup titleParent = getTitleParent();
        if (titleParent instanceof LinearLayout) {
            ((LinearLayout) titleParent).setGravity((z ? 1 : 8388611) | 16);
        }
        this.mCollapseTitleView.setGravity((z ? 1 : 8388611) | 16);
        ColorTransitionTextView colorTransitionTextView = this.mCollapseTitleView;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        colorTransitionTextView.setEllipsize(truncateAt);
        this.mCollapseSubtitleView.setGravity((z ? 1 : 8388611) | 16);
        this.mCollapseSubtitleView.setEllipsize(truncateAt);
    }
}
