package org.bouncycastle.pqc.crypto.xmss;

import java.io.Serializable;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMSSNode f29512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29513b;
    public int c;
    public int d;
    public boolean e = false;
    public boolean f = false;

    public a(int i) {
        this.f29513b = i;
    }

    public int a() {
        if (!this.e || this.f) {
            return Integer.MAX_VALUE;
        }
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public XMSSNode c() {
        return this.f29512a.clone();
    }

    public void d(int i) {
        this.f29512a = null;
        this.c = this.f29513b;
        this.d = i;
        this.e = true;
        this.f = false;
    }

    public boolean e() {
        return this.f;
    }

    public boolean f() {
        return this.e;
    }

    public void g(XMSSNode xMSSNode) {
        this.f29512a = xMSSNode;
        int height = xMSSNode.getHeight();
        this.c = height;
        if (height == this.f29513b) {
            this.f = true;
        }
    }

    public void h(Stack<XMSSNode> stack, e eVar, byte[] bArr, byte[] bArr2, d dVar) {
        if (dVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.f || !this.e) {
            throw new IllegalStateException("finished or not initialized");
        }
        d dVar2 = (d) new d.b().g(dVar.b()).h(dVar.c()).p(this.d).n(dVar.e()).o(dVar.f()).f(dVar.a()).l();
        c cVar = (c) new c.b().g(dVar2.b()).h(dVar2.c()).n(this.d).l();
        b bVar = (b) new b.C1064b().g(dVar2.b()).h(dVar2.c()).n(this.d).k();
        eVar.h(eVar.g(bArr2, dVar2), bArr);
        XMSSNode xMSSNodeA = g.a(eVar, eVar.e(dVar2), cVar);
        while (!stack.isEmpty() && stack.peek().getHeight() == xMSSNodeA.getHeight() && stack.peek().getHeight() != this.f29513b) {
            b bVar2 = (b) new b.C1064b().g(bVar.b()).h(bVar.c()).m(bVar.e()).n((bVar.f() - 1) / 2).f(bVar.a()).k();
            XMSSNode xMSSNodeB = g.b(eVar, stack.pop(), xMSSNodeA, bVar2);
            XMSSNode xMSSNode = new XMSSNode(xMSSNodeB.getHeight() + 1, xMSSNodeB.getValue());
            bVar = (b) new b.C1064b().g(bVar2.b()).h(bVar2.c()).m(bVar2.e() + 1).n(bVar2.f()).f(bVar2.a()).k();
            xMSSNodeA = xMSSNode;
        }
        XMSSNode xMSSNode2 = this.f29512a;
        if (xMSSNode2 == null) {
            this.f29512a = xMSSNodeA;
        } else if (xMSSNode2.getHeight() == xMSSNodeA.getHeight()) {
            b bVar3 = (b) new b.C1064b().g(bVar.b()).h(bVar.c()).m(bVar.e()).n((bVar.f() - 1) / 2).f(bVar.a()).k();
            xMSSNodeA = new XMSSNode(this.f29512a.getHeight() + 1, g.b(eVar, this.f29512a, xMSSNodeA, bVar3).getValue());
            this.f29512a = xMSSNodeA;
        } else {
            stack.push(xMSSNodeA);
        }
        if (this.f29512a.getHeight() == this.f29513b) {
            this.f = true;
        } else {
            this.c = xMSSNodeA.getHeight();
            this.d++;
        }
    }
}
