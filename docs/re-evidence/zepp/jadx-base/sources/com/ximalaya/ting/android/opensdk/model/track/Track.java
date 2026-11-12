package com.ximalaya.ting.android.opensdk.model.track;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.album.Announcer;
import com.ximalaya.ting.android.opensdk.model.album.SubordinatedAlbum;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;

/* JADX INFO: loaded from: classes22.dex */
public class Track extends PlayableModel implements Parcelable {
    public static final Parcelable.Creator<Track> CREATOR = new Parcelable.Creator<Track>() { // from class: com.ximalaya.ting.android.opensdk.model.track.Track.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Track createFromParcel(Parcel parcel) {
            Track track = new Track();
            track.readFromParcel(parcel);
            return track;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Track[] newArray(int i) {
            return new Track[i];
        }
    };
    public static final int TYPE_AD = 3;
    public static final int TYPE_AUDIO_EXCHANGE = 1;
    public static final int TYPE_DUBSHOW = 4;
    public static final int TYPE_LIVE = 2;
    public static final int TYPE_LOCAL_SERVER = 2147483547;
    public static final int TYPE_UNKNOW = 0;

    @SerializedName(alternate = {"album"}, value = "subordinated_album")
    private SubordinatedAlbum album;
    private Announcer announcer;

    @SerializedName(alternate = {"is_bought"}, value = StatEvent.EVENT_WEIBO_VIEW_NUM_AUTHORIZED)
    private boolean authorized;
    private int blockIndex;
    private int blockNum;

    @SerializedName(OpenSdkPlayStatisticUpload.KEY_BUSINESS_TYPE)
    private int businessType;

    @SerializedName(alternate = {"canDownload"}, value = "can_download")
    private boolean canDownload;

    @SerializedName(alternate = {"categoryId"}, value = DTransferConstants.CATEGORY_ID)
    private int categoryId;
    private long channelId;
    private String channelName;
    private int chargeFileSize;

    @SerializedName(alternate = {"commentCount"}, value = "comment_count")
    private int commentCount;

    @SerializedName(alternate = {"cover_large_path", XimalayaConst.COVER_URL_LARGE, "pad_custom_cover_url"}, value = "cover_url_large")
    private String coverUrlLarge;

    @SerializedName(alternate = {"cover_middle_path", XimalayaConst.COVER_URL_MIDDLE, "custom_cover_url"}, value = "cover_url_middle")
    private String coverUrlMiddle;

    @SerializedName(alternate = {"cover_small_path", "coverSmall", XimalayaConst.COVER_URL_SMALL}, value = "cover_url_small")
    private String coverUrlSmall;

    @SerializedName(alternate = {"createdAt"}, value = "created_at")
    private long createdAt;
    private double discountedPrice;

    @SerializedName(alternate = {"downloadCount"}, value = "download_count")
    private int downloadCount;

    @SerializedName(alternate = {"downloadSize"}, value = "download_size")
    private long downloadSize;
    private long downloadTime;
    private String downloadUid;

    @SerializedName(alternate = {"download_path", XimalayaConst.DOWNLOAD_URL}, value = "download_url")
    private String downloadUrl;
    private String downloadedSaveFilePath;
    private long downloadedSize;
    private String downloadedVideoSaveFilePath;
    private int duration;
    private String endTime;
    public boolean extraa;

    @SerializedName(alternate = {"favoriteCount"}, value = "favorite_count")
    private int favoriteCount;

    @SerializedName(alternate = {"free"}, value = "is_free")
    private boolean free;

    @SerializedName(alternate = {"hasSample"}, value = "has_sample")
    private boolean hasSample;
    private int insertSequence;
    private boolean isAutoPaused;
    private boolean isChecked;
    private boolean isLike;

    @SerializedName(alternate = {"isPaid"}, value = "is_paid")
    private boolean isPaid;

    @SerializedName(alternate = {"isTrailer"}, value = "is_trailer")
    private boolean isTrailer;
    private boolean isVideo;
    private long liveRoomId;

