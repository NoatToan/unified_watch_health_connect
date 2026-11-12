package com.huami.healthlabel.repository;

import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.healthlabel.db.po.HomeLabel;
import com.huami.healthlabel.entry.HomeHealthLabel;
import com.huami.healthlabel.repository.HealthLabelUseCase;
import com.huami.healthlabel.utils.ext.EntryExtKt;
import com.huami.lib.healthlabel.service.HealthLabelService;
import com.huami.lib.healthlabel.service.LoadData;
import com.huami.lib.healthlabel.service.MixLabel;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b0\u00101J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000f\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\fJ;\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010!\u001a\u00020\u00052!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00050\u0015H\u0000¢\u0006\u0004\b\u001f\u0010 J2\u0010#\u001a\u00020\u00052!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00050\u0015H\u0000¢\u0006\u0004\b\"\u0010 R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/huami/healthlabel/repository/HealthLabelUseCase;", "Lcom/huami/lib/healthlabel/service/HealthLabelService;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/lib/healthlabel/service/LoadData;", "loadHealthLabel", "", "retryLoad$healthLabel_release", "()V", "retryLoad", "Lcom/huami/lib/healthlabel/service/MixLabel;", "label", "updateRecordLabel$healthLabel_release", "(Lcom/huami/lib/healthlabel/service/MixLabel;)V", "updateRecordLabel", "insertHomeLabel$healthLabel_release", "insertHomeLabel", "", "labelText", "", "startTime", "endTime", "Lkotlin/Function1;", "", "callback", "deleteLabelRecord$healthLabel_release", "(Ljava/lang/String;JJLkotlin/jvm/functions/Function1;)V", "deleteLabelRecord", "Lkotlin/ParameterName;", "name", "hasCache", TransportUri.ACTION_BLOCK, "openRecordPage$healthLabel_release", "(Lkotlin/jvm/functions/Function1;)V", "openRecordPage", "openManagerPage$healthLabel_release", "openManagerPage", "Lcom/huami/healthlabel/repository/HealthLabelRepo;", "a", "Lcom/huami/healthlabel/repository/HealthLabelRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/healthlabel/repository/AppExecutors;", "b", "Lcom/huami/healthlabel/repository/AppExecutors;", "executor", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "retryFlow", "<init>", "(Lcom/huami/healthlabel/repository/HealthLabelRepo;Lcom/huami/healthlabel/repository/AppExecutors;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelUseCase implements HealthLabelService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthLabelRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors executor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Unit> retryFlow = new MutableLiveData<>();

    public HealthLabelUseCase(@NotNull HealthLabelRepo healthLabelRepo, @NotNull AppExecutors appExecutors) {
        this.repo = healthLabelRepo;
        this.executor = appExecutors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(HealthLabelUseCase healthLabelUseCase, String str, long j, long j2, final Function1 function1) {
        final boolean zDeleteRecordLabel = healthLabelUseCase.repo.deleteRecordLabel(str, j, j2);
        healthLabelUseCase.executor.mainThread().execute(new Runnable() { // from class: cx3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelUseCase.i(function1, zDeleteRecordLabel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HealthLabelUseCase healthLabelUseCase, MixLabel mixLabel) {
        ArrayList arrayList = new ArrayList();
        List<HomeLabel> listLoadAllManagerLabelFromLocal = healthLabelUseCase.repo.loadAllManagerLabelFromLocal();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listLoadAllManagerLabelFromLocal) {
            if (Intrinsics.areEqual(((HomeLabel) obj).getLabelText(), mixLabel.getLabelText())) {
                arrayList2.add(obj);
            }
        }
        if (!(!arrayList2.isEmpty())) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            mixLabel.setLabelId(((HomeLabel) arrayList2.get(0)).getLabelId());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listLoadAllManagerLabelFromLocal) {
            if (!Intrinsics.areEqual(((HomeLabel) obj2).getLabelText(), mixLabel.getLabelText())) {
                arrayList3.add(obj2);
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
        arrayList.add(EntryExtKt.toHomeLabel(mixLabel));
        healthLabelUseCase.repo.updateHomeLabel(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HealthLabelUseCase healthLabelUseCase, final Function1 function1) {
        final List<HomeLabel> listLoadShowHomeLabel = healthLabelUseCase.repo.loadShowHomeLabel();
        healthLabelUseCase.executor.mainThread().execute(new Runnable() { // from class: bx3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelUseCase.l(function1, listLoadShowHomeLabel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Function1 function1, List list) {
        function1.invoke(Boolean.valueOf(!list.isEmpty()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HealthLabelUseCase healthLabelUseCase, final Function1 function1) {
        final List listLoadRecordLabelFromLocal$default = HealthLabelRepo.DefaultImpls.loadRecordLabelFromLocal$default(healthLabelUseCase.repo, 0, 0L, 0L, 7, null);
        healthLabelUseCase.executor.mainThread().execute(new Runnable() { // from class: ax3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelUseCase.n(function1, listLoadRecordLabelFromLocal$default);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Function1 function1, List list) {
        function1.invoke(Boolean.valueOf(!list.isEmpty()));
    }

    public final void deleteLabelRecord$healthLabel_release(@NotNull final String labelText, final long startTime, final long endTime, @NotNull final Function1<? super Boolean, Unit> callback) {
        this.executor.diskIO().execute(new Runnable() { // from class: xw3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelUseCase.h(this.a, labelText, startTime, endTime, callback);
            }
        });
    }

    public final void insertHomeLabel$healthLabel_release(@NotNull final MixLabel label) {
        this.executor.diskIO().execute(new Runnable() { // from class: ww3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelUseCase.j(this.a, label);
            }
        });
    }

    @Override // com.huami.lib.healthlabel.service.HealthLabelService
    @NotNull
    public Flow<LoadData> loadHealthLabel() {
        Flow<LoadData> flowTransformLatest = FlowKt.transformLatest(FlowLiveDataConversions.asFlow(this.retryFlow), new HealthLabelUseCase$loadHealthLabel$$inlined$flatMapLatest$1(null, this));
        retryLoad$healthLabel_release();
        return flowTransformLatest;
    }

    public final void openManagerPage$healthLabel_release(@NotNull final Function1<? super Boolean, Unit> block) {
        this.executor.diskIO().execute(new Runnable() { // from class: zw3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelUseCase.k(this.a, block);
            }
        });
    }

    public final void openRecordPage$healthLabel_release(@NotNull final Function1<? super Boolean, Unit> block) {
        this.executor.diskIO().execute(new Runnable() { // from class: yw3
            @Override // java.lang.Runnable
            public final void run() {
                HealthLabelUseCase.m(this.a, block);
            }
        });
    }

    public final void retryLoad$healthLabel_release() {
        this.retryFlow.postValue(Unit.INSTANCE);
    }

    public final void updateRecordLabel$healthLabel_release(@NotNull MixLabel label) {
        this.repo.insertMyHealthRecord(EntryExtKt.toRecordLabel(label));
    }
}
