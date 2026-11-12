package com.ximalaya.ting.android.opensdk.model.album;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.model.pay.AlbumPriceTypeDetail;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class Album implements Parcelable {
    public static final int ALBUM_PRICE_TYPE_SINGLE = 1;
    public static final int ALBUM_PRICE_TYPE_WHOLE = 2;
    public static final Parcelable.Creator<Album> CREATOR = new Parcelable.Creator<Album>() { // from class: com.ximalaya.ting.android.opensdk.model.album.Album.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Album createFromParcel(Parcel parcel) {
            return new Album(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Album[] newArray(int i) {
            return new Album[i];
        }
    };

    @SerializedName("album_intro")
    private String albumIntro;

    @SerializedName("album_rich_intro")
    private String albumRichIntro;

    @SerializedName("album_score")
    private String albumScore;

    @SerializedName("album_tags")
    private String albumTags;

    @SerializedName(alternate = {"title"}, value = DTransferConstants.ALBUM_TITLE)
    private String albumTitle;

    @SerializedName("announcer")
    private Announcer announcer;

    @SerializedName("based_relative_album_id")
    private long basedRelativeAlbumId;

    @SerializedName("bought_track_ids")
    private String boughtTrackIds;

    @SerializedName("buy_notes")
    private String buyNotes;

    @SerializedName("can_download")
    private boolean canDownload;

    @SerializedName(DTransferConstants.CATEGORY_ID)
    private int categoryId;

    @SerializedName("composed_price_type")
    private int composedPriceType;

    @SerializedName("cover_url_large")
    private String coverUrlLarge;

    @SerializedName("cover_url_middle")
    private String coverUrlMiddle;

    @SerializedName("cover_url_small")
    private String coverUrlSmall;

    @SerializedName("created_at")
    private long createdAt;

    @SerializedName("detail_banner_url")
    private String detailBannerUrl;

    @SerializedName("estimated_track_count")
    private int estimatedTrackCount;

    @SerializedName("expected_revenue")
    private String expectedRevenue;

    @SerializedName("favorite_count")
    private long favoriteCount;

    @SerializedName("free_track_count")
    private int freeTrackCount;

    @SerializedName("free_track_ids")
    private String freeTrackIds;

    @SerializedName("has_sample")
    private boolean hasSample;

    @SerializedName(alternate = {DTransferConstants.ALBUMID}, value = "id")
    private long id;

    @SerializedName("include_track_count")
    private long includeTrackCount;

    @SerializedName("is_finished")
    private int isFinished;

    @SerializedName("is_free_listen")
    private boolean isFreeListen;

    @SerializedName("is_paid")
    private boolean isPaid;

    @SerializedName("is_vip_exclusive")
    private boolean isVipExclusive;

    @SerializedName("is_vipfree")
    private boolean isVipFree;

    @SerializedName("last_uptrack")
    private LastUpTrack lastUptrack;

    @SerializedName("play_count")
    private long playCount;

    @SerializedName("price_type_detail")
    private String priceTypeDetails;

    @SerializedName("price_type_info")
    private List<AlbumPriceTypeDetail> priceTypeInfos;

    @SerializedName("recommend_reason")
    private String recommendReason;

    @SerializedName("recommend_trace")
    private String recommendTrace;

    @SerializedName("recommend_track")
    private RecommendTrack recommendTrack;

    @SerializedName("recommend_src")
    private String recommentSrc;

    @SerializedName("sale_intro")
    private String saleIntro;

    @SerializedName("selling_point")
    private String sellingPoint;

    @SerializedName("share_count")
    private String shareCount;

    @SerializedName("short_rich_intro")
    private String shortRichIntro;
    private long soundLastListenId;

    @SerializedName("speaker_content")
    private String speakerContent;

    @SerializedName("speaker_intro")
    private String speakerIntro;

    @SerializedName("speaker_title")
    private String speakerTitle;

    @SerializedName("subscribe_count")
    private long subscribeCount;
    private List<Track> tracks;

    @SerializedName("tracks_natural_ordered")
    private boolean tracksNaturalOrdered;

    @SerializedName(WatchFaceApi.SORT_UPDATED)
    private long updatedAt;

    @SerializedName("updated_tracks_count")
    private int updatedTracksCount;

    public Album() {
    }

    public static Parcelable.Creator<Album> getCREATOR() {
        return CREATOR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlbumIntro() {
        return this.albumIntro;
    }

    public String getAlbumRichIntro() {
        return this.albumRichIntro;
    }

    public String getAlbumScore() {
        return this.albumScore;
    }

    public String getAlbumTags() {
        return this.albumTags;
    }

    public String getAlbumTitle() {
        return this.albumTitle;
    }

    public Announcer getAnnouncer() {
        return this.announcer;
    }

    public long getBasedRelativeAlbumId() {
        return this.basedRelativeAlbumId;
    }

    public String getBoughtTrackIds() {
        return this.boughtTrackIds;
    }

    public String getBuyNotes() {
        return this.buyNotes;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public int getComposedPriceType() {
        return this.composedPriceType;
    }

    public String getCoverUrlLarge() {
        return this.coverUrlLarge;
    }

    public String getCoverUrlMiddle() {
        return this.coverUrlMiddle;
    }

    public String getCoverUrlSmall() {
        return this.coverUrlSmall;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public String getDetailBannerUrl() {
        return this.detailBannerUrl;
    }

    public int getEstimatedTrackCount() {
        return this.estimatedTrackCount;
    }

    public String getExpectedRevenue() {
        return this.expectedRevenue;
    }

    public long getFavoriteCount() {
        return this.favoriteCount;
    }

    public int getFreeTrackCount() {
        return this.freeTrackCount;
    }

    public String getFreeTrackIds() {
        return this.freeTrackIds;
    }

    public long getId() {
        return this.id;
    }

    public long getIncludeTrackCount() {
        return this.includeTrackCount;
    }

    public int getIsFinished() {
        return this.isFinished;
    }

    public LastUpTrack getLastUptrack() {
        return this.lastUptrack;
    }

    public String getMiddleCover() {
        if (!TextUtils.isEmpty(this.coverUrlMiddle)) {
            return this.coverUrlMiddle;
        }
        if (TextUtils.isEmpty(this.coverUrlLarge)) {
            return !TextUtils.isEmpty(this.coverUrlSmall) ? this.coverUrlSmall : "";
        }
        return this.coverUrlLarge;
    }

    public long getPlayCount() {
        return this.playCount;
    }

    public String getPriceTypeDetails() {
        return this.priceTypeDetails;
    }

    public List<AlbumPriceTypeDetail> getPriceTypeInfos() {
        return this.priceTypeInfos;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public String getRecommendTrace() {
        return this.recommendTrace;
    }

    public RecommendTrack getRecommendTrack() {
        return this.recommendTrack;
    }

    public String getRecommentSrc() {
        return this.recommentSrc;
    }

    public String getSaleIntro() {
        return this.saleIntro;
    }

    public String getSellingPoint() {
        return this.sellingPoint;
    }

    public String getShareCount() {
        return this.shareCount;
    }

    public String getShortRichIntro() {
        return this.shortRichIntro;
    }

    public long getSoundLastListenId() {
        return this.soundLastListenId;
    }

    public String getSpeakerContent() {
        return this.speakerContent;
    }

    public String getSpeakerIntro() {
        return this.speakerIntro;
    }

    public String getSpeakerTitle() {
        return this.speakerTitle;
    }

    public long getSubscribeCount() {
        return this.subscribeCount;
    }

    public List<Track> getTracks() {
        return this.tracks;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public int getUpdatedTracksCount() {
        return this.updatedTracksCount;
    }

    public String getValidCover() {
        if (!TextUtils.isEmpty(this.coverUrlLarge)) {
            return this.coverUrlLarge;
        }
        if (TextUtils.isEmpty(this.coverUrlMiddle)) {
            return !TextUtils.isEmpty(this.coverUrlSmall) ? this.coverUrlSmall : "";
        }
        return this.coverUrlMiddle;
    }

    public boolean isCanDownload() {
        return this.canDownload;
    }

    public boolean isFreeListen() {
        return this.isFreeListen;
    }

    public boolean isHasSample() {
        return this.hasSample;
    }

    public boolean isPaid() {
        return this.isPaid;
    }

    public boolean isTracksNaturalOrdered() {
        return this.tracksNaturalOrdered;
    }

    public boolean isVipExclusive() {
        return this.isVipExclusive;
    }

    public boolean isVipFree() {
        return this.isVipFree;
    }

    public void setAlbumIntro(String str) {
        this.albumIntro = str;
    }

    public void setAlbumRichIntro(String str) {
        this.albumRichIntro = str;
    }

    public void setAlbumScore(String str) {
        this.albumScore = str;
    }

    public void setAlbumTags(String str) {
        this.albumTags = str;
    }

    public void setAlbumTitle(String str) {
        this.albumTitle = str;
    }

    public void setAnnouncer(Announcer announcer) {
        this.announcer = announcer;
    }

    public void setBasedRelativeAlbumId(long j) {
        this.basedRelativeAlbumId = j;
    }

    public void setBoughtTrackIds(String str) {
        this.boughtTrackIds = str;
    }

    public void setBuyNotes(String str) {
        this.buyNotes = str;
    }

    public void setCanDownload(boolean z) {
        this.canDownload = z;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setComposedPriceType(int i) {
        this.composedPriceType = i;
    }

    public void setCoverUrlLarge(String str) {
        this.coverUrlLarge = str;
    }

    public void setCoverUrlMiddle(String str) {
        this.coverUrlMiddle = str;
    }

    public void setCoverUrlSmall(String str) {
        this.coverUrlSmall = str;
    }

    public void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public void setDetailBannerUrl(String str) {
        this.detailBannerUrl = str;
    }

    public void setEstimatedTrackCount(int i) {
        this.estimatedTrackCount = i;
    }

    public void setExpectedRevenue(String str) {
        this.expectedRevenue = str;
    }

    public void setFavoriteCount(long j) {
        this.favoriteCount = j;
    }

    public void setFreeListen(boolean z) {
        this.isFreeListen = z;
    }

    public void setFreeTrackCount(int i) {
        this.freeTrackCount = i;
    }

    public void setFreeTrackIds(String str) {
        this.freeTrackIds = str;
    }

    public void setHasSample(boolean z) {
        this.hasSample = z;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIncludeTrackCount(long j) {
        this.includeTrackCount = j;
    }

    public void setIsFinished(int i) {
        this.isFinished = i;
    }

    public void setIsPaid(boolean z) {
        this.isPaid = z;
    }

    public void setLastUptrack(LastUpTrack lastUpTrack) {
        this.lastUptrack = lastUpTrack;
    }

    public void setPlayCount(long j) {
        this.playCount = j;
    }

    public void setPriceTypeDetails(String str) {
        this.priceTypeDetails = str;
    }

    public void setPriceTypeInfos(List<AlbumPriceTypeDetail> list) {
        this.priceTypeInfos = list;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendTrace(String str) {
        this.recommendTrace = str;
    }

    public void setRecommendTrack(RecommendTrack recommendTrack) {
        this.recommendTrack = recommendTrack;
    }

    public void setRecommentSrc(String str) {
        this.recommentSrc = str;
    }

    public void setSaleIntro(String str) {
        this.saleIntro = str;
    }

    public void setSellingPoint(String str) {
        this.sellingPoint = str;
    }

    public void setShareCount(String str) {
        this.shareCount = str;
    }

    public void setShortRichIntro(String str) {
        this.shortRichIntro = str;
    }

    public void setSoundLastListenId(long j) {
        this.soundLastListenId = j;
    }

    public void setSpeakerContent(String str) {
        this.speakerContent = str;
    }

    public void setSpeakerIntro(String str) {
        this.speakerIntro = str;
    }

    public void setSpeakerTitle(String str) {
        this.speakerTitle = str;
    }

    public void setSubscribeCount(long j) {
        this.subscribeCount = j;
    }

    public void setTracks(List<Track> list) {
        this.tracks = list;
    }

    public void setTracksNaturalOrdered(boolean z) {
        this.tracksNaturalOrdered = z;
    }

    public void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    public void setUpdatedTracksCount(int i) {
        this.updatedTracksCount = i;
    }

    public void setVipExclusive(boolean z) {
        this.isVipExclusive = z;
    }

    public void setVipFree(boolean z) {
        this.isVipFree = z;
    }

    public String toString() {
        return "Album [id=" + this.id + ", albumTitle=" + this.albumTitle + ", albumTags=" + this.albumTags + ", albumIntro=" + this.albumIntro + ", coverUrlSmall=" + this.coverUrlSmall + ", coverUrlMiddle=" + this.coverUrlMiddle + ", coverUrlLarge=" + this.coverUrlLarge + ", announcer=" + this.announcer + ", playCount=" + this.playCount + ", favoriteCount=" + this.favoriteCount + ", includeTrackCount=" + this.includeTrackCount + ", lastUptrack=" + this.lastUptrack + ", recommendTrack=" + this.recommendTrack + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ", soundLastListenId=" + this.soundLastListenId + ", isFinished=" + this.isFinished + ", recommentSrc=" + this.recommentSrc + ", basedRelativeAlbumId=" + this.basedRelativeAlbumId + ", recommendTrace=" + this.recommendTrace + ", shareCount=" + this.shareCount + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.albumTitle);
        parcel.writeString(this.albumTags);
        parcel.writeString(this.albumIntro);
        parcel.writeString(this.coverUrlSmall);
        parcel.writeString(this.coverUrlMiddle);
        parcel.writeString(this.coverUrlLarge);
        parcel.writeParcelable(this.announcer, i);
        parcel.writeLong(this.playCount);
        parcel.writeLong(this.favoriteCount);
        parcel.writeLong(this.includeTrackCount);
        parcel.writeParcelable(this.lastUptrack, i);
        parcel.writeParcelable(this.recommendTrack, i);
        parcel.writeLong(this.updatedAt);
        parcel.writeLong(this.soundLastListenId);
        parcel.writeLong(this.createdAt);
        parcel.writeInt(this.isFinished);
        parcel.writeString(this.recommentSrc);
        parcel.writeLong(this.basedRelativeAlbumId);
        parcel.writeString(this.recommendTrace);
        parcel.writeString(this.shareCount);
        parcel.writeInt(this.updatedTracksCount);
        parcel.writeLong(this.subscribeCount);
        parcel.writeInt(this.canDownload ? 1 : 0);
        parcel.writeInt(this.categoryId);
        parcel.writeInt(this.tracksNaturalOrdered ? 1 : 0);
        parcel.writeInt(this.isPaid ? 1 : 0);
        parcel.writeInt(this.estimatedTrackCount);
        parcel.writeString(this.albumRichIntro);
        parcel.writeString(this.speakerIntro);
        parcel.writeInt(this.freeTrackCount);
        parcel.writeString(this.freeTrackIds);
        parcel.writeString(this.boughtTrackIds);
        parcel.writeString(this.saleIntro);
        parcel.writeString(this.expectedRevenue);
        parcel.writeString(this.buyNotes);
        parcel.writeString(this.speakerTitle);
        parcel.writeString(this.speakerContent);
        parcel.writeInt(this.hasSample ? 1 : 0);
        parcel.writeInt(this.composedPriceType);
        parcel.writeString(this.priceTypeDetails);
        parcel.writeList(this.priceTypeInfos);
        parcel.writeString(this.detailBannerUrl);
        parcel.writeString(this.albumScore);
        parcel.writeString(this.recommendReason);
        parcel.writeString(this.sellingPoint);
        parcel.writeInt(this.isVipFree ? 1 : 0);
        parcel.writeInt(this.isVipExclusive ? 1 : 0);
        parcel.writeString(this.shortRichIntro);
        parcel.writeInt(this.isFreeListen ? 1 : 0);
    }

    public Album(Parcel parcel) {
        this.id = parcel.readLong();
        this.albumTitle = parcel.readString();
        this.albumTags = parcel.readString();
        this.albumIntro = parcel.readString();
        this.coverUrlSmall = parcel.readString();
        this.coverUrlMiddle = parcel.readString();
        this.coverUrlLarge = parcel.readString();
        this.announcer = (Announcer) parcel.readParcelable(Announcer.class.getClassLoader());
        this.playCount = parcel.readLong();
        this.favoriteCount = parcel.readLong();
        this.includeTrackCount = parcel.readLong();
        this.lastUptrack = (LastUpTrack) parcel.readParcelable(LastUpTrack.class.getClassLoader());
        this.recommendTrack = (RecommendTrack) parcel.readParcelable(RecommendTrack.class.getClassLoader());
        this.updatedAt = parcel.readLong();
        this.createdAt = parcel.readLong();
        this.soundLastListenId = parcel.readLong();
        this.isFinished = parcel.readInt();
        this.recommentSrc = parcel.readString();
        this.basedRelativeAlbumId = parcel.readLong();
        this.recommendTrace = parcel.readString();
        this.shareCount = parcel.readString();
        this.updatedTracksCount = parcel.readInt();
        this.subscribeCount = parcel.readLong();
        this.canDownload = parcel.readInt() == 1;
        this.categoryId = parcel.readInt();
        this.tracksNaturalOrdered = parcel.readInt() == 1;
        this.isPaid = parcel.readInt() == 1;
        this.estimatedTrackCount = parcel.readInt();
        this.albumRichIntro = parcel.readString();
        this.speakerIntro = parcel.readString();
        this.freeTrackCount = parcel.readInt();
        this.freeTrackIds = parcel.readString();
        this.boughtTrackIds = parcel.readString();
        this.saleIntro = parcel.readString();
        this.expectedRevenue = parcel.readString();
        this.buyNotes = parcel.readString();
        this.speakerTitle = parcel.readString();
        this.speakerContent = parcel.readString();
        this.hasSample = parcel.readInt() == 1;
        this.composedPriceType = parcel.readInt();
        this.priceTypeDetails = parcel.readString();
        parcel.readList(new ArrayList(), getClass().getClassLoader());
        this.detailBannerUrl = parcel.readString();
        this.albumScore = parcel.readString();
        this.recommendReason = parcel.readString();
        this.sellingPoint = parcel.readString();
        this.isVipFree = parcel.readInt() == 0;
        this.isVipExclusive = parcel.readInt() == 0;
        this.shortRichIntro = parcel.readString();
        this.isFreeListen = parcel.readInt() == 0;
    }
}
