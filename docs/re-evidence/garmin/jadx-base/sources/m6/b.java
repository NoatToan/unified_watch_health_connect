package m6;

import com.google.firebase.crashlytics.internal.common.IdManager;
import i3.e5;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import tn.k;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f116814d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f116811a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f116812b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<h> f116813c = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f116815e = false;

    public interface a {
        boolean a(h hVar);

        float b(h hVar, boolean z14);

        float c(b bVar, boolean z14);

        void clear();

        void d(float f14);

        void e();

        float f(int i14);

        void g(h hVar, float f14, boolean z14);

        h h(int i14);

        float i(h hVar);

        int j();

        void k(h hVar, float f14);
    }

    public b(c cVar) {
        this.f116814d = new m6.a(this, cVar);
    }

    @Override // m6.d.a
    public h a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(d dVar, int i14) {
        this.f116814d.k(dVar.j(i14, "ep"), 1.0f);
        this.f116814d.k(dVar.j(i14, "em"), -1.0f);
    }

    public final void c(h hVar, h hVar2, h hVar3, int i14) {
        boolean z14 = false;
        if (i14 != 0) {
            if (i14 < 0) {
                i14 *= -1;
                z14 = true;
            }
            this.f116812b = i14;
        }
        a aVar = this.f116814d;
        if (z14) {
            aVar.k(hVar, 1.0f);
            this.f116814d.k(hVar2, -1.0f);
            this.f116814d.k(hVar3, -1.0f);
        } else {
            aVar.k(hVar, -1.0f);
            this.f116814d.k(hVar2, 1.0f);
            this.f116814d.k(hVar3, 1.0f);
        }
    }

    public final void d(h hVar, h hVar2, h hVar3, int i14) {
        boolean z14 = false;
        if (i14 != 0) {
            if (i14 < 0) {
                i14 *= -1;
                z14 = true;
            }
            this.f116812b = i14;
        }
        a aVar = this.f116814d;
        if (z14) {
            aVar.k(hVar, 1.0f);
            this.f116814d.k(hVar2, -1.0f);
            this.f116814d.k(hVar3, 1.0f);
        } else {
            aVar.k(hVar, -1.0f);
            this.f116814d.k(hVar2, 1.0f);
            this.f116814d.k(hVar3, -1.0f);
        }
    }

    public boolean e() {
        return this.f116811a == null && this.f116812b == 0.0f && this.f116814d.j() == 0;
    }

    public final h f(boolean[] zArr, h hVar) {
        h.a aVar;
        int iJ = this.f116814d.j();
        h hVar2 = null;
        float f14 = 0.0f;
        for (int i14 = 0; i14 < iJ; i14++) {
            float f15 = this.f116814d.f(i14);
            if (f15 < 0.0f) {
                h hVarH = this.f116814d.h(i14);
                if ((zArr == null || !zArr[hVarH.f116855c]) && hVarH != hVar && (((aVar = hVarH.f116862j) == h.a.SLACK || aVar == h.a.ERROR) && f15 < f14)) {
                    f14 = f15;
                    hVar2 = hVarH;
                }
            }
        }
        return hVar2;
    }

    public final void g(h hVar) {
        h hVar2 = this.f116811a;
        if (hVar2 != null) {
            this.f116814d.k(hVar2, -1.0f);
            this.f116811a.f116856d = -1;
            this.f116811a = null;
        }
        float fB = this.f116814d.b(hVar, true) * (-1.0f);
        this.f116811a = hVar;
        if (fB == 1.0f) {
            return;
        }
        this.f116812b /= fB;
        this.f116814d.d(fB);
    }

    public final void h(d dVar, h hVar, boolean z14) {
        if (hVar.f116859g) {
            float fI = this.f116814d.i(hVar);
            this.f116812b = (hVar.f116858f * fI) + this.f116812b;
            this.f116814d.b(hVar, z14);
            if (z14) {
                hVar.b(this);
            }
            if (this.f116814d.j() == 0) {
                this.f116815e = true;
                dVar.f116822b = true;
            }
        }
    }

    public void i(d dVar, b bVar, boolean z14) {
        float fC = this.f116814d.c(bVar, z14);
        this.f116812b = (bVar.f116812b * fC) + this.f116812b;
        if (z14) {
            bVar.f116811a.b(this);
        }
        if (this.f116811a == null || this.f116814d.j() != 0) {
            return;
        }
        this.f116815e = true;
        dVar.f116822b = true;
    }

    public String toString() {
        boolean z14;
        String strConcat = (this.f116811a == null ? "0" : "" + this.f116811a).concat(" = ");
        if (this.f116812b != 0.0f) {
            StringBuilder sbK = e5.k(strConcat);
            sbK.append(this.f116812b);
            strConcat = sbK.toString();
            z14 = true;
        } else {
            z14 = false;
        }
        int iJ = this.f116814d.j();
        for (int i14 = 0; i14 < iJ; i14++) {
            h hVarH = this.f116814d.h(i14);
            if (hVarH != null) {
                float f14 = this.f116814d.f(i14);
                if (f14 != 0.0f) {
                    String string = hVarH.toString();
                    if (z14) {
                        if (f14 > 0.0f) {
                            strConcat = k.g(strConcat, " + ");
                        } else {
                            strConcat = k.g(strConcat, " - ");
                            f14 *= -1.0f;
                        }
                    } else if (f14 < 0.0f) {
                        strConcat = k.g(strConcat, "- ");
                        f14 *= -1.0f;
                    }
                    strConcat = f14 == 1.0f ? k.g(strConcat, string) : strConcat + f14 + StringUtils.SPACE + string;
                    z14 = true;
                }
            }
        }
        return !z14 ? k.g(strConcat, IdManager.DEFAULT_VERSION_NAME) : strConcat;
    }

    public b() {
    }
}
