package q21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lq21/r;", "Landroidx/lifecycle/u1;", "Lm01/g;", "nutritionRepository", "Ld01/c;", "nutritionStore", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Lm01/g;Ld01/c;Ls01/f;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends u1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f142287j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.g f142288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d01.c f142289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s01.f f142290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f142291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f142292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l01.k f142293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f142294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f142295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f142296i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lq21/q;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.settings.viewmodel.NutritionSettingsViewModel$uiState$1", f = "NutritionSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super q>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super q> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = r.f142287j;
            r rVar = r.this;
            rVar.getClass();
            ge1.b.T(v1.a(rVar), null, null, new s(rVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public r(m01.g gVar, d01.c cVar, s01.f fVar) {
        gVar.getClass();
        cVar.getClass();
        fVar.getClass();
        this.f142288a = gVar;
        this.f142289b = cVar;
        this.f142290c = fVar;
        p2 p2VarA = q2.a(Boolean.FALSE);
        this.f142291d = p2VarA;
        this.f142292e = p2VarA;
        p2 p2VarA2 = q2.a(new q(false, false, null, null, true, null, false, false, null, 495, null));
        this.f142295h = p2VarA2;
        v vVar = new v(new b(null), p2VarA2);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f142296i = r53.s.K(vVar, aVarA, k2.a.f150706c, new q(false, false, null, null, true, null, false, fVar.e(), null, 367, null));
    }

    public final void x4(l01.k kVar) {
        if (this.f142293f != null) {
            this.f142294g = true;
        }
        this.f142293f = kVar;
    }

    public final void y4(int i14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f142295h;
            value = p2Var.getValue();
        } while (!p2Var.b(value, q.a((q) value, false, false, null, null, false, Integer.valueOf(i14), false, false, null, 479)));
    }

    public final void z4(l01.k kVar) {
        p2 p2Var;
        Object value;
        q qVar;
        boolean zBooleanValue;
        Integer num;
        l01.i iVar;
        s21.s.Companion companion = s21.s.INSTANCE;
        String str = kVar.f107878a;
        companion.getClass();
        boolean z14 = s21.s.Companion.a(str) != s21.s.NO_GOAL;
        do {
            p2Var = this.f142295h;
            value = p2Var.getValue();
            qVar = (q) value;
            Boolean bool = kVar.f107887j;
            zBooleanValue = bool != null ? bool.booleanValue() : false;
            num = kVar.f107884g;
            iVar = kVar.f107885h;
        } while (!p2Var.b(value, q.a(qVar, z14, zBooleanValue, num, iVar != null ? new s21.e(iVar.f107867a, iVar.f107868b, iVar.f107869c) : null, false, null, false, this.f142290c.e(), null, 288)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq21/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
