package services.reminder;

import androidx.lifecycle.Observer;
import com.xiaomi.fitness.common.bus.LiveDataBus;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import services.reminder.RemindComponent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lservices/reminder/RemindComponent;", "", "<init>", "()V", "initReminder", "", "Companion", "reminder_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "remind")
public final class RemindComponent {

    @NotNull
    public static final String TAG = "RemindComponent";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initReminder$lambda$0(RemindEventDispatcher dispatcher, Object obj) {
        Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
        Logger.i(TAG, "ReminderInitializer liveData onchange");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type services.reminder.RemindEvent");
        dispatcher.onDispatchRemindEvent((RemindEvent) obj);
    }

    @ComponentTask(notLaterThan = 2, onMainThread = true)
    public final void initReminder() {
        Logger.i(TAG, "initReminder ...");
        final RemindEventDispatcher remindEventDispatcher = new RemindEventDispatcher(ApplicationExtKt.getApplication());
        LiveDataBus.INSTANCE.get().with("reminder_time_event").observeForever(new Observer() { // from class: wik
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                RemindComponent.initReminder$lambda$0(remindEventDispatcher, obj);
            }
        });
    }
}
