package defpackage;

import android.text.TextUtils;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class e7t extends SecureRequest<nxs> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16363b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f16364k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f16365r;
    public String s;
    public String t;
    public String u;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16367b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f16368k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f16369r;
        public String s;
        public String t;

        public a a(String str) {
            this.f16369r = str;
            return this;
        }

        public e7t b() {
            e7t e7tVar = new e7t();
            e7tVar.f16363b = this.f16366a;
            e7tVar.c = this.f16367b;
            e7tVar.d = this.c;
            e7tVar.e = this.d;
            e7tVar.f = this.e;
            e7tVar.g = this.f;
            e7tVar.h = this.g;
            e7tVar.i = this.h;
            e7tVar.j = this.i;
            e7tVar.f16364k = this.j;
            e7tVar.l = this.f16368k;
            e7tVar.m = this.l;
            e7tVar.n = this.m;
            e7tVar.o = this.n;
            e7tVar.p = this.o;
            e7tVar.q = this.p;
            e7tVar.f16365r = this.q;
            e7tVar.s = this.f16369r;
            e7tVar.t = this.s;
            e7tVar.u = this.t;
            return e7tVar;
        }

        public a c(String str) {
            this.q = str;
            return this;
        }

        public a d(String str) {
            this.f16368k = str;
            return this;
        }

        public a e(String str) {
            this.e = str;
            return this;
        }

        public a f(String str) {
            this.d = str;
            return this;
        }

        public a g(String str) {
            this.i = str;
            return this;
        }

        public a h(String str) {
            this.g = str;
            return this;
        }

        public a i(String str) {
            this.h = str;
            return this;
        }

        public a j(String str) {
            this.f = str;
            return this;
        }

        public a k(String str) {
            this.f16367b = str;
            return this;
        }

        public a l(String str) {
            this.c = str;
            return this;
        }

        public a m(String str) {
            this.p = str;
            return this;
        }

        public a n(String str) {
            this.s = str;
            return this;
        }

        public a o(String str) {
            this.j = str;
            return this;
        }

        public a p(String str) {
            this.o = str;
            return this;
        }

        public a q(String str) {
            this.n = str;
            return this;
        }

        public a r(String str) {
            this.m = str;
            return this;
        }

        public a s(String str) {
            this.l = str;
            return this;
        }

        public a t(String str) {
            this.f16366a = str;
            return this;
        }

        public a u(String str) {
            this.t = str;
            return this;
        }
    }

    public e7t() {
        super("POST", TSMAuthContants.URL_TRACKING_KEY, nxs.class, (ResponseListener) null);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            addParams("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("KeyTrackingRequest getExtraParams failed", e);
        }
    }

    public void b() {
        addParams("vehicleOEMId", this.f16363b);
        addParams("keyId", this.c);
        addParams(TSMAuthContants.PARAM_KEY_TYPE, this.d);
        addParams("friendlyName", this.e);
        addParams("deviceType", this.f);
        addParams(TSMAuthContants.PARAM_KEY_DATA_VERSION, this.g);
        addParams(TSMAuthContants.PARAM_KEY_DATA_EPHEMERAL_PUBLIC_KEY, this.h);
        addParams(TSMAuthContants.PARAM_KEY_DATA_PUBLIC_KEY_HASH, this.i);
        addParams(TSMAuthContants.PARAM_KEY_DATA, this.j);
        addParams(TSMAuthContants.PARAM_SHARING_SESSION_ID, this.f16364k);
        addParams("deviceModel", this.l);
        addParams("vehicleId", this.m);
        addParams("vehicleBrandId", this.n);
        addParams(TSMAuthContants.PARAM_TERMINATED_KEY_ID, this.o);
        addParams(TSMAuthContants.PARAM_TERMINATED_KEY_ATTESTATION, this.p);
        addParams(TSMAuthContants.PARAM_PAIRING_TYPE, this.q);
        addParams("vehicleWirelessCapabilities", this.u);
        if (TextUtils.equals(this.d, Constants.KEY_TYPE_SHARED)) {
            addParams("authType", this.f16365r);
            addParams(TSMAuthContants.PARAM_ACTIVATION_OPTIONS, this.s);
            addParams(TSMAuthContants.PARAM_SHARE_LINK, this.t);
        }
    }
}
