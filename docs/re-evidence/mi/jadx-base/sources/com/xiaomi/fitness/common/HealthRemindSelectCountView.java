package com.xiaomi.fitness.common;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.xiaomi.fitness.common.HealthRemindSelectCountView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.c0j;
import defpackage.jui;
import defpackage.nuf;
import defpackage.t0c;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import miuix.appcompat.widget.Spinner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/common/HealthRemindSelectCountView;", "Landroid/widget/LinearLayout;", "", "position", "", "setSpinnerSelection", "(I)V", "Lt0c;", "binding", "Lt0c;", "Landroid/widget/TextView;", "titleView", "Landroid/widget/TextView;", "Lmiuix/appcompat/widget/Spinner;", "spinner", "Lmiuix/appcompat/widget/Spinner;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HealthRemindSelectCountView extends LinearLayout {

    @NotNull
    private final t0c binding;

    @NotNull
    private final Spinner spinner;

    @NotNull
    private final TextView titleView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public HealthRemindSelectCountView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(HealthRemindSelectCountView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.spinner.setSelection(0);
    }

    public final void setSpinnerSelection(int position) {
        this.spinner.setSelection(position);
    }

    public /* synthetic */ HealthRemindSelectCountView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HealthRemindSelectCountView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        t0c t0cVarA0 = t0c.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(t0cVarA0, "inflate(...)");
        this.binding = t0cVarA0;
        TextView tvTitle = t0cVarA0.C;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        this.titleView = tvTitle;
        Spinner spinner = t0cVarA0.A;
        Intrinsics.checkNotNullExpressionValue(spinner, "spinner");
        this.spinner = spinner;
        tvTitle.setText(ResourceExtKt.getString(c0j.B1));
        String[] strArr = new String[0];
        for (int i = 1; i < 13; i++) {
            strArr = (String[]) ArraysKt___ArraysJvmKt.plus(strArr, String.valueOf(i));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, jui.a5, R.id.text1, strArr);
        arrayAdapter.setDropDownViewResource(jui.j8);
        this.spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spinner.post(new Runnable() { // from class: v0c
            @Override // java.lang.Runnable
            public final void run() {
                HealthRemindSelectCountView._init_$lambda$0(this.f36346a);
            }
        });
        nuf.i(this, this.spinner);
    }
}
