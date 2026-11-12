package com.tencent.mm.opensdk.channel.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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

/* JADX INFO: loaded from: classes20.dex */
public class a {

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.channel.a.a$a, reason: collision with other inner class name */
    public static class C0304a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30956c;
        public long d;
        public Bundle e;
    }

    public static byte[] a(String str, int i, String str2) {
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        byte[] bytes = stringBuffer.toString().substring(1, 9).getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            int length = bArrDigest.length;
            char[] cArr2 = new char[length * 2];
            int i2 = 0;
            int i3 = 0;
            while (i3 < length) {
                byte b2 = bArrDigest[i3];
                cArr2[i2] = cArr[(b2 >>> 4) & 15];
                cArr2[i2 + 1] = cArr[b2 & 15];
                i3++;
                i2 += 2;
            }
            str3 = new String(cArr2);
        } catch (Exception unused) {
            str3 = null;
        }
        return str3.getBytes();
    }

    /* JADX WARN: Code duplicated, block: B:162:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:169:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x027a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x01d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v82 */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    public static byte[] a(String str, int i) throws Throwable {
        String str2;
        ?? r8;
        Throwable th;
        ?? r9;
        ?? r3;
        ?? r4;
        Exception e;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        IOException e2;
        InputStream inputStream2;
        MalformedURLException e3;
        InputStream inputStream3;
        Exception e4;
        InputStream inputStream4;
        ByteArrayOutputStream byteArrayOutputStream;
        IOException e5;
        MalformedURLException e6;
        Object obj = null;
        ?? r2 = 0;
        if (str != null) {
            int length = str.length();
            try {
                if (length == 0) {
                    str2 = "httpGet, url is null";
                } else {
                    try {
                        httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                        try {
                            if (httpURLConnection == null) {
                                Log.e("MicroMsg.SDK.NetUtil", "open connection failed.");
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                        return null;
                                    } catch (Throwable th2) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th2.getMessage());
                                    }
                                }
                                return null;
                            }
                            try {
                                httpURLConnection.setRequestMethod("GET");
                                httpURLConnection.setConnectTimeout(i);
                                httpURLConnection.setReadTimeout(i);
                                if (httpURLConnection.getResponseCode() >= 300) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpURLConnectionGet 300");
                                    try {
                                        httpURLConnection.disconnect();
                                        return null;
                                    } catch (Throwable th3) {
                                        str2 = "httpGet ex:" + th3.getMessage();
                                    }
                                } else {
                                    inputStream4 = httpURLConnection.getInputStream();
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byte[] bArr = new byte[1024];
                                            while (true) {
                                                int i2 = inputStream4.read(bArr);
                                                if (i2 == -1) {
                                                    break;
                                                }
                                                byteArrayOutputStream.write(bArr, 0, i2);
                                            }
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            Log.d("MicroMsg.SDK.NetUtil", "httpGet end");
                                            try {
                                                httpURLConnection.disconnect();
                                            } catch (Throwable th4) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th4.getMessage());
                                            }
                                            try {
                                                inputStream4.close();
                                            } catch (Throwable th5) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th5.getMessage());
                                            }
                                            try {
                                                byteArrayOutputStream.close();
                                            } catch (Throwable th6) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th6.getMessage());
                                            }
                                            return byteArray;
                                        } catch (MalformedURLException e7) {
                                            e6 = e7;
                                        } catch (IOException e8) {
                                            e5 = e8;
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e5.getMessage());
                                            if (httpURLConnection != null) {
                                                try {
                                                    httpURLConnection.disconnect();
                                                } catch (Throwable th7) {
                                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th7.getMessage());
                                                }
                                            }
                                            if (inputStream4 != null) {
                                                try {
                                                    inputStream4.close();
                                                } catch (Throwable th8) {
                                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th8.getMessage());
                                                }
                                            }
                                            if (byteArrayOutputStream != null) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                } catch (Throwable th9) {
                                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th9.getMessage());
                                                }
                                            }
                                            return null;
                                        } catch (Exception e9) {
                                            e4 = e9;
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e4.getMessage());
                                            if (httpURLConnection != null) {
                                                try {
                                                    httpURLConnection.disconnect();
                                                } catch (Throwable th10) {
                                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th10.getMessage());
                                                }
                                            }
                                            if (inputStream4 != null) {
                                                try {
                                                    inputStream4.close();
                                                } catch (Throwable th11) {
                                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th11.getMessage());
                                                }
                                            }
                                            if (byteArrayOutputStream != null) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                } catch (Throwable th12) {
                                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th12.getMessage());
                                                }
                                            }
                                            return null;
                                        }
                                    } catch (MalformedURLException e10) {
                                        inputStream3 = inputStream4;
                                        e3 = e10;
                                        httpURLConnection = httpURLConnection;
                                        e6 = e3;
                                        inputStream4 = inputStream3;
                                        byteArrayOutputStream = null;
                                    } catch (IOException e11) {
                                        inputStream2 = inputStream4;
                                        e2 = e11;
                                        httpURLConnection = httpURLConnection;
                                        e5 = e2;
                                        inputStream4 = inputStream2;
                                        byteArrayOutputStream = null;
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e5.getMessage());
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        if (inputStream4 != null) {
                                            inputStream4.close();
                                        }
                                        if (byteArrayOutputStream != null) {
                                            byteArrayOutputStream.close();
                                        }
                                        return null;
                                    } catch (Exception e12) {
                                        inputStream = inputStream4;
                                        e = e12;
                                        httpURLConnection = httpURLConnection;
                                        e4 = e;
                                        inputStream4 = inputStream;
                                        byteArrayOutputStream = null;
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e4.getMessage());
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        if (inputStream4 != null) {
                                            inputStream4.close();
                                        }
                                        if (byteArrayOutputStream != null) {
                                            byteArrayOutputStream.close();
                                        }
                                        return null;
                                    } catch (Throwable th13) {
                                        obj = httpURLConnection;
                                        r8 = inputStream4;
                                        th = th13;
                                        r4 = 0;
                                        Object obj2 = obj;
                                        r2 = r8;
                                        r9 = obj2;
                                        r3 = r4;
                                        if (r9 != 0) {
                                            try {
                                                r9.disconnect();
                                            } catch (Throwable th14) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th14.getMessage());
                                            }
                                        }
                                        if (r2 != 0) {
                                            try {
                                                r2.close();
                                            } catch (Throwable th15) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th15.getMessage());
                                            }
                                        }
                                        if (r3 != 0) {
                                            throw th;
                                        }
                                        try {
                                            r3.close();
                                            throw th;
                                        } catch (Throwable th16) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th16.getMessage());
                                            throw th;
                                        }
                                    }
                                }
                            } catch (MalformedURLException e13) {
                                e3 = e13;
                                inputStream3 = null;
                                httpURLConnection = httpURLConnection;
                            } catch (IOException e14) {
                                e2 = e14;
                                inputStream2 = null;
                                httpURLConnection = httpURLConnection;
                            } catch (Exception e15) {
                                e = e15;
                                inputStream = null;
                                httpURLConnection = httpURLConnection;
                            } catch (Throwable th17) {
                                th = th17;
                                r4 = 0;
                                obj = httpURLConnection;
                                r8 = 0;
                            }
                            e6 = e3;
                            inputStream4 = inputStream3;
                            byteArrayOutputStream = null;
                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e6.getMessage());
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable th18) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th18.getMessage());
                                }
                            }
                            if (inputStream4 != null) {
                                try {
                                    inputStream4.close();
                                } catch (Throwable th19) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th19.getMessage());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th20) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th20.getMessage());
                                }
                            }
                            return null;
                        } catch (MalformedURLException e16) {
                            e6 = e16;
                            inputStream4 = null;
                            byteArrayOutputStream = null;
                        } catch (IOException e17) {
                            e5 = e17;
                            inputStream4 = null;
                            byteArrayOutputStream = null;
                        } catch (Exception e18) {
                            e4 = e18;
                            inputStream4 = null;
                            byteArrayOutputStream = null;
                        } catch (Throwable th21) {
                            th = th21;
                            r3 = 0;
                            r9 = httpURLConnection;
                            if (r9 != 0) {
                                r9.disconnect();
                            }
                            if (r2 != 0) {
                                r2.close();
                            }
                            if (r3 != 0) {
                                throw th;
                            }
                            r3.close();
                            throw th;
                        }
                    } catch (MalformedURLException e19) {
                        e3 = e19;
                        httpURLConnection = null;
                        inputStream3 = null;
                    } catch (IOException e20) {
                        e2 = e20;
                        httpURLConnection = null;
                        inputStream2 = null;
                    } catch (Exception e21) {
                        e = e21;
                        httpURLConnection = null;
                        inputStream = null;
                    } catch (Throwable th22) {
                        th = th22;
                        r8 = 0;
                        r4 = 0;
                    }
                }
            } catch (Throwable th23) {
                obj = str;
                r8 = i;
                th = th23;
                r4 = length;
            }
        } else {
            str2 = "httpGet, url is null";
        }
        Log.e("MicroMsg.SDK.NetUtil", str2);
        return null;
    }

    public static boolean a(Context context, C0304a c0304a) {
        String str;
        String str2;
        if (context == null || c0304a == null) {
            str = "send fail, invalid argument";
        } else {
            if (!b.b(c0304a.f30955b)) {
                if (b.b(c0304a.f30954a)) {
                    str2 = null;
                } else {
                    str2 = c0304a.f30954a + ".permission.MM_MESSAGE";
                }
                Intent intent = new Intent(c0304a.f30955b);
                Bundle bundle = c0304a.e;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                String packageName = context.getPackageName();
                intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
                intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
                intent.putExtra(ConstantsAPI.CONTENT, c0304a.f30956c);
                intent.putExtra(ConstantsAPI.APP_SUPORT_CONTENT_TYPE, c0304a.d);
                intent.putExtra(ConstantsAPI.CHECK_SUM, a(c0304a.f30956c, Build.SDK_INT, packageName));
                context.sendBroadcast(intent, str2);
                Log.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str2);
                return true;
            }
            str = "send fail, action is null";
        }
        Log.e("MicroMsg.SDK.MMessage", str);
        return false;
    }

    public static String a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            Log.e("MicroMsg.IntentUtil", "getStringExtra exception:" + e.getMessage());
            return null;
        }
    }

    public static Object a(int i, String str) {
        try {
            switch (i) {
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
        } catch (Exception e) {
            Log.e("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + e.getMessage());
            return null;
        }
    }

    public static int a(Bundle bundle, String str, int i) {
        if (bundle != null) {
            try {
                return bundle.getInt(str, i);
            } catch (Exception e) {
                Log.e("MicroMsg.IntentUtil", "getIntExtra exception:" + e.getMessage());
            }
        }
        return i;
    }
}
