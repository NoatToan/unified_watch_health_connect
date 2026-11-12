package com.huami.message.db.po;

import androidx.exifinterface.media.ExifInterface;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.api.WebConst;
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
@Entity(indices = {@Index(unique = true, value = {WebConst.QueryParam.MESSAGE_ID})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b=\n\u0002\u0010\u000b\n\u0002\bH\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\b¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003Jè\u0002\u0010A\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\bA\u0010BJ\t\u0010C\u001a\u00020\bHÖ\u0001J\t\u0010D\u001a\u00020\u0002HÖ\u0001J\u0013\u0010G\u001a\u00020F2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0019\u0010%\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001b\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010\u0007R\u001b\u0010'\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001b\u0010(\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010XR\u001b\u0010)\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010XR\u001b\u0010*\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b]\u0010V\u001a\u0004\b^\u0010XR\u001b\u0010+\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b_\u0010V\u001a\u0004\b`\u0010XR\u001b\u0010,\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\ba\u0010V\u001a\u0004\bb\u0010XR\u001b\u0010-\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bc\u0010V\u001a\u0004\bd\u0010XR\u001b\u0010.\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\be\u0010V\u001a\u0004\bf\u0010XR\u001b\u0010/\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bg\u0010V\u001a\u0004\bh\u0010XR\u001b\u00100\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010\u0013R\u001b\u00101\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\bl\u0010j\u001a\u0004\bm\u0010\u0013R\u001b\u00102\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bn\u0010V\u001a\u0004\bo\u0010XR\u001b\u00103\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bp\u0010V\u001a\u0004\bq\u0010XR\u001b\u00104\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\br\u0010V\u001a\u0004\bs\u0010XR\u001b\u00105\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bt\u0010V\u001a\u0004\bu\u0010XR\u001b\u00106\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bv\u0010V\u001a\u0004\bw\u0010XR\u001b\u00107\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bx\u0010V\u001a\u0004\by\u0010XR\u001b\u00108\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bz\u0010V\u001a\u0004\b{\u0010XR\u001b\u00109\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b|\u0010V\u001a\u0004\b}\u0010XR\u001b\u0010:\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b~\u0010V\u001a\u0004\b\u007f\u0010XR\u001d\u0010;\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010V\u001a\u0005\b\u0081\u0001\u0010XR\u001d\u0010<\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010V\u001a\u0005\b\u0083\u0001\u0010XR\u001d\u0010=\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010V\u001a\u0005\b\u0085\u0001\u0010XR\u001d\u0010>\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010V\u001a\u0005\b\u0087\u0001\u0010XR\u001d\u0010?\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010V\u001a\u0005\b\u0089\u0001\u0010XR\u001d\u0010@\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010V\u001a\u0005\b\u008b\u0001\u0010X¨\u0006\u008e\u0001"}, d2 = {"Lcom/huami/message/db/po/SubMessagePo;", "", "", "component1", "", "component2", "component3", "()Ljava/lang/Integer;", "", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/lang/Long;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "id", WebConst.QueryParam.MESSAGE_ID, "count", "dataType", "day", "description", "followeeId", "from", "fromFirstCommentId", "fromPostId", "fromSecondCommentId", "fromTopicId", "generateTime", "generatedTime", "hrvType", "iconUrl", ParamKey.memberId, WebConst.QueryParam.MESSAGE_SUB_TYPE, "nickName", WebConst.QueryParam.NOTICE_TYPE, "status", "subType", "text", "subText", "title", "type", "resource", "resourceType", "followStatus", "copy", "(IJLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/message/db/po/SubMessagePo;", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getId", "()I", com.huami.sleepassistant.apilib.utils.WebConst.QueryParam.SET_ID, "(I)V", "b", "J", "getMessageId", "()J", "c", "Ljava/lang/Integer;", "getCount", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getDataType", "()Ljava/lang/String;", "e", "getDay", "f", "getDescription", "g", "getFolloweeId", "h", "getFrom", "i", "getFromFirstCommentId", z.j, "getFromPostId", hl.k, "getFromSecondCommentId", "l", "getFromTopicId", "m", "Ljava/lang/Long;", "getGenerateTime", GoogleApiAvailabilityLight.b, "getGeneratedTime", "o", "getHrvType", b.r, "getIconUrl", DTransferConstants.SEARCH_KEY, "getMemberId", "r", "getMessageSubType", SOAP.XMLNS, "getNickName", "t", "getNoticeType", "u", "getStatus", "v", "getSubType", "w", "getText", "x", "getSubText", "y", "getTitle", "z", "getType", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getResource", "B", "getResourceType", "C", "getFollowStatus", "<init>", "(IJLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SubMessagePo {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    @Nullable
    private final String resource;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    @Nullable
    private final String resourceType;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    @Nullable
    private final String followStatus;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey(autoGenerate = true)
    private int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long messageId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer count;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String dataType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String day;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final String followeeId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final String from;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromFirstCommentId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromPostId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromSecondCommentId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromTopicId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long generateTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long generatedTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @Nullable
    private final String hrvType;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @Nullable
    private final String iconUrl;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @Nullable
    private final String memberId;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    @Nullable
    private final String messageSubType;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    @Nullable
    private final String nickName;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    @Nullable
    private final String noticeType;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    @Nullable
    private final String status;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subType;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    @Nullable
    private final String text;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subText;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
    @Nullable
    private final String type;

    public SubMessagePo(int i, long j, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Long l, @Nullable Long l2, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24) {
        this.id = i;
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
        this.messageSubType = str13;
        this.nickName = str14;
        this.noticeType = str15;
        this.status = str16;
        this.subType = str17;
        this.text = str18;
        this.subText = str19;
        this.title = str20;
        this.type = str21;
        this.resource = str22;
        this.resourceType = str23;
        this.followStatus = str24;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFromPostId() {
        return this.fromPostId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFromSecondCommentId() {
        return this.fromSecondCommentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFromTopicId() {
        return this.fromTopicId;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getGenerateTime() {
        return this.generateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getGeneratedTime() {
        return this.generatedTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getHrvType() {
        return this.hrvType;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMessageSubType() {
        return this.messageSubType;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getResource() {
        return this.resource;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getResourceType() {
        return this.resourceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getFollowStatus() {
        return this.followStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDataType() {
        return this.dataType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFolloweeId() {
        return this.followeeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFromFirstCommentId() {
        return this.fromFirstCommentId;
    }

    @NotNull
    public final SubMessagePo copy(int id, long messageId, @Nullable Integer count, @Nullable String dataType, @Nullable String day, @Nullable String description, @Nullable String followeeId, @Nullable String from, @Nullable String fromFirstCommentId, @Nullable String fromPostId, @Nullable String fromSecondCommentId, @Nullable String fromTopicId, @Nullable Long generateTime, @Nullable Long generatedTime, @Nullable String hrvType, @Nullable String iconUrl, @Nullable String memberId, @Nullable String messageSubType, @Nullable String nickName, @Nullable String noticeType, @Nullable String status, @Nullable String subType, @Nullable String text, @Nullable String subText, @Nullable String title, @Nullable String type, @Nullable String resource, @Nullable String resourceType, @Nullable String followStatus) {
        return new SubMessagePo(id, messageId, count, dataType, day, description, followeeId, from, fromFirstCommentId, fromPostId, fromSecondCommentId, fromTopicId, generateTime, generatedTime, hrvType, iconUrl, memberId, messageSubType, nickName, noticeType, status, subType, text, subText, title, type, resource, resourceType, followStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubMessagePo)) {
            return false;
        }
        SubMessagePo subMessagePo = (SubMessagePo) other;
        return this.id == subMessagePo.id && this.messageId == subMessagePo.messageId && Intrinsics.areEqual(this.count, subMessagePo.count) && Intrinsics.areEqual(this.dataType, subMessagePo.dataType) && Intrinsics.areEqual(this.day, subMessagePo.day) && Intrinsics.areEqual(this.description, subMessagePo.description) && Intrinsics.areEqual(this.followeeId, subMessagePo.followeeId) && Intrinsics.areEqual(this.from, subMessagePo.from) && Intrinsics.areEqual(this.fromFirstCommentId, subMessagePo.fromFirstCommentId) && Intrinsics.areEqual(this.fromPostId, subMessagePo.fromPostId) && Intrinsics.areEqual(this.fromSecondCommentId, subMessagePo.fromSecondCommentId) && Intrinsics.areEqual(this.fromTopicId, subMessagePo.fromTopicId) && Intrinsics.areEqual(this.generateTime, subMessagePo.generateTime) && Intrinsics.areEqual(this.generatedTime, subMessagePo.generatedTime) && Intrinsics.areEqual(this.hrvType, subMessagePo.hrvType) && Intrinsics.areEqual(this.iconUrl, subMessagePo.iconUrl) && Intrinsics.areEqual(this.memberId, subMessagePo.memberId) && Intrinsics.areEqual(this.messageSubType, subMessagePo.messageSubType) && Intrinsics.areEqual(this.nickName, subMessagePo.nickName) && Intrinsics.areEqual(this.noticeType, subMessagePo.noticeType) && Intrinsics.areEqual(this.status, subMessagePo.status) && Intrinsics.areEqual(this.subType, subMessagePo.subType) && Intrinsics.areEqual(this.text, subMessagePo.text) && Intrinsics.areEqual(this.subText, subMessagePo.subText) && Intrinsics.areEqual(this.title, subMessagePo.title) && Intrinsics.areEqual(this.type, subMessagePo.type) && Intrinsics.areEqual(this.resource, subMessagePo.resource) && Intrinsics.areEqual(this.resourceType, subMessagePo.resourceType) && Intrinsics.areEqual(this.followStatus, subMessagePo.followStatus);
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
    public final String getFollowStatus() {
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

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final String getMessageSubType() {
        return this.messageSubType;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final String getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    public final String getResource() {
        return this.resource;
    }

    @Nullable
    public final String getResourceType() {
        return this.resourceType;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSubText() {
        return this.subText;
    }

    @Nullable
    public final String getSubType() {
        return this.subType;
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
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = ((this.id * 31) + defpackage.b.a(this.messageId)) * 31;
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
        String str13 = this.messageSubType;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.nickName;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.noticeType;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.status;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.subType;
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.text;
        int iHashCode21 = (iHashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.subText;
        int iHashCode22 = (iHashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.title;
        int iHashCode23 = (iHashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.type;
        int iHashCode24 = (iHashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.resource;
        int iHashCode25 = (iHashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.resourceType;
        int iHashCode26 = (iHashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.followStatus;
        return iHashCode26 + (str24 != null ? str24.hashCode() : 0);
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public String toString() {
        return "SubMessagePo(id=" + this.id + ", messageId=" + this.messageId + ", count=" + this.count + ", dataType=" + ((Object) this.dataType) + ", day=" + ((Object) this.day) + ", description=" + ((Object) this.description) + ", followeeId=" + ((Object) this.followeeId) + ", from=" + ((Object) this.from) + ", fromFirstCommentId=" + ((Object) this.fromFirstCommentId) + ", fromPostId=" + ((Object) this.fromPostId) + ", fromSecondCommentId=" + ((Object) this.fromSecondCommentId) + ", fromTopicId=" + ((Object) this.fromTopicId) + ", generateTime=" + this.generateTime + ", generatedTime=" + this.generatedTime + ", hrvType=" + ((Object) this.hrvType) + ", iconUrl=" + ((Object) this.iconUrl) + ", memberId=" + ((Object) this.memberId) + ", messageSubType=" + ((Object) this.messageSubType) + ", nickName=" + ((Object) this.nickName) + ", noticeType=" + ((Object) this.noticeType) + ", status=" + ((Object) this.status) + ", subType=" + ((Object) this.subType) + ", text=" + ((Object) this.text) + ", subText=" + ((Object) this.subText) + ", title=" + ((Object) this.title) + ", type=" + ((Object) this.type) + ", resource=" + ((Object) this.resource) + ", resourceType=" + ((Object) this.resourceType) + ", followStatus=" + ((Object) this.followStatus) + ')';
    }

    public /* synthetic */ SubMessagePo(int i, long j, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Long l2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, j, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? null : str7, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : str9, (i2 & 4096) != 0 ? null : l, (i2 & 8192) != 0 ? null : l2, (i2 & 16384) != 0 ? null : str10, (32768 & i2) != 0 ? null : str11, (65536 & i2) != 0 ? null : str12, (131072 & i2) != 0 ? null : str13, (262144 & i2) != 0 ? null : str14, (524288 & i2) != 0 ? null : str15, (1048576 & i2) != 0 ? null : str16, (2097152 & i2) != 0 ? null : str17, (4194304 & i2) != 0 ? null : str18, (8388608 & i2) != 0 ? null : str19, (16777216 & i2) != 0 ? null : str20, (33554432 & i2) != 0 ? null : str21, (67108864 & i2) != 0 ? null : str22, (134217728 & i2) != 0 ? null : str23, (i2 & 268435456) != 0 ? null : str24);
    }
}
