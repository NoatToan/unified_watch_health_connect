package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes4.dex */
public final class gts {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8").replace(Marker.ANY_NON_NULL_MARKER, "%20").replace(Marker.ANY_MARKER, "%2A").replace("%7E", "~");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String b(String str, String str2, String str3) throws Exception {
        return d(e(str3 + gv5.CONNECT_STR, str.toUpperCase() + "&%2F&" + a(str2))).replace("=", "%3D");
    }

    public static String c(Map<String, String> map, String str) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("AccessKeyId", str);
        treeMap.put("SignatureMethod", "HMAC-SHA1");
        treeMap.put("SignatureVersion", "1.0");
        treeMap.put("SignatureNonce", UUID.randomUUID().toString());
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ParserHelper.DATA_FORMAT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        treeMap.put("Timestamp", simpleDateFormat.format(date));
        treeMap.putAll(map);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            arrayList.add(((String) entry.getKey()) + "=" + a((String) entry.getValue()));
        }
        StringBuilder sb = new StringBuilder("");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(gv5.CONNECT_STR);
        }
        String string = sb.toString();
        return string.substring(0, string.length() - 1);
    }

    public static String d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    public static byte[] e(String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(str.getBytes("UTF-8"), "UTF-8"));
        return mac.doFinal(str2.getBytes("UTF-8"));
    }
}
