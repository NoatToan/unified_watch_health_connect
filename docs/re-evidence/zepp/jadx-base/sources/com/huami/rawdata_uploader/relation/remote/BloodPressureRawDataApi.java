package com.huami.rawdata_uploader.relation.remote;

import com.huami.http.HttpKitKtxKt;
import com.huami.rawdata_uploader.ext.CommonExKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00030\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/rawdata_uploader/relation/remote/BloodPressureRawDataApi;", "Lcom/huami/rawdata_uploader/relation/remote/IRawDataApi;", "Lcom/huami/rawdata_uploader/relation/remote/RawDataBloodPressureRequestEntity;", "", "jsonOfData", "", "postDataList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "Companion", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureRawDataApi implements IRawDataApi<RawDataBloodPressureRequestEntity> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = BloodPressureRawDataApi.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.relation.remote.BloodPressureRawDataApi", f = "IRawDataApi.kt", i = {0}, l = {53}, m = "postDataList", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BloodPressureRawDataApi.this.postDataList(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return " postList error exception " + this.a;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return IRawDataApi.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return IRawDataApi.DefaultImpls.okHttpClient(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.rawdata_uploader.relation.remote.IRawDataApi
    @Nullable
    public Object postDataList(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        BloodPressureRawDataApi bloodPressureRawDataApi;
        boolean zIsSuccessful;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object objAwaitHttpPost = aVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitHttpPost);
            String str2 = baseUrl() + "v2/users/me/events";
            try {
                RequestBody requestBodyCreate = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str);
                aVar2.a = this;
                aVar2.d = 1;
                objAwaitHttpPost = HttpKitKtxKt.awaitHttpPost(this, str2, requestBodyCreate, (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? null : null, aVar2);
                if (objAwaitHttpPost == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                e = e;
                bloodPressureRawDataApi = this;
                CommonExKt.commonLog(bloodPressureRawDataApi.TAG, new b(e));
                zIsSuccessful = false;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bloodPressureRawDataApi = (BloodPressureRawDataApi) aVar2.a;
            try {
                ResultKt.throwOnFailure(objAwaitHttpPost);
            } catch (Exception e2) {
                e = e2;
                CommonExKt.commonLog(bloodPressureRawDataApi.TAG, new b(e));
                zIsSuccessful = false;
            }
        }
        zIsSuccessful = ((Response) objAwaitHttpPost).isSuccessful();
        return Boxing.boxBoolean(zIsSuccessful);
    }
}
