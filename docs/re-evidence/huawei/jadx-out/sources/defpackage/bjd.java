package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class bjd {
    private static List<String> b(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 1) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException unused) {
            bjf.e.a("X509CertUtil", "Failed to getCertChain: ");
            return Collections.EMPTY_LIST;
        }
    }

    public static boolean e(X509Certificate x509Certificate, String str) {
        return a(x509Certificate, "OU", str);
    }

    private static List<X509Certificate> d(List<String> list) {
        if (list == null) {
            bjf.e.b("X509CertUtil", "base64 CertChain is null.");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            X509Certificate x509CertificateD = d(it.next());
            if (x509CertificateD == null) {
                bjf.e.a("X509CertUtil", "Failed to get cert from CertChain");
            } else {
                arrayList.add(x509CertificateD);
            }
        }
        return arrayList;
    }

    public static List<X509Certificate> c(String str) {
        return d(b(str));
    }

    private static boolean c(List<X509Certificate> list) {
        for (int i = 1; i < list.size(); i++) {
            if (!a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) {
        if (x509Certificate == null || bArr == null || bArr2 == null || bArr2.length == 0) {
            bjf.e.b("X509CertUtil", "checkSignature parameter is null");
            return false;
        }
        try {
            Signature signature = Signature.getInstance(x509Certificate.getSigAlgName());
            signature.initVerify(x509Certificate.getPublicKey());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            bjf.e.a("X509CertUtil", "failed checkSignature,Exception:", e);
            return false;
        }
    }

    public static boolean d(X509Certificate x509Certificate, List<X509Certificate> list) {
        if (list != null && list.size() != 0) {
            if (x509Certificate == null) {
                bjf.e.a("X509CertUtil", "rootCert is null,verify failed ");
                return false;
            }
            try {
                x509Certificate.checkValidity();
                PublicKey publicKey = x509Certificate.getPublicKey();
                for (int size = list.size() - 1; size >= 0; size--) {
                    X509Certificate x509Certificate2 = list.get(size);
                    if (x509Certificate2 != null) {
                        try {
                            x509Certificate2.verify(publicKey);
                            x509Certificate2.checkValidity();
                            publicKey = x509Certificate2.getPublicKey();
                        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e) {
                            bjf.e.a("X509CertUtil", "verify failed " + e.getMessage());
                        }
                    }
                    return false;
                }
                return c(list);
            } catch (CertificateExpiredException | CertificateNotYetValidException e2) {
                bjf.e.a("X509CertUtil", "verifyCertChain Exception:" + e2.getMessage());
            }
        }
        return false;
    }

    private static boolean a(X509Certificate x509Certificate, String str, String str2) {
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(b(x509Certificate.getSubjectDN().getName(), str));
    }

    public static boolean d(X509Certificate x509Certificate, String str) {
        return a(x509Certificate, "CN", str);
    }

    private static boolean a(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage.length <= 5) {
            return false;
        }
        return keyUsage[5];
    }

    private static X509Certificate d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
            if (certificateGenerateCertificate instanceof X509Certificate) {
                return (X509Certificate) certificateGenerateCertificate;
            }
            return null;
        } catch (CertificateException e) {
            bjf.e.a("X509CertUtil", "Failed to get cert: " + e.getMessage());
            return null;
        }
    }

    private static X509Certificate d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return d(bja.c(str));
    }

    public static X509Certificate d(Context context) {
        bjf bjfVar;
        String str;
        ApplicationInfo applicationInfo;
        bjf bjfVar2;
        String str2;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            bjfVar = bjf.e;
            str = "PackageInfo with NameNotFoundException:";
            bjfVar.a("X509CertUtil", str, e);
            applicationInfo = null;
        } catch (Exception e2) {
            e = e2;
            bjfVar = bjf.e;
            str = "PackageInfo with Exception:";
            bjfVar.a("X509CertUtil", str, e);
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null) {
                bjfVar2 = bjf.e;
                str2 = "failed getCBGRootCA metaData is null";
            } else {
                String string = bundle.getString("componentverify_ag_cbg_root");
                if (!TextUtils.isEmpty(string)) {
                    return d(string);
                }
                bjfVar2 = bjf.e;
                str2 = "failed getCBGRootCA sdkCbgRoot is null";
            }
        } else {
            bjfVar2 = bjf.e;
            str2 = "failed getCBGRootCA packageInfo is null";
        }
        bjfVar2.a("X509CertUtil", str2);
        return null;
    }

    private static String b(String str, String str2) {
        int iIndexOf = str.toUpperCase(Locale.getDefault()).indexOf(str2 + "=");
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = str.indexOf(",", iIndexOf);
        int length = iIndexOf + str2.length() + 1;
        return iIndexOf2 != -1 ? str.substring(length, iIndexOf2) : str.substring(length);
    }
}
