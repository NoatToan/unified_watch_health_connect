package kx0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.menstrualcycle.network.ServerResponseException;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import o13.t;
import o53.b0;
import o53.c2;
import o53.e2;
import o53.l1;
import o53.s0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkx0/m;", "Landroidx/lifecycle/u1;", "Lo53/b0;", "<init>", "()V", "b", "c", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends u1 implements b0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f107057l = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f107060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f107061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f107062e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public db1.m f107065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f107066i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f107058a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<cx0.a<UserSettingsDTO>> f107059b = new y0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e2 f107063f = ge1.b.h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<cx0.a<Unit>> f107064g = new y0<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f107067j = o13.m.b(new kt2.d(24));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<fw.m<Unit>> f107068k = new y0<>();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkx0/m$b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lo53/r;", "", "mGetSettingsCall", "<init>", "(Lkx0/m;Lo53/r;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o53.r<Unit> f107069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f107070b;

        public b(m mVar, o53.r<Unit> rVar) {
            rVar.getClass();
            this.f107070b = mVar;
            this.f107069a = rVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            this.f107070b.f107061d = -1L;
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            o53.r<Unit> rVar = this.f107069a;
            if (cVar == cVar2) {
                rVar.p(null);
            } else {
                rVar.O(new ServerResponseException(cVar));
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkx0/m$c;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lo53/r;", "", "mPostSettingsCall", "<init>", "(Lkx0/m;Lo53/r;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o53.r<Unit> f107071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f107072b;

        public c(m mVar, o53.r<Unit> rVar) {
            rVar.getClass();
            this.f107072b = mVar;
            this.f107071a = rVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            this.f107072b.f107062e = -1L;
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            o53.r<Unit> rVar = this.f107071a;
            if (cVar == cVar2) {
                rVar.p(null);
            } else {
                rVar.O(new ServerResponseException(cVar));
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsViewModel$getPregnancySettings$1", f = "MenstrualCycleSettingsViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107073a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return m.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107073a;
            m mVar = m.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    ax0.a aVar2 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                    this.f107073a = 1;
                    obj = aVar2.B(this);
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
                    i52.a aVar3 = i52.a.f91796a;
                    boolean zIsEmpty = true ^ list.isEmpty();
                    aVar3.getClass();
                    i52.a.s(zIsEmpty);
                    if (list.isEmpty()) {
                        mVar.f107065h = null;
                        mVar.f107066i = null;
                    } else {
                        ArrayList arrayListZ = h0.Z(list);
                        m.y4(mVar, arrayListZ);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : arrayListZ) {
                            if (!p005kotlin.jvm.internal.s.g((db1.m) obj2, mVar.f107065h)) {
                                arrayList.add(obj2);
                            }
                        }
                        mVar.f107066i = arrayList;
                    }
                }
                int i15 = m.f107057l;
                mVar.A4().j(tb1.d.b(a0Var.f25746b, new Integer(a0Var.f25745a.code()), null, null, 12));
            } catch (Throwable th3) {
                int i16 = m.f107057l;
                mVar.A4().j(tb1.d.b(null, null, th3, null, 11));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable x4(m mVar, UserSettingsDTO userSettingsDTO, JSONObject jSONObject, v13.c cVar) {
        r rVar;
        mVar.getClass();
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f107112c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f107112c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(mVar, cVar);
            }
        } else {
            rVar = new r(mVar, cVar);
        }
        Object objC = rVar.f107110a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f107112c;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                t13.g.a aVar2 = mVar.getF195311f().get(l1.f129368i0);
                aVar2.getClass();
                o53.s sVar = new o53.s((l1) aVar2);
                mVar.f107062e = new Long(((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).a(userSettingsDTO, jSONObject, new c(mVar, sVar)));
                rVar.f107112c = 1;
                objC = sVar.C(rVar);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objC);
            }
            return null;
        } catch (Throwable th3) {
            return th3;
        }
    }

    public static final void y4(m mVar, ArrayList arrayList) {
        Object obj;
        mVar.getClass();
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
                db1.m mVar2 = (db1.m) obj2;
                if (mVar2.getDeliveryDate() == null && mVar2.getEndDate() == null && mVar2.getDueDate() != null) {
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
            mVar.f107065h = (db1.m) obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Serializable z4(m mVar, db1.m mVar2, LocalDate localDate, v13.c cVar) {
        s sVar;
        mVar.getClass();
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f107115c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f107115c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(mVar, cVar);
            }
        } else {
            sVar = new s(mVar, cVar);
        }
        Object objS = sVar.f107113a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f107115c;
        db1.m mVar3 = null;
        try {
            if (i15 == 0) {
                o13.r.b(objS);
                mVar2.A(DateTime.now());
                ax0.a aVar2 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                String string = localDate.toString();
                string.getClass();
                sVar.f107115c = 1;
                objS = aVar2.s(string, mVar2, sVar);
                if (objS == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objS);
            }
            a0 a0Var = (a0) objS;
            if (a0Var.f25745a.isSuccessful()) {
                mVar3 = (db1.m) a0Var.f25746b;
                th = null;
            } else {
                String str = "Error saving pregnancy settings. Response code=" + a0Var.f25745a.code();
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "MenstrualCycleSettingsViewModel", str);
                th = new IOException(str);
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return new o13.p(mVar3, th);
    }

    public final y0<fw.m<List<db1.m>>> A4() {
        return (y0) this.f107067j.getValue();
    }

    public final void B4() {
        fw.m<List<db1.m>> mVarD = A4().d();
        if ((mVarD != null ? mVarD.f73769b : null) != fw.p.LOADING) {
            A4().m(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(this), null, null, new d(null), 3);
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        return s0.f129406a.plus(this.f107063f);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        this.f107063f.c(null);
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        if (cVar.e(this.f107061d)) {
            cVar.b(this.f107061d);
        }
        if (cVar.e(this.f107062e)) {
            cVar.b(this.f107062e);
        }
        super.onCleared();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkx0/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
