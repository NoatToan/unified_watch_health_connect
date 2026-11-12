package cn.eid.service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.IBinder;
import android.util.Base64;
import cn.eid.service.IeIDServiceEngine;
import com.alipay.sdk.m.u.i;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.eid.ui.activity.EidHostActivity;
import com.huami.eid.ui.api.EidApi;
import com.huami.eid.ui.api.EidConfig;
import com.huami.eid.ui.extensions.EidStatusExtensionKt;
import com.huami.nfc.applet.Hex;
import com.huami.nfc.eid.entities.EidInfoEntity;
import com.huami.wallet.common.util.WalletRxBus;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u00101J\u0017\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082\bJ\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0017J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001d\u0010'\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcn/eid/service/IeIDServiceEngine;", "Landroid/app/Service;", "Lkotlin/Function0;", "Lcn/eid/service/RespParams;", "next", "checkEnvDoNext", "", "message", "errorRespParams", "detail", "successRespParams", "statusCode", "formatEidState", "version", "formatVersion", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "entity", "formatEidInfo", "", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "Lcom/huami/eid/ui/api/EidApi;", "eidApi$delegate", "Lkotlin/Lazy;", "getEidApi", "()Lcom/huami/eid/ui/api/EidApi;", "eidApi", "Lcom/huami/eid/ui/api/EidConfig;", "eidConfig$delegate", "getEidConfig", "()Lcom/huami/eid/ui/api/EidConfig;", "eidConfig", "Lcn/eid/service/EidServiceConfig;", "eidServiceConfig$delegate", "getEidServiceConfig", "()Lcn/eid/service/EidServiceConfig;", "eidServiceConfig", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "Lcn/eid/service/CreateEidResultEvent;", "createEidResult", "Lcn/eid/service/CreateEidResultEvent;", "binder", "Landroid/os/IBinder;", "<init>", "()V", "Companion", "eid_release"}, k = 1, mv = {1, 5, 1})
public final class IeIDServiceEngine extends Service {

    @NotNull
    public static final String KEY_EID_STATE = "eid_state";

    @NotNull
    public static final String TEID_AVAILABLE_EID_DIGITAL_ID_AND_EID = "20";
    public static final long TEID_COMMON_ERROR = 57346;

    @NotNull
    public static final String TEID_NOT_AVAILABLE_SUPPORT_ALL = "04";
    public static final long TEID_SUCCESS = 0;
    public static final long WAIT_TIME_OUT = 5;

    @NotNull
    private final IBinder binder;

    @Nullable
    private CountDownLatch countDownLatch;

    @Nullable
    private CreateEidResultEvent createEidResult;

