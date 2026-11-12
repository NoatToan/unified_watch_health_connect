package kb1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c83.a0;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import k62.l;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkb1/e;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f103821a = m.b(new l(26));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<cx0.a<Unit>> f103822b = new y0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<fw.m<LocalDate>> f103823c = new y0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f103824d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.PregnancyHistoryViewModel$deletePregnancy$1", f = "PregnancyHistoryViewModel.kt", l = {94}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LocalDate f103826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f103827c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LocalDate localDate, e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f103826b = localDate;
            this.f103827c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f103826b, this.f103827c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f103825a;
            LocalDate localDate = this.f103826b;
            e eVar = this.f103827c;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                    String string = localDate.toString();
                    string.getClass();
                    this.f103825a = 1;
                    bVar.getClass();
                    obj = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.b(string, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                eVar.f103823c.j(tb1.d.b(localDate, new Integer(((a0) obj).f25745a.code()), null, null, 12));
            } catch (Throwable th3) {
                eVar.f103823c.j(tb1.d.b(localDate, null, th3, null, 10));
            }
            return Unit.INSTANCE;
        }
    }

    public e() {
        ((cb1.b) KoinJavaComponent.get$default(cb1.b.class, null, null, 6, null)).getUserSettings();
        this.f103824d = m.b(new l(27));
        m.b(new jx0.e(this, 15));
    }

    public static final void x4(e eVar, db1.m mVar) {
        List<db1.m> listD = eVar.z4().d();
        ArrayList arrayList = new ArrayList();
        if (listD != null) {
            for (db1.m mVar2 : h0.Z(listD)) {
                if (mVar2.getDueDate() != null && mVar.getDueDate() != null) {
                    if (s.g(mVar2.getDueDate(), mVar.getDueDate())) {
                        arrayList.add(mVar);
                    } else {
                        arrayList.add(mVar2);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        eVar.z4().j(arrayList);
    }

    public final void y4(LocalDate localDate) {
        y0<fw.m<LocalDate>> y0Var = this.f103823c;
        fw.m<LocalDate> mVarD = y0Var.d();
        if ((mVarD != null ? mVarD.f73769b : null) != fw.p.LOADING) {
            y0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(this), null, null, new a(localDate, this, null), 3);
        }
    }

    public final y0<List<db1.m>> z4() {
        return (y0) this.f103821a.getValue();
    }
}
