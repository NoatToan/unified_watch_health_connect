package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/CommitTransTask;", "", "name", "", "secretKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSecretKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommitTransTask {

    @SerializedName("obj_name")
    @NotNull
    private final String name;

    @SerializedName("secret_key")
    @Nullable
    private final String secretKey;

    public CommitTransTask(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.secretKey = str;
    }

    public static /* synthetic */ CommitTransTask copy$default(CommitTransTask commitTransTask, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commitTransTask.name;
        }
        if ((i & 2) != 0) {
            str2 = commitTransTask.secretKey;
        }
        return commitTransTask.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSecretKey() {
        return this.secretKey;
    }

    @NotNull
    public final CommitTransTask copy(@NotNull String name, @Nullable String secretKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new CommitTransTask(name, secretKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitTransTask)) {
            return false;
        }
        CommitTransTask commitTransTask = (CommitTransTask) other;
        return Intrinsics.areEqual(this.name, commitTransTask.name) && Intrinsics.areEqual(this.secretKey, commitTransTask.secretKey);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSecretKey() {
        return this.secretKey;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.secretKey;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "CommitTransTask(name=" + this.name + ", secretKey=" + this.secretKey + ")";
    }
}
