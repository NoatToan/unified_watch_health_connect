package rb1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c83.a0;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import cw.q;
import db1.m;
import db1.u;
import e23.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.t;
import o53.b0;
import o53.r;
import o53.s;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r70.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lrb1/g;", "Landroidx/lifecycle/u1;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f151619k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f151620a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f151622c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f151627h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public eb1.d f151621b = eb1.d.HAD_BABY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Date f151623d = new Date();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f151624e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f151625f = o13.m.b(new n(17));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f151626g = o13.m.b(new n(18));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f151628i = o13.m.b(new n(19));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f151629j = o13.m.b(new n(20));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrb1/g$b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lo53/r;", "saveSettingsCall", "<init>", "(Lrb1/g;Lo53/r;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r<Unit> f151630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f151631b;

        public b(g gVar, r<Unit> rVar) {
            rVar.getClass();
            this.f151631b = gVar;
            this.f151630a = rVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            int i14 = g.f151619k;
            this.f151631b.getClass();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            r<Unit> rVar = this.f151630a;
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

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151632a;

        static {
            int[] iArr = new int[eb1.d.values().length];
            try {
                iArr[eb1.d.HAD_BABY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eb1.d.EXPERIENCED_LOSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eb1.d.PREFER_NOT_SAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f151632a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingViewModel$getPregnancySettings$1", f = "PregnancyStopTrackingViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f151633a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f151633a;
            g gVar = g.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                    this.f151633a = 1;
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
                        gVar.f151627h = null;
                    } else {
                        g.z4(gVar, h0.Z(list));
                    }
                }
                int i15 = g.f151619k;
                gVar.A4().j(tb1.d.b(a0Var.f25746b, new Integer(a0Var.f25745a.code()), null, null, 12));
            } catch (Throwable th3) {
                int i16 = g.f151619k;
                gVar.A4().j(tb1.d.b(null, null, th3, null, 11));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingViewModel$updatePregnancySnapshotDTO$1$1", f = "PregnancyStopTrackingViewModel.kt", l = {84, 85}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a0 f151635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f151636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f151637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f151638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g f151639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f151640f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LocalDate localDate, m mVar, g gVar, boolean z14, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f151637c = localDate;
            this.f151638d = mVar;
            this.f151639e = gVar;
            this.f151640f = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f151637c, this.f151638d, this.f151639e, this.f151640f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a0 a0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f151636b;
            g gVar = this.f151639e;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a0Var = this.f151635a;
                        o13.r.b(obj);
                    }
                    int i15 = g.f151619k;
                    gVar.C4().j(tb1.d.b(new o13.p(a0Var.f25746b, Boolean.valueOf(this.f151640f)), new Integer(a0Var.f25745a.code()), null, null, 12));
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                String string = this.f151637c.toString();
                string.getClass();
                m mVar = this.f151638d;
                this.f151636b = 1;
                bVar.getClass();
                obj = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.q(string, mVar, this);
                if (obj == aVar) {
                }
                return aVar;
                a0 a0Var2 = (a0) obj;
                this.f151635a = a0Var2;
                this.f151636b = 2;
                if (g.x4(gVar, this) != aVar) {
                    a0Var = a0Var2;
                    int i16 = g.f151619k;
                    gVar.C4().j(tb1.d.b(new o13.p(a0Var.f25746b, Boolean.valueOf(this.f151640f)), new Integer(a0Var.f25745a.code()), null, null, 12));
                    return Unit.INSTANCE;
                }
                return aVar;
            } catch (Throwable th3) {
                int i17 = g.f151619k;
                gVar.C4().j(tb1.d.b(null, null, th3, null, 11));
            }
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r6 == r7) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x4(g gVar, v13.c cVar) {
        h hVar;
        gVar.getClass();
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f151643c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f151643c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(gVar, cVar);
            }
        } else {
            hVar = new h(gVar, cVar);
        }
        Object objL = hVar.f151641a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f151643c;
        if (i15 == 0) {
            o13.r.b(objL);
            com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
            pd1.a aVar2 = pd1.a.PREGNANCY;
            hVar.f151643c = 1;
            bVar.getClass();
            objL = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.l(aVar2, hVar);
            if (objL != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objL);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objL);
        }
        a0 a0Var = (a0) objL;
        if (!a0Var.f25745a.isSuccessful()) {
            String strM = am.j.m("Error disabling the pregnancy reminders ", a0Var.f25745a.message(), StringUtils.SPACE);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "PregnancyStopTrackingViewModel", strM);
        }
        return Unit.INSTANCE;
        a0 a0Var2 = (a0) objL;
        if (a0Var2.f25745a.isSuccessful()) {
            pd1.c cVar2 = (pd1.c) a0Var2.f25746b;
            if (cVar2 != null) {
                List<pd1.b> listF = cVar2.f();
                if (listF != null) {
                    for (pd1.b bVar2 : listF) {
                        if (bVar2 != null) {
                            bVar2.m(Boolean.FALSE);
                        }
                    }
                }
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                hVar.f151643c = 2;
                bVar3.getClass();
                objL = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.r(cVar2, hVar);
            }
        } else {
            String strN = fb1.c.n("Error retrieving the pregnancy reminders ", a0Var2.f25745a.message());
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var2, "PregnancyStopTrackingViewModel", strN);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable y4(g gVar, UserSettingsDTO userSettingsDTO, JSONObject jSONObject, v13.c cVar) {
        i iVar;
        gVar.getClass();
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f151646c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f151646c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(gVar, cVar);
            }
        } else {
            iVar = new i(gVar, cVar);
        }
        Object obj = iVar.f151644a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f151646c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                if (jSONObject == null || userSettingsDTO == null) {
                    return null;
                }
                s sVarB = gl.b.b();
                q.N().O(userSettingsDTO, jSONObject, new b(gVar, sVarB));
                iVar.f151646c = 1;
                if (sVarB.C(iVar) == aVar) {
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
            return new o13.p(Boolean.FALSE, th3);
        }
    }

    public static final void z4(g gVar, ArrayList arrayList) {
        Object obj;
        gVar.getClass();
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
                m mVar = (m) obj2;
                if (mVar.getDeliveryDate() == null && mVar.getEndDate() == null && mVar.getDueDate() != null) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    LocalDate dueDate = ((m) next).getDueDate();
                    dueDate.getClass();
                    do {
                        Object next2 = it.next();
                        LocalDate dueDate2 = ((m) next2).getDueDate();
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
            gVar.f151627h = (m) obj;
        }
    }

    public final y0<fw.m<List<m>>> A4() {
        return (y0) this.f151628i.getValue();
    }

    public final void B4() {
        fw.m<List<m>> mVarD = A4().d();
        if ((mVarD != null ? mVarD.f73769b : null) != fw.p.LOADING) {
            A4().m(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(this), null, null, new d(null), 3);
        }
    }

    public final y0<fw.m<o13.p<m, Boolean>>> C4() {
        return (y0) this.f151626g.getValue();
    }

    public final void D4(boolean z14) {
        m mVar = this.f151620a;
        if (mVar != null) {
            tb1.e.f163745a.getClass();
            DateTime dateTimeC = tb1.e.a.c();
            int i14 = c.f151632a[this.f151621b.ordinal()];
            if (i14 == 1) {
                Boolean bool = Boolean.FALSE;
                mVar.t(bool);
                mVar.C(bool);
                mVar.q(LocalDate.fromDateFields(this.f151623d));
                mVar.s(null);
                mVar.y(this.f151624e);
            } else if (i14 == 2) {
                mVar.t(Boolean.TRUE);
                mVar.C(Boolean.FALSE);
                mVar.q(null);
                mVar.s(this.f151622c ? LocalDate.now() : LocalDate.fromDateFields(this.f151623d));
                mVar.u(dateTimeC);
                mVar.y(this.f151624e);
            } else {
                if (i14 != 3) {
                    u0.r();
                    return;
                }
                mVar.t(Boolean.FALSE);
                mVar.C(Boolean.TRUE);
                mVar.q(null);
                mVar.s(LocalDate.now());
                mVar.D(dateTimeC);
            }
            mVar.A(dateTimeC);
            u weightGoalUserInputs = mVar.getWeightGoalUserInputs();
            if (weightGoalUserInputs != null) {
                boolean z15 = weightGoalUserInputs.getWeightInGram() != null;
                boolean z16 = weightGoalUserInputs.getHeightInCm() != null;
                if (weightGoalUserInputs.getWeightGoalRecommendation() && (z15 || z16)) {
                    weightGoalUserInputs.i(dateTimeC);
                }
            }
            LocalDate deliveryDate = mVar.getDeliveryDate();
            if (deliveryDate == null) {
                deliveryDate = mVar.getEndDate();
            }
            if (deliveryDate != null) {
                GarminConnectMobileApp.f28685g.getClass();
                mVar.F(GarminConnectMobileApp.a.a().getString(R.string.pregnancy_title) + StringUtils.SPACE + deliveryDate.getYear());
            }
        }
        m mVar2 = this.f151620a;
        LocalDate dueDate = mVar2 != null ? mVar2.getDueDate() : null;
        if (dueDate != null) {
            C4().m(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(this), null, null, new e(dueDate, mVar2, this, z14, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrb1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
