package kd0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.fitness_age.presentation.FitnessAgeReportsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.livesessionview.LiveActivityActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/x6;", "Lu32/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x6 implements u32.a {
    @Override // u32.a
    public final Intent a(Context context, long j8) {
        context.getClass();
        yf2.a aVar = yf2.a.VO2_MAX;
        LiveActivityActivity.a aVar2 = LiveActivityActivity.f50544d;
        aVar.getClass();
        if (au0.i0.f12939a[aVar.ordinal()] != 1) {
            lc.u0.r();
            return null;
        }
        zf2.d dVar = zf2.d.Q1;
        aVar2.getClass();
        dVar.getClass();
        Intent intentA = LiveActivityActivity.a.a(context);
        ig2.e eVar = new ig2.e(new ig2.a(intentA));
        eVar.c();
        eVar.a(Long.valueOf(j8));
        ho0.g gVar = new ho0.g(dVar, 23);
        ig2.b bVar = eVar.f93439a;
        bVar.f(gVar);
        bVar.f(new ho0.g(aVar, 24));
        bVar.f(new a81.j(false, 15));
        bVar.f(new a81.j(false, 14));
        eVar.e();
        return intentA;
    }

    @Override // u32.a
    public final void b(Context context) {
        context.getClass();
        FitnessAgeReportsActivity.f35216c.getClass();
        context.startActivity(new Intent(context, (Class<?>) FitnessAgeReportsActivity.class));
    }

    @Override // u32.a
    public final void c(Context context) {
        context.getClass();
        HelpActivity.a.e(HelpActivity.f36653a, context, ro0.l.TRAINING_STATUS, "VO2_MAX_ACTION", null, 8);
    }

    @Override // u32.a
    public final UserSettingsDTO getUserSettings() {
        return GCMSettingManager.s();
    }
}
