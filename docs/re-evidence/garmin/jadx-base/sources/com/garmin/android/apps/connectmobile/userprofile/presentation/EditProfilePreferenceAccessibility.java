package com.garmin.android.apps.connectmobile.userprofile.presentation;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import bd.h;
import ch.qos.logback.core.CoreConstants;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/EditProfilePreferenceAccessibility;", "Landroidx/preference/Preference;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditProfilePreferenceAccessibility extends Preference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditProfilePreferenceAccessibility(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // androidx.preference.Preference
    public final void m(h hVar) {
        hVar.getClass();
        super.m(hVar);
        TextView textView = (TextView) hVar.d(R.id.title);
        TextView textView2 = (TextView) hVar.d(R.id.summary);
        hVar.itemView.setContentDescription(((Object) (textView != null ? textView.getText() : null)) + StringUtils.SPACE + ((Object) (textView2 != null ? textView2.getText() : null)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfilePreferenceAccessibility(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        attributeSet.getClass();
    }

    public /* synthetic */ EditProfilePreferenceAccessibility(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
