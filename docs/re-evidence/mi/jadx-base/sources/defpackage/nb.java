package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0005"}, d2 = {"Lmb;", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", PluginDeviceInfo.FDESC, "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class nb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<mb, HMDeviceError> f27736a = MapsKt__MapsKt.mapOf(TuplesKt.to(mb.UNKNOWN, new HMDeviceError(-2)), TuplesKt.to(mb.NO_DATA, new HMDeviceError(-1)), TuplesKt.to(mb.SUCCESS, new HMDeviceError(0)), TuplesKt.to(mb.UNKNOWN_COMMAND, new HMDeviceError(51)), TuplesKt.to(mb.INVALID_PARAMETER, new HMDeviceError(52)), TuplesKt.to(mb.OPERATION_FAILED, new HMDeviceError(2)), TuplesKt.to(mb.INVALID_STATE, new HMDeviceError(53)), TuplesKt.to(mb.PACKET_INDEX_ERROR, new HMDeviceError(1)), TuplesKt.to(mb.BUSY, new HMDeviceError(5)), TuplesKt.to(mb.CRC_MISMATCH, new HMDeviceError(8)), TuplesKt.to(mb.CANCEL, new HMDeviceError(9)), TuplesKt.to(mb.MUSIC_ALIVE, new HMDeviceError(6)), TuplesKt.to(mb.SPEECH_ALIVE, new HMDeviceError(7)), TuplesKt.to(mb.TIMEOUT, new HMDeviceError(50)), TuplesKt.to(mb.NO_CONNECTION, new HMDeviceError(3)), TuplesKt.to(mb.CONTENT_PARSING_ERROR, new HMDeviceError(10)), TuplesKt.to(mb.UNAUTHORIZED, new HMDeviceError(11)), TuplesKt.to(mb.COMPRESS_FAILED, new HMDeviceError(12)), TuplesKt.to(mb.DECOMPRESS_FAILED, new HMDeviceError(13)));

    public static final boolean a(@NotNull mb mbVar) {
        Intrinsics.checkNotNullParameter(mbVar, "<this>");
        return mbVar == mb.SUCCESS;
    }

    @NotNull
    public static final HMDeviceError b(@NotNull mb mbVar) {
        Intrinsics.checkNotNullParameter(mbVar, "<this>");
        HMDeviceError hMDeviceError = f27736a.get(mbVar);
        return hMDeviceError == null ? new HMDeviceError(-2) : hMDeviceError;
    }
}
