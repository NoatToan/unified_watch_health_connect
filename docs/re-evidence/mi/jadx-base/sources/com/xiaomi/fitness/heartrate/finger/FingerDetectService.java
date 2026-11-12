package com.xiaomi.fitness.heartrate.finger;

import android.hardware.fingerprint.heartrate.HeartRateCmdResult;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\tH\u0014J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/heartrate/finger/FingerDetectService;", "Landroid/os/Binder;", "mFingerHeartRateCallback", "Lcom/xiaomi/fitness/heartrate/finger/OnFpHeartRateCallback;", "<init>", "(Lcom/xiaomi/fitness/heartrate/finger/OnFpHeartRateCallback;)V", "onTransact", "", "code", "", "data", "Landroid/os/Parcel;", "reply", "flags", "debugInfo", "", "msgId", "cmdId", "dataArr", "", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FingerDetectService extends Binder {

    @NotNull
    private static final String TAG = FingerDetectUtil.FP_TAG;

    @NotNull
    private final OnFpHeartRateCallback mFingerHeartRateCallback;

    public FingerDetectService(@NotNull OnFpHeartRateCallback mFingerHeartRateCallback) {
        Intrinsics.checkNotNullParameter(mFingerHeartRateCallback, "mFingerHeartRateCallback");
        this.mFingerHeartRateCallback = mFingerHeartRateCallback;
    }

    private final void debugInfo(int msgId, int cmdId, byte[] dataArr) {
        if (dataArr != null) {
            String str = "msgId = " + msgId + ",cmdId = " + cmdId + ",data->:";
            String str2 = str + ArrayUtils.decodeInt32(dataArr, 0) + " " + ArrayUtils.decodeInt32(dataArr, 4) + " " + ArrayUtils.decodeInt32(dataArr, 8) + " ";
            if (dataArr.length == 32) {
                int iDecodeInt32 = ArrayUtils.decodeInt32(dataArr, 28);
                str2 = str2 + ArrayUtils.decodeInt32(dataArr, 12) + " " + ArrayUtils.decodeInt32(dataArr, 16) + " " + ArrayUtils.decodeInt32(dataArr, 20) + " " + ArrayUtils.decodeInt32(dataArr, 24) + " " + iDecodeInt32;
            }
            Logger.i(TAG, "dataArr = " + str2);
        }
    }

    @Override // android.os.Binder
    public boolean onTransact(int code, @NotNull Parcel data, @Nullable Parcel reply, int flags) throws RemoteException {
        Intrinsics.checkNotNullParameter(data, "data");
        data.enforceInterface(MiuiHeartRateCode.DESCRIPTOR);
        int i = data.readInt();
        int i2 = data.readInt();
        byte[] bArrCreateByteArray = data.createByteArray();
        this.mFingerHeartRateCallback.onHeartRateCallback(new HeartRateCmdResultLocal(new HeartRateCmdResult(i2, bArrCreateByteArray)));
        debugInfo(i, i2, bArrCreateByteArray);
        return true;
    }
}
