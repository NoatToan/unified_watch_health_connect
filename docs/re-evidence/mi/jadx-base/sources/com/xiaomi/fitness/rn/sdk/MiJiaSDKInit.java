package com.xiaomi.fitness.rn.sdk;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.HostApi;
import com.smarthome.core.SmartCallBack;
import com.smarthome.core.SmartConfig;
import com.smarthome.core.SmartHomeSDK;
import com.smarthome.core.modelconfig.PluginDeviceManager;
import com.smarthome.core.network.SmartTokenInfo;
import com.smarthome.core.scan.DeviceScanManager;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.mijia.sdk.sp.MiJiaPreference;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.rn.sdk.MiJiaSDKInit;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.account.impl.AccountDepApiImpl;
import com.xiaomi.smarthome.core.server.internal.account.MiJiaAccountManager;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.sdk.blespec.SHBleSpecManager;
import com.xiaomi.smarthome.setting.LoginSetting;
import com.xiaomi.youpin.login.entity.account.LoginMiAccount;
import defpackage.cbk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002J(\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002J\u0014\u0010\u0017\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\b\u0010\u0019\u001a\u00020\bH\u0002J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00122\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/rn/sdk/MiJiaSDKInit;", "", "<init>", "()V", "isInitialized", "", "mListener", "Lkotlin/Function0;", "", StatConstants.PARAM_START, "initSupportDeviceProduct", "initNetworkEnv", "appContext", "Landroid/content/Context;", "initAccountInfo", "onLoginSuccess", "getServiceToken", "sid", "", "refreshToken", "callback", "Lcom/smarthome/core/SmartCallBack;", "Lcom/smarthome/core/network/SmartTokenInfo;", "setInitListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "plantMiHomeLoginCookie", "saveWebViewCookie", "url", "cookies", "", "Companion", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiJiaSDKInit {

    @NotNull
    private static final String MODEL_SCALE = "yunmai.scales.ms103";
    private static final int PID_SCALE = 12505;

    @NotNull
    private static final String TAG = "MiJiaSDKInit";
    private boolean isInitialized;

    @Nullable
    private Function0<Unit> mListener;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<MiJiaSDKInit> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xuf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiJiaSDKInit.instance_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/rn/sdk/MiJiaSDKInit$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/rn/sdk/MiJiaSDKInit;", "getInstance", "()Lcom/xiaomi/fitness/rn/sdk/MiJiaSDKInit;", "instance$delegate", "Lkotlin/Lazy;", "TAG", "", "MODEL_SCALE", "PID_SCALE", "", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MiJiaSDKInit getInstance() {
            return (MiJiaSDKInit) MiJiaSDKInit.instance$delegate.getValue();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSDKInit$getServiceToken$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSDKInit$getServiceToken$1", f = "MiJiaSDKInit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SmartCallBack<SmartTokenInfo> $callback;
        final /* synthetic */ boolean $refreshToken;
        final /* synthetic */ String $sid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z, SmartCallBack<SmartTokenInfo> smartCallBack, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$refreshToken = z;
            this.$callback = smartCallBack;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$sid, this.$refreshToken, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MiAccessToken serviceToken$default = TokenManager.DefaultImpls.getServiceToken$default(AccountManagerExtKt.getInstance(TokenManager.INSTANCE), this.$sid, this.$refreshToken, 0, 4, null);
            if (serviceToken$default == null || !serviceToken$default.isLogin()) {
                Logger.i(MiJiaSDKInit.TAG, "getServiceToken(" + this.$sid + "), refreshToken(" + this.$refreshToken + ") failed");
                SmartCallBack<SmartTokenInfo> smartCallBack = this.$callback;
                if (smartCallBack != null) {
                    smartCallBack.onFailure(-1, "MiJiaSDKInit, getServiceToken failed");
                }
            } else {
                Logger.i(MiJiaSDKInit.TAG, "getServiceToken(" + this.$sid + "), refreshToken(" + this.$refreshToken + ") succeed");
                SmartTokenInfo smartTokenInfo = new SmartTokenInfo(null, null, null, null, 0L, null, null, null, false, 511, null);
                smartTokenInfo.setServiceToken(serviceToken$default.getServiceToken());
                smartTokenInfo.setSsecurity(serviceToken$default.getSecurity());
                smartTokenInfo.setCUserId(serviceToken$default.getCUserId());
                smartTokenInfo.setSid(this.$sid);
                String userId = serviceToken$default.getUserId();
                if (userId == null) {
                    userId = "";
                }
                smartTokenInfo.setMiId(userId);
                smartTokenInfo.setTimeDiff(serviceToken$default.getTimeDiff());
                LoginMiAccount loginMiAccount = new LoginMiAccount();
                loginMiAccount.h(serviceToken$default.getUserId(), null, AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isUseSystem(), null);
                MiJiaAccountManager.getInstance().setMiAccount(loginMiAccount);
                AccountDepApi.getInstance().setMiServiceToken(smartTokenInfo.getSid(), smartTokenInfo.getServiceToken(), smartTokenInfo.getCUserId(), smartTokenInfo.getSsecurity(), smartTokenInfo.getDomain(), smartTokenInfo.getTimeDiff());
                AccountDepApi.getInstance().saveAccount();
                SmartHomeRc4Api.getInstance().setInitialized(false);
                SmartCallBack<SmartTokenInfo> smartCallBack2 = this.$callback;
                if (smartCallBack2 != null) {
                    smartCallBack2.onSuccess(smartTokenInfo);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSDKInit$plantMiHomeLoginCookie$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSDKInit$plantMiHomeLoginCookie$1", f = "MiJiaSDKInit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C28831(Continuation<? super C28831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MiJiaSDKInit.this.new C28831(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MiAccessToken serviceToken$default = TokenManager.DefaultImpls.getServiceToken$default(AccountManagerExtKt.getInstance(TokenManager.INSTANCE), LoginSetting.SID_XIAOMI_HOME, true, 0, 4, null);
            Logger.d(MiJiaSDKInit.TAG, "plantMiHomeLoginCookie(" + LoginSetting.SID_XIAOMI_HOME + "): serviceToken(" + serviceToken$default + ")");
            if (serviceToken$default != null && serviceToken$default.isLogin()) {
                ArrayList arrayList = new ArrayList();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("serviceToken=%s", Arrays.copyOf(new Object[]{serviceToken$default.getServiceToken()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                String str2 = String.format("cUserId=%s", Arrays.copyOf(new Object[]{serviceToken$default.getCUserId()}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                arrayList.add(str);
                arrayList.add(str2);
                try {
                    MiJiaSDKInit.this.saveWebViewCookie(LoginSetting.COOKIE_DOMAIN_XIAOMI_HOME, arrayList);
                } catch (Exception unused) {
                    Logger.d(MiJiaSDKInit.TAG, "plantMiHomeLoginCookie|COOKIE|" + serviceToken$default + "-" + str2);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private MiJiaSDKInit() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getServiceToken(String sid, boolean refreshToken, SmartCallBack<SmartTokenInfo> callback) {
        AnyExtKt.io$default(null, new AnonymousClass1(sid, refreshToken, callback, null), 1, null);
    }

    private final void initAccountInfo() {
        AccountDepApi.sInstance = new AccountDepApiImpl();
        AccountManager.Companion companion = AccountManager.INSTANCE;
        if (AccountManagerExtKt.getInstance(companion).isLogin()) {
            onLoginSuccess();
        }
        AccountManagerExtKt.getInstance(companion).addAccountListener(new Function1() { // from class: yuf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MiJiaSDKInit.initAccountInfo$lambda$0(this.f40580a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initAccountInfo$lambda$0(MiJiaSDKInit this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "account login/logout " + z);
        if (z) {
            this$0.onLoginSuccess();
        } else {
            SmartHomeSDK.INSTANCE.onLogoutSuccess();
        }
        return Unit.INSTANCE;
    }

    private final void initNetworkEnv(Context appContext) {
        SmartConfig smartConfig = new SmartConfig();
        int mijia_env = MiJiaPreference.INSTANCE.getMIJIA_ENV();
        Logger.i(TAG, "miJiaEnv(" + mijia_env + ")");
        if (mijia_env == 0) {
            Logger.i(TAG, "setIsST");
            smartConfig.setIsST(true);
        } else if (mijia_env == 1) {
            Logger.i(TAG, "setIsPv");
            smartConfig.setIsPv(true);
        }
        SmartHomeSDK.INSTANCE.init(appContext, new HostApi() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSDKInit.initNetworkEnv.1
            @Override // com.smarthome.core.HostApi
            public void onUnAuthorized() {
                Logger.i(MiJiaSDKInit.TAG, "onUnAuthorized");
            }

            @Override // com.smarthome.core.HostApi
            public void refreshServiceToken(String sid, String userId, SmartCallBack<SmartTokenInfo> callback) {
                Intrinsics.checkNotNullParameter(sid, "sid");
                Intrinsics.checkNotNullParameter(userId, "userId");
                Logger.e(MiJiaSDKInit.TAG, "refreshServiceToken: ");
                MiJiaSDKInit.this.getServiceToken(sid, true, callback);
            }
        }, smartConfig);
    }

    private final void initSupportDeviceProduct() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Integer.valueOf(PID_SCALE), MODEL_SCALE);
        cbk.b(SmartHomeSDK.INSTANCE, "putPidModelMap", new Class[]{Map.class}, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiJiaSDKInit instance_delegate$lambda$1() {
        return new MiJiaSDKInit();
    }

    private final void onLoginSuccess() {
        plantMiHomeLoginCookie();
        String sid_xiaomi_io = SmartHomeSDK.INSTANCE.isST() ? LoginSetting.SID_STAGING : SmartTokenInfo.INSTANCE.getSID_XIAOMI_IO();
        Logger.i(TAG, "onLoginSuccess: sid=" + sid_xiaomi_io);
        getServiceToken(sid_xiaomi_io, true, new SmartCallBack<SmartTokenInfo>() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSDKInit.onLoginSuccess.1
            @Override // com.smarthome.core.SmartCallBack
            public void onFailure(int code, String result) {
                Intrinsics.checkNotNullParameter(result, "result");
                Logger.i(MiJiaSDKInit.TAG, "getServiceToken failed");
            }

            @Override // com.smarthome.core.SmartCallBack
            public void onSuccess(SmartTokenInfo result) {
                Intrinsics.checkNotNullParameter(result, "result");
                SmartHomeSDK.INSTANCE.onLoginSuccess(result);
                try {
                    ProductExtKt.getInstance(RNProductManager.INSTANCE).update();
                } catch (Exception e) {
                    Logger.e(MiJiaSDKInit.TAG, "RNProductManager.instance.update()", e);
                }
                AnyExtKt.main$default(null, new MiJiaSDKInit$onLoginSuccess$1$onSuccess$1(MiJiaSDKInit.this, null), 1, null);
            }
        });
    }

    private final void plantMiHomeLoginCookie() {
        AnyExtKt.io$default(null, new C28831(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveWebViewCookie(String url, List<String> cookies) {
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        if (cookies != null) {
            Iterator<String> it = cookies.iterator();
            while (it.hasNext()) {
                cookieManager.setCookie(url, it.next());
            }
        }
        cookieManager.flush();
    }

    public final void setInitListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.isInitialized) {
            listener.invoke();
        }
        this.mListener = listener;
    }

    public final void start() {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        Logger.i(TAG, StatConstants.PARAM_START);
        this.isInitialized = false;
        DeviceScanManager.INSTANCE.initContext(ApplicationExtKt.getApplication());
        initNetworkEnv(ApplicationExtKt.getApplication());
        PluginDeviceManager.INSTANCE.init(ApplicationExtKt.getApplication());
        SHBleSpecManager.getInstance().init(ApplicationExtKt.getApplication());
        initAccountInfo();
    }
}
