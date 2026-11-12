package com.huami.lib.qrcode.gallery.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.huami.lib.qrcode.R;
import com.huami.lib.qrcode.gallery.bean.MediaStoreImage;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class GalleryAdapter extends ListAdapter<MediaStoreImage, ImageViewHolder> {
    private OnItemClickListener a;

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        private final View a;
        private final ImageView b;

        public ImageViewHolder(@NonNull View view, final Consumer<MediaStoreImage> consumer) {
            super(view);
            this.a = view;
            this.b = (ImageView) view.findViewById(R.id.image);
            view.setOnClickListener(new View.OnClickListener() { // from class: ud2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.d(consumer, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Consumer consumer, View view) {
            consumer.accept((MediaStoreImage) this.a.getTag());
        }
    }

    public interface OnItemClickListener {
        void onItemClick(MediaStoreImage mediaStoreImage);
    }

    public static class b extends DiffUtil.ItemCallback<MediaStoreImage> {
        private b() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NonNull MediaStoreImage mediaStoreImage, @NonNull MediaStoreImage mediaStoreImage2) {
            return mediaStoreImage.equals(mediaStoreImage2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NonNull MediaStoreImage mediaStoreImage, @NonNull MediaStoreImage mediaStoreImage2) {
            return mediaStoreImage.id == mediaStoreImage2.id;
        }
    }

    public GalleryAdapter() {
        super(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MediaStoreImage mediaStoreImage) {
        OnItemClickListener onItemClickListener = this.a;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(mediaStoreImage);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.a = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull ImageViewHolder imageViewHolder, int i) {
        MediaStoreImage item = getItem(i);
        imageViewHolder.a.setTag(item);
        Glide.with(imageViewHolder.b).load(item.contentUri).thumbnail(0.33f).into(imageViewHolder.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ImageViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_gallery_layout, viewGroup, false), new Consumer() { // from class: td2
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.a.b((MediaStoreImage) obj);
            }
        });
    }
}
