package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.v;
import androidx.media3.exoplayer.u;
import c22.l3;
import i3.e5;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.f0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/InReachSubscriptionReminder;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "Landroid/view/View;", "view", "", "notifyChange", "Lkotlin/Function1;", "", "showProgress", "modelItem", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InReachSubscriptionReminder implements IDeveloperItemStrategy {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleClick$lambda$0(mg1.a aVar, int i14, e23.a aVar2, int i15, int i16, int i17, String str, String str2, String str3) {
        int iC = e5.c(i15, DateTimeConstants.SECONDS_PER_HOUR, (i16 * 60) + i17, 1000);
        f12.l.f68084a.getClass();
        f12.l.a.a().u2(iC, "keyInReachReminderOverrideDurationMillis");
        l3.f23124b.getClass();
        aVar.f118373c = l3.a.l1(i14);
        aVar2.invoke();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        f12.l.f68084a.getClass();
        int iI2 = f12.l.a.a().i2(172800000, "keyInReachReminderOverrideDurationMillis");
        l3.f23124b.getClass();
        String strL1 = l3.a.l1(iI2);
        lg1.d dVar = lg1.d.INREACH_SUBSCRIPTION_REMINDER_OVERRIDE;
        return new mg1.a(dVar.f112244a, dVar.f112245b, strL1, false, false, 24, null);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.b getViewType() {
        return mg1.b.VIEW_TYPE_BUTTON;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public void handleClick(View view2, e23.a<Unit> notifyChange, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        view2.getClass();
        notifyChange.getClass();
        showProgress.getClass();
        modelItem.getClass();
        f12.l.f68084a.getClass();
        int iI2 = f12.l.a.a().i2(172800000, "keyInReachReminderOverrideDurationMillis");
        f0 f0VarB = f0.a.b(f0.U0, (int) (((long) iI2) / 1000), 48, 12);
        f0VarB.T = new u(modelItem, iI2, notifyChange, 1);
        Context context = view2.getContext();
        com.garmin.android.apps.connectmobile.c cVar = context instanceof com.garmin.android.apps.connectmobile.c ? (com.garmin.android.apps.connectmobile.c) context : null;
        v supportFragmentManager = cVar != null ? cVar.getSupportFragmentManager() : null;
        if (supportFragmentManager != null) {
            f0VarB.show(supportFragmentManager, "InReachSubscriptionOverride");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }
}
