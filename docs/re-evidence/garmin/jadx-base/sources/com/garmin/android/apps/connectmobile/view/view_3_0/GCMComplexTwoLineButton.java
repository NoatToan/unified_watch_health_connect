package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import go1.g0;
import l7.f;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
public class GCMComplexTwoLineButton extends RelativeLayout implements j32.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f47780n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f47781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f47782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f47783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProgressBar f47784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f47785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f47786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f47787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f47788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f47789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f47790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SwitchCompat f47791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View.OnClickListener f47792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View.OnClickListener f47793m;

    public class a extends androidx.core.view.a {
        public a(GCMComplexTwoLineButton gCMComplexTwoLineButton) {
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.k(f.a.f110568g);
            fVar.o(false);
        }
    }

    public class b extends androidx.core.view.a {
        public b(GCMComplexTwoLineButton gCMComplexTwoLineButton) {
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.b(f.a.f110568g);
            fVar.o(true);
        }
    }

    public GCMComplexTwoLineButton(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f47781a = null;
        this.f47782b = null;
        this.f47783c = null;
        this.f47785e = null;
        this.f47786f = null;
        this.f47787g = null;
        this.f47788h = null;
        this.f47789i = null;
        this.f47790j = null;
        this.f47791k = null;
        LayoutInflater.from(context).inflate(R.layout.gcm_complex_two_line_button_3_0, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149707i, i14, 0);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.inner_layout);
        this.f47781a = viewGroup;
        this.f47782b = (ImageView) findViewById(R.id.icon_left);
        setLeftIcon(typedArrayObtainStyledAttributes.getDrawable(11));
        ImageView imageView = (ImageView) findViewById(R.id.icon_right);
        this.f47783c = imageView;
        setRightIcon(typedArrayObtainStyledAttributes.getDrawable(12));
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(13);
        if (colorStateList != null) {
            imageView.setImageTintList(colorStateList);
        }
        this.f47784d = (ProgressBar) findViewById(R.id.progress_bar_right);
        this.f47791k = (SwitchCompat) findViewById(R.id.switch_right);
        TextView textView = (TextView) findViewById(R.id.label_top);
        this.f47785e = textView;
        setButtonTopLabel(typedArrayObtainStyledAttributes.getString(10));
        TextView textView2 = (TextView) findViewById(R.id.label_bottom);
        this.f47786f = textView2;
        setButtonBottomLeftLabel(typedArrayObtainStyledAttributes.getString(7));
        TextView textView3 = (TextView) findViewById(R.id.label_right);
        this.f47787g = textView3;
        setButtonRightLabel(typedArrayObtainStyledAttributes.getString(9));
        textView3.setOnClickListener(new g0(this, 1));
        this.f47788h = (TextView) findViewById(R.id.label_hint);
        setButtonHint(typedArrayObtainStyledAttributes.getString(8));
        if (typedArrayObtainStyledAttributes.getBoolean(4, false)) {
            textView.setSingleLine(false);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            textView2.setSingleLine(false);
        }
        View viewFindViewById = findViewById(R.id.top_divider);
        this.f47789i = viewFindViewById;
        if (typedArrayObtainStyledAttributes.getBoolean(6, false)) {
            viewFindViewById.setVisibility(0);
        }
        int color = typedArrayObtainStyledAttributes.getColor(14, -1);
        if (color != -1) {
            viewFindViewById.setBackgroundColor(color);
        }
        ((LinearLayout.LayoutParams) viewFindViewById.getLayoutParams()).height = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
        View viewFindViewById2 = findViewById(R.id.bottom_divider);
        this.f47790j = viewFindViewById2;
        if (typedArrayObtainStyledAttributes.getBoolean(5, false)) {
            viewFindViewById2.setVisibility(0);
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
        if (color2 != -1) {
            viewFindViewById2.setBackgroundColor(color2);
        }
        ((LinearLayout.LayoutParams) viewFindViewById2.getLayoutParams()).height = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(0, -1);
        if (color3 != -1) {
            viewGroup.setBackgroundColor(color3);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // j32.b
    public final void a(String str, String str2) {
        b(str, str2);
    }

    public final void b(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f47786f;
        if (zIsEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
        textView.setContentDescription(str2);
    }

    public final void c(boolean z14) {
        TextView textView = this.f47786f;
        if (textView != null) {
            textView.setVisibility(z14 ? 0 : 8);
        }
    }

    public final void d(boolean z14) {
        this.f47783c.setVisibility(z14 ? 0 : 8);
    }

    public final void e(boolean z14) {
        this.f47784d.setVisibility(z14 ? 0 : 8);
    }

    public final void f(boolean z14) {
        this.f47791k.setVisibility(z14 ? 0 : 8);
    }

    public final void g(boolean z14) {
        SwitchCompat switchCompat = this.f47791k;
        if (switchCompat != null) {
            switchCompat.setChecked(z14);
        }
    }

    public String getButtonBottomLeftLabel() {
        CharSequence text = this.f47786f.getText();
        String string = text != null ? text.toString() : null;
        return string != null ? string : "";
    }

    public String getButtonHint() {
        CharSequence text = this.f47788h.getText();
        String string = text != null ? text.toString() : null;
        return string != null ? string : "";
    }

    public String getButtonRightLabel() {
        CharSequence text = this.f47787g.getText();
        String string = text != null ? text.toString() : null;
        return string != null ? string : "";
    }

    public ViewGroup.LayoutParams getButtonRightLayoutParams() {
        return this.f47787g.getLayoutParams();
    }

    public String getButtonTopLabel() {
        CharSequence text = this.f47785e.getText();
        String string = text != null ? text.toString() : null;
        return string != null ? string : "";
    }

    public View getParentContainer() {
        return this.f47781a;
    }

    @Override // j32.b
    public final boolean isVisible() {
        return getVisibility() == 0;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i14) {
        this.f47781a.setBackgroundColor(i14);
    }

    public void setBottomDividerColor(int i14) {
        this.f47790j.setBackgroundColor(i14);
    }

    public void setBottomDividerHeight(int i14) {
        ((LinearLayout.LayoutParams) this.f47790j.getLayoutParams()).height = i14;
    }

    public void setButtonBottomLeftLabel(int i14) {
        TextView textView = this.f47786f;
        if (i14 == -1) {
            textView.setVisibility(8);
        } else {
            textView.setText(i14);
            textView.setVisibility(0);
        }
    }

    public void setButtonBottomLeftLabelTextColor(int i14) {
        this.f47786f.setTextColor(a7.b.getColor(getContext(), i14));
    }

    public void setButtonHint(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f47788h;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public void setButtonRightLabel(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f47787g;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public void setButtonRightLabelTextColor(int i14) {
        this.f47787g.setTextColor(a7.b.getColor(getContext(), i14));
    }

    public void setButtonRightLabelTextSize(int i14) {
        this.f47787g.setTextSize(2, i14);
    }

    public void setButtonRightLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.f47787g.setLayoutParams(layoutParams);
    }

    public void setButtonRightTextAppearance(int i14) {
        this.f47787g.setTextAppearance(i14);
    }

    public void setButtonTopLabel(String str) {
        this.f47785e.setText(str);
    }

    public void setButtonTopLabelContentDescription(String str) {
        this.f47785e.setContentDescription(str);
    }

    public void setButtonTopLabelTextColor(int i14) {
        this.f47785e.setTextColor(a7.b.getColor(getContext(), i14));
    }

    @Override // android.view.View, j32.b
    public void setEnabled(boolean z14) {
        super.setEnabled(z14);
        this.f47791k.setEnabled(z14);
        ViewGroup viewGroup = this.f47781a;
        viewGroup.setEnabled(z14);
        TextView textView = this.f47787g;
        TextView textView2 = this.f47786f;
        TextView textView3 = this.f47785e;
        if (z14) {
            viewGroup.setBackgroundResource(R.drawable.gcm_surface_1_selector_background);
            textView3.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_primary));
            textView2.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_secondary));
            textView.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_primary_action));
            viewGroup.setOnClickListener(this.f47792l);
            return;
        }
        viewGroup.setBackgroundColor(a7.b.getColor(getContext(), R.color.gcm_surface_1));
        textView3.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_primary_disabled));
        textView2.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_secondary_disabled));
        textView.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_primary_action_disabled));
        viewGroup.setOnClickListener(null);
    }

    @Override // j32.b
    public void setFieldValueColor(int i14) {
        this.f47786f.setTextColor(a7.b.getColor(getContext(), i14));
    }

    public void setLeftIcon(Drawable drawable) {
        ImageView imageView = this.f47782b;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
    }

    public void setLeftIconClickListener(View.OnClickListener onClickListener) {
        this.f47782b.setOnClickListener(onClickListener);
    }

    public void setLeftIconContentDescription(String str) {
        if (str != null) {
            this.f47782b.setContentDescription(str);
        }
    }

    public void setMultiLineTopLabel(boolean z14) {
        this.f47785e.setSingleLine(!z14);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        SwitchCompat switchCompat = this.f47791k;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    @Override // android.view.View, j32.b
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f47792l = onClickListener;
        ViewGroup viewGroup = this.f47781a;
        if (onClickListener == null) {
            s0.r(viewGroup, new a(this));
        } else {
            s0.r(viewGroup, new b(this));
        }
        viewGroup.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f47781a.setOnLongClickListener(onLongClickListener);
    }

    public void setOnSwitchClickListener(View.OnClickListener onClickListener) {
        SwitchCompat switchCompat = this.f47791k;
        if (switchCompat != null) {
            switchCompat.setOnClickListener(onClickListener);
        }
    }

    public void setParentContainerScreenReaderFocusable(boolean z14) {
        ViewGroup viewGroup = this.f47781a;
        if (viewGroup != null) {
            viewGroup.setScreenReaderFocusable(z14);
            viewGroup.setFocusable(z14);
        }
    }

    public void setRightIcon(Drawable drawable) {
        ImageView imageView = this.f47783c;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
    }

    public void setRightLabelClickable(boolean z14) {
        TextView textView = this.f47787g;
        if (textView != null) {
            textView.setClickable(z14);
        }
    }

    public void setRightLabelFocusable(boolean z14) {
        TextView textView = this.f47787g;
        if (textView != null) {
            textView.setFocusable(z14);
        }
    }

    @Override // j32.a
    public void setSecondActionOnClickListener(View.OnClickListener onClickListener) {
        this.f47793m = onClickListener;
    }

    @Override // j32.a
    public void setSecondActionText(int i14) {
        setButtonRightLabel(i14);
    }

    public void setSwitchEnabled(boolean z14) {
        this.f47791k.setEnabled(z14);
    }

    public void setTopDividerColor(int i14) {
        this.f47789i.setBackgroundColor(i14);
    }

    public void setTopDividerHeight(int i14) {
        ((LinearLayout.LayoutParams) this.f47789i.getLayoutParams()).height = i14;
    }

    public void setTwoLineButtonContentDescription(String str) {
        setContentDescription(str);
    }

    @Override // j32.b
    public void setVisible(boolean z14) {
        setVisibility(z14 ? 0 : 8);
    }

    public void setButtonTopLabel(Spannable spannable) {
        this.f47785e.setText(spannable);
    }

    public void setButtonBottomLeftLabel(String str) {
        b(str, null);
    }

    public void setButtonBottomLeftLabel(SpannableStringBuilder spannableStringBuilder) {
        this.f47786f.setText(spannableStringBuilder);
    }

    public void setButtonRightLabel(int i14) {
        TextView textView = this.f47787g;
        if (i14 != -1) {
            textView.setText(i14);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    public GCMComplexTwoLineButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GCMComplexTwoLineButton(Context context) {
        this(context, null, 0);
    }
}
