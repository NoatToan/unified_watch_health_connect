package com.huawei.ui.main.stories.recommendcloud.util;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.recommendcloud.service.RecommendCloudHttpCallBack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes19.dex */
public class HttpUtil {
    private static final int EXPECTED_BUFFER_DATA = 1024;
    private static final String TAG = "UIDV_RecommendHttpUtil";
    private static volatile ExecutorService sExecutorService;

    private HttpUtil() {
    }

    public static void doRefresh(final String str, final String str2, final RecommendCloudHttpCallBack recommendCloudHttpCallBack) {
        LogUtil.a(TAG, "pullRefresh");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j(TAG, "url or param is null");
            return;
        }
        if (sExecutorService == null || sExecutorService.isShutdown()) {
            LogUtil.a(TAG, "new executorService");
            sExecutorService = Executors.newSingleThreadExecutor();
        }
        sExecutorService.execute(new Runnable() { // from class: com.huawei.ui.main.stories.recommendcloud.util.HttpUtil.3
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                HttpUtil.doPostReq(str, str2, recommendCloudHttpCallBack);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8971. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    public static void doPostReq(java.lang.String r18, java.lang.String r19, com.huawei.ui.main.stories.recommendcloud.service.RecommendCloudHttpCallBack r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.ui.main.stories.recommendcloud.util.HttpUtil.doPostReq(java.lang.String, java.lang.String, com.huawei.ui.main.stories.recommendcloud.service.RecommendCloudHttpCallBack):void");
    }

    private static void closeInputStream(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e(TAG, "closeInputStream IOException:");
            }
        }
    }

    private static void closeOutputStream(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                LogUtil.e(TAG, "closeOutputStream IOException");
            }
        }
    }

    private static void closeHttpUrlConnection(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    private static void closeBufferedReader(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused) {
                LogUtil.e(TAG, "closeBufferedReader IOException");
            }
        }
    }

    private static void closeOutputStreamWriter(OutputStreamWriter outputStreamWriter) {
        if (outputStreamWriter != null) {
            try {
                outputStreamWriter.close();
            } catch (IOException unused) {
                LogUtil.e(TAG, "closeOutputStreamWriter IOException");
            }
        }
    }

    private static void closePrintWriter(PrintWriter printWriter) {
        if (printWriter != null) {
            printWriter.close();
        }
    }

    private static void closeInputStreamReader(InputStreamReader inputStreamReader) {
        if (inputStreamReader != null) {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
                LogUtil.e(TAG, "closeInputStreamReader IOException");
            }
        }
    }
}
