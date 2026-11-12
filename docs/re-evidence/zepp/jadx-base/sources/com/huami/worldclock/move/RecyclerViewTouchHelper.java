package com.huami.worldclock.move;

import androidx.recyclerview.widget.ItemTouchHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/worldclock/move/RecyclerViewTouchHelper;", "Landroidx/recyclerview/widget/ItemTouchHelper;", "", "enableDrag", "", "setEnableDrag", "enableSwipe", "setEnableSwipe", "Lcom/huami/worldclock/move/TouchCallback;", "a", "Lcom/huami/worldclock/move/TouchCallback;", "callback", "<init>", "(Lcom/huami/worldclock/move/TouchCallback;)V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class RecyclerViewTouchHelper extends ItemTouchHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TouchCallback callback;

    public RecyclerViewTouchHelper(@NotNull TouchCallback touchCallback) {
        super(touchCallback);
        this.callback = touchCallback;
    }

    public final void setEnableDrag(boolean enableDrag) {
        this.callback.setEnableDrag(enableDrag);
    }

    public final void setEnableSwipe(boolean enableSwipe) {
        this.callback.setEnableSwipe(enableSwipe);
    }
}
