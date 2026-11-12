package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes11.dex */
public class l7q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentMap<Integer, b0d> f24749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentMap<String, o6q> f24750b;
    public ConcurrentMap<Integer, j7q> c;
    public ConcurrentMap<Integer, m7q> d;
    public final k7q e;

    public l7q() {
        this.e = null;
        this.f24750b = new ConcurrentHashMap();
        this.f24749a = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }

    public int a(int i, int i2, int i3, int i4) {
        o6q o6qVar = this.f24750b.get(i + ":" + i2 + ":" + i3 + ":" + i4);
        if (o6qVar != null) {
            return o6qVar.a();
        }
        return -1;
    }

    public int b(int i) {
        j7q j7qVarRemove = this.c.remove(Integer.valueOf(i));
        if (j7qVarRemove == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("UDTTCPServer on port ");
            sb.append(i);
            sb.append(" already closed");
            return -1;
        }
        j7qVarRemove.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UDTTCPServer on port ");
        sb2.append(i);
        sb2.append(" closed");
        return 0;
    }

    public void c() {
        for (o6q o6qVar : this.f24750b.values()) {
            o6qVar.h(true);
            o6qVar.h(false);
        }
        this.f24750b.clear();
        Iterator<j7q> it = this.c.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.c.clear();
        Iterator<m7q> it2 = this.d.values().iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.d.clear();
        this.f24749a.clear();
    }

    public int d(int i) {
        m7q m7qVarRemove = this.d.remove(Integer.valueOf(i));
        if (m7qVarRemove == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("UDTUDPServer on port ");
            sb.append(i);
            sb.append(" already closed");
            return -1;
        }
        m7qVarRemove.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UDTUDPServer on port ");
        sb2.append(i);
        sb2.append(" closed");
        return 0;
    }

    public int e(int i, int i2, int i3, int i4, boolean z) {
        o6q o6qVar = this.f24750b.get(i + ":" + i2 + ":" + i3 + ":" + i4);
        if (o6qVar == null) {
            o6qVar = new o6q(i, i2, i3, i4, this);
            this.f24750b.put(i + ":" + i2 + ":" + i3 + ":" + i4, o6qVar);
        }
        boolean z2 = z && o6qVar.d() == null;
        boolean z3 = !z && o6qVar.e() == null;
        if (z2 || z3) {
            return o6qVar.b(z);
        }
        return 0;
    }

    public void f(int i, int i2, int i3, int i4, boolean z) {
        b0d b0dVar;
        k7q k7qVar = this.e;
        if (k7qVar != null) {
            k7qVar.a(i2, i3, i4, z);
            return;
        }
        ConcurrentMap<Integer, b0d> concurrentMap = this.f24749a;
        if (concurrentMap == null || (b0dVar = concurrentMap.get(Integer.valueOf(i))) == null) {
            return;
        }
        try {
            b0dVar.o0(i2, i3, i4, z);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.toString());
        }
    }

    public void g(int i, int i2, int i3, int i4, boolean z) {
        b0d b0dVar;
        k7q k7qVar = this.e;
        if (k7qVar != null) {
            k7qVar.b(i2, i3, i4, z);
            return;
        }
        ConcurrentMap<Integer, b0d> concurrentMap = this.f24749a;
        if (concurrentMap == null || (b0dVar = concurrentMap.get(Integer.valueOf(i))) == null) {
            return;
        }
        try {
            b0dVar.a4(i2, i3, i4, z);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.toString());
        }
    }

    public void h(int i, int i2, int i3, int i4, byte[] bArr, int i5) {
        b0d b0dVar;
        k7q k7qVar = this.e;
        if (k7qVar != null) {
            k7qVar.c(i, i2, i3, bArr, i5);
            return;
        }
        ConcurrentMap<Integer, b0d> concurrentMap = this.f24749a;
        if (concurrentMap == null || (b0dVar = concurrentMap.get(Integer.valueOf(i4))) == null) {
            return;
        }
        try {
            b0dVar.z3(i, i2, i3, bArr, i5);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.toString());
        }
    }

    public void i(int i, int i2, int i3, int i4, byte[] bArr, int i5) {
        b0d b0dVar;
        k7q k7qVar = this.e;
        if (k7qVar != null) {
            k7qVar.d(i, i2, i3, bArr, i5);
            return;
        }
        ConcurrentMap<Integer, b0d> concurrentMap = this.f24749a;
        if (concurrentMap == null || (b0dVar = concurrentMap.get(Integer.valueOf(i4))) == null) {
            return;
        }
        try {
            b0dVar.f1(i, i2, i3, bArr, i5);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.toString());
        }
    }

    public void j(int i, int i2, int i3, int i4, byte[] bArr, int i5) {
        b0d b0dVar;
        k7q k7qVar = this.e;
        if (k7qVar != null) {
            k7qVar.e(i, i2, i3, bArr, i5);
            return;
        }
        ConcurrentMap<Integer, b0d> concurrentMap = this.f24749a;
        if (concurrentMap == null || (b0dVar = concurrentMap.get(Integer.valueOf(i4))) == null) {
            return;
        }
        try {
            b0dVar.e0(i, i2, i3, bArr, i5);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.toString());
        }
    }

    public void k(int i, int i2, int i3, int i4) {
        b0d b0dVar;
        k7q k7qVar = this.e;
        if (k7qVar != null) {
            k7qVar.f(i, i2, i3);
            return;
        }
        ConcurrentMap<Integer, b0d> concurrentMap = this.f24749a;
        if (concurrentMap == null || (b0dVar = concurrentMap.get(Integer.valueOf(i4))) == null) {
            return;
        }
        try {
            b0dVar.V3(i, i2, i3);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.toString());
        }
    }

    public void l(int i, int i2, int i3, int i4) {
        b0d b0dVar;
        k7q k7qVar = this.e;
        if (k7qVar != null) {
            k7qVar.g(i2, i3, i4);
            return;
        }
        ConcurrentMap<Integer, b0d> concurrentMap = this.f24749a;
        if (concurrentMap == null || (b0dVar = concurrentMap.get(Integer.valueOf(i))) == null) {
            return;
        }
        try {
            b0dVar.T0(i2, i3, i4);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.toString());
        }
    }

    public int m(int i, b0d b0dVar) {
        if (this.f24749a.get(Integer.valueOf(i)) == null) {
            this.f24749a.put(Integer.valueOf(i), b0dVar);
            return 0;
        }
        this.f24749a.remove(Integer.valueOf(i));
        this.f24749a.put(Integer.valueOf(i), b0dVar);
        return -1;
    }

    public void n(int i, int i2, int i3, int i4, f7q f7qVar, h7q h7qVar) {
        o6q o6qVar = this.f24750b.get(i + ":" + i2 + ":" + i3 + ":" + i4);
        if (o6qVar != null) {
            o6qVar.f(f7qVar, h7qVar);
            return;
        }
        o6q o6qVar2 = new o6q(i, i2, i3, i4, this);
        o6qVar2.f(f7qVar, h7qVar);
        this.f24750b.put(i + ":" + i2 + ":" + i3 + ":" + i4, o6qVar2);
    }

    public void o(int i, int i2, int i3, int i4, i7q i7qVar, h7q h7qVar) {
        o6q o6qVar = this.f24750b.get(i + ":" + i2 + ":" + i3 + ":" + i4);
        if (o6qVar != null) {
            o6qVar.g(i7qVar, h7qVar);
            return;
        }
        o6q o6qVar2 = new o6q(i, i2, i3, i4, this);
        o6qVar2.g(i7qVar, h7qVar);
        this.f24750b.put(i + ":" + i2 + ":" + i3 + ":" + i4, o6qVar2);
    }

    public int p(int i) {
        return this.f24749a.remove(Integer.valueOf(i)) != null ? 0 : -1;
    }

    public int q(int i, int i2, int i3, int i4, boolean z) {
        String str = i + ":" + i2 + ":" + i3 + ":" + i4;
        o6q o6qVar = this.f24750b.get(str);
        if (o6qVar == null) {
            return 0;
        }
        o6qVar.h(z);
        if (o6qVar.d() != null || o6qVar.e() != null) {
            return -1;
        }
        this.f24750b.remove(str);
        return -1;
    }

    public int r(int i, int i2, int i3, int i4, byte[] bArr) {
        o6q o6qVar = this.f24750b.get(i + ":" + i2 + ":" + i3 + ":" + i4);
        if (o6qVar != null) {
            return o6qVar.l(i, i4, bArr);
        }
        return -1;
    }

    public int s(int i, int i2, int i3, int i4, byte[] bArr) {
        o6q o6qVar = this.f24750b.get(i + ":" + i2 + ":" + i3 + ":" + i4);
        if (o6qVar != null) {
            return o6qVar.m(i, i4, bArr);
        }
        return -1;
    }

    public int t(int i, int i2, int i3, int i4, byte[] bArr) {
        return -1;
    }

    public int u(int i) {
        if (this.c.get(Integer.valueOf(i)) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("UDTTCPServer on port ");
            sb.append(i);
            sb.append(" already start!");
            return -1;
        }
        j7q j7qVar = new j7q(this, i);
        new Thread(j7qVar).start();
        this.c.put(Integer.valueOf(i), j7qVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UDTTCPServer on port ");
        sb2.append(i);
        sb2.append(" start!");
        return 0;
    }

    public void v() {
    }

    public int w(int i) {
        if (this.d.get(Integer.valueOf(i)) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("UDTUDPServer on port ");
            sb.append(i);
            sb.append(" already start!");
            return -1;
        }
        m7q m7qVar = new m7q(this, i);
        new Thread(m7qVar).start();
        this.d.put(Integer.valueOf(i), m7qVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UDTUDPServer on port ");
        sb2.append(i);
        sb2.append(" start!");
        return 0;
    }

    public l7q(k7q k7qVar) {
        this.e = k7qVar;
        this.f24750b = new ConcurrentHashMap();
        this.f24749a = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }
}
