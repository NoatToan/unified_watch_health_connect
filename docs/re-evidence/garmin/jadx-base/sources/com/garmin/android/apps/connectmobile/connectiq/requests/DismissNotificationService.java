package com.garmin.android.apps.connectmobile.connectiq.requests;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.library.backgroundtaskmanagement.c;
import w10.a;
import w10.g;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"Instantiatable"})
public class DismissNotificationService extends Worker {
    public DismissNotificationService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        long jD = this.f11470b.f11427b.d("open_webpage_request_date", -1L);
        if (jD == -1) {
            i2.i("DismissNotification", "Invalid request date date input");
            return new d.a.C0165a();
        }
        g gVarM = g.M();
        gVarM.getClass();
        c.d(new a(gVarM, jD), null);
        return new d.a.c();
    }
}
