package com.huawei.watchface;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.util.Pair;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.analytice.data.BaseEvent;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import com.tencent.connect.common.Constants;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class i extends BaseEvent {
    public static final String[] r = {"resultCode", "resultcode"};
    public static final String[] s = {"resultInfo", "resultinfo"};
    public static final String[] t = {HwPayConstant.KEY_SIGN, WatchFaceConstant.X_SIGN};
    public Class g;
    public String h;
    public String i;
    public String j;
    public Map l;
    public LinkedHashMap m;
    public String n;
    public String p;
    public String q;
    public StringBuilder k = new StringBuilder();
    public StringBuilder o = new StringBuilder();

    @Override // com.huawei.watchface.s3
    public String a() {
        return "WATCHFACE_INTERFACE";
    }

    @Override // com.huawei.watchface.s3
    public LinkedHashMap b() {
        return k();
    }

    public final void c(LinkedHashMap linkedHashMap) {
        String path;
        String authorityByUri;
        String scheme;
        if (TextUtils.isEmpty(this.h)) {
            return;
        }
        Uri uri = Uri.parse(this.h);
        String query = uri.getQuery();
        if (uri.isOpaque()) {
            path = "";
            authorityByUri = path;
            scheme = authorityByUri;
        } else {
            authorityByUri = CommonUtils.getAuthorityByUri(uri);
            scheme = uri.getScheme();
            path = uri.getPath();
        }
        String strB = q2.b(this.l, "server_ip", "");
        if (TextUtils.isEmpty(strB)) {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(x2.a(this.h + this.i));
                StringBuilder sb = new StringBuilder("get all ips=");
                sb.append(Arrays.toString(allByName));
                FlavorConfig.safeHwLog("AnalyticsInterfaceEvent", sb.toString());
                InetAddress inetAddress = (InetAddress) ArrayUtils.a(allByName, 0);
                strB = inetAddress != null ? inetAddress.getHostAddress() : "UnknownHost";
            } catch (NullPointerException | UnknownHostException unused) {
            }
        }
        linkedHashMap.put("server_ip", strB);
        linkedHashMap.put("protocal", scheme);
        linkedHashMap.put("url", authorityByUri);
        linkedHashMap.put("interface_name", path);
        a(query, linkedHashMap, "urlParams:");
    }

    public i d(String str) {
        if (this.o == null) {
            this.o = new StringBuilder();
        }
        if (!TextUtils.isEmpty(this.o)) {
            this.o.append('|');
        }
        this.o.append(str);
        return this;
    }

    public i e(String str) {
        if (this.k == null) {
            this.k = new StringBuilder();
        }
        if (!TextUtils.isEmpty(this.k)) {
            this.k.append('|');
        }
        this.k.append(str);
        return this;
    }

    public void f(String str) {
        this.j = str;
    }

    public void g(String str) {
        this.i = str;
    }

    public void h(String str) {
        this.h = str;
    }

    public final LinkedHashMap k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            c(linkedHashMap);
            a(linkedHashMap);
            a(this.i, linkedHashMap, "bodyParams:");
            b(linkedHashMap);
        } catch (Exception e) {
            HwLog.e("AnalyticsInterfaceEvent", "convertData e" + HwLog.printException(e));
        }
        linkedHashMap.put("totalTime", String.valueOf(this.f30618b - this.f30617a));
        linkedHashMap.put("startts", this.f30617a + "");
        linkedHashMap.put("endts", this.f30618b + "");
        StringBuilder sb = this.o;
        linkedHashMap.put(BaseEvent.KEY_DESCINFO, sb == null ? "" : CommonUtils.d(sb.toString()));
        StringBuilder sb2 = this.k;
        linkedHashMap.put("request", sb2 != null ? sb2.toString() : "");
        linkedHashMap.put("request_engine", q2.b(this.l, "request_engine", "url_connection"));
        linkedHashMap.put("report_app_version", CommonUtils.getVersionCode() + "|" + CommonUtils.c());
        return linkedHashMap;
    }

    public i l() {
        this.f30617a = SystemClock.elapsedRealtime();
        return this;
    }

    public i m() {
        this.f30618b = SystemClock.elapsedRealtime();
        return this;
    }

    public final String[] n() {
        return (String[]) r.clone();
    }

    public final String[] o() {
        return (String[]) s.clone();
    }

    public void a(Map map) {
        this.l = map;
    }

    public void b(Class cls) {
        this.g = cls;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0159  */
    /* JADX WARN: Code duplicated, block: B:51:0x015d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0190  */
    /* JADX WARN: Code duplicated, block: B:61:0x019d A[LOOP:0: B:57:0x018e->B:61:0x019d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x019a A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x015d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(LinkedHashMap linkedHashMap) {
        String strA;
        String str;
        String str2;
        Pair pairA;
        Class cls = this.g;
        StringBuilder sb = new StringBuilder();
        if ("no network".equals(this.j)) {
            this.p = "-100";
        } else {
            if (!TextUtils.isEmpty(this.j)) {
                try {
                    JSONObject jSONObject = new JSONObject(this.j);
                    String str3 = "";
                    if (cls.isAnnotationPresent(ReportPolicy.class)) {
                        ReportPolicy reportPolicy = (ReportPolicy) cls.getAnnotation(ReportPolicy.class);
                        this.p = a(reportPolicy.resultCodeKeys(), jSONObject);
                        strA = a(reportPolicy.resultInfoKeys(), jSONObject);
                        d0[] d0VarArrCollectedFields = reportPolicy.collectedFields();
                        if (!ArrayUtils.isEmpty(d0VarArrCollectedFields)) {
                            int length = d0VarArrCollectedFields.length;
                            int i = 0;
                            while (i < length) {
                                d0 d0Var = d0VarArrCollectedFields[i];
                                String strName = d0Var.name();
                                String strA2 = a(d0Var, jSONObject);
                                if (!TextUtils.isEmpty(strA2)) {
                                    sb.append((d0Var.name() + ':' + strA2) + ",");
                                }
                                i++;
                                str3 = strName;
                            }
                        }
                        if (reportPolicy.collectResponse()) {
                            d(this.j);
                        }
                    } else {
                        this.p = a(n(), jSONObject);
                        strA = a(o(), jSONObject);
                    }
                    if (!TextUtils.equals(this.p, "0") && !TextUtils.equals(this.p, "00000")) {
                        linkedHashMap.put("response", this.j);
                    } else {
                        linkedHashMap.put("response", sb.toString());
                    }
                    if (TextUtils.equals(str3, "resultCollectAll")) {
                        linkedHashMap.put("response", this.j);
                    }
                    if (TextUtils.isEmpty(this.p)) {
                        this.p = "-103";
                    }
                    d(TextUtils.isEmpty(strA) ? "no result info key" : "resultInfo is:" + strA);
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("list");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        str = "0";
                    }
                } catch (JSONException e) {
                    this.p = "-102";
                    d(e.getMessage());
                    HwLog.e("AnalyticsInterfaceEvent", "processJsonData--Exception:" + HwLog.printException((Exception) e));
                }
                if (TextUtils.isEmpty(this.p)) {
                    str2 = "no result code key";
                } else {
                    str2 = "resultCode is:" + this.p;
                }
                d(str2);
                pairA = a(cls);
                if (((Boolean) pairA.first).booleanValue() && !ArrayUtils.isEmpty((String[]) pairA.second)) {
                    for (String str4 : (String[]) pairA.second) {
                        if (this.p.equals(str4)) {
                            this.p = "0";
                            break;
                        }
                    }
                }
                linkedHashMap.put("errorCode", this.p);
                linkedHashMap.put("isListEmpty", str);
            }
            this.p = "-101";
        }
        str = "1";
        if (TextUtils.isEmpty(this.p)) {
            str2 = "no result code key";
        } else {
            str2 = "resultCode is:" + this.p;
        }
        d(str2);
        pairA = a(cls);
        if (((Boolean) pairA.first).booleanValue()) {
            while (i < r2) {
                if (this.p.equals(str4)) {
                    this.p = "0";
                    break;
                }
            }
        }
        linkedHashMap.put("errorCode", this.p);
        linkedHashMap.put("isListEmpty", str);
    }

    public final void a(LinkedHashMap linkedHashMap) {
        String str;
        d0[] d0VarArrCollectedHeaders;
        String[] strArrExcludedCollectedHeaders;
        LinkedHashMap linkedHashMap2 = this.m;
        if (linkedHashMap2 == null) {
            str = "empty";
        } else {
            if (linkedHashMap2.containsKey("x-intfpath")) {
                str = (String) this.m.get("x-intfpath");
            } else {
                str = "no key";
            }
            if (this.m.containsKey(WatchFaceConstant.X_CLIENTTRACEID)) {
                this.n = (String) this.m.get(WatchFaceConstant.X_CLIENTTRACEID);
            }
            Class cls = this.g;
            if (cls.isAnnotationPresent(ReportPolicy.class)) {
                ReportPolicy reportPolicy = (ReportPolicy) cls.getAnnotation(ReportPolicy.class);
                d0VarArrCollectedHeaders = reportPolicy.collectedHeaders();
                strArrExcludedCollectedHeaders = reportPolicy.excludedCollectedHeaders();
            } else {
                d0VarArrCollectedHeaders = null;
                strArrExcludedCollectedHeaders = null;
            }
            if (!ArrayUtils.isEmpty(d0VarArrCollectedHeaders)) {
                for (d0 d0Var : d0VarArrCollectedHeaders) {
                    if (this.m.containsKey(d0Var.name())) {
                        d(d0Var.name() + ':' + (d0Var.needAnony() ? p3.b((String) this.m.get(d0Var.name())) : (String) this.m.get(d0Var.name())));
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : this.m.entrySet()) {
                if (ArrayUtils.b(strArrExcludedCollectedHeaders, (String) entry.getKey())) {
                    sb.append(((String) entry.getKey()) + ':' + a((String) entry.getKey(), (String) entry.getValue()) + ",");
                } else {
                    sb.append(((String) entry.getKey()) + ':' + ((String) entry.getValue()) + ",");
                }
            }
            e("headerParams:" + ((Object) sb));
        }
        linkedHashMap.put("trace_id", this.n);
        linkedHashMap.put("x-intfpath", str);
        HwLog.i("AnalyticsInterfaceEvent", "clzName: " + this.g.getName() + " traceId: " + this.n);
    }

    public void d(LinkedHashMap linkedHashMap) {
        this.m = linkedHashMap;
    }

    public final String a(String str, String str2) {
        if (ArrayUtils.b(t, str)) {
            return p3.a(str2);
        }
        return p3.b(str2);
    }

    public final void a(String str, LinkedHashMap linkedHashMap, String str2) {
        d0[] d0VarArrCollectedParams;
        String[] strArrExcludedParams;
        String[] strArr;
        String string;
        boolean z;
        String string2 = str;
        Class cls = this.g;
        if (!TextUtils.isEmpty(str)) {
            if (cls.isAnnotationPresent(ReportPolicy.class)) {
                ReportPolicy reportPolicy = (ReportPolicy) cls.getAnnotation(ReportPolicy.class);
                d0VarArrCollectedParams = reportPolicy.collectedParams();
                strArrExcludedParams = reportPolicy.excludedParams();
            } else {
                d0VarArrCollectedParams = new d0[0];
                strArrExcludedParams = new String[]{"userToken", HwPayConstant.KEY_RESERVEDINFOR, "licenseReq", "authCode", "deviceId", "userRefreshToken", Constants.PARAM_ACCESS_TOKEN, HwPayConstant.KEY_SIGN, "phoneId", "publicKey", "watchDeviceInfo-deviceId"};
            }
            if (ArrayUtils.isEmpty(d0VarArrCollectedParams)) {
                strArr = null;
            } else {
                strArr = new String[d0VarArrCollectedParams.length];
                for (int i = 0; i < d0VarArrCollectedParams.length; i++) {
                    strArr[i] = d0VarArrCollectedParams[i].name();
                }
            }
            Matcher matcher = e3.f30130a.matcher(string2);
            if (matcher.groupCount() > 1) {
                StringBuffer stringBuffer = new StringBuffer();
                z = false;
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (RecommendConstants.VER.equalsIgnoreCase(strGroup)) {
                        this.q = strGroup2;
                    }
                    if (ArrayUtils.a(strGroup, strArr)) {
                        linkedHashMap.put(strGroup, strGroup2);
                    }
                    String strGroup3 = matcher.group();
                    if (!TextUtils.isEmpty(strGroup3)) {
                        if (ArrayUtils.a(strGroup, strArrExcludedParams)) {
                            strGroup3 = strGroup + '=' + a(strGroup, strGroup2);
                        }
                        matcher.appendReplacement(stringBuffer, strGroup3);
                    }
                    z = true;
                }
                string = stringBuffer.toString();
            } else {
                string = string2;
                z = false;
            }
            if (z) {
                string2 = string;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(string2);
                    this.q = jSONObject.optString(RecommendConstants.VER);
                    if (!ArrayUtils.isEmpty(d0VarArrCollectedParams)) {
                        for (d0 d0Var : d0VarArrCollectedParams) {
                            String strOptString = jSONObject.optString(d0Var.name());
                            if (!TextUtils.isEmpty(strOptString)) {
                                linkedHashMap.put(d0Var.name(), strOptString);
                            }
                        }
                    }
                    if (!ArrayUtils.isEmpty(strArrExcludedParams)) {
                        for (String str3 : strArrExcludedParams) {
                            a(str3, jSONObject);
                        }
                    }
                    string2 = jSONObject.toString();
                } catch (JSONException e) {
                    HwLog.i("AnalyticsInterfaceEvent", cls.getName() + " processUrlParams:" + HwLog.printException((Exception) e));
                    string2 = string;
                }
            }
        }
        e(str2 + string2);
    }

    public final void a(String str, JSONObject jSONObject) throws JSONException {
        if (str.contains(com.huawei.openalliance.ad.constant.Constants.LINK)) {
            String[] strArrSplit = str.split(com.huawei.openalliance.ad.constant.Constants.LINK);
            String str2 = strArrSplit[0];
            String strOptString = jSONObject.optString(str2);
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject(strOptString);
            String str3 = strArrSplit[1];
            String strOptString2 = jSONObject2.optString(str3);
            if (!TextUtils.isEmpty(strOptString2)) {
                jSONObject2.put(str3, a(str3, strOptString2));
            }
            jSONObject.put(str2, jSONObject2);
            return;
        }
        String strOptString3 = jSONObject.optString(str);
        if (TextUtils.isEmpty(strOptString3)) {
            return;
        }
        jSONObject.put(str, a(str, strOptString3));
    }

    public final String a(d0 d0Var, JSONObject jSONObject) {
        if (d0Var != null && jSONObject != null) {
            String strName = d0Var.name();
            if (TextUtils.isEmpty(strName)) {
                HwLog.i("AnalyticsInterfaceEvent", "getFieldVal name is empty or object is null");
                return "";
            }
            try {
                if (!strName.contains(com.huawei.openalliance.ad.constant.Constants.LINK)) {
                    String strOptString = jSONObject.optString(strName);
                    return d0Var.needAnony() ? a(strName, strOptString) : strOptString;
                }
                String[] strArrSplit = strName.split(com.huawei.openalliance.ad.constant.Constants.LINK);
                Object objOpt = jSONObject.opt(strArrSplit[0]);
                if (objOpt == null) {
                    HwLog.i("AnalyticsInterfaceEvent", "getFieldVal temp is null");
                    return "";
                }
                if (objOpt instanceof JSONArray) {
                    return a((JSONArray) objOpt, strArrSplit, d0Var.needAnony());
                }
                if (objOpt instanceof JSONObject) {
                    return a((JSONObject) objOpt, strArrSplit, d0Var.needAnony());
                }
                return "";
            } catch (JSONException e) {
                HwLog.e("AnalyticsInterfaceEvent", "getFieldVal JSONException:" + HwLog.printException((Exception) e));
            } catch (Exception e2) {
                HwLog.e("AnalyticsInterfaceEvent", "getFieldVal Exception:" + HwLog.printException(e2));
            }
        } else {
            HwLog.i("AnalyticsInterfaceEvent", "getFieldVal clField or object is null");
            return "";
        }
    }

    public final String a(JSONObject jSONObject, String[] strArr, boolean z) throws JSONException {
        if (jSONObject == null) {
            HwLog.i("AnalyticsInterfaceEvent", "getFieldObjString tmpObj is null");
            return "";
        }
        JSONObject jSONObject2 = new JSONObject();
        for (int i = 1; i < strArr.length; i++) {
            String str = strArr[i];
            String strA = null;
            if (i == strArr.length - 1) {
                if (jSONObject != null) {
                    strA = z ? a(str, jSONObject.optString(str)) : jSONObject.optString(str);
                }
                jSONObject2.put(str, strA);
            } else {
                jSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
            }
        }
        return jSONObject2.toString();
    }

    public final String a(JSONArray jSONArray, String[] strArr, boolean z) throws JSONException {
        if (jSONArray == null) {
            HwLog.i("AnalyticsInterfaceEvent", "getFieldArrayString temp is null");
            return "";
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = new JSONObject();
            String[] strArrSplit = strArr[1].split(",");
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                for (String str : strArrSplit) {
                    jSONObject.put(str, z ? a(str, String.valueOf(jSONObjectOptJSONObject.opt(str))) : jSONObjectOptJSONObject.opt(str));
                }
                jSONArray2.put(jSONObject);
            }
        }
        return jSONArray2.toString();
    }

    public final Pair a(Class cls) {
        if (cls == null) {
            return new Pair(Boolean.FALSE, null);
        }
        if (!cls.isAnnotationPresent(u3.class)) {
            return new Pair(Boolean.FALSE, null);
        }
        return new Pair(Boolean.TRUE, ((u3) Objects.requireNonNull((u3) cls.getAnnotation(u3.class))).successFlags());
    }

    public final String a(String[] strArr, JSONObject jSONObject) {
        String strOptString = "";
        if (!ArrayUtils.isEmpty(strArr) && jSONObject != null) {
            for (String str : strArr) {
                if (!str.contains(com.huawei.openalliance.ad.constant.Constants.LINK)) {
                    strOptString = jSONObject.optString(str);
                } else {
                    String[] strArrSplit = str.split(com.huawei.openalliance.ad.constant.Constants.LINK);
                    if (ArrayUtils.a(strArrSplit) == 2) {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strArrSplit[0]);
                        if (jSONObjectOptJSONObject != null) {
                            strOptString = jSONObjectOptJSONObject.optString(strArrSplit[1]);
                        }
                    } else {
                        continue;
                    }
                }
                if (!TextUtils.isEmpty(strOptString)) {
                    return strOptString;
                }
            }
            return strOptString;
        }
        HwLog.i("AnalyticsInterfaceEvent", "getFieldVal filedKeys is empty or object is null");
        return "";
    }
}
