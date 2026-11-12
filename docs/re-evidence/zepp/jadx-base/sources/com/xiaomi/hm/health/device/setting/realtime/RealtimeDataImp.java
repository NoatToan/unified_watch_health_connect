package com.xiaomi.hm.health.device.setting.realtime;

import android.app.Activity;
import com.xiaomi.hm.health.device.realtimedata.IRealtimeData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/realtime/RealtimeDataImp;", "Lcom/xiaomi/hm/health/device/realtimedata/IRealtimeData;", "", "isOpen", "Landroid/app/Activity;", "activity", "", "start", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RealtimeDataImp implements IRealtimeData {
    @Override // com.xiaomi.hm.health.device.realtimedata.IRealtimeData
    public boolean isOpen() {
        return RealTimeTransmissionEntry.isOpen();
    }

    @Override // com.xiaomi.hm.health.device.realtimedata.IRealtimeData
    public void start(@NotNull Activity activity) {
        RealTimeTransmissionEntry.open(activity);
    }
}
