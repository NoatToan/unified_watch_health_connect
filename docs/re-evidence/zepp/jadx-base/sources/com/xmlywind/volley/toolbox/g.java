package com.xmlywind.volley.toolbox;

import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class g {
    public final com.xmlywind.volley.m a;
    private final int b;
    private final LinkedList<a> c = new LinkedList<>();

    public class a {
        public f.a a;
        public int b;
        private f d;
        private d e;

        public a(d dVar, f.a aVar) {
            this.a = aVar;
            this.e = dVar;
        }

        public boolean a() {
            if (this.b == 0) {
                f fVarB = g.this.b(this.e, new f.a() { // from class: com.xmlywind.volley.toolbox.g.a.1
                    public boolean a;

                    @Override // com.xmlywind.volley.toolbox.f.a
                    public void a(d dVar) {
                        a aVar = a.this;
                        aVar.b = 3;
                        f.a aVar2 = aVar.a;
                        if (aVar2 != null && !this.a) {
                            aVar2.a(dVar);
                        }
                        a aVar3 = a.this;
                        g.this.a(aVar3);
                    }

                    @Override // com.xmlywind.volley.toolbox.f.a
                    public void a(d dVar, long j, long j2) {
                        f.a aVar = a.this.a;
                        if (aVar != null) {
                            aVar.a(dVar, j, j2);
                        }
                    }

                    @Override // com.xmlywind.volley.toolbox.f.a
                    public void b(d dVar) {
                        this.a = true;
                        f.a aVar = a.this.a;
                        if (aVar != null) {
                            aVar.b(dVar);
                        }
                        a aVar2 = a.this;
                        g.this.a(aVar2);
                    }

                    @Override // com.xmlywind.volley.toolbox.f.a
                    public void c(d dVar) {
                        f.a aVar = a.this.a;
                        if (aVar != null && !this.a) {
                            aVar.c(dVar);
                        }
                        a aVar2 = a.this;
                        g.this.a(aVar2);
                    }
                });
                this.d = fVarB;
                this.b = 1;
                com.xmlywind.volley.m mVar = g.this.a;
                if (mVar != null) {
                    mVar.a(fVarB);
                    return true;
                }
            }
            return false;
        }

        public boolean b() {
            return this.b == 1;
        }

        public String c() {
            return this.e.a;
        }

        public String d() {
            return this.e.c;
        }

        public f.a e() {
            return this.a;
        }

        public d f() {
            return this.e;
        }

        public boolean g() {
            int i = this.b;
            if (i == 0) {
                this.b = 4;
                g.this.a(this);
                f.a aVar = this.a;
                if (aVar != null) {
                    aVar.b(this.e);
                }
            } else {
                if (i == 4 || i == 3) {
                    return false;
                }
                if (i == 1) {
                    this.d.j();
                }
                this.b = 4;
                g.this.a(this);
            }
            return true;
        }
    }

    public g(com.xmlywind.volley.m mVar, int i) {
        this.b = i;
        this.a = mVar;
    }

    private void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("FileDownloader must be invoked from the main thread.");
        }
    }

    public a a(d dVar, f.a aVar) {
        d();
        a aVarA = a(dVar.c, dVar.a);
        if (aVarA == null) {
            aVarA = new a(dVar, aVar);
            synchronized (this.c) {
                this.c.add(aVarA);
            }
            a();
        }
        return aVarA;
    }

    public a a(String str, String str2) {
        synchronized (this.c) {
            for (a aVar : this.c) {
                if (aVar.d().equals(str) && aVar.c().equals(str2)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public void a() {
        synchronized (this.c) {
            Iterator<a> it2 = this.c.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (it2.next().b()) {
                    i++;
                }
            }
            if (i < this.b) {
                Iterator<a> it3 = this.c.iterator();
                while (it3.hasNext() && (!it3.next().a() || (i = i + 1) != this.b)) {
                }
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.c) {
            this.c.remove(aVar);
        }
        a();
    }

    public f b(d dVar, f.a aVar) {
        return new f(dVar, aVar);
    }

    public void b() {
        synchronized (this.c) {
            while (this.c.size() > 0) {
                this.c.get(0).g();
            }
        }
    }

    public List<a> c() {
        LinkedList<a> linkedList;
        synchronized (this.c) {
            linkedList = this.c;
        }
        return linkedList;
    }
}
