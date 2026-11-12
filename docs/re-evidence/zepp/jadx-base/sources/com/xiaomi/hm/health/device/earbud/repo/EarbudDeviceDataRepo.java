package com.xiaomi.hm.health.device.earbud.repo;

import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.passport.Configs;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HmVoiceType;
import com.xiaomi.hm.health.bt.profile.earbud.model.CurrentMusicState;
import com.xiaomi.hm.health.bt.profile.earbud.model.EarbudRebootInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicControlCmd;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.RestModeInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.TomatoModeInfo;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfo;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfoDao;
import com.xiaomi.hm.health.device.earbud.model.EarbudDeviceLeftSizeResult;
import com.xiaomi.hm.health.device.earbud.repo.EarbudDeviceDataRepo;
import com.xiaomi.hm.health.device.earbud.service.MusicFileUtil;
import com.xiaomi.hm.health.device.earbud.viewmodel.DeviceMusicSection;
import com.xmlywind.sdk.common.Constants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 x2\u00020\u0001:\u0001xB\u0013\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010[¢\u0006\u0004\bv\u0010wJ\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0002J\u0014\u0010\u000f\u001a\u00020\u000b*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\b\u0010%\u001a\u0004\u0018\u00010$J\b\u0010'\u001a\u0004\u0018\u00010&J\u000f\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u0004\u0018\u00010\u001a2\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b,\u0010-J\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.J\f\u00101\u001a\b\u0012\u0004\u0012\u00020/0.J\u000e\u00104\u001a\u00020\u00022\u0006\u00103\u001a\u000202J\u000e\u00105\u001a\u00020\u00102\u0006\u00103\u001a\u000202J\u000e\u00106\u001a\u00020\u00102\u0006\u00103\u001a\u000202J\u000e\u00107\u001a\u00020\u001a2\u0006\u00103\u001a\u000202J\u0006\u00108\u001a\u00020\u0010J\u000e\u0010;\u001a\u00020\u001a2\u0006\u0010:\u001a\u000209J!\u0010=\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002022\b\b\u0002\u0010<\u001a\u00020\u001a¢\u0006\u0004\b=\u0010>J\b\u0010@\u001a\u0004\u0018\u00010?J\u000e\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020?J\u000e\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u000202J\u0006\u0010F\u001a\u00020\u001aJ\u000e\u0010H\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001aJ\u000e\u0010J\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010K\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010\rJ\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010\rJ\u0006\u0010O\u001a\u00020\u0002J\u000e\u0010P\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0002J\u0006\u0010Q\u001a\u00020\u001aJ\u000e\u0010S\u001a\u00020\u001a2\u0006\u0010R\u001a\u00020\u001aJ\u0006\u0010T\u001a\u00020\u001aJ\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010\rJ\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010.J\u000e\u0010Y\u001a\u00020\u001a2\u0006\u0010X\u001a\u00020\u0004J\u000e\u0010Z\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0004R\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001d\u0010d\u001a\u00020_8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0018\u0010f\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010eR\u001e\u0010i\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010hR\u001d\u0010m\u001a\u00020j8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010a\u001a\u0004\bk\u0010lR\u0016\u0010p\u001a\u00020n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010oR\u001f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00040q8\u0006@\u0006¢\u0006\f\n\u0004\bk\u0010r\u001a\u0004\bs\u0010t¨\u0006y"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/repo/EarbudDeviceDataRepo;", "Lorg/koin/core/component/KoinComponent;", "", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/databases/model/Alarm;", "item", "i", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", Constants.EXT, "c", "", "", "f", "", "", "e", "", "refreshDevice", "Lcom/xiaomi/hm/health/bt/device/HmEarbudDevice;", "getDevice", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "getLeftButteryInfo", "getRightButteryInfo", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/CurrentMusicState;", "getCurrentMusicState", "voiceId", "", "setCurrentMusic", "(I)Ljava/lang/Boolean;", "minute", "status", "setRestMode", "(II)Ljava/lang/Boolean;", "restMinute", "setTomatoMode", "(III)Ljava/lang/Boolean;", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/RestModeInfo;", "getRestInfo", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/TomatoModeInfo;", "getTomatoInfo", "", "getVolume", "()Ljava/lang/Short;", "volume", "setVolume", "(S)Ljava/lang/Boolean;", "", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/DeviceMusicSection;", "getMusicList", "onDownloadStatusChanged", "", "id", "getMusicSize", "addToDownload", "forceDownload", "deleteMusic", "removeAllDownload", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/MusicControlCmd;", Constant.h, "musicControl", "isCancel", "removeDownload", "(JZ)Ljava/lang/Long;", "Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfo;", "getDownloadingMusic", WebConstant.QueryParam.TYPE_MUSIC, "Lcom/xiaomi/hm/health/device/earbud/model/EarbudDeviceLeftSizeResult;", "checkDeviceLeftSize", "musicId", "getMusicName", "isSleepNotDisturb", "isNotDisturb", "saveIsSleepNotDisturb", "settings", "setLeftClickSetting", "setRightClickSetting", "", "getLeftClickSetting", "getRightClickSetting", "getPlayTime", "setPlayTime", "getSmartPlay", "smartPlay", "setSmartPlay", Configs.Params.RESET, "Lcom/xiaomi/hm/health/bt/profile/earbud/model/EarbudRebootInfo;", "getDeviceRebootTimes", "loadAlarms", "alarm", "saveAlarm", "alarm2Ext", "Lcom/xiaomi/hm/health/bt/device/HmEarbudDevice$OnEarbudLRConnectChangeListener;", "a", "Lcom/xiaomi/hm/health/bt/device/HmEarbudDevice$OnEarbudLRConnectChangeListener;", "mLfConnectListener", "Lcom/huami/devicex/manager/DeviceManagerApi;", "b", "Lkotlin/Lazy;", "h", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/bt/device/HmEarbudDevice;", "mDevice", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/MusicInfo;", "Ljava/util/List;", "mMusicList", "Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfoDao;", "g", "()Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfoDao;", "dao", "Lcom/xiaomi/hm/health/device/earbud/repo/EarbudCloudDataRepo;", "Lcom/xiaomi/hm/health/device/earbud/repo/EarbudCloudDataRepo;", "cloudRepo", "Ljava/util/Comparator;", "Ljava/util/Comparator;", "getAlarmComparator", "()Ljava/util/Comparator;", "alarmComparator", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HmEarbudDevice$OnEarbudLRConnectChangeListener;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudDeviceDataRepo implements KoinComponent {
    public static final int MODE_STATUS_START = 2;
    public static final int MODE_STATUS_START_REST = 1;
    public static final int MODE_STATUS_STOP = 3;

    @NotNull
    private static final String h = "EarbudDeviceDataRepo";
    private static final int i = 20;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final HmEarbudDevice.OnEarbudLRConnectChangeListener mLfConnectListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private HmEarbudDevice mDevice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private List<MusicInfo> mMusicList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy dao;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final EarbudCloudDataRepo cloudRepo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Comparator<Alarm> alarmComparator;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "add download file size=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(int i, int i2, Boolean bool) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "set rest time=" + this.a + ", status=" + this.b + ", result=" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Integer num) {
            super(0);
            this.a = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get device left size result=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(byte[] bArr, Boolean bool) {
            super(0);
            this.b = bArr;
            this.c = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "set right click setting value=" + EarbudDeviceDataRepo.this.f(this.b) + ", result=" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "pending size=" + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c0 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(boolean z, Boolean bool) {
            super(0);
            this.a = z;
            this.b = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "set smart play value=" + this.a + ", result=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ EarbudMusicInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EarbudMusicInfo earbudMusicInfo) {
            super(0);
            this.a = earbudMusicInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get music:" + this.a.getId() + " cloud file size error";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d0 extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(int i, int i2, int i3, Boolean bool) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "set tomato time=" + this.a + ", restTime=" + this.b + ", status=" + this.c + ", result=" + this.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfoDao;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<EarbudMusicInfoDao> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudMusicInfoDao getA() {
            return HMDaoManager.getInstance().getEarbudMusicInfoDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e0 extends Lambda implements Function0<String> {
        public final /* synthetic */ short a;
        public final /* synthetic */ Boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(short s, Boolean bool) {
            super(0);
            this.a = s;
            this.b = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            short s = this.a;
            return "set volume value=" + ((int) s) + ", result=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ Ref.BooleanRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, Ref.BooleanRef booleanRef) {
            super(0);
            this.a = j;
            this.b = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "delete music id=" + this.a + ", result=" + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ CurrentMusicState a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(CurrentMusicState currentMusicState) {
            super(0);
            this.a = currentMusicState;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getCurrentMusicState result=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ EarbudRebootInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(EarbudRebootInfo earbudRebootInfo) {
            super(0);
            this.a = earbudRebootInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            EarbudRebootInfo earbudRebootInfo = this.a;
            Integer numValueOf = earbudRebootInfo == null ? null : Integer.valueOf(earbudRebootInfo.getOtherTimes());
            EarbudRebootInfo earbudRebootInfo2 = this.a;
            return "get left device reboot time result= 585times:" + numValueOf + " st times:" + (earbudRebootInfo2 != null ? Integer.valueOf(earbudRebootInfo2.getStTimes()) : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<EarbudRebootInfo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Ref.ObjectRef<EarbudRebootInfo> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            EarbudRebootInfo earbudRebootInfo = this.a.element;
            Integer numValueOf = earbudRebootInfo == null ? null : Integer.valueOf(earbudRebootInfo.getOtherTimes());
            EarbudRebootInfo earbudRebootInfo2 = this.a.element;
            return "get right device reboot time result= 585times:" + numValueOf + " st times:" + (earbudRebootInfo2 != null ? Integer.valueOf(earbudRebootInfo2.getStTimes()) : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Byte> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List<Byte> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get left click setting result=" + EarbudDeviceDataRepo.this.e(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ List<DeviceMusicSection> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List<DeviceMusicSection> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "device music list : " + new Gson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Integer num) {
            super(0);
            this.a = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get play time result=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ RestModeInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(RestModeInfo restModeInfo) {
            super(0);
            this.a = restModeInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get rest info result=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Byte> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(List<Byte> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get right click setting result=" + EarbudDeviceDataRepo.this.e(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get smart play result=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "time : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ TomatoModeInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(TomatoModeInfo tomatoModeInfo) {
            super(0);
            this.a = tomatoModeInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get tomato info result=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ Short a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Short sh) {
            super(0);
            this.a = sh;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get volume result=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get is sleep not disturb result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ MusicControlCmd a;
        public final /* synthetic */ Boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(MusicControlCmd musicControlCmd, Boolean bool) {
            super(0);
            this.a = musicControlCmd;
            this.b = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "music control cmd=" + this.a + ", result=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "reset device result=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ Alarm a;
        public final /* synthetic */ Boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Alarm alarm, Boolean bool) {
            super(0);
            this.a = alarm;
            this.b = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "save alarm=" + this.a + ", result=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(boolean z, Boolean bool) {
            super(0);
            this.a = z;
            this.b = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "set is sleep not disturb value=" + this.a + ", result=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(int i, Boolean bool) {
            super(0);
            this.a = i;
            this.b = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "setCurrentMusic id=" + this.a + ", result=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(byte[] bArr, Boolean bool) {
            super(0);
            this.b = bArr;
            this.c = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "set left click setting value=" + EarbudDeviceDataRepo.this.f(this.b) + ", result=" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(int i, Boolean bool) {
            super(0);
            this.a = i;
            this.b = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "set play time value=" + this.a + ", result=" + this.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EarbudDeviceDataRepo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EarbudDeviceDataRepo(@Nullable HmEarbudDevice.OnEarbudLRConnectChangeListener onEarbudLRConnectChangeListener) {
        this.mLfConnectListener = onEarbudLRConnectChangeListener;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.earbud.repo.EarbudDeviceDataRepo$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.mDevice = (HmEarbudDevice) h().getDevice(HMDeviceType.EARBUD);
        this.dao = LazyKt__LazyJVMKt.lazy(e.a);
        this.cloudRepo = new EarbudCloudDataRepo();
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        if (hmEarbudDevice != null) {
            hmEarbudDevice.setOnEarbudLRConnectChangeListener(onEarbudLRConnectChangeListener);
        }
        this.alarmComparator = new Comparator() { // from class: fe1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return EarbudDeviceDataRepo.b(this.a, (Alarm) obj, (Alarm) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(EarbudDeviceDataRepo earbudDeviceDataRepo, Alarm alarm, Alarm alarm2) {
        int i2 = earbudDeviceDataRepo.i(alarm);
        int i3 = earbudDeviceDataRepo.i(alarm2);
        if (Intrinsics.areEqual(alarm.getEnabled(), alarm2.getEnabled())) {
            return i2 == i3 ? alarm.getIndex().intValue() - alarm2.getIndex().intValue() : i2 - i3;
        }
        return alarm.getEnabled().booleanValue() ? -1 : 1;
    }

    private final Alarm c(AlarmClockExt ext) {
        Alarm alarm = new Alarm();
        alarm.setEnabled(Boolean.valueOf(ext.isEnable()));
        alarm.setIndex(Integer.valueOf(ext.getIndex()));
        if (ext.getRepeat() == -128) {
            alarm.setMDays(0);
        } else {
            alarm.setMDays(Integer.valueOf(ext.getRepeat()));
        }
        alarm.setVisible(Boolean.valueOf(ext.isVisible()));
        alarm.setIsSmart(Boolean.valueOf(ext.isSmart()));
        long j2 = 60000;
        long timeInMillis = ext.getCalendar().getTimeInMillis() / j2;
        long jCurrentTimeMillis = System.currentTimeMillis() / j2;
        Integer mDays = alarm.getMDays();
        if (mDays != null && mDays.intValue() == 0 && timeInMillis <= jCurrentTimeMillis && alarm.getEnabled().booleanValue()) {
            ext.getCalendar().add(5, 1);
            alarm.setCalendar(Long.valueOf(ext.getCalendar().getTimeInMillis()));
        } else {
            alarm.setCalendar(Long.valueOf(ext.getCalendar().getTimeInMillis()));
        }
        alarm.setIsSmartWakeup(Boolean.valueOf(ext.isLazy()));
        alarm.setMSmartWakeupDuration(0);
        return alarm;
    }

    private final int d(int i2) {
        return ((int) Math.ceil(i2 / 64.0f)) * 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(List<? extends Object> list) {
        if (list == null) {
            return "null";
        }
        return "[" + TextUtils.join(",", list) + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        return "[" + TextUtils.join(",", CollectionsKt__CollectionsKt.mutableListOf(bArr)) + "]";
    }

    private final EarbudMusicInfoDao g() {
        return (EarbudMusicInfoDao) this.dao.getValue();
    }

    private final DeviceManagerApi h() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final int i(Alarm item) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(item.getCalendar().longValue());
        int i2 = (calendar.get(11) * 60) + calendar.get(12);
        HMLog.debug("SortByTimeAndId", new p(i2));
        return i2;
    }

    public static /* synthetic */ Long removeDownload$default(EarbudDeviceDataRepo earbudDeviceDataRepo, long j2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return earbudDeviceDataRepo.removeDownload(j2, z2);
    }

    public final void addToDownload(long id) {
        EarbudMusicInfo earbudMusicInfoLoad = g().load(Long.valueOf(id));
        if (earbudMusicInfoLoad == null) {
            return;
        }
        Integer localStatus = earbudMusicInfoLoad.getLocalStatus();
        if (!(localStatus != null && localStatus.intValue() == 0)) {
            earbudMusicInfoLoad = null;
        }
        if (earbudMusicInfoLoad == null) {
            return;
        }
        List<EarbudMusicInfo> list = g().queryBuilder().where(EarbudMusicInfoDao.Properties.LocalStatus.in(1, 2), new WhereCondition[0]).list();
        earbudMusicInfoLoad.setLocalStatus((list == null || list.isEmpty()) ^ true ? 1 : 2);
        earbudMusicInfoLoad.setLocalUpdateTime(Long.valueOf(System.currentTimeMillis()));
        g().insertOrReplaceInTx(earbudMusicInfoLoad);
    }

    @NotNull
    public final AlarmClockExt alarm2Ext(@NotNull Alarm alarm) {
        AlarmClockExt alarmClockExt = new AlarmClockExt((byte) alarm.getIndex().intValue());
        alarmClockExt.setEnable(alarm.getEnabled().booleanValue());
        alarmClockExt.setRepeat(alarm.getMDays().intValue());
        alarmClockExt.setVisible(alarm.getVisible().booleanValue());
        alarmClockExt.setSmart(alarm.getIsSmart().booleanValue());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(alarm.getCalendar().longValue());
        alarmClockExt.setCalendar(calendar);
        alarmClockExt.enableLazyMode(Intrinsics.areEqual(alarm.getIsSmartWakeup(), Boolean.TRUE));
        Integer mDays = alarm.getMDays();
        if (mDays != null && mDays.intValue() == 0) {
            Calendar calendar2 = Calendar.getInstance();
            Calendar calendar3 = alarmClockExt.getCalendar();
            calendar2.set(13, 0);
            calendar3.set(13, 0);
            if (calendar3.before(calendar2)) {
                alarmClockExt.getCalendar().add(5, 1);
            }
        }
        return alarmClockExt;
    }

    @NotNull
    public final EarbudDeviceLeftSizeResult checkDeviceLeftSize(@NotNull EarbudMusicInfo music) throws Throwable {
        List<EarbudMusicInfo> list = g().queryBuilder().where(EarbudMusicInfoDao.Properties.LocalStatus.in(1, 2), new WhereCondition[0]).list();
        List<MusicInfo> list2 = this.mMusicList;
        if ((list2 == null ? 0 : list2.size()) + (list == null ? 0 : list.size()) >= 20) {
            return new EarbudDeviceLeftSizeResult(1, 0, 2, null);
        }
        Integer destFileSize = MusicFileUtil.INSTANCE.getDestFileSize(music.getLeftChannel());
        if (destFileSize == null) {
            HMLog.info(h, new d(music));
            return new EarbudDeviceLeftSizeResult(0, 3);
        }
        int iIntValue = destFileSize.intValue();
        HMLog.info(h, new a(iIntValue));
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Integer earbudsLeftSizeSync = hmEarbudDevice == null ? null : hmEarbudDevice.getEarbudsLeftSizeSync();
        HMLog.info(h, new b(earbudsLeftSizeSync));
        if (earbudsLeftSizeSync == null) {
            return new EarbudDeviceLeftSizeResult(0, 2);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        if (list != null) {
            for (EarbudMusicInfo earbudMusicInfo : list) {
                int i2 = intRef.element;
                Integer destFileSize2 = MusicFileUtil.INSTANCE.getDestFileSize(earbudMusicInfo.getLeftChannel());
                intRef.element = i2 + d(destFileSize2 == null ? 0 : destFileSize2.intValue());
                HMLog.info(h, new c(intRef));
            }
        }
        return new EarbudDeviceLeftSizeResult((iIntValue + intRef.element) - earbudsLeftSizeSync.intValue(), 0, 2, null);
    }

    public final boolean deleteMusic(long id) {
        ArrayList arrayList;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        if (hmEarbudDevice != null && hmEarbudDevice.deleteMusicSync((int) id)) {
            List<MusicInfo> list = this.mMusicList;
            if (list == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((MusicInfo) obj).getMusicId() != id) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
            this.mMusicList = arrayList;
            EarbudMusicInfo earbudMusicInfoLoad = g().load(Long.valueOf(id));
            if (earbudMusicInfoLoad != null) {
                earbudMusicInfoLoad.setLocalStatus(0);
                earbudMusicInfoLoad.setLocalUpdateTime(Long.valueOf(System.currentTimeMillis()));
                g().insertOrReplaceInTx(earbudMusicInfoLoad);
            }
            booleanRef.element = true;
        }
        HMLog.info(h, new f(id, booleanRef));
        return booleanRef.element;
    }

    public final void forceDownload(long id) {
        EarbudMusicInfo earbudMusicInfoLoad = g().load(Long.valueOf(id));
        if (earbudMusicInfoLoad != null) {
            Integer localStatus = earbudMusicInfoLoad.getLocalStatus();
            if (!(localStatus != null && localStatus.intValue() == 1)) {
                earbudMusicInfoLoad = null;
            }
            if (earbudMusicInfoLoad != null) {
                EarbudMusicInfo earbudMusicInfo = (EarbudMusicInfo) CollectionsKt.firstOrNull((List) g().queryBuilder().where(EarbudMusicInfoDao.Properties.LocalStatus.eq(2), new WhereCondition[0]).orderAsc(EarbudMusicInfoDao.Properties.LocalUpdateTime).list());
                if (earbudMusicInfo != null) {
                    earbudMusicInfo.setLocalStatus(1);
                    earbudMusicInfo.setLocalUpdateTime(Long.valueOf(System.currentTimeMillis()));
                    g().insertOrReplaceInTx(earbudMusicInfo);
                }
                earbudMusicInfoLoad.setLocalStatus(2);
                earbudMusicInfoLoad.setLocalUpdateTime(Long.valueOf(System.currentTimeMillis()));
                g().insertOrReplaceInTx(earbudMusicInfoLoad);
            }
        }
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        if (hmEarbudDevice == null) {
            return;
        }
        hmEarbudDevice.cancelDownloadMusic();
    }

    @NotNull
    public final Comparator<Alarm> getAlarmComparator() {
        return this.alarmComparator;
    }

    @Nullable
    public final CurrentMusicState getCurrentMusicState() {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        CurrentMusicState currentMusicStateSync = hmEarbudDevice == null ? null : hmEarbudDevice.getCurrentMusicStateSync(HmVoiceType.NOISE);
        HMLog.info(h, new g(currentMusicStateSync));
        return currentMusicStateSync;
    }

    @Nullable
    /* JADX INFO: renamed from: getDevice, reason: from getter */
    public final HmEarbudDevice getMDevice() {
        return this.mDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final List<EarbudRebootInfo> getDeviceRebootTimes() {
        HmBaseEarbudDevice rightDevice;
        T t2;
        HmBaseEarbudDevice rightDevice2;
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        EarbudRebootInfo deviceRebootTimesSync = hmEarbudDevice == null ? null : hmEarbudDevice.getDeviceRebootTimesSync();
        HMLog.info(h, new h(deviceRebootTimesSync));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        HmEarbudDevice hmEarbudDevice2 = this.mDevice;
        if ((hmEarbudDevice2 == null || (rightDevice = hmEarbudDevice2.getRightDevice()) == null || !rightDevice.isConnected()) ? false : true) {
            HmEarbudDevice hmEarbudDevice3 = this.mDevice;
            objectRef.element = (hmEarbudDevice3 == null || (rightDevice2 = hmEarbudDevice3.getRightDevice()) == null) ? 0 : rightDevice2.getDeviceRebootTimesSync();
        }
        HMLog.info(h, new i(objectRef));
        if (deviceRebootTimesSync == null || (t2 = objectRef.element) == 0) {
            return null;
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new EarbudRebootInfo[]{deviceRebootTimesSync, (EarbudRebootInfo) t2});
    }

    @Nullable
    public final EarbudMusicInfo getDownloadingMusic() {
        List<EarbudMusicInfo> list = g().queryBuilder().where(EarbudMusicInfoDao.Properties.LocalStatus.eq(2), new WhereCondition[0]).list();
        if (list == null) {
            return null;
        }
        return (EarbudMusicInfo) CollectionsKt.firstOrNull((List) list);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final BatteryInfo getLeftButteryInfo() {
        DeviceInfo deviceInfo;
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        BatteryInfo batteryInfo = hmEarbudDevice == null ? null : hmEarbudDevice.getBatteryInfo();
        if (batteryInfo != null) {
            return batteryInfo;
        }
        HmEarbudDevice hmEarbudDevice2 = this.mDevice;
        if (hmEarbudDevice2 == null || (deviceInfo = hmEarbudDevice2.getDeviceInfo()) == null) {
            return null;
        }
        return h().getEarbudBattery(true, deviceInfo.getDeviceID());
    }

    @Nullable
    public final List<Byte> getLeftClickSetting() {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        List<Byte> deviceSettingSync = hmEarbudDevice == null ? null : hmEarbudDevice.getDeviceSettingSync();
        HMLog.info(h, new j(deviceSettingSync));
        return deviceSettingSync;
    }

    @NotNull
    public final List<DeviceMusicSection> getMusicList() {
        List arrayList;
        Object next;
        MusicInfo musicInfo;
        long musicId;
        Long id;
        ArrayList arrayList2 = new ArrayList();
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        List<MusicInfo> musicListSync = hmEarbudDevice == null ? null : hmEarbudDevice.getMusicListSync(HmVoiceType.NOISE);
        this.mMusicList = musicListSync;
        if (musicListSync != null) {
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(musicListSync, 10));
            Iterator<T> it2 = musicListSync.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf((int) ((MusicInfo) it2.next()).getMusicId()));
            }
            if (!(!arrayList3.isEmpty())) {
                arrayList3 = null;
            }
            if (arrayList3 != null) {
                this.cloudRepo.getMusicByIds(arrayList3);
            }
        }
        List<EarbudMusicInfo> list = g().queryBuilder().where(EarbudMusicInfoDao.Properties.LocalStatus.eq(3), new WhereCondition[0]).list();
        if (list != null) {
            for (EarbudMusicInfo earbudMusicInfo : list) {
                List<MusicInfo> list2 = this.mMusicList;
                if (list2 == null) {
                    musicInfo = null;
                } else {
                    Iterator<T> it3 = list2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        musicId = ((MusicInfo) next).getMusicId();
                        id = earbudMusicInfo.getId();
                    } while (!(id != null && musicId == id.longValue()));
                    musicInfo = (MusicInfo) next;
                }
                if ((musicInfo == null ? earbudMusicInfo : null) != null) {
                    earbudMusicInfo.setLocalStatus(0);
                    g().updateInTx(earbudMusicInfo);
                }
            }
        }
        List<MusicInfo> list3 = this.mMusicList;
        if (list3 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (MusicInfo musicInfo2 : list3) {
                EarbudMusicInfo earbudMusicInfoLoad = g().load(Long.valueOf(musicInfo2.getMusicId()));
                if (earbudMusicInfoLoad == null) {
                    earbudMusicInfoLoad = new EarbudMusicInfo();
                    earbudMusicInfoLoad.setId(Long.valueOf(musicInfo2.getMusicId()));
                    earbudMusicInfoLoad.setName("");
                    earbudMusicInfoLoad.setDescription("");
                    earbudMusicInfoLoad.setOfficialBuiltin(Boolean.FALSE);
                    Boolean bool = Boolean.TRUE;
                    earbudMusicInfoLoad.setIsFree(bool);
                    earbudMusicInfoLoad.setPrice(Float.valueOf(0.0f));
                    earbudMusicInfoLoad.setSkuId("");
                    earbudMusicInfoLoad.setDownloadAble(bool);
                    earbudMusicInfoLoad.setThumb("");
                    earbudMusicInfoLoad.setImage("");
                    earbudMusicInfoLoad.setBanner("");
                    earbudMusicInfoLoad.setLocalStatus(3);
                }
                Integer localStatus = earbudMusicInfoLoad.getLocalStatus();
                if (localStatus == null || localStatus.intValue() != 3) {
                    earbudMusicInfoLoad.setLocalStatus(3);
                    earbudMusicInfoLoad.setLocalUpdateTime(Long.valueOf(System.currentTimeMillis()));
                    g().insertOrReplace(earbudMusicInfoLoad);
                }
                arrayList.add(new DeviceMusicSection(earbudMusicInfoLoad));
            }
        }
        if (arrayList == null) {
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        }
        arrayList2.addAll(arrayList);
        HMLog.info(h, new k(arrayList2));
        ArrayList arrayList4 = new ArrayList();
        EarbudMusicInfo downloadingMusic = getDownloadingMusic();
        if (downloadingMusic != null) {
            arrayList4.add(downloadingMusic);
        }
        List<EarbudMusicInfo> list4 = g().queryBuilder().where(EarbudMusicInfoDao.Properties.LocalStatus.eq(1), new WhereCondition[0]).orderAsc(EarbudMusicInfoDao.Properties.LocalUpdateTime).list();
        if (list4 == null) {
            list4 = CollectionsKt__CollectionsKt.emptyList();
        }
        arrayList4.addAll(list4);
        ArrayList arrayList5 = arrayList4.isEmpty() ^ true ? arrayList4 : null;
        if (arrayList5 != null) {
            arrayList2.add(new DeviceMusicSection(true, ""));
            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(new DeviceMusicSection((EarbudMusicInfo) it4.next()));
            }
            arrayList2.addAll(arrayList6);
        }
        return arrayList2;
    }

    @NotNull
    public final String getMusicName(long musicId) {
        String name;
        EarbudMusicInfo earbudMusicInfoLoad = g().load(Long.valueOf(musicId));
        return (earbudMusicInfoLoad == null || (name = earbudMusicInfoLoad.getName()) == null) ? "" : name;
    }

    public final int getMusicSize(long id) {
        Object next;
        List<MusicInfo> list = this.mMusicList;
        if (list == null) {
            return 0;
        }
        Iterator<T> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((MusicInfo) next).getMusicId() == id));
        MusicInfo musicInfo = (MusicInfo) next;
        if (musicInfo == null) {
            return 0;
        }
        return musicInfo.getMusicSize();
    }

    public final int getPlayTime() {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Integer numValueOf = hmEarbudDevice == null ? null : Integer.valueOf(hmEarbudDevice.getMusicPlayTimeSync());
        HMLog.info(h, new l(numValueOf));
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    @Nullable
    public final RestModeInfo getRestInfo() {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        RestModeInfo restInfoSync = hmEarbudDevice == null ? null : hmEarbudDevice.getRestInfoSync();
        HMLog.info(h, new m(restInfoSync));
        return restInfoSync;
    }

    @Nullable
    public final BatteryInfo getRightButteryInfo() {
        HmBaseEarbudDevice rightDevice;
        DeviceInfo deviceInfo;
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        BatteryInfo batteryInfo = (hmEarbudDevice == null || (rightDevice = hmEarbudDevice.getRightDevice()) == null) ? null : rightDevice.getBatteryInfo();
        if (batteryInfo != null) {
            return batteryInfo;
        }
        HmEarbudDevice hmEarbudDevice2 = this.mDevice;
        if (hmEarbudDevice2 == null || (deviceInfo = hmEarbudDevice2.getDeviceInfo()) == null) {
            return null;
        }
        return h().getEarbudBattery(true, deviceInfo.getDeviceID());
    }

    @Nullable
    public final List<Byte> getRightClickSetting() {
        HmBaseEarbudDevice rightDevice;
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        List<Byte> deviceSettingSync = null;
        if (hmEarbudDevice != null && (rightDevice = hmEarbudDevice.getRightDevice()) != null) {
            deviceSettingSync = rightDevice.getDeviceSettingSync();
        }
        HMLog.info(h, new n(deviceSettingSync));
        return deviceSettingSync;
    }

    public final boolean getSmartPlay() {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.getSmartPlaySync());
        HMLog.info(h, new o(boolValueOf));
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    @Nullable
    public final TomatoModeInfo getTomatoInfo() {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        TomatoModeInfo tomatoInfoSync = hmEarbudDevice == null ? null : hmEarbudDevice.getTomatoInfoSync();
        HMLog.info(h, new q(tomatoInfoSync));
        return tomatoInfoSync;
    }

    @Nullable
    public final Short getVolume() {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Short shValueOf = hmEarbudDevice == null ? null : Short.valueOf(hmEarbudDevice.getVolumeSync());
        HMLog.info(h, new r(shValueOf));
        return shValueOf;
    }

    public final boolean isSleepNotDisturb() {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.getIsSleepNotDisturbSync());
        HMLog.info(h, new s(boolValueOf));
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    @Nullable
    public final List<Alarm> loadAlarms() {
        ArrayList<AlarmClockExt> alarmsSync;
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        if (hmEarbudDevice == null || (alarmsSync = hmEarbudDevice.getAlarmsSync()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : alarmsSync) {
            if (((AlarmClockExt) obj).isVisible()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((AlarmClockExt) it2.next()));
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList2, this.alarmComparator);
        if (listSortedWith == null) {
            return null;
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) listSortedWith);
    }

    public final boolean musicControl(@NotNull MusicControlCmd cmd) {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.musicControlSync(cmd));
        HMLog.info(h, new t(cmd, boolValueOf));
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    @NotNull
    public final List<DeviceMusicSection> onDownloadStatusChanged() {
        List arrayList;
        Object next;
        MusicInfo musicInfo;
        long musicId;
        Long id;
        List arrayList2;
        ArrayList arrayList3 = new ArrayList();
        List<EarbudMusicInfo> list = g().queryBuilder().where(EarbudMusicInfoDao.Properties.LocalStatus.eq(3), new WhereCondition[0]).orderDesc(EarbudMusicInfoDao.Properties.LocalUpdateTime).list();
        if (list == null) {
            arrayList = null;
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list) {
                EarbudMusicInfo earbudMusicInfo = (EarbudMusicInfo) obj;
                List<MusicInfo> list2 = this.mMusicList;
                if (list2 == null) {
                    musicInfo = null;
                } else {
                    Iterator<T> it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        musicId = ((MusicInfo) next).getMusicId();
                        id = earbudMusicInfo.getId();
                    } while (!(id != null && musicId == id.longValue()));
                    musicInfo = (MusicInfo) next;
                }
                if (musicInfo == null) {
                    arrayList4.add(obj);
                }
            }
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList.add(new DeviceMusicSection((EarbudMusicInfo) it3.next()));
            }
        }
        if (arrayList == null) {
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        }
        arrayList3.addAll(arrayList);
        List<MusicInfo> list3 = this.mMusicList;
        if (list3 == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (MusicInfo musicInfo2 : list3) {
                EarbudMusicInfo earbudMusicInfoLoad = g().load(Long.valueOf(musicInfo2.getMusicId()));
                if (earbudMusicInfoLoad == null) {
                    earbudMusicInfoLoad = new EarbudMusicInfo();
                    earbudMusicInfoLoad.setId(Long.valueOf(musicInfo2.getMusicId()));
                    earbudMusicInfoLoad.setName("");
                    earbudMusicInfoLoad.setDescription("");
                    earbudMusicInfoLoad.setOfficialBuiltin(Boolean.FALSE);
                    Boolean bool = Boolean.TRUE;
                    earbudMusicInfoLoad.setIsFree(bool);
                    earbudMusicInfoLoad.setPrice(Float.valueOf(0.0f));
                    earbudMusicInfoLoad.setSkuId("");
                    earbudMusicInfoLoad.setDownloadAble(bool);
                    earbudMusicInfoLoad.setThumb("");
                    earbudMusicInfoLoad.setImage("");
                    earbudMusicInfoLoad.setBanner("");
                    earbudMusicInfoLoad.setLocalStatus(3);
                    Unit unit = Unit.INSTANCE;
                }
                arrayList2.add(new DeviceMusicSection(earbudMusicInfoLoad));
            }
        }
        if (arrayList2 == null) {
            arrayList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        arrayList3.addAll(arrayList2);
        ArrayList arrayList5 = new ArrayList();
        EarbudMusicInfo downloadingMusic = getDownloadingMusic();
        if (downloadingMusic != null) {
            arrayList5.add(downloadingMusic);
        }
        List<EarbudMusicInfo> list4 = g().queryBuilder().where(EarbudMusicInfoDao.Properties.LocalStatus.eq(1), new WhereCondition[0]).orderAsc(EarbudMusicInfoDao.Properties.LocalUpdateTime).list();
        if (list4 == null) {
            list4 = CollectionsKt__CollectionsKt.emptyList();
        }
        arrayList5.addAll(list4);
        ArrayList arrayList6 = arrayList5.isEmpty() ^ true ? arrayList5 : null;
        if (arrayList6 != null) {
            arrayList3.add(new DeviceMusicSection(true, ""));
            ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                arrayList7.add(new DeviceMusicSection((EarbudMusicInfo) it4.next()));
            }
            arrayList3.addAll(arrayList7);
        }
        return arrayList3;
    }

    public final void refreshDevice() {
        HmEarbudDevice hmEarbudDevice = (HmEarbudDevice) h().getDevice(HMDeviceType.EARBUD);
        this.mDevice = hmEarbudDevice;
        if (hmEarbudDevice == null) {
            return;
        }
        hmEarbudDevice.setOnEarbudLRConnectChangeListener(this.mLfConnectListener);
    }

    public final void removeAllDownload() {
        g().deleteAll();
    }

    @Nullable
    public final Long removeDownload(long id, boolean isCancel) {
        EarbudMusicInfo earbudMusicInfo;
        EarbudMusicInfo earbudMusicInfoLoad = g().load(Long.valueOf(id));
        if (earbudMusicInfoLoad != null) {
            earbudMusicInfoLoad.setLocalStatus(0);
            earbudMusicInfoLoad.setLocalUpdateTime(Long.valueOf(System.currentTimeMillis()));
            g().insertOrReplaceInTx(earbudMusicInfoLoad);
        }
        if (isCancel) {
            HmEarbudDevice hmEarbudDevice = this.mDevice;
            if (hmEarbudDevice != null) {
                hmEarbudDevice.cancelDownloadMusic();
            }
            List<EarbudMusicInfo> list = g().queryBuilder().where(EarbudMusicInfoDao.Properties.LocalStatus.eq(1), new WhereCondition[0]).orderAsc(EarbudMusicInfoDao.Properties.LocalUpdateTime).list();
            if (list != null && (earbudMusicInfo = (EarbudMusicInfo) CollectionsKt.firstOrNull((List) list)) != null) {
                Long id2 = earbudMusicInfo.getId();
                earbudMusicInfo.setLocalStatus(2);
                earbudMusicInfo.setLocalUpdateTime(Long.valueOf(System.currentTimeMillis()));
                g().insertOrReplaceInTx(earbudMusicInfo);
                return id2;
            }
        }
        return null;
    }

    public final boolean reset() {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.reset());
        HMLog.info(h, new u(boolValueOf));
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    public final boolean saveAlarm(@NotNull Alarm alarm) {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.setAlarmSync(CollectionsKt__CollectionsKt.mutableListOf(alarm2Ext(alarm))));
        HMLog.info(h, new v(alarm, boolValueOf));
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    public final boolean saveIsSleepNotDisturb(boolean isNotDisturb) {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.setIsSleepNotDisturbSync(isNotDisturb));
        HMLog.info(h, new w(isNotDisturb, boolValueOf));
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    @Nullable
    public final Boolean setCurrentMusic(int voiceId) {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.switchMusicSync(HmVoiceType.NOISE, voiceId));
        HMLog.info(h, new x(voiceId, boolValueOf));
        return boolValueOf;
    }

    public final boolean setLeftClickSetting(@NotNull byte[] settings) {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.setDeviceClickSettingSync(settings));
        HMLog.info(h, new y(settings, boolValueOf));
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    public final boolean setPlayTime(int minute) {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.setMusicPlayTimeSync(minute));
        HMLog.info(h, new z(minute, boolValueOf));
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    @Nullable
    public final Boolean setRestMode(int minute, int status) {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.setRestModeSync(minute, status));
        HMLog.info(h, new a0(minute, status, boolValueOf));
        return boolValueOf;
    }

    public final boolean setRightClickSetting(@NotNull byte[] settings) {
        HmBaseEarbudDevice rightDevice;
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = null;
        if (hmEarbudDevice != null && (rightDevice = hmEarbudDevice.getRightDevice()) != null) {
            boolValueOf = Boolean.valueOf(rightDevice.setDeviceClickSettingSync(settings));
        }
        HMLog.info(h, new b0(settings, boolValueOf));
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    public final boolean setSmartPlay(boolean smartPlay) {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.setSmartPlaySync(smartPlay));
        HMLog.info(h, new c0(smartPlay, boolValueOf));
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    @Nullable
    public final Boolean setTomatoMode(int minute, int restMinute, int status) {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.setTomatoModeSync(minute, restMinute, status));
        HMLog.info(h, new d0(minute, restMinute, status, boolValueOf));
        return boolValueOf;
    }

    @Nullable
    public final Boolean setVolume(short volume) {
        HmEarbudDevice hmEarbudDevice = this.mDevice;
        Boolean boolValueOf = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.setVolumeSync(volume));
        HMLog.info(h, new e0(volume, boolValueOf));
        return boolValueOf;
    }

    public /* synthetic */ EarbudDeviceDataRepo(HmEarbudDevice.OnEarbudLRConnectChangeListener onEarbudLRConnectChangeListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : onEarbudLRConnectChangeListener);
    }
}
