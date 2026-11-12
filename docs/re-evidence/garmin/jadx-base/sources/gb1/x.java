package gb1;

import c83.a0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o53.b0;
import o53.i0;
import o53.j0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyReportsViewModel$getReport$1$1", f = "PregnancyReportsViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f76735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f76736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.a f76737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LocalDate f76738e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyReportsViewModel$getReport$1$1$1", f = "PregnancyReportsViewModel.kt", l = {81, 82, 83}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f76739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i0 f76740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o13.p f76741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public o13.p f76742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f76743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f76744f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ t f76745g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ LocalDate f76746h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t.a f76747i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ LocalDate f76748j;

        /* JADX INFO: renamed from: gb1.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0005\u001a\u001a\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lc83/a0;", "Ldb1/s;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyReportsViewModel$getReport$1$1$1$pregnancyReportBloodGlucoseData$1", f = "PregnancyReportsViewModel.kt", l = {79}, m = "invokeSuspend", v = 2)
        public static final class C1545a extends v13.i implements e23.p<b0, t13.d<? super o13.p<? extends a0<db1.s>, ? extends Throwable>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f76749a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f76750b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f76751c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f76752d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1545a(t tVar, LocalDate localDate, LocalDate localDate2, t13.d<? super C1545a> dVar) {
                super(2, dVar);
                this.f76750b = tVar;
                this.f76751c = localDate;
                this.f76752d = localDate2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1545a(this.f76750b, this.f76751c, this.f76752d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends a0<db1.s>, ? extends Throwable>> dVar) {
                return ((C1545a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f76749a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f76749a = 1;
                    Serializable serializableX4 = t.x4(this.f76750b, this.f76751c, this.f76752d, this);
                    return serializableX4 == aVar ? aVar : serializableX4;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0005\u001a\u001a\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lc83/a0;", "Lww0/k;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyReportsViewModel$getReport$1$1$1$pregnancyReportLoggedData$1", f = "PregnancyReportsViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<b0, t13.d<? super o13.p<? extends a0<ww0.k>, ? extends Throwable>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f76753a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f76754b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f76755c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f76756d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t tVar, LocalDate localDate, LocalDate localDate2, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f76754b = tVar;
                this.f76755c = localDate;
                this.f76756d = localDate2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f76754b, this.f76755c, this.f76756d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends a0<ww0.k>, ? extends Throwable>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f76753a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f76753a = 1;
                    Serializable serializableY4 = t.y4(this.f76754b, this.f76755c, this.f76756d, this);
                    return serializableY4 == aVar ? aVar : serializableY4;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0005\u001a\u001a\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lc83/a0;", "Ldb1/l;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyReportsViewModel$getReport$1$1$1$pregnancyReportNotesData$1", f = "PregnancyReportsViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.p<b0, t13.d<? super o13.p<? extends a0<db1.l>, ? extends Throwable>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f76757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f76758b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LocalDate f76759c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f76760d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(t tVar, LocalDate localDate, LocalDate localDate2, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f76758b = tVar;
                this.f76759c = localDate;
                this.f76760d = localDate2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f76758b, this.f76759c, this.f76760d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends a0<db1.l>, ? extends Throwable>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f76757a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f76757a = 1;
                    Serializable serializableZ4 = t.z4(this.f76758b, this.f76759c, this.f76760d, this);
                    return serializableZ4 == aVar ? aVar : serializableZ4;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, LocalDate localDate, t.a aVar, LocalDate localDate2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f76745g = tVar;
            this.f76746h = localDate;
            this.f76747i = aVar;
            this.f76748j = localDate2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f76745g, this.f76746h, this.f76747i, this.f76748j, dVar);
            aVar.f76744f = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0099  */
        /* JADX WARN: Code duplicated, block: B:35:0x00aa A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:8:0x001e, B:33:0x009d, B:35:0x00aa, B:36:0x00ad, B:38:0x00b3, B:39:0x00b6, B:41:0x00bc, B:42:0x00bf, B:44:0x00c7, B:46:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e4, B:53:0x00ea, B:55:0x00f6, B:58:0x00fe, B:60:0x0104, B:63:0x010b, B:64:0x0116, B:65:0x0118, B:67:0x011e, B:68:0x0124, B:70:0x012a, B:71:0x0130, B:15:0x0033, B:29:0x0084, B:18:0x003b, B:25:0x006d, B:21:0x0042), top: B:76:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:8:0x001e, B:33:0x009d, B:35:0x00aa, B:36:0x00ad, B:38:0x00b3, B:39:0x00b6, B:41:0x00bc, B:42:0x00bf, B:44:0x00c7, B:46:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e4, B:53:0x00ea, B:55:0x00f6, B:58:0x00fe, B:60:0x0104, B:63:0x010b, B:64:0x0116, B:65:0x0118, B:67:0x011e, B:68:0x0124, B:70:0x012a, B:71:0x0130, B:15:0x0033, B:29:0x0084, B:18:0x003b, B:25:0x006d, B:21:0x0042), top: B:76:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00bc A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:8:0x001e, B:33:0x009d, B:35:0x00aa, B:36:0x00ad, B:38:0x00b3, B:39:0x00b6, B:41:0x00bc, B:42:0x00bf, B:44:0x00c7, B:46:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e4, B:53:0x00ea, B:55:0x00f6, B:58:0x00fe, B:60:0x0104, B:63:0x010b, B:64:0x0116, B:65:0x0118, B:67:0x011e, B:68:0x0124, B:70:0x012a, B:71:0x0130, B:15:0x0033, B:29:0x0084, B:18:0x003b, B:25:0x006d, B:21:0x0042), top: B:76:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00c7 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:8:0x001e, B:33:0x009d, B:35:0x00aa, B:36:0x00ad, B:38:0x00b3, B:39:0x00b6, B:41:0x00bc, B:42:0x00bf, B:44:0x00c7, B:46:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e4, B:53:0x00ea, B:55:0x00f6, B:58:0x00fe, B:60:0x0104, B:63:0x010b, B:64:0x0116, B:65:0x0118, B:67:0x011e, B:68:0x0124, B:70:0x012a, B:71:0x0130, B:15:0x0033, B:29:0x0084, B:18:0x003b, B:25:0x006d, B:21:0x0042), top: B:76:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00cd A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:8:0x001e, B:33:0x009d, B:35:0x00aa, B:36:0x00ad, B:38:0x00b3, B:39:0x00b6, B:41:0x00bc, B:42:0x00bf, B:44:0x00c7, B:46:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e4, B:53:0x00ea, B:55:0x00f6, B:58:0x00fe, B:60:0x0104, B:63:0x010b, B:64:0x0116, B:65:0x0118, B:67:0x011e, B:68:0x0124, B:70:0x012a, B:71:0x0130, B:15:0x0033, B:29:0x0084, B:18:0x003b, B:25:0x006d, B:21:0x0042), top: B:76:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x00ea A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:8:0x001e, B:33:0x009d, B:35:0x00aa, B:36:0x00ad, B:38:0x00b3, B:39:0x00b6, B:41:0x00bc, B:42:0x00bf, B:44:0x00c7, B:46:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e4, B:53:0x00ea, B:55:0x00f6, B:58:0x00fe, B:60:0x0104, B:63:0x010b, B:64:0x0116, B:65:0x0118, B:67:0x011e, B:68:0x0124, B:70:0x012a, B:71:0x0130, B:15:0x0033, B:29:0x0084, B:18:0x003b, B:25:0x006d, B:21:0x0042), top: B:76:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x00f6 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:8:0x001e, B:33:0x009d, B:35:0x00aa, B:36:0x00ad, B:38:0x00b3, B:39:0x00b6, B:41:0x00bc, B:42:0x00bf, B:44:0x00c7, B:46:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e4, B:53:0x00ea, B:55:0x00f6, B:58:0x00fe, B:60:0x0104, B:63:0x010b, B:64:0x0116, B:65:0x0118, B:67:0x011e, B:68:0x0124, B:70:0x012a, B:71:0x0130, B:15:0x0033, B:29:0x0084, B:18:0x003b, B:25:0x006d, B:21:0x0042), top: B:76:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:67:0x011e A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:8:0x001e, B:33:0x009d, B:35:0x00aa, B:36:0x00ad, B:38:0x00b3, B:39:0x00b6, B:41:0x00bc, B:42:0x00bf, B:44:0x00c7, B:46:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e4, B:53:0x00ea, B:55:0x00f6, B:58:0x00fe, B:60:0x0104, B:63:0x010b, B:64:0x0116, B:65:0x0118, B:67:0x011e, B:68:0x0124, B:70:0x012a, B:71:0x0130, B:15:0x0033, B:29:0x0084, B:18:0x003b, B:25:0x006d, B:21:0x0042), top: B:76:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x012a A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:8:0x001e, B:33:0x009d, B:35:0x00aa, B:36:0x00ad, B:38:0x00b3, B:39:0x00b6, B:41:0x00bc, B:42:0x00bf, B:44:0x00c7, B:46:0x00cd, B:48:0x00da, B:50:0x00e0, B:51:0x00e4, B:53:0x00ea, B:55:0x00f6, B:58:0x00fe, B:60:0x0104, B:63:0x010b, B:64:0x0116, B:65:0x0118, B:67:0x011e, B:68:0x0124, B:70:0x012a, B:71:0x0130, B:15:0x0033, B:29:0x0084, B:18:0x003b, B:25:0x006d, B:21:0x0042), top: B:76:0x0012 }] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            i0 i0VarJ;
            j0 j0Var;
            o13.p pVar;
            i0 i0Var;
            o13.p pVar2;
            Object objAwait;
            o13.p pVar3;
            o13.p pVar4;
            o13.p pVar5;
            ArrayList arrayList;
            Throwable th3;
            Throwable th4;
            Throwable th5;
            a0 a0Var;
            a0 a0Var2;
            a0 a0Var3;
            ww0.k kVar;
            HashMap<DateTime, List<db1.a>> map;
            List<ww0.b> listG;
            LocalDate date;
            DateTime dateTimeAtStartOfDay;
            List<db1.a> listD;
            LocalDate localDate = this.f76748j;
            b0 b0Var = (b0) this.f76744f;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f76743e;
            LocalDate localDate2 = this.f76746h;
            t tVar = this.f76745g;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    j0 j0VarJ = ge1.b.j(b0Var, null, null, new b(tVar, localDate2, localDate, null), 3);
                    j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new c(tVar, localDate2, localDate, null), 3);
                    i0VarJ = ge1.b.j(b0Var, null, null, new C1545a(tVar, localDate2, localDate, null), 3);
                    this.f76744f = null;
                    this.f76739a = j0VarJ2;
                    this.f76740b = i0VarJ;
                    this.f76743e = 1;
                    obj = j0VarJ.C(this);
                    if (obj != aVar) {
                        j0Var = j0VarJ2;
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    i0VarJ = this.f76740b;
                    j0Var = this.f76739a;
                    o13.r.b(obj);
                } else {
                    if (i14 == 2) {
                        pVar = this.f76741c;
                        i0Var = this.f76740b;
                        o13.r.b(obj);
                        pVar2 = (o13.p) obj;
                        this.f76744f = null;
                        this.f76739a = null;
                        this.f76740b = null;
                        this.f76741c = pVar;
                        this.f76742d = pVar2;
                        this.f76743e = 3;
                        objAwait = i0Var.await(this);
                        if (objAwait != aVar) {
                            o13.p pVar6 = pVar;
                            pVar3 = pVar2;
                            obj = objAwait;
                            pVar4 = pVar6;
                        }
                        return aVar;
                    }
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar3 = this.f76742d;
                    pVar4 = this.f76741c;
                    o13.r.b(obj);
                }
                pVar5 = (o13.p) obj;
                arrayList = new ArrayList();
                th3 = (Throwable) pVar4.f128595b;
                if (th3 != null) {
                    arrayList.add(th3);
                }
                th4 = (Throwable) pVar3.f128595b;
                if (th4 != null) {
                    arrayList.add(th4);
                }
                th5 = (Throwable) pVar5.f128595b;
                if (th5 != null) {
                    arrayList.add(th5);
                }
                if (tb1.d.a(arrayList) == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                    a0Var = (a0) pVar4.f128594a;
                    if (a0Var != null) {
                        kVar = (ww0.k) a0Var.f25746b;
                        tVar.f76710b = kVar;
                        map = new HashMap<>();
                        if (kVar != null && (listG = kVar.g()) != null) {
                            for (ww0.b bVar : listG) {
                                date = bVar.getDate();
                                if (date != null) {
                                    dateTimeAtStartOfDay = date.toDateTimeAtStartOfDay();
                                } else {
                                    dateTimeAtStartOfDay = null;
                                }
                                if (dateTimeAtStartOfDay != null && (listD = bVar.d()) != null && !listD.isEmpty()) {
                                    List<db1.a> listD2 = bVar.d();
                                    listD2.getClass();
                                    map.put(dateTimeAtStartOfDay, listD2);
                                }
                            }
                        }
                        tVar.f76713e = map;
                    }
                    a0Var2 = (a0) pVar3.f128594a;
                    if (a0Var2 != null) {
                        tVar.f76711c = (db1.l) a0Var2.f25746b;
                    }
                    a0Var3 = (a0) pVar5.f128594a;
                    if (a0Var3 != null) {
                        tVar.f76712d = (db1.s) a0Var3.f25746b;
                    }
                }
                tVar.f76709a.put(localDate2, new t.a(tVar.f76710b, tVar.f76711c, tVar.f76712d, tVar.f76713e));
                tVar.B4().j(new cx0.a<>(tVar.f76709a.get(localDate2), null, null, false, 12, null));
                return Unit.INSTANCE;
                o13.p pVar7 = (o13.p) obj;
                this.f76744f = null;
                this.f76739a = null;
                this.f76740b = i0VarJ;
                this.f76741c = pVar7;
                this.f76743e = 2;
                Object objAwait2 = j0Var.await(this);
                if (objAwait2 != aVar) {
                    i0 i0Var2 = i0VarJ;
                    pVar = pVar7;
                    obj = objAwait2;
                    i0Var = i0Var2;
                    pVar2 = (o13.p) obj;
                    this.f76744f = null;
                    this.f76739a = null;
                    this.f76740b = null;
                    this.f76741c = pVar;
                    this.f76742d = pVar2;
                    this.f76743e = 3;
                    objAwait = i0Var.await(this);
                    if (objAwait != aVar) {
                        o13.p pVar8 = pVar;
                        pVar3 = pVar2;
                        obj = objAwait;
                        pVar4 = pVar8;
                        pVar5 = (o13.p) obj;
                        arrayList = new ArrayList();
                        th3 = (Throwable) pVar4.f128595b;
                        if (th3 != null) {
                            arrayList.add(th3);
                        }
                        th4 = (Throwable) pVar3.f128595b;
                        if (th4 != null) {
                            arrayList.add(th4);
                        }
                        th5 = (Throwable) pVar5.f128595b;
                        if (th5 != null) {
                            arrayList.add(th5);
                        }
                        if (tb1.d.a(arrayList) == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                            a0Var = (a0) pVar4.f128594a;
                            if (a0Var != null) {
                                kVar = (ww0.k) a0Var.f25746b;
                                tVar.f76710b = kVar;
                                map = new HashMap<>();
                                if (kVar != null) {
                                    while (r1.hasNext()) {
                                        date = bVar.getDate();
                                        if (date != null) {
                                            dateTimeAtStartOfDay = date.toDateTimeAtStartOfDay();
                                        } else {
                                            dateTimeAtStartOfDay = null;
                                        }
                                        if (dateTimeAtStartOfDay != null) {
                                            List<db1.a> listD3 = bVar.d();
                                            listD3.getClass();
                                            map.put(dateTimeAtStartOfDay, listD3);
                                        }
                                    }
                                }
                                tVar.f76713e = map;
                            }
                            a0Var2 = (a0) pVar3.f128594a;
                            if (a0Var2 != null) {
                                tVar.f76711c = (db1.l) a0Var2.f25746b;
                            }
                            a0Var3 = (a0) pVar5.f128594a;
                            if (a0Var3 != null) {
                                tVar.f76712d = (db1.s) a0Var3.f25746b;
                            }
                        }
                        tVar.f76709a.put(localDate2, new t.a(tVar.f76710b, tVar.f76711c, tVar.f76712d, tVar.f76713e));
                        tVar.B4().j(new cx0.a<>(tVar.f76709a.get(localDate2), null, null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            } catch (Throwable th6) {
                tVar.B4().j(new cx0.a<>(this.f76747i, th6, null, false, 12, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t tVar, LocalDate localDate, t.a aVar, LocalDate localDate2, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f76735b = tVar;
        this.f76736c = localDate;
        this.f76737d = aVar;
        this.f76738e = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f76735b, this.f76736c, this.f76737d, this.f76738e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f76734a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f76735b, this.f76736c, this.f76737d, this.f76738e, null);
            this.f76734a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f76735b.f76715g.remove(this.f76736c);
        return Unit.INSTANCE;
    }
}
