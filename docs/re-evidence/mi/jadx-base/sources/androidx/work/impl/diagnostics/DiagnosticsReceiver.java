package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.a;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.ppe;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3220a = ppe.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        ppe.e().a(f3220a, "Requesting diagnostics");
        try {
            WorkManager.getInstance(context).enqueue(OneTimeWorkRequest.from((Class<? extends a>) DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            ppe.e().d(f3220a, "WorkManager is not initialized", e);
        }
    }
}
