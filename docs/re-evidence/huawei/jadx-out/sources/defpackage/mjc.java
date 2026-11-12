package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.nfc.PluginPayAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.MessageFormat;

/* JADX INFO: loaded from: classes10.dex */
public class mjc {
    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    /* JADX WARN: Code duplicated, block: B:14:0x0095  */
    public static String d(String str, String str2, String str3) throws UnsupportedEncodingException {
        mje mjeVar;
        String strSubstring;
        mje mjeVar2;
        StringBuilder sb = new StringBuilder(512);
        if (str.contains("?")) {
            strSubstring = str.substring(0, str.indexOf(63));
            if (str.substring(str.indexOf("?")).length() > 1) {
                mjeVar2 = new mje(str.substring(str.indexOf("?") + 1));
            } else {
                mjeVar = new mje(null);
            }
            sb.append("POST&");
            if (str.contains("/platform")) {
                String strD = mjeVar2.d(PluginPayAdapter.KEY_OPEN_CHANNEL_ID);
                String strValueOf = String.valueOf(System.currentTimeMillis());
                sb.append(strSubstring);
                sb.append("&");
                sb.append(mjeVar2);
                sb.append("&");
                sb.append(str2);
                sb.append("&channelID=");
                sb.append(strD);
                sb.append("&timestamp=");
                sb.append(strValueOf);
                return MessageFormat.format("HMAC-SHA256 channelID={0}, timestamp={1}, signature=\"{2}\"", strD, strValueOf, mjk.c(sb.toString(), str3));
            }
            String strD2 = mjeVar2.d("appID");
            LogUtil.a("HeaderUtils", "LogUpload Service HeaderUtils appid is ", strD2);
            sb.append(strSubstring.substring(strSubstring.indexOf("/")));
            sb.append("&");
            sb.append(mjeVar2);
            sb.append("&");
            sb.append(str2);
            sb.append("&appID=");
            sb.append(strD2);
            String strC = mjk.c(sb.toString(), str3);
            LogUtil.a("HeaderUtils", "LogUpload Service HeaderUtils is auth is ", strC);
            return MessageFormat.format("HMAC-SHA256 appID={0}, signature=\"{1}\"", strD2, strC);
        }
        mjeVar = new mje(null);
        strSubstring = str;
        mjeVar2 = mjeVar;
        sb.append("POST&");
        if (str.contains("/platform")) {
            String strD3 = mjeVar2.d(PluginPayAdapter.KEY_OPEN_CHANNEL_ID);
            String strValueOf2 = String.valueOf(System.currentTimeMillis());
            sb.append(strSubstring);
            sb.append("&");
            sb.append(mjeVar2);
            sb.append("&");
            sb.append(str2);
            sb.append("&channelID=");
            sb.append(strD3);
            sb.append("&timestamp=");
            sb.append(strValueOf2);
            return MessageFormat.format("HMAC-SHA256 channelID={0}, timestamp={1}, signature=\"{2}\"", strD3, strValueOf2, mjk.c(sb.toString(), str3));
        }
        String strD4 = mjeVar2.d("appID");
        LogUtil.a("HeaderUtils", "LogUpload Service HeaderUtils appid is ", strD4);
        sb.append(strSubstring.substring(strSubstring.indexOf("/")));
        sb.append("&");
        sb.append(mjeVar2);
        sb.append("&");
        sb.append(str2);
        sb.append("&appID=");
        sb.append(strD4);
        String strC2 = mjk.c(sb.toString(), str3);
        LogUtil.a("HeaderUtils", "LogUpload Service HeaderUtils is auth is ", strC2);
        return MessageFormat.format("HMAC-SHA256 appID={0}, signature=\"{1}\"", strD4, strC2);
    }

    public static String d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return c(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            LogUtil.e("HeaderUtils", "LogUpload Service shaByte", "Exception e = " + e.getMessage());
            return null;
        }
    }

    public static String c(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static long d(File file) throws Throwable {
        FileInputStream fileInputStream;
        long jAvailable = 0;
        if (file == null) {
            return 0L;
        }
        if (file.exists()) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        jAvailable = fileInputStream.available();
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            LogUtil.e("HeaderUtils", "IOException ", e.getMessage());
                        }
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        fileInputStream2 = fileInputStream;
                        LogUtil.e("HeaderUtils", "FileNotFoundException ", e.getMessage());
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e3) {
                                LogUtil.e("HeaderUtils", "IOException ", e3.getMessage());
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                        fileInputStream2 = fileInputStream;
                        LogUtil.e("HeaderUtils", "IOException ", e.getMessage());
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e5) {
                                LogUtil.e("HeaderUtils", "IOException ", e5.getMessage());
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e6) {
                                LogUtil.e("HeaderUtils", "IOException ", e6.getMessage());
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                }
            } catch (FileNotFoundException e7) {
                e = e7;
            } catch (IOException e8) {
                e = e8;
            }
        }
        return jAvailable;
    }
}
