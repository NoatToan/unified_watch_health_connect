package com.huawei.health.recognizekit.api;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.recognizekit.R;
import com.huawei.health.recognizekit.view.OverLayerTopView;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.guo;
import defpackage.gup;
import defpackage.pfh;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class NutritionTableAlbumImgCropActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f8677a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthButton f8679c;
    private RectF d;
    private float e;
    private HealthTextView f;
    private ImageView h;
    private e i;
    private Context j;
    private LinearLayout k;
    private OverLayerTopView l;
    private Point m;
    private String o;
    private HealthTextView p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f8678b = null;
    private boolean g = false;
    private boolean n = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_nutrition_table_img_crop);
        LogUtil.b("NutritionTableAlbumImgCropActivity", "onCreate start crop img from album.");
        e();
        c(getIntent());
    }

    private void e() {
        OverLayerTopView overLayerTopView;
        this.j = this;
        this.l = (OverLayerTopView) findViewById(R.id.crop_overLayerTopView);
        this.f8677a = (ImageView) findViewById(R.id.ocr_album_iv);
        this.f8679c = (HealthButton) findViewById(R.id.ocr_start_scan_bt);
        ImageView imageView = (ImageView) findViewById(R.id.ocr_crop_back_page);
        this.h = imageView;
        imageView.setImageResource(LanguageUtil.ba(this.j) ? com.huawei.ui.commonui.R.drawable.ic_back_white_reverse : com.huawei.ui.commonui.R.drawable.ic_back_white);
        this.p = (HealthTextView) findViewById(R.id.ocr_crop_action_title);
        this.f = (HealthTextView) findViewById(R.id.ocr_crop_action_tips);
        int iS = qrs.s(this.j);
        this.k = (LinearLayout) findViewById(R.id.ocr_crop_back_ly);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        boolean z = false;
        layoutParams.setMargins(0, iS, 0, 0);
        this.k.setLayoutParams(layoutParams);
        a();
        this.f8679c.setText(getString(com.huawei.ui.commonui.R.string.IDS_ocr_start_scan).toUpperCase());
        this.f8679c.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.d = gup.d(this);
        Point pointE = gup.e(this);
        this.m = pointE;
        this.e = pointE.x;
        this.g = qrs.t();
        if (qrs.t() && qrs.af(this.j)) {
            z = true;
        }
        this.n = z;
        if (z && (overLayerTopView = this.l) != null) {
            overLayerTopView.d();
        }
        LogUtil.b("NutritionTableAlbumImgCropActivity", "mIsFoldable=", Boolean.valueOf(this.g), " mIsTahitiModel=", Boolean.valueOf(this.n));
        this.i = new e(this);
    }

    private void a() {
        this.p.setMaxLines(2);
        this.p.setAutoTextSize(2, 18.0f);
        this.p.setAutoTextInfo(12, 2, 2);
        this.f.setMaxLines(5);
        this.f.setAutoTextSize(2, 14.0f);
        this.f.setAutoTextInfo(12, 2, 2);
    }

    private void c(final Intent intent) {
        LogUtil.b("NutritionTableAlbumImgCropActivity", "parserIntent");
        if (intent == null || intent.getData() == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: gue
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(intent);
            }
        });
    }

    public /* synthetic */ void a(Intent intent) {
        InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = getContentResolver().openInputStream(intent.getData());
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
            this.f8678b = bitmapDecodeStream;
            this.f8678b = guo.a(bitmapDecodeStream, intent.getIntExtra(ParamConstants.Param.ORIENTATION, 0));
            this.i.sendEmptyMessage(2);
        } catch (FileNotFoundException e2) {
            LogUtil.d("NutritionTableAlbumImgCropActivity", "parserIntent FileNotFoundException, ", ExceptionUtils.c(e2));
        } finally {
            FileUtils.a(inputStreamOpenInputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Bitmap bitmap = this.f8678b;
        if (bitmap != null) {
            Bitmap bitmapB = gup.b(bitmap);
            this.f8678b = bitmapB;
            this.l.setMaxDragRange(bitmapB);
            this.f8677a.setImageBitmap(this.f8678b);
            return;
        }
        LogUtil.d("NutritionTableAlbumImgCropActivity", "showSelectImg parserIntent bitmap is null.");
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f8679c) {
            if (this.f8678b != null) {
                LogUtil.b("NutritionTableAlbumImgCropActivity", "onClick start scan.");
                RectF centerRect = this.l.getCenterRect();
                this.d = centerRect;
                Bitmap bitmapB = gup.b(centerRect, this.f8678b, this.j);
                this.f8678b = bitmapB;
                LogUtil.b("NutritionTableAlbumImgCropActivity", "album crop img isSaved= ", Boolean.valueOf(qqf.b(bitmapB, gup.f36056c)));
                this.p.setVisibility(0);
                this.p.setText(getString(com.huawei.ui.commonui.R.string.IDS_ocr_recognizing_nutritiontable));
                this.f.setText(getString(com.huawei.ui.commonui.R.string.IDS_ocr_recognizing_nutritiontable_tips));
                this.f8679c.setVisibility(8);
                this.l.b();
                ThreadPoolManager.c().execute(new Runnable() { // from class: gty
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36034b.c();
                    }
                });
            } else {
                LogUtil.d("NutritionTableAlbumImgCropActivity", "start scan btn click,bitmap is null.");
            }
        }
        if (view == this.h) {
            finish();
        }
    }

    public /* synthetic */ void c() {
        String nutritionTableOcrResult = pfh.a().getNutritionTableOcrResult(this.j, this.f8678b);
        this.o = nutritionTableOcrResult;
        LogUtil.b("NutritionTableAlbumImgCropActivity", "onClick crop img recognize result = ", nutritionTableOcrResult);
        this.i.sendEmptyMessage(1);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Bitmap bitmap = this.f8678b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f8678b.recycle();
        }
        e eVar = this.i;
        if (eVar != null) {
            eVar.removeCallbacksAndMessages(null);
        }
        pfh.a().release();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        boolean z = qrs.af(getApplicationContext()) && qrs.t();
        LogUtil.b("NutritionTableAlbumImgCropActivity", "initViewTahiti isTahitiModel: ", Boolean.valueOf(z), " mIsTahitiModel = ", Boolean.valueOf(this.n));
        if (this.n != z) {
            LogUtil.b("NutritionTableAlbumImgCropActivity", "refresh center rectF.");
            this.n = z;
            this.l.d();
        }
    }

    static class e extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<NutritionTableAlbumImgCropActivity> f8680c;

        e(NutritionTableAlbumImgCropActivity nutritionTableAlbumImgCropActivity) {
            this.f8680c = new WeakReference<>(nutritionTableAlbumImgCropActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            NutritionTableAlbumImgCropActivity nutritionTableAlbumImgCropActivity = this.f8680c.get();
            if (nutritionTableAlbumImgCropActivity == null) {
                LogUtil.d("NutritionTableAlbumImgCropActivity", "handleMessage activity is null.");
                return;
            }
            if (message.what == 1) {
                nutritionTableAlbumImgCropActivity.l.a();
                Intent intent = new Intent();
                if (gup.b(nutritionTableAlbumImgCropActivity.o)) {
                    intent.putExtra("ocrResult", nutritionTableAlbumImgCropActivity.o);
                    nutritionTableAlbumImgCropActivity.setResult(101, intent);
                } else {
                    intent.putExtra("ocrResult", "default");
                    nutritionTableAlbumImgCropActivity.setResult(100, intent);
                }
                nutritionTableAlbumImgCropActivity.finish();
            }
            if (message.what == 2) {
                nutritionTableAlbumImgCropActivity.b();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (pfh.a().isPluginAvaiable()) {
            return;
        }
        pfh.a().a((AppBundleLauncher.InstallCallback) null);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gup.c(getResources());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return gup.e(super.getResources());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        super.onMultiWindowModeChanged(z, configuration);
        LogUtil.b("NutritionTableAlbumImgCropActivity", "onMultiWindowModeChanged isInMultiWindowMode = ", Boolean.valueOf(z));
        OverLayerTopView overLayerTopView = this.l;
        if (overLayerTopView != null) {
            overLayerTopView.d();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
