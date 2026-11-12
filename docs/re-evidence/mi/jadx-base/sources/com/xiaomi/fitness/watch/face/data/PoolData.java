package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/PoolData;", "", "key", "", "name", "display", "", "num", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "getKey", "()Ljava/lang/String;", "getName", "getDisplay", "()Z", "getNum", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PoolData {
    private final boolean display;

    @Nullable
    private final String key;

    @Nullable
    private final String name;

    @SerializedName("display_num")
    private final int num;

    public PoolData(@Nullable String str, @Nullable String str2, boolean z, int i) {
        this.key = str;
        this.name = str2;
        this.display = z;
        this.num = i;
    }

    public static /* synthetic */ PoolData copy$default(PoolData poolData, String str, String str2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = poolData.key;
        }
        if ((i2 & 2) != 0) {
            str2 = poolData.name;
        }
        if ((i2 & 4) != 0) {
            z = poolData.display;
        }
        if ((i2 & 8) != 0) {
            i = poolData.num;
        }
        return poolData.copy(str, str2, z, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getNum() {
        return this.num;
    }

    @NotNull
    public final PoolData copy(@Nullable String key, @Nullable String name, boolean display, int num) {
        return new PoolData(key, name, display, num);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoolData)) {
            return false;
        }
        PoolData poolData = (PoolData) other;
        return Intrinsics.areEqual(this.key, poolData.key) && Intrinsics.areEqual(this.name, poolData.name) && this.display == poolData.display && this.num == poolData.num;
    }

    public final boolean getDisplay() {
        return this.display;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getNum() {
        return this.num;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.display)) * 31) + Integer.hashCode(this.num);
    }

    @NotNull
    public String toString() {
        return "PoolData(key=" + this.key + ", name=" + this.name + ", display=" + this.display + ", num=" + this.num + ")";
    }
}
