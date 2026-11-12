package com.xiaomi.fitness.common.utils;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DownloadExtKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001af\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t26\b\u0002\u0010\n\u001a0\u0012&\u0012$0\u0010j\u0011`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000b¨\u0006\u0011"}, d2 = {"downloadFileAndPerformCallbackIfNeed", "", "srcUrl", "", "destinationFile", "Ljava/io/File;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "onSuccess", "Lkotlin/Function0;", "onFail", "Lkotlin/Function1;", "Lkotlin/Exception;", "Lkotlin/ParameterName;", "name", PluginDeviceInfo.FICONOFFLINE, "Ljava/lang/Exception;", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DownloadExtKt {

    /* JADX INFO: renamed from: com.xiaomi.fitness.common.utils.DownloadExtKt$downloadFileAndPerformCallbackIfNeed$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.common.utils.DownloadExtKt$downloadFileAndPerformCallbackIfNeed$3", f = "DownloadExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $destinationFile;
        final /* synthetic */ Function1<Exception, Unit> $onFail;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ String $srcUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, Function1<? super Exception, Unit> function1, File file, Function0<Unit> function0, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$srcUrl = str;
            this.$onFail = function1;
            this.$destinationFile = file;
            this.$onSuccess = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$srcUrl, this.$onFail, this.$destinationFile, this.$onSuccess, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                InputStream inputStreamOpenStream = new URL(this.$srcUrl).openStream();
                File file = this.$destinationFile;
                Function0<Unit> function0 = this.$onSuccess;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        Intrinsics.checkNotNull(inputStreamOpenStream);
                        ByteStreamsKt.copyTo$default(inputStreamOpenStream, fileOutputStream, 0, 2, null);
                        function0.invoke();
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileOutputStream, null);
                        CloseableKt.closeFinally(inputStreamOpenStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(inputStreamOpenStream, th3);
                        throw th4;
                    }
                }
            } catch (Exception e) {
                this.$onFail.invoke2(e);
                Logger.e("downloadFileAndPerformCallbackIfNeed e=" + e, new Object[0]);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void downloadFileAndPerformCallbackIfNeed(@NotNull String srcUrl, @NotNull File destinationFile, @NotNull LifecycleCoroutineScope lifecycleScope, @NotNull Function0<Unit> onSuccess, @NotNull Function1<? super Exception, Unit> onFail) {
        Intrinsics.checkNotNullParameter(srcUrl, "srcUrl");
        Intrinsics.checkNotNullParameter(destinationFile, "destinationFile");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getIO(), null, new AnonymousClass3(srcUrl, onFail, destinationFile, onSuccess, null), 2, null);
    }

    public static /* synthetic */ void downloadFileAndPerformCallbackIfNeed$default(String str, File file, LifecycleCoroutineScope lifecycleCoroutineScope, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: c37
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: d37
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return DownloadExtKt.downloadFileAndPerformCallbackIfNeed$lambda$1((Exception) obj2);
                }
            };
        }
        downloadFileAndPerformCallbackIfNeed(str, file, lifecycleCoroutineScope, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadFileAndPerformCallbackIfNeed$lambda$1(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