    @SerializedName(alternate = {"playCount"}, value = "play_count")
    private int playCount;
    private String playPathHq;

    @SerializedName(alternate = {"playSize24M4a"}, value = "play_size_24_m4a")
    private String playSize24M4a;

    @SerializedName(alternate = {"playSize32"}, value = "play_size_32")
    private int playSize32;

    @SerializedName(alternate = {"playSize64"}, value = "play_size_64")
    private int playSize64;

    @SerializedName(alternate = {"playSize64m4a"}, value = "play_size_64_m4a")
    private String playSize64m4a;

    @SerializedName(alternate = {"playSizeAmr"}, value = "play_size_amr")
    private int playSizeAmr;

    @SerializedName(alternate = {"playSource"}, value = OpenSdkPlayStatisticUpload.KEY_PLAY_SOURCE)
    private int playSource;

    @SerializedName(alternate = {"play_path_aac_v224", "playUrl24M4a"}, value = "play_url_24_m4a")
    private String playUrl24M4a;

    @SerializedName(alternate = {"play_path_32", "playPath32", "playUrl32"}, value = "play_url_32")
    private String playUrl32;

    @SerializedName(alternate = {"play_path_64", "playPath64"}, value = "play_url_64")
    private String playUrl64;

    @SerializedName(alternate = {"play_path_aac_v164", "playUrl64M4a"}, value = "play_url_64_m4a")
    private String playUrl64M4a;

    @SerializedName(alternate = {"playUrlAmr"}, value = "play_url_amr")
    private String playUrlAmr;
    private double price;
    private int priceTypeEnum;
    private int priceTypeId;
    private long programId;
    private int protocolVersion;
    private long radioId;
    private String radioName;
    private String radioRate24AacUrl;
    private String radioRate24TsUrl;
    private String radioRate64AacUrl;
    private String radioRate64TsUrl;
    private String recSrc;
    private String recTrack;

    @SerializedName(alternate = {"sampleDuration"}, value = "sample_duration")
    private int sampleDuration;
    private long scheduleId;
    private String sequenceId;
    private int source;
    private String startTime;
    public int templateId;
    public String templateName;
    public String templateUrl;
    private long timeline;

    @SerializedName("topic_id")
    private int topicId;
    private long trackActivityId;

    @SerializedName(alternate = {XimalayaConst.TRACK_INTRO}, value = "track_intro")
    private String trackIntro;

    @SerializedName(alternate = {XimalayaConst.TRACK_TAGS}, value = "track_tags")
    private String trackTags;

    @SerializedName(alternate = {"title", XimalayaConst.TRACK_TITLE, "custom_title"}, value = "track_title")
    private String trackTitle;

    @SerializedName("type")
    private int type;
    private long uid;
    private boolean updateStatus;

    @SerializedName(alternate = {"updatedAt"}, value = WatchFaceApi.SORT_UPDATED)
    private long updatedAt;

    @SerializedName("vip_first_status")
    private String vipFirstStatus;

    @SerializedName(alternate = {"orderNum"}, value = "order_num")
    private int orderNum = -1;
    private int orderPositon = -1;
    private int orderPositionInAlbum = 0;
    private int trackStatus = -1;
    private int downloadStatus = -2;
    private long downloadCreated = 0;
    private boolean hasCopyRight = true;

    public boolean canPlayTrack() {
        return this.authorized || this.sampleDuration > 0 || this.free || !this.isPaid;
    }

