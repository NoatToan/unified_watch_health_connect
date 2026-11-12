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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b.\u0010/Ba\b\u0017\u0012\u0006\u00100\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b.\u00103J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u001fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b%\u0010!\u001a\u0004\b$\u0010\u001fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001d\u0012\u0004\b'\u0010!\u001a\u0004\b&\u0010\u001fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010(\u0012\u0004\b+\u0010!\u001a\u0004\b)\u0010*R\"\u0010\u0016\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001d\u0012\u0004\b-\u0010!\u001a\u0004\b,\u0010\u001f¨\u00066"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/LiveMusicBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "component4", "", "component5", "component6", "sid", "userId", "name", "description", WebConst.QueryParam.PLAY_TIME, "itemImgUrl", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSid", "()Ljava/lang/String;", "getSid$annotations", "()V", "getUserId", "getUserId$annotations", "getName", "getName$annotations", "getDescription", "getDescription$annotations", LogUtil.I, "getPlayTime", "()I", "getPlayTime$annotations", "getItemImgUrl", "getItemImgUrl$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "apilib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class LiveMusicBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String description;

    @NotNull
    private final String itemImgUrl;

    @NotNull
    private final String name;
    private final int playTime;

    @NotNull
    private final String sid;

    @NotNull
    private final String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/LiveMusicBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/sleepassistant/apilib/bean/LiveMusicBean;", "serializer", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LiveMusicBean> serializer() {
            return LiveMusicBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LiveMusicBean(int i, @SerialName("sid") String str, @SerialName("userId") String str2, @SerialName("name") String str3, @SerialName("description") String str4, @SerialName(WebConst.QueryParam.PLAY_TIME) int i2, @SerialName("itemImgUrl") String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, LiveMusicBean$$serializer.INSTANCE.getDescriptor());
        }
        this.sid = str;
        this.userId = str2;
        this.name = str3;
        this.description = str4;
        this.playTime = i2;
        this.itemImgUrl = str5;
    }

    public static /* synthetic */ LiveMusicBean copy$default(LiveMusicBean liveMusicBean, String str, String str2, String str3, String str4, int i, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveMusicBean.sid;
        }
        if ((i2 & 2) != 0) {
            str2 = liveMusicBean.userId;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = liveMusicBean.name;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = liveMusicBean.description;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            i = liveMusicBean.playTime;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str5 = liveMusicBean.itemImgUrl;
        }
        return liveMusicBean.copy(str, str6, str7, str8, i3, str5);
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
    public static final void write$Self(@NotNull LiveMusicBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.sid);
        output.encodeStringElement(serialDesc, 1, self.userId);
        output.encodeStringElement(serialDesc, 2, self.name);
        output.encodeStringElement(serialDesc, 3, self.description);
        output.encodeIntElement(serialDesc, 4, self.playTime);
        output.encodeStringElement(serialDesc, 5, self.itemImgUrl);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPlayTime() {
        return this.playTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getItemImgUrl() {
        return this.itemImgUrl;
    }

    @NotNull
    public final LiveMusicBean copy(@NotNull String sid, @NotNull String userId, @NotNull String name, @NotNull String description, int playTime, @NotNull String itemImgUrl) {
        return new LiveMusicBean(sid, userId, name, description, playTime, itemImgUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveMusicBean)) {
            return false;
        }
        LiveMusicBean liveMusicBean = (LiveMusicBean) other;
        return Intrinsics.areEqual(this.sid, liveMusicBean.sid) && Intrinsics.areEqual(this.userId, liveMusicBean.userId) && Intrinsics.areEqual(this.name, liveMusicBean.name) && Intrinsics.areEqual(this.description, liveMusicBean.description) && this.playTime == liveMusicBean.playTime && Intrinsics.areEqual(this.itemImgUrl, liveMusicBean.itemImgUrl);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getItemImgUrl() {
        return this.itemImgUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPlayTime() {
        return this.playTime;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((this.sid.hashCode() * 31) + this.userId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.playTime) * 31) + this.itemImgUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "LiveMusicBean(sid=" + this.sid + ", userId=" + this.userId + ", name=" + this.name + ", description=" + this.description + ", playTime=" + this.playTime + ", itemImgUrl=" + this.itemImgUrl + ')';
    }

    public LiveMusicBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5) {
        this.sid = str;
        this.userId = str2;
        this.name = str3;
        this.description = str4;
        this.playTime = i;
        this.itemImgUrl = str5;
    }
}
