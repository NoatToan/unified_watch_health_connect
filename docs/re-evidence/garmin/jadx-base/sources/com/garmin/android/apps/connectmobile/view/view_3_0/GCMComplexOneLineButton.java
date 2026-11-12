package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.GCMProgressBar;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r22.j1;
import v22.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002MNB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u0019\u0010\u0018\u001a\u00020\u000e2\b\b\u0001\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000e2\b\b\u0001\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u0019J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010\"J\u0017\u0010%\u001a\u00020\u000e2\b\b\u0001\u0010$\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0019J\u0017\u0010&\u001a\u00020\u000e2\b\b\u0001\u0010$\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0019J\u0015\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b(\u0010\u0019J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\b¢\u0006\u0004\b*\u0010\u0019J\u0015\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\b¢\u0006\u0004\b,\u0010\u0019J\u0017\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b,\u0010\"J\u0015\u0010.\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\b¢\u0006\u0004\b.\u0010\u0019J\u0015\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u0010\u0019J\u0015\u00101\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\b¢\u0006\u0004\b1\u0010\u0019J\u0015\u00102\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\b2\u0010\u0019J\u0017\u00104\u001a\u00020\u000e2\b\b\u0001\u00103\u001a\u00020\b¢\u0006\u0004\b4\u0010\u0019J\u0017\u00107\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b=\u0010\u0014J\u0017\u0010?\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u00010>¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\b¢\u0006\u0004\bB\u0010\u0019J\u0017\u0010C\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\bC\u0010\u0014R(\u0010D\u001a\u0004\u0018\u00010\u001f2\b\u0010D\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\b\u001e\u0010\"R(\u0010G\u001a\u0004\u0018\u00010\u001f2\b\u0010G\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010F\"\u0004\bI\u0010\"R(\u0010J\u001a\u0004\u0018\u00010\u001f2\b\u0010J\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010F\"\u0004\bL\u0010\"¨\u0006O"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMComplexOneLineButton;", "Landroid/widget/RelativeLayout;", "Lj32/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "visible", "setVisible", TtmlNode.ATTR_TTS_COLOR, "setFieldValueColor", "(I)V", "Landroid/view/View$OnLongClickListener;", "setOnLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "labelResId", "setButtonLeftLabel", "", "contentDescription", "setButtonLeftContentDescription", "(Ljava/lang/String;)V", "setButtonRightContentDescription", "colorId", "setLeftLabelColor", "setRightLabelColor", "paddingLeft", "setLeftLabelPaddingLeft", "paddingRight", "setRightLabelPaddingRight", "resId", "setButtonBottomHint", "bottomHintText", "setTopDividerColor", "height", "setTopDividerHeight", "setBottomDividerColor", "setBottomDividerHeight", "iconResId", "setLeftIcon", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMComplexOneLineButton$a;", "rightView", "setRightElement", "(Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMComplexOneLineButton$a;)V", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCheckedChangeListener", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "setOnSwitchClickListener", "Landroid/view/View$OnTouchListener;", "setOnSwitchOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "visibility", "setRightHintIconVisibility", "setRightHintIconOnClickListener", "buttonLeftLabel", "getButtonLeftLabel", "()Ljava/lang/String;", "buttonRightLabel", "getButtonRightLabel", "setButtonRightLabel", "buttonRightLabelContentDescription", "getButtonRightLabelContentDescription", "setButtonRightLabelContentDescription", "a", "b", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMComplexOneLineButton extends RelativeLayout implements j32.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f47760m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f47761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f47762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f47763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f47764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f47765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f47766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f47767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f47768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f47769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final GCMProgressBar f47770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SwitchCompat f47771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ConstraintLayout f47772l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMComplexOneLineButton$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        NONE,
        SWITCH,
        TEXT
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47779a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SWITCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47779a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMComplexOneLineButton(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.gcm_complex_one_line_button_3_0, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149706h, i14, 0);
        typedArrayObtainStyledAttributes.getClass();
        View viewFindViewById = findViewById(R.id.texts_constraint_layout);
        viewFindViewById.getClass();
        this.f47772l = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.inner_layout);
        viewFindViewById2.getClass();
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        this.f47761a = viewGroup;
        View viewFindViewById3 = findViewById(R.id.icon_left);
        viewFindViewById3.getClass();
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f47767g = imageView;
        View viewFindViewById4 = findViewById(R.id.label_left);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f47762b = textView;
        View viewFindViewById5 = findViewById(R.id.switch_right);
        viewFindViewById5.getClass();
        this.f47771k = (SwitchCompat) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.label_image_right);
        viewFindViewById6.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById6;
        this.f47768h = imageView2;
        View viewFindViewById7 = findViewById(R.id.label_right);
        viewFindViewById7.getClass();
        TextView textView2 = (TextView) viewFindViewById7;
        this.f47763c = textView2;
        View viewFindViewById8 = findViewById(R.id.bottom_hint);
        viewFindViewById8.getClass();
        this.f47764d = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.image_right);
        viewFindViewById9.getClass();
        this.f47769i = (ImageView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.onelineProgressBar);
        viewFindViewById10.getClass();
        GCMProgressBar gCMProgressBar = (GCMProgressBar) viewFindViewById10;
        this.f47770j = gCMProgressBar;
        gCMProgressBar.setVisibility(8);
        setRightElement(a.values()[typedArrayObtainStyledAttributes.getInt(16, 0)]);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(12);
        if (drawable != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(14);
        if (colorStateList != null) {
            imageView.setImageTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15) && typedArrayObtainStyledAttributes.hasValue(13)) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
            layoutParams.height = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
            imageView.setLayoutParams(layoutParams);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(10);
        if (drawable2 != null) {
            imageView2.setVisibility(0);
            imageView2.setImageDrawable(drawable2);
        }
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(11);
        if (colorStateList2 != null) {
            imageView2.setImageTintList(colorStateList2);
        }
        setButtonLeftLabel(typedArrayObtainStyledAttributes.getString(4));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        if (dimensionPixelSize != 0) {
            textView.setPadding(dimensionPixelSize, 0, 0, 0);
        }
        ColorStateList colorStateList3 = typedArrayObtainStyledAttributes.getColorStateList(6);
        if (colorStateList3 != null) {
            textView.setTextColor(colorStateList3);
        }
        setButtonRightLabel(typedArrayObtainStyledAttributes.getString(7));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        if (dimensionPixelSize2 != 0) {
            textView2.setPadding(0, 0, dimensionPixelSize2, 0);
        }
        ColorStateList colorStateList4 = typedArrayObtainStyledAttributes.getColorStateList(9);
        if (colorStateList4 != null) {
            textView2.setTextColor(colorStateList4);
        }
        View viewFindViewById11 = findViewById(R.id.top_divider);
        viewFindViewById11.getClass();
        this.f47765e = viewFindViewById11;
        if (typedArrayObtainStyledAttributes.getBoolean(18, false)) {
            e.q(viewFindViewById11);
        }
        int color = typedArrayObtainStyledAttributes.getColor(19, -1);
        if (color != -1) {
            viewFindViewById11.setBackgroundColor(color);
            e.q(viewFindViewById11);
        }
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, 0);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById11.getLayoutParams();
        layoutParams2.getClass();
        ((LinearLayout.LayoutParams) layoutParams2).height = dimensionPixelSize3;
        View viewFindViewById12 = findViewById(R.id.bottom_divider);
        viewFindViewById12.getClass();
        this.f47766f = viewFindViewById12;
        if (typedArrayObtainStyledAttributes.getBoolean(17, false)) {
            e.q(viewFindViewById12);
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
        if (color2 != -1) {
            viewFindViewById12.setBackgroundColor(color2);
            e.q(viewFindViewById12);
        }
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById12.getLayoutParams();
        layoutParams3.getClass();
        ((LinearLayout.LayoutParams) layoutParams3).height = dimensionPixelSize4;
        setButtonBottomHint(typedArrayObtainStyledAttributes.getString(3));
        int color3 = typedArrayObtainStyledAttributes.getColor(0, -1);
        if (color3 != -1) {
            viewGroup.setBackgroundColor(color3);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // j32.b
    public final void a(String str, String str2) {
        str.getClass();
        setButtonRightLabel(str);
        setButtonRightLabelContentDescription(str2);
    }

    public final void b() {
        ImageView imageView = this.f47767g;
        imageView.setImageResource(R.drawable.ic_add_round);
        imageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Context context = getContext();
        context.getClass();
        Resources resources = getContext().getResources();
        resources.getClass();
        layoutParams.width = (int) c22.b.c(context, xy2.b.n(resources, 16.0f), 1.5f);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Context context2 = getContext();
        context2.getClass();
        Resources resources2 = getContext().getResources();
        resources2.getClass();
        layoutParams2.height = (int) c22.b.c(context2, xy2.b.n(resources2, 16.0f), 1.5f);
    }

    public final void c(Drawable drawable, Float f14) {
        ImageView imageView = this.f47768h;
        if (drawable == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Context context = getContext();
        context.getClass();
        Resources resources = getContext().getResources();
        resources.getClass();
        layoutParams.width = (int) c22.b.c(context, xy2.b.n(resources, f14 != null ? f14.floatValue() : 16.0f), 1.5f);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Context context2 = getContext();
        context2.getClass();
        Resources resources2 = getContext().getResources();
        resources2.getClass();
        layoutParams2.height = (int) c22.b.c(context2, xy2.b.n(resources2, f14 != null ? f14.floatValue() : 16.0f), 1.5f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void e() {
        this.f47766f.setVisibility(8);
    }

    public final void f(boolean z14) {
        this.f47768h.setVisibility(z14 ? 0 : 8);
    }

    public final void g(boolean z14) {
        this.f47770j.setVisibility(z14 ? 0 : 8);
    }

    public final String getButtonLeftLabel() {
        CharSequence text = this.f47762b.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final String getButtonRightLabel() {
        CharSequence text = this.f47763c.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final String getButtonRightLabelContentDescription() {
        CharSequence contentDescription = this.f47763c.getContentDescription();
        if (contentDescription != null) {
            return contentDescription.toString();
        }
        return null;
    }

    public final void h() {
        this.f47765e.setVisibility(8);
    }

    public final void i(boolean z14) {
        this.f47771k.setChecked(z14);
    }

    @Override // j32.b
    public final boolean isVisible() {
        return getVisibility() == 0;
    }

    public final void j() {
        SwitchCompat switchCompat = this.f47771k;
        if (switchCompat.isChecked()) {
            switchCompat.setChecked(false);
        }
    }

    public final void k() {
        SwitchCompat switchCompat = this.f47771k;
        if (switchCompat.isChecked()) {
            return;
        }
        switchCompat.setChecked(true);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        boolean z14 = bVar.f47777a;
        SwitchCompat switchCompat = this.f47771k;
        switchCompat.setEnabled(z14);
        switchCompat.setChecked(bVar.f47778b);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        SwitchCompat switchCompat = this.f47771k;
        return new b(parcelableOnSaveInstanceState, switchCompat.isEnabled(), switchCompat.isChecked());
    }

    public final void setBottomDividerColor(int colorId) {
        this.f47766f.setBackgroundColor(colorId);
    }

    public final void setBottomDividerHeight(int height) {
        ViewGroup.LayoutParams layoutParams = this.f47766f.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = height;
    }

    public final void setButtonBottomHint(String bottomHintText) {
        boolean zIsEmpty = TextUtils.isEmpty(bottomHintText);
        TextView textView = this.f47764d;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(bottomHintText);
        }
    }

    public final void setButtonLeftContentDescription(String contentDescription) {
        contentDescription.getClass();
        this.f47762b.setContentDescription(contentDescription);
    }

    public final void setButtonLeftLabel(String str) {
        this.f47762b.setText(str);
    }

    public final void setButtonRightContentDescription(String contentDescription) {
        contentDescription.getClass();
        this.f47763c.setContentDescription(contentDescription);
    }

    public final void setButtonRightLabel(String str) {
        TextView textView = this.f47763c;
        textView.setText(str);
        textView.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d dVar = new d();
        ConstraintLayout constraintLayout = this.f47772l;
        dVar.f(constraintLayout);
        Context context = getContext();
        context.getClass();
        double dA = c22.b.a(context);
        TextView textView2 = this.f47762b;
        if (dA >= 1.5d) {
            dVar.e(textView2.getId(), 7);
            dVar.e(textView2.getId(), 4);
            dVar.e(textView.getId(), 3);
            dVar.h(textView2.getId(), 6, 0, 6);
            dVar.h(textView2.getId(), 3, 0, 3);
            dVar.h(textView2.getId(), 7, 0, 7);
            dVar.h(textView.getId(), 6, 0, 6);
            dVar.h(textView.getId(), 3, textView2.getId(), 4);
            dVar.h(textView.getId(), 7, 0, 7);
            dVar.k(textView.getId()).f6203e.f6224c = 0;
        } else {
            dVar.h(textView2.getId(), 6, 0, 6);
            dVar.h(textView2.getId(), 3, 0, 3);
            dVar.h(textView2.getId(), 7, textView.getId(), 6);
            dVar.h(textView2.getId(), 4, 0, 4);
            dVar.h(textView2.getId(), 7, 0, 7);
            dVar.h(textView2.getId(), 3, 0, 3);
            dVar.h(textView2.getId(), 4, 0, 4);
        }
        dVar.b(constraintLayout);
    }

    public final void setButtonRightLabelContentDescription(String str) {
        this.f47763c.setContentDescription(str);
    }

    @Override // android.view.View, j32.b
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ViewGroup viewGroup = this.f47761a;
        viewGroup.setEnabled(enabled);
        this.f47771k.setEnabled(enabled);
        TextView textView = this.f47762b;
        if (enabled) {
            viewGroup.setBackgroundResource(R.drawable.gcm_surface_1_selector_background);
            textView.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_primary));
        } else {
            viewGroup.setBackgroundColor(a7.b.getColor(getContext(), R.color.gcm_list_item_background));
            textView.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_primary_disabled));
        }
    }

    @Override // j32.b
    public void setFieldValueColor(int color) {
        this.f47763c.setTextColor(a7.b.getColor(getContext(), color));
    }

    public final void setLeftIcon(int iconResId) {
        ImageView imageView = this.f47767g;
        imageView.setImageResource(iconResId);
        imageView.setVisibility(0);
    }

    public final void setLeftLabelColor(int colorId) {
        this.f47762b.setTextColor(colorId);
    }

    public final void setLeftLabelPaddingLeft(int paddingLeft) {
        this.f47762b.setPadding(paddingLeft, 0, 0, 0);
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener) {
        this.f47771k.setOnCheckedChangeListener(listener);
    }

    @Override // android.view.View, j32.b
    public void setOnClickListener(View.OnClickListener l14) {
        this.f47761a.setOnClickListener(l14);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l14) {
        this.f47761a.setOnLongClickListener(l14);
    }

    public final void setOnSwitchClickListener(View.OnClickListener listener) {
        this.f47771k.setOnClickListener(listener);
    }

    public final void setOnSwitchOnTouchListener(View.OnTouchListener listener) {
        this.f47771k.setOnTouchListener(listener);
    }

    public final void setRightElement(a rightView) {
        int i14 = rightView == null ? -1 : c.f47779a[rightView.ordinal()];
        SwitchCompat switchCompat = this.f47771k;
        TextView textView = this.f47763c;
        if (i14 == 1) {
            switchCompat.setVisibility(8);
            textView.setVisibility(8);
        } else if (i14 == 2) {
            switchCompat.setVisibility(0);
            textView.setVisibility(8);
        } else {
            if (i14 != 3) {
                return;
            }
            textView.setVisibility(0);
            switchCompat.setVisibility(8);
        }
    }

    public final void setRightHintIconOnClickListener(View.OnClickListener listener) {
        this.f47769i.setOnClickListener(listener);
    }

    public final void setRightHintIconVisibility(int visibility) {
        this.f47769i.setVisibility(visibility);
    }

    public final void setRightLabelColor(int colorId) {
        this.f47763c.setTextColor(colorId);
    }

    public final void setRightLabelPaddingRight(int paddingRight) {
        this.f47763c.setPadding(0, 0, paddingRight, 0);
    }

    public final void setTopDividerColor(int colorId) {
        this.f47765e.setBackgroundColor(colorId);
    }

    public final void setTopDividerHeight(int height) {
        ViewGroup.LayoutParams layoutParams = this.f47765e.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = height;
    }

    @Override // j32.b
    public void setVisible(boolean visible) {
        setVisibility(visible ? 0 : 8);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\rB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0012\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMComplexOneLineButton$b;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "", "enabled", "checked", "<init>", "(Landroid/os/Parcelable;ZZ)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "CREATOR", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f47777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f47778b;

        private b(Parcel parcel) {
            super(parcel);
            this.f47777a = parcel.readInt() == 1;
            this.f47778b = parcel.readInt() == 1;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f47777a ? 1 : 0);
            parcel.writeInt(this.f47778b ? 1 : 0);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMComplexOneLineButton$b$a;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMComplexOneLineButton$b;", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<b> {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }

            private Companion() {
            }
        }

        public b(Parcelable parcelable, boolean z14, boolean z15) {
            super(parcelable);
            this.f47778b = z15;
            this.f47777a = z14;
        }

        public /* synthetic */ b(Parcel parcel, j jVar) {
            this(parcel);
        }
    }

    public final void setButtonLeftLabel(int labelResId) {
        this.f47762b.setText(labelResId);
    }

    public final void setButtonBottomHint(int resId) {
        setButtonBottomHint(this.f47764d.getContext().getString(resId));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMComplexOneLineButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMComplexOneLineButton(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GCMComplexOneLineButton(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
