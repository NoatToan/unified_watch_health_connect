package com.xiaomi.hm.health.locweather.huami_weather_bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/locweather/huami_weather_bean/UnitValue;", "", "", "a", "Ljava/lang/String;", "getUnit", "()Ljava/lang/String;", "setUnit", "(Ljava/lang/String;)V", "unit", "b", "getValue", "setValue", "value", "<init>", "()V", "locweather_release"}, k = 1, mv = {1, 5, 1})
public final class UnitValue {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("unit")
    @Nullable
    private String unit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("value")
    @Nullable
    private String value;

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final void setUnit(@Nullable String str) {
        this.unit = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }
}
