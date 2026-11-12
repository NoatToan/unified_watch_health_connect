package com.mi.fitness.checkupdate.ota;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.statistics.StatConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJD\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/OtaResultTrack;", "", "<init>", "()V", "TAG", "", StatConstants.PARAM_START, "", "otaStart", "", "otaFinish", "result", "", "model", "oldVersion", "newVersion", "code", "", "info", "count", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OtaResultTrack {

    @NotNull
    public static final OtaResultTrack INSTANCE = new OtaResultTrack();

    @NotNull
    private static final String TAG = "OtaResultTrack";
    private static long start;

    private OtaResultTrack() {
    }

    public final void otaFinish(boolean result, @NotNull String model, @NotNull String oldVersion, @NotNull String newVersion, int code, @NotNull String info, int count) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(oldVersion, "oldVersion");
        Intrinsics.checkNotNullParameter(newVersion, "newVersion");
        Intrinsics.checkNotNullParameter(info, "info");
        if (start == 0) {
            return;
        }
        float fCurrentTimeMillis = (System.currentTimeMillis() - start) / 1000.0f;
        Logger.i(TAG, "otaFinish() called with: result = " + result + ", time = " + fCurrentTimeMillis + ", model = " + model + ", oldVersion = " + oldVersion + ", newVersion = " + newVersion + ", code = " + code + ", info = " + info + ", count = " + count);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("connect_v3", "56.44.1.1.18626"), "name", "ota_process", "result", Boolean.valueOf(result), "device_model", model, "device_version", oldVersion, "cur_version", newVersion, "duration_sec", Double.valueOf(Math.floor((double) fCurrentTimeMillis)), "error_code", Integer.valueOf(code), "error_info", info, "count", Integer.valueOf(count));
    }

    public final void otaStart() {
        start = System.currentTimeMillis();
    }
}
