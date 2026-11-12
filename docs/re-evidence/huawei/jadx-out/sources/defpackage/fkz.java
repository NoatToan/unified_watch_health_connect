package defpackage;

import com.huawei.health.hwhealthtrackalgo.c;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class fkz extends c {
    private LinkedList<fku> d;
    private fla e;

    @Override // com.huawei.health.hwhealthtrackalgo.a
    public final int a(fku fkuVar) {
        if (fkuVar == null || this.e == null) {
            return 2;
        }
        int iF = this.f7136a.f();
        LinkedList<fku> linkedListB = this.f7136a.b();
        this.d = linkedListB;
        if (linkedListB.size() == 0) {
            return 2;
        }
        float fC = fkx.c(this.d.getLast(), fkuVar);
        boolean z = fkuVar.d() > this.e.d() && fC > this.e.a() * fkuVar.d();
        if (fC <= this.e.e(iF) && !z) {
            return 2;
        }
        StringBuilder sbJ = this.f7136a.j();
        sbJ.append("; GpsTime=");
        sbJ.append(fkuVar.g());
        sbJ.append(",GpsSpeed=");
        sbJ.append(fkuVar.d());
        sbJ.append(",speed=");
        sbJ.append(fC);
        sbJ.append(">>>FilterAlgoOverSpeed");
        return 1;
    }

    public fkz(fkw fkwVar) {
        super(fkwVar);
        this.e = this.f7136a.i();
    }
}
