package defpackage;

import com.huawei.health.hwhealthtrackalgo.l;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class flj extends l {
    private fla d;
    private LinkedList<fku> e;

    @Override // com.huawei.health.hwhealthtrackalgo.l
    public final LinkedList<fku> a() {
        return this.e;
    }

    @Override // com.huawei.health.hwhealthtrackalgo.a
    public final int a(fku fkuVar) {
        if (fkuVar == null) {
            return 0;
        }
        int iF = this.f7136a.f();
        if (fkuVar.c() > this.d.c()) {
            return 0;
        }
        if (this.e.size() > 0 && fkuVar.g() - this.e.getLast().g() > this.d.i()) {
            this.e.clear();
        }
        this.e.add(fkuVar);
        if (this.e.size() > this.d.b()) {
            this.e.removeFirst();
        }
        if (this.e.size() != this.d.b()) {
            return 0;
        }
        int i = 0;
        while (i < this.d.b() - 1) {
            fku fkuVar2 = this.e.get(i);
            i++;
            if (fkx.c(fkuVar2, this.e.get(i)) > this.d.e(iF)) {
                return 0;
            }
        }
        StringBuilder sbJ = this.f7136a.j();
        sbJ.append("; GpsTime=");
        sbJ.append(fkuVar.g());
        sbJ.append(">>>StartAlgoTriple find start");
        return 1;
    }

    public flj(fkw fkwVar) {
        super(fkwVar);
        this.e = new LinkedList<>();
        this.d = this.f7136a.i();
    }
}
