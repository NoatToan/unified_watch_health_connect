package com.garmin.android.apps.connectmobile.pendingactivity.api;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import bz0.o;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import f12.l;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import o13.r;
import o53.b0;
import o53.s0;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import t13.d;
import ue.f;
import ue.i0;
import ue.v;
import ue.x;
import v13.e;
import v13.i;
import vb.h;
import ve.t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pendingactivity/api/UploadPendingActivityWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UploadPendingActivityWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f39807j = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f39808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f39809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f39810i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.apps.connectmobile.pendingactivity.api.UploadPendingActivityWorker", f = "UploadPendingActivityWorker.kt", l = {32}, m = "doWork", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f39811a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f39813c;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f39811a = obj;
            this.f39813c |= Integer.MIN_VALUE;
            return UploadPendingActivityWorker.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.pendingactivity.api.UploadPendingActivityWorker$doWork$2", f = "UploadPendingActivityWorker.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, d<? super Unit>, Object> {
        public c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return UploadPendingActivityWorker.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            UploadPendingActivityWorker uploadPendingActivityWorker = UploadPendingActivityWorker.this;
            String str = uploadPendingActivityWorker.f39809h;
            if (str != null) {
                try {
                    Request requestBuild = new Request.Builder().url(str).build();
                    o.f22274a.getClass();
                    Response responseExecute = o.b().newCall(requestBuild).execute();
                    String str2 = "getActivityUploadStatus(" + str + ") response success=[" + responseExecute.isSuccessful() + "]";
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var, "UploadPendingActivityWorker", str2);
                    if (!responseExecute.isSuccessful()) {
                        i2.a.f(a2Var, "UploadPendingActivityWorker", "getActivityUploadStatus(" + str + ") FAILED response code " + responseExecute.code());
                        l.f68084a.getClass();
                        l.a.a().T3(true);
                    } else if (responseExecute.code() == 202) {
                        a aVar3 = UploadPendingActivityWorker.f39807j;
                        Context context = uploadPendingActivityWorker.f39808g;
                        long j8 = uploadPendingActivityWorker.f39810i;
                        aVar3.getClass();
                        a.a(context, j8, str);
                    } else {
                        l.f68084a.getClass();
                        l.a.a().T3(true);
                    }
                } catch (Exception e4) {
                    String str3 = "getActivityUploadStatus(" + str + ") FAILED with exception: " + e4;
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var2, "UploadPendingActivityWorker", str3);
                    sn.a.o(l.f68084a, true);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadPendingActivityWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f39808g = context;
        androidx.work.c cVar = workerParameters.f11427b;
        this.f39809h = cVar.e("KEY_UPDATE_ACTIVITY_STATUS_URL");
        this.f39810i = cVar.d("KEY_UPDATE_ACTIVITY_DELAY", 1000L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(d<? super androidx.work.d.a> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f39813c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f39813c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f39811a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f39813c;
        if (i15 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            c cVar2 = new c(null);
            bVar.f39813c = 1;
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pendingactivity/api/UploadPendingActivityWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_UPDATE_ACTIVITY_STATUS_URL", "KEY_UPDATE_ACTIVITY_DELAY", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Context context, long j8, String str) {
            context.getClass();
            str.getClass();
            androidx.work.c.a aVar = new androidx.work.c.a();
            LinkedHashMap linkedHashMap = aVar.f11467a;
            linkedHashMap.put("KEY_UPDATE_ACTIVITY_STATUS_URL", str);
            linkedHashMap.put("KEY_UPDATE_ACTIVITY_DELAY", Long.valueOf(j8));
            androidx.work.c cVarA = aVar.a();
            x.a aVar2 = new x.a((Class<? extends androidx.work.d>) UploadPendingActivityWorker.class);
            f.a aVar3 = new f.a();
            aVar3.b(v.CONNECTED);
            aVar2.f170098c.f26950j = aVar3.a();
            x.a aVarE = aVar2.f(cVarA).e(j8, TimeUnit.MILLISECONDS);
            aVarE.f170099d.add("UploadPendingActivityWorker");
            x xVarA = aVarE.a();
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var, "UploadPendingActivityWorker", "beginWork");
            com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context).a(org.apache.commons.lang3.e.e(System.currentTimeMillis(), "UploadPendingActivityWorker"), ue.l.REPLACE, xVarA).a();
        }

        public static void b(Context context) {
            context.getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "UploadPendingActivityWorker", "cancelWork");
            i0.f170088a.getClass();
            t0 t0VarG = t0.g(context);
            t0VarG.getClass();
            t0VarG.d("UploadPendingActivityWorker");
        }

        private a() {
        }
    }
}
