package com.xiaomi.fitness.access.request;

import com.google.gson.Gson;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.access.export.bean.MiSportData;
import com.xiaomi.fitness.access.request.AccessRequest;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import dagger.hilt.android.EntryPointAccessors;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J0\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ:\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ0\u0010\u0012\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ0\u0010\u0014\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ8\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ8\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ8\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ8\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ0\u0010\u001e\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ8\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ0\u0010#\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ0\u0010%\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ8\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ\u000e\u0010(\u001a\u00020)H\u0086@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010.J8\u0010/\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ8\u00101\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ6\u00103\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ.\u00105\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ.\u00107\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ6\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ>\u0010<\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nJ6\u0010>\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/access/request/AccessRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/access/request/AccessService;", "<init>", "()V", "sGson", "Lcom/google/gson/Gson;", "unBindWechat", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/access/request/BoolRetResult;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "bindWechat", "operation", "", "Lcom/xiaomi/fitness/access/request/MiscModel$WechatBindResult;", "getAlipayBindStatus", "Lcom/xiaomi/fitness/access/request/MiscModel$AlipayBindResult;", "unBindAlipay", "getAlipayQueryString", "data", "", "bindAlipay", "getMiSportStatus", "locale", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportStatusList;", "getMiSportDataItem", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportDataList;", "getMiSportLastMigrateStatus", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportStatus;", "postMiSportDataMigrate", "code", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MigrateResponse;", "getStravaBindStatus", "Lcom/xiaomi/fitness/access/request/MiscModel$StravaBindResult;", "unbindStrava", "bindStrava", TSMAuthContants.PARAM_AUTH_CODE, "getProductList", "Lcom/xiaomi/fitness/access/request/MiscModel$ProductResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeviceBindStatus", "Lcom/xiaomi/fitness/access/request/MiscModel$BindStatus;", "did", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeviceTicket", "Lcom/xiaomi/fitness/access/request/MiscModel$DeviceTicket;", "unbindDeviceFromWechat", "Lcom/xiaomi/fitness/access/request/MiscModel$UnbindDeviceFromWechat;", "bindGoogleFit", "Lcom/xiaomi/fitness/access/request/GoogleFitBindResultModel;", "unbindGoogleFit", "Lcom/xiaomi/fitness/access/request/GoogleFitUnbindResultModel;", "getGoogleFitBindStatus", "Lcom/xiaomi/fitness/access/request/GetGoogleFitBindStatusResultModel;", "getThirdPartyBindStatus", "thirdParty", "Lcom/xiaomi/fitness/access/request/ThirdPartyBindStatusResultModel;", "bindThirdParty", "Lcom/xiaomi/fitness/access/request/ThirdPartyBindResultModel;", "unbindThirdParty", "Lcom/xiaomi/fitness/access/request/ThirdPartyUnbindResultModel;", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccessRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessRequest.kt\ncom/xiaomi/fitness/access/request/AccessRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,278:1\n104#2,8:279\n104#2,8:287\n104#2,8:295\n104#2,8:303\n104#2,8:311\n104#2,8:319\n104#2,8:327\n104#2,8:335\n104#2,8:343\n104#2,8:351\n104#2,8:359\n104#2,8:367\n104#2,8:375\n141#2:383\n141#2:387\n104#2,8:391\n104#2,8:399\n104#2,8:407\n104#2,8:415\n104#2,8:423\n104#2,8:431\n104#2,8:439\n104#2,8:447\n31#3:384\n28#3,2:385\n31#3:388\n28#3,2:389\n*S KotlinDebug\n*F\n+ 1 AccessRequest.kt\ncom/xiaomi/fitness/access/request/AccessRequest\n*L\n33#1:279,8\n47#1:287,8\n56#1:295,8\n65#1:303,8\n75#1:311,8\n85#1:319,8\n95#1:327,8\n107#1:335,8\n118#1:343,8\n131#1:351,8\n141#1:359,8\n150#1:367,8\n160#1:375,8\n172#1:383\n180#1:387\n191#1:391,8\n205#1:399,8\n216#1:407,8\n227#1:415,8\n236#1:423,8\n248#1:431,8\n265#1:439,8\n276#1:447,8\n172#1:384\n172#1:385,2\n180#1:388\n180#1:389,2\n*E\n"})
public final class AccessRequest extends BaseRequest<AccessService> {

