package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.huawei.healthcloud.plugintrack.R;
import defpackage.jst;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicTimelineView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f11254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimelineCanvasView f11255c;

    public DynamicTimelineView(Context context) {
        this(context, null);
    }

    public DynamicTimelineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicTimelineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }

    private void c(Context context) {
        setOrientation(1);
        inflate(context, R.layout.track_dynamic_timeline_layout, this);
        this.f11255c = (TimelineCanvasView) findViewById(R.id.timelineCanvas);
        this.f11254b = (LinearLayout) findViewById(R.id.labelContainer);
    }

    public void setSegments(List<jst> list) {
        this.f11255c.setSegments(list);
        e(list);
    }

    private void e(List<jst> list) {
        this.f11254b.removeAllViews();
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        if (size == 1) {
            this.f11254b.setOrientation(0);
            this.f11254b.setGravity(17);
            this.f11254b.addView(d(list.get(0).e(), list.get(0).d()));
            return;
        }
        if (size == 2) {
            this.f11254b.setOrientation(0);
            View viewD = d(list.get(0).e(), list.get(0).d());
            View viewD2 = d(list.get(1).e(), list.get(1).d());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            Space space = new Space(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            this.f11254b.addView(viewD, layoutParams);
            this.f11254b.addView(space, layoutParams3);
            this.f11254b.addView(viewD2, layoutParams2);
            return;
        }
        a(list, size);
    }

    private void a(List<jst> list, int i) {
        this.f11254b.setOrientation(0);
        this.f11254b.setGravity(16);
        View viewD = d(list.get(0).e(), list.get(0).d());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.START;
        this.f11254b.addView(viewD, layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        this.f11254b.addView(linearLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
        for (int i2 = 1; i2 <= i - 2; i2++) {
            View viewD2 = d(list.get(i2).e(), list.get(i2).d());
            viewD2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            ((LinearLayout) viewD2).setGravity(17);
            linearLayout.addView(viewD2);
        }
        int i3 = i - 1;
        View viewD3 = d(list.get(i3).e(), list.get(i3).d());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = GravityCompat.END;
        this.f11254b.addView(viewD3, layoutParams2);
    }

    private View d(String str, int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        View view = new View(getContext());
        int iA = a(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iA, iA);
        layoutParams.rightMargin = a(4);
        view.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        view.setBackground(gradientDrawable);
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(i);
        textView.setTextSize(1, Math.min(getResources().getConfiguration().fontScale, 1.15f) * 12.0f);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(view);
        linearLayout.addView(textView);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    public void setGapWidth(float f) {
        this.f11255c.setGapWidth(f);
    }

    public void setCornerRadius(float f) {
        this.f11255c.setCornerRadius(f);
    }

    private int a(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }
}
