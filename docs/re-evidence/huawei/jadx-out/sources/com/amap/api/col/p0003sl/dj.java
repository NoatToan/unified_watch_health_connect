package com.amap.api.col.p0003sl;

import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class dj extends df {
    @Override // com.amap.api.col.p0003sl.df, com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    public dj() {
        setProxy(iw.a(ad.f2193a));
        setConnectionTimeout(5000);
        setSoTimeout(50000);
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("User-Agent", y.d);
        hashtable.put(j2.v, Constants.GZIP);
        hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", "10.1.300", "3dmap"));
        hashtable.put("x-INFO", io.a(ad.f2193a));
        hashtable.put(MedalConstants.EVENT_KEY, il.f(ad.f2193a));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }

    protected String appendTsScode(String str) {
        String strA = a(str);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        String strA2 = io.a();
        stringBuffer.append("&ts=".concat(String.valueOf(strA2)));
        stringBuffer.append("&scode=" + io.a(ad.f2193a, strA2, strA));
        return stringBuffer.toString();
    }

    private static String a(String str) {
        String[] strArrSplit = str.split("&");
        Arrays.sort(strArrSplit);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : strArrSplit) {
            stringBuffer.append(b(str2));
            stringBuffer.append("&");
        }
        String string = stringBuffer.toString();
        return string.length() > 1 ? (String) string.subSequence(0, string.length() - 1) : str;
    }

    private static String b(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            jv.c(e, "AbstractProtocalHandler", "strReEncoder");
            return "";
        } catch (Exception e2) {
            jv.c(e2, "AbstractProtocalHandler", "strReEncoderException");
            return "";
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public String getIPV6URL() {
        String url = getURL();
        return (url == null || !url.contains("http://restsdk.amap.com/v4/gridmap?")) ? url : eb.a(url);
    }

    @Override // com.amap.api.col.p0003sl.la
    public boolean isSupportIPV6() {
        String url = getURL();
        return url != null && url.contains("http://restsdk.amap.com/v4/gridmap?");
    }
}
