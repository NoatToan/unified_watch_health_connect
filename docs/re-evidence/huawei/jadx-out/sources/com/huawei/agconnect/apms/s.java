package com.huawei.agconnect.apms;

import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends c {
    public static final AgentLog cde = AgentLogManager.getAgentLog();

    public static final class abc {
        public static final ThreadPoolExecutor abc;

        static {
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            int i = iAvailableProcessors < 2 ? 2 : iAvailableProcessors;
            abc = new ThreadPoolExecutor(i, i, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
    }

    public static String abc(Response response, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String strHeader = response.header(str);
            if (!TextUtils.isEmpty(strHeader)) {
                return strHeader;
            }
        }
        return str2;
    }

    public static void bcd(b bVar, Request request) {
        long jContentLength;
        String strHeader;
        if (request == null) {
            return;
        }
        String strUrlString = request.urlString();
        String strMethod = request.method();
        if (request.body() != null) {
            try {
                jContentLength = request.body().contentLength();
            } catch (Throwable th) {
                def.abc(th, com.huawei.agconnect.apms.abc.abc("failed to get request content length: "), cde);
                jContentLength = -1;
            }
        } else {
            jContentLength = -1;
        }
        if (jContentLength < 0 && (strHeader = request.header("Content-length")) != null && strHeader.length() > 0) {
            try {
                jContentLength = Long.parseLong(strHeader);
            } catch (Throwable th2) {
                def.abc(th2, com.huawei.agconnect.apms.abc.abc("failed to parse content length: "), cde);
            }
        }
        c.abc(bVar, strUrlString, strMethod, jContentLength != -1 ? jContentLength : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    public static Response abc(b bVar, Response response) {
        int i;
        String str;
        long j;
        String str2;
        MediaType mediaTypeContentType;
        long jContentLength;
        if (response == null) {
            str = "";
            i = 500;
        } else {
            int iCode = response.code();
            String str3 = Agent.getAgentConfiguration().def;
            if (TextUtils.isEmpty(str3)) {
                str3 = "dl-from";
            }
            String strAbc = abc(response, str3, "");
            if (Agent.isNuwaTracerEnable()) {
                bVar.pqr(abc(response, "network-in", ""));
                bVar.qrs(abc(response, "network-out", ""));
                bVar.mno(abc(response, HeaderType.X_NUWA_SAMPLE_STATE, "0"));
                bVar.rst(abc(response, HeaderType.X_NUWA_CALL_SEQ, ""));
            }
            bVar.ghi(abc(response, "_apms_result_code", ""));
            i = iCode;
            str = strAbc;
        }
        if (response != null) {
            if (response.body() != null) {
                try {
                    jContentLength = response.body().contentLength();
                } catch (Throwable th) {
                    def.abc(th, com.huawei.agconnect.apms.abc.abc("failed to get request content length: "), cde);
                    jContentLength = -1;
                }
            } else {
                jContentLength = -1;
            }
            if (jContentLength < 0) {
                String strHeader = response.header("Content-length");
                if (!TextUtils.isEmpty(strHeader)) {
                    try {
                        jContentLength = Long.parseLong(strHeader);
                    } catch (Throwable th2) {
                        def.abc(th2, com.huawei.agconnect.apms.abc.abc("failed to parse content length: "), cde);
                    }
                }
            }
            if (jContentLength == -1) {
                j = 0;
            } else {
                j = jContentLength;
            }
        } else {
            j = 0;
        }
        if (response == null || response.body() == null || (mediaTypeContentType = response.body().contentType()) == null) {
            str2 = "";
        } else {
            String string = mediaTypeContentType.toString();
            if (TextUtils.isEmpty(string)) {
                str2 = "";
            } else {
                str2 = string;
            }
        }
        c.abc(bVar, j, i, str2, str);
        bVar.k();
        if (bVar.c()) {
            bVar.qpo = v0.abc();
        }
        d.cde.add(bVar);
        return response;
    }

    public static void abc(b bVar, Request request) {
        if (request == null || request.url() == null) {
            return;
        }
        abc.abc.execute(new q(bVar, request));
    }
}
