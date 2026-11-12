package com.garmin.android.apps.connectmobile.device.passcode;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/passcode/DevicePasscodeResetWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DevicePasscodeResetWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f33749g = new a(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeResetWorker", f = "DevicePasscodeResetWorker.kt", l = {23}, m = "doWork", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f33750a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33752c;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f33750a = obj;
            this.f33752c |= Integer.MIN_VALUE;
            return DevicePasscodeResetWorker.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Landroidx/work/d$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Landroidx/work/d$a;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeResetWorker$doWork$2", f = "DevicePasscodeResetWorker.kt", l = {33}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, d<? super androidx.work.d.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y92.d f33753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f33754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f33756d;

        public c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            c cVar = DevicePasscodeResetWorker.this.new c(dVar);
            cVar.f33756d = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super androidx.work.d.a> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            y92.d dVar;
            long j8;
            b0 b0Var = (b0) this.f33756d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33755c;
            if (i14 == 0) {
                r.b(obj);
                long jD = DevicePasscodeResetWorker.this.f11470b.f11427b.d("device_unit_id", -1L);
                if (jD == -1) {
                    return new androidx.work.d.a.C0165a();
                }
                ((s80.c) KoinJavaComponent.get$default(s80.c.class, null, null, 6, null)).d(jD);
                dVar = (y92.d) KoinJavaComponent.get$default(y92.d.class, null, new a90.b(jD, 12), 2, null);
                this.f33756d = b0Var;
                this.f33753a = dVar;
                this.f33754b = jD;
                this.f33755c = 1;
                obj = dVar.d(this);
                if (obj == aVar) {
                    return aVar;
                }
                j8 = jD;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j8 = this.f33754b;
                dVar = this.f33753a;
                r.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            dVar.onCleared();
            StringBuilder sb3 = new StringBuilder("Reset device passcode for device unit id: ");
            sb3.append(j8);
            sb3.append(" complete success[");
            String strK = hb.a.k(sb3, zBooleanValue, "]");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "DeviceResetPasscodeWorker", strK);
            return zBooleanValue ? new androidx.work.d.a.c() : new androidx.work.d.a.C0165a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevicePasscodeResetWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(d<? super androidx.work.d.a> dVar) throws Throwable {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f33752c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f33752c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objE0 = bVar.f33750a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f33752c;
        if (i15 == 0) {
            r.b(objE0);
            x53.c cVar = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            c cVar2 = new c(null);
            bVar.f33752c = 1;
            objE0 = ge1.b.e0(bVar2, cVar2, bVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        objE0.getClass();
        return objE0;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/passcode/DevicePasscodeResetWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARG_DEVICE_UNIT_ID", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