    /* JADX INFO: renamed from: eidApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eidApi;

    /* JADX INFO: renamed from: eidConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eidConfig;

    /* JADX INFO: renamed from: eidServiceConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eidServiceConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public IeIDServiceEngine() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.eidApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<EidApi>() { // from class: cn.eid.service.IeIDServiceEngine$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.eid.ui.api.EidApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final EidApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(EidApi.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.eidConfig = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<EidConfig>() { // from class: cn.eid.service.IeIDServiceEngine$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.eid.ui.api.EidConfig, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final EidConfig getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(EidConfig.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.eidServiceConfig = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<EidServiceConfig>() { // from class: cn.eid.service.IeIDServiceEngine$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [cn.eid.service.EidServiceConfig, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final EidServiceConfig getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(EidServiceConfig.class), objArr4, objArr5);
            }
        });
        this.binder = new IeIDSignEngine.Stub() { // from class: cn.eid.service.IeIDServiceEngine$binder$1
            @Override // cn.eid.service.IeIDSignEngine
            @NotNull
            public RespParams createeID() {
                IeIDServiceEngine ieIDServiceEngine = this.this$0;
                if (!ieIDServiceEngine.getEidServiceConfig().isSupportEid()) {
                    return ieIDServiceEngine.errorRespParams("当前设备不支持eID功能");
                }
                if (!ieIDServiceEngine.getEidServiceConfig().isConnect()) {
                    return ieIDServiceEngine.errorRespParams("当前设备未连接");
                }
                Intent intent = new Intent(ieIDServiceEngine, (Class<?>) EidHostActivity.class);
                intent.addFlags(268435456);
                ieIDServiceEngine.startActivity(intent);
                try {
                    ieIDServiceEngine.countDownLatch = new CountDownLatch(1);
                    CountDownLatch countDownLatch = ieIDServiceEngine.countDownLatch;
                    if (countDownLatch != null) {
                        countDownLatch.await(5L, TimeUnit.MINUTES);
                    }
                } catch (Exception e) {
                    LogcatKt.info$default(Logcat.INSTANCE, null, new Function0<Object>() { // from class: cn.eid.service.IeIDServiceEngine$binder$1$createeID$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return "等待eID开卡结果出错:" + e.getMessage();
                        }
                    }, 1, null);
                }
                CreateEidResultEvent createEidResultEvent = ieIDServiceEngine.createEidResult;
                if (createEidResultEvent == null) {
                    return ieIDServiceEngine.errorRespParams("无法判断eID是否开通成功");
                }
                if (createEidResultEvent.getResult()) {
                    return ieIDServiceEngine.successRespParams("eID开通成功");
                }
                return ieIDServiceEngine.errorRespParams("eID开通失败，" + createEidResultEvent.getInfo());
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v1, types: [cn.eid.service.IeIDServiceEngine] */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v5, types: [cn.eid.service.RespParams] */
            /* JADX WARN: Type inference failed for: r5v9 */
            @Override // cn.eid.service.IeIDSignEngine
            @NotNull
            public RespParams eIDAvailable(@Nullable String serviceId) {
                IeIDServiceEngine ieIDServiceEngineSuccessRespParams = this.this$0;
                if (!ieIDServiceEngineSuccessRespParams.getEidServiceConfig().isSupportEid()) {
                    return ieIDServiceEngineSuccessRespParams.errorRespParams("当前设备不支持eID功能");
                }
                if (!ieIDServiceEngineSuccessRespParams.getEidServiceConfig().isConnect()) {
                    return ieIDServiceEngineSuccessRespParams.errorRespParams("当前设备未连接");
                }
                try {
                    ieIDServiceEngineSuccessRespParams = EidStatusExtensionKt.installedInCurrentDevice(EidApi.DefaultImpls.getEidStatus$default(ieIDServiceEngineSuccessRespParams.getEidApi(), "2", null, 2, null)) ? ieIDServiceEngineSuccessRespParams.successRespParams(ieIDServiceEngineSuccessRespParams.formatEidState("20")) : ieIDServiceEngineSuccessRespParams.successRespParams(ieIDServiceEngineSuccessRespParams.formatEidState("04"));
                    return ieIDServiceEngineSuccessRespParams;
                } catch (Exception e) {
                    return ieIDServiceEngineSuccessRespParams.errorRespParams("无法判断设备状态，" + e.getMessage());
                }
            }

            @Override // cn.eid.service.IeIDSignEngine
            @NotNull
            public RespParams getVerison() {
                IeIDServiceEngine ieIDServiceEngine = this.this$0;
                return ieIDServiceEngine.successRespParams(ieIDServiceEngine.formatVersion(ieIDServiceEngine.getEidServiceConfig().getVersion()));
            }

            @Override // cn.eid.service.IeIDSignEngine
            @NotNull
            public RespParams geteIDDigitalId() {
                IeIDServiceEngine ieIDServiceEngine = this.this$0;
                if (!ieIDServiceEngine.getEidServiceConfig().isSupportEid()) {
                    return ieIDServiceEngine.errorRespParams("当前设备不支持eID功能");
                }
                if (!ieIDServiceEngine.getEidServiceConfig().isConnect()) {
                    return ieIDServiceEngine.errorRespParams("当前设备未连接");
                }
                try {
                    return ieIDServiceEngine.successRespParams(new Gson().toJson(ieIDServiceEngine.getEidApi().getEidQrCode()));
                } catch (Exception e) {
                    return ieIDServiceEngine.errorRespParams("获取数字身份失败，" + e.getMessage());
                }
            }

            @Override // cn.eid.service.IeIDSignEngine
            @NotNull
            public RespParams geteIDInfo() {
                IeIDServiceEngine ieIDServiceEngine = this.this$0;
                if (!ieIDServiceEngine.getEidServiceConfig().isSupportEid()) {
                    return ieIDServiceEngine.errorRespParams("当前设备不支持eID功能");
                }
                if (!ieIDServiceEngine.getEidServiceConfig().isConnect()) {
                    return ieIDServiceEngine.errorRespParams("当前设备未连接");
                }
                try {
                    return ieIDServiceEngine.successRespParams(ieIDServiceEngine.formatEidInfo(ieIDServiceEngine.getEidApi().getEidInfo()));
                } catch (Exception e) {
                    return ieIDServiceEngine.errorRespParams("获取载体相关信息失败，" + e.getMessage());
                }
            }

