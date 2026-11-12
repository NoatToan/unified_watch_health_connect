package com.amap.api.col.p0003sl;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static bl f2271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ma f2272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedHashMap<String, mb> f2273c = new LinkedHashMap<>();
    private boolean d = true;

    public static bl a() {
        return c();
    }

    private static bl c() {
        bl blVar;
        synchronized (bl.class) {
            try {
                bl blVar2 = f2271a;
                if (blVar2 == null) {
                    f2271a = new bl();
                } else if (blVar2.f2272b == null) {
                    blVar2.f2272b = ma.b();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            blVar = f2271a;
        }
        return blVar;
    }

    private bl() {
        try {
            if (this.f2272b == null) {
                this.f2272b = ma.c();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void d() {
        synchronized (this.f2273c) {
            if (this.f2273c.size() <= 0) {
                return;
            }
            for (Map.Entry<String, mb> entry : this.f2273c.entrySet()) {
                entry.getKey();
                ((bh) entry.getValue()).a();
            }
            this.f2273c.clear();
        }
    }

    public final void a(bk bkVar) {
        synchronized (this.f2273c) {
            bh bhVar = (bh) this.f2273c.get(bkVar.b());
            if (bhVar == null) {
                return;
            }
            bhVar.a();
            this.f2273c.remove(bkVar.b());
        }
    }

    public final void a(bk bkVar, Context context) throws ik {
        if (!this.f2273c.containsKey(bkVar.b())) {
            bh bhVar = new bh((cb) bkVar, context.getApplicationContext(), (byte) 0);
            synchronized (this.f2273c) {
                this.f2273c.put(bkVar.b(), bhVar);
            }
        }
        this.f2272b.a(this.f2273c.get(bkVar.b()));
    }

    public final void b() {
        d();
        this.f2272b.e();
        this.f2272b = null;
        e();
    }

    private static void e() {
        f2271a = null;
    }

    public final void b(bk bkVar) {
        bh bhVar = (bh) this.f2273c.get(bkVar.b());
        if (bhVar != null) {
            synchronized (this.f2273c) {
                bhVar.b();
                this.f2273c.remove(bkVar.b());
            }
        }
    }
}
