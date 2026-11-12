package com.garmin.android.apps.connectmobile.connectiq.requests.openwebpage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.d;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.concurrent.TimeUnit;
import ue.i0;
import ue.l;
import ue.x;
import w10.c;

/* JADX INFO: loaded from: classes7.dex */
public class OpenWebpageNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        c cVar;
        if (!intent.hasExtra("open_webpage_request") || (cVar = (c) intent.getParcelableExtra("open_webpage_request")) == null) {
            return;
        }
        androidx.work.c.a aVar = new androidx.work.c.a();
        aVar.f11467a.put("open_webpage_request", GsonUtil.a(cVar));
        x xVarA = new x.a((Class<? extends d>) OpenWebpageNotificationService.class).f(aVar.a()).e(0L, TimeUnit.MILLISECONDS).a();
        i0.f170088a.getClass();
        i0.a.a(context).a("OpenWebpageNotification" + cVar.getDateReceived(), l.REPLACE, xVarA).a();
    }
}
