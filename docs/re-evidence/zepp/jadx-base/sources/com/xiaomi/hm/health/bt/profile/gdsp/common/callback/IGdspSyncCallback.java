package com.xiaomi.hm.health.bt.profile.gdsp.common.callback;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.bt.profile.gdsp.RawData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH&J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00120\tH&¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/callback/IGdspSyncCallback;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "onStart", "", "current", "total", "onProgress", "", "data", "onData", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "onDataHeader", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "code", "onResult", "Lcom/xiaomi/hm/health/bt/profile/gdsp/RawData;", "onAllRawData", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IGdspSyncCallback<T> {
    void onAllRawData(@NotNull List<RawData> data);

    void onData(@NotNull List<? extends T> data);

    void onDataHeader(@NotNull DataHeader header);

    void onProgress(long current, long total);

    void onResult(@NotNull GDSPErrorCode code);

    void onStart();
}
