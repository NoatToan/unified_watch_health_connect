package n23;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;

/* JADX INFO: loaded from: classes3.dex */
public class g2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f122471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2.b f122472b;

    public g2(f2 f2Var, f2.b bVar) {
        this.f122471a = f2Var;
        this.f122472b = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        f33.e aVar;
        String string;
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        if (p4.f122571b) {
            Metadata metadata = (Metadata) this.f122471a.f122441d.getAnnotation(Metadata.class);
            if (metadata != null) {
                f33.e.f68703a.getClass();
                g33.g.f75724a.getClass();
                if (metadata.mv().length == 0) {
                    vb.h.s("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
                    return null;
                }
                u33.c cVar = new u33.c(metadata.mv(), (8 & metadata.xi()) != 0);
                boolean zA = cVar.a(1, 1, 0);
                if (!zA) {
                    if (zA) {
                        StringBuilder sb3 = new StringBuilder("while maximum supported version is ");
                        sb3.append(cVar.f168326f ? u33.c.f168324g : u33.c.f168325h);
                        sb3.append(". To support newer versions, update the kotlin-metadata-jvm library.");
                        string = sb3.toString();
                    } else {
                        string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
                    }
                    c22.t.i("Provided Metadata instance has version ", cVar, ", ", string);
                    return null;
                }
                try {
                    int iK = metadata.k();
                    if (iK == 1) {
                        aVar = new f33.e.a(metadata, true);
                    } else if (iK == 2) {
                        aVar = new f33.e.c(metadata, true);
                    } else if (iK == 3) {
                        aVar = new f33.e.f(metadata, true);
                    } else if (iK != 4) {
                        aVar = iK != 5 ? new f33.e.g(metadata, true) : new f33.e.C1421e(metadata, true);
                    } else {
                        aVar = new f33.e.d(metadata, true);
                    }
                    f33.e.a aVar2 = aVar instanceof f33.e.a ? (f33.e.a) aVar : null;
                    if (aVar2 != null) {
                        return aVar2.f68704b;
                    }
                } catch (Throwable th3) {
                    if ((th3 instanceof IllegalArgumentException) || (th3 instanceof VirtualMachineError) || (th3 instanceof ThreadDeath)) {
                        throw th3;
                    }
                    throw new InconsistentKotlinMetadataException("Exception occurred when reading Kotlin metadata", th3);
                }
            }
        } else {
            t23.e eVarA = this.f122472b.a();
            if (eVarA instanceof r23.b) {
                r23.b bVar = (r23.b) eVarA;
                r23.f fVar = bVar.f149949h;
                if (!(fVar instanceof r23.f.a)) {
                    j.u("Unsupported function type kind: ", fVar, " (", eVarA);
                    return null;
                }
                int i14 = bVar.f149950i;
                c33.f fVar2 = new c33.f();
                fVar2.f24202b = am.j.h(i14, "kotlin/Function");
                c33.b bVar2 = c33.b.INTERFACE;
                k23.l<Object>[] lVarArr2 = c33.a.f24123a;
                bVar2.getClass();
                d33.b bVar3 = c33.a.f24126d;
                k23.l<Object>[] lVarArr3 = c33.a.f24123a;
                bVar3.b(fVar2, lVarArr3[9], bVar2);
                c33.h0 h0Var = c33.h0.ABSTRACT;
                h0Var.getClass();
                c33.a.f24124b.b(fVar2, lVarArr3[7], h0Var);
                c33.i0 i0Var = c33.i0.PUBLIC;
                i0Var.getClass();
                c33.a.f24125c.b(fVar2, lVarArr3[8], i0Var);
                ArrayList arrayList = fVar2.f24203c;
                if (1 <= i14) {
                    int i15 = 1;
                    while (true) {
                        arrayList.add(new c33.y(am.j.h(i15, "P"), i15, c33.b0.IN));
                        if (i15 == i14) {
                            break;
                        }
                        i15++;
                    }
                }
                int i16 = i14 + 1;
                arrayList.add(new c33.y("R", i16, c33.b0.OUT));
                c33.w wVar = new c33.w();
                wVar.f24290b = new c33.g.a("kotlin/Function");
                c33.b0 b0Var = c33.b0.INVARIANT;
                c33.w wVar2 = new c33.w();
                wVar2.f24290b = new c33.g.c(i16);
                Unit unit = Unit.INSTANCE;
                wVar.f24291c.add(new c33.z(b0Var, wVar2));
                fVar2.f24204d.add(wVar);
                return fVar2;
            }
            n43.n nVar = eVarA instanceof n43.n ? (n43.n) eVarA : null;
            if (nVar != null) {
                return d33.o.c(nVar.f123654f, nVar.f123661m.f110086b, false, 6);
            }
        }
        return null;
    }
}
