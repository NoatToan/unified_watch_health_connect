package com.xiaomi.fitness.userinfo.medicalid.baseui;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.userinfo.medicalid.baseui.OrganDonorView;
import defpackage.ehi;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u0017\u001a\u00020\u00182\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/baseui/OrganDonorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "setTitleView", "(Landroid/widget/TextView;)V", "spinner", "Lmiuix/appcompat/widget/Spinner;", "getSpinner", "()Lmiuix/appcompat/widget/Spinner;", "setSpinner", "(Lmiuix/appcompat/widget/Spinner;)V", "initView", "", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OrganDonorView extends LinearLayout {
    public Spinner spinner;
    public TextView titleView;

    public OrganDonorView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(nvi.J, this);
        initView(context, attributeSet);
    }

    private final void initView(Context context, AttributeSet attrs) {
        setTitleView((TextView) findViewById(hsi.C1));
        getTitleView().setText(ResourceExtKt.getString(o1j.x0));
        setSpinner((Spinner) findViewById(hsi.U0));
        String[] stringArray = getContext().getResources().getStringArray(ehi.i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        Intrinsics.checkNotNull(context);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, nvi.G, R.id.text1, stringArray);
        arrayAdapter.setDropDownViewResource(nvi.d);
        getSpinner().setAdapter((SpinnerAdapter) arrayAdapter);
        int i = o1j.O0;
        Object[] objArr = new Object[2];
        objArr[0] = getTitleView().getText();
        Object selectedItem = getSpinner().getSelectedItem();
        objArr[1] = selectedItem != null ? selectedItem.toString() : null;
        setContentDescription(context.getString(i, objArr));
        setImportantForAccessibility(1);
        setFocusable(1);
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: kch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrganDonorView.initView$lambda$1(this.f23717a, view);
            }
        });
        nuf.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(final OrganDonorView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.post(new Runnable() { // from class: lch
            @Override // java.lang.Runnable
            public final void run() {
                OrganDonorView.initView$lambda$1$lambda$0(this.f24901a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1$lambda$0(OrganDonorView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int[] iArr = new int[2];
        if (ExtUtilsKt.isVisible(this$0.getSpinner())) {
            this$0.getSpinner().getLocationOnScreen(iArr);
            this$0.getSpinner().l(iArr[0], iArr[1]);
        }
    }

    @NotNull
    public final Spinner getSpinner() {
        Spinner spinner = this.spinner;
        if (spinner != null) {
            return spinner;
        }
        Intrinsics.throwUninitializedPropertyAccessException("spinner");
        return null;
    }

    @NotNull
    public final TextView getTitleView() {
        TextView textView = this.titleView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("titleView");
        return null;
    }

    public final void setSpinner(@NotNull Spinner spinner) {
        Intrinsics.checkNotNullParameter(spinner, "<set-?>");
        this.spinner = spinner;
    }

    public final void setTitleView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.titleView = textView;
    }

    public OrganDonorView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(nvi.J, this);
        initView(context, attributeSet);
    }
}
