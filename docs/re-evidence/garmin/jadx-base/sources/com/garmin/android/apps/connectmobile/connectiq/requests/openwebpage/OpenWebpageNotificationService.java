package com.garmin.android.apps.connectmobile.connectiq.requests.openwebpage;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import w10.a;
import w10.c;
import w10.g;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"Instantiatable"})
public class OpenWebpageNotificationService extends Worker {
    public OpenWebpageNotificationService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        c cVar;
        try {
            cVar = (c) GsonUtil.f47253b.fromJson(this.f11470b.f11427b.e("open_webpage_request"), c.class);
        } catch (Exception e4) {
            i2.i("OpenWebpageNotification", "ERROR parsing OpenWebPageRequest input " + e4.toString());
            cVar = null;
        }
        if (cVar == null) {
            return new d.a.C0165a();
        }
        g gVarM = g.M();
        long dateReceived = cVar.getDateReceived();
        gVarM.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c.d(new a(gVarM, dateReceived), null);
        Context context = this.f11469a;
        Intent intent = cVar.h(context).f161324d;
        if (intent == null) {
            i2.i("OpenWebpageNotification", "NULL launchIntent for ".concat(cVar.toString()));
            return new d.a.C0165a();
        }
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.txt_error_occurred, 0).show();
        }
        return new d.a.c();
    }
}
