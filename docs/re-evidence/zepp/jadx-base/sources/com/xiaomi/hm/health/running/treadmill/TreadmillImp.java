package com.xiaomi.hm.health.running.treadmill;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.HMLoginManager;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.moving.datacenter.SportConfigDbClient;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.device.SportUsingDeviceHandler;
import com.huami.moving.maps.GPSSportController;
import com.huami.moving.maps.track.TrackColorGradient;
import com.huami.moving.ui.utils.RunnerPeripheralInfo;
import com.huami.moving.webapi.PostRunningDataToServer;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.data.BoltRunnerData;
import com.huami.treadmill.data.BoltSportCommand;
import com.huami.treadmill.data.BoltSportState;
import com.huami.treadmill.data.ConnectStatus;
import com.huami.treadmill.data.ErrorStatus;
import com.huami.treadmill.data.HrTips;
import com.huami.treadmill.data.InMachineStatus;
import com.huami.treadmill.data.InProgress;
import com.huami.treadmill.data.InTreadmillData;
import com.huami.treadmill.data.MarkerList;
import com.huami.treadmill.data.SyncStatus;
import com.huami.treadmill.data.TdLineDetailRun;
import com.huami.treadmill.proxy.IBoltTreadmill;
import com.huami.watch.companion.dataflow.Constant;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.classic.HMSportController;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.ftms.FTMSCommand;
import com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener;
import com.xiaomi.hm.health.bt.profile.ftms.MachineStatus;
import com.xiaomi.hm.health.bt.profile.ftms.TreadmillData;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportKind;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.bolt.FtmsErrorHelper;
import com.xiaomi.hm.health.device.bolt.TreadmillErrorEvent;
import com.xiaomi.hm.health.device.bolt.TreadmillMaintainEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncGpsDataEvent;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.devicelib.DeviceHrEvent;
import com.xiaomi.hm.health.devicelib.HeartRateStatus;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.running.SportDetailPageNavigator;
import com.xiaomi.hm.health.running.treadmill.TreadmillImp;
import com.xiaomi.hm.health.running.treadmill.ext.DataExKt;
import com.xiaomi.hm.health.traininglib.webapi.RequestTrainingAPI;
import com.xiaomi.hm.health.ui.sportfitness.manager.SportDeviceManager;
import com.xiaomi.hm.health.ui.sportfitness.utils.SportUseGaodeMapChecker;
import de.greenrobot.event.EventBus;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b§\u0001\u0010¨\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J+\u0010\u0015\u001a\u00020\n2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\u000fH\u0016J+\u0010\u0017\u001a\u00020\n2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\u000fH\u0016J+\u0010\u0018\u001a\u00020\n2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\u000fH\u0016J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJD\u0010 \u001a\u00020\n2:\u0010\u0014\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\n0\u001bH\u0016J+\u0010#\u001a\u00020\n2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\n0\u000fH\u0016J\b\u0010$\u001a\u00020\nH\u0016J\b\u0010%\u001a\u00020\nH\u0016J\n\u0010'\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0006H\u0016J\n\u0010+\u001a\u0004\u0018\u00010*H\u0016J\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020\nH\u0016J\u000e\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020.J\u000e\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u000201J\u000e\u00100\u001a\u00020\n2\u0006\u00103\u001a\u000202J\u000e\u00100\u001a\u00020\n2\u0006\u00105\u001a\u000204J\u000e\u00100\u001a\u00020\n2\u0006\u00107\u001a\u000206J\n\u00108\u001a\u0004\u0018\u00010\u0016H\u0016J:\u0010B\u001a\u00020\n2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010A\u001a\u00020@H\u0016J\u0011\u0010C\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bC\u0010\u001aJ\u0011\u0010D\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bD\u0010\u001aJ\u0011\u0010E\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bE\u0010FJ\u0011\u0010G\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bG\u0010FJ\u0010\u0010H\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0006H\u0016J\u0018\u0010K\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u0006H\u0016J\u0011\u0010L\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bL\u0010\u001aJ\u0011\u0010M\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bM\u0010\u001aJ^\u0010S\u001a\u0004\u0018\u00010\u00022K\u0010\u0014\u001aG\u0012\u0013\u0012\u00110O¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110P¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(R\u0012\u0004\u0012\u00020\n0NH\u0016¢\u0006\u0004\bS\u0010TJ\u0010\u0010V\u001a\u00020\n2\u0006\u0010U\u001a\u00020\u0004H\u0016J\b\u0010W\u001a\u00020\nH\u0016J\n\u0010Y\u001a\u0004\u0018\u00010XH\u0016J\u0010\u0010Z\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0016J2\u0010b\u001a\u00020\n2\u0006\u0010:\u001a\u0002092\u0006\u0010\\\u001a\u00020[2\u0006\u0010^\u001a\u00020]2\b\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010a\u001a\u00020\u0006H\u0016J\b\u0010c\u001a\u00020\nH\u0016J\b\u0010d\u001a\u00020\nH\u0016J\b\u0010e\u001a\u00020\nH\u0016J\u0010\u0010g\u001a\u00020\n2\u0006\u0010f\u001a\u00020\u0006H\u0016J&\u0010l\u001a\u00020\n2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020i0h2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u0002H\u0016J\u0012\u0010o\u001a\u00020\n2\b\u0010n\u001a\u0004\u0018\u00010mH\u0016J\b\u0010p\u001a\u00020\nH\u0016J\u0018\u0010t\u001a\u00020\n2\u0006\u0010r\u001a\u00020q2\u0006\u0010s\u001a\u00020iH\u0016J\u0010\u0010v\u001a\u00020\n2\u0006\u0010u\u001a\u00020_H\u0016J\u0010\u0010x\u001a\u00020\n2\u0006\u0010w\u001a\u00020\u0002H\u0016J\u0010\u0010y\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0016J\u0010\u0010z\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0016J\u0010\u0010{\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0016J\u0010\u0010|\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0016J\u001a\u0010~\u001a\u00020\n2\u0006\u0010:\u001a\u0002092\b\u0010}\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u007f\u001a\u00020\u0002H\u0016R\"\u0010\u0083\u0001\u001a\u000b \u0080\u0001*\u0004\u0018\u00010\u00040\u00048\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R$\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008a\u00018B@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R=\u0010\u0092\u0001\u001a&\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fj\u0005\u0018\u0001`\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0091\u0001Rf\u0010\u0095\u0001\u001aP\u0012\u0013\u0012\u00110O¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110P¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(Q\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(R\u0012\u0004\u0012\u00020\n\u0018\u00010Nj\u0005\u0018\u0001`\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\b\u0010\u0094\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0003\u0010\u0096\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R=\u0010\u009e\u0001\u001a&\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fj\u0005\u0018\u0001`\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0091\u0001R>\u0010¢\u0001\u001a'\u0012\u0014\u0012\u00120\u0002¢\u0006\r\b\u0011\u0012\t\b\u0012\u0012\u0005\b\b(\u009f\u0001\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fj\u0005\u0018\u0001` \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0091\u0001R\u0019\u0010¤\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\b\n\u0006\b£\u0001\u0010\u0088\u0001R\u0019\u0010¦\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\b\n\u0006\b¥\u0001\u0010\u0088\u0001¨\u0006©\u0001"}, d2 = {"Lcom/xiaomi/hm/health/running/treadmill/TreadmillImp;", "Lcom/huami/treadmill/proxy/IBoltTreadmill;", "", "g", "", "bulk", "", "index", "f", "speed", "", "adjustSpeed", "hasBoundBolt", "isConnectedBolt", "resumeTreadmill", "Lkotlin/Function1;", "Lcom/huami/treadmill/data/ConnectStatus;", "Lkotlin/ParameterName;", "name", "status", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setConnectedListener", "Lcom/huami/treadmill/data/ErrorStatus;", "setErrorStatusListener", "setMaintainStatusListener", "getMaintainStatus", "()Ljava/lang/Boolean;", "Lkotlin/Function2;", "Lcom/huami/treadmill/data/InTreadmillData;", "treadmillData", "Lcom/huami/treadmill/data/InMachineStatus;", "machineStatus", "setFTMSListener", "Lcom/huami/treadmill/data/BoltSportCommand;", "command", "setSportListener", "stopTreadmill", "connectBolt", "Lcom/huami/treadmill/data/BoltRunnerData;", "getRunnerData", Constants.DATA_KEY_HR, "syncHr", "Lcom/huami/treadmill/data/HrTips;", "getHrDeviceStatus", "registerEventBus", "unregisterEventBus", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/devicelib/DeviceHrEvent;", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncGpsDataEvent;", "syncEvent", "Lcom/xiaomi/hm/health/device/bolt/TreadmillErrorEvent;", "errorEvent", "Lcom/xiaomi/hm/health/device/bolt/TreadmillMaintainEvent;", "maintainEvent", "getErrorStatus", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/app/Activity;", "belongActivity", "isRoutLine", "Lcom/huami/treadmill/data/TdLineDetailRun;", "lineDetail", "", "lineId", "showDetail", "getConfigScreenOnState", "getConfigVoicePlay", "getConfigRemindHeartRate", "()Ljava/lang/Integer;", "getConfigRemindPace", "vibrateHr", "pace", "remindPace", "vibratePace", "getConfigRemindHREnable", "getConfigRemindPaceEnable", "Lkotlin/Function3;", "Lcom/huami/treadmill/data/SyncStatus;", "Lcom/huami/treadmill/data/InProgress;", "progress", "result", "syncBoltGpsData", "(Lkotlin/jvm/functions/Function3;)Ljava/lang/Boolean;", "mac", "syncMacAddress", "stopAndDelete", "Lcom/huami/treadmill/data/BoltSportState;", "getSportState", "mapInit", "Landroidx/fragment/app/FragmentManager;", "fragment", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "paramBundle", "mode", "mapInitGPSSolution", "mapPause", "mapResume", "mapDestroy", "darkColor", "mapSetBackgroundColor", "", "Lcom/huami/mifit/sportlib/model/GPSPoint;", "pointList", "isDot", "mapOnGPSLineInfoChanged", "", "speeds", "mapSetSpeedScope", "mapRemoveAllLineMarker", "Lcom/huami/treadmill/data/MarkerList;", "markers", "pointMe", "mapAddLineMarker", "outState", "mapSaveInstanceState", "enable", "setAllGesturesEnabled", "sportStart", "sportStop", "sportPause", "sportResume", "url", "launchWeb", "isOverSea", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "tag", "b", "Ljava/lang/Integer;", "heartStatus", "c", LogUtil.I, Constant.KEY_HR_VALUE, "Lcom/xiaomi/hm/health/bt/device/HMBoltClassicDevice;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMBoltClassicDevice;", "e", "()Lcom/xiaomi/hm/health/bt/device/HMBoltClassicDevice;", "boltClassicDevice", "Lcom/xiaomi/hm/health/running/treadmill/ConnectStatusListener;", "Lkotlin/jvm/functions/Function1;", "mConnectStatusListener", "Lcom/xiaomi/hm/health/running/treadmill/SyncStatusListener;", "Lkotlin/jvm/functions/Function3;", "mSyncStatusListener", "Z", "mSyncOnce", "Lcom/huami/moving/maps/GPSSportController;", "h", "Lcom/huami/moving/maps/GPSSportController;", "mMapController", "Lcom/xiaomi/hm/health/running/treadmill/ErrorStatusListener;", "i", "mErrorStatusListener", "show", "Lcom/xiaomi/hm/health/running/treadmill/MaintainStatusListener;", z.j, "mMaintainStatusListener", hl.k, "TREADMILL_ERROR_EMERGENCY_BRAKING", "l", "TREADMILL_ERROR_EMERGENCY_BRAKING_STOP", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TreadmillImp implements IBoltTreadmill {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Integer heartStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int heartRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private HMBoltClassicDevice boltClassicDevice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function1<? super ConnectStatus, Unit> mConnectStatusListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Function3<? super SyncStatus, ? super InProgress, ? super Boolean, Unit> mSyncStatusListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean mSyncOnce;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private GPSSportController mMapController;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Function1<? super ErrorStatus, Unit> mErrorStatusListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Boolean, Unit> mMaintainStatusListener;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String tag = TreadmillImp.class.getSimpleName();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int TREADMILL_ERROR_EMERGENCY_BRAKING = 7;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int TREADMILL_ERROR_EMERGENCY_BRAKING_STOP = 8;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SportCommand.values().length];
            iArr[SportCommand.PAUSE.ordinal()] = 1;
            iArr[SportCommand.START.ordinal()] = 2;
            iArr[SportCommand.RESUME.ordinal()] = 3;
            iArr[SportCommand.STOP.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HMSportController.TreadmillSportState.values().length];
            iArr2[HMSportController.TreadmillSportState.RUNNING.ordinal()] = 1;
            iArr2[HMSportController.TreadmillSportState.PAUSED.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSyncGpsDataEvent a;
        public final /* synthetic */ TreadmillImp b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceSyncGpsDataEvent hMDeviceSyncGpsDataEvent, TreadmillImp treadmillImp) {
            super(0);
            this.a = hMDeviceSyncGpsDataEvent;
            this.b = treadmillImp;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "syncEvent: " + this.a + " mSyncOnce: " + this.b.mSyncOnce;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "";
        }
    }

    public TreadmillImp() {
        EventBus.getDefault().register(this);
    }

    private final HMBoltClassicDevice e() {
        HMBoltClassicDevice hMBoltClassicDevice;
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.TREADMILL);
        boolean z = device instanceof HMBoltClassicDevice;
        if (z) {
            hMBoltClassicDevice = (HMBoltClassicDevice) device;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            hMBoltClassicDevice = null;
        }
        this.boltClassicDevice = hMBoltClassicDevice;
        return hMBoltClassicDevice;
    }

    private final String f(String bulk, int index) {
        int i;
        if (index > 0) {
            int i2 = 0;
            i = 0;
            do {
                i2++;
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) bulk, ";", i + 1, false, 4, (Object) null);
                if (iIndexOf$default <= 0) {
                    break;
                }
                i = iIndexOf$default;
            } while (i2 < index);
        } else {
            i = 0;
        }
        return bulk.substring(0, i);
    }

    private final boolean g() {
        return BluetoothAdapter.getDefaultAdapter() != null && BluetoothAdapter.getDefaultAdapter().isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Function1 function1, SportCommand sportCommand) {
        int i = sportCommand == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sportCommand.ordinal()];
        if (i == 1) {
            function1.invoke(BoltSportCommand.PAUSE);
            return;
        }
        if (i == 2) {
            function1.invoke(BoltSportCommand.START);
        } else if (i == 3) {
            function1.invoke(BoltSportCommand.RESUME);
        } else {
            if (i != 4) {
                return;
            }
            function1.invoke(BoltSportCommand.STOP);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(Ref.ObjectRef objectRef, Trackrecord trackrecord, Subscriber subscriber) {
        RequestTrainingAPI.reqTrainingRecordSyncForTreadmill((TrainingRecord) objectRef.element, trackrecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Throwable th) {
        HMLog.warn$default(null, th, b.a, 1, null);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void adjustSpeed(int speed) {
        HMBoltClassicDevice hMBoltClassicDeviceE = e();
        if (hMBoltClassicDeviceE == null) {
            return;
        }
        hMBoltClassicDeviceE.sendFTMSCommand(new FTMSCommand(23, speed), new HMCallback<Void>() { // from class: com.xiaomi.hm.health.running.treadmill.TreadmillImp.adjustSpeed.1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
            }
        });
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void connectBolt() {
        HMDeviceManager.getInstance().createDevice(HMDeviceType.TREADMILL);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Boolean getConfigRemindHREnable() {
        return SportConfigDbClient.getConfig(25).getRemindHREnable().booleanValue() ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Integer getConfigRemindHeartRate() {
        return SportConfigDbClient.getConfig(25).getRemindHeartRate();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Integer getConfigRemindPace() {
        return SportConfigDbClient.getConfig(25).getRemindPace();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Boolean getConfigRemindPaceEnable() {
        return SportConfigDbClient.getConfig(25).getRemindPaceEnable().booleanValue() ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Boolean getConfigScreenOnState() {
        return SportConfigDbClient.getConfig(25).getKeepScreenOn().booleanValue() ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Boolean getConfigVoicePlay() {
        return SportConfigDbClient.getConfig(25).getVoicePlayEnable().booleanValue() ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public ErrorStatus getErrorStatus() {
        int errorCode = FtmsErrorHelper.INSTANCE.getErrorCode();
        if (errorCode == -1) {
            return ErrorStatus.NONE;
        }
        if (errorCode == this.TREADMILL_ERROR_EMERGENCY_BRAKING) {
            return ErrorStatus.BRAKING;
        }
        return errorCode == this.TREADMILL_ERROR_EMERGENCY_BRAKING_STOP ? ErrorStatus.BRAKING_STOP : ErrorStatus.BRAKING;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public HrTips getHrDeviceStatus() {
        if (!SportUsingDeviceHandler.getInstance().isValidHrDevices()) {
            return HrTips.NO_HEART_RATE_DEVICE;
        }
        if (!g()) {
            return HrTips.BLUETOOTH_NO_ON;
        }
        if (SportUsingDeviceHandler.getInstance().isHrDeviceConnected()) {
            Integer num = this.heartStatus;
            if (!HeartRateStatus.isDisconnected(num == null ? 0 : num.intValue())) {
                return HrTips.NO_TIPS;
            }
        }
        return HrTips.DEVICE_DISCONNECTED;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Boolean getMaintainStatus() {
        return Boolean.valueOf(HMKeeper.needMaintain());
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public BoltRunnerData getRunnerData() {
        RunningManager.setOrUpdateRunnerData();
        RunnerData runner = RunnerData.getRunner();
        RunnerPeripheralInfo runnerPeripheralInfo = RunnerPeripheralInfo.getInstance();
        return new BoltRunnerData(runner.isMetric(), runner.getUid(), runner.getAge(), runner.getWeight(), runner.getHeight(), runner.getGender(), runner.isPlay(), runnerPeripheralInfo.getAvatarUrl(), runnerPeripheralInfo.getAvatarPath(), runnerPeripheralInfo.getName(), runnerPeripheralInfo.isChinaUser());
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public BoltSportState getSportState() {
        HMBoltClassicDevice hMBoltClassicDeviceE = e();
        HMSportController.TreadmillSportState sportState = hMBoltClassicDeviceE == null ? null : hMBoltClassicDeviceE.getSportState();
        int i = sportState == null ? -1 : WhenMappings.$EnumSwitchMapping$1[sportState.ordinal()];
        if (i != 1) {
            return i != 2 ? BoltSportState.NONE : BoltSportState.PAUSED;
        }
        return BoltSportState.RUNNING;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public boolean hasBoundBolt() {
        return HMDeviceManager.getInstance().hasBound(HMDeviceSource.OTHER_BOLT) || HMDeviceManager.getInstance().hasBound(HMDeviceSource.OTHER_BOLT_SECOND);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public boolean isConnectedBolt() {
        HMBoltClassicDevice hMBoltClassicDeviceE = e();
        if (hMBoltClassicDeviceE == null) {
            return false;
        }
        return hMBoltClassicDeviceE.isConnected();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public boolean isOverSea() {
        return (Language.isSimplifiedChinese() && HMLoginManager.isInChina()) ? false : true;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void launchWeb(@NotNull Context context, @Nullable String url) {
        WebHelper.launch(url);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapAddLineMarker(@NotNull MarkerList markers, @NotNull GPSPoint pointMe) {
        GPSSportController gPSSportController = this.mMapController;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.addLineMarker(markers.getPointList(), markers.getViewList(), markers.getRefreshList(), markers.isMeList());
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapDestroy() {
        GPSSportController gPSSportController = this.mMapController;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.destroyMap();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapInit(@NotNull Context context) {
        this.mMapController = new GPSSportController(context, 25);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapInitGPSSolution(@NotNull Context context, @NotNull FragmentManager fragment, @NotNull View view, @Nullable Bundle paramBundle, int mode) {
        boolean zCheckUseGaodeMap = SportUseGaodeMapChecker.INSTANCE.checkUseGaodeMap(context);
        GPSSportController gPSSportController = this.mMapController;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.initGPSSolution(context, fragment, view, paramBundle, mode, zCheckUseGaodeMap, true);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapOnGPSLineInfoChanged(@NotNull List<? extends GPSPoint> pointList, int index, boolean isDot) {
        GPSSportController gPSSportController;
        int color = isDot ? Color.parseColor("#B2B2B2") : Color.parseColor("#38F3E1");
        GPSSportController gPSSportController2 = this.mMapController;
        if (gPSSportController2 != null) {
            gPSSportController2.onRouteGPSLineInfoChanged(pointList, index, isDot, RouteLineInfo.createMarkSEInfo(false, true, true, color));
        }
        if (!isDot || (gPSSportController = this.mMapController) == null) {
            return;
        }
        gPSSportController.setRouteCenter(pointList.get(0));
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapPause() {
        GPSSportController gPSSportController = this.mMapController;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.pauseMap();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapRemoveAllLineMarker() {
        GPSSportController gPSSportController = this.mMapController;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.removeAllLineMarker();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapResume() {
        GPSSportController gPSSportController = this.mMapController;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.resumeMap();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapSaveInstanceState(@NotNull Bundle outState) {
        GPSSportController gPSSportController = this.mMapController;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.saveInstanceStateMap(outState);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapSetBackgroundColor(int darkColor) {
        GPSSportController gPSSportController = this.mMapController;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.setDarkBackgroundColor(darkColor);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void mapSetSpeedScope(@Nullable float[] speeds) {
        TrackColorGradient.setSpeedScope(speeds);
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        Function1<? super ConnectStatus, Unit> function1;
        if (event.getDeviceType() != HMDeviceType.TREADMILL) {
            return;
        }
        if (event.isConnected()) {
            Function1<? super ConnectStatus, Unit> function2 = this.mConnectStatusListener;
            if (function2 == null) {
                return;
            }
            function2.invoke(ConnectStatus.CONNECTED);
            return;
        }
        if (event.isConnecting()) {
            Function1<? super ConnectStatus, Unit> function3 = this.mConnectStatusListener;
            if (function3 == null) {
                return;
            }
            function3.invoke(ConnectStatus.CONNECTING);
            return;
        }
        if (event.isConnectingTimeout()) {
            Function1<? super ConnectStatus, Unit> function4 = this.mConnectStatusListener;
            if (function4 == null) {
                return;
            }
            function4.invoke(ConnectStatus.CONNECTING_TIMEOUT);
            return;
        }
        if (!event.isDisconnected() || (function1 = this.mConnectStatusListener) == null) {
            return;
        }
        function1.invoke(ConnectStatus.DISCONNECTED);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void registerEventBus() {
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void resumeTreadmill() {
        HMBoltClassicDevice hMBoltClassicDeviceE = e();
        if (hMBoltClassicDeviceE == null) {
            return;
        }
        hMBoltClassicDeviceE.sendSportCommand(SportCommand.RESUME, null, new HMCallback<Void>() { // from class: com.xiaomi.hm.health.running.treadmill.TreadmillImp.resumeTreadmill.1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
            }
        });
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void setAllGesturesEnabled(boolean enable) {
        GPSSportController gPSSportController = this.mMapController;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.setAllGesturesEnabled(enable);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void setConnectedListener(@NotNull Function1<? super ConnectStatus, Unit> listener) {
        this.mConnectStatusListener = listener;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void setErrorStatusListener(@NotNull Function1<? super ErrorStatus, Unit> listener) {
        this.mErrorStatusListener = listener;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void setFTMSListener(@NotNull final Function2<? super InTreadmillData, ? super InMachineStatus, Unit> listener) {
        HMBoltClassicDevice hMBoltClassicDeviceE = e();
        if (hMBoltClassicDeviceE == null) {
            return;
        }
        hMBoltClassicDeviceE.setFTMSListener(new IFTMSListener() { // from class: com.xiaomi.hm.health.running.treadmill.TreadmillImp.setFTMSListener.1
            @Override // com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener
            public void onMachineStatus(@Nullable MachineStatus status) {
                listener.invoke(null, DataExKt.toInMachineStatus(status));
            }

            @Override // com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener
            public void onTreadmillData(@Nullable TreadmillData data) {
                if (data != null) {
                    data.setHeartRate(TreadmillImp.this.heartRate);
                }
                listener.invoke(DataExKt.toInTreadmillData(data), null);
            }
        });
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void setMaintainStatusListener(@NotNull Function1<? super Boolean, Unit> listener) {
        this.mMaintainStatusListener = listener;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void setSportListener(@NotNull final Function1<? super BoltSportCommand, Unit> listener) {
        HMBoltClassicDevice hMBoltClassicDeviceE = e();
        if (hMBoltClassicDeviceE == null) {
            return;
        }
        hMBoltClassicDeviceE.sendSportConfig(new SportConfig(SportKind.INDOOR), new IHMSportListener() { // from class: gz7
            @Override // com.xiaomi.hm.health.bt.profile.sport.IHMSportListener
            public final void onSportCommand(SportCommand sportCommand) {
                TreadmillImp.h(listener, sportCommand);
            }
        }, new HMCallback<Void>() { // from class: com.xiaomi.hm.health.running.treadmill.TreadmillImp.setSportListener.2
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, com.xiaomi.hm.health.databases.model.trainning.TrainingRecord] */
    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void showDetail(@NotNull Context context, @NotNull Activity belongActivity, boolean isRoutLine, @Nullable TdLineDetailRun lineDetail, int index, long lineId) {
        Integer type;
        TrackDataManager.getInstance().clearData();
        final Trackrecord latestTrackRecord = TrackRecordManager.getInstance().getLatestTrackRecord();
        if (latestTrackRecord == null || (type = latestTrackRecord.getType()) == null || type.intValue() != 25) {
            return;
        }
        if (isRoutLine) {
            latestTrackRecord.setType(26);
            SyncedState syncedState = SyncedState.STATE_UNSYNCED;
            latestTrackRecord.setState(Integer.valueOf(syncedState.getValue()));
            latestTrackRecord.setSynced(Integer.valueOf(syncedState.getValue()));
            TrackRecordManager.getInstance().updateTrackRecord(latestTrackRecord);
            boolean z = false;
            Trackdata trackData = TrackRecordManager.getInstance().getTrackData(latestTrackRecord.getTrackid().longValue(), latestTrackRecord.getSource().intValue());
            if (trackData == null) {
                trackData = new Trackdata();
                trackData.setSource(latestTrackRecord.getSource());
                trackData.setType(latestTrackRecord.getType());
                trackData.setTrackid(latestTrackRecord.getTrackid());
                trackData.setSegment(1);
                trackData.setV(latestTrackRecord.getV());
                trackData.setSize(latestTrackRecord.getSize());
                z = true;
            }
            trackData.setBulkll(f(lineDetail == null ? null : lineDetail.getLineDetailRunLongitudeLatitude(), index));
            trackData.setBulkflag(f(lineDetail == null ? null : lineDetail.getLineDetailRunFlag(), index));
            trackData.setBulkal(f(lineDetail == null ? null : lineDetail.getLineDetailRunAltitude(), index));
            trackData.setBulktime(f(lineDetail == null ? null : lineDetail.getLineDetailRunTime(), index));
            if (z) {
                TrackRecordManager.getInstance().insertDetailIfNotExist(trackData);
            } else {
                TrackRecordManager.getInstance().insertOrReplaceDetailData(trackData);
            }
            PostRunningDataToServer.postRunningData(null);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? trainingRecord = new TrainingRecord();
            objectRef.element = trainingRecord;
            ((TrainingRecord) trainingRecord).trainingId = Long.valueOf(lineId);
            ((TrainingRecord) objectRef.element).startTime = latestTrackRecord.getTrackid();
            ((TrainingRecord) objectRef.element).endTime = latestTrackRecord.getEndtime();
            ((TrainingRecord) objectRef.element).duration = Long.valueOf(latestTrackRecord.getCosttime().intValue() * 1000);
            ((TrainingRecord) objectRef.element).consumption = latestTrackRecord.getCal();
            ((TrainingRecord) objectRef.element).createTime = Long.valueOf(System.currentTimeMillis());
            Observable.unsafeCreate(new Observable.OnSubscribe() { // from class: hz7
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    TreadmillImp.i(objectRef, latestTrackRecord, (Subscriber) obj);
                }
            }).subscribeOn(Schedulers.io()).subscribe(new Action1() { // from class: jz7
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    TreadmillImp.j(obj);
                }
            }, new Action1() { // from class: iz7
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    TreadmillImp.k((Throwable) obj);
                }
            });
        }
        new SportDetailPageNavigator(context).jump2DetailPageForTreadmill(HistoryRecord.convertTrackRecord(latestTrackRecord), context, belongActivity);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void sportPause(@NotNull Context context) {
        SportDeviceManager sportDeviceManager = SportDeviceManager.getInstance(context);
        if (sportDeviceManager == null) {
            return;
        }
        sportDeviceManager.sportPause(0);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void sportResume(@NotNull Context context) {
        SportDeviceManager sportDeviceManager = SportDeviceManager.getInstance(context);
        if (sportDeviceManager == null) {
            return;
        }
        sportDeviceManager.sportResume(0);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void sportStart(@NotNull Context context) {
        SportDeviceManager sportDeviceManager = SportDeviceManager.getInstance(context);
        if (sportDeviceManager == null) {
            return;
        }
        sportDeviceManager.sportStart(0);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void sportStop(@NotNull Context context) {
        SportDeviceManager sportDeviceManager = SportDeviceManager.getInstance(context);
        if (sportDeviceManager == null) {
            return;
        }
        sportDeviceManager.sportStop(0);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void stopAndDelete() {
        HMBoltClassicDevice hMBoltClassicDeviceE = e();
        if (hMBoltClassicDeviceE == null) {
            return;
        }
        hMBoltClassicDeviceE.sendFTMSCommand(new FTMSCommand(24, 0), new HMCallback<Void>() { // from class: com.xiaomi.hm.health.running.treadmill.TreadmillImp.stopAndDelete.1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
            }
        });
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void stopTreadmill() {
        HMBoltClassicDevice hMBoltClassicDeviceE = e();
        if (hMBoltClassicDeviceE == null) {
            return;
        }
        hMBoltClassicDeviceE.sendSportCommand(SportCommand.STOP, null, new HMCallback<Void>() { // from class: com.xiaomi.hm.health.running.treadmill.TreadmillImp.stopTreadmill.1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
            }
        });
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    @Nullable
    public Boolean syncBoltGpsData(@NotNull Function3<? super SyncStatus, ? super InProgress, ? super Boolean, Unit> listener) {
        this.mSyncOnce = true;
        this.mSyncStatusListener = listener;
        if (!HMDeviceManager.getInstance().isConnected(HMDeviceType.TREADMILL)) {
            return Boolean.FALSE;
        }
        if (HMDeviceManager.getInstance().startSyncBoltGpsData()) {
            return Boolean.TRUE;
        }
        this.mSyncOnce = false;
        return Boolean.FALSE;
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void syncHr(int hr) {
        HMBoltClassicDevice hMBoltClassicDeviceE = e();
        if ((hMBoltClassicDeviceE == null ? null : hMBoltClassicDeviceE.getSportState()) == HMSportController.TreadmillSportState.NONE) {
            return;
        }
        this.heartRate = hr;
        HMBoltClassicDevice hMBoltClassicDeviceE2 = e();
        if (hMBoltClassicDeviceE2 == null) {
            return;
        }
        hMBoltClassicDeviceE2.syncHr(hr, new HMCallback<Void>() { // from class: com.xiaomi.hm.health.running.treadmill.TreadmillImp.syncHr.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.running.treadmill.TreadmillImp$syncHr$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "syncHr result:" + this.a;
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
                HMLog.debug(TreadmillImp.this.tag, new a(result));
            }
        });
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void syncMacAddress(@NotNull String mac) {
        HMDeviceManager.syncMacAddress();
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void unregisterEventBus() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void vibrateHr(int hr) {
        DeviceCenter.getInstance().vibrateHrSingle(hr);
    }

    @Override // com.huami.treadmill.proxy.IBoltTreadmill
    public void vibratePace(int pace, int remindPace) {
        DeviceCenter deviceCenter = DeviceCenter.getInstance();
        Integer configRemindPace = getConfigRemindPace();
        deviceCenter.vibratePace(pace, remindPace, configRemindPace == null ? 0 : configRemindPace.intValue());
    }

    public final void onEventMainThread(@NotNull DeviceHrEvent event) {
        this.heartStatus = Integer.valueOf(event.getState());
    }

    public final void onEventMainThread(@NotNull HMDeviceSyncGpsDataEvent syncEvent) {
        HMLog.info(this.tag, new a(syncEvent, this));
        if (syncEvent.getDeviceType() == HMDeviceType.TREADMILL && this.mSyncOnce) {
            if (syncEvent.isStart()) {
                Function3<? super SyncStatus, ? super InProgress, ? super Boolean, Unit> function3 = this.mSyncStatusListener;
                if (function3 == null) {
                    return;
                }
                function3.invoke(SyncStatus.START, DataExKt.toInProgress(syncEvent.getProgress()), Boolean.valueOf(syncEvent.isSuccess()));
                return;
            }
            if (syncEvent.isProgress()) {
                Function3<? super SyncStatus, ? super InProgress, ? super Boolean, Unit> function4 = this.mSyncStatusListener;
                if (function4 == null) {
                    return;
                }
                function4.invoke(SyncStatus.PROGRESS, DataExKt.toInProgress(syncEvent.getProgress()), Boolean.valueOf(syncEvent.isSuccess()));
                return;
            }
            if (syncEvent.isStop()) {
                Function3<? super SyncStatus, ? super InProgress, ? super Boolean, Unit> function5 = this.mSyncStatusListener;
                if (function5 != null) {
                    function5.invoke(SyncStatus.STOP, DataExKt.toInProgress(syncEvent.getProgress()), Boolean.valueOf(syncEvent.isSuccess()));
                }
                this.mSyncOnce = false;
            }
        }
    }

    public final void onEventMainThread(@NotNull TreadmillErrorEvent errorEvent) {
        Function1<? super ErrorStatus, Unit> function1;
        int errorCode = errorEvent.getErrorCode();
        if (errorCode == -1) {
            Function1<? super ErrorStatus, Unit> function2 = this.mErrorStatusListener;
            if (function2 == null) {
                return;
            }
            function2.invoke(ErrorStatus.NONE);
            return;
        }
        if (errorCode == this.TREADMILL_ERROR_EMERGENCY_BRAKING) {
            Function1<? super ErrorStatus, Unit> function3 = this.mErrorStatusListener;
            if (function3 == null) {
                return;
            }
            function3.invoke(ErrorStatus.BRAKING);
            return;
        }
        if (errorCode != this.TREADMILL_ERROR_EMERGENCY_BRAKING_STOP || (function1 = this.mErrorStatusListener) == null) {
            return;
        }
        function1.invoke(ErrorStatus.BRAKING_STOP);
    }

    public final void onEventMainThread(@NotNull TreadmillMaintainEvent maintainEvent) {
        Function1<? super Boolean, Unit> function1 = this.mMaintainStatusListener;
        if (function1 == null) {
            return;
        }
        function1.invoke(Boolean.valueOf(maintainEvent.getMaintain()));
    }
}
