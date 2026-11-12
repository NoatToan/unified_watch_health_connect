package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v1.DisplayAndBrightnessV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.api.HomeApi;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.profile.base.PnP;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.network.bean.Display;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestEnableMode;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.vo.InterestWatchFaceVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.DisplayBrightnessRepoV1;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.DisplayBrightnessRepoV2;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ®\u00012\u00020\u00012\u00020\u0002:\u0004®\u0001¯\u0001B\t¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J8\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002JT\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016*\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aJ.\u0010\u001e\u001a\u00020\u00032&\u0010\u001d\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016J!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b#\u0010$J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0006\u0010&\u001a\u00020\bJË\u0001\u00104\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b4\u00105J\u000e\u00107\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0010J\u000e\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0017J\u000e\u0010;\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0010J\u000e\u0010=\u001a\u00020\u00032\u0006\u0010<\u001a\u00020)J\u000e\u0010>\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0010J\u000e\u0010?\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0010J\u000e\u0010A\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\nJ\u000e\u0010B\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\nJ\u0016\u0010E\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u0007J\u000e\u0010F\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\nJ\u001c\u0010L\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0IJ\u001a\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0M2\u0006\u0010H\u001a\u00020GJ\u001a\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070M2\u0006\u0010H\u001a\u00020GJ6\u0010P\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nJ\u0010\u0010R\u001a\u00020\u00032\b\b\u0002\u0010Q\u001a\u00020\u0010J\u0006\u0010S\u001a\u00020\u0003J3\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00170\"2\u0006\u0010U\u001a\u00020T2\u0016\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\b0Vj\b\u0012\u0004\u0012\u00020\b`W¢\u0006\u0004\bY\u0010ZJ\u0006\u0010[\u001a\u00020\u0003J\b\u0010\\\u001a\u00020\u0003H\u0014J\u0006\u0010]\u001a\u00020\u0003R6\u0010\u001d\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010^R\u001d\u0010c\u001a\u00020_8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010`\u001a\u0004\ba\u0010bR\u001d\u0010g\u001a\u00020d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010`\u001a\u0004\be\u0010fR4\u0010n\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010\u001f2\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR%\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0\u001f0o8\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010p\u001a\u0004\bq\u0010rR\u0016\u0010v\u001a\u00020t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010wR\u001e\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010y0o8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010pR\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010\u0080\u0001R\u001f\u0010\u0082\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100o8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010pR\u001a\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001e\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100o8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010pR.\u0010\u008b\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0M0o8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010p\u001a\u0005\b\u008a\u0001\u0010rR.\u0010\u008e\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0M0o8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010p\u001a\u0005\b\u008d\u0001\u0010rR0\u0010\u0091\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00070M0o8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010p\u001a\u0005\b\u0090\u0001\u0010rR.\u0010\u0094\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100M0o8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010p\u001a\u0005\b\u0093\u0001\u0010rR0\u0010\u0097\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00170M0o8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010p\u001a\u0005\b\u0096\u0001\u0010rR\"\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100o8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010p\u001a\u0005\b\u0099\u0001\u0010rR\"\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100o8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010p\u001a\u0005\b\u009c\u0001\u0010rR\"\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\u00170o8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010p\u001a\u0005\b\u009f\u0001\u0010rR\u0019\u0010¤\u0001\u001a\u0005\u0018\u00010¡\u00018F@\u0006¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u001d\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100¥\u00018F@\u0006¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u001f\u0010©\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100¥\u00018F@\u0006¢\u0006\b\u001a\u0006\b¨\u0001\u0010§\u0001R\u001f\u0010«\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010y0¥\u00018F@\u0006¢\u0006\b\u001a\u0006\bª\u0001\u0010§\u0001¨\u0006°\u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "g", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/repo/IDisplayBrightnessRepo;", "e", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "", hl.k, "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "screenOffDisplayMode", "screenOffDisplayBeginTime", "screenOffDisplayEndTime", "screenOffDialPlateType", "h", "", z.j, "b", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "", "msg", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "mDeviceType", "initJob", "watchSettings", "setSettings", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestEnableMode;", "modes", "", "parseInterestModeDesc", "(Ljava/util/List;)[Ljava/lang/String;", "getInterestModeList", "getChoiceIndex", "needRefreshObserver", "autoBrightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "brightness", "screenOffTime", "screenOnByTurningWristMode", "screenOnByTurningWristBeginTime", "screenOnByTurningWristEndTime", "screenOnByTurningWristActiveSpeed", "screenOnByNewNotificationSwitch", "screenOnDuringSportSwitch", "screenOffFollowCurrentDialSwitch", "screenOffDialId", "updateDisplayBrightnessSetting", "(ZLjava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "enable", "pushScreenOffFollowCurrentDialSwitch", "style", "pushScreenOffDialIdToDevice", "isChecked", "pushAutoBrightnessToDevice", "intData", "pushBrightnessValueToDevice", "pushScreenOnByNewNotificationSwitchToDevice", "pushScreenOnDuringSportSwitchToDevice", "enumData", "pushAutoInterestTime", "pushScreenOnByTurningWristActiveSpeed", "isBegin", "time", "pushScreenOnByTurningWristBeginOrEndTime", "pushScreenOnByTurningWristModeToDevice", "Lcom/xiaomi/hm/health/bt/model/HMLiftWristConfig;", "config", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Ljava/lang/Object;", "callBack", "pushGesScreenDeviceSetting", "Lkotlin/Pair;", "hMLiftWristConfigToGesModeSensitivity", "hMLiftWristConfigToBeginEndTime", "pushInterestSetting", "needDesc", "querySettings", "loadDialStyleDesc", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "enums", "getGesScreenModeList", "(Landroid/content/Context;Ljava/util/ArrayList;)[Ljava/lang/String;", "loadInterestDials", "onCleared", "removeListener", "Ljava/util/HashMap;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "Lkotlin/Lazy;", "f", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "watchSettingRepo", "Lcom/huami/watchfacesstore/api/HomeApi;", "c", "()Lcom/huami/watchfacesstore/api/HomeApi;", "homeApi", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/vo/InterestWatchFaceVo;", "<set-?>", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getWatchFaceVos", "()Ljava/util/List;", "watchFaceVos", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getWatchSkinBeansLiveData", "()Landroidx/lifecycle/MutableLiveData;", "watchSkinBeansLiveData", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel$WeakChangeListener;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel$WeakChangeListener;", "changeListener", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/repo/IDisplayBrightnessRepo;", "displayBrightnessRepo", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "_displayBrightnessSetting", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "i", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "hmMiLiProDevice", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "_writingResult", "Ljava/util/concurrent/atomic/AtomicBoolean;", "l", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isSetting", "m", "_isShowLoading", GoogleApiAvailabilityLight.b, "getScreenOnByTurningWristModeResultLiveData", "screenOnByTurningWristModeResultLiveData", "o", "getScreenOnByTurningWristActiveSpeedResultLiveData", "screenOnByTurningWristActiveSpeedResultLiveData", com.google.android.exoplayer2.text.ttml.b.r, "getScreenOnByTurningWristBeginOrEndTimeLiveData", "screenOnByTurningWristBeginOrEndTimeLiveData", DTransferConstants.SEARCH_KEY, "getScreenOffFollowCurrentDialSwitchLiveData", "screenOffFollowCurrentDialSwitchLiveData", "r", "getScreenOffDialIdLiveData", "screenOffDialIdLiveData", SOAP.XMLNS, "getGesScreenModeVisibleLiveData", "gesScreenModeVisibleLiveData", "t", "getSensitivityVisibleLiveData", "sensitivityVisibleLiveData", "u", "getDialStyleDescLiveData", "dialStyleDescLiveData", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "getDisplayAndBrightnessV2", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "displayAndBrightnessV2", "Landroidx/lifecycle/LiveData;", "isShowLoading", "()Landroidx/lifecycle/LiveData;", "getWritingResult", "writingResult", "getDisplayBrightnessSetting", "displayBrightnessSetting", "<init>", "()V", "Companion", "WeakChangeListener", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DisplayBrightnessViewModel extends ViewModel implements KoinComponent {
    private static final int B = 0;

    @NotNull
    private static final String v = "DisplayBrightnessViewModel";
    private static final int w = 0;
    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private HashMap<SettingsGroupType, Settings> watchSettings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchSettingRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy homeApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private List<InterestWatchFaceVo> watchFaceVos;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<InterestWatchFaceVo>> watchSkinBeansLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final WeakChangeListener changeListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private IDisplayBrightnessRepo displayBrightnessRepo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DisplayAndBrightness> _displayBrightnessSetting;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private HMMiLiProDevice hmMiLiProDevice;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _writingResult;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean _isSetting;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _isShowLoading;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Boolean, Integer>> screenOnByTurningWristModeResultLiveData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Boolean, Integer>> screenOnByTurningWristActiveSpeedResultLiveData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Boolean, Time>> screenOnByTurningWristBeginOrEndTimeLiveData;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Boolean, Boolean>> screenOffFollowCurrentDialSwitchLiveData;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Boolean, String>> screenOffDialIdLiveData;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> gesScreenModeVisibleLiveData;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> sensitivityVisibleLiveData;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> dialStyleDescLiveData;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArrayList<InterestEnableMode> A = CollectionsKt__CollectionsKt.arrayListOf(InterestEnableMode.ALL_DAY, InterestEnableMode.ENABLE_SMART_ON, InterestEnableMode.ENABLE_SCHEDULE, InterestEnableMode.OFF);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0007\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "element", "", "defaultIndex", "a", "(Ljava/util/List;Ljava/lang/Object;I)I", "DEFAULT_INTEREST_INDEX", LogUtil.I, "GES_SCREEN_MODE_ALL_DAY", "GES_SCREEN_MODE_OFF", "GES_SCREEN_MODE_SMART", "GES_SCREEN_MODE_TIME", "", "TAG", "Ljava/lang/String;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestEnableMode;", "Lkotlin/collections/ArrayList;", "defaultInterestModes", "Ljava/util/ArrayList;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> int a(List<? extends T> list, T t, int i) {
            return list.contains(t) ? list.indexOf(t) : i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\b\u001a\u00020\u00072\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H\u0016R$\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel$WeakChangeListener;", "Lcom/huami/bluetooth/profile/channel/module/settings/ChangeListener;", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "settings", "", "onChange", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/ref/WeakReference;", "weakReference", "viewModel", "<init>", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class WeakChangeListener implements ChangeListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final WeakReference<DisplayBrightnessViewModel> weakReference;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "viewModel gc";
            }
        }

        public WeakChangeListener(@NotNull DisplayBrightnessViewModel displayBrightnessViewModel) {
            this.weakReference = new WeakReference<>(displayBrightnessViewModel);
        }

        @Override // com.huami.bluetooth.profile.channel.module.settings.ChangeListener
        public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
            DisplayBrightnessViewModel displayBrightnessViewModel = this.weakReference.get();
            if (displayBrightnessViewModel == null) {
                HMLog.info(DisplayBrightnessViewModel.v, a.a);
                return;
            }
            MutableLiveData mutableLiveData = displayBrightnessViewModel._displayBrightnessSetting;
            Settings settings2 = settings.get(SettingsGroupType.DISPLAY);
            mutableLiveData.setValue(settings2 instanceof DisplayAndBrightnessV1 ? (DisplayAndBrightnessV1) settings2 : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterestEnableMode.values().length];
            iArr[InterestEnableMode.ALL_DAY.ordinal()] = 1;
            iArr[InterestEnableMode.ENABLE_SMART_ON.ordinal()] = 2;
            iArr[InterestEnableMode.ENABLE_SCHEDULE.ordinal()] = 3;
            iArr[InterestEnableMode.OFF.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " dto null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ges screen mode visible: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sensitivity visible: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ids null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            List<InterestWatchFaceVo> watchFaceVos = DisplayBrightnessViewModel.this.getWatchFaceVos();
            return "watchSkinBean: \n" + (watchFaceVos == null ? null : CollectionsKt___CollectionsKt.joinToString$default(watchFaceVos, "\n", null, null, 0, null, null, 62, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushAutoBrightnessToDevice$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {PnP.ID_HUAMI, SportDeviceUtils.SOURCE_PROVENCE_W}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ boolean d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushAutoBrightnessToDevice$1$1$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ DisplayAndBrightnessV2 b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DisplayAndBrightnessV2 displayAndBrightnessV2, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = displayAndBrightnessV2;
                this.c = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.setAutoBrightness(Boxing.boxBoolean(this.c));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(1);
                this.a = z;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Display display = watchSettings.getDisplay();
                if (display == null) {
                    return;
                }
                display.setAutoBrightness(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HashMap<SettingsGroupType, Settings> map, boolean z, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayBrightnessViewModel.this.new f(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002b  */
        /* JADX WARN: Code duplicated, block: B:22:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0059  */
        /* JADX WARN: Code duplicated, block: B:27:0x006c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            DisplayAndBrightnessV2 displayAndBrightnessV2;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = DisplayBrightnessViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                this.a = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            DisplayBrightnessViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
                if (displayAndBrightnessV2 != null) {
                    boolean z = this.d;
                    main = Dispatchers.getMain();
                    aVar = new a(displayAndBrightnessV2, z, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            DisplayBrightnessViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
                if (displayAndBrightnessV2 != null) {
                    boolean z2 = this.d;
                    main = Dispatchers.getMain();
                    aVar = new a(displayAndBrightnessV2, z2, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushAutoInterestTime$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {439, 443}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ EnumData d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushAutoInterestTime$1$1$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ EnumData b;
            public final /* synthetic */ EnumData c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EnumData enumData, EnumData enumData2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = enumData;
                this.c = enumData2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.setValue(this.c.getValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ EnumData a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(EnumData enumData) {
                super(1);
                this.a = enumData;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Display display = watchSettings.getDisplay();
                if (display == null) {
                    return;
                }
                display.setScreenOffTime(Integer.valueOf(this.a.getValue()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HashMap<SettingsGroupType, Settings> map, EnumData enumData, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = enumData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayBrightnessViewModel.this.new g(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002b  */
        /* JADX WARN: Code duplicated, block: B:22:0x0050  */
        /* JADX WARN: Code duplicated, block: B:30:0x0073 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            DisplayAndBrightnessV2 displayAndBrightnessV2;
            EnumData screenOffTime;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = DisplayBrightnessViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                this.a = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            DisplayBrightnessViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
                if (displayAndBrightnessV2 != null && (screenOffTime = displayAndBrightnessV2.getScreenOffTime()) != null) {
                    EnumData enumData = this.d;
                    main = Dispatchers.getMain();
                    aVar = new a(screenOffTime, enumData, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            DisplayBrightnessViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
                if (displayAndBrightnessV2 != null) {
                    EnumData enumData2 = this.d;
                    main = Dispatchers.getMain();
                    aVar = new a(screenOffTime, enumData2, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushBrightnessValueToDevice$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {368, 372}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ IntData d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushBrightnessValueToDevice$1$1$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ IntData b;
            public final /* synthetic */ IntData c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IntData intData, IntData intData2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = intData;
                this.c = intData2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.setValue(this.c.getValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ IntData a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(IntData intData) {
                super(1);
                this.a = intData;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Display display = watchSettings.getDisplay();
                if (display == null) {
                    return;
                }
                display.setBrightness(Integer.valueOf(this.a.getValue()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HashMap<SettingsGroupType, Settings> map, IntData intData, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = intData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayBrightnessViewModel.this.new h(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002b  */
        /* JADX WARN: Code duplicated, block: B:22:0x0050  */
        /* JADX WARN: Code duplicated, block: B:30:0x0073 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            DisplayAndBrightnessV2 displayAndBrightnessV2;
            IntData brightness;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = DisplayBrightnessViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                this.a = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            DisplayBrightnessViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
                if (displayAndBrightnessV2 != null && (brightness = displayAndBrightnessV2.getBrightness()) != null) {
                    IntData intData = this.d;
                    main = Dispatchers.getMain();
                    aVar = new a(brightness, intData, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            DisplayBrightnessViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
                if (displayAndBrightnessV2 != null) {
                    IntData intData2 = this.d;
                    main = Dispatchers.getMain();
                    aVar = new a(brightness, intData2, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushGesScreenDeviceSetting$2$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {TypedValues.MotionType.TYPE_POLAR_RELATIVETO}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ HMCallback<Object> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HashMap<SettingsGroupType, Settings> map, HMCallback<Object> hMCallback, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayBrightnessViewModel.this.new i(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean zBooleanValue = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsModule settingsModule = DisplayBrightnessViewModel.this.settingsModule;
                if (settingsModule != null) {
                    HashMap<SettingsGroupType, Settings> map = this.c;
                    this.a = 1;
                    obj = settingsModule.writeSetting(map, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.d.sendOnFinishMessage(zBooleanValue);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            this.d.sendOnFinishMessage(zBooleanValue);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushInterestSetting$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {660, 663}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ EnumData d;
        public final /* synthetic */ Time e;
        public final /* synthetic */ Time f;
        public final /* synthetic */ EnumData g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushInterestSetting$1$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ DisplayBrightnessViewModel b;
            public final /* synthetic */ EnumData c;
            public final /* synthetic */ Time d;
            public final /* synthetic */ Time e;
            public final /* synthetic */ EnumData f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DisplayBrightnessViewModel displayBrightnessViewModel, EnumData enumData, Time time, Time time2, EnumData enumData2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = displayBrightnessViewModel;
                this.c = enumData;
                this.d = time;
                this.e = time2;
                this.f = enumData2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, this.f, continuation);
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
                this.b.h(this.c, this.d, this.e, this.f);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(HashMap<SettingsGroupType, Settings> map, EnumData enumData, Time time, Time time2, EnumData enumData2, Continuation<? super j> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = enumData;
            this.e = time;
            this.f = time2;
            this.g = enumData2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayBrightnessViewModel.this.new j(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x006b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean zBooleanValue = false;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = DisplayBrightnessViewModel.this.settingsModule;
            if (settingsModule == null) {
                DisplayBrightnessViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
                if (zBooleanValue) {
                    main = Dispatchers.getMain();
                    aVar = new a(DisplayBrightnessViewModel.this, this.d, this.e, this.f, this.g, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                this.a = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            DisplayBrightnessViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                main = Dispatchers.getMain();
                aVar = new a(DisplayBrightnessViewModel.this, this.d, this.e, this.f, this.g, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pushScreenOffDialIdToDevice not change";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOffDialIdToDevice$2$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {305, 313}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ String d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOffDialIdToDevice$2$1$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ StringEnum b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StringEnum stringEnum, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = stringEnum;
                this.c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.setValue(this.c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(1);
                this.a = str;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Display display = watchSettings.getDisplay();
                if (display == null) {
                    return;
                }
                display.setScreenOffDialId(this.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(HashMap<SettingsGroupType, Settings> map, String str, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayBrightnessViewModel.this.new l(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:21:0x0048  */
        /* JADX WARN: Code duplicated, block: B:23:0x0062  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:0: B:36:0x00da->B:49:?, LOOP_END, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objWriteSetting;
            boolean zBooleanValue;
            DisplayAndBrightnessV2 displayAndBrightnessV2;
            StringEnum screenOffDialId;
            MainCoroutineDispatcher main;
            a aVar;
            List<InterestWatchFaceVo> watchFaceVos;
            String str;
            InterestWatchFaceVo interestWatchFaceVo;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            Object obj2 = null;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    objWriteSetting = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
                DisplayBrightnessViewModel.this.getScreenOffDialIdLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), this.d));
                watchFaceVos = DisplayBrightnessViewModel.this.getWatchFaceVos();
                if (watchFaceVos != null) {
                    str = this.d;
                    for (Object obj3 : watchFaceVos) {
                        if (Boxing.boxBoolean(Intrinsics.areEqual(((InterestWatchFaceVo) obj3).getId(), str)).booleanValue()) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    interestWatchFaceVo = (InterestWatchFaceVo) obj2;
                    if (interestWatchFaceVo != null) {
                        DisplayBrightnessViewModel.this.getDialStyleDescLiveData().postValue(interestWatchFaceVo.getName());
                    }
                }
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = DisplayBrightnessViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                this.a = 1;
                objWriteSetting = settingsModule.writeSetting(map, this);
                if (objWriteSetting == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!zBooleanValue) {
                DisplayBrightnessViewModel.this.getScreenOffDialIdLiveData().postValue(new Pair<>(Boxing.boxBoolean(false), null));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(DisplayBrightnessViewModel.this, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.d, 32766, null);
            displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
            if (displayAndBrightnessV2 != null && (screenOffDialId = displayAndBrightnessV2.getScreenOffDialId()) != null) {
                String str2 = this.d;
                main = Dispatchers.getMain();
                aVar = new a(screenOffDialId, str2, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            DisplayBrightnessViewModel.this.getScreenOffDialIdLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), this.d));
            watchFaceVos = DisplayBrightnessViewModel.this.getWatchFaceVos();
            if (watchFaceVos != null) {
                str = this.d;
                while (r1.hasNext()) {
                    if (Boxing.boxBoolean(Intrinsics.areEqual(((InterestWatchFaceVo) obj3).getId(), str)).booleanValue()) {
                        obj2 = obj3;
                        break;
                    }
                }
                interestWatchFaceVo = (InterestWatchFaceVo) obj2;
                if (interestWatchFaceVo != null) {
                    DisplayBrightnessViewModel.this.getDialStyleDescLiveData().postValue(interestWatchFaceVo.getName());
                }
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) objWriteSetting;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (!zBooleanValue) {
                DisplayBrightnessViewModel.this.getScreenOffDialIdLiveData().postValue(new Pair<>(Boxing.boxBoolean(false), null));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(DisplayBrightnessViewModel.this, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.d, 32766, null);
            displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
            if (displayAndBrightnessV2 != null) {
                String str3 = this.d;
                main = Dispatchers.getMain();
                aVar = new a(screenOffDialId, str3, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            DisplayBrightnessViewModel.this.getScreenOffDialIdLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), this.d));
            watchFaceVos = DisplayBrightnessViewModel.this.getWatchFaceVos();
            if (watchFaceVos != null) {
                str = this.d;
                while (r1.hasNext()) {
                    if (Boxing.boxBoolean(Intrinsics.areEqual(((InterestWatchFaceVo) obj3).getId(), str)).booleanValue()) {
                        obj2 = obj3;
                        break;
                    }
                }
                interestWatchFaceVo = (InterestWatchFaceVo) obj2;
                if (interestWatchFaceVo != null) {
                    DisplayBrightnessViewModel.this.getDialStyleDescLiveData().postValue(interestWatchFaceVo.getName());
                }
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOffFollowCurrentDialSwitch$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {267, 278}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ boolean d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOffFollowCurrentDialSwitch$1$1$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ DisplayAndBrightnessV2 b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DisplayAndBrightnessV2 displayAndBrightnessV2, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = displayAndBrightnessV2;
                this.c = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.setScreenOffFollowCurrentDialSwitch(Boxing.boxBoolean(this.c));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(1);
                this.a = z;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Display display = watchSettings.getDisplay();
                if (display == null) {
                    return;
                }
                display.setScreenOffFollowCurrentDialSwitch(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(HashMap<SettingsGroupType, Settings> map, boolean z, Continuation<? super m> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayBrightnessViewModel.this.new m(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:21:0x0048  */
        /* JADX WARN: Code duplicated, block: B:23:0x0069  */
        /* JADX WARN: Code duplicated, block: B:26:0x0098  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ab A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objWriteSetting;
            boolean zBooleanValue;
            DisplayAndBrightnessV2 displayAndBrightnessV2;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    objWriteSetting = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
                DisplayBrightnessViewModel.this.getScreenOffFollowCurrentDialSwitchLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), Boxing.boxBoolean(this.d)));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = DisplayBrightnessViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                this.a = 1;
                objWriteSetting = settingsModule.writeSetting(map, this);
                if (objWriteSetting == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!zBooleanValue) {
                DisplayBrightnessViewModel.this.getScreenOffFollowCurrentDialSwitchLiveData().postValue(new Pair<>(Boxing.boxBoolean(false), Boxing.boxBoolean(!this.d)));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(DisplayBrightnessViewModel.this, false, null, null, null, null, null, null, null, null, null, null, null, null, null, Boxing.boxBoolean(this.d), null, 49150, null);
            displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
            if (displayAndBrightnessV2 != null) {
                boolean z = this.d;
                main = Dispatchers.getMain();
                aVar = new a(displayAndBrightnessV2, z, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            DisplayBrightnessViewModel.this.getScreenOffFollowCurrentDialSwitchLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), Boxing.boxBoolean(this.d)));
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) objWriteSetting;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (!zBooleanValue) {
                DisplayBrightnessViewModel.this.getScreenOffFollowCurrentDialSwitchLiveData().postValue(new Pair<>(Boxing.boxBoolean(false), Boxing.boxBoolean(!this.d)));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(DisplayBrightnessViewModel.this, false, null, null, null, null, null, null, null, null, null, null, null, null, null, Boxing.boxBoolean(this.d), null, 49150, null);
            displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
            if (displayAndBrightnessV2 != null) {
                boolean z2 = this.d;
                main = Dispatchers.getMain();
                aVar = new a(displayAndBrightnessV2, z2, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            DisplayBrightnessViewModel.this.getScreenOffFollowCurrentDialSwitchLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), Boxing.boxBoolean(this.d)));
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOnByNewNotificationSwitchToDevice$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {391, 395}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ boolean d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOnByNewNotificationSwitchToDevice$1$1$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ DisplayAndBrightnessV2 b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DisplayAndBrightnessV2 displayAndBrightnessV2, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = displayAndBrightnessV2;
                this.c = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.setScreenOnByNewNotificationSwitch(Boxing.boxBoolean(this.c));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(1);
                this.a = z;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Display display = watchSettings.getDisplay();
                if (display == null) {
                    return;
                }
                display.setScreenOnByNewNotificationSwitch(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(HashMap<SettingsGroupType, Settings> map, boolean z, Continuation<? super n> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayBrightnessViewModel.this.new n(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002b  */
        /* JADX WARN: Code duplicated, block: B:22:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0059  */
        /* JADX WARN: Code duplicated, block: B:27:0x006c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            DisplayAndBrightnessV2 displayAndBrightnessV2;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = DisplayBrightnessViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                this.a = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            DisplayBrightnessViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
                if (displayAndBrightnessV2 != null) {
                    boolean z = this.d;
                    main = Dispatchers.getMain();
                    aVar = new a(displayAndBrightnessV2, z, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            DisplayBrightnessViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
                if (displayAndBrightnessV2 != null) {
                    boolean z2 = this.d;
                    main = Dispatchers.getMain();
                    aVar = new a(displayAndBrightnessV2, z2, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pushScreenOnByTurningWristActiveSpeed not change!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOnByTurningWristActiveSpeed$2$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {468, 480}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ EnumData d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOnByTurningWristActiveSpeed$2$1$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ EnumData b;
            public final /* synthetic */ EnumData c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EnumData enumData, EnumData enumData2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = enumData;
                this.c = enumData2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.setValue(this.c.getValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ EnumData a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(EnumData enumData) {
                super(1);
                this.a = enumData;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Display display = watchSettings.getDisplay();
                if (display == null) {
                    return;
                }
                display.setScreenOnByTurningWristActiveSpeed(Integer.valueOf(this.a.getValue()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(HashMap<SettingsGroupType, Settings> map, EnumData enumData, Continuation<? super p> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = enumData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayBrightnessViewModel.this.new p(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:21:0x0048  */
        /* JADX WARN: Code duplicated, block: B:23:0x006c  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b3 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objWriteSetting;
            boolean zBooleanValue;
            DisplayAndBrightnessV2 displayAndBrightnessV2;
            EnumData screenOnByTurningWristActiveSpeed;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    objWriteSetting = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
                DisplayBrightnessViewModel.this.getScreenOnByTurningWristActiveSpeedResultLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), Boxing.boxInt(this.d.getValue())));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = DisplayBrightnessViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                this.a = 1;
                objWriteSetting = settingsModule.writeSetting(map, this);
                if (objWriteSetting == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!zBooleanValue) {
                DisplayBrightnessViewModel.this.getScreenOnByTurningWristActiveSpeedResultLiveData().postValue(new Pair<>(Boxing.boxBoolean(false), Boxing.boxInt(this.d.getValue())));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(DisplayBrightnessViewModel.this, false, null, null, null, null, null, null, null, null, null, null, this.d, null, null, null, null, 63486, null);
            displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
            if (displayAndBrightnessV2 != null && (screenOnByTurningWristActiveSpeed = displayAndBrightnessV2.getScreenOnByTurningWristActiveSpeed()) != null) {
                EnumData enumData = this.d;
                main = Dispatchers.getMain();
                aVar = new a(screenOnByTurningWristActiveSpeed, enumData, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            DisplayBrightnessViewModel.this.getScreenOnByTurningWristActiveSpeedResultLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), Boxing.boxInt(this.d.getValue())));
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) objWriteSetting;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (!zBooleanValue) {
                DisplayBrightnessViewModel.this.getScreenOnByTurningWristActiveSpeedResultLiveData().postValue(new Pair<>(Boxing.boxBoolean(false), Boxing.boxInt(this.d.getValue())));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(DisplayBrightnessViewModel.this, false, null, null, null, null, null, null, null, null, null, null, this.d, null, null, null, null, 63486, null);
            displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
            if (displayAndBrightnessV2 != null) {
                EnumData enumData2 = this.d;
                main = Dispatchers.getMain();
                aVar = new a(screenOnByTurningWristActiveSpeed, enumData2, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            DisplayBrightnessViewModel.this.getScreenOnByTurningWristActiveSpeedResultLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), Boxing.boxInt(this.d.getValue())));
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pushScreenOnByTurningWristBeginOrEndTime not change";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOnByTurningWristBeginOrEndTime$2$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {509, 516}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ Time d;
        public final /* synthetic */ Time e;
        public final /* synthetic */ boolean f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOnByTurningWristBeginOrEndTime$2$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ DisplayBrightnessViewModel c;
            public final /* synthetic */ Time d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, DisplayBrightnessViewModel displayBrightnessViewModel, Time time, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = z;
                this.c = displayBrightnessViewModel;
                this.d = time;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Time screenOnByTurningWristEndTime;
                Time screenOnByTurningWristBeginTime;
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.b) {
                    DisplayAndBrightnessV2 displayAndBrightnessV2 = this.c.getDisplayAndBrightnessV2();
                    if (displayAndBrightnessV2 != null && (screenOnByTurningWristBeginTime = displayAndBrightnessV2.getScreenOnByTurningWristBeginTime()) != null) {
                        Time time = this.d;
                        screenOnByTurningWristBeginTime.setHour(time.getHour());
                        screenOnByTurningWristBeginTime.setMinute(time.getMinute());
                    }
                    DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(this.c, false, null, null, null, null, null, null, null, null, this.d, null, null, null, null, null, null, 65022, null);
                } else {
                    DisplayAndBrightnessV2 displayAndBrightnessV3 = this.c.getDisplayAndBrightnessV2();
                    if (displayAndBrightnessV3 != null && (screenOnByTurningWristEndTime = displayAndBrightnessV3.getScreenOnByTurningWristEndTime()) != null) {
                        Time time2 = this.d;
                        screenOnByTurningWristEndTime.setHour(time2.getHour());
                        screenOnByTurningWristEndTime.setMinute(time2.getMinute());
                    }
                    DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(this.c, false, null, null, null, null, null, null, null, null, null, this.d, null, null, null, null, null, 64510, null);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ DisplayBrightnessViewModel b;
            public final /* synthetic */ Time c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z, DisplayBrightnessViewModel displayBrightnessViewModel, Time time) {
                super(1);
                this.a = z;
                this.b = displayBrightnessViewModel;
                this.c = time;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                if (this.a) {
                    Display display = watchSettings.getDisplay();
                    if (display == null) {
                        return;
                    }
                    display.setScreenOnByTurningWristBeginTime(Integer.valueOf(this.b.k(this.c)));
                    return;
                }
                Display display2 = watchSettings.getDisplay();
                if (display2 == null) {
                    return;
                }
                display2.setScreenOnByTurningWristEndTime(Integer.valueOf(this.b.k(this.c)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(HashMap<SettingsGroupType, Settings> map, Time time, Time time2, boolean z, Continuation<? super r> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = time;
            this.e = time2;
            this.f = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayBrightnessViewModel.this.new r(this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002b  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:23:0x005f  */
        /* JADX WARN: Code duplicated, block: B:25:0x0076 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.f, DisplayBrightnessViewModel.this, this.e), 1, null);
                DisplayBrightnessViewModel.this.getScreenOnByTurningWristBeginOrEndTimeLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), this.e));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = DisplayBrightnessViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                this.a = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!zBooleanValue) {
                DisplayBrightnessViewModel.this.getScreenOnByTurningWristBeginOrEndTimeLiveData().postValue(new Pair<>(Boxing.boxBoolean(false), this.d));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            main = Dispatchers.getMain();
            aVar = new a(this.f, DisplayBrightnessViewModel.this, this.e, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.f, DisplayBrightnessViewModel.this, this.e), 1, null);
            DisplayBrightnessViewModel.this.getScreenOnByTurningWristBeginOrEndTimeLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), this.e));
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (!zBooleanValue) {
                DisplayBrightnessViewModel.this.getScreenOnByTurningWristBeginOrEndTimeLiveData().postValue(new Pair<>(Boxing.boxBoolean(false), this.d));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            main = Dispatchers.getMain();
            aVar = new a(this.f, DisplayBrightnessViewModel.this, this.e, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.f, DisplayBrightnessViewModel.this, this.e), 1, null);
            DisplayBrightnessViewModel.this.getScreenOnByTurningWristBeginOrEndTimeLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), this.e));
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public static final s a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pushScreenOnByTurningWristModeToDevice not change!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOnByTurningWristModeToDevice$2$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {564, 572}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ EnumData d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOnByTurningWristModeToDevice$2$1$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ EnumData b;
            public final /* synthetic */ EnumData c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EnumData enumData, EnumData enumData2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = enumData;
                this.c = enumData2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.setValue(this.c.getValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ EnumData a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(EnumData enumData) {
                super(1);
                this.a = enumData;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Display display = watchSettings.getDisplay();
                if (display == null) {
                    return;
                }
                display.setScreenOnByTurningWristMode(Integer.valueOf(this.a.getValue()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(HashMap<SettingsGroupType, Settings> map, EnumData enumData, Continuation<? super t> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = enumData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayBrightnessViewModel.this.new t(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:21:0x0048  */
        /* JADX WARN: Code duplicated, block: B:23:0x006c  */
        /* JADX WARN: Code duplicated, block: B:31:0x008f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objWriteSetting;
            boolean zBooleanValue;
            DisplayAndBrightnessV2 displayAndBrightnessV2;
            EnumData screenOnByTurningWristMode;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    objWriteSetting = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
                DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(DisplayBrightnessViewModel.this, false, null, null, null, null, null, null, null, this.d, null, null, null, null, null, null, null, 65278, null);
                DisplayBrightnessViewModel.this.getScreenOnByTurningWristModeResultLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), Boxing.boxInt(this.d.getValue())));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = DisplayBrightnessViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                this.a = 1;
                objWriteSetting = settingsModule.writeSetting(map, this);
                if (objWriteSetting == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!zBooleanValue) {
                DisplayBrightnessViewModel.this.getScreenOnByTurningWristModeResultLiveData().postValue(new Pair<>(Boxing.boxBoolean(false), Boxing.boxInt(this.d.getValue())));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
            if (displayAndBrightnessV2 != null && (screenOnByTurningWristMode = displayAndBrightnessV2.getScreenOnByTurningWristMode()) != null) {
                EnumData enumData = this.d;
                main = Dispatchers.getMain();
                aVar = new a(screenOnByTurningWristMode, enumData, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(DisplayBrightnessViewModel.this, false, null, null, null, null, null, null, null, this.d, null, null, null, null, null, null, null, 65278, null);
            DisplayBrightnessViewModel.this.getScreenOnByTurningWristModeResultLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), Boxing.boxInt(this.d.getValue())));
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) objWriteSetting;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (!zBooleanValue) {
                DisplayBrightnessViewModel.this.getScreenOnByTurningWristModeResultLiveData().postValue(new Pair<>(Boxing.boxBoolean(false), Boxing.boxInt(this.d.getValue())));
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
            if (displayAndBrightnessV2 != null) {
                EnumData enumData2 = this.d;
                main = Dispatchers.getMain();
                aVar = new a(screenOnByTurningWristMode, enumData2, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(DisplayBrightnessViewModel.this, false, null, null, null, null, null, null, null, this.d, null, null, null, null, null, null, null, 65278, null);
            DisplayBrightnessViewModel.this.getScreenOnByTurningWristModeResultLiveData().postValue(new Pair<>(Boxing.boxBoolean(true), Boxing.boxInt(this.d.getValue())));
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOnDuringSportSwitchToDevice$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {414, 418}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ boolean d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushScreenOnDuringSportSwitchToDevice$1$1$1$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ DisplayAndBrightnessV2 b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DisplayAndBrightnessV2 displayAndBrightnessV2, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = displayAndBrightnessV2;
                this.c = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.setScreenOnDuringSportSwitch(Boxing.boxBoolean(this.c));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(1);
                this.a = z;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Display display = watchSettings.getDisplay();
                if (display == null) {
                    return;
                }
                display.setScreenOnDuringSport(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(HashMap<SettingsGroupType, Settings> map, boolean z, Continuation<? super u> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayBrightnessViewModel.this.new u(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002b  */
        /* JADX WARN: Code duplicated, block: B:22:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0059  */
        /* JADX WARN: Code duplicated, block: B:27:0x006c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            DisplayAndBrightnessV2 displayAndBrightnessV2;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
                DisplayBrightnessViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = DisplayBrightnessViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                this.a = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            DisplayBrightnessViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
                if (displayAndBrightnessV2 != null) {
                    boolean z = this.d;
                    main = Dispatchers.getMain();
                    aVar = new a(displayAndBrightnessV2, z, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            DisplayBrightnessViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                displayAndBrightnessV2 = DisplayBrightnessViewModel.this.getDisplayAndBrightnessV2();
                if (displayAndBrightnessV2 != null) {
                    boolean z2 = this.d;
                    main = Dispatchers.getMain();
                    aVar = new a(displayAndBrightnessV2, z2, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            }
            DisplayBrightnessViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(int i) {
            super(1);
            this.a = i;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            Display display = watchSettings.getDisplay();
            if (display == null) {
                return;
            }
            display.setScreenOffDisplayMode(Integer.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ Time b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Time time) {
            super(1);
            this.b = time;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            Display display = watchSettings.getDisplay();
            if (display == null) {
                return;
            }
            display.setScreenOffDisplayBeginTime(Integer.valueOf(DisplayBrightnessViewModel.this.k(this.b)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ Time b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Time time) {
            super(1);
            this.b = time;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            Display display = watchSettings.getDisplay();
            if (display == null) {
                return;
            }
            display.setScreenOffDisplayEndTime(Integer.valueOf(DisplayBrightnessViewModel.this.k(this.b)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DisplayBrightnessViewModel() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.watchSettingRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IWatchSettingRepo>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IWatchSettingRepo invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IWatchSettingRepo.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.homeApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<HomeApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.watchfacesstore.api.HomeApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HomeApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(HomeApi.class), objArr2, objArr3);
            }
        });
        this.watchSkinBeansLiveData = new MutableLiveData<>();
        this.changeListener = new WeakChangeListener(this);
        MutableLiveData<DisplayAndBrightness> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        Unit unit = Unit.INSTANCE;
        this._displayBrightnessSetting = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(null);
        this._writingResult = mutableLiveData2;
        this._isSetting = new AtomicBoolean(false);
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(Boolean.FALSE);
        this._isShowLoading = mutableLiveData3;
        this.screenOnByTurningWristModeResultLiveData = new MutableLiveData<>();
        this.screenOnByTurningWristActiveSpeedResultLiveData = new MutableLiveData<>();
        this.screenOnByTurningWristBeginOrEndTimeLiveData = new MutableLiveData<>();
        this.screenOffFollowCurrentDialSwitchLiveData = new MutableLiveData<>();
        this.screenOffDialIdLiveData = new MutableLiveData<>();
        this.gesScreenModeVisibleLiveData = new MutableLiveData<>();
        this.sensitivityVisibleLiveData = new MutableLiveData<>();
        this.dialStyleDescLiveData = new MutableLiveData<>();
    }

    private final HashMap<SettingsGroupType, Settings> a(HashMap<SettingsGroupType, Settings> map, String str) {
        if (map == null) {
            HMLog.info(v, new a(str));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this._isSetting.set(false);
        this._isShowLoading.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeApi c() {
        return (HomeApi) this.homeApi.getValue();
    }

    private final IDisplayBrightnessRepo e() {
        IDisplayBrightnessRepo displayBrightnessRepoV2;
        IDisplayBrightnessRepo iDisplayBrightnessRepo = this.displayBrightnessRepo;
        if (iDisplayBrightnessRepo != null) {
            return iDisplayBrightnessRepo;
        }
        DisplayAndBrightness value = this._displayBrightnessSetting.getValue();
        if (value instanceof DisplayAndBrightnessV1) {
            displayBrightnessRepoV2 = new DisplayBrightnessRepoV1();
        } else {
            displayBrightnessRepoV2 = value instanceof DisplayAndBrightnessV2 ? new DisplayBrightnessRepoV2() : null;
        }
        this.displayBrightnessRepo = displayBrightnessRepoV2;
        return displayBrightnessRepoV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IWatchSettingRepo f() {
        return (IWatchSettingRepo) this.watchSettingRepo.getValue();
    }

    private final void g() {
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        Settings settings = map == null ? null : map.get(SettingsGroupType.DISPLAY);
        DisplayAndBrightnessV2 displayAndBrightnessV2 = settings instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) settings : null;
        if (displayAndBrightnessV2 == null) {
            return;
        }
        EnumData screenOnByTurningWristMode = displayAndBrightnessV2.getScreenOnByTurningWristMode();
        MutableLiveData<Boolean> mutableLiveData = this.gesScreenModeVisibleLiveData;
        Boolean boolValueOf = Boolean.valueOf(screenOnByTurningWristMode != null && screenOnByTurningWristMode.getContainDesc() && screenOnByTurningWristMode.checkValid());
        HMLog.info(v, new b(boolValueOf.booleanValue()));
        Unit unit = Unit.INSTANCE;
        mutableLiveData.postValue(boolValueOf);
        EnumData screenOnByTurningWristActiveSpeed = displayAndBrightnessV2.getScreenOnByTurningWristActiveSpeed();
        MutableLiveData<Boolean> mutableLiveData2 = this.sensitivityVisibleLiveData;
        Boolean boolValueOf2 = Boolean.valueOf(screenOnByTurningWristActiveSpeed != null && screenOnByTurningWristActiveSpeed.getContainDesc() && screenOnByTurningWristActiveSpeed.checkValid());
        HMLog.info(v, new c(boolValueOf2.booleanValue()));
        mutableLiveData2.postValue(boolValueOf2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(EnumData screenOffDisplayMode, Time screenOffDisplayBeginTime, Time screenOffDisplayEndTime, EnumData screenOffDialPlateType) {
        if (screenOffDisplayMode != null) {
            int value = screenOffDisplayMode.getValue();
            DisplayAndBrightnessV2 displayAndBrightnessV2 = getDisplayAndBrightnessV2();
            EnumData screenOffDisplayMode2 = displayAndBrightnessV2 == null ? null : displayAndBrightnessV2.getScreenOffDisplayMode();
            if (screenOffDisplayMode2 != null) {
                screenOffDisplayMode2.setValue(value);
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new v(value), 1, null);
        }
        if (screenOffDisplayBeginTime != null) {
            DisplayAndBrightnessV2 displayAndBrightnessV3 = getDisplayAndBrightnessV2();
            Time screenOffDisplayBeginTime2 = displayAndBrightnessV3 == null ? null : displayAndBrightnessV3.getScreenOffDisplayBeginTime();
            if (screenOffDisplayBeginTime2 != null) {
                screenOffDisplayBeginTime2.setHour(screenOffDisplayBeginTime.getHour());
            }
            DisplayAndBrightnessV2 displayAndBrightnessV4 = getDisplayAndBrightnessV2();
            Time screenOffDisplayBeginTime3 = displayAndBrightnessV4 == null ? null : displayAndBrightnessV4.getScreenOffDisplayBeginTime();
            if (screenOffDisplayBeginTime3 != null) {
                screenOffDisplayBeginTime3.setMinute(screenOffDisplayBeginTime.getMinute());
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new w(screenOffDisplayBeginTime), 1, null);
        }
        if (screenOffDisplayEndTime != null) {
            DisplayAndBrightnessV2 displayAndBrightnessV5 = getDisplayAndBrightnessV2();
            Time screenOffDisplayEndTime2 = displayAndBrightnessV5 == null ? null : displayAndBrightnessV5.getScreenOffDisplayEndTime();
            if (screenOffDisplayEndTime2 != null) {
                screenOffDisplayEndTime2.setHour(screenOffDisplayEndTime.getHour());
            }
            DisplayAndBrightnessV2 displayAndBrightnessV6 = getDisplayAndBrightnessV2();
            Time screenOffDisplayEndTime3 = displayAndBrightnessV6 == null ? null : displayAndBrightnessV6.getScreenOffDisplayEndTime();
            if (screenOffDisplayEndTime3 != null) {
                screenOffDisplayEndTime3.setMinute(screenOffDisplayEndTime.getMinute());
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new x(screenOffDisplayEndTime), 1, null);
        }
        if (screenOffDialPlateType == null) {
            return;
        }
        DisplayAndBrightnessV2 displayAndBrightnessV7 = getDisplayAndBrightnessV2();
        EnumData screenOffDialPlateType2 = displayAndBrightnessV7 != null ? displayAndBrightnessV7.getScreenOffDialPlateType() : null;
        if (screenOffDialPlateType2 == null) {
            return;
        }
        screenOffDialPlateType2.setValue(screenOffDialPlateType.getValue());
    }

    public static /* synthetic */ void i(DisplayBrightnessViewModel displayBrightnessViewModel, EnumData enumData, Time time, Time time2, EnumData enumData2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            enumData = null;
        }
        if ((i2 & 2) != 0) {
            time = null;
        }
        if ((i2 & 4) != 0) {
            time2 = null;
        }
        if ((i2 & 8) != 0) {
            enumData2 = null;
        }
        displayBrightnessViewModel.h(enumData, time, time2, enumData2);
    }

    private final boolean j() {
        if (this._isSetting.get()) {
            return false;
        }
        this._isSetting.set(true);
        this._isShowLoading.setValue(Boolean.TRUE);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int k(Time time) {
        return (time.getHour() * 60) + time.getMinute();
    }

    public static /* synthetic */ void pushInterestSetting$default(DisplayBrightnessViewModel displayBrightnessViewModel, EnumData enumData, Time time, Time time2, EnumData enumData2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            enumData = null;
        }
        if ((i2 & 2) != 0) {
            time = null;
        }
        if ((i2 & 4) != 0) {
            time2 = null;
        }
        if ((i2 & 8) != 0) {
            enumData2 = null;
        }
        displayBrightnessViewModel.pushInterestSetting(enumData, time, time2, enumData2);
    }

    public static /* synthetic */ void querySettings$default(DisplayBrightnessViewModel displayBrightnessViewModel, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        displayBrightnessViewModel.querySettings(z2);
    }

    public static /* synthetic */ void updateDisplayBrightnessSetting$default(DisplayBrightnessViewModel displayBrightnessViewModel, boolean z2, Boolean bool, IntData intData, EnumData enumData, EnumData enumData2, Time time, Time time2, EnumData enumData3, EnumData enumData4, Time time3, Time time4, EnumData enumData5, Boolean bool2, Boolean bool3, Boolean bool4, String str, int i2, Object obj) {
        displayBrightnessViewModel.updateDisplayBrightnessSetting((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : intData, (i2 & 8) != 0 ? null : enumData, (i2 & 16) != 0 ? null : enumData2, (i2 & 32) != 0 ? null : time, (i2 & 64) != 0 ? null : time2, (i2 & 128) != 0 ? null : enumData3, (i2 & 256) != 0 ? null : enumData4, (i2 & 512) != 0 ? null : time3, (i2 & 1024) != 0 ? null : time4, (i2 & 2048) != 0 ? null : enumData5, (i2 & 4096) != 0 ? null : bool2, (i2 & 8192) != 0 ? null : bool3, (i2 & 16384) != 0 ? null : bool4, (i2 & 32768) != 0 ? null : str);
    }

    public final int getChoiceIndex() {
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        EnumData screenOffDisplayMode = null;
        Settings settings = map == null ? null : map.get(SettingsGroupType.DISPLAY);
        if (settings instanceof DisplayAndBrightnessV1) {
            screenOffDisplayMode = ((DisplayAndBrightnessV1) settings).getScreenOffDisplayMode();
        } else if (settings instanceof DisplayAndBrightnessV2) {
            screenOffDisplayMode = ((DisplayAndBrightnessV2) settings).getScreenOffDisplayMode();
        }
        if (screenOffDisplayMode == null) {
            return 0;
        }
        return INSTANCE.a(screenOffDisplayMode.getEnums(), Integer.valueOf(screenOffDisplayMode.getValue()), 0);
    }

    @NotNull
    public final MutableLiveData<String> getDialStyleDescLiveData() {
        return this.dialStyleDescLiveData;
    }

    @Nullable
    public final DisplayAndBrightnessV2 getDisplayAndBrightnessV2() {
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        Settings settings = map == null ? null : map.get(SettingsGroupType.DISPLAY);
        if (settings instanceof DisplayAndBrightnessV2) {
            return (DisplayAndBrightnessV2) settings;
        }
        return null;
    }

    @NotNull
    public final LiveData<DisplayAndBrightness> getDisplayBrightnessSetting() {
        return this._displayBrightnessSetting;
    }

    @NotNull
    public final String[] getGesScreenModeList(@NotNull Context context, @NotNull ArrayList<Integer> enums) {
        int i2;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enums, 10));
        Iterator<T> it2 = enums.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (iIntValue == 0) {
                i2 = R.string.watch_setting_ges_screen_mode_off;
            } else if (iIntValue == 1) {
                i2 = R.string.watch_setting_ges_screen_mode_on_time;
            } else if (iIntValue != 2) {
                i2 = iIntValue != 3 ? R.string.unknown : R.string.watch_setting_ges_screen_mode_on_smart;
            } else {
                i2 = R.string.watch_setting_ges_screen_mode_on_all_day;
            }
            arrayList.add(context.getString(i2));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    @NotNull
    public final MutableLiveData<Boolean> getGesScreenModeVisibleLiveData() {
        return this.gesScreenModeVisibleLiveData;
    }

    @NotNull
    public final List<InterestEnableMode> getInterestModeList() {
        EnumData screenOffDisplayMode;
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        ArrayList<Integer> enums = null;
        Settings settings = map == null ? null : map.get(SettingsGroupType.DISPLAY);
        if (settings instanceof DisplayAndBrightnessV1) {
            EnumData screenOffDisplayMode2 = ((DisplayAndBrightnessV1) settings).getScreenOffDisplayMode();
            if (screenOffDisplayMode2 != null) {
                enums = screenOffDisplayMode2.getEnums();
            }
        } else if ((settings instanceof DisplayAndBrightnessV2) && (screenOffDisplayMode = ((DisplayAndBrightnessV2) settings).getScreenOffDisplayMode()) != null) {
            enums = screenOffDisplayMode.getEnums();
        }
        if (enums == null || enums.isEmpty()) {
            return A;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enums, 10));
        Iterator<T> it2 = enums.iterator();
        while (it2.hasNext()) {
            arrayList.add(InterestEnableMode.INSTANCE.parseInterestEnableMode(((Number) it2.next()).intValue()));
        }
        return arrayList;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getScreenOffDialIdLiveData() {
        return this.screenOffDialIdLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Boolean>> getScreenOffFollowCurrentDialSwitchLiveData() {
        return this.screenOffFollowCurrentDialSwitchLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Integer>> getScreenOnByTurningWristActiveSpeedResultLiveData() {
        return this.screenOnByTurningWristActiveSpeedResultLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Time>> getScreenOnByTurningWristBeginOrEndTimeLiveData() {
        return this.screenOnByTurningWristBeginOrEndTimeLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Integer>> getScreenOnByTurningWristModeResultLiveData() {
        return this.screenOnByTurningWristModeResultLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSensitivityVisibleLiveData() {
        return this.sensitivityVisibleLiveData;
    }

    @Nullable
    public final List<InterestWatchFaceVo> getWatchFaceVos() {
        return this.watchFaceVos;
    }

    @NotNull
    public final MutableLiveData<List<InterestWatchFaceVo>> getWatchSkinBeansLiveData() {
        return this.watchSkinBeansLiveData;
    }

    @NotNull
    public final LiveData<Boolean> getWritingResult() {
        return this._writingResult;
    }

    @NotNull
    public final Pair<Time, Time> hMLiftWristConfigToBeginEndTime(@NotNull HMLiftWristConfig config) {
        return new Pair<>(new Time(config.getStartHour(), config.getStartMinutes()), new Time(config.getStopHour(), config.getStopMinutes()));
    }

    @NotNull
    public final Pair<EnumData, EnumData> hMLiftWristConfigToGesModeSensitivity(@NotNull HMLiftWristConfig config) {
        int i2;
        if (config.isAllDay()) {
            i2 = 2;
        } else {
            i2 = config.isEnable() ? 1 : 0;
        }
        return new Pair<>(new EnumData(i2), new EnumData(config.getSensitivity()));
    }

    public final void initJob(@NotNull HMDeviceType mDeviceType) {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) ManagerFunctionsKt.getDeviceManagerApi().getDevice(mDeviceType);
        this.hmMiLiProDevice = hMMiLiProDevice;
        SettingsModule settingsModule = hMMiLiProDevice == null ? null : (SettingsModule) hMMiLiProDevice.getChannelModule(SettingsModule.class);
        this.settingsModule = settingsModule;
        if (settingsModule == null) {
            return;
        }
        settingsModule.addListener(this.changeListener);
    }

    @NotNull
    public final LiveData<Boolean> isShowLoading() {
        return this._isShowLoading;
    }

    public final void loadDialStyleDesc() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DisplayBrightnessViewModel$loadDialStyleDesc$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void loadInterestDials() {
        StringEnum screenOffDialId;
        DisplayAndBrightnessV2 displayAndBrightnessV2 = getDisplayAndBrightnessV2();
        ArrayList<String> enums = (displayAndBrightnessV2 == null || (screenOffDialId = displayAndBrightnessV2.getScreenOffDialId()) == null) ? null : screenOffDialId.getEnums();
        if (enums == null || enums.isEmpty()) {
            HMLog.info(v, d.a);
        } else {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DisplayBrightnessViewModel$loadInterestDials$$inlined$safeLaunch$1(null, this, enums), 2, null);
        }
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
    }

    @NotNull
    public final String[] parseInterestModeDesc(@NotNull List<? extends InterestEnableMode> modes) {
        int i2;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(modes, 10));
        Iterator<T> it2 = modes.iterator();
        while (it2.hasNext()) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[((InterestEnableMode) it2.next()).ordinal()];
            if (i3 == 1) {
                i2 = R.string.ges_screen_type_all_day;
            } else if (i3 == 2) {
                i2 = R.string.avoid_enable_smart;
            } else if (i3 == 3) {
                i2 = R.string.avoid_enable_time;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.string.ges_screen_type_close;
            }
            arrayList.add(DeviceXFunctionsKt.getString(i2));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public final void pushAutoBrightnessToDevice(boolean isChecked) {
        if (j()) {
            IDisplayBrightnessRepo iDisplayBrightnessRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iDisplayBrightnessRepoE == null ? null : iDisplayBrightnessRepoE.getDtoWithAutoBrightness(isChecked), "getDtoWithAutoBrightness");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DisplayBrightnessViewModel$pushAutoBrightnessToDevice$$inlined$safeLaunch$1(null, this, mapA, isChecked), 2, null);
        }
    }

    public final void pushAutoInterestTime(@NotNull EnumData enumData) {
        if (j()) {
            IDisplayBrightnessRepo iDisplayBrightnessRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iDisplayBrightnessRepoE == null ? null : iDisplayBrightnessRepoE.getDtoWithScreenOffTime(enumData), "getDtoWithScreenOffTime");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DisplayBrightnessViewModel$pushAutoInterestTime$$inlined$safeLaunch$1(null, this, mapA, enumData), 2, null);
        }
    }

    public final void pushBrightnessValueToDevice(@NotNull IntData intData) {
        if (j()) {
            IDisplayBrightnessRepo iDisplayBrightnessRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iDisplayBrightnessRepoE == null ? null : iDisplayBrightnessRepoE.getDtoWithBrightness(intData), "getDtoWithBrightness");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DisplayBrightnessViewModel$pushBrightnessValueToDevice$$inlined$safeLaunch$1(null, this, mapA, intData), 2, null);
        }
    }

    public final void pushGesScreenDeviceSetting(@NotNull HMLiftWristConfig config, @NotNull HMCallback<Object> callBack) {
        int i2;
        callBack.onStart();
        HashMap map = new HashMap();
        if (config.isAllDay()) {
            i2 = 2;
        } else {
            i2 = config.isEnable() ? 1 : 0;
        }
        EnumData enumData = new EnumData(i2);
        Time time = new Time(config.getStartHour(), config.getStartMinutes());
        Time time2 = new Time(config.getStopHour(), config.getStopMinutes());
        EnumData enumData2 = new EnumData(config.getSensitivity());
        SettingsGroupType settingsGroupType = SettingsGroupType.DISPLAY;
        DisplayAndBrightnessV1 displayAndBrightnessV1 = new DisplayAndBrightnessV1();
        displayAndBrightnessV1.setScreenOnByTurningWristMode(enumData);
        displayAndBrightnessV1.setScreenOnByTurningWristBeginTime(time);
        displayAndBrightnessV1.setScreenOnByTurningWristEndTime(time2);
        displayAndBrightnessV1.setScreenOnByTurningWristActiveSpeed(enumData2);
        map.put(settingsGroupType, displayAndBrightnessV1);
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DisplayBrightnessViewModel$pushGesScreenDeviceSetting$$inlined$safeLaunch$1(null, this, map, callBack), 2, null);
    }

    public final void pushInterestSetting(@Nullable EnumData screenOffDisplayMode, @Nullable Time screenOffDisplayBeginTime, @Nullable Time screenOffDisplayEndTime, @Nullable EnumData screenOffDialPlateType) {
        if (j()) {
            IDisplayBrightnessRepo iDisplayBrightnessRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iDisplayBrightnessRepoE == null ? null : iDisplayBrightnessRepoE.getDtoWithInterestSetting(screenOffDisplayMode, screenOffDisplayBeginTime, screenOffDisplayEndTime, screenOffDialPlateType), "pushScreenOnByTurningWristActiveSpeed");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DisplayBrightnessViewModel$pushInterestSetting$$inlined$safeLaunch$1(null, this, mapA, screenOffDisplayMode, screenOffDisplayBeginTime, screenOffDisplayEndTime, screenOffDialPlateType), 2, null);
        }
    }

    public final void pushScreenOffDialIdToDevice(@NotNull String style) {
        StringEnum screenOffDialId;
        DisplayAndBrightness value = getDisplayBrightnessSetting().getValue();
        DisplayAndBrightnessV2 displayAndBrightnessV2 = value instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) value : null;
        if (Intrinsics.areEqual(style, (displayAndBrightnessV2 == null || (screenOffDialId = displayAndBrightnessV2.getScreenOffDialId()) == null) ? null : screenOffDialId.getValue())) {
            b();
            HMLog.info(v, k.a);
        } else if (j()) {
            IDisplayBrightnessRepo iDisplayBrightnessRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iDisplayBrightnessRepoE == null ? null : iDisplayBrightnessRepoE.mo3440getDtoWithScreenOffDialId(style), "getDtoWithScreenOffDialId");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DisplayBrightnessViewModel$pushScreenOffDialIdToDevice$$inlined$safeLaunch$1(null, this, mapA, style), 2, null);
        }
    }

    public final void pushScreenOffFollowCurrentDialSwitch(boolean enable) {
        if (j()) {
            IDisplayBrightnessRepo iDisplayBrightnessRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iDisplayBrightnessRepoE == null ? null : iDisplayBrightnessRepoE.mo3441getDtoWithScreenOffFollowCurrentDialSwitch(enable), "getDtoWithScreenOffFollowCurrentDialSwitch");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DisplayBrightnessViewModel$pushScreenOffFollowCurrentDialSwitch$$inlined$safeLaunch$1(null, this, mapA, enable), 2, null);
        }
    }

    public final void pushScreenOnByNewNotificationSwitchToDevice(boolean enable) {
        if (j()) {
            IDisplayBrightnessRepo iDisplayBrightnessRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iDisplayBrightnessRepoE == null ? null : iDisplayBrightnessRepoE.mo3442getDtoWithScreenOnByNewNotificationSwitch(enable), "getDtoWithScreenOnByNewNotificationSwitch");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DisplayBrightnessViewModel$pushScreenOnByNewNotificationSwitchToDevice$$inlined$safeLaunch$1(null, this, mapA, enable), 2, null);
        }
    }

    public final void pushScreenOnByTurningWristActiveSpeed(@NotNull EnumData enumData) {
        DisplayAndBrightness value = getDisplayBrightnessSetting().getValue();
        DisplayAndBrightnessV2 displayAndBrightnessV2 = value instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) value : null;
        EnumData screenOnByTurningWristActiveSpeed = displayAndBrightnessV2 == null ? null : displayAndBrightnessV2.getScreenOnByTurningWristActiveSpeed();
        if (screenOnByTurningWristActiveSpeed != null && screenOnByTurningWristActiveSpeed.getValue() == enumData.getValue()) {
            HMLog.info(v, o.a);
            return;
        }
        if (j()) {
            IDisplayBrightnessRepo iDisplayBrightnessRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iDisplayBrightnessRepoE == null ? null : iDisplayBrightnessRepoE.getDtoWithScreenOnByTurningWristActiveSpeed(enumData), "pushScreenOnByTurningWristActiveSpeed");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DisplayBrightnessViewModel$pushScreenOnByTurningWristActiveSpeed$$inlined$safeLaunch$1(null, this, mapA, enumData), 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    public final void pushScreenOnByTurningWristBeginOrEndTime(boolean isBegin, @NotNull Time time) {
        Time screenOnByTurningWristEndTime;
        Time time2;
        DisplayAndBrightness value = getDisplayBrightnessSetting().getValue();
        DisplayAndBrightnessV2 displayAndBrightnessV2 = value instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) value : null;
        if (isBegin) {
            if (displayAndBrightnessV2 == null) {
                time2 = null;
            } else {
                screenOnByTurningWristEndTime = displayAndBrightnessV2.getScreenOnByTurningWristBeginTime();
                time2 = screenOnByTurningWristEndTime;
            }
        } else if (displayAndBrightnessV2 == null) {
            time2 = null;
        } else {
            screenOnByTurningWristEndTime = displayAndBrightnessV2.getScreenOnByTurningWristEndTime();
            time2 = screenOnByTurningWristEndTime;
        }
        if (time2 != null && k(time2) == k(time)) {
            HMLog.info(v, q.a);
            return;
        }
        if (j()) {
            IDisplayBrightnessRepo iDisplayBrightnessRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iDisplayBrightnessRepoE != null ? iDisplayBrightnessRepoE.getDtoWithScreenOnByTurningWristBeginOrEndTime(isBegin, time) : null, "pushScreenOnByTurningWristBeginOrEndTime");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DisplayBrightnessViewModel$pushScreenOnByTurningWristBeginOrEndTime$$inlined$safeLaunch$1(null, this, mapA, time2, time, isBegin), 2, null);
        }
    }

    public final void pushScreenOnByTurningWristModeToDevice(@NotNull EnumData enumData) {
        DisplayAndBrightness value = getDisplayBrightnessSetting().getValue();
        DisplayAndBrightnessV2 displayAndBrightnessV2 = value instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) value : null;
        EnumData screenOnByTurningWristMode = displayAndBrightnessV2 == null ? null : displayAndBrightnessV2.getScreenOnByTurningWristMode();
        if (screenOnByTurningWristMode != null && screenOnByTurningWristMode.getValue() == enumData.getValue()) {
            HMLog.info(v, s.a);
            return;
        }
        if (j()) {
            IDisplayBrightnessRepo iDisplayBrightnessRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iDisplayBrightnessRepoE == null ? null : iDisplayBrightnessRepoE.getDtoWithScreenOnByTurningWristMode(enumData), "getDtoWithScreenOnByTurningWristMode");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DisplayBrightnessViewModel$pushScreenOnByTurningWristModeToDevice$$inlined$safeLaunch$1(null, this, mapA, enumData), 2, null);
        }
    }

    public final void pushScreenOnDuringSportSwitchToDevice(boolean enable) {
        if (j()) {
            IDisplayBrightnessRepo iDisplayBrightnessRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iDisplayBrightnessRepoE == null ? null : iDisplayBrightnessRepoE.mo3443getDtoWithScreenOnDuringSportSwitch(enable), "getDtoWithScreenOnDuringSportSwitch");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new DisplayBrightnessViewModel$pushScreenOnDuringSportSwitchToDevice$$inlined$safeLaunch$1(null, this, mapA, enable), 2, null);
        }
    }

    public final void querySettings(boolean needDesc) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DisplayBrightnessViewModel$querySettings$$inlined$safeLaunch$1(null, this, needDesc), 2, null);
    }

    public final void removeListener() {
        SettingsModule settingsModule = this.settingsModule;
        if (settingsModule == null) {
            return;
        }
        settingsModule.removeListener(this.changeListener);
    }

    public final void setSettings(@Nullable HashMap<SettingsGroupType, Settings> watchSettings) {
        MutableLiveData<DisplayAndBrightness> mutableLiveData = this._displayBrightnessSetting;
        Settings settings = watchSettings == null ? null : watchSettings.get(SettingsGroupType.DISPLAY);
        mutableLiveData.setValue(settings instanceof DisplayAndBrightness ? (DisplayAndBrightness) settings : null);
        this.watchSettings = watchSettings;
        g();
    }

    public final void updateDisplayBrightnessSetting(boolean needRefreshObserver, @Nullable Boolean autoBrightness, @Nullable IntData brightness, @Nullable EnumData screenOffTime, @Nullable EnumData screenOffDisplayMode, @Nullable Time screenOffDisplayBeginTime, @Nullable Time screenOffDisplayEndTime, @Nullable EnumData screenOffDialPlateType, @Nullable EnumData screenOnByTurningWristMode, @Nullable Time screenOnByTurningWristBeginTime, @Nullable Time screenOnByTurningWristEndTime, @Nullable EnumData screenOnByTurningWristActiveSpeed, @Nullable Boolean screenOnByNewNotificationSwitch, @Nullable Boolean screenOnDuringSportSwitch, @Nullable Boolean screenOffFollowCurrentDialSwitch, @Nullable String screenOffDialId) {
        DisplayAndBrightness value = needRefreshObserver ? this._displayBrightnessSetting.getValue() : this._displayBrightnessSetting.getValue();
        IDisplayBrightnessRepo iDisplayBrightnessRepoE = e();
        DisplayAndBrightness displayAndBrightnessUpdateDto = iDisplayBrightnessRepoE == null ? null : iDisplayBrightnessRepoE.updateDto(value, autoBrightness, brightness, screenOffTime, screenOffDisplayMode, screenOffDisplayBeginTime, screenOffDisplayEndTime, screenOffDialPlateType, screenOnByTurningWristMode, screenOnByTurningWristBeginTime, screenOnByTurningWristEndTime, screenOnByTurningWristActiveSpeed, screenOnByNewNotificationSwitch, screenOnDuringSportSwitch, screenOffFollowCurrentDialSwitch, screenOffDialId);
        if (needRefreshObserver) {
            this._displayBrightnessSetting.setValue(displayAndBrightnessUpdateDto);
        }
    }
}
