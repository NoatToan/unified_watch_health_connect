package org.bouncycastle.pqc.crypto.xmss;

import defpackage.bsr;
import defpackage.fsr;
import defpackage.h3r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class BDS implements Serializable {
    private static final long serialVersionUID = 1;
    private List<XMSSNode> authenticationPath;
    private int index;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f29511k;
    private Map<Integer, XMSSNode> keep;
    private Map<Integer, LinkedList<XMSSNode>> retain;
    private XMSSNode root;
    private Stack<XMSSNode> stack;
    private final List<a> treeHashInstances;
    private final int treeHeight;
    private boolean used;
    private transient e wotsPlus;

    public BDS(bsr bsrVar, int i) {
        this(bsrVar.f(), bsrVar.d(), bsrVar.e());
        this.index = i;
        this.used = true;
    }

    private a getBDSTreeHashInstanceForUpdate() {
        a aVar = null;
        for (a aVar2 : this.treeHashInstances) {
            if (!aVar2.e() && aVar2.f() && (aVar == null || aVar2.a() < aVar.a() || (aVar2.a() == aVar.a() && aVar2.b() < aVar.b()))) {
                aVar = aVar2;
            }
        }
        return aVar;
    }

    private void initialize(byte[] bArr, byte[] bArr2, d dVar) {
        if (dVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        c cVar = (c) new c.b().g(dVar.b()).h(dVar.c()).l();
        b bVar = (b) new b.C1064b().g(dVar.b()).h(dVar.c()).k();
        for (int i = 0; i < (1 << this.treeHeight); i++) {
            dVar = (d) new d.b().g(dVar.b()).h(dVar.c()).p(i).n(dVar.e()).o(dVar.f()).f(dVar.a()).l();
            e eVar = this.wotsPlus;
            eVar.h(eVar.g(bArr2, dVar), bArr);
            h3r h3rVarE = this.wotsPlus.e(dVar);
            cVar = (c) new c.b().g(cVar.b()).h(cVar.c()).n(i).o(cVar.f()).p(cVar.g()).f(cVar.a()).l();
            XMSSNode xMSSNodeA = g.a(this.wotsPlus, h3rVarE, cVar);
            bVar = (b) new b.C1064b().g(bVar.b()).h(bVar.c()).n(i).f(bVar.a()).k();
            while (!this.stack.isEmpty() && this.stack.peek().getHeight() == xMSSNodeA.getHeight()) {
                int iFloor = (int) Math.floor(i / (1 << xMSSNodeA.getHeight()));
                if (iFloor == 1) {
                    this.authenticationPath.add(xMSSNodeA.clone());
                }
                if (iFloor == 3 && xMSSNodeA.getHeight() < this.treeHeight - this.f29511k) {
                    this.treeHashInstances.get(xMSSNodeA.getHeight()).g(xMSSNodeA.clone());
                }
                if (iFloor >= 3 && (iFloor & 1) == 1 && xMSSNodeA.getHeight() >= this.treeHeight - this.f29511k && xMSSNodeA.getHeight() <= this.treeHeight - 2) {
                    if (this.retain.get(Integer.valueOf(xMSSNodeA.getHeight())) == null) {
                        LinkedList<XMSSNode> linkedList = new LinkedList<>();
                        linkedList.add(xMSSNodeA.clone());
                        this.retain.put(Integer.valueOf(xMSSNodeA.getHeight()), linkedList);
                    } else {
                        this.retain.get(Integer.valueOf(xMSSNodeA.getHeight())).add(xMSSNodeA.clone());
                    }
                }
                b bVar2 = (b) new b.C1064b().g(bVar.b()).h(bVar.c()).m(bVar.e()).n((bVar.f() - 1) / 2).f(bVar.a()).k();
                XMSSNode xMSSNodeB = g.b(this.wotsPlus, this.stack.pop(), xMSSNodeA, bVar2);
                XMSSNode xMSSNode = new XMSSNode(xMSSNodeB.getHeight() + 1, xMSSNodeB.getValue());
                bVar = (b) new b.C1064b().g(bVar2.b()).h(bVar2.c()).m(bVar2.e() + 1).n(bVar2.f()).f(bVar2.a()).k();
                xMSSNodeA = xMSSNode;
            }
            this.stack.push(xMSSNodeA);
        }
        this.root = this.stack.pop();
    }

    private void nextAuthenticationPath(byte[] bArr, byte[] bArr2, d dVar) {
        List<XMSSNode> list;
        XMSSNode xMSSNodeRemoveFirst;
        if (dVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.used) {
            throw new IllegalStateException("index already used");
        }
        if (this.index > (1 << this.treeHeight) - 2) {
            throw new IllegalStateException("index out of bounds");
        }
        c cVar = (c) new c.b().g(dVar.b()).h(dVar.c()).l();
        b bVar = (b) new b.C1064b().g(dVar.b()).h(dVar.c()).k();
        int iB = fsr.b(this.index, this.treeHeight);
        if (((this.index >> (iB + 1)) & 1) == 0 && iB < this.treeHeight - 1) {
            this.keep.put(Integer.valueOf(iB), this.authenticationPath.get(iB).clone());
        }
        if (iB == 0) {
            dVar = (d) new d.b().g(dVar.b()).h(dVar.c()).p(this.index).n(dVar.e()).o(dVar.f()).f(dVar.a()).l();
            e eVar = this.wotsPlus;
            eVar.h(eVar.g(bArr2, dVar), bArr);
            this.authenticationPath.set(0, g.a(this.wotsPlus, this.wotsPlus.e(dVar), (c) new c.b().g(cVar.b()).h(cVar.c()).n(this.index).o(cVar.f()).p(cVar.g()).f(cVar.a()).l()));
        } else {
            int i = iB - 1;
            XMSSNode xMSSNodeB = g.b(this.wotsPlus, this.authenticationPath.get(i), this.keep.get(Integer.valueOf(i)), (b) new b.C1064b().g(bVar.b()).h(bVar.c()).m(i).n(this.index >> iB).f(bVar.a()).k());
            this.authenticationPath.set(iB, new XMSSNode(xMSSNodeB.getHeight() + 1, xMSSNodeB.getValue()));
            this.keep.remove(Integer.valueOf(i));
            for (int i2 = 0; i2 < iB; i2++) {
                if (i2 < this.treeHeight - this.f29511k) {
                    list = this.authenticationPath;
                    xMSSNodeRemoveFirst = this.treeHashInstances.get(i2).c();
                } else {
                    list = this.authenticationPath;
                    xMSSNodeRemoveFirst = this.retain.get(Integer.valueOf(i2)).removeFirst();
                }
                list.set(i2, xMSSNodeRemoveFirst);
            }
            int iMin = Math.min(iB, this.treeHeight - this.f29511k);
            for (int i3 = 0; i3 < iMin; i3++) {
                int i4 = this.index + 1 + ((1 << i3) * 3);
                if (i4 < (1 << this.treeHeight)) {
                    this.treeHashInstances.get(i3).d(i4);
                }
            }
        }
        for (int i5 = 0; i5 < ((this.treeHeight - this.f29511k) >> 1); i5++) {
            a bDSTreeHashInstanceForUpdate = getBDSTreeHashInstanceForUpdate();
            if (bDSTreeHashInstanceForUpdate != null) {
                bDSTreeHashInstanceForUpdate.h(this.stack, this.wotsPlus, bArr, bArr2, dVar);
            }
        }
        this.index++;
    }

    public List<XMSSNode> getAuthenticationPath() {
        ArrayList arrayList = new ArrayList();
        Iterator<XMSSNode> it = this.authenticationPath.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().clone());
        }
        return arrayList;
    }

    public int getIndex() {
        return this.index;
    }

    public BDS getNextState(byte[] bArr, byte[] bArr2, d dVar) {
        return new BDS(this, bArr, bArr2, dVar);
    }

    public XMSSNode getRoot() {
        return this.root.clone();
    }

    public int getTreeHeight() {
        return this.treeHeight;
    }

    public boolean isUsed() {
        return this.used;
    }

    public void setXMSS(bsr bsrVar) {
        if (this.treeHeight != bsrVar.d()) {
            throw new IllegalStateException("wrong height");
        }
        this.wotsPlus = bsrVar.f();
    }

    public void validate() {
        if (this.authenticationPath == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.retain == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.stack == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.treeHashInstances == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (this.keep == null) {
            throw new IllegalStateException("keep == null");
        }
        if (!fsr.l(this.treeHeight, this.index)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    public BDS(bsr bsrVar, byte[] bArr, byte[] bArr2, d dVar) {
        this(bsrVar.f(), bsrVar.d(), bsrVar.e());
        initialize(bArr, bArr2, dVar);
    }

    public BDS(bsr bsrVar, byte[] bArr, byte[] bArr2, d dVar, int i) {
        this(bsrVar.f(), bsrVar.d(), bsrVar.e());
        initialize(bArr, bArr2, dVar);
        while (this.index < i) {
            nextAuthenticationPath(bArr, bArr2, dVar);
            this.used = false;
        }
    }

    private BDS(BDS bds, byte[] bArr, byte[] bArr2, d dVar) {
        this.wotsPlus = bds.wotsPlus;
        this.treeHeight = bds.treeHeight;
        this.f29511k = bds.f29511k;
        this.root = bds.root;
        this.authenticationPath = new ArrayList(bds.authenticationPath);
        this.retain = bds.retain;
        this.stack = (Stack) bds.stack.clone();
        this.treeHashInstances = bds.treeHashInstances;
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        nextAuthenticationPath(bArr, bArr2, dVar);
        bds.used = true;
    }

    private BDS(e eVar, int i, int i2) {
        this.wotsPlus = eVar;
        this.treeHeight = i;
        this.f29511k = i2;
        if (i2 <= i && i2 >= 2) {
            int i3 = i - i2;
            if (i3 % 2 == 0) {
                this.authenticationPath = new ArrayList();
                this.retain = new TreeMap();
                this.stack = new Stack<>();
                this.treeHashInstances = new ArrayList();
                for (int i4 = 0; i4 < i3; i4++) {
                    this.treeHashInstances.add(new a(i4));
                }
                this.keep = new TreeMap();
                this.index = 0;
                this.used = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }
}
