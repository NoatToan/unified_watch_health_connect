package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.s7.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes34.dex */
public final class k7 extends e7 {
    public static final int o = 5;
    public static final int p = 2;
    public static final int q = 32;
    public static final /* synthetic */ boolean r = true;
    public int j = 5;
    public int k = 2;
    public int l = 32;
    public final List<b> m = new ArrayList();
    public int n = 2;

    public int k() {
        int i;
        synchronized (this) {
            i = this.l;
        }
        return i;
    }

    public int j() {
        int i;
        synchronized (this) {
            i = this.j;
        }
        return i;
    }

    @Override // com.huawei.hms.network.embedded.e7, com.huawei.hms.network.embedded.o6
    public int h() {
        return this.k;
    }

    public void e(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("max < 1: " + i);
        }
        synchronized (this) {
            this.l = i;
        }
        l();
    }

    public void d(int i) {
        if (i >= 1) {
            this.k = i;
        } else {
            throw new IllegalArgumentException("max < 1: " + i);
        }
    }

    public void c(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("max < 1: " + i);
        }
        synchronized (this) {
            this.j = i;
        }
        l();
    }

    @Override // com.huawei.hms.network.embedded.e7, com.huawei.hms.network.embedded.o6
    public void b(String str, int i, String str2) {
        synchronized (this) {
            Iterator<b> it = this.m.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (next.f15005a.equals(str) && next.f15006b == i && next.f15007c.equals(str2)) {
                    it.remove();
                    break;
                }
            }
        }
    }

    @Override // com.huawei.hms.network.embedded.e7, com.huawei.hms.network.embedded.o6
    public void b(s7 s7Var) {
        a(this.g, s7Var);
    }

    @Override // com.huawei.hms.network.embedded.e7, com.huawei.hms.network.embedded.o6
    public void b(s7.a aVar) {
        synchronized (this) {
            b bVarA = a(aVar.h());
            if (bVarA != null) {
                bVarA.d--;
                bVarA.e--;
                if (aVar.e()) {
                    m7 m7VarK = aVar.h().k();
                    bVarA.f = aVar.d().b(m7VarK.h(), m7VarK.n(), m7VarK.s());
                }
            }
        }
        aVar.c().decrementAndGet();
        a(this.f, aVar);
    }

    @Override // com.huawei.hms.network.embedded.e7, com.huawei.hms.network.embedded.o6
    public void a(String str, int i, String str2) {
        synchronized (this) {
            if (c(str, i, str2) != null) {
                return;
            }
            this.m.add(new b(str, i, str2));
            l();
        }
    }

    @Override // com.huawei.hms.network.embedded.e7, com.huawei.hms.network.embedded.o6
    public void a(s7.a aVar) {
        boolean zA;
        s7.a aVarA;
        synchronized (this) {
            try {
                if (aVar == null) {
                    return;
                }
                b bVarA = a(aVar.h());
                if (bVarA != null) {
                    zA = a(aVar, bVarA);
                } else {
                    c(aVar);
                    zA = false;
                }
                if (!aVar.f().d && (aVarA = a(aVar.g())) != null) {
                    aVar.a(aVarA);
                }
                l();
                if (zA) {
                    b(aVar, bVarA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean l() {
        boolean z;
        int i;
        int iD;
        if (!r && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<s7.a> it = this.e.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                s7.a next = it.next();
                if (this.f.size() >= this.f14730a) {
                    break;
                }
                b bVarA = a(next.h());
                if (bVarA != null) {
                    i = this.l;
                    iD = e(next);
                } else {
                    i = this.j;
                    iD = d(next);
                }
                if (iD < i) {
                    it.remove();
                    next.c().incrementAndGet();
                    arrayList.add(next);
                    this.f.add(next);
                    if (bVarA != null) {
                        bVarA.e++;
                    }
                }
            }
            if (d() <= 0) {
                z = false;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((s7.a) it2.next()).a(i());
        }
        return z;
    }

    private int e(s7.a aVar) {
        int i = 0;
        for (b bVar : this.m) {
            if (bVar.f15005a.equals(aVar.g())) {
                i += bVar.e;
            }
        }
        return i;
    }

    private int d(s7.a aVar) {
        return aVar.c().get() - e(aVar);
    }

    private void c(s7.a aVar) {
        this.e.add(aVar);
    }

    private b c(String str, int i, String str2) {
        for (b bVar : this.m) {
            if (bVar.f15005a.equals(str) && bVar.f15006b == i && bVar.f15007c.equals(str2)) {
                return bVar;
            }
        }
        return null;
    }

    private void b(s7.a aVar, b bVar) {
        int i;
        boolean z;
        synchronized (this) {
            if (bVar.d == this.l + 1) {
                m7 m7VarK = aVar.h().k();
                bVar.f = aVar.d().b(m7VarK.h(), m7VarK.n(), m7VarK.s());
            }
            i = bVar.f;
            if (this.l * i * this.n >= bVar.d || i >= this.k) {
                z = false;
            } else {
                bVar.f++;
                bVar.e++;
                z = true;
            }
        }
        if (z) {
            t6 t6VarA = aVar.d().a(aVar.h().i().b("Http2ConnectionIndex", Integer.toString(i + 1)).a());
            if (t6VarA instanceof s7) {
                s7 s7Var = (s7) t6VarA;
                a aVar2 = new a();
                Objects.requireNonNull(s7Var);
                s7.a aVar3 = s7Var.new a(aVar2);
                aVar3.i();
                synchronized (this) {
                    this.f.add(aVar3);
                }
                aVar3.a(i());
            }
        }
    }

    private boolean a(s7.a aVar, b bVar) {
        if (bVar.d == 0) {
            m7 m7VarK = aVar.h().k();
            if (!aVar.d().c(m7VarK.h(), m7VarK.n(), m7VarK.s())) {
                b(m7VarK.h(), m7VarK.n(), m7VarK.s());
                c(aVar);
                return false;
            }
        }
        bVar.d++;
        this.e.add(aVar);
        return true;
    }

    private <T> void a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f14732c;
        }
        if (l() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public class a implements u6 {
        @Override // com.huawei.hms.network.embedded.u6
        public void onFailure(t6 t6Var, IOException iOException) {
        }

        @Override // com.huawei.hms.network.embedded.u6
        public void onResponse(t6 t6Var, v7 v7Var) throws IOException {
            if (v7Var != null) {
                v7Var.close();
            }
        }

        public a() {
        }
    }

    public final class b {
        public static final /* synthetic */ boolean h = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f15005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f15007c;
        public int d;
        public int e;
        public int f = 1;

        private void a(String str, int i, String str2) {
            if (!h && !Thread.holdsLock(k7.this)) {
                throw new AssertionError();
            }
            Iterator<s7.a> it = k7.this.f.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                m7 m7VarK = it.next().h().k();
                if (m7VarK.h().equals(str) && m7VarK.n() == i && m7VarK.s().equals(str2)) {
                    i2++;
                }
            }
            this.e = i2;
            Iterator<s7.a> it2 = k7.this.e.iterator();
            while (it2.hasNext()) {
                m7 m7VarK2 = it2.next().h().k();
                if (m7VarK2.h().equals(str) && m7VarK2.n() == i && m7VarK2.s().equals(str2)) {
                    i2++;
                }
            }
            this.d = i2;
        }

        public b(String str, int i, String str2) {
            this.f15005a = str;
            this.f15006b = i;
            this.f15007c = str2;
            a(str, i, str2);
        }
    }

    private b a(t7 t7Var) {
        return c(t7Var.k().h(), t7Var.k().n(), t7Var.k().s());
    }

    public k7(ExecutorService executorService) {
        this.d = executorService;
    }

    public k7() {
    }
}
