package com.xiaomi.fitness.watch.face.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Entity(tableName = "face_common_table")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010)\u001a\u00020*J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u008a\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u001eR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/watch/face/db/FaceCommonEntity;", "", "combineId", "", "timestamp", "", "did", FaceInfoBase.FACE_ID, "name", "upperColor", "backgroundColor", "md5", "path", "multiPhotoDataList", "", "Lcom/xiaomi/fitness/watch/face/db/FaceBleMultiPhoto;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCombineId", "()Ljava/lang/String;", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDid", "getFaceId", "getName", "getUpperColor", "setUpperColor", "(Ljava/lang/String;)V", "getBackgroundColor", "setBackgroundColor", "getMd5", "setMd5", "getPath", "setPath", "getMultiPhotoDataList", "()Ljava/util/List;", "setMultiPhotoDataList", "(Ljava/util/List;)V", "toFace", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/xiaomi/fitness/watch/face/db/FaceCommonEntity;", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceCommonEntity {

    @Nullable
    private String backgroundColor;

    @PrimaryKey
    @NotNull
    private final String combineId;

    @Nullable
    private final String did;

    @Nullable
    private final String faceId;

    @Nullable
    private String md5;

    @Nullable
    private List<FaceBleMultiPhoto> multiPhotoDataList;

    @Nullable
    private final String name;

    @Nullable
    private String path;

    @Nullable
    private Long timestamp;

    @Nullable
    private String upperColor;

    public FaceCommonEntity(@NotNull String combineId, @Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable List<FaceBleMultiPhoto> list) {
        Intrinsics.checkNotNullParameter(combineId, "combineId");
        this.combineId = combineId;
        this.timestamp = l;
        this.did = str;
        this.faceId = str2;
        this.name = str3;
        this.upperColor = str4;
        this.backgroundColor = str5;
        this.md5 = str6;
        this.path = str7;
        this.multiPhotoDataList = list;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCombineId() {
        return this.combineId;
    }

    @Nullable
    public final List<FaceBleMultiPhoto> component10() {
        return this.multiPhotoDataList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFaceId() {
        return this.faceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUpperColor() {
        return this.upperColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final FaceCommonEntity copy(@NotNull String combineId, @Nullable Long timestamp, @Nullable String did, @Nullable String faceId, @Nullable String name, @Nullable String upperColor, @Nullable String backgroundColor, @Nullable String md5, @Nullable String path, @Nullable List<FaceBleMultiPhoto> multiPhotoDataList) {
        Intrinsics.checkNotNullParameter(combineId, "combineId");
        return new FaceCommonEntity(combineId, timestamp, did, faceId, name, upperColor, backgroundColor, md5, path, multiPhotoDataList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceCommonEntity)) {
            return false;
        }
        FaceCommonEntity faceCommonEntity = (FaceCommonEntity) other;
        return Intrinsics.areEqual(this.combineId, faceCommonEntity.combineId) && Intrinsics.areEqual(this.timestamp, faceCommonEntity.timestamp) && Intrinsics.areEqual(this.did, faceCommonEntity.did) && Intrinsics.areEqual(this.faceId, faceCommonEntity.faceId) && Intrinsics.areEqual(this.name, faceCommonEntity.name) && Intrinsics.areEqual(this.upperColor, faceCommonEntity.upperColor) && Intrinsics.areEqual(this.backgroundColor, faceCommonEntity.backgroundColor) && Intrinsics.areEqual(this.md5, faceCommonEntity.md5) && Intrinsics.areEqual(this.path, faceCommonEntity.path) && Intrinsics.areEqual(this.multiPhotoDataList, faceCommonEntity.multiPhotoDataList);
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getCombineId() {
        return this.combineId;
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final String getFaceId() {
        return this.faceId;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final List<FaceBleMultiPhoto> getMultiPhotoDataList() {
        return this.multiPhotoDataList;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getUpperColor() {
        return this.upperColor;
    }

    public int hashCode() {
        int iHashCode = this.combineId.hashCode() * 31;
        Long l = this.timestamp;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.did;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.faceId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.upperColor;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backgroundColor;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.md5;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.path;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<FaceBleMultiPhoto> list = this.multiPhotoDataList;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setMultiPhotoDataList(@Nullable List<FaceBleMultiPhoto> list) {
        this.multiPhotoDataList = list;
    }

    public final void setPath(@Nullable String str) {
        this.path = str;
    }

    public final void setTimestamp(@Nullable Long l) {
        this.timestamp = l;
    }

    public final void setUpperColor(@Nullable String str) {
        this.upperColor = str;
    }

    @NotNull
    public final WatchFace toFace() {
        String str = this.faceId;
        if (str == null) {
            str = "";
        }
        WatchFace watchFace = new WatchFace(str, "", false, false, false, false, null, 0L, null, 0, null, null, null, false, null, 0, 0, null, false, null, null, 0, 4194288, null);
        watchFace.setBackgroundImage(this.md5);
        watchFace.setSpiritColor(this.upperColor);
        return watchFace;
    }

    @NotNull
    public String toString() {
        return "FaceCommonEntity(combineId=" + this.combineId + ", timestamp=" + this.timestamp + ", did=" + this.did + ", faceId=" + this.faceId + ", name=" + this.name + ", upperColor=" + this.upperColor + ", backgroundColor=" + this.backgroundColor + ", md5=" + this.md5 + ", path=" + this.path + ", multiPhotoDataList=" + this.multiPhotoDataList + ")";
    }

    public /* synthetic */ FaceCommonEntity(String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) == 0 ? list : null);
    }
}
