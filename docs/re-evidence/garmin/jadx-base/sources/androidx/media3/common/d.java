package androidx.media3.common;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f8178g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f8184f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f8185a;

        private b(d dVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(dVar.f8179a).setFlags(dVar.f8180b).setUsage(dVar.f8181c);
            int i14 = fa.z.f70071a;
            if (i14 >= 29) {
                usage.setAllowedCapturePolicy(dVar.f8182d);
            }
            if (i14 >= 32) {
                usage.setSpatializationBehavior(dVar.f8183e);
            }
            this.f8185a = usage.build();
        }
    }

    public static final class c {
    }

    static {
        new c();
        f8178g = new d(0, 0, 1, 1, 0);
        fa.z.H(0);
        fa.z.H(1);
        fa.z.H(2);
        fa.z.H(3);
        fa.z.H(4);
    }

    private d(int i14, int i15, int i16, int i17, int i18) {
        this.f8179a = i14;
        this.f8180b = i15;
        this.f8181c = i16;
        this.f8182d = i17;
        this.f8183e = i18;
    }

    public final b a() {
        if (this.f8184f == null) {
            this.f8184f = new b();
        }
        return this.f8184f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f8179a == dVar.f8179a && this.f8180b == dVar.f8180b && this.f8181c == dVar.f8181c && this.f8182d == dVar.f8182d && this.f8183e == dVar.f8183e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f8179a) * 31) + this.f8180b) * 31) + this.f8181c) * 31) + this.f8182d) * 31) + this.f8183e;
    }
}
