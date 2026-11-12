package com.xiaomi.fitness.stand.export;

import com.xiaomi.fitness.statistics.StatConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0005H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J\b\u0010\u0012\u001a\u00020\u000eH&J\b\u0010\u0013\u001a\u00020\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H&¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/stand/export/StandDetectManager;", "", "setStandDetectEnable", "", "enable", "", "getStandDetectEnabled", "setStandReminderEnable", "getStandReminderEnable", "setRemindTime", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "getRemindTime", "", "setStandDetectNapEnable", "getStandDetectNapEnable", "setStandDetectNapTime", "getStandDetectNapTime", "supportStandDetect", "checkStandAndRecordIfDone", "startTime", "", "Companion", "stand-detect-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface StandDetectManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/stand/export/StandDetectManager$Companion;", "", "<init>", "()V", "stand-detect-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    boolean checkStandAndRecordIfDone(long startTime);

    @NotNull
    int[] getRemindTime();

    boolean getStandDetectEnabled();

    boolean getStandDetectNapEnable();

    @NotNull
    int[] getStandDetectNapTime();

    boolean getStandReminderEnable();

    void setRemindTime(int start, int end);

    void setStandDetectEnable(boolean enable);

    void setStandDetectNapEnable(boolean enable);

    void setStandDetectNapTime(int start, int end);

    void setStandReminderEnable(boolean enable);

    boolean supportStandDetect();
}
