package com.garmin.android.apps.connectmobile.events.components;

import a61.d0;
import a7.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import p005kotlin.Metadata;
import rt1.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/events/components/GCMEditTextTrainingInitiative;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/garmin/android/apps/connectmobile/view/MultiLineImeEditText;", "getEditText", "()Lcom/garmin/android/apps/connectmobile/view/MultiLineImeEditText;", "Landroid/widget/TextView;", "getTopTextView", "()Landroid/widget/TextView;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMEditTextTrainingInitiative extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f34925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultiLineImeEditText f34926b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMEditTextTrainingInitiative(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_complex_in_line_edit_text_training_initiative, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f154543a, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        viewInflate.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, b.getColor(context, R.color.gcm_surface_1)));
        View viewFindViewById = findViewById(R.id.top_left_label);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f34925a = textView;
        textView.setText(typedArrayObtainStyledAttributes.getString(3));
        View viewFindViewById2 = findViewById(R.id.bottom_edit_text);
        viewFindViewById2.getClass();
        MultiLineImeEditText multiLineImeEditText = (MultiLineImeEditText) viewFindViewById2;
        this.f34926b = multiLineImeEditText;
        multiLineImeEditText.setHint(typedArrayObtainStyledAttributes.getString(2));
        View viewFindViewById3 = findViewById(R.id.bottom_right_label);
        viewFindViewById3.getClass();
        ((TextView) viewFindViewById3).setText(typedArrayObtainStyledAttributes.getString(1));
        setOnClickListener(new d0(3, this, context));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: getEditText, reason: from getter */
    public final MultiLineImeEditText getF34926b() {
        return this.f34926b;
    }

    /* JADX INFO: renamed from: getTopTextView, reason: from getter */
    public final TextView getF34925a() {
        return this.f34925a;
    }
}
