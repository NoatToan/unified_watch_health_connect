package com.datatheorem.android.trustkit.pinning;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.datatheorem.android.trustkit.config.DomainPinningPolicy;
import com.datatheorem.android.trustkit.config.PublicKeyPin;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 17)
class e implements X509TrustManager {
    private final X509TrustManagerExtensions a;
    private final String b;
    private final DomainPinningPolicy c;

    public e(@NonNull String str, @NonNull DomainPinningPolicy domainPinningPolicy, @NonNull X509TrustManager x509TrustManager) {
        this.b = str;
        this.c = domainPinningPolicy;
        if (Build.VERSION.SDK_INT < 17) {
            this.a = null;
        } else {
            this.a = new X509TrustManagerExtensions(x509TrustManager);
        }
    }

    private static boolean a(List<X509Certificate> list, Set<PublicKeyPin> set) {
        Iterator<X509Certificate> it2 = list.iterator();
        while (it2.hasNext()) {
            if (set.contains(new PublicKeyPin(it2.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Client certificates not supported!");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f4  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00f4, please report this as an issue */
    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        List<X509Certificate> listCheckServerTrusted;
        boolean z;
        boolean z2;
        boolean z3;
        PinningValidationResult pinningValidationResult;
        boolean z4;
        List<X509Certificate> listAsList = Arrays.asList(x509CertificateArr);
        boolean z5 = !c.a.c(this.b, x509CertificateArr[0]);
        try {
            listCheckServerTrusted = this.a.checkServerTrusted(x509CertificateArr, str, this.b);
            z = z5;
        } catch (CertificateException e) {
            if (Build.VERSION.SDK_INT < 24 || !e.getMessage().startsWith("Pin verification failed")) {
                listCheckServerTrusted = listAsList;
                z = true;
            } else {
                z = z5;
                listCheckServerTrusted = listAsList;
                z2 = true;
            }
            if (Build.VERSION.SDK_INT < 24) {
                if (this.c.getExpirationDate() != null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    z2 = !a(listCheckServerTrusted, this.c.getPublicKeyPins());
                }
            }
            z3 = z2;
            if (z) {
                pinningValidationResult = PinningValidationResult.FAILED;
                if (z) {
                    pinningValidationResult = PinningValidationResult.FAILED_CERTIFICATE_CHAIN_NOT_TRUSTED;
                }
                TrustManagerBuilder.a().pinValidationFailed(this.b, 0, listAsList, listCheckServerTrusted, this.c, pinningValidationResult);
            } else {
                pinningValidationResult = PinningValidationResult.FAILED;
                if (z) {
                    pinningValidationResult = PinningValidationResult.FAILED_CERTIFICATE_CHAIN_NOT_TRUSTED;
                }
                TrustManagerBuilder.a().pinValidationFailed(this.b, 0, listAsList, listCheckServerTrusted, this.c, pinningValidationResult);
            }
            if (!z) {
                throw new CertificateException("Certificate validation failed for " + this.b);
            }
            if (z3) {
                return;
            } else {
                return;
            }
        }
        z2 = false;
        if (Build.VERSION.SDK_INT < 24 && !z) {
            if (this.c.getExpirationDate() != null || this.c.getExpirationDate().compareTo(new Date()) >= 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4) {
                z2 = !a(listCheckServerTrusted, this.c.getPublicKeyPins());
            }
        }
        z3 = z2;
        if (z || z3) {
            pinningValidationResult = PinningValidationResult.FAILED;
            if (z) {
                pinningValidationResult = PinningValidationResult.FAILED_CERTIFICATE_CHAIN_NOT_TRUSTED;
            }
            TrustManagerBuilder.a().pinValidationFailed(this.b, 0, listAsList, listCheckServerTrusted, this.c, pinningValidationResult);
        }
        if (!z) {
            throw new CertificateException("Certificate validation failed for " + this.b);
        }
        if (z3 || !this.c.shouldEnforcePinning()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Pin verification failed");
        sb.append("\n  Configured pins: ");
        Iterator<PublicKeyPin> it2 = this.c.getPublicKeyPins().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append(" ");
        }
        sb.append("\n  Peer certificate chain: ");
        for (X509Certificate x509Certificate : listCheckServerTrusted) {
            sb.append("\n    ");
            sb.append(new PublicKeyPin(x509Certificate));
            sb.append(" - ");
            sb.append(x509Certificate.getSubjectDN());
        }
        throw new CertificateException(sb.toString());
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
