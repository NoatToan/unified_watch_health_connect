package com.huami.message.vo;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bE\u0010FJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u0004J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0094\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0004\"\u0004\b%\u0010&R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u0004\"\u0004\b)\u0010&R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010\u0004\"\u0004\b,\u0010&R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u0004\"\u0004\b/\u0010&R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010#\u001a\u0004\b1\u0010\u0004\"\u0004\b2\u0010&R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010#\u001a\u0004\b4\u0010\u0004\"\u0004\b5\u0010&R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010#\u001a\u0004\b7\u0010\u0004\"\u0004\b8\u0010&R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010#\u001a\u0004\b:\u0010\u0004\"\u0004\b;\u0010&R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010#\u001a\u0004\b=\u0010\u0004\"\u0004\b>\u0010&R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010#\u001a\u0004\b@\u0010\u0004\"\u0004\bA\u0010&R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010#\u001a\u0004\bC\u0010\u0004\"\u0004\bD\u0010&¨\u0006G"}, d2 = {"Lcom/huami/message/vo/UnreadMessageVo;", "", "", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "allCount", "noticeCount", "messageCount", "praiseFavFollowCnt", "commentReplyCnt", "chatCnt", "praiseCnt", "favoriteCnt", "followCnt", "commentCnt", "replyCnt", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huami/message/vo/UnreadMessageVo;", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "getAllCount", "setAllCount", "(Ljava/lang/Integer;)V", "b", "getNoticeCount", "setNoticeCount", "c", "getMessageCount", "setMessageCount", GoogleApiAvailabilityLight.a, "getPraiseFavFollowCnt", "setPraiseFavFollowCnt", "e", "getCommentReplyCnt", "setCommentReplyCnt", "f", "getChatCnt", "setChatCnt", "g", "getPraiseCnt", "setPraiseCnt", "h", "getFavoriteCnt", "setFavoriteCnt", "i", "getFollowCnt", "setFollowCnt", z.j, "getCommentCnt", "setCommentCnt", hl.k, "getReplyCnt", "setReplyCnt", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UnreadMessageVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer allCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer noticeCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer messageCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer praiseFavFollowCnt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer commentReplyCnt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer chatCnt;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer praiseCnt;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer favoriteCnt;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer followCnt;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer commentCnt;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer replyCnt;

    public UnreadMessageVo() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public UnreadMessageVo(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11) {
        this.allCount = num;
        this.noticeCount = num2;
        this.messageCount = num3;
        this.praiseFavFollowCnt = num4;
        this.commentReplyCnt = num5;
        this.chatCnt = num6;
        this.praiseCnt = num7;
        this.favoriteCnt = num8;
        this.followCnt = num9;
        this.commentCnt = num10;
        this.replyCnt = num11;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAllCount() {
        return this.allCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getCommentCnt() {
        return this.commentCnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getReplyCnt() {
        return this.replyCnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getNoticeCount() {
        return this.noticeCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMessageCount() {
        return this.messageCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPraiseFavFollowCnt() {
        return this.praiseFavFollowCnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getCommentReplyCnt() {
        return this.commentReplyCnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getChatCnt() {
        return this.chatCnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getPraiseCnt() {
        return this.praiseCnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getFavoriteCnt() {
        return this.favoriteCnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getFollowCnt() {
        return this.followCnt;
    }

    @NotNull
    public final UnreadMessageVo copy(@Nullable Integer allCount, @Nullable Integer noticeCount, @Nullable Integer messageCount, @Nullable Integer praiseFavFollowCnt, @Nullable Integer commentReplyCnt, @Nullable Integer chatCnt, @Nullable Integer praiseCnt, @Nullable Integer favoriteCnt, @Nullable Integer followCnt, @Nullable Integer commentCnt, @Nullable Integer replyCnt) {
        return new UnreadMessageVo(allCount, noticeCount, messageCount, praiseFavFollowCnt, commentReplyCnt, chatCnt, praiseCnt, favoriteCnt, followCnt, commentCnt, replyCnt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadMessageVo)) {
            return false;
        }
        UnreadMessageVo unreadMessageVo = (UnreadMessageVo) other;
        return Intrinsics.areEqual(this.allCount, unreadMessageVo.allCount) && Intrinsics.areEqual(this.noticeCount, unreadMessageVo.noticeCount) && Intrinsics.areEqual(this.messageCount, unreadMessageVo.messageCount) && Intrinsics.areEqual(this.praiseFavFollowCnt, unreadMessageVo.praiseFavFollowCnt) && Intrinsics.areEqual(this.commentReplyCnt, unreadMessageVo.commentReplyCnt) && Intrinsics.areEqual(this.chatCnt, unreadMessageVo.chatCnt) && Intrinsics.areEqual(this.praiseCnt, unreadMessageVo.praiseCnt) && Intrinsics.areEqual(this.favoriteCnt, unreadMessageVo.favoriteCnt) && Intrinsics.areEqual(this.followCnt, unreadMessageVo.followCnt) && Intrinsics.areEqual(this.commentCnt, unreadMessageVo.commentCnt) && Intrinsics.areEqual(this.replyCnt, unreadMessageVo.replyCnt);
    }

    @Nullable
    public final Integer getAllCount() {
        return this.allCount;
    }

    @Nullable
    public final Integer getChatCnt() {
        return this.chatCnt;
    }

    @Nullable
    public final Integer getCommentCnt() {
        return this.commentCnt;
    }

    @Nullable
    public final Integer getCommentReplyCnt() {
        return this.commentReplyCnt;
    }

    @Nullable
    public final Integer getFavoriteCnt() {
        return this.favoriteCnt;
    }

    @Nullable
    public final Integer getFollowCnt() {
        return this.followCnt;
    }

    @Nullable
    public final Integer getMessageCount() {
        return this.messageCount;
    }

    @Nullable
    public final Integer getNoticeCount() {
        return this.noticeCount;
    }

    @Nullable
    public final Integer getPraiseCnt() {
        return this.praiseCnt;
    }

    @Nullable
    public final Integer getPraiseFavFollowCnt() {
        return this.praiseFavFollowCnt;
    }

    @Nullable
    public final Integer getReplyCnt() {
        return this.replyCnt;
    }

    public int hashCode() {
        Integer num = this.allCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.noticeCount;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.messageCount;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.praiseFavFollowCnt;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.commentReplyCnt;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.chatCnt;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.praiseCnt;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.favoriteCnt;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.followCnt;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.commentCnt;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.replyCnt;
        return iHashCode10 + (num11 != null ? num11.hashCode() : 0);
    }

    public final void setAllCount(@Nullable Integer num) {
        this.allCount = num;
    }

    public final void setChatCnt(@Nullable Integer num) {
        this.chatCnt = num;
    }

    public final void setCommentCnt(@Nullable Integer num) {
        this.commentCnt = num;
    }

    public final void setCommentReplyCnt(@Nullable Integer num) {
        this.commentReplyCnt = num;
    }

    public final void setFavoriteCnt(@Nullable Integer num) {
        this.favoriteCnt = num;
    }

    public final void setFollowCnt(@Nullable Integer num) {
        this.followCnt = num;
    }

    public final void setMessageCount(@Nullable Integer num) {
        this.messageCount = num;
    }

    public final void setNoticeCount(@Nullable Integer num) {
        this.noticeCount = num;
    }

    public final void setPraiseCnt(@Nullable Integer num) {
        this.praiseCnt = num;
    }

    public final void setPraiseFavFollowCnt(@Nullable Integer num) {
        this.praiseFavFollowCnt = num;
    }

    public final void setReplyCnt(@Nullable Integer num) {
        this.replyCnt = num;
    }

    @NotNull
    public String toString() {
        return "UnreadMessageVo(allCount=" + this.allCount + ", noticeCount=" + this.noticeCount + ", messageCount=" + this.messageCount + ", praiseFavFollowCnt=" + this.praiseFavFollowCnt + ", commentReplyCnt=" + this.commentReplyCnt + ", chatCnt=" + this.chatCnt + ", praiseCnt=" + this.praiseCnt + ", favoriteCnt=" + this.favoriteCnt + ", followCnt=" + this.followCnt + ", commentCnt=" + this.commentCnt + ", replyCnt=" + this.replyCnt + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UnreadMessageVo(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num12 = 0;
        this((i & 1) != 0 ? num12 : num, (i & 2) != 0 ? num12 : num2, (i & 4) != 0 ? num12 : num3, (i & 8) != 0 ? num12 : num4, (i & 16) != 0 ? num12 : num5, (i & 32) != 0 ? num12 : num6, (i & 64) != 0 ? num12 : num7, (i & 128) != 0 ? num12 : num8, (i & 256) != 0 ? num12 : num9, (i & 512) != 0 ? num12 : num10, (i & 1024) == 0 ? num11 : 0);
    }
}
