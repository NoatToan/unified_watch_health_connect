package com.xiaomi.hm.health.bt.profile.healthdevice.remind;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b$\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b'\u0010(BA\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010)\u001a\u00020\u0004¢\u0006\u0004\b'\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\n\u001a\u00020\bH\u0016R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/ScreenLockConfig;", "", "", "hour", "", "a", "min", "b", "", "toJson", "toString", LogUtil.I, "getStartH", "()I", "setStartH", "(I)V", "startH", "getStartM", "setStartM", "startM", "c", "getStopH", "setStopH", "stopH", GoogleApiAvailabilityLight.a, "getStopM", "setStopM", "stopM", "e", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "enable", "f", "getAllDayLock", "setAllDayLock", "allDayLock", "<init>", "()V", "unLockAllDay", "(IIIIZZ)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ScreenLockConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int startH;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int startM;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int stopH;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int stopM;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean enable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean allDayLock;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/ScreenLockConfig$Companion;", "", "", "json", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/ScreenLockConfig;", "fromJson", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ScreenLockConfig fromJson(@Nullable String json) {
            if (json == null) {
                return new ScreenLockConfig();
            }
            try {
                JSONObject jSONObject = new JSONObject(json);
                return new ScreenLockConfig(jSONObject.optInt("startH", 0), jSONObject.optInt("startM", 0), jSONObject.optInt("stopH", 0), jSONObject.optInt("stopM", 0), jSONObject.optBoolean("enable", false), jSONObject.optBoolean("allDay", false));
            } catch (Exception unused) {
                return new ScreenLockConfig();
            }
        }
    }

    public ScreenLockConfig() {
        this.startH = 23;
        this.stopH = 9;
        this.allDayLock = true;
    }

    private final boolean a(int hour) {
        return hour >= 0 && hour <= 24;
    }

    private final boolean b(int min) {
        return min >= 0 && min <= 60;
    }

    public final boolean getAllDayLock() {
        return this.allDayLock;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getStartH() {
        return this.startH;
    }

    public final int getStartM() {
        return this.startM;
    }

    public final int getStopH() {
        return this.stopH;
    }

    public final int getStopM() {
        return this.stopM;
    }

    public final void setAllDayLock(boolean z) {
        this.allDayLock = z;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setStartH(int i) {
        this.startH = i;
    }

    public final void setStartM(int i) {
        this.startM = i;
    }

    public final void setStopH(int i) {
        this.stopH = i;
    }

    public final void setStopM(int i) {
        this.stopM = i;
    }

    @NotNull
    public final String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", getEnable());
            jSONObject.put("allDay", getAllDayLock());
            jSONObject.put("startH", getStartH());
            jSONObject.put("startM", getStartM());
            jSONObject.put("stopH", getStopH());
            jSONObject.put("stopM", getStopM());
            jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @NotNull
    public String toString() {
        return "ScreenLockConfig[enable: " + this.enable + ", allDay: " + this.allDayLock + ", startH: " + this.startH + ", startM: " + this.startM + ", stopH: " + this.stopH + ", stopM: " + this.stopM + JsonLexerKt.END_LIST;
    }

    public /* synthetic */ ScreenLockConfig(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 9 : i3, (i5 & 8) != 0 ? 0 : i4, z, (i5 & 32) != 0 ? true : z2);
    }

    public ScreenLockConfig(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this();
        if (a(i)) {
            this.startH = i;
        }
        if (b(i2)) {
            this.startM = i2;
        }
        if (a(i3)) {
            this.stopH = i3;
        }
        if (b(i4)) {
            this.stopM = i4;
        }
        this.enable = z;
        this.allDayLock = z2;
    }
}
