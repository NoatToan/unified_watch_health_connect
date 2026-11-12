package com.garmin.android.apps.connectmobile.onboarding.domain;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import e23.p;
import i31.c0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rd2.j;
import sd2.f;
import t13.d;
import ue.i0;
import ue.l;
import ue.v;
import ue.x;
import v13.e;
import v13.i;
import vb.h;
import ve.t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/domain/FetchDevicesOnboardingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FetchDevicesOnboardingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f39672j = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f39673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f39674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f39675i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.FetchDevicesOnboardingWorker", f = "FetchDevicesOnboardingWorker.kt", l = {42}, m = "doWork", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f39676a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f39678c;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f39676a = obj;
            this.f39678c |= Integer.MIN_VALUE;
            return FetchDevicesOnboardingWorker.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Landroidx/work/d$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Landroidx/work/d$a;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.FetchDevicesOnboardingWorker$doWork$2", f = "FetchDevicesOnboardingWorker.kt", l = {43, 51, 66}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, d<? super androidx.work.d.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set f39679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FetchDevicesOnboardingWorker f39680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f39681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f39682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f39683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f39684f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.FetchDevicesOnboardingWorker$doWork$2$3$1", f = "FetchDevicesOnboardingWorker.kt", l = {63}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f39686a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FetchDevicesOnboardingWorker f39687b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f39688c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FetchDevicesOnboardingWorker fetchDevicesOnboardingWorker, long j8, d<? super a> dVar) {
                super(2, dVar);
                this.f39687b = fetchDevicesOnboardingWorker;
                this.f39688c = j8;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new a(this.f39687b, this.f39688c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f39686a;
                if (i14 == 0) {
                    r.b(obj);
                    c0 c0Var = (c0) this.f39687b.f39674h.getValue();
                    this.f39686a = 1;
                    if (c0Var.a(this.f39688c, this) == aVar) {
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

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0005\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u0001 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "", "Lsd2/f;", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.FetchDevicesOnboardingWorker$doWork$2$pairedDevicesUnitIds$1", f = "FetchDevicesOnboardingWorker.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements p<b0, d<? super List<f>>, Object> {
            public b(d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new b(dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super List<f>> dVar) {
                return new b(dVar).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                rd2.f.a().f152045a.getClass();
                return j.e();
            }
        }

        public c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            c cVar = FetchDevicesOnboardingWorker.this.new c(dVar);
            cVar.f39684f = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super androidx.work.d.a> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:53:0x015d  */
        /* JADX WARN: Code duplicated, block: B:57:0x0178  */
        /* JADX WARN: Code duplicated, block: B:65:0x0190  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v24, types: [b31.f] */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0178 -> B:58:0x0179). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 429
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.onboarding.domain.FetchDevicesOnboardingWorker.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchDevicesOnboardingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f39673g = m.b(new i01.j(28));
        this.f39674h = m.b(new i01.j(29));
        this.f39675i = m.b(new i31.e(0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(d<? super androidx.work.d.a> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f39678c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f39678c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objE = bVar.f39676a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f39678c;
        if (i15 == 0) {
            r.b(objE);
            c cVar = new c(null);
            bVar.f39678c = 1;
            objE = o53.c0.e(cVar, bVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE);
        }
        objE.getClass();
        return objE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/domain/FetchDevicesOnboardingWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context) {
            t0 t0VarO = com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context);
            l lVar = l.REPLACE;
            x.a aVar = new x.a((Class<? extends androidx.work.d>) FetchDevicesOnboardingWorker.class);
            ue.f.a aVar2 = new ue.f.a();
            aVar2.b(v.CONNECTED);
            aVar.f170098c.f26950j = aVar2.a();
            t0VarO.a("FetchDevicesOnboardingWorker", lVar, aVar.d(ue.a.EXPONENTIAL, 1L, TimeUnit.MINUTES).a()).a();
        }

        private a() {
        }
    }
}
