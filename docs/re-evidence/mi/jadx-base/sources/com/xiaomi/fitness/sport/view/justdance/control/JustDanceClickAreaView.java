package com.xiaomi.fitness.sport.view.justdance.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u001b\u001a\u00020\u00192\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u0017¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000eH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018j\u0004\u0018\u0001`\u0017X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceClickAreaView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "width", "height", "touchDown", "Lkotlin/Pair;", "", "centralPoint", "okPercent", "okRange", "emptyPercent", "emptyRange", "directionPercent", "directionRange", "onClickAreaListener", "Lcom/xiaomi/fitness/sport/view/justdance/control/OnClickAreaListener;", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "setOnClickAreaListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lkotlin/jvm/functions/Function1;)V", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "getTouchArea", "x", "y", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JustDanceClickAreaView extends AppCompatImageView {

    @NotNull
    private Pair<Float, Float> centralPoint;
    private final float directionPercent;
    private float directionRange;
    private final float emptyPercent;
    private float emptyRange;
    private int height;
    private final float okPercent;
    private float okRange;

    @Nullable
    private Function1<? super Integer, Unit> onClickAreaListener;

    @NotNull
    private Pair<Float, Float> touchDown;
    private int width;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JustDanceClickAreaView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getTouchArea(float x, float y) {
        float fFloatValue = x - this.centralPoint.getFirst().floatValue();
        float fFloatValue2 = y - this.centralPoint.getSecond().floatValue();
        float fSqrt = (float) Math.sqrt((fFloatValue * fFloatValue) + (fFloatValue2 * fFloatValue2));
        if (fSqrt <= this.okRange) {
            return 5;
        }
        if (fSqrt < this.emptyRange || fSqrt > this.directionRange) {
            return 0;
        }
        if (fFloatValue == 0.0f) {
            return fFloatValue2 > 0.0f ? 1 : 2;
        }
        double dAtan = ((double) (((float) Math.atan((-fFloatValue2) / fFloatValue)) * 180)) / 3.141592653589793d;
        if (dAtan > 45.0d || dAtan < -45.0d) {
            return fFloatValue2 > 0.0f ? 2 : 1;
        }
        if (dAtan >= 45.0d || dAtan <= -45.0d) {
            return 5;
        }
        return fFloatValue > 0.0f ? 3 : 4;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.width = getMeasuredWidth();
        this.height = getMeasuredHeight();
        int i = this.width;
        this.okRange = i * this.okPercent;
        this.emptyRange = i * this.emptyPercent;
        this.directionRange = i * this.directionPercent;
        this.centralPoint = new Pair<>(Float.valueOf(i / 2.0f), Float.valueOf(this.height / 2.0f));
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        Integer numValueOf = event != null ? Integer.valueOf(event.getActionMasked()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.touchDown = new Pair<>(Float.valueOf(event.getX()), Float.valueOf(event.getY()));
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            int touchArea = getTouchArea(this.touchDown.getFirst().floatValue(), this.touchDown.getSecond().floatValue());
            int touchArea2 = getTouchArea(event.getX(), event.getY());
            if (touchArea != touchArea2) {
                return false;
            }
            if (touchArea != 0) {
                Function1<? super Integer, Unit> function1 = this.onClickAreaListener;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(touchArea2));
                }
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setOnClickAreaListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onClickAreaListener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JustDanceClickAreaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ JustDanceClickAreaView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JustDanceClickAreaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Float fValueOf = Float.valueOf(0.0f);
        this.touchDown = new Pair<>(fValueOf, fValueOf);
        this.centralPoint = new Pair<>(fValueOf, fValueOf);
        this.okPercent = 0.15f;
        this.emptyPercent = 0.25f;
        this.directionPercent = 0.5f;
    }
}
