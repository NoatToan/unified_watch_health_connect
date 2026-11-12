package com.huami.account.api;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.network.hmnetwork.server.HMServerDef;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0005H\u0002J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/huami/account/api/PersonInfoLegalApi;", "Lcom/huami/http/HttpKit;", "", "type", "b", "Lokhttp3/Response;", "a", PersonInfoLegalApi.PATH_TYPE_NICKNAME, "", "getNickNameCheckResult", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "iconUrl", "getAvatarCheckedResult", "Ljava/lang/String;", "PATH_TYPE_NICKNAME", "PATH_TYPE_ICON_URL", "c", "MEDIA_TYPE_JSON", GoogleApiAvailabilityLight.a, "RESPONSE_STATUS", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoLegalApi implements HttpKit {

    @NotNull
    public static final PersonInfoLegalApi INSTANCE = new PersonInfoLegalApi();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PATH_TYPE_NICKNAME = "nickName";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PATH_TYPE_ICON_URL = "avatar";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String MEDIA_TYPE_JSON = "application/json";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String RESPONSE_STATUS = "status";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.api.PersonInfoLegalApi", f = "PersonInfoLegalApi.kt", i = {}, l = {53}, m = "getAvatarCheckedResult", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return PersonInfoLegalApi.this.getAvatarCheckedResult(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lokhttp3/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.api.PersonInfoLegalApi$getAvatarCheckedResult$response$1", f = "PersonInfoLegalApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response>, Object> {
        public int a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PersonInfoLegalApi personInfoLegalApi = PersonInfoLegalApi.INSTANCE;
            return personInfoLegalApi.a(HttpKitKtxKt.httpPost$default(personInfoLegalApi, personInfoLegalApi.b("avatar"), RequestBody.create(MediaType.get("application/json"), this.b), null, null, 12, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.api.PersonInfoLegalApi", f = "PersonInfoLegalApi.kt", i = {}, l = {40}, m = "getNickNameCheckResult", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return PersonInfoLegalApi.this.getNickNameCheckResult(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lokhttp3/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.api.PersonInfoLegalApi$getNickNameCheckResult$response$1", f = "PersonInfoLegalApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response>, Object> {
        public int a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PersonInfoLegalApi personInfoLegalApi = PersonInfoLegalApi.INSTANCE;
            return personInfoLegalApi.a(HttpKitKtxKt.httpPost$default(personInfoLegalApi, personInfoLegalApi.b(PersonInfoLegalApi.PATH_TYPE_NICKNAME), RequestBody.create(MediaType.get("application/json"), this.b), null, null, 12, null));
        }
    }

    private PersonInfoLegalApi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Response a(Response response) {
        if (response.isSuccessful()) {
            return response;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(String type) {
        return HMServerDef.getUrl("users/me/" + type + "?reviewSupport=1");
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAvatarCheckedResult(@NotNull String str, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            b bVar = new b(str, null);
            aVar.c = 1;
            objWithContext = BuildersKt.withContext(io2, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Object obj = new JSONObject(ConverterKt.responseToJsonStr((Response) objWithContext)).get("status");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return Boxing.boxInt(((Integer) obj).intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getNickNameCheckResult(@NotNull String str, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.c = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objWithContext = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            d dVar = new d(str, null);
            cVar.c = 1;
            objWithContext = BuildersKt.withContext(io2, dVar, cVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Object obj = new JSONObject(ConverterKt.responseToJsonStr((Response) objWithContext)).get("status");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return Boxing.boxInt(((Integer) obj).intValue());
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
