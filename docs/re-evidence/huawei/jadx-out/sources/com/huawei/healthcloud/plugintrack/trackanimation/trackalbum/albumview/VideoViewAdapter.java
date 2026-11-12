package com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.VideoModel;
import com.huawei.healthcloud.plugintrack.ui.activity.SelectedVideoPreviewActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.pao;
import defpackage.qqf;
import defpackage.qqr;
import defpackage.qrs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class VideoViewAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnGridViewListener f10753a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10754b;
    private ArrayList<VideoModel> d;
    private LayoutInflater e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public void a(OnGridViewListener onGridViewListener) {
        this.f10753a = onGridViewListener;
    }

    public VideoViewAdapter(Context context, ArrayList<VideoModel> arrayList) {
        this.f10754b = context;
        this.d = arrayList;
        this.e = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<VideoModel> arrayList = this.d;
        if (arrayList == null) {
            LogUtil.j("Track_VideoViewAdapter", "mDatas is null");
            return 0;
        }
        if (arrayList.size() > 1) {
            return 1;
        }
        return this.d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.e(this.d, i)) {
            LogUtil.j("Track_VideoViewAdapter", "getItem mDatas position is out of bound");
            return null;
        }
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVar;
        if (njy.e(this.d, i)) {
            return view;
        }
        if (view != null && (view.getTag() instanceof c)) {
            cVar = (c) view.getTag();
        } else {
            view = this.e.inflate(R.layout.trackalbum_griditem_addphotoandvideo, viewGroup, false);
            cVar = new c(view);
            view.setTag(cVar);
        }
        VideoModel videoModel = this.d.get(i);
        if (videoModel == null) {
            return d(i, cVar, view);
        }
        RequestOptions requestOptionsOverride = new RequestOptions().dontAnimate().override(200, 200);
        Context context = this.f10754b;
        qqf.e(videoModel.getThumbnailPath(), requestOptionsOverride.transform(new CenterCrop(), new qqr(context, pao.e(context, 8.0f))), cVar.d);
        cVar.f10757a.setVisibility(0);
        e(i, cVar);
        return view;
    }

    private View d(int i, c cVar, View view) {
        if (qrs.x(this.f10754b)) {
            cVar.d.setImageDrawable(this.f10754b.getResources().getDrawable(R.drawable.trackalbum_add_photo_night));
        } else {
            cVar.d.setImageDrawable(this.f10754b.getResources().getDrawable(R.drawable.trackalbum_add_photo));
        }
        if (i == 1) {
            cVar.d.setVisibility(8);
            cVar.d.setClickable(false);
        }
        cVar.e.setVisibility(8);
        cVar.f10757a.setVisibility(8);
        return view;
    }

    private void e(final int i, c cVar) {
        cVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview.VideoViewAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VideoViewAdapter.this.d.remove(i);
                if (VideoViewAdapter.this.f10753a != null) {
                    VideoViewAdapter.this.f10753a.onPhotoOrVideoDelete(i);
                }
                VideoViewAdapter.this.notifyDataSetChanged();
            }
        });
        cVar.f10757a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview.VideoViewAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SelectedVideoPreviewActivity.a(VideoViewAdapter.this.f10754b, (VideoModel) VideoViewAdapter.this.d.get(i));
            }
        });
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthTextView f10757a;
        private final ImageView d;
        private final HealthTextView e;

        public c(View view) {
            this.d = (ImageView) view.findViewById(R.id.photoView);
            this.e = (HealthTextView) view.findViewById(R.id.iv_del);
            this.f10757a = (HealthTextView) view.findViewById(R.id.iv_play);
        }
    }
}
