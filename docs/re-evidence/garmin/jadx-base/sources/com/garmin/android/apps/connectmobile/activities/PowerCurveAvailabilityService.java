package com.garmin.android.apps.connectmobile.activities;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import t13.d;
import v13.c;
import vb.h;
import zp.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/PowerCurveAvailabilityService;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerCurveAvailabilityService extends CoroutineWorker {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f28787h = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f28788g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.PowerCurveAvailabilityService", f = "PowerCurveAvailabilityService.kt", l = {24}, m = "doWork", v = 2)
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f28789a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28791c;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f28789a = obj;
            this.f28791c |= Integer.MIN_VALUE;
            return PowerCurveAvailabilityService.this.c(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PowerCurveAvailabilityService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f28788g = new e(null, null, 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(d<? super androidx.work.d.a> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f28791c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f28791c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objA = bVar.f28789a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f28791c;
        if (i15 == 0) {
            r.b(objA);
            bVar.f28791c = 1;
            objA = this.f28788g.a(bVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        return ((v2) objA) instanceof v2.b ? new androidx.work.d.a.c() : new androidx.work.d.a.C0165a();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/PowerCurveAvailabilityService$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
