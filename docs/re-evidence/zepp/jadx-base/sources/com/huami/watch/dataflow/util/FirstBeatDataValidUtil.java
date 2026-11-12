package com.huami.watch.dataflow.util;

import com.huami.watch.dataflow.model.firstbeat.FirstbeatParams;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0007¨\u0006\f"}, d2 = {"Lcom/huami/watch/dataflow/util/FirstBeatDataValidUtil;", "", "", "configJson", "", "isConfigValid", "vo2maxJson", "isVo2MaxValid", "sportThaJson", "isSportThaValid", "<init>", "()V", "companionlib_release"}, k = 1, mv = {1, 4, 0})
public final class FirstBeatDataValidUtil {
    public static final FirstBeatDataValidUtil INSTANCE = new FirstBeatDataValidUtil();

    private FirstBeatDataValidUtil() {
    }

    @JvmStatic
    public static final boolean isConfigValid(@NotNull String configJson) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(configJson);
            double d = 0;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(jSONObject.optDouble("currnet_run_vo2max") > d || jSONObject.optDouble("current_walking_vo2max") > d || jSONObject.optDouble("last_run_vo2max") > d || jSONObject.optDouble("last_walking_vo2max") > d || jSONObject.optDouble("recovery_time") > d));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    @JvmStatic
    public static final boolean isSportThaValid(@NotNull String sportThaJson) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(sportThaJson);
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(jSONObject.optInt(FirstbeatParams.PARAM_TL_WEEKLY_SUM) > 0 || jSONObject.optInt(FirstbeatParams.PARAM_TL_WEEKLY_SUM_OPTIMAL_MAX) > 0 || jSONObject.optInt(FirstbeatParams.PARAM_TL_WEEKLY_SUM_OPTIMAL_MIN) > 0 || jSONObject.optInt(FirstbeatParams.PARAM_TL_WEEKLY_SUM_OVERREACHING) > 0 || jSONObject.optInt(FirstbeatParams.PARAM_TL_DAILY) > 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    @JvmStatic
    public static final boolean isVo2MaxValid(@NotNull String vo2maxJson) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(vo2maxJson);
            double d = 0;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(jSONObject.optDouble("vo2_max_run") > d || jSONObject.optDouble(FirstbeatParams.PARAM_VO2_MAX_WALK) > d));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }
}
