package defpackage;

import com.xiaomi.fitness.sport_manager_export.data.SportData;

/* JADX INFO: loaded from: classes10.dex */
public interface wyc {
    void onAdjustmentDis(int i);

    void onSportPaused(int i);

    void onSportRecordData(SportData sportData);

    void onSportReportData(boolean z, SportData sportData);

    void onSportRestart(int i);

    default void onSportSegment(int i, int i2) {
    }

    void onSportStart();
}
