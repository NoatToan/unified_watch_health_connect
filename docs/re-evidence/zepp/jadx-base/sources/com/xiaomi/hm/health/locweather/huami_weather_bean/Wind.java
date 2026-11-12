package com.xiaomi.hm.health.locweather.huami_weather_bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/locweather/huami_weather_bean/Wind;", "", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/UnitValue;", "a", "Lcom/xiaomi/hm/health/locweather/huami_weather_bean/UnitValue;", "getDirection", "()Lcom/xiaomi/hm/health/locweather/huami_weather_bean/UnitValue;", "setDirection", "(Lcom/xiaomi/hm/health/locweather/huami_weather_bean/UnitValue;)V", "direction", "b", "getSpeed", "setSpeed", "speed", "<init>", "()V", "locweather_release"}, k = 1, mv = {1, 5, 1})
public final class Wind {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("direction")
    @Nullable
    private UnitValue direction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("speed")
    @Nullable
    private UnitValue speed;

    @Nullable
    public final UnitValue getDirection() {
        return this.direction;
    }

    @Nullable
    public final UnitValue getSpeed() {
        return this.speed;
    }

    public final void setDirection(@Nullable UnitValue unitValue) {
        this.direction = unitValue;
    }

    public final void setSpeed(@Nullable UnitValue unitValue) {
        this.speed = unitValue;
    }
}
