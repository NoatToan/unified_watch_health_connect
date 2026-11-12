package com.huami.rawdata_uploader.usecase;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.huami.rawdata_uploader.vo.IRawDataType;
import com.huami.rawdata_uploader.vo.RawDataDeviceInfo;
import com.huami.rawdata_uploader.vo.RawDataInfo;
import com.huami.rawdata_uploader.vo.RawDataUserInfo;
import com.huami.rawdata_uploader.workmanager.BloodPressureRawDataUploadWork;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/rawdata_uploader/usecase/BloodPressureRawDataWorkUseCase;", "", "Lcom/huami/rawdata_uploader/vo/RawDataUserInfo;", "userInfo", "Lcom/huami/rawdata_uploader/vo/RawDataDeviceInfo;", "deviceInfo", "", "rawData", "", "generateTime", "Lcom/huami/rawdata_uploader/vo/IRawDataType;", "dataDataType", "", "tag", "", "saveRawDataAndPostByWorkSuspend", "(Lcom/huami/rawdata_uploader/vo/RawDataUserInfo;Lcom/huami/rawdata_uploader/vo/RawDataDeviceInfo;[BJLcom/huami/rawdata_uploader/vo/IRawDataType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/rawdata_uploader/usecase/BloodPressureRawDataUseCase;", "a", "Lcom/huami/rawdata_uploader/usecase/BloodPressureRawDataUseCase;", "useCase", "<init>", "(Lcom/huami/rawdata_uploader/usecase/BloodPressureRawDataUseCase;)V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureRawDataWorkUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BloodPressureRawDataUseCase useCase;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.usecase.BloodPressureRawDataWorkUseCase", f = "BloodPressureRawDataWorkUseCase.kt", i = {0, 0, 0, 0}, l = {41}, m = "saveRawDataAndPostByWorkSuspend", n = {"this", "userInfo", "dataDataType", "tag"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return BloodPressureRawDataWorkUseCase.this.saveRawDataAndPostByWorkSuspend(null, null, null, 0L, null, null, this);
        }
    }

    public BloodPressureRawDataWorkUseCase(@NotNull BloodPressureRawDataUseCase bloodPressureRawDataUseCase) {
        this.useCase = bloodPressureRawDataUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object saveRawDataAndPostByWorkSuspend(@NotNull RawDataUserInfo rawDataUserInfo, @NotNull RawDataDeviceInfo rawDataDeviceInfo, @NotNull byte[] bArr, long j, @NotNull IRawDataType iRawDataType, @Nullable String str, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        RawDataUserInfo rawDataUserInfo2;
        IRawDataType iRawDataType2;
        String fileNamePrefix;
        BloodPressureRawDataWorkUseCase bloodPressureRawDataWorkUseCase;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.g = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object obj = aVar2.e;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            BloodPressureRawDataUseCase bloodPressureRawDataUseCase = this.useCase;
            RawDataInfo rawDataInfo = new RawDataInfo(j, bArr);
            aVar2.a = this;
            rawDataUserInfo2 = rawDataUserInfo;
            aVar2.b = rawDataUserInfo2;
            iRawDataType2 = iRawDataType;
            aVar2.c = iRawDataType2;
            fileNamePrefix = str;
            aVar2.d = fileNamePrefix;
            aVar2.g = 1;
            if (bloodPressureRawDataUseCase.saveFileLocal$rawdata_uploader_release(rawDataUserInfo, iRawDataType, rawDataInfo, rawDataDeviceInfo, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodPressureRawDataWorkUseCase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) aVar2.d;
            IRawDataType iRawDataType3 = (IRawDataType) aVar2.c;
            RawDataUserInfo rawDataUserInfo3 = (RawDataUserInfo) aVar2.b;
            bloodPressureRawDataWorkUseCase = (BloodPressureRawDataWorkUseCase) aVar2.a;
            ResultKt.throwOnFailure(obj);
            fileNamePrefix = str2;
            iRawDataType2 = iRawDataType3;
            rawDataUserInfo2 = rawDataUserInfo3;
        }
        Context context = bloodPressureRawDataWorkUseCase.useCase.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String();
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(BloodPressureRawDataUploadWork.class).setInputData(BloodPressureRawDataUploadWork.INSTANCE.createInputDataForUri(rawDataUserInfo2, iRawDataType2)).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.UNMETERED).setRequiresBatteryNotLow(true).build()).build();
        WorkManager workManager = WorkManager.getInstance(context);
        if (fileNamePrefix == null) {
            fileNamePrefix = iRawDataType2.getFileNamePrefix();
        }
        workManager.enqueueUniqueWork(fileNamePrefix, ExistingWorkPolicy.APPEND_OR_REPLACE, oneTimeWorkRequestBuild);
        return Unit.INSTANCE;
    }
}
