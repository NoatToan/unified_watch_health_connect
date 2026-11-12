package com.huami.sleepassistant.apilib.vo;

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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B]\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b9\u0010:Bq\b\u0017\u0012\u0006\u0010;\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001a\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b9\u0010>J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÆ\u0003Ja\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u000eHÆ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u000eHÖ\u0001J\u0013\u0010 \u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0014\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R$\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010!\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010#R$\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010#R\"\u0010\u0018\u001a\u00020\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010,\u0012\u0004\b/\u0010%\u001a\u0004\b-\u0010.R$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010!\u0012\u0004\b1\u0010%\u001a\u0004\b0\u0010#R\"\u0010\u001a\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00102\u001a\u0004\b\u001a\u00103\"\u0004\b4\u00105R\"\u0010\u001b\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010,\u001a\u0004\b6\u0010.\"\u0004\b7\u00108¨\u0006A"}, d2 = {"Lcom/huami/sleepassistant/apilib/vo/LiveMusicVo;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "component4", "", "component5", "component6", "", "component7", "component8", "sid", "userId", "name", "description", WebConst.QueryParam.PLAY_TIME, "itemImgUrl", "isDown", "progress", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getSid", "()Ljava/lang/String;", "getSid$annotations", "()V", "getUserId", "getUserId$annotations", "getName", "getName$annotations", "getDescription", "getDescription$annotations", LogUtil.I, "getPlayTime", "()I", "getPlayTime$annotations", "getItemImgUrl", "getItemImgUrl$annotations", "Z", "()Z", "setDown", "(Z)V", "getProgress", "setProgress", "(I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZI)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "apilib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class LiveMusicVo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String description;
    private boolean isDown;

    @Nullable
    private final String itemImgUrl;

    @Nullable
    private final String name;
    private final int playTime;
    private int progress;

    @NotNull
    private final String sid;

    @Nullable
    private final String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/sleepassistant/apilib/vo/LiveMusicVo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/sleepassistant/apilib/vo/LiveMusicVo;", "serializer", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LiveMusicVo> serializer() {
            return LiveMusicVo$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LiveMusicVo(int i, @SerialName("sid") String str, @SerialName("userId") String str2, @SerialName("name") String str3, @SerialName("description") String str4, @SerialName(WebConst.QueryParam.PLAY_TIME) int i2, @SerialName("itemImgUrl") String str5, boolean z, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, LiveMusicVo$$serializer.INSTANCE.getDescriptor());
        }
        this.sid = str;
        if ((i & 2) == 0) {
            this.userId = null;
        } else {
            this.userId = str2;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.playTime = -1;
        } else {
            this.playTime = i2;
        }
        if ((i & 32) == 0) {
            this.itemImgUrl = null;
        } else {
            this.itemImgUrl = str5;
        }
        if ((i & 64) == 0) {
            this.isDown = false;
        } else {
            this.isDown = z;
        }
        if ((i & 128) == 0) {
            this.progress = 0;
        } else {
            this.progress = i3;
        }
    }

    @SerialName("description")
    public static /* synthetic */ void getDescription$annotations() {
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

    @SerialName("sid")
    public static /* synthetic */ void getSid$annotations() {
    }

    @SerialName("userId")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull LiveMusicVo self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.sid);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.userId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.userId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.description != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.playTime != -1) {
            output.encodeIntElement(serialDesc, 4, self.playTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.itemImgUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.itemImgUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.isDown) {
            output.encodeBooleanElement(serialDesc, 6, self.isDown);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.progress != 0) {
            output.encodeIntElement(serialDesc, 7, self.progress);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPlayTime() {
        return this.playTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getItemImgUrl() {
        return this.itemImgUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsDown() {
        return this.isDown;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final LiveMusicVo copy(@NotNull String sid, @Nullable String userId, @Nullable String name, @Nullable String description, int playTime, @Nullable String itemImgUrl, boolean isDown, int progress) {
        return new LiveMusicVo(sid, userId, name, description, playTime, itemImgUrl, isDown, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveMusicVo)) {
            return false;
        }
        LiveMusicVo liveMusicVo = (LiveMusicVo) other;
        return Intrinsics.areEqual(this.sid, liveMusicVo.sid) && Intrinsics.areEqual(this.userId, liveMusicVo.userId) && Intrinsics.areEqual(this.name, liveMusicVo.name) && Intrinsics.areEqual(this.description, liveMusicVo.description) && this.playTime == liveMusicVo.playTime && Intrinsics.areEqual(this.itemImgUrl, liveMusicVo.itemImgUrl) && this.isDown == liveMusicVo.isDown && this.progress == liveMusicVo.progress;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
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

    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    public int hashCode() {
        int iHashCode = this.sid.hashCode() * 31;
        String str = this.userId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.playTime) * 31;
        String str4 = this.itemImgUrl;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.isDown;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode5 + r1) * 31) + this.progress;
    }

    public final boolean isDown() {
        return this.isDown;
    }

    public final void setDown(boolean z) {
        this.isDown = z;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    @NotNull
    public String toString() {
        return "LiveMusicVo(sid=" + this.sid + ", userId=" + ((Object) this.userId) + ", name=" + ((Object) this.name) + ", description=" + ((Object) this.description) + ", playTime=" + this.playTime + ", itemImgUrl=" + ((Object) this.itemImgUrl) + ", isDown=" + this.isDown + ", progress=" + this.progress + ')';
    }

    public LiveMusicVo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, @Nullable String str5, boolean z, int i2) {
        this.sid = str;
        this.userId = str2;
        this.name = str3;
        this.description = str4;
        this.playTime = i;
        this.itemImgUrl = str5;
        this.isDown = z;
        this.progress = i2;
    }

    public /* synthetic */ LiveMusicVo(String str, String str2, String str3, String str4, int i, String str5, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? -1 : i, (i3 & 32) == 0 ? str5 : null, (i3 & 64) != 0 ? false : z, (i3 & 128) == 0 ? i2 : 0);
    }
}
