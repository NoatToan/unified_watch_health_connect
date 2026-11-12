package ta0;

import android.bluetooth.BluetoothDevice;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 {
    public static final void a(String str, o90.a aVar, ArrayList arrayList, e23.l lVar, String str2, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        int i15;
        ArrayList arrayList2;
        e23.l lVar2;
        String str3;
        e23.a aVar4;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(619307227);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            arrayList2 = arrayList;
            i15 |= o0VarE.r(arrayList2) ? 256 : 128;
        } else {
            arrayList2 = arrayList;
        }
        if ((i14 & 3072) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if ((i14 & 24576) == 0) {
            str3 = str2;
            i15 |= o0VarE.B(str3) ? 16384 : 8192;
        } else {
            str3 = str2;
        }
        if ((196608 & i14) == 0) {
            aVar4 = aVar2;
            i15 |= o0VarE.r(aVar4) ? 131072 : 65536;
        } else {
            aVar4 = aVar2;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            da0.p.d("device_discovery_btc_scanning_screen", false, aVar3, null, null, null, z3.f.c(1126020082, new g0(aVar, str, arrayList2, lVar2, str3, aVar4), o0VarE), o0Var, ((i16 >> 12) & 896) | 12582918, 122);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(str, aVar, arrayList, lVar, str2, aVar2, aVar3, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0119  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:91:0x020f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final l90.b bVar, final String str, b bVar2, final e23.l lVar, final e23.a aVar, p3.m mVar, final int i14) {
        p3.o0 o0Var;
        final b bVar3;
        int i15;
        b bVar4;
        int i16;
        int i17;
        bVar.getClass();
        lVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(815319897);
        int i18 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | 128 | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i18 & 1, (i18 & 9363) != 9362)) {
            o0VarE.G0();
            int i19 = i14 & 1;
            p3.m.a aVar2 = p3.m.f135153a;
            if (i19 == 0 || o0VarE.o0()) {
                boolean zR = o0VarE.r(bVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new sg0.w0(bVar, 16);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new sg0.w0(bVar, 16);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar3 = (e23.a) objQ;
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(b.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar3);
                o0VarE.g0(false);
                b bVar5 = (b) u1VarResolveViewModel;
                i15 = i18 & (-897);
                bVar4 = bVar5;
            } else {
                o0VarE.e();
                i15 = i18 & (-897);
                bVar4 = bVar2;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            final b bVar6 = bVar4;
            int i24 = i15;
            p1 p1VarB = s9.c.b(bVar4.f163236c, new va0.a(bVar, null, false, false, 14, null), o0VarE, 0);
            if (((va0.a) p1VarB.getF182175a()).f176569c) {
                o0VarE.C(1155382133);
                Unit unit = Unit.INSTANCE;
                boolean z14 = (i24 & 57344) == 16384;
                Object objQ2 = o0VarE.q();
                if (z14) {
                    objQ2 = new t0(aVar, null);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new t0(aVar, null);
                        o0VarE.K(objQ2);
                    }
                }
                p3.l0.e((e23.p) objQ2, unit, o0VarE);
                o0VarE.g0(false);
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final int i25 = 0;
                    p2VarI0.f135219d = new e23.p(bVar, str, bVar6, lVar, aVar, i14, i25) { // from class: ta0.s0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f163433a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ l90.b f163434b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ String f163435c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ b f163436d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ e23.l f163437e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ e23.a f163438f;

                        {
                            this.f163433a = i25;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f163433a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iT = p3.p0.t(1);
                                    v0.b(this.f163434b, this.f163435c, this.f163436d, this.f163437e, this.f163438f, (p3.m) obj, iT);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iT2 = p3.p0.t(1);
                                    v0.b(this.f163434b, this.f163435c, this.f163436d, this.f163437e, this.f163438f, (p3.m) obj, iT2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            o0VarE.C(1155462857);
            o0VarE.g0(false);
            Unit unit2 = Unit.INSTANCE;
            boolean zR2 = o0VarE.r(bVar6);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new u0(bVar6, null);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new u0(bVar6, null);
                    o0VarE.K(objQ3);
                }
            }
            p3.l0.e((e23.p) objQ3, unit2, o0VarE);
            String str2 = bVar.f111521f;
            o90.a aVar4 = bVar.f111526k;
            List<BluetoothDevice> list = ((va0.a) p1VarB.getF182175a()).f176568b;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String name = ((BluetoothDevice) it.next()).getName();
                if (name != null) {
                    arrayList.add(name);
                }
            }
            boolean zB = o0VarE.B(p1VarB) | ((i24 & 7168) == 2048) | ((i24 & 112) == 32) | o0VarE.r(bVar);
            Object objQ4 = o0VarE.q();
            if (zB) {
                t42.l lVar2 = new t42.l(p1VarB, lVar, str, bVar, 1);
                o0VarE.K(lVar2);
                objQ4 = lVar2;
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    t42.l lVar3 = new t42.l(p1VarB, lVar, str, bVar, 1);
                    o0VarE.K(lVar3);
                    objQ4 = lVar3;
                }
            }
            e23.l lVar4 = (e23.l) objQ4;
            if (((va0.a) p1VarB.getF182175a()).f176570d) {
                i16 = 1156046029;
                i17 = R.string.lbl_refresh;
            } else {
                i16 = 1156111470;
                i17 = R.string.lbl_cancel;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i16, i17, o0VarE, false);
            boolean zB2 = o0VarE.B(p1VarB) | o0VarE.r(bVar6) | ((i24 & 57344) == 16384);
            Object objQ5 = o0VarE.q();
            if (zB2) {
                objQ5 = new sg0.j(bVar6, 18, aVar, p1VarB);
                o0VarE.K(objQ5);
            } else {
                aVar2.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new sg0.j(bVar6, 18, aVar, p1VarB);
                    o0VarE.K(objQ5);
                }
            }
            o0Var = o0VarE;
            a(str2, aVar4, arrayList, lVar4, strJ, (e23.a) objQ5, aVar, o0Var, 3670016 & (i24 << 6));
            x1 x1Var2 = p3.n.f135158a;
            bVar3 = bVar6;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            bVar3 = bVar2;
        }
        p2 p2VarI1 = o0Var.i0();
        if (p2VarI1 != null) {
            final int i26 = 1;
            p2VarI1.f135219d = new e23.p(bVar, str, bVar3, lVar, aVar, i14, i26) { // from class: ta0.s0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f163433a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l90.b f163434b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f163435c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ b f163436d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.l f163437e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.a f163438f;

                {
                    this.f163433a = i26;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f163433a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p3.p0.t(1);
                            v0.b(this.f163434b, this.f163435c, this.f163436d, this.f163437e, this.f163438f, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p3.p0.t(1);
                            v0.b(this.f163434b, this.f163435c, this.f163436d, this.f163437e, this.f163438f, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
