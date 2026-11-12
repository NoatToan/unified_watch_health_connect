package pv1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import jv1.e0;
import kv1.y;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import wt1.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateFROGPreferences$1", f = "FBTEditPreferencesViewModel.kt", l = {1240}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f141556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f141557c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateFROGPreferences$1$settingsResult$1", f = "FBTEditPreferencesViewModel.kt", l = {1240}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f141559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f141560c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, e0 e0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f141559b = bVar;
            this.f141560c = e0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f141559b, this.f141560c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141558a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVarZ4 = b.Z4(this.f141559b);
            this.f141558a = 1;
            yVarZ4.getClass();
            Object objJ = f0.J(yVarZ4, new kv1.b0(yVarZ4, this.f141560c, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f141557c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f141557c, dVar);
        iVar.f141556b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f141556b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141555a;
        b bVar = this.f141557c;
        v2 v2Var = null;
        if (i14 == 0) {
            r.b(obj);
            int i15 = b.f141488i1;
            bVar.h5().j(g3.a.c(g3.f35298f));
            mv1.c cVar = (mv1.c) bVar.Y0.getValue();
            List<String> list = cVar != null ? cVar.f121181a : null;
            Long userProfilePk = bVar.f141497k0.getUserProfilePk();
            Long l14 = new Long(userProfilePk != null ? userProfilePk.longValue() : b.Y4(bVar));
            q.f187120f.getClass();
            e0 e0Var = new e0(l14, q.a.g(), list, j0.f134944a, jv1.a.GENERIC);
            if (list != null && !list.isEmpty() && !s.g(bVar.X0.f121181a, list)) {
                o53.j0 j0VarJ = ge1.b.j(b0Var, null, null, new a(bVar, e0Var, null), 3);
                this.f141556b = b0Var;
                this.f141555a = 1;
                obj = j0VarJ.C(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (v2Var instanceof v2.a) {
                int i16 = b.f141488i1;
                bVar.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error updating adaptive coach plan settings ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "EventBaseViewModel", strD);
            } else {
                int i17 = b.f141488i1;
                bVar.h5().j(g3.a.e(g3.f35298f));
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            int i18 = b.f141488i1;
            bVar.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error updating adaptive coach plan settings ");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "EventBaseViewModel", strD2);
        } else {
            int i19 = b.f141488i1;
            bVar.h5().j(g3.a.e(g3.f35298f));
        }
        return Unit.INSTANCE;
    }
}
