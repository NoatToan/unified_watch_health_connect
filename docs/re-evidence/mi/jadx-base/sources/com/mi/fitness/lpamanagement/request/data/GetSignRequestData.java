package com.mi.fitness.lpamanagement.request.data;

import com.xiaomi.account.openauth.AuthorizeActivityBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/mi/fitness/lpamanagement/request/data/GetSignRequestData;", "", AuthorizeActivityBase.KEY_OPERATOR, "", "china_mobile_req", "Lcom/mi/fitness/lpamanagement/request/data/GetSignRequestData$ChinaMobileSignRequestData;", "china_unicom_req", "Lcom/mi/fitness/lpamanagement/request/data/GetSignRequestData$ChinaUnicomSignRequestData;", "<init>", "(ILcom/mi/fitness/lpamanagement/request/data/GetSignRequestData$ChinaMobileSignRequestData;Lcom/mi/fitness/lpamanagement/request/data/GetSignRequestData$ChinaUnicomSignRequestData;)V", "getOperator", "()I", "getChina_mobile_req", "()Lcom/mi/fitness/lpamanagement/request/data/GetSignRequestData$ChinaMobileSignRequestData;", "getChina_unicom_req", "()Lcom/mi/fitness/lpamanagement/request/data/GetSignRequestData$ChinaUnicomSignRequestData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ChinaMobileSignRequestData", "ChinaUnicomSignRequestData", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetSignRequestData {

    @Nullable
    private final ChinaMobileSignRequestData china_mobile_req;

    @Nullable
    private final ChinaUnicomSignRequestData china_unicom_req;
    private final int operator;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006,"}, d2 = {"Lcom/mi/fitness/lpamanagement/request/data/GetSignRequestData$ChinaUnicomSignRequestData;", "", "mResultCode", "", "mDeviceType", "mDeviceIMEI", "", "mDeviceSerialNumber", "mProductName", "mEID", "mIMSI", "mICCID", "mOsVersion", "mAidlVersion", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMResultCode", "()I", "getMDeviceType", "getMDeviceIMEI", "()Ljava/lang/String;", "getMDeviceSerialNumber", "getMProductName", "getMEID", "getMIMSI", "getMICCID", "getMOsVersion", "getMAidlVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChinaUnicomSignRequestData {

        @NotNull
        private final String mAidlVersion;

        @NotNull
        private final String mDeviceIMEI;

        @NotNull
        private final String mDeviceSerialNumber;
        private final int mDeviceType;

        @NotNull
        private final String mEID;

        @NotNull
        private final String mICCID;

        @NotNull
        private final String mIMSI;

        @NotNull
        private final String mOsVersion;

        @NotNull
        private final String mProductName;
        private final int mResultCode;

        public ChinaUnicomSignRequestData(int i, int i2, @NotNull String mDeviceIMEI, @NotNull String mDeviceSerialNumber, @NotNull String mProductName, @NotNull String mEID, @NotNull String mIMSI, @NotNull String mICCID, @NotNull String mOsVersion, @NotNull String mAidlVersion) {
            Intrinsics.checkNotNullParameter(mDeviceIMEI, "mDeviceIMEI");
            Intrinsics.checkNotNullParameter(mDeviceSerialNumber, "mDeviceSerialNumber");
            Intrinsics.checkNotNullParameter(mProductName, "mProductName");
            Intrinsics.checkNotNullParameter(mEID, "mEID");
            Intrinsics.checkNotNullParameter(mIMSI, "mIMSI");
            Intrinsics.checkNotNullParameter(mICCID, "mICCID");
            Intrinsics.checkNotNullParameter(mOsVersion, "mOsVersion");
            Intrinsics.checkNotNullParameter(mAidlVersion, "mAidlVersion");
            this.mResultCode = i;
            this.mDeviceType = i2;
            this.mDeviceIMEI = mDeviceIMEI;
            this.mDeviceSerialNumber = mDeviceSerialNumber;
            this.mProductName = mProductName;
            this.mEID = mEID;
            this.mIMSI = mIMSI;
            this.mICCID = mICCID;
            this.mOsVersion = mOsVersion;
            this.mAidlVersion = mAidlVersion;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMResultCode() {
            return this.mResultCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getMAidlVersion() {
            return this.mAidlVersion;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMDeviceType() {
            return this.mDeviceType;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMDeviceIMEI() {
            return this.mDeviceIMEI;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMDeviceSerialNumber() {
            return this.mDeviceSerialNumber;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getMProductName() {
            return this.mProductName;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getMEID() {
            return this.mEID;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getMIMSI() {
            return this.mIMSI;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getMICCID() {
            return this.mICCID;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getMOsVersion() {
            return this.mOsVersion;
        }

        @NotNull
        public final ChinaUnicomSignRequestData copy(int mResultCode, int mDeviceType, @NotNull String mDeviceIMEI, @NotNull String mDeviceSerialNumber, @NotNull String mProductName, @NotNull String mEID, @NotNull String mIMSI, @NotNull String mICCID, @NotNull String mOsVersion, @NotNull String mAidlVersion) {
            Intrinsics.checkNotNullParameter(mDeviceIMEI, "mDeviceIMEI");
            Intrinsics.checkNotNullParameter(mDeviceSerialNumber, "mDeviceSerialNumber");
            Intrinsics.checkNotNullParameter(mProductName, "mProductName");
            Intrinsics.checkNotNullParameter(mEID, "mEID");
            Intrinsics.checkNotNullParameter(mIMSI, "mIMSI");
            Intrinsics.checkNotNullParameter(mICCID, "mICCID");
            Intrinsics.checkNotNullParameter(mOsVersion, "mOsVersion");
            Intrinsics.checkNotNullParameter(mAidlVersion, "mAidlVersion");
            return new ChinaUnicomSignRequestData(mResultCode, mDeviceType, mDeviceIMEI, mDeviceSerialNumber, mProductName, mEID, mIMSI, mICCID, mOsVersion, mAidlVersion);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChinaUnicomSignRequestData)) {
                return false;
            }
            ChinaUnicomSignRequestData chinaUnicomSignRequestData = (ChinaUnicomSignRequestData) other;
            return this.mResultCode == chinaUnicomSignRequestData.mResultCode && this.mDeviceType == chinaUnicomSignRequestData.mDeviceType && Intrinsics.areEqual(this.mDeviceIMEI, chinaUnicomSignRequestData.mDeviceIMEI) && Intrinsics.areEqual(this.mDeviceSerialNumber, chinaUnicomSignRequestData.mDeviceSerialNumber) && Intrinsics.areEqual(this.mProductName, chinaUnicomSignRequestData.mProductName) && Intrinsics.areEqual(this.mEID, chinaUnicomSignRequestData.mEID) && Intrinsics.areEqual(this.mIMSI, chinaUnicomSignRequestData.mIMSI) && Intrinsics.areEqual(this.mICCID, chinaUnicomSignRequestData.mICCID) && Intrinsics.areEqual(this.mOsVersion, chinaUnicomSignRequestData.mOsVersion) && Intrinsics.areEqual(this.mAidlVersion, chinaUnicomSignRequestData.mAidlVersion);
        }

        @NotNull
        public final String getMAidlVersion() {
            return this.mAidlVersion;
        }

        @NotNull
        public final String getMDeviceIMEI() {
            return this.mDeviceIMEI;
        }

        @NotNull
        public final String getMDeviceSerialNumber() {
            return this.mDeviceSerialNumber;
        }

        public final int getMDeviceType() {
            return this.mDeviceType;
        }

        @NotNull
        public final String getMEID() {
            return this.mEID;
        }

        @NotNull
        public final String getMICCID() {
            return this.mICCID;
        }

        @NotNull
        public final String getMIMSI() {
            return this.mIMSI;
        }

        @NotNull
        public final String getMOsVersion() {
            return this.mOsVersion;
        }

        @NotNull
        public final String getMProductName() {
            return this.mProductName;
        }

        public final int getMResultCode() {
            return this.mResultCode;
        }

        public int hashCode() {
            return (((((((((((((((((Integer.hashCode(this.mResultCode) * 31) + Integer.hashCode(this.mDeviceType)) * 31) + this.mDeviceIMEI.hashCode()) * 31) + this.mDeviceSerialNumber.hashCode()) * 31) + this.mProductName.hashCode()) * 31) + this.mEID.hashCode()) * 31) + this.mIMSI.hashCode()) * 31) + this.mICCID.hashCode()) * 31) + this.mOsVersion.hashCode()) * 31) + this.mAidlVersion.hashCode();
        }

        @NotNull
        public String toString() {
            return "ChinaUnicomSignRequestData(mResultCode=" + this.mResultCode + ", mDeviceType=" + this.mDeviceType + ", mDeviceIMEI=" + this.mDeviceIMEI + ", mDeviceSerialNumber=" + this.mDeviceSerialNumber + ", mProductName=" + this.mProductName + ", mEID=" + this.mEID + ", mIMSI=" + this.mIMSI + ", mICCID=" + this.mICCID + ", mOsVersion=" + this.mOsVersion + ", mAidlVersion=" + this.mAidlVersion + ")";
        }
    }

    public GetSignRequestData(int i, @Nullable ChinaMobileSignRequestData chinaMobileSignRequestData, @Nullable ChinaUnicomSignRequestData chinaUnicomSignRequestData) {
        this.operator = i;
        this.china_mobile_req = chinaMobileSignRequestData;
        this.china_unicom_req = chinaUnicomSignRequestData;
    }

    public static /* synthetic */ GetSignRequestData copy$default(GetSignRequestData getSignRequestData, int i, ChinaMobileSignRequestData chinaMobileSignRequestData, ChinaUnicomSignRequestData chinaUnicomSignRequestData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getSignRequestData.operator;
        }
        if ((i2 & 2) != 0) {
            chinaMobileSignRequestData = getSignRequestData.china_mobile_req;
        }
        if ((i2 & 4) != 0) {
            chinaUnicomSignRequestData = getSignRequestData.china_unicom_req;
        }
        return getSignRequestData.copy(i, chinaMobileSignRequestData, chinaUnicomSignRequestData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOperator() {
        return this.operator;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChinaMobileSignRequestData getChina_mobile_req() {
        return this.china_mobile_req;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChinaUnicomSignRequestData getChina_unicom_req() {
        return this.china_unicom_req;
    }

    @NotNull
    public final GetSignRequestData copy(int operator, @Nullable ChinaMobileSignRequestData china_mobile_req, @Nullable ChinaUnicomSignRequestData china_unicom_req) {
        return new GetSignRequestData(operator, china_mobile_req, china_unicom_req);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSignRequestData)) {
            return false;
        }
        GetSignRequestData getSignRequestData = (GetSignRequestData) other;
        return this.operator == getSignRequestData.operator && Intrinsics.areEqual(this.china_mobile_req, getSignRequestData.china_mobile_req) && Intrinsics.areEqual(this.china_unicom_req, getSignRequestData.china_unicom_req);
    }

    @Nullable
    public final ChinaMobileSignRequestData getChina_mobile_req() {
        return this.china_mobile_req;
    }

    @Nullable
    public final ChinaUnicomSignRequestData getChina_unicom_req() {
        return this.china_unicom_req;
    }

    public final int getOperator() {
        return this.operator;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.operator) * 31;
        ChinaMobileSignRequestData chinaMobileSignRequestData = this.china_mobile_req;
        int iHashCode2 = (iHashCode + (chinaMobileSignRequestData == null ? 0 : chinaMobileSignRequestData.hashCode())) * 31;
        ChinaUnicomSignRequestData chinaUnicomSignRequestData = this.china_unicom_req;
        return iHashCode2 + (chinaUnicomSignRequestData != null ? chinaUnicomSignRequestData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetSignRequestData(operator=" + this.operator + ", china_mobile_req=" + this.china_mobile_req + ", china_unicom_req=" + this.china_unicom_req + ")";
    }

    public /* synthetic */ GetSignRequestData(int i, ChinaMobileSignRequestData chinaMobileSignRequestData, ChinaUnicomSignRequestData chinaUnicomSignRequestData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : chinaMobileSignRequestData, (i2 & 4) != 0 ? null : chinaUnicomSignRequestData);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/mi/fitness/lpamanagement/request/data/GetSignRequestData$ChinaMobileSignRequestData;", "", "m_device_imei", "", "m_eid", "m_api_version", "", "m_tech_version", "m_time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIJ)V", "getM_device_imei", "()Ljava/lang/String;", "getM_eid", "getM_api_version", "()I", "getM_tech_version", "getM_time", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChinaMobileSignRequestData {
        private final int m_api_version;

        @NotNull
        private final String m_device_imei;

        @NotNull
        private final String m_eid;
        private final int m_tech_version;
        private final long m_time;

        public ChinaMobileSignRequestData(@NotNull String m_device_imei, @NotNull String m_eid, int i, int i2, long j) {
            Intrinsics.checkNotNullParameter(m_device_imei, "m_device_imei");
            Intrinsics.checkNotNullParameter(m_eid, "m_eid");
            this.m_device_imei = m_device_imei;
            this.m_eid = m_eid;
            this.m_api_version = i;
            this.m_tech_version = i2;
            this.m_time = j;
        }

        public static /* synthetic */ ChinaMobileSignRequestData copy$default(ChinaMobileSignRequestData chinaMobileSignRequestData, String str, String str2, int i, int i2, long j, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = chinaMobileSignRequestData.m_device_imei;
            }
            if ((i3 & 2) != 0) {
                str2 = chinaMobileSignRequestData.m_eid;
            }
            String str3 = str2;
            if ((i3 & 4) != 0) {
                i = chinaMobileSignRequestData.m_api_version;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = chinaMobileSignRequestData.m_tech_version;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                j = chinaMobileSignRequestData.m_time;
            }
            return chinaMobileSignRequestData.copy(str, str3, i4, i5, j);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getM_device_imei() {
            return this.m_device_imei;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getM_eid() {
            return this.m_eid;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getM_api_version() {
            return this.m_api_version;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getM_tech_version() {
            return this.m_tech_version;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getM_time() {
            return this.m_time;
        }

        @NotNull
        public final ChinaMobileSignRequestData copy(@NotNull String m_device_imei, @NotNull String m_eid, int m_api_version, int m_tech_version, long m_time) {
            Intrinsics.checkNotNullParameter(m_device_imei, "m_device_imei");
            Intrinsics.checkNotNullParameter(m_eid, "m_eid");
            return new ChinaMobileSignRequestData(m_device_imei, m_eid, m_api_version, m_tech_version, m_time);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChinaMobileSignRequestData)) {
                return false;
            }
            ChinaMobileSignRequestData chinaMobileSignRequestData = (ChinaMobileSignRequestData) other;
            return Intrinsics.areEqual(this.m_device_imei, chinaMobileSignRequestData.m_device_imei) && Intrinsics.areEqual(this.m_eid, chinaMobileSignRequestData.m_eid) && this.m_api_version == chinaMobileSignRequestData.m_api_version && this.m_tech_version == chinaMobileSignRequestData.m_tech_version && this.m_time == chinaMobileSignRequestData.m_time;
        }

        public final int getM_api_version() {
            return this.m_api_version;
        }

        @NotNull
        public final String getM_device_imei() {
            return this.m_device_imei;
        }

        @NotNull
        public final String getM_eid() {
            return this.m_eid;
        }

        public final int getM_tech_version() {
            return this.m_tech_version;
        }

        public final long getM_time() {
            return this.m_time;
        }

        public int hashCode() {
            return (((((((this.m_device_imei.hashCode() * 31) + this.m_eid.hashCode()) * 31) + Integer.hashCode(this.m_api_version)) * 31) + Integer.hashCode(this.m_tech_version)) * 31) + Long.hashCode(this.m_time);
        }

        @NotNull
        public String toString() {
            return "ChinaMobileSignRequestData(m_device_imei=" + this.m_device_imei + ", m_eid=" + this.m_eid + ", m_api_version=" + this.m_api_version + ", m_tech_version=" + this.m_tech_version + ", m_time=" + this.m_time + ")";
        }

        public /* synthetic */ ChinaMobileSignRequestData(String str, String str2, int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i, i2, (i3 & 16) != 0 ? System.currentTimeMillis() : j);
        }
    }
}
