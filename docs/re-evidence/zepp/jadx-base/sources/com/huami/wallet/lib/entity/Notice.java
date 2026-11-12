package com.huami.wallet.lib.entity;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.message.api.WebConst;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import defpackage.b;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b#\b\u0086\b\u0018\u0000 B2\u00020\u0001:\u0001BBu\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b@\u0010AJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u008d\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00022\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0015\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u0019\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u0017\u00107R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u00102R\u0019\u0010\u0019\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00102R\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010$\u001a\u0004\b=\u0010&R!\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010,\u001a\u0004\b?\u0010.¨\u0006C"}, d2 = {"Lcom/huami/wallet/lib/entity/Notice;", "Ljava/io/Serializable;", "", "component1", "component2", "component3", "", "", "component4", "component5", "component6", "", "component7", "component8", "component9", "component10", "component11", "id", "startTime", "endTime", "appCode", DbUtils.Const.Table.CONTEXT, WebConst.QueryParam.NOTICE_TYPE, "isSupportCrossBarJump", "crossBarJumpUrl", "loopType", EcgData.TIMESTAMP_SERVER_UPDATED, "actionType", "copy", "toString", "", "hashCode", "", "other", "equals", "a", "J", "getId", "()J", "b", "getStartTime", "c", "getEndTime", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getAppCode", "()Ljava/util/List;", "e", "Ljava/lang/String;", "getContext", "()Ljava/lang/String;", "f", "getNoticeType", "g", "Z", "()Z", "h", "getCrossBarJumpUrl", "i", "getLoopType", z.j, "getUpdateTime", hl.k, "getActionType", "<init>", "(JJJLjava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;JLjava/util/List;)V", "Companion", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Notice implements Serializable {

    @NotNull
    public static final String TYPE_CROSS_BAR = "CROSS_BAR";

    @NotNull
    public static final String TYPE_POP_UP = "POP_UP";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long startTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long endTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<String> appCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String context;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<String> noticeType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean isSupportCrossBarJump;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final String crossBarJumpUrl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final String loopType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final long updateTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<String> actionType;

    public Notice(long j, long j2, long j3, @NotNull List<String> list, @NotNull String str, @NotNull List<String> list2, boolean z, @Nullable String str2, @NotNull String str3, long j4, @Nullable List<String> list3) {
        this.id = j;
        this.startTime = j2;
        this.endTime = j3;
        this.appCode = list;
        this.context = str;
        this.noticeType = list2;
        this.isSupportCrossBarJump = z;
        this.crossBarJumpUrl = str2;
        this.loopType = str3;
        this.updateTime = j4;
        this.actionType = list3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final List<String> component11() {
        return this.actionType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final List<String> component4() {
        return this.appCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final List<String> component6() {
        return this.noticeType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsSupportCrossBarJump() {
        return this.isSupportCrossBarJump;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCrossBarJumpUrl() {
        return this.crossBarJumpUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLoopType() {
        return this.loopType;
    }

    @NotNull
    public final Notice copy(long id, long startTime, long endTime, @NotNull List<String> appCode, @NotNull String context, @NotNull List<String> noticeType, boolean isSupportCrossBarJump, @Nullable String crossBarJumpUrl, @NotNull String loopType, long updateTime, @Nullable List<String> actionType) {
        return new Notice(id, startTime, endTime, appCode, context, noticeType, isSupportCrossBarJump, crossBarJumpUrl, loopType, updateTime, actionType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Notice)) {
            return false;
        }
        Notice notice = (Notice) other;
        return this.id == notice.id && this.startTime == notice.startTime && this.endTime == notice.endTime && Intrinsics.areEqual(this.appCode, notice.appCode) && Intrinsics.areEqual(this.context, notice.context) && Intrinsics.areEqual(this.noticeType, notice.noticeType) && this.isSupportCrossBarJump == notice.isSupportCrossBarJump && Intrinsics.areEqual(this.crossBarJumpUrl, notice.crossBarJumpUrl) && Intrinsics.areEqual(this.loopType, notice.loopType) && this.updateTime == notice.updateTime && Intrinsics.areEqual(this.actionType, notice.actionType);
    }

    @Nullable
    public final List<String> getActionType() {
        return this.actionType;
    }

    @NotNull
    public final List<String> getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final String getContext() {
        return this.context;
    }

    @Nullable
    public final String getCrossBarJumpUrl() {
        return this.crossBarJumpUrl;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getLoopType() {
        return this.loopType;
    }

    @NotNull
    public final List<String> getNoticeType() {
        return this.noticeType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    public int hashCode() {
        int iA = ((((((((((b.a(this.id) * 31) + b.a(this.startTime)) * 31) + b.a(this.endTime)) * 31) + this.appCode.hashCode()) * 31) + this.context.hashCode()) * 31) + this.noticeType.hashCode()) * 31;
        boolean z = this.isSupportCrossBarJump;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iA + r1) * 31;
        String str = this.crossBarJumpUrl;
        int iHashCode = (((((i + (str == null ? 0 : str.hashCode())) * 31) + this.loopType.hashCode()) * 31) + b.a(this.updateTime)) * 31;
        List<String> list = this.actionType;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final boolean isSupportCrossBarJump() {
        return this.isSupportCrossBarJump;
    }

    @NotNull
    public String toString() {
        return "Notice(id=" + this.id + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", appCode=" + this.appCode + ", context=" + this.context + ", noticeType=" + this.noticeType + ", isSupportCrossBarJump=" + this.isSupportCrossBarJump + ", crossBarJumpUrl=" + ((Object) this.crossBarJumpUrl) + ", loopType=" + this.loopType + ", updateTime=" + this.updateTime + ", actionType=" + this.actionType + ')';
    }
}
