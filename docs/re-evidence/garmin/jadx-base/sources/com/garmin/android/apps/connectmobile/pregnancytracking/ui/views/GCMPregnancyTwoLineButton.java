package com.garmin.android.apps.connectmobile.pregnancytracking.ui.views;

import a7.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import cb1.c;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u0018J\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u0018J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b(\u0010#J\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\u0018R$\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u000eR(\u0010.\u001a\u0004\u0018\u00010$2\b\u0010.\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u0010'R(\u00105\u001a\u0004\u0018\u00010$2\b\u00102\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00100\"\u0004\b4\u0010'R(\u00109\u001a\u0004\u0018\u00010$2\b\u00106\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00100\"\u0004\b8\u0010'¨\u0006:"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/views/GCMPregnancyTwoLineButton;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/View$OnLongClickListener;", "setOnLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", TtmlNode.ATTR_TTS_COLOR, "setTopLabelTextColor", "(I)V", "setValueLabelTextColor", "colorId", "setTopDividerColor", "height", "setTopDividerHeight", "setBottomDividerColor", "setBottomDividerHeight", "Landroid/text/SpannableStringBuilder;", "spannableStringLabel", "setValueLabel", "(Landroid/text/SpannableStringBuilder;)V", "", "contentDescription", "setValueContentDescription", "(Ljava/lang/String;)V", "setHintLabel", "setBackgroundColor", "visible", "isVisible", "()Z", "setVisible", "buttonTopLabel", "getButtonTopLabel", "()Ljava/lang/String;", "setButtonTopLabel", "valueLabel", "getButtonValueLabel", "setButtonValueLabel", "buttonValueLabel", "text", "getButtonHint", "setButtonHint", "buttonHint", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMPregnancyTwoLineButton extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f41020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f41021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f41022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f41023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f41024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f41025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnClickListener f41026g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMPregnancyTwoLineButton(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.gcm3_pregnancy_two_line_setting_button, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f26644c, i14, 0);
        typedArrayObtainStyledAttributes.getClass();
        View viewFindViewById = findViewById(R.id.inner_layout);
        viewFindViewById.getClass();
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        this.f41020a = viewGroup;
        View viewFindViewById2 = findViewById(R.id.label_top);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f41021b = textView;
        setButtonTopLabel(typedArrayObtainStyledAttributes.getString(13));
        if (typedArrayObtainStyledAttributes.getBoolean(7, false)) {
            textView.setSingleLine(false);
        }
        View viewFindViewById3 = findViewById(R.id.label_bottom);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f41022c = textView2;
        setButtonValueLabel(typedArrayObtainStyledAttributes.getString(3));
        if (typedArrayObtainStyledAttributes.getBoolean(6, false)) {
            textView2.setSingleLine(false);
        }
        View viewFindViewById4 = findViewById(R.id.label_hint);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f41023d = textView3;
        setButtonHint(typedArrayObtainStyledAttributes.getString(4));
        if (typedArrayObtainStyledAttributes.getBoolean(9, false)) {
            textView3.setVisibility(0);
        }
        View viewFindViewById5 = findViewById(R.id.top_divider);
        viewFindViewById5.getClass();
        this.f41024e = viewFindViewById5;
        if (typedArrayObtainStyledAttributes.getBoolean(10, false)) {
            viewFindViewById5.setVisibility(0);
        }
        int color = typedArrayObtainStyledAttributes.getColor(11, -1);
        if (color != -1) {
            viewFindViewById5.setBackgroundColor(color);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        ViewGroup.LayoutParams layoutParams = viewFindViewById5.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = dimensionPixelSize;
        View viewFindViewById6 = findViewById(R.id.bottom_divider);
        viewFindViewById6.getClass();
        this.f41025f = viewFindViewById6;
        if (typedArrayObtainStyledAttributes.getBoolean(8, false)) {
            viewFindViewById6.setVisibility(0);
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
        if (color2 != -1) {
            viewFindViewById6.setBackgroundColor(color2);
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById6.getLayoutParams();
        layoutParams2.getClass();
        ((LinearLayout.LayoutParams) layoutParams2).height = dimensionPixelSize2;
        int color3 = typedArrayObtainStyledAttributes.getColor(0, -1);
        if (color3 != -1) {
            viewGroup.setBackgroundColor(color3);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(5, false)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String getButtonHint() {
        String string;
        CharSequence text = this.f41023d.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    public final String getButtonTopLabel() {
        String string;
        CharSequence text = this.f41021b.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    public final String getButtonValueLabel() {
        String string;
        CharSequence text = this.f41022c.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.f41020a.setBackgroundColor(color);
    }

    public final void setBottomDividerColor(int colorId) {
        this.f41025f.setBackgroundColor(colorId);
    }

    public final void setBottomDividerHeight(int height) {
        ViewGroup.LayoutParams layoutParams = this.f41025f.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = height;
    }

    public final void setButtonHint(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f41023d;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public final void setButtonTopLabel(String str) {
        this.f41021b.setText(str);
    }

    public final void setButtonValueLabel(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f41022c;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ViewGroup viewGroup = this.f41020a;
        viewGroup.setEnabled(enabled);
        TextView textView = this.f41022c;
        TextView textView2 = this.f41021b;
        if (enabled) {
            viewGroup.setBackgroundResource(R.drawable.gcm_surface_1_selector_background);
            textView2.setTextColor(b.getColor(getContext(), R.color.gcm_text_primary));
            textView.setTextColor(b.getColor(getContext(), R.color.gcm_text_secondary));
            viewGroup.setOnClickListener(this.f41026g);
            return;
        }
        viewGroup.setBackgroundColor(b.getColor(getContext(), R.color.gcm_surface_1));
        textView2.setTextColor(b.getColor(getContext(), R.color.gcm_text_primary_disabled));
        textView.setTextColor(b.getColor(getContext(), R.color.gcm_text_secondary_disabled));
        viewGroup.setOnClickListener(null);
    }

    public final void setHintLabel(SpannableStringBuilder spannableStringLabel) {
        spannableStringLabel.getClass();
        this.f41023d.setText(spannableStringLabel);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l14) {
        this.f41026g = l14;
        this.f41020a.setOnClickListener(l14);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l14) {
        this.f41020a.setOnLongClickListener(l14);
    }

    public final void setTopDividerColor(int colorId) {
        this.f41024e.setBackgroundColor(colorId);
    }

    public final void setTopDividerHeight(int height) {
        ViewGroup.LayoutParams layoutParams = this.f41024e.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = height;
    }

    public final void setTopLabelTextColor(int color) {
        this.f41021b.setTextColor(b.getColor(getContext(), color));
    }

    public final void setValueContentDescription(String contentDescription) {
        contentDescription.getClass();
        this.f41022c.setContentDescription(contentDescription);
    }

    public final void setValueLabel(SpannableStringBuilder spannableStringLabel) {
        spannableStringLabel.getClass();
        this.f41022c.setText(spannableStringLabel);
    }

    public final void setValueLabelTextColor(int color) {
        this.f41022c.setTextColor(b.getColor(getContext(), color));
    }

    public final void setVisible(boolean z14) {
        setVisibility(z14 ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMPregnancyTwoLineButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMPregnancyTwoLineButton(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GCMPregnancyTwoLineButton(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
