package com.xiaomi.hm.health.starsky;

import com.huami.sky.lib.constant.WebConstant;
import com.xiaomi.hm.health.bt.model.starsky.StarSkyActivity;
import com.xiaomi.hm.health.bt.model.starsky.StarSkySleep;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H&¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/starsky/StartSkyDataCallback;", "", "", "Lcom/xiaomi/hm/health/bt/model/starsky/StarSkyActivity;", "activity", "Lcom/xiaomi/hm/health/bt/model/starsky/StarSkySleep;", "sleep", "", "rrTimeStamp", "", WebConstant.QueryParam.RR_INTERVAL, "", "onData", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface StartSkyDataCallback {
    void onData(@NotNull List<StarSkyActivity> activity, @NotNull List<StarSkySleep> sleep, @NotNull List<Long> rrTimeStamp, @NotNull List<Integer> rrInterval);
}
