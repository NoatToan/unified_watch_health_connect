package defpackage;

import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;

/* JADX INFO: loaded from: classes10.dex */
public interface xyc {
    void onSportPaused(int i);

    void onSportRecordData(SportData sportData);

    void onSportReportData(boolean z, SportData sportData);

    void onSportRestart(int i);

    void onSportStart();
}
