package com.xiaomi.fitness.net.download.engine;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.download.DownloadListener;
import com.xiaomi.fitness.net.download.DownloadProgress;
import com.xiaomi.fitness.net.download.DownloadRequest;
import com.xiaomi.fitness.net.download.engine.RealDownloadRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.net.utils.HttpUtil;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.onetrack.api.b;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.djo;
import defpackage.kdq;
import defpackage.prk;
import defpackage.uua;
import defpackage.zlb;
import java.util.Arrays;
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
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0082@¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/net/download/engine/RealDownloadRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/net/download/engine/RealDownloadRequest$DownloadService;", "Lcom/xiaomi/fitness/net/download/DownloadRequest;", "request", "Lprk;", "Lokhttp3/ResponseBody;", b.I, "Lcom/xiaomi/fitness/net/download/DownloadProgress;", "dispatch", "(Lcom/xiaomi/fitness/net/download/DownloadRequest;Lprk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "url", "Lcom/xiaomi/fitness/net/download/DownloadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "saveFileInfo", "(Ljava/lang/String;Lprk;Lcom/xiaomi/fitness/net/download/DownloadListener;)V", "", "current", StatConstants.PARAM_END, "download", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/xiaomi/fitness/net/download/DownloadRequest;Lcom/xiaomi/fitness/net/download/DownloadListener;)V", "<init>", "()V", "DownloadService", "net_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRealDownloadRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDownloadRequest.kt\ncom/xiaomi/fitness/net/download/engine/RealDownloadRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,79:1\n141#2:80\n89#2,5:84\n31#3:81\n28#3,2:82\n*S KotlinDebug\n*F\n+ 1 RealDownloadRequest.kt\ncom/xiaomi/fitness/net/download/engine/RealDownloadRequest\n*L\n26#1:80\n30#1:84,5\n26#1:81\n26#1:82,2\n*E\n"})
public final class RealDownloadRequest extends BaseRequest<DownloadService> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/net/download/engine/RealDownloadRequest$DownloadService;", "", "", "range", "url", "Lprk;", "Lokhttp3/ResponseBody;", "download", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "net_release"}, k = 1, mv = {2, 0, 0})
    @BaseUrl(host = "https://cdn.cnbj0.fds.api.mi-img.com/", path = "")
    @Secret
    public interface DownloadService {
        @djo
        @Nullable
        @uua
        Object download(@Nullable @zlb("Range") String str, @kdq @Nullable String str2, @NotNull Continuation<? super prk<ResponseBody>> continuation);
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.download.engine.RealDownloadRequest$download$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.download.engine.RealDownloadRequest", f = "RealDownloadRequest.kt", i = {}, l = {26}, m = "download", n = {}, s = {})
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
            return RealDownloadRequest.this.download(0L, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.download.engine.RealDownloadRequest$download$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/download/DownloadProgress;", "it", "Lcom/xiaomi/fitness/net/download/engine/RealDownloadRequest$DownloadService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.download.engine.RealDownloadRequest$download$2", f = "RealDownloadRequest.kt", i = {0}, l = {32, 35}, m = "invokeSuspend", n = {"url"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nRealDownloadRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDownloadRequest.kt\ncom/xiaomi/fitness/net/download/engine/RealDownloadRequest$download$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<DownloadService, Continuation<? super DownloadProgress>, Object> {
        final /* synthetic */ DownloadListener $listener;
        final /* synthetic */ DownloadRequest $request;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RealDownloadRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DownloadRequest downloadRequest, RealDownloadRequest realDownloadRequest, DownloadListener downloadListener, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = downloadRequest;
            this.this$0 = realDownloadRequest;
            this.$listener = downloadListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.this$0, this.$listener, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DownloadService downloadService, Continuation<? super DownloadProgress> continuation) {
            return ((AnonymousClass2) create(downloadService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String url;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    url = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            }
            ResultKt.throwOnFailure(obj);
            DownloadService downloadService = (DownloadService) this.L$0;
            url = this.$request.getUrl();
            this.L$0 = url;
            this.label = 1;
            obj = downloadService.download("bytes=0-", url, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            prk prkVar = (prk) obj;
            if (!prkVar.e()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("The url %s is illegal", Arrays.copyOf(new Object[]{url}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                throw new IllegalArgumentException(str.toString());
            }
            RealDownloadRequest realDownloadRequest = this.this$0;
            Intrinsics.checkNotNull(url);
            realDownloadRequest.saveFileInfo(url, prkVar, this.$listener);
            RealDownloadRequest realDownloadRequest2 = this.this$0;
            DownloadRequest downloadRequest = this.$request;
            this.L$0 = null;
            this.label = 2;
            obj = realDownloadRequest2.dispatch(downloadRequest, prkVar, this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dispatch(DownloadRequest downloadRequest, prk<ResponseBody> prkVar, Continuation<? super DownloadProgress> continuation) {
        return (HttpUtil.INSTANCE.isSupportRange(prkVar) ? new RangeDownloadEngine(this) : new NormalDownloadEngine()).download(downloadRequest, prkVar, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit download$lambda$0(DownloadListener downloadListener, ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (downloadListener != null) {
            downloadListener.onError(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit download$lambda$1(DownloadListener downloadListener, DownloadRequest request, DownloadProgress downloadProgress) {
        Intrinsics.checkNotNullParameter(request, "$request");
        if (downloadListener != null) {
            downloadListener.onSuccess(request.getFile());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFileInfo(String url, prk<ResponseBody> response, DownloadListener listener) {
        HttpUtil httpUtil = HttpUtil.INSTANCE;
        httpUtil.getFileName(response);
        if (listener != null) {
            listener.onStart(httpUtil.getContentLength(response));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object download(long j, long j2, @NotNull String str, @NotNull Continuation<? super prk<ResponseBody>> continuation) {
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
        Object objDownload = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDownload);
            anonymousClass1.label = 1;
            objDownload = getMService().download("bytes=" + j + "-" + j2, str, anonymousClass1);
            if (objDownload == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDownload);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objDownload);
    }

    public final void download(@NotNull final DownloadRequest request, @Nullable final DownloadListener listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(request, this, listener, null)).error(new Function1() { // from class: zgj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RealDownloadRequest.download$lambda$0(listener, (ApiException) obj);
            }
        }).success(new Function1() { // from class: ahj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RealDownloadRequest.download$lambda$1(listener, request, (DownloadProgress) obj);
            }
        });
    }
}
