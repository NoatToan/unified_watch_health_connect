package com.garmin.android.apps.connectmobile.consent;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import e23.p;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p92.o;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/DataSyncIndicatorsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DataSyncIndicatorsWorker extends CoroutineWorker {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroidx/work/d$a;", "<anonymous>", "(Lo53/b0;)Landroidx/work/d$a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.DataSyncIndicatorsWorker$doWork$2", f = "DataSyncIndicatorsWorker.kt", l = {19}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super androidx.work.d.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f32200b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f32200b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super androidx.work.d.a> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            b0 b0Var = (b0) this.f32200b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f32199a;
            if (i14 == 0) {
                r.b(obj);
                o oVar = o.f136619a;
                this.f32200b = b0Var;
                this.f32199a = 1;
                obj = oVar.h(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                gt2.c.b(a2.CONSENT.f28756a).debug("DataSyncIndicatorsWorker - ERROR NULL DataSyncIndicators response");
                return new androidx.work.d.a.C0165a();
            }
            boolean zBooleanValue = bool.booleanValue();
            gt2.c.b(a2.CONSENT.f28756a).debug("DataSyncIndicatorsWorker - SUCCESS DataSyncIndicators response-> " + zBooleanValue);
            return new androidx.work.d.a.c();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSyncIndicatorsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(t13.d<? super androidx.work.d.a> dVar) {
        return c0.e(new b(null), dVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/DataSyncIndicatorsWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
