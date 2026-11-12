package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.view.model.config.VisualConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f11632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f11633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11634c;
    public final /* synthetic */ f0 d;

    public e0(f0 f0Var, JSONObject jSONObject, r1 r1Var, String str) {
        this.d = f0Var;
        this.f11632a = jSONObject;
        this.f11633b = r1Var;
        this.f11634c = str;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x022b A[Catch: Exception -> 0x0250, TryCatch #0 {Exception -> 0x0250, blocks: (B:77:0x01a0, B:80:0x01ac, B:82:0x01bb, B:85:0x01cb, B:88:0x01d1, B:91:0x01d9, B:92:0x01e2, B:94:0x01e8, B:97:0x01fb, B:101:0x0204, B:108:0x0220, B:104:0x020b, B:106:0x0211, B:110:0x0225, B:112:0x022b, B:113:0x0231, B:114:0x0235, B:116:0x023b), top: B:188:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0231 A[Catch: Exception -> 0x0250, TryCatch #0 {Exception -> 0x0250, blocks: (B:77:0x01a0, B:80:0x01ac, B:82:0x01bb, B:85:0x01cb, B:88:0x01d1, B:91:0x01d9, B:92:0x01e2, B:94:0x01e8, B:97:0x01fb, B:101:0x0204, B:108:0x0220, B:104:0x020b, B:106:0x0211, B:110:0x0225, B:112:0x022b, B:113:0x0231, B:114:0x0235, B:116:0x023b), top: B:188:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x023b A[Catch: Exception -> 0x0250, LOOP:2: B:114:0x0235->B:116:0x023b, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x0250, blocks: (B:77:0x01a0, B:80:0x01ac, B:82:0x01bb, B:85:0x01cb, B:88:0x01d1, B:91:0x01d9, B:92:0x01e2, B:94:0x01e8, B:97:0x01fb, B:101:0x0204, B:108:0x0220, B:104:0x020b, B:106:0x0211, B:110:0x0225, B:112:0x022b, B:113:0x0231, B:114:0x0235, B:116:0x023b), top: B:188:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0117 A[Catch: Exception -> 0x0189, TryCatch #2 {Exception -> 0x0189, blocks: (B:32:0x00ca, B:35:0x00d6, B:37:0x00da, B:39:0x00e0, B:42:0x00f8, B:44:0x0107, B:47:0x0117, B:50:0x011d, B:53:0x0125, B:55:0x0133, B:57:0x0139, B:59:0x0148, B:61:0x0156, B:62:0x015d, B:63:0x0161, B:65:0x0167, B:67:0x017e, B:70:0x0185), top: B:191:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:61:0x0156 A[Catch: Exception -> 0x0189, TryCatch #2 {Exception -> 0x0189, blocks: (B:32:0x00ca, B:35:0x00d6, B:37:0x00da, B:39:0x00e0, B:42:0x00f8, B:44:0x0107, B:47:0x0117, B:50:0x011d, B:53:0x0125, B:55:0x0133, B:57:0x0139, B:59:0x0148, B:61:0x0156, B:62:0x015d, B:63:0x0161, B:65:0x0167, B:67:0x017e, B:70:0x0185), top: B:191:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:62:0x015d A[Catch: Exception -> 0x0189, TryCatch #2 {Exception -> 0x0189, blocks: (B:32:0x00ca, B:35:0x00d6, B:37:0x00da, B:39:0x00e0, B:42:0x00f8, B:44:0x0107, B:47:0x0117, B:50:0x011d, B:53:0x0125, B:55:0x0133, B:57:0x0139, B:59:0x0148, B:61:0x0156, B:62:0x015d, B:63:0x0161, B:65:0x0167, B:67:0x017e, B:70:0x0185), top: B:191:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0167 A[Catch: Exception -> 0x0189, TryCatch #2 {Exception -> 0x0189, blocks: (B:32:0x00ca, B:35:0x00d6, B:37:0x00da, B:39:0x00e0, B:42:0x00f8, B:44:0x0107, B:47:0x0117, B:50:0x011d, B:53:0x0125, B:55:0x0133, B:57:0x0139, B:59:0x0148, B:61:0x0156, B:62:0x015d, B:63:0x0161, B:65:0x0167, B:67:0x017e, B:70:0x0185), top: B:191:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01cb A[Catch: Exception -> 0x0250, TryCatch #0 {Exception -> 0x0250, blocks: (B:77:0x01a0, B:80:0x01ac, B:82:0x01bb, B:85:0x01cb, B:88:0x01d1, B:91:0x01d9, B:92:0x01e2, B:94:0x01e8, B:97:0x01fb, B:101:0x0204, B:108:0x0220, B:104:0x020b, B:106:0x0211, B:110:0x0225, B:112:0x022b, B:113:0x0231, B:114:0x0235, B:116:0x023b), top: B:188:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01e8 A[Catch: Exception -> 0x0250, TryCatch #0 {Exception -> 0x0250, blocks: (B:77:0x01a0, B:80:0x01ac, B:82:0x01bb, B:85:0x01cb, B:88:0x01d1, B:91:0x01d9, B:92:0x01e2, B:94:0x01e8, B:97:0x01fb, B:101:0x0204, B:108:0x0220, B:104:0x020b, B:106:0x0211, B:110:0x0225, B:112:0x022b, B:113:0x0231, B:114:0x0235, B:116:0x023b), top: B:188:0x01a0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fb A[Catch: Exception -> 0x0250, TryCatch #0 {Exception -> 0x0250, blocks: (B:77:0x01a0, B:80:0x01ac, B:82:0x01bb, B:85:0x01cb, B:88:0x01d1, B:91:0x01d9, B:92:0x01e2, B:94:0x01e8, B:97:0x01fb, B:101:0x0204, B:108:0x0220, B:104:0x020b, B:106:0x0211, B:110:0x0225, B:112:0x022b, B:113:0x0231, B:114:0x0235, B:116:0x023b), top: B:188:0x01a0 }] */
    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        Context context;
        Activity activityA;
        ArrayList<VisualConfig> arrayList;
        ArrayList arrayList2;
        Iterator it;
        VisualConfig.VisualEvent visualEvent;
        String str;
        ArrayList arrayList3;
        WeakReference weakReference2;
        String strE;
        ArrayList<VisualConfig> arrayListA;
        VisualConfig.VisualEvent visualEvent2;
        List<VisualConfig.VisualProperty> list;
        View view;
        Context context2;
        JSONObject jSONObject = this.f11632a;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("$net_type", m0.b(this.d.f11639a));
            this.f11632a.put("$product_form", "APP");
            j0 j0Var = i0.f11652a;
            r1 r1Var = this.f11633b;
            if (r1Var == null) {
                j0Var.getClass();
            } else if (TextUtils.isEmpty(j0Var.f11655a.f11666a) && (view = (View) r1Var.f11689a.get()) != null && (context2 = view.getContext()) != null && (context2 instanceof Activity)) {
                j0Var.a((Activity) context2);
            }
            JSONObject jSONObject2 = this.f11632a;
            f1 f1Var = f1.f11642b;
            jSONObject2.put("$sessionid", f1Var.f11643a.f11635a);
            this.f11632a.put("$sessiontime", f1Var.f11643a.f11636b);
            this.f11632a.put("$invoker", j0Var.f11655a.f11666a);
            this.f11632a.put("$source_id", j0Var.f11655a.f11667b);
            this.f11632a.put("$channel_params", j0Var.f11655a.f11668c.toString());
        } catch (JSONException unused) {
            HiLog.w("HAAgentImpl", "onEvent put net type JSONException");
        }
        JSONObject jSONObject3 = this.d.j;
        if (jSONObject3 != null) {
            i1.a(jSONObject3, this.f11632a);
        }
        if (this.d.d.isVisualConfigEnabled()) {
            z0 z0Var = y0.f11716a;
            String str2 = this.f11634c;
            JSONObject jSONObject4 = this.f11632a;
            r1 r1Var2 = this.f11633b;
            z0Var.getClass();
            if (r1Var2 != null && TextUtils.equals(str2, "$ViewClick")) {
                try {
                    String strOptString = jSONObject4.optString("$page_name");
                    if (!TextUtils.isEmpty(strOptString)) {
                        WeakReference weakReference3 = r1Var2.f11689a;
                        Activity activityA2 = (weakReference3 == null || weakReference3.get() == null) ? null : o0.a(((View) weakReference3.get()).getContext(), (View) weakReference3.get());
                        if (activityA2 == null) {
                            m.a().getClass();
                            activityA2 = u.f11699c.b();
                        }
                        if (activityA2 == null) {
                            arrayList3 = z0Var.f11721b;
                            if (arrayList3 != null) {
                                String str3 = r1Var2.e;
                                String str4 = r1Var2.g;
                                String strA = v1.a(r1Var2.d);
                                weakReference2 = r1Var2.f11689a;
                                if (weakReference2 != null) {
                                    strE = "";
                                } else {
                                    strE = "";
                                }
                                arrayListA = z0.a(arrayList3, strOptString, str3, str4, strA, strE);
                                if (arrayListA.isEmpty()) {
                                    HiLog.i("RemoteConfigManager", "do not have any click event config");
                                } else {
                                    for (VisualConfig visualConfig : arrayListA) {
                                        visualEvent2 = visualConfig.event;
                                        jSONObject4.put("$event_name", visualEvent2.eventName);
                                        jSONObject4.put("$disable_collect", !visualEvent2.isCollect);
                                        list = visualConfig.property;
                                        if (list != null) {
                                            z0.a(visualEvent2, list, jSONObject4, r1Var2);
                                        }
                                    }
                                }
                            }
                        } else if (!w.a().h(activityA2.getClass())) {
                            arrayList3 = z0Var.f11721b;
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                String str5 = r1Var2.e;
                                String str6 = r1Var2.g;
                                String strA2 = v1.a(r1Var2.d);
                                weakReference2 = r1Var2.f11689a;
                                if (weakReference2 != null || weakReference2.get() == null) {
                                    strE = "";
                                } else {
                                    strE = v1.e((View) weakReference2.get());
                                }
                                arrayListA = z0.a(arrayList3, strOptString, str5, str6, strA2, strE);
                                if (arrayListA.isEmpty()) {
                                    HiLog.i("RemoteConfigManager", "do not have any click event config");
                                } else {
                                    while (r0.hasNext()) {
                                        visualEvent2 = visualConfig.event;
                                        jSONObject4.put("$event_name", visualEvent2.eventName);
                                        jSONObject4.put("$disable_collect", !visualEvent2.isCollect);
                                        list = visualConfig.property;
                                        if (list != null && !list.isEmpty()) {
                                            z0.a(visualEvent2, list, jSONObject4, r1Var2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused2) {
                    HiLog.w("RemoteConfigManager", "fail to merge visual click config");
                }
            } else if (TextUtils.equals(str2, "$AppViewScreen") || TextUtils.equals(str2, "$AppViewExit")) {
                try {
                    String strOptString2 = jSONObject4.optString("$page_name");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        m.a().getClass();
                        Activity activityB = u.f11699c.b();
                        if (activityB == null) {
                            arrayList = z0Var.f11721b;
                            if (arrayList != null) {
                                arrayList2 = new ArrayList();
                                for (VisualConfig visualConfig2 : arrayList) {
                                    visualEvent = visualConfig2.event;
                                    if (!TextUtils.equals(visualEvent.eventType, "SCREEN_VIEW")) {
                                        str = visualEvent.pageName;
                                        HashSet hashSet = i1.f11653a;
                                        if (str != null) {
                                            arrayList2.add(visualConfig2);
                                        }
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    HiLog.i("RemoteConfigManager", "do not have any page event config");
                                } else {
                                    it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        VisualConfig.VisualEvent visualEvent3 = ((VisualConfig) it.next()).event;
                                        jSONObject4.put("$event_name", visualEvent3.eventName);
                                        jSONObject4.put("$disable_collect", !visualEvent3.isCollect);
                                    }
                                }
                            }
                        } else if (!w.a().h(activityB.getClass())) {
                            arrayList = z0Var.f11721b;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList2 = new ArrayList();
                                while (r3.hasNext()) {
                                    visualEvent = visualConfig2.event;
                                    if (!TextUtils.equals(visualEvent.eventType, "SCREEN_VIEW")) {
                                        str = visualEvent.pageName;
                                        HashSet hashSet2 = i1.f11653a;
                                        if (str != null && strOptString2 != null && (TextUtils.equals(str, strOptString2) || (str.contains("_") && TextUtils.equals(str.substring(0, str.indexOf("_")), strOptString2)))) {
                                            arrayList2.add(visualConfig2);
                                        }
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    HiLog.i("RemoteConfigManager", "do not have any page event config");
                                } else {
                                    it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        VisualConfig.VisualEvent visualEvent4 = ((VisualConfig) it.next()).event;
                                        jSONObject4.put("$event_name", visualEvent4.eventName);
                                        jSONObject4.put("$disable_collect", !visualEvent4.isCollect);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    d0.a(e, new StringBuilder("fail to merge visual page config, ex: "), "RemoteConfigManager");
                }
            }
        }
        if (this.f11632a.optBoolean("$disable_collect")) {
            return;
        }
        if (this.d.f11641c == null) {
            HiLog.w("HAAgentImpl", "onEvent, HiAnalyticsAgentImpl auto instance is null");
            return;
        }
        this.f11632a.remove("$disable_collect");
        r1 r1Var3 = this.f11633b;
        if (r1Var3 != null && (weakReference = r1Var3.f11689a) != null) {
            JSONObject jSONObject5 = this.f11632a;
            View view2 = (View) weakReference.get();
            HashSet hashSet3 = i1.f11653a;
            HiLog.d("HAUtils", "mergeViewCustomTrace");
            if (jSONObject5 != null && view2 != null && (context = view2.getContext()) != null && (activityA = o0.a(context, view2)) != null) {
                JSONObject jSONObjectA = i1.a(t.a(view2, activityA));
                if (jSONObjectA == null) {
                    jSONObjectA = i1.a((Object) activityA);
                }
                if (jSONObjectA != null) {
                    i1.a(jSONObjectA, jSONObject5);
                }
            }
        }
        f0 f0Var = this.d;
        JSONObject jSONObject6 = this.f11632a;
        if (f0Var.m.size() > 0) {
            for (Map.Entry entry : f0Var.m.entrySet()) {
                if (entry.getValue() == null || ((Set) entry.getValue()).isEmpty()) {
                    jSONObject6.remove((String) entry.getKey());
                } else if (((Set) entry.getValue()).contains(jSONObject6.optString("$page_name"))) {
                    jSONObject6.remove((String) entry.getKey());
                }
            }
        }
        f0 f0Var2 = this.d;
        JSONObject jSONObject7 = this.f11632a;
        if (!f0Var2.n.isEmpty()) {
            String strOptString3 = jSONObject7.optString("$view_content", "");
            if (!TextUtils.isEmpty(strOptString3)) {
                for (Map.Entry entry2 : f0Var2.n.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry2.getKey()) && entry2.getValue() != null) {
                        strOptString3 = strOptString3.replaceAll((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                try {
                    jSONObject7.put("$view_content", strOptString3);
                } catch (JSONException e2) {
                    HiLog.e("HAAgentImpl", "desensitize content error: " + e2.getMessage());
                }
            }
        }
        HiLog.d("HAAgentImpl", "eventId: " + this.f11634c);
        f0 f0Var3 = this.d;
        if (f0Var3.k) {
            f0Var3.f11641c.onEvent(0, this.f11634c, this.f11632a);
        }
        f0 f0Var4 = this.d;
        if (f0Var4.l) {
            f0Var4.f11641c.onEvent(1, this.f11634c, this.f11632a);
        }
    }
}
