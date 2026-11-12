package com.huawei.phoneservice.feedback.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedbackcommon.db.FeedbackMediaData;
import com.huawei.phoneservice.feedbackcommon.entity.FeedMedia;
import com.huawei.phoneservice.feedbackcommon.entity.MediaEntity;
import com.huawei.phoneservice.feedbackcommon.photolibrary.MimeType;

/* JADX INFO: loaded from: classes13.dex */
public class c extends com.huawei.phoneservice.feedback.widget.a<FeedMedia> {
    private Context d;
    private com.huawei.phoneservice.feedback.widget.a.InterfaceC0259a e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return MimeType.isImageFromUrl(a(i).getDownloadURL()) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(com.huawei.phoneservice.feedback.widget.c cVar, int i) {
        int itemViewType = getItemViewType(i);
        FeedMedia feedMediaA = a(i);
        MediaEntity mediaEntityB = FeedbackMediaData.a(this.d).b(feedMediaA.getAttachId());
        if (1 == itemViewType) {
            ImageView imageView = (ImageView) cVar.c(R.id.replay_img_success);
            RelativeLayout relativeLayout = (RelativeLayout) cVar.c(R.id.rl_replay_img_failed);
            a(this.d, imageView, (ImageView) cVar.c(R.id.replay_img_failed), relativeLayout, (RelativeLayout) cVar.c(R.id.replay_img_progress), feedMediaA, mediaEntityB, i, this.e);
        }
        d(cVar, i, itemViewType, feedMediaA, mediaEntityB);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.huawei.phoneservice.feedback.widget.c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 0 ? new g(LayoutInflater.from(this.d).inflate(R.layout.feedback_sdk_video_item_replay, viewGroup, false)) : new com.huawei.phoneservice.feedback.widget.c(LayoutInflater.from(this.d).inflate(R.layout.feedback_sdk_item_replay, viewGroup, false));
    }

    private void d(com.huawei.phoneservice.feedback.widget.c cVar, int i, int i2, FeedMedia feedMedia, MediaEntity mediaEntity) {
        if (i2 == 0) {
            ImageView imageView = (ImageView) cVar.c(R.id.replay_video_frame);
            RelativeLayout relativeLayout = (RelativeLayout) cVar.c(R.id.rl_replay_video_frame);
            b(this.d, imageView, (ImageView) cVar.c(R.id.replay_video_failed), relativeLayout, (RelativeLayout) cVar.c(R.id.replay_video_progress), feedMedia, mediaEntity, i, this.e);
        }
    }

    public c(Context context, com.huawei.phoneservice.feedback.widget.a.InterfaceC0259a interfaceC0259a) {
        this.d = context;
        this.e = interfaceC0259a;
    }
}
