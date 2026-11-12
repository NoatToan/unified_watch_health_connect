package miuix.appcompat.internal.app.widget.actionbar;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.c6q;
import defpackage.dmi;
import defpackage.hm1;
import defpackage.pwk;
import defpackage.s8p;
import defpackage.vsi;
import defpackage.z2j;
import defpackage.zhi;
import miuix.appcompat.internal.view.ColorTransitionTextView;

/* JADX INFO: loaded from: classes3.dex */
public class ExpandTitle {
    private Context mContext;
    private ColorTransitionTextView mExpandSubtitleView;
    private LinearLayout mExpandTitleLayout;
    private ColorTransitionTextView mExpandTitleView;
    private boolean mVisible = true;
    private boolean mTextColorTransitEnable = false;
    View.OnTouchListener subtitleTouchListener = new a();
    private int mTitleStyle = z2j.n;
    private int mSubtitleStyle = z2j.o;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !view.isClickable();
        }
    }

    public ExpandTitle(Context context) {
        this.mContext = context;
    }

    private LinearLayout.LayoutParams getChildLayoutParams() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0() {
        this.mExpandTitleLayout.setBackground(hm1.h(this.mContext, R.attr.actionBarItemBackground));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnClickListener$1() {
        this.mExpandTitleLayout.setTouchDelegate(new TouchDelegate(new Rect(0, 0, this.mExpandTitleLayout.getWidth(), this.mExpandTitleLayout.getHeight()), this.mExpandTitleView));
    }

    public View getLayout() {
        return this.mExpandTitleLayout;
    }

    public int getVisibility() {
        return this.mExpandTitleLayout.getVisibility();
    }

    public void init() {
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        this.mExpandTitleLayout = linearLayout;
        linearLayout.setImportantForAccessibility(2);
        this.mExpandTitleLayout.setOrientation(1);
        this.mExpandTitleLayout.post(new Runnable() { // from class: vi8
            @Override // java.lang.Runnable
            public final void run() {
                this.f36919a.lambda$init$0();
            }
        });
        ColorTransitionTextView colorTransitionTextView = new ColorTransitionTextView(this.mContext, null, zhi.D);
        this.mExpandTitleView = colorTransitionTextView;
        colorTransitionTextView.setId(vsi.n);
        this.mExpandTitleView.setVerticalScrollBarEnabled(false);
        this.mExpandTitleView.setHorizontalScrollBarEnabled(false);
        this.mExpandTitleView.setFocusableInTouchMode(false);
        if (pwk.a() <= 1) {
            c6q.a(this.mExpandTitleView);
        }
        this.mExpandTitleLayout.addView(this.mExpandTitleView, getChildLayoutParams());
        ColorTransitionTextView colorTransitionTextView2 = new ColorTransitionTextView(this.mContext, null, zhi.C);
        this.mExpandSubtitleView = colorTransitionTextView2;
        colorTransitionTextView2.setId(vsi.l);
        this.mExpandSubtitleView.setVisibility(8);
        this.mExpandSubtitleView.setVerticalScrollBarEnabled(false);
        this.mExpandSubtitleView.setHorizontalScrollBarEnabled(false);
        this.mExpandTitleLayout.addView(this.mExpandSubtitleView, getChildLayoutParams());
        Resources resources = this.mContext.getResources();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mExpandSubtitleView.getLayoutParams();
        layoutParams.topMargin = resources.getDimensionPixelOffset(dmi.f15695b);
        layoutParams.bottomMargin = resources.getDimensionPixelOffset(dmi.f15694a);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mExpandTitleView.setTextAppearance(this.mTitleStyle);
        this.mExpandSubtitleView.setTextAppearance(this.mSubtitleStyle);
        if (pwk.a() <= 1) {
            c6q.a(this.mExpandTitleView);
        }
    }

    public void setAllTitlesClickable(boolean z) {
        ColorTransitionTextView colorTransitionTextView = this.mExpandTitleView;
        if (colorTransitionTextView != null) {
            colorTransitionTextView.setClickable(z);
        }
        ColorTransitionTextView colorTransitionTextView2 = this.mExpandSubtitleView;
        if (colorTransitionTextView2 != null) {
            colorTransitionTextView2.setClickable(z);
        }
    }

    public void setEnabled(boolean z) {
        this.mExpandTitleLayout.setEnabled(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener, boolean z) {
        this.mExpandTitleView.setOnClickListener(onClickListener);
        this.mExpandTitleView.post(new Runnable() { // from class: ui8
            @Override // java.lang.Runnable
            public final void run() {
                this.f35786a.lambda$setOnClickListener$1();
            }
        });
        this.mExpandTitleView.setClickable(z);
    }

    public void setSubTitle(CharSequence charSequence) {
        this.mExpandSubtitleView.setText(charSequence);
        setSubTitleVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setSubTitleClickable(boolean z) {
        ColorTransitionTextView colorTransitionTextView = this.mExpandSubtitleView;
        if (colorTransitionTextView != null) {
            colorTransitionTextView.setClickable(z);
        }
    }

    public void setSubTitleOnClickListener(View.OnClickListener onClickListener, boolean z) {
        ColorTransitionTextView colorTransitionTextView = this.mExpandSubtitleView;
        if (colorTransitionTextView != null) {
            colorTransitionTextView.setOnClickListener(onClickListener);
            this.mExpandSubtitleView.setClickable(z);
            this.mExpandSubtitleView.setOnTouchListener(this.subtitleTouchListener);
        }
    }

    public void setSubTitleStyle(int i) {
        this.mSubtitleStyle = i;
        s8p.o(this.mExpandSubtitleView, i);
        this.mExpandSubtitleView.invalidate();
    }

    public void setSubTitleVisibility(int i) {
        this.mExpandSubtitleView.setVisibility(i);
    }

    public void setTextColorTransitEnable(boolean z, int i) {
        if (this.mTextColorTransitEnable != z) {
            if (!z) {
                this.mExpandTitleView.e(false, false);
            }
            this.mTextColorTransitEnable = z;
            if (z && i == 1) {
                this.mExpandTitleView.e(true, false);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.mExpandTitleView.setText(charSequence);
        setEnabled(!TextUtils.isEmpty(charSequence));
    }

    public void setTitleClickable(boolean z) {
        ColorTransitionTextView colorTransitionTextView = this.mExpandTitleView;
        if (colorTransitionTextView != null) {
            colorTransitionTextView.setClickable(z);
        }
    }

    public void setTitleStyle(int i) {
        this.mTitleStyle = i;
        s8p.o(this.mExpandTitleView, i);
        this.mExpandTitleView.invalidate();
    }

    public void setTitleVisibility(int i) {
        this.mExpandTitleView.setVisibility(i);
    }

    public void setVisibility(int i) {
        if (this.mVisible || i != 0) {
            this.mExpandTitleLayout.setVisibility(i);
        } else {
            this.mExpandTitleLayout.setVisibility(4);
        }
    }

    public void setVisible(boolean z) {
        if (this.mVisible != z) {
            this.mVisible = z;
            this.mExpandTitleLayout.setVisibility(z ? 0 : 4);
        }
    }

    public void startColorTransition(boolean z, boolean z2) {
        if (this.mTextColorTransitEnable) {
            this.mExpandTitleView.e(z, z2);
        }
    }
}
