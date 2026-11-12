package t6;

/* JADX INFO: loaded from: classes.dex */
public class l extends i {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f162693y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f162694z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public int D0 = 0;
    public boolean E0 = false;
    public int F0 = 0;
    public int G0 = 0;
    public final u6.b.a H0 = new u6.b.a();
    public u6.b.InterfaceC3163b I0 = null;

    @Override // t6.i
    public final void Z() {
        for (int i14 = 0; i14 < this.f162691x0; i14++) {
            e eVar = this.f162690w0[i14];
            if (eVar != null) {
                eVar.I = true;
            }
        }
    }

    public void a0(int i14, int i15, int i16, int i17) {
    }

    public final void b0(e eVar, e.b bVar, int i14, e.b bVar2, int i15) {
        u6.b.InterfaceC3163b interfaceC3163b;
        e eVar2;
        while (true) {
            interfaceC3163b = this.I0;
            if (interfaceC3163b != null || (eVar2 = this.X) == null) {
                break;
            } else {
                this.I0 = ((f) eVar2).A0;
            }
        }
        u6.b.a aVar = this.H0;
        aVar.f168783a = bVar;
        aVar.f168784b = bVar2;
        aVar.f168785c = i14;
        aVar.f168786d = i15;
        interfaceC3163b.a(eVar, aVar);
        eVar.T(aVar.f168787e);
        eVar.O(aVar.f168788f);
        eVar.G = aVar.f168790h;
        eVar.K(aVar.f168789g);
    }
}
