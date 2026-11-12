package com.sogou.map.loc;

import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
final class a1 extends e1 {
    public String g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;

    public a1(String str, String str2, int i) {
        super(str, str2, i);
        this.k = 4;
    }

    @Override // com.sogou.map.loc.e1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        j0.j(jSONObject, "type", "wifi");
        j0.j(jSONObject, "ssid", c());
        j0.j(jSONObject, "bbsid", j0.f(this.a));
        j0.j(jSONObject, ConstantKt.KEY_RSSI, Integer.valueOf(this.c));
        j0.j(jSONObject, "ip_address", Integer.valueOf(this.h));
        j0.j(jSONObject, "network_id", Integer.valueOf(this.j));
        j0.j(jSONObject, "phoneNetCardMacAddress", this.g);
        j0.j(jSONObject, "link_speed", Integer.valueOf(this.i));
        j0.j(jSONObject, "wifiState", Integer.valueOf(this.k));
        j0.j(jSONObject, "gainTime", Long.valueOf(this.l));
        return jSONObject;
    }
}
