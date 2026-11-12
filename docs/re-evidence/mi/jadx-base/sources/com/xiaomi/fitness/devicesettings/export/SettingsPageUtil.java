package com.xiaomi.fitness.devicesettings.export;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \"2\u00020\u0001:\u0001\"J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\rH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u0019H&J\b\u0010\u001b\u001a\u00020\u0019H&J\b\u0010\u001c\u001a\u00020\u0019H&J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/SettingsPageUtil;", "", "gotoHeartRatePage", "", "context", "Landroid/content/Context;", "gotoSleepPage", "gotoSpo2Page", "gotoPressurePage", "gotoSedentaryPage", "gotoStandDetectPage", "gotoUnWearSettingFragment", UnWearSettingFragment.IS_NFC_NEED, "", "gotoFactoryTestFragment", "gotoGuideSettingPage", "gotoOpenPolicyAccessActivity", "gotoDeviceKeepAliveGuideActivity", "needDeviceConnect", "gotoDeviceInfoPage", "gotoVitalityPage", "gotoECGMeasureRemindPage", "gotoConnectNewPhonePage", "gotoTrackPage", "newAppLayoutPage", "Landroidx/fragment/app/Fragment;", "newWearInstructionPage", "newGuideOpenPhoneCallPage", "newGuideSyncSystemSettingPage", "newGuideWebViewPage", "url", "", "gotoAudioRecordPage", "gotoTempSettingPage", "Companion", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SettingsPageUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/SettingsPageUtil$Companion;", "", "<init>", "()V", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void gotoAudioRecordPage(@NotNull Context context);

    void gotoConnectNewPhonePage(@NotNull Context context);

    void gotoDeviceInfoPage(@NotNull Context context);

    void gotoDeviceKeepAliveGuideActivity(boolean needDeviceConnect);

    void gotoECGMeasureRemindPage(@NotNull Context context);

    void gotoFactoryTestFragment(@NotNull Context context);

    void gotoGuideSettingPage(@NotNull Context context);

    void gotoHeartRatePage(@NotNull Context context);

    void gotoOpenPolicyAccessActivity(@NotNull Context context);

    void gotoPressurePage(@NotNull Context context);

    void gotoSedentaryPage(@NotNull Context context);

    void gotoSleepPage(@NotNull Context context);

    void gotoSpo2Page(@NotNull Context context);

    void gotoStandDetectPage(@NotNull Context context);

    void gotoTempSettingPage(@NotNull Context context);

    void gotoTrackPage(@NotNull Context context);

    void gotoUnWearSettingFragment(@NotNull Context context, boolean sIsNeedSync);

    void gotoVitalityPage(@NotNull Context context);

    @NotNull
    Fragment newAppLayoutPage();

    @NotNull
    Fragment newGuideOpenPhoneCallPage();

    @NotNull
    Fragment newGuideSyncSystemSettingPage();

    @NotNull
    Fragment newGuideWebViewPage(@NotNull String url);

    @NotNull
    Fragment newWearInstructionPage();
}
