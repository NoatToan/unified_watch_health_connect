package com.huami.bluetooth.profile.generic;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000\"\u0016\u0010\u0006\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0016\u0010\n\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0005\"\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005\"\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0005\"\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0011"}, d2 = {"", "Lcom/huami/bluetooth/profile/generic/GenericResponse;", "toGenericResponse", "", "a", LogUtil.I, "STATUS_CODE_SUCCESS", "b", "STATUS_CODE_NO_DATA", "c", "STATUS_CODE_UNKNOWN_CMD", GoogleApiAvailabilityLight.a, "CMD_BYTES", "e", "STATUS_BYTES", "f", "RESPONSE_MIN_BYTES", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class GenericResponseKt {
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 4;
    private static final int e = 1;
    private static final int f = 5;

    @Nullable
    public static final GenericResponse toGenericResponse(@Nullable byte[] bArr) {
        if (bArr != null && bArr.length >= 5) {
            return new GenericResponse(ByteUtilsKt.toInt$default(bArr, 0, 0, 3, null), ByteUtilsKt.toInt(bArr, 1, 4), ArraysKt___ArraysJvmKt.copyOfRange(bArr, 5, bArr.length));
        }
        return null;
    }
}
