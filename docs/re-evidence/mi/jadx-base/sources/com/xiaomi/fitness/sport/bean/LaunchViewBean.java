package com.xiaomi.fitness.sport.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000f¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/sport/bean/LaunchViewBean;", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "<init>", "()V", "distance", "", "getDistance", "()I", "setDistance", "(I)V", "weatherStr", "", "getWeatherStr", "()Ljava/lang/String;", "setWeatherStr", "(Ljava/lang/String;)V", "weatherImg", "getWeatherImg", "setWeatherImg", "weatherTemperature", "getWeatherTemperature", "setWeatherTemperature", "weatherRefresh", "", "getWeatherRefresh", "()Z", "setWeatherRefresh", "(Z)V", "heartRate", "getHeartRate", "setHeartRate", "unit", "getUnit", "setUnit", "title", "getTitle", "setTitle", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LaunchViewBean extends BaseSportItemBean {
    private int distance;
    private int weatherImg;
    private boolean weatherRefresh;

    @NotNull
    private String weatherStr = "";

    @NotNull
    private String weatherTemperature = "";

    @NotNull
    private String heartRate = "";

    @NotNull
    private String unit = "";

    @NotNull
    private String title = "";

    public final int getDistance() {
        return this.distance;
    }

    @NotNull
    public final String getHeartRate() {
        return this.heartRate;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUnit() {
        return this.unit;
    }

    public final int getWeatherImg() {
        return this.weatherImg;
    }

    public final boolean getWeatherRefresh() {
        return this.weatherRefresh;
    }

    @NotNull
    public final String getWeatherStr() {
        return this.weatherStr;
    }

    @NotNull
    public final String getWeatherTemperature() {
        return this.weatherTemperature;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setHeartRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.heartRate = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unit = str;
    }

    public final void setWeatherImg(int i) {
        this.weatherImg = i;
    }

    public final void setWeatherRefresh(boolean z) {
        this.weatherRefresh = z;
    }

    public final void setWeatherStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weatherStr = str;
    }

    public final void setWeatherTemperature(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weatherTemperature = str;
    }
}
