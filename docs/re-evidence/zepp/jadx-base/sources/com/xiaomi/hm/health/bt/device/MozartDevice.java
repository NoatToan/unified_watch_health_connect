package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.transport.connection.OnAirohaConnStateListener;
import com.airoha.liblogger.AirohaLogger;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.core.BluetoothA2dpService;
import com.huami.bluetooth.core.BluetoothHeadsetService;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.device.OtaUpgradeState;
import com.huami.bluetooth.device.SyncGpsDataLock;
import com.huami.bluetooth.device.function.log.DoSwitchRoleAction;
import com.huami.bluetooth.device.function.log.HeadsetLogTask;
import com.huami.bluetooth.device.function.log.SwitchRoleCallback;
import com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback;
import com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeResult;
import com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeTask;
import com.huami.bluetooth.profile.base.ClassicDeviceInfoController;
import com.huami.bluetooth.profile.base.CurrentTimeControllerImpl;
import com.huami.bluetooth.profile.base.UserInfoControllerImpl;
import com.huami.bluetooth.profile.data.DataCallback;
import com.huami.bluetooth.profile.data.DataParser;
import com.huami.bluetooth.profile.data.SyncDataCallback;
import com.huami.bluetooth.profile.ecf.EcfControllerImpl;
import com.huami.bluetooth.profile.ecf.data.AppState;
import com.huami.bluetooth.profile.ecf.data.Equalizer;
import com.huami.bluetooth.profile.ecf.data.HeadsetKnockSetting;
import com.huami.bluetooth.profile.ecf.data.HeadsetSideListenSetting;
import com.huami.bluetooth.profile.ecf.data.HeadsetSportSetting;
import com.huami.bluetooth.profile.ecf.data.HrReminderInfo;
import com.huami.bluetooth.profile.ecf.data.MultiDeviceState;
import com.huami.bluetooth.profile.ecf.data.MultiDeviceStateKt;
import com.huami.bluetooth.profile.ecf.data.NoiseControl;
import com.huami.bluetooth.profile.ecf.data.Sn;
import com.huami.bluetooth.profile.gdsp.DeviceStatisticParser;
import com.huami.bluetooth.profile.gdsp.GdspDataFetcher;
import com.huami.bluetooth.profile.gdsp.GdspOption;
import com.huami.bluetooth.profile.gdsp.HeadsetHealthInfoParser;
import com.huami.bluetooth.profile.gdsp.HearingHealthDayData;
import com.huami.bluetooth.profile.generic.ClassicGenericNotifyCharacteristic;
import com.huami.bluetooth.profile.generic.GenericControllerImpl;
import com.huami.bluetooth.profile.step.RealtimeStepController;
import com.huami.bluetooth.profile.step.RealtimeStepControllerImpl;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.passport.Configs;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.mediac.Command;
import com.loc.z;
import com.xiaomi.hm.health.bt.BluetoothContext;
import com.xiaomi.hm.health.bt.classic.HMSyncGpsDataTask;
import com.xiaomi.hm.health.bt.classic.ITransport;
import com.xiaomi.hm.health.bt.classic.Protocol;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.MozartDevice;
import com.xiaomi.hm.health.bt.device.mozart.MozartEqualizerController;
import com.xiaomi.hm.health.bt.device.mozart.MozartFirmwareUpdater;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController;
import com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import com.xiaomi.market.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ú\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u0090\u00022\u00020\u00012\u00020\u0002:\u0004\u0091\u0002\u0092\u0002B\u0013\u0012\b\u0010w\u001a\u0004\u0018\u00010v¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001e\u001a\u00020\u0003H\u0014J\n\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020\bH\u0016J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020'H\u0017J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020*H\u0016J\n\u0010-\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\bH\u0016J\u0010\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020,H\u0016J\u000e\u00101\u001a\u00020\b2\u0006\u0010/\u001a\u00020,J$\u00107\u001a\u00020\u00032\u0006\u00103\u001a\u0002022\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060504H\u0016J\u001e\u0010<\u001a\u00020\u00032\u0006\u00109\u001a\u0002082\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030:H\u0016J\b\u0010=\u001a\u00020\u0003H\u0016J\b\u0010>\u001a\u00020\bH\u0016J\n\u0010@\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020?H\u0016J\n\u0010D\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010E\u001a\u00020\b2\u0006\u0010A\u001a\u00020CH\u0016J\n\u0010G\u001a\u0004\u0018\u00010FH\u0016J\u0010\u0010H\u001a\u00020\b2\u0006\u0010A\u001a\u00020FH\u0016J\u0010\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u00020IH\u0016J\n\u0010L\u001a\u0004\u0018\u00010IH\u0016J\u0010\u0010N\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0016J\u0010\u0010O\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0016J\u0011\u0010P\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0016J\u0011\u0010S\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bS\u0010QJ\u0010\u0010T\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0016J\u0011\u0010U\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bU\u0010QJ\u0010\u0010V\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0016J\u0011\u0010W\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bW\u0010QJ\u0010\u0010Z\u001a\u00020\b2\u0006\u0010Y\u001a\u00020XH\u0016J\u0010\u0010\\\u001a\u00020\b2\u0006\u0010[\u001a\u00020\bH\u0016J\u0011\u0010]\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b]\u0010QJ\u0010\u0010^\u001a\u00020\b2\u0006\u0010[\u001a\u00020\bH\u0016J\u0011\u0010_\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b_\u0010QJ\u0010\u0010`\u001a\u00020\b2\u0006\u0010[\u001a\u00020\bH\u0016J\u0011\u0010a\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\ba\u0010QJ\u0010\u0010b\u001a\u00020\b2\u0006\u0010[\u001a\u00020\bH\u0016J\u0011\u0010c\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bc\u0010QJ\u0010\u0010f\u001a\u00020\b2\u0006\u0010e\u001a\u00020dH\u0016J\n\u0010g\u001a\u0004\u0018\u00010dH\u0016J\u0010\u0010h\u001a\u00020\b2\u0006\u0010[\u001a\u00020\bH\u0016J\u0011\u0010j\u001a\u0004\u0018\u00010iH\u0016¢\u0006\u0004\bj\u0010kJ\u0010\u0010l\u001a\u00020\b2\u0006\u0010[\u001a\u00020\bH\u0016J\b\u0010m\u001a\u00020\u0003H\u0016J\n\u0010o\u001a\u0004\u0018\u00010nH\u0016J\u0012\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010q\u001a\u00020pH\u0016J\u0010\u0010r\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0016J\u0010\u0010t\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020sH\u0016J\b\u0010u\u001a\u00020\u0003H\u0016J \u0010{\u001a\u00020\u00032\u0006\u0010w\u001a\u00020v2\u0006\u0010\u0015\u001a\u00020x2\u0006\u0010z\u001a\u00020yH\u0014J\b\u0010|\u001a\u00020\bH\u0016J\u0010\u0010\u007f\u001a\u00020\u00032\u0006\u0010~\u001a\u00020}H\u0016J\f\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J\u001b\u0010\u0083\u0001\u001a\u00020\u00032\u0010\u0010\u0017\u001a\f\u0012\u0005\u0012\u00030\u0080\u0001\u0018\u00010\u0082\u0001H\u0016J\f\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0016J\u0013\u0010\u0088\u0001\u001a\u00020\u00032\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0016J\u0013\u0010\u0089\u0001\u001a\u00020\u00032\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0016J\u0019\u0010\u008c\u0001\u001a\u00020\u00032\u000e\u0010\u0017\u001a\n\u0012\u0005\u0012\u00030\u008b\u00010\u008a\u0001H\u0016J'\u0010\u008e\u0001\u001a\u00020\u00032\u0006\u00103\u001a\u0002022\u0014\u0010\u0017\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008d\u0001050\u008a\u0001H\u0016J@\u0010\u0093\u0001\u001a\u00020\u0003\"\u0005\b\u0000\u0010\u008f\u00012\u0006\u00103\u001a\u0002022\u0007\u0010\u0015\u001a\u00030\u0090\u00012\u000e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0091\u00012\r\u0010\u0017\u001a\t\u0012\u0004\u0012\u00028\u00000\u008a\u0001H\u0016J\u000b\u0010\u0094\u0001\u001a\u0004\u0018\u00010XH\u0016J\t\u0010\u0095\u0001\u001a\u00020\u0014H\u0016J\u000b\u0010\u0096\u0001\u001a\u0004\u0018\u00010XH\u0016J\t\u0010\u0097\u0001\u001a\u00020\u0014H\u0016J\n\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0016J\u0010\u0010\u009b\u0001\u001a\t\u0012\u0005\u0012\u00030\u009a\u000105H\u0016J\t\u0010\u009c\u0001\u001a\u00020xH\u0016J\t\u0010\u009d\u0001\u001a\u00020\bH\u0014J\u0015\u0010 \u0001\u001a\u00020\b2\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u0001H\u0014J\u0012\u0010¢\u0001\u001a\u00020\u00032\u0007\u0010\u0017\u001a\u00030¡\u0001H\u0016J8\u0010¨\u0001\u001a\u00020\u00032\u0007\u0010£\u0001\u001a\u00020\b2\b\u0010¥\u0001\u001a\u00030¤\u00012\n\u0010¦\u0001\u001a\u0005\u0018\u00010¤\u00012\u000e\u0010\u0017\u001a\n\u0012\u0005\u0012\u00030¤\u00010§\u0001H\u0016J\t\u0010©\u0001\u001a\u00020\u0003H\u0016J\t\u0010ª\u0001\u001a\u00020\u0003H\u0016J\t\u0010«\u0001\u001a\u00020\u0003H\u0016J\t\u0010¬\u0001\u001a\u00020\bH\u0016J\u0013\u0010¯\u0001\u001a\u00020\u00032\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0016J\u0013\u0010°\u0001\u001a\u00020\u00032\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0016R\u001a\u0010w\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R#\u0010µ\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010n\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001c\u0010¸\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R!\u0010»\u0001\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010¹\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010´\u0001R\u001b\u0010¾\u0001\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001c\u0010Á\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u001c\u0010Å\u0001\u001a\u0005\u0018\u00010Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R#\u0010Ê\u0001\u001a\u00030Æ\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÃ\u0001\u0010É\u0001R#\u0010Í\u0001\u001a\u00030Æ\u00018D@\u0004X\u0084\u0084\u0002¢\u0006\u0010\n\u0006\bË\u0001\u0010È\u0001\u001a\u0006\bÌ\u0001\u0010É\u0001R#\u0010Ñ\u0001\u001a\u00030Î\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÏ\u0001\u0010È\u0001\u001a\u0006\b¿\u0001\u0010Ð\u0001R#\u0010Ö\u0001\u001a\u00030Ò\u00018D@\u0004X\u0084\u0084\u0002¢\u0006\u0010\n\u0006\bÓ\u0001\u0010È\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R#\u0010Ú\u0001\u001a\u00030×\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bØ\u0001\u0010È\u0001\u001a\u0006\bÏ\u0001\u0010Ù\u0001R#\u0010Ü\u0001\u001a\u00030×\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÛ\u0001\u0010È\u0001\u001a\u0006\bÇ\u0001\u0010Ù\u0001R#\u0010à\u0001\u001a\u00030Ý\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÞ\u0001\u0010È\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R\"\u0010ã\u0001\u001a\u00030á\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0004\u0010È\u0001\u001a\u0006\bÛ\u0001\u0010â\u0001R#\u0010ç\u0001\u001a\u00030ä\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bå\u0001\u0010È\u0001\u001a\u0006\bÓ\u0001\u0010æ\u0001R\"\u0010ê\u0001\u001a\u00030è\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0007\u0010È\u0001\u001a\u0006\bØ\u0001\u0010é\u0001R#\u0010í\u0001\u001a\f\u0012\u0005\u0012\u00030\u0080\u0001\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u0019\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010î\u0001R\u0018\u0010ð\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\t\u0010ï\u0001R\u001c\u0010ò\u0001\u001a\u0005\u0018\u00010Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010Ä\u0001R\u0018\u0010ó\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\n\u0010ï\u0001R(\u0010ø\u0001\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\b\u000b\u0010ï\u0001\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R\u0019\u0010û\u0001\u001a\u00030ù\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010ú\u0001R#\u0010ÿ\u0001\u001a\u00030ü\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bý\u0001\u0010È\u0001\u001a\u0006\b¼\u0001\u0010þ\u0001R \u0010\u0083\u0002\u001a\t\u0012\u0004\u0012\u00020\f0\u0080\u00028\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R!\u0010\u0085\u0002\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010\u0080\u00028\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0082\u0002R\u001c\u0010\u0089\u0002\u001a\u0005\u0018\u00010\u0086\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0088\u0002R#\u0010\u008d\u0002\u001a\u00030\u008a\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0002\u0010È\u0001\u001a\u0006\bË\u0001\u0010\u008c\u0002¨\u0006\u0093\u0002"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/MozartDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseClassicDevice;", "Lcom/huami/bluetooth/device/MozartDevice;", "", "x", "", "data", "z", "", "C", "E", "F", "Lcom/xiaomi/hm/health/bt/ife/IHMConnectionCallback;", "callbeck", "B", "G", "forceDirectly", "create", "isConnected", "destroy", "", "type", "Lcom/xiaomi/hm/health/bt/profile/grsp/IHMSensorDataCallback;", "callback", "startSensorData", "stopSensorData", Constants.JSON_FEATURE, "hasHeadsetFeature", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "fetchFeature", "subclassOwnOperation", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "getDeviceInfoSync", "Lcom/huami/bluetooth/profile/ecf/data/AppState;", "state", "syncAppState", "isUpgrading", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "firmwareInfo", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "updateFwUpgrade", "firmware", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeCallback;", "upgradeFirmware", "Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "getEqualizer", "force", "equalizer", "setEqualizer", "applyEqualizer", "Ljava/util/Calendar;", "calendar", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "startSyncGpsData", "", "lockTime", "Lkotlin/Function0;", "runnable", "lockGpsSync", "unLockGpsSync", "isLockGpsSync", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetKnockSetting;", "getHeadsetKnockSetting", "setting", "setHeadsetKnock", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSideListenSetting;", "getHeadsetSideListenSetting", "setHeadsetSideListen", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSportSetting;", "getHeadsetSportSetting", "setHeadsetSport", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;", "mode", "setNoiseControl", "getNoiseControl", "isOpen", "setReportHeadsetInfoSwitch", "setEnvironmentSound", "getEnvironmentSound", "()Ljava/lang/Boolean;", "setRunningRecognition", "getRunningRecognition", "setVoiceControl", "getVoiceControl", "setRelaxationPrompt", "getRelaxationPrompt", "", "deviceName", "modifyDeviceName", "enable", "setWearInduction", "getWearInduction", "setHearingHealth", "getHearingHealth", "setCervicalProtection", "getCervicalProtection", "setPercussionBroadcast", "getPercussionBroadcast", "Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;", "hrReminderInfo", "setHrReminder", "getHrReminder", "doPostureCalibration", "", "getHeadNeckAngle", "()Ljava/lang/Short;", "enableCervicalProtectionSound", "connectServiceOfHeadsetAndA2DP", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "getBatteryInfo", "Lcom/huami/bluetooth/device/HeadsetDevice$Part;", "part", "setDateTimeSync", "Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController$IHeartRateCallback;", "startRealtimeMeasureHr", "stopRealtimeMeasureHr", "Landroid/bluetooth/BluetoothDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "Lcom/xiaomi/hm/health/bt/device/Status;", "status", "onConnectionStatusChangedInternal", Configs.Params.RESET, "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "event", "onLFEvent", "Lcom/xiaomi/hm/health/bt/profile/base/RealtimeStep;", "getRealtimeStep", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "setRealtimeStepCallback", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "getHeadsetDeviceState", "Lcom/huami/bluetooth/device/HeadsetDevice$StateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerStateListener", "unregisterStateListener", "Lcom/huami/bluetooth/profile/data/SyncDataCallback;", "", "getStatisticInfo", "Lcom/huami/bluetooth/profile/gdsp/HearingHealthDayData;", "getHeadsetHealthInfo", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/bt/profile/gdsp/HMGDSPType;", "Lcom/huami/bluetooth/profile/data/DataParser;", "parser", "syncData", "getDeviceVersion", "getDeviceVersionCode", "getSecondEarVersion", "getSecondEarVersionCode", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host;", "versionHost", "Lcom/huami/bluetooth/profile/ecf/data/Sn;", "getSnList", "getDeviceType", "initAuth", "Lcom/xiaomi/hm/health/bt/profile/mili/model/UserInfo;", "userInfo", "setUserInfoSync", "Lcom/huami/bluetooth/device/function/log/SwitchRoleCallback;", "doSwitchRole", "isOutputSingleFile", "Ljava/io/File;", "file", "anotherFile", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "syncHeadsetLog", "terminateHeadsetLog", "initDeviceInfo", "deInitDeviceInfo", "isOtaEnable", "Lcom/huami/bluetooth/device/OtaUpgradeState;", "callBack", "registerOtaStateCallback", "unRegisterOtaStateCallback", z.j, "Landroid/bluetooth/BluetoothDevice;", hl.k, "Ljava/util/List;", "batteryInfoList", "l", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "headsetState", "", "m", "deviceStateListeners", GoogleApiAvailabilityLight.b, "Ljava/lang/String;", "secondEarVer", "o", "Lcom/xiaomi/hm/health/bt/profile/base/RealtimeStep;", "step", "Ljava/util/concurrent/CountDownLatch;", com.google.android.exoplayer2.text.ttml.b.r, "Ljava/util/concurrent/CountDownLatch;", "deviceInfoLatch", "Lcom/huami/bluetooth/profile/base/ClassicDeviceInfoController;", DTransferConstants.SEARCH_KEY, "Lkotlin/Lazy;", "()Lcom/huami/bluetooth/profile/base/ClassicDeviceInfoController;", "deviceInfoController", "r", "getDeviceInfoNewController", "deviceInfoNewController", "Lcom/huami/bluetooth/profile/base/CurrentTimeControllerImpl;", SOAP.XMLNS, "()Lcom/huami/bluetooth/profile/base/CurrentTimeControllerImpl;", "currentTimeController", "Lcom/huami/bluetooth/profile/ecf/EcfControllerImpl;", "t", "getEcfController", "()Lcom/huami/bluetooth/profile/ecf/EcfControllerImpl;", "ecfController", "Lcom/huami/bluetooth/profile/generic/GenericControllerImpl;", "u", "()Lcom/huami/bluetooth/profile/generic/GenericControllerImpl;", "genericController", "v", "dfGenericController", "Lcom/huami/bluetooth/profile/base/UserInfoControllerImpl;", "w", "()Lcom/huami/bluetooth/profile/base/UserInfoControllerImpl;", "userInfoController", "Lcom/xiaomi/hm/health/bt/profile/grsp/HMProSensorDataController;", "()Lcom/xiaomi/hm/health/bt/profile/grsp/HMProSensorDataController;", "sensorSyncController", "Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController;", "y", "()Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController;", "hrController", "Lcom/huami/bluetooth/profile/step/RealtimeStepController;", "()Lcom/huami/bluetooth/profile/step/RealtimeStepController;", "realtimeStepController", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "realtimeStepCallback", "Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "Z", "staticSyncSuccess", LogUtil.D, "staticLatch", "upgrading", "getDeviceInfoReady", "()Z", "setDeviceInfoReady", "(Z)V", "deviceInfoReady", "Lcom/huami/bluetooth/device/SyncGpsDataLock;", "Lcom/huami/bluetooth/device/SyncGpsDataLock;", "syncGpsDataLock", "Lcom/xiaomi/hm/health/bt/device/MozartDevice$AirohaConnection;", "H", "()Lcom/xiaomi/hm/health/bt/device/MozartDevice$AirohaConnection;", "airohaConnection", "Ljava/util/concurrent/CopyOnWriteArrayList;", LogUtil.I, "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConnectionStatusChangeInternalList", "J", "airohaOtaStatusList", "Lcom/huami/bluetooth/device/function/log/HeadsetLogTask;", "K", "Lcom/huami/bluetooth/device/function/log/HeadsetLogTask;", "headsetLogTask", "Lcom/xiaomi/hm/health/bt/device/mozart/MozartEqualizerController;", "L", "()Lcom/xiaomi/hm/health/bt/device/mozart/MozartEqualizerController;", "equalizerController", "<init>", "(Landroid/bluetooth/BluetoothDevice;)V", "M", AirohaConnection.i, "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class MozartDevice extends HMBaseClassicDevice implements com.huami.bluetooth.device.MozartDevice {

    @Deprecated
    public static final long DEVICE_INFO_WAIT = 8000;

    @NotNull
    private static final a M = new a(null);

    @Deprecated
    private static boolean N = false;

    @Deprecated
    public static final long RETRY_CONNECT_AIROHA = 5000;

    @Deprecated
    public static final long SYNC_STATIC_TIMEOUT = 10000;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private HMCallback<RealtimeStep> realtimeStepCallback;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    private Equalizer equalizer;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean staticSyncSuccess;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private CountDownLatch staticLatch;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private volatile boolean upgrading;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private volatile boolean deviceInfoReady;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final SyncGpsDataLock syncGpsDataLock;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final Lazy airohaConnection;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<IHMConnectionCallback> onConnectionStatusChangeInternalList;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<OtaUpgradeState> airohaOtaStatusList;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    private HeadsetLogTask headsetLogTask;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final Lazy equalizerController;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final BluetoothDevice device;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private List<BatteryInfo> batteryInfoList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private HeadsetDevice.HeadsetDeviceState headsetState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final List<HeadsetDevice.StateListener> deviceStateListeners;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private String secondEarVer;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private RealtimeStep step;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private CountDownLatch deviceInfoLatch;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceInfoController;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceInfoNewController;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Lazy currentTimeController;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Lazy ecfController;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Lazy genericController;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final Lazy dfGenericController;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoController;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy sensorSyncController;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrController;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy realtimeStepController;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001'\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0002\t\u0010B+\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR%\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u0019\u0010#\u001a\u00020\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/bt/device/MozartDevice$AirohaConnection;", "Ljava/lang/Thread;", "", "m", hl.k, "l", GoogleApiAvailabilityLight.a, "e", "Landroid/bluetooth/BluetoothDevice;", "a", "Landroid/bluetooth/BluetoothDevice;", "h", "()Landroid/bluetooth/BluetoothDevice;", "device", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "g", "()Lkotlin/jvm/functions/Function1;", "connectionCallback", "c", "Z", z.j, "()Z", GoogleApiAvailabilityLight.b, "(Z)V", "isConnected", "i", "o", "stopConnect", "Lcom/airoha/android/lib/transport/AirohaLink;", "Lcom/airoha/android/lib/transport/AirohaLink;", "f", "()Lcom/airoha/android/lib/transport/AirohaLink;", "airohaLink", "Lcom/xiaomi/hm/health/bt/device/MozartDevice$AirohaConnection$b;", "Lcom/xiaomi/hm/health/bt/device/MozartDevice$AirohaConnection$b;", "connectThread", "com/xiaomi/hm/health/bt/device/MozartDevice$AirohaConnection$connStateListener$1", "Lcom/xiaomi/hm/health/bt/device/MozartDevice$AirohaConnection$connStateListener$1;", "connStateListener", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lkotlin/jvm/functions/Function1;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class AirohaConnection extends Thread {

        @NotNull
        private static final a h = new a(null);

        @Deprecated
        @NotNull
        public static final String i = "AirohaConnection";

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final BluetoothDevice device;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Function1<Boolean, Unit> connectionCallback;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private volatile boolean isConnected;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private volatile boolean stopConnect;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final AirohaLink airohaLink;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private b connectThread;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        private final MozartDevice$AirohaConnection$connStateListener$1 connStateListener;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/bt/device/MozartDevice$AirohaConnection$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"com/xiaomi/hm/health/bt/device/MozartDevice$AirohaConnection$b", "Ljava/lang/Thread;", "", "run", com.twitter.sdk.android.tweetcomposer.g.g, "Lcom/airoha/android/lib/transport/AirohaLink;", "a", "Lcom/airoha/android/lib/transport/AirohaLink;", "airohaLink", "", "b", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "c", "Z", Command.STOP, "<init>", "(Lcom/airoha/android/lib/transport/AirohaLink;Ljava/lang/String;)V", GoogleApiAvailabilityLight.a, "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class b extends Thread {

            @NotNull
            private static final a d = new a(null);

            @Deprecated
            @NotNull
            public static final String e = "ConnectThread";

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final AirohaLink airohaLink;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private final String address;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private boolean stop;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/bt/device/MozartDevice$AirohaConnection$b$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
            public static final class a {
                private a() {
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public b(@NotNull AirohaLink airohaLink, @NotNull String str) {
                super("AirohaConnection - ConnectThread");
                this.airohaLink = airohaLink;
                this.address = str;
            }

            public final void cancel() {
                Debug.fi(e, "airohaLink disconnect");
                this.stop = true;
                this.airohaLink.disconnect();
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (!this.stop) {
                    Debug.fi(e, "airohaLink connect");
                    if (this.airohaLink.connect(this.address, UUID.fromString(AirohaLink.UUID_AIROHA_SPP_STR))) {
                        return;
                    } else {
                        SystemClock.sleep(5000L);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.xiaomi.hm.health.bt.device.MozartDevice$AirohaConnection$connStateListener$1] */
        public AirohaConnection(@NotNull Context context, @NotNull BluetoothDevice bluetoothDevice, @NotNull Function1<? super Boolean, Unit> function1) {
            super("AirohaConnectThread");
            this.device = bluetoothDevice;
            this.connectionCallback = function1;
            this.stopConnect = true;
            this.airohaLink = new AirohaLink(context);
            this.connStateListener = new OnAirohaConnStateListener() { // from class: com.xiaomi.hm.health.bt.device.MozartDevice$AirohaConnection$connStateListener$1
                @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
                public void OnConnected(@Nullable String type) {
                    Debug.fi(MozartDevice.AirohaConnection.i, "OnConnected");
                    this.a.k();
                }

                @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
                public void OnConnecting() {
                    Debug.fi(MozartDevice.AirohaConnection.i, "OnConnecting");
                }

                @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
                public void OnConnectionTimeout() {
                    Debug.fi(MozartDevice.AirohaConnection.i, "OnConnectionTimeout");
                    this.a.l();
                    if (this.a.getStopConnect()) {
                        return;
                    }
                    SystemClock.sleep(5000L);
                    this.a.m();
                }

                @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
                public void OnDisConnecting() {
                    Debug.fi(MozartDevice.AirohaConnection.i, "OnDisConnecting");
                }

                @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
                public void OnDisconnected() {
                    Debug.fi(MozartDevice.AirohaConnection.i, "OnDisconnected");
                    this.a.l();
                }

                @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
                public void OnUnexpectedDisconnected() {
                    Debug.fi(MozartDevice.AirohaConnection.i, "OnUnexpectedDisconnected");
                    this.a.l();
                    if (this.a.getStopConnect()) {
                        return;
                    }
                    SystemClock.sleep(5000L);
                    this.a.m();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void k() {
            this.isConnected = true;
            this.connectionCallback.invoke(Boolean.TRUE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void l() {
            this.isConnected = false;
            this.connectionCallback.invoke(Boolean.FALSE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m() {
            Debug.fi(i, "reConnect");
            if (this.stopConnect) {
                return;
            }
            d();
        }

        public final void d() {
            Debug.fi(i, WifiSetActivity.KEY_CONNECT);
            synchronized (Boolean.valueOf(this.isConnected)) {
                b bVar = this.connectThread;
                if (bVar != null) {
                    bVar.cancel();
                }
                getAirohaLink().registerOnConnStateListener(getDevice().getAddress(), this.connStateListener);
                b bVar2 = new b(getAirohaLink(), getDevice().getAddress());
                bVar2.start();
                Unit unit = Unit.INSTANCE;
                this.connectThread = bVar2;
                o(false);
            }
        }

        public final void e() {
            Debug.fi(i, ConstantKt.CONNECT_FAIL_REASON_DISCONNECT);
            synchronized (Boolean.valueOf(this.isConnected)) {
                o(true);
                getAirohaLink().unregisterOnConnStateListener(getDevice().getAddress());
                b bVar = this.connectThread;
                if (bVar != null) {
                    bVar.cancel();
                }
                l();
                n(false);
                Unit unit = Unit.INSTANCE;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final AirohaLink getAirohaLink() {
            return this.airohaLink;
        }

        @NotNull
        public final Function1<Boolean, Unit> g() {
            return this.connectionCallback;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final BluetoothDevice getDevice() {
            return this.device;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getStopConnect() {
            return this.stopConnect;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsConnected() {
            return this.isConnected;
        }

        public final void n(boolean z) {
            this.isConnected = z;
        }

        public final void o(boolean z) {
            this.stopConnect = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LfType.values().length];
            iArr[LfType.BATTERY_CHANGED.ordinal()] = 1;
            iArr[LfType.MULTI_DEVICE_CONNECTION_CHANGED.ordinal()] = 2;
            iArr[LfType.STATISTIC_READY.ordinal()] = 3;
            iArr[LfType.EQUALIZER_CONFIG_TAKES_EFFECT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"com/xiaomi/hm/health/bt/device/MozartDevice$a", "", "", "b", "", "airohaLoggerInited", "Z", "a", "()Z", "c", "(Z)V", "", "DEVICE_INFO_WAIT", "J", "RETRY_CONNECT_AIROHA", "SYNC_STATIC_TIMEOUT", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return MozartDevice.N;
        }

        public final void b() {
            AirohaLogger.getInstance().setLogLevel(1);
        }

        public final void c(boolean z) {
            MozartDevice.N = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/MozartDevice$AirohaConnection;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<AirohaConnection> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", Status.PRE_CONNECT_STATE_CONNECTED, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Boolean, Unit> {
            public final /* synthetic */ MozartDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MozartDevice mozartDevice) {
                super(1);
                this.a = mozartDevice;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("AirohaConnection connected: ", Boolean.valueOf(z)));
                if (!z) {
                    this.a.r().onDisconnected();
                }
                Iterator it2 = this.a.airohaOtaStatusList.iterator();
                while (it2.hasNext()) {
                    ((OtaUpgradeState) it2.next()).onOtaStateChanged(z);
                }
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AirohaConnection invoke() {
            return new AirohaConnection(BluetoothContext.getContext(), MozartDevice.this.getBluetoothDevice(), new a(MozartDevice.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/base/CurrentTimeControllerImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<CurrentTimeControllerImpl> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CurrentTimeControllerImpl invoke() {
            return new CurrentTimeControllerImpl(MozartDevice.this.createBluetoothCharacteristic(Protocol.CTS));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/base/ClassicDeviceInfoController;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<ClassicDeviceInfoController> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClassicDeviceInfoController invoke() {
            return new ClassicDeviceInfoController(MozartDevice.this.createBluetoothCharacteristic(Protocol.VERSION));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/base/ClassicDeviceInfoController;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<ClassicDeviceInfoController> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClassicDeviceInfoController invoke() {
            return new ClassicDeviceInfoController(MozartDevice.this.createBluetoothCharacteristic(Protocol.NEW_VERSION), true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericControllerImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<GenericControllerImpl> {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<ITransport> {
            public a(MozartDevice mozartDevice) {
                super(0, mozartDevice, MozartDevice.class, "getTransport", "getTransport()Lcom/xiaomi/hm/health/bt/classic/ITransport;", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ITransport invoke() {
                return ((MozartDevice) this.receiver).getTransport();
            }
        }

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GenericControllerImpl invoke() {
            return new GenericControllerImpl(new ClassicGenericNotifyCharacteristic(Protocol.DEVICE_FEATURE, new a(MozartDevice.this)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class g extends FunctionReferenceImpl implements Function0<HeadsetDevice.HeadsetDeviceState> {
        public g(MozartDevice mozartDevice) {
            super(0, mozartDevice, MozartDevice.class, "getHeadsetDeviceState", "getHeadsetDeviceState()Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HeadsetDevice.HeadsetDeviceState invoke() {
            return ((MozartDevice) this.receiver).getHeadsetState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class h extends FunctionReferenceImpl implements Function0<Boolean> {
        public h(EcfControllerImpl ecfControllerImpl) {
            super(0, ecfControllerImpl, EcfControllerImpl.class, "doRoleSwitch", "doRoleSwitch()Z", 0);
        }

        public final boolean a() {
            return ((EcfControllerImpl) this.receiver).doRoleSwitch();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class i extends FunctionReferenceImpl implements Function1<IHMConnectionCallback, Unit> {
        public i(MozartDevice mozartDevice) {
            super(1, mozartDevice, MozartDevice.class, "unregisterConnectionStatusChangeInternalCallback", "unregisterConnectionStatusChangeInternalCallback(Lcom/xiaomi/hm/health/bt/ife/IHMConnectionCallback;)V", 0);
        }

        public final void a(@NotNull IHMConnectionCallback iHMConnectionCallback) {
            ((MozartDevice) this.receiver).G(iHMConnectionCallback);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IHMConnectionCallback iHMConnectionCallback) {
            a(iHMConnectionCallback);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfControllerImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<EcfControllerImpl> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Boolean> {
            public final /* synthetic */ MozartDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MozartDevice mozartDevice) {
                super(0);
                this.a = mozartDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2() {
                return this.a.hasHeadsetFeature(0);
            }
        }

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcfControllerImpl invoke() {
            return new EcfControllerImpl(MozartDevice.this.createBluetoothCharacteristic(Protocol.ECF), new a(MozartDevice.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/mozart/MozartEqualizerController;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<MozartEqualizerController> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MozartEqualizerController invoke() {
            return new MozartEqualizerController(MozartDevice.this.n().getAirohaLink());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericControllerImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<GenericControllerImpl> {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<ITransport> {
            public a(MozartDevice mozartDevice) {
                super(0, mozartDevice, MozartDevice.class, "getTransport", "getTransport()Lcom/xiaomi/hm/health/bt/classic/ITransport;", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ITransport invoke() {
                return ((MozartDevice) this.receiver).getTransport();
            }
        }

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GenericControllerImpl invoke() {
            return new GenericControllerImpl(new ClassicGenericNotifyCharacteristic(Protocol.ECF, new a(MozartDevice.this)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<Boolean> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            HeadsetDevice.HeadsetDeviceState headsetDeviceState = MozartDevice.this.headsetState;
            if (headsetDeviceState == null) {
                return false;
            }
            return headsetDeviceState.isDualConnected();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<Unit> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws InterruptedException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws InterruptedException {
            MozartDevice.this.initLowRateEventListener();
            MozartDevice.this.deviceInfoLatch = new CountDownLatch(1);
            CountDownLatch countDownLatch = MozartDevice.this.deviceInfoLatch;
            if (countDownLatch != null) {
                countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
            }
            MozartDevice.this.deviceInfoLatch = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<HMHeartRateController> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMHeartRateController invoke() {
            return new HMHeartRateController(MozartDevice.this.createBluetoothCharacteristic(Protocol.HRS_CP), MozartDevice.this.createBluetoothCharacteristic(Protocol.HRS_MEASURE));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/step/RealtimeStepControllerImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<RealtimeStepControllerImpl> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RealtimeStepControllerImpl invoke() {
            return new RealtimeStepControllerImpl(MozartDevice.this.createBluetoothCharacteristic(Protocol.STEP));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class q extends FunctionReferenceImpl implements Function0<ITransport> {
        public q(MozartDevice mozartDevice) {
            super(0, mozartDevice, MozartDevice.class, "getTransport", "getTransport()Lcom/xiaomi/hm/health/bt/classic/ITransport;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ITransport invoke() {
            return ((MozartDevice) this.receiver).getTransport();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class r extends FunctionReferenceImpl implements Function0<HeadsetDevice.HeadsetDeviceState> {
        public r(MozartDevice mozartDevice) {
            super(0, mozartDevice, MozartDevice.class, "getHeadsetDeviceState", "getHeadsetDeviceState()Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HeadsetDevice.HeadsetDeviceState invoke() {
            return ((MozartDevice) this.receiver).getHeadsetState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class s extends FunctionReferenceImpl implements Function0<Boolean> {
        public s(EcfControllerImpl ecfControllerImpl) {
            super(0, ecfControllerImpl, EcfControllerImpl.class, "doRoleSwitch", "doRoleSwitch()Z", 0);
        }

        public final boolean a() {
            return ((EcfControllerImpl) this.receiver).doRoleSwitch();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class t extends FunctionReferenceImpl implements Function1<IHMConnectionCallback, Unit> {
        public t(MozartDevice mozartDevice) {
            super(1, mozartDevice, MozartDevice.class, "unregisterConnectionStatusChangeInternalCallback", "unregisterConnectionStatusChangeInternalCallback(Lcom/xiaomi/hm/health/bt/ife/IHMConnectionCallback;)V", 0);
        }

        public final void a(@NotNull IHMConnectionCallback iHMConnectionCallback) {
            ((MozartDevice) this.receiver).G(iHMConnectionCallback);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IHMConnectionCallback iHMConnectionCallback) {
            a(iHMConnectionCallback);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class u extends FunctionReferenceImpl implements Function1<IHMConnectionCallback, Unit> {
        public u(MozartDevice mozartDevice) {
            super(1, mozartDevice, MozartDevice.class, "registerConnectionStatusChangeInternalCallback", "registerConnectionStatusChangeInternalCallback(Lcom/xiaomi/hm/health/bt/ife/IHMConnectionCallback;)V", 0);
        }

        public final void a(@NotNull IHMConnectionCallback iHMConnectionCallback) {
            ((MozartDevice) this.receiver).B(iHMConnectionCallback);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IHMConnectionCallback iHMConnectionCallback) {
            a(iHMConnectionCallback);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class v extends FunctionReferenceImpl implements Function0<Unit> {
        public v(MozartDevice mozartDevice) {
            super(0, mozartDevice, MozartDevice.class, WifiSetActivity.KEY_CONNECT, "connect()V", 0);
        }

        public final void a() {
            ((MozartDevice) this.receiver).connect();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class w extends FunctionReferenceImpl implements Function0<Unit> {
        public w(MozartDevice mozartDevice) {
            super(0, mozartDevice, MozartDevice.class, ConstantKt.CONNECT_FAIL_REASON_DISCONNECT, "disconnect()V", 0);
        }

        public final void a() {
            ((MozartDevice) this.receiver).disconnect();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/base/UserInfoControllerImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<UserInfoControllerImpl> {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserInfoControllerImpl invoke() {
            return new UserInfoControllerImpl(MozartDevice.this.createBluetoothCharacteristic(Protocol.USER));
        }
    }

    public MozartDevice(@Nullable BluetoothDevice bluetoothDevice) {
        super(BluetoothContext.getContext(), bluetoothDevice);
        this.device = bluetoothDevice;
        this.deviceStateListeners = new ArrayList();
        this.deviceInfoController = LazyKt__LazyJVMKt.lazy(new d());
        this.deviceInfoNewController = LazyKt__LazyJVMKt.lazy(new e());
        this.currentTimeController = LazyKt__LazyJVMKt.lazy(new c());
        this.ecfController = LazyKt__LazyJVMKt.lazy(new j());
        this.genericController = LazyKt__LazyJVMKt.lazy(new l());
        this.dfGenericController = LazyKt__LazyJVMKt.lazy(new f());
        this.userInfoController = LazyKt__LazyJVMKt.lazy(new x());
        this.sensorSyncController = LazyKt__LazyJVMKt.lazy(new Function0<HMProSensorDataController>() { // from class: com.xiaomi.hm.health.bt.device.MozartDevice$sensorSyncController$2

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<ITransport> {
                public a(MozartDevice mozartDevice) {
                    super(0, mozartDevice, MozartDevice.class, "getTransport", "getTransport()Lcom/xiaomi/hm/health/bt/classic/ITransport;", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ITransport invoke() {
                    return ((MozartDevice) this.receiver).getTransport();
                }
            }

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HMProSensorDataController invoke() {
                HMProSensorDataController.HeartRateController heartRateController = new HMProSensorDataController.HeartRateController() { // from class: com.xiaomi.hm.health.bt.device.MozartDevice$sensorSyncController$2$hrController$1
                    @Override // com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController.HeartRateController
                    public void startRealtimeHr() {
                    }

                    @Override // com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController.HeartRateController
                    public void stopRealtimeHr() {
                    }
                };
                Protocol protocol = Protocol.GRSP_CP;
                return new HMProSensorDataController(heartRateController, new GenericControllerImpl(new ClassicGenericNotifyCharacteristic(protocol, new a(this.a))), this.a.createBluetoothCharacteristic(protocol), this.a.createBluetoothCharacteristic(Protocol.GRSP_DATA));
            }
        });
        this.hrController = LazyKt__LazyJVMKt.lazy(new o());
        this.realtimeStepController = LazyKt__LazyJVMKt.lazy(new p());
        this.syncGpsDataLock = new SyncGpsDataLock();
        this.airohaConnection = LazyKt__LazyJVMKt.lazy(new b());
        this.onConnectionStatusChangeInternalList = new CopyOnWriteArrayList<>();
        this.airohaOtaStatusList = new CopyOnWriteArrayList<>();
        this.equalizerController = LazyKt__LazyJVMKt.lazy(new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(MozartDevice mozartDevice) {
        mozartDevice.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void B(IHMConnectionCallback callbeck) {
        this.onConnectionStatusChangeInternalList.add(callbeck);
    }

    private final boolean C() {
        List<BatteryInfo> batteryInfoList = s().getBatteryInfoList();
        if (batteryInfoList == null) {
            return false;
        }
        this.batteryInfoList = CollectionsKt__CollectionsKt.listOf((Object[]) new BatteryInfo[]{(BatteryInfo) CollectionsKt.getOrNull(batteryInfoList, HeadsetDevice.Part.Left.INSTANCE.getBatteryIndex()), (BatteryInfo) CollectionsKt.getOrNull(batteryInfoList, HeadsetDevice.Part.Right.INSTANCE.getBatteryIndex()), (BatteryInfo) CollectionsKt.getOrNull(batteryInfoList, HeadsetDevice.Part.Box.INSTANCE.getBatteryIndex())});
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(MozartDevice mozartDevice, DataParser dataParser, SyncDataCallback syncDataCallback, Calendar calendar, HMGDSPType hMGDSPType) throws InterruptedException {
        GdspOption gdspOption = new GdspOption(mozartDevice.createBluetoothCharacteristic(Protocol.GDSP_CP), mozartDevice.createBluetoothCharacteristic(Protocol.GDSP_DATA));
        new GdspDataFetcher(gdspOption, gdspOption, dataParser, syncDataCallback).start(calendar, hMGDSPType);
    }

    private final void E() {
        MultiDeviceState multiDeviceState = getEcfController().getMultiDeviceState();
        if (multiDeviceState != null) {
            this.headsetState = new HeadsetDevice.HeadsetDeviceState(multiDeviceState);
        }
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("headsetState: ", this.headsetState));
    }

    private final void F() {
        String version = getEcfController().getVersion();
        if (version == null) {
            Debug.fi(HMBaseDevice.TAG, "Get second ear version failed!");
            return;
        }
        if (kotlin.text.m.isBlank(version)) {
            version = null;
        }
        this.secondEarVer = version;
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("secondEarVer: ", version));
        CountDownLatch countDownLatch = this.deviceInfoLatch;
        if (countDownLatch == null) {
            return;
        }
        String str = this.secondEarVer;
        if (str == null || kotlin.text.m.isBlank(str)) {
            return;
        }
        Debug.fi(HMBaseDevice.TAG, "Second ear version ready!");
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(IHMConnectionCallback callbeck) {
        this.onConnectionStatusChangeInternalList.remove(callbeck);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AirohaConnection n() {
        return (AirohaConnection) this.airohaConnection.getValue();
    }

    private final CurrentTimeControllerImpl o() {
        return (CurrentTimeControllerImpl) this.currentTimeController.getValue();
    }

    private final ClassicDeviceInfoController p() {
        return (ClassicDeviceInfoController) this.deviceInfoController.getValue();
    }

    private final GenericControllerImpl q() {
        return (GenericControllerImpl) this.dfGenericController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MozartEqualizerController r() {
        return (MozartEqualizerController) this.equalizerController.getValue();
    }

    private final GenericControllerImpl s() {
        return (GenericControllerImpl) this.genericController.getValue();
    }

    private final HMHeartRateController t() {
        return (HMHeartRateController) this.hrController.getValue();
    }

    private final RealtimeStepController u() {
        return (RealtimeStepController) this.realtimeStepController.getValue();
    }

    private final HMProSensorDataController v() {
        return (HMProSensorDataController) this.sensorSyncController.getValue();
    }

    private final UserInfoControllerImpl w() {
        return (UserInfoControllerImpl) this.userInfoController.getValue();
    }

    private final void x() {
        runOnDeviceOnlyThread(new Runnable() { // from class: q85
            @Override // java.lang.Runnable
            public final void run() {
                MozartDevice.y(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(MozartDevice mozartDevice) {
        BatteryInfo batteryInfo;
        if (mozartDevice.C() && mozartDevice.isConnected() && (batteryInfo = mozartDevice.getBatteryInfo()) != null) {
            Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("notifyBatteryChanged: ", batteryInfo));
            mozartDevice.notifyBatteryChanged(batteryInfo);
        }
    }

    private final void z(byte[] data) {
        MultiDeviceState multiDeviceState = MultiDeviceStateKt.toMultiDeviceState(data);
        HeadsetDevice.HeadsetDeviceState headsetDeviceState = multiDeviceState == null ? null : new HeadsetDevice.HeadsetDeviceState(multiDeviceState);
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("onDeviceStateChanged: ", headsetDeviceState));
        if (headsetDeviceState == null) {
            return;
        }
        this.headsetState = headsetDeviceState;
        Iterator<T> it2 = this.deviceStateListeners.iterator();
        while (it2.hasNext()) {
            ((HeadsetDevice.StateListener) it2.next()).onStateChanged(headsetDeviceState);
        }
        if (headsetDeviceState.isDualConnected()) {
            runOnDeviceOnlyThread(new Runnable() { // from class: p85
                @Override // java.lang.Runnable
                public final void run() {
                    MozartDevice.A(this.a);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final boolean applyEqualizer(@NotNull Equalizer equalizer) {
        boolean z;
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("applyEqualizer: ", equalizer));
        synchronized (n()) {
            if (n().getIsConnected()) {
                boolean zApplyEqualizer = r().applyEqualizer(equalizer);
                Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("applyEqualizer result: ", Boolean.valueOf(zApplyEqualizer)));
                if (zApplyEqualizer && equalizer.getEqType() != 0) {
                    Equalizer equalizer2 = this.equalizer;
                    this.equalizer = equalizer2 == null ? null : Equalizer.copy$default(equalizer2, equalizer.getEqType(), null, null, 6, null);
                }
                if (zApplyEqualizer) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public void connectServiceOfHeadsetAndA2DP() {
        BluetoothDevice bluetoothDevice = this.device;
        if (bluetoothDevice == null) {
            return;
        }
        BluetoothA2dpService.INSTANCE.init(BluetoothContext.getContext()).connectA2DP(bluetoothDevice);
        BluetoothHeadsetService.INSTANCE.init(BluetoothContext.getContext()).connectHeadset(bluetoothDevice);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void create(boolean forceDirectly) {
        super.create(forceDirectly);
        if (!N) {
            M.b();
            N = true;
        }
        n().d();
    }

    public void deInitDeviceInfo() {
        u().setStepCallback(null);
        this.batteryInfoList = CollectionsKt__CollectionsKt.emptyList();
        this.secondEarVer = null;
        this.headsetState = null;
        this.deviceInfoReady = false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void destroy() {
        synchronized (n()) {
            n().e();
            Unit unit = Unit.INSTANCE;
        }
        super.destroy();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean doPostureCalibration(boolean enable) {
        return getEcfController().doPostureCalibration(enable);
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    public void doSwitchRole(@NotNull final SwitchRoleCallback callback) {
        if (!isConnected()) {
            Debug.fi(HMBaseDevice.TAG, "do role switch,but not connected");
            callback.onSwitchRoleResult(false);
            return;
        }
        DoSwitchRoleAction doSwitchRoleAction = new DoSwitchRoleAction(getBluetoothDevice().getAddress(), new g(this), new h(getEcfController()), new i(this));
        doSwitchRoleAction.registerSwitchRoleCallback(new SwitchRoleCallback() { // from class: com.xiaomi.hm.health.bt.device.MozartDevice$doSwitchRole$action$4$1
            @Override // com.huami.bluetooth.device.function.log.SwitchRoleCallback
            public void onSwitchRoleResult(boolean result) {
                Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("onSwitchRoleResult:", Boolean.valueOf(result)));
                callback.onSwitchRoleResult(result);
            }
        });
        B(doSwitchRoleAction);
        connectServiceOfHeadsetAndA2DP();
        runOnDeviceOnlyThread(doSwitchRoleAction);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean enableCervicalProtectionSound(boolean enable) {
        return getEcfController().enableCervicalProtectionSound(enable);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice
    @Nullable
    public Feature fetchFeature() {
        return q().getDeviceFeature();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public BatteryInfo getBatteryInfo() {
        HeadsetDevice.HeadsetDeviceState headsetDeviceState;
        BatteryInfo batteryInfo;
        if (!isConnected() || (headsetDeviceState = this.headsetState) == null) {
            return null;
        }
        if (headsetDeviceState.isDualConnected()) {
            batteryInfo = getBatteryInfo(HeadsetDevice.Part.Left.INSTANCE);
            BatteryInfo batteryInfo2 = getBatteryInfo(HeadsetDevice.Part.Right.INSTANCE);
            int level = batteryInfo == null ? -1 : batteryInfo.getLevel();
            int level2 = batteryInfo2 != null ? batteryInfo2.getLevel() : -1;
            Debug.fi(HMBaseDevice.TAG, "getBatteryInfo DualConnected: " + level + ", " + level2);
            if (level2 >= level) {
                return batteryInfo2;
            }
        } else if (headsetDeviceState.isRightConnected()) {
            batteryInfo = getBatteryInfo(HeadsetDevice.Part.Right.INSTANCE);
            Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("getBatteryInfo Right: ", batteryInfo != null ? Integer.valueOf(batteryInfo.getLevel()) : null));
        } else {
            batteryInfo = getBatteryInfo(HeadsetDevice.Part.Left.INSTANCE);
            Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("getBatteryInfo Left: ", batteryInfo != null ? Integer.valueOf(batteryInfo.getLevel()) : null));
        }
        return batteryInfo;
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public Boolean getCervicalProtection() {
        return getEcfController().getCervicalProtection();
    }

    @NotNull
    public final ClassicDeviceInfoController getDeviceInfoNewController() {
        return (ClassicDeviceInfoController) this.deviceInfoNewController.getValue();
    }

    public final boolean getDeviceInfoReady() {
        return this.deviceInfoReady;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice
    @Nullable
    public DeviceInfo getDeviceInfoSync() {
        Feature feature = this.mFeature;
        DeviceInfo deviceInfo = (feature == null ? false : feature.hasHeadset(1) ? getDeviceInfoNewController() : p()).getDeviceInfo();
        if (deviceInfo == null) {
            return null;
        }
        deviceInfo.setDeviceFeature(this.mFeature);
        E();
        n nVar = new n();
        m mVar = new m();
        if (!mVar.invoke().booleanValue()) {
            Debug.fi(HMBaseDevice.TAG, "Waiting second ear connect!");
            nVar.invoke();
        }
        if (mVar.invoke().booleanValue()) {
            F();
            String str = this.secondEarVer;
            if (str == null || kotlin.text.m.isBlank(str)) {
                Debug.fi(HMBaseDevice.TAG, "Waiting second ear version!");
                nVar.invoke();
            }
        }
        return deviceInfo;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    public HMDeviceType getDeviceType() {
        return HMDeviceType.HEADSET;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public String getDeviceVersion() {
        HeadsetDevice.HeadsetDeviceState headsetDeviceState = this.headsetState;
        MultiDeviceState.Host host = headsetDeviceState == null ? null : headsetDeviceState.getHost();
        if (host == null) {
            host = MultiDeviceState.Host.Right.INSTANCE;
        }
        return Intrinsics.areEqual(versionHost(), host) ? super.getDeviceVersion() : getSecondEarVer();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public int getDeviceVersionCode() {
        HeadsetDevice.HeadsetDeviceState headsetDeviceState = this.headsetState;
        MultiDeviceState.Host host = headsetDeviceState == null ? null : headsetDeviceState.getHost();
        if (host == null) {
            host = MultiDeviceState.Host.Right.INSTANCE;
        }
        return Intrinsics.areEqual(versionHost(), host) ? super.getDeviceVersionCode() : getSecondEarVersionCode();
    }

    @NotNull
    public final EcfControllerImpl getEcfController() {
        return (EcfControllerImpl) this.ecfController.getValue();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public Boolean getEnvironmentSound() {
        return getEcfController().getEnvironmentSound();
    }

    @Override // com.huami.bluetooth.device.function.EqualizerFun
    @Nullable
    public Equalizer getEqualizer() {
        Equalizer equalizer;
        Equalizer equalizer2;
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("getEqualizer: ", this.equalizer));
        if (getUpgrading()) {
            Debug.fi(HMBaseDevice.TAG, "getEqualizer ,but current device is ota upgrade");
            return this.equalizer;
        }
        Equalizer equalizer3 = this.equalizer;
        if (equalizer3 != null) {
            return equalizer3;
        }
        synchronized (n()) {
            equalizer = null;
            if (n().getIsConnected() && (equalizer2 = r().getEqualizer()) != null) {
                Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("getEqualizer(Controller): ", equalizer2));
                this.equalizer = equalizer2;
                equalizer = equalizer2;
            }
        }
        return equalizer;
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public Short getHeadNeckAngle() {
        return getEcfController().getHeadNeckAngle();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    /* JADX INFO: renamed from: getHeadsetDeviceState, reason: from getter */
    public HeadsetDevice.HeadsetDeviceState getHeadsetState() {
        return this.headsetState;
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    public void getHeadsetHealthInfo(@NotNull Calendar calendar, @NotNull final SyncDataCallback<? super List<HearingHealthDayData>> callback) {
        callback.onStart();
        if (isConnected()) {
            syncData(calendar, HMGDSPType.HEADSET_HEALTH, new HeadsetHealthInfoParser(), new SyncDataCallback<List<? extends HearingHealthDayData>>() { // from class: com.xiaomi.hm.health.bt.device.MozartDevice.getHeadsetHealthInfo.1
                @Override // com.huami.bluetooth.profile.data.SyncDataCallback
                public void onCompleted() {
                    callback.onCompleted();
                }

                @Override // com.huami.bluetooth.profile.data.SyncDataCallback
                public void onError(@NotNull HMDeviceError error) {
                    callback.onError(error);
                }

                @Override // com.huami.bluetooth.profile.data.SyncDataCallback
                public void onProgress(@NotNull Progress progress) {
                    callback.onProgress(progress);
                }

                @Override // com.huami.bluetooth.profile.data.SyncDataCallback
                public /* bridge */ /* synthetic */ void onReceived(List<? extends HearingHealthDayData> list) {
                    onReceived2((List<HearingHealthDayData>) list);
                }

                @Override // com.huami.bluetooth.profile.data.SyncDataCallback
                public void onStart() {
                    callback.onStart();
                }

                /* JADX INFO: renamed from: onReceived, reason: avoid collision after fix types in other method */
                public void onReceived2(@NotNull List<HearingHealthDayData> data) {
                    callback.onReceived(data);
                }
            });
        } else {
            callback.onError(new HMDeviceError(3));
        }
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public HeadsetKnockSetting getHeadsetKnockSetting() {
        return hasHeadsetFeature(0) ? s().getHeadsetKnockSetting() : getEcfController().getHeadsetKnockSetting();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public HeadsetSideListenSetting getHeadsetSideListenSetting() {
        return getEcfController().getHeadsetSideListenSetting();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public HeadsetSportSetting getHeadsetSportSetting() {
        return getEcfController().getHeadsetSportSetting();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public Boolean getHearingHealth() {
        return getEcfController().getHearingHealth();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public HrReminderInfo getHrReminder() {
        return getEcfController().getHrReminder();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public NoiseControl getNoiseControl() {
        return getEcfController().getNoiseControl();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public Boolean getPercussionBroadcast() {
        return getEcfController().getPercussionBroadcast();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    /* JADX INFO: renamed from: getRealtimeStep, reason: from getter */
    public RealtimeStep getStep() {
        return this.step;
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public Boolean getRelaxationPrompt() {
        return getEcfController().getRelaxationPrompt();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public Boolean getRunningRecognition() {
        return getEcfController().getRunningRecognition();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    /* JADX INFO: renamed from: getSecondEarVersion, reason: from getter */
    public String getSecondEarVer() {
        return this.secondEarVer;
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public int getSecondEarVersionCode() {
        String secondEarVer = getSecondEarVer();
        if (secondEarVer == null) {
            return -1;
        }
        return ProfileUtils.getVersionCodeFromVersionName(secondEarVer);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @NotNull
    public List<Sn> getSnList() {
        return s().getSnList();
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    public void getStatisticInfo(@NotNull final SyncDataCallback<Object> callback) throws InterruptedException {
        callback.onStart();
        if (!isConnected()) {
            callback.onError(new HMDeviceError(3));
            return;
        }
        this.staticLatch = new CountDownLatch(1);
        this.staticSyncSuccess = false;
        if (!getEcfController().syncSecondEarStatistic()) {
            callback.onError(new HMDeviceError(2));
            this.staticLatch = null;
            return;
        }
        CountDownLatch countDownLatch = this.staticLatch;
        if (countDownLatch != null) {
            countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
        }
        this.staticLatch = null;
        if (this.staticSyncSuccess) {
            syncData(Calendar.getInstance(), HMGDSPType.PROTO, new DeviceStatisticParser(getMDeviceSource()), new SyncDataCallback<Object>() { // from class: com.xiaomi.hm.health.bt.device.MozartDevice.getStatisticInfo.1
                @Override // com.huami.bluetooth.profile.data.SyncDataCallback
                public void onCompleted() {
                    callback.onCompleted();
                }

                @Override // com.huami.bluetooth.profile.data.SyncDataCallback
                public void onError(@NotNull HMDeviceError error) {
                    callback.onError(error);
                }

                @Override // com.huami.bluetooth.profile.data.SyncDataCallback
                public void onProgress(@NotNull Progress progress) {
                    callback.onProgress(progress);
                }

                @Override // com.huami.bluetooth.profile.data.SyncDataCallback
                public void onReceived(@NotNull Object data) {
                    callback.onReceived(data);
                }

                @Override // com.huami.bluetooth.profile.data.SyncDataCallback
                public void onStart() {
                }
            });
        } else {
            callback.onError(new HMDeviceError(2));
        }
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public Boolean getVoiceControl() {
        return getEcfController().getVoiceControl();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public Boolean getWearInduction() {
        return getEcfController().getWearInduction();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean hasHeadsetFeature(int feature) {
        Feature deviceFeature;
        DeviceInfo deviceInfo = getDeviceInfo();
        return (deviceInfo == null || (deviceFeature = deviceInfo.getDeviceFeature()) == null || !deviceFeature.hasHeadset(feature)) ? false : true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice
    public boolean initAuth() {
        AuthInfo authInfo = getAuthInfo();
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("headset setUserInfoSync ret:", Boolean.valueOf(setUserInfoSync(authInfo == null ? null : authInfo.getUserInfo()))));
        return true;
    }

    public void initDeviceInfo() {
        HMCallback<RealtimeStep> hMCallback;
        C();
        this.deviceInfoReady = true;
        RealtimeStep step = u().getStep();
        this.step = step;
        if (step != null && (hMCallback = this.realtimeStepCallback) != null) {
            hMCallback.sendOnDataMessage(step);
        }
        u().setStepCallback(new DataCallback<RealtimeStep>() { // from class: com.xiaomi.hm.health.bt.device.MozartDevice.initDeviceInfo.2
            @Override // com.huami.bluetooth.profile.data.DataCallback
            public void onReceived(@NotNull RealtimeStep data) {
                MozartDevice.this.step = data;
                HMCallback hMCallback2 = MozartDevice.this.realtimeStepCallback;
                if (hMCallback2 == null) {
                    return;
                }
                hMCallback2.sendOnDataMessage(data);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isConnected() {
        return super.isConnected() && this.deviceInfoReady;
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    public boolean isLockGpsSync() {
        return this.syncGpsDataLock.getIsLocked();
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    public boolean isOtaEnable() {
        return n().getIsConnected();
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    /* JADX INFO: renamed from: isUpgrading, reason: from getter */
    public boolean getUpgrading() {
        return this.upgrading;
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    public void lockGpsSync(long lockTime, @NotNull Function0<Unit> runnable) {
        this.syncGpsDataLock.lock(lockTime, runnable);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean modifyDeviceName(@NotNull String deviceName) {
        return getEcfController().modifyDeviceName(deviceName);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void onConnectionStatusChangedInternal(@NotNull BluetoothDevice device, @NotNull HMDeviceType type, @NotNull Status status) {
        if (status == Status.AUTH_SUCCESS) {
            this.equalizer = null;
            initDeviceInfo();
        } else {
            deInitDeviceInfo();
        }
        Iterator<T> it2 = this.onConnectionStatusChangeInternalList.iterator();
        while (it2.hasNext()) {
            ((IHMConnectionCallback) it2.next()).onConnectionStatusChanged(device, type, status);
        }
        super.onConnectionStatusChangedInternal(device, type, status);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice, com.xiaomi.hm.health.bt.profile.slre.ILFEventListener
    public void onLFEvent(@NotNull HMLFEvent event) {
        LfType lfType = event.getLfType();
        int i2 = lfType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lfType.ordinal()];
        if (i2 == 1) {
            x();
            return;
        }
        if (i2 == 2) {
            byte[] extra = event.getExtra();
            if (extra == null) {
                return;
            }
            z(extra);
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                super.onLFEvent(event);
                return;
            } else {
                getEqualizer(true);
                return;
            }
        }
        CountDownLatch countDownLatch = this.staticLatch;
        if (countDownLatch == null) {
            return;
        }
        this.staticSyncSuccess = true;
        countDownLatch.countDown();
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    public void registerOtaStateCallback(@NotNull OtaUpgradeState callBack) {
        if (this.airohaOtaStatusList.contains(callBack)) {
            return;
        }
        this.airohaOtaStatusList.add(callBack);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public void registerStateListener(@NotNull HeadsetDevice.StateListener listener) {
        if (this.deviceStateListeners.contains(listener)) {
            return;
        }
        this.deviceStateListeners.add(listener);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean reset() {
        return getEcfController().reset();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setCervicalProtection(boolean enable) {
        return getEcfController().setCervicalProtection(enable);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean setDateTimeSync(@NotNull Calendar calendar) {
        return o().setTime(calendar);
    }

    public final void setDeviceInfoReady(boolean z) {
        this.deviceInfoReady = z;
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setEnvironmentSound(boolean isOpen) {
        return getEcfController().setEnvironmentSound(isOpen);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    @Override // com.huami.bluetooth.device.function.EqualizerFun
    public boolean setEqualizer(@NotNull Equalizer equalizer) {
        boolean z;
        Equalizer equalizerCopy$default;
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("setEqualizer: ", equalizer));
        synchronized (n()) {
            if (n().getIsConnected()) {
                boolean equalizer2 = r().setEqualizer(equalizer);
                Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("setEqualizer result: ", Boolean.valueOf(equalizer2)));
                if (equalizer2) {
                    if (equalizer.getEqType() == 0) {
                        equalizerCopy$default = Equalizer.copy$default(equalizer, 0, null, null, 7, null);
                    } else {
                        Equalizer equalizer3 = this.equalizer;
                        equalizerCopy$default = equalizer3 == null ? null : Equalizer.copy$default(equalizer3, equalizer.getEqType(), null, null, 6, null);
                    }
                    this.equalizer = equalizerCopy$default;
                }
                if (equalizer2) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setHeadsetKnock(@NotNull HeadsetKnockSetting setting) {
        return getEcfController().setHeadsetKnock(setting);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setHeadsetSideListen(@NotNull HeadsetSideListenSetting setting) {
        return getEcfController().setHeadsetSideListen(setting);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setHeadsetSport(@NotNull HeadsetSportSetting setting) {
        return getEcfController().setHeadsetSport(setting);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setHearingHealth(boolean enable) {
        return getEcfController().setHearingHealth(enable);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setHrReminder(@NotNull HrReminderInfo hrReminderInfo) {
        return getEcfController().setHrReminder(hrReminderInfo);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setNoiseControl(@NotNull NoiseControl mode) {
        return getEcfController().setNoiseControl(mode);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setPercussionBroadcast(boolean enable) {
        return getEcfController().setPercussionBroadcast(enable);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setRealtimeStepCallback(@Nullable HMCallback<RealtimeStep> callback) {
        this.realtimeStepCallback = callback;
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setRelaxationPrompt(boolean isOpen) {
        return getEcfController().setRelaxationPrompt(isOpen);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setReportHeadsetInfoSwitch(boolean isOpen) {
        return getEcfController().setReportHeadsetInfoSwitch(isOpen);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setRunningRecognition(boolean isOpen) {
        return getEcfController().setRunningRecognition(isOpen);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice
    public boolean setUserInfoSync(@Nullable UserInfo userInfo) {
        if (userInfo == null) {
            return false;
        }
        return w().setUserInfo(userInfo);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setVoiceControl(boolean isOpen) {
        return getEcfController().setVoiceControl(isOpen);
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public boolean setWearInduction(boolean enable) {
        return getEcfController().setWearInduction(enable);
    }

    @Override // com.huami.bluetooth.device.RealtimeHeartRateDevice
    public void startRealtimeMeasureHr(@NotNull HMHeartRateController.IHeartRateCallback callback) {
        if (isConnected()) {
            t().startRealtimeMeasureAsync(callback);
        } else {
            callback.onOpen(false);
        }
    }

    @Override // com.huami.bluetooth.device.function.sensor.SensorSyncEnable
    public void startSensorData(int type, @NotNull IHMSensorDataCallback callback) {
        if (isConnected()) {
            v().startAsync(type, callback);
        } else {
            callback.onSensorStart();
            callback.onSensorStop(false);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void startSyncGpsData(@NotNull Calendar calendar, @NotNull com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback<? super List<? extends GpsRecord>> callback) {
        if (this.syncGpsDataLock.getIsLocked()) {
            callback.onStart();
            callback.onFinish(new HMDeviceError(5));
        } else if (isConnected()) {
            runOnDeviceOnlyThread(new HMSyncGpsDataTask(getTransport(), calendar, callback));
        } else {
            callback.onStart();
            callback.onFinish(new HMDeviceError(3));
        }
    }

    @Override // com.huami.bluetooth.device.RealtimeHeartRateDevice
    public void stopRealtimeMeasureHr() {
        t().stopRealtimeMeasureAsync();
    }

    @Override // com.huami.bluetooth.device.function.sensor.SensorSyncEnable
    public void stopSensorData() {
        v().stopAsync();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice
    public void subclassOwnOperation() {
        this.mFeature = fetchFeature();
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("initChannel result:", Boolean.valueOf(initChannel())));
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    public boolean syncAppState(@NotNull AppState state) {
        return getEcfController().syncAppState(state);
    }

    @Override // com.huami.bluetooth.device.function.IGdsp
    public <T> void syncData(@NotNull final Calendar calendar, @NotNull final HMGDSPType type, @NotNull final DataParser<? extends T> parser, @NotNull final SyncDataCallback<? super T> callback) {
        if (isConnected()) {
            runOnDeviceMultiThread(new Runnable() { // from class: r85
                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    MozartDevice.D(this.a, parser, callback, calendar, type);
                }
            });
        } else {
            callback.onStart();
            callback.onError(new HMDeviceError(3));
        }
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    public void syncHeadsetLog(boolean isOutputSingleFile, @NotNull File file, @Nullable File anotherFile, @NotNull IHMDataCallback<File> callback) {
        HeadsetLogTask headsetLogTask = new HeadsetLogTask(new q(this), getBluetoothDevice().getAddress(), new r(this), new s(getEcfController()), new t(this), new u(this));
        this.headsetLogTask = headsetLogTask;
        headsetLogTask.start(isOutputSingleFile, file, anotherFile, callback);
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    public void terminateHeadsetLog() {
        HeadsetLogTask headsetLogTask = this.headsetLogTask;
        if (headsetLogTask == null) {
            return;
        }
        headsetLogTask.terminateDeviceLog();
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    public void unLockGpsSync() {
        this.syncGpsDataLock.unLock();
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    public void unRegisterOtaStateCallback(@NotNull OtaUpgradeState callBack) {
        if (this.airohaOtaStatusList.contains(callBack)) {
            this.airohaOtaStatusList.remove(callBack);
        }
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    public void unregisterStateListener(@NotNull HeadsetDevice.StateListener listener) {
        this.deviceStateListeners.remove(listener);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Deprecated(message = "Please use FirmwareUpgrade#upgradeFirmware(HMFirmwareInfo, FirmwareUpgradeCallback) instead", replaceWith = @ReplaceWith(expression = "FirmwareUpgrade#upgradeFirmware(HMFirmwareInfo, FirmwareUpgradeCallback)", imports = {}))
    public void updateFwUpgrade(@NotNull HMFirmwareInfo firmwareInfo, @NotNull final IHMFirmwareUpgradeCallback callback) {
        upgradeFirmware(firmwareInfo, new FirmwareUpgradeCallback() { // from class: com.xiaomi.hm.health.bt.device.MozartDevice.updateFwUpgrade.1
            @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback
            public void onComplete(@NotNull FirmwareUpgradeResult result) {
                callback.onFwStop(result == FirmwareUpgradeResult.COMPLETE);
            }

            @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback
            public void onPreLoad() {
            }

            @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback
            public void onProgress(@NotNull Progress progress) {
                callback.onFwProgress(progress);
            }

            @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback
            public void onStart() {
                callback.onFwStart(0);
            }
        });
    }

    public void upgradeFirmware(@NotNull HMFirmwareInfo firmware, @NotNull final FirmwareUpgradeCallback callback) {
        MozartFirmwareUpdater.ConnectMode connectMode;
        if (!n().getIsConnected()) {
            callback.onPreLoad();
            callback.onStart();
            callback.onComplete(FirmwareUpgradeResult.FAILED_DISCONNECTED);
            return;
        }
        connectServiceOfHeadsetAndA2DP();
        HeadsetDevice.HeadsetDeviceState headsetDeviceState = this.headsetState;
        if (headsetDeviceState == null) {
            connectMode = null;
        } else if (headsetDeviceState.isDualConnected()) {
            connectMode = MozartFirmwareUpdater.ConnectMode.Tws.INSTANCE;
        } else {
            connectMode = headsetDeviceState.isLeftConnected() ? MozartFirmwareUpdater.ConnectMode.LeftOnly.INSTANCE : MozartFirmwareUpdater.ConnectMode.RightOnly.INSTANCE;
        }
        if (connectMode == null) {
            connectMode = MozartFirmwareUpdater.ConnectMode.Tws.INSTANCE;
        }
        new FirmwareUpgradeTask(new MozartFirmwareUpdater(n().getAirohaLink(), getBluetoothDevice().getAddress(), connectMode, new v(this), new w(this))).start(firmware, new FirmwareUpgradeCallback() { // from class: com.xiaomi.hm.health.bt.device.MozartDevice$upgradeFirmware$innerCallback$1
            @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback
            public void onComplete(@NotNull FirmwareUpgradeResult result) {
                this.a.upgrading = false;
                callback.onComplete(result);
            }

            @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback
            public void onPreLoad() {
                this.a.upgrading = true;
                callback.onPreLoad();
            }

            @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback
            public void onProgress(@NotNull Progress progress) {
                callback.onProgress(progress);
            }

            @Override // com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback
            public void onStart() {
                this.a.upgrading = true;
                callback.onStart();
            }
        });
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @NotNull
    public MultiDeviceState.Host versionHost() {
        HeadsetDevice.HeadsetDeviceState headsetDeviceState = this.headsetState;
        MultiDeviceState.Host host = headsetDeviceState == null ? null : headsetDeviceState.getHost();
        if (host == null) {
            host = MultiDeviceState.Host.Right.INSTANCE;
        }
        HeadsetDevice.HeadsetDeviceState headsetDeviceState2 = this.headsetState;
        boolean zIsDualConnected = headsetDeviceState2 == null ? false : headsetDeviceState2.isDualConnected();
        int secondEarVersionCode = getSecondEarVersionCode();
        if (!zIsDualConnected || secondEarVersionCode == -1 || super.getDeviceVersionCode() <= secondEarVersionCode) {
            return host;
        }
        MultiDeviceState.Host.Left left = MultiDeviceState.Host.Left.INSTANCE;
        return Intrinsics.areEqual(host, left) ? MultiDeviceState.Host.Right.INSTANCE : left;
    }

    @Override // com.huami.bluetooth.device.MozartDevice
    @Nullable
    public Equalizer getEqualizer(boolean force) {
        if (force) {
            this.equalizer = null;
        }
        return getEqualizer();
    }

    @Override // com.huami.bluetooth.device.HeadsetDevice
    @Nullable
    public BatteryInfo getBatteryInfo(@NotNull HeadsetDevice.Part part) {
        List<BatteryInfo> list;
        HeadsetDevice.HeadsetDeviceState headsetDeviceState;
        boolean zIsRightConnected;
        if (!isConnected() || (list = this.batteryInfoList) == null || (headsetDeviceState = this.headsetState) == null) {
            return null;
        }
        if (Intrinsics.areEqual(part, HeadsetDevice.Part.Left.INSTANCE)) {
            zIsRightConnected = headsetDeviceState.isLeftConnected();
        } else if (Intrinsics.areEqual(part, HeadsetDevice.Part.Right.INSTANCE)) {
            zIsRightConnected = headsetDeviceState.isRightConnected();
        } else {
            if (!Intrinsics.areEqual(part, HeadsetDevice.Part.Box.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            zIsRightConnected = true;
        }
        if (zIsRightConnected) {
            return (BatteryInfo) CollectionsKt.getOrNull(list, part.getBatteryIndex());
        }
        return null;
    }
}
