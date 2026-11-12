package com.xiaomi.ai.domain.phonecall.contact;

import com.xiaomi.ai.domain.phonecall.parser.QueryMatcher;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.t08;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneType {
    private static Map<Integer, a> idxMap = new HashMap();
    private static Map<String, a> tagMap = new HashMap();
    private static List<String> tags = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11030b;
        public String c;

        public a(int i, int i2, String str) {
            this.f11029a = i;
            this.f11030b = i2;
            this.c = str;
        }

        public int a() {
            return this.f11029a;
        }

        public String b() {
            return this.c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        JSONObject jSONObject;
        String strOptString;
        try {
            InputStream inputStreamA = t08.a(QueryMatcher.RESOURCE_PATH);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamA));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!line.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX) && !line.isEmpty() && (strOptString = (jSONObject = new JSONObject(line)).optString("slot")) != null && strOptString.equals("norm_tag")) {
                            String strOptString2 = jSONObject.optString("token");
                            String strOptString3 = jSONObject.optString("norm_token");
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
                            if (strOptString2 != null && strOptString3 != null && jSONObjectOptJSONObject != null) {
                                int iOptInt = jSONObjectOptJSONObject.optInt("idx");
                                int iOptInt2 = jSONObjectOptJSONObject.optInt("mask");
                                if (!idxMap.containsKey(Integer.valueOf(iOptInt))) {
                                    idxMap.put(Integer.valueOf(iOptInt), new a(iOptInt, iOptInt2, strOptString3));
                                }
                                a aVar = idxMap.get(Integer.valueOf(iOptInt));
                                tagMap.put(strOptString2, aVar);
                                tagMap.put(strOptString3, aVar);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    if (inputStreamA != null) {
                        try {
                            inputStreamA.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th;
                }
                tags.addAll(tagMap.keySet());
                bufferedReader.close();
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
            } catch (Throwable th4) {
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                throw th4;
            }
        } catch (Exception e) {
            throw new RuntimeException("failed to init static PhoneType", e);
        }
    }

    public static int getIdxByTag(String str) {
        if (tagMap.containsKey(str)) {
            return tagMap.get(str).a();
        }
        return 6;
    }

    public static String getNormTag(String str) {
        return tagMap.containsKey(str) ? tagMap.get(str).b() : "";
    }

    public static String getNormTagByIdx(int i) {
        return idxMap.containsKey(Integer.valueOf(i)) ? idxMap.get(Integer.valueOf(i)).b() : "";
    }

    public static List<String> getTags() {
        return tags;
    }

    public static boolean isEqual(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return tagMap.containsKey(str) && tagMap.containsKey(str2) && tagMap.get(str).a() == tagMap.get(str2).a();
    }
}
