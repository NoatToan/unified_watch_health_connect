package com.xiaomi.fitness.sport.model;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport/model/GetLatestVersion;", "", "<init>", "()V", "did", "", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "model", "getModel", "setModel", "platform", "getPlatform", "setPlatform", "app_level", "getApp_level", "setApp_level", "fw_ver", "getFw_ver", "setFw_ver", "channel", "getChannel", "setChannel", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetLatestVersion {

    @NotNull
    public static final String CHANNEL_NORMAL = "prod";

    @NotNull
    public static final String CHANNEL_STORE = "store";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String app_level;

    @NotNull
    private String channel = "prod";

    @Nullable
    private String did;

    @Nullable
    private String fw_ver;

    @Nullable
    private String model;

    @Nullable
    private String platform;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport/model/GetLatestVersion$Companion;", "", "<init>", "()V", "CHANNEL_NORMAL", "", "CHANNEL_STORE", "create", "Lcom/xiaomi/fitness/sport/model/GetLatestVersion;", "did", "model", "appVersionCode", "", "fwCurrentVersion", "channel", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GetLatestVersion create(@Nullable String did, @Nullable String model, long appVersionCode, @Nullable String fwCurrentVersion, @NotNull String channel) {
            Intrinsics.checkNotNullParameter(channel, "channel");
            GetLatestVersion getLatestVersion = new GetLatestVersion();
            getLatestVersion.setDid(did);
            getLatestVersion.setModel(model);
            getLatestVersion.setPlatform(PluginPackageConstant.RN_DIR_A);
            getLatestVersion.setApp_level(String.valueOf(appVersionCode));
            getLatestVersion.setFw_ver(fwCurrentVersion);
            getLatestVersion.setChannel(channel);
            return getLatestVersion;
        }
    }

    @Nullable
    public final String getApp_level() {
        return this.app_level;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final String getFw_ver() {
        return this.fw_ver;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    public final void setApp_level(@Nullable String str) {
        this.app_level = str;
    }

    public final void setChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channel = str;
    }

    public final void setDid(@Nullable String str) {
        this.did = str;
    }

    public final void setFw_ver(@Nullable String str) {
        this.fw_ver = str;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setPlatform(@Nullable String str) {
        this.platform = str;
    }
}
