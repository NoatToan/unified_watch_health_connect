package com.smarthome.core.modelconfig;

import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingConst;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010)\u001a\u00020\u0003H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eRE\u0010\u000f\u001a6\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\n0\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0011*\u001a\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\n0\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00120\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eRQ\u0010\u0018\u001aB\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00190\u0019 \u0011* \u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00190\u0019\u0018\u00010\u00120\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/smarthome/core/modelconfig/PluginDeviceState;", "", "miId", "", "locale", "Ljava/util/Locale;", GlobalDynamicSettingConst.SERVER, "Lcom/xiaomi/smarthome/frame/server_compact/ServerBean;", "(Ljava/lang/String;Ljava/util/Locale;Lcom/xiaomi/smarthome/frame/server_compact/ServerBean;)V", "developerInfoLastModify", "", "getDeveloperInfoLastModify", "()J", "setDeveloperInfoLastModify", "(J)V", "developerInfoMap", "", "kotlin.jvm.PlatformType", "", "getDeveloperInfoMap", "()Ljava/util/Map;", "deviceInfoLastModify", "getDeviceInfoLastModify", "setDeviceInfoLastModify", "deviceInfoMap", "Lcom/smarthome/core/modelconfig/PluginDeviceInfo;", "getDeviceInfoMap", "lastCheckTime", "getLastCheckTime", "()Ljava/lang/String;", "setLastCheckTime", "(Ljava/lang/String;)V", "getLocale", "()Ljava/util/Locale;", "getMiId", "getServer", "()Lcom/xiaomi/smarthome/frame/server_compact/ServerBean;", "updateState", "Lcom/smarthome/core/modelconfig/UpdateState;", "getUpdateState", "()Lcom/smarthome/core/modelconfig/UpdateState;", "toString", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PluginDeviceState {
    private long developerInfoLastModify;
    private final Map<Long, String> developerInfoMap;
    private long deviceInfoLastModify;
    private final Map<String, PluginDeviceInfo> deviceInfoMap;

    @Nullable
    private String lastCheckTime;

    @NotNull
    private final Locale locale;

    @NotNull
    private final String miId;

    @NotNull
    private final ServerBean server;

    @NotNull
    private final UpdateState updateState;

    public PluginDeviceState(@NotNull String miId, @NotNull Locale locale, @NotNull ServerBean server) {
        Intrinsics.checkNotNullParameter(miId, "miId");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(server, "server");
        this.miId = miId;
        this.locale = locale;
        this.server = server;
        this.updateState = new UpdateState();
        this.deviceInfoMap = Collections.synchronizedMap(new HashMap(4192));
        this.developerInfoMap = Collections.synchronizedMap(new HashMap(1024));
    }

    public final long getDeveloperInfoLastModify() {
        return this.developerInfoLastModify;
    }

    public final Map<Long, String> getDeveloperInfoMap() {
        return this.developerInfoMap;
    }

    public final long getDeviceInfoLastModify() {
        return this.deviceInfoLastModify;
    }

    public final Map<String, PluginDeviceInfo> getDeviceInfoMap() {
        return this.deviceInfoMap;
    }

    @Nullable
    public final String getLastCheckTime() {
        return this.lastCheckTime;
    }

    @NotNull
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    public final String getMiId() {
        return this.miId;
    }

    @NotNull
    public final ServerBean getServer() {
        return this.server;
    }

    @NotNull
    public final UpdateState getUpdateState() {
        return this.updateState;
    }

    public final void setDeveloperInfoLastModify(long j) {
        this.developerInfoLastModify = j;
    }

    public final void setDeviceInfoLastModify(long j) {
        this.deviceInfoLastModify = j;
    }

    public final void setLastCheckTime(@Nullable String str) {
        this.lastCheckTime = str;
    }

    @NotNull
    public String toString() {
        return "PluginDeviceState(miId='" + this.miId + "', locale=" + this.locale + ", server=" + this.server + ", updateState=" + this.updateState + ", deviceInfoMap=" + this.deviceInfoMap.size() + ", deviceInfoLastModify=" + this.deviceInfoLastModify + ", developerInfoMap=" + this.developerInfoMap.size() + ", developerInfoLastModify=" + this.developerInfoLastModify + ", lastCheckTime=" + ((Object) this.lastCheckTime) + ')';
    }
}
