package com.xiaomi.hm.health.fragment;

import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.heartrate.reserve.bean.HeartRateReserveInfo;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.EditHRReserveActivity;
import com.xiaomi.hm.health.fragment.SettingHeartRateDialogHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/fragment/SettingHeartRateDialogHelper;", "", "", "id", "", "c", "b", "", "show", "Landroidx/appcompat/app/AppCompatActivity;", "a", "Landroidx/appcompat/app/AppCompatActivity;", "getContext", "()Landroidx/appcompat/app/AppCompatActivity;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SettingHeartRateDialogHelper {

    @NotNull
    private static final String b = "SettingHeartRateFragment";
    private static final int c = 0;
    private static final int d = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppCompatActivity context;

    public SettingHeartRateDialogHelper(@NotNull AppCompatActivity appCompatActivity) {
        this.context = appCompatActivity;
    }

    private final int b() {
        String str = UserSettings.get(this.context.getContentResolver(), UserSettingsKeys.KEY_RESERVE_HEARTRATE);
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        return ((HeartRateReserveInfo) new Gson().fromJson(str, HeartRateReserveInfo.class)).getHeartRateType();
    }

    private final String c(int id) {
        return this.context.getString(id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SettingHeartRateDialogHelper settingHeartRateDialogHelper, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            EditHRReserveActivity.show(settingHeartRateDialogHelper.getContext(), 1);
            dialogInterface.dismiss();
        } else {
            if (i != 1) {
                return;
            }
            EditHRReserveActivity.show(settingHeartRateDialogHelper.getContext(), 0);
            dialogInterface.dismiss();
        }
    }

    @NotNull
    public final AppCompatActivity getContext() {
        return this.context;
    }

    public final void show() {
        new AlertDialogFragment.Builder(this.context).setTitle(this.context.getString(R.string.sport_heart_rate_zone)).setSingleChoiceItemsNew(new AlertDialogFragment.ChoiceItems().setItems(new String[]{c(R.string.use_heart_type_max), c(R.string.use_heart_type_reserve)}).setItemChoice(b() == 1 ? 0 : 1), new DialogInterface.OnClickListener() { // from class: jr6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SettingHeartRateDialogHelper.d(this.a, dialogInterface, i);
            }
        }).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setCancelable(true).show(this.context.getSupportFragmentManager());
    }
}
