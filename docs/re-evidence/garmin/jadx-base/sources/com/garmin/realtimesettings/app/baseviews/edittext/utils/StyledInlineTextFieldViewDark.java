package com.garmin.realtimesettings.app.baseviews.edittext.utils;

import a7.b;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pv2.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/realtimesettings/app/baseviews/edittext/utils/StyledInlineTextFieldViewDark;", "Lpv2/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class StyledInlineTextFieldViewDark extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyledInlineTextFieldViewDark(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        setNonEditingBackground(new ColorDrawable(b.getColor(context, R.color.surface_1)));
        setEditingBackground(new ColorDrawable(b.getColor(context, R.color.surface_2)));
        setNonEditingTitleColor(b.getColor(context, R.color.rts_primary_text_color));
        setEditingTitleColor(b.getColor(context, R.color.rts_secondary_text_color));
        setNonEditingValueColor(b.getColor(context, R.color.rts_secondary_text_color));
        setEditingValueColor(b.getColor(context, R.color.rts_primary_text_color));
        i();
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
