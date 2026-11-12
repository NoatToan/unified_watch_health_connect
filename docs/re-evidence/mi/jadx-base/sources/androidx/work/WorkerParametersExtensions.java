package androidx.work;

import android.content.ComponentName;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.EnqueueUtilsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a(\u0010\b\u001a\u00020\u0000\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\f\u001a'\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u000eH\u0007¢\u0006\u0004\b\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/work/WorkerParameters;", "", "isRemoteWorkRequest", "(Landroidx/work/WorkerParameters;)Z", "Landroidx/work/a;", "T", "Landroid/content/ComponentName;", "componentName", "usingRemoteService", "(Landroidx/work/WorkerParameters;Landroid/content/ComponentName;)Landroidx/work/WorkerParameters;", "", "workerClassName", "(Landroidx/work/WorkerParameters;Ljava/lang/String;Landroid/content/ComponentName;)Landroidx/work/WorkerParameters;", "delegatedWorkerName", "Landroidx/work/Data;", "inputData", "buildDelegatedRemoteRequestData", "(Ljava/lang/String;Landroid/content/ComponentName;Landroidx/work/Data;)Landroidx/work/Data;", "(Landroidx/work/Data;)Z", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "WorkerParametersExtensions")
@SourceDebugExtension({"SMAP\nWorkerParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerParameters.kt\nandroidx/work/WorkerParametersExtensions\n+ 2 Data_.kt\nandroidx/work/Data\n*L\n1#1,100:1\n229#2:101\n229#2:102\n229#2:103\n*S KotlinDebug\n*F\n+ 1 WorkerParameters.kt\nandroidx/work/WorkerParametersExtensions\n*L\n96#1:101\n97#1:102\n98#1:103\n*E\n"})
public final class WorkerParametersExtensions {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final Data buildDelegatedRemoteRequestData(@NotNull String delegatedWorkerName, @NotNull ComponentName componentName, @NotNull Data inputData) {
        Intrinsics.checkNotNullParameter(delegatedWorkerName, "delegatedWorkerName");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Data.Builder builder = new Data.Builder();
        builder.putAll(inputData).putString(EnqueueUtilsKt.ARGUMENT_SERVICE_PACKAGE_NAME, componentName.getPackageName()).putString(EnqueueUtilsKt.ARGUMENT_SERVICE_CLASS_NAME, componentName.getClassName()).putString(EnqueueUtilsKt.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, delegatedWorkerName);
        return builder.build();
    }

    public static final boolean isRemoteWorkRequest(@NotNull WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(workerParameters, "<this>");
        Data inputData = workerParameters.e();
        Intrinsics.checkNotNullExpressionValue(inputData, "inputData");
        return isRemoteWorkRequest(inputData);
    }

    public static final /* synthetic */ <T extends a> WorkerParameters usingRemoteService(WorkerParameters workerParameters, ComponentName componentName) {
        Intrinsics.checkNotNullParameter(workerParameters, "<this>");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.reifiedOperationMarker(4, "T");
        String name = a.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "T::class.java.name");
        return usingRemoteService(workerParameters, name, componentName);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean isRemoteWorkRequest(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        return data.hasKeyWithValueOfType(EnqueueUtilsKt.ARGUMENT_SERVICE_PACKAGE_NAME, String.class) && data.hasKeyWithValueOfType(EnqueueUtilsKt.ARGUMENT_SERVICE_CLASS_NAME, String.class) && data.hasKeyWithValueOfType(EnqueueUtilsKt.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, String.class);
    }

    @NotNull
    public static final WorkerParameters usingRemoteService(@NotNull WorkerParameters workerParameters, @NotNull String workerClassName, @NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(workerParameters, "<this>");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        UUID uuidD = workerParameters.d();
        Data inputData = workerParameters.e();
        Intrinsics.checkNotNullExpressionValue(inputData, "inputData");
        return new WorkerParameters(uuidD, buildDelegatedRemoteRequestData(workerClassName, componentName, inputData), workerParameters.j(), workerParameters.i(), workerParameters.h(), workerParameters.c(), workerParameters.a(), workerParameters.n(), workerParameters.k(), workerParameters.o(), workerParameters.g(), workerParameters.b());
    }
}
