package fo2;

import com.garmin.feature.garminpay.providers.gpay.util.deserializers.EncryptedDataSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfo2/d0;", "", "", "", "Lcom/google/gson/JsonElement;", "encryptedData", "<init>", "(Ljava/util/Map;)V", "accountId", "accountName", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/util/Map;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("encryptedData")
    @JsonAdapter(EncryptedDataSerializer.class)
    private final Map<String, JsonElement> encryptedData;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(String str, String str2) {
        this(u0.e(new o13.p("accountId", new JsonPrimitive(str)), new o13.p("accountName", new JsonPrimitive(str2))));
        str.getClass();
        str2.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && p005kotlin.jvm.internal.s.g(this.encryptedData, ((d0) obj).encryptedData);
    }

    public final int hashCode() {
        return this.encryptedData.hashCode();
    }

    public final String toString() {
        return "RefundInfo(encryptedData=" + this.encryptedData + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d0(Map<String, ? extends JsonElement> map) {
        this.encryptedData = map;
    }
}
