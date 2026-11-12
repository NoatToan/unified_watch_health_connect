package com.huami.ecg.core.model;

import com.alipay.sdk.m.u.i;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b/\n\u0002\u0010 \n\u0002\b\u0013\u0018\u0000 }2\u00020\u0001:\u0001}B\u0007¢\u0006\u0004\b{\u0010|J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\"\u00102\u001a\u00020+8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010!\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R\"\u0010:\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010!\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010F\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0019\u001a\u0004\bD\u0010\u001b\"\u0004\bE\u0010\u001dR$\u0010J\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0019\u001a\u0004\bH\u0010\u001b\"\u0004\bI\u0010\u001dR$\u0010N\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0019\u001a\u0004\bL\u0010\u001b\"\u0004\bM\u0010\u001dR$\u0010R\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0019\u001a\u0004\bP\u0010\u001b\"\u0004\bQ\u0010\u001dR\"\u0010V\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\b\"\u0004\bU\u0010\nR\"\u0010Z\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\b\"\u0004\bY\u0010\nR\"\u0010^\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\b\"\u0004\b]\u0010\nR$\u0010b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010\u0019\u001a\u0004\b`\u0010\u001b\"\u0004\ba\u0010\u001dR\"\u0010f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\b\"\u0004\be\u0010\nR\"\u0010j\u001a\u00020+8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bg\u0010-\u001a\u0004\bh\u0010/\"\u0004\bi\u00101R*\u0010r\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010k8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR*\u0010v\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010k8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bs\u0010m\u001a\u0004\bt\u0010o\"\u0004\bu\u0010qR*\u0010z\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010k8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bw\u0010m\u001a\u0004\bx\u0010o\"\u0004\by\u0010q¨\u0006~"}, d2 = {"Lcom/huami/ecg/core/model/AdditionalInfo;", "", "", "toString", "", "a", LogUtil.I, "getRPeaksNum", "()I", "setRPeaksNum", "(I)V", AdditionalInfo.y, "b", "getMNoisyPercent", "setMNoisyPercent", "mNoisyPercent", "c", "getMNoisySection", "setMNoisySection", "mNoisySection", GoogleApiAvailabilityLight.a, "getLostPackage", "setLostPackage", AdditionalInfo.B, "e", "Ljava/lang/String;", "getMFwVer", "()Ljava/lang/String;", "setMFwVer", "(Ljava/lang/String;)V", "mFwVer", "", "f", "J", "getSensorTimeInMills", "()J", "setSensorTimeInMills", "(J)V", AdditionalInfo.D, "g", "getSensorDataLength", "setSensorDataLength", AdditionalInfo.E, "", "h", "F", "getSensorRate", "()F", "setSensorRate", "(F)V", AdditionalInfo.F, "i", "getAppTimeInMills", "setAppTimeInMills", AdditionalInfo.G, z.j, "getAppDataLength", "setAppDataLength", AdditionalInfo.H, "", hl.k, "[I", "getMLod", "()[I", "setMLod", "([I)V", "mLod", "l", "getMAppVer", "setMAppVer", "mAppVer", "m", "getMPhoneModel", "setMPhoneModel", "mPhoneModel", GoogleApiAvailabilityLight.b, "getMSysVer", "setMSysVer", "mSysVer", "o", "getMProbeGroup", "setMProbeGroup", "mProbeGroup", b.r, "getAFibResult", "setAFibResult", AdditionalInfo.N, DTransferConstants.SEARCH_KEY, "getUserSex", "setUserSex", "userSex", "r", "getUserAge", "setUserAge", "userAge", SOAP.XMLNS, "getUserId", "setUserId", "userId", "t", "getEcgQualityFlag", "setEcgQualityFlag", AdditionalInfo.R, "u", "getHrv", "setHrv", AdditionalInfo.S, "", "v", "Ljava/util/List;", "getEtLost", "()Ljava/util/List;", "setEtLost", "(Ljava/util/List;)V", AdditionalInfo.T, "w", "getBtLost", "setBtLost", AdditionalInfo.U, "x", "getFwLost", "setFwLost", AdditionalInfo.V, "<init>", "()V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class AdditionalInfo {
    private static final String A = "noisySection";
    private static final String B = "lostPackage";
    private static final String C = "fwVer";
    private static final String D = "sensorTimeInMills";
    private static final String E = "sensorDataLength";
    private static final String F = "sensorRate";
    private static final String G = "appTimeInMills";
    private static final String H = "appDataLength";
    private static final String I = "lod";
    private static final String J = "appVer";
    private static final String K = "phoneModel";
    private static final String L = "sysVer";
    private static final String M = "probe";
    private static final String N = "aFibResult";
    private static final String O = "age";
    private static final String P = "sex";
    private static final String Q = "id";
    private static final String R = "ecgQualityFlag";
    private static final String S = "hrv";
    private static final String T = "etLost";
    private static final String U = "btLost";
    private static final String V = "fwLost";
    private static final String y = "rPeaksNum";
    private static final String z = "noisyPercent";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(y)
    private int rPeaksNum = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(z)
    private int mNoisyPercent = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(A)
    private int mNoisySection = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName(B)
    private int lostPackage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName(C)
    @Nullable
    private String mFwVer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName(D)
    private long sensorTimeInMills;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName(E)
    private int sensorDataLength;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName(F)
    private float sensorRate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName(G)
    private long appTimeInMills;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @SerializedName(H)
    private long appDataLength;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @SerializedName(I)
    @Nullable
    private int[] mLod;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @SerializedName(J)
    @Nullable
    private String mAppVer;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @SerializedName(K)
    @Nullable
    private String mPhoneModel;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @SerializedName(L)
    @Nullable
    private String mSysVer;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @SerializedName(M)
    @Expose
    @Nullable
    private String mProbeGroup;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @SerializedName(N)
    private int aFibResult;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @SerializedName(P)
    private int userSex;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @SerializedName("age")
    private int userAge;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @SerializedName("id")
    @Nullable
    private String userId;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @SerializedName(R)
    private int ecgQualityFlag;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @SerializedName(S)
    private float hrv;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @SerializedName(T)
    @Nullable
    private List<int[]> etLost;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @SerializedName(U)
    @Nullable
    private List<int[]> btLost;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @SerializedName(V)
    @Nullable
    private List<Integer> fwLost;

    public final int getAFibResult() {
        return this.aFibResult;
    }

    public final long getAppDataLength() {
        return this.appDataLength;
    }

    public final long getAppTimeInMills() {
        return this.appTimeInMills;
    }

    @Nullable
    public final List<int[]> getBtLost() {
        return this.btLost;
    }

    public final int getEcgQualityFlag() {
        return this.ecgQualityFlag;
    }

    @Nullable
    public final List<int[]> getEtLost() {
        return this.etLost;
    }

    @Nullable
    public final List<Integer> getFwLost() {
        return this.fwLost;
    }

    public final float getHrv() {
        return this.hrv;
    }

    public final int getLostPackage() {
        return this.lostPackage;
    }

    @Nullable
    public final String getMAppVer() {
        return this.mAppVer;
    }

    @Nullable
    public final String getMFwVer() {
        return this.mFwVer;
    }

    @Nullable
    public final int[] getMLod() {
        return this.mLod;
    }

    public final int getMNoisyPercent() {
        return this.mNoisyPercent;
    }

    public final int getMNoisySection() {
        return this.mNoisySection;
    }

    @Nullable
    public final String getMPhoneModel() {
        return this.mPhoneModel;
    }

    @Nullable
    public final String getMProbeGroup() {
        return this.mProbeGroup;
    }

    @Nullable
    public final String getMSysVer() {
        return this.mSysVer;
    }

    public final int getRPeaksNum() {
        return this.rPeaksNum;
    }

    public final int getSensorDataLength() {
        return this.sensorDataLength;
    }

    public final float getSensorRate() {
        return this.sensorRate;
    }

    public final long getSensorTimeInMills() {
        return this.sensorTimeInMills;
    }

    public final int getUserAge() {
        return this.userAge;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public final int getUserSex() {
        return this.userSex;
    }

    public final void setAFibResult(int i) {
        this.aFibResult = i;
    }

    public final void setAppDataLength(long j) {
        this.appDataLength = j;
    }

    public final void setAppTimeInMills(long j) {
        this.appTimeInMills = j;
    }

    public final void setBtLost(@Nullable List<int[]> list) {
        this.btLost = list;
    }

    public final void setEcgQualityFlag(int i) {
        this.ecgQualityFlag = i;
    }

    public final void setEtLost(@Nullable List<int[]> list) {
        this.etLost = list;
    }

    public final void setFwLost(@Nullable List<Integer> list) {
        this.fwLost = list;
    }

    public final void setHrv(float f) {
        this.hrv = f;
    }

    public final void setLostPackage(int i) {
        this.lostPackage = i;
    }

    public final void setMAppVer(@Nullable String str) {
        this.mAppVer = str;
    }

    public final void setMFwVer(@Nullable String str) {
        this.mFwVer = str;
    }

    public final void setMLod(@Nullable int[] iArr) {
        this.mLod = iArr;
    }

    public final void setMNoisyPercent(int i) {
        this.mNoisyPercent = i;
    }

    public final void setMNoisySection(int i) {
        this.mNoisySection = i;
    }

    public final void setMPhoneModel(@Nullable String str) {
        this.mPhoneModel = str;
    }

    public final void setMProbeGroup(@Nullable String str) {
        this.mProbeGroup = str;
    }

    public final void setMSysVer(@Nullable String str) {
        this.mSysVer = str;
    }

    public final void setRPeaksNum(int i) {
        this.rPeaksNum = i;
    }

    public final void setSensorDataLength(int i) {
        this.sensorDataLength = i;
    }

    public final void setSensorRate(float f) {
        this.sensorRate = f;
    }

    public final void setSensorTimeInMills(long j) {
        this.sensorTimeInMills = j;
    }

    public final void setUserAge(int i) {
        this.userAge = i;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    public final void setUserSex(int i) {
        this.userSex = i;
    }

    @NotNull
    public String toString() {
        int[][] iArr;
        int[][] iArr2;
        StringBuilder sb = new StringBuilder();
        sb.append("AdditionalInfo{rPeaksNum=");
        sb.append(this.rPeaksNum);
        sb.append(", mNoisyPercent=");
        sb.append(this.mNoisyPercent);
        sb.append(", mNoisySection=");
        sb.append(this.mNoisySection);
        sb.append(", lostPackage=");
        sb.append(this.lostPackage);
        sb.append(", mFwVer='");
        sb.append(this.mFwVer);
        sb.append("'");
        sb.append(", sensorTimeInMills=");
        sb.append(this.sensorTimeInMills);
        sb.append(", sensorDataLength=");
        sb.append(this.sensorDataLength);
        sb.append(", sensorRate=");
        sb.append(this.sensorRate);
        sb.append(", appTimeInMills=");
        sb.append(this.appTimeInMills);
        sb.append(", appDataLength=");
        sb.append(this.appDataLength);
        sb.append(", mLod=");
        sb.append(Arrays.toString(this.mLod));
        sb.append(", mAppVer='");
        sb.append(this.mAppVer);
        sb.append("'");
        sb.append(", mPhoneModel='");
        sb.append(this.mPhoneModel);
        sb.append("'");
        sb.append(", mSysVer='");
        sb.append(this.mSysVer);
        sb.append("'");
        sb.append(", mProbeGroup='");
        sb.append(this.mProbeGroup);
        sb.append("'");
        sb.append(", aFibResult=");
        sb.append(this.aFibResult);
        sb.append(", userSex=");
        sb.append(this.userSex);
        sb.append(", userAge=");
        sb.append(this.userAge);
        sb.append(", userId='");
        sb.append(this.userId);
        sb.append("'");
        sb.append(", ecgQualityFlag=");
        sb.append(this.ecgQualityFlag);
        sb.append(", hrv=");
        sb.append(this.hrv);
        sb.append(", etLost=");
        List<int[]> list = this.etLost;
        Integer[] numArr = null;
        if (list != null) {
            Object[] array = list.toArray(new int[0][]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            iArr = (int[][]) array;
        } else {
            iArr = null;
        }
        sb.append(Arrays.toString(iArr));
        sb.append(", btLost=");
        List<int[]> list2 = this.btLost;
        if (list2 != null) {
            Object[] array2 = list2.toArray(new int[0][]);
            if (array2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            iArr2 = (int[][]) array2;
        } else {
            iArr2 = null;
        }
        sb.append(Arrays.toString(iArr2));
        sb.append(", fwLost=");
        List<Integer> list3 = this.fwLost;
        if (list3 != null) {
            Object[] array3 = list3.toArray(new Integer[0]);
            if (array3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            numArr = (Integer[]) array3;
        }
        sb.append(Arrays.toString(numArr));
        sb.append(i.d);
        return sb.toString();
    }
}
