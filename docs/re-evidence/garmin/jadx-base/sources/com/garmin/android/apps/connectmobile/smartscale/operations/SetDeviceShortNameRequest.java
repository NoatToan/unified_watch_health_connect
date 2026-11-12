package com.garmin.android.apps.connectmobile.smartscale.operations;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.smartscale.model.f;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import gt2.c;
import lc.u0;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import wn1.t;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/operations/SetDeviceShortNameRequest;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "Lf12/b;", "userAccount", "Lwn1/t;", "inviteSocialRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lf12/b;Lwn1/t;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SetDeviceShortNameRequest extends Worker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f44475g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f44476h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f12.b f44477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f44478f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.smartscale.operations.SetDeviceShortNameRequest$doWork$1", f = "SetDeviceShortNameRequest.kt", l = {46}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44479a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f44481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f44482d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, long j8, d<? super b> dVar) {
            super(2, dVar);
            this.f44481c = fVar;
            this.f44482d = j8;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return SetDeviceShortNameRequest.this.new b(this.f44481c, this.f44482d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44479a;
            long j8 = this.f44482d;
            if (i14 == 0) {
                r.b(obj);
                t tVar = SetDeviceShortNameRequest.this.f44478f;
                this.f44479a = 1;
                tVar.getClass();
                obj = f0.J(tVar, new wn1.b0(this.f44481c, j8, null), this);
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
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                g.w("Successfully saved short name for device with id ", j8, SetDeviceShortNameRequest.f44476h);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                SetDeviceShortNameRequest.f44476h.error("Gor error " + ((v2.a) v2Var).f47384b + " while saving short name for device with id " + j8);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = c.f79010a;
        f44476h = gt2.b.f79005a.h("SetDeviceShortNameWorker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SetDeviceShortNameRequest(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null), t.a.b(t.f186332a));
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final androidx.work.d.a c() throws Throwable {
        f44476h.debug("doWork: ");
        WorkerParameters workerParameters = this.f11470b;
        String strE = workerParameters.f11427b.e("extra_scale_name");
        long jD = workerParameters.f11427b.d("extra_device_id", -1L);
        ge1.b.W(t13.h.f161748a, new b(new f(Integer.valueOf(this.f44477e.getUserProfilePk()), String.valueOf(jD), strE, null, null, null, null, null, null, null, null, 2040, null), jD, null));
        return new androidx.work.d.a.c();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/operations/SetDeviceShortNameRequest$a;", "", "<init>", "()V", "", "EXTRA_SCALE_NAME", "Ljava/lang/String;", "EXTRA_DEVICE_ID", "TAG", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetDeviceShortNameRequest(Context context, WorkerParameters workerParameters, f12.b bVar, t tVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        bVar.getClass();
        tVar.getClass();
        this.f44477e = bVar;
        this.f44478f = tVar;
    }
}
