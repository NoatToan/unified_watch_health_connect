package com.xiaomi.fitness.watch.face.edit.entity;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\bI\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\t\u0010R\u001a\u00020\u000fHÆ\u0003J\t\u0010S\u001a\u00020\tHÆ\u0003J\u0017\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012HÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0003J\t\u0010X\u001a\u00020\u000fHÆ\u0003JÕ\u0001\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u000fHÆ\u0001J\u0013\u0010Z\u001a\u00020\t2\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\\\u001a\u00020\u000fHÖ\u0001J\t\u0010]\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\u001a\u0010\u0018\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00104\"\u0004\bD\u00106R\u0013\u0010E\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010H\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bI\u0010\u001c¨\u0006^"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "", "id", "", "name", "width", "", "height", "skuStatus", "", "editable", "recolorTable", "", "colorGroupTable", "powerConsumptionLevel", "", "supportLiteral", "resourceMap", "", "normalThemeList", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/Theme;", "aodThemeList", "textList", "themeIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;FFZZLjava/util/List;Ljava/util/List;IZLjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getWidth", "()F", "setWidth", "(F)V", "getHeight", "setHeight", "getSkuStatus", "()Z", "setSkuStatus", "(Z)V", "getEditable", "setEditable", "getRecolorTable", "()Ljava/util/List;", "setRecolorTable", "(Ljava/util/List;)V", "getColorGroupTable", "setColorGroupTable", "getPowerConsumptionLevel", "()I", "setPowerConsumptionLevel", "(I)V", "getSupportLiteral", "setSupportLiteral", "getResourceMap", "()Ljava/util/Map;", "setResourceMap", "(Ljava/util/Map;)V", "getNormalThemeList", "setNormalThemeList", "getAodThemeList", "setAodThemeList", "getTextList", "setTextList", "getThemeIndex", "setThemeIndex", "currentTheme", "getCurrentTheme", "()Lcom/xiaomi/fitness/watch/face/edit/entity/Theme;", "shortString", "getShortString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DialWatchFace {

    @Nullable
    private List<Theme> aodThemeList;

    @Nullable
    private List<String> colorGroupTable;
    private boolean editable;
    private float height;

    @NotNull
    private String id;

    @NotNull
    private String name;

    @Nullable
    private List<Theme> normalThemeList;
    private int powerConsumptionLevel;

    @Nullable
    private List<String> recolorTable;

    @Nullable
    private Map<String, ? extends Object> resourceMap;
    private boolean skuStatus;
    private boolean supportLiteral;

    @Nullable
    private List<String> textList;
    private int themeIndex;
    private float width;

    public DialWatchFace() {
        this(null, null, 0.0f, 0.0f, false, false, null, null, 0, false, null, null, null, null, 0, 32767, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getSupportLiteral() {
        return this.supportLiteral;
    }

    @Nullable
    public final Map<String, Object> component11() {
        return this.resourceMap;
    }

    @Nullable
    public final List<Theme> component12() {
        return this.normalThemeList;
    }

    @Nullable
    public final List<Theme> component13() {
        return this.aodThemeList;
    }

    @Nullable
    public final List<String> component14() {
        return this.textList;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getThemeIndex() {
        return this.themeIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSkuStatus() {
        return this.skuStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }

    @Nullable
    public final List<String> component7() {
        return this.recolorTable;
    }

    @Nullable
    public final List<String> component8() {
        return this.colorGroupTable;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getPowerConsumptionLevel() {
        return this.powerConsumptionLevel;
    }

    @NotNull
    public final DialWatchFace copy(@NotNull String id, @NotNull String name, float width, float height, boolean skuStatus, boolean editable, @Nullable List<String> recolorTable, @Nullable List<String> colorGroupTable, int powerConsumptionLevel, boolean supportLiteral, @Nullable Map<String, ? extends Object> resourceMap, @Nullable List<Theme> normalThemeList, @Nullable List<Theme> aodThemeList, @Nullable List<String> textList, int themeIndex) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new DialWatchFace(id, name, width, height, skuStatus, editable, recolorTable, colorGroupTable, powerConsumptionLevel, supportLiteral, resourceMap, normalThemeList, aodThemeList, textList, themeIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialWatchFace)) {
            return false;
        }
        DialWatchFace dialWatchFace = (DialWatchFace) other;
        return Intrinsics.areEqual(this.id, dialWatchFace.id) && Intrinsics.areEqual(this.name, dialWatchFace.name) && Float.compare(this.width, dialWatchFace.width) == 0 && Float.compare(this.height, dialWatchFace.height) == 0 && this.skuStatus == dialWatchFace.skuStatus && this.editable == dialWatchFace.editable && Intrinsics.areEqual(this.recolorTable, dialWatchFace.recolorTable) && Intrinsics.areEqual(this.colorGroupTable, dialWatchFace.colorGroupTable) && this.powerConsumptionLevel == dialWatchFace.powerConsumptionLevel && this.supportLiteral == dialWatchFace.supportLiteral && Intrinsics.areEqual(this.resourceMap, dialWatchFace.resourceMap) && Intrinsics.areEqual(this.normalThemeList, dialWatchFace.normalThemeList) && Intrinsics.areEqual(this.aodThemeList, dialWatchFace.aodThemeList) && Intrinsics.areEqual(this.textList, dialWatchFace.textList) && this.themeIndex == dialWatchFace.themeIndex;
    }

    @Nullable
    public final List<Theme> getAodThemeList() {
        return this.aodThemeList;
    }

    @Nullable
    public final List<String> getColorGroupTable() {
        return this.colorGroupTable;
    }

    @Nullable
    public final Theme getCurrentTheme() {
        List<Theme> list = this.normalThemeList;
        if (list != null) {
            return list.get(this.themeIndex);
        }
        return null;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final float getHeight() {
        return this.height;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<Theme> getNormalThemeList() {
        return this.normalThemeList;
    }

    public final int getPowerConsumptionLevel() {
        return this.powerConsumptionLevel;
    }

    @Nullable
    public final List<String> getRecolorTable() {
        return this.recolorTable;
    }

    @Nullable
    public final Map<String, Object> getResourceMap() {
        return this.resourceMap;
    }

    @NotNull
    public final String getShortString() {
        return "DialWatchFace(id=" + this.id + ", name='" + this.name + "', width=" + this.width + ", height=" + this.height + ", skuStatus=" + this.skuStatus + ", editable=" + this.editable + ", recolorTable=" + this.recolorTable + ", colorGroupTable=" + this.colorGroupTable + ", themeIndex=" + this.themeIndex + ")";
    }

    public final boolean getSkuStatus() {
        return this.skuStatus;
    }

    public final boolean getSupportLiteral() {
        return this.supportLiteral;
    }

    @Nullable
    public final List<String> getTextList() {
        return this.textList;
    }

    public final int getThemeIndex() {
        return this.themeIndex;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Float.hashCode(this.width)) * 31) + Float.hashCode(this.height)) * 31) + Boolean.hashCode(this.skuStatus)) * 31) + Boolean.hashCode(this.editable)) * 31;
        List<String> list = this.recolorTable;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.colorGroupTable;
        int iHashCode3 = (((((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + Integer.hashCode(this.powerConsumptionLevel)) * 31) + Boolean.hashCode(this.supportLiteral)) * 31;
        Map<String, ? extends Object> map = this.resourceMap;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        List<Theme> list3 = this.normalThemeList;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Theme> list4 = this.aodThemeList;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.textList;
        return ((iHashCode6 + (list5 != null ? list5.hashCode() : 0)) * 31) + Integer.hashCode(this.themeIndex);
    }

    public final void setAodThemeList(@Nullable List<Theme> list) {
        this.aodThemeList = list;
    }

    public final void setColorGroupTable(@Nullable List<String> list) {
        this.colorGroupTable = list;
    }

    public final void setEditable(boolean z) {
        this.editable = z;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setNormalThemeList(@Nullable List<Theme> list) {
        this.normalThemeList = list;
    }

    public final void setPowerConsumptionLevel(int i) {
        this.powerConsumptionLevel = i;
    }

    public final void setRecolorTable(@Nullable List<String> list) {
        this.recolorTable = list;
    }

    public final void setResourceMap(@Nullable Map<String, ? extends Object> map) {
        this.resourceMap = map;
    }

    public final void setSkuStatus(boolean z) {
        this.skuStatus = z;
    }

    public final void setSupportLiteral(boolean z) {
        this.supportLiteral = z;
    }

    public final void setTextList(@Nullable List<String> list) {
        this.textList = list;
    }

    public final void setThemeIndex(int i) {
        this.themeIndex = i;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    @NotNull
    public String toString() {
        return "DialWatchFace(id=" + this.id + ", name=" + this.name + ", width=" + this.width + ", height=" + this.height + ", skuStatus=" + this.skuStatus + ", editable=" + this.editable + ", recolorTable=" + this.recolorTable + ", colorGroupTable=" + this.colorGroupTable + ", powerConsumptionLevel=" + this.powerConsumptionLevel + ", supportLiteral=" + this.supportLiteral + ", resourceMap=" + this.resourceMap + ", normalThemeList=" + this.normalThemeList + ", aodThemeList=" + this.aodThemeList + ", textList=" + this.textList + ", themeIndex=" + this.themeIndex + ")";
    }

    public DialWatchFace(@NotNull String id, @NotNull String name, float f, float f2, boolean z, boolean z2, @Nullable List<String> list, @Nullable List<String> list2, int i, boolean z3, @Nullable Map<String, ? extends Object> map, @Nullable List<Theme> list3, @Nullable List<Theme> list4, @Nullable List<String> list5, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.name = name;
        this.width = f;
        this.height = f2;
        this.skuStatus = z;
        this.editable = z2;
        this.recolorTable = list;
        this.colorGroupTable = list2;
        this.powerConsumptionLevel = i;
        this.supportLiteral = z3;
        this.resourceMap = map;
        this.normalThemeList = list3;
        this.aodThemeList = list4;
        this.textList = list5;
        this.themeIndex = i2;
    }

    public /* synthetic */ DialWatchFace(String str, String str2, float f, float f2, boolean z, boolean z2, List list, List list2, int i, boolean z3, Map map, List list3, List list4, List list5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) == 0 ? str2 : "", (i3 & 4) != 0 ? 0.0f : f, (i3 & 8) == 0 ? f2 : 0.0f, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? null : list, (i3 & 128) != 0 ? null : list2, (i3 & 256) != 0 ? 0 : i, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? null : map, (i3 & 2048) != 0 ? null : list3, (i3 & 4096) != 0 ? null : list4, (i3 & 8192) == 0 ? list5 : null, (i3 & 16384) != 0 ? 0 : i2);
    }
}
