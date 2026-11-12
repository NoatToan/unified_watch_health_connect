package com.xiaomi.hm.health.device.setting.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.health.Health;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.user.HealthConfig;
import com.huami.device.feature.health.user.HealthSettingConfig;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.devicex.manager.IScreenUnLockSupporter;
import com.huami.devicex.manager.UnlockScreenFactory;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.model.HMDisplayType;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMProDisplayItem;
import com.xiaomi.hm.health.bt.model.HmLocale;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.device.realtimedata.IRealtimeData;
import com.xiaomi.hm.health.device.realtimedata.RealtimeDataVo;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.device.setting.life.feature.vo.JSAppStoreVo;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel;
import com.xiaomi.hm.health.device.setting.vo.AppsItemVo;
import com.xiaomi.hm.health.device.setting.vo.BatteryTipsDialogVo;
import com.xiaomi.hm.health.device.setting.vo.BroadcastVo;
import com.xiaomi.hm.health.device.setting.vo.DeviceLanguageVo;
import com.xiaomi.hm.health.device.setting.vo.DevicePwdVo;
import com.xiaomi.hm.health.device.setting.vo.DeviceUnlockScreenVo;
import com.xiaomi.hm.health.device.setting.vo.DisplayItemVo;
import com.xiaomi.hm.health.device.setting.vo.EsimVo;
import com.xiaomi.hm.health.device.setting.vo.FindMiliVo;
import com.xiaomi.hm.health.device.setting.vo.FlipWristVo;
import com.xiaomi.hm.health.device.setting.vo.GesScreenVo;
import com.xiaomi.hm.health.device.setting.vo.HrDetectVo;
import com.xiaomi.hm.health.device.setting.vo.LightColorVo;
import com.xiaomi.hm.health.device.setting.vo.LongPressKeyItemVo;
import com.xiaomi.hm.health.device.setting.vo.NightModeVo;
import com.xiaomi.hm.health.device.setting.vo.OffWistLockVo;
import com.xiaomi.hm.health.device.setting.vo.PreviewMessageVo;
import com.xiaomi.hm.health.device.setting.vo.RingTypeSettingVo;
import com.xiaomi.hm.health.device.setting.vo.ShortcutSettingVo;
import com.xiaomi.hm.health.device.setting.vo.SleepAssistantVo;
import com.xiaomi.hm.health.device.setting.vo.SpiteBindingVo;
import com.xiaomi.hm.health.device.setting.vo.SportHrBroadCastVo;
import com.xiaomi.hm.health.device.setting.vo.StartOfWeekSettingVo;
import com.xiaomi.hm.health.device.setting.vo.TimeStyleVo;
import com.xiaomi.hm.health.device.setting.vo.VibrateSettingVo;
import com.xiaomi.hm.health.device.setting.vo.WearStyleSettingVo;
import com.xiaomi.hm.health.device.setting.vo.WeatherSettingVo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMNightModeConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMSportHRBroadcastConfig;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 \u0082\u00022\u00020\u00012\u00020\u0002:\u0002\u0082\u0002B\u0019\u0012\u0006\u0010x\u001a\u00020u\u0012\u0006\u0010s\u001a\u00020r¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\n\u001a\u00020\tJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0010J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bJ\u000e\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0010J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bJ\u001e\u0010!\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fJ\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000bJ\u000e\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u000bJ\u000e\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020)J\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u000bJ\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u000bJ\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u000bJ\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u000bJ?\u0010<\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\t052!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\t07J\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u000bJ?\u0010?\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\t052!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\t07J\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u000bJ?\u0010B\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\t052!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\t07J\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u000bJ\u000e\u0010E\u001a\u00020\t2\u0006\u00104\u001a\u00020\u0005J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u000b2\b\b\u0002\u0010F\u001a\u00020\u0005J\u0010\u0010I\u001a\u00020\t2\b\b\u0002\u0010F\u001a\u00020\u0005J9\u0010J\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00102!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\t07J9\u0010K\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00102!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\t07J9\u0010L\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00102!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\t07J\f\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u000bJ\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u000bJ\u000e\u0010Q\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010R\u001a\u00020\tJ?\u0010S\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\t052!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\t07J\f\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u000bJ\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u000bJ\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u000bJ\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u0006\u0010^\u001a\u00020\tJ\u000e\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\u000bH\u0007J3\u0010c\u001a\u00020\t2\u0006\u0010b\u001a\u00020a2!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\t07H\u0007J\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u000e\u0010f\u001a\u00020\t2\u0006\u0010e\u001a\u00020\u0010J\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0\u000bJ\u000e\u0010i\u001a\u00020\t2\u0006\u0010e\u001a\u00020\u0010J\f\u0010k\u001a\b\u0012\u0004\u0012\u00020j0\u000bJ\f\u0010m\u001a\b\u0012\u0004\u0012\u00020l0\u000bJ\f\u0010o\u001a\b\u0012\u0004\u0012\u00020n0\u000bJ\u0006\u0010p\u001a\u00020\tJ\u0006\u0010q\u001a\u00020\u0005J\u000e\u0010t\u001a\u00020\t2\u0006\u0010s\u001a\u00020rR\u0016\u0010x\u001a\u00020u8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010s\u001a\u00020r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001d\u0010\u007f\u001a\u00020{8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b|\u0010~R\"\u0010\u0084\u0001\u001a\u00030\u0080\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010}\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\"\u0010\u0088\u0001\u001a\u00030\u0085\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0082\u0001\u0010}\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R!\u0010\u008c\u0001\u001a\u00030\u0089\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010}\u001a\u0005\by\u0010\u008b\u0001R\"\u0010\u0090\u0001\u001a\u00030\u008d\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010}\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\"\u0010\u0094\u0001\u001a\u00030\u0091\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008e\u0001\u0010}\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\"\u0010\u0098\u0001\u001a\u00030\u0095\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010}\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\"\u0010\u009d\u0001\u001a\u00030\u0099\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009a\u0001\u0010}\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010 \u0001\u001a\u00030\u009e\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u0006\u0010}\u001a\u0006\b\u009a\u0001\u0010\u009f\u0001R&\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030¢\u00010¡\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R \u0010©\u0001\u001a\t\u0012\u0004\u0012\u00020\f0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010¤\u0001R \u0010«\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010¤\u0001R \u0010\u00ad\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010¤\u0001R \u0010¯\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¤\u0001R \u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010¤\u0001R \u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020\"0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010¤\u0001R \u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00020'0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010¤\u0001R \u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020,0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010¤\u0001R \u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00020.0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¤\u0001R \u0010»\u0001\u001a\t\u0012\u0004\u0012\u0002000¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¤\u0001R \u0010½\u0001\u001a\t\u0012\u0004\u0012\u0002020¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¤\u0001R \u0010¿\u0001\u001a\t\u0012\u0004\u0012\u00020=0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¤\u0001R \u0010Á\u0001\u001a\t\u0012\u0004\u0012\u00020@0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010¤\u0001R \u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00020C0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010¤\u0001R \u0010Ç\u0001\u001a\t\u0012\u0004\u0012\u00020G0Ä\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R&\u0010Ë\u0001\u001a\n\u0012\u0005\u0012\u00030È\u00010¡\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\bÉ\u0001\u0010¤\u0001\u001a\u0006\bÊ\u0001\u0010¦\u0001R \u0010Í\u0001\u001a\t\u0012\u0004\u0012\u00020M0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010¤\u0001R \u0010Ï\u0001\u001a\t\u0012\u0004\u0012\u00020O0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010¤\u0001R$\u0010Ô\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006@\u0006¢\u0006\u0010\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001R&\u0010Ø\u0001\u001a\n\u0012\u0005\u0012\u00030Õ\u00010¡\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\bÖ\u0001\u0010¤\u0001\u001a\u0006\b×\u0001\u0010¦\u0001R \u0010Ú\u0001\u001a\t\u0012\u0004\u0012\u00020T0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010¤\u0001R \u0010Ü\u0001\u001a\t\u0012\u0004\u0012\u00020V0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010¤\u0001R \u0010Þ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010¤\u0001R \u0010à\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010¤\u0001R \u0010â\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010¤\u0001R \u0010ä\u0001\u001a\t\u0012\u0004\u0012\u00020[0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0001\u0010¤\u0001R \u0010æ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0001\u0010¤\u0001R&\u0010ê\u0001\u001a\n\u0012\u0005\u0012\u00030ç\u00010¡\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\bè\u0001\u0010¤\u0001\u001a\u0006\bé\u0001\u0010¦\u0001R0\u0010ï\u0001\u001a\t\u0012\u0004\u0012\u00020_0¡\u00018\u0006@\u0007X\u0087\u0004¢\u0006\u0018\n\u0006\bë\u0001\u0010¤\u0001\u0012\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bì\u0001\u0010¦\u0001R \u0010ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010¤\u0001R \u0010ó\u0001\u001a\t\u0012\u0004\u0012\u00020g0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010¤\u0001R \u0010õ\u0001\u001a\t\u0012\u0004\u0012\u00020j0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010¤\u0001R\u0019\u0010ø\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R \u0010ú\u0001\u001a\t\u0012\u0004\u0012\u00020l0¡\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bù\u0001\u0010¤\u0001R(\u0010ü\u0001\u001a\t\u0012\u0004\u0012\u00020n0¡\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bû\u0001\u0010}\u001a\u0006\b\u008a\u0001\u0010¦\u0001R%\u0010ÿ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050¡\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\bý\u0001\u0010¤\u0001\u001a\u0006\bþ\u0001\u0010¦\u0001¨\u0006\u0083\u0002"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeatureViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "hand", "", hl.k, "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "findDevice", "", "loadBroadcastSetting", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/device/setting/vo/LightColorVo;", "loadLightColorSetting", "colorType", "updateLightColor", "", "findCurrentLightColorIndex", "Lcom/xiaomi/hm/health/device/realtimedata/RealtimeDataVo;", "findRealtimeDataSetting", "Lcom/xiaomi/hm/health/device/setting/vo/SportHrBroadCastVo;", "findSportHrBroadcastSetting", "Lcom/xiaomi/hm/health/device/setting/vo/LongPressKeyItemVo;", "loadLongPressKeySetting", "value", "updateLongPressKeySetting", "Lcom/xiaomi/hm/health/device/setting/vo/WearStyleSettingVo;", "loadWearStyleSetting", "style", "Lcom/xiaomi/hm/health/bt/profile/user/LocationExt$Wear;", "wear", "Lcom/xiaomi/hm/health/bt/profile/user/LocationExt$Way;", "way", "updateWearStyleSetting", "Lcom/xiaomi/hm/health/device/setting/vo/DisplayItemVo;", "loadDisplayItemSetting", "Lcom/xiaomi/hm/health/bt/model/HMProDisplayItem;", "item", "updateDisplayItem", "Lcom/xiaomi/hm/health/device/setting/vo/TimeStyleVo;", "loadTimeStyleSetting", "Lcom/xiaomi/hm/health/bt/model/HMDisplayType;", "type", "updateTimeDisplayStyle", "Lcom/xiaomi/hm/health/device/setting/vo/GesScreenVo;", "loadGesScreenSetting", "Lcom/xiaomi/hm/health/device/setting/vo/DeviceLanguageVo;", "loadDeviceLanguageSetting", "Lcom/xiaomi/hm/health/device/setting/vo/OffWistLockVo;", "loadOffWistLockSetting", "Lcom/xiaomi/hm/health/device/setting/vo/PreviewMessageVo;", "loadPreviewMessageSetting", "isEnable", "Lkotlin/Function0;", "onStart", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isSuccess", "onFinish", "updatePreviewMessage", "Lcom/xiaomi/hm/health/device/setting/vo/FlipWristVo;", "loadFlipWristSetting", "updateFlipWrist", "Lcom/xiaomi/hm/health/device/setting/vo/SleepAssistantVo;", "loadSleepAssistantSetting", "updateSleepAssistantSetting", "Lcom/xiaomi/hm/health/device/setting/vo/VibrateSettingVo;", "loadVibrateNotifySetting", "updateVibrateNotify", "isShowUpdateDialog", "Lcom/xiaomi/hm/health/device/setting/vo/HrDetectVo;", "loadHrDetectSetting", "updateHealthDetect", "updateHrDetectSetting", "updateFullHeartRate", "updateSleepAssistantHr", "Lcom/xiaomi/hm/health/device/setting/vo/NightModeVo;", "loadNightModeSetting", "Lcom/xiaomi/hm/health/device/setting/vo/RingTypeSettingVo;", "loadRingTypeSetting", "updateRingType", "loadDeviceUnLockScreen", "updateDeviceUnlockScreen", "Lcom/xiaomi/hm/health/device/setting/vo/ShortcutSettingVo;", "loadShortcutSetting", "Lcom/xiaomi/hm/health/device/setting/vo/AppsItemVo;", "loadAppsItemSetting", "loadNotification", "loadWorldClockSetting", "loadCustomVibrateSetting", "Lcom/xiaomi/hm/health/device/setting/vo/WeatherSettingVo;", "loadWeatherSetting", "loadLibrarySetting", "loadSpiteBinding", "Lcom/xiaomi/hm/health/device/setting/vo/FindMiliVo;", "loadFindMiliSetting", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "mode", "sendFindMiliNotification", "loadOtherCalendarSetting", "index", "updateOtherCalendar", "Lcom/xiaomi/hm/health/device/setting/vo/StartOfWeekSettingVo;", "loadStartDayOfWeekSetting", "updateStartDayOfWeek", "Lcom/xiaomi/hm/health/device/setting/vo/DevicePwdVo;", "loadDevicePwdSetting", "Lcom/xiaomi/hm/health/device/setting/vo/EsimVo;", "loadEsimSetting", "Lcom/xiaomi/hm/health/device/setting/life/feature/vo/JSAppStoreVo;", "loadJsAppStoreSetting", "loadSmartAssistant", "isSupportLab", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "checkFwUpgrade", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "a", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "featureTree", "b", "Landroid/content/Context;", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", GoogleApiAvailabilityLight.a, "e", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/huami/devicex/injection/basic/MiuiFnApi;", "g", "()Lcom/huami/devicex/injection/basic/MiuiFnApi;", "miuiFnApi", "Lcom/huami/devicex/injection/basic/AccountWebExtApi;", "f", "()Lcom/huami/devicex/injection/basic/AccountWebExtApi;", "accountWebExtApi", "Lcom/xiaomi/hm/health/device/realtimedata/IRealtimeData;", "h", "()Lcom/xiaomi/hm/health/device/realtimedata/IRealtimeData;", "realtimeData", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "getDeviceCenter", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Lcom/huami/devicex/manager/IScreenUnLockSupporter;", "i", "()Lcom/huami/devicex/manager/IScreenUnLockSupporter;", "screenUnlockSupporter", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", z.j, "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/xiaomi/hm/health/device/setting/viewmodel/SoftFeatureCache;", "()Lcom/xiaomi/hm/health/device/setting/viewmodel/SoftFeatureCache;", "softFeatureCache", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/setting/vo/BroadcastVo;", "l", "Landroidx/lifecycle/MutableLiveData;", "getBluetoothBroadcastSettingLiveData", "()Landroidx/lifecycle/MutableLiveData;", "bluetoothBroadcastSettingLiveData", "m", "lightColorLiveData", GoogleApiAvailabilityLight.b, "realtimeDataLiveData", "o", "sportHrBroadcastLiveData", com.google.android.exoplayer2.text.ttml.b.r, "longPressKeySettingLiveData", DTransferConstants.SEARCH_KEY, "handSettingLiveData", "r", "displayItemSettingLiveData", SOAP.XMLNS, "timeStyleSettingLiveData", "t", "gesScreenSettingLiveData", "u", "deviceLanguageLiveData", "v", "offWistLockLiveData", "w", "previewMessageLiveData", "x", "flipWristLiveData", "y", "sleepAssistantLiveData", "z", "vibrateSettingLiveData", "Landroidx/lifecycle/MediatorLiveData;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/lifecycle/MediatorLiveData;", "hrDetectSettingLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/BatteryTipsDialogVo;", "B", "getShowBatterTipsDialog", "showBatterTipsDialog", "C", "nightModeLiveData", LogUtil.D, "ringTypeSettingLiveData", "E", "Landroidx/lifecycle/LiveData;", "getKeepAliveVo", "()Landroidx/lifecycle/LiveData;", "keepAliveVo", "Lcom/xiaomi/hm/health/device/setting/vo/DeviceUnlockScreenVo;", "F", "getDeviceUnlockScreenLiveData", "deviceUnlockScreenLiveData", "G", "shortcutSettingLiveData", "H", "appsItemSettingLiveData", LogUtil.I, "notificationLiveData", "J", "worldClockSettingLiveData", "K", "customVibrateSettingVo", "L", "weatherSettingLiveData", "M", "librarySettingLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/SpiteBindingVo;", "N", "getSpiteBindingLiveData", "spiteBindingLiveData", "O", "getFindMiliSettingLiveData", "getFindMiliSettingLiveData$annotations", "()V", "findMiliSettingLiveData", "P", "otherCalendarLiveData", "Q", "startDayOfWeekLiveData", "R", "devicePwdSettingLiveData", ExifInterface.LATITUDE_SOUTH, "Ljava/lang/String;", "notSupportVersion", ExifInterface.GPS_DIRECTION_TRUE, "eSimLiveData", "U", "jsAppLiveData", "V", "getSmartAssistantLiveData", "smartAssistantLiveData", "<init>", "(Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;Landroid/content/Context;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceFeatureViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String W = "DeviceFeatureViewModel";
    private static final int X = 10;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<HrDetectVo> hrDetectSettingLiveData;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BatteryTipsDialogVo> showBatterTipsDialog;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<NightModeVo> nightModeLiveData;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<RingTypeSettingVo> ringTypeSettingLiveData;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> keepAliveVo;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DeviceUnlockScreenVo> deviceUnlockScreenLiveData;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ShortcutSettingVo> shortcutSettingLiveData;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<AppsItemVo> appsItemSettingLiveData;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> notificationLiveData;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> worldClockSettingLiveData;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> customVibrateSettingVo;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<WeatherSettingVo> weatherSettingLiveData;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> librarySettingLiveData;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SpiteBindingVo> spiteBindingLiveData;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<FindMiliVo> findMiliSettingLiveData;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> otherCalendarLiveData;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<StartOfWeekSettingVo> startDayOfWeekLiveData;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DevicePwdVo> devicePwdSettingLiveData;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    private final String notSupportVersion;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<EsimVo> eSimLiveData;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    private final Lazy jsAppLiveData;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> smartAssistantLiveData;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FeatureTree featureTree;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy miuiFnApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy accountWebExtApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy realtimeData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy screenUnlockSupporter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSource;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy softFeatureCache;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BroadcastVo> bluetoothBroadcastSettingLiveData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LightColorVo> lightColorLiveData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<RealtimeDataVo> realtimeDataLiveData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SportHrBroadCastVo> sportHrBroadcastLiveData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LongPressKeyItemVo> longPressKeySettingLiveData;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<WearStyleSettingVo> handSettingLiveData;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DisplayItemVo> displayItemSettingLiveData;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimeStyleVo> timeStyleSettingLiveData;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<GesScreenVo> gesScreenSettingLiveData;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DeviceLanguageVo> deviceLanguageLiveData;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<OffWistLockVo> offWistLockLiveData;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<PreviewMessageVo> previewMessageLiveData;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<FlipWristVo> flipWristLiveData;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SleepAssistantVo> sleepAssistantLiveData;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<VibrateSettingVo> vibrateSettingLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeatureViewModel$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "bleDevice", "", "a", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/device/setting/vo/SportHrBroadCastVo;", "handleSportHRBC", "", "SETTINGS_MODULE", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$Companion", f = "DeviceFeatureViewModel.kt", i = {}, l = {108}, m = "handleSportHRBC", n = {}, s = {})
        public static final class a extends ContinuationImpl {
            public int a;
            public /* synthetic */ Object b;
            public int d;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return Companion.this.handleSportHRBC(null, this);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$Companion", f = "DeviceFeatureViewModel.kt", i = {}, l = {97}, m = "readSportHRBCFromDevice", n = {}, s = {})
        public static final class b extends ContinuationImpl {
            public /* synthetic */ Object a;
            public int c;

            public b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return Companion.this.a(null, this);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(HMBaseDevice hMBaseDevice, Continuation<? super Boolean> continuation) {
            b bVar;
            Boolean boolBoxBoolean;
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i = bVar.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bVar.c = i - Integer.MIN_VALUE;
                } else {
                    bVar = new b(continuation);
                }
            } else {
                bVar = new b(continuation);
            }
            b bVar2 = bVar;
            Object objQueryFields$default = bVar2.a;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = bVar2.c;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objQueryFields$default);
                SettingsModule settingsModule = hMBaseDevice == null ? null : (SettingsModule) hMBaseDevice.getChannelModule(SettingsModule.class);
                boolean zBooleanValue = (hMBaseDevice == null || (boolBoxBoolean = Boxing.boxBoolean(hMBaseDevice.supportModule(10))) == null) ? false : boolBoxBoolean.booleanValue();
                if (hMBaseDevice == null || !hMBaseDevice.isConnected() || settingsModule == null || !zBooleanValue) {
                    return null;
                }
                SettingsGroupType settingsGroupType = SettingsGroupType.HEALTH;
                int[] iArr = {Health.INSTANCE.getKEY_HR_ADVERTISEMENT_IN_ACTIVE_SWITCH()};
                bVar2.c = 1;
                objQueryFields$default = SettingsModule.queryFields$default(settingsModule, settingsGroupType, iArr, false, bVar2, 4, null);
                if (objQueryFields$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objQueryFields$default);
            }
            Health health = objQueryFields$default instanceof Health ? (Health) objQueryFields$default : null;
            if (health == null) {
                return null;
            }
            return health.getHrAdvertisementInActiveSwitch();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object handleSportHRBC(@Nullable HMBaseDevice hMBaseDevice, @NotNull Continuation<? super SportHrBroadCastVo> continuation) {
            a aVar;
            int i;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.d = i2 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(continuation);
                }
            } else {
                aVar = new a(continuation);
            }
            Object obj = aVar.b;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i3 = aVar.d;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = (HMDeviceConfig.hasFeatureSportHrBroadcast() ? 1 : 0) & (HMLoginManager.isAdult() ? 1 : 0);
                if (!z) {
                    return new SportHrBroadCastVo(z, false);
                }
                aVar.a = z ? 1 : 0;
                aVar.d = 1;
                Object objA = a(hMBaseDevice, aVar);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objA;
                i = z ? 1 : 0;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = aVar.a;
                ResultKt.throwOnFailure(obj);
            }
            Boolean bool = (Boolean) obj;
            HMSportHRBroadcastConfig hMSportHRBroadcastConfigFromJson = HMSportHRBroadcastConfig.INSTANCE.fromJson();
            if (bool == null) {
                return new SportHrBroadCastVo(i != 0, hMSportHRBroadcastConfigFromJson.getEnable());
            }
            if (!Intrinsics.areEqual(bool, Boxing.boxBoolean(hMSportHRBroadcastConfigFromJson.getEnable()))) {
                hMSportHRBroadcastConfigFromJson.setEnable(bool.booleanValue());
                hMSportHRBroadcastConfigFromJson.saveAndUpload();
            }
            return new SportHrBroadCastVo(i != 0, bool.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$checkFwUpgrade$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMFwOnlineUpgradeManager.checkUpgradeInDevicePage(this.b, HMDeviceType.MILI);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HMDeviceSource> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceSource invoke() {
            return DeviceFeatureViewModel.this.c().getBoundDeviceSource(HMDeviceType.MILI);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/setting/life/feature/vo/JSAppStoreVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MutableLiveData<JSAppStoreVo>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<JSAppStoreVo> invoke() {
            MutableLiveData<JSAppStoreVo> mutableLiveData = new MutableLiveData<>();
            DeviceFeatureViewModel deviceFeatureViewModel = DeviceFeatureViewModel.this;
            mutableLiveData.postValue(new JSAppStoreVo(Intrinsics.areEqual(SoftFeatureCacheKt.get(deviceFeatureViewModel.j(), deviceFeatureViewModel.findDevice(), SoftFeature.JS_APP_STORE), Boolean.TRUE)));
            return mutableLiveData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$keepAliveVo$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<Boolean> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadAppsItemSetting$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceFeatureViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceFeatureViewModel.this.appsItemSettingLiveData.postValue(new AppsItemVo(DeviceFeatureViewModel.this.featureTree.isSupport(SoftFeature.DEVICE_APPLICATION_MANAGE), 0, 0, DeviceFeatureViewModel.this.getDeviceSource()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadDeviceLanguageSetting$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceFeatureViewModel.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int currentDeviceLanguage;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMMiLiDevice hMMiLiDeviceFindDevice = DeviceFeatureViewModel.this.findDevice();
            if (hMMiLiDeviceFindDevice == null) {
                return Unit.INSTANCE;
            }
            if (hMMiLiDeviceFindDevice.isConnected()) {
                HMLanguage language = hMMiLiDeviceFindDevice.getDeviceInfo().getOtherVersion().getLanguage();
                DeviceFeatureViewModel.this.e().saveDeviceLanguageProperty(language, DeviceFeatureViewModel.this.getDeviceSource());
                currentDeviceLanguage = language.getLanguage();
            } else {
                currentDeviceLanguage = DeviceFeatureViewModel.this.e().getCurrentDeviceLanguage(DeviceFeatureViewModel.this.getDeviceSource());
            }
            DeviceFeatureViewModel.this.deviceLanguageLiveData.postValue(new DeviceLanguageVo(this.c, HmLocale.getLocale(currentDeviceLanguage)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadDeviceUnLockScreen$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceFeatureViewModel.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8, types: [boolean, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ?? IsUnlockEnabled;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (DeviceFeatureViewModel.this.findDevice() == null) {
                DeviceFeatureViewModel.this.getDeviceUnlockScreenLiveData().postValue(new DeviceUnlockScreenVo(false, false, false));
                return Unit.INSTANCE;
            }
            String boundDeviceAddress = DeviceFeatureViewModel.this.c().getBoundDeviceAddress(DeviceFeatureViewModel.this.getDeviceSource().getType());
            boolean zIsMiui = DeviceFeatureViewModel.this.g().isMiui(DeviceFeatureViewModel.this.context);
            if (TextUtils.isEmpty(boundDeviceAddress)) {
                IsUnlockEnabled = 0;
            } else {
                MiuiFnApi miuiFnApiG = DeviceFeatureViewModel.this.g();
                Context context = DeviceFeatureViewModel.this.context;
                if (boundDeviceAddress == null) {
                    boundDeviceAddress = "";
                }
                IsUnlockEnabled = miuiFnApiG.isUnlockEnabled(context, boundDeviceAddress);
            }
            DeviceFeatureViewModel.this.getDeviceUnlockScreenLiveData().postValue(new DeviceUnlockScreenVo(DeviceFeatureViewModel.this.i().onlySupportMiUI() ? zIsMiui : true, zIsMiui, IsUnlockEnabled));
            HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
            if (miliConfig.getScreenLock() != IsUnlockEnabled) {
                miliConfig.setScreenLock(IsUnlockEnabled);
                HMPersonInfo.getInstance().saveInfo(2);
                DeviceFeatureViewModel.this.b().updateProfile(false);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadHrDetectSetting$1$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HealthConfig b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ DeviceFeatureViewModel e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HealthConfig healthConfig, boolean z, boolean z2, DeviceFeatureViewModel deviceFeatureViewModel, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = healthConfig;
            this.c = z;
            this.d = z2;
            this.e = deviceFeatureViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HealthSettingConfig userConfig = this.b.getUserConfig();
            this.e.hrDetectSettingLiveData.postValue(new HrDetectVo(this.c, userConfig.getHrDetectType(), userConfig.getFreq(), this.d));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadNightModeSetting$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceFeatureViewModel.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean zHasFeatureBackLight = HMDeviceConfig.hasFeatureBackLight(DeviceFeatureViewModel.this.getDeviceSource());
            HMNightModeConfig hMNightModeConfigFromJsonString = HMNightModeConfig.fromJsonString();
            DeviceFeatureViewModel.this.nightModeLiveData.postValue(new NightModeVo(zHasFeatureBackLight, hMNightModeConfigFromJsonString.getNightMode(), hMNightModeConfigFromJsonString.getStartMinute(), hMNightModeConfigFromJsonString.getEndMinute()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadNotification$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceFeatureViewModel.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceFeatureViewModel.this.notificationLiveData.postValue(Boxing.boxBoolean(DeviceFeatureViewModel.this.featureTree.isSupport(SoftFeature.PUSH_REMINDER)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadOtherCalendarSetting$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceFeatureViewModel.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceFeatureViewModel.this.otherCalendarLiveData.postValue(Boxing.boxBoolean(!HMDeviceConfig.hasFeatureCalendarAndStartDayOfWeek()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadRingTypeSetting$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceFeatureViewModel.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceFeatureViewModel.this.ringTypeSettingLiveData.postValue(new RingTypeSettingVo(HMDeviceConfig.hasFeatureG3Device(), DeviceXFunctionsKt.getPropertyStoreApi().getRingType()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadShortcutSetting$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceFeatureViewModel.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceFeatureViewModel.this.shortcutSettingLiveData.postValue(new ShortcutSettingVo(ConfigHelperKt.hasMiliFeature(Feature.SECONDARY_SCREEN_S)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadSpiteBinding$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceFeatureViewModel.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceFeatureViewModel.this.getSpiteBindingLiveData().postValue(new SpiteBindingVo(DeviceFeatureViewModel.this.featureTree.isSupport(SoftFeature.BIND_LIMIT), DeviceFeatureViewModel.this.e().fromAvoidSpiteBindingStr()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadVibrateNotifySetting$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceFeatureViewModel.this.new o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceFeatureViewModel.this.vibrateSettingLiveData.postValue(new VibrateSettingVo(CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.MILI_1S, HMDeviceSource.MILI_1A, HMDeviceSource.MILI_AMAZFIT, HMDeviceSource.MILI).contains(DeviceFeatureViewModel.this.getDeviceSource()), HMPersonInfo.getInstance().getMiliConfig().isVibrate()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$loadWeatherSetting$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceFeatureViewModel.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = !CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.MILI, HMDeviceSource.MILI_1A, HMDeviceSource.MILI_AMAZFIT, HMDeviceSource.MILI_1S).contains(DeviceFeatureViewModel.this.getDeviceSource());
            DeviceFeatureViewModel.this.weatherSettingLiveData.postValue(new WeatherSettingVo(z, z ? WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting()).getDisplayCity() : ""));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/devicex/manager/IScreenUnLockSupporter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<IScreenUnLockSupporter> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IScreenUnLockSupporter invoke() {
            return new UnlockScreenFactory().create();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateDisplayItem$1$2", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMProDisplayItem b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(HMProDisplayItem hMProDisplayItem, Continuation<? super r> continuation) {
            super(2, continuation);
            this.b = hMProDisplayItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new r(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HashMap<HMDeviceSource, SortableAppItems> displaySetting = HMAppSortDataManager.getInstance().getDisplaySetting();
            SortableAppItems sortableAppItems = displaySetting.get(HMDeviceSource.MILI_PRO);
            Objects.requireNonNull(sortableAppItems);
            HMAppSortDataManager.getMiliProDisplaySetting(sortableAppItems, this.b.getValue());
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_APP_SORT_CONFIG, HMAppSortDataManager.toDisplaySettingJsonString(displaySetting));
            DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateHealthDetect$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ DeviceFeatureViewModel d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(boolean z, boolean z2, DeviceFeatureViewModel deviceFeatureViewModel, Continuation<? super s> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = z2;
            this.d = deviceFeatureViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new s(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HealthConfig healthConfig = HealthDetect.INSTANCE.getHealthConfig();
            healthConfig.adjustConfig();
            this.d.hrDetectSettingLiveData.postValue(new HrDetectVo(this.b, healthConfig.getUserConfig().getHrDetectType(), healthConfig.getUserConfig().getFreq(), this.c));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateRingType$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ DeviceFeatureViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(int i, DeviceFeatureViewModel deviceFeatureViewModel, Continuation<? super t> continuation) {
            super(2, continuation);
            this.b = i;
            this.c = deviceFeatureViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new t(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", this.b);
                DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_RINGTYPE, jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.c.ringTypeSettingLiveData.postValue(new RingTypeSettingVo(true, this.b));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateVibrateNotify$1$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(boolean z, Continuation<? super u> continuation) {
            super(2, continuation);
            this.b = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new u(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
            if (this.b == miliConfig.isVibrate()) {
                return Unit.INSTANCE;
            }
            miliConfig.setVibrate(this.b);
            HMPersonInfo.getInstance().saveInfo(2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceFeatureViewModel(@NotNull FeatureTree featureTree, @NotNull Context context) {
        this.featureTree = featureTree;
        this.context = context;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.miuiFnApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<MiuiFnApi>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.MiuiFnApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MiuiFnApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(MiuiFnApi.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.accountWebExtApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<AccountWebExtApi>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.AccountWebExtApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AccountWebExtApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AccountWebExtApi.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.realtimeData = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<IRealtimeData>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.realtimedata.IRealtimeData, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IRealtimeData invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IRealtimeData.class), objArr8, objArr9);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode6 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode6, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.DeviceCenter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceCenter invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), objArr10, objArr11);
            }
        });
        this.screenUnlockSupporter = LazyKt__LazyJVMKt.lazy(q.a);
        this.deviceSource = LazyKt__LazyJVMKt.lazy(new b());
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode7 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        this.softFeatureCache = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode7, (Function0) new Function0<SoftFeatureCache>() { // from class: com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.viewmodel.SoftFeatureCache, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SoftFeatureCache invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SoftFeatureCache.class), objArr12, objArr13);
            }
        });
        this.bluetoothBroadcastSettingLiveData = new MutableLiveData<>();
        this.lightColorLiveData = new MutableLiveData<>();
        this.realtimeDataLiveData = new MutableLiveData<>();
        this.sportHrBroadcastLiveData = new MutableLiveData<>();
        this.longPressKeySettingLiveData = new MutableLiveData<>();
        this.handSettingLiveData = new MutableLiveData<>();
        this.displayItemSettingLiveData = new MutableLiveData<>();
        this.timeStyleSettingLiveData = new MutableLiveData<>();
        this.gesScreenSettingLiveData = new MutableLiveData<>();
        this.deviceLanguageLiveData = new MutableLiveData<>();
        this.offWistLockLiveData = new MutableLiveData<>();
        this.previewMessageLiveData = new MutableLiveData<>();
        this.flipWristLiveData = new MutableLiveData<>();
        this.sleepAssistantLiveData = new MutableLiveData<>();
        this.vibrateSettingLiveData = new MutableLiveData<>();
        this.hrDetectSettingLiveData = new MediatorLiveData<>();
        this.showBatterTipsDialog = new MutableLiveData<>();
        this.nightModeLiveData = new MutableLiveData<>();
        this.ringTypeSettingLiveData = new MutableLiveData<>();
        this.keepAliveVo = CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new d(null), 3, (Object) null);
        this.deviceUnlockScreenLiveData = new MutableLiveData<>();
        this.shortcutSettingLiveData = new MutableLiveData<>();
        this.appsItemSettingLiveData = new MutableLiveData<>();
        this.notificationLiveData = new MutableLiveData<>();
        this.worldClockSettingLiveData = new MutableLiveData<>();
        this.customVibrateSettingVo = new MutableLiveData<>();
        this.weatherSettingLiveData = new MutableLiveData<>();
        this.librarySettingLiveData = new MutableLiveData<>();
        this.spiteBindingLiveData = new MutableLiveData<>();
        this.findMiliSettingLiveData = new MutableLiveData<>();
        this.otherCalendarLiveData = new MutableLiveData<>();
        this.startDayOfWeekLiveData = new MutableLiveData<>();
        this.devicePwdSettingLiveData = new MutableLiveData<>();
        this.notSupportVersion = "V1.2.7.06";
        this.eSimLiveData = new MutableLiveData<>();
        this.jsAppLiveData = LazyKt__LazyJVMKt.lazy(new c());
        this.smartAssistantLiveData = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountWebExtApi b() {
        return (AccountWebExtApi) this.accountWebExtApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi c() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceUtilsApi e() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<JSAppStoreVo> f() {
        return (MutableLiveData) this.jsAppLiveData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MiuiFnApi g() {
        return (MiuiFnApi) this.miuiFnApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceCenter getDeviceCenter() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMDeviceSource getDeviceSource() {
        return (HMDeviceSource) this.deviceSource.getValue();
    }

    @Deprecated(message = "现在查找手表逻辑已经集中到FindDeviceViewModel中")
    public static /* synthetic */ void getFindMiliSettingLiveData$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IRealtimeData h() {
        return (IRealtimeData) this.realtimeData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IScreenUnLockSupporter i() {
        return (IScreenUnLockSupporter) this.screenUnlockSupporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoftFeatureCache j() {
        return (SoftFeatureCache) this.softFeatureCache.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(String hand) {
        return (getDeviceSource() != HMDeviceSource.MILI && getDeviceSource() != HMDeviceSource.MILI_1A && getDeviceSource() != HMDeviceSource.MILI_QINLING && getDeviceSource() != HMDeviceSource.MILI_AMAZFIT) && (Intrinsics.areEqual(HMMiliConfig.ONBODY, hand) || Intrinsics.areEqual(HMMiliConfig.ONBODY_IOS, hand));
    }

    public static /* synthetic */ LiveData loadHrDetectSetting$default(DeviceFeatureViewModel deviceFeatureViewModel, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return deviceFeatureViewModel.loadHrDetectSetting(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(DeviceFeatureViewModel deviceFeatureViewModel, boolean z, HealthConfig healthConfig) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(deviceFeatureViewModel), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadHrDetectSetting$lambda28$$inlined$safeLaunch$1(null, deviceFeatureViewModel, healthConfig, z), 2, null);
    }

    public static /* synthetic */ void updateHealthDetect$default(DeviceFeatureViewModel deviceFeatureViewModel, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        deviceFeatureViewModel.updateHealthDetect(z);
    }

    public final void checkFwUpgrade(@NotNull Context context) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$checkFwUpgrade$$inlined$safeLaunch$1(null, this, context), 2, null);
    }

    public final int findCurrentLightColorIndex() {
        String lightColor = HMPersonInfo.getInstance().getMiliConfig().getLightColor();
        if (lightColor == null) {
            return 0;
        }
        switch (lightColor.hashCode()) {
            case -1955522002:
                return !lightColor.equals(HMMiliConfig.ORANGE) ? 0 : 1;
            case 81009:
                return !lightColor.equals(HMMiliConfig.RED) ? 0 : 3;
            case 2041946:
                lightColor.equals(HMMiliConfig.BLUE);
                return 0;
            case 68081379:
                return !lightColor.equals(HMMiliConfig.GREEN) ? 0 : 2;
            default:
                return 0;
        }
    }

    @Nullable
    public final HMMiLiDevice findDevice() {
        HMBaseDevice device = c().getDevice(HMDeviceType.MILI);
        if (device instanceof HMMiLiDevice) {
            return (HMMiLiDevice) device;
        }
        return null;
    }

    @NotNull
    public final LiveData<RealtimeDataVo> findRealtimeDataSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$findRealtimeDataSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.realtimeDataLiveData;
    }

    @NotNull
    public final LiveData<SportHrBroadCastVo> findSportHrBroadcastSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$findSportHrBroadcastSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.sportHrBroadcastLiveData;
    }

    @NotNull
    public final MutableLiveData<BroadcastVo> getBluetoothBroadcastSettingLiveData() {
        return this.bluetoothBroadcastSettingLiveData;
    }

    @NotNull
    public final MutableLiveData<DeviceUnlockScreenVo> getDeviceUnlockScreenLiveData() {
        return this.deviceUnlockScreenLiveData;
    }

    @NotNull
    public final MutableLiveData<FindMiliVo> getFindMiliSettingLiveData() {
        return this.findMiliSettingLiveData;
    }

    @NotNull
    public final LiveData<Boolean> getKeepAliveVo() {
        return this.keepAliveVo;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<BatteryTipsDialogVo> getShowBatterTipsDialog() {
        return this.showBatterTipsDialog;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSmartAssistantLiveData() {
        return this.smartAssistantLiveData;
    }

    @NotNull
    public final MutableLiveData<SpiteBindingVo> getSpiteBindingLiveData() {
        return this.spiteBindingLiveData;
    }

    public final boolean isSupportLab() {
        return HMDeviceConfig.supportLaptopUnLock() || HMDeviceConfig.hasFeatureOffWistLock() || HMDeviceConfig.supportTakePic();
    }

    @NotNull
    public final LiveData<AppsItemVo> loadAppsItemSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadAppsItemSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.appsItemSettingLiveData;
    }

    public final void loadBroadcastSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadBroadcastSetting$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @NotNull
    public final LiveData<Boolean> loadCustomVibrateSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadCustomVibrateSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.customVibrateSettingVo;
    }

    @NotNull
    public final LiveData<DeviceLanguageVo> loadDeviceLanguageSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadDeviceLanguageSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.deviceLanguageLiveData;
    }

    @NotNull
    public final LiveData<DevicePwdVo> loadDevicePwdSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadDevicePwdSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.devicePwdSettingLiveData;
    }

    public final void loadDeviceUnLockScreen() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadDeviceUnLockScreen$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @NotNull
    public final LiveData<DisplayItemVo> loadDisplayItemSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadDisplayItemSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.displayItemSettingLiveData;
    }

    @NotNull
    public final LiveData<EsimVo> loadEsimSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadEsimSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.eSimLiveData;
    }

    @Deprecated(message = "现在查找手表逻辑已经集中到FindDeviceViewModel中")
    @NotNull
    public final LiveData<FindMiliVo> loadFindMiliSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadFindMiliSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.findMiliSettingLiveData;
    }

    @NotNull
    public final LiveData<FlipWristVo> loadFlipWristSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadFlipWristSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.flipWristLiveData;
    }

    @NotNull
    public final LiveData<GesScreenVo> loadGesScreenSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadGesScreenSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.gesScreenSettingLiveData;
    }

    @NotNull
    public final LiveData<HrDetectVo> loadHrDetectSetting(final boolean isShowUpdateDialog) {
        this.hrDetectSettingLiveData.addSource(HealthDetect.INSTANCE.observeHealthConfig(), new Observer() { // from class: s71
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceFeatureViewModel.m(this.a, isShowUpdateDialog, (HealthConfig) obj);
            }
        });
        return this.hrDetectSettingLiveData;
    }

    @NotNull
    public final LiveData<JSAppStoreVo> loadJsAppStoreSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadJsAppStoreSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return f();
    }

    @NotNull
    public final LiveData<Boolean> loadLibrarySetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadLibrarySetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.librarySettingLiveData;
    }

    @NotNull
    public final LiveData<LightColorVo> loadLightColorSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadLightColorSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.lightColorLiveData;
    }

    @NotNull
    public final LiveData<LongPressKeyItemVo> loadLongPressKeySetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadLongPressKeySetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.longPressKeySettingLiveData;
    }

    @NotNull
    public final LiveData<NightModeVo> loadNightModeSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadNightModeSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.nightModeLiveData;
    }

    @NotNull
    public final LiveData<Boolean> loadNotification() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadNotification$$inlined$safeLaunch$1(null, this), 2, null);
        return this.notificationLiveData;
    }

    @NotNull
    public final LiveData<OffWistLockVo> loadOffWistLockSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadOffWistLockSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.offWistLockLiveData;
    }

    @NotNull
    public final LiveData<Boolean> loadOtherCalendarSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadOtherCalendarSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.otherCalendarLiveData;
    }

    @NotNull
    public final LiveData<PreviewMessageVo> loadPreviewMessageSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadPreviewMessageSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.previewMessageLiveData;
    }

    @NotNull
    public final LiveData<RingTypeSettingVo> loadRingTypeSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadRingTypeSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.ringTypeSettingLiveData;
    }

    @NotNull
    public final LiveData<ShortcutSettingVo> loadShortcutSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadShortcutSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.shortcutSettingLiveData;
    }

    @NotNull
    public final LiveData<SleepAssistantVo> loadSleepAssistantSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadSleepAssistantSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.sleepAssistantLiveData;
    }

    public final void loadSmartAssistant() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadSmartAssistant$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void loadSpiteBinding() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadSpiteBinding$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @NotNull
    public final LiveData<StartOfWeekSettingVo> loadStartDayOfWeekSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadStartDayOfWeekSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.startDayOfWeekLiveData;
    }

    @NotNull
    public final LiveData<TimeStyleVo> loadTimeStyleSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadTimeStyleSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.timeStyleSettingLiveData;
    }

    @NotNull
    public final LiveData<VibrateSettingVo> loadVibrateNotifySetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadVibrateNotifySetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.vibrateSettingLiveData;
    }

    @NotNull
    public final LiveData<WearStyleSettingVo> loadWearStyleSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadWearStyleSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.handSettingLiveData;
    }

    @NotNull
    public final LiveData<WeatherSettingVo> loadWeatherSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadWeatherSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.weatherSettingLiveData;
    }

    @NotNull
    public final LiveData<Boolean> loadWorldClockSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$loadWorldClockSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.worldClockSettingLiveData;
    }

    @Deprecated(message = "现在查找手表逻辑已经集中到FindDeviceViewModel中")
    public final void sendFindMiliNotification(@NotNull HMAlertModeExt mode, @NotNull Function1<? super Boolean, Unit> onFinish) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$sendFindMiliNotification$$inlined$safeLaunch$1(null, this, mode, onFinish), 2, null);
    }

    public final void updateDeviceUnlockScreen(boolean isEnable, @NotNull Function0<Unit> onStart, @NotNull Function1<? super Boolean, Unit> onFinish) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateDeviceUnlockScreen$$inlined$safeLaunch$1(null, this, isEnable, onStart, onFinish), 2, null);
    }

    public final void updateDisplayItem(@NotNull HMProDisplayItem item) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateDisplayItem$$inlined$safeLaunch$1(null, this, item), 2, null);
    }

    public final void updateFlipWrist(boolean isEnable, @NotNull Function0<Unit> onStart, @NotNull Function1<? super Boolean, Unit> onFinish) {
        if (HMPersonInfo.getInstance().getMiliConfig().isFlipWrist() == isEnable) {
            return;
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateFlipWrist$$inlined$safeLaunch$1(null, this, isEnable, onStart, onFinish), 2, null);
    }

    public final void updateFullHeartRate(boolean isEnable, int type, @NotNull Function1<? super Boolean, Unit> onFinish) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateFullHeartRate$$inlined$safeLaunch$1(null, this, isEnable, type, onFinish), 2, null);
    }

    public final void updateHealthDetect(boolean isShowUpdateDialog) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateHealthDetect$$inlined$safeLaunch$1(null, this, isShowUpdateDialog), 2, null);
    }

    public final void updateHrDetectSetting(boolean isEnable, int type, @NotNull Function1<? super Boolean, Unit> onFinish) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateHrDetectSetting$$inlined$safeLaunch$1(null, this, isEnable, type, onFinish), 2, null);
    }

    public final void updateLightColor(@NotNull String colorType) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateLightColor$$inlined$safeLaunch$1(null, colorType, this), 2, null);
    }

    public final void updateLongPressKeySetting(int value) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateLongPressKeySetting$$inlined$safeLaunch$1(null, this, value), 2, null);
    }

    public final void updateOtherCalendar(int index) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateOtherCalendar$$inlined$safeLaunch$1(null, this, index), 2, null);
    }

    public final void updatePreviewMessage(boolean isEnable, @NotNull Function0<Unit> onStart, @NotNull Function1<? super Boolean, Unit> onFinish) {
        if (isEnable == e().fromMsgPreviewStr(DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_MESSAGE_PREVIEW, null))) {
            return;
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updatePreviewMessage$$inlined$safeLaunch$1(null, this, isEnable, onStart, onFinish), 2, null);
    }

    public final void updateRingType(int type) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateRingType$$inlined$safeLaunch$1(null, type, this), 2, null);
    }

    public final void updateSleepAssistantHr(boolean isEnable, int type, @NotNull Function1<? super Boolean, Unit> onFinish) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateSleepAssistantHr$$inlined$safeLaunch$1(null, this, isEnable, type, onFinish), 2, null);
    }

    public final void updateSleepAssistantSetting(boolean isEnable, @NotNull Function0<Unit> onStart, @NotNull Function1<? super Boolean, Unit> onFinish) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateSleepAssistantSetting$$inlined$safeLaunch$1(null, this, isEnable, onStart, onFinish), 2, null);
    }

    public final void updateStartDayOfWeek(int index) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateStartDayOfWeek$$inlined$safeLaunch$1(null, this, index), 2, null);
    }

    public final void updateTimeDisplayStyle(@NotNull HMDisplayType type) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateTimeDisplayStyle$$inlined$safeLaunch$1(null, this, type), 2, null);
    }

    public final void updateVibrateNotify(boolean isEnable) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateVibrateNotify$$inlined$safeLaunch$1(null, isEnable), 2, null);
    }

    public final void updateWearStyleSetting(@NotNull String style, @NotNull LocationExt.Wear wear, @NotNull LocationExt.Way way) {
        HMLog.i("HMSmartSettingActivity", "LocationExt:" + style, new Object[0]);
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DeviceFeatureViewModel$updateWearStyleSetting$$inlined$safeLaunch$1(null, this, way, wear, style), 2, null);
    }
}
