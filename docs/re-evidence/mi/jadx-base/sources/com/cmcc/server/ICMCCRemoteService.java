package com.cmcc.server;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.cmcc.server.ICMCCRemoteService;
import com.cmcc.server.model.MultiSimDeviceInfo;
import com.cmcc.server.model.SimInfo;
import com.mi.fitness.lpamanagement.request.LpaManagementApiRequest;
import com.mi.fitness.lpamanagement.request.data.GetSignRequestData;
import com.mi.fitness.lpamanagement.request.data.GetSignResult;
import com.mi.fitness.lpamanagement.service.BaseESimService;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.kvc;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b(\u0010\u0012J7\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/cmcc/server/ICMCCRemoteService;", "Lcom/mi/fitness/lpamanagement/service/BaseESimService;", "Lkotlin/Function1;", "Lcom/mi/fitness/lpamanagement/request/data/GetSignResult;", "", "success", "Lcom/xiaomi/fitness/net/response/ApiException;", "fail", "requestSign", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/cmcc/server/model/MultiSimDeviceInfo;", "createMultiSimDeviceInfo", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDeviceMultiSimInfoCallBack", "()V", "clearSimInfoList", "", "status", "onProfileDownloadStatusCallBack", "(I)V", "getEsimList", "retryCount", "I", "Lkvc;", "mOpenMultiSimCalbcak", "Lkvc;", "getMOpenMultiSimCalbcak", "()Lkvc;", "setMOpenMultiSimCalbcak", "(Lkvc;)V", "Lcom/cmcc/server/c$a;", "mOpenMultiSimBinder", "Lcom/cmcc/server/c$a;", "Lcom/cmcc/server/d$a;", "mServiceBinder", "Lcom/cmcc/server/d$a;", "<init>", "Companion", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ICMCCRemoteService extends BaseESimService {
    private static final int CMCC_API_VERSION = 107;

    @NotNull
    private static final String CMCC_HEDUOHAO_PACKAGE_NAME = "com.cmic.heduohao";

    @NotNull
    private static final String CMCC_ONLINE_HALL_APP = "com.greenpoint.android.mc10086.activity";
    private static final int CMCC_TECH_VERSION = 12;
    private static final int CMCC_TECH_VERSION_LOW = 11;

    @NotNull
    private static final String TAG = "ICMCCRemoteService";

    @Nullable
    private kvc mOpenMultiSimCalbcak;
    private int retryCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static List<SimInfo> mSimInfoList = new ArrayList();

    @NotNull
    private final c.a mOpenMultiSimBinder = new c.a() { // from class: com.cmcc.server.ICMCCRemoteService$mOpenMultiSimBinder$1
        @Override // com.cmcc.server.c
        public void downloadEsimProfile(String activationCode, long time, String sign) throws RemoteException {
            Intrinsics.checkNotNullParameter(activationCode, "activationCode");
            Intrinsics.checkNotNullParameter(sign, "sign");
            ICMCCRemoteService iCMCCRemoteService = this.this$0;
            if (iCMCCRemoteService.mShouldResetService) {
                throw new RemoteException("watch switched!");
            }
            ScopeExtKt.scopeNet$default(null, new ICMCCRemoteService$mOpenMultiSimBinder$1$downloadEsimProfile$1(iCMCCRemoteService, activationCode, null), 1, null);
        }

        @Override // com.cmcc.server.c
        public void getAttachedDeviceMultiSimInfo() throws RemoteException {
            ICMCCRemoteService iCMCCRemoteService = this.this$0;
            if (iCMCCRemoteService.mShouldResetService) {
                throw new RemoteException("watch switched!");
            }
            iCMCCRemoteService.retryCount = 0;
            this.this$0.getEsimList();
        }

        @Override // com.cmcc.server.c
        public void registerCallback(kvc callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.this$0.setMOpenMultiSimCalbcak(callback);
        }

        @Override // com.cmcc.server.c
        public void unRegisterCallback(kvc callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.this$0.setMOpenMultiSimCalbcak(null);
        }
    };

    @NotNull
    private final d.a mServiceBinder = new d.a() { // from class: com.cmcc.server.ICMCCRemoteService$mServiceBinder$1
        @Override // com.cmcc.server.d
        public IBinder getServiceBinder(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Logger.i("ICMCCRemoteService", "getServiceBinder: " + packageName);
            this.this$0.mShouldResetService = false;
            if (Intrinsics.areEqual("com.cmic.heduohao", packageName) || Intrinsics.areEqual("com.greenpoint.android.mc10086.activity", packageName)) {
                Logger.i("ICMCCRemoteService", "sVerified = true");
                return this.this$0.mOpenMultiSimBinder;
            }
            Logger.i("ICMCCRemoteService", "mVerified = false");
            return null;
        }
    };

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/cmcc/server/ICMCCRemoteService$Companion;", "", "<init>", "()V", "TAG", "", "mSimInfoList", "", "Lcom/cmcc/server/model/SimInfo;", "getMSimInfoList", "()Ljava/util/List;", "setMSimInfoList", "(Ljava/util/List;)V", "CMCC_HEDUOHAO_PACKAGE_NAME", "CMCC_ONLINE_HALL_APP", "CMCC_API_VERSION", "", "CMCC_TECH_VERSION", "CMCC_TECH_VERSION_LOW", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SimInfo> getMSimInfoList() {
            return ICMCCRemoteService.mSimInfoList;
        }

        public final void setMSimInfoList(@NotNull List<SimInfo> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            ICMCCRemoteService.mSimInfoList = list;
        }
    }

    /* JADX INFO: renamed from: com.cmcc.server.ICMCCRemoteService$requestSign$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.cmcc.server.ICMCCRemoteService$requestSign$1", f = "ICMCCRemoteService.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ApiException, Unit> $fail;
        final /* synthetic */ Function1<GetSignResult, Unit> $success;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super GetSignResult, Unit> function1, Function1<? super ApiException, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$success = function1;
            this.$fail = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ICMCCRemoteService.this.new AnonymousClass1(this.$success, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = ICMCCRemoteService.this.enableHighTechVersion() ? 12 : 11;
                BaseESimService.Companion companion = BaseESimService.INSTANCE;
                GetSignRequestData.ChinaMobileSignRequestData chinaMobileSignRequestData = new GetSignRequestData.ChinaMobileSignRequestData(companion.getSDeviceIMEI(), companion.getSEID(), 107, i2, 0L, 16, null);
                LpaManagementApiRequest lpaManagementApiRequest = ICMCCRemoteService.this.getLpaManagementApiRequest();
                Function1<GetSignResult, Unit> function1 = this.$success;
                Function1<ApiException, Unit> function2 = this.$fail;
                this.label = 1;
                if (lpaManagementApiRequest.getSign(1, (4 & 2) != 0 ? null : chinaMobileSignRequestData, (4 & 4) != 0 ? null : null, function1, function2, this) == coroutine_suspended) {
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

    private final void createMultiSimDeviceInfo(final Function1<? super MultiSimDeviceInfo, Unit> success, Function1<? super ApiException, Unit> fail) {
        requestSign(new Function1() { // from class: opc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ICMCCRemoteService.createMultiSimDeviceInfo$lambda$4(success, (GetSignResult) obj);
            }
        }, fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createMultiSimDeviceInfo$lambda$4(Function1 success, GetSignResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        MultiSimDeviceInfo multiSimDeviceInfoCreateFromParcel = MultiSimDeviceInfo.CREATOR.createFromParcel(Parcel.obtain());
        if (it.getChinaMobileResp() != null) {
            multiSimDeviceInfoCreateFromParcel.c(it.getChinaMobileResp().getEncryptedDeviceImei());
            BaseESimService.Companion companion = BaseESimService.INSTANCE;
            multiSimDeviceInfoCreateFromParcel.d(companion.getSDeviceSerialNumber());
            multiSimDeviceInfoCreateFromParcel.f(it.getChinaMobileResp().getEncryptedEid());
            multiSimDeviceInfoCreateFromParcel.e(companion.getSDeviceType());
            multiSimDeviceInfoCreateFromParcel.g(companion.getSProductName());
            multiSimDeviceInfoCreateFromParcel.h(companion.getSResultCode());
            multiSimDeviceInfoCreateFromParcel.a(it.getChinaMobileResp().getEncryptedApiVersion());
            multiSimDeviceInfoCreateFromParcel.k(it.getChinaMobileResp().getEncryptedTechVersion());
            multiSimDeviceInfoCreateFromParcel.l(it.getChinaMobileResp().getM_time());
            multiSimDeviceInfoCreateFromParcel.i(it.getChinaMobileResp().getSign());
        }
        BaseESimService.Companion companion2 = BaseESimService.INSTANCE;
        if (!companion2.getEsimInfoList().isEmpty()) {
            BaseESimService.ESimInfo eSimInfo = companion2.getEsimInfoList().get(0);
            SimInfo simInfoCreateFromParcel = SimInfo.CREATOR.createFromParcel(Parcel.obtain());
            simInfoCreateFromParcel.c(eSimInfo.getIccid());
            simInfoCreateFromParcel.a(eSimInfo.getActive());
            List<SimInfo> list = mSimInfoList;
            Intrinsics.checkNotNull(simInfoCreateFromParcel);
            list.add(simInfoCreateFromParcel);
        }
        multiSimDeviceInfoCreateFromParcel.j(mSimInfoList);
        Intrinsics.checkNotNull(multiSimDeviceInfoCreateFromParcel);
        success.invoke2(multiSimDeviceInfoCreateFromParcel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceMultiSimInfoCallBack$lambda$0(ICMCCRemoteService this$0, MultiSimDeviceInfo it) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        kvc kvcVar = this$0.mOpenMultiSimCalbcak;
        if (kvcVar != null) {
            kvcVar.J4(it);
        }
        Logger.i(TAG, "mOpenMultiSimCalbcak?.getDeviceMultiSimInfo success");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceMultiSimInfoCallBack$lambda$1(ICMCCRemoteService this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "request sign fail: " + it);
        this$0.mOpenMultiSimCalbcak = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceMultiSimInfoCallBack$lambda$2(ICMCCRemoteService this$0, MultiSimDeviceInfo it) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        kvc kvcVar = this$0.mOpenMultiSimCalbcak;
        if (kvcVar != null) {
            kvcVar.J4(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceMultiSimInfoCallBack$lambda$3(ICMCCRemoteService this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mOpenMultiSimCalbcak = null;
        return Unit.INSTANCE;
    }

    private final void requestSign(Function1<? super GetSignResult, Unit> success, Function1<? super ApiException, Unit> fail) {
        ScopeExtKt.scopeNet$default(null, new AnonymousClass1(success, fail, null), 1, null);
    }

    @Override // com.mi.fitness.lpamanagement.service.BaseESimService
    public void clearSimInfoList() {
        super.clearSimInfoList();
        mSimInfoList.clear();
    }

    public final void getEsimList() {
        if (!isConnected()) {
            BaseESimService.INSTANCE.setSResultCode(-2);
            onDeviceMultiSimInfoCallBack();
        } else {
            BaseESimService.INSTANCE.setSResultCode(1);
            Logger.i(TAG, "getEsimList connected ok");
            getESimList();
        }
    }

    @Nullable
    public final kvc getMOpenMultiSimCalbcak() {
        return this.mOpenMultiSimCalbcak;
    }

    @Override // com.mi.fitness.lpamanagement.service.BaseESimService, android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Logger.i(TAG, "onBind");
        return this.mServiceBinder;
    }

    @Override // com.mi.fitness.lpamanagement.service.BaseESimService
    public void onDeviceMultiSimInfoCallBack() {
        BaseESimService.Companion companion = BaseESimService.INSTANCE;
        if (companion.getSResultCode() == 1) {
            if (this.mOpenMultiSimCalbcak != null) {
                try {
                    createMultiSimDeviceInfo(new Function1() { // from class: ppc
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return ICMCCRemoteService.onDeviceMultiSimInfoCallBack$lambda$0(this.f30606a, (MultiSimDeviceInfo) obj);
                        }
                    }, new Function1() { // from class: qpc
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return ICMCCRemoteService.onDeviceMultiSimInfoCallBack$lambda$1(this.f31714a, (ApiException) obj);
                        }
                    });
                    return;
                } catch (RemoteException e) {
                    e.printStackTrace();
                    Logger.i(TAG, "mOpenMultiSimCalbcak?.getDeviceMultiSimInfo failed:" + e.getMessage());
                    this.mOpenMultiSimCalbcak = null;
                    return;
                }
            }
            return;
        }
        Logger.i(TAG, "onDeviceMultiSimInfoCallBack sResultCode:" + companion.getSResultCode());
        companion.setSDeviceIMEI("");
        companion.setSEID("");
        mSimInfoList.clear();
        if (this.mOpenMultiSimCalbcak != null) {
            try {
                createMultiSimDeviceInfo(new Function1() { // from class: rpc
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return ICMCCRemoteService.onDeviceMultiSimInfoCallBack$lambda$2(this.f32771a, (MultiSimDeviceInfo) obj);
                    }
                }, new Function1() { // from class: spc
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return ICMCCRemoteService.onDeviceMultiSimInfoCallBack$lambda$3(this.f33857a, (ApiException) obj);
                    }
                });
            } catch (RemoteException e2) {
                e2.printStackTrace();
                this.mOpenMultiSimCalbcak = null;
            }
        }
        BaseESimService.isGetAttachedDeviceMultiSimInfoInProgress = false;
    }

    @Override // com.mi.fitness.lpamanagement.service.BaseESimService
    public void onProfileDownloadStatusCallBack(int status) {
        Logger.i(TAG, "onProfileDownloadStatusCallBack status : " + status);
        kvc kvcVar = this.mOpenMultiSimCalbcak;
        if (kvcVar == null) {
            Logger.i(TAG, "no callback registered");
            return;
        }
        if (kvcVar != null) {
            try {
                kvcVar.c(status);
                Unit unit = Unit.INSTANCE;
            } catch (RemoteException e) {
                e.printStackTrace();
                this.mOpenMultiSimCalbcak = null;
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void setMOpenMultiSimCalbcak(@Nullable kvc kvcVar) {
        this.mOpenMultiSimCalbcak = kvcVar;
    }
}
