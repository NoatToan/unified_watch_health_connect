package com.xiaomi.fitness.sensor;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sensor.InteractiveDetector$mScreenStateReceiver$1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/xiaomi/fitness/sensor/InteractiveDetector$mScreenStateReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InteractiveDetector$mScreenStateReceiver$1 extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$0() {
        InteractiveDetector interactiveDetector = InteractiveDetector.INSTANCE;
        IDetectorIndicator detectIndicator = interactiveDetector.getDetectIndicator();
        KeyguardManager keyguardManager = (KeyguardManager) interactiveDetector.getMContext().getSystemService(KeyguardManager.class);
        if (detectIndicator == null || keyguardManager == null || keyguardManager.isKeyguardLocked()) {
            return;
        }
        detectIndicator.onRefresh(interactiveDetector.getDetectEvent(), 3, 2.0f);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Intrinsics.areEqual("android.intent.action.SCREEN_ON", intent.getAction())) {
            Logger.i("InteractiveDetector", "screen on broadcast onReceive");
            Handler handler = InteractiveDetector.mWorkHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: edd
                    @Override // java.lang.Runnable
                    public final void run() {
                        InteractiveDetector$mScreenStateReceiver$1.onReceive$lambda$0();
                    }
                });
            }
        }
        Logger.i("InteractiveDetector", "onReceive: cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + ", thread:" + Thread.currentThread());
    }
}
