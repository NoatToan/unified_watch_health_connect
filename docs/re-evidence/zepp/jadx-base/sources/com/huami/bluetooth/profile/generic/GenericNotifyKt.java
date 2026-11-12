package com.huami.bluetooth.profile.generic;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000\"\u0016\u0010\u0006\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0016\u0010\t\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0005\"\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0005\"\u0016\u0010\r\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0005\"\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005\"\u0016\u0010\u0011\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005\"\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005¨\u0006\u0014"}, d2 = {"", "Lcom/huami/bluetooth/profile/generic/GenericNotify;", "toGenericNotify", "", "a", LogUtil.I, "TYPE_STOP", "b", "TYPE_SINGLE", "OPE_CODE_NOTIFY", "c", "OPE_CODE_BYTES", GoogleApiAvailabilityLight.a, "VERSION_BYTES", "e", "TYPE_BYTES", "f", "INDEX_BYTES", "g", "NOTIFY_MIN_BYTES", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class GenericNotifyKt {
    public static final int OPE_CODE_NOTIFY = 128;
    private static final int a = 2;
    private static final int b = 3;
    private static final int c = 1;
    private static final int d = 1;
    private static final int e = 1;
    private static final int f = 1;
    private static final int g = 4;

    @Nullable
    public static final GenericNotify toGenericNotify(@Nullable byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            return new GenericNotify(ByteUtilsKt.toInt$default(bArr, 1, 0, 2, null), ByteUtilsKt.toInt(bArr, 1, 1), ByteUtilsKt.toInt(bArr, 1, 2) >>> 6, ByteUtilsKt.toInt(bArr, 1, 3), ArraysKt___ArraysJvmKt.copyOfRange(bArr, 4, bArr.length));
        }
        return null;
    }
}
