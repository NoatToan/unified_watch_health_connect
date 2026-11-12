package com.huami.message.api.pojo;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.api.WebConst;
import com.loc.z;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 e2\u00020\u0001:\u0002feB\u00ad\u0001\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b_\u0010`B¿\u0001\b\u0017\u0012\u0006\u0010a\u001a\u00020+\u0012\b\b\u0001\u0010\u001a\u001a\u00020\t\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010c\u001a\u0004\u0018\u00010b¢\u0006\u0004\b_\u0010dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003J¶\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020+HÖ\u0001J\u0013\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001a\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R$\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u00105\u001a\u0004\b8\u00109R$\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u00107\u0012\u0004\b=\u00105\u001a\u0004\b<\u00109R$\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u00107\u0012\u0004\b@\u00105\u001a\u0004\b?\u00109R$\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u00107\u0012\u0004\bC\u00105\u001a\u0004\bB\u00109R$\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bG\u00105\u001a\u0004\bF\u0010\u0011R$\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u00107\u0012\u0004\bJ\u00105\u001a\u0004\bI\u00109R$\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bK\u00107\u0012\u0004\bM\u00105\u001a\u0004\bL\u00109R$\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u00107\u0012\u0004\bP\u00105\u001a\u0004\bO\u00109R$\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bQ\u00107\u0012\u0004\bS\u00105\u001a\u0004\bR\u00109R$\u0010$\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bT\u00107\u0012\u0004\bV\u00105\u001a\u0004\bU\u00109R\u001b\u0010%\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bW\u00107\u001a\u0004\bX\u00109R$\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bY\u00107\u0012\u0004\b[\u00105\u001a\u0004\bZ\u00109R$\u0010'\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\\\u00107\u0012\u0004\b^\u00105\u001a\u0004\b]\u00109¨\u0006g"}, d2 = {"Lcom/huami/message/api/pojo/NotificationBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Long;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", WebConst.QueryParam.MESSAGE_ID, "status", "iconUrl", "title", "text", "generateTime", "typeName", "subTypeName", "jumpType", "url", "pushUrl", "groupExType", WebConst.QueryParam.NOTICE_TYPE, "subType", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/message/api/pojo/NotificationBean;", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getMessageId", "()J", "getMessageId$annotations", "()V", "b", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "getStatus$annotations", "c", "getIconUrl", "getIconUrl$annotations", GoogleApiAvailabilityLight.a, "getTitle", "getTitle$annotations", "e", "getText", "getText$annotations", "f", "Ljava/lang/Long;", "getGenerateTime", "getGenerateTime$annotations", "g", "getTypeName", "getTypeName$annotations", "h", "getSubTypeName", "getSubTypeName$annotations", "i", "getJumpType", "getJumpType$annotations", z.j, "getUrl", "getUrl$annotations", hl.k, "getPushUrl", "getPushUrl$annotations", "l", "getGroupExType", "m", "getNoticeType", "getNoticeType$annotations", GoogleApiAvailabilityLight.b, "getSubType", "getSubType$annotations", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "common-message_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class NotificationBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long messageId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String iconUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String text;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long generateTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final String typeName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subTypeName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final String jumpType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String url;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final String pushUrl;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private final String groupExType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private final String noticeType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/message/api/pojo/NotificationBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/message/api/pojo/NotificationBean;", "serializer", "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<NotificationBean> serializer() {
            return NotificationBean$$serializer.INSTANCE;
        }
    }

    public NotificationBean() {
        this(0L, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ NotificationBean(int i, @SerialName(WebConst.QueryParam.MESSAGE_ID) long j, @SerialName("status") String str, @SerialName("iconUrl") String str2, @SerialName("title") String str3, @SerialName("text") String str4, @SerialName("generateTime") Long l, @SerialName("typeName") String str5, @SerialName("subTypeName") String str6, @SerialName("jumpType") String str7, @SerialName("url") String str8, @SerialName("pushUrl") String str9, String str10, @SerialName(WebConst.QueryParam.NOTICE_TYPE) String str11, @SerialName("subType") String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, NotificationBean$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.status = null;
        } else {
            this.status = str;
        }
        if ((i & 4) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str2;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 16) == 0) {
            this.text = null;
        } else {
            this.text = str4;
        }
        if ((i & 32) == 0) {
            this.generateTime = null;
        } else {
            this.generateTime = l;
        }
        if ((i & 64) == 0) {
            this.typeName = null;
        } else {
            this.typeName = str5;
        }
        if ((i & 128) == 0) {
            this.subTypeName = null;
        } else {
            this.subTypeName = str6;
        }
        if ((i & 256) == 0) {
            this.jumpType = null;
        } else {
            this.jumpType = str7;
        }
        if ((i & 512) == 0) {
            this.url = null;
        } else {
            this.url = str8;
        }
        if ((i & 1024) == 0) {
            this.pushUrl = null;
        } else {
            this.pushUrl = str9;
        }
        if ((i & 2048) == 0) {
            this.groupExType = null;
        } else {
            this.groupExType = str10;
        }
        if ((i & 4096) == 0) {
            this.noticeType = null;
        } else {
            this.noticeType = str11;
        }
        if ((i & 8192) == 0) {
            this.subType = null;
        } else {
            this.subType = str12;
        }
    }

    @SerialName("generateTime")
    public static /* synthetic */ void getGenerateTime$annotations() {
    }

    @SerialName("iconUrl")
    public static /* synthetic */ void getIconUrl$annotations() {
    }

    @SerialName("jumpType")
    public static /* synthetic */ void getJumpType$annotations() {
    }

    @SerialName(WebConst.QueryParam.MESSAGE_ID)
    public static /* synthetic */ void getMessageId$annotations() {
    }

    @SerialName(WebConst.QueryParam.NOTICE_TYPE)
    public static /* synthetic */ void getNoticeType$annotations() {
    }

    @SerialName("pushUrl")
    public static /* synthetic */ void getPushUrl$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @SerialName("subType")
    public static /* synthetic */ void getSubType$annotations() {
    }

    @SerialName("subTypeName")
    public static /* synthetic */ void getSubTypeName$annotations() {
    }

    @SerialName("text")
    public static /* synthetic */ void getText$annotations() {
    }

    @SerialName("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @SerialName("typeName")
    public static /* synthetic */ void getTypeName$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull NotificationBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.messageId != 0) {
            output.encodeLongElement(serialDesc, 0, self.messageId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.status != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.iconUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.iconUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.text != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.text);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.generateTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.generateTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.typeName != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.typeName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.subTypeName != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.subTypeName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.jumpType != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.jumpType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.url != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.url);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.pushUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.pushUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.groupExType != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.groupExType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.noticeType != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.noticeType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.subType != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.subType);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPushUrl() {
        return this.pushUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getGroupExType() {
        return this.groupExType;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getGenerateTime() {
        return this.generateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSubTypeName() {
        return this.subTypeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    @NotNull
    public final NotificationBean copy(long messageId, @Nullable String status, @Nullable String iconUrl, @Nullable String title, @Nullable String text, @Nullable Long generateTime, @Nullable String typeName, @Nullable String subTypeName, @Nullable String jumpType, @Nullable String url, @Nullable String pushUrl, @Nullable String groupExType, @Nullable String noticeType, @Nullable String subType) {
        return new NotificationBean(messageId, status, iconUrl, title, text, generateTime, typeName, subTypeName, jumpType, url, pushUrl, groupExType, noticeType, subType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationBean)) {
            return false;
        }
        NotificationBean notificationBean = (NotificationBean) other;
        return this.messageId == notificationBean.messageId && Intrinsics.areEqual(this.status, notificationBean.status) && Intrinsics.areEqual(this.iconUrl, notificationBean.iconUrl) && Intrinsics.areEqual(this.title, notificationBean.title) && Intrinsics.areEqual(this.text, notificationBean.text) && Intrinsics.areEqual(this.generateTime, notificationBean.generateTime) && Intrinsics.areEqual(this.typeName, notificationBean.typeName) && Intrinsics.areEqual(this.subTypeName, notificationBean.subTypeName) && Intrinsics.areEqual(this.jumpType, notificationBean.jumpType) && Intrinsics.areEqual(this.url, notificationBean.url) && Intrinsics.areEqual(this.pushUrl, notificationBean.pushUrl) && Intrinsics.areEqual(this.groupExType, notificationBean.groupExType) && Intrinsics.areEqual(this.noticeType, notificationBean.noticeType) && Intrinsics.areEqual(this.subType, notificationBean.subType);
    }

    @Nullable
    public final Long getGenerateTime() {
        return this.generateTime;
    }

    @Nullable
    public final String getGroupExType() {
        return this.groupExType;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getJumpType() {
        return this.jumpType;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final String getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    public final String getPushUrl() {
        return this.pushUrl;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    public final String getSubTypeName() {
        return this.subTypeName;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTypeName() {
        return this.typeName;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iA = b.a(this.messageId) * 31;
        String str = this.status;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.generateTime;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.typeName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subTypeName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.jumpType;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.url;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.pushUrl;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.groupExType;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.noticeType;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.subType;
        return iHashCode12 + (str12 != null ? str12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NotificationBean(messageId=" + this.messageId + ", status=" + ((Object) this.status) + ", iconUrl=" + ((Object) this.iconUrl) + ", title=" + ((Object) this.title) + ", text=" + ((Object) this.text) + ", generateTime=" + this.generateTime + ", typeName=" + ((Object) this.typeName) + ", subTypeName=" + ((Object) this.subTypeName) + ", jumpType=" + ((Object) this.jumpType) + ", url=" + ((Object) this.url) + ", pushUrl=" + ((Object) this.pushUrl) + ", groupExType=" + ((Object) this.groupExType) + ", noticeType=" + ((Object) this.noticeType) + ", subType=" + ((Object) this.subType) + ')';
    }

    public NotificationBean(long j, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        this.messageId = j;
        this.status = str;
        this.iconUrl = str2;
        this.title = str3;
        this.text = str4;
        this.generateTime = l;
        this.typeName = str5;
        this.subTypeName = str6;
        this.jumpType = str7;
        this.url = str8;
        this.pushUrl = str9;
        this.groupExType = str10;
        this.noticeType = str11;
        this.subType = str12;
    }

    public /* synthetic */ NotificationBean(long j, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) == 0 ? str12 : null);
    }
}