    @Override // com.ximalaya.ting.android.opensdk.model.PlayableModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public SubordinatedAlbum getAlbum() {
        return this.album;
    }

    public Announcer getAnnouncer() {
        Announcer announcer = this.announcer;
        return announcer == null ? new Announcer() : announcer;
    }

    public int getBlockIndex() {
        return this.blockIndex;
    }

    public int getBlockNum() {
        return this.blockNum;
    }

    public int getBusinessType() {
        return this.businessType;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public long getChannelId() {
        return this.channelId;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public int getChargeFileSize() {
        return this.chargeFileSize;
    }

    public int getCommentCount() {
        return this.commentCount;
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

    public double getDiscountedPrice() {
        return this.discountedPrice;
    }

    public int getDownloadCount() {
        return this.downloadCount;
    }

    public long getDownloadCreated() {
        return this.downloadCreated;
    }

    public long getDownloadSize() {
        return this.downloadSize;
    }

    public int getDownloadStatus() {
        return this.downloadStatus;
    }

    public long getDownloadTime() {
        return this.downloadTime;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getDownloadedSaveFilePath() {
        return this.downloadedSaveFilePath;
    }

    public long getDownloadedSize() {
        return this.downloadedSize;
    }

    public String getDownloadedVideoSaveFilePath() {
        return this.downloadedVideoSaveFilePath;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public boolean getExtra() {
        return this.extraa;
    }

    public int getFavoriteCount() {
        return this.favoriteCount;
    }

    public int getInsertSequence() {
        return this.insertSequence;
    }

    public long getLiveRoomId() {
        return this.liveRoomId;
    }

    public int getOrderNum() {
        return this.orderNum;
    }

    public int getOrderPositionInAlbum() {
        return this.orderPositionInAlbum;
    }

    public int getOrderPositon() {
        return this.orderPositon;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public String getPlayPathHq() {
        return this.playPathHq;
    }

    public String getPlaySize24M4a() {
        return this.playSize24M4a;
    }

    public int getPlaySize32() {
        return this.playSize32;
    }

    public int getPlaySize64() {
        return this.playSize64;
    }

    public String getPlaySize64m4a() {
        return this.playSize64m4a;
    }

    public int getPlaySizeAmr() {
        return this.playSizeAmr;
    }

    public int getPlaySource() {
        return this.playSource;
    }

    public String getPlayUrl24M4a() {
        return this.playUrl24M4a;
    }

    public String getPlayUrl32() {
        return this.playUrl32;
    }

    public String getPlayUrl64() {
        return this.playUrl64;
    }

    public String getPlayUrl64M4a() {
        return this.playUrl64M4a;
    }

    public String getPlayUrlAmr() {
        return this.playUrlAmr;
    }

    public double getPrice() {
        return this.price;
    }

    public int getPriceTypeEnum() {
        return this.priceTypeEnum;
    }

    public int getPriceTypeId() {
        return this.priceTypeId;
    }

    public long getProgramId() {
        return this.programId;
    }

    public int getProtocolVersion() {
        return this.protocolVersion;
    }

    public long getRadioId() {
        return this.radioId;
    }

    public String getRadioName() {
        return this.radioName;
    }

    public String getRadioRate24AacUrl() {
        return this.radioRate24AacUrl;
    }

    public String getRadioRate24TsUrl() {
        return this.radioRate24TsUrl;
    }

    public String getRadioRate64AacUrl() {
        return this.radioRate64AacUrl;
    }

    public String getRadioRate64TsUrl() {
        return this.radioRate64TsUrl;
    }

    public String getRecSrc() {
        return this.recSrc;
    }

    public String getRecTrack() {
        return this.recTrack;
    }

    public int getSampleDuration() {
        return this.sampleDuration;
    }

    public long getScheduleId() {
        return this.scheduleId;
    }

    public String getSequenceId() {
        return this.sequenceId;
    }

    public int getSource() {
        return this.source;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public int getTemplateId() {
        return this.templateId;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getTemplateUrl() {
        return this.templateUrl;
    }

    public long getTimeline() {
        return this.timeline;
    }

    public int getTopicId() {
        return this.topicId;
    }

    public long getTrackActivityId() {
        return this.trackActivityId;
    }

    public String getTrackIntro() {
        return this.trackIntro;
    }

    public int getTrackStatus() {
        return this.trackStatus;
    }

    public String getTrackTags() {
        return this.trackTags;
    }

    public String getTrackTitle() {
        return this.trackTitle;
    }

    public int getType() {
        return this.type;
    }

    public long getUid() {
        return this.uid;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
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

    public String getVipFirstStatus() {
        return this.vipFirstStatus;
    }

    public boolean isAudition() {
        return !this.authorized && this.sampleDuration > 0 && isPayTrack();
    }

    public boolean isAuthorized() {
        return this.authorized;
    }

    public boolean isAutoPaused() {
        return this.isAutoPaused;
    }

    public boolean isCanDownload() {
        return this.canDownload;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public boolean isFree() {
        return this.free;
    }

    public boolean isHasCopyRight() {
        return this.hasCopyRight;
    }

    public boolean isHasSample() {
        return this.hasSample;
    }

    public boolean isLike() {
        return this.isLike;
    }

    public boolean isPaid() {
        return this.isPaid;
    }

    public boolean isPayTrack() {
        return !this.free && this.isPaid;
    }

    public boolean isTrailer() {
        return this.isTrailer;
    }

    public boolean isUpdateStatus() {
        return this.updateStatus;
    }

    public boolean isVideo() {
        return this.isVideo;
    }

    public boolean needSaveHistory() {
        return this.type != 4;
    }

    @Override // com.ximalaya.ting.android.opensdk.model.PlayableModel
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.trackTitle = parcel.readString();
        this.trackTags = parcel.readString();
        this.trackIntro = parcel.readString();
        this.coverUrlSmall = parcel.readString();
        this.coverUrlMiddle = parcel.readString();
        this.coverUrlLarge = parcel.readString();
        this.announcer = (Announcer) parcel.readParcelable(Announcer.class.getClassLoader());
        this.duration = parcel.readInt();
        this.playCount = parcel.readInt();
        this.favoriteCount = parcel.readInt();
        this.commentCount = parcel.readInt();
        this.downloadCount = parcel.readInt();
        this.playUrl32 = parcel.readString();
        this.playSize32 = parcel.readInt();
        this.playUrl64 = parcel.readString();
        this.playSize64 = parcel.readInt();
        this.playUrl24M4a = parcel.readString();
        this.playSize24M4a = parcel.readString();
        this.playUrl64M4a = parcel.readString();
        this.playSize64m4a = parcel.readString();
        this.orderNum = parcel.readInt();
        this.downloadUrl = parcel.readString();
        this.downloadSize = parcel.readLong();
        this.downloadedSize = parcel.readLong();
        this.album = (SubordinatedAlbum) parcel.readParcelable(SubordinatedAlbum.class.getClassLoader());
        this.source = parcel.readInt();
        this.updatedAt = parcel.readLong();
        this.createdAt = parcel.readLong();
        this.downloadedSaveFilePath = parcel.readString();
        this.startTime = parcel.readString();
        this.endTime = parcel.readString();
        this.scheduleId = parcel.readLong();
        this.radioRate24AacUrl = parcel.readString();
        this.radioRate24TsUrl = parcel.readString();
        this.radioRate64AacUrl = parcel.readString();
        this.radioRate64TsUrl = parcel.readString();
        this.programId = parcel.readLong();
        this.radioId = parcel.readLong();
        this.isLike = parcel.readInt() == 1;
        this.isAutoPaused = parcel.readInt() == 1;
        this.radioName = parcel.readString();
        this.playSource = parcel.readInt();
        this.timeline = parcel.readLong();
        this.sequenceId = parcel.readString();
        this.playPathHq = parcel.readString();
        this.free = parcel.readInt() == 1;
        this.authorized = parcel.readInt() == 1;
        this.isPaid = parcel.readInt() == 1;
        this.price = parcel.readDouble();
        this.discountedPrice = parcel.readDouble();
        this.priceTypeId = parcel.readInt();
        this.sampleDuration = parcel.readInt();
        this.priceTypeEnum = parcel.readInt();
        this.trackActivityId = parcel.readLong();
        this.extraa = parcel.readInt() == 1;
        this.liveRoomId = parcel.readLong();
        this.playUrlAmr = parcel.readString();
        this.playSizeAmr = parcel.readInt();
        this.hasCopyRight = parcel.readInt() == 1;
        this.updateStatus = parcel.readInt() == 1;
        this.channelId = parcel.readLong();
        this.channelName = parcel.readString();
        this.isVideo = parcel.readInt() == 1;
        this.recSrc = parcel.readString();
        this.recTrack = parcel.readString();
        this.type = parcel.readInt();
        this.categoryId = parcel.readInt();
        this.hasSample = parcel.readInt() == 1;
        this.vipFirstStatus = parcel.readString();
        this.businessType = parcel.readInt();
        this.topicId = parcel.readInt();
    }

    public void setAlbum(SubordinatedAlbum subordinatedAlbum) {
        this.album = subordinatedAlbum;
    }

    public void setAnnouncer(Announcer announcer) {
        this.announcer = announcer;
    }

    public void setAuthorized(boolean z) {
        this.authorized = z;
    }

    public void setAutoPaused(boolean z) {
        this.isAutoPaused = z;
    }

    public void setBlockIndex(int i) {
        this.blockIndex = i;
    }

    public void setBlockNum(int i) {
        this.blockNum = i;
    }

    public void setBusinessType(int i) {
        this.businessType = i;
    }

    public void setCanDownload(boolean z) {
        this.canDownload = z;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setChannelId(long j) {
        this.channelId = j;
    }

    public void setChannelName(String str) {
        this.channelName = str;
    }

    public void setChargeFileSize(int i) {
        this.chargeFileSize = i;
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
    }

    public void setCommentCount(int i) {
        this.commentCount = i;
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

    public void setDiscountedPrice(double d) {
        this.discountedPrice = d;
    }

    public void setDownloadCount(int i) {
        this.downloadCount = i;
    }

    public void setDownloadCreated(long j) {
        this.downloadCreated = j;
    }

    public void setDownloadSize(long j) {
        if (j != 0) {
            this.downloadSize = j;
        }
    }

    public void setDownloadSizeForDownload(long j) {
        this.downloadSize = j;
    }

    public void setDownloadStatus(int i) {
        this.downloadStatus = i;
    }

    public void setDownloadTime(long j) {
        this.downloadTime = j;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setDownloadedSaveFilePath(String str) {
        this.downloadedSaveFilePath = str;
    }

    public void setDownloadedSize(long j) {
        this.downloadedSize = j;
    }

    public void setDownloadedVideoSaveFilePath(String str) {
        this.downloadedVideoSaveFilePath = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setExtra(boolean z) {
        this.extraa = z;
    }

    public void setFavoriteCount(int i) {
        this.favoriteCount = i;
    }

    public void setFree(boolean z) {
        this.free = z;
    }

    public void setHasCopyRight(boolean z) {
        this.hasCopyRight = z;
    }

    public void setHasSample(boolean z) {
        this.hasSample = z;
    }

    public void setInsertSequence(int i) {
        this.insertSequence = i;
    }

    public void setLike(boolean z) {
        this.isLike = z;
    }

    public void setLiveRoomId(long j) {
        this.liveRoomId = j;
    }

    public void setOrderNum(int i) {
        this.orderNum = i;
    }

    public void setOrderPositionInAlbum(int i) {
        this.orderPositionInAlbum = i;
    }

    public void setOrderPositon(int i) {
        this.orderPositon = i;
    }

    public void setPaid(boolean z) {
        this.isPaid = z;
    }

    public void setPlayCount(int i) {
        this.playCount = i;
    }

    public void setPlayPathHq(String str) {
        this.playPathHq = str;
    }

    public void setPlaySize24M4a(String str) {
        this.playSize24M4a = str;
    }

    public void setPlaySize32(int i) {
        this.playSize32 = i;
    }

    public void setPlaySize64(int i) {
        this.playSize64 = i;
    }

    public void setPlaySize64m4a(String str) {
        this.playSize64m4a = str;
    }

    public void setPlaySizeAmr(int i) {
        this.playSizeAmr = i;
    }

    public void setPlaySource(int i) {
        this.playSource = i;
    }

    public void setPlayUrl24M4a(String str) {
        this.playUrl24M4a = str;
    }

    public void setPlayUrl32(String str) {
        this.playUrl32 = str;
    }

    public void setPlayUrl64(String str) {
        this.playUrl64 = str;
    }

    public void setPlayUrl64M4a(String str) {
        this.playUrl64M4a = str;
    }

    public void setPlayUrlAmr(String str) {
        this.playUrlAmr = str;
    }

    public void setPrice(double d) {
        this.price = d;
    }

    public void setPriceTypeEnum(int i) {
        this.priceTypeEnum = i;
    }

    public void setPriceTypeId(int i) {
        this.priceTypeId = i;
    }

    public void setProgramId(long j) {
        this.programId = j;
    }

    public void setProtocolVersion(int i) {
        this.protocolVersion = i;
    }

    public void setRadioId(long j) {
        this.radioId = j;
    }

    public void setRadioName(String str) {
        this.radioName = str;
    }

    public void setRadioRate24AacUrl(String str) {
        this.radioRate24AacUrl = str;
    }

    public void setRadioRate24TsUrl(String str) {
        this.radioRate24TsUrl = str;
    }

    public void setRadioRate64AacUrl(String str) {
        this.radioRate64AacUrl = str;
    }

    public void setRadioRate64TsUrl(String str) {
        this.radioRate64TsUrl = str;
    }

    public void setRecSrc(String str) {
        this.recSrc = str;
    }

    public void setRecTrack(String str) {
        this.recTrack = str;
    }

    public void setSampleDuration(int i) {
        this.sampleDuration = i;
    }

    public void setScheduleId(long j) {
        this.scheduleId = j;
    }

    public void setSequenceId(String str) {
        this.sequenceId = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setTemplateId(int i) {
        this.templateId = i;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public void setTemplateUrl(String str) {
        this.templateUrl = str;
    }

    public void setTimeline(long j) {
        this.timeline = j;
    }

    public void setTopicId(int i) {
        this.topicId = i;
    }

    public void setTrackActivityId(long j) {
        this.trackActivityId = j;
    }

    public void setTrackIntro(String str) {
        this.trackIntro = str;
    }

    public void setTrackStatus(int i) {
        this.trackStatus = i;
    }

    public void setTrackTags(String str) {
        this.trackTags = str;
    }

    public void setTrackTitle(String str) {
        this.trackTitle = str;
    }

    public void setTrailer(boolean z) {
        this.isTrailer = z;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUid(long j) {
        this.uid = j;
    }

    public void setUpdateStatus(boolean z) {
        this.updateStatus = z;
    }

    public void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    public void setVideo(boolean z) {
        this.isVideo = z;
    }

    public void setVipFirstStatus(String str) {
        this.vipFirstStatus = str;
    }

    @Override // com.ximalaya.ting.android.opensdk.model.PlayableModel
    public String toString() {
        return "Track{" + super.toString() + "trackTitle='" + this.trackTitle + "', coverUrlMiddle='" + this.coverUrlMiddle + "', duration=" + this.duration + ", playCount=" + this.playCount + ", favoriteCount=" + this.favoriteCount + ", commentCount=" + this.commentCount + ", downloadCount=" + this.downloadCount + ", playUrl32='" + this.playUrl32 + "', playUrl64='" + this.playUrl64 + "', playUrl24M4a='" + this.playUrl24M4a + "', playUrl64M4a='" + this.playUrl64M4a + "', album=" + this.album + ", createdAt=" + this.createdAt + ", playSource=" + this.playSource + ", trackStatus=" + this.trackStatus + ", downloadStatus=" + this.downloadStatus + ", sequenceId='" + this.sequenceId + "', isAutoPaused=" + this.isAutoPaused + ", insertSequence=" + this.insertSequence + ", timeline=" + this.timeline + ", downloadCreated=" + this.downloadCreated + ", extra=" + this.extraa + ", startTime='" + this.startTime + "', endTime='" + this.endTime + "', scheduleId=" + this.scheduleId + ", programId=" + this.programId + ", radioId=" + this.radioId + ", price=" + this.price + ", discountedPrice=" + this.discountedPrice + ", free=" + this.free + ", authorized=" + this.authorized + ", isPaid=" + this.isPaid + ", uid=" + this.uid + ", priceTypeId=" + this.priceTypeId + ", blockIndex=" + this.blockIndex + ", blockNum=" + this.blockNum + ", chargeFileSize=" + this.chargeFileSize + ", sampleDuration=" + this.sampleDuration + ", canDownload=" + this.canDownload + '}';
    }

    @Override // com.ximalaya.ting.android.opensdk.model.PlayableModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.trackTitle);
        parcel.writeString(this.trackTags);
        parcel.writeString(this.trackIntro);
        parcel.writeString(this.coverUrlSmall);
        parcel.writeString(this.coverUrlMiddle);
        parcel.writeString(this.coverUrlLarge);
        parcel.writeParcelable(this.announcer, i);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.playCount);
        parcel.writeInt(this.favoriteCount);
        parcel.writeInt(this.commentCount);
        parcel.writeInt(this.downloadCount);
        parcel.writeString(this.playUrl32);
        parcel.writeInt(this.playSize32);
        parcel.writeString(this.playUrl64);
        parcel.writeInt(this.playSize64);
        parcel.writeString(this.playUrl24M4a);
        parcel.writeString(this.playSize24M4a);
        parcel.writeString(this.playUrl64M4a);
        parcel.writeString(this.playSize64m4a);
        parcel.writeInt(this.orderNum);
        parcel.writeString(this.downloadUrl);
        parcel.writeLong(this.downloadSize);
        parcel.writeLong(this.downloadedSize);
        parcel.writeParcelable(this.album, i);
        parcel.writeInt(this.source);
        parcel.writeLong(this.updatedAt);
        parcel.writeLong(this.createdAt);
        parcel.writeString(this.downloadedSaveFilePath);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
        parcel.writeLong(this.scheduleId);
        parcel.writeString(this.radioRate24AacUrl);
        parcel.writeString(this.radioRate24TsUrl);
        parcel.writeString(this.radioRate64AacUrl);
        parcel.writeString(this.radioRate64TsUrl);
        parcel.writeLong(this.programId);
        parcel.writeLong(this.radioId);
        parcel.writeInt(this.isLike ? 1 : 0);
        parcel.writeInt(this.isAutoPaused ? 1 : 0);
        parcel.writeString(this.radioName);
        parcel.writeInt(this.playSource);
        parcel.writeLong(this.timeline);
        parcel.writeString(this.sequenceId);
        parcel.writeString(this.playPathHq);
        parcel.writeInt(this.free ? 1 : 0);
        parcel.writeInt(this.authorized ? 1 : 0);
        parcel.writeInt(this.isPaid ? 1 : 0);
        parcel.writeDouble(this.price);
        parcel.writeDouble(this.discountedPrice);
        parcel.writeInt(this.priceTypeId);
        parcel.writeInt(this.sampleDuration);
        parcel.writeInt(this.priceTypeEnum);
        parcel.writeLong(this.trackActivityId);
        parcel.writeInt(this.extraa ? 1 : 0);
        parcel.writeLong(this.liveRoomId);
        parcel.writeString(this.playUrlAmr);
        parcel.writeInt(this.playSizeAmr);
        parcel.writeInt(this.hasCopyRight ? 1 : 0);
        parcel.writeInt(this.updateStatus ? 1 : 0);
        parcel.writeLong(this.channelId);
        parcel.writeString(this.channelName);
        parcel.writeInt(this.isVideo ? 1 : 0);
        parcel.writeString(this.recSrc);
        parcel.writeString(this.recTrack);
        parcel.writeInt(this.type);
        parcel.writeInt(this.categoryId);
        parcel.writeInt(this.hasSample ? 1 : 0);
        parcel.writeString(this.vipFirstStatus);
        parcel.writeInt(this.businessType);
        parcel.writeInt(this.topicId);
    }
}
