package zn2;

import android.annotation.SuppressLint;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.UUID;
import javax.crypto.KeyAgreement;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn2/f1;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static jo2.c f205509b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f205511d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f205508a = new f1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f205510c = new LinkedHashMap();

    static {
        int i14 = gt2.c.f79010a;
        f205511d = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayTokenManager");
    }

    private f1() {
    }

    public static jo2.a a(jo2.b bVar) {
        KeyPairGenerator keyPairGenerator;
        bVar.getClass();
        int i14 = bVar.f99826a;
        Integer numValueOf = Integer.valueOf(i14);
        LinkedHashMap linkedHashMap = f205510c;
        jo2.f.f99840a.getClass();
        Provider provider = jo2.f.f99842c;
        if (provider != null) {
            keyPairGenerator = KeyPairGenerator.getInstance("EC", provider);
            keyPairGenerator.getClass();
        } else {
            keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.getClass();
        }
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"), new SecureRandom());
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
        publicKey.getClass();
        PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
        privateKey.getClass();
        jo2.a aVar = new jo2.a(null, null, null, null, null, null, null, 127, null);
        aVar.f(UUID.randomUUID().toString());
        aVar.f99821h = aq2.h.a(((ECPrivateKey) privateKey).getEncoded());
        aVar.e(aq2.h.a(((ECPublicKey) publicKey).getEncoded()));
        linkedHashMap.put(Integer.valueOf(i14), aVar);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    public static String b() {
        Date date;
        jo2.c cVar = f205509b;
        if (cVar != null) {
            long j8 = cVar.f99829c;
            Date date2 = cVar.f99830d;
            if (date2 != null) {
                date2.before(new Date());
            } else if (j8 != -1 && (date = cVar.f99831e) != null) {
                date.getTime();
                System.currentTimeMillis();
            }
            if (j8 < System.currentTimeMillis() + ((long) 300000)) {
                Logger logger = f205511d;
                logger.debug("getFitPayAccessToken: fitPay access token is expired, refreshing it...");
                try {
                    zl.a aVar = new zl.a(4);
                    int i14 = w03.b.f181178a;
                    new z03.h(aVar).k(l13.a.f108327b).e();
                } catch (Exception unused) {
                    logger.debug("getFitPayAccessToken: error refreshing fitPay token...");
                }
            }
        } else {
            Logger logger2 = f205511d;
            logger2.debug("getFitPayAccessToken: fitPay access token is expired, refreshing it...");
            zl.a aVar2 = new zl.a(4);
            int i15 = w03.b.f181178a;
            new z03.h(aVar2).k(l13.a.f108327b).e();
        }
        jo2.c cVar2 = f205509b;
        if (cVar2 != null) {
            return cVar2.f99828b;
        }
        return null;
    }

    public static jo2.a c(jo2.b bVar) {
        bVar.getClass();
        return (jo2.a) f205510c.get(Integer.valueOf(bVar.f99826a));
    }

    public static PublicKey d(byte[] bArr) {
        jo2.f.f99840a.getClass();
        Provider provider = jo2.f.f99842c;
        return (provider != null ? KeyFactory.getInstance("EC", provider) : KeyFactory.getInstance("EC")).generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static byte[] e(jo2.b bVar) {
        bVar.getClass();
        jo2.a aVarC = c(bVar);
        byte[] bArrGenerateSecret = null;
        byte[] bArr = aVarC != null ? aVarC.f99822i : null;
        if (bArr != null) {
            return bArr;
        }
        String str = aVarC != null ? aVarC.f99821h : null;
        String serverPublicKey = aVarC != null ? aVarC.getServerPublicKey() : null;
        try {
            byte[] bArrB = aq2.h.b(str);
            bArrB.getClass();
            jo2.f.f99840a.getClass();
            Provider provider = jo2.f.f99842c;
            PrivateKey privateKeyGeneratePrivate = (provider != null ? KeyFactory.getInstance("EC", provider) : KeyFactory.getInstance("EC")).generatePrivate(new PKCS8EncodedKeySpec(bArrB));
            privateKeyGeneratePrivate.getClass();
            PublicKey publicKeyD = d(aq2.h.b(serverPublicKey));
            Provider provider2 = jo2.f.f99842c;
            KeyAgreement keyAgreement = provider2 != null ? KeyAgreement.getInstance("ECDH", provider2) : KeyAgreement.getInstance("ECDH");
            keyAgreement.init(privateKeyGeneratePrivate);
            keyAgreement.doPhase(publicKeyD, true);
            bArrGenerateSecret = keyAgreement.generateSecret();
        } catch (Exception e4) {
            f205511d.error("error while creating secret key, ", (Throwable) e4);
        }
        if (aVarC != null) {
            aVarC.f99822i = bArrGenerateSecret;
        }
        return bArrGenerateSecret;
    }

    @SuppressLint({"CheckResult"})
    public static e13.j f() {
        ln2.e eVar = ln2.e.f113687a;
        aq2.j jVar = aq2.j.f12491a;
        kj0.b.f104940a.getClass();
        zi2.a aVarA = kj0.b.a();
        jVar.getClass();
        aVarA.getClass();
        String f12509f = aq2.j.a(aVarA).getF12509f();
        eVar.getClass();
        f12509f.getClass();
        q03.r<c83.a0<jo2.a>> rVarS = ((ao2.a) ln2.e.e(ln2.e.d(eVar, null, 7), f12509f, null).b(ao2.a.class)).S(a(jo2.b.KEY_API));
        xw.b bVar = new xw.b(new z81.b(18), 16);
        rVarS.getClass();
        int i14 = w03.b.f181178a;
        return new e13.j(rVarS, bVar);
    }
}
