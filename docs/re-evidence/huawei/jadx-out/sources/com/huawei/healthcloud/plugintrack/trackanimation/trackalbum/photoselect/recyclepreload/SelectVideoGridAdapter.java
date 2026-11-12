package com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.VideoModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import defpackage.jhi;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class SelectVideoGridAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<VideoModel> f10775b = new ArrayList(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnPhotoSelectChangedListener f10774a = null;
    private boolean e = false;

    public SelectVideoGridAdapter(Context context) {
        this.d = null;
        this.d = context;
    }

    public void d(OnPhotoSelectChangedListener onPhotoSelectChangedListener) {
        this.f10774a = onPhotoSelectChangedListener;
    }

    public void e(boolean z) {
        this.e = z;
    }

    public void a(List<VideoModel> list) {
        if (list != null) {
            this.f10775b = list;
        }
        notifyDataSetChanged();
    }

    public boolean e() {
        List<VideoModel> list = this.f10775b;
        return list == null || list.size() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.d).inflate(R.layout.trackalbum_video_grid_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (jhi.d(this.d)) {
            qqf.a(this.d, viewHolder2.e);
        }
        viewHolder2.e.setImageDrawable(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i < 0) {
            LogUtil.j("Track_SelectVideoGridAdapter", "position is < 0");
            return;
        }
        if (!(viewHolder instanceof ViewHolder)) {
            LogUtil.j("Track_SelectVideoGridAdapter", "holder not instanceof SelectVideoGridAdapter.ViewHolder");
            return;
        }
        final ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.i = i;
        viewHolder2.e.setEnabled(false);
        viewHolder2.f10777a.setEnabled(false);
        viewHolder2.d.setEnabled(false);
        VideoModel videoModel = this.f10775b.get(i);
        viewHolder2.f10777a.setChecked(videoModel.isSelected());
        LogUtil.a("Track_SelectVideoGridAdapter", "position is ", Integer.valueOf(i), ",and isSelect is", Boolean.valueOf(videoModel.isSelected()));
        if (c(this.d)) {
            RequestOptions requestOptionsOverride = new RequestOptions().priority(Priority.NORMAL).fitCenter().override(300, 300);
            qqf.b(requestOptionsOverride, R.drawable.trackalbum_icon_data_error);
            qqf.c(videoModel.getThumbnailPath(), requestOptionsOverride, new RequestListener<Drawable>(this) { // from class: com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.SelectVideoGridAdapter.3
                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                    LogUtil.j("Track_SelectVideoGridAdapter", "onLoadFailed ", LogAnonymous.b(glideException));
                    viewHolder2.e.setEnabled(false);
                    viewHolder2.f10777a.setEnabled(false);
                    viewHolder2.d.setEnabled(false);
                    return false;
                }

                @Override // com.bumptech.glide.request.RequestListener
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                    viewHolder2.e.setEnabled(true);
                    viewHolder2.f10777a.setEnabled(true);
                    viewHolder2.d.setEnabled(true);
                    return false;
                }
            }, viewHolder2.e, true);
            viewHolder2.f10778b.setText(e(videoModel.getDuration()));
        }
    }

    private boolean c(Context context) {
        if (context == null) {
            LogUtil.j("Track_SelectVideoGridAdapter", "context is null");
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
            LogUtil.j("Track_SelectVideoGridAdapter", "validContext is null");
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
        return this.f10775b.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final HealthCheckBox f10777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TextView f10778b;
        final View d;
        final ImageView e;
        private int i;

        public ViewHolder(View view) {
            super(view);
            this.i = -1;
            ImageView imageView = (ImageView) view.findViewById(R.id.videoThumbnail);
            this.e = imageView;
            this.f10777a = (HealthCheckBox) view.findViewById(R.id.image_select_cb);
            this.f10778b = (TextView) view.findViewById(R.id.video_duration);
            this.d = view.findViewById(R.id.btnCheck);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.SelectVideoGridAdapter.ViewHolder.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (qrs.e(view2)) {
                        LogUtil.a("Track_SelectVideoGridAdapter", "click too fast");
                    } else {
                        if (SelectVideoGridAdapter.this.f10774a == null || ViewHolder.this.i < 0) {
                            return;
                        }
                        SelectVideoGridAdapter.this.f10774a.onPictureClick(ViewHolder.this.i, SelectVideoGridAdapter.this.f10775b.get(ViewHolder.this.i));
                    }
                }
            });
            e();
        }

        private void e() {
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.SelectVideoGridAdapter.ViewHolder.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (SelectVideoGridAdapter.this.f10774a == null || ViewHolder.this.i < 0) {
                        LogUtil.a("Track_SelectVideoGridAdapter", "mListener is null or mId < 0");
                    } else {
                        if (((VideoModel) SelectVideoGridAdapter.this.f10775b.get(ViewHolder.this.i)).isSelected()) {
                            ViewHolder.this.f10777a.setChecked(false);
                            SelectVideoGridAdapter.this.f10774a.onPictureRemove(SelectVideoGridAdapter.this.f10775b.get(ViewHolder.this.i));
                            ((VideoModel) SelectVideoGridAdapter.this.f10775b.get(ViewHolder.this.i)).setIsSelected(false);
                            return;
                        }
                        ViewHolder.this.c();
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            for (int i = 0; i < SelectVideoGridAdapter.this.f10775b.size(); i++) {
                if (((VideoModel) SelectVideoGridAdapter.this.f10775b.get(i)).isSelected()) {
                    ((VideoModel) SelectVideoGridAdapter.this.f10775b.get(i)).setIsSelected(false);
                    SelectVideoGridAdapter.this.f10774a.onPictureRemove(SelectVideoGridAdapter.this.f10775b.get(i));
                    qpx.b(SelectVideoGridAdapter.this.d, SelectVideoGridAdapter.this.d.getResources().getString(R.string.IDS_album_only_one_video_insert, 1));
                    SelectVideoGridAdapter.this.notifyItemChanged(i);
                    this.f10777a.setChecked(true);
                    SelectVideoGridAdapter.this.f10774a.onPictureAdd(SelectVideoGridAdapter.this.f10775b.get(this.i));
                    ((VideoModel) SelectVideoGridAdapter.this.f10775b.get(this.i)).setIsSelected(true);
                }
            }
            if (SelectVideoGridAdapter.this.e) {
                qpx.e(SelectVideoGridAdapter.this.d, SelectVideoGridAdapter.this.d.getString(R.string.IDS_album_video_and_photo_not_selected));
            }
            this.f10777a.setChecked(true);
            SelectVideoGridAdapter.this.f10774a.onPictureAdd(SelectVideoGridAdapter.this.f10775b.get(this.i));
            ((VideoModel) SelectVideoGridAdapter.this.f10775b.get(this.i)).setIsSelected(true);
        }
    }

    private String e(long j) {
        StringBuilder sb = new StringBuilder(31);
        Formatter formatter = new Formatter(sb, Locale.getDefault());
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / 3600;
        sb.setLength(0);
        if (i4 == 0) {
            return formatter.format("%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i2)).toString();
        }
        return formatter.format("%02d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)).toString();
    }
}
