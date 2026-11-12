package com.huami.bluetooth.profile.channel.module.sport;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PhnVersion;", "", "", "component1", "", "component2", BehaviorTaggingWebApi.g.g, "algorithmVersion", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getProtocolVersion", "()I", "b", "Ljava/lang/String;", "getAlgorithmVersion", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PhnVersion {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int protocolVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String algorithmVersion;

    public PhnVersion(int i, @NotNull String str) {
        this.protocolVersion = i;
        this.algorithmVersion = str;
    }

    public static /* synthetic */ PhnVersion copy$default(PhnVersion phnVersion, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = phnVersion.protocolVersion;
        }
        if ((i2 & 2) != 0) {
            str = phnVersion.algorithmVersion;
        }
        return phnVersion.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

    @NotNull
    public final PhnVersion copy(int protocolVersion, @NotNull String algorithmVersion) {
        return new PhnVersion(protocolVersion, algorithmVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhnVersion)) {
            return false;
        }
        PhnVersion phnVersion = (PhnVersion) other;
        return this.protocolVersion == phnVersion.protocolVersion && Intrinsics.areEqual(this.algorithmVersion, phnVersion.algorithmVersion);
    }

    @NotNull
    public final String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    public int hashCode() {
        return (this.protocolVersion * 31) + this.algorithmVersion.hashCode();
    }

    @NotNull
    public String toString() {
        return "PhnVersion(protocolVersion=" + this.protocolVersion + ", algorithmVersion=" + this.algorithmVersion + ')';
    }
}
