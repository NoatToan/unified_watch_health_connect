package ta0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.m3;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class h1 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceTypeSelectionScreenKt$DeviceTypeSelectionScreen$1$1$3$1", f = "DeviceTypeSelectionScreen.kt", l = {154}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f163343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f163344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f163345c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, e2.i0 i0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f163344b = str;
            this.f163345c = i0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f163344b, this.f163345c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f163343a;
            if (i14 == 0) {
                o13.r.b(obj);
                if (this.f163344b.length() == 0) {
                    this.f163343a = 1;
                    e2.i0.a aVar2 = e2.i0.f62432x;
                    if (this.f163345c.l(0, 0, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.q f163346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m3 f163347b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceTypeSelectionScreenKt$DeviceTypeSelectionScreen$1$1$4$1$1", f = "DeviceTypeSelectionScreen.kt", l = {166}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f163348a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f163349b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m4.q f163350c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ m3 f163351d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m4.q qVar, m3 m3Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f163350c = qVar;
                this.f163351d = m3Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f163350c, this.f163351d, dVar);
                aVar.f163349b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b5.c cVar = (b5.c) this.f163349b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f163348a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    b5.s sVar = b5.s.Initial;
                    this.f163349b = null;
                    this.f163348a = 1;
                    if (k3.c(cVar, sVar, this, 1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                this.f163350c.y(false);
                m3 m3Var = this.f163351d;
                if (m3Var != null) {
                    m3Var.hide();
                }
                return Unit.INSTANCE;
            }
        }

        public b(m4.q qVar, m3 m3Var) {
            this.f163346a = qVar;
            this.f163347b = m3Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
            Object objC = p008y1.h1.c(h0Var, new a(this.f163346a, this.f163347b, null), dVar);
            return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<l90.b, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<l90.b, Unit> f163352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l90.b f163353b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(e23.l<? super l90.b, Unit> lVar, l90.b bVar) {
            this.f163352a = lVar;
            this.f163353b = bVar;
        }

        @Override // e23.l
        public final Unit invoke(l90.b bVar) {
            bVar.getClass();
            this.f163352a.invoke(this.f163353b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f163354a = new d();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f163355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f163356b;

        public e(e23.l lVar, List list) {
            this.f163355a = lVar;
            this.f163356b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f163355a.invoke(this.f163356b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f163357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f163358b;

        public f(e23.l lVar, List list) {
            this.f163357a = lVar;
            this.f163358b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f163357a.invoke(this.f163358b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f163359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f163360b;

        public g(List list, e23.l lVar) {
            this.f163359a = list;
            this.f163360b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006c  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                l90.b bVar = (l90.b) this.f163359a.get(iIntValue);
                mVar2.C(-747029305);
                e23.l lVar = this.f163360b;
                boolean zB = mVar2.B(lVar) | mVar2.r(bVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new c(lVar, bVar);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new c(lVar, bVar);
                        mVar2.K(objQ);
                    }
                }
                ua0.b.a(bVar, (e23.l) objQ, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x0171  */
    /* JADX WARN: Code duplicated, block: B:71:0x018d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f1 f1Var, zb0.l lVar, List<l90.b> list, e23.l<? super l90.b, Unit> lVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        List list2;
        f1Var.getClass();
        lVar.getClass();
        list.getClass();
        lVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-1440601321);
        int i15 = (o0VarE.r(f1Var) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(lVar.ordinal()) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.r(list) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        int i17 = i16 | (o0VarE.r(aVar2) ? 131072 : 65536);
        int i18 = 1;
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(k0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
            o0VarE.g0(false);
            k0 k0Var = (k0) u1VarResolveViewModel;
            x0.a(k0Var, lVar2, o0VarE, (i17 >> 6) & 112);
            p1 p1VarC = s9.c.c(f1Var.f163317d, o0VarE);
            boolean z14 = !d53.w.J(((va0.d) p1VarC.getF182175a()).f176576a);
            boolean zR = o0VarE.r(f1Var);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new z0(f1Var, 1);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new z0(f1Var, 1);
                    o0VarE.K(objQ);
                }
            }
            c.w.a(0, 0, (e23.a) objQ, o0VarE, z14);
            if (d53.w.J(((va0.d) p1VarC.getF182175a()).f176576a)) {
                list2 = list;
            } else {
                List<va0.c> list3 = ((va0.d) p1VarC.getF182175a()).f176578c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (obj instanceof va0.c.a) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((va0.c.a) it.next()).f176574a);
                }
                list2 = arrayList2;
            }
            String str = ((va0.d) p1VarC.getF182175a()).f176576a;
            boolean zR2 = o0VarE.r(f1Var);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new a1(f1Var, 1);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a1(f1Var, 1);
                    o0VarE.K(objQ2);
                }
            }
            e23.l lVar3 = (e23.l) objQ2;
            boolean zR3 = o0VarE.r(k0Var);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new y0(k0Var, i18);
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new y0(k0Var, i18);
                    o0VarE.K(objQ3);
                }
            }
            int i19 = (i17 >> 3) & 14;
            int i24 = i17 << 3;
            b(lVar, list2, str, lVar3, (e23.l) objQ3, aVar, aVar2, o0VarE, i19 | (458752 & i24) | (i24 & 3670016));
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(f1Var, lVar, list, lVar2, aVar, aVar2, i14, 12);
        }
    }

    public static final void b(zb0.l lVar, List<l90.b> list, String str, e23.l<? super String, Unit> lVar2, e23.l<? super l90.b, Unit> lVar3, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-494614130);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(lVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            da0.p.d("device_discovery_device_type_selection_screen", false, aVar2, null, null, null, z3.f.c(1306212645, new g0(str, lVar, lVar2, list, lVar3, aVar), o0VarE), o0Var, ((i15 >> 12) & 896) | 12582918, 122);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(lVar, list, str, lVar2, lVar3, aVar, aVar2, i14);
        }
    }
}
