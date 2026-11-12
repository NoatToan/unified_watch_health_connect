package com.huami.account;

import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.api.XiaoAiConvertTokenApi;
import com.huami.account.bean.AuthDevice;
import com.huami.account.bean.AuthDeviceSource;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\f\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0002J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J$\u0010\u0010\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0007J2\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\"\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0016H\u0007J\b\u0010\u001f\u001a\u00020\u0016H\u0007R\u0016\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0016\u0010,\u001a\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/huami/account/XiaoAiTokenConvertManager;", "", "", "source", "", "isDeviceSourceSupportConvert", "isSupportSilentConvertToken", "Lcom/huami/account/XiaoaiTokenKeeper$DeviceToken;", "f", "Lcom/huami/account/bean/AuthDevice;", "device", "Lcom/huami/account/XiaomiTokenMananger$OnAuthCallback;", "callback", "interceptAuth", "forceRefresh", "Lcom/huami/account/XiaomiTokenMananger$OnGetTokenCallback;", "interceptConvertToken", "", "deviceId", "miotId", "tpacType", "isForce", "", "b", "a", "convertTpac", "authByConvertToken", "force", "c", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearRefreshToken", "cancelAll", "TAG", "Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Lazy;", "e", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/CompletableJob;", "job", GoogleApiAvailabilityLight.a, "()Z", "enableConvertToken", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class XiaoAiTokenConvertManager {

    @NotNull
    public static final String TAG = "XiaoAiTokenConvertManager";

    @NotNull
    public static final XiaoAiTokenConvertManager INSTANCE = new XiaoAiTokenConvertManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy scope = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final CompletableJob job = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ XiaoaiTokenKeeper.DeviceToken a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(XiaoaiTokenKeeper.DeviceToken deviceToken) {
            super(0);
            this.a = deviceToken;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "convertToken: originToken=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "请求转换 token 出错：" + Log.getStackTraceString(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.XiaoAiTokenConvertManager$convertToken$3", f = "XiaoAiTokenConvertManager.kt", i = {0}, l = {DataTypeSource.SPORT_TYPE_CHESS, DataTypeSource.SPORT_TYPE_DOWNHILL}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ XiaomiTokenMananger.OnGetTokenCallback d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "三方授权失败 0106 清除本地无效 Token";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ XiaoAiConvertTokenApi.ConvertResult a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(XiaoAiConvertTokenApi.ConvertResult convertResult) {
                super(0);
                this.a = convertResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "转换 token 失败，errorCode：" + this.a.getErrorCode();
            }
        }

        /* JADX INFO: renamed from: com.huami.account.XiaoAiTokenConvertManager$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0261c extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0261c(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "请求转换 token 出错：" + Log.getStackTraceString(this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, XiaomiTokenMananger.OnGetTokenCallback onGetTokenCallback, String str, String str2, String str3, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = z;
            this.d = onGetTokenCallback;
            this.e = str;
            this.f = str2;
            this.g = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.c, this.d, this.e, this.f, this.g, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0083  */
        /* JADX WARN: Code duplicated, block: B:43:0x0092  */
        /* JADX WARN: Code duplicated, block: B:46:0x0097  */
        /* JADX WARN: Code duplicated, block: B:49:0x009c  */
        /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:54:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:60:0x00db  */
        /* JADX WARN: Code duplicated, block: B:63:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:68:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:70:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:73:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:76:0x010b  */
        /* JADX WARN: Code duplicated, block: B:79:0x0130  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            Throwable thM3848exceptionOrNullimpl;
            XiaoAiConvertTokenApi.ConvertResult convertResult;
            String errorCode;
            XiaomiTokenMananger.OnGetTokenCallback onGetTokenCallback;
            XiaomiTokenMananger.OnGetTokenCallback onGetTokenCallback2;
            boolean z;
            XiaomiTokenMananger.OnGetTokenCallback onGetTokenCallback3;
            XiaomiTokenMananger.OnGetTokenCallback onGetTokenCallback4;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z2 = false;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl((XiaoAiConvertTokenApi.ConvertResult) obj);
                    thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.info(XiaoAiTokenConvertManager.TAG, new C0261c(thM3848exceptionOrNullimpl));
                    }
                    convertResult = (XiaoAiConvertTokenApi.ConvertResult) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                    if (convertResult == null) {
                        onGetTokenCallback4 = this.d;
                        if (onGetTokenCallback4 != null) {
                            onGetTokenCallback4.empty();
                        }
                        XiaoaiTokenKeeper.INSTANCE.setConvertTokenResult(this.e, false);
                        return Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(convertResult.getErrorCode(), "0106")) {
                        XiaoAiTokenConvertManager.INSTANCE.a(this.e);
                        HMLog.info(XiaoAiTokenConvertManager.TAG, a.a);
                        onGetTokenCallback3 = this.d;
                        if (onGetTokenCallback3 != null) {
                            onGetTokenCallback3.onError(ErrorCode.builder(convertResult.getErrorCode()));
                        }
                        XiaoaiTokenKeeper.INSTANCE.setConvertTokenResult(this.e, false);
                        return Unit.INSTANCE;
                    }
                    errorCode = convertResult.getErrorCode();
                    if (errorCode != null) {
                        if (errorCode.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        HMLog.info(XiaoAiTokenConvertManager.TAG, new b(convertResult));
                        onGetTokenCallback2 = this.d;
                        if (onGetTokenCallback2 != null) {
                            onGetTokenCallback2.onError(ErrorCode.builder(convertResult.getErrorCode()));
                        }
                        return Unit.INSTANCE;
                    }
                    XiaoaiTokenKeeper.DeviceToken deviceToken = new XiaoaiTokenKeeper.DeviceToken(System.currentTimeMillis(), this.f, this.e, null, convertResult.getAccessToken(), null);
                    XiaoaiTokenKeeper xiaoaiTokenKeeper = XiaoaiTokenKeeper.INSTANCE;
                    xiaoaiTokenKeeper.setConvertTokenResult(this.e, true);
                    xiaoaiTokenKeeper.saveToken(this.e, deviceToken);
                    onGetTokenCallback = this.d;
                    if (onGetTokenCallback != null) {
                        onGetTokenCallback.onSuccess(convertResult.getAccessToken());
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                XiaoAiTokenConvertManager xiaoAiTokenConvertManager = XiaoAiTokenConvertManager.INSTANCE;
                boolean z3 = this.c;
                this.b = coroutineScope;
                this.a = 1;
                obj = xiaoAiTokenConvertManager.c(z3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                String str = (String) obj;
                if (str == null || str.length() == 0) {
                    XiaomiTokenMananger.OnGetTokenCallback onGetTokenCallback5 = this.d;
                    if (onGetTokenCallback5 != null) {
                        onGetTokenCallback5.empty();
                    }
                    return Unit.INSTANCE;
                }
                String str2 = this.e;
                String str3 = this.g;
                Result.Companion companion = Result.Companion;
                XiaoAiConvertTokenApi xiaoAiConvertTokenApi = XiaoAiConvertTokenApi.INSTANCE;
                this.b = null;
                this.a = 2;
                obj = xiaoAiConvertTokenApi.requestConvertApi(str2, str3, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objM3845constructorimpl = Result.m3845constructorimpl((XiaoAiConvertTokenApi.ConvertResult) obj);
                thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.info(XiaoAiTokenConvertManager.TAG, new C0261c(thM3848exceptionOrNullimpl));
                }
                convertResult = (XiaoAiConvertTokenApi.ConvertResult) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                if (convertResult == null) {
                    onGetTokenCallback4 = this.d;
                    if (onGetTokenCallback4 != null) {
                        onGetTokenCallback4.empty();
                    }
                    XiaoaiTokenKeeper.INSTANCE.setConvertTokenResult(this.e, false);
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(convertResult.getErrorCode(), "0106")) {
                    XiaoAiTokenConvertManager.INSTANCE.a(this.e);
                    HMLog.info(XiaoAiTokenConvertManager.TAG, a.a);
                    onGetTokenCallback3 = this.d;
                    if (onGetTokenCallback3 != null) {
                        onGetTokenCallback3.onError(ErrorCode.builder(convertResult.getErrorCode()));
                    }
                    XiaoaiTokenKeeper.INSTANCE.setConvertTokenResult(this.e, false);
                    return Unit.INSTANCE;
                }
                errorCode = convertResult.getErrorCode();
                if (errorCode != null) {
                    if (errorCode.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (z2) {
                    HMLog.info(XiaoAiTokenConvertManager.TAG, new b(convertResult));
                    onGetTokenCallback2 = this.d;
                    if (onGetTokenCallback2 != null) {
                        onGetTokenCallback2.onError(ErrorCode.builder(convertResult.getErrorCode()));
                    }
                    return Unit.INSTANCE;
                }
                XiaoaiTokenKeeper.DeviceToken deviceToken2 = new XiaoaiTokenKeeper.DeviceToken(System.currentTimeMillis(), this.f, this.e, null, convertResult.getAccessToken(), null);
                XiaoaiTokenKeeper xiaoaiTokenKeeper2 = XiaoaiTokenKeeper.INSTANCE;
                xiaoaiTokenKeeper2.setConvertTokenResult(this.e, true);
                xiaoaiTokenKeeper2.saveToken(this.e, deviceToken2);
                onGetTokenCallback = this.d;
                if (onGetTokenCallback != null) {
                    onGetTokenCallback.onSuccess(convertResult.getAccessToken());
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<CoroutineScope> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CoroutineScope invoke() {
            return CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(XiaoAiTokenConvertManager.job).plus(new CoroutineName("XiaoAiTokenConvertManagerScope")));
        }
    }

    private XiaoAiTokenConvertManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String deviceId) {
        XiaomiTokenMananger.clearXiaomiToken();
        XiaomiTokenMananger.clearDeviceToken(deviceId);
    }

    @JvmStatic
    public static final void authByConvertToken(@NotNull String deviceId, @NotNull String tpacType, @Nullable final XiaomiTokenMananger.OnAuthCallback callback) {
        String miotDid = AccountExternalsKt.getAccountDelegate().getMiotDid(deviceId);
        if (miotDid == null) {
            miotDid = "";
        }
        INSTANCE.b(deviceId, miotDid, tpacType, true, new XiaomiTokenMananger.OnGetTokenCallback() { // from class: com.huami.account.XiaoAiTokenConvertManager.authByConvertToken.1
            @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
            public void empty() {
                XiaomiTokenMananger.OnAuthCallback onAuthCallback = callback;
                if (onAuthCallback == null) {
                    return;
                }
                onAuthCallback.onError(null);
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
            public void onError(@Nullable ErrorCode errorCode) {
                XiaomiTokenMananger.OnAuthCallback onAuthCallback = callback;
                if (onAuthCallback == null) {
                    return;
                }
                onAuthCallback.onError(errorCode);
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
            public void onRefreshFaild(@Nullable String oldAccessToken) {
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
            public void onSuccess(@Nullable String newAccessToken) {
                XiaomiTokenMananger.OnAuthCallback onAuthCallback = callback;
                if (onAuthCallback == null) {
                    return;
                }
                onAuthCallback.onSuccess();
            }
        });
    }

    private final void b(String deviceId, String miotId, String tpacType, boolean isForce, XiaomiTokenMananger.OnGetTokenCallback callback) {
        XiaoaiTokenKeeper.DeviceToken token = XiaoaiTokenKeeper.INSTANCE.getToken(deviceId);
        HMLog.verbose(TAG, new a(token));
        if (!isForce) {
            boolean z = false;
            if (token != null && f(token)) {
                z = true;
            }
            if (z) {
                if (callback == null) {
                    return;
                }
                callback.onSuccess(token.getAccessToken());
                return;
            }
        }
        kotlinx.coroutines.e.f(e(), new XiaoAiTokenConvertManager$convertToken$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE), null, new c(isForce, callback, deviceId, tpacType, miotId, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(boolean z, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new XiaoAiTokenConvertManager$getAppXiaomiToken$2(z, null), continuation);
    }

    @JvmStatic
    public static final void cancelAll() {
        Job.DefaultImpls.cancel$default((Job) job, (CancellationException) null, 1, (Object) null);
    }

    @JvmStatic
    public static final void clearRefreshToken() {
        List<XiaoaiTokenKeeper.DeviceToken> all = XiaoaiTokenKeeper.INSTANCE.getAll();
        if (all == null) {
            return;
        }
        ArrayList<XiaoaiTokenKeeper.DeviceToken> arrayList = new ArrayList();
        for (Object obj : all) {
            XiaoaiTokenKeeper.DeviceToken deviceToken = (XiaoaiTokenKeeper.DeviceToken) obj;
            boolean z = false;
            if (deviceToken != null && INSTANCE.f(deviceToken)) {
                z = true;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (XiaoaiTokenKeeper.DeviceToken deviceToken2 : arrayList) {
            String deviceId = deviceToken2 == null ? null : deviceToken2.getDeviceId();
            if (deviceId != null) {
                arrayList2.add(deviceId);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            XiaoaiTokenKeeper.INSTANCE.removeToken((String) it2.next());
        }
    }

    @JvmStatic
    @NotNull
    public static final String convertTpac(int source) {
        String tpacProvider = AccountExternalsKt.getDeviceTokenConfig().getTpacProvider(source);
        return tpacProvider == null ? "" : tpacProvider;
    }

    private final boolean d() {
        return AccountExternalsKt.getConfigDelegate().supportXiaomiConvertToken();
    }

    private final CoroutineScope e() {
        return (CoroutineScope) scope.getValue();
    }

    private final boolean f(XiaoaiTokenKeeper.DeviceToken deviceToken) {
        return !g(deviceToken.getRefreshToken()) && g(deviceToken.getAccessToken()) && g(deviceToken.getDeviceId());
    }

    private static final boolean g(String str) {
        if (str != null) {
            if (str.length() > 0) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean interceptAuth(@Nullable AuthDevice device, @Nullable XiaomiTokenMananger.OnAuthCallback callback) {
        if (device == null) {
            return false;
        }
        AuthDeviceSource source = device.getSource();
        String serialNumber = device.getSerialNumber();
        if (!XiaomiTokenMananger.hasXiaomiToken()) {
            return false;
        }
        authByConvertToken(serialNumber, convertTpac(source.getValue()), callback);
        return true;
    }

    @JvmStatic
    public static final boolean interceptConvertToken(@Nullable AuthDevice device, boolean forceRefresh, @Nullable XiaomiTokenMananger.OnGetTokenCallback callback) {
        XiaoAiTokenConvertManager xiaoAiTokenConvertManager = INSTANCE;
        if (!xiaoAiTokenConvertManager.d() || device == null || !isDeviceSourceSupportConvert(device.getSource().getValue())) {
            return false;
        }
        String strConvertTpac = convertTpac(device.getSource().getValue());
        String serialNumber = device.getSerialNumber();
        String miotDid = AccountExternalsKt.getAccountDelegate().getMiotDid(serialNumber);
        if (miotDid == null) {
            miotDid = "";
        }
        xiaoAiTokenConvertManager.b(serialNumber, miotDid, strConvertTpac, forceRefresh, callback);
        return true;
    }

    @JvmStatic
    public static final boolean isDeviceSourceSupportConvert(int source) {
        if (INSTANCE.d()) {
            return Intrinsics.areEqual(convertTpac(source), IAccount.PROVIDER_DEVICE_KONGMING);
        }
        return false;
    }

    @JvmStatic
    public static final boolean isSupportSilentConvertToken(int source) {
        return INSTANCE.d() && isDeviceSourceSupportConvert(source) && HMAccountKeeper.INSTANCE.getXiaomiAccessToken() != null;
    }
}
