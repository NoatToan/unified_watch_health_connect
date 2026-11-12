package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/ThirdPartyDataModel;", "", "key", "", "sid", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getSid", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ThirdPartyDataModel {

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("sid")
    @NotNull
    private final String sid;

    @SerializedName("value")
    @NotNull
    private final String value;

    public ThirdPartyDataModel(@NotNull String key, @NotNull String sid, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(value, "value");
        this.key = key;
        this.sid = sid;
        this.value = value;
    }

    public static /* synthetic */ ThirdPartyDataModel copy$default(ThirdPartyDataModel thirdPartyDataModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thirdPartyDataModel.key;
        }
        if ((i & 2) != 0) {
            str2 = thirdPartyDataModel.sid;
        }
        if ((i & 4) != 0) {
            str3 = thirdPartyDataModel.value;
        }
        return thirdPartyDataModel.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final ThirdPartyDataModel copy(@NotNull String key, @NotNull String sid, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ThirdPartyDataModel(key, sid, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdPartyDataModel)) {
            return false;
        }
        ThirdPartyDataModel thirdPartyDataModel = (ThirdPartyDataModel) other;
        return Intrinsics.areEqual(this.key, thirdPartyDataModel.key) && Intrinsics.areEqual(this.sid, thirdPartyDataModel.sid) && Intrinsics.areEqual(this.value, thirdPartyDataModel.value);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.sid.hashCode()) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "ThirdPartyDataModel(key=" + this.key + ", sid=" + this.sid + ", value=" + this.value + ")";
    }
}
