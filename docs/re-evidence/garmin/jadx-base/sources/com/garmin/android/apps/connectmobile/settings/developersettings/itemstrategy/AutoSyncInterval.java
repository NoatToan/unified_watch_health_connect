package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.sync.AutoSyncScheduler;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/AutoSyncInterval;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lmg1/a;", "modelItem", "Lkotlin/Function0;", "", "notifyChange", "Landroid/content/DialogInterface$OnClickListener;", "handleEditTextInput", "(Landroid/content/Context;Lmg1/a;Le23/a;)Landroid/content/DialogInterface$OnClickListener;", "Lmg1/b;", "getViewType", "()Lmg1/b;", "getContext", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "", "showProgress", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "Landroid/widget/EditText;", "autoSyncIntervalInput", "Landroid/widget/EditText;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AutoSyncInterval implements IDeveloperItemStrategy {
    public static final int $stable = 8;
    private EditText autoSyncIntervalInput;

    private final DialogInterface.OnClickListener handleEditTextInput(Context context, mg1.a modelItem, e23.a<Unit> notifyChange) {
        return new c32.c(this, modelItem, notifyChange, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleEditTextInput$lambda$0(AutoSyncInterval autoSyncInterval, mg1.a aVar, e23.a aVar2, Context context, DialogInterface dialogInterface, int i14) {
        if (i14 == -1) {
            try {
                EditText editText = autoSyncInterval.autoSyncIntervalInput;
                if (editText == null) {
                    s.m("autoSyncIntervalInput");
                    throw null;
                }
                int iIntValue = Integer.valueOf(editText.getText().toString()).intValue() * 1000;
                int i15 = AutoSyncScheduler.f45033a;
                if (iIntValue < 180000) {
                    iIntValue = 180000;
                }
                GCMSettingManager.f41536b.edit().putInt(lg1.d.AUTO_SYNC_INTERVAL.f112244a, iIntValue).apply();
                aVar.f118373c = (GCMSettingManager.f() / 1000) + " seconds";
                aVar2.invoke();
                if (GCMSettingManager.x()) {
                    AutoSyncScheduler.b(context);
                }
            } catch (NumberFormatException unused) {
            }
        }
        dialogInterface.dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        lg1.d dVar = lg1.d.AUTO_SYNC_INTERVAL;
        return new mg1.a(dVar.f112244a, dVar.f112245b, androidx.core.view.j.f(GCMSettingManager.f() / 1000, " seconds"), false, false, 24, null);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.b getViewType() {
        return mg1.b.VIEW_TYPE_BUTTON;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public void handleClick(View view2, e23.a<Unit> notifyChange, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        Context contextA = a.a(view2, notifyChange, showProgress, modelItem);
        EditText editText = new EditText(contextA);
        this.autoSyncIntervalInput = editText;
        editText.setText(String.valueOf(GCMSettingManager.f() / 1000));
        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(contextA).setTitle("Auto Sync Interval");
        int i14 = AutoSyncScheduler.f45033a;
        androidx.appcompat.app.e.a message = title.setMessage("Set auto sync interval in seconds. (Min = 180 seconds)");
        EditText editText2 = this.autoSyncIntervalInput;
        if (editText2 != null) {
            message.setView(editText2).setPositiveButton(contextA.getText(R.string.lbl_yes), handleEditTextInput(contextA, modelItem, notifyChange)).setNegativeButton(contextA.getText(R.string.lbl_no), handleEditTextInput(contextA, modelItem, notifyChange)).show();
        } else {
            s.m("autoSyncIntervalInput");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }
}
