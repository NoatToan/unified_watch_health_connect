package com.xiaomi.hm.health.bt.profile.gdsp.common.receiver;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&J\u000f\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\bH&J\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012H&J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "", "receiveHeader", "getDataHeader", "", "data", "receiveData", "getAllData", "()Ljava/lang/Object;", "getAllByteData", "Ljava/util/Calendar;", "cal", "getDataFooter", "(Ljava/util/Calendar;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "onProgress", "registerProgress", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "errorCode", "onFinish", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IGdspDataReceiver<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static <T> void onFinish(@NotNull IGdspDataReceiver<T> iGdspDataReceiver, @NotNull GDSPErrorCode gDSPErrorCode) {
        }
    }

    @NotNull
    byte[] getAllByteData();

    T getAllData();

    @Nullable
    T getDataFooter(@NotNull Calendar cal);

    @Nullable
    /* JADX INFO: renamed from: getDataHeader */
    DataHeader getMDataHeader();

    void onFinish(@NotNull GDSPErrorCode errorCode);

    void receiveData(@NotNull byte[] data);

    void receiveHeader(@Nullable DataHeader header);

    void registerProgress(@NotNull Function1<? super Progress, Unit> onProgress);
}
