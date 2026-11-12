package com.huami.watch.companion.ecg.arch;

import android.app.Application;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.EcgDataRepo;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.huami.watch.companion.ecg.arch.EcgChartViewModel;
import com.huami.watch.companion.ecg.pdf.EcgReportPrint;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 A2\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J;\u0010\t\u001a\u00020\u00052'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eR\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR'\u0010$\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00100\u00100\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010(R\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b.\u0010(R\u001f\u00101\u001a\b\u0012\u0004\u0012\u00020-0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b0\u0010(R%\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e03028\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R%\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020903028\u0006@\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"Lcom/huami/watch/companion/ecg/arch/EcgChartViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "func", "g", "(Lkotlin/jvm/functions/Function2;)V", "", "timestamp", "setTimestamp", "Lcom/huami/ecg/core/model/FilterRecord;", "getRecord", "Lcom/huami/ecg/core/db/entity/EcgData;", EcgAnalyticsManagerKt.ECG, "record", "savePdf", "Lcom/huami/ecg/EcgDataRepo;", "a", "Lkotlin/Lazy;", "f", "()Lcom/huami/ecg/EcgDataRepo;", "mEcgRepo", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "ecgIdLiveData", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "c", "Landroidx/lifecycle/LiveData;", "getEcgLiveData", "()Landroidx/lifecycle/LiveData;", "ecgLiveData", "", GoogleApiAvailabilityLight.a, "getGainLiveData", "()Landroidx/lifecycle/MutableLiveData;", "gainLiveData", "e", "getSpeedLiveData", "speedLiveData", "", "getShowRawLiveData", "showRawLiveData", "getRotateLiveData", "rotateLiveData", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/huami/watch/companion/arch/Result;", "h", "Landroidx/lifecycle/MediatorLiveData;", "getRecordLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "recordLiveData", "Ljava/io/File;", "i", "getPdfFileLiveData", "pdfFileLiveData", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgChartViewModel extends AndroidViewModel {

    @NotNull
    private static final String j = "Ecg-ChartViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEcgRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> ecgIdLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<EcgData> ecgLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Float> gainLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Float> speedLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showRawLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> rotateLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Result<FilterRecord>> recordLiveData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Result<File>> pdfFileLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ecg/EcgDataRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<EcgDataRepo> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgDataRepo getA() {
            return new EcgDataRepo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgChartViewModel$safeLaunch$1", f = "EcgChartViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.c, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.c;
                this.a = 1;
                if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgChartViewModel$savePdf$1", f = "EcgChartViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ EcgData c;
        public final /* synthetic */ FilterRecord d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "生成心电文件失败";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EcgData ecgData, FilterRecord filterRecord, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = ecgData;
            this.d = filterRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EcgChartViewModel.this.new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EcgChartViewModel.this.getPdfFileLiveData().postValue(Result.loading());
            File fileGeneratePDF = EcgReportPrint.INSTANCE.getInstance().generatePDF(EcgChartViewModel.this.getApplication(), this.c, this.d);
            if (fileGeneratePDF != null) {
                EcgChartViewModel.this.getPdfFileLiveData().postValue(Result.success(fileGeneratePDF));
            } else {
                HMLog.info(EcgChartViewModel.j, a.a);
                EcgChartViewModel.this.getPdfFileLiveData().postValue(Result.error());
            }
            return Unit.INSTANCE;
        }
    }

    public EcgChartViewModel(@NotNull Application application) {
        super(application);
        this.mEcgRepo = LazyKt__LazyJVMKt.lazy(a.a);
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.ecgIdLiveData = mutableLiveData;
        LiveData<EcgData> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function() { // from class: lg1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EcgChartViewModel.e(this.a, (Long) obj);
            }
        });
        this.ecgLiveData = liveDataSwitchMap;
        MutableLiveData<Float> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(Float.valueOf(10.0f));
        Unit unit = Unit.INSTANCE;
        this.gainLiveData = mutableLiveData2;
        MutableLiveData<Float> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(Float.valueOf(25.0f));
        this.speedLiveData = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        mutableLiveData4.setValue(bool);
        this.showRawLiveData = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        mutableLiveData5.setValue(bool);
        this.rotateLiveData = mutableLiveData5;
        MediatorLiveData<Result<FilterRecord>> mediatorLiveData = new MediatorLiveData<>();
        this.recordLiveData = mediatorLiveData;
        this.pdfFileLiveData = new MediatorLiveData<>();
        mediatorLiveData.addSource(liveDataSwitchMap, new Observer() { // from class: mg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgChartViewModel.c(this.a, (EcgData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(EcgChartViewModel ecgChartViewModel, EcgData ecgData) {
        if (ecgData == null) {
            ecgChartViewModel.getRecordLiveData().postValue(Result.error());
            return;
        }
        ecgChartViewModel.getRecordLiveData().postValue(Result.loading());
        FilterRecord filterRecord = ecgChartViewModel.f().getFilterRecord(ecgData, false, true);
        if (filterRecord == null) {
            ecgChartViewModel.getRecordLiveData().postValue(Result.error());
        } else {
            ecgChartViewModel.getRecordLiveData().postValue(Result.success(filterRecord));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData e(EcgChartViewModel ecgChartViewModel, Long l) {
        return ecgChartViewModel.f().getEcgData(l == null ? 0L : l.longValue());
    }

    private final EcgDataRepo f() {
        return (EcgDataRepo) this.mEcgRepo.getValue();
    }

    private final void g(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> func) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(func, null), 2, null);
    }

    @NotNull
    public final LiveData<EcgData> getEcgLiveData() {
        return this.ecgLiveData;
    }

    @NotNull
    public final MutableLiveData<Float> getGainLiveData() {
        return this.gainLiveData;
    }

    @NotNull
    public final MediatorLiveData<Result<File>> getPdfFileLiveData() {
        return this.pdfFileLiveData;
    }

    @Nullable
    public final FilterRecord getRecord() {
        Result<FilterRecord> value = this.recordLiveData.getValue();
        if (value == null) {
            return null;
        }
        return value.getData();
    }

    @NotNull
    public final MediatorLiveData<Result<FilterRecord>> getRecordLiveData() {
        return this.recordLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getRotateLiveData() {
        return this.rotateLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowRawLiveData() {
        return this.showRawLiveData;
    }

    @NotNull
    public final MutableLiveData<Float> getSpeedLiveData() {
        return this.speedLiveData;
    }

    public final void savePdf(@NotNull EcgData ecg, @NotNull FilterRecord record) {
        g(new c(ecg, record, null));
    }

    public final void setTimestamp(long timestamp) {
        this.ecgIdLiveData.postValue(Long.valueOf(timestamp));
    }
}
