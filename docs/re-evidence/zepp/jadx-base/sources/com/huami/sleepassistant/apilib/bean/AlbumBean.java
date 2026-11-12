package com.huami.sleepassistant.apilib.bean;

import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@Bw\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\t\u0012\b\b\u0002\u0010#\u001a\u00020\t¢\u0006\u0004\b:\u0010;B\u009d\u0001\b\u0017\u0012\u0006\u0010<\u001a\u00020&\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\t\u0012\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b:\u0010?J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J\u008b\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\tHÆ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020&HÖ\u0001J\u0013\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0017\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0018\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\u0019\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u001a\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010+\u001a\u0004\b0\u0010-R\u0019\u0010\u001b\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b1\u0010-R\u0019\u0010\u001c\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b2\u0010-R\u0019\u0010\u001d\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b3\u0010-R\u0019\u0010\u001e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b4\u0010-R\u0019\u0010\u001f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b5\u0010-R\u0019\u0010 \u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b6\u0010-R\u0019\u0010!\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b7\u0010-R\u0019\u0010\"\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b8\u0010-R\u0019\u0010#\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b9\u0010-¨\u0006B"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/AlbumBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", DTransferConstants.ALBUMID, "appVersion", "audioObjName", "audioUrl", "bigImgObjName", "bigImgUrl", "deliveryApps", "deliveryTime", "expiredTime", "goodsId", "name", "smallImgObjName", "smallImgUrl", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getAlbumId", "()Ljava/lang/String;", "getAppVersion", "getAudioObjName", "getAudioUrl", "getBigImgObjName", "getBigImgUrl", "getDeliveryApps", "getDeliveryTime", "getExpiredTime", "getGoodsId", "getName", "getSmallImgObjName", "getSmallImgUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "apilib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class AlbumBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String albumId;

    @NotNull
    private final String appVersion;

    @NotNull
    private final String audioObjName;

    @NotNull
    private final String audioUrl;

    @NotNull
    private final String bigImgObjName;

    @NotNull
    private final String bigImgUrl;

    @NotNull
    private final String deliveryApps;

    @NotNull
    private final String deliveryTime;

    @NotNull
    private final String expiredTime;

    @NotNull
    private final String goodsId;

    @NotNull
    private final String name;

    @NotNull
    private final String smallImgObjName;

    @NotNull
    private final String smallImgUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/AlbumBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/sleepassistant/apilib/bean/AlbumBean;", "serializer", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<AlbumBean> serializer() {
            return AlbumBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AlbumBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if (3550 != (i & 3550)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3550, AlbumBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.albumId = "";
        } else {
            this.albumId = str;
        }
        this.appVersion = str2;
        this.audioObjName = str3;
        this.audioUrl = str4;
        this.bigImgObjName = str5;
        if ((i & 32) == 0) {
            this.bigImgUrl = "";
        } else {
            this.bigImgUrl = str6;
        }
        this.deliveryApps = str7;
        this.deliveryTime = str8;
        this.expiredTime = str9;
        if ((i & 512) == 0) {
            this.goodsId = "";
        } else {
            this.goodsId = str10;
        }
        this.name = str11;
        this.smallImgObjName = str12;
        if ((i & 4096) == 0) {
            this.smallImgUrl = "";
        } else {
            this.smallImgUrl = str13;
        }
    }

    @JvmStatic
    public static final void write$Self(@NotNull AlbumBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.albumId, "")) {
            output.encodeStringElement(serialDesc, 0, self.albumId);
        }
        output.encodeStringElement(serialDesc, 1, self.appVersion);
        output.encodeStringElement(serialDesc, 2, self.audioObjName);
        output.encodeStringElement(serialDesc, 3, self.audioUrl);
        output.encodeStringElement(serialDesc, 4, self.bigImgObjName);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.bigImgUrl, "")) {
            output.encodeStringElement(serialDesc, 5, self.bigImgUrl);
        }
        output.encodeStringElement(serialDesc, 6, self.deliveryApps);
        output.encodeStringElement(serialDesc, 7, self.deliveryTime);
        output.encodeStringElement(serialDesc, 8, self.expiredTime);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !Intrinsics.areEqual(self.goodsId, "")) {
            output.encodeStringElement(serialDesc, 9, self.goodsId);
        }
        output.encodeStringElement(serialDesc, 10, self.name);
        output.encodeStringElement(serialDesc, 11, self.smallImgObjName);
        if (output.shouldEncodeElementDefault(serialDesc, 12) || !Intrinsics.areEqual(self.smallImgUrl, "")) {
            output.encodeStringElement(serialDesc, 12, self.smallImgUrl);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlbumId() {
        return this.albumId;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getGoodsId() {
        return this.goodsId;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSmallImgObjName() {
        return this.smallImgObjName;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSmallImgUrl() {
        return this.smallImgUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAudioObjName() {
        return this.audioObjName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBigImgObjName() {
        return this.bigImgObjName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBigImgUrl() {
        return this.bigImgUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeliveryApps() {
        return this.deliveryApps;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeliveryTime() {
        return this.deliveryTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getExpiredTime() {
        return this.expiredTime;
    }

    @NotNull
    public final AlbumBean copy(@NotNull String albumId, @NotNull String appVersion, @NotNull String audioObjName, @NotNull String audioUrl, @NotNull String bigImgObjName, @NotNull String bigImgUrl, @NotNull String deliveryApps, @NotNull String deliveryTime, @NotNull String expiredTime, @NotNull String goodsId, @NotNull String name, @NotNull String smallImgObjName, @NotNull String smallImgUrl) {
        return new AlbumBean(albumId, appVersion, audioObjName, audioUrl, bigImgObjName, bigImgUrl, deliveryApps, deliveryTime, expiredTime, goodsId, name, smallImgObjName, smallImgUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlbumBean)) {
            return false;
        }
        AlbumBean albumBean = (AlbumBean) other;
        return Intrinsics.areEqual(this.albumId, albumBean.albumId) && Intrinsics.areEqual(this.appVersion, albumBean.appVersion) && Intrinsics.areEqual(this.audioObjName, albumBean.audioObjName) && Intrinsics.areEqual(this.audioUrl, albumBean.audioUrl) && Intrinsics.areEqual(this.bigImgObjName, albumBean.bigImgObjName) && Intrinsics.areEqual(this.bigImgUrl, albumBean.bigImgUrl) && Intrinsics.areEqual(this.deliveryApps, albumBean.deliveryApps) && Intrinsics.areEqual(this.deliveryTime, albumBean.deliveryTime) && Intrinsics.areEqual(this.expiredTime, albumBean.expiredTime) && Intrinsics.areEqual(this.goodsId, albumBean.goodsId) && Intrinsics.areEqual(this.name, albumBean.name) && Intrinsics.areEqual(this.smallImgObjName, albumBean.smallImgObjName) && Intrinsics.areEqual(this.smallImgUrl, albumBean.smallImgUrl);
    }

    @NotNull
    public final String getAlbumId() {
        return this.albumId;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getAudioObjName() {
        return this.audioObjName;
    }

    @NotNull
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @NotNull
    public final String getBigImgObjName() {
        return this.bigImgObjName;
    }

    @NotNull
    public final String getBigImgUrl() {
        return this.bigImgUrl;
    }

    @NotNull
    public final String getDeliveryApps() {
        return this.deliveryApps;
    }

    @NotNull
    public final String getDeliveryTime() {
        return this.deliveryTime;
    }

    @NotNull
    public final String getExpiredTime() {
        return this.expiredTime;
    }

    @NotNull
    public final String getGoodsId() {
        return this.goodsId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSmallImgObjName() {
        return this.smallImgObjName;
    }

    @NotNull
    public final String getSmallImgUrl() {
        return this.smallImgUrl;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.albumId.hashCode() * 31) + this.appVersion.hashCode()) * 31) + this.audioObjName.hashCode()) * 31) + this.audioUrl.hashCode()) * 31) + this.bigImgObjName.hashCode()) * 31) + this.bigImgUrl.hashCode()) * 31) + this.deliveryApps.hashCode()) * 31) + this.deliveryTime.hashCode()) * 31) + this.expiredTime.hashCode()) * 31) + this.goodsId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.smallImgObjName.hashCode()) * 31) + this.smallImgUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "AlbumBean(albumId=" + this.albumId + ", appVersion=" + this.appVersion + ", audioObjName=" + this.audioObjName + ", audioUrl=" + this.audioUrl + ", bigImgObjName=" + this.bigImgObjName + ", bigImgUrl=" + this.bigImgUrl + ", deliveryApps=" + this.deliveryApps + ", deliveryTime=" + this.deliveryTime + ", expiredTime=" + this.expiredTime + ", goodsId=" + this.goodsId + ", name=" + this.name + ", smallImgObjName=" + this.smallImgObjName + ", smallImgUrl=" + this.smallImgUrl + ')';
    }

    public AlbumBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        this.albumId = str;
        this.appVersion = str2;
        this.audioObjName = str3;
        this.audioUrl = str4;
        this.bigImgObjName = str5;
        this.bigImgUrl = str6;
        this.deliveryApps = str7;
        this.deliveryTime = str8;
        this.expiredTime = str9;
        this.goodsId = str10;
        this.name = str11;
        this.smallImgObjName = str12;
        this.smallImgUrl = str13;
    }

    public /* synthetic */ AlbumBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6, str7, str8, str9, (i & 512) != 0 ? "" : str10, str11, str12, (i & 4096) != 0 ? "" : str13);
    }
}
