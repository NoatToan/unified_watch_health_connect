package miuix.popupwidget.internal.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.c3j;
import defpackage.cii;
import defpackage.cti;
import defpackage.dyq;
import defpackage.hmi;
import defpackage.m5j;
import defpackage.q56;
import defpackage.y94;
import miuix.popupwidget.widget.ArrowPopupWindow;

/* JADX INFO: loaded from: classes3.dex */
public class ArrowPopupView extends FrameLayout implements View.OnTouchListener {
    public View.OnTouchListener A;
    public Rect B;
    public RectF C;
    public AnimatorSet D;
    public AnimationSet E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public Animation.AnimationListener Q;
    public Animation.AnimationListener R;
    public View.OnLayoutChangeListener S;
    public int T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f26749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatImageView f26750b;
    public FrameLayout c;
    public LinearLayout d;
    public LinearLayout e;
    public AppCompatTextView f;
    public AppCompatButton g;
    public AppCompatButton h;
    public j i;
    public j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26751k;
    public int l;
    public Drawable m;
    public Drawable n;
    public Drawable o;
    public Drawable p;
    public Drawable q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f26752r;
    public Drawable s;
    public Drawable t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public ArrowPopupWindow z;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ArrowPopupView.this.E = null;
            if (ArrowPopupView.this.N) {
                ArrowPopupView.this.t();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ArrowPopupView.this.F = false;
            ArrowPopupView.this.E = null;
            ArrowPopupView.this.z.dismiss();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ArrowPopupView.this.x();
        }
    }

    public class d extends ViewOutlineProvider {
        public d() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view.getWidth() == 0 || view.getHeight() == 0) {
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            boolean z = false;
            Rect rect = new Rect(0, 0, width, height);
            if (width > height) {
                int i = (width - height) / 2;
                rect.left += i;
                rect.right -= i;
            } else {
                int i2 = (height - width) / 2;
                rect.top += i2;
                rect.bottom -= i2;
            }
            Path path = new Path();
            int i3 = ArrowPopupView.this.T;
            if (i3 != 32 && i3 != 64) {
                switch (i3) {
                    case 8:
                        int i4 = rect.right;
                        int i5 = rect.left;
                        path.moveTo(i5, rect.bottom);
                        path.quadTo((i4 + i5) / 2.0f, -rect.height(), rect.right, rect.bottom);
                        path.close();
                        break;
                    case 9:
                    case 10:
                        if ((ArrowPopupView.this.H != 1 && ArrowPopupView.this.T == 9) || (ArrowPopupView.this.H == 1 && ArrowPopupView.this.T == 10)) {
                            z = true;
                        }
                        path.moveTo(0.0f, ArrowPopupView.this.q.getIntrinsicHeight());
                        if (z) {
                            path.quadTo(0.0f, (-ArrowPopupView.this.q.getIntrinsicHeight()) * 0.7f, rect.right * 0.52f, ArrowPopupView.this.q.getIntrinsicHeight());
                        } else {
                            path.quadTo(rect.right, (-ArrowPopupView.this.q.getIntrinsicHeight()) * 0.7f, rect.right * 0.5f, ArrowPopupView.this.q.getIntrinsicHeight());
                        }
                        path.close();
                        break;
                }
            } else {
                if ((ArrowPopupView.this.H != 1 && ArrowPopupView.this.T == 32) || (ArrowPopupView.this.H == 1 && ArrowPopupView.this.T == 64)) {
                    z = true;
                }
                int i6 = rect.bottom;
                int i7 = rect.top;
                float f = (i6 + i7) / 2.0f;
                if (z) {
                    path.moveTo(rect.right, i7);
                    path.quadTo(-rect.width(), f, rect.right, rect.bottom);
                } else {
                    path.moveTo(rect.left, i7);
                    path.quadTo(rect.right + rect.width(), f, rect.left, rect.bottom);
                }
                path.close();
            }
            if (path.isConvex()) {
                outline.setConvexPath(path);
            } else {
                outline.setOval(rect);
            }
        }
    }

    public class e extends ViewOutlineProvider {
        public e() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view.getWidth() == 0 || view.getHeight() == 0) {
                return;
            }
            Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
            rect.bottom -= view.getPaddingBottom();
            rect.top += view.getPaddingTop();
            rect.right -= view.getPaddingRight();
            rect.left += view.getPaddingLeft();
            outline.setRoundRect(rect, ArrowPopupView.this.getContext().getResources().getDimensionPixelOffset(hmi.d));
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f26758a;

        public f(View view) {
            this.f26758a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26758a.requestLayout();
            this.f26758a.invalidate();
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ArrowPopupView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ArrowPopupView.this.D != null) {
                ArrowPopupView.this.D.cancel();
            }
            if (ArrowPopupView.this.E != null) {
                ArrowPopupView.this.E.cancel();
            }
            ArrowPopupView.this.E = new AnimationSet(true);
            float[] fArr = new float[2];
            ArrowPopupView.this.B(fArr);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.6f, 1.0f, 0.6f, 1.0f, 0, fArr[0], 0, fArr[1]);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            if (q56.a()) {
                alphaAnimation.setDuration(100L);
                scaleAnimation.setDuration(280L);
            } else {
                ArrowPopupView.this.E.setDuration(0L);
            }
            ArrowPopupView.this.E.addAnimation(scaleAnimation);
            ArrowPopupView.this.E.addAnimation(alphaAnimation);
            ArrowPopupView.this.E.setAnimationListener(ArrowPopupView.this.Q);
            ArrowPopupView.this.E.setInterpolator(new DecelerateInterpolator(1.5f));
            ArrowPopupView arrowPopupView = ArrowPopupView.this;
            arrowPopupView.startAnimation(arrowPopupView.E);
            return true;
        }
    }

    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrowPopupView.this.z.dismiss();
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ArrowPopupView.this.O = ((Float) valueAnimator.getAnimatedValue()).intValue();
            int iAbs = Math.abs(ArrowPopupView.this.O);
            ArrowPopupView arrowPopupView = ArrowPopupView.this;
            arrowPopupView.invalidate(arrowPopupView.d.getLeft() - iAbs, ArrowPopupView.this.d.getTop() - iAbs, ArrowPopupView.this.d.getRight() + iAbs, ArrowPopupView.this.d.getBottom() + iAbs);
        }
    }

    public class j implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View.OnClickListener f26763a;

        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener onClickListener = this.f26763a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            ArrowPopupView.this.z.a(true);
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            this.f26763a = onClickListener;
        }
    }

    public ArrowPopupView(Context context) {
        this(context, null);
    }

    private int getArrowHeight() {
        int i2 = this.T;
        if (i2 == 9 || i2 == 10) {
            return this.q.getIntrinsicHeight();
        }
        if (i2 == 17 || i2 == 18) {
            return this.s.getIntrinsicHeight();
        }
        int measuredHeight = this.f26750b.getMeasuredHeight();
        return measuredHeight == 0 ? this.f26750b.getDrawable().getIntrinsicHeight() : measuredHeight;
    }

    private int getArrowWidth() {
        int measuredWidth = this.f26750b.getMeasuredWidth();
        return measuredWidth == 0 ? this.f26750b.getDrawable().getIntrinsicWidth() : measuredWidth;
    }

    public final void A(int i2, int i3, int i4) {
        int i5;
        int right;
        int bottom;
        int measuredHeight;
        int i6 = this.H;
        boolean z = i6 == 1 || (i6 == 2 && dyq.e(this));
        int i7 = this.T;
        if (i7 == 9 || i7 == 10) {
            int right2 = ((z || i7 != 9) && !(z && i7 == 10)) ? ((this.d.getRight() - this.d.getPaddingStart()) - i2) + 1 : (this.d.getLeft() + this.d.getPaddingStart()) - 1;
            i4 = (i4 + this.d.getPaddingTop()) - i3;
            AppCompatImageView appCompatImageView = this.f26750b;
            appCompatImageView.layout(right2, i4, right2 + i2, appCompatImageView.getMeasuredHeight() + i4);
            i5 = right2;
        } else if (i7 == 17 || i7 == 18) {
            if ((z || i7 != 18) && !(z && i7 == 17)) {
                right = (this.d.getRight() - this.d.getPaddingEnd()) - i2;
                bottom = this.d.getBottom() - this.d.getPaddingBottom();
                measuredHeight = this.f26750b.getMeasuredHeight();
            } else {
                right = this.d.getLeft() + this.d.getPaddingStart();
                bottom = this.d.getBottom() - this.d.getPaddingBottom();
                measuredHeight = this.f26750b.getMeasuredHeight();
            }
            int i8 = bottom - (measuredHeight - i3);
            i5 = right;
            if (this.T == 18) {
                AppCompatImageView appCompatImageView2 = this.f26750b;
                appCompatImageView2.layout(i5, i8, i5 + i2, appCompatImageView2.getMeasuredHeight() + i8);
            }
            i4 = i8 - 5;
        } else {
            i5 = this.L;
        }
        AppCompatImageView appCompatImageView3 = this.f26750b;
        appCompatImageView3.layout(i5, i4, i2 + i5, appCompatImageView3.getDrawable().getIntrinsicHeight() + i4);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0035. Please report as an issue. */
    public final void B(float[] fArr) {
        float f2;
        float f3;
        float f4;
        float f5;
        int top = this.f26750b.getTop();
        int bottom = this.f26750b.getBottom();
        int left = this.f26750b.getLeft();
        int right = this.f26750b.getRight();
        int i2 = this.H;
        boolean z = i2 == 1 || (i2 == 2 && dyq.e(this));
        int i3 = this.T;
        if (i3 == 32) {
            f2 = z ? right : left;
            bottom = (bottom + top) / 2;
        } else {
            if (i3 != 64) {
                switch (i3) {
                    case 8:
                        f2 = (right + left) / 2;
                        f3 = top;
                        break;
                    case 9:
                        f4 = z ? right : left;
                        f2 = f4;
                        f3 = top;
                        break;
                    case 10:
                        f4 = z ? left : right;
                        f2 = f4;
                        f3 = top;
                        break;
                    default:
                        switch (i3) {
                            case 16:
                                f2 = (right + left) / 2;
                                break;
                            case 17:
                                f5 = z ? left : right;
                                f2 = f5;
                                break;
                            case 18:
                                f5 = z ? right : left;
                                f2 = f5;
                                break;
                            default:
                                f2 = (right + left) / 2;
                                bottom = (bottom + top) / 2;
                                break;
                        }
                        break;
                }
                fArr[0] = f2;
                fArr[1] = f3;
            }
            f2 = z ? left : right;
            bottom = (bottom + top) / 2;
        }
        f3 = bottom;
        fArr[0] = f2;
        fArr[1] = f3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public int[] C(int i2) {
        int[] iArr = new int[2];
        if (i2 == 32) {
            iArr[0] = this.u.getIntrinsicHeight();
            iArr[1] = this.u.getIntrinsicWidth();
        } else if (i2 != 64) {
            switch (i2) {
                case 8:
                    iArr[0] = this.q.getIntrinsicHeight();
                    iArr[1] = this.q.getIntrinsicWidth();
                    break;
                case 9:
                    iArr[0] = this.v.getIntrinsicHeight();
                    iArr[1] = this.v.getIntrinsicWidth();
                    break;
                case 10:
                    iArr[0] = this.w.getIntrinsicHeight();
                    iArr[1] = this.w.getIntrinsicWidth();
                    break;
                default:
                    switch (i2) {
                        case 16:
                            iArr[0] = this.s.getIntrinsicHeight();
                            iArr[1] = this.s.getIntrinsicWidth();
                            break;
                        case 17:
                            iArr[0] = this.y.getIntrinsicHeight();
                            iArr[1] = this.y.getIntrinsicWidth();
                            break;
                        case 18:
                            iArr[0] = this.x.getIntrinsicHeight();
                            iArr[1] = this.x.getIntrinsicWidth();
                            break;
                    }
                    break;
            }
        } else {
            iArr[0] = this.t.getIntrinsicHeight();
            iArr[1] = this.t.getIntrinsicWidth();
        }
        return iArr;
    }

    public final boolean D() {
        return E(16);
    }

    public final boolean E(int i2) {
        return (this.T & i2) == i2;
    }

    public final boolean F() {
        return E(32);
    }

    public final boolean G() {
        return E(64);
    }

    public boolean H() {
        return TextUtils.isEmpty(this.f.getText());
    }

    public final boolean I() {
        return E(8);
    }

    public final boolean J() {
        return I() || D();
    }

    public void K(View view, ViewGroup.LayoutParams layoutParams) {
        this.c.removeAllViews();
        if (view != null) {
            this.c.addView(view, layoutParams);
        }
    }

    public void L(int i2, int i3) {
        this.f26751k = i2;
        this.l = i3;
    }

    public final void M(int i2) {
        int i3 = this.H;
        boolean z = true;
        if (i3 != 1 && (i3 != 2 || !dyq.e(this))) {
            z = false;
        }
        if (i2 == 32) {
            this.f26750b.setImageDrawable(z ? this.t : this.u);
        }
        if (i2 == 64) {
            this.f26750b.setImageDrawable(z ? this.u : this.t);
            return;
        }
        switch (i2) {
            case 8:
                this.f26750b.setImageDrawable(this.e.getVisibility() == 0 ? this.f26752r : this.q);
                break;
            case 9:
                this.f26750b.setImageDrawable(z ? this.w : this.v);
                break;
            case 10:
                this.f26750b.setImageDrawable(z ? this.v : this.w);
                break;
            default:
                switch (i2) {
                    case 16:
                        this.f26750b.setImageDrawable(this.s);
                        break;
                    case 17:
                        this.f26750b.setImageDrawable(z ? this.x : this.y);
                        break;
                    case 18:
                        this.f26750b.setImageDrawable(z ? this.y : this.x);
                        break;
                }
                break;
        }
    }

    public int getArrowMode() {
        return this.T;
    }

    public int getContentFrameWrapperBottomPadding() {
        return this.d.getPaddingBottom();
    }

    public int getContentFrameWrapperTopPadding() {
        return this.d.getPaddingTop();
    }

    public View getContentView() {
        if (this.c.getChildCount() > 0) {
            return this.c.getChildAt(0);
        }
        return null;
    }

    public AppCompatButton getNegativeButton() {
        return this.h;
    }

    public int getPopupElevation() {
        return this.P;
    }

    public AppCompatButton getPositiveButton() {
        return this.g;
    }

    @Deprecated
    public float getRollingPercent() {
        return 1.0f;
    }

    public int getTitleHeight() {
        if (this.e.getVisibility() != 8) {
            return this.e.getMeasuredHeight();
        }
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View contentView = getContentView();
        if (contentView != null) {
            contentView.post(new f(contentView));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.f26749a;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.S);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int right2;
        float f2;
        if (this.m != null) {
            return;
        }
        int width = this.J + (this.d.getWidth() / 2);
        int height = this.K + (this.d.getHeight() / 2);
        int i2 = this.T;
        if (i2 == 8) {
            int measuredWidth = this.L + (this.f26750b.getMeasuredWidth() / 2);
            right = measuredWidth - this.J;
            right2 = this.d.getRight() - measuredWidth;
            f2 = 0.0f;
        } else if (i2 == 16) {
            int measuredWidth2 = this.L + (this.f26750b.getMeasuredWidth() / 2);
            right = this.d.getRight() - measuredWidth2;
            right2 = measuredWidth2 - this.J;
            f2 = 180.0f;
        } else if (i2 == 32) {
            int measuredHeight = this.M + (this.f26750b.getMeasuredHeight() / 2);
            right = this.d.getBottom() - measuredHeight;
            right2 = measuredHeight - this.K;
            f2 = -90.0f;
        } else if (i2 != 64) {
            f2 = 0.0f;
            right = 0;
            right2 = 0;
        } else {
            int measuredHeight2 = this.M + (this.f26750b.getMeasuredHeight() / 2);
            right = measuredHeight2 - this.K;
            right2 = this.d.getBottom() - measuredHeight2;
            f2 = 90.0f;
        }
        int iSave = canvas.save();
        canvas.rotate(f2, width, height);
        int i3 = this.T;
        if (i3 == 8 || i3 == 16) {
            canvas.translate(this.J, this.K);
            this.n.setBounds(0, 0, right, this.d.getHeight());
            canvas.translate(0.0f, I() ? this.O : -this.O);
            this.n.draw(canvas);
            canvas.translate(right, 0.0f);
            this.o.setBounds(0, 0, right2, this.d.getHeight());
            this.o.draw(canvas);
        } else if (i3 == 32 || i3 == 64) {
            canvas.translate(width - (this.d.getHeight() / 2), height - (this.d.getWidth() / 2));
            this.n.setBounds(0, 0, right, this.d.getWidth());
            canvas.translate(0.0f, F() ? this.O : -this.O);
            this.n.draw(canvas);
            canvas.translate(right, 0.0f);
            this.o.setBounds(0, 0, right2, this.d.getWidth());
            this.o.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f26750b = (AppCompatImageView) findViewById(cti.c);
        this.c = (FrameLayout) findViewById(R.id.content);
        LinearLayout linearLayout = (LinearLayout) findViewById(cti.f14703a);
        this.d = linearLayout;
        linearLayout.setBackground(this.m);
        this.d.setMinimumHeight(getContext().getResources().getDimensionPixelOffset(hmi.f20239a));
        if (this.n != null && this.o != null) {
            Rect rect = new Rect();
            this.n.getPadding(rect);
            LinearLayout linearLayout2 = this.d;
            int i2 = rect.top;
            linearLayout2.setPadding(i2, i2, i2, i2);
        }
        LinearLayout linearLayout3 = (LinearLayout) findViewById(cti.f);
        this.e = linearLayout3;
        linearLayout3.setBackground(this.p);
        this.f = (AppCompatTextView) findViewById(R.id.title);
        this.g = (AppCompatButton) findViewById(R.id.button2);
        this.h = (AppCompatButton) findViewById(R.id.button1);
        this.i = new j();
        this.j = new j();
        this.g.setOnClickListener(this.i);
        this.h.setOnClickListener(this.j);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (!this.f26749a.isAttachedToWindow()) {
            if (this.z.isShowing()) {
                this.z.dismiss();
            }
        } else {
            if (this.T == 0) {
                s();
            }
            M(this.T);
            x();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect rect = this.B;
        this.d.getHitRect(rect);
        if (motionEvent.getAction() != 0 || rect.contains(x, y)) {
            View.OnTouchListener onTouchListener = this.A;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
        this.z.a(true);
        return true;
    }

    public void q() {
        r(this.f26750b, new d());
        r(this.d, new e());
    }

    public final void r(View view, ViewOutlineProvider viewOutlineProvider) {
        view.setOutlineProvider(viewOutlineProvider);
        view.setElevation(this.P);
    }

    public final void s() {
        int[] iArr = new int[2];
        this.f26749a.getLocationInWindow(iArr);
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight = this.d.getMeasuredHeight();
        int height2 = this.f26749a.getHeight();
        int width2 = this.f26749a.getWidth();
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        int i2 = 16;
        sparseIntArray.put(16, iArr[1] - measuredHeight);
        sparseIntArray.put(8, ((height - iArr[1]) - height2) - measuredHeight);
        sparseIntArray.put(64, iArr[0] - measuredWidth);
        sparseIntArray.put(32, ((width - iArr[0]) - width2) - measuredWidth);
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            if (sparseIntArray.get(iKeyAt) >= this.I) {
                i2 = iKeyAt;
                break;
            }
            if (sparseIntArray.get(iKeyAt) > i3) {
                i3 = sparseIntArray.get(iKeyAt);
                i2 = iKeyAt;
            }
        }
        setArrowMode(i2);
    }

    public void setAnchor(View view) {
        View view2 = this.f26749a;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this.S);
        }
        this.f26749a = view;
        view.addOnLayoutChangeListener(this.S);
    }

    public void setArrowMode(int i2) {
        this.T = i2;
        M(i2);
    }

    public void setArrowPopupWindow(ArrowPopupWindow arrowPopupWindow) {
        this.z = arrowPopupWindow;
    }

    public void setAutoDismiss(boolean z) {
        this.G = z;
    }

    public void setContentView(View view) {
        K(view, new ViewGroup.LayoutParams(-2, -2));
    }

    public void setLayoutRtlMode(int i2) {
        if (i2 > 2 || i2 < 0) {
            this.H = 2;
        } else {
            this.H = i2;
        }
    }

    @Deprecated
    public void setRollingPercent(float f2) {
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.f.setText(charSequence);
    }

    public void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.A = onTouchListener;
    }

    public final void t() {
        if (q56.a()) {
            AnimationSet animationSet = this.E;
            if (animationSet != null) {
                animationSet.cancel();
            }
            AnimatorSet animatorSet = this.D;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.D = animatorSet2;
            animatorSet2.addListener(new h());
            float f2 = getContext().getResources().getDisplayMetrics().density * 4.0f;
            Property property = View.TRANSLATION_Y;
            int i2 = this.H;
            boolean z = i2 == 1 || (i2 == 2 && dyq.e(this));
            int i3 = this.T;
            if (i3 == 16) {
                f2 = -f2;
            } else if (i3 == 32) {
                if (z) {
                    f2 = -f2;
                }
                property = View.TRANSLATION_X;
            } else if (i3 == 64) {
                if (!z) {
                    f2 = -f2;
                }
                property = View.TRANSLATION_X;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.d, (Property<LinearLayout, Float>) property, 0.0f, f2, 0.0f);
            objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(1200L);
            if (this.G) {
                objectAnimatorOfFloat.setRepeatCount(8);
            } else {
                objectAnimatorOfFloat.setRepeatCount(-1);
            }
            objectAnimatorOfFloat.addUpdateListener(new i());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f26750b, (Property<AppCompatImageView, Float>) property, 0.0f, f2, 0.0f);
            objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat2.setDuration(1200L);
            if (this.G) {
                objectAnimatorOfFloat2.setRepeatCount(8);
            } else {
                objectAnimatorOfFloat2.setRepeatCount(-1);
            }
            this.D.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            this.D.start();
        }
    }

    public void u() {
        if (this.F) {
            return;
        }
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimationSet animationSet = this.E;
        if (animationSet != null) {
            animationSet.cancel();
        }
        this.E = new AnimationSet(true);
        float[] fArr = new float[2];
        B(fArr);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.6f, 1.0f, 0.6f, 0, fArr[0], 0, fArr[1]);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        if (q56.a()) {
            scaleAnimation.setDuration(150L);
            alphaAnimation.setDuration(150L);
        } else {
            this.E.setDuration(0L);
        }
        this.E.addAnimation(scaleAnimation);
        this.E.addAnimation(alphaAnimation);
        this.E.setAnimationListener(this.R);
        this.E.setInterpolator(new AccelerateInterpolator(2.0f));
        startAnimation(this.E);
    }

    public void v() {
        invalidate();
        getViewTreeObserver().addOnPreDrawListener(new g());
    }

    public final void w(int i2) {
        int i3;
        int i4;
        int paddingLeft;
        int paddingLeft2;
        int i5;
        int[] iArr = new int[2];
        this.f26749a.getLocationOnScreen(iArr);
        int i6 = iArr[0];
        int i7 = iArr[1];
        getLocationOnScreen(iArr);
        int width = this.f26749a.getWidth();
        int height = this.f26749a.getHeight();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(this.d.getMeasuredWidth(), this.d.getMinimumWidth());
        int iMax2 = Math.max(this.d.getMeasuredHeight(), this.d.getMinimumHeight());
        int arrowWidth = getArrowWidth();
        int arrowHeight = getArrowHeight();
        int i8 = iArr[1];
        int i9 = ((height / 2) + i7) - i8;
        this.K = i9;
        int i10 = height2 - i9;
        this.M = ((i7 + ((height - arrowHeight) / 2)) - i8) + ((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2);
        int i11 = iMax2 / 2;
        int i12 = iMax2 - i11;
        this.J = getLeft() + i2;
        if (G()) {
            int i13 = this.H;
            if (i13 == 1 || (i13 == 2 && dyq.e(this))) {
                paddingLeft = this.J + ((((i6 + width) - this.d.getPaddingLeft()) + arrowWidth) - iArr[0]);
                this.J = paddingLeft;
                paddingLeft2 = this.d.getPaddingLeft();
                i5 = paddingLeft + (paddingLeft2 - arrowWidth) + 1;
                i3 = i5;
            } else {
                int i14 = this.J;
                int paddingRight = ((i6 - iMax) + this.d.getPaddingRight()) - arrowWidth;
                i4 = iArr[0];
                this.J = i14 + (paddingRight - i4);
                i5 = (((i6 - arrowWidth) - i4) + i2) - 1;
                i3 = i5;
            }
        } else if (F()) {
            int i15 = this.H;
            if (i15 == 1 || (i15 == 2 && dyq.e(this))) {
                int i16 = this.J;
                int paddingRight2 = ((i6 - iMax) + this.d.getPaddingRight()) - arrowWidth;
                i4 = iArr[0];
                this.J = i16 + (paddingRight2 - i4) + 1;
                i5 = (((i6 - arrowWidth) - i4) + i2) - 1;
                i3 = i5;
            } else {
                paddingLeft = this.J + ((((i6 + width) - this.d.getPaddingLeft()) + arrowWidth) - iArr[0]);
                this.J = paddingLeft;
                paddingLeft2 = this.d.getPaddingLeft();
                i5 = paddingLeft + (paddingLeft2 - arrowWidth) + 1;
                i3 = i5;
            }
        } else {
            i3 = 0;
        }
        int i17 = this.K;
        if (i17 >= i11 && i10 >= i12) {
            this.K = (i17 - i11) + this.l;
        } else if (i10 < i12) {
            this.K = (height2 - iMax2) + this.l;
        } else if (i17 < i11) {
            this.K = this.l;
        }
        int i18 = this.M + this.l;
        this.M = i18;
        if (i18 < 0) {
            this.M = 0;
        } else if (i18 + arrowHeight > height2) {
            this.M = i18 - ((i18 + arrowHeight) - height2);
        }
        this.d.layout(Math.max(this.J, 0), Math.max(this.K, 0), Math.min(this.J + iMax, width2), Math.min(this.K + iMax2, height2));
        AppCompatImageView appCompatImageView = this.f26750b;
        int i19 = this.M;
        appCompatImageView.layout(i3, i19, arrowWidth + i3, arrowHeight + i19);
    }

    public final void x() {
        int i2 = this.H;
        int i3 = (i2 == 1 || (i2 == 2 && dyq.e(this))) ? -this.f26751k : this.f26751k;
        if (J()) {
            y(i3);
        } else {
            w(i3);
        }
        View contentView = getContentView();
        if (contentView != null) {
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            if (contentView.getMeasuredHeight() > this.d.getHeight() - this.e.getHeight()) {
                layoutParams.height = this.d.getHeight() - this.e.getHeight();
                contentView.setLayoutParams(layoutParams);
            } else if (contentView.getMeasuredWidth() > this.d.getWidth()) {
                layoutParams.width = this.d.getWidth();
                contentView.setLayoutParams(layoutParams);
            }
            int i4 = layoutParams.height;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0103 A[PHI: r17
      0x0103: PHI (r17v4 int) = (r17v1 int), (r17v1 int), (r17v1 int), (r17v5 int) binds: [B:45:0x0101, B:42:0x00f9, B:39:0x00f1, B:34:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0158  */
    /* JADX WARN: Code duplicated, block: B:67:0x015b  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    public final void y(int i2) {
        int paddingTop;
        int i3;
        int i4;
        int i5;
        int i6;
        int width = this.f26749a.getWidth();
        int height = this.f26749a.getHeight();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(this.d.getMeasuredWidth(), this.d.getMinimumWidth());
        int iMax2 = Math.max(this.d.getMeasuredHeight(), this.d.getMinimumHeight());
        int arrowWidth = getArrowWidth();
        int arrowHeight = getArrowHeight();
        int[] iArr = new int[2];
        this.f26749a.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        int i8 = iArr[1];
        getLocationOnScreen(iArr);
        this.L = (((width - arrowWidth) / 2) + i7) - iArr[0];
        this.K = getTop() + this.l;
        if (D()) {
            this.K += ((i8 - iArr[1]) - iMax2) + (this.d.getPaddingBottom() - arrowHeight);
            paddingTop = (((i8 - iArr[1]) - arrowHeight) + this.l) - 1;
        } else if (I()) {
            int paddingTop2 = this.K + (((i8 + height) - iArr[1]) - this.d.getPaddingTop()) + arrowHeight;
            this.K = paddingTop2;
            paddingTop = paddingTop2 + (this.d.getPaddingTop() - arrowHeight) + 1;
        } else {
            paddingTop = 0;
        }
        int i9 = iMax / 2;
        int i10 = iMax - i9;
        int i11 = this.H;
        boolean z = i11 == 1 || (i11 == 2 && dyq.e(this));
        boolean z2 = (!z && this.T == 9) || (!z && this.T == 18) || ((z && this.T == 10) || (z && this.T == 17));
        if (!z) {
            i3 = paddingTop;
            if (this.T == 10) {
                i4 = 0;
                this.J = Math.max(((i7 + width) - iMax) - iArr[0], 0);
                i5 = i4;
            }
            int i12 = this.J + i2;
            this.J = i12;
            i6 = this.L + i2;
            this.L = i6;
            if (i6 < 0) {
                this.L = i5;
            } else if (i6 + arrowWidth > width2) {
                this.L = i6 - ((i6 + arrowWidth) - width2);
            }
            this.d.layout(Math.max(i12, i5), Math.max(this.K, i5), Math.min(this.J + iMax, width2), Math.min(Math.max(this.K, i5) + iMax2, height2));
            A(arrowWidth, arrowHeight, i3);
        }
        i3 = paddingTop;
        if ((z || this.T != 17) && !((z && this.T == 9) || (z && this.T == 18))) {
            i4 = 0;
            if (z2) {
                int i13 = i7 - iArr[0];
                this.J = i13;
                int i14 = i13 + iMax;
                if (i14 > width2) {
                    this.J = i13 + (width2 - i14);
                }
                this.J = Math.max(this.J, 0);
            } else {
                int i15 = (i7 + (width / 2)) - iArr[0];
                this.J = i15;
                int i16 = width2 - i15;
                if (i15 >= i9 && i16 >= i10) {
                    this.J = i15 - i9;
                } else if (i16 < i10) {
                    this.J = width2 - iMax;
                } else {
                    i5 = 0;
                    if (i15 < i9) {
                        this.J = 0;
                    }
                }
                i5 = 0;
            }
            int i17 = this.J + i2;
            this.J = i17;
            i6 = this.L + i2;
            this.L = i6;
            if (i6 < 0) {
                this.L = i5;
            } else if (i6 + arrowWidth > width2) {
                this.L = i6 - ((i6 + arrowWidth) - width2);
            }
            this.d.layout(Math.max(i17, i5), Math.max(this.K, i5), Math.min(this.J + iMax, width2), Math.min(Math.max(this.K, i5) + iMax2, height2));
            A(arrowWidth, arrowHeight, i3);
        }
        i4 = 0;
        this.J = Math.max(((i7 + width) - iMax) - iArr[0], 0);
        i5 = i4;
        int i18 = this.J + i2;
        this.J = i18;
        i6 = this.L + i2;
        this.L = i6;
        if (i6 < 0) {
            this.L = i5;
        } else if (i6 + arrowWidth > width2) {
            this.L = i6 - ((i6 + arrowWidth) - width2);
        }
        this.d.layout(Math.max(i18, i5), Math.max(this.K, i5), Math.min(this.J + iMax, width2), Math.min(Math.max(this.K, i5) + iMax2, height2));
        A(arrowWidth, arrowHeight, i3);
    }

    public void z(boolean z) {
        this.N = z;
    }

    public ArrowPopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, cii.f5376a);
    }

    public void setContentView(int i2) {
        setContentView(LayoutInflater.from(getContext()).inflate(i2, (ViewGroup) null));
    }

    public ArrowPopupView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.B = new Rect();
        this.C = new RectF();
        this.G = true;
        this.H = 2;
        this.N = false;
        this.Q = new a();
        this.R = new b();
        this.S = new c();
        this.T = 0;
        y94.b(this, false);
        this.G = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m5j.q, i2, c3j.j);
        this.m = typedArrayObtainStyledAttributes.getDrawable(m5j.x);
        this.n = typedArrayObtainStyledAttributes.getDrawable(m5j.s);
        this.o = typedArrayObtainStyledAttributes.getDrawable(m5j.t);
        this.p = typedArrayObtainStyledAttributes.getDrawable(m5j.A);
        this.q = typedArrayObtainStyledAttributes.getDrawable(m5j.B);
        this.f26752r = typedArrayObtainStyledAttributes.getDrawable(m5j.C);
        this.s = typedArrayObtainStyledAttributes.getDrawable(m5j.u);
        this.t = typedArrayObtainStyledAttributes.getDrawable(m5j.z);
        this.u = typedArrayObtainStyledAttributes.getDrawable(m5j.y);
        this.v = typedArrayObtainStyledAttributes.getDrawable(m5j.D);
        this.w = typedArrayObtainStyledAttributes.getDrawable(m5j.E);
        this.y = typedArrayObtainStyledAttributes.getDrawable(m5j.w);
        this.x = typedArrayObtainStyledAttributes.getDrawable(m5j.v);
        this.P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(m5j.f25777r, getResources().getDimensionPixelSize(hmi.e));
        typedArrayObtainStyledAttributes.recycle();
        this.I = context.getResources().getDimensionPixelOffset(hmi.g);
    }
}
