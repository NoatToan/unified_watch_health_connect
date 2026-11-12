package com.xiaomi.fitness.health.curse.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fitness.health.curse.data.CurseFactor;
import com.xiaomi.fitness.health.curse.data.CurseFactorKt;
import defpackage.eri;
import defpackage.jui;
import defpackage.n4j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010\u001f\u001a\u00020\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/SymRecordLatestView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getAttr", "()Landroid/util/AttributeSet;", "factor", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "levelView", "Lcom/xiaomi/fitness/health/curse/view/SymRangeView;", "nameView", "Landroid/widget/TextView;", "getNameView", "()Landroid/widget/TextView;", "setNameView", "(Landroid/widget/TextView;)V", "setData", "", "startMills", "", "inDays", "data", "", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "nameWidth", "getNameWidth", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SymRecordLatestView extends ConstraintLayout {

    @Nullable
    private final AttributeSet attr;

    @NotNull
    private final CurseFactor factor;

    @NotNull
    private SymRangeView levelView;

    @NotNull
    private TextView nameView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymRecordLatestView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final AttributeSet getAttr() {
        return this.attr;
    }

    @NotNull
    public final TextView getNameView() {
        return this.nameView;
    }

    public final int getNameWidth() {
        return this.nameView.getWidth();
    }

    public final void setData(long startMills, int inDays, @NotNull List<WomenHealthSymptoms> data, int nameWidth) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.levelView.setData(startMills, inDays, data, nameWidth);
    }

    public final void setNameView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.nameView = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymRecordLatestView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymRecordLatestView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.attr = attributeSet;
        LayoutInflater.from(context).inflate(jui.Z2, (ViewGroup) this, true);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, n4j.g2);
        int i2 = typedArrayObtainAttributes.getInt(n4j.h2, 0);
        typedArrayObtainAttributes.recycle();
        this.levelView = (SymRangeView) findViewById(eri.na);
        this.nameView = (TextView) findViewById(eri.po);
        CurseFactor factor = CurseFactorKt.getFactor(i2);
        this.factor = factor;
        this.levelView.setFactor(factor, 2);
        this.nameView.setText(CurseFactorKt.getName(factor));
    }

    public /* synthetic */ SymRecordLatestView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
