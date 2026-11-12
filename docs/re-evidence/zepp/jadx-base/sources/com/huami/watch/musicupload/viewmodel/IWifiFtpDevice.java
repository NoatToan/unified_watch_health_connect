package com.huami.watch.musicupload.viewmodel;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0018\u0019J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H'J\b\u0010\n\u001a\u00020\bH'J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H'J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H&J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&¨\u0006\u001a"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice;", "", "", "getAddress", "wifiName", "password", "Lcom/huami/watch/musicupload/viewmodel/TransformMode;", "mode", "", "enableWifi", "disableWifi", "enable", "enableFtp", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceWifiStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setWifiStatusListener", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceFtpStatusListener;", "setFtpStatusListener", "", "getMusicInfoMaxLength", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getDeviceSourceValue", "IDeviceFtpStatusListener", "IDeviceWifiStatusListener", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public interface IWifiFtpDevice {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ boolean enableFtp$default(IWifiFtpDevice iWifiFtpDevice, boolean z, TransformMode transformMode, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableFtp");
            }
            if ((i & 2) != 0) {
                transformMode = TransformMode.Music;
            }
            return iWifiFtpDevice.enableFtp(z, transformMode);
        }

        public static /* synthetic */ boolean enableWifi$default(IWifiFtpDevice iWifiFtpDevice, String str, String str2, TransformMode transformMode, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableWifi");
            }
            if ((i & 4) != 0) {
                transformMode = TransformMode.Music;
            }
            return iWifiFtpDevice.enableWifi(str, str2, transformMode);
        }

        public static int getMusicInfoMaxLength(@NotNull IWifiFtpDevice iWifiFtpDevice) {
            return 31;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceFtpStatusListener;", "", "", "enable", "", "onFtpStatusChanged", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public interface IDeviceFtpStatusListener {
        void onFtpStatusChanged(boolean enable);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceWifiStatusListener;", "", "", "enable", "", "onWifiStatusChanged", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public interface IDeviceWifiStatusListener {
        void onWifiStatusChanged(boolean enable);
    }

    @WorkerThread
    boolean disableWifi();

    @WorkerThread
    boolean enableFtp(boolean enable, @NotNull TransformMode mode);

    @WorkerThread
    boolean enableWifi(@NotNull String wifiName, @NotNull String password, @NotNull TransformMode mode);

    @Nullable
    String getAddress();

    int getDeviceSourceValue(@NotNull Context context);

    int getMusicInfoMaxLength();

    void setFtpStatusListener(@Nullable IDeviceFtpStatusListener listener);

    void setWifiStatusListener(@Nullable IDeviceWifiStatusListener listener);
}
