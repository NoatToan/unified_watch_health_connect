package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B5\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b6\u00107J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003JG\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u0014HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\"\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0019\u0010\u0017\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0018\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyVo;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsSetting;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "", "descArray", "()[Ljava/lang/String;", "getSelectItem", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsSetting;", "gpsSetting", "", "switchSelection", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsSetting;)V", "", "component1", "component2", "component3", "", "component4", "", "component5", "selectIndex", "name", "tips", "list", "enable", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getSelectIndex", "()I", "setSelectIndex", "(I)V", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "getTips", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getList", "()Ljava/util/List;", "e", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GpsDiyVo<T extends GpsSetting> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int selectIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String tips;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<T> list;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private boolean enable;

    /* JADX WARN: Multi-variable type inference failed */
    public GpsDiyVo(int i, @NotNull String str, @NotNull String str2, @NotNull List<? extends T> list, boolean z) {
        this.selectIndex = i;
        this.name = str;
        this.tips = str2;
        this.list = list;
        this.enable = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GpsDiyVo copy$default(GpsDiyVo gpsDiyVo, int i, String str, String str2, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gpsDiyVo.selectIndex;
        }
        if ((i2 & 2) != 0) {
            str = gpsDiyVo.name;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = gpsDiyVo.tips;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            list = gpsDiyVo.list;
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            z = gpsDiyVo.enable;
        }
        return gpsDiyVo.copy(i, str3, str4, list2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSelectIndex() {
        return this.selectIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @NotNull
    public final List<T> component4() {
        return this.list;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final GpsDiyVo<T> copy(int selectIndex, @NotNull String name, @NotNull String tips, @NotNull List<? extends T> list, boolean enable) {
        return new GpsDiyVo<>(selectIndex, name, tips, list, enable);
    }

    @NotNull
    public final String[] descArray() {
        List<T> list = this.list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((GpsSetting) it2.next()).shortDesc());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsDiyVo)) {
            return false;
        }
        GpsDiyVo gpsDiyVo = (GpsDiyVo) other;
        return this.selectIndex == gpsDiyVo.selectIndex && Intrinsics.areEqual(this.name, gpsDiyVo.name) && Intrinsics.areEqual(this.tips, gpsDiyVo.tips) && Intrinsics.areEqual(this.list, gpsDiyVo.list) && this.enable == gpsDiyVo.enable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final List<T> getList() {
        return this.list;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getSelectIndex() {
        return this.selectIndex;
    }

    @NotNull
    public final T getSelectItem() {
        return this.list.get(this.selectIndex);
    }

    @NotNull
    public final String getTips() {
        return this.tips;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((((this.selectIndex * 31) + this.name.hashCode()) * 31) + this.tips.hashCode()) * 31) + this.list.hashCode()) * 31;
        boolean z = this.enable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setSelectIndex(int i) {
        this.selectIndex = i;
    }

    public final void switchSelection(@NotNull T gpsSetting) {
        if (this.list.contains(gpsSetting)) {
            this.selectIndex = this.list.indexOf(gpsSetting);
        }
    }

    @NotNull
    public String toString() {
        return "GpsDiyVo(selectIndex=" + this.selectIndex + ", name=" + this.name + ", tips=" + this.tips + ", list=" + this.list + ", enable=" + this.enable + ")";
    }
}
