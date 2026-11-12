package com.xiaomi.fitness.health.spo2.deprecated;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.spo2.Spo2RecordDetailFragment;
import com.xiaomi.fitness.health.spo2.Spo2ViewModel;
import com.xiaomi.fitness.health.spo2.deprecated.Spo2ManuallyMeasuredRecordsFragment;
import defpackage.jui;
import defpackage.saa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001'B\u0007¢\u0006\u0004\b&\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/health/spo2/deprecated/Spo2ManuallyMeasuredRecordsFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/spo2/Spo2ViewModel;", "Lsaa;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", "Lmiuix/recyclerview/widget/RecyclerView;", "recyclerView", "Lmiuix/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Lmiuix/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Lmiuix/recyclerview/widget/RecyclerView;)V", "Landroid/widget/TextView;", "tvNoData", "Landroid/widget/TextView;", "getTvNoData", "()Landroid/widget/TextView;", "setTvNoData", "(Landroid/widget/TextView;)V", "Lcom/xiaomi/fitness/health/spo2/deprecated/a;", "adapter", "Lcom/xiaomi/fitness/health/spo2/deprecated/a;", "getAdapter", "()Lcom/xiaomi/fitness/health/spo2/deprecated/a;", "setAdapter", "(Lcom/xiaomi/fitness/health/spo2/deprecated/a;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class Spo2ManuallyMeasuredRecordsFragment extends Hilt_Spo2ManuallyMeasuredRecordsFragment<Spo2ViewModel, saa> {
    public static final int REQ_CODE_DETAIL_FRAGMENT = 100;
    public static final int RESULT_CODE_REFRESH = 0;

    @Nullable
    private a adapter;

    @Nullable
    private RecyclerView recyclerView;

    @Nullable
    private TextView tvNoData;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(Spo2ManuallyMeasuredRecordsFragment this$0, DailyRecordItem dailyRecordItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dailyRecordItem instanceof Spo2Item) {
            Bundle bundle = new Bundle();
            bundle.putInt(Spo2RecordDetailFragment.KEY_SPO2_RECORD_TYPE, 0);
            bundle.putSerializable("spo2_record", dailyRecordItem);
            BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) Spo2RecordDetailFragment.class, bundle, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(Spo2ManuallyMeasuredRecordsFragment this$0, CombinedLoadStates it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        a aVar = this$0.adapter;
        Intrinsics.checkNotNull(aVar);
        boolean z = aVar.getItemCount() == 0;
        RecyclerView recyclerView = this$0.recyclerView;
        Intrinsics.checkNotNull(recyclerView);
        ViewExtKt.setVisible(recyclerView, !z);
        TextView textView = this$0.tvNoData;
        Intrinsics.checkNotNull(textView);
        ViewExtKt.setVisible(textView, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(Spo2ManuallyMeasuredRecordsFragment this$0, PagingData pagingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a aVar = this$0.adapter;
        Intrinsics.checkNotNull(aVar);
        Lifecycle lifecycle = this$0.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNull(pagingData);
        aVar.submitData(lifecycle, pagingData);
        return Unit.INSTANCE;
    }

    @Nullable
    public final a getAdapter() {
        return this.adapter;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.C0;
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Nullable
    public final TextView getTvNoData() {
        return this.tvNoData;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        a aVar = this.adapter;
        if (aVar != null) {
            aVar.refresh();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        this.recyclerView = ((saa) getMBinding()).B;
        this.tvNoData = ((saa) getMBinding()).C;
        a aVar = new a();
        this.adapter = aVar;
        Intrinsics.checkNotNull(aVar);
        aVar.setOnItemClickListener(new a.b() { // from class: f8n
            @Override // com.xiaomi.fitness.health.spo2.deprecated.a.b
            public final void a(DailyRecordItem dailyRecordItem) {
                Spo2ManuallyMeasuredRecordsFragment.onViewCreated$lambda$0(this.f17536a, dailyRecordItem);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = this.recyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.recyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.adapter);
        Function1<? super CombinedLoadStates, Unit> function1 = new Function1() { // from class: g8n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Spo2ManuallyMeasuredRecordsFragment.onViewCreated$lambda$1(this.f18730a, (CombinedLoadStates) obj);
            }
        };
        a aVar2 = this.adapter;
        Intrinsics.checkNotNull(aVar2);
        aVar2.addLoadStateListener(function1);
        ((Spo2ViewModel) getMViewModel()).queryAllManuallyMeasuredRecords().observe(getViewLifecycleOwner(), new Spo2ManuallyMeasuredRecordsFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h8n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Spo2ManuallyMeasuredRecordsFragment.onViewCreated$lambda$2(this.f19807a, (PagingData) obj);
            }
        }));
    }

    public final void setAdapter(@Nullable a aVar) {
        this.adapter = aVar;
    }

    public final void setRecyclerView(@Nullable RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public final void setTvNoData(@Nullable TextView textView) {
        this.tvNoData = textView;
    }
}
