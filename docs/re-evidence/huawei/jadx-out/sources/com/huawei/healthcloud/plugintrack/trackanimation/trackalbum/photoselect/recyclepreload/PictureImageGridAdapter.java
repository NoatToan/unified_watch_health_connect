package com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import defpackage.jhi;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class PictureImageGridAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<PhotoModel> f10768b = new ArrayList();
    private OnPhotoSelectChangedListener d = null;
    private Context e;

    public PictureImageGridAdapter(Context context) {
        this.e = null;
        this.e = context;
    }

    public void c(OnPhotoSelectChangedListener onPhotoSelectChangedListener) {
        this.d = onPhotoSelectChangedListener;
    }

    public void b(List<PhotoModel> list) {
        if (list != null) {
            this.f10768b = list;
            Log.i("PictureImageGridAdapter", "add data");
        }
        notifyDataSetChanged();
    }

    public boolean e() {
        List<PhotoModel> list = this.f10768b;
        return list == null || list.size() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.e).inflate(R.layout.trackalbum_image_grid_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (jhi.d(this.e)) {
            qqf.a(this.e, viewHolder2.d);
        }
        viewHolder2.d.setImageDrawable(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i >= 0 && (viewHolder instanceof ViewHolder)) {
            final ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            PhotoModel photoModel = this.f10768b.get(i);
            viewHolder2.f10771c = i;
            viewHolder2.d.setEnabled(false);
            viewHolder2.f10770b.setEnabled(false);
            viewHolder2.f10769a.setEnabled(false);
            viewHolder2.f10770b.setChecked(this.f10768b.get(i).isSelected());
            LogUtil.a("PictureImageGridAdapter", "position is ", Integer.valueOf(i), ",and isselect is", Boolean.valueOf(this.f10768b.get(i).isSelected()));
            if (c(this.e) && (this.e instanceof Activity)) {
                RequestOptions requestOptionsOverride = new RequestOptions().priority(Priority.NORMAL).fitCenter().override(300, 300);
                qqf.b(requestOptionsOverride, R.drawable.trackalbum_icon_data_error);
                qqf.c(photoModel.getPath(), requestOptionsOverride, new RequestListener<Drawable>(this) { // from class: com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.PictureImageGridAdapter.2
                    @Override // com.bumptech.glide.request.RequestListener
                    public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                        LogUtil.j("PictureImageGridAdapter", "onLoadFailed ", LogAnonymous.b(glideException));
                        viewHolder2.d.setEnabled(false);
                        viewHolder2.f10770b.setEnabled(false);
                        viewHolder2.f10769a.setEnabled(false);
                        return false;
                    }

                    @Override // com.bumptech.glide.request.RequestListener
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                        viewHolder2.d.setEnabled(true);
                        viewHolder2.f10770b.setEnabled(true);
                        viewHolder2.f10769a.setEnabled(true);
                        return false;
                    }
                }, viewHolder2.d, true);
            }
        }
    }

    public boolean c(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity2 = (Activity) context;
        return (activity2.isDestroyed() || activity2.isFinishing()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10768b.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f10769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final HealthCheckBox f10770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10771c;
        final ImageView d;

        public ViewHolder(View view) {
            super(view);
            this.f10771c = -1;
            ImageView imageView = (ImageView) view.findViewById(R.id.ivPicture);
            this.d = imageView;
            this.f10770b = (HealthCheckBox) view.findViewById(R.id.image_select_cb);
            View viewFindViewById = view.findViewById(R.id.btnCheck);
            this.f10769a = viewFindViewById;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.PictureImageGridAdapter.ViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (qrs.e(view2)) {
                        LogUtil.a("PictureImageGridAdapter", "click too fast");
                    } else {
                        if (PictureImageGridAdapter.this.d == null || ViewHolder.this.f10771c < 0) {
                            return;
                        }
                        PictureImageGridAdapter.this.d.onPictureClick(ViewHolder.this.f10771c, PictureImageGridAdapter.this.f10768b.get(ViewHolder.this.f10771c));
                    }
                }
            });
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.PictureImageGridAdapter.ViewHolder.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (PictureImageGridAdapter.this.d == null || ViewHolder.this.f10771c < 0) {
                        return;
                    }
                    if (((PhotoModel) PictureImageGridAdapter.this.f10768b.get(ViewHolder.this.f10771c)).isSelected()) {
                        ViewHolder.this.f10770b.setChecked(false);
                        PictureImageGridAdapter.this.d.onPictureRemove(PictureImageGridAdapter.this.f10768b.get(ViewHolder.this.f10771c));
                        ((PhotoModel) PictureImageGridAdapter.this.f10768b.get(ViewHolder.this.f10771c)).setSelected(false);
                    } else if (!PictureImageGridAdapter.this.d.isMaxCount()) {
                        ViewHolder.this.f10770b.setChecked(true);
                        PictureImageGridAdapter.this.d.onPictureAdd(PictureImageGridAdapter.this.f10768b.get(ViewHolder.this.f10771c));
                        ((PhotoModel) PictureImageGridAdapter.this.f10768b.get(ViewHolder.this.f10771c)).setSelected(true);
                    } else {
                        ViewHolder.this.f10770b.setChecked(false);
                        Toast.makeText(PictureImageGridAdapter.this.e, R.string.IDS_album_select_num_limit, 0).show();
                    }
                }
            });
        }
    }
}
