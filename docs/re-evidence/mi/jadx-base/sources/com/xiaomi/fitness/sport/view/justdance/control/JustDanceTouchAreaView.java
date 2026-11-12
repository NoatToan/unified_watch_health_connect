package com.xiaomi.fitness.sport.view.justdance.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\r2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000b¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0002J\b\u0010'\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020\rH\u0002R$\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceTouchAreaView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onToucheAreaListener", "Lcom/xiaomi/fitness/sport/view/justdance/control/OnToucheAreaListener;", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "setOnToucheAreaListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lkotlin/jvm/functions/Function1;)V", "setReverseX", "reverse", "", "pressX", "", "pressY", "pressTime", "", "reverseX", "gesture", "timerTask", "Ljava/util/TimerTask;", "timer", "Ljava/util/Timer;", "timerOn", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "getGesture", "dx", "dy", "stopTimer", "startTimer", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JustDanceTouchAreaView extends ConstraintLayout {
    private int gesture;

    @Nullable
    private Function1<? super Integer, Unit> onToucheAreaListener;
    private long pressTime;
    private float pressX;
    private float pressY;
    private boolean reverseX;

    @Nullable
    private Timer timer;
    private boolean timerOn;

    @Nullable
    private TimerTask timerTask;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JustDanceTouchAreaView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getGesture(int dx, int dy) {
        if (Math.abs(dx) > 5 && Math.abs(dy) > 5) {
            if (Math.abs(dx) > Math.abs(dy)) {
                return ((dx <= 0 || this.reverseX) && (dx >= 0 || !this.reverseX)) ? 4 : 3;
            }
            return dy > 0 ? 2 : 1;
        }
        if (Math.abs(dx) > 5) {
            return ((dx <= 0 || this.reverseX) && (dx >= 0 || !this.reverseX)) ? 4 : 3;
        }
        if (Math.abs(dy) > 5) {
            return dy > 0 ? 2 : 1;
        }
        return 5;
    }

    private final void startTimer() {
        stopTimer();
        this.timerOn = true;
        if (this.timerTask == null) {
            this.timerTask = new TimerTask() { // from class: com.xiaomi.fitness.sport.view.justdance.control.JustDanceTouchAreaView.startTimer.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Function1 function1;
                    if (JustDanceTouchAreaView.this.gesture == 0 || JustDanceTouchAreaView.this.gesture == 5 || (function1 = JustDanceTouchAreaView.this.onToucheAreaListener) == null) {
                        return;
                    }
                    function1.invoke2(Integer.valueOf(JustDanceTouchAreaView.this.gesture));
                }
            };
        }
        if (this.timer == null) {
            Timer timer = new Timer();
            this.timer = timer;
            timer.schedule(this.timerTask, 250L, 250L);
        }
    }

    private final void stopTimer() {
        TimerTask timerTask = this.timerTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.timerTask = null;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.purge();
        }
        this.timer = null;
        this.timerOn = false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        Integer numValueOf = event != null ? Integer.valueOf(event.getActionMasked()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.pressX = event.getX();
            this.pressY = event.getY();
            this.pressTime = System.currentTimeMillis();
            if (!this.timerOn) {
                startTimer();
            }
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            this.gesture = getGesture((int) (event.getX() - this.pressX), (int) (event.getY() - this.pressY));
        } else {
            if (numValueOf != null && numValueOf.intValue() == 1) {
                stopTimer();
                int x = (int) (event.getX() - this.pressX);
                int y = (int) (event.getY() - this.pressY);
                if (System.currentTimeMillis() - this.pressTime < 250) {
                    if (Math.abs(x) >= 5 || Math.abs(y) >= 5) {
                        Function1<? super Integer, Unit> function1 = this.onToucheAreaListener;
                        if (function1 != null) {
                            function1.invoke2(Integer.valueOf(getGesture(x, y)));
                        }
                    } else {
                        Function1<? super Integer, Unit> function2 = this.onToucheAreaListener;
                        if (function2 != null) {
                            function2.invoke2(5);
                        }
                    }
                }
                return true;
            }
            if (numValueOf != null && numValueOf.intValue() == 3) {
                stopTimer();
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setOnToucheAreaListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onToucheAreaListener = listener;
    }

    public final void setReverseX(boolean reverse) {
        this.reverseX = reverse;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JustDanceTouchAreaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ JustDanceTouchAreaView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JustDanceTouchAreaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
