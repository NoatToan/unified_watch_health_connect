package com.xiaomi.fitness.sport_eco.request;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpModel;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/request/EnvironmentalRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/sport_eco/request/EnvironmentalService;", "<init>", "()V", "requestEcoApi", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel$RespData;", "eco_api", "", "params", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchEnvironmentalValue", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addEnvironmentalValue", "value", "createTime", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnvironmentalRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnvironmentalRequest.kt\ncom/xiaomi/fitness/sport_eco/request/EnvironmentalRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,41:1\n141#2:42\n31#3:43\n28#3,2:44\n*S KotlinDebug\n*F\n+ 1 EnvironmentalRequest.kt\ncom/xiaomi/fitness/sport_eco/request/EnvironmentalRequest\n*L\n23#1:42\n23#1:43\n23#1:44,2\n*E\n"})
public final class EnvironmentalRequest extends BaseRequest<EnvironmentalService> {

    @NotNull
    public static final String TAG = "EnvironmentalRequest";

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.request.EnvironmentalRequest$requestEcoApi$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.request.EnvironmentalRequest", f = "EnvironmentalRequest.kt", i = {}, l = {23}, m = "requestEcoApi", n = {}, s = {})
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
            return EnvironmentalRequest.this.requestEcoApi(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object requestEcoApi(String str, String str2, Continuation<? super FtpModel.RespData> continuation) throws JSONException {
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
        Object objRequestEcoApi = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRequestEcoApi);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eco_api", str);
            jSONObject.put("params", str2);
            EnvironmentalService mService = getMService();
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            anonymousClass1.label = 1;
            objRequestEcoApi = mService.requestEcoApi(string, anonymousClass1);
            if (objRequestEcoApi == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRequestEcoApi);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objRequestEcoApi);
    }

    @Nullable
    public final Object addEnvironmentalValue(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super FtpModel.RespData> continuation) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        jSONObject.put("value", str);
        jSONObject.put("createTime", str2);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return requestEcoApi("eco/general-equipment/exercise_bike/ep/add", string, continuation);
    }

    @Nullable
    public final Object fetchEnvironmentalValue(@NotNull Continuation<? super FtpModel.RespData> continuation) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return requestEcoApi("eco/general-equipment/exercise_bike/ep/query", string, continuation);
    }
}
