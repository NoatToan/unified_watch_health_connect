package defpackage;

import android.content.Context;
import com.amap.api.col.p0003sl.u;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.ServiceSettings;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kts<T, V> extends u<T, V> {
    public kts(Context context, T t) {
        super(context, t);
    }

    public static String b(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            xts.i(e, "ProtocalHandler", "strEncoderUnsupportedEncodingException");
            return "";
        } catch (Exception e2) {
            xts.i(e2, "ProtocalHandler", "strEncoderException");
            return "";
        }
    }

    public static String r(String str) {
        String[] strArrSplit = str.split(gv5.CONNECT_STR);
        Arrays.sort(strArrSplit);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : strArrSplit) {
            stringBuffer.append(s(str2));
            stringBuffer.append(gv5.CONNECT_STR);
        }
        String string = stringBuffer.toString();
        return string.length() > 1 ? (String) string.subSequence(0, string.length() - 1) : str;
    }

    private static String s(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            xts.i(e, "ProtocalHandler", "strReEncoder");
            return "";
        } catch (Exception e2) {
            xts.i(e2, "ProtocalHandler", "strReEncoderException");
            return "";
        }
    }

    @Override // com.amap.api.col.p0003sl.u
    public abstract V e(String str) throws AMapException;

    @Override // com.amap.api.col.p0003sl.la
    public byte[] getEntityBytes() {
        try {
            String strQ = q();
            StringBuffer stringBuffer = new StringBuffer();
            if (strQ != null) {
                stringBuffer.append(strQ);
                stringBuffer.append(gv5.CONNECT_STR);
            }
            stringBuffer.append("language=");
            stringBuffer.append(ServiceSettings.getInstance().getLanguage());
            String string = stringBuffer.toString();
            String strR = r(string);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(string);
            String strA = g0t.a();
            stringBuffer2.append("&ts=".concat(String.valueOf(strA)));
            stringBuffer2.append("&scode=" + g0t.c(this.v, strA, strR));
            return stringBuffer2.toString().getBytes("utf-8");
        } catch (Throwable th) {
            xts.i(th, "ProtocalHandler", "getEntity");
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.u, com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put("Accept-Encoding", "gzip");
        map.put("User-Agent", "AMAP SDK Android Search 9.7.4");
        map.put("X-INFO", g0t.i(this.v));
        map.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "9.7.4", "sea"));
        map.put("logversion", "2.1");
        return map;
    }

    public abstract String q();
}
