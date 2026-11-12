package com.huami.nfc.bus;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/huami/nfc/bus/XiaomiInVoiceEntity;", "", "", "component1", "component2", "component3", "status", "downUrl", "version", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "b", "getDownUrl", "c", "getVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class XiaomiInVoiceEntity {

    @NotNull
    public static final String EMPTY = "70003";

    @NotNull
    public static final String FAILURE = "70004";

    @NotNull
    public static final String SUCCESS = "70001";

    @NotNull
    public static final String WAITING = "70002";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("downUrl")
    @Nullable
    private final String downUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("version")
    @Nullable
    private final String version;

    public XiaomiInVoiceEntity(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.status = str;
        this.downUrl = str2;
        this.version = str3;
    }

    public static /* synthetic */ XiaomiInVoiceEntity copy$default(XiaomiInVoiceEntity xiaomiInVoiceEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xiaomiInVoiceEntity.status;
        }
        if ((i & 2) != 0) {
            str2 = xiaomiInVoiceEntity.downUrl;
        }
        if ((i & 4) != 0) {
            str3 = xiaomiInVoiceEntity.version;
        }
        return xiaomiInVoiceEntity.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDownUrl() {
        return this.downUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final XiaomiInVoiceEntity copy(@NotNull String status, @Nullable String downUrl, @Nullable String version) {
        return new XiaomiInVoiceEntity(status, downUrl, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XiaomiInVoiceEntity)) {
            return false;
        }
        XiaomiInVoiceEntity xiaomiInVoiceEntity = (XiaomiInVoiceEntity) other;
        return Intrinsics.areEqual(this.status, xiaomiInVoiceEntity.status) && Intrinsics.areEqual(this.downUrl, xiaomiInVoiceEntity.downUrl) && Intrinsics.areEqual(this.version, xiaomiInVoiceEntity.version);
    }

    @Nullable
    public final String getDownUrl() {
        return this.downUrl;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.downUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.version;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "XiaomiInVoiceEntity(status=" + this.status + ", downUrl=" + ((Object) this.downUrl) + ", version=" + ((Object) this.version) + ')';
    }
}
