package com.xiaomi.fitness.watch.face.db;

import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Entity(primaryKeys = {"id", "did"}, tableName = "face_huami_realm")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J]\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/watch/face/db/FaceHuaMiRealm;", "", "timestamp", "", "id", "", "did", "fileMd5", "name", "imgMd5", "spiritColor", "isCurrent", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getTimestamp", "()J", "getId", "()Ljava/lang/String;", "getDid", "getFileMd5", "getName", "getImgMd5", "getSpiritColor", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceHuaMiRealm {

    @NotNull
    private final String did;

    @NotNull
    private final String fileMd5;

    @NotNull
    private final String id;

    @Nullable
    private final String imgMd5;
    private final boolean isCurrent;

    @NotNull
    private final String name;

    @Nullable
    private final String spiritColor;
    private final long timestamp;

    public FaceHuaMiRealm(long j, @NotNull String id, @NotNull String did, @NotNull String fileMd5, @NotNull String name, @Nullable String str, @Nullable String str2, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
        Intrinsics.checkNotNullParameter(name, "name");
        this.timestamp = j;
        this.id = id;
        this.did = did;
        this.fileMd5 = fileMd5;
        this.name = name;
        this.imgMd5 = str;
        this.spiritColor = str2;
        this.isCurrent = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileMd5() {
        return this.fileMd5;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImgMd5() {
        return this.imgMd5;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSpiritColor() {
        return this.spiritColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }

    @NotNull
    public final FaceHuaMiRealm copy(long timestamp, @NotNull String id, @NotNull String did, @NotNull String fileMd5, @NotNull String name, @Nullable String imgMd5, @Nullable String spiritColor, boolean isCurrent) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
        Intrinsics.checkNotNullParameter(name, "name");
        return new FaceHuaMiRealm(timestamp, id, did, fileMd5, name, imgMd5, spiritColor, isCurrent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceHuaMiRealm)) {
            return false;
        }
        FaceHuaMiRealm faceHuaMiRealm = (FaceHuaMiRealm) other;
        return this.timestamp == faceHuaMiRealm.timestamp && Intrinsics.areEqual(this.id, faceHuaMiRealm.id) && Intrinsics.areEqual(this.did, faceHuaMiRealm.did) && Intrinsics.areEqual(this.fileMd5, faceHuaMiRealm.fileMd5) && Intrinsics.areEqual(this.name, faceHuaMiRealm.name) && Intrinsics.areEqual(this.imgMd5, faceHuaMiRealm.imgMd5) && Intrinsics.areEqual(this.spiritColor, faceHuaMiRealm.spiritColor) && this.isCurrent == faceHuaMiRealm.isCurrent;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final String getFileMd5() {
        return this.fileMd5;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImgMd5() {
        return this.imgMd5;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSpiritColor() {
        return this.spiritColor;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.timestamp) * 31) + this.id.hashCode()) * 31) + this.did.hashCode()) * 31) + this.fileMd5.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.imgMd5;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.spiritColor;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCurrent);
    }

    public final boolean isCurrent() {
        return this.isCurrent;
    }

    @NotNull
    public String toString() {
        return "FaceHuaMiRealm(timestamp=" + this.timestamp + ", id=" + this.id + ", did=" + this.did + ", fileMd5=" + this.fileMd5 + ", name=" + this.name + ", imgMd5=" + this.imgMd5 + ", spiritColor=" + this.spiritColor + ", isCurrent=" + this.isCurrent + ")";
    }

    public /* synthetic */ FaceHuaMiRealm(long j, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, str5, str6, (i & 128) != 0 ? false : z);
    }
}
