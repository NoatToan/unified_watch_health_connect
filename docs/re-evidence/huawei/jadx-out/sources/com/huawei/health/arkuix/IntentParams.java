package com.huawei.health.arkuix;

import android.icu.text.NumberingSystem;
import android.icu.util.ULocale;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import defpackage.peh;
import defpackage.pjn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class IntentParams {
    private static final String PARAMS = "params";
    private static final String TAG = "IntentParams";
    private Map<String, Object> params;

    public IntentParams(List<Builder.PageInfo> list) {
        HashMap map = new HashMap();
        this.params = map;
        map.put("params", list);
    }

    public String toString() {
        return peh.c(this.params);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(String str) {
        Builder builder = new Builder();
        if (str != null && !str.isEmpty()) {
            try {
                builder.infos = (List) new Gson().fromJson(new JSONObject(str).getJSONArray("params").toString(), new TypeToken<List<Builder.PageInfo>>() { // from class: com.huawei.health.arkuix.IntentParams.1
                }.getType());
                return builder;
            } catch (JSONException unused) {
                LogUtil.e(TAG, "JsonSyntaxException");
            }
        }
        return builder;
    }

    public static class Builder {
        private List<PageInfo> infos = new ArrayList();

        public Builder addDataProcessDelay(int i) {
            this.infos.add(new PageInfo("dataProcessDelay", 5, String.valueOf(i)));
            return this;
        }

        public Builder addPageType(String str) {
            this.infos.add(new PageInfo(CommonUtil.PAGE_TYPE, 5, str));
            return this;
        }

        public Builder addPageId(String str) {
            this.infos.add(new PageInfo("barType", 10, "button"));
            if ("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && !TextUtils.isEmpty(Build.MODEL) && (Build.MODEL.toLowerCase(Locale.ENGLISH).startsWith("zuy") || Build.MODEL.toLowerCase(Locale.ENGLISH).startsWith("blk"))) {
                this.infos.add(new PageInfo("bridgeFirst", 10, "1"));
            }
            this.infos.add(new PageInfo("pageId", 10, str));
            this.infos.add(new PageInfo("numberingSystem", 10, NumberingSystem.getInstance(ULocale.getDefault()).getName()));
            this.infos.add(new PageInfo("language", 10, pjn.b(null)));
            return this;
        }

        public Builder addTimeStamp(String str) {
            this.infos.add(new PageInfo("timeStamp", 9, str));
            return this;
        }

        public Builder addRecord(String str) {
            this.infos.add(new PageInfo("record", 10, str));
            return this;
        }

        public Builder addBuildConfigInfo(String str) {
            this.infos.add(new PageInfo("buildConfigInfo", 10, str));
            return this;
        }

        public Builder addOrderCode(String str) {
            this.infos.add(new PageInfo("orderCode", 10, str));
            return this;
        }

        public Builder addBiFrom(String str, String str2, String str3) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(WebViewHelp.BI_KEY_PULL_FROM, str);
                jSONObject.put("resourceName", str2);
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("pullOrder", str3);
                }
                this.infos.add(new PageInfo("biFrom", 10, jSONObject.toString()));
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder addInfo(String str, int i, String str2) {
            this.infos.add(new PageInfo(str, i, str2));
            return this;
        }

        public IntentParams build() {
            return new IntentParams(this.infos);
        }

        /* JADX INFO: loaded from: classes6.dex */
        class PageInfo {
            private String key;
            private int type;
            private String value;

            public PageInfo(String str, int i, String str2) {
                this.key = str;
                this.type = i;
                this.value = str2;
            }
        }
    }
}
