package defpackage;

import com.miuipub.internal.hybrid.SignUtils;
import com.nimbusds.jose.ActionRequiredForJWSCompletionException;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Collections;
import java.util.Set;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes6.dex */
@ThreadSafe
public class r9j extends q9j implements lqd {
    public final PrivateKey d;
    public final Set<mqd> e;

    public class a implements da4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f32333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Signature f32334b;

        public a(byte[] bArr, Signature signature) {
            this.f32333a = bArr;
            this.f32334b = signature;
        }
    }

    public r9j(PrivateKey privateKey) {
        this(privateKey, false);
    }

    @Override // defpackage.lqd
    public Base64URL a(JWSHeader jWSHeader, byte[] bArr) throws JOSEException {
        Signature signatureE = e(jWSHeader);
        if (ybh.a(this.e, xeq.class)) {
            throw new ActionRequiredForJWSCompletionException("Authenticate user to complete signing", xeq.a(), new a(bArr, signatureE));
        }
        return f(bArr, signatureE);
    }

    public final Signature e(JWSHeader jWSHeader) throws JOSEException {
        Signature signatureA = p9j.a(jWSHeader.getAlgorithm(), d().a());
        try {
            signatureA.initSign(this.d);
            return signatureA;
        } catch (InvalidKeyException e) {
            throw new JOSEException("Invalid private RSA key: " + e.getMessage(), e);
        }
    }

    public final Base64URL f(byte[] bArr, Signature signature) throws JOSEException {
        try {
            signature.update(bArr);
            return Base64URL.encode(signature.sign());
        } catch (SignatureException e) {
            throw new JOSEException("RSA signature exception: " + e.getMessage(), e);
        }
    }

    @Deprecated
    public r9j(PrivateKey privateKey, boolean z) {
        this(privateKey, (Set<mqd>) (z ? Collections.singleton(s61.a()) : Collections.emptySet()));
    }

    public r9j(PrivateKey privateKey, Set<mqd> set) {
        int iA;
        if (SignUtils.KEY_RSA.equalsIgnoreCase(privateKey.getAlgorithm())) {
            this.d = privateKey;
            set = set == null ? Collections.emptySet() : set;
            this.e = set;
            if (!ybh.a(set, s61.class) && (iA = i9j.a(privateKey)) > 0 && iA < 2048) {
                throw new IllegalArgumentException("The RSA key size must be at least 2048 bits");
            }
            return;
        }
        throw new IllegalArgumentException("The private key algorithm must be RSA");
    }
}
