package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import d53.n;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/FeedbackLoopInfo;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "Landroid/view/View;", "view", "", "notifyChange", "Lkotlin/Function1;", "", "showProgress", "modelItem", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FeedbackLoopInfo implements IDeveloperItemStrategy {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleClick$lambda$0(DialogInterface dialogInterface, int i14) {
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        lg1.d dVar = lg1.d.FEEDBACK_SCREEN_INFO;
        return new mg1.a(dVar.f112244a, dVar.f112245b, dVar.f112246c, false, false, 24, null);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.b getViewType() {
        return mg1.b.VIEW_TYPE_BUTTON;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public void handleClick(View view2, e23.a<Unit> notifyChange, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        Context contextA = a.a(view2, notifyChange, showProgress, modelItem);
        cw.l lVarB = cw.l.b();
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(contextA);
        int i14 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_feedback_syncs_successful), 0);
        lVarB.getClass();
        long jCurrentTimeMillis = (System.currentTimeMillis() - GCMSettingManager.f41536b.getLong(GCMSettingManager.f41535a.getString(R.string.key_feedback_last_crash_timestamp), 0L)) / 86400000;
        int i15 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_feedback_count), 0);
        boolean z14 = GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_feedback_shown), false);
        boolean z15 = DateTime.now().getMillis() > GCMSettingManager.f41536b.getLong(GCMSettingManager.f41535a.getString(R.string.key_feedback_ready_timestamp), 0L);
        boolean zD = cw.l.d();
        StringBuilder sb3 = new StringBuilder("    \n            syncs successful = ");
        sb3.append(i14);
        sb3.append("\n            days passed since last crash = ");
        sb3.append(jCurrentTimeMillis);
        sb3.append("\n            feedback count = ");
        sb3.append(i15);
        sb3.append("\n            was feedback shown =  ");
        sb3.append(z14);
        com.airbnb.lottie.animation.keyframe.a.v("\n            is feedback ready to show =  ", "\n            should display Feedback Screen = ", sb3, z15, zD);
        sb3.append("\n            ");
        String strC = n.c(sb3.toString());
        aVar.setTitle("Feedback loop statistics");
        aVar.setMessage(strC);
        aVar.setNegativeButton("Close", new c(2));
        aVar.show();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }
}
