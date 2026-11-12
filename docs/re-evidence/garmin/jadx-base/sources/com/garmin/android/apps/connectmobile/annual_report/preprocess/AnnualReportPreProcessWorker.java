package com.garmin.android.apps.connectmobile.annual_report.preprocess;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.concurrent.TimeUnit;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import tt.j;
import ue.f;
import ue.i0;
import ue.l;
import ue.x;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/annual_report/preprocess/AnnualReportPreProcessWorker;", "Landroidx/work/CoroutineWorker;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AnnualReportPreProcessWorker extends CoroutineWorker implements KoinComponent {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f30176j = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f30177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.annual_report.preprocess.a f30178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f30179i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.apps.connectmobile.annual_report.preprocess.AnnualReportPreProcessWorker", f = "AnnualReportPreProcessWorker.kt", l = {29}, m = "doWork", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f30180a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30182c;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f30180a = obj;
            this.f30182c |= Integer.MIN_VALUE;
            return AnnualReportPreProcessWorker.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.annual_report.preprocess.AnnualReportPreProcessWorker$doWork$2", f = "AnnualReportPreProcessWorker.kt", l = {30}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30183a;

        public c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return AnnualReportPreProcessWorker.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objC;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f30183a;
            if (i14 == 0) {
                r.b(obj);
                AnnualReportPreProcessWorker annualReportPreProcessWorker = AnnualReportPreProcessWorker.this;
                com.garmin.android.apps.connectmobile.annual_report.preprocess.a aVar2 = annualReportPreProcessWorker.f30178h;
                Context context = annualReportPreProcessWorker.f30177g;
                boolean z14 = annualReportPreProcessWorker.f30179i;
                this.f30183a = 1;
                aVar2.getClass();
                String str = com.garmin.android.apps.connectmobile.annual_report.preprocess.a.f30185c;
                com.garmin.android.apps.connectmobile.annual_report.preprocess.a.d(j.PROCESSING_REPORT);
                if (z14) {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var, str, "startPreprocessing: Report is ready, fetch report from server");
                    objC = aVar2.a(context, this);
                    if (objC != aVar) {
                        objC = Unit.INSTANCE;
                    }
                } else {
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var2, str, "startPreprocessing: Check annual report status");
                    objC = aVar2.c(context, this);
                    if (objC != aVar) {
                        objC = Unit.INSTANCE;
                    }
                }
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnualReportPreProcessWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f30177g = context;
        this.f30178h = (com.garmin.android.apps.connectmobile.annual_report.preprocess.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.annual_report.preprocess.a.class, null, null, 6, null);
        this.f30179i = workerParameters.f11427b.a("KEY_IS_REPORT_READY", false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(d<? super androidx.work.d.a> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f30182c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f30182c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f30180a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f30182c;
        if (i15 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            c cVar2 = new c(null);
            bVar.f30182c = 1;
            if (ge1.b.e0(bVar2, cVar2, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return new androidx.work.d.a.c();
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/annual_report/preprocess/AnnualReportPreProcessWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "NAME", "KEY_IS_REPORT_READY", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, boolean z14) {
            context.getClass();
            androidx.work.c.a aVar = new androidx.work.c.a();
            aVar.f11467a.put("KEY_IS_REPORT_READY", Boolean.valueOf(z14));
            x.a aVarF = new x.a((Class<? extends androidx.work.d>) AnnualReportPreProcessWorker.class).e(0L, TimeUnit.MILLISECONDS).f(aVar.a());
            aVarF.f170098c.f26950j = new f.a().a();
            com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context).a("com.garmin.android.apps.connectmobile.annual_report.preprocess.worker", l.REPLACE, aVarF.a()).a();
        }

        private a() {
        }
    }
}
