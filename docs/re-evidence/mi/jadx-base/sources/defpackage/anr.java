package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableFutureKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.a;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class anr implements t0a {
    public static final String d = ppe.i("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1p f3292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0a f3293b;
    public final WorkSpecDao c;

    @SuppressLint({"LambdaLast"})
    public anr(WorkDatabase workDatabase, r0a r0aVar, m1p m1pVar) {
        this.f3293b = r0aVar;
        this.f3292a = m1pVar;
        this.c = workDatabase.workSpecDao();
    }

    @Override // defpackage.t0a
    public lhe<Void> a(final Context context, final UUID uuid, final q0a q0aVar) {
        return ListenableFutureKt.executeAsync(this.f3292a.d(), "setForegroundAsync", new Function0() { // from class: zmr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f41469a.c(uuid, q0aVar, context);
            }
        });
    }

    public final /* synthetic */ Void c(UUID uuid, q0a q0aVar, Context context) {
        String string = uuid.toString();
        WorkSpec workSpec = this.c.getWorkSpec(string);
        if (workSpec == null || workSpec.state.isFinished()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        this.f3293b.a(string, q0aVar);
        context.startService(a.e(context, WorkSpecKt.generationalId(workSpec), q0aVar));
        return null;
    }
}
