package services.reminder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.bus.LiveDataBus;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lservices/reminder/TimedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "reminder_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimedBroadcastReceiver extends BroadcastReceiver {

    @NotNull
    public static final String KEY_TIMELINE = "timeline";

    @NotNull
    private static final String TAG = "MiHealth:TimedBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Logger.i(TAG, "Receive timed, intent = %s", intent.toUri(0), new Object[0]);
        int intExtra = intent.getIntExtra(KEY_TIMELINE, -1);
        if (intExtra == -1) {
            return;
        }
        TimedEvent timedEvent = new TimedEvent();
        timedEvent.setTimeline(intExtra);
        LiveDataBus.INSTANCE.get().with("reminder_time_event").postValue(timedEvent);
    }
}
