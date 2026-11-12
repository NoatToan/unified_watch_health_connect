package com.huawei.agconnect.apms;

import android.os.Looper;
import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static final AgentLog abc = AgentLogManager.getAgentLog();
    public static final ConcurrentHashMap<String, String> bcd = new ConcurrentHashMap<>();

    public static void abc(b bVar, String str, String str2, long j) {
        bVar.lmn(str);
        bVar.efg(str2);
        bVar.bcd(j);
    }

    public static boolean abc(int i) {
        return i >= 8;
    }

    public static void abc(b bVar, long j, int i, String str, String str2) {
        if (j >= 0) {
            bVar.def(j);
        }
        bVar.cde(i);
        bVar.efg = str;
        bVar.cde = str2;
    }

    public static String abc(HttpURLConnection httpURLConnection, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String headerField = httpURLConnection.getHeaderField(str);
            if (!TextUtils.isEmpty(headerField)) {
                return headerField;
            }
        }
        return str2;
    }

    public static void abc(b bVar, HttpURLConnection httpURLConnection) {
        String strAbc;
        Throwable th;
        int responseCode;
        int contentLength = httpURLConnection.getContentLength();
        try {
            responseCode = httpURLConnection.getResponseCode();
            try {
                String str = Agent.getAgentConfiguration().def;
                if (TextUtils.isEmpty(str)) {
                    str = "dl-from";
                }
                strAbc = abc(httpURLConnection, str, "");
                try {
                    bVar.gfe = abc(httpURLConnection, "_apms_result_code", "");
                    if (Agent.isNuwaTracerEnable()) {
                        bVar.dcb = abc(httpURLConnection, "network-in", "");
                        bVar.cba = abc(httpURLConnection, "network-out", "");
                        bVar.f4797a = abc(httpURLConnection, HeaderType.X_NUWA_SAMPLE_STATE, "0");
                        bVar.f4798b = abc(httpURLConnection, HeaderType.X_NUWA_CALL_SEQ, "");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    def.abc(th, abc.abc("failed to get response info: "), abc);
                }
            } catch (Throwable th3) {
                strAbc = "";
                th = th3;
            }
        } catch (Throwable th4) {
            strAbc = "";
            th = th4;
            responseCode = 0;
        }
        abc(bVar, contentLength, responseCode, httpURLConnection.getContentType(), strAbc);
    }

    public static void abc(b bVar, Exception exc) {
        String string = exc.toString();
        abc.debug("catching http error: " + string);
        bVar.def(string);
    }

    public static void abc(String str, String str2) {
        bcd.put(str, str2);
    }

    public static void abc(String str, b bVar) {
        if (TextUtils.isEmpty(str) || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            InetAddress[] allByName = InetAddress.getAllByName(str);
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
            if (abc(iCurrentTimeMillis)) {
                jih jihVar = new jih(str, 0L);
                bVar.abc(jihVar);
                bVar.cba();
                jihVar.cde = iCurrentTimeMillis;
                jihVar.def = Arrays.asList(allByName).toString();
                jihVar.efg = true;
            }
        } catch (Throwable th) {
            bcd.abc(th, abc.abc("attempt to resolve dns failed: "), abc);
        }
    }

    public static int abc(b bVar) {
        long jCurrentTimeMillis = System.currentTimeMillis() - bVar.xyz;
        if (jCurrentTimeMillis <= 0 || jCurrentTimeMillis >= 2147483647L) {
            return -1;
        }
        return (int) jCurrentTimeMillis;
    }
}
