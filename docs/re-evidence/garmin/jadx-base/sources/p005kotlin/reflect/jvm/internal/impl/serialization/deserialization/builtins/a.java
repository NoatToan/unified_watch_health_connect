package p005kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import b43.i;
import f43.e;
import java.io.IOException;
import java.io.InputStream;
import l43.u;
import o13.p;
import o43.n;
import p005kotlin.jvm.internal.j;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import q23.b;
import t23.c0;
import x33.c;
import z33.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends u implements b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C2041a f105962m = new C2041a(null);

    private a(c cVar, n nVar, c0 c0Var, s33.n nVar2, t33.a aVar, boolean z14) {
        super(cVar, nVar, c0Var, nVar2, aVar, null);
    }

    @Override // w23.k0, w23.o
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("builtins package fragment for ");
        sb3.append(this.f181639e);
        sb3.append(" from ");
        int i14 = e.f68881a;
        c0 c0VarC = i.c(this);
        c0VarC.getClass();
        sb3.append(c0VarC);
        return sb3.toString();
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a$a, reason: collision with other inner class name */
    public static final class C2041a {
        public /* synthetic */ C2041a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:19:0x004f  */
        /* JADX WARN: Multi-variable type inference failed */
        public static a a(c cVar, n nVar, c0 c0Var, InputStream inputStream, boolean z14) throws IOException {
            s33.n nVar2;
            z33.n nVar3;
            cVar.getClass();
            try {
                t33.a.f162236f.getClass();
                t33.a aVarA = t33.a.C3058a.a(inputStream);
                t33.a aVar = t33.a.f162237g;
                int i14 = aVarA.f168292c;
                aVar.getClass();
                int i15 = aVar.f168292c;
                int i16 = aVarA.f168291b;
                int i17 = aVar.f168291b;
                if (i16 == 0) {
                    if (i17 == 0 && i14 == i15) {
                        z33.e eVar = new z33.e();
                        t33.b.a(eVar);
                        s33.n.a aVar2 = s33.n.f156753k;
                        aVar2.getClass();
                        d dVarC = d.c(inputStream);
                        nVar3 = (z33.n) aVar2.a(dVarC, eVar);
                        try {
                            dVarC.a(0);
                            z33.b.b(nVar3);
                            nVar2 = (s33.n) nVar3;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.setUnfinishedMessage(nVar3);
                        }
                    } else {
                        nVar2 = null;
                    }
                } else if (i16 != i17 || i14 > i15) {
                    nVar2 = null;
                } else {
                    z33.e eVar2 = new z33.e();
                    t33.b.a(eVar2);
                    s33.n.a aVar3 = s33.n.f156753k;
                    aVar3.getClass();
                    d dVarC2 = d.c(inputStream);
                    nVar3 = (z33.n) aVar3.a(dVarC2, eVar2);
                    dVarC2.a(0);
                    z33.b.b(nVar3);
                    nVar2 = (s33.n) nVar3;
                }
                p pVar = new p(nVar2, aVarA);
                inputStream.close();
                s33.n nVar4 = (s33.n) pVar.f128594a;
                t33.a aVar4 = (t33.a) pVar.f128595b;
                if (nVar4 != null) {
                    return new a(cVar, nVar, c0Var, nVar4, aVar4, z14, null);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + aVar + ", actual " + aVar4 + ". Please update Kotlin");
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(inputStream, th3);
                    throw th4;
                }
            }
        }

        private C2041a() {
        }
    }

    public /* synthetic */ a(c cVar, n nVar, c0 c0Var, s33.n nVar2, t33.a aVar, boolean z14, j jVar) {
        this(cVar, nVar, c0Var, nVar2, aVar, z14);
    }
}
