package com.xiaomi.fitness.sport_eco_manager_export.listener;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "", "onSportStarted", "", "startTime", "", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportRestarted", "onSportPaused", "onSportFinished", "validSport", "", "ids", "", "preSport", "onSportRested", "onSportShutdown", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISportStateChangedListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onSportRested(@NotNull ISportStateChangedListener iSportStateChangedListener) {
        }

        public static void onSportShutdown(@NotNull ISportStateChangedListener iSportStateChangedListener) {
        }

        public static void preSport(@NotNull ISportStateChangedListener iSportStateChangedListener) {
        }
    }

    void onSportFinished(boolean validSport, @Nullable byte[] ids);

    void onSportPaused();

    void onSportRestarted();

    void onSportRested();

    void onSportShutdown();

    void onSportStarted(int startTime, int timeZone, int sportType, int sportLaunchType);

    void preSport();
}
