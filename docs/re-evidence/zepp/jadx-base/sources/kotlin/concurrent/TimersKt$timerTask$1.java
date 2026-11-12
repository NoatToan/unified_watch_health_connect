package kotlin.concurrent;

import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final class TimersKt$timerTask$1 extends TimerTask {
    public final /* synthetic */ Function1<TimerTask, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public TimersKt$timerTask$1(Function1<? super TimerTask, Unit> function1) {
        this.a = function1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.a.invoke(this);
    }
}
