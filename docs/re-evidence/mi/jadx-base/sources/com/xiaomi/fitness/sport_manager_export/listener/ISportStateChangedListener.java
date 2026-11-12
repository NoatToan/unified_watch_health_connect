package com.xiaomi.fitness.sport_manager_export.listener;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J$\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", "", "onSportStarted", "", "code", "", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportRestarted", "onSportPaused", "onSportFinished", "validSport", "", "ids", "", "finishSportData", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "preSport", "onSportSegment", "type", "nextType", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISportStateChangedListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onSportSegment(@NotNull ISportStateChangedListener iSportStateChangedListener, int i, int i2) {
        }

        public static void preSport(@NotNull ISportStateChangedListener iSportStateChangedListener) {
        }
    }

    void onSportFinished(boolean validSport, @Nullable byte[] ids, @Nullable FinishSportData finishSportData);

    void onSportPaused();

    void onSportRestarted();

    void onSportSegment(int type, int nextType);

    void onSportStarted(int code, int startTime, int timeZone, int sportType, int sportLaunchType);

    void preSport();
}
