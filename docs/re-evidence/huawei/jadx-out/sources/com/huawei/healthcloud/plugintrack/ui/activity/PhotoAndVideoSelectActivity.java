package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.decoder.VideoDecoder;
import com.huawei.healthcloud.plugintrack.trackanimation.decoder.VideoDecoderCallback;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.PhotoOrVideoSelectChangedListener;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.VideoModel;
import com.huawei.healthcloud.plugintrack.ui.fragment.PhotoSelectFragment;
import com.huawei.healthcloud.plugintrack.ui.fragment.VideoSelectFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import defpackage.njy;
import defpackage.qpn;
import defpackage.qpx;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.xfz;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class PhotoAndVideoSelectActivity extends BaseActivity {
    private RelativeLayout d;
    private HealthTextView e;
    private HealthTextView f;
    private int g;
    private xfz h;
    private RelativeLayout i;
    private PhotoSelectFragment j;
    private qpn l;
    private HealthSubTabWidget n;
    private RelativeLayout o;
    private HealthViewPager p;
    private VideoDecoder q;
    private VideoSelectFragment s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f10838c = null;
    private int r = 0;
    private int t = 0;
    private ArrayList<PhotoModel> m = new ArrayList<>(3);
    private ArrayList<VideoModel> k = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10837b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10836a = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.trackalbum_photo_and_video_select_activity);
        this.f10838c = this;
        e();
        b();
        d();
        c();
    }

    private void e() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.g = intent.getIntExtra("key_data_max_photo_count", 9);
                this.r = intent.getIntExtra("total_selected_image_num_key", 0);
                this.m = intent.getParcelableArrayListExtra("selected_image_path_key");
            } catch (ArrayIndexOutOfBoundsException e) {
                LogUtil.e("Track_PhotoAndVideoSelectActivity", "get list error:", LogAnonymous.b(e));
            }
        }
    }

    private void b() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.image_select_title_bar);
        this.o = relativeLayout;
        this.i = (RelativeLayout) relativeLayout.findViewById(R.id.base_health_right_l);
        HealthTextView healthTextView = (HealthTextView) this.o.findViewById(R.id.detail_title_text);
        this.e = healthTextView;
        healthTextView.setText(this.f10838c.getText(R.string.IDS_album_photo_and_video));
        ImageView imageView = (ImageView) this.o.findViewById(R.id.btn_left);
        Drawable drawable = this.f10838c.getResources().getDrawable(R.drawable.trackalbum_ic_back_black);
        if (LanguageUtil.ba(this.f10838c)) {
            drawable = qqz.e(this.f10838c, drawable);
        }
        imageView.setImageDrawable(drawable);
        this.d = (RelativeLayout) this.o.findViewById(R.id.btn_left_l);
        this.f = (HealthTextView) this.o.findViewById(R.id.image_limit_text);
        j();
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoAndVideoSelectActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PhotoAndVideoSelectActivity.this.finish();
            }
        });
        if (this.m != null) {
            this.f.setText(getResources().getString(R.string.IDS_album_select_prompt, Integer.valueOf(this.m.size()), 3));
        } else {
            this.f.setText(getResources().getString(R.string.IDS_album_select_prompt, 0, 3));
        }
    }

    private void d() {
        this.n = (HealthSubTabWidget) findViewById(R.id.photo_and_video_tab);
        HealthViewPager healthViewPager = (HealthViewPager) findViewById(R.id.photo_and_video_viewpager);
        this.p = healthViewPager;
        if (healthViewPager == null) {
            LogUtil.j("Track_PhotoAndVideoSelectActivity", "initViewPager mViewPager is null");
            return;
        }
        healthViewPager.setScrollHeightArea(200);
        this.l = new qpn(this, this.p, this.n);
        PhotoSelectFragment photoSelectFragment = new PhotoSelectFragment();
        this.j = photoSelectFragment;
        photoSelectFragment.b(this.m, this.r, this.g);
        VideoSelectFragment videoSelectFragment = new VideoSelectFragment();
        this.s = videoSelectFragment;
        videoSelectFragment.e(this.k, this.t);
        xfz xfzVarB = this.n.b(this.f10838c.getResources().getString(R.string.IDS_album_select_photo));
        this.h = xfzVarB;
        this.l.b(xfzVarB, this.j, true);
        this.l.b(this.n.b(this.f10838c.getResources().getString(R.string.IDS_sleep_decompression_video)), this.s, false);
        this.p.addOnPageChangeListener(new HwViewPager.OnPageChangeListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoAndVideoSelectActivity.1
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                PhotoAndVideoSelectActivity.this.f10837b = i;
                if (i == 0) {
                    if (PhotoAndVideoSelectActivity.this.k != null && PhotoAndVideoSelectActivity.this.k.size() > 0) {
                        qpx.b(PhotoAndVideoSelectActivity.this.f10838c, PhotoAndVideoSelectActivity.this.f10838c.getString(R.string.IDS_album_video_and_photo_not_selected));
                    }
                    if (PhotoAndVideoSelectActivity.this.m != null) {
                        PhotoAndVideoSelectActivity.this.f.setText(PhotoAndVideoSelectActivity.this.getResources().getString(R.string.IDS_album_select_prompt, Integer.valueOf(PhotoAndVideoSelectActivity.this.m.size()), 3));
                        return;
                    } else {
                        PhotoAndVideoSelectActivity.this.f.setText(PhotoAndVideoSelectActivity.this.getResources().getString(R.string.IDS_album_select_prompt, 0, 3));
                        return;
                    }
                }
                if (PhotoAndVideoSelectActivity.this.m != null && PhotoAndVideoSelectActivity.this.m.size() > 0) {
                    qpx.b(PhotoAndVideoSelectActivity.this.f10838c, PhotoAndVideoSelectActivity.this.f10838c.getString(R.string.IDS_album_video_and_photo_not_selected));
                }
                PhotoAndVideoSelectActivity.this.f.setText(PhotoAndVideoSelectActivity.this.getResources().getString(R.string.IDS_album_select_prompt, Integer.valueOf(PhotoAndVideoSelectActivity.this.k.size()), 1));
            }
        });
    }

    private void j() {
        View viewFindViewById = this.o.findViewById(R.id.statusbar_panel);
        if (viewFindViewById == null || !(viewFindViewById.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        ((RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams()).height = qrs.s(this);
    }

    public boolean a() {
        return this.f10836a;
    }

    private void c() {
        this.s.b(new PhotoOrVideoSelectChangedListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoAndVideoSelectActivity.4
            @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.PhotoOrVideoSelectChangedListener
            public void setSelectData(Object obj, int i) {
                if (!njy.b(obj, VideoModel.class)) {
                    LogUtil.j("Track_PhotoAndVideoSelectActivity", "select data not instance of list");
                    return;
                }
                PhotoAndVideoSelectActivity.this.k = (ArrayList) obj;
                PhotoAndVideoSelectActivity.this.f.setText(PhotoAndVideoSelectActivity.this.getResources().getString(R.string.IDS_album_select_prompt, Integer.valueOf(PhotoAndVideoSelectActivity.this.k.size()), 1));
            }
        });
        this.j.c(new PhotoOrVideoSelectChangedListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoAndVideoSelectActivity.5
            @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.PhotoOrVideoSelectChangedListener
            public void setSelectData(Object obj, int i) {
                if (!njy.b(obj, PhotoModel.class)) {
                    LogUtil.j("Track_PhotoAndVideoSelectActivity", "select data not instance of list");
                    return;
                }
                PhotoAndVideoSelectActivity.this.m = (ArrayList) obj;
                PhotoAndVideoSelectActivity photoAndVideoSelectActivity = PhotoAndVideoSelectActivity.this;
                photoAndVideoSelectActivity.f10836a = photoAndVideoSelectActivity.m.size() > 0;
                PhotoAndVideoSelectActivity.this.f.setText(PhotoAndVideoSelectActivity.this.getResources().getString(R.string.IDS_album_select_prompt, Integer.valueOf(PhotoAndVideoSelectActivity.this.m.size()), 3));
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoAndVideoSelectActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                if (PhotoAndVideoSelectActivity.this.f10837b != 0) {
                    if (PhotoAndVideoSelectActivity.this.k.size() > 0 && ((VideoModel) PhotoAndVideoSelectActivity.this.k.get(0)).getDuration() > 10200) {
                        PhotoAndVideoSelectActivity photoAndVideoSelectActivity = PhotoAndVideoSelectActivity.this;
                        photoAndVideoSelectActivity.a(intent, (VideoModel) photoAndVideoSelectActivity.k.get(0));
                        return;
                    } else {
                        intent.putParcelableArrayListExtra("selected_video_list", PhotoAndVideoSelectActivity.this.k);
                        PhotoAndVideoSelectActivity.this.setResult(-1, intent);
                        PhotoAndVideoSelectActivity.this.finish();
                        return;
                    }
                }
                intent.putParcelableArrayListExtra("selected_image_list", PhotoAndVideoSelectActivity.this.m);
                PhotoAndVideoSelectActivity.this.setResult(-1, intent);
                PhotoAndVideoSelectActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Intent intent, final VideoModel videoModel) {
        VideoDecoder videoDecoder = new VideoDecoder(this.f10838c);
        this.q = videoDecoder;
        videoDecoder.e(new VideoDecoderCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoAndVideoSelectActivity.10
            @Override // com.huawei.healthcloud.plugintrack.trackanimation.decoder.VideoDecoderCallback
            public void onResult(boolean z, String str) {
                if (z) {
                    videoModel.setVideoPath(str);
                    intent.putParcelableArrayListExtra("selected_video_list", PhotoAndVideoSelectActivity.this.k);
                    intent.putExtra("selected_video_duration_is_long", true);
                    PhotoAndVideoSelectActivity.this.setResult(-1, intent);
                    PhotoAndVideoSelectActivity.this.finish();
                    return;
                }
                qpx.b(PhotoAndVideoSelectActivity.this.f10838c, PhotoAndVideoSelectActivity.this.f10838c.getString(R.string.IDs_album_cut_video_fail));
            }
        });
        this.q.b(videoModel.getVideoPath(), 0, 10);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        VideoDecoder videoDecoder = this.q;
        if (videoDecoder != null) {
            videoDecoder.e();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
