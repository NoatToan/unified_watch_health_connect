package com.huawei.updatesdk.sdk.service.storekit.bean;

import com.huawei.updatesdk.sdk.foundation.utils.g;
import com.huawei.updatesdk.sdk.foundation.utils.h;
import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class c {
    public static final String CLIENT_API = "clientApi";
    private static final String END_FLAG = "_";
    private static String url;

    @SDKNetTransmission
    private String method;

    @SDKNetTransmission
    private String ver = "1.1";

    protected void e() {
    }

    public String d() {
        return url + CLIENT_API;
    }

    public void c(String str) {
        this.ver = str;
    }

    protected Map<String, Field> c() {
        HashMap map = new HashMap();
        for (Field field : g.a(getClass())) {
            field.setAccessible(true);
            String name = field.getName();
            if (name.endsWith("_") || field.isAnnotationPresent(SDKNetTransmission.class)) {
                if (name.endsWith("_")) {
                    name = name.substring(0, name.length() - 1);
                }
                map.put(name, field);
            }
        }
        return map;
    }

    public String b() {
        return this.method;
    }

    public void a(String str) {
        this.method = str;
    }

    public String a() throws IllegalAccessException {
        e();
        Map<String, Field> mapC = c();
        int size = mapC.size();
        String[] strArr = new String[size];
        mapC.keySet().toArray(strArr);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            String strA = a(mapC.get(strArr[i]));
            if (strA != null) {
                String strA2 = h.a(strA);
                sb.append(strArr[i]);
                sb.append("=");
                sb.append(strA2);
                sb.append("&");
            }
            i++;
        } while (i < size);
        int length = sb.length();
        if (length > 0) {
            int i2 = length - 1;
            if (sb.charAt(i2) == '&') {
                sb.deleteCharAt(i2);
            }
        }
        return sb.toString();
    }

    public static void b(String str) {
        url = str;
    }

    private String a(Field field) throws IllegalAccessException {
        Object obj = field.get(this);
        if (obj instanceof b) {
            return ((b) obj).toJson();
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }
}
