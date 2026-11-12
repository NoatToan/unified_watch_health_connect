package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes22.dex */
public class ReadMoreTextView extends AppCompatTextView {
    private static final int k = 2;
    private static final int l = -1;
    private static final boolean m = true;
    private static final String n = "... ";
    private CharSequence a;
    private TextView.BufferType b;
    private boolean c;
    private CharSequence d;
    private CharSequence e;
    private c f;
    private int g;
    private boolean h;
    private int i;
    private OnSpanTextClickListener j;

    public interface OnSpanTextClickListener {
        void onSpanTextClick(boolean z);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReadMoreTextView.this.c = true;
            ReadMoreTextView.this.l();
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ReadMoreTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ReadMoreTextView.this.l();
        }
    }

    public class c extends ClickableSpan {
        private c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            ReadMoreTextView readMoreTextView = ReadMoreTextView.this;
            readMoreTextView.c = !readMoreTextView.c;
            ReadMoreTextView.this.l();
            if (ReadMoreTextView.this.j != null) {
                ReadMoreTextView.this.j.onSpanTextClick(ReadMoreTextView.this.c);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ReadMoreTextView.this.g);
        }
    }

    public ReadMoreTextView(Context context) {
        this(context, null);
    }

    private CharSequence f(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        spannableStringBuilder.setSpan(this.f, spannableStringBuilder.length() - charSequence.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private CharSequence g(int i) {
        return this.a.subSequence(getLayout().getLineStart(i), getLayout().getLineEnd(i));
    }

    private int getAvailableWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private CharSequence getDisplayableText() {
        return j(this.a);
    }

    private float h(String str) {
        return getPaint().measureText(str);
    }

    private CharSequence i(int i) {
        int lineStart = getLayout().getLineStart(i);
        int length = this.a.length();
        if (getLayout().getLineEnd(i) < length) {
            length = getLayout().getLineEnd(i);
        }
        for (int i2 = length; i2 > lineStart; i2--) {
            CharSequence charSequenceSubSequence = this.a.subSequence(lineStart, i2);
            float fH = h(charSequenceSubSequence.toString());
            if (getAvailableWidth() >= fH + h(n + ((Object) this.d))) {
                return charSequenceSubSequence;
            }
        }
        return this.a.subSequence(lineStart, length);
    }

    private CharSequence j(CharSequence charSequence) {
        if (charSequence != null) {
            return this.c ? m() : n();
        }
        return null;
    }

    private void k() {
        getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        super.setText(getDisplayableText(), this.b);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
    }

    private CharSequence m() {
        StringBuilder sb = new StringBuilder();
        if (getLayout() == null || this.i >= getLayout().getLineCount()) {
            sb.append(this.a);
            return sb;
        }
        int i = 0;
        while (true) {
            int i2 = this.i;
            if (i >= i2) {
                return f(new SpannableStringBuilder(sb).append((CharSequence) n).append(this.d), this.d);
            }
            if (i < i2 - 1) {
                sb.append(g(i));
            } else {
                sb.append(i(i));
            }
            i++;
        }
    }

    private CharSequence n() {
        if (!this.h) {
            return this.a;
        }
        CharSequence charSequence = this.a;
        return f(new SpannableStringBuilder(charSequence, 0, charSequence.length()).append(this.e), this.e);
    }

    public void expandText() {
        post(new a());
    }

    public void setColorClickableText(int i) {
        this.g = i;
    }

    public void setOnSpanTextClickListener(OnSpanTextClickListener onSpanTextClickListener) {
        this.j = onSpanTextClickListener;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.a = charSequence;
        this.b = bufferType;
        k();
        l();
    }

    public void setTextDelay(CharSequence charSequence) {
        setText(charSequence, TextView.BufferType.NORMAL);
    }

    public void setTrimCollapsedText(CharSequence charSequence) {
        this.d = charSequence;
    }

    public void setTrimExpandedText(CharSequence charSequence) {
        this.e = charSequence;
    }

    public void setTrimLines(int i) {
        this.i = i;
    }

    public ReadMoreTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
        this.i = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ReadMoreTextView);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ReadMoreTextView_trimCollapsedText, R.string.read_more);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ReadMoreTextView_trimExpandedText, R.string.read_less);
        this.d = getResources().getString(resourceId);
        this.e = getResources().getString(resourceId2);
        this.i = typedArrayObtainStyledAttributes.getInt(R.styleable.ReadMoreTextView_trimLines, 2);
        this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.ReadMoreTextView_colorClickableText, ContextCompat.getColor(context, R.color.colorPrimaryDark));
        this.h = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ReadMoreTextView_showTrimExpandedText, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f = new c();
    }
}
