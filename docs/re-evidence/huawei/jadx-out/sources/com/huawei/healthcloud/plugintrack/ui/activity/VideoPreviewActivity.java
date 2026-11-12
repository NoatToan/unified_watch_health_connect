package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.VideoModel;
import com.huawei.healthcloud.plugintrack.ui.fragment.VideoSelectFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qpx;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes10.dex */
public class VideoPreviewActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthCheckBox f10926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f10928c;
    private HealthTextView f;
    private VideoView g;
    private RelativeLayout h;
    private VideoModel i;
    private RelativeLayout j;
    private String n;
    private int m = 0;
    private boolean e = false;
    private boolean d = false;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("result", this.e);
        intent.putExtra("index", this.f10927b);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10928c = this;
        setContentView(R.layout.trackalbum_video_preview_activity);
        a();
        this.j = (RelativeLayout) findViewById(R.id.preview_video_select_title_bar);
        c();
        ImageView imageView = (ImageView) findViewById(R.id.btn_left);
        this.g = (VideoView) findViewById(R.id.play_video);
        Drawable drawable = this.f10928c.getResources().getDrawable(R.drawable.trackalbum_ic_back);
        if (LanguageUtil.ba(this.f10928c)) {
            drawable = qqz.e(this.f10928c, drawable);
        }
        imageView.setImageDrawable(drawable);
        this.h = (RelativeLayout) this.j.findViewById(R.id.btn_left_l);
        e();
        this.f = (HealthTextView) this.j.findViewById(R.id.detail_title_text);
        this.f10926a = (HealthCheckBox) this.j.findViewById(R.id.image_select_cb);
        VideoModel videoModel = this.i;
        if (videoModel == null) {
            LogUtil.j("Track_VideoPreviewActivity", "mMedia is null");
            finish();
            return;
        }
        this.e = videoModel.isSelected();
        this.f10926a.setClickable(false);
        this.f10926a.setChecked(this.e);
        b();
        this.f.setText(getResources().getString(R.string.IDS_album_select_prompt, Integer.valueOf(this.m), 1));
        if (TextUtils.isEmpty(this.n)) {
            LogUtil.a("Track_VideoPreviewActivity", "mVideoPath is empty!");
            finish();
        } else {
            this.g.setVideoURI(Uri.parse(this.n));
            this.g.start();
        }
    }

    private void b() {
        this.j.findViewById(R.id.base_health_right_l).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.VideoPreviewActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VideoPreviewActivity.this.e) {
                    VideoPreviewActivity.this.e = false;
                    VideoPreviewActivity.this.f10926a.setChecked(false);
                    VideoPreviewActivity.this.m--;
                } else if (!VideoPreviewActivity.this.d) {
                    VideoPreviewActivity.this.m++;
                    VideoPreviewActivity.this.e = true;
                    VideoPreviewActivity.this.f10926a.setChecked(true);
                } else {
                    VideoPreviewActivity.this.f10926a.setChecked(false);
                    qpx.e(VideoPreviewActivity.this.f10928c, VideoPreviewActivity.this.f10928c.getString(R.string.IDS_album_select_video_num_limit));
                }
                VideoPreviewActivity.this.f.setText(VideoPreviewActivity.this.getResources().getString(R.string.IDS_album_select_prompt, Integer.valueOf(VideoPreviewActivity.this.m), 1));
            }
        });
    }

    private void e() {
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.VideoPreviewActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("result", VideoPreviewActivity.this.e);
                intent.putExtra("index", VideoPreviewActivity.this.f10927b);
                VideoPreviewActivity.this.setResult(-1, intent);
                VideoPreviewActivity.this.finish();
            }
        });
    }

    private void c() {
        View viewFindViewById = this.j.findViewById(R.id.statusbar_panel);
        if (viewFindViewById == null || !(viewFindViewById.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        ((RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams()).height = qrs.s(this);
    }

    private void a() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Track_VideoPreviewActivity", "intent is null");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            LogUtil.j("Track_VideoPreviewActivity", "bundle is null");
            return;
        }
        this.m = extras.getInt("size", 0);
        this.d = extras.getBoolean("select", false);
        this.f10927b = intent.getIntExtra("index", 0);
        Parcelable parcelable = extras.getParcelable("video");
        if (parcelable instanceof VideoModel) {
            VideoModel videoModel = (VideoModel) parcelable;
            this.i = videoModel;
            this.n = videoModel.getVideoPath();
        }
    }

    public static void e(Context context, Pair<Boolean, VideoModel> pair, int i, int i2, VideoSelectFragment videoSelectFragment) {
        if (context == null || videoSelectFragment == null) {
            LogUtil.j("Track_VideoPreviewActivity", "context or videoSelectFragment is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("size", i);
        bundle.putParcelable("video", (Parcelable) pair.second);
        bundle.putBoolean("select", ((Boolean) pair.first).booleanValue());
        bundle.putInt("index", i2);
        Intent intent = new Intent(context, (Class<?>) VideoPreviewActivity.class);
        intent.putExtras(bundle);
        videoSelectFragment.startActivityForResult(intent, 4098);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.g.stopPlayback();
        this.g.destroyDrawingCache();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
