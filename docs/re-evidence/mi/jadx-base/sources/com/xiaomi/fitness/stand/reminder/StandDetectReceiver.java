package com.xiaomi.fitness.stand.reminder;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.stand.StandDetectConstants;
import com.xiaomi.fitness.stand.StandDetectInternalManager;
import com.xiaomi.fitness.stand.reminder.StandDetectReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/stand/reminder/StandDetectReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "TAG", "", "manager", "Lcom/xiaomi/fitness/stand/StandDetectInternalManager;", "getManager", "()Lcom/xiaomi/fitness/stand/StandDetectInternalManager;", "setManager", "(Lcom/xiaomi/fitness/stand/StandDetectInternalManager;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "handleAction", "action", "time", "", "stand-detect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StandDetectReceiver extends Hilt_StandDetectReceiver {

    @NotNull
    private final String TAG = StandDetectConstants.TAG;
    public StandDetectInternalManager manager;

    private final void handleAction(final Context context, final String action, final long time) {
        ExecutorHelper.runInBackground(new Runnable() { // from class: i9o
            @Override // java.lang.Runnable
            public final void run() {
                StandDetectReceiver.handleAction$lambda$0(this.f20913a, context, action, time);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleAction$lambda$0(StandDetectReceiver this$0, Context context, String action, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(action, "$action");
        this$0.getManager().handleReminder(context, action, j);
    }

    @NotNull
    public final StandDetectInternalManager getManager() {
        StandDetectInternalManager standDetectInternalManager = this.manager;
        if (standDetectInternalManager != null) {
            return standDetectInternalManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("manager");
        return null;
    }

    @Override // com.xiaomi.fitness.stand.reminder.Hilt_StandDetectReceiver, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        super.onReceive(context, intent);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Logger.i(this.TAG, "StandDetectReceiver: " + intent.toUri(0));
        String action = intent.getAction();
        if (action == null || action.length() == 0) {
            return;
        }
        handleAction(context, action, intent.getLongExtra(StandDetectConstants.KEY_TIME, System.currentTimeMillis()));
    }

    public final void setManager(@NotNull StandDetectInternalManager standDetectInternalManager) {
        Intrinsics.checkNotNullParameter(standDetectInternalManager, "<set-?>");
        this.manager = standDetectInternalManager;
    }
}
