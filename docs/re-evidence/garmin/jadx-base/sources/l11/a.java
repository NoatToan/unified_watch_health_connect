package l11;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g21.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import v01.k0;
import v01.n1;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Ll11/a;", "Landroidx/lifecycle/u1;", "Lb63/u;", "dateTime", "Lb11/m;", "mealViewNavArgs", "Lj11/c;", "logDestination", "Ll11/a$c;", "mode", "Li01/i;", "logCategory", "Lv01/k0;", "getFoodDetailsData", "Lv01/n1;", "logFoodUseCase", "Lv01/y;", "favoriteFoodUseCase", "Lv01/u;", "deleteCustomFoodUseCase", "Lm01/g;", "nutritionRepository", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Lb63/u;Lb11/m;Lj11/c;Ll11/a$c;Li01/i;Lv01/k0;Lv01/n1;Lv01/y;Lv01/u;Lm01/g;Ls01/f;)V", "c", "b", "d", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b63.u f108052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b11.m f108053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j11.c f108054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f108055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i01.i f108056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f108057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f108058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v01.y f108059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v01.u f108060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m01.g f108061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s01.f f108062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f108063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f108064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b2 f108065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f108066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f108067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b2 f108068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b2 f108069r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b2 f108070t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b2 f108071v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b2 f108072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p2 f108073x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b2 f108074y;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll11/a$b;", "data", "Lb11/f;", "adjustedDaily", "Li53/f;", "Lb11/o;", "<anonymous>", "(Ll11/a$b;Lb11/f;)Li53/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodDetailsViewModel$adjustedDailyMicroEntries$1", f = "FoodDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.q<b, b11.f, t13.d<? super i53.f<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ b f108110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ b11.f f108111b;

        public e(t13.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(b bVar, b11.f fVar, t13.d<? super i53.f<? extends b11.o>> dVar) {
            e eVar = a.this.new e(dVar);
            eVar.f108110a = bVar;
            eVar.f108111b = fVar;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            s21.o oVar;
            List<s21.n> listB0;
            b bVar = this.f108110a;
            b11.f fVar = this.f108111b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (!a.this.f108062k.e()) {
                return j53.l.b();
            }
            if (bVar != null) {
                b11.i.a aVar2 = bVar.f108075a;
                g21.h hVar = bVar.f108077c;
                if (hVar != null && (oVar = hVar.f75432i) != null && (listB0 = o72.t.b0(oVar)) != null) {
                    if (fVar == null) {
                        fVar = hVar.f75429f;
                    }
                    b11.s sVar = aVar2.f14302h;
                    ArrayList arrayList = new ArrayList(p13.y.r(listB0, 10));
                    for (s21.n nVar : listB0) {
                        Double dZ = xy2.b.z(fVar, nVar.f156152b);
                        Double dZ2 = xy2.b.z(sVar.f14375d, nVar.f156152b);
                        arrayList.add(new b11.o(nVar, zf.b.F(dZ, dZ2 != null ? new Double(dZ2.doubleValue() * aVar2.f14298d) : null)));
                    }
                    return i53.a.j(arrayList);
                }
            }
            return j53.l.b();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll11/a$b;", "details", "Lb11/i$a;", "originalFood", "Lb11/l;", "selectedMeal", "Lb11/f;", "<anonymous>", "(Ll11/a$b;Lb11/i$a;Lb11/l;)Lb11/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodDetailsViewModel$adjustedDailyNutritionContent$1", f = "FoodDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.r<b, b11.i.a, b11.l, t13.d<? super b11.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ b f108113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ b11.i.a f108114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ b11.l f108115c;

        public f(t13.d<? super f> dVar) {
            super(4, dVar);
        }

        @Override // e23.r
        public final Object invoke(b bVar, b11.i.a aVar, b11.l lVar, t13.d<? super b11.f> dVar) {
            f fVar = new f(dVar);
            fVar.f108113a = bVar;
            fVar.f108114b = aVar;
            fVar.f108115c = lVar;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g21.h hVar;
            b bVar = this.f108113a;
            b11.i.a aVar = this.f108114b;
            b11.l lVar = this.f108115c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (bVar == null || (hVar = bVar.f108077c) == null) {
                return null;
            }
            return b11.r.a(hVar.f75429f, aVar, lVar != null ? new Long(lVar.f14331a) : null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll11/a$b;", "details", "Lb11/i$a;", "originalFood", "Lb11/l;", "selectedMeal", "Lg21/f0;", "<anonymous>", "(Ll11/a$b;Lb11/i$a;Lb11/l;)Lg21/f0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodDetailsViewModel$adjustedMealNutritionContent$1", f = "FoodDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.r<b, b11.i.a, b11.l, t13.d<? super f0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ b f108116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ b11.i.a f108117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ b11.l f108118c;

        public g(t13.d<? super g> dVar) {
            super(4, dVar);
        }

        @Override // e23.r
        public final Object invoke(b bVar, b11.i.a aVar, b11.l lVar, t13.d<? super f0> dVar) {
            g gVar = new g(dVar);
            gVar.f108116a = bVar;
            gVar.f108117b = aVar;
            gVar.f108118c = lVar;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g21.h hVar;
            Object next;
            b bVar = this.f108116a;
            b11.i.a aVar = this.f108117b;
            b11.l lVar = this.f108118c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (bVar == null || (hVar = bVar.f108077c) == null) {
                return null;
            }
            i53.c<g21.p> cVar = hVar.f75430g;
            ArrayList arrayList = new ArrayList();
            for (g21.p pVar : cVar) {
                g21.p pVar2 = pVar;
                if (lVar != null && pVar2.f75473a.f14331a == lVar.f14331a) {
                    arrayList.add(pVar);
                }
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((g21.p) it.next()).f75474b);
            }
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                while (it3.hasNext()) {
                    next = ((f0) next).b((f0) it3.next());
                }
            } else {
                next = null;
            }
            f0 f0Var = (f0) next;
            if (f0Var != null) {
                return b11.r.b(f0Var, aVar, lVar != null ? new Long(lVar.f14331a) : null);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll11/a$b;", "details", "Lb11/l;", "selectedMeal", "Lg21/f0;", "<anonymous>", "(Ll11/a$b;Lb11/l;)Lg21/f0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodDetailsViewModel$mealNutritionContent$1", f = "FoodDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.q<b, b11.l, t13.d<? super f0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ b f108119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ b11.l f108120b;

        public h(t13.d<? super h> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(b bVar, b11.l lVar, t13.d<? super f0> dVar) {
            h hVar = new h(dVar);
            hVar.f108119a = bVar;
            hVar.f108120b = lVar;
            return hVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g21.h hVar;
            b bVar = this.f108119a;
            b11.l lVar = this.f108120b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Object next = null;
            if (bVar == null || (hVar = bVar.f108077c) == null) {
                return null;
            }
            i53.c<g21.p> cVar = hVar.f75430g;
            ArrayList arrayList = new ArrayList();
            for (g21.p pVar : cVar) {
                g21.p pVar2 = pVar;
                if (lVar != null && pVar2.f75473a.f14331a == lVar.f14331a) {
                    arrayList.add(pVar);
                }
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((g21.p) it.next()).f75474b);
            }
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                while (it3.hasNext()) {
                    next = ((f0) next).b((f0) it3.next());
                }
            }
            return (f0) next;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll11/a$b;", "details", "Lb11/l;", "selectedMeal", "Lg21/u;", "<anonymous>", "(Ll11/a$b;Lb11/l;)Lg21/u;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodDetailsViewModel$mealNutritionGoals$1", f = "FoodDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.q<b, b11.l, t13.d<? super g21.u>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ b f108121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ b11.l f108122b;

        public i(t13.d<? super i> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(b bVar, b11.l lVar, t13.d<? super g21.u> dVar) {
            i iVar = a.this.new i(dVar);
            iVar.f108121a = bVar;
            iVar.f108122b = lVar;
            return iVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g21.h hVar;
            g21.p next;
            g21.u uVar;
            b bVar = this.f108121a;
            b11.l lVar = this.f108122b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (bVar != null && (hVar = bVar.f108077c) != null) {
                Iterator<g21.p> it = hVar.f75430g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    g21.p pVar = next;
                    if (lVar != null && pVar.f75473a.f14331a == lVar.f14331a) {
                        break;
                    }
                }
                g21.p pVar2 = next;
                if (pVar2 != null && (uVar = pVar2.f75475c) != null && a.this.f108054c != j11.c.CUSTOM_MEAL) {
                    return uVar;
                }
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j implements r53.i<i53.f<? extends b11.o>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f108124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f108125b;

        /* JADX INFO: renamed from: l11.a$j$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2077a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f108126a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f108127b;

            /* JADX INFO: renamed from: l11.a$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodDetailsViewModel$special$$inlined$map$1$2", f = "FoodDetailsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2078a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f108128a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f108129b;

                public C2078a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f108128a = obj;
                    this.f108129b |= Integer.MIN_VALUE;
                    return C2077a.this.emit(null, this);
                }
            }

            public C2077a(r53.j jVar, a aVar) {
                this.f108126a = jVar;
                this.f108127b = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:34:0x0099  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2078a c2078a;
                List listB;
                s21.o oVar;
                List<s21.n> listB0;
                if (dVar instanceof C2078a) {
                    c2078a = (C2078a) dVar;
                    int i14 = c2078a.f108129b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2078a.f108129b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2078a = new C2078a(dVar);
                    }
                } else {
                    c2078a = new C2078a(dVar);
                }
                Object obj2 = c2078a.f108128a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2078a.f108129b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    b bVar = (b) obj;
                    if (this.f108127b.f108062k.e() && bVar != null) {
                        b11.i.a aVar2 = bVar.f108075a;
                        g21.h hVar = bVar.f108077c;
                        if (hVar == null || (oVar = hVar.f75432i) == null || (listB0 = o72.t.b0(oVar)) == null) {
                            listB = j53.l.b();
                        } else {
                            b11.s sVar = aVar2.f14302h;
                            ArrayList arrayList = new ArrayList(p13.y.r(listB0, 10));
                            for (s21.n nVar : listB0) {
                                Double dZ = xy2.b.z(sVar.f14375d, nVar.f156152b);
                                arrayList.add(new b11.o(nVar, dZ != null ? new Double(dZ.doubleValue() * aVar2.f14298d) : null));
                            }
                            listB = i53.a.j(arrayList);
                        }
                    } else {
                        listB = j53.l.b();
                    }
                    c2078a.f108129b = 1;
                    if (this.f108126a.emit(listB, c2078a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public j(r53.i iVar, a aVar) {
            this.f108124a = iVar;
            this.f108125b = aVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super i53.f<? extends b11.o>> jVar, t13.d dVar) {
            Object objCollect = this.f108124a.collect(new C2077a(jVar, this.f108125b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new C2072a(null);
    }

    public a(b63.u uVar, b11.m mVar, j11.c cVar, c cVar2, i01.i iVar, k0 k0Var, n1 n1Var, v01.y yVar, v01.u uVar2, m01.g gVar, s01.f fVar) {
        uVar.getClass();
        mVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        iVar.getClass();
        k0Var.getClass();
        n1Var.getClass();
        yVar.getClass();
        uVar2.getClass();
        gVar.getClass();
        fVar.getClass();
        this.f108052a = uVar;
        this.f108053b = mVar;
        this.f108054c = cVar;
        this.f108055d = cVar2;
        this.f108056e = iVar;
        this.f108057f = k0Var;
        this.f108058g = n1Var;
        this.f108059h = yVar;
        this.f108060i = uVar2;
        this.f108061j = gVar;
        this.f108062k = fVar;
        p2 p2VarA = q2.a(null);
        this.f108063l = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f108064m = p2VarA2;
        b2 b2VarD = r53.s.d(p2VarA2);
        this.f108065n = b2VarD;
        p2 p2VarA3 = q2.a(null);
        this.f108066o = p2VarA3;
        b2 b2VarD2 = r53.s.d(p2VarA3);
        this.f108067p = b2VarD2;
        r53.u1 u1Var = new r53.u1(b2VarD, b2VarD2, new h(null));
        w9.a aVarA = v1.a(this);
        k2.a aVar = k2.f150703a;
        r53.s.K(u1Var, aVarA, k2.a.a(aVar, 2), null);
        this.f108068q = r53.s.K(new r53.u1(b2VarD, b2VarD2, new i(null)), v1.a(this), k2.a.a(aVar, 2), null);
        b2 b2VarK = r53.s.K(r53.s.l(b2VarD, p2VarA, b2VarD2, new f(null)), v1.a(this), k2.a.a(aVar, 2), null);
        this.f108069r = b2VarK;
        this.f108070t = r53.s.K(r53.s.l(b2VarD, p2VarA, b2VarD2, new g(null)), v1.a(this), k2.a.a(aVar, 2), null);
        this.f108071v = r53.s.K(new j(b2VarD, this), v1.a(this), k2.a.a(aVar, 2), j53.l.b());
        this.f108072w = r53.s.K(new r53.u1(b2VarD, b2VarK, new e(null)), v1.a(this), k2.a.a(aVar, 2), j53.l.b());
        p2 p2VarA4 = q2.a(d.i.f108105a);
        this.f108073x = p2VarA4;
        this.f108074y = r53.s.d(p2VarA4);
        ge1.b.T(v1.a(this), null, null, new l11.d(this, null), 3);
    }

    public final void x4(boolean z14) {
        b bVar = (b) this.f108064m.getValue();
        if (bVar == null) {
            return;
        }
        ge1.b.T(v1.a(this), null, null, new l11.g(this, bVar.f108075a.f14301g, bVar, z14, null), 3);
    }

    /* JADX INFO: renamed from: l11.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll11/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2072a {
        public /* synthetic */ C2072a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2072a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ll11/a$c;", "", "<init>", "()V", "a", "b", "c", "Ll11/a$c$a;", "Ll11/a$c$b;", "Ll11/a$c$c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll11/a$c$b;", "Ll11/a$c;", "", "loggedFoodId", "<init>", "(Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f108089a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(null);
                str.getClass();
                this.f108089a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f108089a, ((b) obj).f108089a);
            }

            public final int hashCode() {
                return this.f108089a.hashCode();
            }

            public final String toString() {
                return am.j.m("Edit(loggedFoodId=", this.f108089a, ")");
            }
        }

        /* JADX INFO: renamed from: l11.a$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll11/a$c$c;", "Ll11/a$c;", "", "foodId", "servingId", "", "servingQty", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lg01/u;", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lg01/u;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2074c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f108090a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f108091b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f108092c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f108093d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f108094e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final g01.u f108095f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2074c(String str, String str2, double d14, String str3, String str4, g01.u uVar) {
                super(null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                uVar.getClass();
                this.f108090a = str;
                this.f108091b = str2;
                this.f108092c = d14;
                this.f108093d = str3;
                this.f108094e = str4;
                this.f108095f = uVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2074c)) {
                    return false;
                }
                C2074c c2074c = (C2074c) obj;
                return p005kotlin.jvm.internal.s.g(this.f108090a, c2074c.f108090a) && p005kotlin.jvm.internal.s.g(this.f108091b, c2074c.f108091b) && Double.compare(this.f108092c, c2074c.f108092c) == 0 && p005kotlin.jvm.internal.s.g(this.f108093d, c2074c.f108093d) && p005kotlin.jvm.internal.s.g(this.f108094e, c2074c.f108094e) && this.f108095f == c2074c.f108095f;
            }

            public final int hashCode() {
                return this.f108095f.hashCode() + wr.g.j(wr.g.j(org.apache.commons.lang3.e.b(wr.g.j(this.f108090a.hashCode() * 31, 31, this.f108091b), 31, this.f108092c), 31, this.f108093d), 31, this.f108094e);
            }

            public final String toString() {
                StringBuilder sbI = p6.b.i("EditMeal(foodId=", this.f108090a, ", servingId=", this.f108091b, ", servingQty=");
                sbI.append(this.f108092c);
                sbI.append(", regionCode=");
                sbI.append(this.f108093d);
                sbI.append(", languageCode=");
                sbI.append(this.f108094e);
                sbI.append(", source=");
                sbI.append(this.f108095f);
                sbI.append(")");
                return sbI.toString();
            }
        }

        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }

        /* JADX INFO: renamed from: l11.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll11/a$c$a;", "Ll11/a$c;", "", "foodId", "servingId", "", "servingQty", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lg01/u;", "source", "", "allowEditing", "scannedBarcode", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lg01/u;ZLjava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2073a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f108081a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f108082b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f108083c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f108084d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f108085e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final g01.u f108086f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f108087g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final String f108088h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2073a(String str, String str2, double d14, String str3, String str4, g01.u uVar, boolean z14, String str5) {
                super(null);
                str.getClass();
                str3.getClass();
                str4.getClass();
                uVar.getClass();
                this.f108081a = str;
                this.f108082b = str2;
                this.f108083c = d14;
                this.f108084d = str3;
                this.f108085e = str4;
                this.f108086f = uVar;
                this.f108087g = z14;
                this.f108088h = str5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2073a)) {
                    return false;
                }
                C2073a c2073a = (C2073a) obj;
                return p005kotlin.jvm.internal.s.g(this.f108081a, c2073a.f108081a) && p005kotlin.jvm.internal.s.g(this.f108082b, c2073a.f108082b) && Double.compare(this.f108083c, c2073a.f108083c) == 0 && p005kotlin.jvm.internal.s.g(this.f108084d, c2073a.f108084d) && p005kotlin.jvm.internal.s.g(this.f108085e, c2073a.f108085e) && this.f108086f == c2073a.f108086f && this.f108087g == c2073a.f108087g && p005kotlin.jvm.internal.s.g(this.f108088h, c2073a.f108088h);
            }

            public final int hashCode() {
                int iHashCode = this.f108081a.hashCode() * 31;
                String str = this.f108082b;
                int iG = q6.f.g((this.f108086f.hashCode() + wr.g.j(wr.g.j(org.apache.commons.lang3.e.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f108083c), 31, this.f108084d), 31, this.f108085e)) * 31, 31, this.f108087g);
                String str2 = this.f108088h;
                return iG + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbI = p6.b.i("Add(foodId=", this.f108081a, ", servingId=", this.f108082b, ", servingQty=");
                sbI.append(this.f108083c);
                sbI.append(", regionCode=");
                sbI.append(this.f108084d);
                sbI.append(", languageCode=");
                sbI.append(this.f108085e);
                sbI.append(", source=");
                sbI.append(this.f108086f);
                sbI.append(", allowEditing=");
                sbI.append(this.f108087g);
                sbI.append(", scannedBarcode=");
                sbI.append(this.f108088h);
                sbI.append(")");
                return sbI.toString();
            }

            public /* synthetic */ C2073a(String str, String str2, double d14, String str3, String str4, g01.u uVar, boolean z14, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
                this(str, str2, d14, str3, str4, uVar, z14, (i14 & 128) != 0 ? null : str5);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Ll11/a$d;", "", "<init>", "()V", "h", "g", "f", JWKParameterNames.OCT_KEY_VALUE, IntegerTokenConverter.CONVERTER_KEY, "c", JWKParameterNames.RSA_EXPONENT, "j", "b", "a", "d", "l", "Ll11/a$d$a;", "Ll11/a$d$b;", "Ll11/a$d$c;", "Ll11/a$d$d;", "Ll11/a$d$e;", "Ll11/a$d$f;", "Ll11/a$d$g;", "Ll11/a$d$h;", "Ll11/a$d$i;", "Ll11/a$d$j;", "Ll11/a$d$k;", "Ll11/a$d$l;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class d {

        /* JADX INFO: renamed from: l11.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/a$d$a;", "Ll11/a$d;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2075a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2075a f108096a = new C2075a();

            private C2075a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2075a);
            }

            public final int hashCode() {
                return -1604745831;
            }

            public final String toString() {
                return "DeletedCustomFood";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll11/a$d$b;", "Ll11/a$d;", "Lb63/o;", "date", "Lb11/i;", "deletedFood", "<init>", "(Lb63/o;Lb11/i;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b63.o f108097a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b11.i f108098b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b63.o oVar, b11.i iVar) {
                super(null);
                oVar.getClass();
                iVar.getClass();
                this.f108097a = oVar;
                this.f108098b = iVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p005kotlin.jvm.internal.s.g(this.f108097a, bVar.f108097a) && p005kotlin.jvm.internal.s.g(this.f108098b, bVar.f108098b);
            }

            public final int hashCode() {
                return this.f108098b.hashCode() + (this.f108097a.f16206a.hashCode() * 31);
            }

            public final String toString() {
                return "DeletedFoodLog(date=" + this.f108097a + ", deletedFood=" + this.f108098b + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/a$d$c;", "Ll11/a$d;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f108099a = new c();

            private c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -548049735;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: l11.a$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/a$d$d;", "Ll11/a$d;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2076d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2076d f108100a = new C2076d();

            private C2076d() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2076d);
            }

            public final int hashCode() {
                return -2124192437;
            }

            public final String toString() {
                return "Favorite";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/a$d$e;", "Ll11/a$d;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f108101a = new e();

            private e() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 2064028320;
            }

            public final String toString() {
                return "GenericError";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/a$d$f;", "Ll11/a$d;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f108102a = new f();

            private f() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 911337637;
            }

            public final String toString() {
                return "InvalidServingSize";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/a$d$g;", "Ll11/a$d;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f108103a = new g();

            private g() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 1957555378;
            }

            public final String toString() {
                return "LoadFailed";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/a$d$h;", "Ll11/a$d;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class h extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f108104a = new h();

            private h() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 387443572;
            }

            public final String toString() {
                return "Loaded";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/a$d$i;", "Ll11/a$d;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class i extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f108105a = new i();

            private i() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return -874146899;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll11/a$d$j;", "Ll11/a$d;", "Lb63/o;", "date", "Lb11/i$a;", "loggedFood", "<init>", "(Lb63/o;Lb11/i$a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class j extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b63.o f108106a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b11.i.a f108107b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(b63.o oVar, b11.i.a aVar) {
                super(null);
                oVar.getClass();
                aVar.getClass();
                this.f108106a = oVar;
                this.f108107b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return p005kotlin.jvm.internal.s.g(this.f108106a, jVar.f108106a) && p005kotlin.jvm.internal.s.g(this.f108107b, jVar.f108107b);
            }

            public final int hashCode() {
                return this.f108107b.hashCode() + (this.f108106a.f16206a.hashCode() * 31);
            }

            public final String toString() {
                return "Saved(date=" + this.f108106a + ", loggedFood=" + this.f108107b + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/a$d$k;", "Ll11/a$d;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class k extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final k f108108a = new k();

            private k() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return -1902170365;
            }

            public final String toString() {
                return "ServingSizeGreaterThanZeroError";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/a$d$l;", "Ll11/a$d;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class l extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final l f108109a = new l();

            private l() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return 845388580;
            }

            public final String toString() {
                return "Unfavorite";
            }
        }

        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll11/a$b;", "", "Lb11/i$a;", "loggedFood", "Li53/c;", "Lb11/s;", "units", "Lg21/h;", "nutritionSummary", "Lb11/l;", "meals", "", "isTimelineView", "showMealSelectionError", "<init>", "(Lb11/i$a;Li53/c;Lg21/h;Li53/c;ZZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b11.i.a f108075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i53.c<b11.s> f108076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g21.h f108077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i53.c<b11.l> f108078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f108079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f108080f;

        public b(b11.i.a aVar, i53.c<b11.s> cVar, g21.h hVar, i53.c<b11.l> cVar2, boolean z14, boolean z15) {
            aVar.getClass();
            cVar.getClass();
            hVar.getClass();
            cVar2.getClass();
            this.f108075a = aVar;
            this.f108076b = cVar;
            this.f108077c = hVar;
            this.f108078d = cVar2;
            this.f108079e = z14;
            this.f108080f = z15;
        }

        public static b a(b bVar, b11.i.a aVar, i53.c cVar, boolean z14, int i14) {
            if ((i14 & 1) != 0) {
                aVar = bVar.f108075a;
            }
            b11.i.a aVar2 = aVar;
            if ((i14 & 2) != 0) {
                cVar = bVar.f108076b;
            }
            i53.c cVar2 = cVar;
            g21.h hVar = bVar.f108077c;
            i53.c<b11.l> cVar3 = bVar.f108078d;
            boolean z15 = bVar.f108079e;
            if ((i14 & 32) != 0) {
                z14 = bVar.f108080f;
            }
            bVar.getClass();
            aVar2.getClass();
            cVar2.getClass();
            hVar.getClass();
            cVar3.getClass();
            return new b(aVar2, cVar2, hVar, cVar3, z15, z14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f108075a, bVar.f108075a) && p005kotlin.jvm.internal.s.g(this.f108076b, bVar.f108076b) && p005kotlin.jvm.internal.s.g(this.f108077c, bVar.f108077c) && p005kotlin.jvm.internal.s.g(this.f108078d, bVar.f108078d) && this.f108079e == bVar.f108079e && this.f108080f == bVar.f108080f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f108080f) + q6.f.g(l2.a(this.f108078d, (this.f108077c.hashCode() + l2.a(this.f108076b, this.f108075a.hashCode() * 31, 31)) * 31, 31), 31, this.f108079e);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("FoodDetailsData(loggedFood=");
            sb3.append(this.f108075a);
            sb3.append(", units=");
            sb3.append(this.f108076b);
            sb3.append(", nutritionSummary=");
            sb3.append(this.f108077c);
            sb3.append(", meals=");
            sb3.append(this.f108078d);
            sb3.append(", isTimelineView=");
            return com.airbnb.lottie.animation.keyframe.a.f(", showMealSelectionError=", ")", sb3, this.f108079e, this.f108080f);
        }

        public /* synthetic */ b(b11.i.a aVar, i53.c cVar, g21.h hVar, i53.c cVar2, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
            this(aVar, cVar, hVar, cVar2, z14, (i14 & 32) != 0 ? false : z15);
        }
    }
}
