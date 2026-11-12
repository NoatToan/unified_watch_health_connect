package com.huami.sleepassistant.apilib.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleepassistant.apilib.utils.WebConst;
import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B=\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b9\u0010:Bg\b\u0017\u0012\u0006\u0010;\u001a\u00020\u0010\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b9\u0010>J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\fHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\fHÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\fHÆ\u0001J\t\u0010\u001a\u001a\u00020\fHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R(\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010$\u0012\u0004\b)\u0010#\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010$\u0012\u0004\b,\u0010#\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R(\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010$\u0012\u0004\b/\u0010#\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R(\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u00100\u0012\u0004\b5\u0010#\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u0010\u0018\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010$\u0012\u0004\b8\u0010#\u001a\u0004\b6\u0010&\"\u0004\b7\u0010(¨\u0006A"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/CollectionMusic2;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "component6", "audioIds", "classification", "itemDescription", "itemName", WebConst.QueryParam.PLAY_TIME, "userId", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/util/List;", "getAudioIds", "()Ljava/util/List;", "getAudioIds$annotations", "()V", "Ljava/lang/String;", "getClassification", "()Ljava/lang/String;", "setClassification", "(Ljava/lang/String;)V", "getClassification$annotations", "getItemDescription", "setItemDescription", "getItemDescription$annotations", "getItemName", "setItemName", "getItemName$annotations", LogUtil.I, "getPlayTime", "()I", "setPlayTime", "(I)V", "getPlayTime$annotations", "getUserId", "setUserId", "getUserId$annotations", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "apilib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class CollectionMusic2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Long> audioIds;

    @NotNull
    private String classification;

    @NotNull
    private String itemDescription;

    @NotNull
    private String itemName;
    private int playTime;

    @NotNull
    private String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/CollectionMusic2$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/sleepassistant/apilib/bean/CollectionMusic2;", "serializer", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<CollectionMusic2> serializer() {
            return CollectionMusic2$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CollectionMusic2(int i, @SerialName("audioIds") List list, @SerialName("classification") String str, @SerialName("itemDescription") String str2, @SerialName("itemName") String str3, @SerialName(WebConst.QueryParam.PLAY_TIME) int i2, @SerialName("userId") String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, CollectionMusic2$$serializer.INSTANCE.getDescriptor());
        }
        this.audioIds = list;
        this.classification = str;
        this.itemDescription = str2;
        this.itemName = str3;
        this.playTime = i2;
        this.userId = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollectionMusic2 copy$default(CollectionMusic2 collectionMusic2, List list, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = collectionMusic2.audioIds;
        }
        if ((i2 & 2) != 0) {
            str = collectionMusic2.classification;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = collectionMusic2.itemDescription;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = collectionMusic2.itemName;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            i = collectionMusic2.playTime;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str4 = collectionMusic2.userId;
        }
        return collectionMusic2.copy(list, str5, str6, str7, i3, str4);
    }

    @SerialName("audioIds")
    public static /* synthetic */ void getAudioIds$annotations() {
    }

    @SerialName("classification")
    public static /* synthetic */ void getClassification$annotations() {
    }

    @SerialName("itemDescription")
    public static /* synthetic */ void getItemDescription$annotations() {
    }

    @SerialName("itemName")
    public static /* synthetic */ void getItemName$annotations() {
    }

    @SerialName(WebConst.QueryParam.PLAY_TIME)
    public static /* synthetic */ void getPlayTime$annotations() {
    }

    @SerialName("userId")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull CollectionMusic2 self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(LongSerializer.INSTANCE), self.audioIds);
        output.encodeStringElement(serialDesc, 1, self.classification);
        output.encodeStringElement(serialDesc, 2, self.itemDescription);
        output.encodeStringElement(serialDesc, 3, self.itemName);
        output.encodeIntElement(serialDesc, 4, self.playTime);
        output.encodeStringElement(serialDesc, 5, self.userId);
    }

    @NotNull
    public final List<Long> component1() {
        return this.audioIds;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClassification() {
        return this.classification;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getItemDescription() {
        return this.itemDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPlayTime() {
        return this.playTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final CollectionMusic2 copy(@NotNull List<Long> audioIds, @NotNull String classification, @NotNull String itemDescription, @NotNull String itemName, int playTime, @NotNull String userId) {
        return new CollectionMusic2(audioIds, classification, itemDescription, itemName, playTime, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionMusic2)) {
            return false;
        }
        CollectionMusic2 collectionMusic2 = (CollectionMusic2) other;
        return Intrinsics.areEqual(this.audioIds, collectionMusic2.audioIds) && Intrinsics.areEqual(this.classification, collectionMusic2.classification) && Intrinsics.areEqual(this.itemDescription, collectionMusic2.itemDescription) && Intrinsics.areEqual(this.itemName, collectionMusic2.itemName) && this.playTime == collectionMusic2.playTime && Intrinsics.areEqual(this.userId, collectionMusic2.userId);
    }

    @NotNull
    public final List<Long> getAudioIds() {
        return this.audioIds;
    }

    @NotNull
    public final String getClassification() {
        return this.classification;
    }

    @NotNull
    public final String getItemDescription() {
        return this.itemDescription;
    }

    @NotNull
    public final String getItemName() {
        return this.itemName;
    }

    public final int getPlayTime() {
        return this.playTime;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((this.audioIds.hashCode() * 31) + this.classification.hashCode()) * 31) + this.itemDescription.hashCode()) * 31) + this.itemName.hashCode()) * 31) + this.playTime) * 31) + this.userId.hashCode();
    }

    public final void setClassification(@NotNull String str) {
        this.classification = str;
    }

    public final void setItemDescription(@NotNull String str) {
        this.itemDescription = str;
    }

    public final void setItemName(@NotNull String str) {
        this.itemName = str;
    }

    public final void setPlayTime(int i) {
        this.playTime = i;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "CollectionMusic2(audioIds=" + this.audioIds + ", classification=" + this.classification + ", itemDescription=" + this.itemDescription + ", itemName=" + this.itemName + ", playTime=" + this.playTime + ", userId=" + this.userId + ')';
    }

    public CollectionMusic2(@NotNull List<Long> list, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        this.audioIds = list;
        this.classification = str;
        this.itemDescription = str2;
        this.itemName = str3;
        this.playTime = i;
        this.userId = str4;
    }
}
