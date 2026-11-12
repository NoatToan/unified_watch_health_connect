package com.garmin.android.apps.connectmobile.training.fbtap.util;

import a7.b;
import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/util/FBTCheckableRowView;", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMCheckableRow;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "checked", "", "setChecked", "(Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FBTCheckableRowView extends GCMCheckableRow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBTCheckableRowView(Context context) {
        super(context);
        context.getClass();
        getContentContainer().setBackgroundColor(b.getColor(getContext(), R.color.gcm_surface_1));
    }

    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow
    public final void c(boolean z14) {
        super.c(z14);
        getContentContainer().setBackgroundColor(z14 ? b.getColor(getContext(), R.color.gcm_surface_2) : b.getColor(getContext(), R.color.gcm_surface_1));
    }

    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow, android.widget.Checkable
    public void setChecked(boolean checked) {
        super.setChecked(checked);
        getContentContainer().setBackgroundColor(checked ? b.getColor(getContext(), R.color.gcm_surface_2) : b.getColor(getContext(), R.color.gcm_surface_1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBTCheckableRowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBTCheckableRowView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        getContentContainer().setBackgroundColor(b.getColor(getContext(), R.color.gcm_surface_1));
    }

    public /* synthetic */ FBTCheckableRowView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
