package defpackage;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class jnr implements jci {
    public static final String c = ppe.i("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f22958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1p f22959b;

    public jnr(WorkDatabase workDatabase, m1p m1pVar) {
        this.f22958a = workDatabase;
        this.f22959b = m1pVar;
    }

    @Override // defpackage.jci
    public lhe<Void> a(Context context, final UUID uuid, final Data data) {
        return ListenableFutureKt.executeAsync(this.f22959b.d(), "updateProgress", new Function0() { // from class: inr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f21326a.c(uuid, data);
            }
        });
    }

    public final /* synthetic */ Void c(UUID uuid, Data data) {
        String string = uuid.toString();
        ppe ppeVarE = ppe.e();
        String str = c;
        ppeVarE.a(str, "Updating progress for " + uuid + " (" + data + ")");
        this.f22958a.beginTransaction();
        try {
            WorkSpec workSpec = this.f22958a.workSpecDao().getWorkSpec(string);
            if (workSpec == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (workSpec.state == WorkInfo.State.RUNNING) {
                this.f22958a.workProgressDao().insert(new WorkProgress(string, data));
            } else {
                ppe.e().k(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
            }
            this.f22958a.setTransactionSuccessful();
            this.f22958a.endTransaction();
            return null;
        } catch (Throwable th) {
            try {
                ppe.e().d(c, "Error updating Worker progress", th);
                throw th;
            } catch (Throwable th2) {
                this.f22958a.endTransaction();
                throw th2;
            }
        }
    }
}
