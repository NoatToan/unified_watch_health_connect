package miui.assistant.index;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes23.dex */
public class AppInfoUtil {
    private static final String SHA1 = "SHA1";
    private static final String TAG = "AppInfoUtil";

    private static String byte2HexFormatted(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(JsonLexerKt.COLON);
            }
        }
        return sb.toString();
    }

    public static String getContent(Context context) {
        PackageInfo packageInfo;
        CertificateFactory certificateFactory;
        X509Certificate x509Certificate;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "NameNotFoundException " + e.getMessage());
            packageInfo = null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(packageInfo.signatures[0].toByteArray());
        try {
            certificateFactory = CertificateFactory.getInstance("X509");
        } catch (CertificateException e2) {
            e2.printStackTrace();
            certificateFactory = null;
        }
        try {
            x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
        } catch (CertificateException e3) {
            Log.e(TAG, "CertificateException " + e3.getMessage());
            x509Certificate = null;
        }
        try {
            return "SHA1:" + byte2HexFormatted(MessageDigest.getInstance(SHA1).digest(x509Certificate.getEncoded()));
        } catch (NoSuchAlgorithmException e4) {
            Log.e(TAG, "NoSuchAlgorithmException " + e4.getMessage());
            return null;
        } catch (CertificateEncodingException e5) {
            Log.e(TAG, "CertificateEncodingException " + e5.getMessage());
            return null;
        }
    }

    public static String getFileStr(Context context, String str) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            return new String(bArr);
        } catch (IOException e) {
            Log.e(TAG, "IOException " + e.getMessage());
            return "";
        }
    }
}
