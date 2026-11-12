package com.tencent.mm.opensdk.channel.a;

import am.j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Ascii;
import com.google.firebase.perf.FirebasePerformance;
import com.tencent.mm.opensdk.constants.Build;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.channel.a.a$a, reason: collision with other inner class name */
    public static class C1190a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f54803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f54804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f54805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f54806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f54807e;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0108: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:89:0x0108 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    public static byte[] a(String str, int i14) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ?? r14;
        ByteArrayOutputStream byteArrayOutputStream3;
        Object obj;
        ?? r15;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        Exception e4;
        HttpURLConnection httpURLConnection2;
        InputStream inputStream2;
        IOException e14;
        HttpURLConnection httpURLConnection3;
        InputStream inputStream3;
        MalformedURLException e15;
        HttpURLConnection httpURLConnection4;
        InputStream inputStream4;
        ByteArrayOutputStream byteArrayOutputStream4;
        ByteArrayOutputStream byteArrayOutputStream5;
        ByteArrayOutputStream byteArrayOutputStream6;
        HttpURLConnection httpURLConnection5;
        HttpURLConnection httpURLConnection6;
        HttpURLConnection httpURLConnection7;
        ?? r16 = 0;
        if (str != null) {
            int length = str.length();
            try {
                if (length != 0) {
                    try {
                        HttpURLConnection httpURLConnection8 = (HttpURLConnection) new URL(str).openConnection();
                        try {
                            if (httpURLConnection8 == null) {
                                Log.e("MicroMsg.SDK.NetUtil", "open connection failed.");
                                if (httpURLConnection8 != null) {
                                    try {
                                        httpURLConnection8.disconnect();
                                    } catch (Throwable unused) {
                                    }
                                }
                                return null;
                            }
                            try {
                                httpURLConnection8.setRequestMethod(FirebasePerformance.HttpMethod.GET);
                                httpURLConnection8.setConnectTimeout(i14);
                                httpURLConnection8.setReadTimeout(i14);
                                if (httpURLConnection8.getResponseCode() >= 300) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpURLConnectionGet 300");
                                    try {
                                        httpURLConnection8.disconnect();
                                    } catch (Throwable unused2) {
                                    }
                                    return null;
                                }
                                InputStream inputStream5 = httpURLConnection8.getInputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                                    try {
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int i15 = inputStream5.read(bArr);
                                            if (i15 == -1) {
                                                break;
                                            }
                                            byteArrayOutputStream7.write(bArr, 0, i15);
                                        }
                                        byte[] byteArray = byteArrayOutputStream7.toByteArray();
                                        Log.d("MicroMsg.SDK.NetUtil", "httpGet end");
                                        try {
                                            httpURLConnection8.disconnect();
                                        } catch (Throwable unused3) {
                                        }
                                        try {
                                            inputStream5.close();
                                        } catch (Throwable unused4) {
                                        }
                                        try {
                                            byteArrayOutputStream7.close();
                                        } catch (Throwable unused5) {
                                        }
                                        return byteArray;
                                    } catch (MalformedURLException e16) {
                                        inputStream4 = inputStream5;
                                        e15 = e16;
                                        byteArrayOutputStream6 = byteArrayOutputStream7;
                                        httpURLConnection7 = httpURLConnection8;
                                    } catch (IOException e17) {
                                        inputStream3 = inputStream5;
                                        e14 = e17;
                                        byteArrayOutputStream5 = byteArrayOutputStream7;
                                        httpURLConnection6 = httpURLConnection8;
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e14.getMessage());
                                        if (httpURLConnection6 != null) {
                                            try {
                                                httpURLConnection6.disconnect();
                                            } catch (Throwable unused6) {
                                            }
                                        }
                                        if (inputStream3 != null) {
                                            try {
                                                inputStream3.close();
                                            } catch (Throwable unused7) {
                                            }
                                        }
                                        if (byteArrayOutputStream5 != null) {
                                            try {
                                                byteArrayOutputStream5.close();
                                            } catch (Throwable unused8) {
                                            }
                                        }
                                        return null;
                                    } catch (Exception e18) {
                                        inputStream2 = inputStream5;
                                        e4 = e18;
                                        byteArrayOutputStream4 = byteArrayOutputStream7;
                                        httpURLConnection5 = httpURLConnection8;
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e4.getMessage());
                                        if (httpURLConnection5 != null) {
                                            try {
                                                httpURLConnection5.disconnect();
                                            } catch (Throwable unused9) {
                                            }
                                        }
                                        if (inputStream2 != null) {
                                            try {
                                                inputStream2.close();
                                            } catch (Throwable unused10) {
                                            }
                                        }
                                        if (byteArrayOutputStream4 != null) {
                                            try {
                                                byteArrayOutputStream4.close();
                                            } catch (Throwable unused11) {
                                            }
                                        }
                                        return null;
                                    } catch (Throwable th3) {
                                        byteArrayOutputStream2 = byteArrayOutputStream7;
                                        r15 = inputStream5;
                                        th = th3;
                                        obj = httpURLConnection8;
                                        byteArrayOutputStream3 = byteArrayOutputStream2;
                                        r16 = r15;
                                        r14 = obj;
                                        if (r14 != 0) {
                                            try {
                                                r14.disconnect();
                                            } catch (Throwable unused12) {
                                            }
                                        }
                                        if (r16 != 0) {
                                            try {
                                                r16.close();
                                            } catch (Throwable unused13) {
                                            }
                                        }
                                        if (byteArrayOutputStream3 == null) {
                                            throw th;
                                        }
                                        try {
                                            byteArrayOutputStream3.close();
                                            throw th;
                                        } catch (Throwable unused14) {
                                            throw th;
                                        }
                                    }
                                } catch (MalformedURLException e19) {
                                    inputStream4 = inputStream5;
                                    e15 = e19;
                                    httpURLConnection4 = httpURLConnection8;
                                    byteArrayOutputStream6 = null;
                                    httpURLConnection7 = httpURLConnection4;
                                } catch (IOException e24) {
                                    inputStream3 = inputStream5;
                                    e14 = e24;
                                    httpURLConnection3 = httpURLConnection8;
                                    byteArrayOutputStream5 = null;
                                    httpURLConnection6 = httpURLConnection3;
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e14.getMessage());
                                    if (httpURLConnection6 != null) {
                                        httpURLConnection6.disconnect();
                                    }
                                    if (inputStream3 != null) {
                                        inputStream3.close();
                                    }
                                    if (byteArrayOutputStream5 != null) {
                                        byteArrayOutputStream5.close();
                                    }
                                    return null;
                                } catch (Exception e25) {
                                    inputStream2 = inputStream5;
                                    e4 = e25;
                                    httpURLConnection2 = httpURLConnection8;
                                    byteArrayOutputStream4 = null;
                                    httpURLConnection5 = httpURLConnection2;
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e4.getMessage());
                                    if (httpURLConnection5 != null) {
                                        httpURLConnection5.disconnect();
                                    }
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    if (byteArrayOutputStream4 != null) {
                                        byteArrayOutputStream4.close();
                                    }
                                    return null;
                                } catch (Throwable th4) {
                                    inputStream = inputStream5;
                                    th = th4;
                                    httpURLConnection = httpURLConnection8;
                                    r16 = inputStream;
                                    byteArrayOutputStream3 = null;
                                    r14 = httpURLConnection;
                                    if (r14 != 0) {
                                        r14.disconnect();
                                    }
                                    if (r16 != 0) {
                                        r16.close();
                                    }
                                    if (byteArrayOutputStream3 == null) {
                                        throw th;
                                    }
                                    byteArrayOutputStream3.close();
                                    throw th;
                                }
                            } catch (MalformedURLException e26) {
                                e15 = e26;
                                inputStream4 = null;
                                httpURLConnection4 = httpURLConnection8;
                            } catch (IOException e27) {
                                e14 = e27;
                                inputStream3 = null;
                                httpURLConnection3 = httpURLConnection8;
                            } catch (Exception e28) {
                                e4 = e28;
                                inputStream2 = null;
                                httpURLConnection2 = httpURLConnection8;
                            } catch (Throwable th5) {
                                th = th5;
                                inputStream = null;
                                httpURLConnection = httpURLConnection8;
                            }
                            byteArrayOutputStream6 = null;
                            httpURLConnection7 = httpURLConnection4;
                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e15.getMessage());
                            if (httpURLConnection7 != null) {
                                try {
                                    httpURLConnection7.disconnect();
                                } catch (Throwable unused15) {
                                }
                            }
                            if (inputStream4 != null) {
                                try {
                                    inputStream4.close();
                                } catch (Throwable unused16) {
                                }
                            }
                            if (byteArrayOutputStream6 != null) {
                                try {
                                    byteArrayOutputStream6.close();
                                } catch (Throwable unused17) {
                                }
                            }
                            return null;
                        } catch (MalformedURLException e29) {
                            e15 = e29;
                            inputStream4 = null;
                            byteArrayOutputStream6 = null;
                            httpURLConnection7 = httpURLConnection8;
                        } catch (IOException e34) {
                            e14 = e34;
                            inputStream3 = null;
                            byteArrayOutputStream5 = null;
                            httpURLConnection6 = httpURLConnection8;
                        } catch (Exception e35) {
                            e4 = e35;
                            inputStream2 = null;
                            byteArrayOutputStream4 = null;
                            httpURLConnection5 = httpURLConnection8;
                        } catch (Throwable th6) {
                            th = th6;
                            byteArrayOutputStream3 = null;
                            r14 = httpURLConnection8;
                            if (r14 != 0) {
                                r14.disconnect();
                            }
                            if (r16 != 0) {
                                r16.close();
                            }
                            if (byteArrayOutputStream3 == null) {
                                throw th;
                            }
                            byteArrayOutputStream3.close();
                            throw th;
                        }
                    } catch (MalformedURLException e36) {
                        e15 = e36;
                        httpURLConnection4 = null;
                        inputStream4 = null;
                    } catch (IOException e37) {
                        e14 = e37;
                        httpURLConnection3 = null;
                        inputStream3 = null;
                    } catch (Exception e38) {
                        e4 = e38;
                        httpURLConnection2 = null;
                        inputStream2 = null;
                    } catch (Throwable th7) {
                        th = th7;
                        httpURLConnection = null;
                        inputStream = null;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                byteArrayOutputStream2 = byteArrayOutputStream;
                r15 = length;
                obj = str;
            }
        }
        Log.e("MicroMsg.SDK.NetUtil", "httpGet, url is null");
        return null;
    }

    public static Object a(int i14, String str) {
        try {
            switch (i14) {
                case 1:
                    return Integer.valueOf(str);
                case 2:
                    return Long.valueOf(str);
                case 3:
                    return str;
                case 4:
                    return Boolean.valueOf(str);
                case 5:
                    return Float.valueOf(str);
                case 6:
                    return Double.valueOf(str);
                default:
                    Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                    return null;
            }
        } catch (Exception e4) {
            com.nimbusds.jose.shaded.gson.internal.a.q(e4, new StringBuilder("resolveObj exception:"), "MicroMsg.SDK.PluginProvider.Resolver");
            return null;
        }
    }

    public static String a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e4) {
            com.nimbusds.jose.shaded.gson.internal.a.q(e4, new StringBuilder("getStringExtra exception:"), "MicroMsg.IntentUtil");
            return null;
        }
    }

    public static boolean a(Context context, C1190a c1190a) {
        String strO;
        if (context == null || c1190a == null) {
            Log.e("MicroMsg.SDK.MMessage", "send fail, invalid argument");
            return false;
        }
        if (b.b(c1190a.f54804b)) {
            Log.e("MicroMsg.SDK.MMessage", "send fail, action is null");
            return false;
        }
        if (b.b(c1190a.f54803a)) {
            strO = null;
        } else {
            strO = j.o(c1190a.f54803a, ".permission.MM_MESSAGE", new StringBuilder());
        }
        Intent intent = new Intent(c1190a.f54804b);
        Bundle bundle = c1190a.f54807e;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        String packageName = context.getPackageName();
        intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
        intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
        intent.putExtra(ConstantsAPI.CONTENT, c1190a.f54805c);
        intent.putExtra(ConstantsAPI.APP_SUPORT_CONTENT_TYPE, c1190a.f54806d);
        intent.putExtra(ConstantsAPI.CHECK_SUM, a(c1190a.f54805c, Build.SDK_INT, packageName));
        context.sendBroadcast(intent, strO);
        Log.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + strO);
        return true;
    }

    public static int a(Bundle bundle, String str, int i14) {
        if (bundle == null) {
            return i14;
        }
        try {
            return bundle.getInt(str, i14);
        } catch (Exception e4) {
            com.nimbusds.jose.shaded.gson.internal.a.q(e4, new StringBuilder("getIntExtra exception:"), "MicroMsg.IntentUtil");
            return i14;
        }
    }

    public static byte[] a(String str, int i14, String str2) {
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i14);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        byte[] bytes = stringBuffer.toString().substring(1, 9).getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i15 = 0;
            for (byte b14 : bArrDigest) {
                int i16 = i15 + 1;
                cArr2[i15] = cArr[(b14 >>> 4) & 15];
                i15 += 2;
                cArr2[i16] = cArr[b14 & Ascii.SI];
            }
            str3 = new String(cArr2);
        } catch (Exception unused) {
            str3 = null;
        }
        return str3.getBytes();
    }
}
