package wo2;

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
import vo2.z;
import zn2.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0002&\u0016B\u0093\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000bj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b\u001f\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR2\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000bj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lwo2/e;", "", "", "syncId", "Lwo2/e$a;", "result", "", "Lzn2/i;", "resultFlags", "message", "commitIds", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "metrics", "Lhs2/a;", "deviceWalletMetadata", "Lvo2/z;", "syncSource", "", "startTime", "<init>", "(Ljava/lang/String;Lwo2/e$a;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/HashMap;Lhs2/a;Lvo2/z;J)V", "b", "Lwo2/e$a;", "getResult", "()Lwo2/e$a;", JWKParameterNames.RSA_EXPONENT, "(Lwo2/e$a;)V", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "f", "Ljava/util/HashMap;", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f186494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("result")
    private a result;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultFlags")
    private final List<i> resultFlags;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private String message;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("commitIds")
    private final List<String> commitIds;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metrics")
    private HashMap<String, Object> metrics;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient hs2.a f186500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient z f186501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient long f186502i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwo2/e$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        SUCCESS("SUCCESS"),
        FAILED("FAILED");

        a(String str) {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwo2/e$b;", "Lzn2/i;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b implements i {
        NO_SYNC_HANDLER("NO_SYNC_HANDLER"),
        DEVICE_NOT_BLUETOOTH_CONNECTED("DEVICE_NOT_BLUETOOTH_CONNECTED"),
        DEVICE_NOT_NFC_CONNECTED("DEVICE_NOT_NFC_CONNECTED"),
        DUPLICATE_SYNC("DUPLICATE_SYNC"),
        UNHANDLED_COMMIT_TYPE("UNHANDLED_COMMIT_TYPE"),
        UNABLE_TO_OPEN_APDU_TRANSFER("UNABLE_TO_OPEN_APDU_TRANSFER"),
        INVALID_APDU_PACKAGE("INVALID_APDU_PACKAGE"),
        /* JADX INFO: Fake field, exist only in values array */
        INVALID_CREDIT_CARD_PACKAGE("INVALID_CREDIT_CARD_PACKAGE"),
        INVALID_COMMIT_PAYLOAD("INVALID_COMMIT_PAYLOAD"),
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN("UNKNOWN");

        b(String str) {
        }
    }

    public /* synthetic */ e(String str, a aVar, List list, String str2, List list2, HashMap map, hs2.a aVar2, z zVar, long j8, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? new ArrayList() : list, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? new ArrayList() : list2, (i14 & 32) != 0 ? new HashMap() : map, (i14 & 64) != 0 ? null : aVar2, (i14 & 128) != 0 ? null : zVar, (i14 & 256) != 0 ? System.currentTimeMillis() : j8);
    }

    public final void a() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f186502i;
        HashMap<String, Object> map = this.metrics;
        map.put("executedDuration", Long.valueOf(jCurrentTimeMillis));
        map.put("mobileOS", "Android");
        aq2.j.f12491a.getClass();
        map.put("gcmVersion", (String) aq2.j.f12493c.getValue());
        map.put("libraryVersion", BuildConfig.VERSION_NAME);
        z zVar = this.f186501h;
        if (zVar != null) {
            map.put("syncSource", zVar.f179245a);
        }
        hs2.a aVar = this.f186500g;
        if (aVar != null) {
            map.put("firmwareVersion", Integer.valueOf(aVar.getFirmwareVersion()));
            map.put("modelNumber", Integer.valueOf(aVar.getProductNumber()));
            map.put("nfcChipType", Integer.valueOf(aVar.getNfcInfo().getNfcChipType().ordinal()));
        }
    }

    public final List<String> b() {
        return this.commitIds;
    }

    public final List<i> c() {
        return this.resultFlags;
    }

    public final void d(String str) {
        this.message = str;
    }

    public final void e(a aVar) {
        this.result = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f186494a, eVar.f186494a) && this.result == eVar.result && s.g(this.resultFlags, eVar.resultFlags) && s.g(this.message, eVar.message) && s.g(this.commitIds, eVar.commitIds) && s.g(this.metrics, eVar.metrics) && s.g(this.f186500g, eVar.f186500g) && this.f186501h == eVar.f186501h && this.f186502i == eVar.f186502i;
    }

    public final int hashCode() {
        String str = this.f186494a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.result;
        int iB = u0.b((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.resultFlags);
        String str2 = this.message;
        int iHashCode2 = (this.metrics.hashCode() + u0.b((iB + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.commitIds)) * 31;
        hs2.a aVar2 = this.f186500g;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        z zVar = this.f186501h;
        return Long.hashCode(this.f186502i) + ((iHashCode3 + (zVar != null ? zVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        a aVar = this.result;
        List<i> list = this.resultFlags;
        String str = this.message;
        List<String> list2 = this.commitIds;
        HashMap<String, Object> map = this.metrics;
        StringBuilder sb3 = new StringBuilder("NewFitPaySyncDetails(syncId=");
        sb3.append(this.f186494a);
        sb3.append(", result=");
        sb3.append(aVar);
        sb3.append(", resultFlags=");
        o2.c.n(", message=", str, ", commitIds=", sb3, list);
        sb3.append(list2);
        sb3.append(", metrics=");
        sb3.append(map);
        sb3.append(", deviceWalletMetadata=");
        sb3.append(this.f186500g);
        sb3.append(", syncSource=");
        sb3.append(this.f186501h);
        sb3.append(", startTime=");
        return am.j.i(this.f186502i, ")", sb3);
    }

    public e(String str, a aVar, List<i> list, String str2, List<String> list2, HashMap<String, Object> map, hs2.a aVar2, z zVar, long j8) {
        list.getClass();
        list2.getClass();
        map.getClass();
        this.f186494a = str;
        this.result = aVar;
        this.resultFlags = list;
        this.message = str2;
        this.commitIds = list2;
        this.metrics = map;
        this.f186500g = aVar2;
        this.f186501h = zVar;
        this.f186502i = j8;
    }

    public e() {
        this(null, null, null, null, null, null, null, null, 0L, 511, null);
    }
}
