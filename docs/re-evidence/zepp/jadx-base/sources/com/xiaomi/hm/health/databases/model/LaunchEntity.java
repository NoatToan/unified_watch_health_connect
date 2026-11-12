package com.xiaomi.hm.health.databases.model;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.annotations.SerializedName;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;

/* JADX INFO: loaded from: classes20.dex */
public class LaunchEntity {
    private Integer a;

    @SerializedName(AppEventsConstants.EVENT_PARAM_AD_TYPE)
    public String adType;

    @SerializedName("appid")
    public String appId;

    @SerializedName("bg_video_url")
    public String bgVideoUrl;

    @SerializedName("city")
    public String city;

    @SerializedName(AbstractJSONTokenResponse.COOKIE)
    public String cookie;

    @SerializedName("expire_time")
    public Long endTime;

    @SerializedName(GPXTrackPoint.XML.TAG_EXTENSIONS)
    public String extensions;

    @SerializedName("id")
    public Long id;

    @SerializedName("bg_img_url")
    public String imageUrl;

    @SerializedName("isLoadWithGPRS")
    public Integer isLoadWithGPRS;

    @SerializedName("province")
    public String province;

    @SerializedName("share")
    public Integer share;

    @SerializedName("share_subtitle")
    public String shareSubtitle;

    @SerializedName("share_title")
    public String shareTtitle;

    @SerializedName("share_url")
    public String shareUrl;

    @SerializedName("sort")
    public Integer sort;

    @SerializedName("start_time")
    public Long startTime;

    @SerializedName("title")
    public String title;

    @SerializedName("jump_url")
    public String url;

    public LaunchEntity(Long l, Long l2, Long l3, String str, String str2, String str3, Integer num, String str4, String str5, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, Integer num3, String str12, String str13, Integer num4) {
        this.id = l;
        this.startTime = l2;
        this.endTime = l3;
        this.title = str;
        this.url = str2;
        this.imageUrl = str3;
        this.sort = num;
        this.province = str4;
        this.city = str5;
        this.share = num2;
        this.shareTtitle = str6;
        this.shareSubtitle = str7;
        this.shareUrl = str8;
        this.appId = str9;
        this.cookie = str10;
        this.adType = str11;
        this.isLoadWithGPRS = num3;
        this.bgVideoUrl = str12;
        this.extensions = str13;
        this.a = num4;
    }

    private static boolean a(Number number, Number number2) {
        return (number == null && number2 == null) || (number != null && number.equals(number2));
    }

    private static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        try {
            return a(this.id, ((LaunchEntity) obj).id) && a(this.startTime, ((LaunchEntity) obj).startTime) && a(this.endTime, ((LaunchEntity) obj).endTime) && b(this.url, ((LaunchEntity) obj).url) && b(this.imageUrl, ((LaunchEntity) obj).imageUrl) && a(this.sort, ((LaunchEntity) obj).sort) && b(this.province, ((LaunchEntity) obj).province) && b(this.city, ((LaunchEntity) obj).city) && a(this.share, ((LaunchEntity) obj).share) && b(this.shareTtitle, ((LaunchEntity) obj).shareTtitle) && b(this.shareSubtitle, ((LaunchEntity) obj).shareSubtitle) && b(this.shareUrl, ((LaunchEntity) obj).shareUrl) && b(this.appId, ((LaunchEntity) obj).appId) && b(this.cookie, ((LaunchEntity) obj).cookie) && b(this.adType, ((LaunchEntity) obj).adType) && a(this.isLoadWithGPRS, ((LaunchEntity) obj).isLoadWithGPRS) && b(this.bgVideoUrl, ((LaunchEntity) obj).bgVideoUrl) && b(this.extensions, ((LaunchEntity) obj).extensions) && a(this.a, ((LaunchEntity) obj).a);
        } catch (Exception unused) {
            return false;
        }
    }

    public String getAdType() {
        return this.adType;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getBgVideoUrl() {
        return this.bgVideoUrl;
    }

    public String getCity() {
        return this.city;
    }

    public String getCookie() {
        return this.cookie;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public String getExtensions() {
        return this.extensions;
    }

    public Long getId() {
        return this.id;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public Integer getIsLoadWithGPRS() {
        return this.isLoadWithGPRS;
    }

    public Integer getMode() {
        return this.a;
    }

    public String getProvince() {
        return this.province;
    }

    public Integer getShare() {
        return this.share;
    }

    public String getShareSubtitle() {
        return this.shareSubtitle;
    }

    public String getShareTtitle() {
        return this.shareTtitle;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAdType(String str) {
        this.adType = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setBgVideoUrl(String str) {
        this.bgVideoUrl = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCookie(String str) {
        this.cookie = str;
    }

    public void setEndTime(Long l) {
        this.endTime = l;
    }

    public void setExtensions(String str) {
        this.extensions = str;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setIsLoadWithGPRS(Integer num) {
        this.isLoadWithGPRS = num;
    }

    public void setMode(Integer num) {
        this.a = num;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setShare(Integer num) {
        this.share = num;
    }

    public void setShareSubtitle(String str) {
        this.shareSubtitle = str;
    }

    public void setShareTtitle(String str) {
        this.shareTtitle = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSort(Integer num) {
        this.sort = num;
    }

    public void setStartTime(Long l) {
        this.startTime = l;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public LaunchEntity() {
    }
}
