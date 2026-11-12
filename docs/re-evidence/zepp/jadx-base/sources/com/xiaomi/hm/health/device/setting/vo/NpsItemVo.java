package com.xiaomi.hm.health.device.setting.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003JF\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\tR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001e¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/NpsItemVo;", "", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", "component1", "", "component2", "", "component3", "component4", "()Ljava/lang/Integer;", "component5", "type", "title", "flag", "icon", "url", "copy", "(Lcom/xiaomi/hm/health/device/setting/SoftFeature;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)Lcom/xiaomi/hm/health/device/setting/vo/NpsItemVo;", "toString", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", "getType", "()Lcom/xiaomi/hm/health/device/setting/SoftFeature;", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", LogUtil.I, "getFlag", "()I", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getIcon", "e", "getUrl", "<init>", "(Lcom/xiaomi/hm/health/device/setting/SoftFeature;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NpsItemVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final SoftFeature type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int flag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String url;

    public NpsItemVo(@NotNull SoftFeature softFeature, @NotNull String str, int i, @Nullable Integer num, @Nullable String str2) {
        this.type = softFeature;
        this.title = str;
        this.flag = i;
        this.icon = num;
        this.url = str2;
    }

    public static /* synthetic */ NpsItemVo copy$default(NpsItemVo npsItemVo, SoftFeature softFeature, String str, int i, Integer num, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            softFeature = npsItemVo.type;
        }
        if ((i2 & 2) != 0) {
            str = npsItemVo.title;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            i = npsItemVo.flag;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            num = npsItemVo.icon;
        }
        Integer num2 = num;
        if ((i2 & 16) != 0) {
            str2 = npsItemVo.url;
        }
        return npsItemVo.copy(softFeature, str3, i3, num2, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SoftFeature getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFlag() {
        return this.flag;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final NpsItemVo copy(@NotNull SoftFeature type, @NotNull String title, int flag, @Nullable Integer icon, @Nullable String url) {
        return new NpsItemVo(type, title, flag, icon, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NpsItemVo)) {
            return false;
        }
        NpsItemVo npsItemVo = (NpsItemVo) other;
        return this.type == npsItemVo.type && Intrinsics.areEqual(this.title, npsItemVo.title) && this.flag == npsItemVo.flag && Intrinsics.areEqual(this.icon, npsItemVo.icon) && Intrinsics.areEqual(this.url, npsItemVo.url);
    }

    public final int getFlag() {
        return this.flag;
    }

    @Nullable
    public final Integer getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final SoftFeature getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.flag) * 31;
        Integer num = this.icon;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.url;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NpsItemVo(type=" + this.type + ", title=" + this.title + ", flag=" + this.flag + ", icon=" + this.icon + ", url=" + this.url + ")";
    }

    public /* synthetic */ NpsItemVo(SoftFeature softFeature, String str, int i, Integer num, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(softFeature, str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : str2);
    }
}
