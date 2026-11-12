package com.tencent.mm.opensdk.diffdev.a;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.mm.opensdk.utils.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes18.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:125:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.net.HttpURLConnection] */
    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        ?? r9;
        InputStream inputStream2;
        ?? r10;
        InputStream inputStream3;
        ?? r11;
        InputStream inputStream4;
        ?? r5;
        ?? r6;
        ?? r7;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r2 = 0;
        if (str != 0) {
            try {
                if (str.length() != 0) {
                    try {
                        str = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                        try {
                            if (str == 0) {
                                Log.e("MicroMsg.SDK.NetUtil", "open connection failed.");
                                if (str != 0) {
                                    try {
                                        str.disconnect();
                                    } catch (Throwable unused) {
                                    }
                                }
                                return null;
                            }
                            str.setRequestMethod("GET");
                            str.setConnectTimeout(60000);
                            str.setReadTimeout(60000);
                            if (str.getResponseCode() >= 300) {
                                Log.e("MicroMsg.SDK.NetUtil", "httpURLConnectionGet 300");
                                try {
                                    str.disconnect();
                                } catch (Throwable unused2) {
                                }
                                return null;
                            }
                            InputStream inputStream5 = str.getInputStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i = inputStream5.read(bArr);
                                        if (i == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, i);
                                    }
                                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                    Log.d("MicroMsg.SDK.NetUtil", "httpGet end");
                                    try {
                                        str.disconnect();
                                    } catch (Throwable unused3) {
                                    }
                                    try {
                                        inputStream5.close();
                                    } catch (Throwable unused4) {
                                    }
                                    try {
                                        byteArrayOutputStream2.close();
                                    } catch (Throwable unused5) {
                                    }
                                    return byteArray;
                                } catch (MalformedURLException e) {
                                    inputStream4 = inputStream5;
                                    e = e;
                                    r7 = byteArrayOutputStream2;
                                    r14 = str;
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e.getMessage());
                                    if (r14 != 0) {
                                        try {
                                            r14.disconnect();
                                        } catch (Throwable unused6) {
                                        }
                                    }
                                    if (inputStream4 != null) {
                                        try {
                                            inputStream4.close();
                                        } catch (Throwable unused7) {
                                        }
                                    }
                                    if (r7 != 0) {
                                        try {
                                            r7.close();
                                        } catch (Throwable unused8) {
                                        }
                                    }
                                    return null;
                                } catch (IOException e2) {
                                    inputStream3 = inputStream5;
                                    e = e2;
                                    r6 = byteArrayOutputStream2;
                                    r13 = str;
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e.getMessage());
                                    if (r13 != 0) {
                                        try {
                                            r13.disconnect();
                                        } catch (Throwable unused9) {
                                        }
                                    }
                                    if (inputStream3 != null) {
                                        try {
                                            inputStream3.close();
                                        } catch (Throwable unused10) {
                                        }
                                    }
                                    if (r6 != 0) {
                                        try {
                                            r6.close();
                                        } catch (Throwable unused11) {
                                        }
                                    }
                                    return null;
                                } catch (Exception e3) {
                                    inputStream2 = inputStream5;
                                    e = e3;
                                    r5 = byteArrayOutputStream2;
                                    r12 = str;
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e.getMessage());
                                    if (r12 != 0) {
                                        try {
                                            r12.disconnect();
                                        } catch (Throwable unused12) {
                                        }
                                    }
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Throwable unused13) {
                                        }
                                    }
                                    if (r5 != 0) {
                                        try {
                                            r5.close();
                                        } catch (Throwable unused14) {
                                        }
                                    }
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    r2 = str;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    inputStream = inputStream5;
                                    if (r2 != 0) {
                                        try {
                                            r2.disconnect();
                                        } catch (Throwable unused15) {
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused16) {
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        throw th;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (Throwable unused17) {
                                        throw th;
                                    }
                                }
                            } catch (MalformedURLException e4) {
                                r7 = 0;
                                inputStream4 = inputStream5;
                                e = e4;
                                r14 = str;
                            } catch (IOException e5) {
                                r6 = 0;
                                inputStream3 = inputStream5;
                                e = e5;
                                r13 = str;
                            } catch (Exception e6) {
                                r5 = 0;
                                inputStream2 = inputStream5;
                                e = e6;
                                r12 = str;
                            } catch (Throwable th2) {
                                th = th2;
                                byteArrayOutputStream = null;
                                inputStream = inputStream5;
                                r2 = str;
                                if (r2 != 0) {
                                    r2.disconnect();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    throw th;
                                }
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } catch (MalformedURLException e7) {
                            e = e7;
                            inputStream4 = null;
                            r11 = str;
                            r7 = inputStream4;
                            r14 = r11;
                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e.getMessage());
                            if (r14 != 0) {
                                r14.disconnect();
                            }
                            if (inputStream4 != null) {
                                inputStream4.close();
                            }
                            if (r7 != 0) {
                                r7.close();
                            }
                            return null;
                        } catch (IOException e8) {
                            e = e8;
                            inputStream3 = null;
                            r10 = str;
                            r6 = inputStream3;
                            r13 = r10;
                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e.getMessage());
                            if (r13 != 0) {
                                r13.disconnect();
                            }
                            if (inputStream3 != null) {
                                inputStream3.close();
                            }
                            if (r6 != 0) {
                                r6.close();
                            }
                            return null;
                        } catch (Exception e9) {
                            e = e9;
                            inputStream2 = null;
                            r9 = str;
                            r5 = inputStream2;
                            r12 = r9;
                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e.getMessage());
                            if (r12 != 0) {
                                r12.disconnect();
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            if (r5 != 0) {
                                r5.close();
                            }
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                            byteArrayOutputStream = null;
                        }
                    } catch (MalformedURLException e10) {
                        e = e10;
                        r11 = 0;
                        inputStream4 = null;
                    } catch (IOException e11) {
                        e = e11;
                        r10 = 0;
                        inputStream3 = null;
                    } catch (Exception e12) {
                        e = e12;
                        r9 = 0;
                        inputStream2 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        byteArrayOutputStream = null;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        Log.e("MicroMsg.SDK.NetUtil", "httpGet, url is null");
        return null;
    }
}
