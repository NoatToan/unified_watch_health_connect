package com.garmin.android.ancs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.l0;
import p13.x;
import w13.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ\u0018\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/ancs/ANCSNotificationSourceQueue;", "", "()V", "queue", "Ljava/util/concurrent/LinkedBlockingQueue;", "", "sources", "Ljava/util/HashMap;", "Lcom/garmin/android/ancs/ANCSNotificationSourceQueue$NotificationSource;", "Lkotlin/collections/HashMap;", "add", "", "source", "poll", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "Companion", "NotificationSource", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ANCSNotificationSourceQueue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final LinkedBlockingQueue<Long> queue = new LinkedBlockingQueue<>();
    private final HashMap<Long, NotificationSource> sources = new HashMap<>();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/ancs/ANCSNotificationSourceQueue$NotificationSource;", "", "ancs", "Lcom/garmin/android/ancs/ANCSNotificationSource;", "flags", "", "Lcom/garmin/android/ancs/ANCSNotificationSourceQueue$NotificationSource$Flag;", "(Lcom/garmin/android/ancs/ANCSNotificationSource;Ljava/util/List;)V", "getAncs", "()Lcom/garmin/android/ancs/ANCSNotificationSource;", "getFlags", "()Ljava/util/List;", "Flag", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotificationSource {
        private final ANCSNotificationSource ancs;
        private final List<Flag> flags;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/ancs/ANCSNotificationSourceQueue$NotificationSource$Flag;", "", "(Ljava/lang/String;I)V", "PROMOTED_TO_NEW_FROM_MODIFIED", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum Flag {
            PROMOTED_TO_NEW_FROM_MODIFIED;

            private static final /* synthetic */ w13.a $ENTRIES = b.g(values());

            public static w13.a<Flag> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NotificationSource(ANCSNotificationSource aNCSNotificationSource, List<? extends Flag> list) {
            aNCSNotificationSource.getClass();
            list.getClass();
            this.ancs = aNCSNotificationSource;
            this.flags = list;
        }

        public final ANCSNotificationSource getAncs() {
            return this.ancs;
        }

        public final List<Flag> getFlags() {
            return this.flags;
        }
    }

    public static final String toLog(List<? extends NotificationSource.Flag> list) {
        return INSTANCE.toLog(list);
    }

    public final void add(NotificationSource source) {
        NotificationSource notificationSource;
        Object next;
        source.getClass();
        synchronized (this) {
            try {
                Iterator<T> it = this.queue.iterator();
                while (true) {
                    notificationSource = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Long l14 = (Long) next;
                    long j8 = source.getAncs().notificationId;
                    if (l14 != null && l14.longValue() == j8) {
                        break;
                    }
                }
                Long l15 = (Long) next;
                if (l15 != null) {
                    notificationSource = this.sources.get(Long.valueOf(l15.longValue()));
                }
                if (notificationSource == null) {
                    this.queue.add(Long.valueOf(source.getAncs().notificationId));
                    this.sources.put(Long.valueOf(source.getAncs().notificationId), source);
                    return;
                }
                ANCSMessageBase.EventID eventID = notificationSource.getAncs().eventId;
                ANCSMessageBase.EventID eventID2 = ANCSMessageBase.EventID.NOTIFICATION_ADDED;
                if (eventID == eventID2 && source.getFlags().contains(NotificationSource.Flag.PROMOTED_TO_NEW_FROM_MODIFIED)) {
                    this.sources.put(Long.valueOf(source.getAncs().notificationId), new NotificationSource(new ANCSNotificationSource(eventID2, l0.f134950a, source.getAncs().categoryId, source.getAncs().categoryCount, source.getAncs().notificationId, source.getAncs().featureFlags), notificationSource.getFlags()));
                    return;
                }
                if (notificationSource.getAncs().eventId == eventID2 && source.getAncs().eventId == ANCSMessageBase.EventID.NOTIFICATION_MODIFIED) {
                    this.sources.put(Long.valueOf(source.getAncs().notificationId), new NotificationSource(new ANCSNotificationSource(eventID2, source.getAncs().eventFlags, source.getAncs().categoryId, source.getAncs().categoryCount, source.getAncs().notificationId, source.getAncs().featureFlags), notificationSource.getFlags()));
                } else {
                    this.sources.put(Long.valueOf(source.getAncs().notificationId), source);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final NotificationSource poll(long timeout, TimeUnit unit) {
        NotificationSource notificationSourceRemove;
        unit.getClass();
        Long lPoll = this.queue.poll(timeout, unit);
        if (lPoll == null) {
            return null;
        }
        long jLongValue = lPoll.longValue();
        synchronized (this) {
            notificationSourceRemove = this.sources.remove(Long.valueOf(jLongValue));
        }
        return notificationSourceRemove;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/ancs/ANCSNotificationSourceQueue$Companion;", "", "()V", "toLog", "", "flags", "", "Lcom/garmin/android/ancs/ANCSNotificationSourceQueue$NotificationSource$Flag;", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final String toLog(List<? extends NotificationSource.Flag> flags) {
            flags.getClass();
            StringBuilder sb3 = new StringBuilder();
            int i14 = 0;
            for (Object obj : flags) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                sb3.append(((NotificationSource.Flag) obj).name());
                if (i15 < flags.size()) {
                    sb3.append("|");
                }
                i14 = i15;
            }
            return sb3.toString();
        }

        private Companion() {
        }
    }
}
