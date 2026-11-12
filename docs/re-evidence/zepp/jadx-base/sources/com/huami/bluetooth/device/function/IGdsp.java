package com.huami.bluetooth.device.function;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bluetooth.profile.data.DataParser;
import com.huami.bluetooth.profile.data.SyncDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J:\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/device/function/IGdsp;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/Calendar;", "calendar", "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPType;", "type", "Lcom/huami/bluetooth/profile/data/DataParser;", "parser", "Lcom/huami/bluetooth/profile/data/SyncDataCallback;", "callback", "", "syncData", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IGdsp {
    <T> void syncData(@NotNull Calendar calendar, @NotNull HMGDSPType type, @NotNull DataParser<? extends T> parser, @NotNull SyncDataCallback<? super T> callback);
}
