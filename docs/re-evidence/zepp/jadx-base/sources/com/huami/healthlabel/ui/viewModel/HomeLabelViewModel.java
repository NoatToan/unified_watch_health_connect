package com.huami.healthlabel.ui.viewModel;

import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.db.po.HealthLabel;
import com.huami.healthlabel.db.po.HomeLabel;
import com.huami.healthlabel.entry.HealthTagRecord;
import com.huami.healthlabel.entry.HomeHealthLabel;
import com.huami.healthlabel.koin.ScopesAndQualifersKt;
import com.huami.healthlabel.repository.HealthLabelRepo;
import com.huami.healthlabel.utils.SpUtilsKt;
import com.huami.healthlabel.utils.ext.EntryExtKt;
import com.huami.lib.healthlabel.service.MixLabel;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated(message = "卡片形式下废弃")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\u0002H\u0007J)\u0010\u0010\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00020\nJ\u0006\u0010\u0011\u001a\u00020\u0002J)\u0010\u0012\u001a\u00020\u00022!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00020\nJ\u001e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0002R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020$0 8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010'R\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010'R\u001f\u00102\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/huami/healthlabel/ui/viewModel/HomeLabelViewModel;", "Landroidx/lifecycle/ViewModel;", "", "a", "retryLoad", "Lcom/huami/lib/healthlabel/service/MixLabel;", "label", "updateRecordLabel", "insertHomeLabel", "hasHealthRecordCache", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "hasCache", TransportUri.ACTION_BLOCK, "openRecordPage", "hasManagerLabelCache", "openManagerPage", "", "labelText", "", "startTime", "endTime", "deleteLabelRecord", "clearHomeLabelCache", "Lcom/huami/healthlabel/repository/HealthLabelRepo;", "Lcom/huami/healthlabel/repository/HealthLabelRepo;", CommonLanguageSettingFragment.KEY_REPO, "b", "Z", "firstLoad", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "refresh", "Lcom/huami/healthlabel/ui/viewModel/FirstLoad;", GoogleApiAvailabilityLight.a, "getHasCacheData", "()Landroidx/lifecycle/MutableLiveData;", "hasCacheData", "e", "getDeleteLabel", "deleteLabel", "Landroidx/lifecycle/LiveData;", "Lcom/huami/healthlabel/ui/viewModel/HomeLabelViewModel$LoadData;", "f", "Landroidx/lifecycle/LiveData;", "getShowHomeLabel", "()Landroidx/lifecycle/LiveData;", "showHomeLabel", "<init>", "(Lcom/huami/healthlabel/repository/HealthLabelRepo;)V", "LoadData", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HomeLabelViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthLabelRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean firstLoad = true;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Unit> refresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<FirstLoad> hasCacheData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> deleteLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<LoadData> showHomeLabel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/healthlabel/ui/viewModel/HomeLabelViewModel$LoadData;", "", "", "component1", "", "Lcom/huami/lib/healthlabel/service/MixLabel;", "component2", "loadFromDb", "datas", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getLoadFromDb", "()Z", "b", "Ljava/util/List;", "getDatas", "()Ljava/util/List;", "<init>", "(ZLjava/util/List;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class LoadData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final boolean loadFromDb;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final List<MixLabel> datas;

        public LoadData(boolean z, @NotNull List<MixLabel> list) {
            this.loadFromDb = z;
            this.datas = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoadData copy$default(LoadData loadData, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loadData.loadFromDb;
            }
            if ((i & 2) != 0) {
                list = loadData.datas;
            }
            return loadData.copy(z, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getLoadFromDb() {
            return this.loadFromDb;
        }

        @NotNull
        public final List<MixLabel> component2() {
            return this.datas;
        }

        @NotNull
        public final LoadData copy(boolean loadFromDb, @NotNull List<MixLabel> datas) {
            return new LoadData(loadFromDb, datas);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadData)) {
                return false;
            }
            LoadData loadData = (LoadData) other;
            return this.loadFromDb == loadData.loadFromDb && Intrinsics.areEqual(this.datas, loadData.datas);
        }

        @NotNull
        public final List<MixLabel> getDatas() {
            return this.datas;
        }

        public final boolean getLoadFromDb() {
            return this.loadFromDb;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.loadFromDb;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + this.datas.hashCode();
        }

        @NotNull
        public String toString() {
            return "LoadData(loadFromDb=" + this.loadFromDb + ", datas=" + this.datas + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.healthlabel.ui.viewModel.HomeLabelViewModel$deleteLabelRecord$1", f = "HomeLabelViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j, long j2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = j;
            this.e = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HomeLabelViewModel.this.new a(this.c, this.d, this.e, continuation);
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
            HomeLabelViewModel.this.getDeleteLabel().postValue(Boxing.boxBoolean(HomeLabelViewModel.this.repo.deleteRecordLabel(this.c, this.d, this.e)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.healthlabel.ui.viewModel.HomeLabelViewModel$firstLoadHandle$1", f = "HomeLabelViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HomeLabelViewModel.this.new b(continuation);
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
            try {
                JSONArray jSONArray = new JSONArray(SpUtilsKt.getHealthLabelRecord());
                HomeLabelViewModel homeLabelViewModel = HomeLabelViewModel.this;
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    HealthLabel healthLabelQuerySingleLabel = ScopesAndQualifersKt.labelDb(ScopesAndQualifersKt.getKoin()).healthLabelDao().querySingleLabel(jSONArray.optLong(i));
                    if (healthLabelQuerySingleLabel != null) {
                        arrayList.add(EntryExtKt.convert(healthLabelQuerySingleLabel));
                    }
                }
                if (!arrayList.isEmpty()) {
                    homeLabelViewModel.repo.insertMyHealthRecordFromDb(arrayList);
                }
            } catch (JSONException unused) {
            }
            SpUtilsKt.setHealthLabelRecord(new JSONArray().toString());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.healthlabel.ui.viewModel.HomeLabelViewModel$hasHealthRecordCache$1", f = "HomeLabelViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HomeLabelViewModel.this.new c(continuation);
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
            HomeLabelViewModel.this.getHasCacheData().postValue(new RecordLabel(!HealthLabelRepo.DefaultImpls.loadRecordLabelFromLocal$default(HomeLabelViewModel.this.repo, 0, 0L, 0L, 7, null).isEmpty()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.healthlabel.ui.viewModel.HomeLabelViewModel$hasManagerLabelCache$1", f = "HomeLabelViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HomeLabelViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HomeLabelViewModel.this.getHasCacheData().postValue(new ManagerLabel(!HomeLabelViewModel.this.repo.loadShowHomeLabel().isEmpty()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.healthlabel.ui.viewModel.HomeLabelViewModel$insertHomeLabel$1", f = "HomeLabelViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MixLabel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MixLabel mixLabel, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = mixLabel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HomeLabelViewModel.this.new e(this.c, continuation);
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
            ArrayList arrayList = new ArrayList();
            List<HomeLabel> listLoadAllManagerLabelFromLocal = HomeLabelViewModel.this.repo.loadAllManagerLabelFromLocal();
            MixLabel mixLabel = this.c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listLoadAllManagerLabelFromLocal) {
                if (Intrinsics.areEqual(((HomeLabel) obj2).getLabelText(), mixLabel.getLabelText())) {
                    arrayList2.add(obj2);
                }
            }
            if (!(!arrayList2.isEmpty())) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                mixLabel.setLabelId(((HomeLabel) arrayList2.get(0)).getLabelId());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : listLoadAllManagerLabelFromLocal) {
                if (!Intrinsics.areEqual(((HomeLabel) obj3).getLabelText(), mixLabel.getLabelText())) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                HomeHealthLabel homeHealthLabelConvert = EntryExtKt.convert((HomeLabel) it2.next());
                homeHealthLabelConvert.setSort(homeHealthLabelConvert.getSort() + 1);
                arrayList4.add(homeHealthLabelConvert);
            }
            arrayList.addAll(arrayList4);
            arrayList.add(EntryExtKt.toHomeLabel(this.c));
            HomeLabelViewModel.this.repo.updateHomeLabel(arrayList);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.healthlabel.ui.viewModel.HomeLabelViewModel$openManagerPage$1", f = "HomeLabelViewModel.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Boolean, Unit> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.healthlabel.ui.viewModel.HomeLabelViewModel$openManagerPage$1$1", f = "HomeLabelViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function1<Boolean, Unit> b;
            public final /* synthetic */ List<HomeLabel> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Boolean, Unit> function1, List<HomeLabel> list, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function1;
                this.c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.invoke(Boxing.boxBoolean(!this.c.isEmpty()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super Boolean, Unit> function1, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HomeLabelViewModel.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<HomeLabel> listLoadShowHomeLabel = HomeLabelViewModel.this.repo.loadShowHomeLabel();
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(this.c, listLoadShowHomeLabel, null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.huami.healthlabel.ui.viewModel.HomeLabelViewModel$openRecordPage$1", f = "HomeLabelViewModel.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Boolean, Unit> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.healthlabel.ui.viewModel.HomeLabelViewModel$openRecordPage$1$1", f = "HomeLabelViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function1<Boolean, Unit> b;
            public final /* synthetic */ List<HealthTagRecord> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Boolean, Unit> function1, List<HealthTagRecord> list, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function1;
                this.c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                this.b.invoke(Boxing.boxBoolean(!this.c.isEmpty()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Boolean, Unit> function1, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HomeLabelViewModel.this.new g(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List listLoadRecordLabelFromLocal$default = HealthLabelRepo.DefaultImpls.loadRecordLabelFromLocal$default(HomeLabelViewModel.this.repo, 0, 0L, 0L, 7, null);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(this.c, listLoadRecordLabelFromLocal$default, null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "加载健康标签数据";
        }
    }

    public HomeLabelViewModel(@NotNull HealthLabelRepo healthLabelRepo) {
        this.repo = healthLabelRepo;
        MutableLiveData<Unit> mutableLiveData = new MutableLiveData<>();
        this.refresh = mutableLiveData;
        this.hasCacheData = new MutableLiveData<>();
        this.deleteLabel = new MutableLiveData<>();
        LiveData<LoadData> liveDataAsLiveData$default = FlowLiveDataConversions.asLiveData$default(FlowKt.transformLatest(FlowLiveDataConversions.asFlow(mutableLiveData), new HomeLabelViewModel$special$$inlined$flatMapLatest$1(null, this)), (CoroutineContext) null, 0L, 3, (Object) null);
        retryLoad();
        Unit unit = Unit.INSTANCE;
        this.showHomeLabel = liveDataAsLiveData$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        if (this.firstLoad) {
            this.firstLoad = false;
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
        }
    }

    public final void clearHomeLabelCache() {
        this.repo.clearHomeLabelCache();
    }

    public final void deleteLabelRecord(@NotNull String labelText, long startTime, long endTime) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(labelText, startTime, endTime, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeleteLabel() {
        return this.deleteLabel;
    }

    @NotNull
    public final MutableLiveData<FirstLoad> getHasCacheData() {
        return this.hasCacheData;
    }

    @NotNull
    public final LiveData<LoadData> getShowHomeLabel() {
        return this.showHomeLabel;
    }

    @Deprecated(message = "使用 openRecordPage 替代")
    public final void hasHealthRecordCache() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(null), 2, null);
    }

    public final void hasManagerLabelCache() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(null), 2, null);
    }

    public final void insertHomeLabel(@NotNull MixLabel label) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(label, null), 2, null);
    }

    public final void openManagerPage(@NotNull Function1<? super Boolean, Unit> block) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new f(block, null), 2, null);
    }

    public final void openRecordPage(@NotNull Function1<? super Boolean, Unit> block) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new g(block, null), 2, null);
    }

    public final void retryLoad() {
        HMLog.debug("HealthLabel", h.a);
        this.refresh.postValue(Unit.INSTANCE);
    }

    public final void updateRecordLabel(@NotNull MixLabel label) {
        this.repo.insertMyHealthRecord(EntryExtKt.toRecordLabel(label));
    }
}
