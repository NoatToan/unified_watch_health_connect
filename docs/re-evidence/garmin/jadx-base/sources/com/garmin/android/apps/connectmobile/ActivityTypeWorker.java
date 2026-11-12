package com.garmin.android.apps.connectmobile;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ActivityTypeWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivityTypeWorker extends CoroutineWorker {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.ActivityTypeWorker", f = "ActivityTypeManager.kt", l = {338}, m = "doWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f28622a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28624c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f28622a = obj;
            this.f28624c |= Integer.MIN_VALUE;
            return ActivityTypeWorker.this.c(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityTypeWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(t13.d<? super androidx.work.d.a> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f28624c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f28624c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objA = aVar.f28622a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f28624c;
        if (i15 == 0) {
            o13.r.b(objA);
            i iVar = i.f36758a;
            aVar.f28624c = 1;
            objA = iVar.a(aVar);
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        androidx.work.d.a aVar3 = (androidx.work.d.a) objA;
        i.f36758a.getClass();
        i.i();
        return aVar3;
    }
}
