package tb0;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163647a;

        static {
            int[] iArr = new int[d90.j.values().length];
            try {
                iArr[d90.j.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d90.j.LOTTIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f163647a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b6  */
    public static final void a(String str, String str2, String str3, o90.a aVar, d90.i iVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        String str4;
        o0 o0Var;
        int i15;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-674217071);
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.B(aVar) ? 2048 : 1024) | (o0VarE.B(iVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar) ? 8388608 : 4194304);
        if (o0VarE.n(i16 & 1, (i16 & 4793491) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            int i17 = a.f163647a[iVar.f58474a.ordinal()];
            p3.m.a aVar4 = p3.m.f135153a;
            if (i17 == 1) {
                str4 = str3;
                o0VarE.C(1961646537);
                int i18 = i16 & 112;
                boolean z14 = ((i16 & 14) == 4) | (i18 == 32) | ((i16 & 896) == 256);
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new sg0.j(str, 20, str2, str4);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new sg0.j(str, 20, str2, str4);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar5 = (e23.a) objQ;
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(w.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar5);
                o0VarE.g0(false);
                int i19 = i16 >> 6;
                o0Var = o0VarE;
                k.b((w) u1VarResolveViewModel, str2, aVar, aVar2, aVar3, lVar, o0Var, i18 | ((i16 >> 3) & 896) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752));
                o0Var.g0(false);
            } else {
                if (i17 != 2) {
                    throw kg.f.h(o0VarE, 617466985, false);
                }
                o0VarE.C(1962196260);
                StringQualifier stringQualifierNamed = QualifierKt.named("PairTutorial");
                int i24 = i16 & 112;
                boolean z15 = ((i16 & 14) == 4) | (i24 == 32) | ((i16 & 896) == 256) | ((i16 & 7168) == 2048) | ((i16 & 57344) == 16384);
                Object objQ2 = o0VarE.q();
                if (z15) {
                    i15 = i16;
                    p50.d dVar = new p50.d(str, str2, str3, aVar, iVar, 12);
                    o0VarE.K(dVar);
                    objQ2 = dVar;
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        i15 = i16;
                        p50.d dVar2 = new p50.d(str, str2, str3, aVar, iVar, 12);
                        o0VarE.K(dVar2);
                        objQ2 = dVar2;
                    } else {
                        i15 = i16;
                    }
                }
                e23.a aVar6 = (e23.a) objQ2;
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(y.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), stringQualifierNamed, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar6);
                o0VarE.g0(false);
                int i25 = i15 >> 6;
                o0Var = o0VarE;
                str4 = str3;
                l.a((y) u1VarResolveViewModel2, str2, aVar, aVar2, aVar3, lVar, o0Var, ((i15 >> 3) & 896) | i24 | (i25 & 7168) | (i25 & 57344) | (i25 & 458752));
                o0Var.g0(false);
            }
        } else {
            str4 = str3;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dd1.d(str, str2, str4, aVar, iVar, aVar2, aVar3, lVar, i14, 27);
        }
    }
}
