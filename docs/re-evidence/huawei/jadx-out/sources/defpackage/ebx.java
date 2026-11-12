package defpackage;

import android.util.Patterns;
import com.huawei.health.device.wifi.entity.builder.BaseBuilder;
import com.huawei.health.device.wifi.entity.model.Entity;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.regex.Pattern;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.network.CoapEndpoint;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.scandium.DTLSConnector;
import org.eclipse.californium.scandium.config.DtlsConfig;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public class ebx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f32706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static CoapEndpoint f32707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static zus f32708c;
    public static final StringBuilder d;
    private static final Object e;
    private static ecc f;

    static {
        StringBuilder sb = new StringBuilder("coap://");
        sb.append(Patterns.IP_ADDRESS);
        sb.append(":[0-9]{1,4}");
        d = sb;
        e = new Object();
        f32706a = "";
    }

    public static void d(String str) {
        synchronized (e) {
            f32706a = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(BaseBuilder baseBuilder) {
        synchronized (e) {
            String str = "coap://" + f32706a + ":5683" + baseBuilder.getUri();
            dyg.e(true, "CoapService", "createClient: uri is ", str);
            if (f == null) {
                f = new ecc();
            }
            f.b(str);
            f.c(Long.valueOf(baseBuilder.getDefaultTime()));
            CoapEndpoint.e eVar = new CoapEndpoint.e();
            eVar.d(new zwm(), new ebw());
            f.c(eVar.a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005b A[Catch: all -> 0x008f, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x000b, B:9:0x0047, B:11:0x005b, B:12:0x0062, B:14:0x007c, B:16:0x008d, B:15:0x0082, B:8:0x002b), top: B:21:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x007c A[Catch: all -> 0x008f, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x000b, B:9:0x0047, B:11:0x005b, B:12:0x0062, B:14:0x007c, B:16:0x008d, B:15:0x0082, B:8:0x002b), top: B:21:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0082 A[Catch: all -> 0x008f, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x000b, B:9:0x0047, B:11:0x005b, B:12:0x0062, B:14:0x007c, B:16:0x008d, B:15:0x0082, B:8:0x002b), top: B:21:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x002b A[Catch: all -> 0x008f, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x000b, B:9:0x0047, B:11:0x005b, B:12:0x0062, B:14:0x007c, B:16:0x008d, B:15:0x0082, B:8:0x002b), top: B:21:0x0005 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x002b, please report this as an issue */
    private static void d(BaseBuilder baseBuilder, Integer num, ebo eboVar) {
        String str;
        CoapEndpoint coapEndpointB;
        synchronized (e) {
            if (num != null) {
                if (num.intValue() > 0) {
                    str = "coap://" + f32706a + ":" + num + baseBuilder.getUri();
                } else {
                    str = "coap://" + f32706a + ":5684" + baseBuilder.getUri();
                }
                dyg.e(true, "CoapService", "createClient: uri is ", str);
                if (f32708c == null) {
                    f32708c = new zus();
                }
                f32708c.b(str);
                f32708c.c(Long.valueOf(baseBuilder.getDefaultTime()));
                coapEndpointB = b(eboVar);
                f32707b = coapEndpointB;
                if (coapEndpointB != null) {
                    f32708c.c(coapEndpointB);
                } else {
                    dyg.d(true, "CoapService", "createClient: sCoapEndpoint is null");
                }
            } else {
                str = "coap://" + f32706a + ":5684" + baseBuilder.getUri();
                dyg.e(true, "CoapService", "createClient: uri is ", str);
                if (f32708c == null) {
                    f32708c = new zus();
                }
                f32708c.b(str);
                f32708c.c(Long.valueOf(baseBuilder.getDefaultTime()));
                coapEndpointB = b(eboVar);
                f32707b = coapEndpointB;
                if (coapEndpointB != null) {
                    f32708c.c(coapEndpointB);
                } else {
                    dyg.d(true, "CoapService", "createClient: sCoapEndpoint is null");
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Exception, java.security.cert.CertificateException] */
    private static CoapEndpoint b(ebo eboVar) {
        ?? C = 0;
        InputStream inputStreamOpen = null;
        if (eboVar == null) {
            return null;
        }
        Certificate[] certificateArr = new Certificate[1];
        try {
            try {
                inputStreamOpen = dxw.d().getResources().getAssets().open("root.pem");
                certificateArr[0] = CertificateFactory.getInstance("X.509").generateCertificate(inputStreamOpen);
            } catch (Throwable th) {
                IoUtils.c(C);
                throw th;
            }
        } catch (IOException | CertificateException e2) {
            dyg.c(true, "CoapService", e2.getMessage());
        }
        IoUtils.c(inputStreamOpen);
        zzy.e eVar = new zzy.e(Configuration.e());
        eVar.d(new InetSocketAddress(0));
        C = eboVar.c();
        if (C == 0 || eboVar.d() == null) {
            dyg.d(true, "CoapService", "createDtlsCoapEndpoint: getPskIv or getPskKey is null");
        } else {
            eVar.d(new aacs(zzb.e(eboVar.c()), eboVar.d()));
        }
        eVar.e(aacz.b().c(certificateArr).d().a());
        eVar.a(DtlsConfig.ap, DtlsConfig.DtlsRole.CLIENT_ONLY);
        eVar.c(DtlsConfig.i, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256);
        DTLSConnector dTLSConnector = new DTLSConnector(eVar.b());
        CoapEndpoint.e eVar2 = new CoapEndpoint.e();
        eVar2.d(new zwm(), new ebw());
        eVar2.c(dTLSConnector);
        return eVar2.a();
    }

    public static void d(final BaseBuilder baseBuilder, final Entity.EntityResponseCallback entityResponseCallback) {
        if (baseBuilder == null || entityResponseCallback == null) {
            dyg.e(true, "CoapService", "obj or callback is null");
            return;
        }
        synchronized (e) {
            lsy.a(new Runnable() { // from class: ebx.5
                @Override // java.lang.Runnable
                public void run() {
                    ebx.e(baseBuilder);
                    ebl eblVarD = null;
                    try {
                        zuy zuyVarA = ebx.f.a();
                        if (zuyVarA != null && CoAP.ResponseCode.CONTENT.equals(zuyVarA.b())) {
                            dyg.e(true, "CoapService", zux.e(zuyVarA));
                            if ("/.well-known/core?st=cloudSetup".equals(baseBuilder.getUri()) || "/.well-known/core?st=monitordev".equals(baseBuilder.getUri())) {
                                String str = "coap:/" + zuyVarA.a().getSourceContext().getPeerAddress().getAddress() + ":" + zuyVarA.a().getSourceContext().getPeerAddress().getPort();
                                dyg.e(true, "CoapService", "address ", str);
                                boolean zE = ebx.e(str);
                                dyg.e(true, "CoapService", "get flag ", Boolean.valueOf(zE));
                                eblVarD = ebx.d(baseBuilder, zE, zuyVarA, str);
                            } else {
                                eblVarD = baseBuilder.makeResponseEntity(zuyVarA.d());
                            }
                            if (eblVarD != null) {
                                eblVarD.a(0);
                            }
                        }
                    } catch (IOException unused) {
                        LogUtil.e("CoapService", "get IOException");
                    } catch (RuntimeException unused2) {
                        LogUtil.e("CoapService", "get RuntimeException");
                    } catch (zyz unused3) {
                        LogUtil.e("CoapService", "get ConnectorException");
                    } catch (Exception unused4) {
                        LogUtil.e("CoapService", "get Exception");
                    }
                    entityResponseCallback.onResponse(eblVarD);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ebl d(BaseBuilder baseBuilder, boolean z, zuy zuyVar, String str) {
        if (z) {
            return baseBuilder.makeResponseEntity(zuyVar.d(), str);
        }
        return baseBuilder.makeResponseEntity(zuyVar.d());
    }

    public static void b(final BaseBuilder baseBuilder, final Entity.EntityResponseCallback entityResponseCallback) {
        if (baseBuilder == null || entityResponseCallback == null) {
            dyg.e(true, "CoapService", "post obj or callback is null");
            return;
        }
        synchronized (e) {
            lsy.a(new Runnable() { // from class: ebx.3
                @Override // java.lang.Runnable
                public void run() {
                    zuy zuyVarD;
                    ebx.e(baseBuilder);
                    ebl eblVarMakeResponseEntity = null;
                    try {
                        zuyVarD = ebx.f.d(baseBuilder.makeRequestStream(), 50);
                    } catch (Exception unused) {
                        LogUtil.e("CoapService", "post sendto failed: ENETUNREACH");
                        zuyVarD = null;
                    }
                    if (zuyVarD != null) {
                        dyg.e(true, "CoapService", zux.e(zuyVarD));
                        eblVarMakeResponseEntity = baseBuilder.makeResponseEntity(zuyVarD.d());
                    } else {
                        dyg.c(true, "CoapService", "post: response is null");
                    }
                    entityResponseCallback.onResponse(eblVarMakeResponseEntity);
                }
            });
        }
    }

    public static void e(final BaseBuilder baseBuilder, final Entity.EntityResponseCallback entityResponseCallback) {
        if (baseBuilder == null || entityResponseCallback == null) {
            dyg.e(true, "CoapService", "postByte obj or callback is null");
            return;
        }
        synchronized (e) {
            lsy.a(new Runnable() { // from class: ebx.1
                @Override // java.lang.Runnable
                public void run() {
                    ebl eblVarMakeResponseEntity;
                    ebx.e(baseBuilder);
                    ecd ecdVarA = ebx.f.a(baseBuilder, 50);
                    if (ecdVarA != null) {
                        dyg.e(true, "CoapService", "post: getResponseText ", ecdVarA.b());
                        eblVarMakeResponseEntity = baseBuilder.makeResponseEntity(ecdVarA.e());
                    } else {
                        dyg.c(true, "CoapService", "post: response is null");
                        eblVarMakeResponseEntity = null;
                    }
                    entityResponseCallback.onResponse(eblVarMakeResponseEntity);
                }
            });
        }
    }

    public static boolean e(String str) {
        return Pattern.compile(d.toString()).matcher(str).matches();
    }

    public static void d(final BaseBuilder baseBuilder, final Integer num, final ebo eboVar, final Entity.EntityResponseCallback entityResponseCallback) {
        if (baseBuilder == null || entityResponseCallback == null) {
            dyg.e(true, "CoapService", "postByDtls obj or callback is null");
        } else {
            lsy.a(new Runnable() { // from class: ebx.2
                @Override // java.lang.Runnable
                public void run() {
                    ebx.a(baseBuilder, num, eboVar, entityResponseCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(BaseBuilder baseBuilder, Integer num, ebo eboVar, Entity.EntityResponseCallback entityResponseCallback) {
        zuy zuyVarD;
        synchronized (e) {
            d(baseBuilder, num, eboVar);
            ebl eblVarMakeResponseEntity = null;
            try {
                zuyVarD = f32708c.d(baseBuilder.makeRequestStream(), 50);
            } catch (IOException unused) {
                LogUtil.e("CoapService", "getResponse IOException");
                zuyVarD = null;
            } catch (zyz unused2) {
                LogUtil.e("CoapService", "getResponse ConnectorException");
                zuyVarD = null;
            }
            if (zuyVarD != null) {
                dyg.e(true, "CoapService", zux.e(zuyVarD));
                eblVarMakeResponseEntity = baseBuilder.makeResponseEntity(zuyVarD.d());
            } else {
                dyg.c(true, "CoapService", "post: response is null");
            }
            entityResponseCallback.onResponse(eblVarMakeResponseEntity);
        }
    }
}
