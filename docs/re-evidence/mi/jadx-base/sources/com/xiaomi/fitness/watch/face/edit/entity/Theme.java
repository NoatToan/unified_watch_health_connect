package com.xiaomi.fitness.watch.face.edit.entity;

import com.xiaomi.smarthome.setting.ServerSetting;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\nHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J\u001d\u0010=\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0018\u00010\u0010HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010@\u001a\u00020\u0016HÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003JÏ\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0018\u00010\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\nHÆ\u0001J\u0013\u0010C\u001a\u00020\n2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0016HÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010!R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R.\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010#\"\u0004\b*\u0010+R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010!¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/Theme;", "", "type", "", "name", "bg", "bgColor", "fg", ServerSetting.SERVER_ENV_PREVIEW, "isPhotoAlbumWatchface", "", "colorGroupTable", "", "layoutList", "Lcom/xiaomi/fitness/watch/face/edit/entity/Layout;", "slotMap", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/Slot;", "movableSlot", "dialEditEntity", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialEditEntity;", "positionCount", "", "isVideoWatchFace", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/xiaomi/fitness/watch/face/edit/entity/DialEditEntity;IZ)V", "getType", "()Ljava/lang/String;", "getName", "getBg", "getBgColor", "getFg", "getPreview", "()Z", "getColorGroupTable", "()Ljava/util/List;", "getLayoutList", "getSlotMap", "()Ljava/util/Map;", "setSlotMap", "(Ljava/util/Map;)V", "getMovableSlot", "setMovableSlot", "(Ljava/util/List;)V", "getDialEditEntity", "()Lcom/xiaomi/fitness/watch/face/edit/entity/DialEditEntity;", "setDialEditEntity", "(Lcom/xiaomi/fitness/watch/face/edit/entity/DialEditEntity;)V", "getPositionCount", "()I", "setPositionCount", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Theme {

    @Nullable
    private final String bg;

    @Nullable
    private final String bgColor;

    @Nullable
    private final List<String> colorGroupTable;

    @Nullable
    private DialEditEntity dialEditEntity;

    @Nullable
    private final String fg;
    private final boolean isPhotoAlbumWatchface;
    private final boolean isVideoWatchFace;

    @Nullable
    private final List<Layout> layoutList;

    @Nullable
    private List<Slot> movableSlot;

    @Nullable
    private final String name;
    private int positionCount;

    @Nullable
    private final String preview;

    @Nullable
    private Map<String, ? extends List<Slot>> slotMap;

    @Nullable
    private final String type;

    public Theme() {
        this(null, null, null, null, null, null, false, null, null, null, null, null, 0, false, 16383, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Map<String, List<Slot>> component10() {
        return this.slotMap;
    }

    @Nullable
    public final List<Slot> component11() {
        return this.movableSlot;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final DialEditEntity getDialEditEntity() {
        return this.dialEditEntity;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getPositionCount() {
        return this.positionCount;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsVideoWatchFace() {
        return this.isVideoWatchFace;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBg() {
        return this.bg;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFg() {
        return this.fg;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPreview() {
        return this.preview;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsPhotoAlbumWatchface() {
        return this.isPhotoAlbumWatchface;
    }

    @Nullable
    public final List<String> component8() {
        return this.colorGroupTable;
    }

    @Nullable
    public final List<Layout> component9() {
        return this.layoutList;
    }

    @NotNull
    public final Theme copy(@Nullable String type, @Nullable String name, @Nullable String bg, @Nullable String bgColor, @Nullable String fg, @Nullable String preview, boolean isPhotoAlbumWatchface, @Nullable List<String> colorGroupTable, @Nullable List<Layout> layoutList, @Nullable Map<String, ? extends List<Slot>> slotMap, @Nullable List<Slot> movableSlot, @Nullable DialEditEntity dialEditEntity, int positionCount, boolean isVideoWatchFace) {
        return new Theme(type, name, bg, bgColor, fg, preview, isPhotoAlbumWatchface, colorGroupTable, layoutList, slotMap, movableSlot, dialEditEntity, positionCount, isVideoWatchFace);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Theme)) {
            return false;
        }
        Theme theme = (Theme) other;
        return Intrinsics.areEqual(this.type, theme.type) && Intrinsics.areEqual(this.name, theme.name) && Intrinsics.areEqual(this.bg, theme.bg) && Intrinsics.areEqual(this.bgColor, theme.bgColor) && Intrinsics.areEqual(this.fg, theme.fg) && Intrinsics.areEqual(this.preview, theme.preview) && this.isPhotoAlbumWatchface == theme.isPhotoAlbumWatchface && Intrinsics.areEqual(this.colorGroupTable, theme.colorGroupTable) && Intrinsics.areEqual(this.layoutList, theme.layoutList) && Intrinsics.areEqual(this.slotMap, theme.slotMap) && Intrinsics.areEqual(this.movableSlot, theme.movableSlot) && Intrinsics.areEqual(this.dialEditEntity, theme.dialEditEntity) && this.positionCount == theme.positionCount && this.isVideoWatchFace == theme.isVideoWatchFace;
    }

    @Nullable
    public final String getBg() {
        return this.bg;
    }

    @Nullable
    public final String getBgColor() {
        return this.bgColor;
    }

    @Nullable
    public final List<String> getColorGroupTable() {
        return this.colorGroupTable;
    }

    @Nullable
    public final DialEditEntity getDialEditEntity() {
        return this.dialEditEntity;
    }

    @Nullable
    public final String getFg() {
        return this.fg;
    }

    @Nullable
    public final List<Layout> getLayoutList() {
        return this.layoutList;
    }

    @Nullable
    public final List<Slot> getMovableSlot() {
        return this.movableSlot;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getPositionCount() {
        return this.positionCount;
    }

    @Nullable
    public final String getPreview() {
        return this.preview;
    }

    @Nullable
    public final Map<String, List<Slot>> getSlotMap() {
        return this.slotMap;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bg;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bgColor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fg;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.preview;
        int iHashCode6 = (((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + Boolean.hashCode(this.isPhotoAlbumWatchface)) * 31;
        List<String> list = this.colorGroupTable;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<Layout> list2 = this.layoutList;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, ? extends List<Slot>> map = this.slotMap;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        List<Slot> list3 = this.movableSlot;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        DialEditEntity dialEditEntity = this.dialEditEntity;
        return ((((iHashCode10 + (dialEditEntity != null ? dialEditEntity.hashCode() : 0)) * 31) + Integer.hashCode(this.positionCount)) * 31) + Boolean.hashCode(this.isVideoWatchFace);
    }

    public final boolean isPhotoAlbumWatchface() {
        return this.isPhotoAlbumWatchface;
    }

    public final boolean isVideoWatchFace() {
        return this.isVideoWatchFace;
    }

    public final void setDialEditEntity(@Nullable DialEditEntity dialEditEntity) {
        this.dialEditEntity = dialEditEntity;
    }

    public final void setMovableSlot(@Nullable List<Slot> list) {
        this.movableSlot = list;
    }

    public final void setPositionCount(int i) {
        this.positionCount = i;
    }

    public final void setSlotMap(@Nullable Map<String, ? extends List<Slot>> map) {
        this.slotMap = map;
    }

    @NotNull
    public String toString() {
        return "Theme(type=" + this.type + ", name=" + this.name + ", bg=" + this.bg + ", bgColor=" + this.bgColor + ", fg=" + this.fg + ", preview=" + this.preview + ", isPhotoAlbumWatchface=" + this.isPhotoAlbumWatchface + ", colorGroupTable=" + this.colorGroupTable + ", layoutList=" + this.layoutList + ", slotMap=" + this.slotMap + ", movableSlot=" + this.movableSlot + ", dialEditEntity=" + this.dialEditEntity + ", positionCount=" + this.positionCount + ", isVideoWatchFace=" + this.isVideoWatchFace + ")";
    }

    public Theme(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z, @Nullable List<String> list, @Nullable List<Layout> list2, @Nullable Map<String, ? extends List<Slot>> map, @Nullable List<Slot> list3, @Nullable DialEditEntity dialEditEntity, int i, boolean z2) {
        this.type = str;
        this.name = str2;
        this.bg = str3;
        this.bgColor = str4;
        this.fg = str5;
        this.preview = str6;
        this.isPhotoAlbumWatchface = z;
        this.colorGroupTable = list;
        this.layoutList = list2;
        this.slotMap = map;
        this.movableSlot = list3;
        this.dialEditEntity = dialEditEntity;
        this.positionCount = i;
        this.isVideoWatchFace = z2;
    }

    public /* synthetic */ Theme(String str, String str2, String str3, String str4, String str5, String str6, boolean z, List list, List list2, Map map, List list3, DialEditEntity dialEditEntity, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : list2, (i2 & 512) != 0 ? null : map, (i2 & 1024) != 0 ? null : list3, (i2 & 2048) == 0 ? dialEditEntity : null, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) == 0 ? z2 : false);
    }
}
