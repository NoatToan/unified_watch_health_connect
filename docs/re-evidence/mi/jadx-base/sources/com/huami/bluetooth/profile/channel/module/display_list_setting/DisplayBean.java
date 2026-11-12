package com.huami.bluetooth.profile.channel.module.display_list_setting;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.onetrack.c.q;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001)B?\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003JI\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b%\u0010#¨\u0006*"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayBean;", "Ljava/io/Serializable;", "", "toBleBytes", "", "component1", "", "component2", "component3", "", "component4", "component5", "component6", "pageIndex", b.n, "itemIndex", q.f13858b, "version", "cardId", "copy", "toString", "hashCode", "", "other", "", "equals", "I", "getPageIndex", "()I", c.f13755a, "getFeature", "()B", "getItemIndex", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "getVersion", "getCardId", "<init>", "(IBILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class DisplayBean implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final String appId;

    @Nullable
    private final String cardId;
    private final byte feature;
    private final int itemIndex;
    private final int pageIndex;

    @Nullable
    private final String version;

    public DisplayBean(int i, byte b2, int i2, @NotNull String appId, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.pageIndex = i;
        this.feature = b2;
        this.itemIndex = i2;
        this.appId = appId;
        this.version = str;
        this.cardId = str2;
    }

    public static /* synthetic */ DisplayBean copy$default(DisplayBean displayBean, int i, byte b2, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = displayBean.pageIndex;
        }
        if ((i3 & 2) != 0) {
            b2 = displayBean.feature;
        }
        byte b3 = b2;
        if ((i3 & 4) != 0) {
            i2 = displayBean.itemIndex;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str = displayBean.appId;
        }
        String str4 = str;
        if ((i3 & 16) != 0) {
            str2 = displayBean.version;
        }
        String str5 = str2;
        if ((i3 & 32) != 0) {
            str3 = displayBean.cardId;
        }
        return displayBean.copy(i, b3, i4, str4, str5, str3);
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

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    public final DisplayBean copy(int pageIndex, byte feature, int itemIndex, @NotNull String appId, @Nullable String version, @Nullable String cardId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        return new DisplayBean(pageIndex, feature, itemIndex, appId, version, cardId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayBean)) {
            return false;
        }
        DisplayBean displayBean = (DisplayBean) other;
        return this.pageIndex == displayBean.pageIndex && this.feature == displayBean.feature && this.itemIndex == displayBean.itemIndex && Intrinsics.areEqual(this.appId, displayBean.appId) && Intrinsics.areEqual(this.version, displayBean.version) && Intrinsics.areEqual(this.cardId, displayBean.cardId);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getCardId() {
        return this.cardId;
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

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.pageIndex) * 31) + Byte.hashCode(this.feature)) * 31) + Integer.hashCode(this.itemIndex)) * 31) + this.appId.hashCode()) * 31;
        String str = this.version;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final byte[] toBleBytes() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = this.appId;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(this.pageIndex);
        byteArrayOutputStream.write(this.itemIndex);
        byteArrayOutputStream.write(this.feature);
        String str2 = this.version;
        if (str2 != null && str2.length() != 0) {
            byte[] bytes2 = this.version.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes2);
            byteArrayOutputStream.write(0);
        }
        String str3 = this.cardId;
        if (str3 != null && str3.length() != 0) {
            byte[] bytes3 = this.cardId.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes3);
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }

    @NotNull
    public String toString() {
        return "DisplayBean(pageIndex=" + this.pageIndex + ", feature=" + ((int) this.feature) + ", itemIndex=" + this.itemIndex + ", appId=" + this.appId + ", version=" + this.version + ", cardId=" + this.cardId + ')';
    }

    public /* synthetic */ DisplayBean(int i, byte b2, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, b2, i2, str, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3);
    }
}
