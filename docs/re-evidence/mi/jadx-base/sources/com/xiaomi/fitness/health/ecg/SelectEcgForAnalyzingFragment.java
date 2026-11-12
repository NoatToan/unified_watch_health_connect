package com.xiaomi.fitness.health.ecg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.ecg.SelectEcgForAnalyzingFragment;
import com.xiaomi.fitness.health.ecg.data.EcgConstantsKt;
import com.xiaomi.fitness.health.ecg.recycler.EcgSnippetListAdapter;
import com.xiaomi.fitness.health.ecg.util.EcgTrackHelper;
import com.xiaomi.fitness.health.ecg.web.EcgWebViewActivityKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.mine.export.IWebSync;
import defpackage.avb;
import defpackage.c0j;
import defpackage.iji;
import defpackage.jui;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J!\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/SelectEcgForAnalyzingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/ecg/EcgViewModel;", "Lavb;", "", "initAdapter", "()V", "initButtons", "goToSubmitForAnalyzingH5", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter;", "adapter", "Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter;", "setAdapter", "(Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter;)V", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SelectEcgForAnalyzingFragment extends Hilt_SelectEcgForAnalyzingFragment<EcgViewModel, avb> {

    @NotNull
    public static final String TAG = "SelectEcgToAnalyzeFragment";
    public EcgSnippetListAdapter adapter;

    public SelectEcgForAnalyzingFragment() {
        super(jui.E3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToSubmitForAnalyzingH5() {
        EcgMedicalItemReport checkedReport = getAdapter().getCheckedReport();
        if (checkedReport == null) {
            return;
        }
        EcgTrackHelper.INSTANCE.trackSubmitReportClick("ecg_quick_sub_list");
        EcgWebViewActivityKt.startEcgWebActivity(EcgConstantsKt.getHlwUrl("submit_report"), checkedReport, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAdapter() {
        RadioGroup radioGroup = ((avb) getMBinding()).E;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        setAdapter(new EcgSnippetListAdapter(true, radioGroup, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), new h.f<EcgMedicalItemReport>() { // from class: com.xiaomi.fitness.health.ecg.SelectEcgForAnalyzingFragment.initAdapter.1
            @Override // androidx.recyclerview.widget.h.f
            public boolean areContentsTheSame(EcgMedicalItemReport oldItem, EcgMedicalItemReport newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getTimestamp() == newItem.getTimestamp() && oldItem.getInterpretStatus() == newItem.getInterpretStatus() && Intrinsics.areEqual(oldItem.getOccurFrequency(), newItem.getOccurFrequency()) && oldItem.getMeasureTime() == newItem.getMeasureTime() && oldItem.getMeasureDuration() == newItem.getMeasureDuration() && oldItem.getSampleFrequency() == newItem.getSampleFrequency() && Intrinsics.areEqual(oldItem.getAvgHr(), newItem.getAvgHr()) && Objects.equals(oldItem.getSid(), newItem.getSid()) && Objects.equals(oldItem.getSymptomList(), newItem.getSymptomList()) && Objects.equals(oldItem.getSceneList(), newItem.getSceneList());
            }

            @Override // androidx.recyclerview.widget.h.f
            public boolean areItemsTheSame(EcgMedicalItemReport oldItem, EcgMedicalItemReport newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getTimestamp() == newItem.getTimestamp() && oldItem.getInterpretStatus() == newItem.getInterpretStatus() && Intrinsics.areEqual(oldItem.getOccurFrequency(), newItem.getOccurFrequency()) && oldItem.getMeasureTime() == newItem.getMeasureTime() && oldItem.getMeasureDuration() == newItem.getMeasureDuration() && oldItem.getSampleFrequency() == newItem.getSampleFrequency() && Intrinsics.areEqual(oldItem.getAvgHr(), newItem.getAvgHr()) && Objects.equals(oldItem.getSid(), newItem.getSid()) && Objects.equals(oldItem.getSymptomList(), newItem.getSymptomList()) && Objects.equals(oldItem.getSceneList(), newItem.getSceneList());
            }
        }));
        getAdapter().addLoadStateListener(new Function1() { // from class: dsl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SelectEcgForAnalyzingFragment.initAdapter$lambda$0(this.f15893a, (CombinedLoadStates) obj);
            }
        });
        getAdapter().setOnItemClickListener(new EcgSnippetListAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.health.ecg.SelectEcgForAnalyzingFragment.initAdapter.3
            @Override // com.xiaomi.fitness.health.ecg.recycler.EcgSnippetListAdapter.OnItemClickListener
            public void onClick(EcgMedicalItemReport ecgSnippet) {
                Intrinsics.checkNotNullParameter(ecgSnippet, "ecgSnippet");
                Intent intent = new Intent(SelectEcgForAnalyzingFragment.this.requireActivity(), (Class<?>) EcgItemDetailActivity.class);
                intent.putExtra(EcgConstantsKt.PARAM_REPORT, ecgSnippet);
                SelectEcgForAnalyzingFragment.this.startActivity(intent);
            }
        });
        ((avb) getMBinding()).D.setAdapter(getAdapter());
        ((EcgViewModel) getMViewModel()).queryNotInterpretedRecords(10, 10).observe(getViewLifecycleOwner(), new SelectEcgForAnalyzingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: esl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SelectEcgForAnalyzingFragment.initAdapter$lambda$1(this.f17025a, (PagingData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initAdapter$lambda$0(SelectEcgForAnalyzingFragment this$0, CombinedLoadStates it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z = this$0.getAdapter().getItemCount() == 0;
        RecyclerView ecgList = ((avb) this$0.getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(ecgList, "ecgList");
        ViewExtKt.setVisible(ecgList, !z);
        AppCompatTextView tvNoData = ((avb) this$0.getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(tvNoData, "tvNoData");
        ViewExtKt.setVisible(tvNoData, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initAdapter$lambda$1(SelectEcgForAnalyzingFragment this$0, PagingData pagingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcgSnippetListAdapter adapter = this$0.getAdapter();
        Lifecycle lifecycle = this$0.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNull(pagingData);
        adapter.submitData(lifecycle, pagingData);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initButtons() {
        ViewExtKt.clickWithTrigger$default(((avb) getMBinding()).B, 0L, new Function1() { // from class: fsl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SelectEcgForAnalyzingFragment.initButtons$lambda$2(this.f18162a, (TextView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(((avb) getMBinding()).C, 0L, new Function1() { // from class: gsl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SelectEcgForAnalyzingFragment.initButtons$lambda$3(this.f19301a, (TextView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initButtons$lambda$2(SelectEcgForAnalyzingFragment this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initButtons$lambda$3(final SelectEcgForAnalyzingFragment this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        MainHelper mainExtKt = MainExtKt.getInstance(MainHelper.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        mainExtKt.showSportHealthCloudSynDialogIfNeed(fragmentActivityRequireActivity, new IWebSync() { // from class: com.xiaomi.fitness.health.ecg.SelectEcgForAnalyzingFragment$initButtons$2$1
            @Override // com.xiaomi.fitness.mine.export.IWebSync
            public void onPrivacyNotAgree() {
                IWebSync.DefaultImpls.onPrivacyNotAgree(this);
            }

            @Override // com.xiaomi.fitness.mine.export.IWebSync
            public void onWebSyncAccepted() {
                this.this$0.goToSubmitForAnalyzingH5();
            }

            @Override // com.xiaomi.fitness.mine.export.IWebSync
            public void onWebSyncDenied() {
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c0j.ko);
            }
        });
        return Unit.INSTANCE;
    }

    @NotNull
    public final EcgSnippetListAdapter getAdapter() {
        EcgSnippetListAdapter ecgSnippetListAdapter = this.adapter;
        if (ecgSnippetListAdapter != null) {
            return ecgSnippetListAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.Q7);
        UIUtils uIUtils = UIUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        uIUtils.setNavigationBarColor(fragmentActivityRequireActivity, iji.T2);
        setTitleBackground(iji.T2);
        initAdapter();
        initButtons();
    }

    public final void setAdapter(@NotNull EcgSnippetListAdapter ecgSnippetListAdapter) {
        Intrinsics.checkNotNullParameter(ecgSnippetListAdapter, "<set-?>");
        this.adapter = ecgSnippetListAdapter;
    }
}
