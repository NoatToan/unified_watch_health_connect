package com.huami.flutter.appletcompanionplugin;

import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b?\u0010@J\u0013\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÀ\u0001\u0010$\u001a\u00020\u00002\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b$\u0010%J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001J\u0013\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R&\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b,\u0010-R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b/\u00100R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b1\u00100R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b2\u00100R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b3\u00100R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00104\u001a\u0004\b5\u0010\u000bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\b7\u0010\u000eR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b8\u00100R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b9\u00100R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b:\u00100R\u001e\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b;\u00100R\u001e\u0010!\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\b<\u0010\u000eR\u001e\u0010\"\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00104\u001a\u0004\b=\u0010\u000bR\u001e\u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b>\u00100¨\u0006A"}, d2 = {"Lcom/huami/flutter/appletcompanionplugin/JsAppDeveloperInfoData;", "", "", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "()Ljava/lang/Long;", "", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "certificates", "contactAddress", "contactMailbox", "contactName", "contactNumber", ParamKey.createTime, "examineType", "name", "number", "registeredAddress", "remarks", "state", EcgData.TIMESTAMP_SERVER_UPDATED, "userId", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)Lcom/huami/flutter/appletcompanionplugin/JsAppDeveloperInfoData;", "toString", "hashCode", "other", "", "equals", "Ljava/util/List;", "getCertificates", "()Ljava/util/List;", "Ljava/lang/String;", "getContactAddress", "()Ljava/lang/String;", "getContactMailbox", "getContactName", "getContactNumber", "Ljava/lang/Long;", "getCreateTime", "Ljava/lang/Integer;", "getExamineType", "getName", "getNumber", "getRegisteredAddress", "getRemarks", "getState", "getUpdateTime", "getUserId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "applet_companion_plugin_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class JsAppDeveloperInfoData {

    @SerializedName("certificates")
    @Nullable
    private final List<String> certificates;

    @SerializedName("contactAddress")
    @Nullable
    private final String contactAddress;

    @SerializedName("contactMailbox")
    @Nullable
    private final String contactMailbox;

    @SerializedName("contactName")
    @Nullable
    private final String contactName;

    @SerializedName("contactNumber")
    @Nullable
    private final String contactNumber;

    @SerializedName(ParamKey.createTime)
    @Nullable
    private final Long createTime;

    @SerializedName("examineType")
    @Nullable
    private final Integer examineType;

    @SerializedName("name")
    @Nullable
    private final String name;

    @SerializedName("number")
    @Nullable
    private final String number;

    @SerializedName("registeredAddress")
    @Nullable
    private final String registeredAddress;

    @SerializedName("remarks")
    @Nullable
    private final String remarks;

    @SerializedName("state")
    @Nullable
    private final Integer state;

    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    @Nullable
    private final Long updateTime;

    @SerializedName("userId")
    @Nullable
    private final String userId;

    public JsAppDeveloperInfoData(@Nullable List<String> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l, @Nullable Integer num, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num2, @Nullable Long l2, @Nullable String str9) {
        this.certificates = list;
        this.contactAddress = str;
        this.contactMailbox = str2;
        this.contactName = str3;
        this.contactNumber = str4;
        this.createTime = l;
        this.examineType = num;
        this.name = str5;
        this.number = str6;
        this.registeredAddress = str7;
        this.remarks = str8;
        this.state = num2;
        this.updateTime = l2;
        this.userId = str9;
    }

    @Nullable
    public final List<String> component1() {
        return this.certificates;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRegisteredAddress() {
        return this.registeredAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContactAddress() {
        return this.contactAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContactMailbox() {
        return this.contactMailbox;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContactName() {
        return this.contactName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContactNumber() {
        return this.contactNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getExamineType() {
        return this.examineType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    public final JsAppDeveloperInfoData copy(@Nullable List<String> certificates, @Nullable String contactAddress, @Nullable String contactMailbox, @Nullable String contactName, @Nullable String contactNumber, @Nullable Long createTime, @Nullable Integer examineType, @Nullable String name, @Nullable String number, @Nullable String registeredAddress, @Nullable String remarks, @Nullable Integer state, @Nullable Long updateTime, @Nullable String userId) {
        return new JsAppDeveloperInfoData(certificates, contactAddress, contactMailbox, contactName, contactNumber, createTime, examineType, name, number, registeredAddress, remarks, state, updateTime, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsAppDeveloperInfoData)) {
            return false;
        }
        JsAppDeveloperInfoData jsAppDeveloperInfoData = (JsAppDeveloperInfoData) other;
        return Intrinsics.areEqual(this.certificates, jsAppDeveloperInfoData.certificates) && Intrinsics.areEqual(this.contactAddress, jsAppDeveloperInfoData.contactAddress) && Intrinsics.areEqual(this.contactMailbox, jsAppDeveloperInfoData.contactMailbox) && Intrinsics.areEqual(this.contactName, jsAppDeveloperInfoData.contactName) && Intrinsics.areEqual(this.contactNumber, jsAppDeveloperInfoData.contactNumber) && Intrinsics.areEqual(this.createTime, jsAppDeveloperInfoData.createTime) && Intrinsics.areEqual(this.examineType, jsAppDeveloperInfoData.examineType) && Intrinsics.areEqual(this.name, jsAppDeveloperInfoData.name) && Intrinsics.areEqual(this.number, jsAppDeveloperInfoData.number) && Intrinsics.areEqual(this.registeredAddress, jsAppDeveloperInfoData.registeredAddress) && Intrinsics.areEqual(this.remarks, jsAppDeveloperInfoData.remarks) && Intrinsics.areEqual(this.state, jsAppDeveloperInfoData.state) && Intrinsics.areEqual(this.updateTime, jsAppDeveloperInfoData.updateTime) && Intrinsics.areEqual(this.userId, jsAppDeveloperInfoData.userId);
    }

    @Nullable
    public final List<String> getCertificates() {
        return this.certificates;
    }

    @Nullable
    public final String getContactAddress() {
        return this.contactAddress;
    }

    @Nullable
    public final String getContactMailbox() {
        return this.contactMailbox;
    }

    @Nullable
    public final String getContactName() {
        return this.contactName;
    }

    @Nullable
    public final String getContactNumber() {
        return this.contactNumber;
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final Integer getExamineType() {
        return this.examineType;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNumber() {
        return this.number;
    }

    @Nullable
    public final String getRegisteredAddress() {
        return this.registeredAddress;
    }

    @Nullable
    public final String getRemarks() {
        return this.remarks;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        List<String> list = this.certificates;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.contactAddress;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contactMailbox;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contactName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.contactNumber;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.createTime;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.examineType;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.number;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.registeredAddress;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.remarks;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.state;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.updateTime;
        int iHashCode13 = (iHashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str9 = this.userId;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "JsAppDeveloperInfoData(certificates=" + this.certificates + ", contactAddress=" + ((Object) this.contactAddress) + ", contactMailbox=" + ((Object) this.contactMailbox) + ", contactName=" + ((Object) this.contactName) + ", contactNumber=" + ((Object) this.contactNumber) + ", createTime=" + this.createTime + ", examineType=" + this.examineType + ", name=" + ((Object) this.name) + ", number=" + ((Object) this.number) + ", registeredAddress=" + ((Object) this.registeredAddress) + ", remarks=" + ((Object) this.remarks) + ", state=" + this.state + ", updateTime=" + this.updateTime + ", userId=" + ((Object) this.userId) + ')';
    }
}
