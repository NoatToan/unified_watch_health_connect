package com.garmin.android.gncs.actionhandler;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements PendingIntent.OnFinished {
    @Override // android.app.PendingIntent.OnFinished
    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i14, String str, Bundle bundle) {
        AndroidActionHandlerKt.handleAction$lambda$6$lambda$5(pendingIntent, intent, i14, str, bundle);
    }
}
