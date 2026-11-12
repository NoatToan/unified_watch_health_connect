package com.xiaomi.fitness.health.temperature.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.temperature.TemperatureViewModel;
import com.xiaomi.fitness.health.temperature.ui.TemperatureAllRecordsFragment;
import defpackage.c0j;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B\u0007¢\u0006\u0004\b*\u0010+J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/ui/TemperatureAllRecordsFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/temperature/TemperatureViewModel;", "Lsaa;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lmiuix/recyclerview/widget/RecyclerView;", "recyclerView", "Lmiuix/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Lmiuix/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Lmiuix/recyclerview/widget/RecyclerView;)V", "Landroid/widget/TextView;", "tvNoData", "Landroid/widget/TextView;", "getTvNoData", "()Landroid/widget/TextView;", "setTvNoData", "(Landroid/widget/TextView;)V", "Lcom/xiaomi/fitness/health/temperature/ui/a;", "adapter", "Lcom/xiaomi/fitness/health/temperature/ui/a;", "getAdapter", "()Lcom/xiaomi/fitness/health/temperature/ui/a;", "setAdapter", "(Lcom/xiaomi/fitness/health/temperature/ui/a;)V", "getLayoutId", "()I", "layoutId", "<init>", "()V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TemperatureAllRecordsFragment extends Hilt_TemperatureAllRecordsFragment<TemperatureViewModel, saa> {
    public static final int DETAIL_FRAGMENT_REQ_CODE = 100;
    public static final int RESULT_CODE_REFRESH = 2;

    @Nullable
    private a adapter;

    @Nullable
    private RecyclerView recyclerView;

    @Nullable
    private TextView tvNoData;

    public TemperatureAllRecordsFragment() {
        super(jui.C0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(TemperatureAllRecordsFragment this$0, TemperatureItem temperatureItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putSerializable(TemperatureRecordDetailFragment.PARAM_RECORD, temperatureItem);
        BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) TemperatureRecordDetailFragment.class, bundle, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(TemperatureAllRecordsFragment this$0, CombinedLoadStates it) {
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
    public static final Unit onViewCreated$lambda$2(TemperatureAllRecordsFragment this$0, PagingData pagingData) {
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

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        a aVar;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == 2 && (aVar = this.adapter) != null) {
            aVar.refresh();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.h5);
        this.recyclerView = ((saa) getMBinding()).B;
        this.tvNoData = ((saa) getMBinding()).C;
        a aVar = new a();
        this.adapter = aVar;
        Intrinsics.checkNotNull(aVar);
        aVar.setOnItemClickListener(new a.c() { // from class: m2p
            @Override // com.xiaomi.fitness.health.temperature.ui.a.c
            public final void a(TemperatureItem temperatureItem) {
                TemperatureAllRecordsFragment.onViewCreated$lambda$0(this.f25687a, temperatureItem);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = this.recyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.recyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.adapter);
        Function1<? super CombinedLoadStates, Unit> function1 = new Function1() { // from class: n2p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TemperatureAllRecordsFragment.onViewCreated$lambda$1(this.f27490a, (CombinedLoadStates) obj);
            }
        };
        a aVar2 = this.adapter;
        Intrinsics.checkNotNull(aVar2);
        aVar2.addLoadStateListener(function1);
        ((TemperatureViewModel) getMViewModel()).queryAllRecords().observe(getViewLifecycleOwner(), new TemperatureAllRecordsFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o2p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TemperatureAllRecordsFragment.onViewCreated$lambda$2(this.f28681a, (PagingData) obj);
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
