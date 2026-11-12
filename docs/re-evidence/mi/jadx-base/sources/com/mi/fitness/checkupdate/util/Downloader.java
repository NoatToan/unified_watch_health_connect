package com.mi.fitness.checkupdate.util;

import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.TLSCompatSocketFactory;
import com.xiaomi.onetrack.api.b;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000f0\u0011H\u0086@¢\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/mi/fitness/checkupdate/util/Downloader;", "", "<init>", "()V", "TAG", "", "download", "Lkotlinx/coroutines/flow/Flow;", "", "url", "file", "Ljava/io/File;", "md5", "onSuccess", "Lkotlin/Function0;", "", "onError", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "error", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestHead", "Lokhttp3/Response;", "supportRange", "", b.I, "contentLength", "", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Downloader {

    @NotNull
    public static final Downloader INSTANCE = new Downloader();

    @NotNull
    private static final String TAG = "Downloader";

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.util.Downloader$download$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.util.Downloader$download$2", f = "Downloader.kt", i = {0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 4, 4}, l = {36, 43, 100, 105, 111, 123, 130}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "fileTmp", "downloaded", b.I, "outputStream", "buffer", "len", SportDataTypeKt.DIMEN_TOTAL, "totalBytesRead", b.I, "outputStream", b.I, "outputStream"}, s = {"L$0", "L$0", "L$1", "L$2", "L$8", "L$9", "L$10", "L$11", "J$0", "J$1", "L$1", "L$2", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nDownloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Downloader.kt\ncom/mi/fitness/checkupdate/util/Downloader$download$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $file;
        final /* synthetic */ String $md5;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ String $url;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        /* JADX INFO: renamed from: com.mi.fitness.checkupdate.util.Downloader$download$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.fitness.checkupdate.util.Downloader$download$2$1", f = "Downloader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $onSuccess;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$onSuccess = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$onSuccess, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$onSuccess.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.mi.fitness.checkupdate.util.Downloader$download$2$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.fitness.checkupdate.util.Downloader$download$2$4", f = "Downloader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Exception $e;
            final /* synthetic */ Function1<String, Unit> $onError;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass4(Function1<? super String, Unit> function1, Exception exc, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$onError = function1;
                this.$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$onError, this.$e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1<String, Unit> function1 = this.$onError;
                String throwableString = CheckUpdateUtil.INSTANCE.getThrowableString(this.$e);
                if (throwableString == null) {
                    throwableString = "";
                }
                function1.invoke2(throwableString);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, Function1<? super String, Unit> function1, File file, String str2, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$url = str;
            this.$onError = function1;
            this.$file = file;
            this.$md5 = str2;
            this.$onSuccess = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$url, this.$onError, this.$file, this.$md5, this.$onSuccess, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:113:0x0296  */
        /* JADX WARN: Code duplicated, block: B:121:0x0312 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:122:0x0313  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0313 -> B:23:0x00a8). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 1158
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mi.fitness.checkupdate.util.Downloader.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private Downloader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long contentLength(Response response) {
        if ((response != null ? response.body() : null) == null) {
            return -1L;
        }
        ResponseBody responseBodyBody = response.body();
        Intrinsics.checkNotNull(responseBodyBody);
        return responseBodyBody.getContentLength();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Response requestHead(String url) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TLSCompatSocketFactory.Companion companion = TLSCompatSocketFactory.INSTANCE;
        try {
            Response responseExecute = builder.sslSocketFactory(companion.sslSocketFactory(), companion.trustManager()).build().newCall(new Request.Builder().url(url).head().build()).execute();
            try {
                Logger.d("CheckUpdate", "download requestHead:" + responseExecute);
                if (responseExecute.isSuccessful()) {
                    CloseableKt.closeFinally(responseExecute, null);
                    return responseExecute;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(responseExecute, null);
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(responseExecute, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            Logger.d("CheckUpdate", e);
        }
        Logger.d("CheckUpdate", e);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean supportRange(Response response) {
        if (response != null) {
            return StringsKt__StringsJVMKt.equals("bytes", Response.header$default(response, "Accept-Ranges", null, 2, null), true);
        }
        return false;
    }

    @Nullable
    public final Object download(@Nullable String str, @NotNull File file, @Nullable String str2, @NotNull Function0<Unit> function0, @NotNull Function1<? super String, Unit> function1, @NotNull Continuation<? super Flow<Integer>> continuation) {
        Logger.i(TAG, "download() called with: url = " + str + ", file = " + file + ", md5 = " + str2);
        return FlowKt.flow(new AnonymousClass2(str, function1, file, str2, function0, null));
    }
}
