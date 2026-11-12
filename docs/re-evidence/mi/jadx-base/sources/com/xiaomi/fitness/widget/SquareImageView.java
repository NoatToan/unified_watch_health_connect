package com.xiaomi.fitness.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fitness.widget.SquareImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0014R\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/widget/SquareImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/xiaomi/fitness/widget/RatioView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ratio", "", "getRatio", "()F", "setRatio", "(F)V", "widthFixed", "", "getWidthFixed", "()Z", "setWidthFixed", "(Z)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SquareImageView extends AppCompatImageView implements RatioView {
    private float ratio;
    private boolean widthFixed;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SquareImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMeasure$lambda$0(SquareImageView this$0, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onMeasure(i, i2);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.widget.RatioView
    public float getRatio() {
        return this.ratio;
    }

    @Override // com.xiaomi.fitness.widget.RatioView
    public boolean getWidthFixed() {
        return this.widthFixed;
    }

    @Override // com.xiaomi.fitness.widget.RatioView
    public void obtainAttrs(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        RatioView.DefaultImpls.obtainAttrs(this, context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        onRatioMeasure(widthMeasureSpec, heightMeasureSpec, new Function2() { // from class: g8o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SquareImageView.onMeasure$lambda$0(this.f18731a, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
    }

    @Override // com.xiaomi.fitness.widget.RatioView
    public void onRatioMeasure(int i, int i2, @NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        RatioView.DefaultImpls.onRatioMeasure(this, i, i2, function2);
    }

    @Override // com.xiaomi.fitness.widget.RatioView
    public void setRatio(float f) {
        this.ratio = f;
    }

    @Override // com.xiaomi.fitness.widget.RatioView
    public void setWidthFixed(boolean z) {
        this.widthFixed = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SquareImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SquareImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SquareImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ratio = 1.0f;
        this.widthFixed = true;
    }
}
