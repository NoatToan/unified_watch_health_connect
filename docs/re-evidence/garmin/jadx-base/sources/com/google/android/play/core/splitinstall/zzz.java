package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.IntentSenderForResultStarter;

/* JADX INFO: loaded from: classes14.dex */
final class zzz implements IntentSenderForResultStarter {
    final /* synthetic */ Activity zza;

    public zzz(zzaa zzaaVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.play.core.common.IntentSenderForResultStarter
    public final void startIntentSenderForResult(IntentSender intentSender, int i14, Intent intent, int i15, int i16, int i17, Bundle bundle) throws IntentSender.SendIntentException {
        this.zza.startIntentSenderForResult(intentSender, i14, intent, i15, i16, i17);
    }
}
