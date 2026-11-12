package com.garmin.android.apps.connectmobile.developer.tutorials;

import a11.g0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.R;
import d90.h;
import d90.i;
import d90.j;
import h82.p;
import i3.d6;
import iz1.f;
import k62.l;
import o13.m;
import o13.t;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import tb0.k;
import tb0.q;
import tb0.w;
import tb0.y;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0558a f33708e = new C0558a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33709a = m.b(new k80.b(this, 7));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33710b = m.b(new k80.b(this, 8));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33711c = m.b(new k80.b(this, 9));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33712d = m.b(new k80.b(this, 10));

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33721a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.LOTTIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f33721a = iArr;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_composable_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ((ComposeView) view2.findViewById(R.id.composable_container)).setContent(new e(1282736976, true, new k80.c(this, new f(this, 19), 0)));
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:115:0x021e  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x013d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0158  */
    public final void u6(j jVar, Long l14, h hVar, o90.a aVar, f fVar, p3.m mVar, int i14) {
        int i15;
        f fVar2;
        o0 o0VarE = mVar.E(863427901);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(jVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(l14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            fVar2 = fVar;
            i15 |= o0VarE.r(fVar2) ? 16384 : 8192;
        } else {
            fVar2 = fVar;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(this) ? 131072 : 65536;
        }
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            int i16 = c.f33721a[jVar.ordinal()];
            p3.m.a aVar2 = p3.m.f135153a;
            if (i16 == 1) {
                o0VarE.C(-178229624);
                boolean zR = ((i15 & 112) == 32) | o0VarE.r(this);
                if ((i15 & 896) != 256 && ((i15 & 512) == 0 || !o0VarE.r(hVar))) {
                    z14 = false;
                }
                boolean z15 = zR | z14;
                Object objQ = o0VarE.q();
                if (z15) {
                    objQ = new d6(l14, 28, this, hVar);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new d6(l14, 28, this, hVar);
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
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(tb0.n.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar3);
                o0VarE.g0(false);
                tb0.n nVar = (tb0.n) u1VarResolveViewModel;
                String strY6 = y6();
                int i17 = hVar.f58469c;
                boolean zR2 = o0VarE.r(this);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new k80.b(this, 11);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new k80.b(this, 11);
                        o0VarE.K(objQ2);
                    }
                }
                e23.a aVar4 = (e23.a) objQ2;
                Object objQ3 = o0VarE.q();
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new l(3);
                    o0VarE.K(objQ3);
                }
                tb0.c.b(nVar, strY6, aVar, i17, aVar4, (e23.a) objQ3, fVar, null, o0VarE, (o90.a.f130960i << 6) | 196616 | ((i15 >> 3) & 896) | ((i15 << 6) & 3670016), 128);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                if (i16 != 2) {
                    throw kg.f.h(o0VarE, 825533584, false);
                }
                o0VarE.C(-177375977);
                StringQualifier stringQualifierNamed = QualifierKt.named("GestureTutorial");
                boolean zR3 = o0VarE.r(this) | ((i15 & 7168) == 2048 || ((i15 & 4096) != 0 && o0VarE.r(aVar)));
                Object objQ4 = o0VarE.q();
                if (zR3) {
                    objQ4 = new k11.h(4, this, aVar);
                    o0VarE.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new k11.h(4, this, aVar);
                        o0VarE.K(objQ4);
                    }
                }
                e23.a aVar5 = (e23.a) objQ4;
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(q.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), stringQualifierNamed, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar5);
                o0VarE.g0(false);
                q qVar = (q) u1VarResolveViewModel2;
                String strY7 = y6();
                boolean zR4 = o0VarE.r(this);
                Object objQ5 = o0VarE.q();
                if (zR4) {
                    objQ5 = new k80.b(this, 0);
                    o0VarE.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new k80.b(this, 0);
                        o0VarE.K(objQ5);
                    }
                }
                e23.a aVar6 = (e23.a) objQ5;
                boolean zR5 = o0VarE.r(this);
                Object objQ6 = o0VarE.q();
                if (zR5) {
                    objQ6 = new k80.b(this, 1);
                    o0VarE.K(objQ6);
                } else {
                    aVar2.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new k80.b(this, 1);
                        o0VarE.K(objQ6);
                    }
                }
                tb0.e.a(qVar, strY7, aVar, aVar6, (e23.a) objQ6, fVar2, null, o0VarE, ((i15 << 3) & 458752) | (o90.a.f130960i << 6) | 8 | ((i15 >> 3) & 896), 64);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(this, jVar, l14, hVar, aVar, fVar, i14, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:109:0x0210  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x0140  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a3  */
    public final void v6(j jVar, o90.a aVar, i iVar, f fVar, p3.m mVar, int i14) {
        int i15;
        f fVar2;
        o0 o0VarE = mVar.E(2011053187);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(jVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            fVar2 = fVar;
            i15 |= o0VarE.r(fVar2) ? 2048 : 1024;
        } else {
            fVar2 = fVar;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(this) ? 16384 : 8192;
        }
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            int i16 = c.f33721a[jVar.ordinal()];
            p3.m.a aVar2 = p3.m.f135153a;
            if (i16 == 1) {
                int i17 = i15;
                o0VarE.C(786955714);
                boolean zR = o0VarE.r(this);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new k80.b(this, 2);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new k80.b(this, 2);
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
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(w.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar3);
                o0VarE.g0(false);
                w wVar = (w) u1VarResolveViewModel;
                String strY6 = y6();
                boolean zR2 = o0VarE.r(this);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new k80.b(this, 3);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new k80.b(this, 3);
                        o0VarE.K(objQ2);
                    }
                }
                e23.a aVar4 = (e23.a) objQ2;
                boolean zR3 = o0VarE.r(this);
                Object objQ3 = o0VarE.q();
                if (zR3) {
                    objQ3 = new k80.b(this, 4);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new k80.b(this, 4);
                        o0VarE.K(objQ3);
                    }
                }
                k.b(wVar, strY6, aVar, aVar4, (e23.a) objQ3, fVar, o0VarE, 8 | (o90.a.f130960i << 6) | ((i17 << 3) & 896) | ((i17 << 6) & 458752));
                o0VarE.g0(false);
            } else {
                if (i16 != 2) {
                    throw kg.f.h(o0VarE, -113162744, false);
                }
                o0VarE.C(787593663);
                StringQualifier stringQualifierNamed = QualifierKt.named("PairTutorial");
                boolean zR4 = o0VarE.r(this) | ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(aVar)));
                if ((i15 & 896) != 256 && ((i15 & 512) == 0 || !o0VarE.r(iVar))) {
                    z14 = false;
                }
                boolean z15 = zR4 | z14;
                Object objQ4 = o0VarE.q();
                if (z15) {
                    objQ4 = new d6(this, 27, aVar, iVar);
                    o0VarE.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new d6(this, 27, aVar, iVar);
                        o0VarE.K(objQ4);
                    }
                }
                e23.a aVar5 = (e23.a) objQ4;
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(y.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), stringQualifierNamed, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar5);
                o0VarE.g0(false);
                y yVar = (y) u1VarResolveViewModel2;
                int i18 = i15;
                String strY7 = y6();
                boolean zR5 = o0VarE.r(this);
                Object objQ5 = o0VarE.q();
                if (zR5) {
                    objQ5 = new k80.b(this, 5);
                    o0VarE.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new k80.b(this, 5);
                        o0VarE.K(objQ5);
                    }
                }
                e23.a aVar6 = (e23.a) objQ5;
                boolean zR6 = o0VarE.r(this);
                Object objQ6 = o0VarE.q();
                if (zR6) {
                    objQ6 = new k80.b(this, 6);
                    o0VarE.K(objQ6);
                } else {
                    aVar2.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new k80.b(this, 6);
                        o0VarE.K(objQ6);
                    }
                }
                tb0.l.a(yVar, strY7, aVar, aVar6, (e23.a) objQ6, fVar2, o0VarE, 8 | (o90.a.f130960i << 6) | ((i18 << 3) & 896) | ((i18 << 6) & 458752));
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(this, jVar, aVar, iVar, fVar, i14, 29);
        }
    }

    public final void w6(b bVar, f fVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-2022435685);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(fVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            if (bVar instanceof b.c) {
                o0VarE.C(-580089759);
                b.c cVar = (b.c) bVar;
                int i16 = i15 << 6;
                v6(cVar.f33718b, cVar.f33719c, cVar.f33720d, fVar, o0VarE, (o90.a.f130960i << 3) | (i.f58472c << 6) | (i16 & 7168) | (i16 & 57344));
                o0VarE.g0(false);
            } else if (bVar instanceof b.C0560b) {
                o0VarE.C(-579755517);
                b.C0560b c0560b = (b.C0560b) bVar;
                int i17 = i15 << 9;
                u6(c0560b.f33714b, c0560b.f33716d, c0560b.f33717e, c0560b.f33715c, fVar, o0VarE, (h.f58465e << 6) | (o90.a.f130960i << 9) | (57344 & i17) | (i17 & 458752));
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                if (bVar != null) {
                    throw kg.f.h(o0VarE, 2059496015, false);
                }
                o0VarE.C(-579389469);
                o0VarE.g0(false);
                getParentFragmentManager().Z();
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, bVar, fVar, i14, 28);
        }
    }

    public final String y6() {
        return (String) this.f33711c.getValue();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0003\u000e\u000f\u0010B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/a$b;", "Landroid/os/Parcelable;", "Ld90/j;", "tutorialType", "Lo90/a;", "imageData", "<init>", "(Ld90/j;Lo90/a;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILd90/j;Lo90/a;Lm63/u1;)V", "Companion", "c", "b", "a", "Lcom/garmin/android/apps/connectmobile/developer/tutorials/a$b$b;", "Lcom/garmin/android/apps/connectmobile/developer/tutorials/a$b$c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static abstract class b implements Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f33713a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.developer.tutorials.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/a$b$b;", "Lcom/garmin/android/apps/connectmobile/developer/tutorials/a$b;", "Ld90/j;", "tutorialType", "Lo90/a;", "imageData", "", "deviceId", "Ld90/h;", "gestureTutorialConfig", "<init>", "(Ld90/j;Lo90/a;Ljava/lang/Long;Ld90/h;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0560b extends b {
            public static final Parcelable.Creator<C0560b> CREATOR;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j f33714b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final o90.a f33715c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Long f33716d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final h f33717e;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.developer.tutorials.a$b$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0561a implements Parcelable.Creator<C0560b> {
                @Override // android.os.Parcelable.Creator
                public final C0560b createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C0560b(j.valueOf(parcel.readString()), (o90.a) parcel.readParcelable(C0560b.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (h) parcel.readParcelable(C0560b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final C0560b[] newArray(int i14) {
                    return new C0560b[i14];
                }
            }

            static {
                o90.a.Companion companion = o90.a.INSTANCE;
                h.Companion companion2 = h.INSTANCE;
                CREATOR = new C0561a();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0560b(j jVar, o90.a aVar, Long l14, h hVar) {
                super(jVar, aVar, null);
                jVar.getClass();
                aVar.getClass();
                hVar.getClass();
                this.f33714b = jVar;
                this.f33715c = aVar;
                this.f33716d = l14;
                this.f33717e = hVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0560b)) {
                    return false;
                }
                C0560b c0560b = (C0560b) obj;
                return this.f33714b == c0560b.f33714b && s.g(this.f33715c, c0560b.f33715c) && s.g(this.f33716d, c0560b.f33716d) && s.g(this.f33717e, c0560b.f33717e);
            }

            public final int hashCode() {
                int iHashCode = (this.f33715c.hashCode() + (this.f33714b.hashCode() * 31)) * 31;
                Long l14 = this.f33716d;
                return this.f33717e.hashCode() + ((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31);
            }

            public final String toString() {
                return "Gesture(tutorialType=" + this.f33714b + ", imageData=" + this.f33715c + ", deviceId=" + this.f33716d + ", gestureTutorialConfig=" + this.f33717e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeString(this.f33714b.name());
                parcel.writeParcelable(this.f33715c, i14);
                Long l14 = this.f33716d;
                if (l14 == null) {
                    parcel.writeInt(0);
                } else {
                    sn.a.n(parcel, 1, l14);
                }
                parcel.writeParcelable(this.f33717e, i14);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/a$b$c;", "Lcom/garmin/android/apps/connectmobile/developer/tutorials/a$b;", "Ld90/j;", "tutorialType", "Lo90/a;", "imageData", "Ld90/i;", "pairingConfig", "<init>", "(Ld90/j;Lo90/a;Ld90/i;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends b {
            public static final Parcelable.Creator<c> CREATOR;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j f33718b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final o90.a f33719c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final i f33720d;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.developer.tutorials.a$b$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0562a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                public final c createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new c(j.valueOf(parcel.readString()), (o90.a) parcel.readParcelable(c.class.getClassLoader()), (i) parcel.readParcelable(c.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final c[] newArray(int i14) {
                    return new c[i14];
                }
            }

            static {
                o90.a.Companion companion = o90.a.INSTANCE;
                i.Companion companion2 = i.INSTANCE;
                CREATOR = new C0562a();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(j jVar, o90.a aVar, i iVar) {
                super(jVar, aVar, null);
                jVar.getClass();
                aVar.getClass();
                this.f33718b = jVar;
                this.f33719c = aVar;
                this.f33720d = iVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f33718b == cVar.f33718b && s.g(this.f33719c, cVar.f33719c) && s.g(this.f33720d, cVar.f33720d);
            }

            public final int hashCode() {
                int iHashCode = (this.f33719c.hashCode() + (this.f33718b.hashCode() * 31)) * 31;
                i iVar = this.f33720d;
                return iHashCode + (iVar == null ? 0 : iVar.hashCode());
            }

            public final String toString() {
                return "Pairing(tutorialType=" + this.f33718b + ", imageData=" + this.f33719c + ", pairingConfig=" + this.f33720d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeString(this.f33718b.name());
                parcel.writeParcelable(this.f33719c, i14);
                parcel.writeParcelable(this.f33720d, i14);
            }
        }

        static {
            o90.a.Companion companion = o90.a.INSTANCE;
            o13.n nVar = o13.n.PUBLICATION;
            m.a(nVar, new l(4));
            f33713a = m.a(nVar, new l(5));
        }

        public /* synthetic */ b(j jVar, o90.a aVar, p005kotlin.jvm.internal.j jVar2) {
            this(jVar, aVar);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.developer.tutorials.a$b$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/a$b$a;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/developer/tutorials/a$b;", "serializer", "()Li63/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
            public final i63.c<b> serializer() {
                return (i63.c) b.f33713a.getValue();
            }

            private Companion() {
            }
        }

        public /* synthetic */ b(int i14, j jVar, o90.a aVar, m63.u1 u1Var) {
        }

        private b(j jVar, o90.a aVar) {
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.developer.tutorials.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/a$a;", "", "<init>", "()V", "", "PRODUCT_NUMBER_KEY", "Ljava/lang/String;", "PRODUCT_DISPLAY_NAME_KEY", "APPLICATION_KEY_KEY", "COMPATIBLE_TUTORIAL_DATA_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0558a {
        public /* synthetic */ C0558a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(b bVar, String str, String str2, String str3) {
            str.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("product_number", str);
            bundle.putString("product_display_name", str2);
            bundle.putString("application_key", str3);
            bundle.putParcelable("compatible_tutorial_data", bVar);
            a aVar = new a();
            aVar.setArguments(bundle);
            return aVar;
        }

        private C0558a() {
        }
    }
}
