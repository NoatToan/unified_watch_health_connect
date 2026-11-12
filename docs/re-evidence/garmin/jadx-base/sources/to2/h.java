package to2;

import com.garmin.android.gncs.NotificationConstants;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fo2.o;
import java.util.Date;
import java.util.Map;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lto2/h;", "", "Lto2/c;", "sseEventsTypes", "Ljava/util/Date;", "timeStamp", "", "timestampEpoch", "", "message", "", TtmlNode.TAG_METADATA, "Lcom/google/gson/JsonObject;", "payload", "<init>", "(Lto2/c;Ljava/util/Date;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Lcom/google/gson/JsonObject;)V", "a", "Lto2/c;", "h", "()Lto2/c;", "b", "Ljava/util/Date;", "getTimeStamp", "()Ljava/util/Date;", "c", "Ljava/lang/Long;", "getTimestampEpoch", "()Ljava/lang/Long;", "d", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "f", "Lcom/google/gson/JsonObject;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final c sseEventsTypes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestamp")
    private final Date timeStamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestampEpoch")
    private final Long timestampEpoch;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private final String message;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.TAG_METADATA)
    private final Map<String, String> metadata;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payload")
    private final JsonObject payload;

    public /* synthetic */ h(c cVar, Date date, Long l14, String str, Map map, JsonObject jsonObject, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : cVar, (i14 & 2) != 0 ? null : date, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : map, (i14 & 32) != 0 ? null : jsonObject);
    }

    public final String a() {
        JsonElement jsonElement;
        JsonObject jsonObject = this.payload;
        if (jsonObject == null || (jsonElement = jsonObject.get("credentialId")) == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public final String b() {
        JsonElement jsonElement;
        JsonObject jsonObject = this.payload;
        if (jsonObject == null || (jsonElement = jsonObject.get("deviceId")) == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public final o c() {
        Object bVar;
        JsonElement jsonElement;
        String asString;
        try {
            int i14 = q.f128596b;
            JsonObject jsonObject = this.payload;
            bVar = (jsonObject == null || (jsonElement = jsonObject.get("jobStatus")) == null || (asString = jsonElement.getAsString()) == null) ? null : o.valueOf(asString);
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
        return (o) (bVar instanceof q.b ? null : bVar);
    }

    public final Links d() {
        JsonElement jsonElement;
        JsonObject jsonObject = this.payload;
        if (jsonObject == null || (jsonElement = jsonObject.get("_links")) == null) {
            return null;
        }
        aq2.j.f12491a.getClass();
        return (Links) aq2.j.d().fromJson(jsonElement, Links.class);
    }

    public final String e() {
        JsonElement jsonElement;
        JsonObject jsonObject = this.payload;
        if (jsonObject == null || (jsonElement = jsonObject.get("offlineSessionId")) == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        h hVar = (h) obj;
        return this.sseEventsTypes == hVar.sseEventsTypes && s.g(this.timeStamp, hVar.timeStamp) && s.g(this.timestampEpoch, hVar.timestampEpoch) && s.g(this.message, hVar.message) && s.g(this.metadata, hVar.metadata) && s.g(this.payload, hVar.payload);
    }

    public final String f() {
        JsonElement jsonElement;
        JsonObject jsonObject = this.payload;
        if (jsonObject == null || (jsonElement = jsonObject.get("purchaseId")) == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public final String g() {
        JsonElement jsonElement;
        JsonObject jsonObject = this.payload;
        if (jsonObject == null || (jsonElement = jsonObject.get("reason")) == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getSseEventsTypes() {
        return this.sseEventsTypes;
    }

    public final int hashCode() {
        c cVar = this.sseEventsTypes;
        String str = cVar != null ? cVar.f165895a : null;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Date date = this.timeStamp;
        int iHashCode2 = (iHashCode + (date != null ? date.hashCode() : 0)) * 31;
        Long l14 = this.timestampEpoch;
        int iHashCode3 = (iHashCode2 + (l14 != null ? Long.hashCode(l14.longValue()) : 0)) * 31;
        String str2 = this.message;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.metadata;
        int iHashCode5 = (iHashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        JsonObject jsonObject = this.payload;
        return iHashCode5 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public final wo2.g i() throws NewFitPayException {
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        JsonElement jsonElement;
        JsonObject asJsonObject3;
        JsonObject asJsonObject4;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        String strB = b();
        if (strB == null || strB.length() == 0) {
            throw new NewFitPayException("received null/empty deviceId from payload", null, null, 6, null);
        }
        JsonObject jsonObject = this.payload;
        String asString = (jsonObject == null || (jsonElement3 = jsonObject.get("syncId")) == null) ? null : jsonElement3.getAsString();
        if (asString == null || asString.length() == 0) {
            throw new NewFitPayException("received null/empty syncId from payload", null, null, 6, null);
        }
        String asString2 = null;
        String str = asString;
        JsonObject jsonObject2 = this.payload;
        String asString3 = (jsonObject2 == null || (asJsonObject3 = jsonObject2.getAsJsonObject("_links")) == null || (asJsonObject4 = asJsonObject3.getAsJsonObject("ackSync")) == null || (jsonElement2 = asJsonObject4.get("href")) == null) ? null : jsonElement2.getAsString();
        JsonObject jsonObject3 = this.payload;
        if (jsonObject3 != null && (asJsonObject = jsonObject3.getAsJsonObject("_links")) != null && (asJsonObject2 = asJsonObject.getAsJsonObject("completeSync")) != null && (jsonElement = asJsonObject2.get("href")) != null) {
            asString2 = jsonElement.getAsString();
        }
        return new wo2.g(str, strB, asString3, asString2, null, 16, null);
    }

    public final String j() {
        JsonElement jsonElement;
        JsonObject jsonObject = this.payload;
        if (jsonObject == null || (jsonElement = jsonObject.get("targetDeviceIdentifier")) == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public final Integer k() {
        JsonElement jsonElement;
        JsonObject jsonObject = this.payload;
        if (jsonObject == null || (jsonElement = jsonObject.get("timeToIdleSeconds")) == null) {
            return null;
        }
        return Integer.valueOf(jsonElement.getAsInt());
    }

    public final String toString() {
        c cVar = this.sseEventsTypes;
        Date date = this.timeStamp;
        Long l14 = this.timestampEpoch;
        String str = this.message;
        Map<String, String> map = this.metadata;
        JsonObject jsonObject = this.payload;
        StringBuilder sb3 = new StringBuilder("UserStreamEventDto(sseEventsTypes=");
        sb3.append(cVar);
        sb3.append(", timeStamp=");
        sb3.append(date);
        sb3.append(", timestampEpoch=");
        b71.i.q(l14, ", message=", str, ", metadata=", sb3);
        sb3.append(map);
        sb3.append(", payload=");
        sb3.append(jsonObject);
        sb3.append(")");
        return sb3.toString();
    }

    public h(c cVar, Date date, Long l14, String str, Map<String, String> map, JsonObject jsonObject) {
        this.sseEventsTypes = cVar;
        this.timeStamp = date;
        this.timestampEpoch = l14;
        this.message = str;
        this.metadata = map;
        this.payload = jsonObject;
    }

    public h() {
        this(null, null, null, null, null, null, 63, null);
    }
}
