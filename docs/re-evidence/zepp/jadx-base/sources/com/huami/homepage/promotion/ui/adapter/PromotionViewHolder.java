package com.huami.homepage.promotion.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.homepage.promotion.R;
import com.huami.homepage.promotion.beans.PromotionVo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u00126\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002RF\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001c\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/huami/homepage/promotion/ui/adapter/PromotionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/homepage/promotion/beans/PromotionVo;", "item", "", "bind", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "Lkotlin/ParameterName;", "name", "imageView", "", "url", "a", "Lkotlin/jvm/functions/Function2;", "loadImage", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "title", "c", MessengerShareContentUtility.SUBTITLE, GoogleApiAvailabilityLight.a, "Landroid/widget/ImageView;", "image", "e", "getCloseIcon", "()Landroid/widget/ImageView;", "closeIcon", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;)V", "promotion_release"}, k = 1, mv = {1, 5, 1})
public final class PromotionViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function2<ImageView, String, Unit> loadImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TextView title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TextView subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ImageView image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ImageView closeIcon;

    /* JADX WARN: Multi-variable type inference failed */
    public PromotionViewHolder(@NotNull ViewGroup viewGroup, @NotNull Function2<? super ImageView, ? super String, Unit> function2) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home_promotion, viewGroup, false));
        this.loadImage = function2;
        this.title = (TextView) this.itemView.findViewById(R.id.title);
        this.subtitle = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.image = (ImageView) this.itemView.findViewById(R.id.image);
        this.closeIcon = (ImageView) this.itemView.findViewById(R.id.close_icon);
    }

    public final void bind(@NotNull PromotionVo item) {
        this.loadImage.invoke(this.image, item.getImageUrl());
        this.title.setText(item.getTitle());
        this.subtitle.setText(item.getSubtitle());
    }

    @NotNull
    public final ImageView getCloseIcon() {
        return this.closeIcon;
    }
}
