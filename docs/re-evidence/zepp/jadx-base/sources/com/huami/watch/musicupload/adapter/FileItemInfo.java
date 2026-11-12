package com.huami.watch.musicupload.adapter;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b*\b\u0086\b\u0018\u0000 42\u00020\u0001:\u00014B=\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000bHÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "", "", "toString", "", "component1", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "component2", "", "component3", "component4", "", "component5", "type", "fileInfo", "select", "parentItem", "children", "copy", "hashCode", "other", "equals", "a", LogUtil.I, "getType", "()I", "setType", "(I)V", "b", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "getFileInfo", "()Lcom/huami/watch/musicupload/adapter/FileInfo;", "c", "Z", "getSelect", "()Z", "setSelect", "(Z)V", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "getParentItem", "()Lcom/huami/watch/musicupload/adapter/FileItemInfo;", "setParentItem", "(Lcom/huami/watch/musicupload/adapter/FileItemInfo;)V", "e", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "<init>", "(ILcom/huami/watch/musicupload/adapter/FileInfo;ZLcom/huami/watch/musicupload/adapter/FileItemInfo;Ljava/util/List;)V", "Companion", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class FileItemInfo {
    public static final int TYPE_FILE = 1;
    public static final int TYPE_FOLDER = 2;
    public static final int TYPE_SELECT_ALL = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final FileInfo fileInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean select;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private FileItemInfo parentItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private List<FileItemInfo> children;

    public FileItemInfo(int i, @NotNull FileInfo fileInfo, boolean z, @Nullable FileItemInfo fileItemInfo, @Nullable List<FileItemInfo> list) {
        this.type = i;
        this.fileInfo = fileInfo;
        this.select = z;
        this.parentItem = fileItemInfo;
        this.children = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileItemInfo copy$default(FileItemInfo fileItemInfo, int i, FileInfo fileInfo, boolean z, FileItemInfo fileItemInfo2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fileItemInfo.type;
        }
        if ((i2 & 2) != 0) {
            fileInfo = fileItemInfo.fileInfo;
        }
        FileInfo fileInfo2 = fileInfo;
        if ((i2 & 4) != 0) {
            z = fileItemInfo.select;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            fileItemInfo2 = fileItemInfo.parentItem;
        }
        FileItemInfo fileItemInfo3 = fileItemInfo2;
        if ((i2 & 16) != 0) {
            list = fileItemInfo.children;
        }
        return fileItemInfo.copy(i, fileInfo2, z2, fileItemInfo3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FileInfo getFileInfo() {
        return this.fileInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSelect() {
        return this.select;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FileItemInfo getParentItem() {
        return this.parentItem;
    }

    @Nullable
    public final List<FileItemInfo> component5() {
        return this.children;
    }

    @NotNull
    public final FileItemInfo copy(int type, @NotNull FileInfo fileInfo, boolean select, @Nullable FileItemInfo parentItem, @Nullable List<FileItemInfo> children) {
        return new FileItemInfo(type, fileInfo, select, parentItem, children);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileItemInfo)) {
            return false;
        }
        FileItemInfo fileItemInfo = (FileItemInfo) other;
        return this.type == fileItemInfo.type && Intrinsics.areEqual(this.fileInfo, fileItemInfo.fileInfo) && this.select == fileItemInfo.select && Intrinsics.areEqual(this.parentItem, fileItemInfo.parentItem) && Intrinsics.areEqual(this.children, fileItemInfo.children);
    }

    @Nullable
    public final List<FileItemInfo> getChildren() {
        return this.children;
    }

    @NotNull
    public final FileInfo getFileInfo() {
        return this.fileInfo;
    }

    @Nullable
    public final FileItemInfo getParentItem() {
        return this.parentItem;
    }

    public final boolean getSelect() {
        return this.select;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public int hashCode() {
        int i = this.type * 31;
        FileInfo fileInfo = this.fileInfo;
        int iHashCode = (i + (fileInfo != null ? fileInfo.hashCode() : 0)) * 31;
        boolean z = this.select;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (iHashCode + r1) * 31;
        FileItemInfo fileItemInfo = this.parentItem;
        int iHashCode2 = (i2 + (fileItemInfo != null ? fileItemInfo.hashCode() : 0)) * 31;
        List<FileItemInfo> list = this.children;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setChildren(@Nullable List<FileItemInfo> list) {
        this.children = list;
    }

    public final void setParentItem(@Nullable FileItemInfo fileItemInfo) {
        this.parentItem = fileItemInfo;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "FileItemInfo(type=" + this.type + ", fileInfo=" + this.fileInfo + ", select=" + this.select + ", parentItem=" + this.parentItem + ')';
    }

    public /* synthetic */ FileItemInfo(int i, FileInfo fileInfo, boolean z, FileItemInfo fileItemInfo, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, fileInfo, z, (i2 & 8) != 0 ? null : fileItemInfo, (i2 & 16) != 0 ? null : list);
    }
}
