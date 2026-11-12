package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.braintreepayments.api.ErrorWithResponse;
import com.braintreepayments.api.HttpResponseParser;
import com.huawei.hms.network.embedded.w9;
import java.net.HttpURLConnection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braintreepayments/api/BraintreeHttpResponseParser;", "Lcom/braintreepayments/api/HttpResponseParser;", "baseParser", "(Lcom/braintreepayments/api/HttpResponseParser;)V", "parse", "", "responseCode", "", w9.h, "Ljava/net/HttpURLConnection;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class sv implements HttpResponseParser {
    public static final a e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpResponseParser f48732b;

    public sv(HttpResponseParser httpResponseParser) {
        zcp.c(httpResponseParser, "");
        this.f48732b = httpResponseParser;
    }

    public /* synthetic */ sv(sc scVar, int i, zcm zcmVar) {
        this((i & 1) != 0 ? new sc() : scVar);
    }

    @Override // com.braintreepayments.api.HttpResponseParser
    public String parse(int responseCode, HttpURLConnection connection) throws Exception {
        zcp.c(connection, "");
        try {
            String str = this.f48732b.parse(responseCode, connection);
            zcp.b((Object) str, "");
            return str;
        } catch (sf e2) {
            throw new sf(new ErrorWithResponse(403, e2.getMessage()).get_message());
        } catch (vb e3) {
            throw new ErrorWithResponse(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, e3.getMessage());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/BraintreeHttpResponseParser$Companion;", "", "()V", "AUTH_ERROR_CODE", "", "UNPROCESSABLE_ENTITY_ERROR_CODE", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(zcm zcmVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sv() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
