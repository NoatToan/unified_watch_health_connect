package com.huami.assistant.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.huami.assistant.R;

/* JADX INFO: loaded from: classes5.dex */
public class ExpandTextView extends AppCompatTextView {
    private static final int j = 1;
    private static final int k = 300;
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private OnExpandStateChangeListener h;
    private OnNeedExpandChangeListener i;

    public interface OnExpandStateChangeListener {
        void onExpandStateChanged(ExpandTextView textView, boolean isExpanded);
    }

    public interface OnNeedExpandChangeListener {
        void onNeedExpandChange(boolean needExpand);
    }

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ExpandTextView.this.clearAnimation();
            ExpandTextView.this.f = false;
            if (ExpandTextView.this.h != null) {
                OnExpandStateChangeListener onExpandStateChangeListener = ExpandTextView.this.h;
                ExpandTextView expandTextView = ExpandTextView.this;
                onExpandStateChangeListener.onExpandStateChanged(expandTextView, !expandTextView.e);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class b extends Animation {
        private final View a;
        private final int b;
        private final int c;

        public b(View view, int startHeight, int endHeight) {
            this.a = view;
            this.b = startHeight;
            this.c = endHeight;
            setDuration(ExpandTextView.this.b);
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float interpolatedTime, Transformation t) {
            int i = this.c;
            int i2 = this.b;
            int i3 = (int) (((i - i2) * interpolatedTime) + i2);
            this.a.getLayoutParams().height = i3;
            ExpandTextView.this.setMaxHeight(i3);
        }

        @Override // android.view.animation.Animation
        public void initialize(int width, int height, int parentWidth, int parentHeight) {
            super.initialize(width, height, parentWidth, parentHeight);
        }

        @Override // android.view.animation.Animation
        public boolean willChangeBounds() {
            return true;
        }
    }

    public ExpandTextView(Context context) {
        this(context, null);
    }

    private int e(TextView textView) {
        return textView.getLayout().getLineTop(textView.getLineCount()) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
    }

    public boolean isCollapsed() {
        return this.e;
    }

    public boolean isNeedCollapse() {
        return this.g;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getVisibility() == 8 || this.f) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        getLayoutParams().height = -2;
        setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getLineCount() <= this.a) {
            this.g = false;
            OnNeedExpandChangeListener onNeedExpandChangeListener = this.i;
            if (onNeedExpandChangeListener != null) {
                onNeedExpandChangeListener.onNeedExpandChange(false);
                return;
            }
            return;
        }
        this.g = true;
        OnNeedExpandChangeListener onNeedExpandChangeListener2 = this.i;
        if (onNeedExpandChangeListener2 != null) {
            onNeedExpandChangeListener2.onNeedExpandChange(true);
        }
        this.d = e(this);
        if (this.e) {
            setMaxLines(this.a);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.e) {
            this.c = getMeasuredHeight();
        }
    }

    public void setCollapsed(boolean collapsed) {
        if (this.g && this.e != collapsed) {
            this.e = collapsed;
            this.f = true;
            b bVar = collapsed ? new b(this, getHeight(), this.c) : new b(this, getHeight(), this.d);
            bVar.setFillAfter(true);
            bVar.setAnimationListener(new a());
            clearAnimation();
            startAnimation(bVar);
        }
    }

    public void setOnExpandStateChangeListener(OnExpandStateChangeListener listener) {
        this.h = listener;
        if (listener != null) {
            listener.onExpandStateChanged(this, !this.e);
        }
    }

    public void setOnNeedExpandChangeListener(OnNeedExpandChangeListener listener) {
        this.i = listener;
        if (listener != null) {
            listener.onNeedExpandChange(this.g);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        super.setText(text, type);
    }

    public ExpandTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ExpandTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = 1;
        this.e = true;
        this.f = false;
        this.g = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.ExpandTextView, defStyleAttr, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(R.styleable.ExpandTextView_maxCollapsedLines, 1);
        this.b = typedArrayObtainStyledAttributes.getInt(R.styleable.ExpandTextView_animDuration, 300);
        typedArrayObtainStyledAttributes.recycle();
    }
}
