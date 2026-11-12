package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public final class ait {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bjt f1080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uht f1081b;
    public final Context c;
    public final yht d;
    public PackageInfo e;

    public ait(Context context, bjt bjtVar, uht uhtVar) {
        yht yhtVar = new yht(new tht(bjtVar));
        this.f1080a = bjtVar;
        this.f1081b = uhtVar;
        this.c = context;
        this.d = yhtVar;
    }

    public static X509Certificate e(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException unused) {
            return null;
        }
    }

    public final boolean a(File[] fileArr) throws XmlPullParserException, IOException {
        PackageInfo packageInfoD = d();
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfoD.getLongVersionCode() : packageInfoD.versionCode;
        AssetManager assetManager = (AssetManager) uit.c(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.d.b(assetManager, fileArr[length]);
        } while (longVersionCode == this.d.a());
        return false;
    }

    public final boolean b(List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f1080a.g(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(File[] fileArr) {
        PackageInfo packageInfoD = d();
        ArrayList<X509Certificate> arrayList = null;
        if (packageInfoD != null && packageInfoD.signatures != null) {
            arrayList = new ArrayList();
            for (Signature signature : packageInfoD.signatures) {
                X509Certificate x509CertificateE = e(signature);
                if (x509CertificateE != null) {
                    arrayList.add(x509CertificateE);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                String absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] x509CertificateArrA = kjt.a(absolutePath);
                    if (x509CertificateArrA == null || x509CertificateArrA.length == 0 || x509CertificateArrA[0].length == 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Downloaded split ");
                        sb.append(absolutePath);
                        sb.append(" is not signed.");
                        break;
                    }
                    if (arrayList.isEmpty()) {
                        break;
                    }
                    for (X509Certificate x509Certificate : arrayList) {
                        for (X509Certificate[] x509CertificateArr : x509CertificateArrA) {
                            if (!x509CertificateArr[0].equals(x509Certificate)) {
                            }
                        }
                    }
                } catch (Exception unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Downloaded split ");
                    sb2.append(absolutePath);
                    sb2.append(" is not signed.");
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public final PackageInfo d() {
        if (this.e == null) {
            try {
                this.e = this.c.getPackageManager().getPackageInfo(this.c.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.e;
    }
}
