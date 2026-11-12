package com.xiaomi.fitness.sport_manager.utils;

import com.xiaomi.fitness.sport_manager_export.listener.ISportManagerPreference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/utils/SportManagerPreferenceExt;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportManagerPreference;", "<init>", "()V", "getRecoverSportGps", "", "getLaunchSportPageGetWearMode", "", "getLaunchSportWearMode", "sportHasPreRoute", "", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportManagerPreferenceExt implements ISportManagerPreference {
    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportManagerPreference
    public int getLaunchSportPageGetWearMode() {
        return SportManagerPreference.INSTANCE.getLAUNCH_SPORT_PAGE_GET_WEAR_MODE();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportManagerPreference
    public int getLaunchSportWearMode() {
        return SportManagerPreference.INSTANCE.getKEY_START_SPORT_MODE();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportManagerPreference
    @NotNull
    public String getRecoverSportGps() {
        return SportManagerPreference.INSTANCE.getKEY_RECOVER_SPORT_GPS();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportManagerPreference
    public boolean sportHasPreRoute() {
        return SportManagerPreference.INSTANCE.getKEY_SPORE_HAS_PRE_ROUTE();
    }
}
