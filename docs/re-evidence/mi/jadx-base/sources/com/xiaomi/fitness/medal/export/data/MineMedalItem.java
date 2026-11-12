package com.xiaomi.fitness.medal.export.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J<\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/medal/export/data/MineMedalItem;", "", "name", "", "drawableRes", "", "status", "medal", "Lcom/xiaomi/fitness/medal/export/data/Medal;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ILcom/xiaomi/fitness/medal/export/data/Medal;)V", "getName", "()Ljava/lang/String;", "getDrawableRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "()I", "getMedal", "()Lcom/xiaomi/fitness/medal/export/data/Medal;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;ILcom/xiaomi/fitness/medal/export/data/Medal;)Lcom/xiaomi/fitness/medal/export/data/MineMedalItem;", "equals", "", "other", "hashCode", "toString", "medal-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MineMedalItem {

    @Nullable
    private final Integer drawableRes;

    @SerializedName("medal")
    @Nullable
    private final Medal medal;

    @Nullable
    private final String name;
    private final int status;

    public MineMedalItem(@Nullable String str, @Nullable Integer num, int i, @Nullable Medal medal) {
        this.name = str;
        this.drawableRes = num;
        this.status = i;
        this.medal = medal;
    }

    public static /* synthetic */ MineMedalItem copy$default(MineMedalItem mineMedalItem, String str, Integer num, int i, Medal medal, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mineMedalItem.name;
        }
        if ((i2 & 2) != 0) {
            num = mineMedalItem.drawableRes;
        }
        if ((i2 & 4) != 0) {
            i = mineMedalItem.status;
        }
        if ((i2 & 8) != 0) {
            medal = mineMedalItem.medal;
        }
        return mineMedalItem.copy(str, num, i, medal);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDrawableRes() {
        return this.drawableRes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Medal getMedal() {
        return this.medal;
    }

    @NotNull
    public final MineMedalItem copy(@Nullable String name, @Nullable Integer drawableRes, int status, @Nullable Medal medal) {
        return new MineMedalItem(name, drawableRes, status, medal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MineMedalItem)) {
            return false;
        }
        MineMedalItem mineMedalItem = (MineMedalItem) other;
        return Intrinsics.areEqual(this.name, mineMedalItem.name) && Intrinsics.areEqual(this.drawableRes, mineMedalItem.drawableRes) && this.status == mineMedalItem.status && Intrinsics.areEqual(this.medal, mineMedalItem.medal);
    }

    @Nullable
    public final Integer getDrawableRes() {
        return this.drawableRes;
    }

    @Nullable
    public final Medal getMedal() {
        return this.medal;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.drawableRes;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.status)) * 31;
        Medal medal = this.medal;
        return iHashCode2 + (medal != null ? medal.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MineMedalItem(name=" + this.name + ", drawableRes=" + this.drawableRes + ", status=" + this.status + ", medal=" + this.medal + ")";
    }
}
