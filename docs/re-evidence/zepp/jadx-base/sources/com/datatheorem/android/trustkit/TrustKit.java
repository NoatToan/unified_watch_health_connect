package com.datatheorem.android.trustkit;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Printer;
import androidx.annotation.NonNull;
import com.datatheorem.android.trustkit.config.ConfigurationException;
import com.datatheorem.android.trustkit.config.TrustKitConfiguration;
import com.datatheorem.android.trustkit.pinning.TrustManagerBuilder;
import com.datatheorem.android.trustkit.reporting.BackgroundReporter;
import com.datatheorem.android.trustkit.utils.TrustKitLog;
import com.datatheorem.android.trustkit.utils.VendorIdentifier;
import com.huami.view.basetitle.IdGetter;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Set;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.acra.ACRAConstants;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class TrustKit {
    public static TrustKit trustKitInstance;
    private final TrustKitConfiguration a;

    public class a implements Printer {
        private int a = -1;
        private final String b = "networkSecurityConfigRes=0x";

        /* JADX INFO: Access modifiers changed from: private */
        public int b() {
            return this.a;
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (this.a == -1 && str.contains("networkSecurityConfigRes=0x")) {
                this.a = Integer.parseInt(str.substring(27), 16);
            }
        }
    }

    public TrustKit(@NonNull Context context, @NonNull TrustKitConfiguration trustKitConfiguration) {
        boolean zShouldOverridePins;
        String str;
        String str2 = ACRAConstants.NOT_AVAILABLE;
        this.a = trustKitConfiguration;
        Set<Certificate> debugCaCertificates = null;
        if ((context.getApplicationInfo().flags & 2) != 0) {
            debugCaCertificates = trustKitConfiguration.getDebugCaCertificates();
            if (debugCaCertificates != null) {
                TrustKitLog.i("App is debuggable - processing <debug-overrides> configuration.");
            }
            zShouldOverridePins = trustKitConfiguration.shouldOverridePins();
        } else {
            zShouldOverridePins = false;
        }
        String packageName = context.getPackageName();
        try {
            str = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = ACRAConstants.NOT_AVAILABLE;
        }
        try {
            TrustManagerBuilder.initializeBaselineTrustManager(debugCaCertificates, zShouldOverridePins, new BackgroundReporter(context, packageName, str != null ? str : str2, VendorIdentifier.getOrCreate(context)));
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused2) {
            throw new ConfigurationException("Could not parse <debug-overrides> certificates");
        }
    }

    private static int a(@NonNull Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        a aVar = new a();
        applicationInfo.dump(aVar, "");
        return aVar.b();
    }

    @NonNull
    public static TrustKit getInstance() {
        TrustKit trustKit = trustKitInstance;
        if (trustKit != null) {
            return trustKit;
        }
        throw new IllegalStateException("TrustKit has not been initialized");
    }

    @NonNull
    public static synchronized TrustKit initializeWithNetworkSecurityConfiguration(@NonNull Context context) {
        return initializeWithNetworkSecurityConfiguration(context, context.getResources().getIdentifier("network_security_config", IdGetter.xml, context.getPackageName()));
    }

    @NonNull
    public TrustKitConfiguration getConfiguration() {
        return this.a;
    }

    @NonNull
    public SSLSocketFactory getSSLSocketFactory(@NonNull String str) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{getTrustManager(str)}, null);
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new IllegalStateException("Should not happen");
        }
    }

    @NonNull
    public X509TrustManager getTrustManager(@NonNull String str) {
        return TrustManagerBuilder.getTrustManager(str);
    }

    @NonNull
    public static synchronized TrustKit initializeWithNetworkSecurityConfiguration(@NonNull Context context, int i) {
        TrustKit trustKit;
        if (trustKitInstance == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                int iA = a(context);
                if (iA == -1) {
                    throw new ConfigurationException("TrustKit was initialized with a network policy that was not properly configured for Android N - make sure it is in the App's Manifest.");
                }
                if (iA != i) {
                    throw new ConfigurationException("TrustKit was initialized with a different network policy than the one configured in the App's manifest.");
                }
            }
            try {
                trustKit = new TrustKit(context, TrustKitConfiguration.fromXmlPolicy(context, context.getResources().getXml(i)));
                trustKitInstance = trustKit;
            } catch (IOException | XmlPullParserException unused) {
                throw new ConfigurationException("Could not parse network security policy file");
            } catch (CertificateException unused2) {
                throw new ConfigurationException("Could not find the debug certificate in the network security police file");
            }
        } else {
            throw new IllegalStateException("TrustKit has already been initialized");
        }
        return trustKit;
    }
}
