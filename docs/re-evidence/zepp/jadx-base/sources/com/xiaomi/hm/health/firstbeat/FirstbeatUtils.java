package com.xiaomi.hm.health.firstbeat;

import com.huami.watch.util.Box;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/firstbeat/FirstbeatUtils;", "", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FirstbeatUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/firstbeat/FirstbeatUtils$Companion;", "", "", "time", "", "saveFirstbeatUpdateTime", "getFirstbeatUpdateTime", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getFirstbeatUpdateTime() {
            long firstbeatUpdateTime = Box.getFirstbeatUpdateTime();
            if (firstbeatUpdateTime >= 0) {
                return firstbeatUpdateTime;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(2000, 0, 1, 0, 0, 0);
            return calendar.getTimeInMillis();
        }

        public final void saveFirstbeatUpdateTime(long time) {
            Box.putFirstbeatUpdateTime(time);
        }
    }
}
