package com.xiaomi.fitness.research.sync.receive;

import android.content.Context;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import defpackage.r72;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"writeByteArrayToDownload", "Ljava/io/File;", "context", "Landroid/content/Context;", "byteArray", "", "fileName", "", "(Landroid/content/Context;[BLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "research-support_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRelayDataLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelayDataLauncher.kt\ncom/xiaomi/fitness/research/sync/receive/RelayDataLauncherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,84:1\n314#2,11:85\n*S KotlinDebug\n*F\n+ 1 RelayDataLauncher.kt\ncom/xiaomi/fitness/research/sync/receive/RelayDataLauncherKt\n*L\n68#1:85,11\n*E\n"})
public final class RelayDataLauncherKt {
    @Nullable
    public static final Object writeByteArrayToDownload(@NotNull Context context, @NotNull byte[] bArr, @NotNull String str, @NotNull Continuation<? super File> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        File file = new File(r72.l(), str);
        if (file.exists()) {
            file.delete();
        }
        try {
            FilesKt__FileReadWriteKt.writeBytes(file, bArr);
            if (!cancellableContinuationImpl.isCancelled() || cancellableContinuationImpl.isCompleted()) {
                cancellableContinuationImpl.resumeWith(Result.m886constructorimpl(file));
            }
        } catch (Exception e) {
            FitnessLogUtils.i("medical_data", "writeByteArrayToDownload: " + e.getMessage() + " ");
            new File("");
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
