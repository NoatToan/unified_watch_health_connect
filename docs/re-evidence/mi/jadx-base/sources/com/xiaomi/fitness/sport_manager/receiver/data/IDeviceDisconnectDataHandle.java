package com.xiaomi.fitness.sport_manager.receiver.data;

import androidx.health.connect.client.records.CervicalMucusRecord;
import defpackage.x7r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/receiver/data/IDeviceDisconnectDataHandle;", "", "Lx7r;", "data", "", "onReceiveData", "(Lx7r;)V", "onDisconnect", "()V", "Lcom/xiaomi/fitness/sport_manager/receiver/data/DisconnectData;", "getDisConnectData", "()Lcom/xiaomi/fitness/sport_manager/receiver/data/DisconnectData;", CervicalMucusRecord.Appearance.CLEAR, "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface IDeviceDisconnectDataHandle {
    void clear();

    @NotNull
    DisconnectData getDisConnectData();

    void onDisconnect();

    void onReceiveData(@NotNull x7r data);
}
