package com.huami.message.api.pojo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.loc.z;
import com.xiaomi.hm.health.push.Type;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMB\u007f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bG\u0010HB\u0093\u0001\b\u0017\u0012\u0006\u0010I\u001a\u00020\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bG\u0010LJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000bJ\u0088\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\t\u0010\"\u001a\u00020!HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001J\u0013\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u000bR$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010(\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u000bR$\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010(\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\u000bR$\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010(\u0012\u0004\b4\u0010+\u001a\u0004\b3\u0010\u000bR$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010(\u0012\u0004\b7\u0010+\u001a\u0004\b6\u0010\u000bR$\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010(\u0012\u0004\b:\u0010+\u001a\u0004\b9\u0010\u000bR$\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010(\u0012\u0004\b=\u0010+\u001a\u0004\b<\u0010\u000bR$\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010(\u0012\u0004\b@\u0010+\u001a\u0004\b?\u0010\u000bR$\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010(\u0012\u0004\bC\u0010+\u001a\u0004\bB\u0010\u000bR$\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010(\u0012\u0004\bF\u0010+\u001a\u0004\bE\u0010\u000b¨\u0006O"}, d2 = {"Lcom/huami/message/api/pojo/MessageCountBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", SleepHomeActivity.FROM_NOTIFICATION, "chat", "comment", "replyComment", "replySecondComment", "agreePost", "agreeComment", "agreeSecondComment", "collect", Type.FOLLOW_MESSAGE, "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huami/message/api/pojo/MessageCountBean;", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "getNotification", "getNotification$annotations", "()V", "b", "getChat", "getChat$annotations", "c", "getComment", "getComment$annotations", GoogleApiAvailabilityLight.a, "getReplyComment", "getReplyComment$annotations", "e", "getReplySecondComment", "getReplySecondComment$annotations", "f", "getAgreePost", "getAgreePost$annotations", "g", "getAgreeComment", "getAgreeComment$annotations", "h", "getAgreeSecondComment", "getAgreeSecondComment$annotations", "i", "getCollect", "getCollect$annotations", z.j, "getFollow", "getFollow$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "common-message_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class MessageCountBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer notification;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer chat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer comment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer replyComment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer replySecondComment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer agreePost;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer agreeComment;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer agreeSecondComment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer collect;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer follow;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/message/api/pojo/MessageCountBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/message/api/pojo/MessageCountBean;", "serializer", "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<MessageCountBean> serializer() {
            return MessageCountBean$$serializer.INSTANCE;
        }
    }

    public MessageCountBean() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 1023, (DefaultConstructorMarker) null);
    }

    public MessageCountBean(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10) {
        this.notification = num;
        this.chat = num2;
        this.comment = num3;
        this.replyComment = num4;
        this.replySecondComment = num5;
        this.agreePost = num6;
        this.agreeComment = num7;
        this.agreeSecondComment = num8;
        this.collect = num9;
        this.follow = num10;
    }

    @SerialName("agreeComment")
    public static /* synthetic */ void getAgreeComment$annotations() {
    }

    @SerialName("agreePost")
    public static /* synthetic */ void getAgreePost$annotations() {
    }

    @SerialName("agreeSecondComment")
    public static /* synthetic */ void getAgreeSecondComment$annotations() {
    }

    @SerialName("chat")
    public static /* synthetic */ void getChat$annotations() {
    }

    @SerialName("collect")
    public static /* synthetic */ void getCollect$annotations() {
    }

    @SerialName("comment")
    public static /* synthetic */ void getComment$annotations() {
    }

    @SerialName(Type.FOLLOW_MESSAGE)
    public static /* synthetic */ void getFollow$annotations() {
    }

    @SerialName(SleepHomeActivity.FROM_NOTIFICATION)
    public static /* synthetic */ void getNotification$annotations() {
    }

    @SerialName("replyComment")
    public static /* synthetic */ void getReplyComment$annotations() {
    }

    @SerialName("replySecondComment")
    public static /* synthetic */ void getReplySecondComment$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull MessageCountBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || (num = self.notification) == null || num.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.notification);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || (num2 = self.chat) == null || num2.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.chat);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || (num3 = self.comment) == null || num3.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.comment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || (num4 = self.replyComment) == null || num4.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.replyComment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || (num5 = self.replySecondComment) == null || num5.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.replySecondComment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || (num6 = self.agreePost) == null || num6.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.agreePost);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || (num7 = self.agreeComment) == null || num7.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.agreeComment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || (num8 = self.agreeSecondComment) == null || num8.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.agreeSecondComment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || (num9 = self.collect) == null || num9.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.collect);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || (num10 = self.follow) == null || num10.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.follow);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getNotification() {
        return this.notification;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getFollow() {
        return this.follow;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getChat() {
        return this.chat;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getComment() {
        return this.comment;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getReplyComment() {
        return this.replyComment;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getReplySecondComment() {
        return this.replySecondComment;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getAgreePost() {
        return this.agreePost;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getAgreeComment() {
        return this.agreeComment;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getAgreeSecondComment() {
        return this.agreeSecondComment;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getCollect() {
        return this.collect;
    }

    @NotNull
    public final MessageCountBean copy(@Nullable Integer notification, @Nullable Integer chat, @Nullable Integer comment, @Nullable Integer replyComment, @Nullable Integer replySecondComment, @Nullable Integer agreePost, @Nullable Integer agreeComment, @Nullable Integer agreeSecondComment, @Nullable Integer collect, @Nullable Integer follow) {
        return new MessageCountBean(notification, chat, comment, replyComment, replySecondComment, agreePost, agreeComment, agreeSecondComment, collect, follow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageCountBean)) {
            return false;
        }
        MessageCountBean messageCountBean = (MessageCountBean) other;
        return Intrinsics.areEqual(this.notification, messageCountBean.notification) && Intrinsics.areEqual(this.chat, messageCountBean.chat) && Intrinsics.areEqual(this.comment, messageCountBean.comment) && Intrinsics.areEqual(this.replyComment, messageCountBean.replyComment) && Intrinsics.areEqual(this.replySecondComment, messageCountBean.replySecondComment) && Intrinsics.areEqual(this.agreePost, messageCountBean.agreePost) && Intrinsics.areEqual(this.agreeComment, messageCountBean.agreeComment) && Intrinsics.areEqual(this.agreeSecondComment, messageCountBean.agreeSecondComment) && Intrinsics.areEqual(this.collect, messageCountBean.collect) && Intrinsics.areEqual(this.follow, messageCountBean.follow);
    }

    @Nullable
    public final Integer getAgreeComment() {
        return this.agreeComment;
    }

    @Nullable
    public final Integer getAgreePost() {
        return this.agreePost;
    }

    @Nullable
    public final Integer getAgreeSecondComment() {
        return this.agreeSecondComment;
    }

    @Nullable
    public final Integer getChat() {
        return this.chat;
    }

    @Nullable
    public final Integer getCollect() {
        return this.collect;
    }

    @Nullable
    public final Integer getComment() {
        return this.comment;
    }

    @Nullable
    public final Integer getFollow() {
        return this.follow;
    }

    @Nullable
    public final Integer getNotification() {
        return this.notification;
    }

    @Nullable
    public final Integer getReplyComment() {
        return this.replyComment;
    }

    @Nullable
    public final Integer getReplySecondComment() {
        return this.replySecondComment;
    }

    public int hashCode() {
        Integer num = this.notification;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.chat;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.comment;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.replyComment;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.replySecondComment;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.agreePost;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.agreeComment;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.agreeSecondComment;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.collect;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.follow;
        return iHashCode9 + (num10 != null ? num10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessageCountBean(notification=" + this.notification + ", chat=" + this.chat + ", comment=" + this.comment + ", replyComment=" + this.replyComment + ", replySecondComment=" + this.replySecondComment + ", agreePost=" + this.agreePost + ", agreeComment=" + this.agreeComment + ", agreeSecondComment=" + this.agreeSecondComment + ", collect=" + this.collect + ", follow=" + this.follow + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MessageCountBean(int i, @SerialName(SleepHomeActivity.FROM_NOTIFICATION) Integer num, @SerialName("chat") Integer num2, @SerialName("comment") Integer num3, @SerialName("replyComment") Integer num4, @SerialName("replySecondComment") Integer num5, @SerialName("agreePost") Integer num6, @SerialName("agreeComment") Integer num7, @SerialName("agreeSecondComment") Integer num8, @SerialName("collect") Integer num9, @SerialName(Type.FOLLOW_MESSAGE) Integer num10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, MessageCountBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.notification = 0;
        } else {
            this.notification = num;
        }
        if ((i & 2) == 0) {
            this.chat = 0;
        } else {
            this.chat = num2;
        }
        if ((i & 4) == 0) {
            this.comment = 0;
        } else {
            this.comment = num3;
        }
        if ((i & 8) == 0) {
            this.replyComment = 0;
        } else {
            this.replyComment = num4;
        }
        if ((i & 16) == 0) {
            this.replySecondComment = 0;
        } else {
            this.replySecondComment = num5;
        }
        if ((i & 32) == 0) {
            this.agreePost = 0;
        } else {
            this.agreePost = num6;
        }
        if ((i & 64) == 0) {
            this.agreeComment = 0;
        } else {
            this.agreeComment = num7;
        }
        if ((i & 128) == 0) {
            this.agreeSecondComment = 0;
        } else {
            this.agreeSecondComment = num8;
        }
        if ((i & 256) == 0) {
            this.collect = 0;
        } else {
            this.collect = num9;
        }
        if ((i & 512) == 0) {
            this.follow = 0;
        } else {
            this.follow = num10;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MessageCountBean(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num11 = 0;
        this((i & 1) != 0 ? num11 : num, (i & 2) != 0 ? num11 : num2, (i & 4) != 0 ? num11 : num3, (i & 8) != 0 ? num11 : num4, (i & 16) != 0 ? num11 : num5, (i & 32) != 0 ? num11 : num6, (i & 64) != 0 ? num11 : num7, (i & 128) != 0 ? num11 : num8, (i & 256) != 0 ? num11 : num9, (i & 512) == 0 ? num10 : 0);
    }
}
