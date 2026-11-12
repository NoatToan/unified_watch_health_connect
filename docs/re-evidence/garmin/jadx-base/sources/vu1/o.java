package vu1;

import androidx.lifecycle.t1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jv1.e0;
import lc.u0;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import vn2.b1;
import zd0.j1;
import zf0.a0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvu1/o;", "Lvu1/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends vu1.c {
    public static final /* synthetic */ int R0 = 0;
    public final ArrayList L0 = new ArrayList();
    public final c M0 = new c();
    public final o13.t N0 = o13.m.b(new vd1.c(24));
    public final y0 O0 = f5();
    public final w0 P0 = t1.a(d5(), new b1(this, 16));
    public final w0 Q0 = t1.a(d5(), new b1(this, 17));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180354a;

        static {
            int[] iArr = new int[hv1.c.values().length];
            try {
                iArr[hv1.c.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f180354a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vu1/o$c", "Lcu1/n;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends cu1.n {
        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "FBTDashBoardViewModel", "Failed to update training status.");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardViewModel$onCardClick$2", f = "FBTDashBoardViewModel.kt", l = {324}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f180356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ av1.h f180357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f180358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f180359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ hv1.c f180360f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(av1.h hVar, o oVar, long j8, hv1.c cVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f180357c = hVar;
            this.f180358d = oVar;
            this.f180359e = j8;
            this.f180360f = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(this.f180357c, this.f180358d, this.f180359e, this.f180360f, dVar);
            dVar2.f180356b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            av1.a aVar;
            av1.a aVar2;
            List<av1.h> list;
            b0 b0Var = (b0) this.f180356b;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180355a;
            long j8 = this.f180359e;
            av1.h hVar = this.f180357c;
            av1.a aVar4 = null;
            o oVar = this.f180358d;
            if (i14 == 0) {
                o13.r.b(obj);
                if (hVar != null && !hVar.getSeen()) {
                    kv1.b bVar = oVar.I;
                    this.f180356b = b0Var;
                    this.f180355a = 1;
                    bVar.getClass();
                    objJ = f0.J(bVar, new kv1.o(bVar, j8, null), this);
                    if (objJ == aVar3) {
                        return aVar3;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objJ = obj;
            v2 v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                g3<av1.a> g3VarD = oVar.d5().d();
                ArrayList arrayList = (g3VarD == null || (aVar2 = g3VarD.f35301b) == null || (list = aVar2.f13240o) == null) ? null : new ArrayList(list);
                Integer num = arrayList != null ? new Integer(arrayList.indexOf(hVar)) : null;
                if (num != null && num.intValue() != -1) {
                    arrayList.set(num.intValue(), av1.h.a(hVar));
                    y0<g3<av1.a>> y0VarD5 = oVar.d5();
                    g3.a aVar5 = g3.f35298f;
                    g3<av1.a> g3VarD2 = oVar.d5().d();
                    if (g3VarD2 != null && (aVar = g3VarD2.f35301b) != null) {
                        tw1.m mVar = aVar.f13226a;
                        fg0.k kVar = aVar.f13227b;
                        List<fg0.k> list2 = aVar.f13228c;
                        e0 e0Var = aVar.f13229d;
                        Map<Long, fg0.t> map = aVar.f13230e;
                        List<av1.b> list3 = aVar.f13231f;
                        List<av1.d> list4 = aVar.f13232g;
                        List<ActivityListItemDTO> list5 = aVar.f13233h;
                        ps.r rVar = aVar.f13234i;
                        List<ps.r> list6 = aVar.f13235j;
                        oz1.b bVar2 = aVar.f13236k;
                        ArrayList arrayList2 = arrayList;
                        i71.w wVar = aVar.f13237l;
                        h61.a aVar6 = aVar.f13238m;
                        zz1.d dVar = aVar.f13239n;
                        o61.q qVar = aVar.f13241p;
                        av1.c cVar = aVar.f13242q;
                        list2.getClass();
                        map.getClass();
                        list3.getClass();
                        list5.getClass();
                        list6.getClass();
                        aVar4 = new av1.a(mVar, kVar, list2, e0Var, map, list3, list4, list5, rVar, list6, bVar2, wVar, aVar6, dVar, arrayList2, qVar, cVar);
                    }
                    aVar5.getClass();
                    y0VarD5.j(g3.a.d(aVar4));
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String str = "Error occurred while updating seen status to content card Id : " + j8 + " type " + this.f180360f + " :: " + ((v2.a) v2Var).f47383a;
                i2.a aVar7 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar7.getClass();
                i2.a.f(a2Var, "FBTDashBoardViewModel", str);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardViewModel$quitPlan$1", f = "FBTDashBoardViewModel.kt", l = {126}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f180362b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f180364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f180365e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j8, e23.a<Unit> aVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f180364d = j8;
            this.f180365e = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = o.this.new e(this.f180364d, this.f180365e, dVar);
            eVar.f180362b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f180362b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180361a;
            o oVar = o.this;
            if (i14 == 0) {
                o13.r.b(obj);
                kv1.b bVar = oVar.I;
                this.f180362b = b0Var;
                this.f180361a = 1;
                bVar.getClass();
                obj = f0.J(bVar, new kv1.e(bVar, this.f180364d, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                e23.a<Unit> aVar2 = this.f180365e;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                v2.a aVar3 = (v2.a) v2Var;
                String str = "Failed to delete/quit plan. " + aVar3.f47385c + ": " + aVar3.f47383a;
                i2.a aVar4 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var, "FBTDashBoardViewModel", str);
                oVar.d5().m(g3.a.a(g3.f35298f, aVar3.f47385c, aVar3.f47383a, null, null, 12));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public o() {
        f5().m(new o13.p<>("FBTDashBoardFragment", Unit.INSTANCE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0100, code lost:
    
        if (r0 == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013e, code lost:
    
        if (r0 == r2) goto L59;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e5(o oVar, boolean z14, boolean z15, fg0.k kVar, v13.c cVar) {
        s sVar;
        fg0.j jVar;
        Object objI;
        v2.a aVar;
        zf0.d dVar = oVar.f204384a;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f180374c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f180374c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(oVar, cVar);
            }
        } else {
            sVar = new s(oVar, cVar);
        }
        Object objJ = sVar.f180372a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f180374c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objJ);
                return objJ;
            }
            if (i15 == 2) {
                o13.r.b(objJ);
                v2 v2Var = (v2) objJ;
                if (v2Var != null) {
                    return v2Var;
                }
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "FBTDashBoardViewModel", "Failed to unsubscribe to event. Sharable event ID is null.");
                return new v2.a(new Exception("Sharable event ID is null"), null, null, 6, null);
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
            v2 v2Var2 = (v2) objJ;
            if (v2Var2 != null) {
                return v2Var2;
            }
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var2, "FBTDashBoardViewModel", "Failed to delete to event. Event ID is null.");
            return new v2.a(new Exception("Event ID is null"), null, null, 6, null);
        }
        o13.r.b(objJ);
        if (!z14) {
            if (z15) {
                String shareableEventUuid = kVar.getShareableEventUuid();
                if (shareableEventUuid != null) {
                    sVar.f180374c = 2;
                    dVar.getClass();
                    objJ = f0.J(dVar, new a0(dVar, shareableEventUuid, null), sVar);
                }
                i2.a aVar5 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var3, "FBTDashBoardViewModel", "Failed to unsubscribe to event. Sharable event ID is null.");
                return new v2.a(new Exception("Sharable event ID is null"), null, null, 6, null);
            }
            Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            if (l14 != null) {
                long jLongValue = l14.longValue();
                sVar.f180374c = 3;
                dVar.getClass();
                objJ = f0.J(dVar, new zf0.i(dVar, jLongValue, null), sVar);
            }
            i2.a aVar6 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar6.getClass();
            i2.a.f(a2Var4, "FBTDashBoardViewModel", "Failed to delete to event. Event ID is null.");
            return new v2.a(new Exception("Event ID is null"), null, null, 6, null);
        }
        fg0.j eventCustomization = kVar.getEventCustomization();
        if (eventCustomization != null) {
            jVar = fg0.j.b(eventCustomization, null, null, null, null, null, null, 7999);
        } else {
            jVar = new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        kVar.E0(jVar);
        sVar.f180374c = 1;
        if (p005kotlin.jvm.internal.s.g(kVar.getEventOrganizer(), Boolean.TRUE)) {
            Long l15 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            objI = l15 != null ? dVar.h(l15.longValue(), kVar, sVar) : new v2.a(new IllegalStateException("Event Id null."), null, null, 6, null);
        } else {
            fg0.j eventCustomization2 = kVar.getEventCustomization();
            if (eventCustomization2 == null) {
                aVar = new v2.a(new IllegalStateException("Event customization null"), null, null, 6, null);
            } else {
                String shareableEventUuid2 = kVar.getShareableEventUuid();
                if (shareableEventUuid2 == null) {
                    aVar = new v2.a(new IllegalStateException("Shareable Event ID null"), null, null, 6, null);
                } else {
                    objI = dVar.i(shareableEventUuid2, eventCustomization2, sVar);
                }
            }
            objI = aVar;
        }
        if (objI != aVar2) {
            return objI;
        }
        return aVar2;
    }

    public final y0<o13.p<String, Object>> f5() {
        return (y0) this.N0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h5(v13.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f180382c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f180382c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objI = uVar.f180380a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f180382c;
        if (i15 == 0) {
            o13.r.b(objI);
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            uVar.f180382c = 1;
            objI = j1Var.i(uVar);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        return Boolean.valueOf(objI instanceof c80.s.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i5(long j8, hv1.c cVar) {
        av1.h hVar;
        jv1.n nVar;
        List<av1.h> list;
        Object next;
        cVar.getClass();
        g3 g3Var = (g3) this.J0.d();
        if (g3Var == null || (nVar = (jv1.n) g3Var.f35301b) == null || (list = nVar.B) == null) {
            hVar = null;
        } else {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((av1.h) next).getContentId() != j8);
            hVar = (av1.h) next;
        }
        if (hVar != null) {
            rt1.l.f154545a.getClass();
            rt1.l.b("GarminCoachPremiumContentView");
        }
        ge1.b.T(v1.a(this), null, null, new d(hVar, this, j8, cVar, null), 3);
        if ((hVar != null ? hVar.getContentRef() : null) == null || !g22.n.d(hVar.getTitle())) {
            return;
        }
        if (b.f180354a[cVar.ordinal()] == 1) {
            f5().j(new o13.p<>("FBTTrainingGuidancePlayerActivity", new o13.p(hVar.getContentRef(), hVar.getTitle())));
        } else {
            f5().j(new o13.p<>("FBTTrainingGuidanceArticleFrag", hVar.getContentRef()));
        }
    }

    public final void j5(e23.a<Unit> aVar) {
        Long l14 = this.f180261k0;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            d5().m(g3.a.c(g3.f35298f));
            ge1.b.T(v1.a(this), null, null, new e(jLongValue, aVar, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvu1/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
