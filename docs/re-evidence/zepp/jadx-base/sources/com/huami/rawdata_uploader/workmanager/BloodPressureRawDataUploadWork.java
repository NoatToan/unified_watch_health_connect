package com.huami.rawdata_uploader.workmanager;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.huami.rawdata_uploader.di.RawDataInterModuleKt;
import com.huami.rawdata_uploader.ext.CommonExKt;
import com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase;
import com.huami.rawdata_uploader.vo.IRawDataType;
import com.huami.rawdata_uploader.vo.RawDataUserInfo;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/huami/rawdata_uploader/workmanager/BloodPressureRawDataUploadWork;", "Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/rawdata_uploader/usecase/BloodPressureRawDataUseCase;", "a", "Lcom/huami/rawdata_uploader/usecase/BloodPressureRawDataUseCase;", "getBpUserCase", "()Lcom/huami/rawdata_uploader/usecase/BloodPressureRawDataUseCase;", "bpUserCase", "Landroid/content/Context;", "ctx", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureRawDataUploadWork extends CoroutineWorker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String b = BloodPressureRawDataUploadWork.class.getSimpleName();

    @NotNull
    private static final String c = "WORK_USERID";

    @NotNull
    private static final String d = "WORK_PACKAGENAME";

    @NotNull
    private static final String e = "WORK_DATA_TYPE_VALUE";

    @NotNull
    private static final String f = "WORK_DATA_TYPE_FILENAMEPREFIX";

    @NotNull
    private static final String g = "WORK_DATA_TYPE_EVENTTYPE";

    @NotNull
    private static final String h = "WORK_DATA_TYPE_SUBTYPE";

    @NotNull
    private static final String i = "WORK_DATA_TYPE_VALUESTR";

    @NotNull
    private static final String j = "WORK_DATA_TYPE_UPLOADTYPE";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final BloodPressureRawDataUseCase bpUserCase;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R!\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/huami/rawdata_uploader/workmanager/BloodPressureRawDataUploadWork$Companion;", "", "Lcom/huami/rawdata_uploader/vo/RawDataUserInfo;", "rawDataUserInfo", "Lcom/huami/rawdata_uploader/vo/IRawDataType;", "dataDataType", "Landroidx/work/Data;", "createInputDataForUri", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", BloodPressureRawDataUploadWork.g, BloodPressureRawDataUploadWork.f, BloodPressureRawDataUploadWork.h, BloodPressureRawDataUploadWork.j, BloodPressureRawDataUploadWork.e, BloodPressureRawDataUploadWork.i, BloodPressureRawDataUploadWork.d, BloodPressureRawDataUploadWork.c, "<init>", "()V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Data createInputDataForUri(@NotNull RawDataUserInfo rawDataUserInfo, @NotNull IRawDataType dataDataType) {
            int i = 0;
            Pair[] pairArr = {TuplesKt.to(BloodPressureRawDataUploadWork.c, rawDataUserInfo.getUserId()), TuplesKt.to(BloodPressureRawDataUploadWork.d, rawDataUserInfo.getAppName()), TuplesKt.to(BloodPressureRawDataUploadWork.e, Integer.valueOf(dataDataType.getValue())), TuplesKt.to(BloodPressureRawDataUploadWork.f, dataDataType.getFileNamePrefix()), TuplesKt.to(BloodPressureRawDataUploadWork.g, dataDataType.getEventType()), TuplesKt.to(BloodPressureRawDataUploadWork.h, dataDataType.getSubType()), TuplesKt.to(BloodPressureRawDataUploadWork.i, dataDataType.getValueStr()), TuplesKt.to(BloodPressureRawDataUploadWork.j, dataDataType.getUploadType())};
            Data.Builder builder = new Data.Builder();
            while (i < 8) {
                Pair pair = pairArr[i];
                i++;
                builder.put((String) pair.getFirst(), pair.getSecond());
            }
            return builder.build();
        }

        public final String getTAG() {
            return BloodPressureRawDataUploadWork.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.workmanager.BloodPressureRawDataUploadWork", f = "BloodPressureRawDataUploadWork.kt", i = {}, l = {77}, m = "doWork", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BloodPressureRawDataUploadWork.this.doWork(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/ListenableWorker$Result;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.workmanager.BloodPressureRawDataUploadWork$doWork$2", f = "BloodPressureRawDataUploadWork.kt", i = {0}, l = {82, 84}, m = "invokeSuspend", n = {"it"}, s = {"L$2"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ BloodPressureRawDataUploadWork$doWork$dataDataType$1 f;
        public final /* synthetic */ RawDataUserInfo g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ BloodPressureRawDataUploadWork$doWork$dataDataType$1 a;
            public final /* synthetic */ RawDataUserInfo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BloodPressureRawDataUploadWork$doWork$dataDataType$1 bloodPressureRawDataUploadWork$doWork$dataDataType$1, RawDataUserInfo rawDataUserInfo) {
                super(0);
                this.a = bloodPressureRawDataUploadWork$doWork$dataDataType$1;
                this.b = rawDataUserInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "postFile " + this.a.getValueStr() + " " + this.b;
            }
        }

        /* JADX INFO: renamed from: com.huami.rawdata_uploader.workmanager.BloodPressureRawDataUploadWork$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0543b extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0543b(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "error " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BloodPressureRawDataUploadWork$doWork$dataDataType$1 bloodPressureRawDataUploadWork$doWork$dataDataType$1, RawDataUserInfo rawDataUserInfo, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f = bloodPressureRawDataUploadWork$doWork$dataDataType$1;
            this.g = rawDataUserInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureRawDataUploadWork.this.new b(this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ListenableWorker.Result> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x006a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            BloodPressureRawDataUploadWork$doWork$dataDataType$1 bloodPressureRawDataUploadWork$doWork$dataDataType$1;
            RawDataUserInfo rawDataUserInfo;
            BloodPressureRawDataUseCase bloodPressureRawDataUseCase;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.d;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BloodPressureRawDataUploadWork bloodPressureRawDataUploadWork = BloodPressureRawDataUploadWork.this;
                    bloodPressureRawDataUploadWork$doWork$dataDataType$1 = this.f;
                    RawDataUserInfo rawDataUserInfo2 = this.g;
                    Result.Companion companion = Result.Companion;
                    CommonExKt.commonLog(BloodPressureRawDataUploadWork.INSTANCE.getTAG(), new a(bloodPressureRawDataUploadWork$doWork$dataDataType$1, rawDataUserInfo2));
                    BloodPressureRawDataUseCase bpUserCase = bloodPressureRawDataUploadWork.getBpUserCase();
                    if (bpUserCase != null) {
                        this.a = bloodPressureRawDataUploadWork$doWork$dataDataType$1;
                        this.b = rawDataUserInfo2;
                        this.c = bpUserCase;
                        this.d = 1;
                        if (bpUserCase.postFile(rawDataUserInfo2, bloodPressureRawDataUploadWork$doWork$dataDataType$1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        rawDataUserInfo = rawDataUserInfo2;
                        bloodPressureRawDataUseCase = bpUserCase;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = 2;
                        if (bloodPressureRawDataUseCase.postFileRelation(rawDataUserInfo, bloodPressureRawDataUploadWork$doWork$dataDataType$1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i == 1) {
                    bloodPressureRawDataUseCase = (BloodPressureRawDataUseCase) this.c;
                    rawDataUserInfo = (RawDataUserInfo) this.b;
                    bloodPressureRawDataUploadWork$doWork$dataDataType$1 = (BloodPressureRawDataUploadWork$doWork$dataDataType$1) this.a;
                    ResultKt.throwOnFailure(obj);
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 2;
                    if (bloodPressureRawDataUseCase.postFileRelation(rawDataUserInfo, bloodPressureRawDataUploadWork$doWork$dataDataType$1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM3845constructorimpl = Result.m3845constructorimpl(ListenableWorker.Result.success());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                CommonExKt.commonLog(BloodPressureRawDataUploadWork.INSTANCE.getTAG(), new C0543b(thM3848exceptionOrNullimpl));
                ListenableWorker.Result.failure();
            }
            return Result.m3850isFailureimpl(objM3845constructorimpl) ? ListenableWorker.Result.success() : objM3845constructorimpl;
        }
    }

    public BloodPressureRawDataUploadWork(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Scope scopeRawDataKoinScope = RawDataInterModuleKt.rawDataKoinScope();
        this.bpUserCase = scopeRawDataKoinScope != null ? (BloodPressureRawDataUseCase) RawDataInterModuleKt.rawDataKoinScope(scopeRawDataKoinScope.getKoin()).get(Reflection.getOrCreateKotlinClass(BloodPressureRawDataUseCase.class), null, null) : null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull Continuation<? super ListenableWorker.Result> continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            String string = getInputData().getString(c);
            String string2 = getInputData().getString(d);
            if (string == null) {
                string = "";
            }
            if (string2 == null) {
                string2 = "";
            }
            RawDataUserInfo rawDataUserInfo = new RawDataUserInfo(string, string2);
            BloodPressureRawDataUploadWork$doWork$dataDataType$1 bloodPressureRawDataUploadWork$doWork$dataDataType$1 = new BloodPressureRawDataUploadWork$doWork$dataDataType$1(this);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            b bVar = new b(bloodPressureRawDataUploadWork$doWork$dataDataType$1, rawDataUserInfo, null);
            aVar.c = 1;
            objWithContext = BuildersKt.withContext(io2, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return objWithContext;
    }

    @Nullable
    public final BloodPressureRawDataUseCase getBpUserCase() {
        return this.bpUserCase;
    }
}
