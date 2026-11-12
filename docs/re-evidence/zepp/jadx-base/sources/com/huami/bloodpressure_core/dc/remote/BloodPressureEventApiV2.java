package com.huami.bloodpressure_core.dc.remote;

import com.google.gson.reflect.TypeToken;
import com.huami.bloodpressure_core.dc.local.BloodPressureVo;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.mifit.sportlib.common.DataTypeSource;
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
import kotlin.jvm.internal.Ref;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJy\u0010\u0013\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/BloodPressureEventApiV2;", "Lcom/huami/bloodpressure_core/dc/remote/IEventApi;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteV2Entity;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;", "", "url", "userId", "eventType", "subType", "", "from", "to", "next", "", "limit", "", "reverse", "Lcom/huami/bloodpressure_core/dc/remote/UserEventsResponse;", "Lcom/huami/bloodpressure_core/dc/remote/UserEventsNext;", "fetchData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jsonOfData", "uploadData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timestamp", "deleteData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureEventApiV2 implements IEventApi<BloodPressureRemoteV2Entity<BloodPressureVo>> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.remote.BloodPressureEventApiV2", f = "BloodPressureEventApiV1.kt", i = {}, l = {222}, m = "deleteData", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return BloodPressureEventApiV2.this.deleteData(null, null, null, null, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.BooleanRef booleanRef, Exception exc) {
            super(0);
            this.a = booleanRef;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return " result " + this.a.element + " deleteData " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.remote.BloodPressureEventApiV2", f = "BloodPressureEventApiV1.kt", i = {}, l = {171}, m = "fetchData", n = {}, s = {})
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
            return BloodPressureEventApiV2.this.fetchData(null, null, null, null, null, null, null, 0, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getData " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.remote.BloodPressureEventApiV2", f = "BloodPressureEventApiV1.kt", i = {0}, l = {DataTypeSource.SPORT_TYPE_DISCO}, m = "uploadData", n = {"result"}, s = {"L$0"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return BloodPressureEventApiV2.this.uploadData(null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ref.BooleanRef booleanRef, Exception exc) {
            super(0);
            this.a = booleanRef;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return " result " + this.a.element + " getData " + this.b;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return IEventApi.DefaultImpls.baseUrl(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bloodpressure_core.dc.remote.IEventApi
    @Nullable
    public Object deleteData(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, long j, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object obj = aVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
            HashMap map = new HashMap();
            if (str3 == null) {
                str3 = "";
            }
            map.put("eventType", str3);
            if (str4 == null) {
                str4 = "";
            }
            map.put("subType", str4);
            map.put("timestamp", String.valueOf(j));
            HashMap map2 = new HashMap();
            map2.put("Content-Type", "application/x-www-form-urlencoded");
            try {
                aVar2.a = booleanRef3;
                aVar2.b = booleanRef3;
                aVar2.e = 1;
                Object objAwaitHttpDelete = HttpKitKtxKt.awaitHttpDelete(this, str, (2 & 2) != 0 ? null : null, (2 & 4) != 0 ? null : map, (2 & 8) != 0 ? null : map2, aVar2);
                if (objAwaitHttpDelete == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef3;
                obj = objAwaitHttpDelete;
                booleanRef2 = booleanRef;
            } catch (Exception e2) {
                e = e2;
                booleanRef = booleanRef3;
                booleanRef.element = false;
                HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new b(booleanRef, e));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef2 = (Ref.BooleanRef) aVar2.b;
            booleanRef = (Ref.BooleanRef) aVar2.a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e3) {
                e = e3;
                booleanRef.element = false;
                HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new b(booleanRef, e));
            }
        }
        booleanRef2.element = ((Response) obj).isSuccessful();
        return Boxing.boxBoolean(booleanRef.element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bloodpressure_core.dc.remote.IEventApi
    @Nullable
    public Object fetchData(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, int i, boolean z, @NotNull Continuation<? super UserEventsResponse<BloodPressureRemoteV2Entity<BloodPressureVo>, UserEventsNext>> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.c = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objAwaitHttpGet$default = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar.c;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objAwaitHttpGet$default);
                HashMap map = new HashMap();
                if (str3 == null) {
                    str3 = "";
                }
                map.put("eventType", str3);
                if (str4 == null) {
                    str4 = "";
                }
                map.put("subType", str4);
                if (l != null) {
                }
                if (l2 != null) {
                }
                if (l3 != null) {
                }
                map.put("reverse", String.valueOf(z));
                cVar.c = 1;
                objAwaitHttpGet$default = HttpKitKtxKt.awaitHttpGet$default(this, str, map, null, cVar, 4, null);
                if (objAwaitHttpGet$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
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
            return (UserEventsResponse) converter.convert(responseBodyBody, new TypeToken<UserEventsResponse<BloodPressureRemoteV2Entity<BloodPressureVo>, UserEventsNext>>() { // from class: com.huami.bloodpressure_core.dc.remote.BloodPressureEventApiV2$fetchData$$inlined$deserializeOrThrow$1
            }.getType());
        } catch (Exception e2) {
            HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new d(e2));
            return null;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return IEventApi.DefaultImpls.okHttpClient(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bloodpressure_core.dc.remote.IEventApi
    @Nullable
    public Object uploadData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Boolean> continuation) {
        e eVar;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.e = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object obj = eVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar2.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
            try {
                RequestBody requestBodyCreate = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str3);
                eVar2.a = booleanRef3;
                eVar2.b = booleanRef3;
                eVar2.e = 1;
                Object objAwaitHttpPost = HttpKitKtxKt.awaitHttpPost(this, str, requestBodyCreate, (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? null : null, eVar2);
                if (objAwaitHttpPost == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef3;
                obj = objAwaitHttpPost;
                booleanRef2 = booleanRef;
            } catch (Exception e2) {
                e = e2;
                booleanRef = booleanRef3;
                booleanRef.element = false;
                HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new f(booleanRef, e));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef2 = (Ref.BooleanRef) eVar2.b;
            booleanRef = (Ref.BooleanRef) eVar2.a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e3) {
                e = e3;
                booleanRef.element = false;
                HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new f(booleanRef, e));
            }
        }
        booleanRef2.element = ((Response) obj).isSuccessful();
        return Boxing.boxBoolean(booleanRef.element);
    }
}
