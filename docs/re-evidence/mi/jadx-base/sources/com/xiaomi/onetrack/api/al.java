package com.xiaomi.onetrack.api;

import android.os.Process;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.OneTrack;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class al implements an.b, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13737a = "OneTrackSystemImp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f13738b = 102400;
    private static final int c = 2;
    private final ConcurrentHashMap<String, String> d = new ConcurrentHashMap<>();
    private Configuration e;
    private an f;
    private com.xiaomi.onetrack.util.v g;

    public al(Configuration configuration, com.xiaomi.onetrack.util.v vVar) {
        this.e = configuration;
        this.g = vVar;
        an anVarA = an.a();
        this.f = anVarA;
        anVarA.a(this);
    }

    private boolean b(String str, String str2) {
        if (OneTrack.isDisable()) {
            return false;
        }
        if ((str != null && str.equals("onetrack_bug_report")) || str2 == null || str2.length() * 2 <= f13738b) {
            return true;
        }
        com.xiaomi.onetrack.util.p.a(f13737a, "Event size exceed limitation!");
        return false;
    }

    @Override // com.xiaomi.onetrack.api.e
    public void a(String str, String str2) {
        boolean zA = a(str2);
        com.xiaomi.onetrack.util.v vVar = this.g;
        if (vVar != null && !vVar.a(str) && !zA) {
            com.xiaomi.onetrack.util.p.a(f13737a, "The privacy policy is not permitted, and the event is not basic or recommend event or custom dau event, skip it.");
            return;
        }
        if (b(str, str2)) {
            if (com.xiaomi.onetrack.c.i.b()) {
                com.xiaomi.onetrack.c.i.a(this);
            } else if (!b.i.equalsIgnoreCase(str)) {
                com.xiaomi.onetrack.c.i.a(str, str2);
                return;
            }
            if (com.xiaomi.onetrack.util.p.f13986a) {
                com.xiaomi.onetrack.util.p.a(f13737a, "track name:" + str + " data :" + str2 + " tid" + Process.myTid());
            }
            synchronized (this.d) {
                try {
                    if (!this.f.a(str, str2, this.e, zA)) {
                        this.d.put(str2, str);
                        if (com.xiaomi.onetrack.util.p.f13986a) {
                            com.xiaomi.onetrack.util.p.a(f13737a, "track mIOneTrackService is null!" + this.d.size() + "  " + str2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            synchronized (this.d) {
                try {
                    if (this.d.size() <= 0) {
                        return;
                    }
                    for (Map.Entry<String, String> entry : this.d.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        this.f.b(value, key, this.e, a(key));
                        if (com.xiaomi.onetrack.util.p.f13986a) {
                            com.xiaomi.onetrack.util.p.a(f13737a, "name:" + value + "data :" + key);
                        }
                    }
                    this.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.a(f13737a, "trackCachedEvents: " + e.toString());
        }
    }

    @Override // com.xiaomi.onetrack.api.e
    public void a(int i) {
        this.f.a(i);
    }

    @Override // com.xiaomi.onetrack.api.an.b
    public void a() {
        com.xiaomi.onetrack.util.i.a(new am(this));
    }

    private boolean a(String str) {
        try {
            return new JSONObject(str).optJSONObject(c.f13756b).optBoolean(com.xiaomi.onetrack.f.b.C0832b.F, false);
        } catch (Throwable unused) {
            com.xiaomi.onetrack.util.p.a(f13737a, "");
            return false;
        }
    }
}
