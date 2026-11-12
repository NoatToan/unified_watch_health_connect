package com.datatheorem.android.trustkit.pinning;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.datatheorem.android.trustkit.TrustKit;
import com.datatheorem.android.trustkit.config.DomainPinningPolicy;
import com.datatheorem.android.trustkit.reporting.BackgroundReporter;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Set;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public class TrustManagerBuilder {
    public static BackgroundReporter backgroundReporter = null;
    public static X509TrustManager baselineTrustManager = null;
    public static boolean shouldOverridePins = false;

    public static BackgroundReporter a() {
        BackgroundReporter backgroundReporter2 = backgroundReporter;
        if (backgroundReporter2 != null) {
            return backgroundReporter2;
        }
        throw new IllegalStateException("TrustManagerBuilder has not been initialized");
    }

    public static X509TrustManager getTrustManager(@NonNull String str) {
        X509TrustManager x509TrustManager = baselineTrustManager;
        if (x509TrustManager == null) {
            throw new IllegalStateException("TrustManagerBuilder has not been initialized");
        }
        if (Build.VERSION.SDK_INT < 17) {
            return x509TrustManager;
        }
        DomainPinningPolicy policyForHostname = TrustKit.getInstance().getConfiguration().getPolicyForHostname(str);
        return (policyForHostname == null || shouldOverridePins) ? baselineTrustManager : new e(str, policyForHostname, baselineTrustManager);
    }

    public static void initializeBaselineTrustManager(@Nullable Set<Certificate> set, boolean z, @NonNull BackgroundReporter backgroundReporter2) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        if (baselineTrustManager != null) {
            throw new IllegalStateException("TrustManagerBuilder has already been initialized");
        }
        baselineTrustManager = SystemTrustManager.getInstance();
        int i = Build.VERSION.SDK_INT;
        if (i < 17) {
            return;
        }
        shouldOverridePins = z;
        if (set != null && set.size() > 0 && i < 24) {
            baselineTrustManager = a.a(set);
        }
        backgroundReporter = backgroundReporter2;
    }
}
