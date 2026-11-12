package com.garmin.android.apps.connectmobile.reminders.network;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import ge1.b;
import o53.b0;
import o53.e2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sd1.c;
import t13.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/reminders/network/RemindersNetwork;", "Lo53/b0;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class RemindersNetwork extends Worker implements b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2 f41088e;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemindersNetwork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f41088e = b.h();
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        a2 a2Var = a2.USER_REMINDERS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "RemindersNetwork", "doWork: ");
        sd1.b bVar = new sd1.b(new sd1.d(this), d());
        bVar.b(new c(bVar));
        com.garmin.android.library.backgroundtaskmanagement.c.d(bVar, null);
        return new d.a.c();
    }

    public abstract pd1.a d();

    public abstract void e(pd1.c cVar);

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final g getF135150b() {
        return s0.f129406a.plus(this.f41088e);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/reminders/network/RemindersNetwork$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
