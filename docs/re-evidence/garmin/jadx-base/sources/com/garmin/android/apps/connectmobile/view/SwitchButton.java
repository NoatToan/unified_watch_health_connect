package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.view.x0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r22.j1;
import v22.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/SwitchButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setListener", "(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V", "ordinal", "setChecked", "(I)V", TtmlNode.ATTR_ID, "setCheckedById", "", Constants.ScionAnalytics.PARAM_LABEL, "setFirstOption", "(Ljava/lang/String;)V", "setSecondOption", "setThirdOption", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SwitchButton extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RadioGroup f47551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RadioButton f47552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RadioButton f47553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RadioButton f47554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchButton(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_switch_layout, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.switch_btn);
        viewFindViewById.getClass();
        this.f47551a = (RadioGroup) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.first_option);
        viewFindViewById2.getClass();
        RadioButton radioButton = (RadioButton) viewFindViewById2;
        this.f47552b = radioButton;
        View viewFindViewById3 = viewInflate.findViewById(R.id.second_option);
        viewFindViewById3.getClass();
        RadioButton radioButton2 = (RadioButton) viewFindViewById3;
        this.f47553c = radioButton2;
        RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(R.id.third_option);
        this.f47554d = radioButton3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149718t, i14, 0);
        typedArrayObtainStyledAttributes.getClass();
        Typeface typefaceA = h22.a.a("font/roboto_medium.ttf", getContext());
        radioButton.setText(typedArrayObtainStyledAttributes.getString(0));
        radioButton.setTypeface(typefaceA);
        radioButton2.setText(typedArrayObtainStyledAttributes.getString(1));
        radioButton2.setTypeface(typefaceA);
        String string = typedArrayObtainStyledAttributes.getString(2);
        if (string != null && string.length() != 0) {
            if (radioButton3 != null) {
                radioButton3.setText(typedArrayObtainStyledAttributes.getString(2));
            }
            if (radioButton3 != null) {
                radioButton3.setTypeface(typefaceA);
            }
            if (radioButton3 != null) {
                radioButton3.setVisibility(0);
            }
        } else if (radioButton3 != null) {
            radioButton3.setVisibility(8);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setChecked(int ordinal) {
        View childAt = this.f47551a.getChildAt(ordinal);
        if (childAt instanceof RadioButton) {
            ((RadioButton) childAt).setChecked(true);
        }
    }

    public final void setCheckedById(int id3) {
        View next;
        Iterator<View> it = new x0(this.f47551a).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getId() != id3);
        View view2 = next;
        if (view2 == null || !(view2 instanceof RadioButton)) {
            return;
        }
        ((RadioButton) view2).setChecked(true);
    }

    public final void setFirstOption(String label) {
        this.f47552b.setText(label);
    }

    public final void setListener(RadioGroup.OnCheckedChangeListener listener) {
        listener.getClass();
        this.f47551a.setOnCheckedChangeListener(listener);
    }

    public final void setSecondOption(String label) {
        this.f47553c.setText(label);
    }

    public final void setThirdOption(String label) {
        RadioButton radioButton = this.f47554d;
        if (radioButton != null) {
            radioButton.setText(label);
        }
        if (radioButton != null) {
            e.v(radioButton, !TextUtils.isEmpty(label));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchButton(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ SwitchButton(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
