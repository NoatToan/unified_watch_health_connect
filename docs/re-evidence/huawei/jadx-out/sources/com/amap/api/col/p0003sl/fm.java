package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.ServiceSettings;
import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fm<T, V> extends fl<T, V> {
    @Override // com.amap.api.col.p0003sl.fl
    protected abstract V a(String str) throws AMapException;

    @Override // com.amap.api.col.p0003sl.fl
    protected abstract String c();

    @Override // com.amap.api.col.p0003sl.fl, com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    public fm(Context context, T t) {
        super(context, t);
    }

    @Override // com.amap.api.col.p0003sl.la
    public byte[] getEntityBytes() {
        try {
            String strC = c();
            StringBuffer stringBuffer = new StringBuffer();
            if (strC != null) {
                stringBuffer.append(strC);
                stringBuffer.append("&");
            }
            stringBuffer.append(Constants.LANGUAGE_ASSIGN_STR).append(ServiceSettings.getInstance().getLanguage());
            String string = stringBuffer.toString();
            String strC2 = c(string);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(string);
            String strA = io.a();
            stringBuffer2.append("&ts=".concat(String.valueOf(strA)));
            stringBuffer2.append("&scode=" + io.a(this.i, strA, strC2));
            return stringBuffer2.toString().getBytes("utf-8");
        } catch (Throwable th) {
            fu.a(th, "ProtocalHandler", "getEntity");
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.fl, com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put(j2.v, Constants.GZIP);
        map.put("User-Agent", "AMAP SDK Android Search 9.7.4");
        map.put("X-INFO", io.b(this.i));
        map.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "9.7.4", "sea"));
        map.put("logversion", "2.1");
        return map;
    }

    private static String c(String str) {
        String[] strArrSplit = str.split("&");
        Arrays.sort(strArrSplit);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : strArrSplit) {
            stringBuffer.append(d(str2));
            stringBuffer.append("&");
        }
        String string = stringBuffer.toString();
        return string.length() > 1 ? (String) string.subSequence(0, string.length() - 1) : str;
    }

    protected static String b(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            fu.a(e, "ProtocalHandler", "strEncoderUnsupportedEncodingException");
            return "";
        } catch (Exception e2) {
            fu.a(e2, "ProtocalHandler", "strEncoderException");
            return "";
        }
    }

    private static String d(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            fu.a(e, "ProtocalHandler", "strReEncoder");
            return "";
        } catch (Exception e2) {
            fu.a(e2, "ProtocalHandler", "strReEncoderException");
            return "";
        }
    }
}
