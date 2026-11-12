package com.datatheorem.android.trustkit.reporting;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.datatheorem.android.trustkit.config.DomainPinningPolicy;
import com.datatheorem.android.trustkit.pinning.PinningValidationResult;
import com.datatheorem.android.trustkit.utils.TrustKitLog;
import java.net.URL;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class BackgroundReporter {
    public static final String EXTRA_REPORT = "Report";
    public static final String REPORT_VALIDATION_EVENT = "com.datatheorem.android.trustkit.reporting.BackgroundReporter:REPORT_VALIDATION_EVENT";
    private final String a;
    private final String b;
    private final String c;
    private final Context d;

    public BackgroundReporter(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.d = context;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    private static String a(X509Certificate x509Certificate) {
        try {
            return ("-----BEGIN CERTIFICATE-----\n" + Base64.encodeToString(x509Certificate.getEncoded(), 0)) + "-----END CERTIFICATE-----\n";
        } catch (CertificateEncodingException unused) {
            throw new IllegalStateException("Should never happen - certificate was previously parsed by the system");
        }
    }

    public void broadcastReport(@NonNull PinningFailureReport pinningFailureReport) {
        Intent intent = new Intent(REPORT_VALIDATION_EVENT);
        intent.putExtra(EXTRA_REPORT, pinningFailureReport);
        LocalBroadcastManager.getInstance(this.d).sendBroadcast(intent);
    }

    @RequiresApi(api = 16)
    public void pinValidationFailed(@NonNull String str, @NonNull Integer num, @NonNull List<X509Certificate> list, @NonNull List<X509Certificate> list2, @NonNull DomainPinningPolicy domainPinningPolicy, @NonNull PinningValidationResult pinningValidationResult) {
        TrustKitLog.i("Generating pin failure report for " + str);
        ArrayList arrayList = new ArrayList();
        Iterator<X509Certificate> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(a(it2.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<X509Certificate> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(a(it3.next()));
        }
        PinningFailureReport pinningFailureReport = new PinningFailureReport(this.a, this.b, this.c, str, num.intValue(), domainPinningPolicy.getHostname(), domainPinningPolicy.shouldIncludeSubdomains(), domainPinningPolicy.shouldEnforcePinning(), arrayList2, arrayList, new Date(System.currentTimeMillis()), domainPinningPolicy.getPublicKeyPins(), pinningValidationResult);
        if (!b.a(pinningFailureReport)) {
            sendReport(pinningFailureReport, domainPinningPolicy.getReportUris());
            broadcastReport(pinningFailureReport);
            return;
        }
        TrustKitLog.i("Report for " + str + " was not sent due to rate-limiting");
    }

    @RequiresApi(api = 16)
    public void sendReport(@NonNull PinningFailureReport pinningFailureReport, @NonNull Set<URL> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pinningFailureReport);
        arrayList.addAll(set);
        new a().execute(arrayList.toArray());
    }
}
