package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.ChannelModuleFactory;
import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.huami.passport.Configs;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HmVirtualDevice;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.gatt.Phy;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.model.HMColorTheme;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.HMVibrateType;
import com.xiaomi.hm.health.bt.model.SyncStatus;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.OldProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.ConnectionParameters;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.dfu.DfuApi;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback;
import com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import com.xiaomi.hm.health.bt.profile.mili.model.MiLiHwConfig;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.market.sdk.Constants;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010ß\u0001\u001a\u00030§\u0001\u0012\u0007\u0010à\u0001\u001a\u00020\u0002¢\u0006\u0006\bá\u0001\u0010â\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001e\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0014J\b\u0010\u000f\u001a\u00020\rH\u0014J\u001c\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J \u0010\u0019\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001c\u001a\u00020\rH\u0014J\u0012\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010 \u001a\u00020\r2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0018H\u0016J\u001c\u0010#\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010!2\b\u0010\u0013\u001a\u0004\u0018\u00010\"H\u0016J \u0010(\u001a\u0006\u0012\u0002\b\u00030'2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u0013\u001a\u0004\u0018\u00010&H\u0014J\u001e\u0010,\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\u0016\u0010-\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\u0012\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0002H\u0014J \u00103\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u0001012\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J.\u00103\u001a\u00020\r2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00108\u001a\u0002072\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\u0012\u00109\u001a\u00020\u001a2\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u001e\u0010;\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J&\u0010=\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020)2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\u001e\u0010>\u001a\u00020\r2\u0006\u0010<\u001a\u00020)2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J&\u0010?\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020)2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\u001e\u0010@\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\u0012\u0010B\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010AH\u0016J\b\u0010C\u001a\u00020\rH\u0016J\u0010\u0010D\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020AH\u0016J\b\u0010E\u001a\u00020\rH\u0016J\u0018\u0010G\u001a\u00020\r2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010\u0018H\u0016J \u0010J\u001a\u00020\r2\b\u0010I\u001a\u0004\u0018\u00010H2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\n\u0010K\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010L\u001a\u00020\r2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010\u0018H\u0016J\u001a\u0010N\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020)2\b\u0010\u0013\u001a\u0004\u0018\u00010MH\u0016J\b\u0010O\u001a\u00020\rH\u0016J \u0010R\u001a\u00020\r2\b\u0010Q\u001a\u0004\u0018\u00010P2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J&\u0010R\u001a\u00020\r2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010S2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\u0018\u0010U\u001a\u00020\u001a2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010SH\u0016J\u001e\u0010V\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\u0016\u0010W\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J \u0010Z\u001a\u00020\r2\b\u0010Y\u001a\u0004\u0018\u00010X2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J \u0010]\u001a\u00020\r2\b\u0010\\\u001a\u0004\u0018\u00010[2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\b\u0010_\u001a\u00020^H\u0014J\u0018\u0010b\u001a\u00020\u001a2\u0006\u0010`\u001a\u00020)2\u0006\u0010a\u001a\u00020)H\u0016J\n\u0010d\u001a\u0004\u0018\u00010cH\u0016J'\u0010h\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010e2\u000e\u0010g\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010fH\u0014¢\u0006\u0004\bh\u0010iJ\n\u0010k\u001a\u0004\u0018\u00010jH\u0014J\b\u0010l\u001a\u00020)H\u0016J\b\u0010m\u001a\u00020\rH\u0014J\b\u0010n\u001a\u00020\rH\u0014J\b\u0010o\u001a\u00020\rH\u0014J\b\u0010p\u001a\u00020\rH\u0016J\u0010\u0010p\u001a\u00020\r2\u0006\u0010q\u001a\u00020\u001aH\u0016J\b\u0010r\u001a\u00020\u001aH\u0016J\u0012\u0010t\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010sH\u0016J\u0012\u0010n\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u001c\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010m\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010u\u001a\u00020)H\u0016J\u001a\u0010v\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010u\u001a\u00020)H\u0016J\u0012\u0010w\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010x\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010u\u001a\u00020)H\u0016J\u0012\u0010y\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010z\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010}\u001a\u00020\r2\b\u0010|\u001a\u0004\u0018\u00010{H\u0016J\u0018\u0010~\u001a\u00020\r2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020{\u0018\u00010\u0018H\u0016J\b\u0010\u007f\u001a\u00020{H\u0016J\t\u0010\u0080\u0001\u001a\u00020{H\u0014J\u0011\u0010\u0081\u0001\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u001aH\u0016J\u0012\u0010\u0083\u0001\u001a\u00020\r2\u0007\u0010\u0082\u0001\u001a\u00020\u001aH\u0016J\t\u0010\u0084\u0001\u001a\u00020\u001aH\u0016J\t\u0010\u0085\u0001\u001a\u00020\u001aH\u0016J\n\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0016J\n\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0016J\u001d\u0010\u008a\u0001\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u0013\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010\u008c\u0001\u001a\u00020\r2\u0007\u0010\u008b\u0001\u001a\u00020\u001aH\u0016J\t\u0010\u008d\u0001\u001a\u00020\rH\u0016J\t\u0010\u008e\u0001\u001a\u00020sH\u0016J\f\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u0016J\u0014\u0010\u0091\u0001\u001a\u00020\r2\t\u0010\u0011\u001a\u0005\u0018\u00010\u008f\u0001H\u0014J\u0019\u0010\u0092\u0001\u001a\u00020\r2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0018H\u0016J\u0013\u0010\u0093\u0001\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010\u0095\u0001\u001a\u00020\u001a2\u000f\u0010\u0094\u0001\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010SH\u0016J#\u0010\u0098\u0001\u001a\u00020\r2\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00012\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\u001a\u0010\u0099\u0001\u001a\u00020\r2\u000f\u0010\u0013\u001a\u000b\u0012\u0005\u0012\u00030\u0096\u0001\u0018\u00010\u0018H\u0016J\u0015\u0010\u0098\u0001\u001a\u00020\u001a2\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016J&\u0010b\u001a\u00020\r2\u0006\u0010`\u001a\u00020)2\u0006\u0010a\u001a\u00020)2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0014J\t\u0010\u009a\u0001\u001a\u00020)H\u0016J\"\u0010\u009c\u0001\u001a\u00020\r2\u0007\u0010\u009b\u0001\u001a\u00020)2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0018H\u0016J \u0010\u009e\u0001\u001a\u00020\r2\u0007\u0010\u009d\u0001\u001a\u00020)2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J5\u0010£\u0001\u001a\u00020\r2\u0007\u0010\u009f\u0001\u001a\u00020)2\u0007\u0010 \u0001\u001a\u00020)2\u0007\u0010¡\u0001\u001a\u00020)2\u000f\u0010\u0013\u001a\u000b\u0012\u0005\u0012\u00030¢\u0001\u0018\u00010\u0018H\u0016J\n\u0010¥\u0001\u001a\u00030¤\u0001H\u0016J\t\u0010¦\u0001\u001a\u00020)H\u0016J\n\u0010¨\u0001\u001a\u00030§\u0001H\u0016J\u0012\u0010ª\u0001\u001a\u00020\u001a2\u0007\u0010©\u0001\u001a\u00020)H\u0014J\t\u0010«\u0001\u001a\u00020\u001aH\u0014J\t\u0010¬\u0001\u001a\u00020\u001aH\u0014J\t\u0010\u00ad\u0001\u001a\u00020\u001aH\u0014J\u000b\u0010®\u0001\u001a\u0004\u0018\u00010\bH\u0016J1\u0010°\u0001\u001a\u0004\u0018\u00018\u0000\"\u000b\b\u0000\u0010e*\u0005\u0018\u00010¯\u00012\u000e\u0010g\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010fH\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J\f\u0010³\u0001\u001a\u0005\u0018\u00010²\u0001H\u0016J\u0017\u0010´\u0001\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J(\u0010µ\u0001\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\t\u0010u\u001a\u0005\u0018\u00010\u0086\u0001H\u0014J\u0013\u0010¶\u0001\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010sH\u0014J(\u0010º\u0001\u001a\u00020/2\t\u0010·\u0001\u001a\u0004\u0018\u00010/2\t\u0010¸\u0001\u001a\u0004\u0018\u00010/2\u0007\u0010¹\u0001\u001a\u00020)H\u0016J\u0015\u0010½\u0001\u001a\u00020\r2\n\u0010¼\u0001\u001a\u0005\u0018\u00010»\u0001H\u0016J\t\u0010¾\u0001\u001a\u00020\u001aH\u0014J\t\u0010¿\u0001\u001a\u00020\u0010H\u0016J\u0013\u0010À\u0001\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0015\u0010Ã\u0001\u001a\u00020\r2\n\u0010Â\u0001\u001a\u0005\u0018\u00010Á\u0001H\u0016J\u0013\u0010Ä\u0001\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\t\u0010Å\u0001\u001a\u00020\u0006H\u0014J!\u0010Æ\u0001\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010$2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\u0019\u0010Ç\u0001\u001a\u00020\r2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020s\u0018\u00010\u0018H\u0016J$\u0010É\u0001\u001a\u00020\r2\u000f\u0010È\u0001\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010S2\b\u0010\u0013\u001a\u0004\u0018\u00010\"H\u0016J\f\u0010Ë\u0001\u001a\u0005\u0018\u00010Ê\u0001H\u0016J*\u0010Í\u0001\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010$2\u0015\u0010\u0013\u001a\u0011\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ì\u00010S\u0018\u00010\u0018H\u0016J\u0013\u0010Î\u0001\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\t\u0010Ï\u0001\u001a\u00020\u001aH\u0016J'\u0010Ð\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010e2\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000fH\u0016¢\u0006\u0005\bÐ\u0001\u0010iJ'\u0010Ô\u0001\u001a\u00020\r2\n\u0010Ò\u0001\u001a\u0005\u0018\u00010Ñ\u00012\u0010\u0010\u0013\u001a\f\u0012\u0005\u0012\u00030Ñ\u0001\u0018\u00010Ó\u0001H\u0016J\t\u0010Õ\u0001\u001a\u00020\rH\u0016J\t\u0010Ö\u0001\u001a\u00020\rH\u0014J+\u0010Í\u0001\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010$2\u0016\u0010\u0013\u001a\u0012\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ì\u00010S\u0018\u00010×\u0001H\u0016J\f\u0010Ù\u0001\u001a\u0005\u0018\u00010Ø\u0001H\u0016J\u000b\u0010Ú\u0001\u001a\u0004\u0018\u00010jH\u0014R\u0018\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u001a\u0010ß\u0001\u001a\u00030§\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001¨\u0006ã\u0001"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HmVirtualDevice;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "", "getDeviceVersion", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "getBaseProfile", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/bluetooth/BluetoothDevice;", "device", "createProfile", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getDeviceType", "", "onBtOn", "onBtOff", "Lcom/xiaomi/hm/health/bt/profile/auth/AuthInfo;", "info", "Lcom/xiaomi/hm/health/bt/profile/auth/IHMAuthCallback;", "callback", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "auth", "Lcom/xiaomi/hm/health/bt/profile/mili/model/MiLiHwConfig;", "config", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", PointCategory.INIT, "", "initSync", "onDeviceConnected", "Lcom/xiaomi/hm/health/bt/model/HMVibrateType;", "type", "onVibrate", "setVibrateNotifyCallback", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "updateFwUpgrade", "Ljava/util/Calendar;", "calendar", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/IHMActivityDataCallback;", "Ljava/util/concurrent/Future;", "syncData", "", StatEvent.EventParams.TYPE_CARD_GOAL, "callBack", "setGoal", "bindWeixin", "deviceId", "", "getWeixinId", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "mode", "alert", "", "time", "offsetTime", "", "num", "alertSync", "enable", "enableSleepAssistHr", "interval", "enableFullHeartRate", "setHeartRateInterval", "enableHeartRate", "enableAtrialFib", "Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController$IHeartRateCallback;", "startManualMeasureHr", "stopManualMeasureHr", "startRealtimeMeasureHr", "stopRealtimeMeasureHr", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHeartRateConfig", "Lcom/xiaomi/hm/health/bt/model/UserInfoExt;", "infoExt", "setUserInfo", "getDeviceVersionFill", "getUserInfo", "Lcom/xiaomi/hm/health/bt/profile/grsp/IHMSensorDataCallback;", "startSensorData", "stopSensorData", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "clockExt", "setAlarmClock", "", "clocks", "setAlarmSync", "enableConnectedAdv", "triggerPair", "Lcom/xiaomi/hm/health/bt/profile/user/LocationExt;", "location", "setWearLocation", "Lcom/xiaomi/hm/health/bt/model/HMColorTheme;", "colorTheme", "setColorTheme", "Lcom/xiaomi/hm/health/bt/model/HMStatisticInfo;", "getStatisticInfoInternal", "minLatency", "maxLatency", "setLatency", "Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "getHeartHealthApi", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "createModule", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController;", "newHeartRateController", "getWatchSystemSettingsProtocolVersion", "onDeviceDisconnected", "onDeviceConnecting", "onDeviceConnectTimeout", "reConnect", "force", "needReconnect", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "onBatteryChanged", "status", "onDeviceConnectionFailed", "onDeviceDiscovering", "onDeviceDiscoveryFailed", "onDeviceDiscoverySuccess", "onInitializing", "Lcom/xiaomi/hm/health/bt/profile/base/RealtimeStep;", "step", "onStepChanged", "setRealtimeStepCallback", "getRealtimeStep", "getRealtimeStepSync", "enableRealtimeStep", "autoReconnect", "setAutoReconnect", "isConnected", "isSyncingData", "Lcom/xiaomi/hm/health/bt/device/Status;", "getDeviceStatus", "Lcom/xiaomi/hm/health/bt/model/SyncStatus;", "getSyncStatus", "startSyncData", "forceDirectly", "create", "destroy", "getBatteryInfo", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "getDeviceInfo", "updateDeviceInfo", "getDateTime", "setDateTimeSync", "firmwares", "sendUpgradeInfo", "Lcom/xiaomi/hm/health/bt/profile/base/ConnectionParameters;", "parameters", "setConnectionParameters", "getConnectionParameters", "readRemoteRssi", "mtu", "requestMtu", "connectionPriority", "requestConnectionPriority", "txPhy", "rxPhy", "phyOptions", "Lcom/xiaomi/hm/health/bt/gatt/Phy;", "setPreferredPhy", "Lcom/xiaomi/hm/health/bt/profile/base/Mtu;", "getMtu", "getDeviceVersionCode", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", Constants.JSON_FEATURE, "hasFeatureSw", "isTimexDevice", "isBluetoothEnable", "hasDestroy", "getBluetoothDevice", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "getChannelModule", "(Ljava/lang/Class;)Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleFactory;", "getChannelModuleFactory", "callNonConnected", "onConnectionStatusChangedInternal", "notifyBatteryChanged", "sha256", "publicKeyHash", "hashAlgo", "onGetSignData", "Lcom/xiaomi/hm/health/bt/profile/auth/HMAuthState;", "state", "onAuthentication", "isAutoReconnect", "getAuthInfo", "setAuthInfo", "Lcom/xiaomi/hm/health/bt/ife/IHMConnectionCallback;", "connectionCallback", "setConnectionCallback", "setAuthCallback", "getContext", "setDateTime", "setBatteryChangedCallback", "firmwareInfo", "updateFwUpgrades", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;", "getDfuApi", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "startSyncGpsData", "unbindSync", Configs.Params.RESET, "getModule", "Ljava/io/File;", "file", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "getDeviceLog", "terminateDeviceLog", "clearModule", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", "Lcom/xiaomi/hm/health/bt/device/IBleInterface;", "getBleInterface", "getHeartRateController", LogUtil.D, "Landroid/content/Context;", "E", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "mDeviceSource", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HmVirtualDevice extends HMMiLiDevice {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource mDeviceSource;

    public HmVirtualDevice(@NotNull Context context, @NotNull HMDeviceSource hMDeviceSource, @NotNull String str) {
        super(context, str);
        this.context = context;
        this.mDeviceSource = hMDeviceSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(IHMActivityDataCallback iHMActivityDataCallback) {
        if (iHMActivityDataCallback != null) {
            iHMActivityDataCallback.onSyncStart();
        }
        if (iHMActivityDataCallback == null) {
            return;
        }
        iHMActivityDataCallback.onSyncFinish(new HMDeviceSyncDataError(0));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void alert(@Nullable HMAlertModeExt mode, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public boolean alertSync(@Nullable HMAlertModeExt mode) {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    public AuthResult auth(@Nullable AuthInfo info, @Nullable IHMAuthCallback callback) {
        if (callback != null) {
            callback.onAuthentication(new HMAuthState(0));
        }
        return new AuthResult(0, OldProtocolSuccess.INSTANCE);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void bindWeixin(@Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean callNonConnected(@Nullable HMCallback<?> callback) {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void clearModule() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void create(boolean forceDirectly) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public <T> T createModule(@Nullable Class<T> clazz) {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    @Nullable
    public BaseProfile createProfile(@Nullable Context context, @Nullable BluetoothDevice device) {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void destroy() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void enableAtrialFib(boolean enable, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.IBleInterface
    public void enableConnectedAdv(boolean enable, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void enableFullHeartRate(boolean enable, int interval, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void enableHeartRate(boolean enable, int interval, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void enableRealtimeStep(boolean enable) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void enableSleepAssistHr(boolean enable, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    public AuthInfo getAuthInfo() {
        return new AuthInfo(false);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    @Nullable
    public BaseProfile getBaseProfile() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    public BatteryInfo getBatteryInfo() {
        return new BatteryInfo();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public IBleInterface getBleInterface() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public BluetoothDevice getBluetoothDevice() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public <T extends BaseModule> T getChannelModule(@Nullable Class<T> clazz) {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice, com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    @Nullable
    public ChannelModuleFactory getChannelModuleFactory() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void getConnectionParameters(@Nullable HMCallback<ConnectionParameters> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    public Context getContext() {
        return this.context;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void getDateTime(@Nullable HMCallback<Calendar> callBack) {
        if (callBack != null) {
            callBack.sendOnStartMessage();
        }
        if (callBack == null) {
            return;
        }
        callBack.onFinish(Calendar.getInstance());
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public DeviceInfo getDeviceInfo() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void getDeviceLog(@Nullable File file, @Nullable IHMDataCallback<File> callback) {
        if (callback != null) {
            callback.onStart();
        }
        if (callback == null) {
            return;
        }
        callback.onStop(file, new HMDeviceError(0));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    /* JADX INFO: renamed from: getDeviceSource, reason: from getter */
    public HMDeviceSource getMDeviceSource() {
        return this.mDeviceSource;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    @NotNull
    public Status getDeviceStatus() {
        return Status.AUTH_SUCCESS;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    public HMDeviceType getDeviceType() {
        return HMDeviceType.MILI;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public String getDeviceVersion() {
        return "";
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public int getDeviceVersionCode() {
        return 0;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public String getDeviceVersionFill() {
        return "";
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public DfuApi getDfuApi() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    @Nullable
    public HeartHealthApi getHeartHealthApi() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void getHeartRateConfig(@Nullable HMCallback<HeartRateConfig> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    @Nullable
    public HMHeartRateController getHeartRateController() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public <T> T getModule(@NotNull Class<T> clazz) {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.IBleInterface
    @NotNull
    public Mtu getMtu() {
        return Mtu.createDefault();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    /* JADX INFO: renamed from: getRealtimeStep */
    public RealtimeStep getStep() {
        return new RealtimeStep();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    @NotNull
    public RealtimeStep getRealtimeStepSync() {
        return new RealtimeStep();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    @NotNull
    public HMStatisticInfo getStatisticInfoInternal() {
        return new HMStatisticInfo();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    public SyncStatus getSyncStatus() {
        return new SyncStatus(new Progress(100, 100), new HMDeviceError(0));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void getUserInfo(@Nullable HMCallback<UserInfoExt> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public int getWatchSystemSettingsProtocolVersion() {
        return 0;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    @NotNull
    public byte[] getWeixinId(@Nullable String deviceId) {
        return new byte[0];
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean hasDestroy() {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean hasFeatureSw(int feature) {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void init(@Nullable MiLiHwConfig config, @Nullable HMCallback<?> callback) {
        callback.sendOnStartMessage();
        callback.sendOnFinishMessage(initSync(config));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public boolean initSync(@Nullable MiLiHwConfig config) {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isAutoReconnect() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isBluetoothEnable() {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isConnected() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isSyncingData() {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isTimexDevice() {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean needReconnect() {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    @Nullable
    public HMHeartRateController newHeartRateController() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void notifyBatteryChanged(@Nullable BatteryInfo info) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice, com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
    public void onAuthentication(@Nullable HMAuthState state) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.profile.base.IHMBatteryInfoCallback
    public void onBatteryChanged(@Nullable BatteryInfo info) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void onBtOff() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void onBtOn() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void onConnectionStatusChangedInternal(@Nullable BluetoothDevice device, @Nullable HMDeviceType type, @Nullable Status status) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnectTimeout() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnected() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceConnected(@Nullable BluetoothDevice device) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnecting() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceConnecting(@Nullable BluetoothDevice device) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceConnectionFailed(@Nullable BluetoothDevice device, int status) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceDisconnected() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceDisconnected(@Nullable BluetoothDevice device, int status) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceDiscovering(@Nullable BluetoothDevice device) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceDiscoveryFailed(@Nullable BluetoothDevice device, int status) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceDiscoverySuccess(@Nullable BluetoothDevice device) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice, com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
    @NotNull
    public byte[] onGetSignData(@Nullable byte[] sha256, @Nullable byte[] publicKeyHash, int hashAlgo) {
        return new byte[0];
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onInitializing(@Nullable BluetoothDevice device) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.profile.base.IRealtimeStepCallback
    public void onStepChanged(@Nullable RealtimeStep step) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.profile.mili.MiLiProfile.IVibrateNotifyListener
    public void onVibrate(@Nullable HMVibrateType type) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void reConnect() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void reConnect(boolean force) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public int readRemoteRssi() {
        return 0;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.IBleInterface
    public void requestConnectionPriority(int connectionPriority, @Nullable HMCallback<?> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.IBleInterface
    public void requestMtu(int mtu, @Nullable HMCallback<Integer> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean reset() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public boolean sendUpgradeInfo(@Nullable List<HMFirmwareInfo> firmwares) {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void setAlarmClock(@Nullable AlarmClockExt clockExt, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public boolean setAlarmSync(@Nullable List<AlarmClockExt> clocks) {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setAuthCallback(@Nullable IHMAuthCallback callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setAuthInfo(@Nullable AuthInfo info) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setAutoReconnect(boolean autoReconnect) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setBatteryChangedCallback(@Nullable HMCallback<BatteryInfo> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void setColorTheme(@Nullable HMColorTheme colorTheme, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setConnectionCallback(@Nullable IHMConnectionCallback connectionCallback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.IBleInterface
    public void setConnectionParameters(@Nullable ConnectionParameters parameters, @Nullable HMCallback<?> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public boolean setConnectionParameters(@Nullable ConnectionParameters parameters) {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setDateTime(@Nullable Calendar calendar, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.onStart();
        }
        if (callback == null) {
            return;
        }
        callback.sendFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean setDateTimeSync(@Nullable Calendar calendar) {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void setGoal(int goal, @Nullable HMCallback<?> callBack) {
        if (callBack != null) {
            callBack.sendOnStartMessage();
        }
        if (callBack == null) {
            return;
        }
        callBack.sendOnFinishMessage(setGoalSync(goal));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void setHeartRateInterval(int interval, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void setLatency(int minLatency, int maxLatency, @Nullable HMCallback<?> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public boolean setLatency(int minLatency, int maxLatency) {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.IBleInterface
    public void setPreferredPhy(int txPhy, int rxPhy, int phyOptions, @Nullable HMCallback<Phy> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setRealtimeStepCallback(@Nullable HMCallback<RealtimeStep> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void setUserInfo(@Nullable UserInfoExt infoExt, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void setVibrateNotifyCallback(@Nullable HMCallback<HMVibrateType> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void setWearLocation(@Nullable LocationExt location, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void startManualMeasureHr(@Nullable HMHeartRateController.IHeartRateCallback callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.huami.bluetooth.device.RealtimeHeartRateDevice
    public void startRealtimeMeasureHr(@NotNull HMHeartRateController.IHeartRateCallback callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void startSensorData(int type, @Nullable IHMSensorDataCallback callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void startSyncData(@Nullable Calendar calendar, @Nullable IHMActivityDataCallback callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void startSyncGpsData(@Nullable Calendar calendar, @Nullable HMCallback<List<GpsRecord>> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void startSyncGpsData(@Nullable Calendar calendar, @Nullable SyncDataCallback<? super List<GpsRecord>> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void stopManualMeasureHr() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.huami.bluetooth.device.RealtimeHeartRateDevice
    public void stopRealtimeMeasureHr() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void stopSensorData() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    @NotNull
    public Future<?> syncData(@Nullable Calendar calendar, @Nullable final IHMActivityDataCallback callback) {
        return submitOnDeviceOnlyThread(new Runnable() { // from class: r74
            @Override // java.lang.Runnable
            public final void run() {
                HmVirtualDevice.P0(callback);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void terminateDeviceLog() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void triggerPair(@Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean unbindSync(@Nullable AuthInfo info) {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void updateDeviceInfo(@Nullable DeviceInfo info) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void updateFwUpgrade(@Nullable HMFirmwareInfo info, @Nullable IHMFirmwareUpgradeCallback callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void updateFwUpgrades(@Nullable List<HMFirmwareInfo> firmwareInfo, @Nullable IHMFirmwareUpgradeCallback callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void alert(short time, short offsetTime, byte num, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void setAlarmClock(@Nullable List<AlarmClockExt> clocks, @Nullable HMCallback<?> callback) {
        if (callback != null) {
            callback.sendOnStartMessage();
        }
        if (callback == null) {
            return;
        }
        callback.sendOnFinishMessage(true);
    }
}
