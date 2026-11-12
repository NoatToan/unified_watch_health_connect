package com.xiaomi.hm.health.locweather.huami_weather_bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Weather;", "", "", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Change;", "a", "Ljava/util/List;", "getValue", "()Ljava/util/List;", "setValue", "(Ljava/util/List;)V", "value", "<init>", "()V", "locweather_release"}, k = 1, mv = {1, 5, 1})
public final class Weather {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("value")
    @Nullable
    private List<Change> value;

    @Nullable
    public final List<Change> getValue() {
        return this.value;
    }

    public final void setValue(@Nullable List<Change> list) {
        this.value = list;
    }
}
