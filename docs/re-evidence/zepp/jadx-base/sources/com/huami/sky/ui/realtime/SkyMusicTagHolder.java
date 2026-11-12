package com.huami.sky.ui.realtime;

import androidx.recyclerview.widget.RecyclerView;
import com.huami.sky.ui.databinding.SkyRealtimeMusicTagItemBinding;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/sky/ui/realtime/SkyMusicTagHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/sky/ui/databinding/SkyRealtimeMusicTagItemBinding;", "a", "Lcom/huami/sky/ui/databinding/SkyRealtimeMusicTagItemBinding;", "getBinding", "()Lcom/huami/sky/ui/databinding/SkyRealtimeMusicTagItemBinding;", "binding", "<init>", "(Lcom/huami/sky/ui/databinding/SkyRealtimeMusicTagItemBinding;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyMusicTagHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SkyRealtimeMusicTagItemBinding binding;

    public SkyMusicTagHolder(@NotNull SkyRealtimeMusicTagItemBinding skyRealtimeMusicTagItemBinding) {
        super(skyRealtimeMusicTagItemBinding.getRoot());
        this.binding = skyRealtimeMusicTagItemBinding;
    }

    @NotNull
    public final SkyRealtimeMusicTagItemBinding getBinding() {
        return this.binding;
    }
}
