package com.huami.sleepassistant.apilib.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002YXB\u008f\u0001\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b¢\u0006\u0004\bR\u0010SB§\u0001\b\u0017\u0012\u0006\u0010T\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\"\u001a\u00020\u000b\u0012\b\u0010V\u001a\u0004\u0018\u00010U¢\u0006\u0004\bR\u0010WJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0016\u001a\u00020\u000bHÆ\u0003J\u0093\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\"\u001a\u00020\u000bHÆ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R*\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010)\u0012\u0004\b5\u0010-\u001a\u0004\b2\u0010+\"\u0004\b3\u00104R*\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010)\u0012\u0004\b8\u0010-\u001a\u0004\b6\u0010+\"\u0004\b7\u00104R*\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010)\u0012\u0004\b;\u0010-\u001a\u0004\b9\u0010+\"\u0004\b:\u00104R*\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010)\u0012\u0004\b>\u0010-\u001a\u0004\b<\u0010+\"\u0004\b=\u00104R*\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010)\u0012\u0004\bA\u0010-\u001a\u0004\b?\u0010+\"\u0004\b@\u00104R*\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010)\u0012\u0004\bD\u0010-\u001a\u0004\bB\u0010+\"\u0004\bC\u00104R*\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010)\u0012\u0004\bG\u0010-\u001a\u0004\bE\u0010+\"\u0004\bF\u00104R*\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010)\u0012\u0004\bJ\u0010-\u001a\u0004\bH\u0010+\"\u0004\bI\u00104R*\u0010!\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b!\u0010)\u0012\u0004\bM\u0010-\u001a\u0004\bK\u0010+\"\u0004\bL\u00104R(\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\"\u0010.\u0012\u0004\bQ\u0010-\u001a\u0004\bN\u00100\"\u0004\bO\u0010P¨\u0006Z"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/MusicBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "id", "whetherPay", "scIntroduction", "supportDevices", "deliveryApps", "deliveryTime", "languages", "simpleChinese", "bigImgUrl", "smallImgUrl", "audioUrl", "sort", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", LogUtil.I, "getWhetherPay", "()I", "getWhetherPay$annotations", "getScIntroduction", "setScIntroduction", "(Ljava/lang/String;)V", "getScIntroduction$annotations", "getSupportDevices", "setSupportDevices", "getSupportDevices$annotations", "getDeliveryApps", "setDeliveryApps", "getDeliveryApps$annotations", "getDeliveryTime", "setDeliveryTime", "getDeliveryTime$annotations", "getLanguages", "setLanguages", "getLanguages$annotations", "getSimpleChinese", "setSimpleChinese", "getSimpleChinese$annotations", "getBigImgUrl", "setBigImgUrl", "getBigImgUrl$annotations", "getSmallImgUrl", "setSmallImgUrl", "getSmallImgUrl$annotations", "getAudioUrl", "setAudioUrl", "getAudioUrl$annotations", "getSort", "setSort", "(I)V", "getSort$annotations", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "apilib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class MusicBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String audioUrl;

    @Nullable
    private String bigImgUrl;

    @Nullable
    private String deliveryApps;

    @Nullable
    private String deliveryTime;

    @NotNull
    private final String id;

    @Nullable
    private String languages;

    @Nullable
    private String scIntroduction;

    @Nullable
    private String simpleChinese;

    @Nullable
    private String smallImgUrl;
    private int sort;

    @Nullable
    private String supportDevices;
    private final int whetherPay;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/MusicBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/sleepassistant/apilib/bean/MusicBean;", "serializer", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<MusicBean> serializer() {
            return MusicBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MusicBean(int i, @SerialName("id") String str, @SerialName("whetherPay") int i2, @SerialName("scIntroduction") String str2, @SerialName("supportDevices") String str3, @SerialName("deliveryApps") String str4, @SerialName("deliveryTime") String str5, @SerialName("languages") String str6, @SerialName("simpleChinese") String str7, @SerialName("bigImgUrl") String str8, @SerialName("smallImgUrl") String str9, @SerialName("audioUrl") String str10, @SerialName("sort") int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, MusicBean$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.whetherPay = 0;
        } else {
            this.whetherPay = i2;
        }
        if ((i & 4) == 0) {
            this.scIntroduction = null;
        } else {
            this.scIntroduction = str2;
        }
        if ((i & 8) == 0) {
            this.supportDevices = null;
        } else {
            this.supportDevices = str3;
        }
        if ((i & 16) == 0) {
            this.deliveryApps = null;
        } else {
            this.deliveryApps = str4;
        }
        if ((i & 32) == 0) {
            this.deliveryTime = null;
        } else {
            this.deliveryTime = str5;
        }
        if ((i & 64) == 0) {
            this.languages = null;
        } else {
            this.languages = str6;
        }
        if ((i & 128) == 0) {
            this.simpleChinese = null;
        } else {
            this.simpleChinese = str7;
        }
        if ((i & 256) == 0) {
            this.bigImgUrl = null;
        } else {
            this.bigImgUrl = str8;
        }
        if ((i & 512) == 0) {
            this.smallImgUrl = null;
        } else {
            this.smallImgUrl = str9;
        }
        if ((i & 1024) == 0) {
            this.audioUrl = null;
        } else {
            this.audioUrl = str10;
        }
        if ((i & 2048) == 0) {
            this.sort = 0;
        } else {
            this.sort = i3;
        }
    }

    @SerialName("audioUrl")
    public static /* synthetic */ void getAudioUrl$annotations() {
    }

    @SerialName("bigImgUrl")
    public static /* synthetic */ void getBigImgUrl$annotations() {
    }

    @SerialName("deliveryApps")
    public static /* synthetic */ void getDeliveryApps$annotations() {
    }

    @SerialName("deliveryTime")
    public static /* synthetic */ void getDeliveryTime$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("languages")
    public static /* synthetic */ void getLanguages$annotations() {
    }

    @SerialName("scIntroduction")
    public static /* synthetic */ void getScIntroduction$annotations() {
    }

    @SerialName("simpleChinese")
    public static /* synthetic */ void getSimpleChinese$annotations() {
    }

    @SerialName("smallImgUrl")
    public static /* synthetic */ void getSmallImgUrl$annotations() {
    }

    @SerialName("sort")
    public static /* synthetic */ void getSort$annotations() {
    }

    @SerialName("supportDevices")
    public static /* synthetic */ void getSupportDevices$annotations() {
    }

    @SerialName("whetherPay")
    public static /* synthetic */ void getWhetherPay$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull MusicBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.whetherPay != 0) {
            output.encodeIntElement(serialDesc, 1, self.whetherPay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.scIntroduction != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.scIntroduction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.supportDevices != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.supportDevices);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.deliveryApps != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.deliveryApps);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.deliveryTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.deliveryTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.languages != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.languages);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.simpleChinese != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.simpleChinese);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.bigImgUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.bigImgUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.smallImgUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.smallImgUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.audioUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.audioUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.sort != 0) {
            output.encodeIntElement(serialDesc, 11, self.sort);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSmallImgUrl() {
        return this.smallImgUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWhetherPay() {
        return this.whetherPay;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScIntroduction() {
        return this.scIntroduction;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSupportDevices() {
        return this.supportDevices;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeliveryApps() {
        return this.deliveryApps;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeliveryTime() {
        return this.deliveryTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLanguages() {
        return this.languages;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSimpleChinese() {
        return this.simpleChinese;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBigImgUrl() {
        return this.bigImgUrl;
    }

    @NotNull
    public final MusicBean copy(@NotNull String id, int whetherPay, @Nullable String scIntroduction, @Nullable String supportDevices, @Nullable String deliveryApps, @Nullable String deliveryTime, @Nullable String languages, @Nullable String simpleChinese, @Nullable String bigImgUrl, @Nullable String smallImgUrl, @Nullable String audioUrl, int sort) {
        return new MusicBean(id, whetherPay, scIntroduction, supportDevices, deliveryApps, deliveryTime, languages, simpleChinese, bigImgUrl, smallImgUrl, audioUrl, sort);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicBean)) {
            return false;
        }
        MusicBean musicBean = (MusicBean) other;
        return Intrinsics.areEqual(this.id, musicBean.id) && this.whetherPay == musicBean.whetherPay && Intrinsics.areEqual(this.scIntroduction, musicBean.scIntroduction) && Intrinsics.areEqual(this.supportDevices, musicBean.supportDevices) && Intrinsics.areEqual(this.deliveryApps, musicBean.deliveryApps) && Intrinsics.areEqual(this.deliveryTime, musicBean.deliveryTime) && Intrinsics.areEqual(this.languages, musicBean.languages) && Intrinsics.areEqual(this.simpleChinese, musicBean.simpleChinese) && Intrinsics.areEqual(this.bigImgUrl, musicBean.bigImgUrl) && Intrinsics.areEqual(this.smallImgUrl, musicBean.smallImgUrl) && Intrinsics.areEqual(this.audioUrl, musicBean.audioUrl) && this.sort == musicBean.sort;
    }

    @Nullable
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @Nullable
    public final String getBigImgUrl() {
        return this.bigImgUrl;
    }

    @Nullable
    public final String getDeliveryApps() {
        return this.deliveryApps;
    }

    @Nullable
    public final String getDeliveryTime() {
        return this.deliveryTime;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLanguages() {
        return this.languages;
    }

    @Nullable
    public final String getScIntroduction() {
        return this.scIntroduction;
    }

    @Nullable
    public final String getSimpleChinese() {
        return this.simpleChinese;
    }

    @Nullable
    public final String getSmallImgUrl() {
        return this.smallImgUrl;
    }

    public final int getSort() {
        return this.sort;
    }

    @Nullable
    public final String getSupportDevices() {
        return this.supportDevices;
    }

    public final int getWhetherPay() {
        return this.whetherPay;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.whetherPay) * 31;
        String str = this.scIntroduction;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.supportDevices;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deliveryApps;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deliveryTime;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.languages;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.simpleChinese;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bigImgUrl;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.smallImgUrl;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.audioUrl;
        return ((iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.sort;
    }

    public final void setAudioUrl(@Nullable String str) {
        this.audioUrl = str;
    }

    public final void setBigImgUrl(@Nullable String str) {
        this.bigImgUrl = str;
    }

    public final void setDeliveryApps(@Nullable String str) {
        this.deliveryApps = str;
    }

    public final void setDeliveryTime(@Nullable String str) {
        this.deliveryTime = str;
    }

    public final void setLanguages(@Nullable String str) {
        this.languages = str;
    }

    public final void setScIntroduction(@Nullable String str) {
        this.scIntroduction = str;
    }

    public final void setSimpleChinese(@Nullable String str) {
        this.simpleChinese = str;
    }

    public final void setSmallImgUrl(@Nullable String str) {
        this.smallImgUrl = str;
    }

    public final void setSort(int i) {
        this.sort = i;
    }

    public final void setSupportDevices(@Nullable String str) {
        this.supportDevices = str;
    }

    @NotNull
    public String toString() {
        return "MusicBean(id=" + this.id + ", whetherPay=" + this.whetherPay + ", scIntroduction=" + ((Object) this.scIntroduction) + ", supportDevices=" + ((Object) this.supportDevices) + ", deliveryApps=" + ((Object) this.deliveryApps) + ", deliveryTime=" + ((Object) this.deliveryTime) + ", languages=" + ((Object) this.languages) + ", simpleChinese=" + ((Object) this.simpleChinese) + ", bigImgUrl=" + ((Object) this.bigImgUrl) + ", smallImgUrl=" + ((Object) this.smallImgUrl) + ", audioUrl=" + ((Object) this.audioUrl) + ", sort=" + this.sort + ')';
    }

    public MusicBean(@NotNull String str, int i, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, int i2) {
        this.id = str;
        this.whetherPay = i;
        this.scIntroduction = str2;
        this.supportDevices = str3;
        this.deliveryApps = str4;
        this.deliveryTime = str5;
        this.languages = str6;
        this.simpleChinese = str7;
        this.bigImgUrl = str8;
        this.smallImgUrl = str9;
        this.audioUrl = str10;
        this.sort = i2;
    }

    public /* synthetic */ MusicBean(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? null : str6, (i3 & 128) != 0 ? null : str7, (i3 & 256) != 0 ? null : str8, (i3 & 512) != 0 ? null : str9, (i3 & 1024) == 0 ? str10 : null, (i3 & 2048) == 0 ? i2 : 0);
    }
}
