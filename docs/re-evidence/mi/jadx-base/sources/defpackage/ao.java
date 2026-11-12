package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¨\u0006\u0004"}, d2 = {"", "cmd", "Lzn;", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class ao {
    @Nullable
    public static final OtaResult a(@Nullable byte[] bArr) {
        Object objM886constructorimpl;
        OtaResult otaResult;
        if (bArr == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            boolean z = bArr[1] == 1;
            if (z) {
                byte b2 = bArr[2];
                long jV = tet.v(bArr, 3, 4);
                long jV2 = tet.v(bArr, 7, 4);
                long jV3 = tet.v(bArr, 11, 4);
                int length = bArr.length - 16;
                byte[] bArr2 = new byte[length];
                if (length == 0) {
                    otaResult = new OtaResult(z, Byte.valueOf(b2), Long.valueOf(jV), Long.valueOf(jV2), Long.valueOf(jV3), null, 32, null);
                } else {
                    System.arraycopy(bArr, 15, bArr2, 0, length);
                    otaResult = new OtaResult(z, Byte.valueOf(b2), Long.valueOf(jV), Long.valueOf(jV2), Long.valueOf(jV3), new String(bArr2, Charsets.UTF_8));
                }
            } else {
                otaResult = new OtaResult(false, null, null, null, null, null, 62, null);
            }
            objM886constructorimpl = Result.m886constructorimpl(otaResult);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m893isSuccessimpl(objM886constructorimpl)) {
            return (OtaResult) objM886constructorimpl;
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("OtaResult", "parseOtaResult: " + thM889exceptionOrNullimpl);
        }
        return null;
    }
}
