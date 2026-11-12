package b0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u0> f13865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<u0> f13866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<u0> f13867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13868d;

    public d0(a aVar) {
        this.f13865a = Collections.unmodifiableList(aVar.f13869a);
        this.f13866b = Collections.unmodifiableList(aVar.f13870b);
        this.f13867c = Collections.unmodifiableList(aVar.f13871c);
        this.f13868d = aVar.f13872d;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f13869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f13870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f13871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f13872d;

        public a(d0 d0Var) {
            ArrayList arrayList = new ArrayList();
            this.f13869a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f13870b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f13871c = arrayList3;
            this.f13872d = 5000L;
            arrayList.addAll(d0Var.f13865a);
            arrayList2.addAll(d0Var.f13866b);
            arrayList3.addAll(d0Var.f13867c);
            this.f13872d = d0Var.f13868d;
        }

        public final void a(u0 u0Var, int i14) {
            boolean z14 = false;
            k7.h.b(u0Var != null, "Point cannot be null.");
            if (i14 >= 1 && i14 <= 7) {
                z14 = true;
            }
            k7.h.b(z14, "Invalid metering mode " + i14);
            if ((i14 & 1) != 0) {
                this.f13869a.add(u0Var);
            }
            if ((i14 & 2) != 0) {
                this.f13870b.add(u0Var);
            }
            if ((i14 & 4) != 0) {
                this.f13871c.add(u0Var);
            }
        }

        public final void b(int i14) {
            if ((i14 & 1) != 0) {
                this.f13869a.clear();
            }
            if ((i14 & 2) != 0) {
                this.f13870b.clear();
            }
            if ((i14 & 4) != 0) {
                this.f13871c.clear();
            }
        }

        public a(u0 u0Var, int i14) {
            this.f13869a = new ArrayList();
            this.f13870b = new ArrayList();
            this.f13871c = new ArrayList();
            this.f13872d = 5000L;
            a(u0Var, i14);
        }

        public a(u0 u0Var) {
            this(u0Var, 7);
        }
    }
}
