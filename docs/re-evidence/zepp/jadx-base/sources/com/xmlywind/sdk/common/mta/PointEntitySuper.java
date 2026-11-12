package com.xmlywind.sdk.common.mta;

import android.text.TextUtils;
import com.alipay.sdk.m.u.i;
import com.xiaomi.infra.galaxy.fds.Common;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.a;
import com.xmlywind.sdk.common.a.b;
import com.xmlywind.sdk.common.b.c;
import com.xmlywind.sdk.common.utils.n;
import com.xmlywind.volley.s;
import io.netty.util.internal.StringUtil;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes22.dex */
public abstract class PointEntitySuper {
    private static final String b = UUID.randomUUID().toString();
    private static long c = 1;
    public Object a;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private Map<String, String> k;
    private String l;
    private String m;
    private String n;
    private String o;
    private int p;
    private String q;
    private int r;

    private static long a() {
        long j;
        synchronized (PointEntitySuper.class) {
            j = c;
            c = 1 + j;
        }
        return j;
    }

    private String a(Map<String, Object> map) {
        if (map.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean z = false;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                if (z) {
                    sb.append(",");
                }
                sb.append("\"" + ((Object) entry.getKey()) + "\":");
                String uRLEncoded = entry.getValue() instanceof String ? !a(entry.getKey()) ? toURLEncoded((String) entry.getValue()) : (String) entry.getValue() : entry.getValue().toString();
                if (!uRLEncoded.startsWith("{")) {
                    uRLEncoded = "\"" + uRLEncoded + "\"";
                }
                sb.append(uRLEncoded);
                z = true;
            }
        }
        sb.append(i.d);
        return sb.toString();
    }

    private boolean a(String str) {
        return Arrays.asList("motion_before", "motion_after").contains(str);
    }

    public static String captureName(String str) {
        char[] charArray = str.toCharArray();
        if (charArray[0] <= '`' || charArray[0] >= '{') {
            return str;
        }
        charArray[0] = (char) (charArray[0] - ' ');
        return String.valueOf(charArray);
    }

    public static String lowFirstChar(String str) {
        char[] charArray = str.toCharArray();
        if (charArray[0] <= '@' || charArray[0] >= '[') {
            return str;
        }
        charArray[0] = (char) (charArray[0] + StringUtil.SPACE);
        return String.valueOf(charArray);
    }

    public static String toURLEncoded(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(new String(str.getBytes(), "UTF-8"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            SigmobLog.e(e.getMessage());
            return "";
        }
    }

    public void commit() {
        this.a = this;
        if (Constants.IS_TEST.booleanValue()) {
            SigmobLog.d("dcdebug:" + testJsonString());
        }
        c.a.b().a(new Runnable() { // from class: com.xmlywind.sdk.common.mta.PointEntitySuper.1
            @Override // java.lang.Runnable
            public void run() {
                PointEntitySuper.this.insertToDB(null);
            }
        });
    }

    public String getAc_type() {
        return this.d;
    }

    public String getAndroid_id() {
        return a.n().t();
    }

    public String getAppinfo_switch() {
        return this.f;
    }

    public String getCategory() {
        return this.h;
    }

    public String getClientversion() {
        return a.c();
    }

    public int getCompatible() {
        return this.r;
    }

    public String getExt() {
        return this.j;
    }

    public String getGoogle_aid() {
        return a.n().w();
    }

    public String getImei() {
        return a.n().y();
    }

    public String getImei1() {
        return a.n().b(0);
    }

    public String getImei2() {
        return a.n().b(1);
    }

    public int getIntegration() {
        return this.p;
    }

    public String getIs_mediation() {
        return this.e;
    }

    public String getLocation_switch() {
        return this.g;
    }

    public String getMd5() {
        return this.n;
    }

    public String getName() {
        return this.o;
    }

    public String getNetworktype() {
        return String.valueOf(a.n().S());
    }

    public String getOaid() {
        return a.n().Z();
    }

    public String getOaid_api() {
        return a.n().s();
    }

    public Map<String, String> getOptions() {
        return this.k;
    }

    public String getSdkversion() {
        return Constants.SDK_VERSION;
    }

    public String getSeq_id() {
        return String.valueOf(a());
    }

    public String getSha1() {
        return this.m;
    }

    public String getSub_category() {
        return this.i;
    }

    public String getTimestamp() {
        return TextUtils.isEmpty(this.l) ? String.valueOf(System.currentTimeMillis()) : this.l;
    }

    public String getUid() {
        return a.n().ac();
    }

    public String getUser_id() {
        return a.a();
    }

    public String getVersion() {
        return this.q;
    }

    public String getWmsession_id() {
        return b;
    }

    public void insertToDB(final com.xmlywind.sdk.common.a.c.a aVar) {
        try {
            if (this.d.equals("401") || a.b()) {
                Iterator<Integer> it2 = SDKConfig.sharedInstance().getLogBlackList().iterator();
                while (it2.hasNext()) {
                    if (this.d.equals(String.valueOf(it2.next()))) {
                        SigmobLog.e("black ac type " + this.d);
                        return;
                    }
                }
                Map<String, Object> map = toMap();
                if (getOptions() != null) {
                    map.remove("options");
                    map.putAll(getOptions());
                }
                String strA = a(map);
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                b.C1071b.a aVar2 = new b.C1071b.a();
                aVar2.a("point");
                HashMap map2 = new HashMap();
                map2.put("item", strA);
                aVar2.a(map2);
                com.xmlywind.sdk.common.a.c.a().a(com.xmlywind.sdk.common.a.c.a().getWritableDatabase(), aVar2.a(), new com.xmlywind.sdk.common.a.c.a() { // from class: com.xmlywind.sdk.common.mta.PointEntitySuper.3
                    @Override // com.xmlywind.sdk.common.a.c.a
                    public void onFailed(Throwable th) {
                        com.xmlywind.sdk.common.a.c.a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.onFailed(th);
                        }
                        SigmobLog.e(th.getMessage());
                    }

                    @Override // com.xmlywind.sdk.common.a.c.a
                    public void onSuccess() {
                        SigmobLog.d("insert success!");
                        com.xmlywind.sdk.common.a.c.a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.onSuccess();
                        }
                    }
                });
            }
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    public void sendServe() {
        this.a = this;
        String strA = a(toMap());
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            String str = "sigandroid_" + a.n().ab();
            com.xmlywind.sdk.common.e.a.a(toURLEncoded(BuriedPointManager.deflateAndBase64("_uniq_key=" + str + "&_batch_value=" + ("[" + strA + "]"))), new com.xmlywind.sdk.common.e.a.InterfaceC1072a() { // from class: com.xmlywind.sdk.common.mta.PointEntitySuper.2
                @Override // com.xmlywind.sdk.common.e.a.InterfaceC1072a
                public void onErrorResponse(s sVar) {
                }

                @Override // com.xmlywind.sdk.common.e.a.InterfaceC1072a
                public void onSuccess() {
                }
            });
        } catch (Exception e) {
            SigmobLog.e(e.getMessage());
        }
    }

    public void setAc_type(String str) {
        this.d = str;
    }

    public void setAppinfo_switch(String str) {
        this.f = str;
    }

    public void setCategory(String str) {
        this.h = str;
    }

    public void setCompatible(int i) {
        this.r = i;
    }

    public void setExt(String str) {
        this.j = str;
    }

    public void setIntegration(int i) {
        this.p = i;
    }

    public void setIs_mediation(String str) {
        this.e = str;
    }

    public void setLocation_switch(String str) {
        this.g = str;
    }

    public void setMd5(String str) {
        this.n = str;
    }

    public void setName(String str) {
        this.o = str;
    }

    public void setOptions(Map<String, String> map) {
        this.k = map;
    }

    public void setSha1(String str) {
        this.m = str;
    }

    public void setSub_category(String str) {
        this.i = str;
    }

    public void setTimestamp(String str) {
        this.l = str;
    }

    public void setVersion(String str) {
        this.q = str;
    }

    public String testJsonString() {
        Map<String, Object> map = toMap();
        if (getOptions() != null) {
            map.remove("options");
            map.putAll(getOptions());
        }
        return a(map);
    }

    public Map<String, Object> toMap() {
        List<Method> listA = n.a(this.a.getClass());
        HashMap map = new HashMap(listA.size());
        for (Method method : listA) {
            if (method.getName().startsWith("get") && !method.getName().equals("getLogs")) {
                try {
                    Object objInvoke = method.invoke(this.a, new Object[0]);
                    String strLowFirstChar = lowFirstChar(method.getName().substring(3));
                    if (objInvoke != null) {
                        if (strLowFirstChar.equalsIgnoreCase("content_length")) {
                            strLowFirstChar = Common.CONTENT_LENGTH;
                        } else if (strLowFirstChar.equalsIgnoreCase("content_type")) {
                            strLowFirstChar = "content-type";
                        } else if (strLowFirstChar.equalsIgnoreCase("ac_type")) {
                            strLowFirstChar = "_ac_type";
                        } else if (strLowFirstChar.equalsIgnoreCase("user_id")) {
                            strLowFirstChar = "_user_id";
                        } else if (!strLowFirstChar.equalsIgnoreCase(io.flutter.plugins.firebase.crashlytics.Constants.CLASS)) {
                        }
                        map.put(strLowFirstChar, objInvoke);
                    }
                } catch (Throwable th) {
                    SigmobLog.e("name " + method.getName() + th.getMessage());
                }
            }
        }
        return map;
    }
}
