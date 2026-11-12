package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.eui;
import defpackage.i4j;
import defpackage.zqi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/widget/EmergencyCallView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "emergencyCallView", "Landroid/view/View;", "setText", "", "test", "", "getText", "setHint", "hint", "getEditText", "Landroid/widget/EditText;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmergencyCallView extends ConstraintLayout {

    @NotNull
    private final View emergencyCallView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmergencyCallView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final EditText getEditText() {
        View viewFindViewById = this.emergencyCallView.findViewById(zqi.C2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (EditText) viewFindViewById;
    }

    @NotNull
    public final String getText() {
        return ((EditText) this.emergencyCallView.findViewById(zqi.C2)).getText().toString();
    }

    public final void setHint(@NotNull String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        ((EditText) this.emergencyCallView.findViewById(zqi.C2)).setHint(hint);
    }

    public final void setText(@NotNull String test) {
        Intrinsics.checkNotNullParameter(test, "test");
        ((EditText) this.emergencyCallView.findViewById(zqi.C2)).setText(test);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmergencyCallView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmergencyCallView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(eui.N2, (ViewGroup) this, true);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        this.emergencyCallView = viewInflate;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i4j.d1);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String strValueOf = String.valueOf(typedArrayObtainStyledAttributes.getString(i4j.g1));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(i4j.f1, false);
        String string = typedArrayObtainStyledAttributes.getString(i4j.e1);
        typedArrayObtainStyledAttributes.recycle();
        ((TextView) viewInflate.findViewById(zqi.M2)).setText(strValueOf);
        EditText editText = (EditText) viewInflate.findViewById(zqi.C2);
        if (string != null) {
            editText.setHint(string);
        }
        if (z) {
            editText.setInputType(3);
        }
    }

    public /* synthetic */ EmergencyCallView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
