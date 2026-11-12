package defpackage;

import com.huawei.health.hwhealthtrackalgo.c;

/* JADX INFO: loaded from: classes7.dex */
public final class fky extends c {
    private fla d;

    @Override // com.huawei.health.hwhealthtrackalgo.a
    public final int a(fku fkuVar) {
        if (this.d == null || fkuVar.c() < this.d.c()) {
            return 2;
        }
        StringBuilder sbJ = this.f7136a.j();
        sbJ.append("; GpsTime=");
        sbJ.append(fkuVar.g());
        sbJ.append(",accuracy=");
        sbJ.append(fkuVar.c());
        sbJ.append(">>>FilterAlgoAccuracy");
        return 1;
    }

    public fky(fkw fkwVar) {
        super(fkwVar);
        this.d = this.f7136a.i();
    }
}
