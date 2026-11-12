package u21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu21/j0;", "Landroidx/lifecycle/u1;", "Ls21/t;", "locationInfo", "Lm01/g;", "nutritionRepo", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Ls21/t;Lm01/g;Ls01/f;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s21.t f168013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m01.g f168014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s01.f f168015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f168016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f168017e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ls21/u;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupLocationViewModel$locationState$1", f = "NutritionSetupLocationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<r53.j<? super s21.u>, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j0.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super s21.u> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            s21.u uVar;
            List list;
            l01.d dVar;
            Map map;
            String str;
            String str2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            j0 j0Var = j0.this;
            p2 p2Var = j0Var.f168016d;
            s21.t tVar = j0Var.f168013a;
            do {
                value = p2Var.getValue();
                uVar = (s21.u) value;
                List list2 = tVar.f156175d;
                if (list2 == null) {
                    list2 = p13.j0.f134944a;
                }
                list = list2;
                dVar = tVar.f156174c;
                Map map2 = tVar.f156173b;
                if (map2 == null) {
                    map2 = p13.k0.f134949a;
                    map2.getClass();
                }
                map = map2;
                str = tVar.f156172a;
                l01.d dVar2 = tVar.f156174c;
                Map map3 = tVar.f156173b;
                if (map3 == null) {
                    map3 = p13.k0.f134949a;
                    map3.getClass();
                }
                if (dVar2 == null) {
                    str2 = null;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map3.entrySet()) {
                        if (d53.u.q((String) entry.getKey(), dVar2.f107846c, true)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    str2 = (String) p13.h0.c0(linkedHashMap.values());
                }
            } while (!p2Var.b(value, s21.u.a(uVar, false, false, str, str2, map, dVar, list, 7)));
            return Unit.INSTANCE;
        }
    }

    public j0(s21.t tVar, m01.g gVar, s01.f fVar) {
        tVar.getClass();
        gVar.getClass();
        fVar.getClass();
        this.f168013a = tVar;
        this.f168014b = gVar;
        this.f168015c = fVar;
        p2 p2VarA = q2.a(new s21.u(false, false, false, null, null, null, null, null, 255, null));
        this.f168016d = p2VarA;
        r53.v vVar = new r53.v(new a(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f168017e = r53.s.K(vVar, aVarA, k2.a.f150706c, new s21.u(false, false, false, null, null, null, null, null, 255, null));
    }
}
