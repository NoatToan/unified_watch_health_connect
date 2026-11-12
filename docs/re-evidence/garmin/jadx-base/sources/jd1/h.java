package jd1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.wallet.WalletConstants;
import e23.p;
import fw.m;
import j23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o13.t;
import o53.b0;
import o53.e2;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljd1/h;", "Landroidx/lifecycle/u1;", "Lo53/b0;", "Lpd1/a;", "reminderType", "Lpd1/c;", "defaultReminders", "<init>", "(Lpd1/a;Lpd1/c;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd1.a f98443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd1.c f98444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f98445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sd1.e f98446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f98447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e2 f98448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<m<Unit>> f98449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<m<Unit>> f98450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<m<Unit>> f98451i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.reminders.RemindersViewModel$deleteUserReminder$1", f = "RemindersViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98452a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ pd1.b f98454c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pd1.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f98454c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new a(this.f98454c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            pd1.b bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f98452a;
            pd1.b bVar2 = this.f98454c;
            h hVar = h.this;
            if (i14 == 0) {
                r.b(obj);
                sd1.e eVar = hVar.f98446d;
                pd1.a aVar2 = hVar.f98443a;
                Integer userReminderId = bVar2.getUserReminderId();
                int iIntValue = userReminderId != null ? userReminderId.intValue() : -1;
                this.f98452a = 1;
                eVar.getClass();
                obj = f0.J(eVar, new sd1.f(aVar2, iIntValue, null), this);
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
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                hVar.z4().debug("deleteUserReminder: success, got response code " + ((v2.b) v2Var).f47387b);
                pd1.c cVarD = hVar.C4().d();
                if (cVarD != null) {
                    ArrayList arrayList = new ArrayList();
                    List<pd1.b> listF = cVarD.f();
                    if (listF == null) {
                        listF = j0.f134944a;
                    }
                    arrayList.addAll(listF);
                    Iterator it = arrayList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        bVar = (pd1.b) next;
                    } while (!s.g(bVar != null ? bVar.getUserReminderId() : null, bVar2.getUserReminderId()));
                    arrayList.remove((pd1.b) next);
                    cVarD.h(h0.b1(arrayList));
                    cVarD.g();
                    h.x4(hVar, cVarD);
                }
                hVar.f98451i.j(m.a.g(m.f73767e, null, 3));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                Logger loggerZ4 = hVar.z4();
                Integer num = ((v2.a) v2Var).f47384b;
                loggerZ4.error("deleteUserReminder: failure, got response code " + num);
                hVar.f98451i.j(h.B4(hVar, num, null, 5));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.reminders.RemindersViewModel$getRemindersReminders$1", f = "RemindersViewModel.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98455a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f98455a;
            h hVar = h.this;
            if (i14 == 0) {
                r.b(obj);
                sd1.e eVar = hVar.f98446d;
                pd1.a aVar2 = hVar.f98443a;
                this.f98455a = 1;
                eVar.getClass();
                obj = f0.J(eVar, new sd1.g(aVar2, null), this);
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
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                v2.b bVar = (v2.b) v2Var;
                z.i("getRemindersReminders: got response code ", bVar.f47387b, hVar.z4());
                hVar.f98449g.j(m.a.g(m.f73767e, null, 3));
                pd1.c cVar = (pd1.c) bVar.f47386a;
                if (cVar != null) {
                    Logger loggerZ4 = hVar.z4();
                    List<pd1.b> listF = cVar.f();
                    loggerZ4.debug("getRemindersReminders: reminderList size=[" + (listF != null ? new Integer(listF.size()) : null) + "]");
                    h.x4(hVar, cVar);
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                v2.a aVar3 = (v2.a) v2Var;
                hVar.z4().error("getRemindersReminders: failure, got response code " + aVar3.f47384b);
                hVar.f98449g.j(h.B4(hVar, null, aVar3.f47383a, 3));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.reminders.RemindersViewModel$saveUserReminders$1", f = "RemindersViewModel.kt", l = {113}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98457a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ pd1.c f98459c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(pd1.c cVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f98459c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new c(this.f98459c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f98457a;
            h hVar = h.this;
            if (i14 == 0) {
                r.b(obj);
                sd1.e eVar = hVar.f98446d;
                this.f98457a = 1;
                eVar.getClass();
                obj = f0.J(eVar, new sd1.h(this.f98459c, null), this);
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
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                z.i("saveUserReminders: success, got response code ", ((v2.b) v2Var).f47387b, hVar.z4());
                hVar.f98450h.j(m.a.g(m.f73767e, null, 3));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                Logger loggerZ4 = hVar.z4();
                Integer num = ((v2.a) v2Var).f47384b;
                loggerZ4.debug("saveUserReminders: failure, got response code " + num);
                hVar.f98450h.j(h.B4(hVar, num, null, 5));
            }
            return Unit.INSTANCE;
        }
    }

    public h(pd1.a aVar, pd1.c cVar) {
        aVar.getClass();
        this.f98443a = aVar;
        this.f98444b = cVar;
        this.f98445c = o13.m.b(new j21.f(20));
        this.f98446d = sd1.e.a.b(sd1.e.f158625a);
        this.f98447e = o13.m.b(new j21.f(21));
        this.f98448f = ge1.b.h();
        this.f98449g = new y0<>();
        this.f98450h = new y0<>();
        this.f98451i = new y0<>();
    }

    public static m B4(h hVar, Integer num, Exception exc, int i14) {
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar;
        if ((i14 & 2) != 0) {
            num = null;
        }
        if ((i14 & 4) != 0) {
            exc = null;
        }
        hVar.getClass();
        if (exc != null) {
            m.f73767e.getClass();
            return m.a.a(null, exc);
        }
        l lVar = new l(200, 299);
        if (num != null && lVar.d(num.intValue())) {
            cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        } else if (num != null && num.intValue() == 401) {
            cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHENTICATED;
        } else {
            l lVar2 = new l(403, WalletConstants.ERROR_CODE_UNKNOWN);
            if (num == null || !lVar2.d(num.intValue())) {
                cVar = (num == null || !new l(500, 599).d(num.intValue())) ? com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE : com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE;
            } else {
                cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHORIZED;
            }
        }
        return cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS ? m.a.g(m.f73767e, null, 1) : m.a.c(m.f73767e, null, cVar, 5);
    }

    public static final void x4(h hVar, pd1.c cVar) {
        Logger loggerZ4 = hVar.z4();
        List<pd1.b> listF = cVar.f();
        loggerZ4.debug("updateUserReminderList: DTO with " + (listF != null ? Integer.valueOf(listF.size()) : null) + " reminders");
        List<pd1.b> listF2 = cVar.f();
        boolean z14 = false;
        if (listF2 != null && !listF2.isEmpty()) {
            z14 = true;
        }
        if (hVar.f98443a != pd1.a.PREGNANCY || !s.g(cVar.getDisplayDefaultPregnancyReminders(), Boolean.TRUE) || z14) {
            hVar.C4().j(cVar);
            return;
        }
        pd1.c cVar2 = hVar.f98444b;
        if (cVar2 != null) {
            hVar.D4(cVar2);
        }
    }

    public final void A4() {
        z4().debug("getRemindersReminders: start");
        y0<m<Unit>> y0Var = this.f98449g;
        m<Unit> mVarD = y0Var.d();
        if ((mVarD != null ? mVarD.f73769b : null) != fw.p.LOADING) {
            y0Var.j(m.a.f(m.f73767e, null, null, 3));
            ge1.b.T(v1.a(this), null, null, new b(null), 3);
        }
    }

    public final y0<pd1.c> C4() {
        return (y0) this.f98447e.getValue();
    }

    public final void D4(pd1.c cVar) {
        cVar.getClass();
        z4().debug("saveUserReminders: start");
        y0<m<Unit>> y0Var = this.f98450h;
        m<Unit> mVarD = y0Var.d();
        if ((mVarD != null ? mVarD.f73769b : null) != fw.p.LOADING) {
            y0Var.m(m.a.f(m.f73767e, null, null, 3));
            ge1.b.T(v1.a(this), null, null, new c(cVar, null), 3);
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        return s0.f129406a.plus(this.f98448f);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        this.f98448f.c(null);
        super.onCleared();
    }

    public final void y4(pd1.b bVar) {
        bVar.getClass();
        z4().debug("deleteUserReminder: ");
        y0<m<Unit>> y0Var = this.f98451i;
        m<Unit> mVarD = y0Var.d();
        if ((mVarD != null ? mVarD.f73769b : null) != fw.p.LOADING) {
            y0Var.m(m.a.f(m.f73767e, null, null, 3));
            ge1.b.T(v1.a(this), null, null, new a(bVar, null), 3);
        }
    }

    public final Logger z4() {
        return (Logger) this.f98445c.getValue();
    }
}
