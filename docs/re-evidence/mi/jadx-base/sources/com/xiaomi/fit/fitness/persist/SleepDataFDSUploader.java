package com.xiaomi.fit.fitness.persist;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fit.fitness.persist.SleepDataFDSUploader;
import com.xiaomi.fit.fitness.persist.server.FitnessFDSRequest;
import com.xiaomi.fit.fitness.persist.server.data.FDSResultValue;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.UploadFileManagerExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.wearable.common.util.encrypt.AESUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/SleepDataFDSUploader;", "", "<init>", "()V", "TAG", "", "mFitnessRequest", "Lcom/xiaomi/fit/fitness/persist/server/FitnessFDSRequest;", "getMFitnessRequest", "()Lcom/xiaomi/fit/fitness/persist/server/FitnessFDSRequest;", "mFitnessRequest$delegate", "Lkotlin/Lazy;", "uploadSleepSrcData", "", "sid", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "fileName", "sleepData", "", "uploadSleepDataToFDS", "", "uploadUrl", "deleteForFault", "fileDir", "Ljava/io/File;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepDataFDSUploader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<SleepDataFDSUploader> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bjm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepDataFDSUploader.instance_delegate$lambda$2();
        }
    });

    @NotNull
    private final String TAG = "SleepDataFDSUploader";

    /* JADX INFO: renamed from: mFitnessRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFitnessRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cjm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepDataFDSUploader.mFitnessRequest_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/SleepDataFDSUploader$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/persist/SleepDataFDSUploader;", "getInstance", "()Lcom/xiaomi/fit/fitness/persist/SleepDataFDSUploader;", "instance$delegate", "Lkotlin/Lazy;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepDataFDSUploader getInstance() {
            return (SleepDataFDSUploader) SleepDataFDSUploader.instance$delegate.getValue();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.SleepDataFDSUploader$uploadSleepSrcData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.SleepDataFDSUploader$uploadSleepSrcData$1", f = "SleepDataFDSUploader.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FitnessDataId $dataId;
        final /* synthetic */ String $fileName;
        final /* synthetic */ String $sid;
        final /* synthetic */ byte[] $sleepData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, FitnessDataId fitnessDataId, String str2, byte[] bArr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$dataId = fitnessDataId;
            this.$fileName = str2;
            this.$sleepData = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepDataFDSUploader.this.new AnonymousClass1(this.$sid, this.$dataId, this.$fileName, this.$sleepData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FitnessFDSRequest mFitnessRequest = SleepDataFDSUploader.this.getMFitnessRequest();
                String str = this.$sid;
                FitnessDataId fitnessDataId = this.$dataId;
                String str2 = this.$fileName;
                this.label = 1;
                obj = mFitnessRequest.getSleepSrcDataUploadUrl(str, fitnessDataId, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zUploadSleepDataToFDS = SleepDataFDSUploader.this.uploadSleepDataToFDS(((FDSResultValue) obj).getUrl(), this.$sid, this.$dataId, this.$sleepData);
            FitnessLogUtils.i(SleepDataFDSUploader.this.TAG, "uploadSleepDataToFDS: " + zUploadSleepDataToFDS);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SleepDataFDSUploader() {
    }

    private final void deleteForFault(File fileDir) {
        File[] fileArrListFiles;
        if (fileDir == null) {
            return;
        }
        FitnessLogUtils.i(this.TAG, "deleteForFault: fileDir = " + fileDir);
        if (!fileDir.isDirectory() || !fileDir.exists() || (fileArrListFiles = fileDir.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        Iterator it = ArrayIteratorKt.iterator(fileArrListFiles);
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt__StringsKt.contains((CharSequence) name, (CharSequence) "_8_gps_", true)) {
                FitnessLogUtils.i(this.TAG, "deleteForFault: delete file(" + file.getName() + "))");
                file.delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessFDSRequest getMFitnessRequest() {
        return (FitnessFDSRequest) this.mFitnessRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepDataFDSUploader instance_delegate$lambda$2() {
        return new SleepDataFDSUploader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessFDSRequest mFitnessRequest_delegate$lambda$0() {
        return new FitnessFDSRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean uploadSleepDataToFDS(String uploadUrl, String sid, FitnessDataId dataId, byte[] sleepData) throws Throwable {
        boolean zEncryptFile;
        File cacheDataFile = FitnessFileUtils.getCacheDataFile(ApplicationExtKt.getApplication(), sid, dataId);
        File file = new File(ApplicationExtKt.getApplication().getExternalFilesDir(null), cacheDataFile.getName());
        FileUtils.INSTANCE.writeFile(cacheDataFile, new ByteArrayInputStream(sleepData));
        try {
            zEncryptFile = AESUtils.INSTANCE.encryptFile(cacheDataFile.getPath(), file.getPath(), System.currentTimeMillis() + "abc");
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "encryptFile", e);
            zEncryptFile = false;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        fileUtils.deleteFile(cacheDataFile);
        deleteForFault(cacheDataFile.getParentFile());
        if (zEncryptFile) {
            UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE).uploadFile(uploadUrl, file.getPath());
            fileUtils.deleteFile(file);
            return true;
        }
        FitnessLogUtils.i(this.TAG, "encryptFile error, and not upload");
        fileUtils.deleteFile(file);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadSleepSrcData$lambda$1(SleepDataFDSUploader this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.INSTANCE.w(this$0.TAG, "uploadSleepDataToFDS", it);
        return Unit.INSTANCE;
    }

    public final void uploadSleepSrcData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull String fileName, @NotNull byte[] sleepData) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(sleepData, "sleepData");
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new AnonymousClass1(sid, dataId, fileName, sleepData, null)).m503catch(new Function2() { // from class: ajm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SleepDataFDSUploader.uploadSleepSrcData$lambda$1(this.f1104a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }
}
