package com.huawei.healthcloud.plugintrack.ui.activity;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bumptech.glide.Glide;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.ImageLoad;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.PictureImageGridAdapter;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.RecyclerPreloadView;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.ui.GridSpacingItemDecoration;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.jhi;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class PhotoSelectActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10847a = -1;
    private RelativeLayout g;
    private RelativeLayout i;
    private HealthTextView j;
    private int l;
    private LinearLayout o;
    private RelativeLayout r;
    private RelativeLayout s;
    protected PictureImageGridAdapter d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10848b = null;
    private RecyclerPreloadView n = null;
    private boolean e = false;
    private List<PhotoModel> h = new ArrayList();
    private int t = 0;
    private ArrayList<PhotoModel> p = new ArrayList<>();
    private final LoaderManager.LoaderCallbacks<List<PhotoModel>> f = new LoaderManager.LoaderCallbacks<List<PhotoModel>>() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoSelectActivity.2
        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public void onLoaderReset(Loader<List<PhotoModel>> loader) {
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public Loader<List<PhotoModel>> onCreateLoader(int i, Bundle bundle) {
            LogUtil.a("Track_PhotoSelectActivity", "onCreateLoader");
            return new ImageLoad(PhotoSelectActivity.this.f10848b);
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onLoadFinished(Loader<List<PhotoModel>> loader, List<PhotoModel> list) {
            PhotoSelectActivity.this.h = list;
            PhotoSelectActivity.this.a();
            PhotoSelectActivity.this.d.b(PhotoSelectActivity.this.h);
            if (PhotoSelectActivity.this.h == null || PhotoSelectActivity.this.h.size() == 0) {
                PhotoSelectActivity.this.o.setVisibility(0);
                PhotoSelectActivity.this.n.setVisibility(8);
            } else {
                PhotoSelectActivity.this.o.setVisibility(8);
                PhotoSelectActivity.this.n.setVisibility(0);
                LogUtil.a("Track_PhotoSelectActivity", "mLocalMediaList size is ", Integer.valueOf(PhotoSelectActivity.this.h.size()));
            }
            PhotoSelectActivity.this.e = false;
            PhotoSelectActivity.this.g.setVisibility(8);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentCallbacks2 f10849c = new ComponentCallbacks2() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoSelectActivity.5
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            PhotoSelectActivity.super.onTrimMemory(i);
            if (i == 10 || i == 15 || i == 5) {
                PhotoSelectActivity.f10847a = i;
                Glide.get(PhotoSelectActivity.this.f10848b).onTrimMemory(i);
            }
            if (i == 20) {
                Glide.get(PhotoSelectActivity.this.f10848b).clearMemory();
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            PhotoSelectActivity.f10847a = 10;
            PhotoSelectActivity.super.onLowMemory();
            Glide.get(PhotoSelectActivity.this.f10848b).clearMemory();
        }
    };
    private Handler k = new c(Looper.getMainLooper(), this);
    private OnPhotoSelectChangedListener<PhotoModel> m = new OnPhotoSelectChangedListener<PhotoModel>() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoSelectActivity.1
        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onPictureClick(int i, PhotoModel photoModel) {
            if (i < 0 || photoModel == null) {
                return;
            }
            PhotoPreviewActivity.a(PhotoSelectActivity.this.f10848b, new Pair(Boolean.valueOf(!photoModel.isSelected() && isMaxCount()), photoModel), PhotoSelectActivity.this.p.size(), i, null);
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPictureAdd(PhotoModel photoModel) {
            if (!PhotoSelectActivity.this.p.contains(photoModel)) {
                PhotoSelectActivity.this.p.add(photoModel);
                PhotoSelectActivity.this.t++;
            }
            PhotoSelectActivity.this.k.sendEmptyMessage(1);
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPictureRemove(PhotoModel photoModel) {
            if (PhotoSelectActivity.this.p.contains(photoModel)) {
                PhotoSelectActivity.this.p.remove(photoModel);
                PhotoSelectActivity.this.t--;
            }
            PhotoSelectActivity.this.k.sendEmptyMessage(1);
        }

        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.OnPhotoSelectChangedListener
        public boolean isMaxCount() {
            return PhotoSelectActivity.this.p.size() >= 3 || PhotoSelectActivity.this.t >= PhotoSelectActivity.this.l;
        }
    };

    static class c extends BaseHandler<PhotoSelectActivity> {
        public c(Looper looper, PhotoSelectActivity photoSelectActivity) {
            super(looper, photoSelectActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PhotoSelectActivity photoSelectActivity, Message message) {
            if (message.what != 1) {
                return;
            }
            photoSelectActivity.j.setText(photoSelectActivity.getResources().getString(R.string.IDS_album_select_prompt, Integer.valueOf(photoSelectActivity.p.size()), 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ArrayList<PhotoModel> arrayList = this.p;
        if (arrayList == null || this.h == null || arrayList.size() <= 0 || this.h.size() <= 0) {
            return;
        }
        Collections.sort(this.p, new Comparator<PhotoModel>(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoSelectActivity.4
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
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (this.h.get(i2).getRowId() == this.p.get(i).getRowId()) {
                this.h.get(i2).setSelected(true);
                arrayList2.add(this.h.get(i2));
                i++;
                if (i >= this.p.size()) {
                    this.p = arrayList2;
                    break;
                }
            }
        }
        this.p = arrayList2;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("Track_PhotoSelectActivity", "onCreate");
        super.onCreate(bundle);
        setContentView(R.layout.trackalbum_photo_select_activity);
        this.f10848b = this;
        b();
        d();
        this.n = (RecyclerPreloadView) findViewById(R.id.picture_recycler);
        this.o = (LinearLayout) findViewById(R.id.no_photo);
        this.n.setListenter(new RecyclerPreloadView.ScrollFastListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoSelectActivity.3
            @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.RecyclerPreloadView.ScrollFastListener
            public void scrollFast() {
                if (jhi.d(PhotoSelectActivity.this.f10848b)) {
                    Glide.with((Activity) PhotoSelectActivity.this.f10848b).pauseRequests();
                }
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.recyclepreload.RecyclerPreloadView.ScrollFastListener
            public void scrollSlow() {
                if (jhi.d(PhotoSelectActivity.this.f10848b)) {
                    Glide.with((Activity) PhotoSelectActivity.this.f10848b).resumeRequests();
                }
            }
        });
        this.n.setNestedScrollingEnabled(false);
        this.n.addItemDecoration(new GridSpacingItemDecoration(4, jhi.c(this, 2.0f), false));
        this.n.setLayoutManager(new GridLayoutManager(this, 4));
        this.n.setHasFixedSize(true);
        RecyclerView.ItemAnimator itemAnimator = this.n.getItemAnimator();
        if (itemAnimator != null && (itemAnimator instanceof SimpleItemAnimator)) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            this.n.setItemAnimator(null);
        }
        PictureImageGridAdapter pictureImageGridAdapter = new PictureImageGridAdapter(this);
        this.d = pictureImageGridAdapter;
        pictureImageGridAdapter.c(this.m);
        c();
        this.n.setAdapter(this.d);
        registerComponentCallbacks(this.f10849c);
    }

    private void b() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.l = intent.getIntExtra("key_data_max_photo_count", 9);
                this.t = intent.getIntExtra("total_selected_image_num_key", 0);
                this.p = intent.getParcelableArrayListExtra("selected_image_path_key");
            } catch (ArrayIndexOutOfBoundsException e) {
                LogUtil.e("Track_PhotoSelectActivity", "get list error:", e.getMessage());
            }
        }
    }

    private void d() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.image_select_title_bar);
        this.s = relativeLayout;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.base_health_right_l);
        this.r = relativeLayout2;
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoSelectActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putParcelableArrayListExtra("selected_image_list", PhotoSelectActivity.this.p);
                PhotoSelectActivity.this.setResult(-1, intent);
                PhotoSelectActivity.this.finish();
            }
        });
        ImageView imageView = (ImageView) this.s.findViewById(R.id.btn_left);
        Drawable drawable = this.f10848b.getResources().getDrawable(R.drawable.trackalbum_ic_back_black);
        if (LanguageUtil.ba(this.f10848b)) {
            drawable = qqz.e(this.f10848b, drawable);
        }
        imageView.setImageDrawable(drawable);
        RelativeLayout relativeLayout3 = (RelativeLayout) this.s.findViewById(R.id.btn_left_l);
        this.i = relativeLayout3;
        relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoSelectActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PhotoSelectActivity.this.finish();
            }
        });
        e();
        HealthTextView healthTextView = (HealthTextView) this.s.findViewById(R.id.image_limit_text);
        this.j = healthTextView;
        if (this.p != null) {
            healthTextView.setText(getResources().getString(R.string.IDS_album_select_prompt, Integer.valueOf(this.p.size()), 3));
        } else {
            healthTextView.setText(getResources().getString(R.string.IDS_album_select_prompt, 0, 3));
        }
        this.g = (RelativeLayout) findViewById(R.id.image_select_londing_rl);
    }

    private void e() {
        View viewFindViewById = this.s.findViewById(R.id.statusbar_panel);
        if (viewFindViewById == null || !(viewFindViewById.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        ((RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams()).height = qrs.s(this);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.e || !this.d.e()) {
            return;
        }
        c();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterComponentCallbacks(this.f10849c);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("Track_PhotoSelectActivity", "onActivityResult.");
        if (i2 == -1 && i == 4097 && intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("result", false);
            int intExtra = intent.getIntExtra("index", 0);
            List<PhotoModel> list = this.h;
            if (list == null || intExtra >= list.size()) {
                return;
            }
            this.h.get(intExtra).setSelected(booleanExtra);
            if (booleanExtra) {
                this.m.onPictureAdd(this.h.get(intExtra));
            } else {
                this.m.onPictureRemove(this.h.get(intExtra));
            }
            this.d.notifyItemChanged(intExtra);
        }
    }

    private void c() {
        this.e = true;
        this.g.setVisibility(0);
        LoaderManager.getInstance(this).initLoader(R.id.loader_id_media_store_data, null, this.f);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
