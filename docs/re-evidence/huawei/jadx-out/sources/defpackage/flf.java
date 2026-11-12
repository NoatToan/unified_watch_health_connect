package defpackage;

import com.huawei.health.hwhealthtrackalgo.c;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class flf extends c {
    private LinkedList<fku> d;
    private fla e;

    @Override // com.huawei.health.hwhealthtrackalgo.a
    public final int a(fku fkuVar) {
        if (fkuVar == null) {
            return 2;
        }
        LinkedList<fku> linkedListB = this.f7136a.b();
        this.d = linkedListB;
        if (linkedListB.size() == 0) {
            return 2;
        }
        fku last = this.d.getLast();
        float fG = (fkuVar.g() - last.g()) / 1000.0f;
        float fB = fkx.b(last, fkuVar);
        if (fB >= this.e.e()) {
            return 2;
        }
        StringBuilder sbJ = this.f7136a.j();
        sbJ.append("; GpsTime=");
        sbJ.append(fkuVar.g());
        sbJ.append(",timeInterval=");
        sbJ.append(fG);
        sbJ.append(",distanceInterval=");
        sbJ.append(fB);
        sbJ.append(">>>FilterAlgoShortDistance");
        return 1;
    }

    public flf(fkw fkwVar) {
        super(fkwVar);
        this.e = this.f7136a.i();
    }
}
