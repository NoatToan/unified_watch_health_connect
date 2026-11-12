package gb1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import org.joda.time.LocalDate;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgb1/l;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public db1.m f76683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f76684b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f76686d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f76689g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f76685c = o13.m.b(new g12.m(16));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f76687e = o13.m.b(new g12.m(17));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<fw.m<LocalDate>> f76688f = new y0<>();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgb1/l$a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lo53/r;", "saveSettingsCall", "<init>", "(Lgb1/l;Lo53/r;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o53.r<Unit> f76690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f76691b;

        public a(l lVar, o53.r<Unit> rVar) {
            rVar.getClass();
            this.f76691b = lVar;
            this.f76690a = rVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            this.f76691b.getClass();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            o53.r<Unit> rVar = this.f76690a;
            if (cVar == cVar2) {
                rVar.p(Unit.INSTANCE);
            } else {
                rVar.O(new Throwable());
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Unit unit) {
            eVar.getClass();
            unit.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsViewModel$getPregnancyList$1", f = "PregnancyDetailsViewModel.kt", l = {50}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f76692a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f76692a;
            l lVar = l.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                    this.f76692a = 1;
                    bVar.getClass();
                    obj = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.i(this);
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
                a0 a0Var = (a0) obj;
                List list = (List) a0Var.f25746b;
                if (list != null) {
                    i52.a aVar2 = i52.a.f91796a;
                    boolean zIsEmpty = true ^ list.isEmpty();
                    aVar2.getClass();
                    i52.a.s(zIsEmpty);
                    if (list.isEmpty()) {
                        lVar.f76683a = null;
                        lVar.f76684b = null;
                    } else {
                        ArrayList arrayListZ = h0.Z(list);
                        l.y4(lVar, arrayListZ);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : arrayListZ) {
                            if (!p005kotlin.jvm.internal.s.g((db1.m) obj2, lVar.f76683a)) {
                                arrayList.add(obj2);
                            }
                        }
                        lVar.f76684b = arrayList;
                    }
                }
                lVar.z4().j(tb1.d.b(a0Var.f25746b, new Integer(a0Var.f25745a.code()), null, null, 12));
            } catch (Throwable th3) {
                lVar.z4().j(tb1.d.b(null, null, th3, null, 11));
            }
            return Unit.INSTANCE;
        }
    }

    public l() {
        final int i14 = 0;
        this.f76686d = o13.m.b(new e23.a(this) { // from class: gb1.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f76682b;

            {
                this.f76682b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return this.f76682b.z4();
                    default:
                        return (y0) this.f76682b.f76689g.getValue();
                }
            }
        });
        ((cb1.b) KoinJavaComponent.get$default(cb1.b.class, null, null, 6, null)).getUserSettings();
        this.f76689g = o13.m.b(new g12.m(18));
        final int i15 = 1;
        o13.m.b(new e23.a(this) { // from class: gb1.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f76682b;

            {
                this.f76682b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return this.f76682b.z4();
                    default:
                        return (y0) this.f76682b.f76689g.getValue();
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable x4(l lVar, UserSettingsDTO userSettingsDTO, JSONObject jSONObject, v13.c cVar) {
        o oVar;
        lVar.getClass();
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f76699c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f76699c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(lVar, cVar);
            }
        } else {
            oVar = new o(lVar, cVar);
        }
        Object obj = oVar.f76697a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f76699c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                if (jSONObject == null || userSettingsDTO == null) {
                    return null;
                }
                o53.s sVarB = gl.b.b();
                ((cb1.b) KoinJavaComponent.get$default(cb1.b.class, null, null, 6, null)).a(userSettingsDTO, jSONObject, new a(lVar, sVarB));
                oVar.f76699c = 1;
                if (sVarB.C(oVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return new o13.p(Boolean.TRUE, null);
        } catch (Throwable th3) {
            a2 a2Var = a2.PREGNANCY;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "PregnancySetupViewModel", th3);
            return new o13.p(Boolean.FALSE, th3);
        }
    }

    public static final void y4(l lVar, ArrayList arrayList) {
        Object obj;
        lVar.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        tb1.c.a aVar = tb1.c.f163744a;
        i52.a.f91796a.getClass();
        ww0.a aVarL = i52.a.l();
        aVar.getClass();
        if (tb1.c.a.a(aVarL)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                db1.m mVar = (db1.m) obj2;
                if (mVar.getDeliveryDate() == null && mVar.getEndDate() == null && mVar.getDueDate() != null) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    LocalDate dueDate = ((db1.m) next).getDueDate();
                    dueDate.getClass();
                    do {
                        Object next2 = it.next();
                        LocalDate dueDate2 = ((db1.m) next2).getDueDate();
                        dueDate2.getClass();
                        if (dueDate.compareTo(dueDate2) < 0) {
                            next = next2;
                            dueDate = dueDate2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            lVar.f76683a = (db1.m) obj;
        }
    }

    public final void A4() {
        fw.m<List<db1.m>> mVarD = z4().d();
        if ((mVarD != null ? mVarD.f73769b : null) != fw.p.LOADING) {
            z4().m(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(this), null, null, new b(null), 3);
        }
    }

    public final y0<fw.m<List<db1.m>>> z4() {
        return (y0) this.f76685c.getValue();
    }
}
