package com.xiaomi.hm.health.bt.profile.gdsp;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001a\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMRawDataCallback;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/RawData;", "rawData", "", "onRawData", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IHMRawDataCallback<T> extends IHMDataCallback<T> {
    void onRawData(@Nullable List<RawData> rawData);
}
