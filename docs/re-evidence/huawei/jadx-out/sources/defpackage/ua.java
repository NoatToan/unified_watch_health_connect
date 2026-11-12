package defpackage;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.openalliance.ad.constant.OsType;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0006\u0010\u000b\u001a\u00020\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/braintreepayments/api/MetadataBuilder;", "", "()V", "json", "Lorg/json/JSONObject;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "integration", "", "sessionId", "source", "toString", "version", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f49832a = new b(null);
    private final JSONObject d;

    public ua() {
        JSONObject jSONObject = new JSONObject();
        this.d = jSONObject;
        try {
            jSONObject.put("platform", OsType.ANDROID);
        } catch (JSONException unused) {
        }
    }

    public final ua e(String str) {
        try {
            this.d.put("source", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    public final ua a(String str) {
        try {
            this.d.put("integration", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    public final ua b(String str) {
        try {
            this.d.put("sessionId", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final JSONObject getD() {
        return this.d;
    }

    public String toString() {
        String string = this.d.toString();
        zcp.b((Object) string, "");
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braintreepayments/api/MetadataBuilder$Companion;", "", "()V", "INTEGRATION_KEY", "", "META_KEY", "PLATFORM_KEY", "SESSION_ID_KEY", "SOURCE_KEY", "VERSION_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(zcm zcmVar) {
            this();
        }
    }
}
