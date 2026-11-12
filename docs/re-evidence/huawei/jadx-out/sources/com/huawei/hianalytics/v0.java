package com.huawei.hianalytics;

import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.config.RomAttributeCollector;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements RomAttributeCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11615c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public int p;
    public int q;
    public String r;
    public String s;
    public String t;

    @Override // com.huawei.hianalytics.framework.config.RomAttributeCollector
    public final JSONObject doCollector() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_rom_ver", this.f11613a);
            jSONObject.put("_emui_ver", this.f11614b);
            jSONObject.put("_model", this.f11615c);
            jSONObject.put("_package_name", this.d);
            jSONObject.put("_app_ver", this.e);
            jSONObject.put("_lib_ver", this.f);
            jSONObject.put("_lib_name", this.h);
            jSONObject.put("_channel", this.g);
            jSONObject.put("_manufacturer", this.i);
            jSONObject.put("_oaid_tracking_flag", this.l);
            jSONObject.put("_app_brand", this.j);
            jSONObject.put("_brand", this.k);
            jSONObject.put("_mcc", this.s);
            jSONObject.put("_mnc", this.t);
            jSONObject.put("_os", this.m);
            jSONObject.put("_os_ver", this.n);
            jSONObject.put("_screen_height", this.p);
            jSONObject.put("_screen_width", this.q);
            jSONObject.put("_language", this.r);
            jSONObject.put("_hm_version", this.o);
            return jSONObject;
        } catch (Exception unused) {
            HiLog.e("OpennessRomCollector", "json exception");
            return jSONObject;
        }
    }
}
