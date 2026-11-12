package ch2;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f27518b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27519a = new ArrayList();

    /* JADX INFO: renamed from: ch2.b$b, reason: collision with other inner class name */
    public class C0419b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f27520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f27522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f27523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f27524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f27525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f27526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f27527h;

        private C0419b(b bVar) {
        }
    }

    private b() {
    }

    public static b b() {
        if (f27518b == null) {
            f27518b = new b();
        }
        return f27518b;
    }

    public final void a(long j8, int i14, boolean z14) {
        C0419b c0419bC = c(i14, j8);
        if (c0419bC != null) {
            if (z14) {
                c0419bC.f27523d = false;
            } else {
                c0419bC.f27524e = false;
            }
            if (c0419bC.f27523d || c0419bC.f27524e) {
                return;
            }
            this.f27519a.remove(c0419bC);
        }
    }

    public final C0419b c(int i14, long j8) {
        for (C0419b c0419b : this.f27519a) {
            if (c0419b.f27521b == i14 && c0419b.f27522c == j8) {
                return c0419b;
            }
        }
        return null;
    }

    public final boolean d(long j8, int i14, boolean z14) {
        C0419b c0419bC = c(i14, j8);
        if (c0419bC == null) {
            return false;
        }
        return z14 ? c0419bC.f27523d : c0419bC.f27524e;
    }

    public final void e(long j8, String str, int i14, boolean z14, boolean z15) {
        C0419b c0419b;
        ArrayList arrayList = this.f27519a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0419b = null;
                break;
            }
            c0419b = (C0419b) it.next();
            if (c0419b.f27520a.equals(str) && c0419b.f27522c == j8) {
                break;
            }
        }
        if (c0419b != null) {
            if (z14) {
                c0419b.f27523d = true;
                return;
            } else {
                c0419b.f27524e = true;
                return;
            }
        }
        C0419b c0419b2 = new C0419b();
        c0419b2.f27520a = str;
        c0419b2.f27521b = i14;
        c0419b2.f27522c = j8;
        c0419b2.f27523d = z14;
        c0419b2.f27524e = !z14;
        c0419b2.f27525f = null;
        c0419b2.f27526g = null;
        c0419b2.f27527h = z15;
        arrayList.add(c0419b2);
    }
}
