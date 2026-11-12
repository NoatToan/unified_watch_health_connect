package com.huami.message.api.pojo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.api.WebConst;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import defpackage.b;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBG\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\bE\u0010FBu\b\u0017\u0012\u0006\u0010G\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0014\u001a\u00020\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u001b\u001a\u00020\t\u0012\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bE\u0010JJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0012\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003JY\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\tHÆ\u0001J\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u000eHÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0014\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010'\u001a\u0004\b*\u0010+R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010)\u0012\u0004\b/\u0010'\u001a\u0004\b.\u0010+R\"\u0010\u0017\u001a\u00020\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010'\u001a\u0004\b2\u00103R(\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u0010)\u0012\u0004\b9\u0010'\u001a\u0004\b6\u0010+\"\u0004\b7\u00108R(\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b:\u0010)\u0012\u0004\b=\u0010'\u001a\u0004\b;\u0010+\"\u0004\b<\u00108R(\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b>\u0010)\u0012\u0004\bA\u0010'\u001a\u0004\b?\u0010+\"\u0004\b@\u00108R\"\u0010\u001b\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010#\u0012\u0004\bD\u0010'\u001a\u0004\bC\u0010%¨\u0006M"}, d2 = {"Lcom/huami/message/api/pojo/PrivateMessageBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "", "component4", "component5", "component6", "component7", "component8", WebConst.QueryParam.MESSAGE_ID, "followeeId", WebAPI.PARAM_SHARE_INVITE_AVATAR, "count", "nickName", "status", "text", "generateTime", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getMessageId", "()J", "getMessageId$annotations", "()V", "b", "Ljava/lang/String;", "getFolloweeId", "()Ljava/lang/String;", "getFolloweeId$annotations", "c", "getAvatar", "getAvatar$annotations", GoogleApiAvailabilityLight.a, LogUtil.I, "getCount", "()I", "getCount$annotations", "e", "getNickName", "setNickName", "(Ljava/lang/String;)V", "getNickName$annotations", "f", "getStatus", "setStatus", "getStatus$annotations", "g", "getText", "setText", "getText$annotations", "h", "getGenerateTime", "getGenerateTime$annotations", "<init>", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "common-message_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class PrivateMessageBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long messageId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String followeeId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String avatar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int count;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private String nickName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private String status;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private String text;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final long generateTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/message/api/pojo/PrivateMessageBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/message/api/pojo/PrivateMessageBean;", "serializer", "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PrivateMessageBean> serializer() {
            return PrivateMessageBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PrivateMessageBean(int i, @SerialName(WebConst.QueryParam.MESSAGE_ID) long j, @SerialName("followeeId") String str, @SerialName("iconUrl") String str2, @SerialName("count") int i2, @SerialName("nickName") String str3, @SerialName("status") String str4, @SerialName("text") String str5, @SerialName("generateTime") long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, PrivateMessageBean$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = j;
        this.followeeId = str;
        this.avatar = str2;
        this.count = i2;
        this.nickName = str3;
        this.status = str4;
        this.text = str5;
        this.generateTime = j2;
    }

    @SerialName("iconUrl")
    public static /* synthetic */ void getAvatar$annotations() {
    }

    @SerialName("count")
    public static /* synthetic */ void getCount$annotations() {
    }

    @SerialName("followeeId")
    public static /* synthetic */ void getFolloweeId$annotations() {
    }

    @SerialName("generateTime")
    public static /* synthetic */ void getGenerateTime$annotations() {
    }

    @SerialName(WebConst.QueryParam.MESSAGE_ID)
    public static /* synthetic */ void getMessageId$annotations() {
    }

    @SerialName("nickName")
    public static /* synthetic */ void getNickName$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @SerialName("text")
    public static /* synthetic */ void getText$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull PrivateMessageBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.messageId);
        output.encodeStringElement(serialDesc, 1, self.followeeId);
        output.encodeStringElement(serialDesc, 2, self.avatar);
        output.encodeIntElement(serialDesc, 3, self.count);
        output.encodeStringElement(serialDesc, 4, self.nickName);
        output.encodeStringElement(serialDesc, 5, self.status);
        output.encodeStringElement(serialDesc, 6, self.text);
        output.encodeLongElement(serialDesc, 7, self.generateTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFolloweeId() {
        return this.followeeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    public final PrivateMessageBean copy(long messageId, @NotNull String followeeId, @NotNull String avatar, int count, @NotNull String nickName, @NotNull String status, @NotNull String text, long generateTime) {
        return new PrivateMessageBean(messageId, followeeId, avatar, count, nickName, status, text, generateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivateMessageBean)) {
            return false;
        }
        PrivateMessageBean privateMessageBean = (PrivateMessageBean) other;
        return this.messageId == privateMessageBean.messageId && Intrinsics.areEqual(this.followeeId, privateMessageBean.followeeId) && Intrinsics.areEqual(this.avatar, privateMessageBean.avatar) && this.count == privateMessageBean.count && Intrinsics.areEqual(this.nickName, privateMessageBean.nickName) && Intrinsics.areEqual(this.status, privateMessageBean.status) && Intrinsics.areEqual(this.text, privateMessageBean.text) && this.generateTime == privateMessageBean.generateTime;
    }

    @NotNull
    public final String getAvatar() {
        return this.avatar;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getFolloweeId() {
        return this.followeeId;
    }

    public final long getGenerateTime() {
        return this.generateTime;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((((((((((b.a(this.messageId) * 31) + this.followeeId.hashCode()) * 31) + this.avatar.hashCode()) * 31) + this.count) * 31) + this.nickName.hashCode()) * 31) + this.status.hashCode()) * 31) + this.text.hashCode()) * 31) + b.a(this.generateTime);
    }

    public final void setNickName(@NotNull String str) {
        this.nickName = str;
    }

    public final void setStatus(@NotNull String str) {
        this.status = str;
    }

    public final void setText(@NotNull String str) {
        this.text = str;
    }

    @NotNull
    public String toString() {
        return "PrivateMessageBean(messageId=" + this.messageId + ", followeeId=" + this.followeeId + ", avatar=" + this.avatar + ", count=" + this.count + ", nickName=" + this.nickName + ", status=" + this.status + ", text=" + this.text + ", generateTime=" + this.generateTime + ')';
    }

    public PrivateMessageBean(long j, @NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j2) {
        this.messageId = j;
        this.followeeId = str;
        this.avatar = str2;
        this.count = i;
        this.nickName = str3;
        this.status = str4;
        this.text = str5;
        this.generateTime = j2;
    }
}
