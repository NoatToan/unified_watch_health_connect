package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.snackbar.ContentViewCallback;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/GCMSnackbarContentLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/google/android/material/snackbar/ContentViewCallback;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "getMessageView", "()Landroid/widget/TextView;", "getActionViewShortText", "getActionViewLongText", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMSnackbarContentLayout extends ConstraintLayout implements ContentViewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f47455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f47456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f47457c;

    public /* synthetic */ GCMSnackbarContentLayout(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public final void animateContentIn(int i14, int i15) {
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public final void animateContentOut(int i14, int i15) {
    }

    public final TextView getActionViewLongText() {
        TextView textView = this.f47457c;
        if (textView != null) {
            return textView;
        }
        s.m("actionViewLongText");
        throw null;
    }

    public final TextView getActionViewShortText() {
        TextView textView = this.f47456b;
        if (textView != null) {
            return textView;
        }
        s.m("actionViewShortText");
        throw null;
    }

    public final TextView getMessageView() {
        TextView textView = this.f47455a;
        if (textView != null) {
            return textView;
        }
        s.m("messageView");
        throw null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.snackbar_text);
        viewFindViewById.getClass();
        this.f47455a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.snackbar_action_short);
        viewFindViewById2.getClass();
        this.f47456b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.snackbar_action_long);
        viewFindViewById3.getClass();
        this.f47457c = (TextView) viewFindViewById3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMSnackbarContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMSnackbarContentLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMSnackbarContentLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
