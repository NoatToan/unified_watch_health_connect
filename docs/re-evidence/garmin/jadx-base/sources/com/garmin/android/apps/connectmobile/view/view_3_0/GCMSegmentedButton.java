package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import rt1.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u0018J\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010\u0012J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u0018J\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b%\u0010\u000eR(\u0010'\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010/\u001a\u0004\u0018\u00010&2\b\u0010,\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+¨\u00060"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMSegmentedButton;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/View$OnLongClickListener;", "setOnLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", TtmlNode.ATTR_TTS_COLOR, "setButtonTopLabelTextColor", "(I)V", "colorId", "setTopDividerColor", "height", "setTopDividerHeight", "setBottomDividerColor", "setBottomDividerHeight", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setOnCheckedChangeListener", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "setOnSwitchClickListener", "setBackgroundColor", "flag", "setEnable", "", "buttonTopLabel", "getButtonTopLabel", "()Ljava/lang/String;", "setButtonTopLabel", "(Ljava/lang/String;)V", "text", "getButtonHint", "setButtonHint", "buttonHint", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMSegmentedButton extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f47796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f47797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f47798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f47799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f47800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SwitchCompat f47801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnClickListener f47802g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMSegmentedButton(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.gcm_segmented_toggle_button, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f154544b, i14, 0);
        typedArrayObtainStyledAttributes.getClass();
        View viewFindViewById = findViewById(R.id.inner_layout);
        viewFindViewById.getClass();
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        this.f47796a = viewGroup;
        this.f47801f = (SwitchCompat) findViewById(R.id.value_switch);
        View viewFindViewById2 = findViewById(R.id.label_top);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f47797b = textView;
        setButtonTopLabel(typedArrayObtainStyledAttributes.getString(5));
        View viewFindViewById3 = findViewById(R.id.label_hint);
        viewFindViewById3.getClass();
        this.f47798c = (TextView) viewFindViewById3;
        setButtonHint(typedArrayObtainStyledAttributes.getString(3));
        if (typedArrayObtainStyledAttributes.getBoolean(7, false)) {
            textView.setSingleLine(false);
        }
        View viewFindViewById4 = findViewById(R.id.top_divider);
        viewFindViewById4.getClass();
        this.f47799d = viewFindViewById4;
        if (typedArrayObtainStyledAttributes.getBoolean(10, false)) {
            viewFindViewById4.setVisibility(0);
        }
        int color = typedArrayObtainStyledAttributes.getColor(11, -1);
        if (color != -1) {
            viewFindViewById4.setBackgroundColor(color);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        ViewGroup.LayoutParams layoutParams = viewFindViewById4.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = dimensionPixelSize;
        View viewFindViewById5 = findViewById(R.id.bottom_divider);
        viewFindViewById5.getClass();
        this.f47800e = viewFindViewById5;
        if (typedArrayObtainStyledAttributes.getBoolean(8, false)) {
            viewFindViewById5.setVisibility(0);
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
        if (color2 != -1) {
            viewFindViewById5.setBackgroundColor(color2);
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById5.getLayoutParams();
        layoutParams2.getClass();
        ((LinearLayout.LayoutParams) layoutParams2).height = dimensionPixelSize2;
        int color3 = typedArrayObtainStyledAttributes.getColor(0, -1);
        if (color3 != -1) {
            viewGroup.setBackgroundColor(color3);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(4, false)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a() {
        SwitchCompat switchCompat = this.f47801f;
        return switchCompat != null && switchCompat.isChecked();
    }

    public final void b(boolean z14) {
        SwitchCompat switchCompat = this.f47801f;
        if (switchCompat != null) {
            switchCompat.setChecked(z14);
        }
    }

    public final void c() {
        SwitchCompat switchCompat = this.f47801f;
        if (switchCompat == null || !switchCompat.isChecked()) {
            return;
        }
        switchCompat.setChecked(false);
    }

    public final String getButtonHint() {
        String string;
        CharSequence text = this.f47798c.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    public final String getButtonTopLabel() {
        String string;
        CharSequence text = this.f47797b.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.f47796a.setBackgroundColor(color);
    }

    public final void setBottomDividerColor(int colorId) {
        this.f47800e.setBackgroundColor(colorId);
    }

    public final void setBottomDividerHeight(int height) {
        ViewGroup.LayoutParams layoutParams = this.f47800e.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = height;
    }

    public final void setButtonHint(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f47798c;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public final void setButtonTopLabel(String str) {
        this.f47797b.setText(str);
    }

    public final void setButtonTopLabelTextColor(int color) {
        this.f47797b.setTextColor(a7.b.getColor(getContext(), color));
    }

    public final void setEnable(boolean flag) {
        SwitchCompat switchCompat = this.f47801f;
        if (switchCompat != null) {
            switchCompat.setEnabled(flag);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        SwitchCompat switchCompat = this.f47801f;
        if (switchCompat != null) {
            switchCompat.setEnabled(enabled);
        }
        ViewGroup viewGroup = this.f47796a;
        viewGroup.setEnabled(enabled);
        TextView textView = this.f47797b;
        if (enabled) {
            viewGroup.setBackgroundResource(R.drawable.gcm_surface_1_selector_background);
            textView.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_primary));
            viewGroup.setOnClickListener(this.f47802g);
        } else {
            viewGroup.setBackgroundColor(a7.b.getColor(getContext(), R.color.gcm_surface_1));
            textView.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_primary_disabled));
            viewGroup.setOnClickListener(null);
        }
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener) {
        listener.getClass();
        SwitchCompat switchCompat = this.f47801f;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(listener);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        this.f47802g = listener;
        this.f47796a.setOnClickListener(listener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener listener) {
        this.f47796a.setOnLongClickListener(listener);
    }

    public final void setOnSwitchClickListener(View.OnClickListener listener) {
        listener.getClass();
        SwitchCompat switchCompat = this.f47801f;
        if (switchCompat != null) {
            switchCompat.setOnClickListener(listener);
        }
    }

    public final void setTopDividerColor(int colorId) {
        this.f47799d.setBackgroundColor(colorId);
    }

    public final void setTopDividerHeight(int height) {
        ViewGroup.LayoutParams layoutParams = this.f47799d.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = height;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMSegmentedButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMSegmentedButton(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GCMSegmentedButton(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
