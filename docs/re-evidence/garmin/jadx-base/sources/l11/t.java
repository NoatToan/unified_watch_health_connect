package l11;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.c3;
import c22.g2;
import c22.x0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g21.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.n2;
import r53.p2;
import r53.q2;
import v.e0;
import v01.f1;
import v01.n1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001e\u001f Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Ll11/t;", "Landroidx/lifecycle/u1;", "", "foodId", "Ll11/t$b;", "mode", "Li01/i;", "logCategory", "Lj11/c;", "logDestination", "Lb63/u;", "dateTime", "Lb11/m;", "mealViewNavArgs", "Lv01/f1;", "getRecipeDetailsUseCase", "Lv01/n1;", "logFoodUseCase", "Lv01/y;", "favoriteFoodUseCase", "Lv01/w;", "deleteRecipeUseCase", "Lm01/g;", "nutritionRepository", "Ls01/f;", "nutritionSettingsConfigProvider", "Le01/a;", "nutritionPreferences", "<init>", "(Ljava/lang/String;Ll11/t$b;Li01/i;Lj11/c;Lb63/u;Lb11/m;Lv01/f1;Lv01/n1;Lv01/y;Lv01/w;Lm01/g;Ls01/f;Le01/a;)V", "b", "c", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f108254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i01.i f108255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j11.c f108256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b63.u f108257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b11.m f108258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1 f108259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f108260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v01.y f108261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v01.w f108262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m01.g f108263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s01.f f108264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e01.a f108265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f108266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f108267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f108268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f108269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f108270r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b2 f108271t;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Ll11/t$c;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ll11/r;", "recipeData", "La11/r;", "lastServingQtyInputType", "Lb11/i$b;", "originalFood", "Lb11/l;", "selectedMealWindow", "Ll11/s;", "<anonymous>", "(Ll11/t$c;Ll11/r;La11/r;Lb11/i$b;Lb11/l;)Ll11/s;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.RecipeDetailsViewModel$uiState$1", f = "RecipeDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.t<c, r, a11.r, b11.i.b, b11.l, t13.d<? super s>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ c f108293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r f108294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ a11.r f108295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ b11.i.b f108296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ b11.l f108297e;

        public d(t13.d<? super d> dVar) {
            super(6, dVar);
        }

        @Override // e23.t
        public final Object invoke(c cVar, r rVar, a11.r rVar2, b11.i.b bVar, b11.l lVar, t13.d<? super s> dVar) {
            d dVar2 = t.this.new d(dVar);
            dVar2.f108293a = cVar;
            dVar2.f108294b = rVar;
            dVar2.f108295c = rVar2;
            dVar2.f108296d = bVar;
            dVar2.f108297e = lVar;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:68:0x010f  */
        /* JADX WARN: Code duplicated, block: B:89:0x0195  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            f0 f0Var;
            g21.u uVar;
            c cVar;
            b11.l lVar;
            Double d14;
            List listB;
            s21.o oVar;
            List listB0;
            c cVar2;
            i53.c cVarB;
            s21.o oVar2;
            List listB1;
            int i14;
            c3 c3VarB;
            b11.i.b bVar;
            b11.i.b bVar2;
            g21.h hVar;
            g21.p next;
            g21.h hVar2;
            g21.h hVar3;
            Object next2;
            c cVar3 = this.f108293a;
            r rVar = this.f108294b;
            a11.r rVar2 = this.f108295c;
            b11.i.b bVar3 = this.f108296d;
            b11.l lVar2 = this.f108297e;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (rVar == null || (hVar3 = rVar.f108232c) == null) {
                f0Var = null;
            } else {
                i53.c<g21.p> cVar4 = hVar3.f75430g;
                ArrayList arrayList = new ArrayList();
                for (g21.p pVar : cVar4) {
                    g21.p pVar2 = pVar;
                    if (lVar2 != null && pVar2.f75473a.f14331a == lVar2.f14331a) {
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
                    next2 = it3.next();
                    while (it3.hasNext()) {
                        next2 = ((f0) next2).b((f0) it3.next());
                    }
                } else {
                    next2 = null;
                }
                f0Var = (f0) next2;
            }
            b11.f fVarA = (rVar == null || (hVar2 = rVar.f108232c) == null) ? null : b11.r.a(hVar2.f75429f, bVar3, lVar2 != null ? new Long(lVar2.f14331a) : null);
            if (rVar == null || (hVar = rVar.f108232c) == null) {
                uVar = null;
            } else {
                Iterator<g21.p> it4 = hVar.f75430g.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    g21.p pVar3 = next;
                    if (lVar2 != null && pVar3.f75473a.f14331a == lVar2.f14331a) {
                        break;
                    }
                }
                g21.p pVar4 = next;
                if (pVar4 != null) {
                    uVar = pVar4.f75475c;
                } else {
                    uVar = null;
                }
            }
            f0 f0VarB = f0Var != null ? b11.r.b(f0Var, bVar3, lVar2 != null ? new Long(lVar2.f14331a) : null) : null;
            t tVar = t.this;
            s01.f fVar = tVar.f108264l;
            b bVar4 = tVar.f108254b;
            j11.c cVar5 = tVar.f108256d;
            if (!fVar.e()) {
                listB = j53.l.b();
                cVar = cVar3;
                lVar = lVar2;
                d14 = null;
            } else if (rVar != null) {
                b11.i.b bVar5 = rVar.f108230a;
                g21.h hVar4 = rVar.f108232c;
                if (hVar4 == null || (oVar = hVar4.f75432i) == null || (listB0 = o72.t.b0(oVar)) == null) {
                    cVar = cVar3;
                    lVar = lVar2;
                    d14 = null;
                    listB = j53.l.b();
                } else {
                    d14 = null;
                    b11.s sVar = bVar5.f14312h;
                    ArrayList arrayList3 = new ArrayList(p13.y.r(listB0, 10));
                    Iterator it5 = listB0.iterator();
                    while (it5.hasNext()) {
                        s21.n nVar = (s21.n) it5.next();
                        Iterator it6 = it5;
                        Double dZ = xy2.b.z(sVar.f14375d, nVar.f156152b);
                        arrayList3.add(new b11.o(nVar, dZ != null ? new Double(bVar5.f14308d * dZ.doubleValue()) : null));
                        cVar3 = cVar3;
                        it5 = it6;
                        lVar2 = lVar2;
                    }
                    cVar = cVar3;
                    lVar = lVar2;
                    listB = i53.a.j(arrayList3);
                }
            } else {
                cVar = cVar3;
                lVar = lVar2;
                d14 = null;
                listB = j53.l.b();
            }
            if (!tVar.f108264l.e()) {
                cVarB = j53.l.b();
                cVar2 = cVar;
            } else if (rVar != null) {
                b11.i.b bVar6 = rVar.f108230a;
                g21.h hVar5 = rVar.f108232c;
                if (hVar5 == null || (oVar2 = hVar5.f75432i) == null || (listB1 = o72.t.b0(oVar2)) == null) {
                    cVar2 = cVar;
                    cVarB = j53.l.b();
                } else {
                    b11.f fVar2 = fVarA == null ? hVar5.f75429f : fVarA;
                    b11.s sVar2 = bVar6.f14312h;
                    ArrayList arrayList4 = new ArrayList(p13.y.r(listB1, 10));
                    Iterator it7 = listB1.iterator();
                    while (it7.hasNext()) {
                        s21.n nVar2 = (s21.n) it7.next();
                        Iterator it8 = it7;
                        Double dZ2 = xy2.b.z(fVar2, nVar2.f156152b);
                        b11.f fVar3 = fVar2;
                        b11.s sVar3 = sVar2;
                        Double dZ3 = xy2.b.z(sVar2.f14375d, nVar2.f156152b);
                        arrayList4.add(new b11.o(nVar2, zf.b.F(dZ2, dZ3 != null ? new Double(bVar6.f14308d * dZ3.doubleValue()) : d14)));
                        cVar = cVar;
                        it7 = it8;
                        fVar2 = fVar3;
                        sVar2 = sVar3;
                        bVar6 = bVar6;
                    }
                    cVar2 = cVar;
                    cVarB = i53.a.j(arrayList4);
                }
            } else {
                cVar2 = cVar;
                cVarB = j53.l.b();
            }
            boolean z14 = (cVar5 == j11.c.PHOTO_RESULT || tVar.f108255c == i01.i.IMAGE_RECOGNITION || rVar == null || (bVar2 = rVar.f108230a) == null || bVar2.f14313i) ? false : true;
            boolean z15 = (!(bVar4 instanceof b.a) || cVar5 != j11.c.DAILY_LOG || rVar == null || (bVar = rVar.f108230a) == null || bVar.f14313i) ? false : true;
            boolean zY4 = tVar.y4();
            boolean z16 = cVar5 == j11.c.DAILY_LOG;
            if (bVar4 instanceof b.a) {
                i14 = R.string.lbl_add;
            } else {
                if (!(bVar4 instanceof b.c) && !(bVar4 instanceof b.C2080b)) {
                    u0.r();
                    return d14;
                }
                i14 = R.string.lbl_save;
            }
            if (tVar.y4()) {
                c3VarB = c22.i.b(R.string.food_details);
            } else {
                x0.f23314a.getClass();
                c3VarB = g2.b(x0.f23746ze);
            }
            return new s(cVar2, rVar, lVar, f0Var, uVar, fVarA, f0VarB, listB, cVarB, rVar2, z14, z15, zY4, z16, i14, c3VarB);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ll11/s;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.RecipeDetailsViewModel$uiState$2", f = "RecipeDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<r53.j<? super s>, t13.d<? super Unit>, Object> {
        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super s> jVar, t13.d<? super Unit> dVar) {
            return ((e) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t.this.x4();
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public t(String str, b bVar, i01.i iVar, j11.c cVar, b63.u uVar, b11.m mVar, f1 f1Var, n1 n1Var, v01.y yVar, v01.w wVar, m01.g gVar, s01.f fVar, e01.a aVar) {
        int i14;
        c3 c3VarB;
        str.getClass();
        bVar.getClass();
        iVar.getClass();
        cVar.getClass();
        uVar.getClass();
        mVar.getClass();
        f1Var.getClass();
        n1Var.getClass();
        yVar.getClass();
        wVar.getClass();
        gVar.getClass();
        fVar.getClass();
        aVar.getClass();
        this.f108253a = str;
        this.f108254b = bVar;
        this.f108255c = iVar;
        this.f108256d = cVar;
        this.f108257e = uVar;
        this.f108258f = mVar;
        this.f108259g = f1Var;
        this.f108260h = n1Var;
        this.f108261i = yVar;
        this.f108262j = wVar;
        this.f108263k = gVar;
        this.f108264l = fVar;
        this.f108265m = aVar;
        p2 p2VarA = q2.a(null);
        this.f108266n = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f108267o = p2VarA2;
        p2 p2VarA3 = q2.a(c.i.f108288a);
        this.f108268p = p2VarA3;
        p2 p2VarA4 = q2.a(aVar.n());
        this.f108269q = p2VarA4;
        p2 p2VarA5 = q2.a(null);
        this.f108270r = p2VarA5;
        r53.v vVar = new r53.v(new e(null), r53.s.n(p2VarA3, p2VarA2, p2VarA4, p2VarA, p2VarA5, new d(null)));
        w9.a aVarA = v1.a(this);
        n2 n2VarA = k2.a.a(k2.f150703a, 2);
        a11.r rVarN = aVar.n();
        boolean z14 = (cVar == j11.c.PHOTO_RESULT || iVar == i01.i.IMAGE_RECOGNITION) ? false : true;
        boolean z15 = (bVar instanceof b.a) && cVar == j11.c.DAILY_LOG;
        boolean zY4 = y4();
        boolean z16 = cVar == j11.c.DAILY_LOG;
        if (bVar instanceof b.a) {
            i14 = R.string.lbl_add;
        } else {
            if (!(bVar instanceof b.c) && !(bVar instanceof b.C2080b)) {
                u0.r();
                throw null;
            }
            i14 = R.string.lbl_save;
        }
        int i15 = i14;
        if (y4()) {
            c3VarB = c22.i.b(R.string.food_details);
        } else {
            x0.f23314a.getClass();
            c3VarB = g2.b(x0.f23746ze);
        }
        this.f108271t = r53.s.K(vVar, aVarA, n2VarA, new s(null, null, null, null, null, null, null, null, null, rVarN, z14, z15, zY4, z16, i15, c3VarB, 511, null));
    }

    public final void x4() {
        ge1.b.T(v1.a(this), null, null, new w(this, null), 3);
    }

    public final boolean y4() {
        return (this.f108254b instanceof b.c) && this.f108256d == j11.c.DAILY_LOG;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll11/t$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ll11/t$b;", "", "<init>", "()V", "a", "b", "c", "Ll11/t$b$a;", "Ll11/t$b$b;", "Ll11/t$b$c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll11/t$b$a;", "Ll11/t$b;", "", "servingQty", "", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final double f108272a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f108273b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f108274c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(double d14, String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.f108272a = d14;
                this.f108273b = str;
                this.f108274c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Double.compare(this.f108272a, aVar.f108272a) == 0 && p005kotlin.jvm.internal.s.g(this.f108273b, aVar.f108273b) && p005kotlin.jvm.internal.s.g(this.f108274c, aVar.f108274c);
            }

            public final int hashCode() {
                return this.f108274c.hashCode() + wr.g.j(Double.hashCode(this.f108272a) * 31, 31, this.f108273b);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("Add(servingQty=");
                sb3.append(this.f108272a);
                sb3.append(", regionCode=");
                sb3.append(this.f108273b);
                return e0.h(sb3, ", languageCode=", this.f108274c, ")");
            }
        }

        /* JADX INFO: renamed from: l11.t$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll11/t$b$b;", "Ll11/t$b;", "", "servingQty", "", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2080b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final double f108275a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f108276b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f108277c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2080b(double d14, String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.f108275a = d14;
                this.f108276b = str;
                this.f108277c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2080b)) {
                    return false;
                }
                C2080b c2080b = (C2080b) obj;
                return Double.compare(this.f108275a, c2080b.f108275a) == 0 && p005kotlin.jvm.internal.s.g(this.f108276b, c2080b.f108276b) && p005kotlin.jvm.internal.s.g(this.f108277c, c2080b.f108277c);
            }

            public final int hashCode() {
                return this.f108277c.hashCode() + wr.g.j(Double.hashCode(this.f108275a) * 31, 31, this.f108276b);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("AddToResults(servingQty=");
                sb3.append(this.f108275a);
                sb3.append(", regionCode=");
                sb3.append(this.f108276b);
                return e0.h(sb3, ", languageCode=", this.f108277c, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll11/t$b$c;", "Ll11/t$b;", "", "logId", "<init>", "(Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f108278a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(null);
                str.getClass();
                this.f108278a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f108278a, ((c) obj).f108278a);
            }

            public final int hashCode() {
                return this.f108278a.hashCode();
            }

            public final String toString() {
                return am.j.m("Edit(logId=", this.f108278a, ")");
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Ll11/t$c;", "", "<init>", "()V", "h", "g", "f", JWKParameterNames.OCT_KEY_VALUE, IntegerTokenConverter.CONVERTER_KEY, "c", JWKParameterNames.RSA_EXPONENT, "j", "a", "d", "l", "b", "Ll11/t$c$a;", "Ll11/t$c$b;", "Ll11/t$c$c;", "Ll11/t$c$d;", "Ll11/t$c$e;", "Ll11/t$c$f;", "Ll11/t$c$g;", "Ll11/t$c$h;", "Ll11/t$c$i;", "Ll11/t$c$j;", "Ll11/t$c$k;", "Ll11/t$c$l;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/t$c$a;", "Ll11/t$c;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f108279a = new a();

            private a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -882032454;
            }

            public final String toString() {
                return "Deleted";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll11/t$c$b;", "Ll11/t$c;", "Lb63/o;", "date", "Lb11/i;", "deletedFood", "<init>", "(Lb63/o;Lb11/i;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b63.o f108280a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b11.i f108281b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b63.o oVar, b11.i iVar) {
                super(null);
                oVar.getClass();
                iVar.getClass();
                this.f108280a = oVar;
                this.f108281b = iVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p005kotlin.jvm.internal.s.g(this.f108280a, bVar.f108280a) && p005kotlin.jvm.internal.s.g(this.f108281b, bVar.f108281b);
            }

            public final int hashCode() {
                return this.f108281b.hashCode() + (this.f108280a.f16206a.hashCode() * 31);
            }

            public final String toString() {
                return "DeletedLoggedRecipe(date=" + this.f108280a + ", deletedFood=" + this.f108281b + ")";
            }
        }

        /* JADX INFO: renamed from: l11.t$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/t$c$c;", "Ll11/t$c;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2081c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2081c f108282a = new C2081c();

            private C2081c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2081c);
            }

            public final int hashCode() {
                return -102394135;
            }

            public final String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/t$c$d;", "Ll11/t$c;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f108283a = new d();

            private d() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1342124773;
            }

            public final String toString() {
                return "Favorite";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/t$c$e;", "Ll11/t$c;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f108284a = new e();

            private e() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -905211280;
            }

            public final String toString() {
                return "GenericError";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/t$c$f;", "Ll11/t$c;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f108285a = new f();

            private f() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -2106864523;
            }

            public final String toString() {
                return "InvalidServingSize";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/t$c$g;", "Ll11/t$c;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f108286a = new g();

            private g() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 1905303682;
            }

            public final String toString() {
                return "LoadFailed";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/t$c$h;", "Ll11/t$c;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class h extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f108287a = new h();

            private h() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 1317865284;
            }

            public final String toString() {
                return "Loaded";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/t$c$i;", "Ll11/t$c;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class i extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f108288a = new i();

            private i() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return -2095844899;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll11/t$c$j;", "Ll11/t$c;", "Lb63/o;", "date", "Lb11/i$b;", "loggedFood", "<init>", "(Lb63/o;Lb11/i$b;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class j extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b63.o f108289a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b11.i.b f108290b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(b63.o oVar, b11.i.b bVar) {
                super(null);
                oVar.getClass();
                bVar.getClass();
                this.f108289a = oVar;
                this.f108290b = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return p005kotlin.jvm.internal.s.g(this.f108289a, jVar.f108289a) && p005kotlin.jvm.internal.s.g(this.f108290b, jVar.f108290b);
            }

            public final int hashCode() {
                return this.f108290b.hashCode() + (this.f108289a.f16206a.hashCode() * 31);
            }

            public final String toString() {
                return "Saved(date=" + this.f108289a + ", loggedFood=" + this.f108290b + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/t$c$k;", "Ll11/t$c;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class k extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final k f108291a = new k();

            private k() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return -1591608013;
            }

            public final String toString() {
                return "ServingSizeGreaterThanZeroError";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/t$c$l;", "Ll11/t$c;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class l extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final l f108292a = new l();

            private l() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return 793136884;
            }

            public final String toString() {
                return "Unfavorite";
            }
        }

        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
