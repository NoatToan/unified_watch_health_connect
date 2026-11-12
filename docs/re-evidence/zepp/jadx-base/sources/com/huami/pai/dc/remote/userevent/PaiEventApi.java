package com.huami.pai.dc.remote.userevent;

import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.pai.dc.PaiWebConst;
import com.huami.pai.vo.PaiEventVo;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011JO\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/huami/pai/dc/remote/userevent/PaiEventApi;", "Lcom/huami/pai/dc/remote/userevent/IPaiEventApi;", "", "userId", "from", "to", "next", "limit", "reverse", "Lcom/huami/pai/vo/PaiEventVo;", "getAllData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jsonOfPai", "", "postDatas", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiEventApi implements IPaiEventApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.dc.remote.userevent.PaiEventApi", f = "PaiEventApi.kt", i = {}, l = {54}, m = "getAllData", n = {}, s = {})
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
            return PaiEventApi.this.getAllData(null, null, null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getData " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.dc.remote.userevent.PaiEventApi", f = "PaiEventApi.kt", i = {}, l = {73}, m = "postDatas", n = {}, s = {})
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
            return PaiEventApi.this.postDatas(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "postData " + this.a;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return IPaiEventApi.DefaultImpls.baseUrl(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // com.huami.pai.dc.remote.userevent.IPaiEventApi
    @Nullable
    public Object getAllData(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull Continuation<? super PaiEventVo> continuation) throws HttpError {
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
        Object objAwaitHttpGet$default = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitHttpGet$default);
            HashMap map = new HashMap();
            map.put("eventType", PaiWebConst.Param.PAI_EVENT_TYPE);
            map.put("subType", PaiWebConst.Param.PAI_EVENT_TYPE);
            if (str2 != null) {
            }
            if (str3 != null) {
            }
            if (str4 != null) {
            }
            if (str5 != null) {
            }
            map.put("reverse", str6 == null ? "false" : str6);
            String strReplace$default = m.replace$default("users/{userId}/events", "{userId}", str, false, 4, (Object) null);
            aVar.c = 1;
            objAwaitHttpGet$default = HttpKitKtxKt.awaitHttpGet$default(this, strReplace$default, map, null, aVar, 4, null);
            if (objAwaitHttpGet$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitHttpGet$default);
        }
        Response response = (Response) objAwaitHttpGet$default;
        HMLog.info(PaiWebConst.Tag.HTTP_TAG, new b(response));
        ConverterKt.checkToken(response, ConverterKt.responseToJsonStr(response));
        if (!response.isSuccessful()) {
            throw new HttpError(response);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return converter.convert(responseBodyBody, new TypeToken<PaiEventVo>() { // from class: com.huami.pai.dc.remote.userevent.PaiEventApi$getAllData$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return IPaiEventApi.DefaultImpls.okHttpClient(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.pai.dc.remote.userevent.IPaiEventApi
    @Nullable
    public Object postDatas(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
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
        c cVar2 = cVar;
        Object objAwaitHttpPost = cVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar2.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitHttpPost);
            HashMap map = new HashMap();
            map.put("eventType", PaiWebConst.Param.PAI_EVENT_TYPE);
            map.put("subType", PaiWebConst.Param.PAI_EVENT_TYPE);
            String strReplace$default = m.replace$default("users/{userId}/events", "{userId}", str, false, 4, (Object) null);
            RequestBody requestBodyCreate = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str2);
            cVar2.c = 1;
            objAwaitHttpPost = HttpKitKtxKt.awaitHttpPost(this, strReplace$default, requestBodyCreate, (12 & 4) != 0 ? null : map, (12 & 8) != 0 ? null : null, cVar2);
            if (objAwaitHttpPost == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitHttpPost);
        }
        Response response = (Response) objAwaitHttpPost;
        HMLog.info(PaiWebConst.Tag.HTTP_TAG, new d(response));
        return Boxing.boxBoolean(response.isSuccessful());
    }
}
