package com.xiaomi.fitness.sport_manager.data;

import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/data/ISender;", "", "sendSportRequestToWear", "", Constants.KEY_REQUEST_DATA, "Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;", "callback", "Lcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;", "sendPhoneSportDataToWear", "phoneSportData", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISender {
    void sendPhoneSportDataToWear(@NotNull PhoneSportData phoneSportData, @Nullable OnSyncCallback callback);

    void sendSportRequestToWear(@NotNull SportRequestData requestData, @Nullable SportRequestCallback callback);
}
