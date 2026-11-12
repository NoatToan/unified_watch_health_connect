package com.huami.watchfacesstore.ui.repeatview;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/watchfacesstore/ui/repeatview/ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "url", "", "needGap", "", "updateUI", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "iv", "Landroid/view/View;", "b", "Landroid/view/View;", "gapHolder", "itemView", "<init>", "(Landroid/view/View;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ImageView iv;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final View gapHolder;

    public ViewHolder(@NotNull View view) {
        super(view);
        this.iv = (ImageView) view.findViewById(R.id.img);
        this.gapHolder = view.findViewById(R.id.placeHolder);
    }

    public final void updateUI(@NotNull String url, boolean needGap) {
        if (needGap) {
            ExtensionsKt.visible(this.gapHolder);
        } else {
            ExtensionsKt.gone(this.gapHolder);
        }
        ExtensionsKt.loadUrl(this.iv, url);
    }
}
