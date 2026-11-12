package com.huami.android.design.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes4.dex */
public class CountDownView extends AppCompatTextView {
    private static final long h = 1000;
    private int a;
    private final String b;
    private String c;
    private CountDownTimer d;
    private OnCountDownListener e;
    private EditText f;
    private String g;

    public interface OnCountDownListener {
        void onFinish();
    }

    public class a extends CountDownTimer {
        public a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CountDownView.this.setEnabled(true);
            CountDownView countDownView = CountDownView.this;
            countDownView.setText(countDownView.b);
            cancel();
            if (CountDownView.this.e != null) {
                CountDownView.this.e.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            long jRound = Math.round(j / 1000.0d);
            CountDownView countDownView = CountDownView.this;
            countDownView.setText(String.format(countDownView.c, Long.valueOf(jRound)));
            CountDownView countDownView2 = CountDownView.this;
            countDownView2.setTextColor(countDownView2.getTextColors().getDefaultColor());
        }
    }

    public CountDownView(Context context) {
        this(context, null);
    }

    private void d() {
        this.d.cancel();
        this.d = null;
    }

    private void e(boolean z) {
        if (z) {
            if (this.d != null) {
                return;
            }
            setEnabled(false);
            this.d = new a(1000 * ((long) this.a), 1000L).start();
            return;
        }
        if (this.d != null) {
            d();
            setEnabled(true);
            setText(this.b);
        }
    }

    public void attachInputTo(EditText editText) {
        this.f = editText;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        stop();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean performClick() {
        EditText editText = this.f;
        if (editText == null || !TextUtils.isEmpty(editText.getText().toString().trim())) {
            return super.performClick();
        }
        Toast.makeText(getContext(), TextUtils.isEmpty(this.g) ? "请输入手机号" : this.g, 0).show();
        return false;
    }

    public void setEmptyTips(String str) {
        this.g = str;
    }

    public void setFormatString(String str) {
        this.c = str;
    }

    public void setOnCountDownListener(OnCountDownListener onCountDownListener) {
        this.e = onCountDownListener;
    }

    public void setSeconds(int i) {
        this.a = i;
    }

    public void start() {
        e(true);
    }

    public void stop() {
        e(false);
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public CountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 60;
        setClickable(true);
        setGravity(17);
        this.b = getText().toString();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CountDownView, i, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(R.styleable.CountDownView_seconds, this.a);
        this.c = typedArrayObtainStyledAttributes.getString(R.styleable.CountDownView_format);
        typedArrayObtainStyledAttributes.recycle();
    }
}
