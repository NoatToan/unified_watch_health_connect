package com.huawei.healthcloud.plugintrack.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.VideoView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.VideoModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.qre;

/* JADX INFO: loaded from: classes10.dex */
public class SelectedVideoPreviewActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VideoView f10882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10883c;
    private CustomTitleBar d;
    private VideoModel e;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.trackalbum_selected_video_preview_activity);
        this.f10882b = (VideoView) findViewById(R.id.play_video);
        a();
        d();
        if (this.e == null || TextUtils.isEmpty(this.f10883c)) {
            LogUtil.j("Track_VideoPreviewActivity", "mMedia or mVideoPath is null");
            finish();
        } else {
            this.f10882b.setVideoURI(Uri.parse(this.f10883c));
            this.f10882b.start();
        }
    }

    private void d() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.selected_video_preview_titlebar);
        this.d = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.SelectedVideoPreviewActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SelectedVideoPreviewActivity.this.finish();
            }
        });
        this.d.setRightButtonClickable(true);
        this.d.setRightButtonVisibility(0);
        this.d.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.health_navbar_delete_selector), qre.f(R.string.IDS_contact_delete));
        this.d.setTitleText(getResources().getString(R.string.IDS_album_select_prompt, 1, 1));
        this.d.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.SelectedVideoPreviewActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SelectedVideoPreviewActivity.this.setResult(-1, new Intent());
                SelectedVideoPreviewActivity.this.finish();
            }
        });
    }

    private void a() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Track_VideoPreviewActivity", "intent is null");
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("video");
        if (parcelableExtra instanceof VideoModel) {
            VideoModel videoModel = (VideoModel) parcelableExtra;
            this.e = videoModel;
            this.f10883c = videoModel.getVideoPath();
        }
    }

    public static void a(Context context, VideoModel videoModel) {
        if (context == null) {
            LogUtil.j("Track_VideoPreviewActivity", "context is null");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) SelectedVideoPreviewActivity.class);
        intent.putExtra("video", videoModel);
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, 6);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f10882b.stopPlayback();
        this.f10882b.destroyDrawingCache();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
