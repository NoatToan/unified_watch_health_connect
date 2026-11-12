package com.xiaomi.fitness.sport_eco.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ky7;
import defpackage.v4j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/widget/SportRadioView;", "Landroid/widget/LinearLayout;", "Landroid/util/AttributeSet;", "attrs", "", "initView", "(Landroid/util/AttributeSet;)V", "onFinishInflate", "()V", "", "title", "setTitle", "(Ljava/lang/String;)V", "detail", "setDetail", "Landroid/widget/CheckedTextView;", "getRadioView", "()Landroid/widget/CheckedTextView;", "Lky7;", "binding", "Lky7;", "Ljava/lang/String;", "Landroid/content/Context;", "context", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportRadioView extends LinearLayout {

    @NotNull
    private ky7 binding;
    private String detail;
    private String title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportRadioView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initView(AttributeSet attrs) {
        TypedArray typedArrayObtainAttributes = getContext().getResources().obtainAttributes(attrs, v4j.v4);
        String string = typedArrayObtainAttributes.getString(v4j.x4);
        if (string == null) {
            string = "";
        }
        this.title = string;
        String string2 = typedArrayObtainAttributes.getString(v4j.w4);
        this.detail = string2 != null ? string2 : "";
        typedArrayObtainAttributes.recycle();
    }

    @NotNull
    public final CheckedTextView getRadioView() {
        CheckedTextView radio = this.binding.A;
        Intrinsics.checkNotNullExpressionValue(radio, "radio");
        return radio;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ky7 ky7Var = this.binding;
        TextView textView = ky7Var.C;
        String str = this.title;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
            str = null;
        }
        textView.setText(str);
        TextView textView2 = ky7Var.B;
        String str3 = this.detail;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detail");
        } else {
            str2 = str3;
        }
        textView2.setText(str2);
    }

    public final void setDetail(@NotNull String detail) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.binding.B.setText(detail);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.binding.C.setText(title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportRadioView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportRadioView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportRadioView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ky7 ky7VarA0 = ky7.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ky7VarA0, "inflate(...)");
        this.binding = ky7VarA0;
        initView(attributeSet);
    }
}
