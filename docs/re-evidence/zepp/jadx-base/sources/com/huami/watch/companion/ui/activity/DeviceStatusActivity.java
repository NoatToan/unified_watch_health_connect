package com.huami.watch.companion.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.app.AppManager;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.device.config.DeviceFeature;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.companion.ui.activity.DeviceStatusActivity;
import com.huami.watch.companion.ui.adapter.AppSettingAdapter;
import com.huami.watch.companion.util.AlexaUtils;
import com.huami.watch.companion.watchface.WatchFace;
import com.huami.watch.companion.watchface.WatchFaceManager;
import com.huami.watch.companion.watchface.utils.WatchFaceHelper;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceStatusActivity extends BaseDeviceStatusActivity {
    private static final String g = "DeviceStatusActivity";
    private static final String h = "ShowAlexaTip";
    private boolean f = false;

    public static Intent intentWithAlexaTipDialog(Context context) {
        Intent intent = new Intent(context, (Class<?>) DeviceStatusActivity.class);
        intent.putExtra(h, true);
        return intent;
    }

    private void k0() {
        boolean booleanExtra = getIntent().getBooleanExtra(h, false);
        Log.d(g, "showAlexaTipDialog = " + booleanExtra, new Object[0]);
        if (booleanExtra) {
            Log.d(g, "AlexaUtils.needShowAlexaAuth(this) = " + AlexaUtils.needShowAlexaAuth(this), new Object[0]);
            if (AlexaUtils.needShowAlexaAuth(this)) {
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.post(new Runnable() { // from class: q91
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.m0();
                        }
                    });
                } else {
                    AlexaUtils.showAlexaAuthDialog(this, getFragmentManager());
                }
            }
        }
    }

    private void l0() {
        if (this.isConnect && DeviceFeature.isSupportCloudWatchFaceList(this.mDevice)) {
            if (DeviceManager.getManager(this).isCurrentDeviceBLE()) {
                WatchFaceHelper.getRomSelectWatchFaceId(this.mDevice.getCpuId());
                return;
            }
            Transporter transporter = this.c;
            if (transporter == null) {
                return;
            }
            transporter.send(CompanionModule.ACTION_QUERY_CURRENT_WATCHFACE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0() {
        AlexaUtils.showAlexaAuthDialog(this, getFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n0(WatchFace watchFace) {
        return "watchFace.previewThumb bitmap is NULL!!!" + watchFace.previewThumb.length;
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void O(TransportDataItem transportDataItem) {
        String action = transportDataItem.getAction();
        String string = transportDataItem.getData().getString("data");
        if (CompanionModule.ACTION_REPORT_CURRENT_WATCHFACE.equals(action)) {
            int i = 0;
            Log.d(g, "report_current_watch_face : onReceiveData : " + string, new Object[0]);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                i = Integer.parseInt(string);
            } catch (NumberFormatException unused) {
                Log.e(g, "current watchFace id  is  not Integer!!! ", new Object[0]);
            }
            WatchFaceHelper.saveSelectWatchFace(this.mDevice.getCpuId(), i);
        }
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void onConnected(String str) {
        super.onConnected(str);
        if (!this.f && this.mAppMap != null && !this.mDevice.isMcuMode() && DeviceUtil.isRomSupportFTP(this.mDevice)) {
            this.f = true;
            this.mAppList.add(this.mAppMap.get(AppManager.FILE_TRANSPORT_PACKAGE));
            AppSettingAdapter appSettingAdapter = this.mAdapter;
            if (appSettingAdapter != null) {
                appSettingAdapter.notifyDataSetChanged();
            }
        }
        l0();
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void setWatchFacePreviewImage(boolean z) {
        byte[] bArr;
        if (DeviceFeature.isSupportCloudWatchFaceList(this.mDevice)) {
            getWatchFaceImage();
            return;
        }
        final WatchFace defaultWatchFace = z ? WatchFaceManager.getManager().getDefaultWatchFace(this, true, this.mDevice.getCpuId()) : WatchFaceManager.getManager().getSelectedWatchFace(this, true, this.mDevice.getCpuId());
        if (defaultWatchFace == null || (bArr = defaultWatchFace.previewThumb) == null || bArr.length == 0) {
            return;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (bitmapDecodeByteArray == null) {
            HMLog.info(g, new Function0() { // from class: r91
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return DeviceStatusActivity.n0(defaultWatchFace);
                }
            });
            return;
        }
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(getResources(), bitmapDecodeByteArray);
        roundedBitmapDrawableCreate.setCornerRadius(bitmapDecodeByteArray.getWidth() / 2.0f);
        this.mWatchFaceView.setImageDrawable(roundedBitmapDrawableCreate);
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void u() {
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public int w() {
        return R.layout.activity_device_status;
    }

    @Override // com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity
    public void z() {
        k0();
        this.mAppMap = AppManager.getAppSettingList(this);
        this.mAppList.clear();
        if (!this.mDevice.isMcuMode()) {
            this.mAppList.add(this.mAppMap.get("com.huami.watch.newsport"));
        }
        this.mAppList.add(this.mAppMap.get(AppManager.WEATHER_PACKAGE));
        if (!Config.isDeviceOversea(this.mDevice) && Config.isUserCN(this) && !this.mDevice.isMcuMode() && !GlobalConfig.get().isBuildAmazfit()) {
            this.mAppList.add(this.mAppMap.get(AppManager.XMLY_PACKAGE));
        }
        if (DeviceUtil.isSupportAlarm(this.mDevice) && !this.mDevice.isMcuMode()) {
            this.mAppList.add(this.mAppMap.get(AppManager.DESKCLOCK_PACKAGE));
        }
        if (DeviceUtil.isRomSupportFTP(this.mDevice) && !this.mDevice.isMcuMode()) {
            this.f = true;
            this.mAppList.add(this.mAppMap.get(AppManager.FILE_TRANSPORT_PACKAGE));
        }
        if (!GlobalConfig.get().isBuildAmazfit() && DeviceFeature.isSupportNFC(this.mDevice)) {
            this.mAppList.add(this.mAppMap.get(AppManager.NFC_PACKAGE));
        }
        if (DeviceUtil.isSupportLvMi(this.mDevice) && !GlobalConfig.get().isBuildMidong() && !this.mDevice.isMcuMode()) {
            this.mAppList.add(this.mAppMap.get(AppManager.LVMI_PACKAGE));
        }
        if (DeviceUtil.isSupportFindWatch(this.mDevice)) {
            this.mAppList.add(this.mAppMap.get(AppManager.FIND_WATCH_PACKAGE));
        }
        if (DeviceUtil.isSupportHeartRateSetting(this.mDevice)) {
            this.mAppList.add(this.mAppMap.get(AppManager.HEALTH_HEART_PACKAGE));
        }
        if (DeviceUtil.isSupportSettingHealth(this.mDevice)) {
            this.mAppList.add(this.mAppMap.get(AppManager.HEALTH_PACKAGE_NEW));
        }
        l0();
    }
}
