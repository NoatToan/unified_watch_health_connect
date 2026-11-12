package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.MediaBean;
import com.huawei.hwdevicemgr.R;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.DensityUtil;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes38.dex */
public class VideoSelectAdapter extends RecyclerView.Adapter {
    private final Context mContext;
    private List<MediaBean> mMsgInfoList;
    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(MediaBean mediaBean);
    }

    public VideoSelectAdapter(Context context, List<MediaBean> list) {
        this.mContext = context.getApplicationContext();
        this.mMsgInfoList = list;
    }

    public void setData(List<MediaBean> list) {
        this.mMsgInfoList = list;
        notifyDataSetChanged();
    }

    public void insertDataToBottom(List<MediaBean> list, int i) {
        this.mMsgInfoList = list;
        notifyItemRangeInserted(list.size() - i, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new VideoHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.watchface_item_select_video_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        bindData(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mMsgInfoList.size();
    }

    private void bindData(RecyclerView.ViewHolder viewHolder, int i) {
        final MediaBean mediaBean;
        if (ArrayUtils.isSafeIndex(this.mMsgInfoList, i) && (mediaBean = this.mMsgInfoList.get(i)) != null) {
            final VideoHolder videoHolder = (VideoHolder) viewHolder;
            long duration = mediaBean.getDuration();
            if (duration <= 0) {
                videoHolder.durationView.setVisibility(8);
            } else {
                videoHolder.durationView.setVisibility(0);
                videoHolder.durationView.setText(formatSeconds(duration / 1000));
            }
            ViewGroup.LayoutParams layoutParams = videoHolder.thumbView.getLayoutParams();
            int screenWidth = DensityUtil.getScreenWidth(this.mContext) / 2;
            layoutParams.width = screenWidth;
            layoutParams.height = screenWidth;
            videoHolder.thumbView.setLayoutParams(layoutParams);
            videoHolder.thumbView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.ui.adapter.VideoSelectAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (VideoSelectAdapter.this.mOnItemClickListener == null) {
                        return;
                    }
                    VideoSelectAdapter.this.mOnItemClickListener.onItemClick(mediaBean);
                }
            });
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.ui.adapter.VideoSelectAdapter$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1455x1147649(mediaBean, videoHolder);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$bindData$1$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-ui-adapter-VideoSelectAdapter, reason: not valid java name */
    /* synthetic */ void m1455x1147649(MediaBean mediaBean, final VideoHolder videoHolder) {
        final Bitmap thumbnail = MediaStore.Video.Thumbnails.getThumbnail(this.mContext.getContentResolver(), mediaBean.getVideoId(), 1, null);
        BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.ui.adapter.VideoSelectAdapter$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                VideoSelectAdapter.lambda$bindData$0(thumbnail, videoHolder);
            }
        });
    }

    static /* synthetic */ void lambda$bindData$0(Bitmap bitmap, VideoHolder videoHolder) {
        if (bitmap == null || videoHolder.thumbView == null) {
            return;
        }
        videoHolder.thumbView.setImageBitmap(bitmap);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
    }

    private String formatSeconds(long j) {
        if (j <= 0) {
            return String.format(Locale.getDefault(), "%02d:%02d", 0, 0);
        }
        if (j < 60) {
            return String.format(Locale.getDefault(), "%02d:%02d", 0, Long.valueOf(j % 60));
        }
        if (j < 3600) {
            return String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(j / 60), Long.valueOf(j % 60));
        }
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", Long.valueOf(j / 3600), Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60));
    }

    static class VideoHolder extends RecyclerView.ViewHolder {
        TextView durationView;
        ImageView thumbView;

        VideoHolder(View view) {
            super(view);
            this.thumbView = (ImageView) view.findViewById(R.id.thumb_view);
            this.durationView = (TextView) view.findViewById(R.id.duration_view);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }
}
