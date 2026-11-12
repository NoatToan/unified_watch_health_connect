package com.huami.sleepassistant.apilib.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleepassistant.apilib.utils.WebConst;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B1\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b,\u0010-BI\b\u0017\u0012\u0006\u0010.\u001a\u00020\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0011\u001a\u00020\f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b,\u00101J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0019\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u0019\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR(\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010#\u0012\u0004\b(\u0010\u001f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0019\u0012\u0004\b+\u0010\u001f\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001d¨\u00064"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/UpdateCollection;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "", "component3", "component4", WebConst.QueryParam.SLEEP_SET_ID, "name", WebConst.QueryParam.PLAY_TIME, "itemImgUrl", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSleepSetId", "()Ljava/lang/String;", "setSleepSetId", "(Ljava/lang/String;)V", "getSleepSetId$annotations", "()V", "getName", "setName", "getName$annotations", LogUtil.I, "getPlayTime", "()I", "setPlayTime", "(I)V", "getPlayTime$annotations", "getItemImgUrl", "setItemImgUrl", "getItemImgUrl$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "apilib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class UpdateCollection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String itemImgUrl;

    @Nullable
    private String name;
    private int playTime;

    @NotNull
    private String sleepSetId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/UpdateCollection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/sleepassistant/apilib/bean/UpdateCollection;", "serializer", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<UpdateCollection> serializer() {
            return UpdateCollection$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ UpdateCollection(int i, @SerialName(WebConst.QueryParam.SLEEP_SET_ID) String str, @SerialName("name") String str2, @SerialName(WebConst.QueryParam.PLAY_TIME) int i2, @SerialName("itemImgUrl") String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, UpdateCollection$$serializer.INSTANCE.getDescriptor());
        }
        this.sleepSetId = str;
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.playTime = -1;
        } else {
            this.playTime = i2;
        }
        if ((i & 8) == 0) {
            this.itemImgUrl = null;
        } else {
            this.itemImgUrl = str3;
        }
    }

    public static /* synthetic */ UpdateCollection copy$default(UpdateCollection updateCollection, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = updateCollection.sleepSetId;
        }
        if ((i2 & 2) != 0) {
            str2 = updateCollection.name;
        }
        if ((i2 & 4) != 0) {
            i = updateCollection.playTime;
        }
        if ((i2 & 8) != 0) {
            str3 = updateCollection.itemImgUrl;
        }
        return updateCollection.copy(str, str2, i, str3);
    }

    @SerialName("itemImgUrl")
    public static /* synthetic */ void getItemImgUrl$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName(WebConst.QueryParam.PLAY_TIME)
    public static /* synthetic */ void getPlayTime$annotations() {
    }

    @SerialName(WebConst.QueryParam.SLEEP_SET_ID)
    public static /* synthetic */ void getSleepSetId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull UpdateCollection self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.sleepSetId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.playTime != -1) {
            output.encodeIntElement(serialDesc, 2, self.playTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.itemImgUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.itemImgUrl);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSleepSetId() {
        return this.sleepSetId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPlayTime() {
        return this.playTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getItemImgUrl() {
        return this.itemImgUrl;
    }

    @NotNull
    public final UpdateCollection copy(@NotNull String sleepSetId, @Nullable String name, int playTime, @Nullable String itemImgUrl) {
        return new UpdateCollection(sleepSetId, name, playTime, itemImgUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCollection)) {
            return false;
        }
        UpdateCollection updateCollection = (UpdateCollection) other;
        return Intrinsics.areEqual(this.sleepSetId, updateCollection.sleepSetId) && Intrinsics.areEqual(this.name, updateCollection.name) && this.playTime == updateCollection.playTime && Intrinsics.areEqual(this.itemImgUrl, updateCollection.itemImgUrl);
    }

    @Nullable
    public final String getItemImgUrl() {
        return this.itemImgUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getPlayTime() {
        return this.playTime;
    }

    @NotNull
    public final String getSleepSetId() {
        return this.sleepSetId;
    }

    public int hashCode() {
        int iHashCode = this.sleepSetId.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.playTime) * 31;
        String str2 = this.itemImgUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setItemImgUrl(@Nullable String str) {
        this.itemImgUrl = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPlayTime(int i) {
        this.playTime = i;
    }

    public final void setSleepSetId(@NotNull String str) {
        this.sleepSetId = str;
    }

    @NotNull
    public String toString() {
        return "UpdateCollection(sleepSetId=" + this.sleepSetId + ", name=" + ((Object) this.name) + ", playTime=" + this.playTime + ", itemImgUrl=" + ((Object) this.itemImgUrl) + ')';
    }

    public UpdateCollection(@NotNull String str, @Nullable String str2, int i, @Nullable String str3) {
        this.sleepSetId = str;
        this.name = str2;
        this.playTime = i;
        this.itemImgUrl = str3;
    }

    public /* synthetic */ UpdateCollection(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? null : str3);
    }
}
