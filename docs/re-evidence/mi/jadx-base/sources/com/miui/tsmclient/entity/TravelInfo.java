package com.miui.tsmclient.entity;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.PrefUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class TravelInfo {

    @SerializedName("consumptionType")
    private String mConsumptionType;

    @SerializedName("helpInfo")
    private String mHelpInfo;

    @SerializedName("inboundSite")
    private String mInboundSite;

    @SerializedName("lineNo")
    private String mLineNo;

    @SerializedName("outboundSite")
    private String mOutboundSite;
    private Long mTradeTime;
    private String mTrafficCardName;

    @SerializedName("trafficType")
    private String mTrafficType;

    public TravelInfo() {
        this.mInboundSite = "";
        this.mOutboundSite = "";
    }

    private boolean isEmpty(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) || AbstractJsonLexerKt.NULL.equals(charSequence);
    }

    public TravelInfo fromString(String str) {
        String[] strArrSplit = str.split("\\|", -1);
        setConsumptionType(strArrSplit[0]);
        setTrafficType(strArrSplit[1]);
        setStartSiteName(strArrSplit[2]);
        setEndSiteName(strArrSplit[3]);
        return this;
    }

    public String getConsumptionType() {
        return this.mConsumptionType;
    }

    public String getEndSiteName() {
        return this.mOutboundSite;
    }

    public String getLineNo() {
        return this.mLineNo;
    }

    public String getStartSiteName() {
        return this.mInboundSite;
    }

    public Long getTradeTime() {
        return this.mTradeTime;
    }

    public String getTrafficCardName() {
        return this.mTrafficCardName;
    }

    public String getTrafficType() {
        return this.mTrafficType;
    }

    public boolean isEndSiteInfoSanity() {
        return !isEmpty(this.mOutboundSite);
    }

    public boolean isInbound() {
        return "00".equals(this.mConsumptionType) || "03".equals(this.mConsumptionType);
    }

    public boolean isOneWay() {
        return "02".equals(this.mConsumptionType);
    }

    public boolean isSiteInfoSanity(Context context) {
        return ((isEmpty(this.mInboundSite) || isEmpty(this.mOutboundSite)) && (isEmpty(PrefUtils.getString(context, PrefUtils.INBOUND_SITE, "")) || isEmpty(this.mOutboundSite))) ? false : true;
    }

    public boolean isSubway() {
        return Constants.TrafficType.SUBWAY == Constants.TrafficType.getTrafficType(this.mTrafficType);
    }

    public boolean isUnknownTrafficType() {
        return Constants.TrafficType.TRAFFIC_UNKNOWN == Constants.TrafficType.getTrafficType(this.mTrafficType);
    }

    public void setConsumptionType(String str) {
        this.mConsumptionType = str;
    }

    public void setEndSiteName(String str) {
        this.mOutboundSite = str;
    }

    public void setStartSiteName(String str) {
        this.mInboundSite = str;
    }

    public void setTradeTime(Long l) {
        this.mTradeTime = l;
    }

    public void setTrafficCardName(String str) {
        this.mTrafficCardName = str;
    }

    public void setTrafficType(String str) {
        this.mTrafficType = str;
    }

    public String toString() {
        return this.mConsumptionType + "|" + this.mTrafficType + "|" + this.mInboundSite + "|" + this.mOutboundSite;
    }

    public TravelInfo(TravelInfo travelInfo) {
        this.mInboundSite = "";
        this.mOutboundSite = "";
        this.mTrafficType = travelInfo.mTrafficType;
        this.mConsumptionType = travelInfo.mConsumptionType;
        this.mInboundSite = travelInfo.mInboundSite;
        this.mOutboundSite = travelInfo.mOutboundSite;
        this.mTrafficCardName = travelInfo.mTrafficCardName;
        this.mTradeTime = travelInfo.mTradeTime;
    }
}
