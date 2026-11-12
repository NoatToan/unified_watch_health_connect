package com.xiaomi.hm.health.training.ui.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.ui.adapter.viewholder.LoadMoreViewHolder;

/* JADX INFO: loaded from: classes21.dex */
public class LoadMoreViewHolder extends RecyclerView.ViewHolder {
    private View a;
    private View b;

    private LoadMoreViewHolder(@NonNull View view, @Nullable final Runnable runnable) {
        super(view);
        this.a = view.findViewById(R.id.load_more_loading_view);
        View viewFindViewById = view.findViewById(R.id.load_more_load_fail_view);
        this.b = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: rp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LoadMoreViewHolder.b(runnable, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
    }

    private static int c(boolean z) {
        return z ? 0 : 8;
    }

    public static LoadMoreViewHolder create(@NonNull ViewGroup viewGroup, @Nullable Runnable runnable) {
        return new LoadMoreViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.quick_view_load_more, viewGroup, false), runnable);
    }

    public void bind(@Nullable Resource<Void> resource) {
        if (resource == null) {
            return;
        }
        Status status = resource.getStatus();
        this.a.setVisibility(c(status == Status.LOADING));
        this.b.setVisibility(c(status == Status.ERROR));
    }
}
