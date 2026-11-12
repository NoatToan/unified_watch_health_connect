package u6;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class k extends p {
    public k(t6.e eVar) {
        super(eVar);
    }

    @Override // u6.p, u6.d
    public final void a(d dVar) {
        t6.a aVar = (t6.a) this.f168840b;
        int i14 = aVar.f162564y0;
        f fVar = this.f168846h;
        Iterator it = fVar.f168814l.iterator();
        int i15 = 0;
        int i16 = -1;
        while (it.hasNext()) {
            int i17 = ((f) it.next()).f168809g;
            if (i16 == -1 || i17 < i16) {
                i16 = i17;
            }
            if (i15 < i17) {
                i15 = i17;
            }
        }
        if (i14 == 0 || i14 == 2) {
            fVar.d(i16 + aVar.A0);
        } else {
            fVar.d(i15 + aVar.A0);
        }
    }

    @Override // u6.p
    public final void d() {
        t6.e eVar = this.f168840b;
        if (eVar instanceof t6.a) {
            f fVar = this.f168846h;
            fVar.f168804b = true;
            ArrayList arrayList = fVar.f168814l;
            t6.a aVar = (t6.a) eVar;
            int i14 = aVar.f162564y0;
            boolean z14 = aVar.f162565z0;
            int i15 = 0;
            if (i14 == 0) {
                fVar.f168807e = f.a.LEFT;
                while (i15 < aVar.f162691x0) {
                    t6.e eVar2 = aVar.f162690w0[i15];
                    if (z14 || eVar2.f162623k0 != 8) {
                        f fVar2 = eVar2.f162608d.f168846h;
                        fVar2.f168813k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i15++;
                }
                m(this.f168840b.f162608d.f168846h);
                m(this.f168840b.f162608d.f168847i);
                return;
            }
            if (i14 == 1) {
                fVar.f168807e = f.a.RIGHT;
                while (i15 < aVar.f162691x0) {
                    t6.e eVar3 = aVar.f162690w0[i15];
                    if (z14 || eVar3.f162623k0 != 8) {
                        f fVar3 = eVar3.f162608d.f168847i;
                        fVar3.f168813k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i15++;
                }
                m(this.f168840b.f162608d.f168846h);
                m(this.f168840b.f162608d.f168847i);
                return;
            }
            if (i14 == 2) {
                fVar.f168807e = f.a.TOP;
                while (i15 < aVar.f162691x0) {
                    t6.e eVar4 = aVar.f162690w0[i15];
                    if (z14 || eVar4.f162623k0 != 8) {
                        f fVar4 = eVar4.f162610e.f168846h;
                        fVar4.f168813k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i15++;
                }
                m(this.f168840b.f162610e.f168846h);
                m(this.f168840b.f162610e.f168847i);
                return;
            }
            if (i14 != 3) {
                return;
            }
            fVar.f168807e = f.a.BOTTOM;
            while (i15 < aVar.f162691x0) {
                t6.e eVar5 = aVar.f162690w0[i15];
                if (z14 || eVar5.f162623k0 != 8) {
                    f fVar5 = eVar5.f162610e.f168847i;
                    fVar5.f168813k.add(fVar);
                    arrayList.add(fVar5);
                }
                i15++;
            }
            m(this.f168840b.f162610e.f168846h);
            m(this.f168840b.f162610e.f168847i);
        }
    }

    @Override // u6.p
    public final void e() {
        t6.e eVar = this.f168840b;
        if (eVar instanceof t6.a) {
            int i14 = ((t6.a) eVar).f162564y0;
            f fVar = this.f168846h;
            if (i14 == 0 || i14 == 1) {
                eVar.f162607c0 = fVar.f168809g;
            } else {
                eVar.f162609d0 = fVar.f168809g;
            }
        }
    }

    @Override // u6.p
    public final void f() {
        this.f168841c = null;
        this.f168846h.c();
    }

    @Override // u6.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f168846h;
        fVar2.f168813k.add(fVar);
        fVar.f168814l.add(fVar2);
    }
}
