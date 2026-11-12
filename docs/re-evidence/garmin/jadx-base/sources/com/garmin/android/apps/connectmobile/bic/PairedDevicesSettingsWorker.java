package com.garmin.android.apps.connectmobile.bic;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.library.backgroundtaskmanagement.BizOperationException;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rd2.f;
import rd2.j;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/PairedDevicesSettingsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PairedDevicesSettingsWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f30713g = new a(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.apps.connectmobile.bic.PairedDevicesSettingsWorker", f = "PairedDevicesSettingsWorker.kt", l = {24}, m = "doWork", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f30714a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30716c;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f30714a = obj;
            this.f30716c |= Integer.MIN_VALUE;
            return PairedDevicesSettingsWorker.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Landroidx/work/d$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Landroidx/work/d$a;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.bic.PairedDevicesSettingsWorker$doWork$2", f = "PairedDevicesSettingsWorker.kt", l = {25}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, d<? super androidx.work.d.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30717a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroidx/work/d$a;", "<anonymous>", "(Lo53/b0;)Landroidx/work/d$a;"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.bic.PairedDevicesSettingsWorker$doWork$2$1", f = "PairedDevicesSettingsWorker.kt", l = {29}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, d<? super androidx.work.d.a>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Iterator f30718a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f30719b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f30720c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f30721d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public /* synthetic */ Object f30722e;

            public a(d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f30722e = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super androidx.work.d.a> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                int i14;
                int i15;
                Iterator it;
                b0 b0Var = (b0) this.f30722e;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i16 = this.f30721d;
                try {
                    if (i16 == 0) {
                        r.b(obj);
                        f.a().f152045a.getClass();
                        ArrayList arrayListE = j.e();
                        if (arrayListE != null) {
                            i14 = 0;
                            i15 = 3;
                            it = arrayListE.iterator();
                        }
                        return new androidx.work.d.a.c();
                    }
                    if (i16 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i14 = this.f30720c;
                    i15 = this.f30719b;
                    it = this.f30718a;
                    r.b(obj);
                    while (it.hasNext()) {
                        o53.r<dc0.a> rVarK = new cc0.a(((sd2.f) it.next()).getUnitID(), i15, null).k();
                        this.f30722e = b0Var;
                        this.f30718a = it;
                        this.f30719b = i15;
                        this.f30720c = i14;
                        this.f30721d = 1;
                        Object objC = ((s) rVarK).C(this);
                        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                        if (objC == aVar) {
                            return aVar;
                        }
                    }
                } catch (BizOperationException e4) {
                    a2 a2Var = a2.BIC;
                    String str = "Fetch device settings request failed with status=[" + e4.getStatus() + "]";
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "PairedDevicesSettingsWorker", str);
                    new androidx.work.d.a.C0165a();
                } catch (Throwable th3) {
                    a2 a2Var2 = a2.BIC;
                    String strN = fb1.c.n("Error fetching device settings: ", th3.getMessage());
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "PairedDevicesSettingsWorker", strN);
                    new androidx.work.d.a.C0165a();
                }
                return new androidx.work.d.a.c();
            }
        }

        public c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super androidx.work.d.a> dVar) {
            return new c(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f30717a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(null);
            this.f30717a = 1;
            Object objE0 = ge1.b.e0(bVar, aVar2, this);
            return objE0 == aVar ? aVar : objE0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairedDevicesSettingsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(d<? super androidx.work.d.a> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f30716c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f30716c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objE = bVar.f30714a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f30716c;
        if (i15 == 0) {
            r.b(objE);
            c cVar = new c(null);
            bVar.f30716c = 1;
            objE = c0.e(cVar, bVar);
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/PairedDevicesSettingsWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
