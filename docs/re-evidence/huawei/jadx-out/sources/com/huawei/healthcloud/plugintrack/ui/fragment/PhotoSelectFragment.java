package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.ImageLoad;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.PhotoOrVideoSelectChangedListener;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.PictureImageGridAdapter;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.RecyclerPreloadView;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.ui.GridSpacingItemDecoration;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.healthcloud.plugintrack.ui.activity.PhotoAndVideoSelectActivity;
import com.huawei.healthcloud.plugintrack.ui.activity.PhotoPreviewActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import defpackage.jhi;
import defpackage.njy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class PhotoSelectFragment extends BaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f11061c;
    private RelativeLayout d;
    private LinearLayout g;
    private View m;
    private PhotoOrVideoSelectChangedListener o;
    private int k = 0;
    private PictureImageGridAdapter e = null;
    private RecyclerPreloadView h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11059a = false;
    private ArrayList<PhotoModel> n = new ArrayList<>(16);
    private List<PhotoModel> i = new ArrayList(16);
    private int j = 9;
    private OnPhotoSelectChangedListener<PhotoModel> f = new OnPhotoSelectChangedListener<PhotoModel>() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.PhotoSelectFragment.3
        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPictureClick(int i, PhotoModel photoModel) {
            if (i < 0 || photoModel == null) {
                LogUtil.j("Track_PhotoSelectFragment", "index < 0 or media is null");
            } else {
                PhotoPreviewActivity.a(PhotoSelectFragment.this.getContext(), new Pair(Boolean.valueOf(!photoModel.isSelected() && isMaxCount()), photoModel), PhotoSelectFragment.this.n.size(), i, PhotoSelectFragment.this);
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onPictureAdd(PhotoModel photoModel) {
            if (PhotoSelectFragment.this.n.contains(photoModel)) {
                return;
            }
            PhotoSelectFragment.this.n.add(photoModel);
            PhotoSelectFragment.this.k++;
            PhotoSelectFragment.this.o.setSelectData(PhotoSelectFragment.this.n, PhotoSelectFragment.this.k);
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPictureRemove(PhotoModel photoModel) {
            if (PhotoSelectFragment.this.n.contains(photoModel)) {
                PhotoSelectFragment.this.n.remove(photoModel);
                PhotoSelectFragment.this.k--;
                PhotoSelectFragment.this.o.setSelectData(PhotoSelectFragment.this.n, PhotoSelectFragment.this.k);
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener
        public boolean isMaxCount() {
            return PhotoSelectFragment.this.n.size() >= 3 || PhotoSelectFragment.this.k >= PhotoSelectFragment.this.j;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LoaderManager.LoaderCallbacks<List<PhotoModel>> f11060b = new LoaderManager.LoaderCallbacks<List<PhotoModel>>() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.PhotoSelectFragment.5
        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public void onLoaderReset(Loader<List<PhotoModel>> loader) {
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public Loader<List<PhotoModel>> onCreateLoader(int i, Bundle bundle) {
            return new ImageLoad(PhotoSelectFragment.this.f11061c);
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onLoadFinished(Loader<List<PhotoModel>> loader, List<PhotoModel> list) {
            PhotoSelectFragment.this.i = list;
            PhotoSelectFragment.this.b();
            PhotoSelectFragment.this.e.b(PhotoSelectFragment.this.i);
            if (PhotoSelectFragment.this.i == null || PhotoSelectFragment.this.i.size() == 0) {
                PhotoSelectFragment.this.g.setVisibility(0);
                PhotoSelectFragment.this.h.setVisibility(8);
            } else {
                PhotoSelectFragment.this.g.setVisibility(8);
                PhotoSelectFragment.this.h.setVisibility(0);
            }
            PhotoSelectFragment.this.f11059a = false;
            PhotoSelectFragment.this.d.setVisibility(8);
        }
    };

    public void b(ArrayList<PhotoModel> arrayList, int i, int i2) {
        this.n = arrayList;
        this.k = i;
        this.j = i2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.m == null) {
            this.m = layoutInflater.inflate(R.layout.trackalbum_photo_select_fragment, viewGroup, false);
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof PhotoAndVideoSelectActivity)) {
            LogUtil.j("Track_PhotoSelectFragment", "Object is not instanceof PhotoAndVideoSelectActivity");
            return this.m;
        }
        this.f11061c = (PhotoAndVideoSelectActivity) activity;
        this.h = (RecyclerPreloadView) this.m.findViewById(R.id.picture_recycler);
        this.g = (LinearLayout) this.m.findViewById(R.id.no_photo);
        this.d = (RelativeLayout) this.m.findViewById(R.id.image_select_londing_rl);
        a();
        e();
        return this.m;
    }

    private void a() {
        this.h.setListenter(new RecyclerPreloadView.ScrollFastListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.PhotoSelectFragment.4
            @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.RecyclerPreloadView.ScrollFastListener
            public void scrollFast() {
                if (jhi.d(PhotoSelectFragment.this.f11061c) && (PhotoSelectFragment.this.f11061c instanceof Activity)) {
                    Glide.with((Activity) PhotoSelectFragment.this.f11061c).pauseRequests();
                }
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.RecyclerPreloadView.ScrollFastListener
            public void scrollSlow() {
                if (jhi.d(PhotoSelectFragment.this.f11061c) && (PhotoSelectFragment.this.f11061c instanceof Activity)) {
                    Glide.with((Activity) PhotoSelectFragment.this.f11061c).resumeRequests();
                }
            }
        });
    }

    private void e() {
        this.h.setNestedScrollingEnabled(false);
        this.h.addItemDecoration(new GridSpacingItemDecoration(4, jhi.c(this.f11061c, 2.0f), false));
        this.h.setLayoutManager(new GridLayoutManager(this.f11061c, 4));
        this.h.setHasFixedSize(true);
        RecyclerView.ItemAnimator itemAnimator = this.h.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            this.h.setItemAnimator(null);
        }
        PictureImageGridAdapter pictureImageGridAdapter = new PictureImageGridAdapter(this.f11061c);
        this.e = pictureImageGridAdapter;
        pictureImageGridAdapter.c(this.f);
        c();
        this.h.setAdapter(this.e);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f11059a || !this.e.e()) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ArrayList<PhotoModel> arrayList = this.n;
        if (arrayList == null || this.i == null) {
            LogUtil.j("Track_PhotoSelectFragment", "mSelectImageList or mLocalMediaList is null");
            return;
        }
        if (arrayList.size() <= 0 || this.i.size() <= 0) {
            LogUtil.j("Track_PhotoSelectFragment", "mSelectImageList.size or mLocalMediaList.size <= 0");
            return;
        }
        Collections.sort(this.n, new Comparator<PhotoModel>(this) { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.PhotoSelectFragment.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(PhotoModel photoModel, PhotoModel photoModel2) {
                if (photoModel.getRowId() == photoModel2.getRowId()) {
                    return 0;
                }
                return photoModel.getRowId() > photoModel2.getRowId() ? -1 : 1;
            }
        });
        ArrayList<PhotoModel> arrayList2 = new ArrayList<>();
        int i = 0;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (this.i.get(i2).getRowId() == this.n.get(i).getRowId()) {
                this.i.get(i2).setSelected(true);
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

    private void c() {
        this.f11059a = true;
        this.d.setVisibility(0);
        LoaderManager.getInstance(this).initLoader(R.id.loader_id_media_store_data, null, this.f11060b);
    }

    public void c(PhotoOrVideoSelectChangedListener photoOrVideoSelectChangedListener) {
        this.o = photoOrVideoSelectChangedListener;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("Track_PhotoSelectFragment", "onActivityResult.");
        if (intent == null) {
            LogUtil.j("Track_PhotoSelectFragment", "intent is null");
            return;
        }
        int intExtra = intent.getIntExtra("index", 0);
        if (njy.e(this.i, intExtra)) {
            LogUtil.j("Track_PhotoSelectFragment", "mLocalMediaList is Out Of Bounds");
            return;
        }
        if (i2 != -1) {
            LogUtil.j("Track_PhotoSelectFragment", "requestCode is not OK");
            return;
        }
        if (i == 4097) {
            boolean booleanExtra = intent.getBooleanExtra("result", false);
            this.i.get(intExtra).setSelected(booleanExtra);
            if (booleanExtra) {
                this.f.onPictureAdd(this.i.get(intExtra));
            } else {
                this.f.onPictureRemove(this.i.get(intExtra));
            }
            this.e.notifyItemChanged(intExtra);
            return;
        }
        LogUtil.j("Track_PhotoSelectFragment", "requestCode not image preview request code");
    }
}
