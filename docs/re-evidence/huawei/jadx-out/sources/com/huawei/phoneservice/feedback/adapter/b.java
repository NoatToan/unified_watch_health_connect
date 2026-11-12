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
public class b extends com.huawei.phoneservice.feedback.widget.a<FeedMedia> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.phoneservice.feedback.widget.a.InterfaceC0259a f21624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f21625c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return MimeType.isImageFromUrl(a(i).getDownloadURL()) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(com.huawei.phoneservice.feedback.widget.c cVar, int i) {
        int itemViewType = getItemViewType(i);
        FeedMedia feedMediaA = a(i);
        MediaEntity mediaEntityB = FeedbackMediaData.a(this.f21625c).b(feedMediaA.getAttachId());
        if (1 == itemViewType) {
            ImageView imageView = (ImageView) cVar.c(R.id.img_success);
            RelativeLayout relativeLayout = (RelativeLayout) cVar.c(R.id.rl_img_failed);
            a(this.f21625c, imageView, (ImageView) cVar.c(R.id.img_img_failed), relativeLayout, (RelativeLayout) cVar.c(R.id.rl_img_progress), feedMediaA, mediaEntityB, i, this.f21624b);
        }
        a(cVar, i, itemViewType, feedMediaA, mediaEntityB);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.huawei.phoneservice.feedback.widget.c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 0 ? new g(LayoutInflater.from(this.f21625c).inflate(R.layout.feedback_sdk_item_videofrom, viewGroup, false)) : new com.huawei.phoneservice.feedback.widget.c(LayoutInflater.from(this.f21625c).inflate(R.layout.feedback_sdk_item_imagefrom, viewGroup, false));
    }

    private void a(com.huawei.phoneservice.feedback.widget.c cVar, int i, int i2, FeedMedia feedMedia, MediaEntity mediaEntity) {
        if (i2 == 0) {
            ImageView imageView = (ImageView) cVar.c(R.id.video_frame);
            RelativeLayout relativeLayout = (RelativeLayout) cVar.c(R.id.rl_video_frame);
            b(this.f21625c, imageView, (ImageView) cVar.c(R.id.img_video_failed), relativeLayout, (RelativeLayout) cVar.c(R.id.rl_video_progress), feedMedia, mediaEntity, i, this.f21624b);
        }
    }

    public b(Context context, com.huawei.phoneservice.feedback.widget.a.InterfaceC0259a interfaceC0259a) {
        this.f21625c = context;
        this.f21624b = interfaceC0259a;
    }
}
