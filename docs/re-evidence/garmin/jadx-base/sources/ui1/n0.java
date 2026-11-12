package ui1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0015\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u000e\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010\u0018R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0019\u00103¨\u00064"}, d2 = {"Lui1/n0;", "", "", "accountAssigned", "", "compatibleProductCodes", "garminPartNumber", "garminSerialNumber", "ICCID", "IMEI", "IMSI", "", "inventoryStatus", "", "isBlackListed", "MSISDN", "modelType", "", "unitID", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "a", "Ljava/lang/String;", "getAccountAssigned", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getCompatibleProductCodes", "()Ljava/util/List;", "c", "getGarminPartNumber", "d", "getGarminSerialNumber", JWKParameterNames.RSA_EXPONENT, "getICCID", "f", "getIMEI", "g", "getIMSI", "h", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "j", "getMSISDN", JWKParameterNames.OCT_KEY_VALUE, "getModelType", "l", "Ljava/lang/Long;", "()Ljava/lang/Long;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("AccountAssigned")
    private final String accountAssigned;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CompatibleProductCodes")
    private final List<String> compatibleProductCodes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("GarminPartNumber")
    private final String garminPartNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("GarminSerialNumber")
    private final String garminSerialNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ICCID")
    private final String ICCID;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("IMEI")
    private final String IMEI;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("IMSI")
    private final String IMSI;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("InventoryStatus")
    private final Integer inventoryStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("IsBlackListed")
    private final Boolean isBlackListed;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("MSISDN")
    private final String MSISDN;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ModelType")
    private final String modelType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("UnitID")
    private final Long unitID;

    public /* synthetic */ n0(String str, List list, String str2, String str3, String str4, String str5, String str6, Integer num, Boolean bool, String str7, String str8, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : num, (i14 & 256) != 0 ? null : bool, (i14 & 512) != 0 ? null : str7, (i14 & 1024) != 0 ? null : str8, (i14 & 2048) != 0 ? null : l14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getInventoryStatus() {
        return this.inventoryStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getUnitID() {
        return this.unitID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return p005kotlin.jvm.internal.s.g(this.accountAssigned, n0Var.accountAssigned) && p005kotlin.jvm.internal.s.g(this.compatibleProductCodes, n0Var.compatibleProductCodes) && p005kotlin.jvm.internal.s.g(this.garminPartNumber, n0Var.garminPartNumber) && p005kotlin.jvm.internal.s.g(this.garminSerialNumber, n0Var.garminSerialNumber) && p005kotlin.jvm.internal.s.g(this.ICCID, n0Var.ICCID) && p005kotlin.jvm.internal.s.g(this.IMEI, n0Var.IMEI) && p005kotlin.jvm.internal.s.g(this.IMSI, n0Var.IMSI) && p005kotlin.jvm.internal.s.g(this.inventoryStatus, n0Var.inventoryStatus) && p005kotlin.jvm.internal.s.g(this.isBlackListed, n0Var.isBlackListed) && p005kotlin.jvm.internal.s.g(this.MSISDN, n0Var.MSISDN) && p005kotlin.jvm.internal.s.g(this.modelType, n0Var.modelType) && p005kotlin.jvm.internal.s.g(this.unitID, n0Var.unitID);
    }

    public final int hashCode() {
        String str = this.accountAssigned;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.compatibleProductCodes;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.garminPartNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.garminSerialNumber;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ICCID;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.IMEI;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.IMSI;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.inventoryStatus;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isBlackListed;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.MSISDN;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.modelType;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l14 = this.unitID;
        return iHashCode11 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.accountAssigned;
        List<String> list = this.compatibleProductCodes;
        String str2 = this.garminPartNumber;
        String str3 = this.garminSerialNumber;
        String str4 = this.ICCID;
        String str5 = this.IMEI;
        String str6 = this.IMSI;
        Integer num = this.inventoryStatus;
        Boolean bool = this.isBlackListed;
        String str7 = this.MSISDN;
        String str8 = this.modelType;
        Long l14 = this.unitID;
        StringBuilder sbG = l2.g("SubscriptionsDevicesItem(accountAssigned=", str, ", compatibleProductCodes=", list, ", garminPartNumber=");
        sn.a.t(sbG, str2, ", garminSerialNumber=", str3, ", ICCID=");
        sn.a.t(sbG, str4, ", IMEI=", str5, ", IMSI=");
        fb1.c.u(num, str6, ", inventoryStatus=", ", isBlackListed=", sbG);
        b71.i.s(sbG, bool, ", MSISDN=", str7, ", modelType=");
        sbG.append(str8);
        sbG.append(", unitID=");
        sbG.append(l14);
        sbG.append(")");
        return sbG.toString();
    }

    public n0(String str, List<String> list, String str2, String str3, String str4, String str5, String str6, Integer num, Boolean bool, String str7, String str8, Long l14) {
        this.accountAssigned = str;
        this.compatibleProductCodes = list;
        this.garminPartNumber = str2;
        this.garminSerialNumber = str3;
        this.ICCID = str4;
        this.IMEI = str5;
        this.IMSI = str6;
        this.inventoryStatus = num;
        this.isBlackListed = bool;
        this.MSISDN = str7;
        this.modelType = str8;
        this.unitID = l14;
    }

    public n0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
