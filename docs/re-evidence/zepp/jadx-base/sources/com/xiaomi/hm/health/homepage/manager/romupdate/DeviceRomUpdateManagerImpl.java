package com.xiaomi.hm.health.homepage.manager.romupdate;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.sync.manager.IDeviceRomUpdateManager;
import com.huami.module.homepage.sync.manager.RomEntry;
import com.huami.passport.AccountManager;
import com.huami.tools.analytics.DbUtils;
import com.huami.util.net.NetUtil;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.otaphone.service.OtaModel;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.ota.cloud.RomInfo;
import com.huami.watch.ota.cloud.RomInfoApi;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Box;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.homepage.manager.romupdate.DeviceRomUpdateManagerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001e\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/homepage/manager/romupdate/DeviceRomUpdateManagerImpl;", "Lcom/huami/module/homepage/sync/manager/IDeviceRomUpdateManager;", "", "b", GoogleApiAvailabilityLight.a, "Lcom/huami/module/homepage/sync/manager/RomEntry;", "c", "checkRomUpdate", "", "startRomUpdate", "skipRomUpdate", "Landroidx/fragment/app/FragmentActivity;", "activity", "showUpdateRomOldDialog", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/watch/ota/cloud/RomInfoApi;", "Lcom/huami/watch/ota/cloud/RomInfoApi;", "romUpdateApi", "", "Ljava/lang/String;", "lastRomVersion", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceRomUpdateManagerImpl implements IDeviceRomUpdateManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private RomInfoApi romUpdateApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private String lastRomVersion;

    public DeviceRomUpdateManagerImpl() {
        Context context = BraceletApp.getContext();
        this.context = context;
        this.romUpdateApi = new RomInfoApi(context);
        this.lastRomVersion = "";
    }

    private final boolean b() {
        Device currentDevice;
        String currentUid = AccountManager.getDefault(this.context).getCurrentUid();
        if (!(currentUid == null || currentUid.length() == 0) && (currentDevice = DeviceManager.getManager(this.context).getCurrentDevice()) != null && currentDevice.isConnected()) {
            String strModelNumber = currentDevice.info().modelNumber();
            String strBuildNumber = currentDevice.info().buildNumber();
            if (!Intrinsics.areEqual(strModelNumber, "") && !Intrinsics.areEqual(strBuildNumber, "")) {
                RomInfoApi romInfoApi = this.romUpdateApi;
                romInfoApi.setCurrentSysInfo(strBuildNumber, strModelNumber, "ALL");
                romInfoApi.setOverSeaUser(Account.isOversea(this.context));
                romInfoApi.setAppTokens(Cloud.getToken().getAccessToken());
                romInfoApi.setCurrentUid(currentUid);
                romInfoApi.setSerialNum(currentDevice.getSN());
                return true;
            }
        }
        return false;
    }

    private final RomEntry c() {
        RomInfo romInfo = new RomInfo();
        if (this.romUpdateApi.getRomInfo(romInfo) != 0) {
            return new RomEntry(false, null, null, false, 15, null);
        }
        String firmwareVersion = romInfo.getFirmwareVersion();
        if (firmwareVersion == null) {
            firmwareVersion = "";
        }
        this.lastRomVersion = firmwareVersion;
        String changeLog = romInfo.getChangeLog();
        String str = changeLog != null ? changeLog : "";
        String userCancelRomUpdateVersion = Box.getUserCancelRomUpdateVersion();
        return ((userCancelRomUpdateVersion.length() == 0) || !Intrinsics.areEqual(this.lastRomVersion, userCancelRomUpdateVersion)) ? new RomEntry(true, this.lastRomVersion, str, DeviceUtil.isRomSupportAutoUpdate(this.context)) : new RomEntry(false, null, null, false, 15, null);
    }

    private final boolean d() {
        return NetUtil.INSTANCE.networkInfo().isNetworkConnect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AlertDialogFragment alertDialogFragment, View view) {
        alertDialogFragment.dismiss();
    }

    @Override // com.huami.module.homepage.sync.manager.IDeviceRomUpdateManager
    @NotNull
    public RomEntry checkRomUpdate() {
        return (d() && b()) ? c() : new RomEntry(false, null, null, false, 15, null);
    }

    @Override // com.huami.module.homepage.sync.manager.IDeviceRomUpdateManager
    public void showUpdateRomOldDialog(@NotNull FragmentActivity activity) {
        final AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(4);
        alertDialogFragmentNewInstance.setTitle(activity.getString(R.string.watch_rom_old));
        alertDialogFragmentNewInstance.setMessage(activity.getString(R.string.watch_rom_old_tips));
        alertDialogFragmentNewInstance.setCancelable(false);
        alertDialogFragmentNewInstance.setNeutral(activity.getString(R.string.btn_known), new View.OnClickListener() { // from class: s81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceRomUpdateManagerImpl.e(alertDialogFragmentNewInstance, view);
            }
        });
        alertDialogFragmentNewInstance.show(activity.getFragmentManager(), "");
    }

    @Override // com.huami.module.homepage.sync.manager.IDeviceRomUpdateManager
    public void skipRomUpdate() {
        Box.putUserCancelRomUpdateVersion(this.lastRomVersion);
    }

    @Override // com.huami.module.homepage.sync.manager.IDeviceRomUpdateManager
    public void startRomUpdate() {
        Device currentDevice = DeviceManager.getManager(this.context).getCurrentDevice();
        if (currentDevice != null && currentDevice.isConnected() && DeviceSource.isSeriesEverest2(currentDevice)) {
            Transporter.get(this.context, "com.huami.watch.companion").send(CompanionModule.ACTION_OTA);
            return;
        }
        OtaModel otaModel = OtaModel.getInstance(this.context);
        if (otaModel.IsOtaLinkConnect()) {
            otaModel.sendCmd2watch("rom_upgrade_auto");
        }
    }
}
