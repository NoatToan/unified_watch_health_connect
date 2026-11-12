package com.mi.fitness.lpamanagement.request.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/mi/fitness/lpamanagement/request/data/GetSignResult;", "", AuthorizeActivityBase.KEY_OPERATOR, "", "chinaMobileResp", "Lcom/mi/fitness/lpamanagement/request/data/GetSignResult$ChinaMobileSignResult;", "chinaUnicomResp", "Lcom/mi/fitness/lpamanagement/request/data/GetSignResult$ChinaUnicomSignResult;", "<init>", "(ILcom/mi/fitness/lpamanagement/request/data/GetSignResult$ChinaMobileSignResult;Lcom/mi/fitness/lpamanagement/request/data/GetSignResult$ChinaUnicomSignResult;)V", "getOperator", "()I", "getChinaMobileResp", "()Lcom/mi/fitness/lpamanagement/request/data/GetSignResult$ChinaMobileSignResult;", "getChinaUnicomResp", "()Lcom/mi/fitness/lpamanagement/request/data/GetSignResult$ChinaUnicomSignResult;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ChinaMobileSignResult", "ChinaUnicomSignResult", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetSignResult {

    @SerializedName("china_mobile_resp")
    @Nullable
    private final ChinaMobileSignResult chinaMobileResp;

    @SerializedName("china_unicom_resp")
    @Nullable
    private final ChinaUnicomSignResult chinaUnicomResp;
    private final int operator;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/mi/fitness/lpamanagement/request/data/GetSignResult$ChinaMobileSignResult;", "", "encryptedDeviceImei", "", "encryptedEid", "encryptedApiVersion", "encryptedTechVersion", "m_time", "", "sign", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getEncryptedDeviceImei", "()Ljava/lang/String;", "getEncryptedEid", "getEncryptedApiVersion", "getEncryptedTechVersion", "getM_time", "()J", "getSign", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChinaMobileSignResult {

        @SerializedName("encrypted_m_api_version")
        @NotNull
        private final String encryptedApiVersion;

        @SerializedName("encrypted_m_device_imei")
        @NotNull
        private final String encryptedDeviceImei;

        @SerializedName("encrypted_m_eid")
        @NotNull
        private final String encryptedEid;

        @SerializedName("encrypted_m_tech_version")
        @NotNull
        private final String encryptedTechVersion;
        private final long m_time;

        @SerializedName("m_sign")
        @NotNull
        private final String sign;

        public ChinaMobileSignResult(@NotNull String encryptedDeviceImei, @NotNull String encryptedEid, @NotNull String encryptedApiVersion, @NotNull String encryptedTechVersion, long j, @NotNull String sign) {
            Intrinsics.checkNotNullParameter(encryptedDeviceImei, "encryptedDeviceImei");
            Intrinsics.checkNotNullParameter(encryptedEid, "encryptedEid");
            Intrinsics.checkNotNullParameter(encryptedApiVersion, "encryptedApiVersion");
            Intrinsics.checkNotNullParameter(encryptedTechVersion, "encryptedTechVersion");
            Intrinsics.checkNotNullParameter(sign, "sign");
            this.encryptedDeviceImei = encryptedDeviceImei;
            this.encryptedEid = encryptedEid;
            this.encryptedApiVersion = encryptedApiVersion;
            this.encryptedTechVersion = encryptedTechVersion;
            this.m_time = j;
            this.sign = sign;
        }

        public static /* synthetic */ ChinaMobileSignResult copy$default(ChinaMobileSignResult chinaMobileSignResult, String str, String str2, String str3, String str4, long j, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chinaMobileSignResult.encryptedDeviceImei;
            }
            if ((i & 2) != 0) {
                str2 = chinaMobileSignResult.encryptedEid;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = chinaMobileSignResult.encryptedApiVersion;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = chinaMobileSignResult.encryptedTechVersion;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                j = chinaMobileSignResult.m_time;
            }
            long j2 = j;
            if ((i & 32) != 0) {
                str5 = chinaMobileSignResult.sign;
            }
            return chinaMobileSignResult.copy(str, str6, str7, str8, j2, str5);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEncryptedDeviceImei() {
            return this.encryptedDeviceImei;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getEncryptedEid() {
            return this.encryptedEid;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getEncryptedApiVersion() {
            return this.encryptedApiVersion;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getEncryptedTechVersion() {
            return this.encryptedTechVersion;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getM_time() {
            return this.m_time;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSign() {
            return this.sign;
        }

        @NotNull
        public final ChinaMobileSignResult copy(@NotNull String encryptedDeviceImei, @NotNull String encryptedEid, @NotNull String encryptedApiVersion, @NotNull String encryptedTechVersion, long m_time, @NotNull String sign) {
            Intrinsics.checkNotNullParameter(encryptedDeviceImei, "encryptedDeviceImei");
            Intrinsics.checkNotNullParameter(encryptedEid, "encryptedEid");
            Intrinsics.checkNotNullParameter(encryptedApiVersion, "encryptedApiVersion");
            Intrinsics.checkNotNullParameter(encryptedTechVersion, "encryptedTechVersion");
            Intrinsics.checkNotNullParameter(sign, "sign");
            return new ChinaMobileSignResult(encryptedDeviceImei, encryptedEid, encryptedApiVersion, encryptedTechVersion, m_time, sign);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChinaMobileSignResult)) {
                return false;
            }
            ChinaMobileSignResult chinaMobileSignResult = (ChinaMobileSignResult) other;
            return Intrinsics.areEqual(this.encryptedDeviceImei, chinaMobileSignResult.encryptedDeviceImei) && Intrinsics.areEqual(this.encryptedEid, chinaMobileSignResult.encryptedEid) && Intrinsics.areEqual(this.encryptedApiVersion, chinaMobileSignResult.encryptedApiVersion) && Intrinsics.areEqual(this.encryptedTechVersion, chinaMobileSignResult.encryptedTechVersion) && this.m_time == chinaMobileSignResult.m_time && Intrinsics.areEqual(this.sign, chinaMobileSignResult.sign);
        }

        @NotNull
        public final String getEncryptedApiVersion() {
            return this.encryptedApiVersion;
        }

        @NotNull
        public final String getEncryptedDeviceImei() {
            return this.encryptedDeviceImei;
        }

        @NotNull
        public final String getEncryptedEid() {
            return this.encryptedEid;
        }

        @NotNull
        public final String getEncryptedTechVersion() {
            return this.encryptedTechVersion;
        }

        public final long getM_time() {
            return this.m_time;
        }

        @NotNull
        public final String getSign() {
            return this.sign;
        }

        public int hashCode() {
            return (((((((((this.encryptedDeviceImei.hashCode() * 31) + this.encryptedEid.hashCode()) * 31) + this.encryptedApiVersion.hashCode()) * 31) + this.encryptedTechVersion.hashCode()) * 31) + Long.hashCode(this.m_time)) * 31) + this.sign.hashCode();
        }

        @NotNull
        public String toString() {
            return "ChinaMobileSignResult(encryptedDeviceImei=" + this.encryptedDeviceImei + ", encryptedEid=" + this.encryptedEid + ", encryptedApiVersion=" + this.encryptedApiVersion + ", encryptedTechVersion=" + this.encryptedTechVersion + ", m_time=" + this.m_time + ", sign=" + this.sign + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/mi/fitness/lpamanagement/request/data/GetSignResult$ChinaUnicomSignResult;", "", "mCiphertext", "", "mCiphertextSign", "timeTemp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getMCiphertext", "()Ljava/lang/String;", "getMCiphertextSign", "getTimeTemp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChinaUnicomSignResult {

        @NotNull
        private final String mCiphertext;

        @NotNull
        private final String mCiphertextSign;
        private final long timeTemp;

        public ChinaUnicomSignResult(@NotNull String mCiphertext, @NotNull String mCiphertextSign, long j) {
            Intrinsics.checkNotNullParameter(mCiphertext, "mCiphertext");
            Intrinsics.checkNotNullParameter(mCiphertextSign, "mCiphertextSign");
            this.mCiphertext = mCiphertext;
            this.mCiphertextSign = mCiphertextSign;
            this.timeTemp = j;
        }

        public static /* synthetic */ ChinaUnicomSignResult copy$default(ChinaUnicomSignResult chinaUnicomSignResult, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chinaUnicomSignResult.mCiphertext;
            }
            if ((i & 2) != 0) {
                str2 = chinaUnicomSignResult.mCiphertextSign;
            }
            if ((i & 4) != 0) {
                j = chinaUnicomSignResult.timeTemp;
            }
            return chinaUnicomSignResult.copy(str, str2, j);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMCiphertext() {
            return this.mCiphertext;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMCiphertextSign() {
            return this.mCiphertextSign;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTimeTemp() {
            return this.timeTemp;
        }

        @NotNull
        public final ChinaUnicomSignResult copy(@NotNull String mCiphertext, @NotNull String mCiphertextSign, long timeTemp) {
            Intrinsics.checkNotNullParameter(mCiphertext, "mCiphertext");
            Intrinsics.checkNotNullParameter(mCiphertextSign, "mCiphertextSign");
            return new ChinaUnicomSignResult(mCiphertext, mCiphertextSign, timeTemp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChinaUnicomSignResult)) {
                return false;
            }
            ChinaUnicomSignResult chinaUnicomSignResult = (ChinaUnicomSignResult) other;
            return Intrinsics.areEqual(this.mCiphertext, chinaUnicomSignResult.mCiphertext) && Intrinsics.areEqual(this.mCiphertextSign, chinaUnicomSignResult.mCiphertextSign) && this.timeTemp == chinaUnicomSignResult.timeTemp;
        }

        @NotNull
        public final String getMCiphertext() {
            return this.mCiphertext;
        }

        @NotNull
        public final String getMCiphertextSign() {
            return this.mCiphertextSign;
        }

        public final long getTimeTemp() {
            return this.timeTemp;
        }

        public int hashCode() {
            return (((this.mCiphertext.hashCode() * 31) + this.mCiphertextSign.hashCode()) * 31) + Long.hashCode(this.timeTemp);
        }

        @NotNull
        public String toString() {
            return "ChinaUnicomSignResult(mCiphertext=" + this.mCiphertext + ", mCiphertextSign=" + this.mCiphertextSign + ", timeTemp=" + this.timeTemp + ")";
        }
    }

    public GetSignResult(int i, @Nullable ChinaMobileSignResult chinaMobileSignResult, @Nullable ChinaUnicomSignResult chinaUnicomSignResult) {
        this.operator = i;
        this.chinaMobileResp = chinaMobileSignResult;
        this.chinaUnicomResp = chinaUnicomSignResult;
    }

    public static /* synthetic */ GetSignResult copy$default(GetSignResult getSignResult, int i, ChinaMobileSignResult chinaMobileSignResult, ChinaUnicomSignResult chinaUnicomSignResult, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getSignResult.operator;
        }
        if ((i2 & 2) != 0) {
            chinaMobileSignResult = getSignResult.chinaMobileResp;
        }
        if ((i2 & 4) != 0) {
            chinaUnicomSignResult = getSignResult.chinaUnicomResp;
        }
        return getSignResult.copy(i, chinaMobileSignResult, chinaUnicomSignResult);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOperator() {
        return this.operator;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChinaMobileSignResult getChinaMobileResp() {
        return this.chinaMobileResp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChinaUnicomSignResult getChinaUnicomResp() {
        return this.chinaUnicomResp;
    }

    @NotNull
    public final GetSignResult copy(int operator, @Nullable ChinaMobileSignResult chinaMobileResp, @Nullable ChinaUnicomSignResult chinaUnicomResp) {
        return new GetSignResult(operator, chinaMobileResp, chinaUnicomResp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSignResult)) {
            return false;
        }
        GetSignResult getSignResult = (GetSignResult) other;
        return this.operator == getSignResult.operator && Intrinsics.areEqual(this.chinaMobileResp, getSignResult.chinaMobileResp) && Intrinsics.areEqual(this.chinaUnicomResp, getSignResult.chinaUnicomResp);
    }

    @Nullable
    public final ChinaMobileSignResult getChinaMobileResp() {
        return this.chinaMobileResp;
    }

    @Nullable
    public final ChinaUnicomSignResult getChinaUnicomResp() {
        return this.chinaUnicomResp;
    }

    public final int getOperator() {
        return this.operator;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.operator) * 31;
        ChinaMobileSignResult chinaMobileSignResult = this.chinaMobileResp;
        int iHashCode2 = (iHashCode + (chinaMobileSignResult == null ? 0 : chinaMobileSignResult.hashCode())) * 31;
        ChinaUnicomSignResult chinaUnicomSignResult = this.chinaUnicomResp;
        return iHashCode2 + (chinaUnicomSignResult != null ? chinaUnicomSignResult.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetSignResult(operator=" + this.operator + ", chinaMobileResp=" + this.chinaMobileResp + ", chinaUnicomResp=" + this.chinaUnicomResp + ")";
    }

    public /* synthetic */ GetSignResult(int i, ChinaMobileSignResult chinaMobileSignResult, ChinaUnicomSignResult chinaUnicomSignResult, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : chinaMobileSignResult, (i2 & 4) != 0 ? null : chinaUnicomSignResult);
    }
}
