package com.ximalaya.ting.android.opensdk.httputil;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.ximalaya.ting.android.opensdk.httputil.util.freeflow.FreeFlowServiceUtil;
import com.ximalaya.ting.android.opensdk.util.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class HttpUrlUtil {
    public static Config mConfig;

    public static int downloadFile(String str, String str2, String str3) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnection = getHttpURLConnection(str, mConfig, "GET", null);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                String headerField = httpURLConnection.getHeaderField("Content-Length");
                if (responseCode == 200 && !TextUtils.isEmpty(headerField) && Long.parseLong(headerField) > 0) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    byte[] bArr = new byte[8192];
                    File file = new File(str2);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, str3), false);
                    while (true) {
                        try {
                            int i = inputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i);
                        } catch (IOException e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            e.printStackTrace();
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            return -1;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    fileOutputStream2.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    return 0;
                }
                return -1;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    public static HttpURLConnection getHttpURLConnection(String str, Config config, String str2, FreeFlowServiceUtil.ISetHttpUrlConnectAttribute iSetHttpUrlConnectAttribute) throws IOException {
        return FreeFlowServiceUtil.getHttpURLConnection(config, str, str2, iSetHttpUrlConnectAttribute);
    }

    private static void logToSD(HttpURLConnection httpURLConnection) {
        Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
        String str = "OpenSDK.class header头 :";
        if (requestProperties.containsKey("Authorization")) {
            str = "OpenSDK.class header头 :Authorization:" + requestProperties.get("Authorization") + "   ";
        }
        if (requestProperties.containsKey("spid")) {
            str = str + "spid:" + requestProperties.get("spid") + "   ";
        }
        String str2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date(System.currentTimeMillis())) + "     " + (str + "是否使用了代理 " + httpURLConnection.usingProxy());
        Logger.logToSd(str2);
        Logger.log(str2);
    }

    public static int upload(String str, String str2) {
        try {
            final File file = new File(str2);
            if (file.exists() && !file.isDirectory() && file.canRead()) {
                try {
                    try {
                        OutputStream outputStream = getHttpURLConnection(str, mConfig, "POST", new FreeFlowServiceUtil.ISetHttpUrlConnectAttribute() { // from class: com.ximalaya.ting.android.opensdk.httputil.HttpUrlUtil.1
                            @Override // com.ximalaya.ting.android.opensdk.httputil.util.freeflow.FreeFlowServiceUtil.ISetHttpUrlConnectAttribute
                            public void setHttpUrlConnectAttributes(@NonNull HttpURLConnection httpURLConnection) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setChunkedStreamingMode(AMapEngineUtils.HALF_MAX_P20_WIDTH);
                                httpURLConnection.setRequestProperty("Charset", "UTF-8");
                                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;file=" + file.getName());
                                httpURLConnection.setRequestProperty(FileDownloadModel.FILENAME, file.getName());
                                httpURLConnection.setRequestProperty("Content-Length", "" + file.length());
                            }
                        }).getOutputStream();
                        FileInputStream fileInputStream = new FileInputStream(file);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i <= 0) {
                                outputStream.flush();
                                fileInputStream.close();
                                outputStream.close();
                                return -1;
                            }
                            outputStream.write(bArr, 0, i);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return -1;
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return -1;
                }
            }
            return -2;
        } catch (IOException e3) {
            e3.printStackTrace();
            return -1;
        }
    }
}
