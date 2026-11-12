package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bumptech.glide.Glide;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.PhotoOrVideoSelectChangedListener;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.VideoLoad;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.RecyclerPreloadView;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.SelectVideoGridAdapter;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.ui.GridSpacingItemDecoration;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.VideoModel;
import com.huawei.healthcloud.plugintrack.ui.activity.PhotoAndVideoSelectActivity;
import com.huawei.healthcloud.plugintrack.ui.activity.VideoPreviewActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.jhi;
import defpackage.njy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class VideoSelectFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f11181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f11182c;
    private LinearLayout g;
    private RelativeLayout j;
    private HealthTextView k;
    private RelativeLayout l;
    private PhotoOrVideoSelectChangedListener m;
    private View s;
    private int o = 0;
    private SelectVideoGridAdapter d = null;
    private RecyclerPreloadView f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11180a = false;
    private ArrayList<VideoModel> n = new ArrayList<>(16);
    private List<VideoModel> i = new ArrayList(16);
    private OnPhotoSelectChangedListener<VideoModel> h = new OnPhotoSelectChangedListener<VideoModel>() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.VideoSelectFragment.2
        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPictureClick(int i, VideoModel videoModel) {
            if (i < 0 || videoModel == null) {
                LogUtil.j("Track_VideoSelectFragment", "index < 0 or media is null");
            } else {
                VideoPreviewActivity.e(VideoSelectFragment.this.f11182c, new Pair(Boolean.valueOf(!videoModel.isSelected() && isMaxCount()), videoModel), VideoSelectFragment.this.n.size(), i, VideoSelectFragment.this);
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onPictureAdd(VideoModel videoModel) {
            if (VideoSelectFragment.this.n.contains(videoModel)) {
                return;
            }
            VideoSelectFragment.this.n.add(videoModel);
            VideoSelectFragment.this.o++;
            VideoSelectFragment.this.m.setSelectData(VideoSelectFragment.this.n, VideoSelectFragment.this.o);
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPictureRemove(VideoModel videoModel) {
            if (VideoSelectFragment.this.n.contains(videoModel)) {
                VideoSelectFragment.this.n.remove(videoModel);
                VideoSelectFragment.this.o--;
                VideoSelectFragment.this.m.setSelectData(VideoSelectFragment.this.n, VideoSelectFragment.this.o);
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener
        public boolean isMaxCount() {
            return VideoSelectFragment.this.n.size() >= 1 || VideoSelectFragment.this.o >= 9;
        }
    };
    private final LoaderManager.LoaderCallbacks<List<VideoModel>> e = new LoaderManager.LoaderCallbacks<List<VideoModel>>() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.VideoSelectFragment.3
        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public void onLoaderReset(Loader<List<VideoModel>> loader) {
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public Loader<List<VideoModel>> onCreateLoader(int i, Bundle bundle) {
            return new VideoLoad(VideoSelectFragment.this.f11182c);
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onLoadFinished(Loader<List<VideoModel>> loader, List<VideoModel> list) {
            VideoSelectFragment.this.i = list;
            VideoSelectFragment.this.b();
            VideoSelectFragment.this.d.a(VideoSelectFragment.this.i);
            if (VideoSelectFragment.this.i == null || VideoSelectFragment.this.i.size() == 0) {
                VideoSelectFragment.this.g.setVisibility(0);
                VideoSelectFragment.this.l.setVisibility(8);
                VideoSelectFragment.this.f.setVisibility(8);
            } else {
                VideoSelectFragment.this.g.setVisibility(8);
                VideoSelectFragment.this.f.setVisibility(0);
            }
            VideoSelectFragment.this.f11180a = false;
            VideoSelectFragment.this.j.setVisibility(8);
        }
    };

    public void e(ArrayList<VideoModel> arrayList, int i) {
        this.n = arrayList;
        this.o = i;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.s == null) {
            this.s = layoutInflater.inflate(R.layout.trackalbum_video_select_fragment, viewGroup, false);
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof PhotoAndVideoSelectActivity)) {
            LogUtil.j("Track_VideoSelectFragment", "Object is not instanceof PhotoAndVideoSelectActivity");
            return this.s;
        }
        this.f11182c = (PhotoAndVideoSelectActivity) activity;
        e();
        d();
        c();
        return this.s;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.d == null) {
            LogUtil.j("Track_VideoSelectFragment", "mAdapter is null");
            return;
        }
        if (z) {
            PhotoAndVideoSelectActivity photoAndVideoSelectActivity = getActivity() instanceof PhotoAndVideoSelectActivity ? (PhotoAndVideoSelectActivity) getActivity() : null;
            List<VideoModel> list = this.i;
            if (list == null || list.size() <= 0) {
                return;
            }
            this.d.e(photoAndVideoSelectActivity.a());
        }
    }

    private void e() {
        this.f = (RecyclerPreloadView) this.s.findViewById(R.id.video_recycler);
        this.g = (LinearLayout) this.s.findViewById(R.id.no_video);
        this.j = (RelativeLayout) this.s.findViewById(R.id.image_select_londing_rl);
        this.f11181b = (ImageView) this.s.findViewById(R.id.cancel_image);
        this.l = (RelativeLayout) this.s.findViewById(R.id.select_video_tips_rl);
        HealthTextView healthTextView = (HealthTextView) this.s.findViewById(R.id.select_video_tips_text);
        this.k = healthTextView;
        healthTextView.setText(this.f11182c.getString(R.string.IDS_album_select_video_limit_ten_second, 10));
    }

    private void d() {
        this.f11181b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.VideoSelectFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VideoSelectFragment.this.l.setVisibility(8);
            }
        });
        this.f.setListenter(new RecyclerPreloadView.ScrollFastListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.VideoSelectFragment.5
            @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.RecyclerPreloadView.ScrollFastListener
            public void scrollFast() {
                if (jhi.d(VideoSelectFragment.this.f11182c) && (VideoSelectFragment.this.f11182c instanceof Activity)) {
                    Glide.with((Activity) VideoSelectFragment.this.f11182c).pauseRequests();
                }
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.RecyclerPreloadView.ScrollFastListener
            public void scrollSlow() {
                if (jhi.d(VideoSelectFragment.this.f11182c) && (VideoSelectFragment.this.f11182c instanceof Activity)) {
                    Glide.with((Activity) VideoSelectFragment.this.f11182c).resumeRequests();
                }
            }
        });
    }

    private void c() {
        this.f.setNestedScrollingEnabled(false);
        this.f.addItemDecoration(new GridSpacingItemDecoration(4, jhi.c(this.f11182c, 2.0f), false));
        this.f.setLayoutManager(new GridLayoutManager(this.f11182c, 4));
        this.f.setHasFixedSize(true);
        RecyclerView.ItemAnimator itemAnimator = this.f.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            this.f.setItemAnimator(null);
        }
        SelectVideoGridAdapter selectVideoGridAdapter = new SelectVideoGridAdapter(this.f11182c);
        this.d = selectVideoGridAdapter;
        selectVideoGridAdapter.d(this.h);
        a();
        this.f.setAdapter(this.d);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f11180a || !this.d.e()) {
            return;
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ArrayList<VideoModel> arrayList = this.n;
        if (arrayList == null || this.i == null) {
            LogUtil.j("mSelectVideoList or mLocalMediaList is null", new Object[0]);
            return;
        }
        if (arrayList.size() <= 0 || this.i.size() <= 0) {
            LogUtil.j("mSelectVideoList or mLocalMediaList is null", new Object[0]);
            return;
        }
        Collections.sort(this.n, new Comparator<VideoModel>(this) { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.VideoSelectFragment.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(VideoModel videoModel, VideoModel videoModel2) {
                if (videoModel.getId() == videoModel2.getId()) {
                    return 0;
                }
                return videoModel.getId() > videoModel2.getId() ? -1 : 1;
            }
        });
        ArrayList<VideoModel> arrayList2 = new ArrayList<>(16);
        int i = 0;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (this.i.get(i2).getId() == this.n.get(i).getId()) {
                this.i.get(i2).setIsSelected(true);
                arrayList2.add(this.i.get(i2));
                i++;
                if (i >= this.n.size()) {
                    this.n = arrayList2;
                    break;
                }
            }
        }
        this.n = arrayList2;
    }

    private void a() {
        this.f11180a = true;
        this.j.setVisibility(0);
        LoaderManager.getInstance(this).initLoader(0, null, this.e);
    }

    public void b(PhotoOrVideoSelectChangedListener photoOrVideoSelectChangedListener) {
        this.m = photoOrVideoSelectChangedListener;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("Track_VideoSelectFragment", "onActivityResult.");
        if (intent == null) {
            LogUtil.j("Track_VideoSelectFragment", "intent is null.");
            return;
        }
        int intExtra = intent.getIntExtra("index", 0);
        if (njy.e(this.i, intExtra)) {
            LogUtil.j("Track_VideoSelectFragment", "mLocalMediaList is out of bound.");
            return;
        }
        if (i2 != -1) {
            LogUtil.j("Track_VideoSelectFragment", "requestCode is not ok");
            return;
        }
        if (i == 4098) {
            boolean booleanExtra = intent.getBooleanExtra("result", false);
            this.i.get(intExtra).setIsSelected(booleanExtra);
            if (booleanExtra) {
                this.h.onPictureAdd(this.i.get(intExtra));
            } else {
                this.h.onPictureRemove(this.i.get(intExtra));
            }
            this.d.notifyItemChanged(intExtra);
        }
    }
}
