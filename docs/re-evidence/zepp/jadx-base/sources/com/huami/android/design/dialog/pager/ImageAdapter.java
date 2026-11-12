package com.huami.android.design.dialog.pager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.huami.android.design.dialog.R;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ImageAdapter<T> extends RecyclerView.Adapter<VH> {
    private final List<T> a;

    public static class VH extends RecyclerView.ViewHolder {
        private final ImageView a;

        public VH(@NonNull View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.dialog_gallery_image);
        }
    }

    public ImageAdapter(List<T> list) {
        this.a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        List<T> list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull VH vh, int i) {
        T t = this.a.get(i);
        if ((t instanceof String) || (t instanceof Integer)) {
            Glide.with(vh.itemView.getContext()).load((Object) t).into(vh.a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new VH(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dialog_gallery_item, viewGroup, false));
    }
}
