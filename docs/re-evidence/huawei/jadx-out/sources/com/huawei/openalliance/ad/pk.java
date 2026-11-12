package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes12.dex */
public class pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f20028a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static pk f20029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gk f20030c;
    private String d = a();

    private boolean a(long j) {
        return j != -111111 && j > 0;
    }

    public a a(String str, String str2, long j) {
        if (TextUtils.isEmpty(str)) {
            hw.b("MonitorUrlFomatter", " url is empty");
            return null;
        }
        a aVar = new a();
        aVar.f20031a = str;
        if (str.indexOf("__HWPPSREQUESTID__") > 0) {
            String strA = TextUtils.isEmpty(str2) ? a(1) : a(str2);
            aVar.f20032b = strA;
            aVar.f20031a = str.replace("__HWPPSREQUESTID__", strA);
        }
        String str3 = aVar.f20031a;
        if (str3.indexOf("__TS__") > 0 && a(j)) {
            aVar.f20031a = str3.replace("__TS__", String.valueOf(j));
        }
        return aVar;
    }

    public a a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            hw.b("MonitorUrlFomatter", " url is empty");
            return null;
        }
        a aVar = new a();
        aVar.f20031a = str;
        if (str.indexOf("__HWPPSREQUESTID__") > 0) {
            String strA = a(1);
            aVar.f20032b = strA;
            aVar.f20031a = str.replace("__HWPPSREQUESTID__", strA);
        }
        String str2 = aVar.f20031a;
        if (str2.indexOf("__TS__") > 0 && a(j)) {
            aVar.f20031a = str2.replace("__TS__", String.valueOf(j));
        }
        return aVar;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20032b;

        public String b() {
            return this.f20032b;
        }

        public String a() {
            return this.f20031a;
        }
    }

    private String a(String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return a(1);
        }
        try {
            int iLastIndexOf = str.lastIndexOf("_");
            if (iLastIndexOf <= 0 || iLastIndexOf >= str.length() - 1) {
                str3 = "requestId format is illegal.";
            } else {
                int i = iLastIndexOf + 1;
                String strSubstring = str.substring(i);
                if (!TextUtils.isEmpty(strSubstring)) {
                    int i2 = Integer.parseInt(strSubstring);
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append((CharSequence) str, 0, i);
                    stringBuffer.append(i2 + 1);
                    return stringBuffer.toString();
                }
                str3 = "requestId format is illegal. seq is empty";
            }
            hw.b("MonitorUrlFomatter", str3);
        } catch (NumberFormatException unused) {
            str2 = "seq has format exception:";
            hw.c("MonitorUrlFomatter", str2);
        } catch (Exception unused2) {
            str2 = "increaseRequestIdSeqNum has exception";
            hw.c("MonitorUrlFomatter", str2);
        }
        return a(1);
    }

    private String a(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.d);
        stringBuffer.append("_");
        stringBuffer.append(com.huawei.openalliance.ad.utils.ar.a(com.huawei.openalliance.ad.utils.cw.a(7)));
        stringBuffer.append("_");
        stringBuffer.append(i);
        return stringBuffer.toString();
    }

    private String a() {
        String strBG = this.f20030c.bG();
        if (!TextUtils.isEmpty(strBG)) {
            return strBG;
        }
        String strReplaceAll = com.huawei.openalliance.ad.utils.as.a().replaceAll(Constants.LINK, "");
        this.f20030c.m(strReplaceAll);
        return strReplaceAll;
    }

    public static pk a(Context context) {
        pk pkVar;
        synchronized (f20028a) {
            if (f20029b == null) {
                f20029b = new pk(context);
            }
            pkVar = f20029b;
        }
        return pkVar;
    }

    private pk(Context context) {
        this.f20030c = fp.b(context);
    }
}
