package xo2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.github.mikephil.chartingv2.BuildConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vo2.z;
import zn2.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c?Bµ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012$\b\u0002\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0013j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001c\u0010$\"\u0004\b%\u0010&R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\"\u0010)R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010)\"\u0004\b'\u00107R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001d\u001a\u0004\b9\u0010\u001f\"\u0004\b*\u0010!R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010\u001d\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010!R2\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0013j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lxo2/d;", "", "", "syncId", "packageId", "Lxo2/d$a;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "Lzn2/i;", "stateFlags", "", "executedTsEpoch", "", "executedDuration", "", "Lxo2/b;", "apduResponses", "errorReason", "errorCode", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "metrics", "Lhs2/a;", "deviceWalletMetadata", "Lvo2/z;", "syncSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lxo2/d$a;Ljava/util/List;JLjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lhs2/a;Lvo2/z;)V", "b", "Ljava/lang/String;", "getPackageId", "()Ljava/lang/String;", "setPackageId", "(Ljava/lang/String;)V", "c", "Lxo2/d$a;", "()Lxo2/d$a;", "f", "(Lxo2/d$a;)V", "d", "Ljava/util/List;", "()Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "J", "getExecutedTsEpoch", "()J", "setExecutedTsEpoch", "(J)V", "Ljava/lang/Integer;", "getExecutedDuration", "()Ljava/lang/Integer;", "setExecutedDuration", "(Ljava/lang/Integer;)V", "g", "getApduResponses", "(Ljava/util/List;)V", "h", "getErrorReason", IntegerTokenConverter.CONVERTER_KEY, "getErrorCode", "setErrorCode", "j", "Ljava/util/HashMap;", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f191774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("packageId")
    private String packageId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private a state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stateFlags")
    private final List<i> stateFlags;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("executedTsEpoch")
    private long executedTsEpoch;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("executedDuration")
    private Integer executedDuration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apduResponses")
    private List<xo2.b> apduResponses;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorReason")
    private String errorReason;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorCode")
    private String errorCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metrics")
    private HashMap<String, Object> metrics;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient hs2.a f191784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient z f191785l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxo2/d$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        PROCESSED("PROCESSED"),
        FAILED("FAILED"),
        EXPIRED("EXPIRED"),
        ERROR("ERROR"),
        NOT_PROCESSED("NOT_PROCESSED"),
        /* JADX INFO: Fake field, exist only in values array */
        SKIPPED("SKIPPED"),
        /* JADX INFO: Fake field, exist only in values array */
        SUCCESS("SUCCESS");

        a(String str) {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxo2/d$b;", "Lzn2/i;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b implements i {
        UNSUCCESSFUL_RESPONSE("UNSUCCESSFUL_RESPONSE"),
        UNABLE_TO_OPEN_APDU_TRANSFER("UNABLE_TO_OPEN_APDU_TRANSFER"),
        UNABLE_TO_GET_COMMAND_BYTES("UNABLE_TO_GET_COMMAND_BYTES"),
        RECEIVED_NULL_RESPONSE_FROM_DEVICE("RECEIVED_NULL_RESPONSE_FROM_DEVICE"),
        /* JADX INFO: Fake field, exist only in values array */
        UNABLE_TO_CLOSE_TRANSFER("UNABLE_TO_CLOSE_TRANSFER"),
        MISSING_APDU_SESSION_ID("MISSING_APDU_SESSION_ID"),
        TRANSFER_INACTIVE("TRANSFER_INACTIVE"),
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN("UNKNOWN");

        b(String str) {
        }
    }

    public /* synthetic */ d(String str, String str2, a aVar, List list, long j8, Integer num, List list2, String str3, String str4, HashMap map, hs2.a aVar2, z zVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? a.NOT_PROCESSED : aVar, (i14 & 8) != 0 ? new ArrayList() : list, (i14 & 16) != 0 ? System.currentTimeMillis() : j8, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? new ArrayList() : list2, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? new HashMap() : map, (i14 & 1024) != 0 ? null : aVar2, (i14 & 2048) != 0 ? null : zVar);
    }

    public final void a() {
        this.executedDuration = Integer.valueOf((int) (System.currentTimeMillis() - this.executedTsEpoch));
        HashMap<String, Object> map = this.metrics;
        String str = this.f191774a;
        if (str != null) {
            map.put("syncId", str);
        }
        z zVar = this.f191785l;
        if (zVar != null) {
            map.put("syncSource", zVar.f179245a);
        }
        map.put("mobileOS", "Android");
        aq2.j.f12491a.getClass();
        map.put("gcmVersion", (String) aq2.j.f12493c.getValue());
        map.put("libraryVersion", BuildConfig.VERSION_NAME);
        hs2.a aVar = this.f191784k;
        if (aVar != null) {
            map.put("firmwareVersion", Integer.valueOf(aVar.getFirmwareVersion()));
            map.put("modelNumber", Integer.valueOf(aVar.getProductNumber()));
            map.put("nfcChipType", aVar.getNfcInfo().getNfcChipType().name());
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getState() {
        return this.state;
    }

    public final List<i> c() {
        return this.stateFlags;
    }

    public final void d(List<xo2.b> list) {
        list.getClass();
        this.apduResponses = list;
    }

    public final void e(String str) {
        this.errorReason = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f191774a, dVar.f191774a) && s.g(this.packageId, dVar.packageId) && this.state == dVar.state && s.g(this.stateFlags, dVar.stateFlags) && this.executedTsEpoch == dVar.executedTsEpoch && s.g(this.executedDuration, dVar.executedDuration) && s.g(this.apduResponses, dVar.apduResponses) && s.g(this.errorReason, dVar.errorReason) && s.g(this.errorCode, dVar.errorCode) && s.g(this.metrics, dVar.metrics) && s.g(this.f191784k, dVar.f191784k) && this.f191785l == dVar.f191785l;
    }

    public final void f(a aVar) {
        aVar.getClass();
        this.state = aVar;
    }

    public final int hashCode() {
        String str = this.f191774a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packageId;
        int iE = q6.f.e(u0.b((this.state.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.stateFlags), 31, this.executedTsEpoch);
        Integer num = this.executedDuration;
        int iB = u0.b((iE + (num == null ? 0 : num.hashCode())) * 31, 31, this.apduResponses);
        String str3 = this.errorReason;
        int iHashCode2 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorCode;
        int iHashCode3 = (this.metrics.hashCode() + ((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        hs2.a aVar = this.f191784k;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        z zVar = this.f191785l;
        return iHashCode4 + (zVar != null ? zVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.packageId;
        a aVar = this.state;
        List<i> list = this.stateFlags;
        long j8 = this.executedTsEpoch;
        Integer num = this.executedDuration;
        List<xo2.b> list2 = this.apduResponses;
        String str2 = this.errorReason;
        String str3 = this.errorCode;
        HashMap<String, Object> map = this.metrics;
        StringBuilder sbI = p6.b.i("ApduExecutionDetails(syncId=", this.f191774a, ", packageId=", str, ", state=");
        sbI.append(aVar);
        sbI.append(", stateFlags=");
        sbI.append(list);
        sbI.append(", executedTsEpoch=");
        sbI.append(j8);
        sbI.append(", executedDuration=");
        sbI.append(num);
        sbI.append(", apduResponses=");
        sbI.append(list2);
        sbI.append(", errorReason=");
        sbI.append(str2);
        sbI.append(", errorCode=");
        sbI.append(str3);
        sbI.append(", metrics=");
        sbI.append(map);
        sbI.append(", deviceWalletMetadata=");
        sbI.append(this.f191784k);
        sbI.append(", syncSource=");
        sbI.append(this.f191785l);
        sbI.append(")");
        return sbI.toString();
    }

    public d(String str, String str2, a aVar, List<i> list, long j8, Integer num, List<xo2.b> list2, String str3, String str4, HashMap<String, Object> map, hs2.a aVar2, z zVar) {
        aVar.getClass();
        list.getClass();
        list2.getClass();
        map.getClass();
        this.f191774a = str;
        this.packageId = str2;
        this.state = aVar;
        this.stateFlags = list;
        this.executedTsEpoch = j8;
        this.executedDuration = num;
        this.apduResponses = list2;
        this.errorReason = str3;
        this.errorCode = str4;
        this.metrics = map;
        this.f191784k = aVar2;
        this.f191785l = zVar;
    }

    public d() {
        this(null, null, null, null, 0L, null, null, null, null, null, null, null, 4095, null);
    }
}
