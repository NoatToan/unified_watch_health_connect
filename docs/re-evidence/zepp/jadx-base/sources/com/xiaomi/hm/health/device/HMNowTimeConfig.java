package com.xiaomi.hm.health.device;

import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.ecf.data.NowTimeConfig;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/HMNowTimeConfig;", "", "Lcom/xiaomi/hm/health/device/HMNowTimeConfig$NowTimeSettings;", "fromNowTimeConfig", "settings", "", "setNowTimeConfigString", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "", "supportNowTime", "TAG", "Ljava/lang/String;", "", "DEFAULT_START_INDEX", LogUtil.I, "DEFAULT_STOP_INDEX", "a", "PROPERTY_KEY_NOW_TIME_NAME", "<init>", "()V", "NowTimeSettings", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMNowTimeConfig {
    public static final int DEFAULT_START_INDEX = 480;
    public static final int DEFAULT_STOP_INDEX = 1260;

    @NotNull
    public static final HMNowTimeConfig INSTANCE = new HMNowTimeConfig();

    @NotNull
    public static final String TAG = "HMNowTimeConfig";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_KEY_NOW_TIME_NAME = "huami.mifit.user.settings.nowtime";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fromNowTimeConfig:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fromNowTimeConfig:ERROR:" + this.a + ".toString()";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ NowTimeSettings a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NowTimeSettings nowTimeSettings) {
            super(0);
            this.a = nowTimeSettings;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setNowTimeConfigString:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setNowTimeConfigString:ERROR:" + this.a + ".toString()";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "supportNowTime:" + this.a;
        }
    }

    private HMNowTimeConfig() {
    }

    public static /* synthetic */ boolean supportNowTime$default(HMNowTimeConfig hMNowTimeConfig, HMDeviceSource hMDeviceSource, DeviceInfo deviceInfo, int i, Object obj) {
        if ((i & 2) != 0) {
            deviceInfo = null;
        }
        return hMNowTimeConfig.supportNowTime(hMDeviceSource, deviceInfo);
    }

    @NotNull
    public final NowTimeSettings fromNowTimeConfig() {
        String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(PROPERTY_KEY_NOW_TIME_NAME, null);
        HMLog.info(TAG, new a(property));
        NowTimeSettings nowTimeSettings = new NowTimeSettings(false, 480, 1260);
        if (TextUtils.isEmpty(property)) {
            return nowTimeSettings;
        }
        try {
            JSONObject jSONObject = new JSONObject(property);
            nowTimeSettings.setEnable(jSONObject.optBoolean("enable"));
            nowTimeSettings.setStart(jSONObject.optInt("start"));
            nowTimeSettings.setStop(jSONObject.optInt(Command.STOP));
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, null, new b(e2), 6, null);
        }
        return nowTimeSettings;
    }

    @Nullable
    public final String setNowTimeConfigString(@NotNull NowTimeSettings settings) {
        HMLog.info(TAG, new c(settings));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", settings.getEnable());
            jSONObject.put("start", settings.getStart());
            jSONObject.put(Command.STOP, settings.getStop());
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(PROPERTY_KEY_NOW_TIME_NAME, jSONObject.toString());
            DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, null, new d(e2), 6, null);
        }
        return jSONObject.toString();
    }

    public final boolean supportNowTime(@NotNull HMDeviceSource deviceSource, @Nullable DeviceInfo deviceInfo) {
        boolean z = deviceInfo != null && deviceSource == HMDeviceSource.MILI_TOKYO && deviceInfo.getDeviceFeature().has(1);
        HMLog.info(TAG, new e(z));
        return z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/device/HMNowTimeConfig$NowTimeSettings;", "", "Lcom/huami/bluetooth/profile/ecf/data/NowTimeConfig;", "toNowTimeConfig", "", "component1", "", "component2", "component3", "enable", "start", Command.STOP, "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "b", LogUtil.I, "getStart", "()I", "setStart", "(I)V", "c", "getStop", "setStop", "<init>", "(ZII)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class NowTimeSettings {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private boolean enable;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private int start;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private int stop;

        public NowTimeSettings() {
            this(false, 0, 0, 7, null);
        }

        public NowTimeSettings(boolean z, int i, int i2) {
            this.enable = z;
            this.start = i;
            this.stop = i2;
        }

        public static /* synthetic */ NowTimeSettings copy$default(NowTimeSettings nowTimeSettings, boolean z, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = nowTimeSettings.enable;
            }
            if ((i3 & 2) != 0) {
                i = nowTimeSettings.start;
            }
            if ((i3 & 4) != 0) {
                i2 = nowTimeSettings.stop;
            }
            return nowTimeSettings.copy(z, i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getEnable() {
            return this.enable;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getStop() {
            return this.stop;
        }

        @NotNull
        public final NowTimeSettings copy(boolean enable, int start, int stop) {
            return new NowTimeSettings(enable, start, stop);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NowTimeSettings)) {
                return false;
            }
            NowTimeSettings nowTimeSettings = (NowTimeSettings) other;
            return this.enable == nowTimeSettings.enable && this.start == nowTimeSettings.start && this.stop == nowTimeSettings.stop;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final int getStart() {
            return this.start;
        }

        public final int getStop() {
            return this.stop;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + this.start) * 31) + this.stop;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setStart(int i) {
            this.start = i;
        }

        public final void setStop(int i) {
            this.stop = i;
        }

        @NotNull
        public final NowTimeConfig toNowTimeConfig() {
            boolean z = this.enable;
            int i = this.start;
            Time time = new Time(i / 60, i % 60);
            int i2 = this.stop;
            return new NowTimeConfig(z, time, new Time(i2 / 60, i2 % 60));
        }

        @NotNull
        public String toString() {
            return "NowTimeSettings(enable=" + this.enable + ", start=" + this.start + ", stop=" + this.stop + ")";
        }

        public /* synthetic */ NowTimeSettings(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 480 : i, (i3 & 4) != 0 ? 1260 : i2);
        }
    }
}
