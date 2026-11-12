package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class yok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<zmk> f40380a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<zmk> f40381b = new HashSet();
    public boolean c;

    public boolean a(zmk zmkVar) {
        boolean z = true;
        if (zmkVar == null) {
            return true;
        }
        boolean zRemove = this.f40380a.remove(zmkVar);
        if (!this.f40381b.remove(zmkVar) && !zRemove) {
            z = false;
        }
        if (z) {
            zmkVar.clear();
        }
        return z;
    }

    public void b() {
        Iterator it = ulq.k(this.f40380a).iterator();
        while (it.hasNext()) {
            a((zmk) it.next());
        }
        this.f40381b.clear();
    }

    public void c() {
        this.c = true;
        for (zmk zmkVar : ulq.k(this.f40380a)) {
            if (zmkVar.isRunning() || zmkVar.f()) {
                zmkVar.clear();
                this.f40381b.add(zmkVar);
            }
        }
    }

    public void d() {
        this.c = true;
        for (zmk zmkVar : ulq.k(this.f40380a)) {
            if (zmkVar.isRunning()) {
                zmkVar.pause();
                this.f40381b.add(zmkVar);
            }
        }
    }

    public void e() {
        for (zmk zmkVar : ulq.k(this.f40380a)) {
            if (!zmkVar.f() && !zmkVar.e()) {
                zmkVar.clear();
                if (this.c) {
                    this.f40381b.add(zmkVar);
                } else {
                    zmkVar.begin();
                }
            }
        }
    }

    public void f() {
        this.c = false;
        for (zmk zmkVar : ulq.k(this.f40380a)) {
            if (!zmkVar.f() && !zmkVar.isRunning()) {
                zmkVar.begin();
            }
        }
        this.f40381b.clear();
    }

    public void g(zmk zmkVar) {
        this.f40380a.add(zmkVar);
        if (!this.c) {
            zmkVar.begin();
            return;
        }
        zmkVar.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f40381b.add(zmkVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f40380a.size() + ", isPaused=" + this.c + "}";
    }
}