    @NotNull
    public static final String KEY_OPERATION = "operation";

    @NotNull
    public static final String KEY_VERSION = "version";
    public static final int NEW_VERSION = 1;
    public static final int OLD_VERSION = 0;
    public static final int OPERATION_BIND = 1;
    public static final int OPERATION_QUERY = 0;
    public static final int OPERATION_REVERT = 2;

    @NotNull
    private final Gson sGson = new Gson();

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$bindAlipay$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/MiscModel$AlipayBindResult;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$bindAlipay$2", f = "AccessRequest.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiscModel.AlipayBindResult>>, Object> {
        final /* synthetic */ String $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$data, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiscModel.AlipayBindResult>> continuation) {
            return ((AnonymousClass2) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String str = this.$data;
                this.label = 1;
                obj = accessService.bindAlipay(str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$bindGoogleFit$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/GoogleFitBindResultModel;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$bindGoogleFit$1", f = "AccessRequest.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<GoogleFitBindResultModel>>, Object> {
        final /* synthetic */ String $authCode;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AccessRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, AccessRequest accessRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$authCode = str;
            this.this$0 = accessRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$authCode, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<GoogleFitBindResultModel>> continuation) {
            return ((AnonymousClass1) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String json = this.this$0.sGson.toJson(new GoogleFitBindRequestParamModel(this.$authCode));
                Intrinsics.checkNotNull(json);
                this.label = 1;
                obj = accessService.bindGoogleFit(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$bindStrava$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/MiscModel$StravaBindResult;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$bindStrava$2", f = "AccessRequest.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17332 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiscModel.StravaBindResult>>, Object> {
        final /* synthetic */ String $authCode;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AccessRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17332(String str, AccessRequest accessRequest, Continuation<? super C17332> continuation) {
            super(2, continuation);
            this.$authCode = str;
            this.this$0 = accessRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17332 c17332 = new C17332(this.$authCode, this.this$0, continuation);
            c17332.L$0 = obj;
            return c17332;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiscModel.StravaBindResult>> continuation) {
            return ((C17332) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String json = this.this$0.sGson.toJson(MiscModel.StravaRequest.create(this.$authCode));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = accessService.bindStrava(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$bindThirdParty$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/ThirdPartyBindResultModel;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$bindThirdParty$1", f = "AccessRequest.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17341 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<ThirdPartyBindResultModel>>, Object> {
        final /* synthetic */ String $paramStr;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17341(String str, Continuation<? super C17341> continuation) {
            super(2, continuation);
            this.$paramStr = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17341 c17341 = new C17341(this.$paramStr, continuation);
            c17341.L$0 = obj;
            return c17341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<ThirdPartyBindResultModel>> continuation) {
            return ((C17341) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String str = this.$paramStr;
                Intrinsics.checkNotNull(str);
                this.label = 1;
                obj = accessService.bindThirdParty(str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$bindWechat$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/MiscModel$WechatBindResult;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$bindWechat$2", f = "AccessRequest.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17352 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiscModel.WechatBindResult>>, Object> {
        final /* synthetic */ String $paramStr;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17352(String str, Continuation<? super C17352> continuation) {
            super(2, continuation);
            this.$paramStr = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17352 c17352 = new C17352(this.$paramStr, continuation);
            c17352.L$0 = obj;
            return c17352;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiscModel.WechatBindResult>> continuation) {
            return ((C17352) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String str = this.$paramStr;
                Intrinsics.checkNotNull(str);
                this.label = 1;
                obj = accessService.bindWechat(str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$getAlipayBindStatus$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/MiscModel$AlipayBindResult;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$getAlipayBindStatus$2", f = "AccessRequest.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17362 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiscModel.AlipayBindResult>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C17362(Continuation<? super C17362> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17362 c17362 = new C17362(continuation);
            c17362.L$0 = obj;
            return c17362;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiscModel.AlipayBindResult>> continuation) {
            return ((C17362) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                this.label = 1;
                obj = accessService.getAlipayBindStatus(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$getAlipayQueryString$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/MiscModel$AlipayBindResult;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$getAlipayQueryString$2", f = "AccessRequest.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17372 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiscModel.AlipayBindResult>>, Object> {
        final /* synthetic */ String $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17372(String str, Continuation<? super C17372> continuation) {
            super(2, continuation);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17372 c17372 = new C17372(this.$data, continuation);
            c17372.L$0 = obj;
            return c17372;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiscModel.AlipayBindResult>> continuation) {
            return ((C17372) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String str = this.$data;
                this.label = 1;
                obj = accessService.getAlipayQueryString(str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$getDeviceBindStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest", f = "AccessRequest.kt", i = {}, l = {180}, m = "getDeviceBindStatus", n = {}, s = {})
    public static final class C17381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17381(Continuation<? super C17381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccessRequest.this.getDeviceBindStatus(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$getDeviceTicket$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/MiscModel$DeviceTicket;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$getDeviceTicket$2", f = "AccessRequest.kt", i = {}, l = {SportReportBaseParser.ReportType.divingOTU}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17392 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiscModel.DeviceTicket>>, Object> {
        final /* synthetic */ String $did;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AccessRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17392(String str, AccessRequest accessRequest, Continuation<? super C17392> continuation) {
            super(2, continuation);
            this.$did = str;
            this.this$0 = accessRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17392 c17392 = new C17392(this.$did, this.this$0, continuation);
            c17392.L$0 = obj;
            return c17392;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiscModel.DeviceTicket>> continuation) {
            return ((C17392) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String json = this.this$0.sGson.toJson(new MiSportData.DeviceDid(this.$did));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = accessService.getDeviceTicket(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$getGoogleFitBindStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/GetGoogleFitBindStatusResultModel;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$getGoogleFitBindStatus$1", f = "AccessRequest.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17401 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<GetGoogleFitBindStatusResultModel>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C17401(Continuation<? super C17401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17401 c17401 = new C17401(continuation);
            c17401.L$0 = obj;
            return c17401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<GetGoogleFitBindStatusResultModel>> continuation) {
            return ((C17401) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                this.label = 1;
                obj = accessService.getGoogleFitBindStatus(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$getMiSportDataItem$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportDataList;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$getMiSportDataItem$2", f = "AccessRequest.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17412 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiSportData.MiSportDataList>>, Object> {
        final /* synthetic */ String $locale;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AccessRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17412(String str, AccessRequest accessRequest, Continuation<? super C17412> continuation) {
            super(2, continuation);
            this.$locale = str;
            this.this$0 = accessRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17412 c17412 = new C17412(this.$locale, this.this$0, continuation);
            c17412.L$0 = obj;
            return c17412;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiSportData.MiSportDataList>> continuation) {
            return ((C17412) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String json = this.this$0.sGson.toJson(new MiSportData.AuthListParams(this.$locale));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = accessService.getMiSportDataItem(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$getMiSportLastMigrateStatus$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportStatus;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$getMiSportLastMigrateStatus$2", f = "AccessRequest.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17422 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiSportData.MiSportStatus>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C17422(Continuation<? super C17422> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17422 c17422 = new C17422(continuation);
            c17422.L$0 = obj;
            return c17422;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiSportData.MiSportStatus>> continuation) {
            return ((C17422) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                this.label = 1;
                obj = accessService.getMiSportLastMigrateStatus(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$getMiSportStatus$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportStatusList;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$getMiSportStatus$2", f = "AccessRequest.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17432 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiSportData.MiSportStatusList>>, Object> {
        final /* synthetic */ String $locale;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AccessRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17432(String str, AccessRequest accessRequest, Continuation<? super C17432> continuation) {
            super(2, continuation);
            this.$locale = str;
            this.this$0 = accessRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17432 c17432 = new C17432(this.$locale, this.this$0, continuation);
            c17432.L$0 = obj;
            return c17432;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiSportData.MiSportStatusList>> continuation) {
            return ((C17432) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String json = this.this$0.sGson.toJson(new MiSportData.AuthListParams(this.$locale));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = accessService.getMiSportStatus(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$getProductList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest", f = "AccessRequest.kt", i = {}, l = {172}, m = "getProductList", n = {}, s = {})
    public static final class C17441 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17441(Continuation<? super C17441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccessRequest.this.getProductList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$getStravaBindStatus$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/MiscModel$StravaBindResult;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$getStravaBindStatus$2", f = "AccessRequest.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17452 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiscModel.StravaBindResult>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C17452(Continuation<? super C17452> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17452 c17452 = new C17452(continuation);
            c17452.L$0 = obj;
            return c17452;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiscModel.StravaBindResult>> continuation) {
            return ((C17452) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                this.label = 1;
                obj = accessService.getStravaBindStatus(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$getThirdPartyBindStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/ThirdPartyBindStatusResultModel;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$getThirdPartyBindStatus$1", f = "AccessRequest.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17461 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<ThirdPartyBindStatusResultModel>>, Object> {
        final /* synthetic */ String $paramStr;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17461(String str, Continuation<? super C17461> continuation) {
            super(2, continuation);
            this.$paramStr = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17461 c17461 = new C17461(this.$paramStr, continuation);
            c17461.L$0 = obj;
            return c17461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<ThirdPartyBindStatusResultModel>> continuation) {
            return ((C17461) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String str = this.$paramStr;
                Intrinsics.checkNotNull(str);
                this.label = 1;
                obj = accessService.getThirdPartyBindStatus(str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$postMiSportDataMigrate$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MigrateResponse;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$postMiSportDataMigrate$2", f = "AccessRequest.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17472 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiSportData.MigrateResponse>>, Object> {
        final /* synthetic */ String $code;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AccessRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17472(String str, AccessRequest accessRequest, Continuation<? super C17472> continuation) {
            super(2, continuation);
            this.$code = str;
            this.this$0 = accessRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17472 c17472 = new C17472(this.$code, this.this$0, continuation);
            c17472.L$0 = obj;
            return c17472;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiSportData.MigrateResponse>> continuation) {
            return ((C17472) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String json = this.this$0.sGson.toJson(new MiSportData.DataMigrateParams(this.$code));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = accessService.postMiSportDataMigrate(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$unBindAlipay$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/MiscModel$AlipayBindResult;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$unBindAlipay$2", f = "AccessRequest.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17482 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiscModel.AlipayBindResult>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C17482(Continuation<? super C17482> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17482 c17482 = new C17482(continuation);
            c17482.L$0 = obj;
            return c17482;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiscModel.AlipayBindResult>> continuation) {
            return ((C17482) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                this.label = 1;
                obj = accessService.unBindAlipay(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$unBindWechat$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/BoolRetResult;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$unBindWechat$2", f = "AccessRequest.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17492 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<BoolRetResult>>, Object> {
        final /* synthetic */ String $paramStr;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17492(String str, Continuation<? super C17492> continuation) {
            super(2, continuation);
            this.$paramStr = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17492 c17492 = new C17492(this.$paramStr, continuation);
            c17492.L$0 = obj;
            return c17492;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<BoolRetResult>> continuation) {
            return ((C17492) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String str = this.$paramStr;
                Intrinsics.checkNotNull(str);
                this.label = 1;
                obj = accessService.unBindWechat(str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$unbindDeviceFromWechat$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/MiscModel$UnbindDeviceFromWechat;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$unbindDeviceFromWechat$2", f = "AccessRequest.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17502 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiscModel.UnbindDeviceFromWechat>>, Object> {
        final /* synthetic */ String $did;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AccessRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17502(String str, AccessRequest accessRequest, Continuation<? super C17502> continuation) {
            super(2, continuation);
            this.$did = str;
            this.this$0 = accessRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17502 c17502 = new C17502(this.$did, this.this$0, continuation);
            c17502.L$0 = obj;
            return c17502;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiscModel.UnbindDeviceFromWechat>> continuation) {
            return ((C17502) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String json = this.this$0.sGson.toJson(new MiSportData.DeviceDid(this.$did));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = accessService.unbindDeviceFromWechat(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$unbindGoogleFit$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/GoogleFitUnbindResultModel;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$unbindGoogleFit$1", f = "AccessRequest.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17511 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<GoogleFitUnbindResultModel>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C17511(Continuation<? super C17511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17511 c17511 = new C17511(continuation);
            c17511.L$0 = obj;
            return c17511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<GoogleFitUnbindResultModel>> continuation) {
            return ((C17511) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                this.label = 1;
                obj = accessService.unbindGoogleFit(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$unbindStrava$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/MiscModel$StravaBindResult;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$unbindStrava$2", f = "AccessRequest.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17522 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<MiscModel.StravaBindResult>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C17522(Continuation<? super C17522> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17522 c17522 = new C17522(continuation);
            c17522.L$0 = obj;
            return c17522;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<MiscModel.StravaBindResult>> continuation) {
            return ((C17522) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                this.label = 1;
                obj = accessService.unbindStrava(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.request.AccessRequest$unbindThirdParty$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/ThirdPartyUnbindResultModel;", "it", "Lcom/xiaomi/fitness/access/request/AccessService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.request.AccessRequest$unbindThirdParty$1", f = "AccessRequest.kt", i = {}, l = {276}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17531 extends SuspendLambda implements Function2<AccessService, Continuation<? super BaseResult<ThirdPartyUnbindResultModel>>, Object> {
        final /* synthetic */ String $paramStr;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17531(String str, Continuation<? super C17531> continuation) {
            super(2, continuation);
            this.$paramStr = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17531 c17531 = new C17531(this.$paramStr, continuation);
            c17531.L$0 = obj;
            return c17531;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccessService accessService, Continuation<? super BaseResult<ThirdPartyUnbindResultModel>> continuation) {
            return ((C17531) create(accessService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccessService accessService = (AccessService) this.L$0;
                String str = this.$paramStr;
                Intrinsics.checkNotNull(str);
                this.label = 1;
                obj = accessService.unbindThirdParty(str, this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindAlipay$default(AccessRequest accessRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: w50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.bindAlipay$lambda$5((ApiException) obj2);
                }
            };
        }
        accessRequest.bindAlipay(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAlipay$lambda$5(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindStrava$default(AccessRequest accessRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: k50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.bindStrava$lambda$12((ApiException) obj2);
                }
            };
        }
        accessRequest.bindStrava(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStrava$lambda$12(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindWechat$default(AccessRequest accessRequest, int i, Function1 function1, Function1 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            function2 = new Function1() { // from class: i50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.bindWechat$lambda$1((ApiException) obj2);
                }
            };
        }
        accessRequest.bindWechat(i, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindWechat$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAlipayBindStatus$default(AccessRequest accessRequest, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: r50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.getAlipayBindStatus$lambda$2((ApiException) obj2);
                }
            };
        }
        accessRequest.getAlipayBindStatus(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAlipayBindStatus$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAlipayQueryString$default(AccessRequest accessRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: s50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.getAlipayQueryString$lambda$4((ApiException) obj2);
                }
            };
        }
        accessRequest.getAlipayQueryString(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAlipayQueryString$lambda$4(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getDeviceTicket$default(AccessRequest accessRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: m50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.getDeviceTicket$lambda$13((ApiException) obj2);
                }
            };
        }
        accessRequest.getDeviceTicket(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDeviceTicket$lambda$13(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getMiSportDataItem$default(AccessRequest accessRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: t50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.getMiSportDataItem$lambda$7((ApiException) obj2);
                }
            };
        }
        accessRequest.getMiSportDataItem(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMiSportDataItem$lambda$7(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getMiSportLastMigrateStatus$default(AccessRequest accessRequest, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: v50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.getMiSportLastMigrateStatus$lambda$8((ApiException) obj2);
                }
            };
        }
        accessRequest.getMiSportLastMigrateStatus(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMiSportLastMigrateStatus$lambda$8(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getMiSportStatus$default(AccessRequest accessRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: u50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.getMiSportStatus$lambda$6((ApiException) obj2);
                }
            };
        }
        accessRequest.getMiSportStatus(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMiSportStatus$lambda$6(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getStravaBindStatus$default(AccessRequest accessRequest, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: j50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.getStravaBindStatus$lambda$10((ApiException) obj2);
                }
            };
        }
        accessRequest.getStravaBindStatus(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStravaBindStatus$lambda$10(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postMiSportDataMigrate$default(AccessRequest accessRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: q50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.postMiSportDataMigrate$lambda$9((ApiException) obj2);
                }
            };
        }
        accessRequest.postMiSportDataMigrate(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postMiSportDataMigrate$lambda$9(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void unBindAlipay$default(AccessRequest accessRequest, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: n50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.unBindAlipay$lambda$3((ApiException) obj2);
                }
            };
        }
        accessRequest.unBindAlipay(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unBindAlipay$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void unBindWechat$default(AccessRequest accessRequest, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: l50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.unBindWechat$lambda$0((ApiException) obj2);
                }
            };
        }
        accessRequest.unBindWechat(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unBindWechat$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void unbindDeviceFromWechat$default(AccessRequest accessRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: p50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.unbindDeviceFromWechat$lambda$14((ApiException) obj2);
                }
            };
        }
        accessRequest.unbindDeviceFromWechat(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindDeviceFromWechat$lambda$14(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void unbindStrava$default(AccessRequest accessRequest, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: o50
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccessRequest.unbindStrava$lambda$11((ApiException) obj2);
                }
            };
        }
        accessRequest.unbindStrava(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindStrava$lambda$11(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void bindAlipay(@NotNull String data, @NotNull Function1<? super MiscModel.AlipayBindResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(data, null)).error(error).success(success);
    }

    public final void bindGoogleFit(@NotNull String authCode, @NotNull Function1<? super GoogleFitBindResultModel, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(authCode, this, null)).error(error).success(success);
    }

    public final void bindStrava(@NotNull String authCode, @NotNull Function1<? super MiscModel.StravaBindResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17332(authCode, this, null)).error(error).success(success);
    }

    public final void bindThirdParty(@NotNull String thirdParty, @NotNull String code, @NotNull Function1<? super ThirdPartyBindResultModel, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ThirdPartAccessConstants.PARAM_THIRD_PARTY, thirdParty);
        linkedHashMap.put(ThirdPartAccessConstants.PARAM_AUTH_CODE, code);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17341(getMGson().toJson(linkedHashMap), null)).error(error).success(success);
    }

    public final void bindWechat(int operation, @NotNull Function1<? super MiscModel.WechatBindResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("version", 2);
        linkedHashMap.put("operation", Integer.valueOf(operation));
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17352(getMGson().toJson(linkedHashMap), null)).error(error).success(success);
    }

    public final void getAlipayBindStatus(@NotNull Function1<? super MiscModel.AlipayBindResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17362(null)).error(error).success(success);
    }

    public final void getAlipayQueryString(@NotNull String data, @NotNull Function1<? super MiscModel.AlipayBindResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17372(data, null)).error(error).success(success);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getDeviceBindStatus(@NotNull String str, @NotNull Continuation<? super MiscModel.BindStatus> continuation) {
        C17381 c17381;
        if (continuation instanceof C17381) {
            c17381 = (C17381) continuation;
            int i = c17381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17381.label = i - Integer.MIN_VALUE;
            } else {
                c17381 = new C17381(continuation);
            }
        } else {
            c17381 = new C17381(continuation);
        }
        Object deviceBindStatus = c17381.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(deviceBindStatus);
            MiSportData.DeviceDid deviceDid = new MiSportData.DeviceDid(str);
            AccessService mService = getMService();
            String json = this.sGson.toJson(deviceDid);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c17381.label = 1;
            deviceBindStatus = mService.getDeviceBindStatus(json, c17381);
            if (deviceBindStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(deviceBindStatus);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(deviceBindStatus);
    }

    public final void getDeviceTicket(@NotNull String did, @NotNull Function1<? super MiscModel.DeviceTicket, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17392(did, this, null)).error(error).success(success);
    }

    public final void getGoogleFitBindStatus(@NotNull Function1<? super GetGoogleFitBindStatusResultModel, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17401(null)).error(error).success(success);
    }

    public final void getMiSportDataItem(@NotNull String locale, @NotNull Function1<? super MiSportData.MiSportDataList, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17412(locale, this, null)).error(error).success(success);
    }

    public final void getMiSportLastMigrateStatus(@NotNull Function1<? super MiSportData.MiSportStatus, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            error.invoke2(new ApiException("not login", 0, 2, null));
            return;
        }
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17422(null)).error(error).success(success);
    }

    public final void getMiSportStatus(@NotNull String locale, @NotNull Function1<? super MiSportData.MiSportStatusList, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17432(locale, this, null)).error(error).success(success);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProductList(@NotNull Continuation<? super MiscModel.ProductResult> continuation) {
        C17441 c17441;
        if (continuation instanceof C17441) {
            c17441 = (C17441) continuation;
            int i = c17441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17441.label = i - Integer.MIN_VALUE;
            } else {
                c17441 = new C17441(continuation);
            }
        } else {
            c17441 = new C17441(continuation);
        }
        Object productList = c17441.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17441.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(productList);
            AccessService mService = getMService();
            c17441.label = 1;
            productList = mService.getProductList(c17441);
            if (productList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(productList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(productList);
    }

    public final void getStravaBindStatus(@NotNull Function1<? super MiscModel.StravaBindResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17452(null)).error(error).success(success);
    }

    public final void getThirdPartyBindStatus(@NotNull String thirdParty, @NotNull Function1<? super ThirdPartyBindStatusResultModel, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ThirdPartAccessConstants.PARAM_THIRD_PARTY, thirdParty);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17461(getMGson().toJson(linkedHashMap), null)).error(error).success(success);
    }

    public final void postMiSportDataMigrate(@NotNull String code, @NotNull Function1<? super MiSportData.MigrateResponse, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17472(code, this, null)).error(error).success(success);
    }

    public final void unBindAlipay(@NotNull Function1<? super MiscModel.AlipayBindResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17482(null)).error(error).success(success);
    }

    public final void unBindWechat(@NotNull Function1<? super BoolRetResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("version", 2);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17492(getMGson().toJson(linkedHashMap), null)).error(error).success(success);
    }

    public final void unbindDeviceFromWechat(@NotNull String did, @NotNull Function1<? super MiscModel.UnbindDeviceFromWechat, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17502(did, this, null)).error(error).success(success);
    }

    public final void unbindGoogleFit(@NotNull Function1<? super GoogleFitUnbindResultModel, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17511(null)).error(error).success(success);
    }

    public final void unbindStrava(@NotNull Function1<? super MiscModel.StravaBindResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17522(null)).error(error).success(success);
    }

    public final void unbindThirdParty(@NotNull String thirdParty, @NotNull Function1<? super ThirdPartyUnbindResultModel, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ThirdPartAccessConstants.PARAM_THIRD_PARTY, thirdParty);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C17531(getMGson().toJson(linkedHashMap), null)).error(error).success(success);
    }
}
