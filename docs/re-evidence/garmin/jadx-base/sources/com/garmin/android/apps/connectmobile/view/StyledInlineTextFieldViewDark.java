package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.perf.util.Constants;
import h32.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/StyledInlineTextFieldViewDark;", "Lh32/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", Constants.ENABLE_DISABLE, "", "setIsEnabled", "(Z)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class StyledInlineTextFieldViewDark extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyledInlineTextFieldViewDark(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        setNonEditingBackground(new ColorDrawable(a7.b.getColor(context, R.color.gcm_surface_1)));
        setEditingBackground(new ColorDrawable(a7.b.getColor(context, R.color.gcm_surface_2)));
        setNonEditingTitleColor(a7.b.getColor(context, R.color.gcm_text_primary));
        setEditingTitleColor(a7.b.getColor(context, R.color.gcm_text_secondary));
        setNonEditingValueColor(a7.b.getColor(context, R.color.gcm_text_secondary));
        setEditingValueColor(a7.b.getColor(context, R.color.gcm_text_primary));
        setActionButtonColor(a7.b.getColor(context, R.color.teal_70));
        j();
    }

    public final void setIsEnabled(boolean isEnabled) {
        setEnabled(isEnabled);
        setFocusable(isEnabled);
        setClickable(isEnabled);
        getEditText().setEnabled(isEnabled);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StyledInlineTextFieldViewDark(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StyledInlineTextFieldViewDark(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ StyledInlineTextFieldViewDark(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
