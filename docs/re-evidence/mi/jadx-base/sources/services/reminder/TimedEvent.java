package services.reminder;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lservices/reminder/TimedEvent;", "Lservices/reminder/RemindEvent;", "<init>", "()V", TimedBroadcastReceiver.KEY_TIMELINE, "", "getTimeline", "()I", "setTimeline", "(I)V", "eventType", "", "getEventType", "()Ljava/lang/String;", "reminder_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimedEvent implements RemindEvent {
    private int timeline;

    @Override // services.reminder.RemindEvent
    @NotNull
    public String getEventType() {
        return "timed_event";
    }

    public final int getTimeline() {
        return this.timeline;
    }

    public final void setTimeline(int i) {
        this.timeline = i;
    }
}
