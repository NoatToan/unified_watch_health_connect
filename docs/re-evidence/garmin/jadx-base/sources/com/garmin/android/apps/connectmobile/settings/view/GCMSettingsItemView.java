package com.garmin.android.apps.connectmobile.settings.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.t2;
import d53.w;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0013¢\u0006\u0004\b\u0012\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u000eJ\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/view/GCMSettingsItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "titleText", "", "setTitle", "(Ljava/lang/String;)V", "contentDescription", "setTitleContentDescription", "summaryText", "setSummary", "", "(Ljava/lang/CharSequence;)V", "setSummaryContentDescription", "actionText", "setActionText", "Landroid/view/View$OnClickListener;", "clickListener", "setActionClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroidx/appcompat/widget/SwitchCompat;", "getSwitch", "()Landroidx/appcompat/widget/SwitchCompat;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMSettingsItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f44206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f44207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f44208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SwitchCompat f44209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMSettingsItemView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.gcm_settings_item, (ViewGroup) this, true);
        View viewFindViewById = findViewById(android.R.id.title);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f44206a = textView;
        View viewFindViewById2 = findViewById(android.R.id.summary);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        this.f44207b = textView2;
        View viewFindViewById3 = findViewById(R.id.button);
        viewFindViewById3.getClass();
        TextView textView3 = (TextView) viewFindViewById3;
        this.f44208c = textView3;
        View viewFindViewById4 = findViewById(android.R.id.checkbox);
        viewFindViewById4.getClass();
        SwitchCompat switchCompat = (SwitchCompat) viewFindViewById4;
        this.f44209d = switchCompat;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2.f45041c);
        typedArrayObtainStyledAttributes.getClass();
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        textView.setText(typedArrayObtainStyledAttributes.getText(1));
        textView.setEnabled(z14);
        CharSequence text = typedArrayObtainStyledAttributes.getText(2);
        textView2.setText(text);
        textView2.setEnabled(z14);
        textView2.setVisibility((text == null || !(w.J(text) ^ true)) ? 8 : 0);
        boolean z15 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        switchCompat.setVisibility(z15 ? 0 : 8);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(3);
        textView3.setText(text2);
        textView3.setVisibility((text2 == null || !(w.J(text2) ^ true) || z15) ? 8 : 0);
        typedArrayObtainStyledAttributes.recycle();
        if (switchCompat.getVisibility() == 0) {
            textView.setLabelFor(switchCompat.getId());
        } else if (textView3.getVisibility() == 0) {
            textView.setLabelFor(textView3.getId());
        }
        setScreenReaderFocusable(true);
        setFocusable(true);
    }

    /* JADX INFO: renamed from: getSwitch, reason: from getter */
    public final SwitchCompat getF44209d() {
        return this.f44209d;
    }

    public final void setActionClickListener(View.OnClickListener clickListener) {
        clickListener.getClass();
        this.f44208c.setOnClickListener(clickListener);
    }

    public final void setActionText(String actionText) {
        actionText.getClass();
        TextView textView = this.f44208c;
        textView.setVisibility(0);
        textView.setText(actionText);
    }

    public final void setSummary(String summaryText) {
        summaryText.getClass();
        TextView textView = this.f44207b;
        textView.setVisibility(0);
        textView.setText(summaryText);
    }

    public final void setSummaryContentDescription(String contentDescription) {
        contentDescription.getClass();
        this.f44207b.setContentDescription(contentDescription);
    }

    public final void setTitle(String titleText) {
        titleText.getClass();
        this.f44206a.setText(titleText);
    }

    public final void setTitleContentDescription(String contentDescription) {
        contentDescription.getClass();
        this.f44206a.setContentDescription(contentDescription);
    }

    public final void setSummary(CharSequence summaryText) {
        summaryText.getClass();
        TextView textView = this.f44207b;
        textView.setVisibility(0);
        textView.setText(summaryText);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMSettingsItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMSettingsItemView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GCMSettingsItemView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
