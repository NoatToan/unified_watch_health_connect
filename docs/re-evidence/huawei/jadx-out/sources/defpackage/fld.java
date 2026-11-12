package defpackage;

import com.huawei.health.hwhealthtrackalgo.c;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class fld extends c {
    private fla d;
    private LinkedList<fku> e;

    @Override // com.huawei.health.hwhealthtrackalgo.a
    public final int a(fku fkuVar) {
        if (fkuVar != null && this.d != null) {
            LinkedList<fku> linkedListB = this.f7136a.b();
            this.e = linkedListB;
            if (linkedListB.size() == 0) {
                return 2;
            }
            float fG = (fkuVar.g() - this.e.getLast().g()) / 1000.0f;
            if (fG < this.d.j()) {
                StringBuilder sbJ = this.f7136a.j();
                sbJ.append("; GpsTime=");
                sbJ.append(fkuVar.g());
                sbJ.append(",timeInterval=");
                sbJ.append(fG);
                sbJ.append(">>>FilterAlgoTime");
                return 1;
            }
        }
        return 2;
    }

    public fld(fkw fkwVar) {
        super(fkwVar);
        this.d = this.f7136a.i();
    }
}
