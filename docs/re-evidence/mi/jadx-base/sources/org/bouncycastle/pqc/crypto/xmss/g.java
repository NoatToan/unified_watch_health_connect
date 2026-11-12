package org.bouncycastle.pqc.crypto.xmss;

import defpackage.h3r;

/* JADX INFO: loaded from: classes3.dex */
public class g {
    public static XMSSNode a(e eVar, h3r h3rVar, c cVar) {
        double d;
        if (h3rVar == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (cVar == null) {
            throw new NullPointerException("address == null");
        }
        int iC = eVar.d().c();
        byte[][] bArrA = h3rVar.a();
        XMSSNode[] xMSSNodeArr = new XMSSNode[bArrA.length];
        for (int i = 0; i < bArrA.length; i++) {
            xMSSNodeArr[i] = new XMSSNode(0, bArrA[i]);
        }
        c.b bVarF = new c.b().g(cVar.b()).h(cVar.c()).n(cVar.e()).o(0).p(cVar.g()).f(cVar.a());
        while (true) {
            c cVar2 = (c) bVarF.l();
            if (iC <= 1) {
                return xMSSNodeArr[0];
            }
            int i2 = 0;
            while (true) {
                d = iC / 2;
                if (i2 >= ((int) Math.floor(d))) {
                    break;
                }
                cVar2 = (c) new c.b().g(cVar2.b()).h(cVar2.c()).n(cVar2.e()).o(cVar2.f()).p(i2).f(cVar2.a()).l();
                int i3 = i2 * 2;
                xMSSNodeArr[i2] = b(eVar, xMSSNodeArr[i3], xMSSNodeArr[i3 + 1], cVar2);
                i2++;
            }
            if (iC % 2 == 1) {
                xMSSNodeArr[(int) Math.floor(d)] = xMSSNodeArr[iC - 1];
            }
            iC = (int) Math.ceil(((double) iC) / 2.0d);
            bVarF = new c.b().g(cVar2.b()).h(cVar2.c()).n(cVar2.e()).o(cVar2.f() + 1).p(cVar2.g()).f(cVar2.a());
        }
    }

    public static XMSSNode b(e eVar, XMSSNode xMSSNode, XMSSNode xMSSNode2, f fVar) {
        if (xMSSNode == null) {
            throw new NullPointerException("left == null");
        }
        if (xMSSNode2 == null) {
            throw new NullPointerException("right == null");
        }
        if (xMSSNode.getHeight() != xMSSNode2.getHeight()) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        if (fVar == null) {
            throw new NullPointerException("address == null");
        }
        byte[] bArrF = eVar.f();
        if (fVar instanceof c) {
            c cVar = (c) fVar;
            fVar = (c) new c.b().g(cVar.b()).h(cVar.c()).n(cVar.e()).o(cVar.f()).p(cVar.g()).f(0).l();
        } else if (fVar instanceof b) {
            b bVar = (b) fVar;
            fVar = (b) new b.C1064b().g(bVar.b()).h(bVar.c()).m(bVar.e()).n(bVar.f()).f(0).k();
        }
        byte[] bArrC = eVar.c().c(bArrF, fVar.d());
        if (fVar instanceof c) {
            c cVar2 = (c) fVar;
            fVar = (c) new c.b().g(cVar2.b()).h(cVar2.c()).n(cVar2.e()).o(cVar2.f()).p(cVar2.g()).f(1).l();
        } else if (fVar instanceof b) {
            b bVar2 = (b) fVar;
            fVar = (b) new b.C1064b().g(bVar2.b()).h(bVar2.c()).m(bVar2.e()).n(bVar2.f()).f(1).k();
        }
        byte[] bArrC2 = eVar.c().c(bArrF, fVar.d());
        if (fVar instanceof c) {
            c cVar3 = (c) fVar;
            fVar = (c) new c.b().g(cVar3.b()).h(cVar3.c()).n(cVar3.e()).o(cVar3.f()).p(cVar3.g()).f(2).l();
        } else if (fVar instanceof b) {
            b bVar3 = (b) fVar;
            fVar = (b) new b.C1064b().g(bVar3.b()).h(bVar3.c()).m(bVar3.e()).n(bVar3.f()).f(2).k();
        }
        byte[] bArrC3 = eVar.c().c(bArrF, fVar.d());
        int iB = eVar.d().b();
        byte[] bArr = new byte[iB * 2];
        for (int i = 0; i < iB; i++) {
            bArr[i] = (byte) (xMSSNode.getValue()[i] ^ bArrC2[i]);
        }
        for (int i2 = 0; i2 < iB; i2++) {
            bArr[i2 + iB] = (byte) (xMSSNode2.getValue()[i2] ^ bArrC3[i2]);
        }
        return new XMSSNode(xMSSNode.getHeight(), eVar.c().b(bArrC, bArr));
    }
}
