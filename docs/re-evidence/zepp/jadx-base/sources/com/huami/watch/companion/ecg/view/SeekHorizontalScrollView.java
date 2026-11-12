package com.huami.watch.companion.ecg.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.SeekBar;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public class SeekHorizontalScrollView extends HorizontalScrollView {
    private SeekBar a;

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekHorizontalScrollView.this.scrollTo(i, 0);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public SeekHorizontalScrollView(Context context) {
        super(context);
    }

    private int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingStart()) - getPaddingEnd()));
        }
        return 0;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        SeekBar seekBar = this.a;
        if (seekBar != null) {
            seekBar.setMax(getScrollRange());
            this.a.setProgress(Math.max(0, Math.min(getScrollRange(), i)));
        }
    }

    public void setSeekBar(@NonNull SeekBar seekBar) {
        this.a = seekBar;
        seekBar.setOnSeekBarChangeListener(new a());
    }

    public SeekHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SeekHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public SeekHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
