package com.xiaomi.fitness.widget.carousel;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/widget/carousel/CarouselBannerViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "data", "", "bindData", "(ILjava/lang/Object;)V", "onClick", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "widget_release"}, k = 1, mv = {2, 0, 0})
public abstract class CarouselBannerViewHolder<T> extends RecyclerView.d0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselBannerViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public abstract void bindData(int position, T data);

    public abstract void onClick(int position, T data);
}
