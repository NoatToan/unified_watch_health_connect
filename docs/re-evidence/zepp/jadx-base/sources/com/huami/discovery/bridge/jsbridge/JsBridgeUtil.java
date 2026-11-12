package com.huami.discovery.bridge.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huami.discovery.bridge.jsbridge.JsBridgeUtil;
import com.huami.tools.log.HMLog;
import com.huami.watch.ota.UpdateUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes8.dex */
public class JsBridgeUtil {
    public static final String JAVASCRIPT_STR = "javascript:";
    public static final String a = "hm://";
    public static final String b = "hm://return/";
    private static final String c = "hm://return/_fetchQueue/";
    private static final String d = "";
    public static final String e = "_";
    private static final String f = "/";
    private static final String g = "javascript:HM_JsBridge.";
    public static final String h = "JAVA_CB_%s";
    public static final String i = "javascript:HM_JsBridge._handleMessageFromNative('%s');";
    public static final String j = "javascript:HM_JsBridge._fetchQueue();";
    private static final String k = "t/js.hm_jsbridge";
    private static final String l = "JS_BRIDGE";

    public static String b(String str) {
        if (str.startsWith(c)) {
            return str.replace(c, "");
        }
        String[] strArrSplit = str.replace("hm://return/", "").split("/");
        if (strArrSplit.length < 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 1; i2 < strArrSplit.length; i2++) {
            sb.append(strArrSplit[i2]);
        }
        return sb.toString();
    }

    public static String c(String str) {
        String[] strArrSplit = str.replace("hm://return/", "").split("/");
        if (strArrSplit.length >= 1) {
            return strArrSplit[0];
        }
        return null;
    }

    public static String e(String str) {
        return str.replace(g, "").replaceAll("\\(.*\\);", "");
    }

    public static String getCleanUrl(String str) {
        String[] strArrSplit = str.split(UpdateUtils.CMD_FILTER);
        return strArrSplit.length > 0 ? strArrSplit[0] : str;
    }

    public static String getJsBridgeScript(Context context) {
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("JS_BRIDGE");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = fileInputStreamOpenFileInput.read(bArr);
                if (i2 == -1) {
                    return new String(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return "";
        } catch (IOException e3) {
            e3.printStackTrace();
            return "";
        }
    }

    public static boolean isJsBridgeUrl(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("hm://");
    }

    public static void loadServerJsBridge(final String str, final Context context) {
        new Thread(new Runnable() { // from class: uj4
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                JsBridgeUtil.saveJsBridgeScript(str, context);
            }
        }).start();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b1 A[Catch: IOException -> 0x00ad, TRY_LEAVE, TryCatch #5 {IOException -> 0x00ad, blocks: (B:37:0x00a9, B:41:0x00b1), top: B:49:0x00a9 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.FileOutputStream] */
    public static void saveJsBridgeScript(String e2, Context context) throws Throwable {
        String line;
        ?? bytes = 0;
        bytes = 0;
        bytes = 0;
        bytes = 0;
        bytes = 0;
        try {
            try {
                try {
                    URL url = new URL(((String) e2) + k);
                    ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).connect();
                    e2 = FirebasePerfUrlConnection.openStream(url);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e2));
                        try {
                            StringBuilder sb = new StringBuilder();
                            do {
                                line = bufferedReader.readLine();
                                if (line != null && !line.matches("^\\s*\\/\\/.*")) {
                                    sb.append(line);
                                }
                            } while (line != null);
                            bufferedReader.close();
                            e2.close();
                            ?? OpenFileOutput = context.openFileOutput("JS_BRIDGE", 0);
                            bytes = sb.toString().getBytes();
                            OpenFileOutput.write(bytes);
                            OpenFileOutput.close();
                            bufferedReader.close();
                            e2.close();
                        } catch (Exception e3) {
                            e = e3;
                            bytes = bufferedReader;
                            e.printStackTrace();
                            HMLog.e("JsBridgeUtil", "saveJsBridge Exception:" + e, new Object[0]);
                            if (bytes != 0) {
                                bytes.close();
                            }
                            if (e2 != 0) {
                                e2.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            bytes = bufferedReader;
                            if (bytes != 0) {
                                try {
                                    bytes.close();
                                    if (e2 != 0) {
                                        e2.close();
                                    }
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                    throw th;
                                }
                            } else if (e2 != 0) {
                                e2.close();
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (IOException e6) {
                    e2 = e6;
                    e2.printStackTrace();
                }
            } catch (Exception e7) {
                e = e7;
                e2 = 0;
            } catch (Throwable th2) {
                th = th2;
                e2 = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
