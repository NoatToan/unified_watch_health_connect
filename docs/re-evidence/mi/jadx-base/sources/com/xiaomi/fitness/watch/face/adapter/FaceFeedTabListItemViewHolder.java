package com.xiaomi.fitness.watch.face.adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.adapter.FaceFeedTabListItemViewHolder;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketListItemWrapper;
import defpackage.n9e;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceFeedTabListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;", "data", "", "bindData", "(Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;)V", "Ln9e;", "binding", "Ln9e;", "Lcom/xiaomi/fitness/watch/face/adapter/FaceRecommendTabAdapter;", "tabAdapter$delegate", "Lkotlin/Lazy;", "getTabAdapter", "()Lcom/xiaomi/fitness/watch/face/adapter/FaceRecommendTabAdapter;", "tabAdapter", "<init>", "(Ln9e;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceFeedTabListItemViewHolder extends RecyclerView.d0 {

    @NotNull
    private final n9e binding;

    /* JADX INFO: renamed from: tabAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tabAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceFeedTabListItemViewHolder(@NotNull n9e binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.tabAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tw8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceFeedTabListItemViewHolder.tabAdapter_delegate$lambda$0();
            }
        });
        binding.A.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext(), 0, false));
        binding.A.setAdapter(getTabAdapter());
    }

    private final FaceRecommendTabAdapter getTabAdapter() {
        return (FaceRecommendTabAdapter) this.tabAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceRecommendTabAdapter tabAdapter_delegate$lambda$0() {
        return new FaceRecommendTabAdapter();
    }

    public final void bindData(@NotNull DeviceFaceMarketListItemWrapper data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getTabAdapter().setData(data);
    }
}
