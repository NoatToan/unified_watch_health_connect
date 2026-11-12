package com.xiaomi.fitness.health.curse.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/SymRecordInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "factor", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "typeView", "Landroid/widget/TextView;", "levelView", "Lcom/xiaomi/fitness/health/curse/view/SymRangeView;", "setData", "", "startMills", "", "inDays", "list", "", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SymRecordInfoView extends LinearLayout {

    @NotNull
    private final CurseFactor factor;

    @NotNull
    private final SymRangeView levelView;

    @NotNull
    private final TextView typeView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymRecordInfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setData(long startMills, int inDays, @NotNull List<WomenHealthSymptoms> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        SymRangeView.setData$default(this.levelView, startMills, inDays, list, 0, 8, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymRecordInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymRecordInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(jui.j3, (ViewGroup) this, true);
        setOrientation(1);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, n4j.V5);
        int i2 = typedArrayObtainAttributes.getInt(n4j.W5, 0);
        typedArrayObtainAttributes.recycle();
        CurseFactor factor = CurseFactorKt.getFactor(i2);
        this.factor = factor;
        TextView textView = (TextView) findViewById(eri.po);
        this.typeView = textView;
        textView.setText(CurseFactorKt.getName(factor));
        SymRangeView symRangeView = (SymRangeView) findViewById(eri.na);
        this.levelView = symRangeView;
        symRangeView.setFactor(factor, 1);
    }

    public /* synthetic */ SymRecordInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
