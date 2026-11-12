package com.xiaomi.fitness.userinfo.medicalid.baseui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.userinfo.medicalid.baseui.BloodTypeView;
import defpackage.hsi;
import defpackage.nuf;
import defpackage.nvi;
import defpackage.o1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.appcompat.widget.Spinner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010&\u001a\u00020'2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/baseui/BloodTypeView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bloodTypeView", "Landroid/view/View;", "getBloodTypeView", "()Landroid/view/View;", "setBloodTypeView", "(Landroid/view/View;)V", "rhView", "getRhView", "setRhView", "bloodTypeTitle", "Landroid/widget/TextView;", "getBloodTypeTitle", "()Landroid/widget/TextView;", "setBloodTypeTitle", "(Landroid/widget/TextView;)V", "rhTitle", "getRhTitle", "setRhTitle", "bloodSpinner", "Lmiuix/appcompat/widget/Spinner;", "getBloodSpinner", "()Lmiuix/appcompat/widget/Spinner;", "setBloodSpinner", "(Lmiuix/appcompat/widget/Spinner;)V", "rhSpinner", "getRhSpinner", "setRhSpinner", "initView", "", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodTypeView extends LinearLayout {
    public Spinner bloodSpinner;
    public TextView bloodTypeTitle;
    public View bloodTypeView;
    public Spinner rhSpinner;
    public TextView rhTitle;
    public View rhView;

    public BloodTypeView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(nvi.z, this);
        initView(context, attributeSet);
    }

    private final void initView(Context context, AttributeSet attrs) {
        String string;
        setBloodTypeView(findViewById(hsi.a0));
        setBloodTypeTitle((TextView) getBloodTypeView().findViewById(hsi.C1));
        getBloodTypeTitle().setText(o1j.u);
        setBloodSpinner((Spinner) getBloodTypeView().findViewById(hsi.U0));
        View bloodTypeView = getBloodTypeView();
        String string2 = null;
        if (context != null) {
            int i = o1j.O0;
            Object[] objArr = new Object[2];
            objArr[0] = getBloodTypeTitle().getText();
            Object selectedItem = getBloodSpinner().getSelectedItem();
            objArr[1] = selectedItem != null ? selectedItem.toString() : null;
            string = context.getString(i, objArr);
        } else {
            string = null;
        }
        bloodTypeView.setContentDescription(string);
        getBloodTypeView().setOnClickListener(new View.OnClickListener() { // from class: x13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodTypeView.initView$lambda$1(this.f38564a, view);
            }
        });
        nuf.f(getBloodTypeView());
        setRhView(findViewById(hsi.b0));
        setRhTitle((TextView) getRhView().findViewById(hsi.C1));
        getRhTitle().setText(o1j.H0);
        setRhSpinner((Spinner) getRhView().findViewById(hsi.U0));
        View rhView = getRhView();
        if (context != null) {
            int i2 = o1j.O0;
            Object[] objArr2 = new Object[2];
            objArr2[0] = getRhTitle().getText();
            Object selectedItem2 = getRhSpinner().getSelectedItem();
            objArr2[1] = selectedItem2 != null ? selectedItem2.toString() : null;
            string2 = context.getString(i2, objArr2);
        }
        rhView.setContentDescription(string2);
        getRhView().setOnClickListener(new View.OnClickListener() { // from class: y13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodTypeView.initView$lambda$3(this.f39674a, view);
            }
        });
        nuf.f(getRhView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(final BloodTypeView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.post(new Runnable() { // from class: w13
            @Override // java.lang.Runnable
            public final void run() {
                BloodTypeView.initView$lambda$1$lambda$0(this.f37431a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1$lambda$0(BloodTypeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int[] iArr = new int[2];
        this$0.getBloodSpinner().getLocationOnScreen(iArr);
        this$0.getBloodSpinner().l(iArr[0], iArr[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(final BloodTypeView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.post(new Runnable() { // from class: v13
            @Override // java.lang.Runnable
            public final void run() {
                BloodTypeView.initView$lambda$3$lambda$2(this.f36367a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3$lambda$2(BloodTypeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int[] iArr = new int[2];
        this$0.getRhSpinner().getLocationOnScreen(iArr);
        this$0.getRhSpinner().l(iArr[0], iArr[1]);
    }

    @NotNull
    public final Spinner getBloodSpinner() {
        Spinner spinner = this.bloodSpinner;
        if (spinner != null) {
            return spinner;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bloodSpinner");
        return null;
    }

    @NotNull
    public final TextView getBloodTypeTitle() {
        TextView textView = this.bloodTypeTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bloodTypeTitle");
        return null;
    }

    @NotNull
    public final View getBloodTypeView() {
        View view = this.bloodTypeView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bloodTypeView");
        return null;
    }

    @NotNull
    public final Spinner getRhSpinner() {
        Spinner spinner = this.rhSpinner;
        if (spinner != null) {
            return spinner;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhSpinner");
        return null;
    }

    @NotNull
    public final TextView getRhTitle() {
        TextView textView = this.rhTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhTitle");
        return null;
    }

    @NotNull
    public final View getRhView() {
        View view = this.rhView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhView");
        return null;
    }

    public final void setBloodSpinner(@NotNull Spinner spinner) {
        Intrinsics.checkNotNullParameter(spinner, "<set-?>");
        this.bloodSpinner = spinner;
    }

    public final void setBloodTypeTitle(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.bloodTypeTitle = textView;
    }

    public final void setBloodTypeView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.bloodTypeView = view;
    }

    public final void setRhSpinner(@NotNull Spinner spinner) {
        Intrinsics.checkNotNullParameter(spinner, "<set-?>");
        this.rhSpinner = spinner;
    }

    public final void setRhTitle(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.rhTitle = textView;
    }

    public final void setRhView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.rhView = view;
    }

    public BloodTypeView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(nvi.z, this);
        initView(context, attributeSet);
    }
}
