package com.tencent.mm.opensdk.diffdev.a;

import com.tencent.mm.opensdk.utils.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:154:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0230 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x027f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0299 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
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
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v49, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v72 */
    /* JADX WARN: Type inference failed for: r9v73 */
    /* JADX WARN: Type inference failed for: r9v74 */
    /* JADX WARN: Type inference failed for: r9v75 */
    /* JADX WARN: Type inference failed for: r9v76 */
    public static byte[] a(String str) throws Throwable {
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
        ?? r1 = 0;
        if (str != 0) {
            try {
                if (str.length() != 0) {
                    try {
                        str = (HttpURLConnection) new URL(str).openConnection();
                        try {
                            if (str == 0) {
                                Log.e("MicroMsg.SDK.NetUtil", "open connection failed.");
                                if (str != 0) {
                                    try {
                                        str.disconnect();
                                    } catch (Throwable th) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th.getMessage());
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
                                } catch (Throwable th2) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th2.getMessage());
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
                                    } catch (Throwable th3) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th3.getMessage());
                                    }
                                    try {
                                        inputStream5.close();
                                    } catch (Throwable th4) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th4.getMessage());
                                    }
                                    try {
                                        byteArrayOutputStream2.close();
                                    } catch (Throwable th5) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th5.getMessage());
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
                                        } catch (Throwable th6) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th6.getMessage());
                                        }
                                    }
                                    if (inputStream4 != null) {
                                        try {
                                            inputStream4.close();
                                        } catch (Throwable th7) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th7.getMessage());
                                        }
                                    }
                                    if (r7 != 0) {
                                        try {
                                            r7.close();
                                        } catch (Throwable th8) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th8.getMessage());
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
                                        } catch (Throwable th9) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th9.getMessage());
                                        }
                                    }
                                    if (inputStream3 != null) {
                                        try {
                                            inputStream3.close();
                                        } catch (Throwable th10) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th10.getMessage());
                                        }
                                    }
                                    if (r6 != 0) {
                                        try {
                                            r6.close();
                                        } catch (Throwable th11) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th11.getMessage());
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
                                        } catch (Throwable th12) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th12.getMessage());
                                        }
                                    }
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Throwable th13) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th13.getMessage());
                                        }
                                    }
                                    if (r5 != 0) {
                                        try {
                                            r5.close();
                                        } catch (Throwable th14) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th14.getMessage());
                                        }
                                    }
                                    return null;
                                } catch (Throwable th15) {
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    inputStream = inputStream5;
                                    th = th15;
                                    r1 = str;
                                    if (r1 != 0) {
                                        try {
                                            r1.disconnect();
                                        } catch (Throwable th16) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th16.getMessage());
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th17) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th17.getMessage());
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        throw th;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (Throwable th18) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th18.getMessage());
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
                            } catch (Throwable th19) {
                                byteArrayOutputStream = null;
                                r1 = str;
                                inputStream = inputStream5;
                                th = th19;
                                if (r1 != 0) {
                                    r1.disconnect();
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
                        } catch (Throwable th20) {
                            th = th20;
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
                    } catch (Throwable th21) {
                        th = th21;
                        inputStream = null;
                        byteArrayOutputStream = null;
                    }
                }
            } catch (Throwable th22) {
                th = th22;
            }
        }
        Log.e("MicroMsg.SDK.NetUtil", "httpGet, url is null");
        return null;
    }
}
