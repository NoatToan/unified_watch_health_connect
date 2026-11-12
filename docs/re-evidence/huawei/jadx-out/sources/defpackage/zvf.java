package defpackage;

import com.huawei.operation.utils.Constants;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;

/* JADX INFO: loaded from: classes20.dex */
public class zvf extends Message {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Long f54601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f54602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoAP.ResponseCode f54603c;
    private volatile Long e;

    public zvf(CoAP.ResponseCode responseCode) {
        this(responseCode, false);
    }

    public zvf(CoAP.ResponseCode responseCode, boolean z) {
        if (responseCode == null) {
            throw new NullPointerException("ResponseCode must not be null!");
        }
        this.f54603c = responseCode;
        this.f54602b = z;
    }

    public CoAP.ResponseCode d() {
        return this.f54603c;
    }

    @Override // org.eclipse.californium.core.coap.Message
    public int getRawCode() {
        return this.f54603c.value;
    }

    @Override // org.eclipse.californium.core.coap.Message
    public void assertPayloadMatchsBlocksize() {
        zuv zuvVarJ = getOptions().j();
        if (zuvVarJ != null) {
            zuvVarJ.c(getPayloadSize());
        }
    }

    public String toString() {
        return toTracingString(this.f54603c.toString());
    }

    public Long c() {
        return this.f54601a;
    }

    public void d(long j) {
        this.f54601a = Long.valueOf(j);
    }

    public Long b() {
        return this.e;
    }

    public void a(long j) {
        this.e = Long.valueOf(j);
    }

    public void e(zve zveVar) {
        zve token = getToken();
        if (token == null) {
            setToken(zveVar);
            return;
        }
        if (token.equals(zveVar)) {
            return;
        }
        throw new IllegalArgumentException("token mismatch! (" + token + "!=" + zveVar + Constants.RIGHT_BRACKET_ONLY);
    }

    public boolean g() {
        return getOptions().ak();
    }

    public boolean a() {
        return getOptions().ai() || getOptions().af();
    }

    @Override // org.eclipse.californium.core.coap.Message
    public boolean hasBlock(zuv zuvVar) {
        return hasBlock(zuvVar, getOptions().j());
    }

    public final boolean i() {
        return this.f54603c.isSuccess();
    }

    public final boolean h() {
        return e() || f();
    }

    public final boolean e() {
        return this.f54603c.isClientError();
    }

    public final boolean f() {
        return this.f54603c.isServerError();
    }
}
