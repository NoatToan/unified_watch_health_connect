package com.huami.bloodpressure_core.dc.remote.night;

import com.google.gson.reflect.TypeToken;
import com.huami.bloodpressure_core.dc.remote.base.IBloodPressureNight;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0005\"\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0005\"\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0005\"\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureNightEventApi;", "Lcom/huami/bloodpressure_core/dc/remote/base/IBloodPressureNight;", "", "Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureNightVo;", "", "", "params", "getData", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "postData", "(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delData", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureNightEventApi implements IBloodPressureNight<List<? extends BloodPressureNightVo>, String> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.remote.night.BloodPressureNightEventApi", f = "BloodPressureNightEventApi.kt", i = {}, l = {86}, m = "delData", n = {}, s = {})
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
            return BloodPressureNightEventApi.this.delData(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "night del result " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.remote.night.BloodPressureNightEventApi", f = "BloodPressureNightEventApi.kt", i = {}, l = {39}, m = "getData", n = {}, s = {})
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
            return BloodPressureNightEventApi.this.getData(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return " get result " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.remote.night.BloodPressureNightEventApi", f = "BloodPressureNightEventApi.kt", i = {}, l = {53}, m = "postData", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BloodPressureNightEventApi.this.postData((String) null, (String[]) null, (Continuation<? super Boolean>) this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return " result " + this.a;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return IBloodPressureNight.DefaultImpls.baseUrl(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bloodpressure_core.dc.remote.base.IBloodPressureDel
    @Nullable
    public Object delData(@NotNull String[] strArr, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        Object objM3845constructorimpl;
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
        a aVar2 = aVar;
        Object objAwaitHttpDelete = aVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwaitHttpDelete);
                Result.Companion companion = Result.Companion;
                String str = strArr[0];
                HashMap map = new HashMap();
                map.put(BloodPressureConst.ParamKey.MEASURETIME, strArr[1]);
                map.put("type", strArr[2]);
                HashMap map2 = new HashMap();
                map2.put("Content-Type", "application/x-www-form-urlencoded");
                aVar2.c = 1;
                objAwaitHttpDelete = HttpKitKtxKt.awaitHttpDelete(this, str, (2 & 2) != 0 ? null : null, (2 & 4) != 0 ? null : map, (2 & 8) != 0 ? null : map2, aVar2);
                if (objAwaitHttpDelete == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwaitHttpDelete);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(((Response) objAwaitHttpDelete).isSuccessful()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new b(thM3848exceptionOrNullimpl));
        }
        return Result.m3850isFailureimpl(objM3845constructorimpl) ? Boxing.boxBoolean(false) : objM3845constructorimpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bloodpressure_core.dc.remote.base.IBloodPressureGet
    @Nullable
    public Object getData(@NotNull String[] strArr, @NotNull Continuation<? super List<BloodPressureNightVo>> continuation) {
        c cVar;
        Object objM3845constructorimpl;
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
        Object objAwaitHttpGet$default = cVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar2.c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwaitHttpGet$default);
                Result.Companion companion = Result.Companion;
                String str = strArr[0];
                HashMap map = new HashMap();
                map.put("toDate", strArr[1]);
                map.put("days", strArr[2]);
                cVar2.c = 1;
                objAwaitHttpGet$default = HttpKitKtxKt.awaitHttpGet$default(this, str, map, null, cVar2, 4, null);
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
            ConverterKt.checkToken(response, ConverterKt.responseToJsonStr(response));
            if (!response.isSuccessful()) {
                throw new HttpError(response);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            objM3845constructorimpl = Result.m3845constructorimpl((List) converter.convert(responseBodyBody, new TypeToken<List<? extends BloodPressureNightVo>>() { // from class: com.huami.bloodpressure_core.dc.remote.night.BloodPressureNightEventApi$getData$lambda-1$$inlined$deserializeOrThrow$1
            }.getType()));
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new d(thM3848exceptionOrNullimpl));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                return null;
            }
            return objM3845constructorimpl;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return IBloodPressureNight.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.bloodpressure_core.dc.remote.base.IBloodPressurePost
    public /* bridge */ /* synthetic */ Object postData(Object obj, String[] strArr, Continuation continuation) {
        return postData((String) obj, strArr, (Continuation<? super Boolean>) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object postData(@NotNull String str, @NotNull String[] strArr, @NotNull Continuation<? super Boolean> continuation) {
        e eVar;
        Object objM3845constructorimpl;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.c = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object objAwaitHttpPost = eVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar2.c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwaitHttpPost);
                Result.Companion companion = Result.Companion;
                String str2 = strArr[0];
                RequestBody requestBodyCreate = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str);
                eVar2.c = 1;
                objAwaitHttpPost = HttpKitKtxKt.awaitHttpPost(this, str2, requestBodyCreate, (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? null : null, eVar2);
                if (objAwaitHttpPost == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwaitHttpPost);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(((Response) objAwaitHttpPost).isSuccessful()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new f(thM3848exceptionOrNullimpl));
        }
        return Result.m3850isFailureimpl(objM3845constructorimpl) ? Boxing.boxBoolean(false) : objM3845constructorimpl;
    }
}
