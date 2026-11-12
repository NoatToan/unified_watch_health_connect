package com.xiaomi.fitness.rn;

import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.kdq;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.zk9;
import java.io.Serializable;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J>\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u000b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/rn/RNRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/rn/RNRequest$RNApiService;", "<init>", "()V", "requestApi", "", "url", "", "params", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/rn/RNRequest$CommonData;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "RNApiService", "CommonData", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRNRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNRequest.kt\ncom/xiaomi/fitness/rn/RNRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,44:1\n89#2,5:45\n*S KotlinDebug\n*F\n+ 1 RNRequest.kt\ncom/xiaomi/fitness/rn/RNRequest\n*L\n27#1:45,5\n*E\n"})
public final class RNRequest extends BaseRequest<RNApiService> {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/rn/RNRequest$CommonData;", "Ljava/io/Serializable;", "resp", "", "<init>", "(Ljava/lang/String;)V", "getResp", "()Ljava/lang/String;", "setResp", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommonData implements Serializable {

        @NotNull
        private String resp;

        /* JADX WARN: Multi-variable type inference failed */
        public CommonData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CommonData copy$default(CommonData commonData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = commonData.resp;
            }
            return commonData.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getResp() {
            return this.resp;
        }

        @NotNull
        public final CommonData copy(@NotNull String resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            return new CommonData(resp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CommonData) && Intrinsics.areEqual(this.resp, ((CommonData) other).resp);
        }

        @NotNull
        public final String getResp() {
            return this.resp;
        }

        public int hashCode() {
            return this.resp.hashCode();
        }

        public final void setResp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.resp = str;
        }

        @NotNull
        public String toString() {
            return "CommonData(resp=" + this.resp + ")";
        }

        public CommonData(@NotNull String resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            this.resp = resp;
        }

        public /* synthetic */ CommonData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/rn/RNRequest$RNApiService;", "", "request", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/rn/RNRequest$CommonData;", "url", "", "data", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
    @Secret
    public interface RNApiService {
        @u0a
        @ngh
        @Nullable
        Object request(@kdq @NotNull String str, @NotNull @zk9("data") String str2, @NotNull Continuation<? super BaseResult<CommonData>> continuation);
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.RNRequest$requestApi$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/rn/RNRequest$CommonData;", "it", "Lcom/xiaomi/fitness/rn/RNRequest$RNApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.RNRequest$requestApi$1", f = "RNRequest.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<RNApiService, Continuation<? super BaseResult<CommonData>>, Object> {
        final /* synthetic */ String $params;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$url = str;
            this.$params = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RNRequest.this.new AnonymousClass1(this.$url, this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RNApiService rNApiService, Continuation<? super BaseResult<CommonData>> continuation) {
            return ((AnonymousClass1) create(rNApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RNApiService rNApiServiceAccess$getMService = RNRequest.access$getMService(RNRequest.this);
                String str = this.$url;
                String str2 = this.$params;
                this.label = 1;
                obj = rNApiServiceAccess$getMService.request(str, str2, this);
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

    public static final /* synthetic */ RNApiService access$getMService(RNRequest rNRequest) {
        return rNRequest.getMService();
    }

    public final void requestApi(@NotNull String url, @NotNull String params, @NotNull Function1<? super CommonData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(url, params, null)).error(error).success(success);
    }
}