            @Override // cn.eid.service.IeIDSignEngine
            @NotNull
            public RespParams sign(@Nullable String signCmd) {
                IeIDServiceEngine ieIDServiceEngine = this.this$0;
                if (!ieIDServiceEngine.getEidServiceConfig().isSupportEid()) {
                    return ieIDServiceEngine.errorRespParams("当前设备不支持eID功能");
                }
                if (!ieIDServiceEngine.getEidServiceConfig().isConnect()) {
                    return ieIDServiceEngine.errorRespParams("当前设备未连接");
                }
                if (signCmd == null) {
                    return ieIDServiceEngine.errorRespParams("签名失败，签名命令为空");
                }
                try {
                    return ieIDServiceEngine.successRespParams("{\"signed_data\": " + ieIDServiceEngine.getEidApi().sign(signCmd) + "\"}");
                } catch (Exception e) {
                    return ieIDServiceEngine.errorRespParams("签名失败，" + e.getMessage());
                }
            }
        };
    }

    private final RespParams checkEnvDoNext(Function0<? extends RespParams> next) {
        if (getEidServiceConfig().isSupportEid()) {
            return !getEidServiceConfig().isConnect() ? errorRespParams("当前设备未连接") : next.getA();
        }
        return errorRespParams("当前设备不支持eID功能");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RespParams errorRespParams(String message) {
        RespParams respParams = new RespParams();
        respParams.setResultCode(TEID_COMMON_ERROR);
        respParams.setResultDetail(message);
        return respParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatEidInfo(EidInfoEntity entity) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) entity.getVersion(), new String[]{AESEncryptionHelper.SEPARATOR}, false, 0, 6, (Object) null);
        if (listSplit$default.size() < 3) {
            return "";
        }
        String strEncodeToString = Base64.encodeToString(Hex.hexStringToBytes(entity.getIdCarrier()), 2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return "{\"eidinfo\":" + new GsonBuilder().disableHtmlEscaping().create().toJson(new EidInfo(strEncodeToString, String.format("%04x", Arrays.copyOf(new Object[]{Integer.valueOf(Integer.parseInt(getEidConfig().getIssuerOrg()))}, 1)), entity.getEidInfoCarrierType(), (String) listSplit$default.get(2), (String) listSplit$default.get(0), null, (String) listSplit$default.get(1), 32, null)) + i.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatEidState(String statusCode) {
        return "{\"eid_state\": \"" + statusCode + "\"}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatVersion(String version) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) version, new String[]{AESEncryptionHelper.SEPARATOR}, false, 0, 6, (Object) null);
        return "{\"version_code\": \"" + listSplit$default.get(1) + "\",\"version_name\": \"" + listSplit$default.get(0) + "\"}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EidApi getEidApi() {
        return (EidApi) this.eidApi.getValue();
    }

    private final EidConfig getEidConfig() {
        return (EidConfig) this.eidConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EidServiceConfig getEidServiceConfig() {
        return (EidServiceConfig) this.eidServiceConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m3274onCreate$lambda0(IeIDServiceEngine ieIDServiceEngine, Object obj) {
        if (obj instanceof CreateEidResultEvent) {
            ieIDServiceEngine.createEidResult = (CreateEidResultEvent) obj;
            CountDownLatch countDownLatch = ieIDServiceEngine.countDownLatch;
            if (countDownLatch == null) {
                return;
            }
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RespParams successRespParams(String detail) {
        RespParams respParams = new RespParams();
        respParams.setResultCode(0L);
        respParams.setResultDetail(detail);
        return respParams;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return this.binder;
    }

    @Override // android.app.Service
    @SuppressLint({"CheckResult"})
    public void onCreate() {
        super.onCreate();
        WalletRxBus.INSTANCE.getInstance().toObservable().subscribe(new Consumer() { // from class: rc4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IeIDServiceEngine.m3274onCreate$lambda0(this.a, obj);
            }
        });
    }
}
