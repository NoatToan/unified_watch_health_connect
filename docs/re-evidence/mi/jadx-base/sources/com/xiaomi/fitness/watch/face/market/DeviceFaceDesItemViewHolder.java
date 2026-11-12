package com.xiaomi.fitness.watch.face.market;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketListItemWrapper;
import defpackage.p1j;
import defpackage.r9e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/market/DeviceFaceDesItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;", "data", "", "bindData", "(Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;)V", "Lr9e;", "binding", "Lr9e;", "<init>", "(Lr9e;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceFaceDesItemViewHolder extends RecyclerView.d0 {

    @NotNull
    private final r9e binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFaceDesItemViewHolder(@NotNull r9e binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final void bindData(@NotNull DeviceFaceMarketListItemWrapper data) {
        Intrinsics.checkNotNullParameter(data, "data");
        r9e r9eVar = this.binding;
        ViewGroup.LayoutParams layoutParams = r9eVar.getRoot().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ExtUtilsKt.getDp(16);
        r9eVar.A.setText(ResourceExtKt.getString(p1j.i0));
    }
}
