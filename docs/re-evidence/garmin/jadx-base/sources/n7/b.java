package n7;

import am.j;
import android.graphics.drawable.ColorDrawable;
import android.view.animation.PathInterpolator;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f123957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f123958b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c7.e f123959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c7.e f123960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f123961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f123962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f123963g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f123964a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f123965b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c7.e f123966c = c7.e.f25189e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f123967d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ColorDrawable f123968e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f123969f = 0.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f123970g = 0.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f123971h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public InterfaceC2332a f123972i;

        /* JADX INFO: renamed from: n7.b$a$a, reason: collision with other inner class name */
        public interface InterfaceC2332a {
        }
    }

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public b(int i14) {
        c7.e eVar = c7.e.f25189e;
        this.f123959c = eVar;
        this.f123960d = eVar;
        this.f123961e = 1.0f;
        this.f123962f = 1.0f;
        this.f123963g = null;
        if (i14 == 1 || i14 == 2 || i14 == 4 || i14 == 8) {
            this.f123957a = i14;
        } else {
            h.s(j.h(i14, "Unexpected side: "));
            throw null;
        }
    }

    public void a(int i14) {
    }

    public final void b(float f14) {
        float f15 = f14 * this.f123961e;
        a aVar = this.f123958b;
        if (aVar.f123971h != f15) {
            aVar.f123971h = f15;
            a.InterfaceC2332a interfaceC2332a = aVar.f123972i;
            if (interfaceC2332a != null) {
                ((d) interfaceC2332a).f123980b.setAlpha(f15);
            }
        }
    }

    public final void c(float f14) {
        float f15 = this.f123962f * f14;
        a aVar = this.f123958b;
        int i14 = this.f123957a;
        if (i14 == 1) {
            float f16 = (-(1.0f - f15)) * aVar.f123964a;
            if (aVar.f123969f != f16) {
                aVar.f123969f = f16;
                a.InterfaceC2332a interfaceC2332a = aVar.f123972i;
                if (interfaceC2332a != null) {
                    ((d) interfaceC2332a).f123980b.setTranslationX(f16);
                    return;
                }
                return;
            }
            return;
        }
        if (i14 == 2) {
            float f17 = (-(1.0f - f15)) * aVar.f123965b;
            if (aVar.f123970g != f17) {
                aVar.f123970g = f17;
                a.InterfaceC2332a interfaceC2332a2 = aVar.f123972i;
                if (interfaceC2332a2 != null) {
                    ((d) interfaceC2332a2).f123980b.setTranslationY(f17);
                    return;
                }
                return;
            }
            return;
        }
        if (i14 == 4) {
            float f18 = (1.0f - f15) * aVar.f123964a;
            if (aVar.f123969f != f18) {
                aVar.f123969f = f18;
                a.InterfaceC2332a interfaceC2332a3 = aVar.f123972i;
                if (interfaceC2332a3 != null) {
                    ((d) interfaceC2332a3).f123980b.setTranslationX(f18);
                    return;
                }
                return;
            }
            return;
        }
        if (i14 != 8) {
            return;
        }
        float f19 = (1.0f - f15) * aVar.f123965b;
        if (aVar.f123970g != f19) {
            aVar.f123970g = f19;
            a.InterfaceC2332a interfaceC2332a4 = aVar.f123972i;
            if (interfaceC2332a4 != null) {
                ((d) interfaceC2332a4).f123980b.setTranslationY(f19);
            }
        }
    }
}
