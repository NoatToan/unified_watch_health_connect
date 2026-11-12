package kd0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.settings.GCMUserSettingsActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.AddWeightActivity;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/i2;", "Lgh0/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i2 implements gh0.a {
    @Override // gh0.a
    public final Intent g(Context context) {
        return ActiveTrainingPlansActivity.a.c(ActiveTrainingPlansActivity.f45098w, context, false, false, false, null, 192);
    }

    @Override // gh0.a
    public final Intent h(Context context) {
        context.getClass();
        AddWeightActivity.a aVar = AddWeightActivity.f48007c;
        LocalDate localDateNow = LocalDate.now();
        aVar.getClass();
        return AddWeightActivity.a.a(context, localDateNow);
    }

    @Override // gh0.a
    public final Intent i(Context context) {
        return sn.a.d(context, context, GCMUserSettingsActivity.class);
    }
}
