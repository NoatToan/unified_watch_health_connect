package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bh {
    private static bh a;
    private jq b;
    private LinkedHashMap<String, jr> c = new LinkedHashMap<>();
    private boolean d = true;

    private bh() {
        try {
            this.b = jq.a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static bh a() {
        return c();
    }

    private static synchronized bh c() {
        try {
            bh bhVar = a;
            if (bhVar == null) {
                a = new bh();
            } else if (bhVar.b == null) {
                bhVar.b = jq.a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return a;
    }

    public final void b(bg bgVar) {
        bd bdVar = (bd) this.c.get(bgVar.b());
        if (bdVar != null) {
            synchronized (this.c) {
                bdVar.b();
                this.c.remove(bgVar.b());
            }
        }
    }

    public final void a(bg bgVar) {
        synchronized (this.c) {
            bd bdVar = (bd) this.c.get(bgVar.b());
            if (bdVar == null) {
                return;
            }
            bdVar.a();
            this.c.remove(bgVar.b());
        }
    }

    public final void b() {
        synchronized (this.c) {
            if (this.c.size() > 0) {
                for (Map.Entry<String, jr> entry : this.c.entrySet()) {
                    entry.getKey();
                    ((bd) entry.getValue()).a();
                }
                this.c.clear();
            }
        }
        jq.c();
        this.b = null;
        a = null;
    }

    public final void a(bg bgVar, Context context) throws gi {
        if (!this.c.containsKey(bgVar.b())) {
            bd bdVar = new bd((bx) bgVar, context.getApplicationContext(), (byte) 0);
            synchronized (this.c) {
                this.c.put(bgVar.b(), bdVar);
            }
        }
        this.b.a(this.c.get(bgVar.b()));
    }
}
