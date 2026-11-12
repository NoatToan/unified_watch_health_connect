package com.huawei.ui.commonui.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class HealthDivider extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f23491a;
    private View d;
    private int e;

    public HealthDivider(Context context) {
        this(context, null);
    }

    public HealthDivider(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet);
        this.e = 0;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.health_common_divider_layout, this);
        if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.health_divider)) != null) {
            this.e = typedArrayObtainStyledAttributes.getInteger(R.styleable.health_divider_dividerType, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.e == 1) {
            this.f23491a = viewInflate.findViewById(R.id.health_divider_splitter);
            this.d = viewInflate.findViewById(R.id.health_divider_line);
            this.f23491a.setVisibility(0);
            this.d.setVisibility(8);
        }
    }

    public void setDividerBackground(int i) {
        View view = this.d;
        if (view != null) {
            view.setBackgroundColor(i);
        }
        View view2 = this.f23491a;
        if (view2 != null) {
            view2.setBackgroundColor(i);
        }
    }
}
