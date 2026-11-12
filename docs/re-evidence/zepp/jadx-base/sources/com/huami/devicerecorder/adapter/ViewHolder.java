package com.huami.devicerecorder.adapter;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicerecorder.model.PageMode;
import com.huami.devicerecorder.model.PlayItemData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J!\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/huami/devicerecorder/adapter/ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/devicerecorder/model/PlayItemData;", "itemData", "Lcom/huami/devicerecorder/model/PageMode;", "mode", "", "onBind", "Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "", "id", "findViewById", "(I)Landroid/view/View;", "onViewDetachedFromWindow", "onViewAttachedFromWindow", "Lcom/huami/devicerecorder/adapter/IItemClickListener;", "a", "Lcom/huami/devicerecorder/adapter/IItemClickListener;", "getListener", "()Lcom/huami/devicerecorder/adapter/IItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "itemView", "<init>", "(Landroid/view/View;Lcom/huami/devicerecorder/adapter/IItemClickListener;)V", "Companion", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public abstract class ViewHolder extends RecyclerView.ViewHolder {

    @NotNull
    public static final String TAG = "RecorderFileAdapter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final IItemClickListener listener;

    public ViewHolder(@NotNull View view, @Nullable IItemClickListener iItemClickListener) {
        super(view);
        this.listener = iItemClickListener;
    }

    @NotNull
    public final <T extends View> T findViewById(@IdRes int id) {
        return (T) this.itemView.findViewById(id);
    }

    @Nullable
    public final IItemClickListener getListener() {
        return this.listener;
    }

    public abstract void onBind(@NotNull PlayItemData itemData, @NotNull PageMode mode);

    public void onViewAttachedFromWindow() {
    }

    public void onViewDetachedFromWindow() {
    }
}
