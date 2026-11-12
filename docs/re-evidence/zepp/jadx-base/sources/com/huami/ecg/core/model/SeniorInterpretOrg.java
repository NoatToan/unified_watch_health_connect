package com.huami.ecg.core.model;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u0005¢\u0006\u0004\bI\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0007HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0095\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u0005HÆ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\u0013\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0014\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0015\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0016\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0017\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R\u001c\u0010\u0018\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*R\u001c\u0010\u0019\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R\u001c\u0010\u001a\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b:\u0010*R\u001c\u0010\u001b\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u00102R\u001c\u0010\u001c\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010(\u001a\u0004\b>\u0010*R\u001c\u0010\u001d\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010(\u001a\u0004\b@\u0010*R\u001c\u0010\u001e\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00100\u001a\u0004\bB\u00102R\u001c\u0010\u001f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010(\u001a\u0004\bD\u0010*R\u001c\u0010 \u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00100\u001a\u0004\bF\u00102R\u001c\u0010!\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010,\u001a\u0004\bH\u0010.¨\u0006K"}, d2 = {"Lcom/huami/ecg/core/model/SeniorInterpretOrg;", "", "", "toString", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "city", ParamKey.createTime, "doubleCheck", "email", "icon", "manager", "name", "orgId", "phone", "province", "status", "summary", "type", EcgData.TIMESTAMP_SERVER_UPDATED, "copy", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCity", "()Ljava/lang/String;", "b", "J", "getCreateTime", "()J", "c", LogUtil.I, "getDoubleCheck", "()I", GoogleApiAvailabilityLight.a, "getEmail", "e", "getIcon", "f", "getManager", "g", "getName", "h", "getOrgId", "i", "getPhone", z.j, "getProvince", hl.k, "getStatus", "l", "getSummary", "m", "getType", GoogleApiAvailabilityLight.b, "getUpdateTime", "<init>", "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IJ)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SeniorInterpretOrg {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("city")
    @NotNull
    private final String city;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(ParamKey.createTime)
    private final long createTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("doubleCheck")
    private final int doubleCheck;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("email")
    @NotNull
    private final String email;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("icon")
    @NotNull
    private final String icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("manager")
    private final int manager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("orgId")
    private final int orgId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("phone")
    @NotNull
    private final String phone;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName("province")
    @NotNull
    private final String province;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("status")
    private final int status;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @SerializedName("summary")
    @NotNull
    private final String summary;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @SerializedName("type")
    private final int type;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    private final long updateTime;

    public SeniorInterpretOrg() {
        this(null, 0L, 0, null, null, 0, null, 0, null, null, 0, null, 0, 0L, 16383, null);
    }

    public SeniorInterpretOrg(@NotNull String str, long j, int i, @NotNull String str2, @NotNull String str3, int i2, @NotNull String str4, int i3, @NotNull String str5, @NotNull String str6, int i4, @NotNull String str7, int i5, long j2) {
        this.city = str;
        this.createTime = j;
        this.doubleCheck = i;
        this.email = str2;
        this.icon = str3;
        this.manager = i2;
        this.name = str4;
        this.orgId = i3;
        this.phone = str5;
        this.province = str6;
        this.status = i4;
        this.summary = str7;
        this.type = i5;
        this.updateTime = j2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getProvince() {
        return this.province;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDoubleCheck() {
        return this.doubleCheck;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getManager() {
        return this.manager;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOrgId() {
        return this.orgId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final SeniorInterpretOrg copy(@NotNull String city, long createTime, int doubleCheck, @NotNull String email, @NotNull String icon, int manager, @NotNull String name, int orgId, @NotNull String phone, @NotNull String province, int status, @NotNull String summary, int type, long updateTime) {
        return new SeniorInterpretOrg(city, createTime, doubleCheck, email, icon, manager, name, orgId, phone, province, status, summary, type, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeniorInterpretOrg)) {
            return false;
        }
        SeniorInterpretOrg seniorInterpretOrg = (SeniorInterpretOrg) other;
        return Intrinsics.areEqual(this.city, seniorInterpretOrg.city) && this.createTime == seniorInterpretOrg.createTime && this.doubleCheck == seniorInterpretOrg.doubleCheck && Intrinsics.areEqual(this.email, seniorInterpretOrg.email) && Intrinsics.areEqual(this.icon, seniorInterpretOrg.icon) && this.manager == seniorInterpretOrg.manager && Intrinsics.areEqual(this.name, seniorInterpretOrg.name) && this.orgId == seniorInterpretOrg.orgId && Intrinsics.areEqual(this.phone, seniorInterpretOrg.phone) && Intrinsics.areEqual(this.province, seniorInterpretOrg.province) && this.status == seniorInterpretOrg.status && Intrinsics.areEqual(this.summary, seniorInterpretOrg.summary) && this.type == seniorInterpretOrg.type && this.updateTime == seniorInterpretOrg.updateTime;
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDoubleCheck() {
        return this.doubleCheck;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final int getManager() {
        return this.manager;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getOrgId() {
        return this.orgId;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final String getProvince() {
        return this.province;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        String str = this.city;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.createTime;
        int i = ((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.doubleCheck) * 31;
        String str2 = this.email;
        int iHashCode2 = (i + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.icon;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.manager) * 31;
        String str4 = this.name;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.orgId) * 31;
        String str5 = this.phone;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.province;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.status) * 31;
        String str7 = this.summary;
        int iHashCode7 = (((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.type) * 31;
        long j2 = this.updateTime;
        return iHashCode7 + ((int) (j2 ^ (j2 >>> 32)));
    }

    @NotNull
    public String toString() {
        return "SeniorInterpretOrg(city='" + this.city + "', createTime=" + this.createTime + ", doubleCheck=" + this.doubleCheck + ", email='" + this.email + "', icon='" + this.icon + "', manager=" + this.manager + ", name='" + this.name + "', orgId=" + this.orgId + ", phone='" + this.phone + "', province='" + this.province + "', status=" + this.status + ", summary='" + this.summary + "', type=" + this.type + ", updateTime=" + this.updateTime + ')';
    }

    public /* synthetic */ SeniorInterpretOrg(String str, long j, int i, String str2, String str3, int i2, String str4, int i3, String str5, String str6, int i4, String str7, int i5, long j2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0L : j, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? "" : str2, (i6 & 16) != 0 ? "" : str3, (i6 & 32) != 0 ? 0 : i2, (i6 & 64) != 0 ? "" : str4, (i6 & 128) != 0 ? 0 : i3, (i6 & 256) != 0 ? "" : str5, (i6 & 512) != 0 ? "" : str6, (i6 & 1024) != 0 ? 0 : i4, (i6 & 2048) == 0 ? str7 : "", (i6 & 4096) == 0 ? i5 : 0, (i6 & 8192) != 0 ? 0L : j2);
    }
}
