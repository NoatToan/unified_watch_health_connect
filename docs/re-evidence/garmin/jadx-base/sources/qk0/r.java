package qk0;

import am.x0;
import am.z0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import c2.n0;
import c2.n3;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import i3.e9;
import i3.mc;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import l72.r1;
import o53.b0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.a1;
import p13.c1;
import p13.h0;
import p13.l0;
import p13.y;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import p40.k0;
import p40.q0;

/* JADX INFO: loaded from: classes8.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d4.l f145122a = d4.a.b(new q51.a(13), new qc.c(11));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.defaultactivities.MultiActivitySelectionScreenKt$MultiActivitySelectionScreenImpl$1$1", f = "MultiActivitySelectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<t> f145123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qk0.i f145124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qk0.c f145125c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<t> p1Var, qk0.i iVar, qk0.c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f145123a = p1Var;
            this.f145124b = iVar;
            this.f145125c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f145123a, this.f145124b, this.f145125c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f145123a.setValue(null);
            this.f145124b.Y1(this.f145125c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.defaultactivities.MultiActivitySelectionScreenKt$MultiActivitySelectionScreenImpl$2$1", f = "MultiActivitySelectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f145126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f145127b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p1<Boolean> p1Var, m4.b0 b0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f145126a = p1Var;
            this.f145127b = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f145126a, this.f145127b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f145126a.getF182175a().booleanValue()) {
                m4.b0.a(this.f145127b);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f145128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i53.d<x0, List<x0>> f145129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<i53.e<x0>> f145130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<t> f145131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x3<qk0.e> f145132e;

        /* JADX WARN: Multi-variable type inference failed */
        public c(v vVar, i53.d<x0, ? extends List<? extends x0>> dVar, p1<i53.e<x0>> p1Var, p1<t> p1Var2, x3<qk0.e> x3Var) {
            this.f145128a = vVar;
            this.f145129b = dVar;
            this.f145130c = p1Var;
            this.f145131d = p1Var2;
            this.f145132e = x3Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            Set setB;
            v.b bVar = (v.b) this.f145128a;
            boolean z14 = bVar.f145161b;
            x0 x0Var = bVar.f145160a;
            if (z14) {
                List<x0> list = this.f145129b.get(x0Var);
                setB = list != null ? h0.g1(list) : null;
                if (setB == null) {
                    setB = l0.f134950a;
                }
            } else {
                setB = a1.b(x0Var);
            }
            boolean z15 = bVar.f145162c;
            p1<i53.e<x0>> p1Var = this.f145130c;
            if (z15) {
                d4.l lVar = r.f145122a;
                p1Var.setValue(i53.a.h(c1.g(p1Var.getF182175a(), setB)));
            } else {
                d4.l lVar2 = r.f145122a;
                Set set = setB;
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    mk0.a aVar = this.f145132e.getF182175a().f145090c.get((x0) it.next());
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                i53.c cVarE = i53.a.e(arrayList);
                if (cVarE.isEmpty()) {
                    p1Var.setValue(i53.a.h(h0.h1(p1Var.getF182175a(), set)));
                } else {
                    this.f145131d.setValue(new t(i53.a.h(set), cVarE));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f145133a = new d();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f145134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f145135b;

        public e(e23.l lVar, List list) {
            this.f145134a = lVar;
            this.f145135b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f145134a.invoke(this.f145135b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f145136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f145137b;

        public f(e23.l lVar, List list) {
            this.f145136a = lVar;
            this.f145137b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f145136a.invoke(this.f145137b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f145138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i53.d f145139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1 f145140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3 f145141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1 f145142e;

        public g(List list, i53.d dVar, p1 p1Var, x3 x3Var, p1 p1Var2) {
            this.f145138a = list;
            this.f145139b = dVar;
            this.f145140c = p1Var;
            this.f145141d = x3Var;
            this.f145142e = p1Var2;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
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
                v vVar = (v) this.f145138a.get(iIntValue);
                mVar2.C(-1370541132);
                if (vVar instanceof v.a) {
                    mVar2.C(-1370517542);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar, j92.b.f97899b.f97920e), mVar2);
                    r.b(((v.a) vVar).f145158a, mVar2, 0);
                    mVar2.f();
                } else {
                    if (!(vVar instanceof v.b)) {
                        throw n23.j.m(mVar2, -736947665);
                    }
                    mVar2.C(-1370172915);
                    v.b bVar = (v.b) vVar;
                    x0 x0Var = bVar.f145160a;
                    boolean z14 = bVar.f145162c;
                    boolean z15 = bVar.f145161b;
                    boolean zR = mVar2.r(vVar) | mVar2.r(this.f145139b) | mVar2.B(this.f145140c) | mVar2.B(this.f145141d);
                    Object objQ = mVar2.q();
                    if (zR) {
                        c cVar = new c(vVar, this.f145139b, this.f145140c, this.f145142e, this.f145141d);
                        mVar2.K(cVar);
                        objQ = cVar;
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            c cVar2 = new c(vVar, this.f145139b, this.f145140c, this.f145142e, this.f145141d);
                            mVar2.K(cVar2);
                            objQ = cVar2;
                        }
                    }
                    r.a(x0Var, z14, z15, (e23.a) objQ, mVar2, 0);
                    mVar2.f();
                }
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.defaultactivities.MultiActivitySelectionScreenKt$MultiActivitySelectionScreenImpl$onDismiss$1$1$1", f = "MultiActivitySelectionScreen.kt", l = {529}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f145143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f145144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f145145c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(mc mcVar, p1<Boolean> p1Var, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f145144b = mcVar;
            this.f145145c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(this.f145144b, this.f145145c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f145143a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f145143a = 1;
                if (this.f145144b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            d4.l lVar = r.f145122a;
            this.f145145c.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145146a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.Selected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.All.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f145146a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Boolean.valueOf(((v.b) t14).f145161b), Boolean.valueOf(((v.b) t7).f145161b));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f145147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator f145148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f145149c;

        public k(Comparator comparator, Comparator comparator2, Context context) {
            this.f145147a = comparator;
            this.f145148b = comparator2;
            this.f145149c = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            int iCompare = this.f145147a.compare(t7, t14);
            if (iCompare != 0) {
                return iCompare;
            }
            c3 c3Var = ((v.b) t7).f145160a.f4360c;
            Context context = this.f145149c;
            return this.f145148b.compare(dh.b.A(context, c3Var), dh.b.A(context, ((v.b) t14).f145160a.f4360c));
        }
    }

    public static final void a(x0 x0Var, boolean z14, boolean z15, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-978626913);
        int i15 = (o0VarE.k(x0Var.ordinal()) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z15) ? 256 : 128;
        }
        int i16 = i15 | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strA = dh.b.A(context, x0Var.f4360c);
            if (z15) {
                strA = context.getString(R.string.label_all_activity_name, strA);
                strA.getClass();
            }
            uk0.u.c(((i16 >> 3) & 896) | (i16 & 112), aVar, strA, o0VarE, z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ct1.a(i14, 5, x0Var, aVar, z14, z15);
        }
    }

    public static final void b(x0 x0Var, p3.m mVar, int i14) {
        String strT;
        o0 o0VarE = mVar.E(-1134963878);
        int i15 = (o0VarE.k(x0Var.ordinal()) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (x0Var == x0.f4304m) {
                strT = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1726244275, R.string.concept_activities, o0VarE, false);
            } else {
                o0VarE.C(-1726180012);
                strT = gl1.d.T(x0Var.f4360c, o0VarE, 0);
                o0VarE.g0(false);
            }
            r1.b(strT, null, o0VarE, 0, 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(i14, x0Var);
        }
    }

    public static final void c(i53.e eVar, qk0.c cVar, e23.l lVar, qk0.i iVar, p3.m mVar, int i14) {
        qk0.i iVar2;
        int i15;
        qk0.i iVar3;
        eVar.getClass();
        cVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-227452443);
        int i16 = i14 | (o0VarE.B(eVar) ? 4 : 2) | (o0VarE.r(cVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | 1024;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                Object objResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(qk0.f.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                i15 = i16 & (-7169);
                iVar3 = (qk0.i) objResolveViewModel;
            } else {
                o0VarE.e();
                i15 = i16 & (-7169);
                iVar3 = iVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                ArrayList arrayListC = am.r1.c(null, am.r1.a(context));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : arrayListC) {
                    x0 x0Var = (x0) obj;
                    x0Var.getClass();
                    x0 x0VarD = z0.d(x0Var, x0Var);
                    Object arrayList = linkedHashMap.get(x0VarD);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(x0VarD, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                TreeMap treeMap = new TreeMap(new q());
                treeMap.putAll(linkedHashMap);
                objQ = i53.a.g(treeMap);
                o0VarE.K(objQ);
            }
            d((i53.d) objQ, eVar, cVar, iVar3, lVar, o0VarE, ((i15 << 3) & 1008) | ((i15 << 6) & 57344));
            x1 x1Var2 = p3.n.f135158a;
            iVar2 = iVar3;
        } else {
            o0VarE.e();
            iVar2 = iVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a((Object) eVar, (Object) cVar, lVar, (Object) iVar2, i14, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:199:0x04d3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void d(final i53.d<x0, ? extends List<? extends x0>> dVar, final i53.e<? extends x0> eVar, qk0.c cVar, qk0.i iVar, e23.l<? super qk0.d, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        final int i16;
        p1 p1Var;
        p1 p1Var2;
        boolean z14;
        int i17;
        boolean z15;
        boolean zR;
        Object objQ;
        Object objQ2;
        qk0.i iVar2 = iVar;
        o0 o0VarE = mVar.E(-988934819);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(iVar2) : o0VarE.r(iVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ3 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            b0 b0Var = (b0) objQ3;
            boolean zB = o0VarE.B(cVar);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                o0VarE.K(cVar);
                objQ4 = cVar;
            }
            qk0.c cVar2 = (qk0.c) objQ4;
            p1 p1VarC = p0.c(iVar2.getUiState(), o0VarE, 0);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(null);
                o0VarE.K(objQ5);
            }
            p1 p1Var3 = (p1) objQ5;
            int i18 = i15 & 7168;
            boolean zR2 = (i18 == 2048 || ((i15 & 4096) != 0 && o0VarE.r(iVar2))) | o0VarE.r(cVar2);
            Object objQ6 = o0VarE.q();
            if (zR2 || objQ6 == c2565a) {
                objQ6 = new a(p1Var3, iVar2, cVar2, null);
                o0VarE.K(objQ6);
            }
            p3.l0.e((e23.p) objQ6, cVar2, o0VarE);
            Object[] objArr = new Object[0];
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new q53.q(27);
                o0VarE.K(objQ7);
            }
            p1 p1Var4 = (p1) d4.a.e(objArr, (e23.a) objQ7, o0VarE, 48);
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = i53.a.e(dVar.keySet());
                o0VarE.K(objQ8);
            }
            i53.c cVar3 = (i53.c) objQ8;
            Object[] objArr2 = new Object[0];
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = new q53.q(24);
                o0VarE.K(objQ9);
            }
            p1 p1Var5 = (p1) d4.a.e(objArr2, (e23.a) objQ9, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                objQ10 = new q53.q(25);
                o0VarE.K(objQ10);
            }
            p1 p1Var6 = (p1) d4.a.e(objArr3, (e23.a) objQ10, o0VarE, 48);
            Object objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                objQ11 = p0.f(new q0(p1Var5, p1Var6, 3));
                o0VarE.K(objQ11);
            }
            x3 x3Var = (x3) objQ11;
            Object objQ12 = o0VarE.q();
            if (objQ12 == c2565a) {
                objQ12 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var2 = (m4.b0) objQ12;
            T f182175a = p1Var5.getF182175a();
            boolean zB2 = o0VarE.B(p1Var5);
            Object objQ13 = o0VarE.q();
            if (zB2 || objQ13 == c2565a) {
                objQ13 = new b(p1Var5, b0Var2, null);
                o0VarE.K(objQ13);
            }
            p3.l0.e((e23.p) objQ13, f182175a, o0VarE);
            Object[] objArr4 = new Object[0];
            int i19 = i15 & 112;
            boolean z16 = i19 == 32;
            Object objQ14 = o0VarE.q();
            if (z16 || objQ14 == c2565a) {
                i16 = 0;
                objQ14 = new e23.a() { // from class: qk0.k
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                break;
                        }
                        return p0.n(eVar);
                    }
                };
                o0VarE.K(objQ14);
            } else {
                i16 = 0;
            }
            d4.l lVar2 = f145122a;
            final p1 p1Var7 = (p1) d4.a.c(objArr4, lVar2, (e23.a) objQ14, o0VarE, i16);
            Object[] objArr5 = new Object[i16];
            Object objQ15 = o0VarE.q();
            if (objQ15 == c2565a) {
                objQ15 = new q53.q(26);
                o0VarE.K(objQ15);
            }
            final p1 p1Var8 = (p1) d4.a.c(objArr5, lVar2, (e23.a) objQ15, o0VarE, 384);
            Object[] objArr6 = new Object[0];
            boolean z17 = i19 == 32;
            Object objQ16 = o0VarE.q();
            if (z17 || objQ16 == c2565a) {
                final int i24 = 1;
                objQ16 = new e23.a() { // from class: qk0.k
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i24) {
                            case 0:
                                break;
                        }
                        return p0.n(eVar);
                    }
                };
                o0VarE.K(objQ16);
            }
            p1 p1Var9 = (p1) d4.a.c(objArr6, lVar2, (e23.a) objQ16, o0VarE, 0);
            Object objQ17 = o0VarE.q();
            if (objQ17 == c2565a) {
                final int i25 = 1;
                objQ17 = p0.f(new e23.a() { // from class: qk0.j
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i25) {
                            case 0:
                                return Integer.valueOf(r.g(dVar, (i53.e) p1Var7.getF182175a(), (i53.e) p1Var8.getF182175a()).size());
                            default:
                                return r.g(dVar, (i53.e) p1Var7.getF182175a(), (i53.e) p1Var8.getF182175a());
                        }
                    }
                });
                o0VarE.K(objQ17);
            }
            x3 x3Var2 = (x3) objQ17;
            boolean zB3 = o0VarE.B(p1Var6) | o0VarE.B(p1Var5);
            Object objQ18 = o0VarE.q();
            if (zB3 || objQ18 == c2565a) {
                objQ18 = new q0(p1Var6, p1Var5, 4);
                o0VarE.K(objQ18);
            }
            e23.a aVar = (e23.a) objQ18;
            boolean zBooleanValue = ((Boolean) p1Var5.getF182175a()).booleanValue();
            boolean zB4 = o0VarE.B(aVar);
            Object objQ19 = o0VarE.q();
            if (zB4 || objQ19 == c2565a) {
                objQ19 = new pf0.j(aVar, 29);
                o0VarE.K(objQ19);
            }
            c.w.a(0, 0, (e23.a) objQ19, o0VarE, zBooleanValue);
            boolean z18 = !((Boolean) p1Var5.getF182175a()).booleanValue();
            boolean zB5 = ((i15 & 57344) == 16384) | o0VarE.B(p1Var7);
            Object objQ20 = o0VarE.q();
            if (zB5 || objQ20 == c2565a) {
                p1Var = p1Var7;
                objQ20 = new ok0.d(lVar, p1Var, cVar2, p1VarC, 9);
                o0VarE.K(objQ20);
            } else {
                p1Var = p1Var7;
            }
            final int i26 = 0;
            c.w.a(0, 0, (e23.a) objQ20, o0VarE, z18);
            boolean z19 = ((qk0.e) p1VarC.getF182175a()).f145088a;
            n0 n0Var = n3.f22788a;
            final p1 p1Var10 = p1Var;
            int i27 = i15;
            o0Var = o0VarE;
            z02.d.a(z19, z3.f.c(-1770765214, new c42.d(p1Var5, lVar, p1Var10, p1Var8, p1Var4, b0Var2, p1Var6, cVar2, p1VarC), o0VarE), null, null, new n0(0, 0, 0, 0), z3.f.c(1141873254, new a11.j(p1Var8, p1Var9, p1Var10, x3Var, dVar, p1VarC, context, x3Var2, p1Var6, p1Var3), o0VarE), o0Var, 196656, 12);
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0Var.C(2134009875);
                Object objQ21 = o0Var.q();
                if (objQ21 == c2565a) {
                    objQ21 = p0.n(p1Var8.getF182175a());
                    o0Var.K(objQ21);
                }
                final p1 p1Var11 = (p1) objQ21;
                Object objQ22 = o0Var.q();
                if (objQ22 == c2565a) {
                    objQ22 = p0.f(new e23.a() { // from class: qk0.j
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i26) {
                                case 0:
                                    return Integer.valueOf(r.g(dVar, (i53.e) p1Var10.getF182175a(), (i53.e) p1Var11.getF182175a()).size());
                                default:
                                    return r.g(dVar, (i53.e) p1Var10.getF182175a(), (i53.e) p1Var11.getF182175a());
                            }
                        }
                    });
                    o0Var.K(objQ22);
                }
                x3 x3Var3 = (x3) objQ22;
                int i28 = 6;
                z14 = true;
                mc mcVarF = e9.f(true, null, o0Var, 6, 2);
                boolean zR3 = o0Var.r(b0Var) | o0Var.B(mcVarF) | o0Var.B(p1Var4);
                Object objQ23 = o0Var.q();
                if (zR3 || objQ23 == c2565a) {
                    objQ23 = new fo.j(b0Var, mcVarF, p1Var4, 16);
                    o0Var.K(objQ23);
                }
                e23.a aVar2 = (e23.a) objQ23;
                l72.w wVar = l72.w.f111301a;
                z3.e eVarC = z3.f.c(943393490, new o72.b(13, aVar2, x3Var3), o0Var);
                z3.e eVarC2 = z3.f.c(1985122585, new pp.g(p1Var8, i28, aVar2, p1Var11), o0Var);
                boolean zB6 = o0Var.B(aVar2);
                Object objQ24 = o0Var.q();
                if (zB6 || objQ24 == c2565a) {
                    objQ24 = new pf0.j(aVar2, 28);
                    o0Var.K(objQ24);
                }
                p1Var2 = p1Var10;
                wVar.c(eVarC, eVarC2, (e23.a) objQ24, mcVarF, null, new q51.a(12), z3.f.c(-973662812, new o72.b(14, cVar3, p1Var11), o0Var), o0Var, 1572918, 16);
                o0Var.g0(false);
            } else {
                p1Var2 = p1Var10;
                z14 = true;
                o0Var.C(2137102373);
                o0Var.g0(false);
            }
            t tVar = (t) p1Var3.getF182175a();
            if (tVar == null) {
                o0Var.C(2137151445);
                o0Var.g0(false);
            } else {
                o0Var.C(2137151446);
                boolean zB7 = o0Var.B(p1Var2) | o0Var.r(tVar);
                Object objQ25 = o0Var.q();
                if (zB7 || objQ25 == c2565a) {
                    objQ25 = new q42.v(tVar, 2, p1Var3, p1Var2);
                    o0Var.K(objQ25);
                }
                e23.a aVar3 = (e23.a) objQ25;
                Object objQ26 = o0Var.q();
                if (objQ26 == c2565a) {
                    objQ26 = new k0(p1Var3, 29);
                    o0Var.K(objQ26);
                }
                qk0.g.a(tVar, aVar3, (e23.a) objQ26, o0Var, 384);
                Unit unit = Unit.INSTANCE;
                o0Var.g0(false);
            }
            if (((qk0.e) p1VarC.getF182175a()).f145089b) {
                o0Var.C(2137550664);
                if (i18 != 2048) {
                    i17 = i27;
                    iVar2 = iVar;
                    if ((i17 & 4096) == 0 || !o0Var.r(iVar2)) {
                        z15 = false;
                    }
                    zR = o0Var.r(cVar2) | z15;
                    objQ = o0Var.q();
                    if (zR || objQ == c2565a) {
                        objQ = new p40.o0(25, iVar2, cVar2);
                        o0Var.K(objQ);
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    if (i18 != 2048 && ((i17 & 4096) == 0 || !o0Var.r(iVar2))) {
                        z14 = false;
                    }
                    objQ2 = o0Var.q();
                    if (z14 || objQ2 == c2565a) {
                        objQ2 = new q42.d(iVar2, 10);
                        o0Var.K(objQ2);
                    }
                    uk0.h.d(aVar4, (e23.a) objQ2, o0Var, 0);
                    o0Var.g0(false);
                } else {
                    iVar2 = iVar;
                    i17 = i27;
                }
                z15 = z14;
                zR = o0Var.r(cVar2) | z15;
                objQ = o0Var.q();
                if (zR) {
                    objQ = new p40.o0(25, iVar2, cVar2);
                    o0Var.K(objQ);
                } else {
                    objQ = new p40.o0(25, iVar2, cVar2);
                    o0Var.K(objQ);
                }
                e23.a aVar5 = (e23.a) objQ;
                if (i18 != 2048) {
                    z14 = false;
                }
                objQ2 = o0Var.q();
                if (z14) {
                    objQ2 = new q42.d(iVar2, 10);
                    o0Var.K(objQ2);
                } else {
                    objQ2 = new q42.d(iVar2, 10);
                    o0Var.K(objQ2);
                }
                uk0.h.d(aVar5, (e23.a) objQ2, o0Var, 0);
                o0Var.g0(false);
            } else {
                iVar2 = iVar;
                o0Var.C(2137824549);
                o0Var.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e((Object) dVar, (Object) eVar, (Object) cVar, (Object) iVar2, (e23.l) lVar, i14, 11);
        }
    }

    public static final qk0.d e(p1<i53.e<x0>> p1Var, qk0.c cVar, x3<qk0.e> x3Var) {
        List listB1 = h0.b1(p1Var.getF182175a());
        i53.e<x0> f182175a = p1Var.getF182175a();
        ArrayList arrayList = new ArrayList();
        Iterator<x0> it = f182175a.iterator();
        while (it.hasNext()) {
            mk0.a aVar = x3Var.getF182175a().f145090c.get(it.next());
            qk0.h hVar = null;
            if (aVar != null) {
                cVar.getClass();
                List<mk0.b> list = aVar.f119098b;
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    String str = ((mk0.b) it3.next()).f119100a;
                    if (d53.w.J(str)) {
                        str = null;
                    }
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Set setG = c1.g(h0.g1(arrayList2), cVar.f145084c);
                List<mk0.d> list2 = aVar.f119099c;
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    String str2 = ((mk0.d) it4.next()).f119105a;
                    if (d53.w.J(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        arrayList3.add(str2);
                    }
                }
                Set setG2 = c1.g(h0.g1(arrayList3), cVar.f145083b);
                qk0.h hVar2 = (setG.isEmpty() && setG2.isEmpty()) ? null : new qk0.h(aVar.f119097a, setG, setG2);
                if (hVar2 != null) {
                    hVar = hVar2;
                }
            }
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        return new qk0.d(listB1, arrayList);
    }

    public static final i53.c<v> f(Context context, i53.c<w> cVar, boolean z14, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (w wVar : cVar) {
            x0 x0Var = wVar.f145165b;
            Object arrayList = linkedHashMap.get(x0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(x0Var, arrayList);
            }
            ((List) arrayList).add(wVar);
        }
        q13.b bVarB = p13.w.b();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            x0 x0Var2 = (x0) entry.getKey();
            List<w> list = (List) entry.getValue();
            if (!z14 || x0Var2 != x0.f4304m) {
                bVarB.add(new v.a(x0Var2));
                ArrayList arrayList2 = new ArrayList(y.r(list, 10));
                for (w wVar2 : list) {
                    arrayList2.add(new v.b(wVar2.f145164a, wVar2.f145166c, wVar2.f145167d, wVar2.f145168e));
                }
                bVarB.addAll(arrayList2);
            }
        }
        q13.b bVarA = p13.w.a(bVarB);
        if (!z14 || str == null) {
            return i53.a.e(bVarA);
        }
        Collator collator = Collator.getInstance();
        collator.setStrength(1);
        ArrayList arrayList3 = new ArrayList();
        ListIterator listIterator = bVarA.listIterator(0);
        while (true) {
            q13.b.c cVar2 = (q13.b.c) listIterator;
            if (!cVar2.hasNext()) {
                return i53.a.e(h0.N0(zf.b.f(arrayList3, str, false, new ot.c(context, 7)), new k(new j(), collator, context)));
            }
            Object next = cVar2.next();
            if (next instanceof v.b) {
                arrayList3.add(next);
            }
        }
    }

    public static final i53.c<w> g(i53.d<x0, ? extends List<? extends x0>> dVar, i53.e<? extends x0> eVar, i53.e<? extends x0> eVar2) {
        boolean z14;
        if (!eVar2.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<x0, ? extends List<? extends x0>> entry : dVar.entrySet()) {
                if (eVar2.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            dVar = i53.a.g(linkedHashMap);
        }
        q13.b bVarB = p13.w.b();
        Iterator<Map.Entry<x0, ? extends List<? extends x0>>> it = dVar.entrySet().iterator();
        while (true) {
            boolean z15 = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<x0, ? extends List<? extends x0>> next = it.next();
            x0 key = next.getKey();
            List<? extends x0> value = next.getValue();
            if (value != null && value.isEmpty()) {
                z15 = true;
                break;
                break;
            }
            Iterator<T> it3 = value.iterator();
            do {
                if (!it3.hasNext()) {
                    z15 = true;
                    break;
                }
            } while (eVar.contains((x0) it3.next()));
            bVarB.add(new w(key, x0.f4304m, true, z15));
        }
        for (Map.Entry<x0, ? extends List<? extends x0>> entry2 : dVar.entrySet()) {
            x0 key2 = entry2.getKey();
            List<? extends x0> value2 = entry2.getValue();
            if (value2 != null && value2.isEmpty()) {
                z14 = true;
                break;
            }
            Iterator<T> it4 = value2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z14 = true;
                    break;
                }
                if (!eVar.contains((x0) it4.next())) {
                    z14 = false;
                    break;
                }
            }
            bVarB.add(new w(key2, key2, true, z14));
            ArrayList arrayList = new ArrayList(y.r(value2, 10));
            for (x0 x0Var : value2) {
                arrayList.add(new w(x0Var, key2, false, eVar.contains(x0Var)));
            }
            bVarB.addAll(arrayList);
        }
        return i53.a.e(p13.w.a(bVarB));
    }
}
