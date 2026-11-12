package com.huami.core.device.wifi_settings.bean;

import com.alipay.sdk.m.x.d;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 '2\u00020\u0001:\u0001'B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b$\u0010%B\u001b\b\u0016\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b$\u0010&J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "", "other", "", "equals", "", "hashCode", "a", "Ljava/lang/Integer;", "getItemType", "()Ljava/lang/Integer;", "setItemType", "(Ljava/lang/Integer;)V", "itemType", "", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", d.o, "(Ljava/lang/String;)V", "title", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "c", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "getWifiBean", "()Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "setWifiBean", "(Lcom/huami/core/device/wifi_settings/bean/WifiBean;)V", "wifiBean", GoogleApiAvailabilityLight.a, "Z", "isNearBy", "()Z", "setNearBy", "(Z)V", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "(ILcom/huami/core/device/wifi_settings/bean/WifiBean;)V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiMultiBean {
    public static final int TYPE_CONFIG = 2;
    public static final int TYPE_ITEM = 0;
    public static final int TYPE_TITLE = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Integer itemType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private WifiBean wifiBean;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isNearBy;

    /* JADX WARN: Multi-variable type inference failed */
    public WifiMultiBean() {
        this((Integer) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public WifiMultiBean(@Nullable Integer num, @Nullable String str) {
        this.itemType = num;
        this.title = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(WifiMultiBean.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.core.device.wifi_settings.bean.WifiMultiBean");
        return Intrinsics.areEqual(this.wifiBean, ((WifiMultiBean) other).wifiBean);
    }

    @Nullable
    public final Integer getItemType() {
        return this.itemType;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final WifiBean getWifiBean() {
        return this.wifiBean;
    }

    public int hashCode() {
        WifiBean wifiBean = this.wifiBean;
        if (wifiBean == null) {
            return 0;
        }
        return wifiBean.hashCode();
    }

    /* JADX INFO: renamed from: isNearBy, reason: from getter */
    public final boolean getIsNearBy() {
        return this.isNearBy;
    }

    public final void setItemType(@Nullable Integer num) {
        this.itemType = num;
    }

    public final void setNearBy(boolean z) {
        this.isNearBy = z;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setWifiBean(@Nullable WifiBean wifiBean) {
        this.wifiBean = wifiBean;
    }

    public /* synthetic */ WifiMultiBean(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WifiMultiBean(int i, @NotNull WifiBean wifiBean) {
        this(Integer.valueOf(i), (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.wifiBean = wifiBean;
    }

    public /* synthetic */ WifiMultiBean(int i, WifiBean wifiBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, wifiBean);
    }
}
