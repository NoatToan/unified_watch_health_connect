package l11;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;
import r53.q2;
import v01.d0;
import v01.e0;
import v01.n1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Ll11/n;", "Landroidx/lifecycle/u1;", "", "customMealId", "Lb63/u;", "dateTime", "Lb11/m;", "mealViewNavArgs", "Li01/i;", "logCategory", "Lj11/c;", "logDestination", "Lv01/e0;", "getCustomMealsUseCase", "Lv01/n1;", "logFoodUseCase", "Lm01/g;", "nutritionRepository", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(JLb63/u;Lb11/m;Li01/i;Lj11/c;Lv01/e0;Lv01/n1;Lm01/g;Ls01/f;)V", "b", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f108190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.u f108191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b11.m f108192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i01.i f108193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j11.c f108194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e0 f108195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f108196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m01.g f108197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s01.f f108198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f108199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f108200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f108201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f108202m;

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f108213a;

        static {
            int[] iArr = new int[j11.c.values().length];
            try {
                iArr[j11.c.CUSTOM_MEAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j11.c.PHOTO_RESULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j11.c.RECIPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j11.c.DAILY_LOG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f108213a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.MealDetailsViewModel$fetchCustomMeal$1", f = "MealDetailsViewModel.kt", l = {101}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f108214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f108215b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = n.this.new d(dVar);
            dVar2.f108215b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            s21.o oVar;
            i53.c cVarB;
            List<s21.n> listB0;
            s21.o oVar2;
            i53.c cVarB2;
            List<s21.n> listB1;
            b0 b0Var = (b0) this.f108215b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f108214a;
            n nVar = n.this;
            if (i14 == 0) {
                o13.r.b(obj);
                nVar.f108201l.setValue(b.f.f108208a);
                e0 e0Var = nVar.f108195f;
                long j8 = nVar.f108190a;
                b63.u uVar = nVar.f108191b;
                b11.m mVar = nVar.f108192c;
                b11.k kVar = mVar.f14339b;
                boolean z14 = mVar.f14338a;
                this.f108215b = b0Var;
                this.f108214a = 1;
                obj = ge1.b.e0(e0Var.f174317d, new d0(j8, z14, uVar, kVar, e0Var, true, null), this);
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
            if (v2Var instanceof v2.a) {
                a2 a2Var = a2.NUTRITION;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to load meal. exception=");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "FoodDetailsViewModel", strD);
                nVar.f108201l.setValue(b.d.f108206a);
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                p2 p2Var = nVar.f108199j;
                s01.f fVar = nVar.f108198i;
                l lVar = (l) ((v2.b) v2Var).f47386a;
                j11.c cVar = nVar.f108194e;
                boolean z15 = (cVar == j11.c.PHOTO_RESULT || nVar.f108193d == i01.i.IMAGE_RECOGNITION) ? false : true;
                j11.c cVar2 = j11.c.DAILY_LOG;
                boolean z16 = cVar == cVar2;
                boolean z17 = cVar == cVar2;
                if (!fVar.e() || (oVar = lVar.f108181c.f75432i) == null || (listB0 = o72.t.b0(oVar)) == null) {
                    cVarB = j53.l.b();
                } else {
                    b11.f fVarB = v21.a.b(lVar.f108179a);
                    ArrayList arrayList = new ArrayList(p13.y.r(listB0, 10));
                    for (s21.n nVar2 : listB0) {
                        arrayList.add(new b11.o(nVar2, xy2.b.z(fVarB, nVar2.f156152b)));
                    }
                    cVarB = i53.a.j(arrayList);
                }
                i53.c cVar3 = cVarB;
                if (!fVar.e() || (oVar2 = lVar.f108181c.f75432i) == null || (listB1 = o72.t.b0(oVar2)) == null) {
                    cVarB2 = j53.l.b();
                } else {
                    b11.f fVar2 = lVar.f108181c.f75429f;
                    b11.f fVarB2 = v21.a.b(lVar.f108179a);
                    ArrayList arrayList2 = new ArrayList(p13.y.r(listB1, 10));
                    for (s21.n nVar3 : listB1) {
                        arrayList2.add(new b11.o(nVar3, zf.b.F(xy2.b.z(fVar2, nVar3.f156152b), xy2.b.z(fVarB2, nVar3.f156152b))));
                    }
                    cVarB2 = i53.a.j(arrayList2);
                }
                p2Var.k(null, new m(lVar, z15, z16, z17, cVar3, cVarB2));
                nVar.f108201l.setValue(b.e.f108207a);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public n(long j8, b63.u uVar, b11.m mVar, i01.i iVar, j11.c cVar, e0 e0Var, n1 n1Var, m01.g gVar, s01.f fVar) {
        uVar.getClass();
        mVar.getClass();
        iVar.getClass();
        cVar.getClass();
        e0Var.getClass();
        n1Var.getClass();
        gVar.getClass();
        fVar.getClass();
        this.f108190a = j8;
        this.f108191b = uVar;
        this.f108192c = mVar;
        this.f108193d = iVar;
        this.f108194e = cVar;
        this.f108195f = e0Var;
        this.f108196g = n1Var;
        this.f108197h = gVar;
        this.f108198i = fVar;
        p2 p2VarA = q2.a(null);
        this.f108199j = p2VarA;
        this.f108200k = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(b.f.f108208a);
        this.f108201l = p2VarA2;
        this.f108202m = r53.s.d(p2VarA2);
        x4();
    }

    public final void x4() {
        ge1.b.T(v1.a(this), null, null, new d(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll11/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Ll11/n$b;", "", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "d", "f", "b", "c", "g", "a", "h", "Ll11/n$b$a;", "Ll11/n$b$b;", "Ll11/n$b$c;", "Ll11/n$b$d;", "Ll11/n$b$e;", "Ll11/n$b$f;", "Ll11/n$b$g;", "Ll11/n$b$h;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/n$b$a;", "Ll11/n$b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f108203a = new a();

            private a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 173189935;
            }

            public final String toString() {
                return "Deleted";
            }
        }

        /* JADX INFO: renamed from: l11.n$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/n$b$b;", "Ll11/n$b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2079b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2079b f108204a = new C2079b();

            private C2079b() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2079b);
            }

            public final int hashCode() {
                return 144513694;
            }

            public final String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/n$b$c;", "Ll11/n$b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f108205a = new c();

            private c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1147180773;
            }

            public final String toString() {
                return "GenericError";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/n$b$d;", "Ll11/n$b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f108206a = new d();

            private d() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1125112339;
            }

            public final String toString() {
                return "LoadFailed";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/n$b$e;", "Ll11/n$b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f108207a = new e();

            private e() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 382073391;
            }

            public final String toString() {
                return "Loaded";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll11/n$b$f;", "Ll11/n$b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f108208a = new f();

            private f() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -1040622510;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll11/n$b$g;", "Ll11/n$b;", "Lb63/u;", "dateTime", "Lb11/a;", "meal", "<init>", "(Lb63/u;Lb11/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b63.u f108209a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b11.a f108210b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(b63.u uVar, b11.a aVar) {
                super(null);
                uVar.getClass();
                aVar.getClass();
                this.f108209a = uVar;
                this.f108210b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return p005kotlin.jvm.internal.s.g(this.f108209a, gVar.f108209a) && p005kotlin.jvm.internal.s.g(this.f108210b, gVar.f108210b);
            }

            public final int hashCode() {
                return this.f108210b.hashCode() + (this.f108209a.f16216a.hashCode() * 31);
            }

            public final String toString() {
                return "Saved(dateTime=" + this.f108209a + ", meal=" + this.f108210b + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll11/n$b$h;", "Ll11/n$b;", "", "customMealId", "", "isFavorite", "<init>", "(JZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class h extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f108211a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f108212b;

            public h(long j8, boolean z14) {
                super(null);
                this.f108211a = j8;
                this.f108212b = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.f108211a == hVar.f108211a && this.f108212b == hVar.f108212b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f108212b) + (Long.hashCode(this.f108211a) * 31);
            }

            public final String toString() {
                return "UpdatedFavorite(customMealId=" + this.f108211a + ", isFavorite=" + this.f108212b + ")";
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
