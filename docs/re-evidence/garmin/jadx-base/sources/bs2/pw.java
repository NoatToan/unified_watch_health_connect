package bs2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class pw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f20411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f20412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<a> f20413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<vc> f20414e;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20416b;

        public a(pw pwVar, int i14, long j8) {
            this.f20415a = i14;
            this.f20416b = j8;
        }
    }

    public pw(pw pwVar) {
        if (pwVar == null) {
            this.f20410a = 0;
            this.f20411b = 1.0d;
            this.f20412c = 0.0d;
            this.f20413d = new ArrayList<>();
            this.f20414e = new ArrayList<>();
            return;
        }
        this.f20410a = pwVar.f20410a;
        this.f20411b = pwVar.f20411b;
        this.f20412c = pwVar.f20412c;
        this.f20413d = pwVar.f20413d;
        this.f20414e = pwVar.f20414e;
    }

    public final void a(vc vcVar) {
        this.f20414e.add(vcVar);
    }

    public final void b(int i14, long j8) {
        this.f20413d.add(new a(this, i14, j8));
    }

    public final boolean c(bk bkVar) {
        Long lD;
        for (a aVar : this.f20413d) {
            rc rcVarG = bkVar.g(aVar.f20415a);
            if (rcVarG != null && (lD = rcVarG.d(65535)) != null && lD.longValue() == aVar.f20416b) {
                return true;
            }
        }
        return false;
    }

    public pw(String str, int i14, double d14, double d15, String str2) {
        this.f20410a = i14;
        this.f20411b = d14;
        this.f20412c = d15;
        this.f20413d = new ArrayList<>();
        this.f20414e = new ArrayList<>();
    }
}
