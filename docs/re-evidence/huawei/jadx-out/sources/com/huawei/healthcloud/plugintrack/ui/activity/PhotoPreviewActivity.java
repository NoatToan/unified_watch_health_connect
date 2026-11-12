package com.huawei.healthcloud.plugintrack.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.healthcloud.plugintrack.ui.fragment.PhotoSelectFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.watchface.videoedit.presenter.PresenterUtils;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class PhotoPreviewActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10844b;
    private HealthCheckBox d;
    private ImageView e;
    private HealthTextView g;
    private RelativeLayout h;
    private PhotoModel i;
    private RelativeLayout j;
    private int o = 0;
    private boolean f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10845c = false;

    public static void a(Context context, Pair<Boolean, PhotoModel> pair, int i, int i2, PhotoSelectFragment photoSelectFragment) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) PhotoPreviewActivity.class);
        intent.putExtra("size", i);
        intent.putExtra(PresenterUtils.PHOTO, (Parcelable) pair.second);
        intent.putExtra("select", (Serializable) pair.first);
        intent.putExtra("index", i2);
        if (photoSelectFragment != null) {
            photoSelectFragment.startActivityForResult(intent, 4097);
        } else if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, 4097);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("result", this.f);
        intent.putExtra("index", this.f10843a);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10844b = this;
        setContentView(R.layout.trackalbum_photo_preview_activity);
        e();
        this.h = (RelativeLayout) findViewById(R.id.preview_image_select_title_bar);
        a();
        this.e = (ImageView) findViewById(R.id.previewImage);
        ImageView imageView = (ImageView) findViewById(R.id.btn_left);
        Drawable drawable = this.f10844b.getResources().getDrawable(R.drawable.trackalbum_ic_back);
        if (LanguageUtil.ba(this.f10844b)) {
            drawable = qqz.e(this.f10844b, drawable);
        }
        imageView.setImageDrawable(drawable);
        this.j = (RelativeLayout) this.h.findViewById(R.id.btn_left_l);
        b();
        this.g = (HealthTextView) this.h.findViewById(R.id.detail_title_text);
        this.d = (HealthCheckBox) this.h.findViewById(R.id.image_select_cb);
        PhotoModel photoModel = this.i;
        if (photoModel == null) {
            LogUtil.e("Track_PhotoPreviewActivity", "mMedia is null");
            finish();
            return;
        }
        this.f = photoModel.isSelected();
        this.d.setClickable(false);
        this.d.setChecked(this.f);
        d();
        this.g.setText(getResources().getString(R.string.IDS_album_select_prompt, Integer.valueOf(this.o), 3));
        if (this.f10844b instanceof Activity) {
            qqf.c(this.i.getPath(), new RequestOptions().priority(Priority.IMMEDIATE).fitCenter().skipMemoryCache(true), 0.2f, DrawableTransitionOptions.withCrossFade(), this.e);
        }
    }

    private void d() {
        this.h.findViewById(R.id.base_health_right_l).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoPreviewActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PhotoPreviewActivity.this.f) {
                    PhotoPreviewActivity.this.f = false;
                    PhotoPreviewActivity.this.d.setChecked(false);
                    PhotoPreviewActivity.this.o--;
                } else if (!PhotoPreviewActivity.this.f10845c) {
                    PhotoPreviewActivity.this.o++;
                    PhotoPreviewActivity.this.f = true;
                    PhotoPreviewActivity.this.d.setChecked(true);
                } else {
                    PhotoPreviewActivity.this.d.setChecked(false);
                    Toast.makeText(PhotoPreviewActivity.this.f10844b, R.string.IDS_album_select_num_limit, 0).show();
                }
                PhotoPreviewActivity.this.g.setText(PhotoPreviewActivity.this.getResources().getString(R.string.IDS_album_select_prompt, Integer.valueOf(PhotoPreviewActivity.this.o), 3));
            }
        });
    }

    private void b() {
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.PhotoPreviewActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("result", PhotoPreviewActivity.this.f);
                intent.putExtra("index", PhotoPreviewActivity.this.f10843a);
                PhotoPreviewActivity.this.setResult(-1, intent);
                PhotoPreviewActivity.this.finish();
            }
        });
    }

    private void a() {
        View viewFindViewById = this.h.findViewById(R.id.statusbar_panel);
        if (viewFindViewById == null || !(viewFindViewById.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        ((RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams()).height = qrs.s(this);
    }

    private void e() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        this.o = intent.getIntExtra("size", 0);
        this.f10845c = intent.getBooleanExtra("select", false);
        Parcelable parcelableExtra = intent.getParcelableExtra(PresenterUtils.PHOTO);
        if (parcelableExtra instanceof PhotoModel) {
            this.i = (PhotoModel) parcelableExtra;
        }
        this.f10843a = intent.getIntExtra("index", 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
