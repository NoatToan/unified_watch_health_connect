package com.huami.bluetooth.profile.channel.module.lumberjack;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/Version;", "", "", "component1", "", "", "component2", "v", "domainList", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getV", "()I", "b", "Ljava/util/List;", "getDomainList", "()Ljava/util/List;", "<init>", "(ILjava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Version {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int v;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<String> domainList;

    public Version(int i, @NotNull List<String> list) {
        this.v = i;
        this.domainList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Version copy$default(Version version, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = version.v;
        }
        if ((i2 & 2) != 0) {
            list = version.domainList;
        }
        return version.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getV() {
        return this.v;
    }

    @NotNull
    public final List<String> component2() {
        return this.domainList;
    }

    @NotNull
    public final Version copy(int v, @NotNull List<String> domainList) {
        return new Version(v, domainList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Version)) {
            return false;
        }
        Version version = (Version) other;
        return this.v == version.v && Intrinsics.areEqual(this.domainList, version.domainList);
    }

    @NotNull
    public final List<String> getDomainList() {
        return this.domainList;
    }

    public final int getV() {
        return this.v;
    }

    public int hashCode() {
        return (this.v * 31) + this.domainList.hashCode();
    }

    @NotNull
    public String toString() {
        return "Version(v=" + this.v + ", domainList=" + this.domainList + ')';
    }
}
