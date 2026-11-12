package com.huami.rawdata_uploader.file.remote;

import com.huami.rawdata_uploader.ext.CommonExKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/rawdata_uploader/file/remote/BloodPressureFileUploadDelegate;", "", "", "userId", "appName", "fileName", "type", "Lcom/huami/rawdata_uploader/file/remote/RawDataUrlResponse;", "fetchRawDataUrlByType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postUri", "Ljava/io/File;", "zipFile", "", "uploadRawFile", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/rawdata_uploader/file/remote/IFileUploadRepo;", "a", "Lcom/huami/rawdata_uploader/file/remote/IFileUploadRepo;", "iFileUploadRepo", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "<init>", "(Lcom/huami/rawdata_uploader/file/remote/IFileUploadRepo;)V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureFileUploadDelegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IFileUploadRepo iFileUploadRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TAG = BloodPressureFileUploadDelegate.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.file.remote.BloodPressureFileUploadDelegate", f = "IFileUploadRepo.kt", i = {0}, l = {108}, m = "fetchRawDataUrlByType", n = {"this"}, s = {"L$0"})
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
            return BloodPressureFileUploadDelegate.this.fetchRawDataUrlByType(null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ RawDataUrlResponse a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RawDataUrlResponse rawDataUrlResponse) {
            super(0);
            this.a = rawDataUrlResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.file.remote.BloodPressureFileUploadDelegate", f = "IFileUploadRepo.kt", i = {0}, l = {116}, m = "uploadRawFile", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BloodPressureFileUploadDelegate.this.uploadRawFile(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return String.valueOf(this.a);
        }
    }

    public BloodPressureFileUploadDelegate(@NotNull IFileUploadRepo iFileUploadRepo) {
        this.iFileUploadRepo = iFileUploadRepo;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object fetchRawDataUrlByType(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Continuation<? super RawDataUrlResponse> continuation) {
        a aVar;
        BloodPressureFileUploadDelegate bloodPressureFileUploadDelegate;
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
        Object objFetchRawDataUrl = aVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchRawDataUrl);
            IFileUploadRepo iFileUploadRepo = this.iFileUploadRepo;
            aVar2.a = this;
            aVar2.d = 1;
            objFetchRawDataUrl = iFileUploadRepo.fetchRawDataUrl(str, str2, str3, str4, aVar2);
            if (objFetchRawDataUrl == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodPressureFileUploadDelegate = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bloodPressureFileUploadDelegate = (BloodPressureFileUploadDelegate) aVar2.a;
            ResultKt.throwOnFailure(objFetchRawDataUrl);
        }
        CommonExKt.commonLog(bloodPressureFileUploadDelegate.TAG, new b((RawDataUrlResponse) objFetchRawDataUrl));
        return objFetchRawDataUrl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object uploadRawFile(@NotNull String str, @NotNull File file, @NotNull Continuation<? super Boolean> continuation) {
        c cVar;
        BloodPressureFileUploadDelegate bloodPressureFileUploadDelegate;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.d = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objUploadRawDataFile = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadRawDataFile);
            IFileUploadRepo iFileUploadRepo = this.iFileUploadRepo;
            cVar.a = this;
            cVar.d = 1;
            objUploadRawDataFile = iFileUploadRepo.uploadRawDataFile(str, file, cVar);
            if (objUploadRawDataFile == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodPressureFileUploadDelegate = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bloodPressureFileUploadDelegate = (BloodPressureFileUploadDelegate) cVar.a;
            ResultKt.throwOnFailure(objUploadRawDataFile);
        }
        CommonExKt.commonLog(bloodPressureFileUploadDelegate.TAG, new d(((Boolean) objUploadRawDataFile).booleanValue()));
        return objUploadRawDataFile;
    }
}
