package com.garmin.android.apps.connectmobile.pregnancytracking.ui;

import a7.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cb1.c;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/GCMComplexInLineEditText;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMComplexInLineEditText extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiLineImeEditText f40431a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMComplexInLineEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_complex_in_line_edit_text, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f26642a, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        viewInflate.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, b.getColor(context, R.color.gcm_surface_1)));
        View viewFindViewById = findViewById(R.id.top_left_label);
        viewFindViewById.getClass();
        ((TextView) viewFindViewById).setText(typedArrayObtainStyledAttributes.getString(3));
        View viewFindViewById2 = findViewById(R.id.bottom_edit_text);
        viewFindViewById2.getClass();
        MultiLineImeEditText multiLineImeEditText = (MultiLineImeEditText) viewFindViewById2;
        this.f40431a = multiLineImeEditText;
        multiLineImeEditText.setHint(typedArrayObtainStyledAttributes.getString(2));
        View viewFindViewById3 = findViewById(R.id.bottom_right_label);
        viewFindViewById3.getClass();
        ((TextView) viewFindViewById3).setText(typedArrayObtainStyledAttributes.getString(1));
        setOnClickListener(new cw2.b(8, this, context));
        typedArrayObtainStyledAttributes.recycle();
    }
}
