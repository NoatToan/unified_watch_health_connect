package com.huami.watch.companion.firstbeat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.view.HuaMiFontTextView;

/* JADX INFO: loaded from: classes16.dex */
public class VO2maxView extends FrameLayout {
    private final int[] a;
    private TextView b;
    private TextView c;
    private DialView d;
    private HuaMiFontTextView e;
    private TextView f;

    public VO2maxView(@NonNull Context context) {
        super(context);
        this.a = new int[]{b(R.color.s51), b(R.color.s30), b(R.color.s33), b(R.color.s20), b(R.color.s16), b(R.color.s14), b(R.color.s25)};
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_vo2max, (ViewGroup) this, true);
        this.b = (TextView) findViewById(R.id.tv_vo2max_sport);
        this.c = (TextView) findViewById(R.id.tv_vo2max_update_time);
        this.d = (DialView) findViewById(R.id.dv_vo2max);
        this.e = (HuaMiFontTextView) findViewById(R.id.tv_vo2max_value);
        this.f = (TextView) findViewById(R.id.tv_vo2max_level);
        this.d.setColor(this.a);
        setUpdateTime(getContext().getString(R.string.empty_value));
    }

    @ColorInt
    private int b(@ColorRes int i) {
        return ContextCompat.getColor(getContext(), i);
    }

    public TextView getVo2MaxLevelTv() {
        return this.f;
    }

    public void setPercent(float f) {
        this.d.setPercent(f);
    }

    public void setSportDrawableRes(int i) {
        this.b.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
    }

    public void setSportName(String str) {
        this.b.setText(str);
    }

    public void setUpdateTime(String str) {
        this.c.setText(getContext().getString(R.string.vo2max_update_time, str));
    }

    public void setVo2MaxLevel(String str) {
        this.f.setText(str);
    }

    public void setVo2MaxValue(int i) {
        this.e.setText(String.valueOf(i));
    }

    public VO2maxView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[]{b(R.color.s51), b(R.color.s30), b(R.color.s33), b(R.color.s20), b(R.color.s16), b(R.color.s14), b(R.color.s25)};
        a();
    }

    public VO2maxView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        this.a = new int[]{b(R.color.s51), b(R.color.s30), b(R.color.s33), b(R.color.s20), b(R.color.s16), b(R.color.s14), b(R.color.s25)};
        a();
    }
}
