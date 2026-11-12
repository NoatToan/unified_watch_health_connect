package com.smarthome.core;

import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import com.xiaomi.smarthome.setting.ServerSetting;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0011J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u000bJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0011J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0011J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020&R\"\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lcom/smarthome/core/SmartConfig;", "", "()V", "defaultLocale", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "getDefaultLocale$smarthome_core_release", "()Ljava/util/Locale;", "setDefaultLocale$smarthome_core_release", "(Ljava/util/Locale;)V", "defaultServer", "Lcom/xiaomi/smarthome/frame/server_compact/ServerBean;", "getDefaultServer$smarthome_core_release", "()Lcom/xiaomi/smarthome/frame/server_compact/ServerBean;", "setDefaultServer$smarthome_core_release", "(Lcom/xiaomi/smarthome/frame/server_compact/ServerBean;)V", "isSt", "", "()Z", "setSt", "(Z)V", "serverEnv", "", "getServerEnv$smarthome_core_release", "()Ljava/lang/String;", "setServerEnv$smarthome_core_release", "(Ljava/lang/String;)V", "setAT", "result", "setDefaultLocale", "locale", "setDefaultServer", "serverBean", "setIsPv", "pv", "setIsST", "st", "setServerEnv", "", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SmartConfig {
    private Locale defaultLocale;

    @NotNull
    private ServerBean defaultServer;
    private boolean isSt;

    @NotNull
    private String serverEnv;

    public SmartConfig() {
        ServerBean serverBeanCN_SERVER = ServerConstants.CN_SERVER();
        Intrinsics.checkNotNullExpressionValue(serverBeanCN_SERVER, "CN_SERVER()");
        this.defaultServer = serverBeanCN_SERVER;
        this.serverEnv = "release";
        this.defaultLocale = Locale.getDefault();
    }

    /* JADX INFO: renamed from: getDefaultLocale$smarthome_core_release, reason: from getter */
    public final Locale getDefaultLocale() {
        return this.defaultLocale;
    }

    @NotNull
    /* JADX INFO: renamed from: getDefaultServer$smarthome_core_release, reason: from getter */
    public final ServerBean getDefaultServer() {
        return this.defaultServer;
    }

    @NotNull
    /* JADX INFO: renamed from: getServerEnv$smarthome_core_release, reason: from getter */
    public final String getServerEnv() {
        return this.serverEnv;
    }

    /* JADX INFO: renamed from: isSt, reason: from getter */
    public final boolean getIsSt() {
        return this.isSt;
    }

    @NotNull
    public final SmartConfig setAT(boolean result) {
        this.serverEnv = result ? "at" : "release";
        return this;
    }

    @NotNull
    public final SmartConfig setDefaultLocale(@Nullable Locale locale) {
        if (locale != null) {
            this.defaultLocale = locale;
        }
        return this;
    }

    public final void setDefaultLocale$smarthome_core_release(Locale locale) {
        this.defaultLocale = locale;
    }

    @NotNull
    public final SmartConfig setDefaultServer(@Nullable ServerBean serverBean) {
        if (serverBean != null) {
            this.defaultServer = serverBean;
        }
        return this;
    }

    public final void setDefaultServer$smarthome_core_release(@NotNull ServerBean serverBean) {
        Intrinsics.checkNotNullParameter(serverBean, "<set-?>");
        this.defaultServer = serverBean;
    }

    @NotNull
    public final SmartConfig setIsPv(boolean pv) {
        this.serverEnv = pv ? ServerSetting.SERVER_ENV_PREVIEW : "release";
        return this;
    }

    @NotNull
    public final SmartConfig setIsST(boolean st) {
        this.isSt = st;
        return this;
    }

    @NotNull
    public final SmartConfig setServerEnv(int serverEnv) {
        switch (serverEnv) {
            case 0:
                ServerBean serverBeanCN_SERVER = ServerConstants.CN_SERVER();
                Intrinsics.checkNotNullExpressionValue(serverBeanCN_SERVER, "CN_SERVER()");
                this.defaultServer = serverBeanCN_SERVER;
                return this;
            case 1:
                ServerBean serverBeanSG_SERVER = ServerConstants.SG_SERVER();
                Intrinsics.checkNotNullExpressionValue(serverBeanSG_SERVER, "SG_SERVER()");
                this.defaultServer = serverBeanSG_SERVER;
                return this;
            case 2:
                ServerBean serverBeanRU_SERVER = ServerConstants.RU_SERVER();
                Intrinsics.checkNotNullExpressionValue(serverBeanRU_SERVER, "RU_SERVER()");
                this.defaultServer = serverBeanRU_SERVER;
                return this;
            case 3:
                ServerBean serverBeanDE_SERVER = ServerConstants.DE_SERVER();
                Intrinsics.checkNotNullExpressionValue(serverBeanDE_SERVER, "DE_SERVER()");
                this.defaultServer = serverBeanDE_SERVER;
                return this;
            case 4:
                ServerBean serverBeanIN_SERVER = ServerConstants.IN_SERVER();
                Intrinsics.checkNotNullExpressionValue(serverBeanIN_SERVER, "IN_SERVER()");
                this.defaultServer = serverBeanIN_SERVER;
                return this;
            case 5:
                ServerBean serverBeanUS_SERVER = ServerConstants.US_SERVER();
                Intrinsics.checkNotNullExpressionValue(serverBeanUS_SERVER, "US_SERVER()");
                this.defaultServer = serverBeanUS_SERVER;
                return this;
            case 6:
                ServerBean serverBeanST_SERVER = ServerConstants.ST_SERVER();
                Intrinsics.checkNotNullExpressionValue(serverBeanST_SERVER, "ST_SERVER()");
                this.defaultServer = serverBeanST_SERVER;
                return this;
            default:
                ServerBean serverBeanCN_SERVER2 = ServerConstants.CN_SERVER();
                Intrinsics.checkNotNullExpressionValue(serverBeanCN_SERVER2, "CN_SERVER()");
                this.defaultServer = serverBeanCN_SERVER2;
                return this;
        }
    }

    public final void setServerEnv$smarthome_core_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serverEnv = str;
    }

    public final void setSt(boolean z) {
        this.isSt = z;
    }
}
