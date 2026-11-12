package com.mi.fitness.checkupdate.ui.huami;

import com.mi.fitness.checkupdate.model.UpdateInfo;
import com.xiaomi.hm.health.bt.sdk.fw.FwType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0018\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/mi/fitness/checkupdate/ui/huami/HuamiUpdateInfo;", "Lcom/mi/fitness/checkupdate/model/UpdateInfo;", "type", "Lcom/xiaomi/hm/health/bt/sdk/fw/FwType;", "url", "", "md5", "version", "<init>", "(Lcom/xiaomi/hm/health/bt/sdk/fw/FwType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/xiaomi/hm/health/bt/sdk/fw/FwType;", "setType", "(Lcom/xiaomi/hm/health/bt/sdk/fw/FwType;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "filePath", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "toString", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiUpdateInfo extends UpdateInfo {

    @Nullable
    private String filePath;
    private boolean isSuccess;

    @NotNull
    private FwType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuamiUpdateInfo(@NotNull FwType type, @NotNull String url, @NotNull String md5, @NotNull String version) {
        super(url, md5, version);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(md5, "md5");
        Intrinsics.checkNotNullParameter(version, "version");
        this.type = type;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final FwType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public final void setType(@NotNull FwType fwType) {
        Intrinsics.checkNotNullParameter(fwType, "<set-?>");
        this.type = fwType;
    }

    @NotNull
    public String toString() {
        return "HuamiUpdateInfo(type=" + this.type + ", downLoadUrl='" + getUrl() + "', md5='" + getMd5() + "', version='" + getVersion() + "', isSuccess=" + this.isSuccess + ", filePath=" + this.filePath + ")";
    }
}
