package dl;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ldl/a;", "", "", "eventType", "", "timestamp", "Lcom/google/gson/JsonElement;", "parameters", "<init>", "(Ljava/lang/String;JLcom/google/gson/JsonElement;)V", "a", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "b", "J", "getTimestamp", "()J", "c", "Lcom/google/gson/JsonElement;", "getParameters", "()Lcom/google/gson/JsonElement;", "analytics-gcs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventType")
    private final String eventType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("parameters")
    private final JsonElement parameters;

    public a(String str, long j8, JsonElement jsonElement) {
        str.getClass();
        this.eventType = str;
        this.timestamp = j8;
        this.parameters = jsonElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.eventType, aVar.eventType) && this.timestamp == aVar.timestamp && s.g(this.parameters, aVar.parameters);
    }

    public final int hashCode() {
        int iE = f.e(this.eventType.hashCode() * 31, 31, this.timestamp);
        JsonElement jsonElement = this.parameters;
        return iE + (jsonElement == null ? 0 : jsonElement.hashCode());
    }

    public final String toString() {
        String str = this.eventType;
        long j8 = this.timestamp;
        JsonElement jsonElement = this.parameters;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "AnalyticsEventDTO(eventType=", str, ", timestamp=");
        sbJ.append(", parameters=");
        sbJ.append(jsonElement);
        sbJ.append(")");
        return sbJ.toString();
    }
}
