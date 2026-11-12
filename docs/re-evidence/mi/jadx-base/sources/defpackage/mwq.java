package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class mwq {
    public Interpolator c;
    public nwq d;
    public boolean e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f27300b = -1;
    public final owq f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<lwq> f27299a = new ArrayList<>();

    public class a extends owq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f27301a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27302b = 0;

        public a() {
        }

        @Override // defpackage.nwq
        public void b(View view) {
            int i = this.f27302b + 1;
            this.f27302b = i;
            if (i == mwq.this.f27299a.size()) {
                nwq nwqVar = mwq.this.d;
                if (nwqVar != null) {
                    nwqVar.b(null);
                }
                d();
            }
        }

        @Override // defpackage.owq, defpackage.nwq
        public void c(View view) {
            if (this.f27301a) {
                return;
            }
            this.f27301a = true;
            nwq nwqVar = mwq.this.d;
            if (nwqVar != null) {
                nwqVar.c(null);
            }
        }

        public void d() {
            this.f27302b = 0;
            this.f27301a = false;
            mwq.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator<lwq> it = this.f27299a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.e = false;
        }
    }

    public void b() {
        this.e = false;
    }

    public mwq c(lwq lwqVar) {
        if (!this.e) {
            this.f27299a.add(lwqVar);
        }
        return this;
    }

    public mwq d(lwq lwqVar, lwq lwqVar2) {
        this.f27299a.add(lwqVar);
        lwqVar2.j(lwqVar.d());
        this.f27299a.add(lwqVar2);
        return this;
    }

    public mwq e(long j) {
        if (!this.e) {
            this.f27300b = j;
        }
        return this;
    }

    public mwq f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public mwq g(nwq nwqVar) {
        if (!this.e) {
            this.d = nwqVar;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        for (lwq lwqVar : this.f27299a) {
            long j = this.f27300b;
            if (j >= 0) {
                lwqVar.f(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                lwqVar.g(interpolator);
            }
            if (this.d != null) {
                lwqVar.h(this.f);
            }
            lwqVar.l();
        }
        this.e = true;
    }
}
