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
import com.huami.ecg.core.model.EcgAnalysisStatus;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.passport.AccountManager;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.huami.watch.companion.ecg.arch.EcgDetailViewModel;
import com.huami.watch.companion.ecg.pdf.EcgReportPrint;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 A2\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J;\u0010\t\u001a\u00020\u00052'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0005R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR'\u0010%\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u000f0\u000f0\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R+\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'0&8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R%\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0'0&8\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b3\u00104R\u001f\u00108\u001a\b\u0012\u0004\u0012\u0002060\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b7\u00104R\u001f\u0010<\u001a\b\u0012\u0004\u0012\u0002090\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010\u001d\u001a\u0004\b;\u00104\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"Lcom/huami/watch/companion/ecg/arch/EcgDetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "func", "g", "(Lkotlin/jvm/functions/Function2;)V", "", "timestamp", "setTimestamp", "checkEcgValid", "Lcom/huami/ecg/core/db/entity/EcgData;", EcgAnalyticsManagerKt.ECG, "Lcom/huami/ecg/core/model/FilterRecord;", "record", "savePdf", "deleteLocal", "Lcom/huami/ecg/EcgDataRepo;", "a", "Lkotlin/Lazy;", "f", "()Lcom/huami/ecg/EcgDataRepo;", "mEcgRepo", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "ecgIdData", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "c", "Landroidx/lifecycle/LiveData;", "getEcgLiveData", "()Landroidx/lifecycle/LiveData;", "ecgLiveData", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/huami/watch/companion/arch/Result;", "", "", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MediatorLiveData;", "getChartDataLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "chartDataLiveData", "Ljava/io/File;", "e", "getPdfFileLiveData", "pdfFileLiveData", "getFilterRecordData", "()Landroidx/lifecycle/MutableLiveData;", "filterRecordData", "", "getEcgValidData", "ecgValidData", "Lcom/huami/ecg/core/model/EcgAnalysisStatus;", "h", "getEcgAnalysisStatus", "ecgAnalysisStatus", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgDetailViewModel extends AndroidViewModel {

    @NotNull
    private static final String i = "EcgDetailViewModel";
    private static final float j = 1.2f;
    private static final float k = -1.2f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEcgRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> ecgIdData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<EcgData> ecgLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Result<List<Float>>> chartDataLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Result<File>> pdfFileLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<FilterRecord> filterRecordData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> ecgValidData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<EcgAnalysisStatus> ecgAnalysisStatus;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgDetailViewModel$1$1$1", f = "EcgDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ EcgData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EcgData ecgData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = ecgData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EcgDetailViewModel.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FilterRecord filterRecord = EcgDetailViewModel.this.f().getFilterRecord(this.c, false, true);
            EcgDetailViewModel.this.getFilterRecordData().postValue(filterRecord);
            if (filterRecord == null) {
                EcgDetailViewModel.this.getChartDataLiveData().postValue(Result.error());
            } else {
                MediatorLiveData<Result<List<Float>>> chartDataLiveData = EcgDetailViewModel.this.getChartDataLiveData();
                List<Float> filterData = filterRecord.getFilterData();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filterData, 10));
                Iterator<T> it2 = filterData.iterator();
                while (it2.hasNext()) {
                    float fFloatValue = ((Number) it2.next()).floatValue();
                    if (fFloatValue > EcgDetailViewModel.j) {
                        fFloatValue = EcgDetailViewModel.j;
                    } else if (fFloatValue < EcgDetailViewModel.k) {
                        fFloatValue = EcgDetailViewModel.k;
                    }
                    arrayList.add(Boxing.boxFloat(fFloatValue));
                }
                chartDataLiveData.postValue(Result.success(arrayList));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgDetailViewModel$checkEcgValid$1", f = "EcgDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EcgDetailViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EcgAnalysisStatus ecgAnalysisStatusUpdateEcgStatusFromServer = EcgDetailViewModel.this.f().updateEcgStatusFromServer(AccountManager.getDefault(EcgDetailViewModel.this.getApplication()).getCurrentUid(), this.c);
            EcgDetailViewModel.this.getEcgAnalysisStatus().postValue(ecgAnalysisStatusUpdateEcgStatusFromServer == null ? EcgAnalysisStatus.NotAnalysis.INSTANCE : ecgAnalysisStatusUpdateEcgStatusFromServer);
            EcgDetailViewModel.this.getEcgValidData().postValue(Boxing.boxBoolean(ecgAnalysisStatusUpdateEcgStatusFromServer != null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ecg/EcgDataRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<EcgDataRepo> {
        public static final c a = new c();

        public c() {
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
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgDetailViewModel$safeLaunch$1", f = "EcgDetailViewModel.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(this.c, continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgDetailViewModel$savePdf$1", f = "EcgDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
        public e(EcgData ecgData, FilterRecord filterRecord, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = ecgData;
            this.d = filterRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EcgDetailViewModel.this.new e(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EcgDetailViewModel.this.getPdfFileLiveData().postValue(Result.loading());
            File fileGeneratePDF = EcgReportPrint.INSTANCE.getInstance().generatePDF(EcgDetailViewModel.this.getApplication(), this.c, this.d);
            if (fileGeneratePDF == null) {
                HMLog.info(EcgDetailViewModel.i, a.a);
                EcgDetailViewModel.this.getPdfFileLiveData().postValue(Result.error());
            } else {
                EcgDetailViewModel.this.getPdfFileLiveData().postValue(Result.success(fileGeneratePDF));
            }
            return Unit.INSTANCE;
        }
    }

    public EcgDetailViewModel(@NotNull Application application) {
        super(application);
        this.mEcgRepo = LazyKt__LazyJVMKt.lazy(c.a);
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.ecgIdData = mutableLiveData;
        LiveData<EcgData> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function() { // from class: ah1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EcgDetailViewModel.e(this.a, (Long) obj);
            }
        });
        this.ecgLiveData = liveDataSwitchMap;
        MediatorLiveData<Result<List<Float>>> mediatorLiveData = new MediatorLiveData<>();
        this.chartDataLiveData = mediatorLiveData;
        this.pdfFileLiveData = new MediatorLiveData<>();
        this.filterRecordData = new MutableLiveData<>();
        this.ecgValidData = new MutableLiveData<>();
        this.ecgAnalysisStatus = new MutableLiveData<>();
        mediatorLiveData.addSource(liveDataSwitchMap, new Observer() { // from class: bh1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgDetailViewModel.c(this.a, (EcgData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(EcgDetailViewModel ecgDetailViewModel, EcgData ecgData) {
        if (ecgData == null) {
            return;
        }
        ecgDetailViewModel.g(ecgDetailViewModel.new a(ecgData, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData e(EcgDetailViewModel ecgDetailViewModel, Long l) {
        return ecgDetailViewModel.f().getEcgData(l == null ? 0L : l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcgDataRepo f() {
        return (EcgDataRepo) this.mEcgRepo.getValue();
    }

    private final void g(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> func) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(func, null), 2, null);
    }

    public final void checkEcgValid(long timestamp) {
        g(new b(timestamp, null));
    }

    public final void deleteLocal() {
        EcgData value = this.ecgLiveData.getValue();
        if (value == null) {
            return;
        }
        f().deleteEcgLocal(value);
    }

    @NotNull
    public final MediatorLiveData<Result<List<Float>>> getChartDataLiveData() {
        return this.chartDataLiveData;
    }

    @NotNull
    public final MutableLiveData<EcgAnalysisStatus> getEcgAnalysisStatus() {
        return this.ecgAnalysisStatus;
    }

    @NotNull
    public final LiveData<EcgData> getEcgLiveData() {
        return this.ecgLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getEcgValidData() {
        return this.ecgValidData;
    }

    @NotNull
    public final MutableLiveData<FilterRecord> getFilterRecordData() {
        return this.filterRecordData;
    }

    @NotNull
    public final MediatorLiveData<Result<File>> getPdfFileLiveData() {
        return this.pdfFileLiveData;
    }

    public final void savePdf(@NotNull EcgData ecg, @NotNull FilterRecord record) {
        g(new e(ecg, record, null));
    }

    public final void setTimestamp(long timestamp) {
        this.ecgIdData.postValue(Long.valueOf(timestamp));
    }
}
