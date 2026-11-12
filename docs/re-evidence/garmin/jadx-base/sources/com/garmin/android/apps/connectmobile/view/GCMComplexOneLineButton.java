package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
public class GCMComplexOneLineButton extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f47440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f47441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f47442c;

    public GCMComplexOneLineButton(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f47440a = null;
        this.f47441b = null;
        this.f47442c = null;
        LayoutInflater.from(context).inflate(R.layout.gcm_complex_one_line_button, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149706h, i14, 0);
        this.f47440a = (ViewGroup) findViewById(R.id.inner_layout);
        TextView textView = (TextView) findViewById(R.id.label_left);
        this.f47441b = textView;
        setButtonLeftLabel(typedArrayObtainStyledAttributes.getString(4));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        if (dimensionPixelSize != 0) {
            textView.setPadding(dimensionPixelSize, 0, 0, 0);
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(6);
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = (TextView) findViewById(R.id.label_right);
        this.f47442c = textView2;
        setButtonRightLabel(typedArrayObtainStyledAttributes.getString(7));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        if (dimensionPixelSize != 0) {
            textView2.setPadding(0, 0, dimensionPixelSize2, 0);
        }
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(9);
        if (colorStateList2 != null) {
            textView2.setTextColor(colorStateList2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(String str, String str2) {
        TextView textView = this.f47442c;
        textView.setText(str);
        textView.setContentDescription(str2);
    }

    public String getButtonRightLabel() {
        return this.f47442c.getText().toString();
    }

    public void setButtonLeftLabel(String str) {
        this.f47441b.setText(str);
    }

    public void setButtonRightLabel(String str) {
        a(str, null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z14) {
        super.setEnabled(z14);
        ViewGroup viewGroup = this.f47440a;
        viewGroup.setEnabled(z14);
        if (z14) {
            viewGroup.setBackgroundResource(R.drawable.gcm_surface_1_selector_background);
        } else {
            viewGroup.setBackgroundColor(getContext().getColor(R.color.gcm_list_item_background));
        }
    }

    public void setLeftLabelColor(int i14) {
        this.f47441b.setTextColor(i14);
    }

    public void setLeftLabelPaddingLeft(int i14) {
        this.f47441b.setPadding(i14, 0, 0, 0);
    }

    public void setRightLabelColor(int i14) {
        this.f47442c.setTextColor(i14);
    }

    public void setRightLabelPaddingRight(int i14) {
        this.f47442c.setPadding(0, 0, i14, 0);
    }

    public GCMComplexOneLineButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GCMComplexOneLineButton(Context context) {
        this(context, null, 0);
    }
}
