package hq;

import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhq/n0;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<com.garmin.android.apps.connectmobile.repcounting.model.d> f85087a = p13.j0.f134944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<? extends h> f85089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y0<List<h>> f85090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.w0 f85091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.w0 f85092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.w0 f85093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.y0<Unit> f85094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.y0<i> f85095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f85096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.lifecycle.w0 f85097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.lifecycle.w0 f85098l;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseFilterViewModel$filteredExerciseList$1$1", f = "SelectExerciseFilterViewModel.kt", l = {30, 32}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<androidx.lifecycle.t0<List<? extends com.garmin.android.apps.connectmobile.repcounting.model.d>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f85099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f85100b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<h> f85102d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<h> list, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f85102d = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = n0.this.new a(this.f85102d, dVar);
            aVar.f85100b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(androidx.lifecycle.t0<List<? extends com.garmin.android.apps.connectmobile.repcounting.model.d>> t0Var, t13.d<? super Unit> dVar) {
            return ((a) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L19;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f85100b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f85099a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            n0 n0Var = n0.this;
            List<com.garmin.android.apps.connectmobile.repcounting.model.d> list = n0Var.f85087a;
            CharSequence charSequence = n0Var.f85096j;
            List<h> list2 = this.f85102d;
            list2.getClass();
            boolean z14 = n0Var.f85088b;
            this.f85100b = t0Var;
            this.f85099a = 1;
            obj = y0.a(list, charSequence, list2, z14, this);
            if (obj != aVar) {
            }
            return aVar;
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((r0) it.next()).f85140a);
            }
            this.f85100b = null;
            this.f85099a = 2;
        }
    }

    public n0() {
        androidx.lifecycle.y0<List<h>> y0Var = new androidx.lifecycle.y0<>();
        this.f85090d = y0Var;
        this.f85091e = t1.a(y0Var, new f0(5));
        this.f85092f = t1.a(y0Var, new f0(6));
        this.f85093g = t1.a(y0Var, new f0(7));
        this.f85094h = new androidx.lifecycle.y0<>();
        this.f85095i = new androidx.lifecycle.y0<>();
        this.f85096j = "";
        androidx.lifecycle.w0 w0VarB = t1.b(y0Var, new ho0.g(this, 4));
        this.f85097k = w0VarB;
        this.f85098l = t1.a(w0VarB, new f0(8));
    }
}
