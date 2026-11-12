package com.xiaomi.fitness.health.curse.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.curse.view.CurseSetItemView;
import com.xiaomi.fitness.widget.view.DividerView;
import defpackage.itb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/CurseSetItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "label", "title", "value", "", "showDivider", "", "setData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "setValue", "(Ljava/lang/String;)V", "Lkotlin/Function0;", "onClick", "addClick", "(Lkotlin/jvm/functions/Function0;)V", "setTitle", "Litb;", "binding", "Litb;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attr", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseSetItemView extends ConstraintLayout {

    @NotNull
    private final itb binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseSetItemView(@NotNull Context ctx, @NotNull AttributeSet attr) {
        this(ctx, attr, 0, 4, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(attr, "attr");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addClick$lambda$0(Function0 onClick, View view) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
    }

    public static /* synthetic */ void setData$default(CurseSetItemView curseSetItemView, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            z = true;
        }
        curseSetItemView.setData(str, str2, str3, z);
    }

    public final void addClick(@NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.binding.B.setOnClickListener(new View.OnClickListener() { // from class: xb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseSetItemView.addClick$lambda$0(onClick, view);
            }
        });
    }

    public final void setData(@NotNull String label, @NotNull String title, @NotNull String value, boolean showDivider) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.binding.C.setText(label);
        this.binding.C.setContentDescription(label);
        this.binding.B.setTitle(title);
        this.binding.B.setRemindText(value);
        DividerView divider = this.binding.A;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        ExtUtilsKt.setVisible(divider, showDivider);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.binding.B.setTitle(title);
    }

    public final void setValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.binding.B.setRemindText(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseSetItemView(@NotNull Context ctx, @NotNull AttributeSet attr, int i) {
        super(ctx, attr, i);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(attr, "attr");
        itb itbVarA0 = itb.A0(LayoutInflater.from(ctx), this, true);
        Intrinsics.checkNotNullExpressionValue(itbVarA0, "inflate(...)");
        this.binding = itbVarA0;
    }

    public /* synthetic */ CurseSetItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
