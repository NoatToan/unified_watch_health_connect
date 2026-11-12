package com.huami.bluetooth.profile.channel.module.display_list_setting;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.market.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B'\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J1\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayBean;", "Ljava/io/Serializable;", "", "toBleBytes", "", "component1", "", "component2", "component3", "", "component4", "pageIndex", Constants.JSON_FEATURE, "itemIndex", "appId", "copy", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getPageIndex", "()I", "b", "B", "getFeature", "()B", "c", "getItemIndex", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "<init>", "(IBILjava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DisplayBean implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int pageIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final byte feature;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int itemIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appId;

    public DisplayBean(int i, byte b, int i2, @NotNull String str) {
        this.pageIndex = i;
        this.feature = b;
        this.itemIndex = i2;
        this.appId = str;
    }

    public static /* synthetic */ DisplayBean copy$default(DisplayBean displayBean, int i, byte b, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = displayBean.pageIndex;
        }
        if ((i3 & 2) != 0) {
            b = displayBean.feature;
        }
        if ((i3 & 4) != 0) {
            i2 = displayBean.itemIndex;
        }
        if ((i3 & 8) != 0) {
            str = displayBean.appId;
        }
        return displayBean.copy(i, b, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getFeature() {
        return this.feature;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getItemIndex() {
        return this.itemIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final DisplayBean copy(int pageIndex, byte feature, int itemIndex, @NotNull String appId) {
        return new DisplayBean(pageIndex, feature, itemIndex, appId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayBean)) {
            return false;
        }
        DisplayBean displayBean = (DisplayBean) other;
        return this.pageIndex == displayBean.pageIndex && this.feature == displayBean.feature && this.itemIndex == displayBean.itemIndex && Intrinsics.areEqual(this.appId, displayBean.appId);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    public final byte getFeature() {
        return this.feature;
    }

    public final int getItemIndex() {
        return this.itemIndex;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public int hashCode() {
        return (((((this.pageIndex * 31) + this.feature) * 31) + this.itemIndex) * 31) + this.appId.hashCode();
    }

    @NotNull
    public final byte[] toBleBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = this.appId;
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(this.pageIndex);
        byteArrayOutputStream.write(this.itemIndex);
        byteArrayOutputStream.write(this.feature);
        return byteArrayOutputStream.toByteArray();
    }

    @NotNull
    public String toString() {
        return "DisplayBean(pageIndex=" + this.pageIndex + ", feature=" + ((int) this.feature) + ", itemIndex=" + this.itemIndex + ", appId=" + this.appId + ')';
    }
}
