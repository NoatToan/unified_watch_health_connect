package com.huami.femalehealth.logiclib.repo;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.android.vo.Resource;
import com.huami.core.device.wifi_settings.service.WiFiSettingInit;
import com.huami.femalehealth.logiclib.api.FemaleHealthWebApi;
import com.huami.femalehealth.logiclib.api.pojo.FirstUseInfoBean;
import com.huami.femalehealth.logiclib.device.DeviceCallback;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.dto.MenstruationConfigDto;
import com.huami.femalehealth.logiclib.dto.MenstruationTotalDto;
import com.huami.femalehealth.logiclib.helper.AppExecutors;
import com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils;
import com.huami.femalehealth.logiclib.helper.ext.BeanExKt;
import com.huami.femalehealth.logiclib.helper.ext.VoToBeanKt;
import com.huami.femalehealth.logiclib.manager.DataCacheManager;
import com.huami.femalehealth.logiclib.repo.SettingRepo;
import com.huami.femalehealth.logiclib.vo.SettingVo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u000267B'\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0002J$\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0013\u0010\u0012\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0014J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J4\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00142\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0002J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u000bJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001dR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/huami/femalehealth/logiclib/repo/SettingRepo;", "", "Lcom/huami/femalehealth/logiclib/vo/SettingVo;", "initVo", "", "e", "vo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/android/vo/Resource;", "Lcom/huami/femalehealth/logiclib/repo/SettingRepo$SettingResult;", QQLogin.KEY_RESULT, "", "i", "keep", "Lcom/huami/femalehealth/logiclib/device/DeviceCallback;", "callback", hl.k, "g", "loadSettingsRemote", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "loadSettings", "setInitSetting", WiFiSettingInit.KEY_DEVICE_EVENT, "igineDevice", "setSetting", "readFromSp", "isFirstTime", "clearLocalSetting", "", "getLastCheckIncTime", "time", "setLastCheckIncTime", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "a", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "appExecutors", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "b", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "webApi", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "c", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "sp", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "manager", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "singleExecutor", "<init>", "(Lcom/huami/femalehealth/logiclib/helper/AppExecutors;Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;)V", "Companion", "SettingResult", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class SettingRepo {

    @NotNull
    public static final String TAG = "SettingRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthWebApi webApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SharedPreferencesUtils sp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MenstruationDataManager manager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Executor singleExecutor = Executors.newSingleThreadExecutor();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/repo/SettingRepo$SettingResult;", "", "<init>", "(Ljava/lang/String;I)V", com.alipay.sdk.m.f0.c.p, "NET_DISCONNECT", "NET_ERROR", "DEV_DISCONNECT", "DEV_ERROR", "DEV_NOt_SUPPORT", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public enum SettingResult {
        SUCCESS,
        NET_DISCONNECT,
        NET_ERROR,
        DEV_DISCONNECT,
        DEV_ERROR,
        DEV_NOt_SUPPORT
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "isFirstTime, periodLen=" + SettingRepo.this.sp.getPeriodLen() + ", cycleLen=" + SettingRepo.this.sp.getCycleLen() + ", lastMenstruationTime=" + SettingRepo.this.sp.getLastMenstruationTime();
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
        public final String invoke() {
            return "loadSettings fail";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadSettingsRemote fail";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ SettingVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SettingVo settingVo) {
            super(0);
            this.a = settingVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("saveToSp:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setInitSetting success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setInitSetting, fail";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ SettingVo a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SettingVo settingVo, boolean z, boolean z2) {
            super(0);
            this.a = settingVo;
            this.b = z;
            this.c = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setSetting, settingVo=" + this.a + " deviceConnect = " + this.b + " igineDevice = " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ SettingVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SettingVo settingVo) {
            super(0);
            this.a = settingVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("setSetting success, vo=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ApiResponse<String> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("setSetting, fail, errorMsg=", ((ApiErrorResponse) this.a).getErrorMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setSettingToDevice, no need to write";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationTotalDto a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MenstruationTotalDto menstruationTotalDto) {
            super(0);
            this.a = menstruationTotalDto;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("setInitSetting, dto=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setSettingToDevice, use configDto";
        }
    }

    public SettingRepo(@NotNull AppExecutors appExecutors, @NotNull FemaleHealthWebApi femaleHealthWebApi, @NotNull SharedPreferencesUtils sharedPreferencesUtils, @NotNull MenstruationDataManager menstruationDataManager) {
        this.appExecutors = appExecutors;
        this.webApi = femaleHealthWebApi;
        this.sp = sharedPreferencesUtils;
        this.manager = menstruationDataManager;
    }

    private final boolean e(SettingVo initVo) {
        return initVo.getEstimatedMenstrualDays() > 0 && initVo.getMenstrualCycle() > 0 && initVo.getMenstrualCycle() - initVo.getEstimatedMenstrualDays() > 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SettingRepo settingRepo, MutableLiveData mutableLiveData) {
        ApiResponse<FirstUseInfoBean> firstUseInfo = DataCacheManager.INSTANCE.getFirstUseInfo();
        if (firstUseInfo instanceof ApiSuccessResponse) {
            settingRepo.g(BeanExKt.toSettingVo((FirstUseInfoBean) ((ApiSuccessResponse) firstUseInfo).getBody()));
        } else if (firstUseInfo instanceof ApiErrorResponse) {
            HMLog.error$default(TAG, null, null, b.a, 6, null);
        }
        mutableLiveData.postValue(Resource.INSTANCE.success(settingRepo.readFromSp()));
    }

    private final void g(SettingVo vo) {
        HMLog.info("xys_SettingRepo", new d(vo));
        this.sp.setCycleLen(vo.getMenstrualCycle());
        this.sp.setPeriodLen(vo.getEstimatedMenstrualDays());
        this.sp.setLastMenstruationTime(vo.getLastMenstrualTime());
        this.sp.setEnablePredict(vo.getIntelligentPrediction());
        this.sp.setAppNotify(vo.getAppPush());
        this.sp.setAppBeforeMenstruationDay(vo.getAppBeforeMenstruationPush());
        this.sp.setAppBeforeOvulationDay(vo.getAppBeforeOvulationPush());
        this.sp.setHwNotify(vo.getHardwarePush());
        this.sp.setHwBeforeMenstruationDay(vo.getHardwareBeforeMenstruationPush());
        this.sp.setHwBeforeOvulationDay(vo.getHardwareBeforeOvulationPush());
        this.sp.setFirstTime(vo.getFirstTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SettingRepo settingRepo, SettingVo settingVo) {
        if (settingRepo.e(settingVo)) {
            settingRepo.g(settingVo);
            if (settingRepo.webApi.initSetting(VoToBeanKt.toSettingBean(settingVo)) instanceof ApiSuccessResponse) {
                HMLog.info(TAG, e.a);
            } else {
                HMLog.error$default(TAG, null, null, f.a, 6, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(final SettingVo vo, final MutableLiveData<Resource<SettingResult>> ret) {
        this.singleExecutor.execute(new Runnable() { // from class: vr6
            @Override // java.lang.Runnable
            public final void run() {
                SettingRepo.j(this.a, vo, ret);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SettingRepo settingRepo, SettingVo settingVo, MutableLiveData mutableLiveData) {
        settingRepo.g(settingVo);
        ApiResponse<String> apiResponseInitSetting = settingRepo.webApi.initSetting(VoToBeanKt.toSettingBean(settingVo));
        if (apiResponseInitSetting instanceof ApiSuccessResponse) {
            HMLog.info(TAG, new h(settingVo));
            mutableLiveData.postValue(Resource.INSTANCE.success(SettingResult.SUCCESS));
        } else if (apiResponseInitSetting instanceof ApiErrorResponse) {
            HMLog.error$default(TAG, null, null, new i(apiResponseInitSetting), 6, null);
            mutableLiveData.postValue(Resource.INSTANCE.error(((ApiErrorResponse) apiResponseInitSetting).getErrorMessage(), SettingResult.NET_ERROR));
        }
    }

    private final void k(final SettingVo vo, SettingVo keep, final DeviceCallback callback) {
        if (vo.getAppPush() != keep.getAppPush() || vo.getAppBeforeMenstruationPush() != keep.getAppBeforeMenstruationPush() || vo.getAppBeforeOvulationPush() != keep.getAppBeforeOvulationPush()) {
            if (callback != null) {
                callback.onFinish(true);
            }
            HMLog.info(TAG, j.a);
            return;
        }
        if (keep.getMenstrualCycle() != vo.getMenstrualCycle() || keep.getEstimatedMenstrualDays() != vo.getEstimatedMenstrualDays()) {
            this.appExecutors.getDiskIO().execute(new Runnable() { // from class: wr6
                @Override // java.lang.Runnable
                public final void run() {
                    SettingRepo.m(this.a, vo, callback);
                }
            });
        }
        HMLog.info(TAG, l.a);
        if (keep.getHardwareBeforeMenstruationPush() != vo.getHardwareBeforeMenstruationPush()) {
            this.manager.writeConfigToDevice(new MenstruationConfigDto(Boolean.valueOf(vo.getHardwarePush()), Boolean.valueOf(vo.getHardwareBeforeMenstruationPush() > 0), Byte.valueOf((byte) vo.getHardwareBeforeMenstruationPush()), null, null, null, 56, null), callback);
            return;
        }
        if (keep.getHardwareBeforeOvulationPush() != vo.getHardwareBeforeOvulationPush()) {
            this.manager.writeConfigToDevice(new MenstruationConfigDto(Boolean.valueOf(vo.getHardwarePush()), null, null, Boolean.valueOf(vo.getHardwareBeforeOvulationPush() > 0), Byte.valueOf((byte) vo.getHardwareBeforeOvulationPush()), null, 38, null), callback);
        } else if (keep.getHardwarePush() != vo.getHardwarePush()) {
            this.manager.writeConfigToDevice(new MenstruationConfigDto(Boolean.valueOf(vo.getHardwarePush()), null, null, null, null, null, 62, null), callback);
        } else if (keep.getIntelligentPrediction() != vo.getIntelligentPrediction()) {
            this.manager.writeConfigToDevice(new MenstruationConfigDto(null, null, null, null, null, Boolean.valueOf(vo.getIntelligentPrediction()), 31, null), callback);
        }
    }

    public static /* synthetic */ void l(SettingRepo settingRepo, SettingVo settingVo, SettingVo settingVo2, DeviceCallback deviceCallback, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            deviceCallback = null;
        }
        settingRepo.k(settingVo, settingVo2, deviceCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SettingRepo settingRepo, SettingVo settingVo, DeviceCallback deviceCallback) {
        MenstruationTotalDto initTotalDtoForFw = settingRepo.manager.getInitTotalDtoForFw();
        if (initTotalDtoForFw != null) {
            initTotalDtoForFw.setCyclePeriodDays((byte) settingVo.getMenstrualCycle());
        }
        if (initTotalDtoForFw != null) {
            initTotalDtoForFw.setMenstruationPeriodDays((byte) settingVo.getEstimatedMenstrualDays());
        }
        HMLog.info(TAG, new k(initTotalDtoForFw));
        if (initTotalDtoForFw != null) {
            MenstruationDataManager.writeToDevice$default(settingRepo.manager, initTotalDtoForFw, deviceCallback, false, null, 12, null);
        } else {
            if (deviceCallback == null) {
                return;
            }
            deviceCallback.onFinish(true);
        }
    }

    public static /* synthetic */ LiveData setSetting$default(SettingRepo settingRepo, SettingVo settingVo, SettingVo settingVo2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        return settingRepo.setSetting(settingVo, settingVo2, z, z2);
    }

    public final void clearLocalSetting() {
        this.sp.setPeriodLen(0);
        this.sp.setCycleLen(0);
        this.sp.setLastMenstruationTime(0L);
    }

    public final long getLastCheckIncTime() {
        return this.sp.getUserLastCheckIncrementTime();
    }

    public final boolean isFirstTime() {
        HMLog.debug(TAG, new a());
        return this.sp.getFirstTime();
    }

    @NotNull
    public final LiveData<Resource<SettingVo>> loadSettings() {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.postValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        this.singleExecutor.execute(new Runnable() { // from class: tr6
            @Override // java.lang.Runnable
            public final void run() {
                SettingRepo.f(this.a, mutableLiveData);
            }
        });
        return mutableLiveData;
    }

    @Nullable
    public final Object loadSettingsRemote(@NotNull Continuation<? super SettingVo> continuation) {
        ApiResponse<FirstUseInfoBean> firstUseInfo = DataCacheManager.INSTANCE.getFirstUseInfo();
        if (firstUseInfo instanceof ApiSuccessResponse) {
            g(BeanExKt.toSettingVo((FirstUseInfoBean) ((ApiSuccessResponse) firstUseInfo).getBody()));
        } else if (firstUseInfo instanceof ApiErrorResponse) {
            HMLog.error$default(TAG, null, null, c.a, 6, null);
        }
        return readFromSp();
    }

    @NotNull
    public final SettingVo readFromSp() {
        return new SettingVo(this.sp.getAppBeforeMenstruationDay(), this.sp.getAppBeforeOvulationDay(), this.sp.getAppNotify(), this.sp.getPeriodLen(), this.sp.getFirstTime(), this.sp.getHwBeforeMenstruationDay(), this.sp.getHwBeforeOvulationDay(), this.sp.getHwNotify(), this.sp.getEnablePredict(), this.sp.getLastMenstruationTime(), this.sp.getCycleLen());
    }

    public final void setInitSetting(@NotNull final SettingVo initVo) {
        this.singleExecutor.execute(new Runnable() { // from class: ur6
            @Override // java.lang.Runnable
            public final void run() {
                SettingRepo.h(this.a, initVo);
            }
        });
    }

    public final void setLastCheckIncTime(long time) {
        this.sp.setUserLastCheckIncrementTime(time);
    }

    @NotNull
    public final LiveData<Resource<SettingResult>> setSetting(@NotNull final SettingVo vo, @NotNull SettingVo keep, boolean deviceConnect, boolean igineDevice) {
        HMLog.info(TAG, new g(vo, deviceConnect, igineDevice));
        final MutableLiveData<Resource<SettingResult>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.postValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        if (deviceConnect && igineDevice) {
            k(vo, keep, new DeviceCallback() { // from class: com.huami.femalehealth.logiclib.repo.SettingRepo.setSetting.2
                @Override // com.huami.femalehealth.logiclib.device.DeviceCallback
                public void onFinish(boolean success) {
                    if (success) {
                        this.i(vo, mutableLiveData);
                    } else {
                        mutableLiveData.postValue(Resource.INSTANCE.success(SettingResult.DEV_ERROR));
                    }
                }
            });
        } else {
            i(vo, mutableLiveData);
        }
        return mutableLiveData;
    }
}
