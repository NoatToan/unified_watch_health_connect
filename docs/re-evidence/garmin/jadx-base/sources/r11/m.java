package r11;

import b63.o;
import c2.n0;
import c2.n3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import i3.fe;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149398a;

        static {
            int[] iArr = new int[q11.a.values().length];
            try {
                iArr[q11.a.MOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q11.a.COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q11.a.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f149398a = iArr;
        }
    }

    public static final void a(v21.e eVar, fe feVar, q11.a aVar, o oVar, i53.c cVar, Set set, p pVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        o0 o0Var;
        v21.e eVar2;
        v21.e eVar3;
        feVar.getClass();
        aVar.getClass();
        oVar.getClass();
        set.getClass();
        pVar.getClass();
        o0 o0VarP = fb1.c.p(aVar2, aVar3, mVar, -1867293395);
        int i15 = (i14 & 6) == 0 ? i14 | 2 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarP.B(feVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarP.k(aVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarP.r(oVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarP.r(cVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarP.r(set) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarP.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarP.r(aVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarP.r(aVar3) ? 67108864 : 33554432;
        }
        if (o0VarP.n(i15 & 1, (38347923 & i15) != 38347922)) {
            o0VarP.G0();
            if ((i14 & 1) == 0 || o0VarP.o0()) {
                eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
            } else {
                o0VarP.e();
                eVar3 = eVar;
            }
            o0VarP.h0();
            x1 x1Var = n.f135158a;
            z3.e eVarC = z3.f.c(1181518258, new pp.g(set, 14, aVar, aVar3), o0VarP);
            z3.e eVarC2 = z3.f.c(-1887783245, new p21.b(feVar, 9), o0VarP);
            n0 n0Var = n3.f22788a;
            v21.e eVar4 = eVar3;
            eVar2 = eVar4;
            o0Var = o0VarP;
            z02.d.a(false, eVarC, eVarC2, null, new n0(0, 0, 0, 0), z3.f.c(1789214134, new k(set, aVar, eVar4, oVar, cVar, pVar, aVar2, 0), o0VarP), o0Var, 197040, 9);
        } else {
            o0Var = o0VarP;
            o0Var.e();
            eVar2 = eVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(eVar2, feVar, aVar, oVar, cVar, set, pVar, aVar2, aVar3, i14);
        }
    }
}
