package com.xiaomi.fitness.health.sleep.rhythm.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.n4j;
import defpackage.t1c;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/view/SleepRhythmIndicatorView;", "Landroid/widget/LinearLayout;", "Lt1c;", "binding", "Lt1c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmIndicatorView extends LinearLayout {

    @NotNull
    private final t1c binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepRhythmIndicatorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepRhythmIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SleepRhythmIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepRhythmIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        t1c t1cVarA0 = t1c.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(t1cVarA0, "inflate(...)");
        this.binding = t1cVarA0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.k2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(n4j.n2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(n4j.l2, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(n4j.m2, 0);
        typedArrayObtainStyledAttributes.recycle();
        t1cVarA0.C.setText(string);
        if (resourceId2 != 0) {
            AppCompatImageView iconSecond = t1cVarA0.B;
            Intrinsics.checkNotNullExpressionValue(iconSecond, "iconSecond");
            ViewExtKt.setVisible(iconSecond, true);
            t1cVarA0.B.setImageResource(resourceId2);
        } else {
            AppCompatImageView iconSecond2 = t1cVarA0.B;
            Intrinsics.checkNotNullExpressionValue(iconSecond2, "iconSecond");
            ViewExtKt.setVisible(iconSecond2, false);
        }
        if (resourceId != 0) {
            AppCompatImageView iconFirst = t1cVarA0.A;
            Intrinsics.checkNotNullExpressionValue(iconFirst, "iconFirst");
            ViewExtKt.setVisible(iconFirst, true);
            t1cVarA0.A.setImageResource(resourceId);
            return;
        }
        AppCompatImageView iconFirst2 = t1cVarA0.A;
        Intrinsics.checkNotNullExpressionValue(iconFirst2, "iconFirst");
        ViewExtKt.setVisible(iconFirst2, false);
    }
}
