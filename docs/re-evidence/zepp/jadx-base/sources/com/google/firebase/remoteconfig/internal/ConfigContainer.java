package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigContainer {
    public static final String f = "configs_key";
    public static final String g = "fetch_time_key";
    public static final String h = "abt_experiments_key";
    public static final String i = "personalization_metadata_key";
    private static final Date j = new Date(0);
    private JSONObject a;
    private JSONObject b;
    private Date c;
    private JSONArray d;
    private JSONObject e;

    public static class Builder {
        private JSONObject a;
        private Date b;
        private JSONArray c;
        private JSONObject d;

        public ConfigContainer build() throws JSONException {
            return new ConfigContainer(this.a, this.b, this.c, this.d);
        }

        public Builder replaceConfigsWith(Map<String, String> map) {
            this.a = new JSONObject(map);
            return this;
        }

        public Builder withAbtExperiments(JSONArray jSONArray) {
            try {
                this.c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder withFetchTime(Date date) {
            this.b = date;
            return this;
        }

        public Builder withPersonalizationMetadata(JSONObject jSONObject) {
            try {
                this.d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        private Builder() {
            this.a = new JSONObject();
            this.b = ConfigContainer.j;
            this.c = new JSONArray();
            this.d = new JSONObject();
        }

        public Builder replaceConfigsWith(JSONObject jSONObject) {
            try {
                this.a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder(ConfigContainer configContainer) {
            this.a = configContainer.getConfigs();
            this.b = configContainer.getFetchTime();
            this.c = configContainer.getAbtExperiments();
            this.d = configContainer.getPersonalizationMetadata();
        }
    }

    public static ConfigContainer b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(i);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return new ConfigContainer(jSONObject.getJSONObject(f), new Date(jSONObject.getLong(g)), jSONObject.getJSONArray(h), jSONObjectOptJSONObject);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfigContainer) {
            return this.a.toString().equals(((ConfigContainer) obj).toString());
        }
        return false;
    }

    public JSONArray getAbtExperiments() {
        return this.d;
    }

    public JSONObject getConfigs() {
        return this.b;
    }

    public Date getFetchTime() {
        return this.c;
    }

    public JSONObject getPersonalizationMetadata() {
        return this.e;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    private ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f, jSONObject);
        jSONObject3.put(g, date.getTime());
        jSONObject3.put(h, jSONArray);
        jSONObject3.put(i, jSONObject2);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.a = jSONObject3;
    }

    public static Builder newBuilder(ConfigContainer configContainer) {
        return new Builder(configContainer);
    }
}
