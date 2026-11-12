package com.huawei.agconnect.apms;

import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends c {
    public static final AgentLog cde = AgentLogManager.getAgentLog();

    public static void abc(b bVar, Request request) {
        long jContentLength;
        String strHeader;
        if (request == null || request.url() == null) {
            return;
        }
        String url = request.url().getUrl();
        String strMethod = request.method();
        if (request.body() != null) {
            try {
                jContentLength = request.body().contentLength();
            } catch (Throwable th) {
                def.abc(th, abc.abc("failed to get request content length: "), cde);
                jContentLength = -1;
            }
        } else {
            jContentLength = -1;
        }
        if (jContentLength < 0 && (strHeader = request.header("Content-length")) != null && strHeader.length() > 0) {
            try {
                jContentLength = Long.parseLong(strHeader);
            } catch (Throwable th2) {
                def.abc(th2, abc.abc("failed to parse content length: "), cde);
            }
        }
        c.abc(bVar, url, strMethod, jContentLength != -1 ? jContentLength : 0L);
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

    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    public static Response abc(b bVar, Response response) {
        int i;
        String str;
        String str2;
        MediaType mediaType;
        long jAbc = 0;
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
            bVar.ghi(abc(response, "_apms_result_code", ""));
            if (Agent.isNuwaTracerEnable()) {
                bVar.pqr(abc(response, "network-in", ""));
                bVar.qrs(abc(response, "network-out", ""));
                bVar.mno(abc(response, HeaderType.X_NUWA_SAMPLE_STATE, "0"));
                bVar.rst(abc(response, HeaderType.X_NUWA_CALL_SEQ, ""));
            }
            try {
                jAbc = abc(response);
            } catch (Throwable th) {
                def.abc(th, abc.abc("failed to get response content length: "), cde);
            }
            i = iCode;
            str = strAbc;
        }
        long j = (int) jAbc;
        if (response == null || response.body() == null || (mediaType = response.body().get$contentType()) == null) {
            str2 = "";
        } else {
            String mediaType2 = mediaType.getMediaType();
            if (TextUtils.isEmpty(mediaType2)) {
                str2 = "";
            } else {
                str2 = mediaType2;
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

    public static long abc(Response response) {
        String strHeader;
        if (response == null) {
            return 0L;
        }
        long contentLength = response.body() != null ? response.body().getContentLength() : -1L;
        if (contentLength < 0 && (strHeader = response.header("Content-length")) != null && strHeader.length() > 0) {
            try {
                contentLength = Long.parseLong(strHeader);
            } catch (Throwable th) {
                def.abc(th, abc.abc("failed to parse content length: "), cde);
            }
        }
        if (contentLength == -1) {
            return 0L;
        }
        return contentLength;
    }
}
