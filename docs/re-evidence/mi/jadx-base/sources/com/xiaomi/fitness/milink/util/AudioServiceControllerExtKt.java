package com.xiaomi.fitness.milink.util;

import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import defpackage.yo1;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\t*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lyo1;", "Lcom/miui/circulate/api/service/CirculateDeviceInfo;", "deviceInfo", "Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;", "getLatestMediaInfo", "(Lyo1;Lcom/miui/circulate/api/service/CirculateDeviceInfo;)Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;", "", "getLatestPosition", "(Lyo1;Lcom/miui/circulate/api/service/CirculateDeviceInfo;)V", "", "getLatestPlayState", "(Lyo1;Lcom/miui/circulate/api/service/CirculateDeviceInfo;)I", "getLatestVolume", "milink_release"}, k = 2, mv = {2, 0, 0})
public final class AudioServiceControllerExtKt {
    @Nullable
    public static final MediaMetaData getLatestMediaInfo(@Nullable yo1 yo1Var, @Nullable CirculateDeviceInfo circulateDeviceInfo) {
        if (circulateDeviceInfo == null || yo1Var == null) {
            return null;
        }
        return yo1Var.i(circulateDeviceInfo, true);
    }

    public static final int getLatestPlayState(@Nullable yo1 yo1Var, @Nullable CirculateDeviceInfo circulateDeviceInfo) {
        if (circulateDeviceInfo == null || yo1Var == null) {
            return -1;
        }
        return yo1Var.k(circulateDeviceInfo);
    }

    public static final void getLatestPosition(@Nullable yo1 yo1Var, @Nullable CirculateDeviceInfo circulateDeviceInfo) {
        if (circulateDeviceInfo == null || yo1Var == null) {
            return;
        }
        yo1Var.l(circulateDeviceInfo);
    }

    public static final int getLatestVolume(@Nullable yo1 yo1Var, @Nullable CirculateDeviceInfo circulateDeviceInfo) {
        if (circulateDeviceInfo == null || yo1Var == null) {
            return 0;
        }
        return yo1Var.n(circulateDeviceInfo);
    }
}
