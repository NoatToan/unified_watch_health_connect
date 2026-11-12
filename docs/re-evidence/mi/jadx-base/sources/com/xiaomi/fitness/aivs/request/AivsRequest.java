package com.xiaomi.fitness.aivs.request;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.aivs.request.AivsRequest;
import com.xiaomi.fitness.aivs.request.model.UserCredentialScopeResp;
import com.xiaomi.fitness.aivs.request.model.UserCredentialsIssuedTokenResp;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.passport.ui.internal.SNSAuthProvider;
import defpackage.gv5;
import defpackage.hlo;
import defpackage.q34;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004Ja\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u000f`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012¢\u0006\u0002\u0010\u0014Jk\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u000f`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0002¢\u0006\u0002\u0010\u0017Ja\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u000f`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012¢\u0006\u0002\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/aivs/request/AivsRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/aivs/request/AivsApiService;", "<init>", "()V", "getUserCredentialsToken", "", "clientId", "", "clientSecret", "", "userId", "deviceId", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/aivs/request/model/UserCredentialsIssuedTokenResp;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(JLjava/lang/String;JLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getUserCredentialIssuedToken", "code", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "refreshUserCredentialsToken", "redirectUri", "refreshToken", "sucess", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAivsRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AivsRequest.kt\ncom/xiaomi/fitness/aivs/request/AivsRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,113:1\n89#2,5:114\n89#2,5:119\n89#2,5:124\n*S KotlinDebug\n*F\n+ 1 AivsRequest.kt\ncom/xiaomi/fitness/aivs/request/AivsRequest\n*L\n32#1:114,5\n79#1:119,5\n100#1:124,5\n*E\n"})
public final class AivsRequest extends BaseRequest<AivsApiService> {

    @NotNull
    public static final String AIVS_AUTH_SID = "oauth2.0";

    /* JADX INFO: renamed from: com.xiaomi.fitness.aivs.request.AivsRequest$getUserCredentialIssuedToken$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/aivs/request/model/UserCredentialsIssuedTokenResp;", "aivsApiService", "Lcom/xiaomi/fitness/aivs/request/AivsApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.aivs.request.AivsRequest$getUserCredentialIssuedToken$1", f = "AivsRequest.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AivsApiService, Continuation<? super UserCredentialsIssuedTokenResp>, Object> {
        final /* synthetic */ long $clientId;
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ String $code;
        final /* synthetic */ String $deviceId;
        final /* synthetic */ long $userId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, long j, String str2, String str3, long j2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$deviceId = str;
            this.$clientId = j;
            this.$clientSecret = str2;
            this.$code = str3;
            this.$userId = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$deviceId, this.$clientId, this.$clientSecret, this.$code, this.$userId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AivsApiService aivsApiService, Continuation<? super UserCredentialsIssuedTokenResp> continuation) {
            return ((AnonymousClass1) create(aivsApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AivsApiService aivsApiService = (AivsApiService) this.L$0;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(PluginDeviceInfo.FICONOFF, this.$deviceId);
                HashMap map = new HashMap();
                map.put("grant_type", "password");
                map.put("client_id", Boxing.boxLong(this.$clientId));
                map.put("client_secret", this.$clientSecret);
                map.put("sid", "oauth2.0");
                map.put("code", this.$code);
                map.put("user_id", Boxing.boxLong(this.$userId));
                map.put("pt", Boxing.boxInt(1));
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                byte[] bytes = string.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                map.put("scope_data", q34.b(bytes));
                this.label = 1;
                obj = aivsApiService.userCredentialsIssuedToken(map, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.aivs.request.AivsRequest$getUserCredentialsToken$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/aivs/request/model/UserCredentialScopeResp;", "aivsService", "Lcom/xiaomi/fitness/aivs/request/AivsApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.aivs.request.AivsRequest$getUserCredentialsToken$1", f = "AivsRequest.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18231 extends SuspendLambda implements Function2<AivsApiService, Continuation<? super UserCredentialScopeResp>, Object> {
        final /* synthetic */ long $clientId;
        final /* synthetic */ String $deviceId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18231(String str, long j, Continuation<? super C18231> continuation) {
            super(2, continuation);
            this.$deviceId = str;
            this.$clientId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C18231 c18231 = new C18231(this.$deviceId, this.$clientId, continuation);
            c18231.L$0 = obj;
            return c18231;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AivsApiService aivsApiService, Continuation<? super UserCredentialScopeResp> continuation) {
            return ((C18231) create(aivsApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AivsApiService aivsApiService = (AivsApiService) this.L$0;
                HashMap map = new HashMap();
                map.put(PluginDeviceInfo.FICONOFF, this.$deviceId);
                ArrayList<String> arrayList = new ArrayList(map.keySet());
                Collections.sort(arrayList);
                StringBuilder sb = new StringBuilder();
                for (String str : arrayList) {
                    if (sb.length() > 0) {
                        sb.append(gv5.CONNECT_STR);
                    }
                    sb.append(str);
                    sb.append("=");
                    sb.append((String) map.get(str));
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                byte[] bytes = string.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                String strA = hlo.a(q34.c(bytes));
                Intrinsics.checkNotNullExpressionValue(strA, "getHexString(...)");
                HashMap map2 = new HashMap();
                map2.put("client_id", Boxing.boxLong(this.$clientId));
                map2.put("sid", "oauth2.0");
                map2.put("device_id", this.$deviceId);
                map2.put("state", strA);
                map2.put("pt", Boxing.boxInt(1));
                this.label = 1;
                obj = aivsApiService.userCredentialScope(map2, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.aivs.request.AivsRequest$refreshUserCredentialsToken$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/aivs/request/model/UserCredentialsIssuedTokenResp;", "aivsApiService", "Lcom/xiaomi/fitness/aivs/request/AivsApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.aivs.request.AivsRequest$refreshUserCredentialsToken$1", f = "AivsRequest.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18241 extends SuspendLambda implements Function2<AivsApiService, Continuation<? super UserCredentialsIssuedTokenResp>, Object> {
        final /* synthetic */ long $clientId;
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ String $redirectUri;
        final /* synthetic */ String $refreshToken;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18241(long j, String str, String str2, String str3, Continuation<? super C18241> continuation) {
            super(2, continuation);
            this.$clientId = j;
            this.$redirectUri = str;
            this.$clientSecret = str2;
            this.$refreshToken = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C18241 c18241 = new C18241(this.$clientId, this.$redirectUri, this.$clientSecret, this.$refreshToken, continuation);
            c18241.L$0 = obj;
            return c18241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AivsApiService aivsApiService, Continuation<? super UserCredentialsIssuedTokenResp> continuation) {
            return ((C18241) create(aivsApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AivsApiService aivsApiService = (AivsApiService) this.L$0;
                HashMap map = new HashMap();
                map.put("pt", "1");
                map.put("client_id", Boxing.boxLong(this.$clientId));
                map.put("redirect_uri", this.$redirectUri);
                map.put("client_secret", this.$clientSecret);
                map.put("grant_type", "refresh_token");
                map.put("refresh_token", this.$refreshToken);
                this.label = 1;
                obj = aivsApiService.refreshUserCredentialsToken(map, this);
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

    private final void getUserCredentialIssuedToken(String code, long clientId, String clientSecret, long userId, String deviceId, Function1<? super UserCredentialsIssuedTokenResp, Unit> success, Function1<? super ApiException, Unit> onFail) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(deviceId, clientId, clientSecret, code, userId, null)).error(onFail).success(success);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserCredentialsToken$lambda$0(AivsRequest this$0, long j, String clientSecret, long j2, String deviceId, Function1 success, Function1 onFail, UserCredentialScopeResp result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(clientSecret, "$clientSecret");
        Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(onFail, "$onFail");
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.areEqual(result.getStatus(), SNSAuthProvider.VALUE_SNS_OK)) {
            this$0.getUserCredentialIssuedToken(result.getCode(), j, clientSecret, j2, deviceId, success, onFail);
        } else {
            onFail.invoke2(new ApiException(result.getError_description(), 0, 2, null));
        }
        return Unit.INSTANCE;
    }

    public final void getUserCredentialsToken(final long clientId, @NotNull final String clientSecret, final long userId, @NotNull final String deviceId, @NotNull final Function1<? super UserCredentialsIssuedTokenResp, Unit> success, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C18231(deviceId, clientId, null)).error(onFail).success(new Function1() { // from class: p21
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AivsRequest.getUserCredentialsToken$lambda$0(this.f29924a, clientId, clientSecret, userId, deviceId, success, onFail, (UserCredentialScopeResp) obj);
            }
        });
    }

    public final void refreshUserCredentialsToken(long clientId, @NotNull String clientSecret, @NotNull String redirectUri, @NotNull String refreshToken, @NotNull Function1<? super UserCredentialsIssuedTokenResp, Unit> sucess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(sucess, "sucess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C18241(clientId, redirectUri, clientSecret, refreshToken, null)).error(onFail).success(sucess);
    }
}
