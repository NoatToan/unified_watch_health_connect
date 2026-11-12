package com.euicc.server;

import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.euicc.server.IRemoteService;
import com.euicc.server.model.EUICCDeviceInfo;
import com.euicc.server.model.EUICCInfo;
import com.google.gson.Gson;
import com.mi.fitness.lpamanagement.request.LpaManagementApiRequest;
import com.mi.fitness.lpamanagement.request.data.ActivationCipherData;
import com.mi.fitness.lpamanagement.request.data.CUActivationDecryptData;
import com.mi.fitness.lpamanagement.request.data.GetSignRequestData;
import com.mi.fitness.lpamanagement.request.data.GetSignResult;
import com.mi.fitness.lpamanagement.request.data.VerifySignResult;
import com.mi.fitness.lpamanagement.service.BaseESimService;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.b4s;
import defpackage.gvc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b(\u0010\u001cJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ?\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0015R\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006*"}, d2 = {"Lcom/euicc/server/IRemoteService;", "Lcom/mi/fitness/lpamanagement/service/BaseESimService;", "", "code", "", "downloadESim", "(Ljava/lang/String;)V", "Lcom/euicc/server/model/EUICCDeviceInfo;", "deviceInfo", "createDeviceEuicccInfo", "(Lcom/euicc/server/model/EUICCDeviceInfo;)V", "Lkotlin/Function1;", "Lcom/mi/fitness/lpamanagement/request/data/GetSignResult;", "success", "Lcom/xiaomi/fitness/net/response/ApiException;", "fail", "requestSign", "(Lcom/euicc/server/model/EUICCDeviceInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "data", "requestDecrypt", "getOsVersion", "()Ljava/lang/String;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDeviceMultiSimInfoCallBack", "()V", "getEsimList", "clearSimInfoList", "Lgvc;", "simCallbcak", "Lgvc;", "mAidlVersion", "Ljava/lang/String;", "getMAidlVersion", "iServiceBinder", "Landroid/os/IBinder;", "mBinder", "<init>", "Companion", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class IRemoteService extends BaseESimService {

    @NotNull
    private static final String TAG = "IRemoteService";

    @Nullable
    private gvc simCallbcak;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static List<EUICCInfo> mSimInfoList = new ArrayList();

    @NotNull
    private final String mAidlVersion = "1.0";

    @NotNull
    private final IBinder iServiceBinder = new d.a() { // from class: com.euicc.server.IRemoteService$iServiceBinder$1
        @Override // com.euicc.server.d
        public IBinder getServiceBinder(String packageName) throws RemoteException {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            if (!Intrinsics.areEqual("com.sinovatech.unicom.ui", packageName)) {
                return null;
            }
            IRemoteService iRemoteService = this.this$0;
            iRemoteService.mShouldResetService = false;
            if (iRemoteService.isConnected()) {
                Logger.i("IRemoteService", "sVerified = true");
                return this.this$0.mBinder;
            }
            for (int i = 0; !this.this$0.isConnected() && i < 5; i++) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return this.this$0.mBinder;
        }
    };

    @NotNull
    private final IBinder mBinder = new a.AbstractBinderC0147a() { // from class: com.euicc.server.IRemoteService$mBinder$1
        @Override // com.euicc.server.a
        public void downloadEUICCProfile(String activationCode) throws RemoteException {
            Intrinsics.checkNotNullParameter(activationCode, "activationCode");
            IRemoteService iRemoteService = this.this$0;
            if (iRemoteService.mShouldResetService) {
                throw new RemoteException("watch switched!");
            }
            iRemoteService.requestDecrypt(activationCode);
        }

        @Override // com.euicc.server.a
        public void getAttachedDeviceEUICCInfo() throws RemoteException {
            IRemoteService iRemoteService = this.this$0;
            if (iRemoteService.mShouldResetService) {
                throw new RemoteException("watch switched!");
            }
            iRemoteService.getEsimList();
        }

        @Override // com.euicc.server.a
        public void registerCallback(gvc callback) throws RemoteException {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Logger.i("IRemoteService", "registerCallback");
            this.this$0.simCallbcak = callback;
        }

        @Override // com.euicc.server.a
        public void unRegisterCallback(gvc callback) throws RemoteException {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Logger.i("IRemoteService", "unRegisterCallback");
            this.this$0.simCallbcak = null;
        }
    };

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/euicc/server/IRemoteService$Companion;", "", "<init>", "()V", "TAG", "", "mSimInfoList", "", "Lcom/euicc/server/model/EUICCInfo;", "getMSimInfoList", "()Ljava/util/List;", "setMSimInfoList", "(Ljava/util/List;)V", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<EUICCInfo> getMSimInfoList() {
            return IRemoteService.mSimInfoList;
        }

        public final void setMSimInfoList(@NotNull List<EUICCInfo> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            IRemoteService.mSimInfoList = list;
        }
    }

    /* JADX INFO: renamed from: com.euicc.server.IRemoteService$requestDecrypt$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.euicc.server.IRemoteService$requestDecrypt$1", f = "IRemoteService.kt", i = {}, l = {SportReportBaseParser.ReportType.entryTime}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivationCipherData $activationCipher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivationCipherData activationCipherData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activationCipher = activationCipherData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(IRemoteService iRemoteService, VerifySignResult verifySignResult) {
            Logger.i(IRemoteService.TAG, "verifySign success " + verifySignResult);
            if (verifySignResult.getSuccess()) {
                try {
                    iRemoteService.downloadESim(((CUActivationDecryptData) new Gson().fromJson(verifySignResult.getPlain_text(), CUActivationDecryptData.class)).getActivationCode());
                } catch (Exception unused) {
                    Logger.i(IRemoteService.TAG, "getDecryptActivationFailed");
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(ApiException apiException) {
            Logger.i(IRemoteService.TAG, "verifySign fail");
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IRemoteService.this.new AnonymousClass1(this.$activationCipher, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LpaManagementApiRequest lpaManagementApiRequest = IRemoteService.this.getLpaManagementApiRequest();
                String mCiphertext = this.$activationCipher.getMCiphertext();
                String mCiphertextSign = this.$activationCipher.getMCiphertextSign();
                final IRemoteService iRemoteService = IRemoteService.this;
                Function1<? super VerifySignResult, Unit> function1 = new Function1() { // from class: com.euicc.server.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return IRemoteService.AnonymousClass1.invokeSuspend$lambda$0(iRemoteService, (VerifySignResult) obj2);
                    }
                };
                Function1<? super ApiException, Unit> function2 = new Function1() { // from class: com.euicc.server.c
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return IRemoteService.AnonymousClass1.invokeSuspend$lambda$1((ApiException) obj2);
                    }
                };
                this.label = 1;
                if (lpaManagementApiRequest.verifySign(2, mCiphertext, mCiphertextSign, function1, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.euicc.server.IRemoteService$requestSign$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.euicc.server.IRemoteService$requestSign$1", f = "IRemoteService.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EUICCDeviceInfo $deviceInfo;
        final /* synthetic */ Function1<ApiException, Unit> $fail;
        final /* synthetic */ Function1<GetSignResult, Unit> $success;
        int label;
        final /* synthetic */ IRemoteService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13401(EUICCDeviceInfo eUICCDeviceInfo, IRemoteService iRemoteService, Function1<? super GetSignResult, Unit> function1, Function1<? super ApiException, Unit> function2, Continuation<? super C13401> continuation) {
            super(2, continuation);
            this.$deviceInfo = eUICCDeviceInfo;
            this.this$0 = iRemoteService;
            this.$success = function1;
            this.$fail = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C13401(this.$deviceInfo, this.this$0, this.$success, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$deviceInfo.h().size() > 0) {
                    String strC = this.$deviceInfo.h().get(0).c();
                    if (strC == null) {
                        strC = "";
                    }
                    String strD = this.$deviceInfo.h().get(0).d();
                    str2 = strC;
                    str = strD != null ? strD : "";
                } else {
                    str = "";
                    str2 = str;
                }
                int iG = this.$deviceInfo.g();
                int iD = this.$deviceInfo.d();
                String strA = this.$deviceInfo.a();
                Intrinsics.checkNotNullExpressionValue(strA, "getDeviceIMEI(...)");
                String strC2 = this.$deviceInfo.c();
                Intrinsics.checkNotNullExpressionValue(strC2, "getDeviceSerialNumber(...)");
                String strF = this.$deviceInfo.f();
                Intrinsics.checkNotNullExpressionValue(strF, "getProductName(...)");
                String strE = this.$deviceInfo.e();
                Intrinsics.checkNotNullExpressionValue(strE, "getEID(...)");
                GetSignRequestData.ChinaUnicomSignRequestData chinaUnicomSignRequestData = new GetSignRequestData.ChinaUnicomSignRequestData(iG, iD, strA, strC2, strF, strE, str, str2, this.this$0.getOsVersion(), this.this$0.getMAidlVersion());
                Logger.i(IRemoteService.TAG, "requestSign requestData:" + chinaUnicomSignRequestData);
                LpaManagementApiRequest lpaManagementApiRequest = this.this$0.getLpaManagementApiRequest();
                Function1<GetSignResult, Unit> function1 = this.$success;
                Function1<ApiException, Unit> function2 = this.$fail;
                this.label = 1;
                if (lpaManagementApiRequest.getSign(2, (4 & 2) != 0 ? null : null, (4 & 4) != 0 ? null : chinaUnicomSignRequestData, function1, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void createDeviceEuicccInfo(final EUICCDeviceInfo deviceInfo) {
        requestSign(deviceInfo, new Function1() { // from class: fxc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IRemoteService.createDeviceEuicccInfo$lambda$0(deviceInfo, this, (GetSignResult) obj);
            }
        }, new Function1() { // from class: gxc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IRemoteService.createDeviceEuicccInfo$lambda$1(this.f19430a, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDeviceEuicccInfo$lambda$0(EUICCDeviceInfo deviceInfo, IRemoteService this$0, GetSignResult it) {
        Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "requestSign Success " + it);
        if (it.getChinaUnicomResp() != null) {
            deviceInfo.w(this$0.getOsVersion());
            deviceInfo.t(this$0.mAidlVersion);
            deviceInfo.r(it.getChinaUnicomResp().getTimeTemp());
            deviceInfo.u(it.getChinaUnicomResp().getMCiphertext());
            deviceInfo.v(it.getChinaUnicomResp().getMCiphertextSign());
        }
        try {
            gvc gvcVar = this$0.simCallbcak;
            if (gvcVar != null) {
                gvcVar.D3(deviceInfo);
            }
            Logger.i(TAG, "simCallback :" + this$0.simCallbcak + " simCallbcak？.getDeviceEUICCInfo success");
        } catch (RemoteException e) {
            e.printStackTrace();
            Logger.i(TAG, "simCallbcak?.getDeviceEUICCInfo failed:" + e.getMessage());
            this$0.simCallbcak = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDeviceEuicccInfo$lambda$1(IRemoteService this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "requestSign Fail");
        this$0.simCallbcak = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadESim(String code) {
        downloadESim(code, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getOsVersion() {
        return enableHighTechVersion() ? b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD : "0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestDecrypt(String data) {
        ScopeExtKt.scopeNet$default(null, new AnonymousClass1((ActivationCipherData) new Gson().fromJson(data, ActivationCipherData.class), null), 1, null);
    }

    private final void requestSign(EUICCDeviceInfo deviceInfo, Function1<? super GetSignResult, Unit> success, Function1<? super ApiException, Unit> fail) {
        Logger.i(TAG, "requestSign");
        ScopeExtKt.scopeNet$default(null, new C13401(deviceInfo, this, success, fail, null), 1, null);
    }

    @Override // com.mi.fitness.lpamanagement.service.BaseESimService
    public void clearSimInfoList() {
        super.clearSimInfoList();
        mSimInfoList.clear();
    }

    public final void getEsimList() {
        if (isConnected()) {
            Logger.i(TAG, "getEsimList");
            BaseESimService.INSTANCE.setSResultCode(1);
            getESimList();
        } else {
            Logger.i(TAG, "onDeviceMultiSimInfoCallBack");
            BaseESimService.INSTANCE.setSResultCode(-2);
            onDeviceMultiSimInfoCallBack();
        }
    }

    @NotNull
    public final String getMAidlVersion() {
        return this.mAidlVersion;
    }

    @Override // com.mi.fitness.lpamanagement.service.BaseESimService, android.app.Service
    @NotNull
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Logger.i(TAG, "onBind");
        return this.iServiceBinder;
    }

    @Override // com.mi.fitness.lpamanagement.service.BaseESimService
    public void onDeviceMultiSimInfoCallBack() {
        BaseESimService.Companion companion = BaseESimService.INSTANCE;
        if (companion.getSResultCode() != 1) {
            Logger.i(TAG, "onDeviceMultiSimInfoCallBack sResultCode:" + companion.getSResultCode());
            companion.setSDeviceIMEI("");
            companion.setSEID("");
            mSimInfoList.clear();
            EUICCDeviceInfo eUICCDeviceInfo = new EUICCDeviceInfo();
            eUICCDeviceInfo.o(companion.getSResultCode());
            if (this.simCallbcak != null) {
                createDeviceEuicccInfo(eUICCDeviceInfo);
            }
            BaseESimService.isGetAttachedDeviceMultiSimInfoInProgress = false;
            return;
        }
        if (this.simCallbcak != null) {
            EUICCDeviceInfo eUICCDeviceInfo2 = new EUICCDeviceInfo();
            eUICCDeviceInfo2.i(companion.getSDeviceIMEI());
            eUICCDeviceInfo2.j(companion.getSDeviceSerialNumber());
            eUICCDeviceInfo2.l(companion.getSEID());
            eUICCDeviceInfo2.k(companion.getSDeviceType());
            eUICCDeviceInfo2.m(companion.getSProductName());
            eUICCDeviceInfo2.o(companion.getSResultCode());
            if (true ^ companion.getEsimInfoList().isEmpty()) {
                BaseESimService.ESimInfo eSimInfo = companion.getEsimInfoList().get(0);
                EUICCInfo eUICCInfo = new EUICCInfo();
                eUICCInfo.f(eSimInfo.getIccid());
                eUICCInfo.e(eSimInfo.getActive());
                mSimInfoList.add(eUICCInfo);
            }
            eUICCDeviceInfo2.q(mSimInfoList);
            Logger.i(TAG, "onDeviceMultiSimInfoCallBack simInfoList:" + mSimInfoList + " eid:" + companion.getSEID() + " imei:" + companion.getSDeviceIMEI());
            createDeviceEuicccInfo(eUICCDeviceInfo2);
        }
    }
}
