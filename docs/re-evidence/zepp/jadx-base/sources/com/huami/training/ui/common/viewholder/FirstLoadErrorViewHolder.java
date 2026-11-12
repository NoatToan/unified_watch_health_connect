package com.huami.training.ui.common.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.training.ui.R;
import com.huami.training.ui.common.CourseLayoutDelegate;
import com.huami.training.ui.common.viewholder.FirstLoadErrorViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/huami/training/ui/common/viewholder/FirstLoadErrorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "retryCallback", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class FirstLoadErrorViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> retryCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\r"}, d2 = {"Lcom/huami/training/ui/common/viewholder/FirstLoadErrorViewHolder$Companion;", "", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "layoutDelegate", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function0;", "", "retryCallback", "Lcom/huami/training/ui/common/viewholder/FirstLoadErrorViewHolder;", "create", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FirstLoadErrorViewHolder create(@NotNull CourseLayoutDelegate layoutDelegate, @NotNull ViewGroup parent, @NotNull Function0<Unit> retryCallback) {
            return new FirstLoadErrorViewHolder(LayoutInflater.from(parent.getContext()).inflate(layoutDelegate.getFirstLoadErrorViewHolder(), parent, false), retryCallback);
        }
    }

    public FirstLoadErrorViewHolder(@NotNull View view, @NotNull Function0<Unit> function0) {
        super(view);
        this.retryCallback = function0;
        this.itemView.findViewById(R.id.retry).setOnClickListener(new View.OnClickListener() { // from class: g82
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FirstLoadErrorViewHolder.b(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(FirstLoadErrorViewHolder firstLoadErrorViewHolder, View view) {
        firstLoadErrorViewHolder.retryCallback.invoke();
    }
}
