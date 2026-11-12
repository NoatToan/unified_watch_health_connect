package lx0;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import db1.m;
import e23.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.j0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupViewModel$getMCTSetupRequiredData$1", f = "MCTSetupViewModel.kt", l = {PsExtractor.VIDEO_STREAM_MASK}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f115170b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupViewModel$getMCTSetupRequiredData$1$1", f = "MCTSetupViewModel.kt", l = {244, 245}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f115171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f115172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o13.p f115173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f115174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f115175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ k f115176f;

        /* JADX INFO: renamed from: lx0.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lww0/j;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupViewModel$getMCTSetupRequiredData$1$1$lastCycle$1", f = "MCTSetupViewModel.kt", l = {241}, m = "invokeSuspend", v = 2)
        public static final class C2192a extends v13.i implements p<b0, t13.d<? super o13.p<? extends ww0.j, ? extends Throwable>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f115177a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f115178b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2192a(k kVar, t13.d<? super C2192a> dVar) {
                super(2, dVar);
                this.f115178b = kVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2192a(this.f115178b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends ww0.j, ? extends Throwable>> dVar) {
                return ((C2192a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f115177a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f115177a = 1;
                    Serializable serializableX4 = k.x4(this.f115178b, this);
                    return serializableX4 == aVar ? aVar : serializableX4;
                }
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0005\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "Ldb1/m;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupViewModel$getMCTSetupRequiredData$1$1$pregnancyList$1", f = "MCTSetupViewModel.kt", l = {242}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super o13.p<? extends List<? extends m>, ? extends Throwable>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f115179a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f115180b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k kVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f115180b = kVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f115180b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends List<? extends m>, ? extends Throwable>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f115179a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f115179a = 1;
                    Serializable serializableY4 = k.y4(this.f115180b, this);
                    return serializableY4 == aVar ? aVar : serializableY4;
                }
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f115176f = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f115176f, dVar);
            aVar.f115175e = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0073  */
        /* JADX WARN: Code duplicated, block: B:22:0x007c  */
        /* JADX WARN: Code duplicated, block: B:30:0x009d  */
        /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:50:0x00df  */
        /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:59:0x0102  */
        /* JADX WARN: Code duplicated, block: B:68:0x011f  */
        /* JADX WARN: Code duplicated, block: B:72:0x0133 A[LOOP:1: B:70:0x012d->B:72:0x0133, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:76:0x00a9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x00b3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x00af A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x00b9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x0097 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0097 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            j0 j0VarJ;
            List arrayList;
            o13.p pVar;
            List list;
            Throwable th3;
            Throwable th4;
            ArrayList<LocalDate> arrayList2;
            List<m> list2;
            ww0.j jVar;
            Iterator it;
            LocalDate periodStartDate;
            ww0.a cycleType;
            ww0.a aVar;
            Integer periodLength;
            int iIntValue;
            LocalDate localDatePlusDays;
            LocalDate localDatePlusDays2;
            Integer cycleLength;
            LocalDate deliveryDate;
            LocalDate endDate;
            b0 b0Var = (b0) this.f115175e;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115174d;
            boolean z14 = true;
            k kVar = this.f115176f;
            if (i14 == 0) {
                r.b(obj);
                j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new C2192a(kVar, null), 3);
                j0VarJ = ge1.b.j(b0Var, null, null, new b(kVar, null), 3);
                arrayList = new ArrayList();
                this.f115175e = b0Var;
                this.f115171a = j0VarJ;
                this.f115172b = arrayList;
                this.f115174d = 1;
                obj = j0VarJ2.C(this);
                if (obj != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                arrayList = this.f115172b;
                j0VarJ = this.f115171a;
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pVar = this.f115173c;
                list = this.f115172b;
                r.b(obj);
            }
            o13.p pVar2 = (o13.p) obj;
            th3 = (Throwable) pVar.f128595b;
            if (th3 != null) {
                list.add(th3);
            }
            th4 = (Throwable) pVar2.f128595b;
            if (th4 != null) {
                list.add(th4);
            }
            kVar.f115198n = (ww0.j) pVar.f128594a;
            arrayList2 = kVar.f115195k;
            list2 = (List) pVar2.f128594a;
            if (list2 != null && !list2.isEmpty()) {
                for (m mVar : list2) {
                    if (mVar.getDueDate() == null) {
                        deliveryDate = mVar.getDeliveryDate();
                        if (deliveryDate != null) {
                            arrayList2.add(deliveryDate);
                        } else {
                            endDate = mVar.getEndDate();
                            if (endDate != null) {
                                arrayList2.add(endDate);
                            }
                        }
                    }
                }
            }
            jVar = kVar.f115198n;
            if (jVar != null) {
                periodStartDate = jVar.getPeriodStartDate();
                if (periodStartDate == null) {
                    periodStartDate = new LocalDate();
                }
                cycleType = jVar.getCycleType();
                if (cycleType == null) {
                    cycleType = ww0.a.REGULAR;
                }
                aVar = ww0.a.PREGNANT;
                if (cycleType == aVar) {
                    cycleLength = jVar.getCycleLength();
                    if (cycleLength != null) {
                        iIntValue = cycleLength.intValue();
                    } else {
                        iIntValue = 0;
                    }
                } else {
                    periodLength = jVar.getPeriodLength();
                    if (periodLength != null) {
                        iIntValue = periodLength.intValue();
                    } else {
                        iIntValue = 0;
                    }
                }
                localDatePlusDays = periodStartDate.plusDays(iIntValue);
                LocalDate localDate = (LocalDate) h0.o0(arrayList2);
                localDatePlusDays2 = localDate != null ? localDate.plusDays(1) : null;
                if (localDatePlusDays2 == null) {
                    localDatePlusDays2 = localDatePlusDays;
                }
                localDatePlusDays2.getClass();
                localDatePlusDays.getClass();
                kVar.f115196l = (LocalDate) r13.b.d(localDatePlusDays2, localDatePlusDays);
                if (cycleType != aVar && !localDatePlusDays2.isAfter(localDatePlusDays)) {
                    z14 = false;
                }
                kVar.f115197m = z14;
                if (cycleType != aVar) {
                    kVar.f115196l = (LocalDate) r13.b.e(kVar.f115196l, periodStartDate);
                }
            }
            it = list.iterator();
            while (it.hasNext()) {
                kVar.f115199o.j(new cx0.a<>(null, (Throwable) it.next(), null, false, 12, null));
            }
            return Unit.INSTANCE;
            o13.p pVar3 = (o13.p) obj;
            this.f115175e = b0Var;
            this.f115171a = null;
            this.f115172b = arrayList;
            this.f115173c = pVar3;
            this.f115174d = 2;
            Object objAwait = j0VarJ.await(this);
            if (objAwait != aVar2) {
                pVar = pVar3;
                obj = objAwait;
                list = arrayList;
                o13.p pVar4 = (o13.p) obj;
                th3 = (Throwable) pVar.f128595b;
                if (th3 != null) {
                    list.add(th3);
                }
                th4 = (Throwable) pVar4.f128595b;
                if (th4 != null) {
                    list.add(th4);
                }
                kVar.f115198n = (ww0.j) pVar.f128594a;
                arrayList2 = kVar.f115195k;
                list2 = (List) pVar4.f128594a;
                if (list2 != null) {
                    while (r14.hasNext()) {
                        if (mVar.getDueDate() == null) {
                            deliveryDate = mVar.getDeliveryDate();
                            if (deliveryDate != null) {
                                arrayList2.add(deliveryDate);
                            } else {
                                endDate = mVar.getEndDate();
                                if (endDate != null) {
                                    arrayList2.add(endDate);
                                }
                            }
                        }
                    }
                }
                jVar = kVar.f115198n;
                if (jVar != null) {
                    periodStartDate = jVar.getPeriodStartDate();
                    if (periodStartDate == null) {
                        periodStartDate = new LocalDate();
                    }
                    cycleType = jVar.getCycleType();
                    if (cycleType == null) {
                        cycleType = ww0.a.REGULAR;
                    }
                    aVar = ww0.a.PREGNANT;
                    if (cycleType == aVar) {
                        cycleLength = jVar.getCycleLength();
                        if (cycleLength != null) {
                            iIntValue = cycleLength.intValue();
                        } else {
                            iIntValue = 0;
                        }
                    } else {
                        periodLength = jVar.getPeriodLength();
                        if (periodLength != null) {
                            iIntValue = periodLength.intValue();
                        } else {
                            iIntValue = 0;
                        }
                    }
                    localDatePlusDays = periodStartDate.plusDays(iIntValue);
                    LocalDate localDate2 = (LocalDate) h0.o0(arrayList2);
                    if (localDate2 != null) {
                    }
                    if (localDatePlusDays2 == null) {
                        localDatePlusDays2 = localDatePlusDays;
                    }
                    localDatePlusDays2.getClass();
                    localDatePlusDays.getClass();
                    kVar.f115196l = (LocalDate) r13.b.d(localDatePlusDays2, localDatePlusDays);
                    if (cycleType != aVar) {
                        z14 = false;
                    }
                    kVar.f115197m = z14;
                    if (cycleType != aVar) {
                        kVar.f115196l = (LocalDate) r13.b.e(kVar.f115196l, periodStartDate);
                    }
                }
                it = list.iterator();
                while (it.hasNext()) {
                    kVar.f115199o.j(new cx0.a<>(null, (Throwable) it.next(), null, false, 12, null));
                }
                return Unit.INSTANCE;
            }
            return aVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f115170b = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f115170b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115169a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f115170b, null);
            this.f115169a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
