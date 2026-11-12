package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.huawei.android.hicloud.sync.R;
import com.huawei.hms.network.inner.api.NetworkService;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes23.dex */
public class bcv {
    public static String a(Context context) throws Throwable {
        if (context == null) {
            bcw.d("KeyUtil", "getHiCloudSignForEMUI11: context is null");
            return "";
        }
        return c(context, R.string.hi_cloud_sign) + e(context, R.xml.hi_cloud_sign) + c(context, "HiCloudSign");
    }

    public static String c(Context context) throws Throwable {
        if (context == null) {
            bcw.d("KeyUtil", "getHiCloudSign: context is null");
            return "";
        }
        return c(context, R.string.application_sign) + e(context, R.xml.application_sign) + c(context, "ApplicationSign");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private static String e(Context context, int i) throws Throwable {
        XmlResourceParser xml;
        if (context == null) {
            bcw.d("KeyUtil", "getSignFromXml: context is null");
            return "";
        }
        String attributeValue = null;
        attributeValue = null;
        attributeValue = null;
        attributeValue = null;
        attributeValue = null;
        attributeValue = null;
        attributeValue = null;
        XmlResourceParser xmlResourceParser = 0;
        try {
            try {
                try {
                    xml = context.getResources().getXml(i);
                    if (xml != null) {
                        try {
                            for (int next = xml.next(); next != 1; next = xml.next()) {
                                if (next == 2 && NetworkService.Constants.CONFIG_SERVICE.equals(xml.getName())) {
                                    attributeValue = xml.getAttributeValue(null, "value");
                                    break;
                                }
                            }
                        } catch (IOException unused) {
                            bcw.d("KeyUtil", "IOException getComponentFromXml");
                            if (xml != null) {
                                xml.close();
                            }
                        } catch (XmlPullParserException unused2) {
                            bcw.d("KeyUtil", "XmlPullParserException getComponentFromXml");
                            if (xml != null) {
                                xml.close();
                            }
                        }
                    }
                    if (xml != null) {
                        try {
                            xml.close();
                        } catch (Exception unused3) {
                            bcw.e("KeyUtil", "close xml Exception, ignore.");
                        }
                    }
                } catch (Throwable th) {
                    xmlResourceParser = context;
                    th = th;
                    if (xmlResourceParser != 0) {
                        try {
                            xmlResourceParser.close();
                        } catch (Exception unused4) {
                            bcw.e("KeyUtil", "close xml Exception, ignore.");
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
                xml = null;
            } catch (XmlPullParserException unused6) {
                xml = null;
            } catch (Throwable th2) {
                th = th2;
                if (xmlResourceParser != 0) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } catch (Exception unused7) {
            bcw.e("KeyUtil", "close xml Exception, ignore.");
        }
        return attributeValue;
    }

    public static String e(Context context, String str) {
        if (context != null && str != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    bcw.d("KeyUtil", "getSignForPkgName: packageManager is null");
                    return "";
                }
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
                if (packageInfo == null) {
                    bcw.d("KeyUtil", "getSignForPkgName: packageInfo is null");
                    return "";
                }
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null && signatureArr.length >= 1) {
                    Signature signature = signatureArr[0];
                    if (signature == null) {
                        bcw.d("KeyUtil", "getSignForPkgName: sign[0] is null");
                        return "";
                    }
                    X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                    if (x509Certificate == null) {
                        bcw.d("KeyUtil", "getSignForPkgName: cert is null");
                        return "";
                    }
                    PublicKey publicKey = x509Certificate.getPublicKey();
                    if (publicKey == null) {
                        bcw.d("KeyUtil", "getSignForPkgName: publicKey is null");
                        return "";
                    }
                    return c(publicKey.getEncoded());
                }
                bcw.d("KeyUtil", "getSignForPkgName: signs is null or signs.length < 1");
                return "";
            } catch (PackageManager.NameNotFoundException unused) {
                bcw.d("KeyUtil", "getSignForPkgName: name found error");
                return "";
            } catch (CertificateException e) {
                bcw.d("KeyUtil", "getSignForPkgName: CertificateException = " + e.toString());
                return "";
            }
        }
        bcw.d("KeyUtil", "getSignForPkgName: context or pkgName is null");
        return "";
    }

    private static String c(Context context, String str) throws Throwable {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        Exception e;
        InputStream inputStreamOpen;
        if (context != null && !TextUtils.isEmpty(str)) {
            InputStream inputStream = null;
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            try {
                inputStreamOpen = context.getAssets().open(str);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[40];
                        while (true) {
                            int i = inputStreamOpen.read(bArr);
                            if (i > 0) {
                                byteArrayOutputStream.write(bArr, 0, i);
                            } else {
                                String string = byteArrayOutputStream.toString("utf-8");
                                b(inputStreamOpen);
                                b(byteArrayOutputStream);
                                return string;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            bcw.d("KeyUtil", "Assets Exception2" + e.getMessage());
                            b(inputStreamOpen);
                            b(byteArrayOutputStream);
                            return "";
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStreamOpen;
                            inputStreamOpen = inputStream;
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            b(inputStreamOpen);
                            b(byteArrayOutputStream2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        b(inputStreamOpen);
                        b(byteArrayOutputStream2);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    byteArrayOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    b(inputStreamOpen);
                    b(byteArrayOutputStream2);
                    throw th;
                }
            } catch (Exception e4) {
                byteArrayOutputStream = null;
                e = e4;
                inputStreamOpen = null;
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
                inputStreamOpen = inputStream;
                byteArrayOutputStream2 = byteArrayOutputStream;
                b(inputStreamOpen);
                b(byteArrayOutputStream2);
                throw th;
            }
        } else {
            bcw.d("KeyUtil", "getSignFromAssets: context or fileName is null");
            return "";
        }
    }

    private static String c(Context context, int i) {
        if (context == null) {
            bcw.d("KeyUtil", "getSignFromString: context is null");
            return "";
        }
        return context.getString(i);
    }

    private static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                bcw.d("KeyUtil", "closeStream exception :" + e.getMessage());
            }
        }
    }

    private static String c(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            cArr2[i2] = cArr[(b2 >>> 4) & 15];
            cArr2[i2 + 1] = cArr[b2 & 15];
        }
        return new String(cArr2);
    }

    public static String a() {
        return "com.huawei.hidisk";
    }
}
