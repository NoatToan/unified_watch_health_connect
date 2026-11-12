package com.garmin.android.framework.widget;

import android.content.Context;
import android.util.AttributeSet;
import bd.h;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/framework/widget/SwitchPreferenceAccessibility;", "Landroidx/preference/SwitchPreferenceCompat;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SwitchPreferenceAccessibility extends androidx.preference.SwitchPreferenceCompat {
    public /* synthetic */ SwitchPreferenceAccessibility(Context context, AttributeSet attributeSet, int i14, int i15, int i16, j jVar) {
        this(context, (i16 & 2) != 0 ? null : attributeSet, (i16 & 4) != 0 ? R.attr.switchPreferenceCompatStyle : i14, (i16 & 8) != 0 ? R.style.GCMSwitchPreferenceStyle_3_0 : i15);
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void m(h hVar) {
        hVar.getClass();
        super.m(hVar);
        hVar.d(android.R.id.title);
        hVar.d(android.R.id.summary);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchPreferenceAccessibility(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchPreferenceAccessibility(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchPreferenceAccessibility(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchPreferenceAccessibility(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
