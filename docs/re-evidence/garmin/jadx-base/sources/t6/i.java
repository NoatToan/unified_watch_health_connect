package t6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import u6.o;

/* JADX INFO: loaded from: classes.dex */
public class i extends e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public e[] f162690w0 = new e[4];

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f162691x0 = 0;

    public final void W(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i14 = this.f162691x0 + 1;
        e[] eVarArr = this.f162690w0;
        if (i14 > eVarArr.length) {
            this.f162690w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f162690w0;
        int i15 = this.f162691x0;
        eVarArr2[i15] = eVar;
        this.f162691x0 = i15 + 1;
    }

    public final void X(int i14, ArrayList arrayList, o oVar) {
        for (int i15 = 0; i15 < this.f162691x0; i15++) {
            e eVar = this.f162690w0[i15];
            ArrayList<e> arrayList2 = oVar.f168834a;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
        }
        for (int i16 = 0; i16 < this.f162691x0; i16++) {
            u6.i.a(this.f162690w0[i16], i14, arrayList, oVar);
        }
    }

    public final void Y() {
        this.f162691x0 = 0;
        Arrays.fill(this.f162690w0, (Object) null);
    }

    public void Z() {
    }

    @Override // t6.e
    public void h(e eVar, HashMap<e, e> map) {
        super.h(eVar, map);
        i iVar = (i) eVar;
        this.f162691x0 = 0;
        int i14 = iVar.f162691x0;
        for (int i15 = 0; i15 < i14; i15++) {
            W(map.get(iVar.f162690w0[i15]));
        }
    }
}
