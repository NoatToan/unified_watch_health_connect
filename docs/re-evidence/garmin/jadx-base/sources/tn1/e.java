package tn1;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import ro0.l;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static final void a(Context context, d dVar, f fVar) {
        context.getClass();
        dVar.getClass();
        fVar.getClass();
        b bVar = new b(dVar);
        Bundle bundle = new Bundle();
        bundle.putString("Screen", bVar.f165504a.f165510a);
        bundle.putString("Source", fVar.f165515a);
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "LearnMoreSleepEducationTapped");
        HelpActivity.a.e(HelpActivity.f36653a, context, l.SLEEP_ENHANCED, "SLEEP_TRACKING_ACTION", null, 8);
    }
}
