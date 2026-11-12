package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigActivity;
import d53.w;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/NewHRZonesTesting;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "Landroid/view/View;", "view", "", "notifyChange", "Lkotlin/Function1;", "", "showProgress", "modelItem", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewHRZonesTesting implements IDeveloperItemStrategy {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleClick$lambda$0(String[] strArr, String str, Context context, DialogInterface dialogInterface, int i14) {
        dialogInterface.getClass();
        String str2 = strArr[i14];
        String[] strArr2 = (String[]) w.W(str2, new String[]{str}).toArray(new String[0]);
        long j8 = Long.parseLong(strArr2[1]);
        dialogInterface.dismiss();
        Toast.makeText(context, "Launching HRZonesConfigActivity for device [" + str2 + "] ...", 0).show();
        Intent intent = new Intent(context, (Class<?>) HRZonesConfigActivity.class);
        intent.putExtra("GCM_deviceUnitID", j8);
        intent.putExtra("GCM_deviceProductNbr", strArr2[2]);
        context.startActivity(intent);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        lg1.d dVar = lg1.d.NEW_HR_ZONES_TESTING;
        return new mg1.a(dVar.f112244a, dVar.f112245b, dVar.f112246c, false, false, 24, null);
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
        rd2.f.a().f152045a.getClass();
        ArrayList<sd2.f> arrayListD = rd2.j.d();
        Context context = view2.getContext();
        if (arrayListD == null || arrayListD.isEmpty()) {
            Toast.makeText(context, "No devices.", 0).show();
            return;
        }
        ArrayList arrayList = new ArrayList(arrayListD.size());
        for (sd2.f fVar : arrayListD) {
            arrayList.add(fVar.getProductDisplayName() + " >> " + fVar.getUnitID() + " >> " + fVar.getProductNumber());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        new androidx.appcompat.app.e.a(context).setTitle("Choose Device").setSingleChoiceItems(strArr, -1, new k(strArr, context, 0)).show();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }
}
