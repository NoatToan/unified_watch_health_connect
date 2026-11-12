package com.garmin.device.filetransfer.core.background;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.d;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.TimeUnit;
import ok2.a0;
import ok2.y;
import org.joda.time.DateTimeConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import rs2.c;
import ue.c0;
import ue.f;
import ue.i0;
import ue.k;
import ue.v;
import ue.z;
import ve.t0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/device/filetransfer/core/background/AutoSyncWorker;", "Lcom/garmin/device/filetransfer/core/background/BackgroundTransferWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutoSyncWorker extends BackgroundTransferWorker {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f50762t = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Logger f50763v = LoggerFactory.getLogger("CFT#AutoSyncTransferWorker");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // com.garmin.device.filetransfer.core.background.BackgroundTransferWorker
    public final Object g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.garmin.device.filetransfer.core.background.a.f50783c.getClass();
        if (!com.garmin.device.filetransfer.core.background.a.C1027a.a(jCurrentTimeMillis)) {
            return null;
        }
        f().warn("Skip automatic try around midnight");
        return new d.a.b();
    }

    @Override // com.garmin.device.filetransfer.core.background.BackgroundTransferWorker
    public final y i(c cVar) {
        return new y(new y.a(null, null, null, null, null, false, y.b.NO_CACHE_ALLOWED, 63, null));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/device/filetransfer/core/background/AutoSyncWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "WORK_NAME", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(a aVar, Context context, long j8) {
            v vVar = v.CONNECTED;
            aVar.getClass();
            vVar.getClass();
            try {
                f.a aVar2 = new f.a();
                aVar2.b(vVar);
                f fVarA = aVar2.a();
                try {
                    a0.f132585h.a().getConfiguration().n().i();
                } catch (Throwable unused) {
                }
                long jMax = Math.max(j8, 900000L);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c0.a aVar3 = new c0.a((Class<? extends d>) AutoSyncWorker.class, jMax, timeUnit, 300000L, timeUnit);
                aVar3.f170098c.f26950j = fVarA;
                c0.a aVarD = aVar3.e(300000L, timeUnit).d(ue.a.LINEAR, 300000L, timeUnit);
                BackgroundTransferWorker.f50764q.getClass();
                c0 c0VarA = aVarD.f(BackgroundTransferWorker.a.a("AutoSyncTransferWorker", null, null).a()).a();
                i0.f170088a.getClass();
                t0 t0VarG = t0.g(context);
                t0VarG.getClass();
                ue.y yVarF = t0VarG.f("background_auto_sync", k.REPLACE, c0VarA);
                yVarF.getClass();
                AutoSyncWorker.f50763v.info("Scheduled auto sync " + (j8 / ((long) DateTimeConstants.MILLIS_PER_MINUTE)) + " min " + ((z) yVarF).f170135c);
            } catch (Throwable th3) {
                AutoSyncWorker.f50763v.error("Failed to schedule auto sync", th3);
            }
        }

        private a() {
        }
    }
}
