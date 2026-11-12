package com.huami.message.vo;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.api.WebConst;
import com.huami.message.dto.FollowStatus;
import com.huami.message.dto.MessageStatus;
import com.huami.message.dto.MessageSubType;
import com.huami.message.dto.MessageType;
import com.huami.message.dto.NoticeType;
import com.huami.message.dto.ResourceType;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\bL\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010&¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010&HÆ\u0003JÒ\u0002\u0010C\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010?\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010A\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010&HÆ\u0001¢\u0006\u0004\bC\u0010DJ\t\u0010E\u001a\u00020\u0007HÖ\u0001J\t\u0010F\u001a\u00020\u0004HÖ\u0001J\u0013\u0010I\u001a\u00020H2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010(\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010)\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010\u0006R\u001b\u0010*\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001b\u0010+\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\bU\u0010R\u001a\u0004\bV\u0010TR\u001b\u0010,\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\bW\u0010R\u001a\u0004\bX\u0010TR\u001b\u0010-\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\bY\u0010R\u001a\u0004\bZ\u0010TR\u001b\u0010.\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b[\u0010R\u001a\u0004\b\\\u0010TR\u001b\u0010/\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b]\u0010R\u001a\u0004\b^\u0010TR\u001b\u00100\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b_\u0010R\u001a\u0004\b`\u0010TR\u001b\u00101\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\ba\u0010R\u001a\u0004\bb\u0010TR\u001b\u00102\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\bc\u0010R\u001a\u0004\bd\u0010TR\u001b\u00103\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010\u0012R\u001b\u00104\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bh\u0010f\u001a\u0004\bi\u0010\u0012R\u001b\u00105\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\bj\u0010R\u001a\u0004\bk\u0010TR\u001b\u00106\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\bl\u0010R\u001a\u0004\bm\u0010TR\u001b\u00107\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\bn\u0010R\u001a\u0004\bo\u0010TR\u001b\u00108\u001a\u0004\u0018\u00010\u00178\u0006@\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001b\u00109\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\bt\u0010R\u001a\u0004\bu\u0010TR\u001b\u0010:\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001b\u0010;\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001b\u0010<\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b~\u0010R\u001a\u0004\b\u007f\u0010TR\u001d\u0010=\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010R\u001a\u0005\b\u0081\u0001\u0010TR\u001d\u0010>\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010R\u001a\u0005\b\u0083\u0001\u0010TR\u001f\u0010?\u001a\u0004\u0018\u00010!8\u0006@\u0006¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001d\u0010@\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010R\u001a\u0005\b\u0089\u0001\u0010TR\u001f\u0010A\u001a\u0004\u0018\u00010$8\u0006@\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001f\u0010B\u001a\u0004\u0018\u00010&8\u0006@\u0006¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0094\u0001"}, d2 = {"Lcom/huami/message/vo/SubMessageItemVo;", "", "", "component1", "", "component2", "()Ljava/lang/Integer;", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Long;", "component13", "component14", "component15", "component16", "Lcom/huami/message/dto/MessageSubType;", "component17", "component18", "Lcom/huami/message/dto/NoticeType;", "component19", "Lcom/huami/message/dto/MessageStatus;", "component20", "component21", "component22", "component23", "Lcom/huami/message/dto/MessageType;", "component24", "component25", "Lcom/huami/message/dto/ResourceType;", "component26", "Lcom/huami/message/dto/FollowStatus;", "component27", WebConst.QueryParam.MESSAGE_ID, "count", "dataType", "day", "description", "followeeId", "from", "fromFirstCommentId", "fromPostId", "fromSecondCommentId", "fromTopicId", "generateTime", "generatedTime", "hrvType", "iconUrl", ParamKey.memberId, WebConst.QueryParam.MESSAGE_SUB_TYPE, "nickName", WebConst.QueryParam.NOTICE_TYPE, "status", "text", "subText", "title", "type", "resource", "resourceType", "followStatus", "copy", "(JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/message/dto/MessageSubType;Ljava/lang/String;Lcom/huami/message/dto/NoticeType;Lcom/huami/message/dto/MessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/message/dto/MessageType;Ljava/lang/String;Lcom/huami/message/dto/ResourceType;Lcom/huami/message/dto/FollowStatus;)Lcom/huami/message/vo/SubMessageItemVo;", "toString", "hashCode", "other", "", "equals", "a", "J", "getMessageId", "()J", "b", "Ljava/lang/Integer;", "getCount", "c", "Ljava/lang/String;", "getDataType", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getDay", "e", "getDescription", "f", "getFolloweeId", "g", "getFrom", "h", "getFromFirstCommentId", "i", "getFromPostId", z.j, "getFromSecondCommentId", hl.k, "getFromTopicId", "l", "Ljava/lang/Long;", "getGenerateTime", "m", "getGeneratedTime", GoogleApiAvailabilityLight.b, "getHrvType", "o", "getIconUrl", b.r, "getMemberId", DTransferConstants.SEARCH_KEY, "Lcom/huami/message/dto/MessageSubType;", "getMessageSubType", "()Lcom/huami/message/dto/MessageSubType;", "r", "getNickName", SOAP.XMLNS, "Lcom/huami/message/dto/NoticeType;", "getNoticeType", "()Lcom/huami/message/dto/NoticeType;", "t", "Lcom/huami/message/dto/MessageStatus;", "getStatus", "()Lcom/huami/message/dto/MessageStatus;", "u", "getText", "v", "getSubText", "w", "getTitle", "x", "Lcom/huami/message/dto/MessageType;", "getType", "()Lcom/huami/message/dto/MessageType;", "y", "getResource", "z", "Lcom/huami/message/dto/ResourceType;", "getResourceType", "()Lcom/huami/message/dto/ResourceType;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/message/dto/FollowStatus;", "getFollowStatus", "()Lcom/huami/message/dto/FollowStatus;", "<init>", "(JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/message/dto/MessageSubType;Ljava/lang/String;Lcom/huami/message/dto/NoticeType;Lcom/huami/message/dto/MessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/message/dto/MessageType;Ljava/lang/String;Lcom/huami/message/dto/ResourceType;Lcom/huami/message/dto/FollowStatus;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SubMessageItemVo {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    @Nullable
    private final FollowStatus followStatus;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long messageId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer count;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String dataType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String day;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String followeeId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final String from;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromFirstCommentId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromPostId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromSecondCommentId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromTopicId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long generateTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long generatedTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @Nullable
    private final String hrvType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @Nullable
    private final String iconUrl;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @Nullable
    private final String memberId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @Nullable
    private final MessageSubType messageSubType;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    @Nullable
    private final String nickName;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    @Nullable
    private final NoticeType noticeType;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    @Nullable
    private final MessageStatus status;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    @Nullable
    private final String text;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subText;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
    @Nullable
    private final MessageType type;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
    @Nullable
    private final String resource;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
    @Nullable
    private final ResourceType resourceType;

    public SubMessageItemVo(long j, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Long l, @Nullable Long l2, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable MessageSubType messageSubType, @Nullable String str13, @Nullable NoticeType noticeType, @Nullable MessageStatus messageStatus, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable MessageType messageType, @Nullable String str17, @Nullable ResourceType resourceType, @Nullable FollowStatus followStatus) {
        this.messageId = j;
        this.count = num;
        this.dataType = str;
        this.day = str2;
        this.description = str3;
        this.followeeId = str4;
        this.from = str5;
        this.fromFirstCommentId = str6;
        this.fromPostId = str7;
        this.fromSecondCommentId = str8;
        this.fromTopicId = str9;
        this.generateTime = l;
        this.generatedTime = l2;
        this.hrvType = str10;
        this.iconUrl = str11;
        this.memberId = str12;
        this.messageSubType = messageSubType;
        this.nickName = str13;
        this.noticeType = noticeType;
        this.status = messageStatus;
        this.text = str14;
        this.subText = str15;
        this.title = str16;
        this.type = messageType;
        this.resource = str17;
        this.resourceType = resourceType;
        this.followStatus = followStatus;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFromSecondCommentId() {
        return this.fromSecondCommentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFromTopicId() {
        return this.fromTopicId;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getGenerateTime() {
        return this.generateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getGeneratedTime() {
        return this.generatedTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getHrvType() {
        return this.hrvType;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final MessageSubType getMessageSubType() {
        return this.messageSubType;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final NoticeType getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final MessageStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final MessageType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getResource() {
        return this.resource;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final ResourceType getResourceType() {
        return this.resourceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final FollowStatus getFollowStatus() {
        return this.followStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDataType() {
        return this.dataType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFolloweeId() {
        return this.followeeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFromFirstCommentId() {
        return this.fromFirstCommentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFromPostId() {
        return this.fromPostId;
    }

    @NotNull
    public final SubMessageItemVo copy(long messageId, @Nullable Integer count, @Nullable String dataType, @Nullable String day, @Nullable String description, @Nullable String followeeId, @Nullable String from, @Nullable String fromFirstCommentId, @Nullable String fromPostId, @Nullable String fromSecondCommentId, @Nullable String fromTopicId, @Nullable Long generateTime, @Nullable Long generatedTime, @Nullable String hrvType, @Nullable String iconUrl, @Nullable String memberId, @Nullable MessageSubType messageSubType, @Nullable String nickName, @Nullable NoticeType noticeType, @Nullable MessageStatus status, @Nullable String text, @Nullable String subText, @Nullable String title, @Nullable MessageType type, @Nullable String resource, @Nullable ResourceType resourceType, @Nullable FollowStatus followStatus) {
        return new SubMessageItemVo(messageId, count, dataType, day, description, followeeId, from, fromFirstCommentId, fromPostId, fromSecondCommentId, fromTopicId, generateTime, generatedTime, hrvType, iconUrl, memberId, messageSubType, nickName, noticeType, status, text, subText, title, type, resource, resourceType, followStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubMessageItemVo)) {
            return false;
        }
        SubMessageItemVo subMessageItemVo = (SubMessageItemVo) other;
        return this.messageId == subMessageItemVo.messageId && Intrinsics.areEqual(this.count, subMessageItemVo.count) && Intrinsics.areEqual(this.dataType, subMessageItemVo.dataType) && Intrinsics.areEqual(this.day, subMessageItemVo.day) && Intrinsics.areEqual(this.description, subMessageItemVo.description) && Intrinsics.areEqual(this.followeeId, subMessageItemVo.followeeId) && Intrinsics.areEqual(this.from, subMessageItemVo.from) && Intrinsics.areEqual(this.fromFirstCommentId, subMessageItemVo.fromFirstCommentId) && Intrinsics.areEqual(this.fromPostId, subMessageItemVo.fromPostId) && Intrinsics.areEqual(this.fromSecondCommentId, subMessageItemVo.fromSecondCommentId) && Intrinsics.areEqual(this.fromTopicId, subMessageItemVo.fromTopicId) && Intrinsics.areEqual(this.generateTime, subMessageItemVo.generateTime) && Intrinsics.areEqual(this.generatedTime, subMessageItemVo.generatedTime) && Intrinsics.areEqual(this.hrvType, subMessageItemVo.hrvType) && Intrinsics.areEqual(this.iconUrl, subMessageItemVo.iconUrl) && Intrinsics.areEqual(this.memberId, subMessageItemVo.memberId) && this.messageSubType == subMessageItemVo.messageSubType && Intrinsics.areEqual(this.nickName, subMessageItemVo.nickName) && this.noticeType == subMessageItemVo.noticeType && this.status == subMessageItemVo.status && Intrinsics.areEqual(this.text, subMessageItemVo.text) && Intrinsics.areEqual(this.subText, subMessageItemVo.subText) && Intrinsics.areEqual(this.title, subMessageItemVo.title) && this.type == subMessageItemVo.type && Intrinsics.areEqual(this.resource, subMessageItemVo.resource) && this.resourceType == subMessageItemVo.resourceType && this.followStatus == subMessageItemVo.followStatus;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final String getDataType() {
        return this.dataType;
    }

    @Nullable
    public final String getDay() {
        return this.day;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final FollowStatus getFollowStatus() {
        return this.followStatus;
    }

    @Nullable
    public final String getFolloweeId() {
        return this.followeeId;
    }

    @Nullable
    public final String getFrom() {
        return this.from;
    }

    @Nullable
    public final String getFromFirstCommentId() {
        return this.fromFirstCommentId;
    }

    @Nullable
    public final String getFromPostId() {
        return this.fromPostId;
    }

    @Nullable
    public final String getFromSecondCommentId() {
        return this.fromSecondCommentId;
    }

    @Nullable
    public final String getFromTopicId() {
        return this.fromTopicId;
    }

    @Nullable
    public final Long getGenerateTime() {
        return this.generateTime;
    }

    @Nullable
    public final Long getGeneratedTime() {
        return this.generatedTime;
    }

    @Nullable
    public final String getHrvType() {
        return this.hrvType;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final MessageSubType getMessageSubType() {
        return this.messageSubType;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final NoticeType getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    public final String getResource() {
        return this.resource;
    }

    @Nullable
    public final ResourceType getResourceType() {
        return this.resourceType;
    }

    @Nullable
    public final MessageStatus getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSubText() {
        return this.subText;
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
    public final MessageType getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = defpackage.b.a(this.messageId) * 31;
        Integer num = this.count;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.dataType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.day;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.followeeId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.from;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fromFirstCommentId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fromPostId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fromSecondCommentId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fromTopicId;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l = this.generateTime;
        int iHashCode11 = (iHashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.generatedTime;
        int iHashCode12 = (iHashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str10 = this.hrvType;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.iconUrl;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.memberId;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        MessageSubType messageSubType = this.messageSubType;
        int iHashCode16 = (iHashCode15 + (messageSubType == null ? 0 : messageSubType.hashCode())) * 31;
        String str13 = this.nickName;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        NoticeType noticeType = this.noticeType;
        int iHashCode18 = (iHashCode17 + (noticeType == null ? 0 : noticeType.hashCode())) * 31;
        MessageStatus messageStatus = this.status;
        int iHashCode19 = (iHashCode18 + (messageStatus == null ? 0 : messageStatus.hashCode())) * 31;
        String str14 = this.text;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.subText;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.title;
        int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        MessageType messageType = this.type;
        int iHashCode23 = (iHashCode22 + (messageType == null ? 0 : messageType.hashCode())) * 31;
        String str17 = this.resource;
        int iHashCode24 = (iHashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        ResourceType resourceType = this.resourceType;
        int iHashCode25 = (iHashCode24 + (resourceType == null ? 0 : resourceType.hashCode())) * 31;
        FollowStatus followStatus = this.followStatus;
        return iHashCode25 + (followStatus != null ? followStatus.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubMessageItemVo(messageId=" + this.messageId + ", count=" + this.count + ", dataType=" + ((Object) this.dataType) + ", day=" + ((Object) this.day) + ", description=" + ((Object) this.description) + ", followeeId=" + ((Object) this.followeeId) + ", from=" + ((Object) this.from) + ", fromFirstCommentId=" + ((Object) this.fromFirstCommentId) + ", fromPostId=" + ((Object) this.fromPostId) + ", fromSecondCommentId=" + ((Object) this.fromSecondCommentId) + ", fromTopicId=" + ((Object) this.fromTopicId) + ", generateTime=" + this.generateTime + ", generatedTime=" + this.generatedTime + ", hrvType=" + ((Object) this.hrvType) + ", iconUrl=" + ((Object) this.iconUrl) + ", memberId=" + ((Object) this.memberId) + ", messageSubType=" + this.messageSubType + ", nickName=" + ((Object) this.nickName) + ", noticeType=" + this.noticeType + ", status=" + this.status + ", text=" + ((Object) this.text) + ", subText=" + ((Object) this.subText) + ", title=" + ((Object) this.title) + ", type=" + this.type + ", resource=" + ((Object) this.resource) + ", resourceType=" + this.resourceType + ", followStatus=" + this.followStatus + ')';
    }

    public /* synthetic */ SubMessageItemVo(long j, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Long l2, String str10, String str11, String str12, MessageSubType messageSubType, String str13, NoticeType noticeType, MessageStatus messageStatus, String str14, String str15, String str16, MessageType messageType, String str17, ResourceType resourceType, FollowStatus followStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : l, (i & 4096) != 0 ? null : l2, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (32768 & i) != 0 ? null : str12, (65536 & i) != 0 ? null : messageSubType, (131072 & i) != 0 ? null : str13, (262144 & i) != 0 ? null : noticeType, (524288 & i) != 0 ? null : messageStatus, (1048576 & i) != 0 ? null : str14, (2097152 & i) != 0 ? null : str15, (4194304 & i) != 0 ? null : str16, (8388608 & i) != 0 ? null : messageType, (16777216 & i) != 0 ? null : str17, (33554432 & i) != 0 ? null : resourceType, (i & 67108864) != 0 ? null : followStatus);
    }
}
