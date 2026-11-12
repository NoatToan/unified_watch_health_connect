package com.xiaomi.hm.health.ui.pai.hrsetting;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.pai.ui.hrsetting.IHeartRateSetting;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.ui.pai.hrsetting.IHrSettingWrap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\"\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/ui/pai/hrsetting/IHrSettingWrap;", "Lcom/huami/pai/ui/hrsetting/IHeartRateSetting;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "strId", "", "showToastShort", "", "isOk", "showOpenResultDialog", "titleId", "msgId", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface IHrSettingWrap extends IHeartRateSetting {
    void showOpenResultDialog(@Nullable Context context, int titleId, int msgId);

    void showOpenResultDialog(@Nullable Context context, boolean isOk);

    void showToastShort(@Nullable Context context, int strId);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX INFO: Access modifiers changed from: private */
        public static void d(DialogInterface dialogInterface, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void e(DialogInterface dialogInterface, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void f(DialogInterface dialogInterface, int i) {
        }

        public static boolean showHrSetting(@NotNull IHrSettingWrap iHrSettingWrap, @NotNull Context context) {
            return IHeartRateSetting.DefaultImpls.showHrSetting(iHrSettingWrap, context);
        }

        public static void showOpenResultDialog(@NotNull IHrSettingWrap iHrSettingWrap, @Nullable Context context, boolean z) {
            if (context instanceof FragmentActivity) {
                boolean zSupportNewHealthDetect = HMDeviceConfig.supportNewHealthDetect();
                int i = R.string.pai_open_ok;
                if (z && zSupportNewHealthDetect) {
                    AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(context);
                    FragmentActivity fragmentActivity = (FragmentActivity) context;
                    AlertDialogFragment.Builder neutralButton = builder.setNeutralButton(fragmentActivity.getString(R.string.ble_known), new DialogInterface.OnClickListener() { // from class: gc4
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IHrSettingWrap.DefaultImpls.d(dialogInterface, i2);
                        }
                    });
                    if (!z) {
                        i = R.string.pai_open_failed;
                    }
                    neutralButton.setTitle(i).setMessage(fragmentActivity.getString(R.string.pai_open_ok_gt2_tips, new Object[]{fragmentActivity.getString(R.string.setting_health_detect)})).show(fragmentActivity.getSupportFragmentManager());
                    return;
                }
                int i2 = z ? R.string.pai_open_ok_tips : R.string.pai_open_failed_tips;
                AlertDialogFragment.Builder builder2 = new AlertDialogFragment.Builder(context);
                FragmentActivity fragmentActivity2 = (FragmentActivity) context;
                AlertDialogFragment.Builder neutralButton2 = builder2.setNeutralButton(fragmentActivity2.getString(R.string.ble_known), new DialogInterface.OnClickListener() { // from class: hc4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        IHrSettingWrap.DefaultImpls.e(dialogInterface, i3);
                    }
                });
                if (!z) {
                    i = R.string.pai_open_failed;
                }
                neutralButton2.setTitle(i).setMessage(i2).show(fragmentActivity2.getSupportFragmentManager());
            }
        }

        public static void showToastShort(@NotNull IHrSettingWrap iHrSettingWrap, @Nullable Context context, int i) {
            CustomToast.makeText(context, i, 0).show();
        }

        public static /* synthetic */ void showToastShort$default(IHrSettingWrap iHrSettingWrap, Context context, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showToastShort");
            }
            if ((i2 & 2) != 0) {
                i = R.string.open_success;
            }
            iHrSettingWrap.showToastShort(context, i);
        }

        public static void showOpenResultDialog(@NotNull IHrSettingWrap iHrSettingWrap, @Nullable Context context, int i, int i2) {
            if (context instanceof FragmentActivity) {
                AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(context);
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                builder.setNeutralButton(fragmentActivity.getString(R.string.ble_known), new DialogInterface.OnClickListener() { // from class: ic4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        IHrSettingWrap.DefaultImpls.f(dialogInterface, i3);
                    }
                }).setTitle(i).setMessage(i2).show(fragmentActivity.getSupportFragmentManager());
            }
        }
    }
}
