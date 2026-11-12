package yo2;

import com.github.mikephil.chartingv2.BuildConfig;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;
import vo2.z;
import zn2.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0015%B\u0083\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001a\u0010!\"\u0004\b\"\u0010#R0\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$¨\u0006&"}, d2 = {"Lyo2/a;", "", "", "syncId", "Lyo2/a$a;", "result", "message", "", "Lzn2/i;", "resultFlags", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "metrics", "", "startTime", "Lvo2/z;", "syncSource", "Lhs2/a;", "deviceWalletMetadata", "<init>", "(Ljava/lang/String;Lyo2/a$a;Ljava/lang/String;Ljava/util/List;Ljava/util/HashMap;JLvo2/z;Lhs2/a;)V", "b", "Lyo2/a$a;", "()Lyo2/a$a;", JWKParameterNames.RSA_EXPONENT, "(Lyo2/a$a;)V", "c", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "Ljava/util/List;", "()Ljava/util/List;", "setResultFlags", "(Ljava/util/List;)V", "Ljava/util/HashMap;", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f198525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("result")
    private EnumC3717a result;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private String message;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultFlags")
    private List<i> resultFlags;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metrics")
    private final HashMap<String, Object> metrics;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient long f198530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient z f198531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient hs2.a f198532h;

    /* JADX INFO: renamed from: yo2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyo2/a$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC3717a {
        SUCCESS("SUCCESS"),
        SKIPPED("SKIPPED"),
        FAILED("FAILED");

        EnumC3717a(String str) {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyo2/a$b;", "Lzn2/i;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b implements i {
        /* JADX INFO: Fake field, exist only in values array */
        UNABLE_TO_OPEN_DEVICE_WALLET_TRANSFER("UNABLE_TO_OPEN_DEVICE_WALLET_TRANSFER"),
        UNHANDLED_COMMIT_TYPE("UNHANDLED_COMMIT_TYPE"),
        UNABLE_TO_REQUEST_DEVICE_STATES("UNABLE_TO_REQUEST_DEVICE_STATE"),
        DEVICE_WALLET_TRANSFER_FAILED("DEVICE_WALLET_TRANSFER_FAILED"),
        /* JADX INFO: Fake field, exist only in values array */
        UNABLE_TO_LOAD_CREDIT_CARD("UNABLE_TO_LOAD_CREDIT_CARD"),
        /* JADX INFO: Fake field, exist only in values array */
        MISSING_TOW_COMMANDS("MISSING_TOW_COMMANDS"),
        MISSING_CREDITCARD_ID("MISSING_CREDITCARD_ID"),
        /* JADX INFO: Fake field, exist only in values array */
        UNABLE_TO_CREATE_CARD_HASH("UNABLE_TO_CREATE_CARD_HASH"),
        NOT_FOUND("NOT_FOUND"),
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN("UNKNOWN");

        b(String str) {
        }
    }

    public /* synthetic */ a(String str, EnumC3717a enumC3717a, String str2, List list, HashMap map, long j8, z zVar, hs2.a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : enumC3717a, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? new ArrayList() : list, (i14 & 16) != 0 ? new HashMap() : map, (i14 & 32) != 0 ? System.currentTimeMillis() : j8, (i14 & 64) != 0 ? null : zVar, (i14 & 128) != 0 ? null : aVar);
    }

    public final void a() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f198530f;
        HashMap<String, Object> map = this.metrics;
        map.put("executedDuration", Long.valueOf(jCurrentTimeMillis));
        String str = this.f198525a;
        if (str != null) {
            map.put("syncId", str);
        }
        z zVar = this.f198531g;
        if (zVar != null) {
            map.put("syncSource", zVar);
        }
        map.put("mobileOS", "Android");
        aq2.j.f12491a.getClass();
        map.put("gcmVersion", (String) aq2.j.f12493c.getValue());
        map.put("libraryVersion", BuildConfig.VERSION_NAME);
        hs2.a aVar = this.f198532h;
        if (aVar != null) {
            map.put("firmwareVersion", Integer.valueOf(aVar.getFirmwareVersion()));
            map.put("modelNumber", Integer.valueOf(aVar.getProductNumber()));
            map.put("nfcChipType", aVar.getNfcInfo().getNfcChipType().name());
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC3717a getResult() {
        return this.result;
    }

    public final List<i> c() {
        return this.resultFlags;
    }

    public final void d(String str) {
        this.message = str;
    }

    public final void e(EnumC3717a enumC3717a) {
        this.result = enumC3717a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f198525a, aVar.f198525a) && this.result == aVar.result && s.g(this.message, aVar.message) && s.g(this.resultFlags, aVar.resultFlags) && s.g(this.metrics, aVar.metrics) && this.f198530f == aVar.f198530f && this.f198531g == aVar.f198531g && s.g(this.f198532h, aVar.f198532h);
    }

    public final int hashCode() {
        String str = this.f198525a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EnumC3717a enumC3717a = this.result;
        int iHashCode2 = (iHashCode + (enumC3717a == null ? 0 : enumC3717a.hashCode())) * 31;
        String str2 = this.message;
        int iE = q6.f.e((this.metrics.hashCode() + u0.b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.resultFlags)) * 31, 31, this.f198530f);
        z zVar = this.f198531g;
        int iHashCode3 = (iE + (zVar == null ? 0 : zVar.hashCode())) * 31;
        hs2.a aVar = this.f198532h;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        EnumC3717a enumC3717a = this.result;
        String str = this.message;
        List<i> list = this.resultFlags;
        HashMap<String, Object> map = this.metrics;
        StringBuilder sb3 = new StringBuilder("CommitDetails(syncId=");
        sb3.append(this.f198525a);
        sb3.append(", result=");
        sb3.append(enumC3717a);
        sb3.append(", message=");
        e0.o(str, ", resultFlags=", ", metrics=", sb3, list);
        sb3.append(map);
        sb3.append(", startTime=");
        sb3.append(this.f198530f);
        sb3.append(", syncSource=");
        sb3.append(this.f198531g);
        sb3.append(", deviceWalletMetadata=");
        sb3.append(this.f198532h);
        sb3.append(")");
        return sb3.toString();
    }

    public a(String str, EnumC3717a enumC3717a, String str2, List<i> list, HashMap<String, Object> map, long j8, z zVar, hs2.a aVar) {
        list.getClass();
        map.getClass();
        this.f198525a = str;
        this.result = enumC3717a;
        this.message = str2;
        this.resultFlags = list;
        this.metrics = map;
        this.f198530f = j8;
        this.f198531g = zVar;
        this.f198532h = aVar;
    }

    public a() {
        this(null, null, null, null, null, 0L, null, null, 255, null);
    }
}
