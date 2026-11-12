package com.xiaomi.infra.galaxy.fds.model;

import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class CORSConfiguration {
    private static final String c = "rules";
    private final Map<String, CORSRule> a = new HashMap();
    private List<String> b = new ArrayList();

    public static class CORSRule {
        private static final String c = "id";
        private static final String d = "allowOrigin";
        private String a;
        private String b;

        public CORSRule() {
        }

        public static CORSRule copy(CORSRule cORSRule) {
            try {
                return fromJson(cORSRule.toJson());
            } catch (JSONException unused) {
                return null;
            }
        }

        public static CORSRule fromJson(String str) throws JSONException {
            JSONObject jSONObject = new JSONObject(str);
            CORSRule cORSRule = new CORSRule();
            if (jSONObject.has("id")) {
                cORSRule.setId(jSONObject.getString("id"));
            } else {
                cORSRule.setId(null);
            }
            if (jSONObject.has(d)) {
                cORSRule.setAllowedOrigin(jSONObject.getString(d));
            } else {
                cORSRule.setAllowedOrigin(null);
            }
            return cORSRule;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CORSRule cORSRule = (CORSRule) obj;
            String str = this.b;
            if (str == null ? cORSRule.b != null : !str.equals(cORSRule.b)) {
                return false;
            }
            String str2 = this.a;
            return str2 == null ? cORSRule.a == null : str2.equals(cORSRule.a);
        }

        public String getAllowedOrigin() {
            return this.a;
        }

        public String getId() {
            return this.b;
        }

        public void setAllowedOrigin(String str) {
            this.a = str;
        }

        public void setId(String str) {
            this.b = str;
        }

        public String toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            String str = this.b;
            if (str != null) {
                jSONObject.put("id", str);
            }
            String str2 = this.a;
            if (str2 != null) {
                jSONObject.put(d, str2);
            }
            return jSONObject.toString();
        }

        public CORSRule(String str) {
            this.a = str;
        }

        public CORSRule(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    private String a() {
        int i = 1;
        while (this.a.containsKey(String.valueOf(i))) {
            i++;
        }
        return String.valueOf(i);
    }

    public static CORSConfiguration fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        CORSConfiguration cORSConfiguration = new CORSConfiguration();
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(c);
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(CORSRule.fromJson(jSONArray.getString(i)));
        }
        cORSConfiguration.setRuleList(arrayList);
        return cORSConfiguration;
    }

    public void addOrUpdateRule(CORSRule cORSRule) {
        CORSRule cORSRuleCopy = CORSRule.copy(cORSRule);
        if (cORSRuleCopy == null) {
            return;
        }
        if (Strings.isNullOrEmpty(cORSRuleCopy.getId())) {
            cORSRuleCopy.setId(a());
        }
        if (this.a.get(cORSRuleCopy.getId()) != null) {
            this.b.remove(this.a.get(cORSRuleCopy.getId()).getAllowedOrigin());
        }
        this.b.add(cORSRuleCopy.getAllowedOrigin());
        this.a.put(cORSRuleCopy.getId(), cORSRuleCopy);
    }

    public void deleteRule(String str) {
        if (this.a.get(str) != null) {
            this.b.remove(this.a.get(str).getAllowedOrigin());
        }
        this.a.remove(str);
    }

    public List<String> getAllowOriginList() {
        return this.b;
    }

    public CORSRule getRuleById(String str) {
        return this.a.get(str);
    }

    public Collection<CORSRule> getRuleList() {
        return this.a.values();
    }

    public void setRuleList(Collection<CORSRule> collection) {
        this.a.clear();
        for (CORSRule cORSRule : collection) {
            if (Strings.isNullOrEmpty(cORSRule.getId())) {
                cORSRule.setId(a());
            }
            this.a.put(cORSRule.getId(), cORSRule);
        }
        Iterator<CORSRule> it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            this.b.add(it2.next().getAllowedOrigin());
        }
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<CORSRule> it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            jSONArray.put(new JSONObject(it2.next().toJson()));
        }
        jSONObject.put(c, jSONArray);
        return jSONObject.toString();
    }
}
