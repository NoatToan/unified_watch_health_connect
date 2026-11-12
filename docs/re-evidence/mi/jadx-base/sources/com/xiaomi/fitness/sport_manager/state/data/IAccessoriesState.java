package com.xiaomi.fitness.sport_manager.state.data;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import defpackage.ed2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\r\u0010\fJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000e\u0010\fJ)\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\tH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/state/data/IAccessoriesState;", "Lcom/xiaomi/fitness/sport_manager/state/data/IAccessoriesSport;", "Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;", "sportRequestData", "Lcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;", "callback", "", "startAccessoriesSport", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;Lcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;)V", "", DailyRecordKey.sportType, "pauseAccessoriesSport", "(ILcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;)V", "resumeAccessoriesSport", "finishAccessoriesSport", "", "did", "restartAccessoriesSport", "(Ljava/lang/String;ILcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;)V", "sportLaunchType", "passiveNotifySportState", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;I)V", "Led2;", "getAccessorySportState", "(Ljava/lang/String;)Led2;", "getBeanAccessory", "()Led2;", "", "isBeanConnect", "()Z", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface IAccessoriesState extends IAccessoriesSport {
    void finishAccessoriesSport(int sportType, @Nullable SportRequestCallback callback);

    @Nullable
    ed2 getAccessorySportState(@NotNull String did);

    @Nullable
    ed2 getBeanAccessory();

    boolean isBeanConnect();

    void passiveNotifySportState(@NotNull SportRequestData sportRequestData, int sportLaunchType);

    void pauseAccessoriesSport(int sportType, @Nullable SportRequestCallback callback);

    void restartAccessoriesSport(@NotNull String did, int sportType, @Nullable SportRequestCallback callback);

    void resumeAccessoriesSport(int sportType, @Nullable SportRequestCallback callback);

    void startAccessoriesSport(@NotNull SportRequestData sportRequestData, @Nullable SportRequestCallback callback);
}
