package defpackage;

import com.huawei.health.hwhealthtrackalgo.l;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class flc extends l {
    private LinkedList<fku> d;
    private fla e;

    @Override // com.huawei.health.hwhealthtrackalgo.l
    public final LinkedList<fku> a() {
        return this.d;
    }

    @Override // com.huawei.health.hwhealthtrackalgo.a
    public final int a(fku fkuVar) {
        if (fkuVar == null || fkuVar.c() > this.e.c()) {
            return 0;
        }
        this.d.add(fkuVar);
        if (this.d.size() > this.e.b()) {
            this.d.removeFirst();
        }
        return this.d.size() == this.e.b() ? 1 : 0;
    }

    public flc(fkw fkwVar) {
        super(fkwVar);
        this.d = new LinkedList<>();
        this.e = this.f7136a.i();
    }
}
