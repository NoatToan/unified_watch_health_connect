package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fss extends fsn {
    private String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<fsr> f34499a = new ArrayList();
    private List<fso> e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<fsn> f34501c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34500b = -1;

    public int g() {
        return this.f34500b;
    }

    public void b(int i) {
        this.f34500b = i;
    }

    public String b() {
        return this.d;
    }

    public void e(String str) {
        this.d = str;
    }

    public List<fsr> i() {
        return this.f34499a;
    }

    public void e(fsr fsrVar) {
        if (fsrVar == null || !fsrVar.g()) {
            return;
        }
        this.f34499a.add(fsrVar);
        this.f34501c.add(fsrVar);
    }

    public void b(fso fsoVar) {
        if (fsoVar == null || !fsoVar.i()) {
            return;
        }
        this.e.add(fsoVar);
        this.f34501c.add(fsoVar);
    }

    public List<fso> j() {
        return this.e;
    }

    public List<fsn> a() {
        return this.f34501c;
    }

    public void e() {
        this.f34499a.clear();
        this.e.clear();
        this.f34501c.clear();
        this.d = "";
    }
}
