package com.huawei.hianalytics.visual;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hianalytics.framework.utils.JsonUtils;
import com.huawei.hianalytics.visual.view.model.config.VisualConfig;
import com.huawei.hihealth.dictionary.model.HealthDataMergePolicy;
import com.huawei.openalliance.ad.constant.Constants;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f11720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f11721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f11722c;
    public String d;

    public z0() {
        v0 v0Var = new v0();
        this.f11720a = v0Var;
        this.f11721b = v0Var.b();
        this.f11722c = v0Var.a();
        this.d = a();
    }

    public final String a() {
        VisualConfig.VisualEvent visualEvent;
        if (this.f11721b == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<VisualConfig> arrayList = this.f11721b;
            if (arrayList.isEmpty()) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (VisualConfig visualConfig : arrayList) {
                if (visualConfig.isH5 && (visualEvent = visualConfig.event) != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("os", visualConfig.os);
                    jSONObject2.put("packageName", visualConfig.packageName);
                    jSONObject2.put("version", visualConfig.version);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("eventName", visualEvent.eventName);
                    jSONObject3.put("eventType", visualEvent.eventType);
                    jSONObject3.put("isCollect", visualEvent.isCollect);
                    jSONObject3.put("limitViewPosition", visualEvent.limitViewPosition);
                    jSONObject3.put("limitViewContent", visualEvent.limitViewContent);
                    jSONObject3.put("url", visualEvent.url);
                    jSONObject3.put("viewContent", visualEvent.viewContent);
                    jSONObject3.put("viewPath", visualEvent.viewPath);
                    jSONObject3.put("viewPosition", visualEvent.viewPosition);
                    jSONObject2.put("event", jSONObject3);
                    List<VisualConfig.VisualProperty> list = visualConfig.property;
                    JSONArray jSONArray2 = new JSONArray();
                    if (list != null && !list.isEmpty()) {
                        for (VisualConfig.VisualProperty visualProperty : list) {
                            if (!TextUtils.equals(visualProperty.propertyType, "DYNAMIC_PROPERTY") || !TextUtils.isEmpty(visualProperty.viewPath)) {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("name", visualProperty.name);
                                jSONObject4.put("propertyType", visualProperty.propertyType);
                                jSONObject4.put("regular", visualProperty.regular);
                                jSONObject4.put("type", TextUtils.equals(visualProperty.type, "string") ? visualProperty.type : "number");
                                jSONObject4.put("viewContent", visualProperty.viewContent);
                                jSONObject4.put("viewPath", visualProperty.viewPath);
                                jSONArray2.put(jSONObject4);
                            }
                        }
                    }
                    jSONObject2.put(Event.EventConstants.PROPERTIES, jSONArray2);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(Event.EventConstants.EVENTS, jSONArray);
        } catch (JSONException e) {
            HiLog.w("RemoteConfigManager", "fail to merge visual page config, ex: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public final void b(Context context, HAAutoConfigOptions hAAutoConfigOptions) {
        try {
            String strA = b1.a(JsonUtils.createABReqDefaultJson(), a1.a(context, hAAutoConfigOptions), "POST");
            if (TextUtils.isEmpty(strA)) {
                HiLog.e("RemoteConfigManager", "fail to request remote config");
                return;
            }
            HiLog.d("RemoteConfigManager", "success to request remote config");
            this.f11720a.f11707a.a(strA);
            this.f11721b = this.f11720a.b();
            this.f11722c = this.f11720a.a();
            this.d = a();
        } catch (Throwable unused) {
            HiLog.e("RemoteConfigManager", "fail to request remote config");
        }
    }

    public final void a(final Context context, final HAAutoConfigOptions hAAutoConfigOptions) {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.z0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(context, hAAutoConfigOptions);
            }
        });
    }

    public static ArrayList a(ArrayList arrayList, String str, String str2, String str3, String str4, String str5) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            VisualConfig visualConfig = (VisualConfig) it.next();
            VisualConfig.VisualEvent visualEvent = visualConfig.event;
            if (visualEvent != null && TextUtils.equals(visualEvent.eventType, "VIEW_CLICK")) {
                String str6 = visualEvent.pageName;
                HashSet hashSet = i1.f11653a;
                if (str6 != null && str != null && (TextUtils.equals(str6, str) || (str6.contains("_") && TextUtils.equals(str6.substring(0, str6.indexOf("_")), str)))) {
                    if (!TextUtils.equals(visualEvent.viewPath, str2)) {
                        HiLog.i("RemoteConfigManager", "view_path is not match, view_path: " + str2 + ", config view_path: " + visualEvent.viewPath);
                    } else if (!TextUtils.equals(visualEvent.viewId, str5)) {
                        HiLog.i("RemoteConfigManager", "view_id is not match, view_id: " + str5 + ", config view_id: " + visualEvent.viewId);
                    } else if (visualEvent.limitViewPosition && !TextUtils.equals(visualEvent.viewPosition, str3)) {
                        HiLog.i("RemoteConfigManager", "view_position is not match, view_position: " + str3 + ", config view_position: " + visualEvent.viewPosition);
                    } else if (visualEvent.limitViewContent && !TextUtils.equals(visualEvent.viewContent, str4)) {
                        HiLog.i("RemoteConfigManager", "view_content is not match, view_content: " + str4 + ", config view_content: " + visualEvent.viewContent);
                    } else {
                        arrayList2.add(visualConfig);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143  */
    public static void a(VisualConfig.VisualEvent visualEvent, List list, JSONObject jSONObject, r1 r1Var) {
        String strA;
        View view;
        String str;
        String str2;
        Pattern patternCompile;
        Matcher matcher;
        a0 a0VarA = a0.a();
        a0VarA.f11619a.clear();
        a0VarA.f11620b.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VisualConfig.VisualProperty visualProperty = (VisualConfig.VisualProperty) it.next();
            if (TextUtils.isEmpty(visualProperty.name)) {
                HiLog.d("RemoteConfigManager", "the property name is empty");
            } else {
                String str3 = visualProperty.propertyType;
                String strGroup = "";
                if (TextUtils.equals(str3, "STATIC_PROPERTY")) {
                    a(jSONObject, visualProperty.type, visualProperty.name, visualProperty.viewContent, "");
                } else if (TextUtils.equals(str3, "DYNAMIC_PROPERTY")) {
                    if (TextUtils.isEmpty(visualProperty.viewPath)) {
                        HiLog.d("RemoteConfigManager", "the view node path is empty");
                    } else {
                        if (r1Var != null && !TextUtils.isEmpty(r1Var.g) && !TextUtils.isEmpty(visualEvent.viewPosition) && !TextUtils.isEmpty(visualProperty.viewPosition) && TextUtils.equals(visualEvent.viewPath.split(Constants.LINK)[0], visualProperty.viewPath.split(Constants.LINK)[0])) {
                            visualProperty.viewPosition = r1Var.g;
                        }
                        if (r1Var == null) {
                            view = null;
                        } else {
                            try {
                                WeakReference weakReference = r1Var.f11689a;
                                if (weakReference == null) {
                                    view = null;
                                } else {
                                    view = (View) weakReference.get();
                                }
                            } catch (Exception unused) {
                                strA = "";
                                str = "";
                                str2 = str;
                                HiLog.w("RemoteConfigManager", "fail to get view property content");
                                if (TextUtils.equals("NUMBER_ONLY", visualProperty.regular)) {
                                    if (TextUtils.equals("int", visualProperty.type)) {
                                        patternCompile = Pattern.compile("[-|0-9]+", 40);
                                    } else {
                                        patternCompile = Pattern.compile("[0-9]+([.]{1}[0-9]+){0,1}", 40);
                                    }
                                    matcher = patternCompile.matcher(str);
                                    if (matcher.find()) {
                                        strGroup = matcher.group();
                                    }
                                } else if (TextUtils.equals(HealthDataMergePolicy.NONE, visualProperty.regular)) {
                                    strGroup = strA;
                                }
                                a(jSONObject, visualProperty.type, visualProperty.name, strGroup, str2);
                            }
                        }
                        r1 r1VarA = a0.a().a(view, visualProperty.viewPath, visualProperty.viewPosition, visualProperty.getPageName());
                        if (r1VarA != null && TextUtils.equals(visualProperty.viewPath, r1VarA.e) && (TextUtils.isEmpty(visualProperty.viewPosition) || TextUtils.equals(visualProperty.viewPosition, r1VarA.g))) {
                            strA = v1.a(r1VarA.d);
                            try {
                                str = r1VarA.d;
                                try {
                                    str2 = r1VarA.i;
                                    try {
                                        WeakReference weakReference2 = r1VarA.f11689a;
                                        if (weakReference2 != null && weakReference2.get() != null) {
                                            r1 r1VarD = v1.d((View) r1VarA.f11689a.get());
                                            strA = v1.a(r1VarD.d);
                                            str = r1VarD.d;
                                            str2 = r1VarD.i;
                                        }
                                    } catch (Exception unused2) {
                                        HiLog.w("RemoteConfigManager", "fail to get view property content");
                                    }
                                } catch (Exception unused3) {
                                    str2 = "";
                                }
                            } catch (Exception unused4) {
                                str = "";
                                str2 = str;
                                HiLog.w("RemoteConfigManager", "fail to get view property content");
                                if (TextUtils.equals("NUMBER_ONLY", visualProperty.regular)) {
                                    if (TextUtils.equals("int", visualProperty.type)) {
                                        patternCompile = Pattern.compile("[-|0-9]+", 40);
                                    } else {
                                        patternCompile = Pattern.compile("[0-9]+([.]{1}[0-9]+){0,1}", 40);
                                    }
                                    matcher = patternCompile.matcher(str);
                                    if (matcher.find()) {
                                        strGroup = matcher.group();
                                    }
                                } else if (TextUtils.equals(HealthDataMergePolicy.NONE, visualProperty.regular)) {
                                    strGroup = strA;
                                }
                                a(jSONObject, visualProperty.type, visualProperty.name, strGroup, str2);
                            }
                        } else {
                            strA = "";
                            str = strA;
                            str2 = str;
                        }
                        if (TextUtils.equals("NUMBER_ONLY", visualProperty.regular)) {
                            if (TextUtils.equals("int", visualProperty.type)) {
                                patternCompile = Pattern.compile("[-|0-9]+", 40);
                            } else {
                                patternCompile = Pattern.compile("[0-9]+([.]{1}[0-9]+){0,1}", 40);
                            }
                            matcher = patternCompile.matcher(str);
                            if (matcher.find()) {
                                strGroup = matcher.group();
                            }
                        } else if (TextUtils.equals(HealthDataMergePolicy.NONE, visualProperty.regular)) {
                            strGroup = strA;
                        }
                        a(jSONObject, visualProperty.type, visualProperty.name, strGroup, str2);
                    }
                }
            }
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("$custom_property");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            boolean zIsEmpty = TextUtils.isEmpty(str3);
            if (!zIsEmpty && (TextUtils.equals("int", str) || TextUtils.equals("float", str))) {
                jSONObjectOptJSONObject.put(str2, NumberFormat.getInstance(Locale.US).parse(str3));
            } else if (!zIsEmpty && TextUtils.equals("string", str)) {
                jSONObjectOptJSONObject.put(str2, str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObjectOptJSONObject.put("$view_checked", str4);
            }
            jSONObject.put("$custom_property", jSONObjectOptJSONObject);
        } catch (Exception unused) {
            HiLog.w("RemoteConfigManager", "fail to add property to click event");
        }
    }
}
