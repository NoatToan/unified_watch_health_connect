package com.huami.ecg.core.model;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003Jw\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0011\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0013\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0014\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u001c\u0010\u0015\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u001c\u0010\u0016\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u001c\u0010\u0017\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(R\u001c\u0010\u0018\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u001c\u0010\u0019\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u0010(R\u001c\u0010\u001a\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010$R\u001c\u0010\u001b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b<\u0010(¨\u0006?"}, d2 = {"Lcom/huami/ecg/core/model/SeniorInterpretResult;", "", "", "toString", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "dataTime", EcgData.DIAGNOSIS, "diagnosisStatus", "diagnosisTime", "doctorName", "doctorTitle", "proposal", "result", "signatureUrl", "commitTime", "userId", "copy", "hashCode", "other", "", "equals", "a", "J", "getDataTime", "()J", "b", "Ljava/lang/String;", "getDiagnosis", "()Ljava/lang/String;", "c", LogUtil.I, "getDiagnosisStatus", "()I", GoogleApiAvailabilityLight.a, "getDiagnosisTime", "e", "getDoctorName", "f", "getDoctorTitle", "g", "getProposal", "h", "getResult", "i", "getSignatureUrl", z.j, "getCommitTime", hl.k, "getUserId", "<init>", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SeniorInterpretResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("dataTime")
    private final long dataTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.DIAGNOSIS)
    @NotNull
    private final String diagnosis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("diagnosisStatus")
    private final int diagnosisStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("diagnosisTime")
    @NotNull
    private final String diagnosisTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("doctorName")
    @NotNull
    private final String doctorName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("doctorTitle")
    @NotNull
    private final String doctorTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("proposal")
    @NotNull
    private final String proposal;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("result")
    private final int result;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("signatureUrl")
    @NotNull
    private final String signatureUrl;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName("commitTime")
    private final long commitTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("userId")
    @NotNull
    private final String userId;

    public SeniorInterpretResult() {
        this(0L, null, 0, null, null, null, null, 0, null, 0L, null, 2047, null);
    }

    public SeniorInterpretResult(long j, @NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i2, @NotNull String str6, long j2, @NotNull String str7) {
        this.dataTime = j;
        this.diagnosis = str;
        this.diagnosisStatus = i;
        this.diagnosisTime = str2;
        this.doctorName = str3;
        this.doctorTitle = str4;
        this.proposal = str5;
        this.result = i2;
        this.signatureUrl = str6;
        this.commitTime = j2;
        this.userId = str7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDataTime() {
        return this.dataTime;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getCommitTime() {
        return this.commitTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDiagnosis() {
        return this.diagnosis;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDiagnosisStatus() {
        return this.diagnosisStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDiagnosisTime() {
        return this.diagnosisTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDoctorName() {
        return this.doctorName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDoctorTitle() {
        return this.doctorTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProposal() {
        return this.proposal;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getResult() {
        return this.result;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSignatureUrl() {
        return this.signatureUrl;
    }

    @NotNull
    public final SeniorInterpretResult copy(long dataTime, @NotNull String diagnosis, int diagnosisStatus, @NotNull String diagnosisTime, @NotNull String doctorName, @NotNull String doctorTitle, @NotNull String proposal, int result, @NotNull String signatureUrl, long commitTime, @NotNull String userId) {
        return new SeniorInterpretResult(dataTime, diagnosis, diagnosisStatus, diagnosisTime, doctorName, doctorTitle, proposal, result, signatureUrl, commitTime, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeniorInterpretResult)) {
            return false;
        }
        SeniorInterpretResult seniorInterpretResult = (SeniorInterpretResult) other;
        return this.dataTime == seniorInterpretResult.dataTime && Intrinsics.areEqual(this.diagnosis, seniorInterpretResult.diagnosis) && this.diagnosisStatus == seniorInterpretResult.diagnosisStatus && Intrinsics.areEqual(this.diagnosisTime, seniorInterpretResult.diagnosisTime) && Intrinsics.areEqual(this.doctorName, seniorInterpretResult.doctorName) && Intrinsics.areEqual(this.doctorTitle, seniorInterpretResult.doctorTitle) && Intrinsics.areEqual(this.proposal, seniorInterpretResult.proposal) && this.result == seniorInterpretResult.result && Intrinsics.areEqual(this.signatureUrl, seniorInterpretResult.signatureUrl) && this.commitTime == seniorInterpretResult.commitTime && Intrinsics.areEqual(this.userId, seniorInterpretResult.userId);
    }

    public final long getCommitTime() {
        return this.commitTime;
    }

    public final long getDataTime() {
        return this.dataTime;
    }

    @NotNull
    public final String getDiagnosis() {
        return this.diagnosis;
    }

    public final int getDiagnosisStatus() {
        return this.diagnosisStatus;
    }

    @NotNull
    public final String getDiagnosisTime() {
        return this.diagnosisTime;
    }

    @NotNull
    public final String getDoctorName() {
        return this.doctorName;
    }

    @NotNull
    public final String getDoctorTitle() {
        return this.doctorTitle;
    }

    @NotNull
    public final String getProposal() {
        return this.proposal;
    }

    public final int getResult() {
        return this.result;
    }

    @NotNull
    public final String getSignatureUrl() {
        return this.signatureUrl;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        long j = this.dataTime;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.diagnosis;
        int iHashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.diagnosisStatus) * 31;
        String str2 = this.diagnosisTime;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.doctorName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.doctorTitle;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.proposal;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.result) * 31;
        String str6 = this.signatureUrl;
        int iHashCode6 = str6 != null ? str6.hashCode() : 0;
        long j2 = this.commitTime;
        int i2 = (((iHashCode5 + iHashCode6) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str7 = this.userId;
        return i2 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SeniorInterpretResult(dataTime=" + this.dataTime + ", diagnosis='" + this.diagnosis + "', diagnosisStatus=" + this.diagnosisStatus + ", diagnosisTime='" + this.diagnosisTime + "', doctorName='" + this.doctorName + "', doctorTitle='" + this.doctorTitle + "', proposal='" + this.proposal + "', result=" + this.result + ", signatureUrl='" + this.signatureUrl + "', commitTime=" + this.commitTime + ", userId='" + this.userId + "')";
    }

    public /* synthetic */ SeniorInterpretResult(long j, String str, int i, String str2, String str3, String str4, String str5, int i2, String str6, long j2, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) == 0 ? i2 : 0, (i3 & 256) != 0 ? "" : str6, (i3 & 512) == 0 ? j2 : 0L, (i3 & 1024) == 0 ? str7 : "");
    }
}
