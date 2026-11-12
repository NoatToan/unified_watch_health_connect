package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hms.common.PackageConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 {
    public static final List u = Arrays.asList(PackageConstants.GENERAL_SERVICES_ACTION, "com.huawei.hwid.core");
    public static final List v = Arrays.asList("Analytics_Kit_Tag");
    public static volatile j1 w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11558a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11559b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11560c = 43200000;
    public int d = 30;
    public int e = 50;
    public int f = 50;
    public int g = com.huawei.hms.network.embedded.y.f15619c;
    public int h = 50;
    public int i = 512;
    public int j = 300;
    public String k = "";
    public boolean l = true;
    public boolean m = false;
    public long n = 600000;
    public String o = "";
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();

    public j1() {
        b();
    }

    public static j1 a() {
        if (w == null) {
            synchronized (j1.class) {
                if (w == null) {
                    w = new j1();
                }
            }
        }
        return w;
    }

    public final void b() {
        synchronized (this) {
            HiLog.d("MCC", "init");
            try {
                String strA = c2.a("kit_ha_metric_config", "mc_config");
                if (TextUtils.isEmpty(strA)) {
                    HiLog.d("MCC", "metric config is empty");
                    c();
                    return;
                }
                JSONObject jSONObject = new JSONObject(strA);
                boolean z = this.f11558a;
                boolean zOptBoolean = jSONObject.optBoolean("collectEnable", false);
                this.f11558a = zOptBoolean;
                if (zOptBoolean != z) {
                    f0.a(zOptBoolean);
                }
                this.f11559b = jSONObject.optInt("idFlag", 1);
                this.f11560c = jSONObject.optLong("reportInterval", 43200000L);
                this.d = jSONObject.optInt("randomBound", 30);
                this.g = jSONObject.optInt("minValidTime", com.huawei.hms.network.embedded.y.f15619c);
                this.e = jSONObject.optInt("totalCount", 50);
                this.f = jSONObject.optInt("batchSize", 50);
                this.h = jSONObject.optInt("titleLength", 50);
                this.i = jSONObject.optInt("artistLength", 512);
                this.j = jSONObject.optInt("albumLength", 300);
                this.k = jSONObject.optString("mepUrl", "");
                this.l = jSONObject.optBoolean("checkCollectUrl", true);
                this.m = jSONObject.optBoolean("isBluetoothOptimizeEnabled", false);
                this.n = jSONObject.optLong("delayCacheTimeV2", 600000L);
                ArrayList arrayListA = a("whiteProcess", jSONObject);
                if (!arrayListA.isEmpty()) {
                    a(arrayListA, this.q, false);
                }
                ArrayList arrayListA2 = a("whiteTag", jSONObject);
                if (!arrayListA2.isEmpty()) {
                    a(arrayListA2, this.r, false);
                }
                ArrayList arrayListA3 = a("whiteList", jSONObject);
                if (!arrayListA3.isEmpty()) {
                    a(arrayListA3, this.p, true);
                }
                ArrayList arrayListA4 = a("whiteTimeList", jSONObject);
                if (!arrayListA4.isEmpty()) {
                    a(arrayListA4, this.s, true);
                }
                ArrayList arrayListA5 = a("blackEventList", jSONObject);
                if (!arrayListA5.isEmpty()) {
                    a(arrayListA5, this.t, false);
                }
                this.o = c2.a("kit_ha_metric_config", "uuid");
            } catch (Throwable th) {
                HiLog.w("MCC", "init fail " + th.getMessage());
                c();
            }
        }
    }

    public final void c() {
        HiLog.d("MCC", "reset");
        this.f11558a = true;
        this.f11559b = 1;
        this.f11560c = 43200000L;
        this.d = 30;
        this.g = com.huawei.hms.network.embedded.y.f15619c;
        this.e = 50;
        this.f = 50;
        this.h = 50;
        this.i = 512;
        this.j = 300;
        this.k = "";
        this.l = true;
        this.m = false;
        this.n = 600000L;
        try {
            List<String> list = u;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            a(arrayList, this.q, false);
            List<String> list2 = v;
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : list2) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList2.add(str2);
                }
            }
            a(arrayList2, this.r, false);
            this.p.clear();
            this.s.clear();
            this.t.clear();
        } catch (Throwable th) {
            HiLog.w("MCC", "reset fail: " + th.getMessage());
        }
    }

    public static ArrayList a(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString)) {
                arrayList.add(strOptString);
            }
        }
        return arrayList;
    }

    public static void a(ArrayList arrayList, List list, boolean z) {
        list.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strA = (String) it.next();
            if (z) {
                try {
                    strA = w1.a(strA);
                } catch (Throwable th) {
                    HiLog.w("MCC", "initList fail: " + th.getMessage());
                }
            }
            list.add(strA);
        }
    }
}
