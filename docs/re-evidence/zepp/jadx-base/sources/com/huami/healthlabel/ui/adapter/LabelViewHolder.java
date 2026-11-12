package com.huami.healthlabel.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.healthlabel.R;
import com.huami.healthlabel.ui.custom.LabelTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/huami/healthlabel/ui/adapter/LabelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/healthlabel/ui/custom/LabelTextView;", "a", "Lcom/huami/healthlabel/ui/custom/LabelTextView;", "getLabelText", "()Lcom/huami/healthlabel/ui/custom/LabelTextView;", "labelText", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Companion", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class LabelViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LabelTextView labelText;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/healthlabel/ui/adapter/LabelViewHolder$Companion;", "", "Landroid/view/ViewGroup;", "parent", "Lcom/huami/healthlabel/ui/adapter/LabelViewHolder;", "create", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LabelViewHolder create(@NotNull ViewGroup parent) {
            return new LabelViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.health_label_item, parent, false));
        }
    }

    public LabelViewHolder(@NotNull View view) {
        super(view);
        this.labelText = (LabelTextView) view.findViewById(R.id.health_label_item);
    }

    @NotNull
    public final LabelTextView getLabelText() {
        return this.labelText;
    }
}
