package l33;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f109692a;

    public a(b bVar) {
        this.f109692a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14;
        boolean zIsEmpty;
        x33.c cVarC;
        o33.o oVar = (o33.o) obj;
        oVar.getClass();
        boolean z15 = false;
        if (this.f109692a.f109706b.invoke(oVar).booleanValue()) {
            if (oVar.w().f202070a.isInterface()) {
                String strB = oVar.getName().b();
                int iHashCode = strB.hashCode();
                if (iHashCode != -1776922004) {
                    if (iHashCode != -1295482945) {
                        if (iHashCode == 147696667 && strB.equals("hashCode")) {
                            zIsEmpty = ((ArrayList) oVar.f()).isEmpty();
                        }
                    } else if (strB.equals("equals")) {
                        o33.w wVar = (o33.w) p13.h0.K0(oVar.f());
                        o33.t type = wVar != null ? wVar.getType() : null;
                        o33.i iVar = type instanceof o33.i ? (o33.i) type : null;
                        if (iVar != null) {
                            o33.h hVarG = iVar.g();
                            if ((hVarG instanceof o33.f) && (cVarC = ((o33.f) hVarG).c()) != null && p005kotlin.jvm.internal.s.g(cVarC.f188596a.f188600a, "java.lang.Object")) {
                                zIsEmpty = true;
                            }
                        }
                    }
                    zIsEmpty = false;
                } else if (strB.equals("toString")) {
                    zIsEmpty = ((ArrayList) oVar.f()).isEmpty();
                } else {
                    zIsEmpty = false;
                }
                if (zIsEmpty) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            if (!z14) {
                z15 = true;
            }
        }
        return Boolean.valueOf(z15);
    }
}
