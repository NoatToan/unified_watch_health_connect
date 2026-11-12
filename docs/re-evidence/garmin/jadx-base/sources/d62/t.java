package d62;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.f0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld62/t;", "Landroidx/lifecycle/u1;", "Lcom/garmin/android/apps/connectmobile/f0;", "", "Ld62/i;", "profiles", "<init>", "(Ljava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends u1 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i> f58070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f58071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f58072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f58073d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ld62/b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionViewModel$uiState$1", f = "WorkoutActivityProfileSelectionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<r53.j<? super b>, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super b> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t tVar = t.this;
            i iVar = tVar.f58071b;
            p2 p2Var = tVar.f58072c;
            if (iVar != null) {
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, b.a((b) value2, null, iVar, null, null, 13)));
                do {
                    value3 = p2Var.getValue();
                } while (!p2Var.b(value3, b.a((b) value3, d.CHILD_PROFILE, null, null, tVar.f58070a, 6)));
            } else {
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, b.a((b) value, d.PARENT_PROFILE, null, null, tVar.f58070a, 4)));
            }
            return Unit.INSTANCE;
        }
    }

    public t(List<i> list) {
        list.getClass();
        this.f58070a = list;
        this.f58071b = (i) h0.K0(list);
        p2 p2VarA = q2.a(new b(null, null, null, null, 15, null));
        this.f58072c = p2VarA;
        v vVar = new v(new a(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f58073d = r53.s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
    }

    public final boolean x4() {
        Object value;
        if (this.f58071b != null) {
            return false;
        }
        p2 p2Var = this.f58072c;
        if (((b) p2Var.getValue()).f57998a != d.CHILD_PROFILE) {
            return false;
        }
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, b.a((b) value, d.PARENT_PROFILE, null, null, null, 12)));
        return true;
    }

    public final void y4(j jVar) {
        while (true) {
            p2 p2Var = this.f58072c;
            Object value = p2Var.getValue();
            j jVar2 = jVar;
            if (p2Var.b(value, b.a((b) value, null, null, jVar2, null, 11))) {
                return;
            } else {
                jVar = jVar2;
            }
        }
    }
}
