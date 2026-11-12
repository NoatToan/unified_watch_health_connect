package defpackage;

import com.huawei.health.hwhealthtrackalgo.c;
import com.huawei.health.hwhealthtrackalgo.i;
import com.huawei.health.hwhealthtrackalgo.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fkw {
    private i d;
    private fla i;
    private l j;
    private StringBuilder k;
    private int g = 1;
    private int h = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<c> f34152c = new ArrayList<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinkedList<fku> f34151b = new LinkedList<>();
    private LinkedList<fku> e = new LinkedList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedList<fku> f34150a = new LinkedList<>();
    private flh f = new flh();

    public void h() {
        flh flhVar = this.f;
        if (flhVar != null) {
            flhVar.i = null;
        }
    }

    public void d(l lVar) {
        this.j = lVar;
    }

    public final void e(int i) {
        if (i > 2 || i < 0) {
            this.h = 1;
        } else {
            this.h = i;
        }
    }

    public void b(i iVar) {
        this.d = iVar;
    }

    public boolean g() {
        return this.g == 1;
    }

    public StringBuilder j() {
        return this.k;
    }

    public fla i() {
        return this.i;
    }

    public int f() {
        return this.h;
    }

    public LinkedList<fku> e() {
        return this.f34150a;
    }

    public LinkedList<fku> a() {
        return this.e;
    }

    public LinkedList<fku> b() {
        return this.f34151b;
    }

    public void c() {
        this.f34150a.clear();
    }

    public int a(fku fkuVar) {
        this.f.f34168b++;
        e(fkuVar, true);
        int size = this.e.size();
        for (int size2 = this.e.size(); size2 < size; size2++) {
            this.f34150a.add(this.e.get(size2));
        }
        fkx.e(this.e);
        return this.f34150a.size();
    }

    public Map<String, Integer> d() {
        flh flhVar = this.f;
        flhVar.f34169c.put("TotalPoint", Integer.valueOf(flhVar.f34168b));
        flhVar.f34169c.put("FilterAlgoAccuracy", Integer.valueOf(flhVar.f));
        flhVar.f34169c.put("FilterAlgoTime", Integer.valueOf(flhVar.d));
        flhVar.f34169c.put("FilterAlgoShortDistance", Integer.valueOf(flhVar.f34167a));
        flhVar.f34169c.put("FilterAlgoOverSpeed", Integer.valueOf(flhVar.e));
        flhVar.f34169c.put("TotalFilted", Integer.valueOf(flhVar.g));
        return flhVar.f34169c;
    }

    private void k() {
        d(this.i.f() ? new flj(this) : new flc(this));
        d(new fky(this));
        d(new fld(this));
        d(new flf(this));
        d(new fkz(this));
        b(this.i.h() ? new flb(this) : new fle(this));
    }

    private boolean d(fku fkuVar) {
        boolean z;
        Iterator<c> it = this.f34152c.iterator();
        int i = 2;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            c next = it.next();
            int iA = next.a(fkuVar);
            if (iA == 1) {
                this.f.b(iA, next, fkuVar.g());
                i = iA;
                z = true;
                break;
            }
            i = iA;
        }
        if (i != 1) {
            this.f.b(i, null, fkuVar.g());
        }
        return z;
    }

    private int e(fku fkuVar, boolean z) {
        if (this.g == 1) {
            l lVar = this.j;
            if (lVar == null || fkuVar == null) {
                return -1;
            }
            if (lVar.a(fkuVar) == 1) {
                this.g = 2;
                LinkedList<fku> linkedListA = this.j.a();
                if (linkedListA == null) {
                    return -1;
                }
                Iterator<fku> it = linkedListA.iterator();
                while (it.hasNext()) {
                    e(it.next(), false);
                }
                linkedListA.clear();
            }
        } else if (!z || !d(fkuVar)) {
            this.f34151b.add(fkuVar);
            i iVar = this.d;
            if (iVar == null) {
                return -1;
            }
            iVar.a(fkuVar);
            fkx.e(this.f34151b);
        }
        return 0;
    }

    private void d(c cVar) {
        this.f34152c.add(cVar);
    }

    public fkw(fla flaVar, StringBuilder sb, int i) {
        this.k = null;
        this.i = null;
        if (flaVar == null || sb == null) {
            return;
        }
        this.i = flaVar;
        this.k = sb;
        e(i);
        k();
    }
}
