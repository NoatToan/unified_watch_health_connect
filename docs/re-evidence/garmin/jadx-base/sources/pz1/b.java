package pz1;

import b63.o;
import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import g22.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import sz1.t;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lpz1/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lpz1/a;", "Lnz1/a;", "api", "Lf12/b;", "userAccount", "<init>", "(Lnz1/a;Lf12/b;)V", "a", "gcm-training-readiness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0, pz1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f141926c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nz1.a f141927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.b f141928b;

    /* JADX INFO: renamed from: pz1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lmm1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.data.repo.TrainingReadinessRepo$getSleepResultsDailySummary$2", f = "TrainingReadinessRepo.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class C2661b extends i implements l<t13.d<? super a0<mm1.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141929a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f141931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f141932d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2661b(o oVar, o oVar2, t13.d<? super C2661b> dVar) {
            super(1, dVar);
            this.f141931c = oVar;
            this.f141932d = oVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return b.this.new C2661b(this.f141931c, this.f141932d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<mm1.b>> dVar) {
            return ((C2661b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141929a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<mm1.b>> i0VarE = b.this.f141927a.e(fz0.d.a(this.f141931c), fz0.d.a(this.f141932d));
            this.f141929a = 1;
            Object objAwait = i0VarE.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    public b(nz1.a aVar, f12.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.f141927a = aVar;
        this.f141928b = bVar;
    }

    @Override // pz1.a
    public final Object a(o oVar, t.d dVar) {
        return f0.J(this, new h(this, oVar, null), dVar);
    }

    @Override // pz1.a
    public final Object b(o oVar, o oVar2, t.e eVar) {
        return m41.b.a.a(m41.b.f116598c).a(oVar, oVar2, eVar);
    }

    @Override // pz1.a
    public final Object c(o oVar, t.g gVar) {
        return f0.J(this, new c(this, oVar, null), gVar);
    }

    @Override // pz1.a
    public final Object d(o oVar, o oVar2, t.a aVar) {
        s61.a aVarA = s61.a.C2979a.a(s61.a.f157622b);
        return f0.J(aVarA, new s61.f(aVarA, fz0.d.a(oVar).toString(), fz0.d.a(oVar2).toString(), null), aVar);
    }

    @Override // pz1.a
    public final Object f(o oVar, o oVar2, t13.d<? super v2<mm1.b>> dVar) {
        return f0.J(this, new C2661b(oVar, oVar2, null), dVar);
    }

    @Override // pz1.a
    public final Object g(o oVar, o oVar2, t.c cVar) {
        return f0.J(this, new d(this, oVar, oVar2, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // pz1.a
    public final Object h(o oVar, v13.c cVar) {
        e eVar;
        v2 v2Var;
        v2 v2Var2;
        oz1.b bVar;
        ArrayList arrayList;
        Iterator it;
        DateTime dateTimeQ;
        DateTime dateTimeQ2;
        int iAbs;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f141944e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f141944e = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objJ = eVar.f141942c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f141944e;
        Integer num = null;
        if (i15 == 0) {
            r.b(objJ);
            g gVar = new g(this, oVar, null);
            eVar.f141940a = oVar;
            eVar.f141944e = 1;
            objJ = f0.J(this, gVar, eVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            oVar = eVar.f141940a;
            r.b(objJ);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = eVar.f141941b;
            r.b(objJ);
        }
        v2Var2 = (v2) objJ;
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zB = k1.f37122a.B();
        if ((v2Var instanceof v2.b) && (v2Var2 instanceof v2.b) && zB && (bVar = (oz1.b) h0.d0((List) ((v2.b) v2Var).f47386a)) != null) {
            List<mp.d> listB = ((mp.c) ((v2.b) v2Var2).f47386a).b();
            arrayList = new ArrayList();
            for (Object obj : listB) {
                if (s.g(((mp.d) obj).getQualifyingDive(), Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
            it = arrayList.iterator();
            if (it.hasNext()) {
                dateTimeQ = k.q(((mp.d) it.next()).getEndTimeGMT(), "yyyy-MM-dd HH:mm:ss", DateTimeZone.UTC);
                if (dateTimeQ == null) {
                    dateTimeQ = new DateTime().minusDays(1);
                }
                while (it.hasNext()) {
                    dateTimeQ2 = k.q(((mp.d) it.next()).getEndTimeGMT(), "yyyy-MM-dd HH:mm:ss", DateTimeZone.UTC);
                    if (dateTimeQ2 == null) {
                        dateTimeQ2 = new DateTime().minusDays(1);
                    }
                    if (dateTimeQ.compareTo(dateTimeQ2) < 0) {
                        dateTimeQ = dateTimeQ2;
                    }
                }
            } else {
                dateTimeQ = null;
            }
            if (dateTimeQ != null && (iAbs = Math.abs(Minutes.minutesBetween(DateTime.now(DateTimeZone.UTC), dateTimeQ).getMinutes())) <= 1440) {
                num = new Integer(iAbs);
            }
            bVar.Z(num);
        }
        return v2Var;
        v2 v2Var3 = (v2) objJ;
        f fVar = new f(this, oVar, null);
        eVar.f141940a = null;
        eVar.f141941b = v2Var3;
        eVar.f141944e = 2;
        Object objJ2 = f0.J(this, fVar, eVar);
        if (objJ2 != aVar) {
            objJ = objJ2;
            v2Var = v2Var3;
            v2Var2 = (v2) objJ;
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zB2 = k1.f37122a.B();
            if (v2Var instanceof v2.b) {
                List<mp.d> listB2 = ((mp.c) ((v2.b) v2Var2).f47386a).b();
                arrayList = new ArrayList();
                while (r10.hasNext()) {
                    if (s.g(((mp.d) obj).getQualifyingDive(), Boolean.TRUE)) {
                        arrayList.add(obj);
                    }
                }
                it = arrayList.iterator();
                if (it.hasNext()) {
                    dateTimeQ = null;
                } else {
                    dateTimeQ = k.q(((mp.d) it.next()).getEndTimeGMT(), "yyyy-MM-dd HH:mm:ss", DateTimeZone.UTC);
                    if (dateTimeQ == null) {
                        dateTimeQ = new DateTime().minusDays(1);
                    }
                    while (it.hasNext()) {
                        dateTimeQ2 = k.q(((mp.d) it.next()).getEndTimeGMT(), "yyyy-MM-dd HH:mm:ss", DateTimeZone.UTC);
                        if (dateTimeQ2 == null) {
                            dateTimeQ2 = new DateTime().minusDays(1);
                        }
                        if (dateTimeQ.compareTo(dateTimeQ2) < 0) {
                            dateTimeQ = dateTimeQ2;
                        }
                    }
                }
                if (dateTimeQ != null) {
                    num = new Integer(iAbs);
                }
                bVar.Z(num);
            }
            return v2Var;
        }
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpz1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_NON_SLEEP_BUFFER", "I", "gcm-training-readiness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
