package com.huami.watch.ota;

import android.content.Context;
import android.os.Handler;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huami.watch.util.Log;
import com.xmlywind.sdk.common.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes16.dex */
public class NetworkTool {
    private static final String a = "NetworkTool";

    public static int connect(HttpURLConnection httpURLConnection) {
        int responseCode;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
            } catch (IOException e) {
                e.printStackTrace();
                responseCode = -1;
            }
        } else {
            responseCode = -1;
        }
        Log.d(a, "respond_code=" + responseCode, new Object[0]);
        return responseCode;
    }

    public static void disconnect(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x015a A[Catch: Exception -> 0x0192, TRY_ENTER, TryCatch #9 {Exception -> 0x0192, blocks: (B:51:0x015a, B:53:0x015f, B:55:0x0164, B:57:0x0169, B:73:0x018e, B:77:0x0196, B:79:0x019b, B:81:0x01a0), top: B:104:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x015f A[Catch: Exception -> 0x0192, TryCatch #9 {Exception -> 0x0192, blocks: (B:51:0x015a, B:53:0x015f, B:55:0x0164, B:57:0x0169, B:73:0x018e, B:77:0x0196, B:79:0x019b, B:81:0x01a0), top: B:104:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0164 A[Catch: Exception -> 0x0192, TryCatch #9 {Exception -> 0x0192, blocks: (B:51:0x015a, B:53:0x015f, B:55:0x0164, B:57:0x0169, B:73:0x018e, B:77:0x0196, B:79:0x019b, B:81:0x01a0), top: B:104:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0169 A[Catch: Exception -> 0x0192, TRY_LEAVE, TryCatch #9 {Exception -> 0x0192, blocks: (B:51:0x015a, B:53:0x015f, B:55:0x0164, B:57:0x0169, B:73:0x018e, B:77:0x0196, B:79:0x019b, B:81:0x01a0), top: B:104:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x018e A[Catch: Exception -> 0x0192, TRY_ENTER, TryCatch #9 {Exception -> 0x0192, blocks: (B:51:0x015a, B:53:0x015f, B:55:0x0164, B:57:0x0169, B:73:0x018e, B:77:0x0196, B:79:0x019b, B:81:0x01a0), top: B:104:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0196 A[Catch: Exception -> 0x0192, TryCatch #9 {Exception -> 0x0192, blocks: (B:51:0x015a, B:53:0x015f, B:55:0x0164, B:57:0x0169, B:73:0x018e, B:77:0x0196, B:79:0x019b, B:81:0x01a0), top: B:104:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x019b A[Catch: Exception -> 0x0192, TryCatch #9 {Exception -> 0x0192, blocks: (B:51:0x015a, B:53:0x015f, B:55:0x0164, B:57:0x0169, B:73:0x018e, B:77:0x0196, B:79:0x019b, B:81:0x01a0), top: B:104:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0 A[Catch: Exception -> 0x0192, TRY_LEAVE, TryCatch #9 {Exception -> 0x0192, blocks: (B:51:0x015a, B:53:0x015f, B:55:0x0164, B:57:0x0169, B:73:0x018e, B:77:0x0196, B:79:0x019b, B:81:0x01a0), top: B:104:0x0037 }] */
    public static void download2File(Context context, BeanDownload beanDownload, Handler handler) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnectionOpenUrl;
        RandomAccessFile randomAccessFile;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        Log.d(a, "down load file = " + beanDownload.name + " md5 value = " + beanDownload.md5, new Object[0]);
        File file = new File(beanDownload.name);
        byte[] bArr = new byte[2048];
        InputStream inputStream2 = null;
        try {
            try {
                if (beanDownload.size <= 0) {
                    Log.i(a, "star to new download", new Object[0]);
                    beanDownload.loadedSize = 0L;
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    handler.obtainMessage(400, beanDownload).sendToTarget();
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        httpURLConnectionOpenUrl = openUrl(context, beanDownload.url);
                        try {
                            int iConnect = connect(httpURLConnectionOpenUrl);
                            Log.i(a, "NetworkTool respondCode=" + iConnect, new Object[0]);
                            if (iConnect == 200) {
                                beanDownload.size = httpURLConnectionOpenUrl.getContentLength();
                                inputStream = httpURLConnectionOpenUrl.getInputStream();
                                while (true) {
                                    try {
                                        int i = inputStream.read(bArr);
                                        if (i == -1 || !beanDownload.enable) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, i);
                                        beanDownload.loadedSize += (long) i;
                                        handler.obtainMessage(400, beanDownload).sendToTarget();
                                    } catch (Exception e) {
                                        e = e;
                                        inputStream2 = inputStream;
                                        randomAccessFile = null;
                                        try {
                                            e.printStackTrace();
                                            beanDownload.enable = false;
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            if (httpURLConnectionOpenUrl != null) {
                                                disconnect(httpURLConnectionOpenUrl);
                                            }
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            if (randomAccessFile != null) {
                                                randomAccessFile.close();
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream2 = inputStream;
                                        randomAccessFile = null;
                                    }
                                }
                            } else {
                                inputStream = null;
                            }
                            inputStream2 = inputStream;
                            randomAccessFile = null;
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            if (httpURLConnectionOpenUrl != null) {
                                disconnect(httpURLConnectionOpenUrl);
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                                return;
                            }
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            randomAccessFile = null;
                        } catch (Throwable th4) {
                            th = th4;
                            randomAccessFile = null;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        httpURLConnectionOpenUrl = null;
                        randomAccessFile = null;
                    } catch (Throwable th5) {
                        th = th5;
                        httpURLConnectionOpenUrl = null;
                        randomAccessFile = null;
                    }
                } else {
                    Log.i(a, "star to resume download", new Object[0]);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        randomAccessFile.setLength(beanDownload.size);
                        httpURLConnectionOpenUrl = openUrl(context, beanDownload.url);
                        try {
                            httpURLConnectionOpenUrl.setRequestProperty("Range", Constants.RANGE_PARAMS + beanDownload.loadedSize + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + (beanDownload.size - 1));
                            if (connect(httpURLConnectionOpenUrl) == 206) {
                                InputStream inputStream3 = httpURLConnectionOpenUrl.getInputStream();
                                while (true) {
                                    try {
                                        int i2 = inputStream3.read(bArr);
                                        if (i2 == -1 || !beanDownload.enable) {
                                            break;
                                        }
                                        randomAccessFile.seek(beanDownload.loadedSize);
                                        randomAccessFile.write(bArr, 0, i2);
                                        beanDownload.loadedSize += (long) i2;
                                        handler.obtainMessage(400, beanDownload).sendToTarget();
                                    } catch (Exception e4) {
                                        e = e4;
                                        fileOutputStream = null;
                                        inputStream2 = inputStream3;
                                        e.printStackTrace();
                                        beanDownload.enable = false;
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        if (httpURLConnectionOpenUrl != null) {
                                            disconnect(httpURLConnectionOpenUrl);
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        if (randomAccessFile != null) {
                                            randomAccessFile.close();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        fileOutputStream = null;
                                        inputStream2 = inputStream3;
                                    }
                                }
                                fileOutputStream = null;
                                inputStream2 = inputStream3;
                            } else {
                                fileOutputStream = null;
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            if (httpURLConnectionOpenUrl != null) {
                                disconnect(httpURLConnectionOpenUrl);
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                                return;
                            }
                            return;
                        } catch (Exception e5) {
                            e = e5;
                            fileOutputStream = null;
                        } catch (Throwable th7) {
                            th = th7;
                            fileOutputStream = null;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        httpURLConnectionOpenUrl = null;
                        fileOutputStream = null;
                    } catch (Throwable th8) {
                        th = th8;
                        httpURLConnectionOpenUrl = null;
                        fileOutputStream = null;
                    }
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                return;
            }
        } catch (Exception e8) {
            e = e8;
            httpURLConnectionOpenUrl = null;
            randomAccessFile = null;
            fileOutputStream = null;
        } catch (Throwable th9) {
            th = th9;
            httpURLConnectionOpenUrl = null;
            randomAccessFile = null;
            fileOutputStream = null;
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (Exception e9) {
                e9.printStackTrace();
                throw th;
            }
        }
        if (httpURLConnectionOpenUrl != null) {
            disconnect(httpURLConnectionOpenUrl);
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        if (randomAccessFile == null) {
            throw th;
        }
        randomAccessFile.close();
        throw th;
    }

    public static HttpURLConnection openUrl(Context context, String str) {
        HttpURLConnection httpURLConnection;
        NullPointerException e;
        IOException e2;
        MalformedURLException e3;
        Log.d(a, "Network urlStr[" + str + "]", new Object[0]);
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            try {
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(300000);
                httpURLConnection.setRequestMethod("GET");
            } catch (NullPointerException e4) {
                e = e4;
                e.printStackTrace();
            } catch (MalformedURLException e5) {
                e3 = e5;
                e3.printStackTrace();
            } catch (IOException e6) {
                e2 = e6;
                e2.printStackTrace();
            }
        } catch (MalformedURLException e7) {
            httpURLConnection = null;
            e3 = e7;
        } catch (IOException e8) {
            httpURLConnection = null;
            e2 = e8;
        } catch (NullPointerException e9) {
            httpURLConnection = null;
            e = e9;
        }
        return httpURLConnection;
    }
}
