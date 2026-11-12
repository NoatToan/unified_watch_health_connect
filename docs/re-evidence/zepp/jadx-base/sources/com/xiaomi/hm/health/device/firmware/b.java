package com.xiaomi.hm.health.device.firmware;

import java.util.HashMap;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes20.dex */
class b {
    private String a;
    private final HashMap<String, HMFirmware> b = new HashMap<>();

    public b() {
    }

    public void a(String str, HMFirmware hMFirmware) {
        this.b.put(str, hMFirmware);
    }

    public HMFirmware b(String str) {
        return this.b.get(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("{\n");
        for (String str : this.b.keySet()) {
            HMFirmware hMFirmware = this.b.get(str);
            String str2 = String.format("%-6s", str);
            sb.append("    ");
            sb.append(str2);
            sb.append(SearchCriteria.LT);
            sb.append(hMFirmware.a);
            sb.append(",");
            sb.append(hMFirmware.b);
            sb.append(">\n");
        }
        sb.append("}\n");
        return sb.toString();
    }

    public b(String str) {
        this.a = str;
    }
}
