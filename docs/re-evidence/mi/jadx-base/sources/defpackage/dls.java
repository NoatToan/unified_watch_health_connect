package defpackage;

import android.content.Context;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.push.service.o0;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class dls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15671a = "disconnection_event";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15672b = "count";
    public final String c = b.E;
    public final String d = "network_state";
    public final String e = "reason";
    public final String f = "ping_interval";
    public final String g = "network_type";
    public final String h = "wifi_digest";
    public final String i = "duration";
    public final String j = "disconnect_time";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f15673k = "connect_time";
    public final String l = "xmsf_vc";
    public final String m = "android_vc";
    public final String n = "uuid";

    public void a(Context context, List<als> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        zks.g("upload size = " + list.size());
        String strD = o0.d(context);
        for (als alsVar : list) {
            HashMap map = new HashMap();
            map.put("count", Integer.valueOf(alsVar.a()));
            map.put(b.E, alsVar.c());
            map.put("network_state", Integer.valueOf(alsVar.g()));
            map.put("reason", Integer.valueOf(alsVar.m()));
            map.put("ping_interval", Long.valueOf(alsVar.b()));
            map.put("network_type", Integer.valueOf(alsVar.q()));
            map.put("wifi_digest", alsVar.i());
            map.put("connected_network_type", Integer.valueOf(alsVar.u()));
            map.put("duration", Long.valueOf(alsVar.h()));
            map.put("disconnect_time", Long.valueOf(alsVar.n()));
            map.put("connect_time", Long.valueOf(alsVar.r()));
            map.put("xmsf_vc", Integer.valueOf(alsVar.w()));
            map.put("android_vc", Integer.valueOf(alsVar.y()));
            map.put("uuid", strD);
            tts.c().b("disconnection_event", map);
        }
    }
}
