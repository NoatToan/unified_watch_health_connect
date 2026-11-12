package n7;

import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c implements f.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f123973a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f123974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c7.e f123975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c7.e f123976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f123977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f123978f;

    public c(f fVar, List<b> list) {
        c7.e eVar = c7.e.f25189e;
        this.f123975c = eVar;
        this.f123976d = eVar;
        e(list, false);
        e(list, true);
        ArrayList<f.c> arrayList = fVar.f123985b;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
            b(fVar.f123986c, fVar.f123987d);
            d(fVar.f123988e);
        }
        this.f123974b = fVar;
    }

    @Override // n7.f.c
    public final void a() {
        this.f123977e++;
    }

    @Override // n7.f.c
    public final void b(c7.e eVar, c7.e eVar2) {
        this.f123975c = eVar;
        this.f123976d = eVar2;
        f();
    }

    @Override // n7.f.c
    public final void c(int i14, c7.e eVar, RectF rectF) {
        c7.e eVar2 = this.f123976d;
        ArrayList<b> arrayList = this.f123973a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i15 = bVar.f123957a;
            if ((i15 & i14) != 0) {
                b.a aVar = bVar.f123958b;
                if (!aVar.f123967d) {
                    aVar.f123967d = true;
                    b.a.InterfaceC2332a interfaceC2332a = aVar.f123972i;
                    if (interfaceC2332a != null) {
                        ((d) interfaceC2332a).f123980b.setVisibility(0);
                    }
                }
                if (i15 == 1) {
                    int i16 = eVar2.f25190a;
                    if (i16 > 0) {
                        bVar.c(eVar.f25190a / i16);
                    }
                    bVar.b(rectF.left);
                } else if (i15 == 2) {
                    int i17 = eVar2.f25191b;
                    if (i17 > 0) {
                        bVar.c(eVar.f25191b / i17);
                    }
                    bVar.b(rectF.top);
                } else if (i15 == 4) {
                    int i18 = eVar2.f25192c;
                    if (i18 > 0) {
                        bVar.c(eVar.f25192c / i18);
                    }
                    bVar.b(rectF.right);
                } else if (i15 == 8) {
                    int i19 = eVar2.f25193d;
                    if (i19 > 0) {
                        bVar.c(eVar.f25193d / i19);
                    }
                    bVar.b(rectF.bottom);
                }
            }
        }
    }

    @Override // n7.f.c
    public final void d(int i14) {
        ArrayList<b> arrayList = this.f123973a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).a(i14);
        }
    }

    public final void e(List<b> list, boolean z14) {
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            b bVar = list.get(i14);
            bVar.getClass();
            if ((bVar instanceof a) == z14) {
                c cVar = bVar.f123963g;
                if (cVar != null) {
                    throw new IllegalStateException(bVar + " (" + (i14 + 1) + "/" + size + ") is already controlled by " + cVar + " but is still added to " + this);
                }
                bVar.f123963g = this;
                this.f123973a.add(bVar);
            }
        }
    }

    public final void f() {
        int i14;
        c7.e eVarA = c7.e.f25189e;
        ArrayList<b> arrayList = this.f123973a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            c7.e eVar = this.f123975c;
            c7.e eVar2 = this.f123976d;
            bVar.f123959c = eVar;
            b.a aVar = bVar.f123958b;
            bVar.f123960d = eVar2;
            if (!aVar.f123966c.equals(eVarA)) {
                aVar.f123966c = eVarA;
                b.a.InterfaceC2332a interfaceC2332a = aVar.f123972i;
                if (interfaceC2332a != null) {
                    d dVar = (d) interfaceC2332a;
                    FrameLayout.LayoutParams layoutParams = dVar.f123979a;
                    layoutParams.leftMargin = eVarA.f25190a;
                    layoutParams.topMargin = eVarA.f25191b;
                    layoutParams.rightMargin = eVarA.f25192c;
                    layoutParams.bottomMargin = eVarA.f25193d;
                    dVar.f123980b.setLayoutParams(layoutParams);
                }
            }
            c7.e eVarC = c7.e.f25189e;
            int i15 = bVar.f123957a;
            if (i15 == 1) {
                i14 = bVar.f123959c.f25190a;
                int i16 = bVar.f123960d.f25190a;
                if (aVar.f123964a != i16) {
                    aVar.f123964a = i16;
                    b.a.InterfaceC2332a interfaceC2332a2 = aVar.f123972i;
                    if (interfaceC2332a2 != null) {
                        d dVar2 = (d) interfaceC2332a2;
                        FrameLayout.LayoutParams layoutParams2 = dVar2.f123979a;
                        layoutParams2.width = i16;
                        dVar2.f123980b.setLayoutParams(layoutParams2);
                    }
                }
                if (bVar instanceof a) {
                    eVarC = c7.e.c(i14, 0, 0, 0);
                }
            } else if (i15 == 2) {
                i14 = bVar.f123959c.f25191b;
                int i17 = bVar.f123960d.f25191b;
                if (aVar.f123965b != i17) {
                    aVar.f123965b = i17;
                    b.a.InterfaceC2332a interfaceC2332a3 = aVar.f123972i;
                    if (interfaceC2332a3 != null) {
                        d dVar3 = (d) interfaceC2332a3;
                        FrameLayout.LayoutParams layoutParams3 = dVar3.f123979a;
                        layoutParams3.height = i17;
                        dVar3.f123980b.setLayoutParams(layoutParams3);
                    }
                }
                if (bVar instanceof a) {
                    eVarC = c7.e.c(0, i14, 0, 0);
                }
            } else if (i15 == 4) {
                i14 = bVar.f123959c.f25192c;
                int i18 = bVar.f123960d.f25192c;
                if (aVar.f123964a != i18) {
                    aVar.f123964a = i18;
                    b.a.InterfaceC2332a interfaceC2332a4 = aVar.f123972i;
                    if (interfaceC2332a4 != null) {
                        d dVar4 = (d) interfaceC2332a4;
                        FrameLayout.LayoutParams layoutParams4 = dVar4.f123979a;
                        layoutParams4.width = i18;
                        dVar4.f123980b.setLayoutParams(layoutParams4);
                    }
                }
                if (bVar instanceof a) {
                    eVarC = c7.e.c(0, 0, i14, 0);
                }
            } else if (i15 != 8) {
                i14 = 0;
            } else {
                i14 = bVar.f123959c.f25193d;
                int i19 = bVar.f123960d.f25193d;
                if (aVar.f123965b != i19) {
                    aVar.f123965b = i19;
                    b.a.InterfaceC2332a interfaceC2332a5 = aVar.f123972i;
                    if (interfaceC2332a5 != null) {
                        d dVar5 = (d) interfaceC2332a5;
                        FrameLayout.LayoutParams layoutParams5 = dVar5.f123979a;
                        layoutParams5.height = i19;
                        dVar5.f123980b.setLayoutParams(layoutParams5);
                    }
                }
                if (bVar instanceof a) {
                    eVarC = c7.e.c(0, 0, 0, i14);
                }
            }
            boolean z14 = i14 > 0;
            if (aVar.f123967d != z14) {
                aVar.f123967d = z14;
                b.a.InterfaceC2332a interfaceC2332a6 = aVar.f123972i;
                if (interfaceC2332a6 != null) {
                    ((d) interfaceC2332a6).f123980b.setVisibility(z14 ? 0 : 8);
                }
            }
            float f14 = 0.0f;
            bVar.b(i14 > 0 ? 1.0f : 0.0f);
            if (i14 > 0) {
                f14 = 1.0f;
            }
            bVar.c(f14);
            eVarA = c7.e.a(eVarA, eVarC);
        }
    }

    @Override // n7.f.c
    public final void onAnimationEnd() {
        int i14 = this.f123977e;
        boolean z14 = i14 > 0;
        int i15 = i14 - 1;
        this.f123977e = i15;
        if (z14 && i15 == 0) {
            f();
        }
    }
}
