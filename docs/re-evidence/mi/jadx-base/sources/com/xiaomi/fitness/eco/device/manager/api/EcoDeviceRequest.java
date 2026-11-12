package com.xiaomi.fitness.eco.device.manager.api;

import android.os.Build;
import android.os.Process;
import com.xiaomi.eco.EcoApplyBindInfo;
import com.xiaomi.eco.EcoBindResult;
import com.xiaomi.eco.EcoLocalBindInfo;
import com.xiaomi.eco.EcoLocalBindResult;
import com.xiaomi.eco.EcoVerifyBindInfo;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.device.eco.manager.api.model.BindHelloInfo;
import com.xiaomi.fitness.device.eco.manager.api.model.BindKey;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest;
import com.xiaomi.fitness.eco.device.manager.api.model.BindECDHInfo;
import com.xiaomi.fitness.eco.device.manager.api.model.BindSignInfo;
import com.xiaomi.fitness.eco.device.manager.api.model.BindStatus;
import com.xiaomi.fitness.eco.device.manager.api.model.ConfirmBindInfo;
import com.xiaomi.fitness.eco.device.manager.api.model.DeviceListData;
import com.xiaomi.fitness.eco.device.manager.api.model.DeviceRecordInfo;
import com.xiaomi.fitness.eco.device.manager.api.model.EcoProductListData;
import com.xiaomi.fitness.eco.device.manager.api.model.UpdateDeviceInfoResult;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.wearable.ApplyBindInfo;
import com.xiaomi.wearable.BindResult;
import com.xiaomi.wearable.LocalBindResult;
import com.xiaomi.wearable.UnbindInfo;
import com.xiaomi.wearable.VerifyBindInfo;
import dagger.hilt.android.EntryPointAccessors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001RB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004Jk\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2(\u0010\u0012\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\f0\u0016j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014`\u00132\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0016j\u0002`\u0018¢\u0006\u0002\u0010\u001aJ&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010 J\u000e\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010!J,\u0010\u000b\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010#J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00150$2\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0086@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0086@¢\u0006\u0002\u0010*JA\u0010,\u001a\u00020\f2\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u0016j\b\u0012\u0004\u0012\u00020\u0010`\u00132\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0016j\u0002`\u0018¢\u0006\u0002\u0010/JI\u00100\u001a\u00020\f2\u0006\u00101\u001a\u0002022\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\f0\u0016j\b\u0012\u0004\u0012\u000203`\u00132\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0016j\u0002`\u0018¢\u0006\u0002\u00104JI\u00105\u001a\u00020\f2\u0006\u00106\u001a\u0002072\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f0\u0016j\b\u0012\u0004\u0012\u000208`\u00132\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0016j\u0002`\u0018¢\u0006\u0002\u00109JI\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020<2\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\f0\u0016j\b\u0012\u0004\u0012\u00020=`\u00132\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0016j\u0002`\u0018¢\u0006\u0002\u0010>JI\u0010?\u001a\u00020\f2\u0006\u0010@\u001a\u00020A2\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\f0\u0016j\b\u0012\u0004\u0012\u00020B`\u00132\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0016j\u0002`\u0018¢\u0006\u0002\u0010CJB\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\f0\u00162\u0016\u0010.\u001a\u0012\u0012\b\u0012\u00060Gj\u0002`F\u0012\u0004\u0012\u00020\f0\u0016JJ\u0010H\u001a\u00020\f2\u0006\u0010I\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\f0\u00162\u0016\u0010.\u001a\u0012\u0012\b\u0012\u00060Gj\u0002`F\u0012\u0004\u0012\u00020\f0\u0016J\u0016\u0010K\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010LJ\u001e\u0010D\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010MJG\u0010N\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00102\u0006\u0010O\u001a\u00020\u00102\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\f0\u00162\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0016j\u0002`\u0018¢\u0006\u0002\u0010QR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006S"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceApiService;", "<init>", "()V", "mBindService", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceBindService;", "getMBindService", "()Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceBindService;", "mBindService$delegate", "Lkotlin/Lazy;", "getDevices", "", MediaStoreUtil.MediaInfo.SIZE, "", "next", "", "status", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(ILjava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "recordDevices", "Lcom/xiaomi/fitness/eco/device/manager/api/model/DeviceRecordInfo;", "identifier", "model", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/eco/device/manager/api/model/DeviceListData;", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductByCategory", "Lcom/xiaomi/fitness/eco/device/manager/api/model/EcoProductListData;", "lastModifyTime", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductConfig", "getBindKey", "success", "error", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bindWithSign", "bindSignInfo", "Lcom/xiaomi/fitness/eco/device/manager/api/model/BindSignInfo;", "", "(Lcom/xiaomi/fitness/eco/device/manager/api/model/BindSignInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "applyBind", "bindHelloInfo", "Lcom/xiaomi/fitness/device/eco/manager/api/model/BindHelloInfo;", "Lcom/xiaomi/eco/EcoApplyBindInfo;", "(Lcom/xiaomi/fitness/device/eco/manager/api/model/BindHelloInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "verifyBind", "bindECDHInfo", "Lcom/xiaomi/fitness/eco/device/manager/api/model/BindECDHInfo;", "Lcom/xiaomi/eco/EcoVerifyBindInfo;", "(Lcom/xiaomi/fitness/eco/device/manager/api/model/BindECDHInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "confirmBind", "confirmBindInfo", "Lcom/xiaomi/fitness/eco/device/manager/api/model/ConfirmBindInfo;", "Lcom/xiaomi/eco/EcoBindResult;", "(Lcom/xiaomi/fitness/eco/device/manager/api/model/ConfirmBindInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "unbind", "did", "Lkotlin/Exception;", "Ljava/lang/Exception;", "recordLocalBind", "sn", "Lcom/xiaomi/eco/EcoLocalBindResult;", "revoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDeviceInfo", "phoneId", "Lcom/xiaomi/fitness/eco/device/manager/api/model/UpdateDeviceInfoResult;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcoDeviceRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDeviceRequest.kt\ncom/xiaomi/fitness/eco/device/manager/api/EcoDeviceRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,297:1\n89#2,5:298\n141#2:303\n141#2:307\n141#2:311\n141#2:315\n141#2:319\n89#2,5:323\n89#2,5:328\n89#2,5:333\n89#2,5:338\n89#2,5:343\n89#2,5:348\n89#2,5:353\n141#2:358\n141#2:362\n89#2,5:366\n31#3:304\n28#3,2:305\n31#3:308\n28#3,2:309\n31#3:312\n28#3,2:313\n31#3:316\n28#3,2:317\n31#3:320\n28#3,2:321\n31#3:359\n28#3,2:360\n31#3:363\n28#3,2:364\n*S KotlinDebug\n*F\n+ 1 EcoDeviceRequest.kt\ncom/xiaomi/fitness/eco/device/manager/api/EcoDeviceRequest\n*L\n57#1:298,5\n90#1:303\n106#1:307\n129#1:311\n165#1:315\n181#1:319\n185#1:323,5\n198#1:328,5\n210#1:333,5\n216#1:338,5\n226#1:343,5\n237#1:348,5\n249#1:353,5\n262#1:358\n272#1:362\n291#1:366,5\n90#1:304\n90#1:305,2\n106#1:308\n106#1:309,2\n129#1:312\n129#1:313,2\n165#1:316\n165#1:317,2\n181#1:320\n181#1:321,2\n262#1:359\n262#1:360,2\n272#1:363\n272#1:364,2\n*E\n"})
public final class EcoDeviceRequest extends BaseRequest<EcoDeviceApiService> {

    @NotNull
    private static final String TAG = "EcoDeviceRequest";

    /* JADX INFO: renamed from: mBindService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mBindService = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ps7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoDeviceRequest.mBindService_delegate$lambda$0(this.f30700a);
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$applyBind$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/wearable/ApplyBindInfo;", "it", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$applyBind$1", f = "EcoDeviceRequest.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<EcoDeviceApiService, Continuation<? super BaseResult<ApplyBindInfo>>, Object> {
        final /* synthetic */ BindHelloInfo $bindHelloInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BindHelloInfo bindHelloInfo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bindHelloInfo = bindHelloInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceRequest.this.new AnonymousClass1(this.$bindHelloInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EcoDeviceApiService ecoDeviceApiService, Continuation<? super BaseResult<ApplyBindInfo>> continuation) {
            return ((AnonymousClass1) create(ecoDeviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceBindService mBindService = EcoDeviceRequest.this.getMBindService();
                String json = EcoDeviceRequest.this.getMGson().toJson(this.$bindHelloInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.applyBind(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$bindWithSign$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/eco/device/manager/api/model/BindStatus;", "it", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$bindWithSign$1", f = "EcoDeviceRequest.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22521 extends SuspendLambda implements Function2<EcoDeviceApiService, Continuation<? super BaseResult<BindStatus>>, Object> {
        final /* synthetic */ BindSignInfo $bindSignInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22521(BindSignInfo bindSignInfo, Continuation<? super C22521> continuation) {
            super(2, continuation);
            this.$bindSignInfo = bindSignInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceRequest.this.new C22521(this.$bindSignInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EcoDeviceApiService ecoDeviceApiService, Continuation<? super BaseResult<BindStatus>> continuation) {
            return ((C22521) create(ecoDeviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceBindService mBindService = EcoDeviceRequest.this.getMBindService();
                String currentLocale = LocaleUtil.getCurrentLocale();
                String json = EcoDeviceRequest.this.getMGson().toJson(this.$bindSignInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.bindWithSign(currentLocale, json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$confirmBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/wearable/BindResult;", "it", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$confirmBind$1", f = "EcoDeviceRequest.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22531 extends SuspendLambda implements Function2<EcoDeviceApiService, Continuation<? super BaseResult<BindResult>>, Object> {
        final /* synthetic */ ConfirmBindInfo $confirmBindInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22531(ConfirmBindInfo confirmBindInfo, Continuation<? super C22531> continuation) {
            super(2, continuation);
            this.$confirmBindInfo = confirmBindInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceRequest.this.new C22531(this.$confirmBindInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EcoDeviceApiService ecoDeviceApiService, Continuation<? super BaseResult<BindResult>> continuation) {
            return ((C22531) create(ecoDeviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceBindService mBindService = EcoDeviceRequest.this.getMBindService();
                String currentLocale = LocaleUtil.getCurrentLocale();
                String json = EcoDeviceRequest.this.getMGson().toJson(this.$confirmBindInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.confirmBind(currentLocale, json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$getBindKey$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/device/eco/manager/api/model/BindKey;", "it", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$getBindKey$1", f = "EcoDeviceRequest.kt", i = {}, l = {SportReportBaseParser.ReportType.avgDivingDepth}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22541 extends SuspendLambda implements Function2<EcoDeviceApiService, Continuation<? super BaseResult<BindKey>>, Object> {
        int label;

        public C22541(Continuation<? super C22541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceRequest.this.new C22541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EcoDeviceApiService ecoDeviceApiService, Continuation<? super BaseResult<BindKey>> continuation) {
            return ((C22541) create(ecoDeviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceBindService mBindService = EcoDeviceRequest.this.getMBindService();
                this.label = 1;
                obj = mBindService.getBindKey(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$getDevices$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/eco/device/manager/api/model/DeviceListData;", "it", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$getDevices$1", f = "EcoDeviceRequest.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22551 extends SuspendLambda implements Function2<EcoDeviceApiService, Continuation<? super BaseResult<DeviceListData>>, Object> {
        final /* synthetic */ String $next;
        final /* synthetic */ int $size;
        final /* synthetic */ int $status;
        int label;
        final /* synthetic */ EcoDeviceRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22551(int i, String str, int i2, EcoDeviceRequest ecoDeviceRequest, Continuation<? super C22551> continuation) {
            super(2, continuation);
            this.$size = i;
            this.$next = str;
            this.$status = i2;
            this.this$0 = ecoDeviceRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22551(this.$size, this.$next, this.$status, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EcoDeviceApiService ecoDeviceApiService, Continuation<? super BaseResult<DeviceListData>> continuation) {
            return ((C22551) create(ecoDeviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("page_size", Boxing.boxInt(this.$size));
                String str = this.$next;
                if (str != null && str.length() != 0) {
                    linkedHashMap.put("page_start", this.$next);
                }
                int i2 = this.$status;
                if (i2 > 0) {
                    linkedHashMap.put("status", Boxing.boxInt(i2));
                }
                EcoDeviceApiService ecoDeviceApiServiceAccess$getMService = EcoDeviceRequest.access$getMService(this.this$0);
                String json = this.this$0.getMGson().toJson(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = ecoDeviceApiServiceAccess$getMService.getDevices(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$getDevices$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest", f = "EcoDeviceRequest.kt", i = {}, l = {129}, m = "getDevices", n = {}, s = {})
    public static final class AnonymousClass3 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceRequest.this.getDevices(0, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$getDevices$4, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest", f = "EcoDeviceRequest.kt", i = {0, 0, 0}, l = {139}, m = "getDevices", n = {"this", "result", "status"}, s = {"L$0", "L$1", "I$0"})
    public static final class AnonymousClass4 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceRequest.this.getDevices(0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$getProductByCategory$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest", f = "EcoDeviceRequest.kt", i = {}, l = {165}, m = "getProductByCategory", n = {}, s = {})
    public static final class C22561 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C22561(Continuation<? super C22561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceRequest.this.getProductByCategory(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$getProductConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest", f = "EcoDeviceRequest.kt", i = {}, l = {181}, m = "getProductConfig", n = {}, s = {})
    public static final class C22571 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C22571(Continuation<? super C22571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceRequest.this.getProductConfig(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$recordDevices$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest", f = "EcoDeviceRequest.kt", i = {}, l = {90}, m = "recordDevices", n = {}, s = {})
    public static final class C22581 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C22581(Continuation<? super C22581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceRequest.this.recordDevices(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$recordDevices$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest", f = "EcoDeviceRequest.kt", i = {}, l = {106}, m = "recordDevices", n = {}, s = {})
    public static final class AnonymousClass2 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceRequest.this.recordDevices(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$recordLocalBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/wearable/LocalBindResult;", "it", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$recordLocalBind$1", f = "EcoDeviceRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22591 extends SuspendLambda implements Function2<EcoDeviceApiService, Continuation<? super BaseResult<LocalBindResult>>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $model;
        final /* synthetic */ String $sn;
        int label;
        final /* synthetic */ EcoDeviceRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22591(String str, String str2, String str3, EcoDeviceRequest ecoDeviceRequest, Continuation<? super C22591> continuation) {
            super(2, continuation);
            this.$sn = str;
            this.$did = str2;
            this.$model = str3;
            this.this$0 = ecoDeviceRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22591(this.$sn, this.$did, this.$model, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EcoDeviceApiService ecoDeviceApiService, Continuation<? super BaseResult<LocalBindResult>> continuation) {
            return ((C22591) create(ecoDeviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EcoLocalBindInfo ecoLocalBindInfo = new EcoLocalBindInfo(this.$sn, this.$did, this.$model);
            EcoDeviceBindService mBindService = this.this$0.getMBindService();
            String json = this.this$0.getMGson().toJson(ecoLocalBindInfo);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return mBindService.recordSourceToServer(json);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$revoke$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest", f = "EcoDeviceRequest.kt", i = {}, l = {262}, m = "revoke", n = {}, s = {})
    public static final class C22601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C22601(Continuation<? super C22601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceRequest.this.revoke(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$unbind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/eco/device/manager/api/model/BindStatus;", "it", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$unbind$1", f = "EcoDeviceRequest.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22611 extends SuspendLambda implements Function2<EcoDeviceApiService, Continuation<? super BaseResult<BindStatus>>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $model;
        int label;
        final /* synthetic */ EcoDeviceRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22611(String str, String str2, EcoDeviceRequest ecoDeviceRequest, Continuation<? super C22611> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$model = str2;
            this.this$0 = ecoDeviceRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22611(this.$did, this.$model, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EcoDeviceApiService ecoDeviceApiService, Continuation<? super BaseResult<BindStatus>> continuation) {
            return ((C22611) create(ecoDeviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UnbindInfo unbindInfo = new UnbindInfo(this.$did, this.$model);
                EcoDeviceBindService mBindService = this.this$0.getMBindService();
                String json = this.this$0.getMGson().toJson(unbindInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.unbind(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$unbind$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest", f = "EcoDeviceRequest.kt", i = {}, l = {272}, m = "unbind", n = {}, s = {})
    public static final class C22622 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C22622(Continuation<? super C22622> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceRequest.this.unbind(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$updateDeviceInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/eco/device/manager/api/model/UpdateDeviceInfoResult;", "it", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$updateDeviceInfo$1", f = "EcoDeviceRequest.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22631 extends SuspendLambda implements Function2<EcoDeviceApiService, Continuation<? super BaseResult<UpdateDeviceInfoResult>>, Object> {
        final /* synthetic */ HashMap<String, Object> $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22631(HashMap<String, Object> map, Continuation<? super C22631> continuation) {
            super(2, continuation);
            this.$params = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceRequest.this.new C22631(this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EcoDeviceApiService ecoDeviceApiService, Continuation<? super BaseResult<UpdateDeviceInfoResult>> continuation) {
            return ((C22631) create(ecoDeviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceBindService mBindService = EcoDeviceRequest.this.getMBindService();
                String json = EcoDeviceRequest.this.getMGson().toJson(this.$params);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.updateDeviceInfo(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$verifyBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/wearable/VerifyBindInfo;", "it", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest$verifyBind$1", f = "EcoDeviceRequest.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22641 extends SuspendLambda implements Function2<EcoDeviceApiService, Continuation<? super BaseResult<VerifyBindInfo>>, Object> {
        final /* synthetic */ BindECDHInfo $bindECDHInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22641(BindECDHInfo bindECDHInfo, Continuation<? super C22641> continuation) {
            super(2, continuation);
            this.$bindECDHInfo = bindECDHInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceRequest.this.new C22641(this.$bindECDHInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EcoDeviceApiService ecoDeviceApiService, Continuation<? super BaseResult<VerifyBindInfo>> continuation) {
            return ((C22641) create(ecoDeviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceBindService mBindService = EcoDeviceRequest.this.getMBindService();
                String json = EcoDeviceRequest.this.getMGson().toJson(this.$bindECDHInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.verifyBind(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public static final /* synthetic */ EcoDeviceApiService access$getMService(EcoDeviceRequest ecoDeviceRequest) {
        return ecoDeviceRequest.getMService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindWithSign$lambda$3(Function1 success, Function1 error, BindStatus it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isSuccess()) {
            success.invoke2(Boolean.TRUE);
        } else {
            error.invoke2(new ApiException("", 1));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBindKey$lambda$2(Function1 success, Function1 error, BindKey it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        String bindKey = it.getBindKey();
        if (bindKey == null || bindKey.length() == 0) {
            error.invoke2(ApiException.INSTANCE.getEMPTY());
        } else {
            success.invoke2(bindKey);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getDevices$default(EcoDeviceRequest ecoDeviceRequest, int i, String str, int i2, Function1 function1, Function1 function2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        ecoDeviceRequest.getDevices(i, str2, i2, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDevices$lambda$1(Function1 onSuccess, Function1 onFail, DeviceListData it) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "$onFail");
        Intrinsics.checkNotNullParameter(it, "it");
        List<Device> dataList = it.getDataList();
        List<Device> list = dataList;
        if (list == null || list.isEmpty()) {
            onFail.invoke2(ApiException.INSTANCE.getEMPTY());
        } else {
            onSuccess.invoke2(dataList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcoDeviceBindService getMBindService() {
        return (EcoDeviceBindService) this.mBindService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceBindService mBindService_delegate$lambda$0(EcoDeviceRequest this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (EcoDeviceBindService) this$0.getRepository().getService(EcoDeviceBindService.class);
    }

    public final void applyBind(@NotNull BindHelloInfo bindHelloInfo, @NotNull Function1<? super EcoApplyBindInfo, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(bindHelloInfo, "bindHelloInfo");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(bindHelloInfo, null)).error(error).success(success);
    }

    public final void bindWithSign(@NotNull BindSignInfo bindSignInfo, @NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(bindSignInfo, "bindSignInfo");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C22521(bindSignInfo, null)).error(error).success(new Function1() { // from class: os7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoDeviceRequest.bindWithSign$lambda$3(success, error, (BindStatus) obj);
            }
        });
    }

    public final void confirmBind(@NotNull ConfirmBindInfo confirmBindInfo, @NotNull Function1<? super EcoBindResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(confirmBindInfo, "confirmBindInfo");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C22531(confirmBindInfo, null)).error(error).success(success);
    }

    public final void getBindKey(@NotNull final Function1<? super String, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C22541(null)).error(error).success(new Function1() { // from class: ns7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoDeviceRequest.getBindKey$lambda$2(success, error, (BindKey) obj);
            }
        });
    }

    public final void getDevices(int size, @Nullable String next, int status, @NotNull final Function1<? super List<? extends Device>, Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C22551(size, next, status, this, null)).error(onFail).success(new Function1() { // from class: qs7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoDeviceRequest.getDevices$lambda$1(onSuccess, onFail, (DeviceListData) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProductByCategory(long j, @NotNull Continuation<? super EcoProductListData> continuation) {
        C22561 c22561;
        if (continuation instanceof C22561) {
            c22561 = (C22561) continuation;
            int i = c22561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22561.label = i - Integer.MIN_VALUE;
            } else {
                c22561 = new C22561(continuation);
            }
        } else {
            c22561 = new C22561(continuation);
        }
        Object productConfigByCategory = c22561.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22561.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(productConfigByCategory);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("category", "wearable,other_device,equipment");
            linkedHashMap.put(OneTrack.Param.APP_PLATFORM, Boxing.boxInt(0));
            String versionName = AppUtil.getVersionName();
            if (versionName.length() > 0) {
                linkedHashMap.put("app_version", versionName);
            }
            linkedHashMap.put("last_modify_time", Boxing.boxLong(j));
            EcoDeviceApiService mService = getMService();
            String currentLocale = LocaleUtil.getCurrentLocale();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c22561.label = 1;
            productConfigByCategory = mService.getProductConfigByCategory(currentLocale, json, c22561);
            if (productConfigByCategory == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(productConfigByCategory);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(productConfigByCategory);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProductConfig(long j, @NotNull Continuation<? super EcoProductListData> continuation) {
        C22571 c22571;
        if (continuation instanceof C22571) {
            c22571 = (C22571) continuation;
            int i = c22571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22571.label = i - Integer.MIN_VALUE;
            } else {
                c22571 = new C22571(continuation);
            }
        } else {
            c22571 = new C22571(continuation);
        }
        Object productConfig = c22571.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(productConfig);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(OneTrack.Param.APP_PLATFORM, Boxing.boxInt(0));
            String versionName = AppUtil.getVersionName();
            if (versionName.length() > 0) {
                linkedHashMap.put("app_version", versionName);
            }
            linkedHashMap.put("last_modify_time", Boxing.boxLong(j));
            EcoDeviceApiService mService = getMService();
            String currentLocale = LocaleUtil.getCurrentLocale();
            String json = getMGson().toJson(linkedHashMap);
            c22571.label = 1;
            productConfig = mService.getProductConfig(currentLocale, json, c22571);
            if (productConfig == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(productConfig);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(productConfig);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object recordDevices(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super DeviceRecordInfo> continuation) {
        C22581 c22581;
        if (continuation instanceof C22581) {
            c22581 = (C22581) continuation;
            int i = c22581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22581.label = i - Integer.MIN_VALUE;
            } else {
                c22581 = new C22581(continuation);
            }
        } else {
            c22581 = new C22581(continuation);
        }
        Object objRecordDevices = c22581.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRecordDevices);
            Device device = new Device(null, 0, str2, str3, null, str, null, 0, null, 0, 851, null);
            EcoDeviceApiService mService = getMService();
            String json = getMGson().toJson(device);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c22581.label = 1;
            objRecordDevices = mService.recordDevices(json, c22581);
            if (objRecordDevices == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRecordDevices);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objRecordDevices);
    }

    public final void recordLocalBind(@NotNull String sn, @NotNull String did, @NotNull String model, @NotNull Function1<? super EcoLocalBindResult, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C22591(sn, did, model, this, null)).error(error).success(success);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object revoke(@NotNull String str, @NotNull Continuation<? super Integer> continuation) {
        C22601 c22601;
        if (continuation instanceof C22601) {
            c22601 = (C22601) continuation;
            int i = c22601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22601.label = i - Integer.MIN_VALUE;
            } else {
                c22601 = new C22601(continuation);
            }
        } else {
            c22601 = new C22601(continuation);
        }
        Object objRevokeAuthorization = c22601.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22601.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRevokeAuthorization);
            HashMap map = new HashMap();
            map.put("did", str);
            EcoDeviceBindService mBindService = getMBindService();
            String json = getMGson().toJson(map);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c22601.label = 1;
            objRevokeAuthorization = mBindService.revokeAuthorization(json, c22601);
            if (objRevokeAuthorization == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRevokeAuthorization);
        }
        return Boxing.boxInt(((BindStatus) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objRevokeAuthorization)).getRet());
    }

    public final void unbind(@NotNull String did, @NotNull String model, @NotNull Function1<? super EcoBindResult, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C22611(did, model, this, null)).error(error).success(success);
    }

    public final void updateDeviceInfo(@NotNull String did, @NotNull String phoneId, @NotNull Function1<? super UpdateDeviceInfoResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("phone_id", phoneId);
        map.put("did", did);
        map.put("detail", map2);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C22631(map, null)).error(error).success(success);
    }

    public final void verifyBind(@NotNull BindECDHInfo bindECDHInfo, @NotNull Function1<? super EcoVerifyBindInfo, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(bindECDHInfo, "bindECDHInfo");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C22641(bindECDHInfo, null)).error(error).success(success);
    }

    public static /* synthetic */ Object getDevices$default(EcoDeviceRequest ecoDeviceRequest, int i, String str, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        return ecoDeviceRequest.getDevices(i, str, i2, continuation);
    }

    public static /* synthetic */ Object getDevices$default(EcoDeviceRequest ecoDeviceRequest, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return ecoDeviceRequest.getDevices(i, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getDevices(int i, @Nullable String str, int i2, @NotNull Continuation<? super DeviceListData> continuation) {
        AnonymousClass3 anonymousClass3;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            int i3 = anonymousClass3.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(continuation);
        }
        Object devices = anonymousClass3.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass3.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(devices);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_size", Boxing.boxInt(i));
            if (str != null && str.length() != 0) {
                linkedHashMap.put("page_start", str);
            }
            if (i2 > 0) {
                linkedHashMap.put("status", Boxing.boxInt(i2));
            }
            EcoDeviceApiService mService = getMService();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            anonymousClass3.label = 1;
            devices = mService.getDevices(json, anonymousClass3);
            if (devices == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(devices);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(devices);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object unbind(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Integer> continuation) {
        C22622 c22622;
        if (continuation instanceof C22622) {
            c22622 = (C22622) continuation;
            int i = c22622.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22622.label = i - Integer.MIN_VALUE;
            } else {
                c22622 = new C22622(continuation);
            }
        } else {
            c22622 = new C22622(continuation);
        }
        Object objUnbind = c22622.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22622.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUnbind);
            HashMap map = new HashMap();
            map.put("did", str);
            map.put("model", str2);
            EcoDeviceBindService mBindService = getMBindService();
            String json = getMGson().toJson(map);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c22622.label = 1;
            objUnbind = mBindService.unbind(json, c22622);
            if (objUnbind == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUnbind);
        }
        BindStatus bindStatus = (BindStatus) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUnbind);
        return Boxing.boxInt(bindStatus.isSuccess() ? 0 : bindStatus.getRet());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object recordDevices(@NotNull Continuation<? super DeviceRecordInfo> continuation) {
        AnonymousClass2 anonymousClass2;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            int i = anonymousClass2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(continuation);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(continuation);
        }
        Object objRecordDevices = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRecordDevices);
            String uniqueIdentify = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getUniqueIdentify();
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            String string = SystemProperties.INSTANCE.getString("persist.sys.device_name", MODEL);
            Intrinsics.checkNotNull(string);
            Device device = new Device(null, 0, Product.PHONE_MODEL, string, null, uniqueIdentify, MODEL, 0, null, 0, 787, null);
            EcoDeviceModelExtKt.logi(TAG, "recordPhone identifier " + device.getIdentifier() + "**pid" + Process.myPid());
            EcoDeviceApiService mService = getMService();
            String json = getMGson().toJson(device);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            anonymousClass2.label = 1;
            objRecordDevices = mService.recordDevices(json, anonymousClass2);
            if (objRecordDevices == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRecordDevices);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objRecordDevices);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0056 -> B:19:0x0059). Please report as a decompilation issue!!! */
    @Nullable
    public final Object getDevices(int i, @NotNull Continuation<? super List<Device>> continuation) {
        AnonymousClass4 anonymousClass4;
        List arrayList;
        String str;
        EcoDeviceRequest ecoDeviceRequest;
        Object devices;
        List list;
        if (continuation instanceof AnonymousClass4) {
            anonymousClass4 = (AnonymousClass4) continuation;
            int i2 = anonymousClass4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass4.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass4 = new AnonymousClass4(continuation);
            }
        } else {
            anonymousClass4 = new AnonymousClass4(continuation);
        }
        Object obj = anonymousClass4.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass4.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            arrayList = new ArrayList();
            str = null;
            ecoDeviceRequest = this;
            anonymousClass4.L$0 = ecoDeviceRequest;
            anonymousClass4.L$1 = arrayList;
            anonymousClass4.I$0 = i;
            anonymousClass4.label = 1;
            devices = ecoDeviceRequest.getDevices(50, str, i, anonymousClass4);
            if (devices == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
            obj = devices;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = anonymousClass4.I$0;
            list = (List) anonymousClass4.L$1;
            ecoDeviceRequest = (EcoDeviceRequest) anonymousClass4.L$0;
            ResultKt.throwOnFailure(obj);
        }
        DeviceListData deviceListData = (DeviceListData) obj;
        String next = deviceListData.getNext();
        List<Device> dataList = deviceListData.getDataList();
        if (dataList != null && !dataList.isEmpty()) {
            list.addAll(dataList);
        }
        if (next != null || next.length() == 0) {
            return list;
        }
        arrayList = list;
        str = next;
        anonymousClass4.L$0 = ecoDeviceRequest;
        anonymousClass4.L$1 = arrayList;
        anonymousClass4.I$0 = i;
        anonymousClass4.label = 1;
        devices = ecoDeviceRequest.getDevices(50, str, i, anonymousClass4);
        if (devices == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = arrayList;
        obj = devices;
        DeviceListData deviceListData2 = (DeviceListData) obj;
        String next2 = deviceListData2.getNext();
        List<Device> dataList2 = deviceListData2.getDataList();
        if (dataList2 != null) {
            list.addAll(dataList2);
        }
        if (next2 != null) {
        }
        return list;
    }
}
