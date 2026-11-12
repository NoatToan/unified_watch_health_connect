package com.xiaomi.fitness.electronic.scale.request;

import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.electronic.scale.data.DeleteByDidAndCreateTimeBean;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.request.ScaleRequest;
import com.xiaomi.fitness.electronic.scale.util.UserHelper;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.bu7;
import defpackage.f4b;
import defpackage.qal;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JJ\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rH\u0002J\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\u0012JJ\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJV\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJj\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00182\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJr\u0010&\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010'\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00182\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJB\u0010(\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010'\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJB\u0010)\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJB\u0010*\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJB\u0010+\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJB\u0010,\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJJ\u0010-\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00182\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJH\u0010/\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001c2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJR\u00102\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010'\u001a\u00020\n2\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00162\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJB\u00105\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00182\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJB\u00106\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJ:\u00107\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rJ.\u00108\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010:J6\u0010;\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010<\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010=¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/electronic/scale/request/ScaleService;", "<init>", "()V", "getEcoApiProxy", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "eco_api", "", "params", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ScaleData;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "getEcoApiProxySync", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeightAccount", "uid", "weight", "", "getVirtualAccount", "", "did", "callBack", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ProxyResponse;", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "addVirtualAccount", "name", "icon", "sex", "height", "weightTarget", "", MedicalIdSPContract.PREF_BIRTHDAY, "modifyVirtualAccount", Column.ACCOUNT_ID, "deleteVirtualAccount", "getAccountUserInfo", "addRecord", "addRecordCommon", "deleteRecord", "deleteByDidAndCreateTime", "createTime", "deleteByDidAndCreateTimeParamsList", "delList", "Lcom/xiaomi/fitness/electronic/scale/data/DeleteByDidAndCreateTimeBean;", "getWeightRecords", "page", "pageSize", "uploadScaleIcon", "getClaimedRecords", "getBindKey", "pullRecord", "time", "(JLjava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullRecordCommon", "model", "(JLjava/lang/String;Ljava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScaleRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleRequest.kt\ncom/xiaomi/fitness/electronic/scale/request/ScaleRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,382:1\n110#2,2:383\n141#2:385\n31#3:386\n28#3,2:387\n774#4:389\n865#4,2:390\n1863#4,2:392\n*S KotlinDebug\n*F\n+ 1 ScaleRequest.kt\ncom/xiaomi/fitness/electronic/scale/request/ScaleRequest\n*L\n38#1:383,2\n55#1:385\n55#1:386\n55#1:387,2\n103#1:389\n103#1:390,2\n103#1:392,2\n*E\n"})
public final class ScaleRequest extends BaseRequest<ScaleService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.request.ScaleRequest$getEcoApiProxy$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ScaleData;", "it", "Lcom/xiaomi/fitness/electronic/scale/request/ScaleService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.request.ScaleRequest$getEcoApiProxy$2", f = "ScaleRequest.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<ScaleService, Continuation<? super BaseResult<ScaleData>>, Object> {
        final /* synthetic */ Ref.ObjectRef<JSONObject> $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.ObjectRef<JSONObject> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$data = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$data, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScaleService scaleService, Continuation<? super BaseResult<ScaleData>> continuation) {
            return ((AnonymousClass2) create(scaleService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScaleService scaleService = (ScaleService) this.L$0;
                String string = this.$data.element.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this.label = 1;
                obj = scaleService.getEcoApiProxy(string, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.request.ScaleRequest$getEcoApiProxySync$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.request.ScaleRequest", f = "ScaleRequest.kt", i = {}, l = {55}, m = "getEcoApiProxySync", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScaleRequest.this.getEcoApiProxySync(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addRecord$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: bbl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ScaleRequest.addRecord$lambda$10((ApiException) obj2);
                }
            };
        }
        scaleRequest.addRecord(coroutineScope, str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addRecord$lambda$10(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addRecordCommon$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, String str, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: ebl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ScaleRequest.addRecordCommon$lambda$11((ApiException) obj2);
                }
            };
        }
        scaleRequest.addRecordCommon(coroutineScope, str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addRecordCommon$lambda$11(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addVirtualAccount$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, String str, String str2, int i, int i2, float f, long j, Function1 function1, Function1 function2, int i3, Object obj) throws JSONException {
        CoroutineScope netCoroutineScope;
        if ((i3 & 1) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        scaleRequest.addVirtualAccount(netCoroutineScope, str, str2, i, i2, f, j, function1, (i3 & 256) != 0 ? new Function1() { // from class: fbl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return ScaleRequest.addVirtualAccount$lambda$6((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addVirtualAccount$lambda$6(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deleteByDidAndCreateTime$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, long j, long j2, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        CoroutineScope netCoroutineScope;
        if ((i & 1) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        scaleRequest.deleteByDidAndCreateTime(netCoroutineScope, j, j2, function1, (i & 16) != 0 ? new Function1() { // from class: zal
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return ScaleRequest.deleteByDidAndCreateTime$lambda$13((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteByDidAndCreateTime$lambda$13(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deleteByDidAndCreateTimeParamsList$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, List list, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: dbl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ScaleRequest.deleteByDidAndCreateTimeParamsList$lambda$14((ApiException) obj2);
                }
            };
        }
        scaleRequest.deleteByDidAndCreateTimeParamsList(coroutineScope, list, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteByDidAndCreateTimeParamsList$lambda$14(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deleteRecord$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, String str, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: yal
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ScaleRequest.deleteRecord$lambda$12((ApiException) obj2);
                }
            };
        }
        scaleRequest.deleteRecord(coroutineScope, str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteRecord$lambda$12(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deleteVirtualAccount$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, String str, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: cbl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ScaleRequest.deleteVirtualAccount$lambda$8((ApiException) obj2);
                }
            };
        }
        scaleRequest.deleteVirtualAccount(coroutineScope, str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteVirtualAccount$lambda$8(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAccountUserInfo$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, String str, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: sal
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ScaleRequest.getAccountUserInfo$lambda$9((ApiException) obj2);
                }
            };
        }
        scaleRequest.getAccountUserInfo(coroutineScope, str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAccountUserInfo$lambda$9(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getBindKey$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: tal
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ScaleRequest.getBindKey$lambda$18((ApiException) obj2);
                }
            };
        }
        scaleRequest.getBindKey(coroutineScope, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBindKey$lambda$18(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getClaimedRecords$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, String str, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: ral
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ScaleRequest.getClaimedRecords$lambda$17((ApiException) obj2);
                }
            };
        }
        scaleRequest.getClaimedRecords(coroutineScope, str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getClaimedRecords$lambda$17(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, org.json.JSONObject] */
    private final void getEcoApiProxy(CoroutineScope scope, String eco_api, String params, Function1<? super ScaleData, Unit> success, Function1<? super ApiException, Unit> error) throws JSONException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? jSONObject = new JSONObject();
        objectRef.element = jSONObject;
        jSONObject.put("eco_api", eco_api);
        ((JSONObject) objectRef.element).put("params", params);
        qal.c("getEcoApiProxy() data = " + objectRef.element);
        Intrinsics.checkNotNull(scope);
        new HttpFlow(scope, getMService(), new AnonymousClass2(objectRef, null)).error(error).success(success);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getEcoApiProxy$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, String str, String str2, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 16) != 0) {
            function2 = new Function1() { // from class: xal
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ScaleRequest.getEcoApiProxy$lambda$0((ApiException) obj2);
                }
            };
        }
        scaleRequest.getEcoApiProxy(coroutineScope, str, str2, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getEcoApiProxy$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getEcoApiProxySync(String str, String str2, Continuation<? super ScaleData> continuation) throws JSONException {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object ecoApiProxy = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(ecoApiProxy);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eco_api", str);
            jSONObject.put("params", str2);
            qal.c("getEcoApiProxySync() data = " + jSONObject);
            ScaleService mService = getMService();
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            anonymousClass1.label = 1;
            ecoApiProxy = mService.getEcoApiProxy(string, anonymousClass1);
            if (ecoApiProxy == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(ecoApiProxy);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(ecoApiProxy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getVirtualAccount$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, long j, String str, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        CoroutineScope netCoroutineScope;
        if ((i & 1) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        scaleRequest.getVirtualAccount(netCoroutineScope, j, str, function1, (i & 16) != 0 ? new Function1() { // from class: gbl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return ScaleRequest.getVirtualAccount$lambda$2((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVirtualAccount$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVirtualAccount$lambda$5(String did, Function1 callBack, ScaleData it) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(it, "it");
        JSONObject jSONObject = new JSONObject(it.getResp());
        int iOptInt = jSONObject.optInt("code");
        String strOptString = jSONObject.optString("message");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("result");
        ArrayList arrayList = new ArrayList();
        Logger.i("getVirtualAccount result : " + jSONArrayOptJSONArray, new Object[0]);
        if (jSONArrayOptJSONArray != null) {
            List listB = bu7.b(jSONArrayOptJSONArray.toString(), VirtualAccount.class);
            Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount>");
            arrayList = (ArrayList) listB;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<VirtualAccount> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((VirtualAccount) obj).getType() == 2) {
                arrayList3.add(obj);
            }
        }
        for (VirtualAccount virtualAccount : arrayList3) {
            if (virtualAccount.getSex() == 2) {
                virtualAccount.setSex(0);
            }
            arrayList2.add(virtualAccount);
        }
        qal.c("getVirtualAccount list :  " + f4b.c(arrayList2));
        UserHelper.INSTANCE.saveVirtualUserToSp(did, arrayList2);
        Intrinsics.checkNotNull(strOptString);
        callBack.invoke2(new ProxyResponse(iOptInt, strOptString, arrayList2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getWeightAccount$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, String str, int i, Function1 function1, Function1 function2, int i2, Object obj) throws JSONException {
        CoroutineScope netCoroutineScope;
        if ((i2 & 1) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        scaleRequest.getWeightAccount(netCoroutineScope, str, i, function1, (i2 & 16) != 0 ? new Function1() { // from class: abl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return ScaleRequest.getWeightAccount$lambda$1((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeightAccount$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getWeightRecords$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, String str, int i, int i2, Function1 function1, Function1 function2, int i3, Object obj) {
        CoroutineScope netCoroutineScope;
        if ((i3 & 1) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        scaleRequest.getWeightRecords(netCoroutineScope, str, i, i2, function1, (i3 & 32) != 0 ? new Function1() { // from class: val
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return ScaleRequest.getWeightRecords$lambda$15((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeightRecords$lambda$15(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void modifyVirtualAccount$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, String str, String str2, String str3, int i, int i2, float f, long j, Function1 function1, Function1 function2, int i3, Object obj) {
        CoroutineScope netCoroutineScope;
        if ((i3 & 1) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        scaleRequest.modifyVirtualAccount(netCoroutineScope, str, str2, str3, i, i2, f, j, function1, (i3 & 512) != 0 ? new Function1() { // from class: wal
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return ScaleRequest.modifyVirtualAccount$lambda$7((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit modifyVirtualAccount$lambda$7(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void uploadScaleIcon$default(ScaleRequest scaleRequest, CoroutineScope coroutineScope, long j, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        CoroutineScope netCoroutineScope;
        if ((i & 1) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        scaleRequest.uploadScaleIcon(netCoroutineScope, j, function1, (i & 8) != 0 ? new Function1() { // from class: ual
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return ScaleRequest.uploadScaleIcon$lambda$16((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadScaleIcon$lambda$16(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void addRecord(@NotNull CoroutineScope scope, @NotNull String params, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getEcoApiProxy(scope, "eco/scale/record/add", params, success, error);
    }

    public final void addRecordCommon(@NotNull CoroutineScope scope, @NotNull String params, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getEcoApiProxy(scope, "eco/common/scale/batchAdd", params, success, error);
    }

    public final void addVirtualAccount(@NotNull CoroutineScope scope, @NotNull String name, @NotNull String icon, int sex, int height, float weightTarget, long birth, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", name);
        jSONObject.put("icon", icon);
        if (sex == 0) {
            sex = 2;
        }
        jSONObject.put("sex", sex);
        jSONObject.put("height", height);
        jSONObject.put("weightTarget", Float.valueOf(weightTarget));
        jSONObject.put(MedicalIdSPContract.PREF_BIRTHDAY, birth);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "eco/scale/account/add", string, success, error);
    }

    public final void deleteByDidAndCreateTime(@NotNull CoroutineScope scope, long did, long createTime, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("did", did);
        jSONObject.put("createTime", createTime);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "eco/scale/record/deleteByDidAndCreateTime", string, success, error);
    }

    public final void deleteByDidAndCreateTimeParamsList(@NotNull CoroutineScope scope, @NotNull List<DeleteByDidAndCreateTimeBean> delList, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(delList, "delList");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONArray jSONArray = new JSONArray();
        for (DeleteByDidAndCreateTimeBean deleteByDidAndCreateTimeBean : delList) {
            long createTime = deleteByDidAndCreateTimeBean.getCreateTime();
            String did = deleteByDidAndCreateTimeBean.getDid();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("createTime", createTime);
            jSONObject.put("did", did);
            jSONArray.put(jSONObject);
        }
        qal.c("deleteByDidAndCreateTime json========4 is " + new JSONObject());
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "eco/scale/record/deleteByDidAndCreateTime", string, success, error);
    }

    public final void deleteRecord(@NotNull CoroutineScope scope, @NotNull String did, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("did", did);
        jSONObject.put(Column.ACCOUNT_ID, AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "eco/scale/record/delete", string, success, error);
    }

    public final void deleteVirtualAccount(@NotNull CoroutineScope scope, @NotNull String accountId, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Column.ACCOUNT_ID, accountId);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "eco/scale/account/remove", string, success, error);
    }

    public final void getAccountUserInfo(@NotNull CoroutineScope scope, @NotNull String uid, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", uid);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "account/user/info", string, success, error);
    }

    public final void getBindKey(@NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        String string = new JSONObject().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "/bs/bind/miot/bindKey", string, success, error);
    }

    public final void getClaimedRecords(@NotNull CoroutineScope scope, @NotNull String did, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("did", did);
        jSONObject.put("page", 1);
        jSONObject.put("pageSize", 60);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "eco/scale/record/claimList", string, success, error);
    }

    public final void getVirtualAccount(@NotNull CoroutineScope scope, long uid, @NotNull final String did, @NotNull final Function1<? super ProxyResponse<List<VirtualAccount>>, Unit> callBack, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", uid);
        jSONObject.put("did", did);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "eco/scale/account/list", string, new Function1() { // from class: hbl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScaleRequest.getVirtualAccount$lambda$5(did, callBack, (ScaleData) obj);
            }
        }, error);
    }

    public final void getWeightAccount(@NotNull CoroutineScope scope, @NotNull String uid, int weight, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", uid);
        jSONObject.put("weight", weight);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "scale/account/getAccountByWeight", string, success, error);
    }

    public final void getWeightRecords(@NotNull CoroutineScope scope, @NotNull String accountId, int page, int pageSize, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Column.ACCOUNT_ID, accountId);
        jSONObject.put("page", page);
        jSONObject.put("pageSize", pageSize);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "eco/scale/record/list", string, success, error);
    }

    public final void modifyVirtualAccount(@NotNull CoroutineScope scope, @NotNull String accountId, @NotNull String name, @NotNull String icon, int sex, int height, float weightTarget, long birth, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Column.ACCOUNT_ID, accountId);
        jSONObject.put("name", name);
        jSONObject.put("icon", icon);
        if (sex == 0) {
            sex = 2;
        }
        jSONObject.put("sex", sex);
        jSONObject.put("height", height);
        jSONObject.put("weightTarget", Float.valueOf(weightTarget));
        jSONObject.put(MedicalIdSPContract.PREF_BIRTHDAY, birth);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "eco/scale/account/update", string, success, error);
    }

    @Nullable
    public final Object pullRecord(long j, @NotNull String str, int i, long j2, @NotNull Continuation<? super ScaleData> continuation) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", j);
        jSONObject.put("did", str);
        jSONObject.put("pageSize", i);
        jSONObject.put("createTime", j2);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return getEcoApiProxySync("eco/scale/record/pull", string, continuation);
    }

    @Nullable
    public final Object pullRecordCommon(long j, @NotNull String str, @NotNull String str2, int i, long j2, @NotNull Continuation<? super ScaleData> continuation) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", j);
        jSONObject.put("did", str);
        jSONObject.put("model", str2);
        jSONObject.put("pageSize", i);
        jSONObject.put("createTime", j2);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return getEcoApiProxySync("eco/common/scale/pull", string, continuation);
    }

    public final void uploadScaleIcon(@NotNull CoroutineScope scope, long uid, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", uid);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "upload/scale/icon", string, success, error);
    }
}
