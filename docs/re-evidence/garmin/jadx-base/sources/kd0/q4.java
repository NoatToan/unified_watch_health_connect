package kd0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.activities.stats.ActivityPrivacyTypesActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkd0/q4;", "Lg/a;", "Lam/l;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q4 extends g.a<am.l, am.l> {
    @Override // g.a
    public final Intent a(Context context, am.l lVar) {
        am.l lVar2 = lVar;
        context.getClass();
        lVar2.getClass();
        int i14 = ActivityPrivacyTypesActivity.f29759c;
        Intent intent = new Intent(context, (Class<?>) ActivityPrivacyTypesActivity.class);
        intent.putExtra("GCM_extra_privacy_type", lVar2.f4054a);
        return intent;
    }

    @Override // g.a
    public final am.l c(int i14, Intent intent) {
        if (i14 != -1 || intent == null) {
            return null;
        }
        am.l.a aVar = am.l.f4047c;
        String stringExtra = intent.getStringExtra("GCM_extra_activity_type");
        aVar.getClass();
        return am.l.a.a(stringExtra, am.l.f4051g);
    }
}
