package com.xiaomi.fitness.watch.face.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Entity(tableName = "face_ble_photo")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/watch/face/db/FaceBlePhoto;", "", "id", "", "path", "md5", "list", "", "Lcom/xiaomi/fitness/watch/face/db/FaceBleMultiPhoto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getPath", "setPath", "(Ljava/lang/String;)V", "getMd5", "setMd5", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceBlePhoto {

    @PrimaryKey
    @NotNull
    private final String id;

    @Nullable
    private List<FaceBleMultiPhoto> list;

    @Nullable
    private String md5;

    @Nullable
    private String path;

    public FaceBlePhoto(@NotNull String id, @Nullable String str, @Nullable String str2, @Nullable List<FaceBleMultiPhoto> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.path = str;
        this.md5 = str2;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceBlePhoto copy$default(FaceBlePhoto faceBlePhoto, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceBlePhoto.id;
        }
        if ((i & 2) != 0) {
            str2 = faceBlePhoto.path;
        }
        if ((i & 4) != 0) {
            str3 = faceBlePhoto.md5;
        }
        if ((i & 8) != 0) {
            list = faceBlePhoto.list;
        }
        return faceBlePhoto.copy(str, str2, str3, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final List<FaceBleMultiPhoto> component4() {
        return this.list;
    }

    @NotNull
    public final FaceBlePhoto copy(@NotNull String id, @Nullable String path, @Nullable String md5, @Nullable List<FaceBleMultiPhoto> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new FaceBlePhoto(id, path, md5, list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceBlePhoto)) {
            return false;
        }
        FaceBlePhoto faceBlePhoto = (FaceBlePhoto) other;
        return Intrinsics.areEqual(this.id, faceBlePhoto.id) && Intrinsics.areEqual(this.path, faceBlePhoto.path) && Intrinsics.areEqual(this.md5, faceBlePhoto.md5) && Intrinsics.areEqual(this.list, faceBlePhoto.list);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<FaceBleMultiPhoto> getList() {
        return this.list;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.path;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.md5;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<FaceBleMultiPhoto> list = this.list;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final void setList(@Nullable List<FaceBleMultiPhoto> list) {
        this.list = list;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setPath(@Nullable String str) {
        this.path = str;
    }

    @NotNull
    public String toString() {
        return "FaceBlePhoto(id=" + this.id + ", path=" + this.path + ", md5=" + this.md5 + ", list=" + this.list + ")";
    }

    public /* synthetic */ FaceBlePhoto(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, list);
    }
}
