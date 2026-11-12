package com.xiaomi.hm.health.bt.profile.gdsp.common;

import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\"\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "toDeviceError", "toGdspError", "", "isSyncSuccess", "", "a", "Ljava/util/Map;", "codeMap", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class GDSPErrorCodeExtKt {

    @NotNull
    private static final Map<GDSPErrorCode, HMDeviceError> a = r.mapOf(TuplesKt.to(GDSPErrorCode.UNKNOWN, new HMDeviceError(-2)), TuplesKt.to(GDSPErrorCode.NO_DATA, new HMDeviceError(-1)), TuplesKt.to(GDSPErrorCode.SUCCESS, new HMDeviceError(0)), TuplesKt.to(GDSPErrorCode.UNKNOWN_COMMAND, new HMDeviceError(51)), TuplesKt.to(GDSPErrorCode.INVALID_PARAMETER, new HMDeviceError(52)), TuplesKt.to(GDSPErrorCode.OPERATION_FAILED, new HMDeviceError(2)), TuplesKt.to(GDSPErrorCode.INVALID_STATE, new HMDeviceError(53)), TuplesKt.to(GDSPErrorCode.PACKET_INDEX_ERROR, new HMDeviceError(1)), TuplesKt.to(GDSPErrorCode.BUSY, new HMDeviceError(5)), TuplesKt.to(GDSPErrorCode.CRC_MISMATCH, new HMDeviceError(8)), TuplesKt.to(GDSPErrorCode.CANCEL, new HMDeviceError(9)), TuplesKt.to(GDSPErrorCode.MUSIC_ALIVE, new HMDeviceError(6)), TuplesKt.to(GDSPErrorCode.SPEECH_ALIVE, new HMDeviceError(7)), TuplesKt.to(GDSPErrorCode.TIMEOUT, new HMDeviceError(50)), TuplesKt.to(GDSPErrorCode.NO_CONNECTION, new HMDeviceError(3)), TuplesKt.to(GDSPErrorCode.CONTENT_PARSING_ERROR, new HMDeviceError(10)), TuplesKt.to(GDSPErrorCode.UNAUTHORIZED, new HMDeviceError(11)), TuplesKt.to(GDSPErrorCode.COMPRESS_FAILED, new HMDeviceError(12)), TuplesKt.to(GDSPErrorCode.DECOMPRESS_FAILED, new HMDeviceError(13)));

    public static final boolean isSyncSuccess(@NotNull GDSPErrorCode gDSPErrorCode) {
        return gDSPErrorCode == GDSPErrorCode.SUCCESS;
    }

    @NotNull
    public static final HMDeviceError toDeviceError(@NotNull GDSPErrorCode gDSPErrorCode) {
        HMDeviceError hMDeviceError = a.get(gDSPErrorCode);
        return hMDeviceError == null ? new HMDeviceError(-2) : hMDeviceError;
    }

    @NotNull
    public static final GDSPErrorCode toGdspError(@NotNull HMDeviceError hMDeviceError) {
        Object next;
        Iterator<T> it2 = a.entrySet().iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((HMDeviceError) ((Map.Entry) next).getValue()).getError() == hMDeviceError.getError()));
        Map.Entry entry = (Map.Entry) next;
        GDSPErrorCode gDSPErrorCode = entry != null ? (GDSPErrorCode) entry.getKey() : null;
        return gDSPErrorCode == null ? GDSPErrorCode.UNKNOWN : gDSPErrorCode;
    }
}
