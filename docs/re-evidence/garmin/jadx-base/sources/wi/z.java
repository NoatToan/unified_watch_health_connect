package wi;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class z implements f, f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<?> f185472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.a f185473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f185474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f185475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f185476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile aj.o.a<?> f185477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile d f185478g;

    public z(g<?> gVar, f.a aVar) {
        this.f185472a = gVar;
        this.f185473b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    @Override // wi.f
    public final boolean a() {
        boolean z14;
        if (this.f185476e == null) {
            if (this.f185475d != null) {
            }
            this.f185475d = null;
            this.f185477f = null;
            z14 = false;
            while (!z14) {
                ArrayList arrayListB = this.f185472a.b();
                int i14 = this.f185474c;
                this.f185474c = i14 + 1;
                this.f185477f = (aj.o.a) arrayListB.get(i14);
                if (this.f185477f == null) {
                }
            }
            return z14;
        }
        Object obj = this.f185476e;
        this.f185476e = null;
        try {
            if (e(obj)) {
                if (this.f185475d != null || !this.f185475d.a()) {
                    this.f185475d = null;
                    this.f185477f = null;
                    z14 = false;
                    while (!z14 && this.f185474c < this.f185472a.b().size()) {
                        ArrayList arrayListB2 = this.f185472a.b();
                        int i15 = this.f185474c;
                        this.f185474c = i15 + 1;
                        this.f185477f = (aj.o.a) arrayListB2.get(i15);
                        if (this.f185477f == null && (this.f185472a.f185310p.c(this.f185477f.f3372c.b()) || this.f185472a.c(this.f185477f.f3372c.a()) != null)) {
                            this.f185477f.f3372c.d(this.f185472a.f185309o, new y(this, this.f185477f));
                            z14 = true;
                        }
                    }
                    return z14;
                }
            }
        } catch (IOException unused) {
        }
        return true;
    }

    @Override // wi.f.a
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // wi.f.a
    public final void c(ui.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, ui.a aVar) {
        this.f185473b.c(eVar, exc, dVar, this.f185477f.f3372c.b());
    }

    @Override // wi.f
    public final void cancel() {
        aj.o.a<?> aVar = this.f185477f;
        if (aVar != null) {
            aVar.f3372c.cancel();
        }
    }

    @Override // wi.f.a
    public final void d(ui.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, ui.a aVar, ui.e eVar2) {
        this.f185473b.d(eVar, obj, dVar, this.f185477f.f3372c.b(), eVar);
    }

    public final boolean e(Object obj) throws Throwable {
        Throwable th3;
        int i14 = qj.h.f144972a;
        SystemClock.elapsedRealtimeNanos();
        boolean z14 = false;
        try {
            com.bumptech.glide.load.data.e eVarG = this.f185472a.f185297c.a().g(obj);
            Object objA = eVarG.a();
            ui.d<X> dVarD = this.f185472a.d(objA);
            e eVar = new e(dVarD, objA, this.f185472a.f185303i);
            d dVar = new d(this.f185477f.f3370a, this.f185472a.f185308n);
            yi.a aVarA = ((k.c) this.f185472a.f185302h).a();
            aVarA.b(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                dVar.toString();
                obj.toString();
                dVarD.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (aVarA.a(dVar) != null) {
                this.f185478g = dVar;
                this.f185475d = new c(Collections.singletonList(this.f185477f.f3370a), this.f185472a, this);
                this.f185477f.f3372c.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f185478g);
                obj.toString();
            }
            try {
                this.f185473b.d(this.f185477f.f3370a, eVarG.a(), this.f185477f.f3372c, this.f185477f.f3372c.b(), this.f185477f.f3370a);
                return false;
            } catch (Throwable th4) {
                th3 = th4;
                z14 = true;
                if (z14) {
                    throw th3;
                }
                this.f185477f.f3372c.cleanup();
                throw th3;
            }
        } catch (Throwable th5) {
            th3 = th5;
        }
    }
}
