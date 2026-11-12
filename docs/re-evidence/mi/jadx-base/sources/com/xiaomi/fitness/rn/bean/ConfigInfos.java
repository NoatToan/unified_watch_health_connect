package com.xiaomi.fitness.rn.bean;

import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/rn/bean/ConfigInfos;", "Lcom/xiaomi/fitness/mijia/sdk/data/BaseBean;", "configInfos", "", "Lcom/xiaomi/fitness/rn/bean/ConfigInfo;", "<init>", "(Ljava/util/List;)V", "getConfigInfos", "()Ljava/util/List;", "setConfigInfos", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfigInfos extends BaseBean {

    @NotNull
    private List<ConfigInfo> configInfos;

    public ConfigInfos(@NotNull List<ConfigInfo> configInfos) {
        Intrinsics.checkNotNullParameter(configInfos, "configInfos");
        this.configInfos = configInfos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigInfos copy$default(ConfigInfos configInfos, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = configInfos.configInfos;
        }
        return configInfos.copy(list);
    }

    @NotNull
    public final List<ConfigInfo> component1() {
        return this.configInfos;
    }

    @NotNull
    public final ConfigInfos copy(@NotNull List<ConfigInfo> configInfos) {
        Intrinsics.checkNotNullParameter(configInfos, "configInfos");
        return new ConfigInfos(configInfos);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConfigInfos) && Intrinsics.areEqual(this.configInfos, ((ConfigInfos) other).configInfos);
    }

    @NotNull
    public final List<ConfigInfo> getConfigInfos() {
        return this.configInfos;
    }

    public int hashCode() {
        return this.configInfos.hashCode();
    }

    public final void setConfigInfos(@NotNull List<ConfigInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.configInfos = list;
    }

    @NotNull
    public String toString() {
        return "ConfigInfos(configInfos=" + this.configInfos + ")";
    }
}
