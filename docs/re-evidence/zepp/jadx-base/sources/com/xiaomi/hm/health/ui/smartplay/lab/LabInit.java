package com.xiaomi.hm.health.ui.smartplay.lab;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.account.HMLoginManager;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.lab.init.InitCallBack;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class LabInit {
    public static boolean SUPPORT_TAG_TIME_OFFSET = false;

    public class a implements InitCallBack {
        public final /* synthetic */ Event2Lab a;

        public a(final Event2Lab val$event2Lab) {
            this.a = val$event2Lab;
        }

        private boolean a(HMDeviceSource deviceSource) {
            return deviceSource == HMDeviceSource.MILI_BONN || deviceSource == HMDeviceSource.MILI_BONN_W || deviceSource == HMDeviceSource.MILI_HAMBURG || deviceSource == HMDeviceSource.MILI_HAMBURG_W;
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public long getBehaviorTagEndTime() {
            return 0L;
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        @Nullable
        public String getBoundDeviceName(@NonNull HMDeviceType type) {
            HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(type);
            if (type == HMDeviceType.WATCH) {
                return HMDeviceUtils.getBoundWatchDeviceDescription();
            }
            return type == HMDeviceType.SHOES ? HMDeviceUtils.getShoesDeviceDescription() : HMDeviceUtils.getDeviceDescription(boundDeviceSource);
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        @NonNull
        public HMDeviceSource getBoundDeviceSource(@NonNull HMDeviceType type) {
            return HMDeviceManager.getInstance().getBoundDeviceSource(type);
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        @Nullable
        public HMBaseDevice getDevice(@NonNull HMDeviceType type) {
            return HMDeviceManager.getInstance().getDevice(type);
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public String getTime(Context context, long startTime, long endTime) {
            return context.getString(R.string.date_time_format_two, TimeUtils.formatDate(context.getString(R.string.date_yMd_pattern_other), new Date(startTime)), TimeUtils.formatTime_s(context, startTime), TimeUtils.formatTime_s(context, endTime));
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public long getUploadOffsetTime() {
            return 0L;
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public String getUploadUrlPackageName() {
            return null;
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public String getUserId() {
            return HMPersonInfo.getInstance().getUserInfo().getUserid();
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public boolean hasBound(@NonNull HMDeviceType type) {
            return HMDeviceManager.getInstance().hasBound(type);
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public boolean hasBoundWatch() {
            return HMDeviceConfig.hasBoundWatch();
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public boolean isBluetoothEnable() {
            return HMDeviceManager.getInstance().isBluetoothEnable();
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public boolean isSupportEarbudSleep() {
            return false;
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public boolean keepNmeaLog() {
            return false;
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public void registerEventListener(boolean register) {
            if (register) {
                this.a.register();
            } else {
                this.a.unregister();
            }
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public boolean showHelpNote() {
            return true;
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public boolean supportHeadsetSleep() {
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.HEADSET);
            if (device == null) {
                return false;
            }
            return device.isConnected();
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public boolean supportNmeaTagging(HMDeviceType type) {
            return ConfigHelperKt.hasFeature(Feature.SUPPORT_GPS, HMDeviceManager.getInstance().getBoundDeviceSource(type)) && GlobalConfig.get().isBuildMidong();
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public boolean supportShoeMars() {
            return GlobalConfig.get().isBuildInner();
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public boolean supportSwimTagging(@NonNull HMDeviceType type) {
            return HMDeviceConfig.isSupportAnalyzeSwimmingData(HMDeviceManager.getInstance().getBoundDeviceSource(type)) && (HMLoginManager.isInMainland() || (HMLoginManager.isUnknown() && Locale.getDefault().getCountry().equals("CN")));
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public boolean supportTagTimeOffset() {
            return LabInit.SUPPORT_TAG_TIME_OFFSET;
        }

        @Override // com.xiaomi.hm.health.lab.init.InitCallBack
        public boolean supportTemperatureTagging() {
            return a(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI));
        }
    }

    public static void init() {
        LabCallbackInit.setInitCallBack(new a(new Event2Lab()));
    }
}
