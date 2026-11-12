package kd0;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkd0/r5;", "Ltn1/c;", "Lpm1/a;", "getCachedSleepDataUseCase", "Lcom/garmin/android/apps/connectmobile/b1;", "featureItemAvailability", "<init>", "(Lpm1/a;Lcom/garmin/android/apps/connectmobile/b1;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r5 implements tn1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm1.a f104344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.b1 f104345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jw.c0 f104346c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104347a;

        static {
            int[] iArr = new int[tn1.d.values().length];
            try {
                iArr[tn1.d.BODY_BATTERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tn1.d.TRAINING_READINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[tn1.d.HRV_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f104347a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.SleepEducationDataSourceImpl$shouldShowSleepEducationBanner$1", f = "SleepEducationDataSourceImpl.kt", l = {34, 38, 42}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f104349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f104350c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ tn1.d f104352e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tn1.d dVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f104352e = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = r5.this.new b(this.f104352e, dVar);
            bVar.f104350c = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10, types: [int] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            zy0.a aVar;
            String strA;
            ?? IsAfter;
            ?? r14;
            r53.j jVar = (r53.j) this.f104350c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104349b;
            r5 r5Var = r5.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i14 == 2) {
                    int i15 = this.f104348a;
                    o13.r.b(obj);
                    r14 = i15;
                    r14 = IsAfter;
                    Boolean boolValueOf = Boolean.valueOf((r5Var.f104345b.O0() || ((Boolean) obj).booleanValue()) ? false : true);
                    this.f104350c = null;
                    this.f104348a = r14;
                    this.f104349b = 3;
                } else {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            r5Var.getClass();
            int i16 = a.f104347a[this.f104352e.ordinal()];
            if (i16 == 1) {
                aVar = zy0.a.SLEEP_EDUCATION_BODY_BATTERY;
            } else if (i16 != 2) {
                aVar = i16 != 3 ? null : zy0.a.SLEEP_EDUCATION_HRV_STATUS;
            } else {
                aVar = zy0.a.SLEEP_EDUCATION_TRAINING_READINESS;
            }
            jw.c0 c0Var = r5Var.f104346c;
            if (aVar == null) {
                strA = null;
            } else {
                c0Var.e(aVar.f207440a);
                strA = c0Var.a();
            }
            LocalDate localDateW = g22.k.w(strA, "yyyy-MM-dd");
            IsAfter = localDateW != null ? LocalDate.now().minusDays(6).isAfter(localDateW) : 1;
            if (IsAfter == 0) {
                Boolean bool = Boolean.FALSE;
                this.f104350c = null;
                this.f104348a = IsAfter;
                this.f104349b = 1;
            } else {
                pm1.a aVar3 = r5Var.f104344a;
                this.f104350c = jVar;
                this.f104348a = IsAfter;
                this.f104349b = 2;
                obj = aVar3.b(this);
                if (obj != aVar2) {
                    r14 = IsAfter;
                    Boolean boolValueOf2 = Boolean.valueOf((r5Var.f104345b.O0() || ((Boolean) obj).booleanValue()) ? false : true);
                    this.f104350c = null;
                    this.f104348a = r14;
                    this.f104349b = 3;
                }
            }
            r14 = IsAfter;
            return aVar2;
        }
    }

    public r5(pm1.a aVar, com.garmin.android.apps.connectmobile.b1 b1Var) {
        aVar.getClass();
        b1Var.getClass();
        this.f104344a = aVar;
        this.f104345b = b1Var;
        this.f104346c = new jw.c0(Long.MAX_VALUE, Long.MAX_VALUE);
    }

    @Override // tn1.c
    public final r53.i<Boolean> a(tn1.d dVar) {
        return dVar == null ? new r53.m(Boolean.FALSE) : new r53.c2(new b(dVar, null));
    }

    @Override // tn1.c
    public final void b(tn1.d dVar) {
        zy0.a aVar;
        dVar.getClass();
        String string = LocalDate.now().toString("yyyy-MM-dd");
        string.getClass();
        int i14 = a.f104347a[dVar.ordinal()];
        if (i14 == 1) {
            aVar = zy0.a.SLEEP_EDUCATION_BODY_BATTERY;
        } else if (i14 != 2) {
            aVar = i14 != 3 ? null : zy0.a.SLEEP_EDUCATION_HRV_STATUS;
        } else {
            aVar = zy0.a.SLEEP_EDUCATION_TRAINING_READINESS;
        }
        if (aVar == null) {
            return;
        }
        String str = aVar.f207440a;
        jw.c0 c0Var = this.f104346c;
        c0Var.e(str);
        c0Var.d(Unit.INSTANCE, string);
    }
}
