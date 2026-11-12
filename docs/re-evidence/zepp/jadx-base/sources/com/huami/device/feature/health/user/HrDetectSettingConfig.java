package com.huami.device.feature.health.user;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.device.IDeviceAppApi;
import com.huami.device.feature.health.model.UserHealthConfigKey;
import com.huami.device.feature.health.settings.HrIntervalSetting;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.util.HealthExt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\u0018\u0000 O2\u00020\u0001:\u0001OB\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\bM\u0010NJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\"\u0010#\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010+\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\"\u0010/\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001bR\"\u00103\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0017\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR\"\u00107\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R\"\u0010;\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R\"\u0010?\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010\u001e\u001a\u0004\b=\u0010 \"\u0004\b>\u0010\"R$\u0010C\u001a\u00020\f2\u0006\u0010@\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010 \"\u0004\bB\u0010\"R$\u0010F\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u0010\u001bR$\u0010I\u001a\u00020\f2\u0006\u0010@\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010 \"\u0004\bH\u0010\"R$\u0010L\u001a\u00020\f2\u0006\u0010@\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010 \"\u0004\bK\u0010\"¨\u0006P"}, d2 = {"Lcom/huami/device/feature/health/user/HrDetectSettingConfig;", "Lcom/huami/device/feature/health/user/BaseHealthSettingConfig;", "", "r", "", SOAP.XMLNS, "t", "", DTransferConstants.SEARCH_KEY, com.google.android.exoplayer2.text.ttml.b.r, "u", "adjustConfig", "", "syncToServer", "commitChange", "resetToDefault", "resetOnBind", "Lcom/huami/device/feature/health/device/HealthDevice;", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "appApi", LogUtil.I, "getHrDetectType", "()I", "setHrDetectType", "(I)V", "hrDetectType", "configFreq", "Z", "getAtrialSleepNotDisturb", "()Z", "setAtrialSleepNotDisturb", "(Z)V", "atrialSleepNotDisturb", "v", "getWarningEnable", "setWarningEnable", HrDetectSettingConfig.E, "w", "getWarningValue", "setWarningValue", HrDetectSettingConfig.F, "x", "getHighWarningValue", "setHighWarningValue", "highWarningValue", "y", "getLowWarningValue", "setLowWarningValue", "lowWarningValue", "z", "getSleepAssistEnable", "setSleepAssistEnable", HrDetectSettingConfig.G, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getSportHrCheckEnable", "setSportHrCheckEnable", "sportHrCheckEnable", "B", "getNeedMigrationHRWay", "setNeedMigrationHRWay", HrDetectSettingConfig.H, "value", "getHrEnable", "setHrEnable", "hrEnable", "getFreq", "setFreq", HrDetectSettingConfig.D, "getAtrialFibEnable", "setAtrialFibEnable", "atrialFibEnable", "getHrSleepEnable", "setHrSleepEnable", "hrSleepEnable", "<init>", "(Lcom/huami/device/feature/health/device/HealthDevice;Lcom/huami/device/feature/health/device/IDeviceAppApi;)V", "Companion", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class HrDetectSettingConfig extends BaseHealthSettingConfig {

    @NotNull
    private static final String C = "type";

    @NotNull
    private static final String D = "freq";

    @NotNull
    private static final String E = "warningEnable";

    @NotNull
    private static final String F = "warningValue";

    @NotNull
    private static final String G = "sleepAssistEnable";

    @NotNull
    private static final String H = "needMigrationHRWay";

    @NotNull
    private static final String I = "sportHRCheckEnable";
    private static final int J = 65;
    private static final int K = 38;
    private static final int L = 42;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean sportHrCheckEnable;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean needMigrationHRWay;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final IDeviceAppApi appApi;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int hrDetectType;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int configFreq;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean atrialSleepNotDisturb;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean warningEnable;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int warningValue;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int highWarningValue;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int lowWarningValue;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean sleepAssistEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "user config property:" + ((Object) this.a.element);
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
            return "adjust no need";
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
            return "device null or disconnected";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.user.HrDetectSettingConfig$adjustHrConfig$3", f = "HrDetectSettingConfig.kt", i = {}, l = {SelectAreaActivity.REQUEST_SELECT_AREA_ONLY}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

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
            public final String invoke() {
                return "setInterval: " + this.a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HrDetectSettingConfig.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SetToDevice<Integer> setToDevice;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HrIntervalSetting service = HealthFunc.HR_INTERVAL.INSTANCE.getService();
                if (service != null && (setToDevice = service.getSetToDevice()) != null) {
                    Integer numBoxInt = Boxing.boxInt(HrDetectSettingConfig.this.getFreq());
                    this.a = 1;
                    obj = setToDevice.set(numBoxInt, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                HMLog.info(HrDetectSettingConfig.this.getTAG(), new a(bool.booleanValue()));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.user.HrDetectSettingConfig$adjustWuhanIndiaHrFreq$1", f = "HrDetectSettingConfig.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

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
            public final String invoke() {
                return "setInterval: " + this.a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HrDetectSettingConfig.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SetToDevice<Integer> setToDevice;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HrIntervalSetting service = HealthFunc.HR_INTERVAL.INSTANCE.getService();
                if (service != null && (setToDevice = service.getSetToDevice()) != null) {
                    Integer numBoxInt = Boxing.boxInt(HrDetectSettingConfig.this.getFreq());
                    this.a = 1;
                    obj = setToDevice.set(numBoxInt, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                HMLog.info(HrDetectSettingConfig.this.getTAG(), new a(bool.booleanValue()));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save user property:" + HrDetectSettingConfig.this.r() + ", value:" + this.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
    public HrDetectSettingConfig(@NotNull HealthDevice healthDevice, @NotNull IDeviceAppApi iDeviceAppApi) {
        super(healthDevice, iDeviceAppApi);
        this.device = healthDevice;
        this.appApi = iDeviceAppApi;
        this.hrDetectType = s();
        this.configFreq = t();
        this.warningValue = 150;
        this.sleepAssistEnable = HMPersonInfo.getInstance().getMiliConfig().isSleepAssist();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? userProperty = iDeviceAppApi.getUserProperty(r());
        objectRef.element = userProperty;
        if (TextUtils.isEmpty((CharSequence) userProperty)) {
            objectRef.element = iDeviceAppApi.getUserProperty(UserHealthConfigKey.HR_DETECT_KEY.INSTANCE.getKey());
        }
        HMLog.info(getTAG(), new a(objectRef));
        try {
            JSONObject jSONObject = new JSONObject((String) objectRef.element);
            setHrDetectType(jSONObject.optInt("type", s()));
            this.configFreq = jSONObject.optInt(D, t());
            setWarningEnable(jSONObject.optBoolean(E, false));
            setWarningValue(jSONObject.optInt(F, 150));
            setSleepAssistEnable(jSONObject.optBoolean(G, HMPersonInfo.getInstance().getMiliConfig().isSleepAssist()));
            setSportHrCheckEnable(jSONObject.optBoolean(I, false));
            setNeedMigrationHRWay(jSONObject.optBoolean(H, false));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void p() {
        if (getHrDetectType() != 2 || !getNeedMigrationHRWay()) {
            HMLog.info(getTAG(), b.a);
            return;
        }
        if (!this.device.isConnect()) {
            HMLog.info(getTAG(), c.a);
            return;
        }
        if (HMDeviceSource.MILI_WUHAN.getValue() == this.device.getDeviceSource() && this.device.isIndiaOrHankou()) {
            setNeedMigrationHRWay(false);
            save(false);
        } else {
            setNeedMigrationHRWay(false);
            setHrDetectType(3);
            save(false);
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new d(null), 3, null);
        }
    }

    private final void q() {
        try {
            if (this.device.isConnect() && this.device.getDeviceSource() == HMDeviceSource.MILI_WUHAN.getValue() && this.device.isIndiaOrHankou()) {
                if (getHrDetectType() == 3 || getHrDetectType() == 2) {
                    if (getFreq() == 1 || getFreq() == 5) {
                        setFreq(10);
                        save(false);
                        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new e(null), 2, null);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String r() {
        return (HealthExt.INSTANCE.isSupportAtrial(this.device) ? UserHealthConfigKey.HR_DETECT_ATRIAL_KEY.INSTANCE : UserHealthConfigKey.HR_DETECT_KEY.INSTANCE).getKey();
    }

    private final int s() {
        HealthDevice healthDevice = this.device;
        if (healthDevice.isGt2Source(healthDevice.getDeviceSource())) {
            return 2;
        }
        HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
        if (miliConfig.getHrDetectType() == null) {
            return miliConfig.isSleepAssist() ? 1 : 0;
        }
        return miliConfig.getHrDetectType().intValue();
    }

    private final int t() {
        Integer hrDetectFreq = HMPersonInfo.getInstance().getMiliConfig().getHrDetectFreq();
        if (hrDetectFreq == null) {
            return 1;
        }
        if (!(hrDetectFreq.intValue() > 0)) {
            hrDetectFreq = null;
        }
        if (hrDetectFreq == null) {
            return 1;
        }
        return hrDetectFreq.intValue();
    }

    private final String u() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", getHrDetectType());
            jSONObject.put(D, this.configFreq);
            jSONObject.put(E, getWarningEnable());
            jSONObject.put(F, getWarningValue());
            jSONObject.put(G, getSleepAssistEnable());
            jSONObject.put(H, getNeedMigrationHRWay());
            jSONObject.put(I, getSportHrCheckEnable());
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void adjustConfig() {
        super.adjustConfig();
        q();
        p();
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void commitChange(boolean syncToServer) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        miliConfig.setHrDetectType(Integer.valueOf(getHrDetectType()));
        miliConfig.setHrDetectFreq(Integer.valueOf(getFreq()));
        miliConfig.setSleepAssist(getSleepAssistEnable());
        hMPersonInfo.saveInfo(2);
        String strU = u();
        if (strU == null) {
            return;
        }
        HMLog.info(getTAG(), new f(strU));
        this.appApi.saveUserProperty(r(), strU);
        this.appApi.uploadUserProperty(r());
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getAtrialFibEnable() {
        return HealthExt.INSTANCE.isSupportAtrial(this.device) && getHrDetectType() == 4;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getAtrialSleepNotDisturb() {
        return this.atrialSleepNotDisturb;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public int getFreq() {
        if (this.device.isForceHrAndRemEnable()) {
            return 1;
        }
        return this.configFreq;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public int getHighWarningValue() {
        return this.highWarningValue;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public int getHrDetectType() {
        return this.hrDetectType;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getHrEnable() {
        return this.device.isForceHrAndRemEnable() || getHrDetectType() == 2 || getHrDetectType() == 3;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getHrSleepEnable() {
        return this.device.isForceHrAndRemEnable() || getHrDetectType() == 1 || getHrDetectType() == 3;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public int getLowWarningValue() {
        return this.lowWarningValue;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getNeedMigrationHRWay() {
        return this.needMigrationHRWay;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getSleepAssistEnable() {
        return this.sleepAssistEnable;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getSportHrCheckEnable() {
        return this.sportHrCheckEnable;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getWarningEnable() {
        return this.warningEnable;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public int getWarningValue() {
        return this.warningValue;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void resetOnBind() {
        if (this.device.getDeviceSource() == 65 && getHrDetectType() != 2 && getHrDetectType() != 0) {
            setHrDetectType(0);
            setFreq(1);
            setWarningEnable(false);
            setWarningValue(150);
            setSleepAssistEnable(HMPersonInfo.getInstance().getMiliConfig().isSleepAssist());
        }
        if ((this.device.getDeviceSource() == 38 || this.device.getDeviceSource() == 42) && (getFreq() != 1 || getHrDetectType() != 2)) {
            setNeedMigrationHRWay(false);
            setHrDetectType(2);
            setFreq(1);
            save(false);
        }
        if (this.device.isForceHrAndRemEnable()) {
            setSportHrCheckEnable(true);
            setWarningEnable(false);
            if (getHrDetectType() != 3 || getFreq() != 1) {
                setNeedMigrationHRWay(false);
                setFreq(1);
                setHrDetectType(3);
            }
            save(false);
        }
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void resetToDefault() {
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setAtrialFibEnable(boolean z) {
        if (HealthExt.INSTANCE.isSupportAtrial(this.device)) {
            if (z) {
                if (getHrDetectType() != 4) {
                    setHrDetectType(4);
                }
            } else if (getHrDetectType() == 4) {
                setHrDetectType(0);
            }
        }
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setAtrialSleepNotDisturb(boolean z) {
        this.atrialSleepNotDisturb = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setFreq(int i) {
        this.configFreq = i;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setHighWarningValue(int i) {
        this.highWarningValue = i;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setHrDetectType(int i) {
        this.hrDetectType = i;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setHrEnable(boolean z) {
        if (z) {
            if (getHrDetectType() == 0) {
                setHrDetectType(2);
                return;
            } else {
                if (getHrDetectType() == 1) {
                    setHrDetectType(3);
                    return;
                }
                return;
            }
        }
        if (getHrDetectType() == 2) {
            setHrDetectType(0);
        } else if (getHrDetectType() == 3) {
            setHrDetectType(1);
        }
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setHrSleepEnable(boolean z) {
        if (z) {
            if (getHrDetectType() == 0) {
                setHrDetectType(1);
                return;
            } else {
                if (getHrDetectType() == 2) {
                    setHrDetectType(3);
                    return;
                }
                return;
            }
        }
        if (getHrDetectType() == 1) {
            setHrDetectType(0);
        } else if (getHrDetectType() == 3) {
            setHrDetectType(2);
        }
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setLowWarningValue(int i) {
        this.lowWarningValue = i;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setNeedMigrationHRWay(boolean z) {
        this.needMigrationHRWay = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setSleepAssistEnable(boolean z) {
        this.sleepAssistEnable = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setSportHrCheckEnable(boolean z) {
        this.sportHrCheckEnable = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setWarningEnable(boolean z) {
        this.warningEnable = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setWarningValue(int i) {
        this.warningValue = i;
    }
}
