package org.acra.config;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RawRes;
import java.util.Map;
import org.acra.ACRAConstants;
import org.acra.annotation.AcraHttpSender;
import org.acra.security.KeyStoreFactory;
import org.acra.security.NoKeyStoreFactory;
import org.acra.security.TLS;
import org.acra.sender.HttpSender;

/* JADX INFO: loaded from: classes23.dex */
final class a implements HttpSenderConfigurationBuilder {

    @NonNull
    private final Context a;
    private boolean b;

    @NonNull
    private String c;

    @NonNull
    private String d;

    @NonNull
    private String e;

    @NonNull
    private HttpSender.Method f;
    private int g;
    private int h;
    private boolean i;

    @NonNull
    private Class<? extends KeyStoreFactory> j;

    @NonNull
    private String k;

    @RawRes
    private int l;

    @NonNull
    private String m;
    private boolean n;

    @NonNull
    private TLS[] o;

    @NonNull
    private final BaseHttpConfigurationBuilder p;

    public a(@NonNull Context context) {
        AcraHttpSender acraHttpSender = (AcraHttpSender) context.getClass().getAnnotation(AcraHttpSender.class);
        this.a = context;
        this.b = acraHttpSender != null;
        this.p = new BaseHttpConfigurationBuilder();
        if (!this.b) {
            this.d = ACRAConstants.NULL_VALUE;
            this.e = ACRAConstants.NULL_VALUE;
            this.g = 5000;
            this.h = 20000;
            this.i = false;
            this.j = NoKeyStoreFactory.class;
            this.k = "";
            this.l = 0;
            this.m = ACRAConstants.DEFAULT_CERTIFICATE_TYPE;
            this.n = false;
            this.o = new TLS[]{TLS.V1_3, TLS.V1_2, TLS.V1_1, TLS.V1};
            return;
        }
        this.c = acraHttpSender.uri();
        this.d = acraHttpSender.basicAuthLogin();
        this.e = acraHttpSender.basicAuthPassword();
        this.f = acraHttpSender.httpMethod();
        this.g = acraHttpSender.connectionTimeout();
        this.h = acraHttpSender.socketTimeout();
        this.i = acraHttpSender.dropReportsOnTimeout();
        this.j = acraHttpSender.keyStoreFactoryClass();
        this.k = acraHttpSender.certificatePath();
        this.l = acraHttpSender.resCertificate();
        this.m = acraHttpSender.certificateType();
        this.n = acraHttpSender.compress();
        this.o = acraHttpSender.tlsProtocols();
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a setTlsProtocols(@NonNull TLS... tlsArr) {
        this.o = tlsArr;
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a setUri(@NonNull String str) {
        this.c = str;
        return this;
    }

    public int C() {
        return this.h;
    }

    @NonNull
    public TLS[] D() {
        return this.o;
    }

    @NonNull
    public String E() {
        return this.c;
    }

    @NonNull
    public String a() {
        return this.d;
    }

    @NonNull
    public String b() {
        return this.e;
    }

    @Override // org.acra.config.ConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public HttpSenderConfiguration build() throws ACRAConfigurationException {
        if (this.b) {
            if (this.c == null) {
                throw new ACRAConfigurationException("uri has to be set");
            }
            if (this.f == null) {
                throw new ACRAConfigurationException("httpMethod has to be set");
            }
        }
        return new HttpSenderConfiguration(this);
    }

    @NonNull
    public String d() {
        return this.k;
    }

    @NonNull
    public String e() {
        return this.m;
    }

    public boolean f() {
        return this.n;
    }

    public int g() {
        return this.g;
    }

    public boolean h() {
        return this.i;
    }

    public boolean i() {
        return this.b;
    }

    @NonNull
    public Map<String, String> j() {
        return this.p.a();
    }

    @NonNull
    public HttpSender.Method k() {
        return this.f;
    }

    @NonNull
    public Class<? extends KeyStoreFactory> l() {
        return this.j;
    }

    @RawRes
    public int m() {
        return this.l;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a setBasicAuthLogin(@NonNull String str) {
        this.d = str;
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a setBasicAuthPassword(@NonNull String str) {
        this.e = str;
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public a setCertificatePath(@NonNull String str) {
        this.k = str;
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public a setCertificateType(@NonNull String str) {
        this.m = str;
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public a setCompress(boolean z) {
        this.n = z;
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public a setConnectionTimeout(int i) {
        this.g = i;
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public a setDropReportsOnTimeout(boolean z) {
        this.i = z;
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public a setEnabled(boolean z) {
        this.b = z;
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public a setHttpHeaders(Map<String, String> map) {
        this.p.setHttpHeaders(map);
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public a setHttpMethod(@NonNull HttpSender.Method method) {
        this.f = method;
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public a setKeyStoreFactoryClass(@NonNull Class<? extends KeyStoreFactory> cls) {
        this.j = cls;
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public a setResCertificate(@RawRes int i) {
        this.l = i;
        return this;
    }

    @Override // org.acra.config.HttpSenderConfigurationBuilder
    @NonNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public a setSocketTimeout(int i) {
        this.h = i;
        return this;
    }
}
