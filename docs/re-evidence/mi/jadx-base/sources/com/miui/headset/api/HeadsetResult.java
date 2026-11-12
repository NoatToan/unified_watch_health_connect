package com.miui.headset.api;

import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/miui/headset/api/HeadsetResult;", "", "Companion", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface HeadsetResult {
    public static final int AcquiredByOtherHost = 216;
    public static final int ActiveChangedFailed = 2011;
    public static final int ActiveHeadsetChange = 401;
    public static final int ActiveHeadsetLost = 402;
    public static final int Blocking = -2;
    public static final int BluetoothUnEnable = 203;
    public static final int BondBonded = 306;
    public static final int BondFailed = 305;
    public static final int BondNone = 307;
    public static final int Break = -4;
    public static final int Cancel = -3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int ConnectFailed = 2013;
    public static final int Default = -1;
    public static final int DisconnectFailed = 2014;
    public static final int Failed = 201;
    public static final int HeadsetBatteryChanged = 406;
    public static final int HeadsetBondStateChange = 501;
    public static final int HeadsetLeftWorn = 210;
    public static final int HeadsetModeChanged = 407;
    public static final int HeadsetNameChanged = 404;
    public static final int HeadsetNotSingleWorn = 230;
    public static final int HeadsetNotSupportAncMode = 207;
    public static final int HeadsetNotWorn = 209;
    public static final int HeadsetPropertyUpdate = 403;
    public static final int HeadsetRightWorn = 211;
    public static final int HeadsetVolumeChanged = 405;
    public static final int HeadsetWornError = 212;
    public static final int HostNotBound = 215;
    public static final int IpcRemoteException = 213;
    public static final int LocalXiaomiAccountBlank = 218;
    public static final int NeedUpgrade = 204;
    public static final int OpNotSupport = 205;
    public static final int ProfileConnectTimeout = 20201;
    public static final int ProfileDisconnectTimeout = 20211;
    public static final int RemoteCirculateStartTimeout = 20222;
    public static final int RemoteConnectTimeout = 20202;
    public static final int RemoteDisconnectTimeout = 20212;
    public static final int RemoteHostBluetoothUnEnable = 217;
    public static final int RemoteNeedUpgrade = 221;
    public static final int RemoteXiaomiAccountBlank = 219;
    public static final int RequestCirculateStartTimeout = 20223;
    public static final int RequestConnectTimeout = 20203;
    public static final int RequestDisconnectTimeout = 20213;
    public static final int RomNeedUpgrade = 304;
    public static final int RpcRemoteException = 214;
    public static final int SetActiveFailed = 2010;
    public static final int Success = 100;
    public static final int TargetHeadsetManualBond = 308;
    public static final int TargetHeadsetNotBonded = 302;
    public static final int TargetHostIsActiveBySameAddress = 301;
    public static final int TargetHostNotActive = 303;
    public static final int TargetNotMatch = 206;
    public static final int Timeout = 202;
    public static final int TvSoundBoxStyleOn = 310;
    public static final int UnInitFailed = 2012;
    public static final int ValidAncMode = 208;
    public static final int XiaomiAccountNotMatch = 220;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b9\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/miui/headset/api/HeadsetResult$Companion;", "", "()V", "AcquiredByOtherHost", "", "ActiveChangedFailed", "ActiveHeadsetChange", "ActiveHeadsetLost", "Blocking", "BluetoothUnEnable", "BondBonded", "BondFailed", "BondNone", "Break", OrderStatus.CANCEL, "ConnectFailed", "Default", "DisconnectFailed", "Failed", "HeadsetBatteryChanged", "HeadsetBondStateChange", "HeadsetLeftWorn", "HeadsetModeChanged", "HeadsetNameChanged", "HeadsetNotSingleWorn", "HeadsetNotSupportAncMode", "HeadsetNotWorn", "HeadsetPropertyUpdate", "HeadsetRightWorn", "HeadsetVolumeChanged", "HeadsetWornError", "HostNotBound", "IpcRemoteException", "LocalXiaomiAccountBlank", "NeedUpgrade", "OpNotSupport", "ProfileConnectTimeout", "ProfileDisconnectTimeout", "RemoteCirculateStartTimeout", "RemoteConnectTimeout", "RemoteDisconnectTimeout", "RemoteHostBluetoothUnEnable", "RemoteNeedUpgrade", "RemoteXiaomiAccountBlank", "RequestCirculateStartTimeout", "RequestConnectTimeout", "RequestDisconnectTimeout", "RomNeedUpgrade", "RpcRemoteException", "SetActiveFailed", "Success", "TargetHeadsetManualBond", "TargetHeadsetNotBonded", "TargetHostIsActiveBySameAddress", "TargetHostNotActive", "TargetNotMatch", "Timeout", "TvSoundBoxStyleOn", "UnInitFailed", "ValidAncMode", "XiaomiAccountNotMatch", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int AcquiredByOtherHost = 216;
        public static final int ActiveChangedFailed = 2011;
        public static final int ActiveHeadsetChange = 401;
        public static final int ActiveHeadsetLost = 402;
        public static final int Blocking = -2;
        public static final int BluetoothUnEnable = 203;
        public static final int BondBonded = 306;
        public static final int BondFailed = 305;
        public static final int BondNone = 307;
        public static final int Break = -4;
        public static final int Cancel = -3;
        public static final int ConnectFailed = 2013;
        public static final int Default = -1;
        public static final int DisconnectFailed = 2014;
        public static final int Failed = 201;
        public static final int HeadsetBatteryChanged = 406;
        public static final int HeadsetBondStateChange = 501;
        public static final int HeadsetLeftWorn = 210;
        public static final int HeadsetModeChanged = 407;
        public static final int HeadsetNameChanged = 404;
        public static final int HeadsetNotSingleWorn = 230;
        public static final int HeadsetNotSupportAncMode = 207;
        public static final int HeadsetNotWorn = 209;
        public static final int HeadsetPropertyUpdate = 403;
        public static final int HeadsetRightWorn = 211;
        public static final int HeadsetVolumeChanged = 405;
        public static final int HeadsetWornError = 212;
        public static final int HostNotBound = 215;
        public static final int IpcRemoteException = 213;
        public static final int LocalXiaomiAccountBlank = 218;
        public static final int NeedUpgrade = 204;
        public static final int OpNotSupport = 205;
        public static final int ProfileConnectTimeout = 20201;
        public static final int ProfileDisconnectTimeout = 20211;
        public static final int RemoteCirculateStartTimeout = 20222;
        public static final int RemoteConnectTimeout = 20202;
        public static final int RemoteDisconnectTimeout = 20212;
        public static final int RemoteHostBluetoothUnEnable = 217;
        public static final int RemoteNeedUpgrade = 221;
        public static final int RemoteXiaomiAccountBlank = 219;
        public static final int RequestCirculateStartTimeout = 20223;
        public static final int RequestConnectTimeout = 20203;
        public static final int RequestDisconnectTimeout = 20213;
        public static final int RomNeedUpgrade = 304;
        public static final int RpcRemoteException = 214;
        public static final int SetActiveFailed = 2010;
        public static final int Success = 100;
        public static final int TargetHeadsetManualBond = 308;
        public static final int TargetHeadsetNotBonded = 302;
        public static final int TargetHostIsActiveBySameAddress = 301;
        public static final int TargetHostNotActive = 303;
        public static final int TargetNotMatch = 206;
        public static final int Timeout = 202;
        public static final int TvSoundBoxStyleOn = 310;
        public static final int UnInitFailed = 2012;
        public static final int ValidAncMode = 208;
        public static final int XiaomiAccountNotMatch = 220;

        private Companion() {
        }
    }
}
