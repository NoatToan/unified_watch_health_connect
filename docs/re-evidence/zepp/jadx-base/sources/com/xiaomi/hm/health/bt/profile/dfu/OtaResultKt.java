package com.xiaomi.hm.health.bt.profile.dfu;

import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\"\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", Constant.h, "Lcom/xiaomi/hm/health/bt/profile/dfu/OtaResult;", "parseOtaResult", "", "a", "Ljava/lang/String;", "TAG", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class OtaResultKt {

    @NotNull
    private static final String a = "OtaResult";

    @Nullable
    public static final OtaResult parseOtaResult(@Nullable byte[] bArr) {
        Object objM3845constructorimpl;
        OtaResult otaResult;
        if (bArr == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            boolean z = true;
            boolean z2 = bArr[1] == 1;
            if (z2) {
                byte b = bArr[2];
                long jBytesToLong = GattUtils.bytesToLong(bArr, 3, 4);
                long jBytesToLong2 = GattUtils.bytesToLong(bArr, 7, 4);
                long jBytesToLong3 = GattUtils.bytesToLong(bArr, 11, 4);
                int length = bArr.length - 16;
                byte[] bArr2 = new byte[length];
                if (length != 0) {
                    z = false;
                }
                if (z) {
                    otaResult = new OtaResult(z2, Byte.valueOf(b), Long.valueOf(jBytesToLong), Long.valueOf(jBytesToLong2), Long.valueOf(jBytesToLong3), null, 32, null);
                } else {
                    System.arraycopy(bArr, 15, bArr2, 0, length);
                    otaResult = new OtaResult(z2, Byte.valueOf(b), Long.valueOf(jBytesToLong), Long.valueOf(jBytesToLong2), Long.valueOf(jBytesToLong3), new String(bArr2, Charsets.UTF_8));
                }
            } else {
                otaResult = new OtaResult(false, null, null, null, null, null, 62, null);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(otaResult);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3851isSuccessimpl(objM3845constructorimpl)) {
            return (OtaResult) objM3845constructorimpl;
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(a, Intrinsics.stringPlus("parseOtaResult: ", thM3848exceptionOrNullimpl));
        }
        return null;
    }
}
