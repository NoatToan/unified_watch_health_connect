package com.xiaomi.hm.health.nps.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/nps/model/NpsDevice;", "", "", "component1", "component2", "component3", "name", "url", "source", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getUrl", "getSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nps_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NpsDevice {

    @NotNull
    private final String name;

    @NotNull
    private final String source;

    @NotNull
    private final String url;

    public NpsDevice(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.name = str;
        this.url = str2;
        this.source = str3;
    }

    public static /* synthetic */ NpsDevice copy$default(NpsDevice npsDevice, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = npsDevice.name;
        }
        if ((i & 2) != 0) {
            str2 = npsDevice.url;
        }
        if ((i & 4) != 0) {
            str3 = npsDevice.source;
        }
        return npsDevice.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final NpsDevice copy(@NotNull String name, @NotNull String url, @NotNull String source) {
        return new NpsDevice(name, url, source);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NpsDevice)) {
            return false;
        }
        NpsDevice npsDevice = (NpsDevice) other;
        return Intrinsics.areEqual(this.name, npsDevice.name) && Intrinsics.areEqual(this.url, npsDevice.url) && Intrinsics.areEqual(this.source, npsDevice.source);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.url.hashCode()) * 31) + this.source.hashCode();
    }

    @NotNull
    public String toString() {
        return "NpsDevice(name=" + this.name + ", url=" + this.url + ", source=" + this.source + ')';
    }
}
