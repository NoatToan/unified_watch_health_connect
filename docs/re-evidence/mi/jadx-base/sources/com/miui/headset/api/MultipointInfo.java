package com.miui.headset.api;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/miui/headset/api/MultipointInfo;", "Ljava/io/Serializable;", "isMultipointHost", "", "multipointAddress", "", "otherMultipointHosts", "", "(ZLjava/lang/String;Ljava/util/List;)V", "()Z", "getMultipointAddress", "()Ljava/lang/String;", "getOtherMultipointHosts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MultipointInfo implements Serializable {
    private static final long serialVersionUID = 8683452581122892189L;
    private final boolean isMultipointHost;

    @NotNull
    private final String multipointAddress;

    @NotNull
    private final List<String> otherMultipointHosts;

    public MultipointInfo(boolean z, @NotNull String multipointAddress, @NotNull List<String> otherMultipointHosts) {
        Intrinsics.checkNotNullParameter(multipointAddress, "multipointAddress");
        Intrinsics.checkNotNullParameter(otherMultipointHosts, "otherMultipointHosts");
        this.isMultipointHost = z;
        this.multipointAddress = multipointAddress;
        this.otherMultipointHosts = otherMultipointHosts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultipointInfo copy$default(MultipointInfo multipointInfo, boolean z, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = multipointInfo.isMultipointHost;
        }
        if ((i & 2) != 0) {
            str = multipointInfo.multipointAddress;
        }
        if ((i & 4) != 0) {
            list = multipointInfo.otherMultipointHosts;
        }
        return multipointInfo.copy(z, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsMultipointHost() {
        return this.isMultipointHost;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMultipointAddress() {
        return this.multipointAddress;
    }

    @NotNull
    public final List<String> component3() {
        return this.otherMultipointHosts;
    }

    @NotNull
    public final MultipointInfo copy(boolean isMultipointHost, @NotNull String multipointAddress, @NotNull List<String> otherMultipointHosts) {
        Intrinsics.checkNotNullParameter(multipointAddress, "multipointAddress");
        Intrinsics.checkNotNullParameter(otherMultipointHosts, "otherMultipointHosts");
        return new MultipointInfo(isMultipointHost, multipointAddress, otherMultipointHosts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultipointInfo)) {
            return false;
        }
        MultipointInfo multipointInfo = (MultipointInfo) other;
        return this.isMultipointHost == multipointInfo.isMultipointHost && Intrinsics.areEqual(this.multipointAddress, multipointInfo.multipointAddress) && Intrinsics.areEqual(this.otherMultipointHosts, multipointInfo.otherMultipointHosts);
    }

    @NotNull
    public final String getMultipointAddress() {
        return this.multipointAddress;
    }

    @NotNull
    public final List<String> getOtherMultipointHosts() {
        return this.otherMultipointHosts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isMultipointHost;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.multipointAddress.hashCode()) * 31) + this.otherMultipointHosts.hashCode();
    }

    public final boolean isMultipointHost() {
        return this.isMultipointHost;
    }

    @NotNull
    public String toString() {
        return "MultipointInfo(isMultipointHost=" + this.isMultipointHost + ", multipointAddress=" + this.multipointAddress + ", otherMultipointHosts=" + this.otherMultipointHosts + ')';
    }
}
