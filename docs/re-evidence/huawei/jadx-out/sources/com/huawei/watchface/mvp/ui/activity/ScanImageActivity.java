package com.huawei.watchface.mvp.ui.activity;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.secure.android.common.activity.SafeFragmentActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.uikit.phone.hwbutton.widget.HwButton;
import com.huawei.watchface.R;
import com.huawei.watchface.a2;
import com.huawei.watchface.l2;
import com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.SafeHandler;
import com.huawei.watchface.videoedit.utils.FileUtils;
import com.huawei.watchface.w1;
import com.huawei.watchface.z2;

/* JADX INFO: loaded from: classes20.dex */
public class ScanImageActivity extends SafeFragmentActivity {
    public static final float FLOAT_DEFAULT = 1.0f;
    public static final String ILLEGAL_DIALOG_CANCEL_CLICK = "2";
    public static final String ILLEGAL_DIALOG_EXPOSURE = "1";
    public static final String ILLEGAL_DIALOG_RE_UPLOAD_CLICK = "3";
    public static final int REFRESH_IMAGE_VIEW_MESSAGE = 1000;
    public static final int SCAN_IMAGE_ALPHA = 200;
    public static final int SCAN_IMAGE_DURATION = 1200;
    public static final int SCAN_IMAGE_HALF = 2;
    public static final int SCAN_IMAGE_LENGTH_LIMIT = 5242880;
    public static final int SCAN_IMAGE_MAX_HEIGHT = 300;
    public static final int SCAN_IMAGE_PORTION = 3;
    public static final int SCAN_IMAGE_ROTATION = 180;
    public static final String SCAN_PAGE_CANCEL_CLICK = "5";
    public static final String SCAN_PAGE_CANCEL_EXPOSURE = "4";
    public static final String SOURCE_IMAGE_PATH = "sourceImagePath";
    public static final String SOURCE_IMAGE_URI = "sourceImageUri";
    private static final String TAG = "ScanImageActivity";
    private ImageView imageView;
    private Context mConText;
    private Handler mHandler;
    private HwButton mHwButton;
    private AnimationDrawable mLoadingAnimation;
    private ImageView mScanLoadingView;
    private Bitmap scanBitmap;
    private ImageView searchImageView;
    private int bitmapHeight = 0;
    boolean isShowNotLegalDialog = false;
    boolean isImageIllegal = false;

    public class a extends SafeHandler {
        public a(ScanImageActivity scanImageActivity) {
            super(scanImageActivity);
        }

        @Override // com.huawei.watchface.utils.SafeHandler
        public void handlerMessageAction(Message message) {
            if (message == null || getObj() == null) {
                HwLog.i(ScanImageActivity.TAG, "handlerMessageAction() msg is null or getObj() is null");
                return;
            }
            if (((ScanImageActivity) getObj()).mLoadingAnimation == null || ((ScanImageActivity) getObj()).mScanLoadingView == null) {
                HwLog.i(ScanImageActivity.TAG, "handlerMessageAction() mLoadingAnimation is null or mScanLoadingView is null");
                return;
            }
            HwLog.i(ScanImageActivity.TAG, "handlerMessageAction() message.what: " + message.what);
            if (message.what == 1000) {
                ((ScanImageActivity) getObj()).mLoadingAnimation.stop();
                ((ScanImageActivity) getObj()).mScanLoadingView.setVisibility(8);
                if (((ScanImageActivity) getObj()).scanBitmap == null || ((ScanImageActivity) getObj()).searchImageView == null) {
                    ((ScanImageActivity) getObj()).finish();
                    HwLog.w(ScanImageActivity.TAG, "handlerMessageAction() scanBitmap or searchImageView is null.");
                    return;
                }
                ((ScanImageActivity) getObj()).searchImageView.setImageBitmap(((ScanImageActivity) getObj()).scanBitmap);
                int andInitImageViewDx = ScanImageActivity.this.getAndInitImageViewDx();
                if (message.arg1 == 0) {
                    HwLog.w(ScanImageActivity.TAG, "handlerMessageAction() msg.arg1 is 0");
                } else {
                    a2.b().b("4");
                    ScanImageActivity.this.startAnimation(andInitImageViewDx);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getAndInitImageViewDx() {
        ImageView imageView = this.searchImageView;
        if (imageView == null || this.scanBitmap == null) {
            HwLog.w(TAG, "getAndInitImageViewDx searchImageView or scanBitmap is null");
            return 0;
        }
        int height = imageView.getHeight();
        float width = this.searchImageView.getWidth();
        float f = (height * 1.0f) / width;
        float height2 = (this.scanBitmap.getHeight() * 1.0f) / this.scanBitmap.getWidth();
        if (f <= height2) {
            this.searchImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return height;
        }
        float f2 = height2 * width;
        initImageViewTopPosition(height, f2);
        return (int) f2;
    }

    private void initImageViewTopPosition(int i, float f) {
        ImageView imageView = this.imageView;
        if (imageView == null) {
            HwLog.w(TAG, "initImageViewTopPosition imageView is null");
            return;
        }
        int i2 = (int) ((i - f) / 2.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.setMargins(0, i2, 0, 0);
        this.imageView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(String str, String str2) throws Throwable {
        this.scanBitmap = l2.d(this, str2, !TextUtils.isEmpty(str) ? Uri.parse(str) : null);
        boolean zSaveAndCompressAndValidImage = saveAndCompressAndValidImage();
        HwLog.i(TAG, "end load bitmap");
        Message messageObtainMessage = this.mHandler.obtainMessage();
        messageObtainMessage.what = 1000;
        messageObtainMessage.arg1 = zSaveAndCompressAndValidImage ? 1 : 0;
        this.mHandler.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        a2.b().a(true, true);
        a2.b().b("5");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showValidImageDialog$2(View view) {
        HwLog.i(TAG, "showSaveDialog, CancelSaveWatchFace.");
        a2.b().b("2");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showValidImageDialog$3(View view) {
        HwLog.i(TAG, "showValidImageDialog, re upload.");
        a2.b().b("3");
        a2.b().a(true, this.isImageIllegal);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showValidImageDialog$4() {
        z2 z2VarA = new z2.a(this.mConText).a(DensityUtil.getStringById(R.string.search_image_dialog_content)).a(DensityUtil.getStringById(R.string.cancel), new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.activity.ScanImageActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$showValidImageDialog$2(view);
            }
        }).b(DensityUtil.getStringById(R.string.re_upload), new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.activity.ScanImageActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$showValidImageDialog$3(view);
            }
        }).a();
        if (z2VarA.isShowing()) {
            return;
        }
        HwLog.i(TAG, "mNoTitleCustomAlertDialog is Showing");
        z2VarA.setCancelable(false);
        z2VarA.show();
        a2.b().b("1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startLoopAnimation$5(boolean z) {
        if (z) {
            startLoopAnimation(0, false);
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startLoopAnimation$6(ValueAnimator valueAnimator) {
        updateImageViewHeight();
    }

    private boolean saveAndCompressAndValidImage() throws Throwable {
        String strA = l2.a(this.scanBitmap);
        if (TextUtils.isEmpty(strA)) {
            HwLog.i(TAG, "saveAndCompressAndValidImage saveSearchImagePath is null");
            showValidImageDialog();
            return false;
        }
        int fileSize = FileUtils.getFileSize(strA);
        if (fileSize < 5242880 && !this.isShowNotLegalDialog) {
            HwLog.i(TAG, "saveAndCompressImage success");
            this.isImageIllegal = true;
            a2.b().c(strA);
            return true;
        }
        this.isImageIllegal = false;
        HwLog.i(TAG, "saveAndCompressImage saveSearchImagePath is null or fileSize is too large:" + fileSize);
        showValidImageDialog();
        return false;
    }

    private void showValidImageDialog() {
        BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.mvp.ui.activity.ScanImageActivity$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$showValidImageDialog$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAnimation(int i) {
        HwLog.i(TAG, "startAnimation dx:" + i);
        this.bitmapHeight = i;
        startLoopAnimation(i, true);
    }

    private void startLoopAnimation(int i, final boolean z) {
        ImageView imageView = this.imageView;
        if (imageView == null) {
            HwLog.w(TAG, "startLoopAnimation imageView is null");
            return;
        }
        imageView.setVisibility(0);
        ImageView imageView2 = this.imageView;
        imageView2.setRotation(imageView2.getRotation() + 180.0f);
        this.imageView.animate().translationY(i).setDuration(1200L).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() { // from class: com.huawei.watchface.mvp.ui.activity.ScanImageActivity$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$startLoopAnimation$5(z);
            }
        }).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.watchface.mvp.ui.activity.ScanImageActivity$$ExternalSyntheticLambda6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$startLoopAnimation$6(valueAnimator);
            }
        }).start();
    }

    private void updateImageViewHeight() {
        int i = this.bitmapHeight;
        int i2 = i < 900 ? (int) ((i / 3) * 1.0f) : 300;
        float translationY = this.imageView.getTranslationY();
        float f = i2;
        if (translationY >= f) {
            float f2 = this.bitmapHeight - translationY;
            float f3 = i2 * 2;
            translationY = f2 < f3 ? f * (f2 / (f3 * 1.0f)) : f;
        }
        ViewGroup.LayoutParams layoutParams = this.imageView.getLayoutParams();
        layoutParams.height = (int) translationY;
        this.imageView.setLayoutParams(layoutParams);
    }

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        HwLog.i(TAG, "finish enter");
        overridePendingTransition(R.anim.watchface_fade_in, R.anim.watchface_fade_out);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        HwLog.i(TAG, "onBackPressed");
        a2.b().a(true, this.isImageIllegal);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        w1.a(configuration, "onConfigurationChanged");
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        final String stringExtra;
        final String stringExtra2;
        super.onCreate(bundle);
        setContentView(R.layout.watchface_activity_scan);
        this.mConText = this;
        this.mHandler = new a(this);
        w1.a(this);
        this.imageView = (ImageView) findViewById(R.id.imageView);
        this.mHwButton = (HwButton) findViewById(R.id.watch_search_cancel);
        this.searchImageView = (ImageView) findViewById(R.id.search_imageView);
        ImageView imageView = (ImageView) findViewById(R.id.scan_image_loading);
        this.mScanLoadingView = imageView;
        this.mLoadingAnimation = (AnimationDrawable) imageView.getDrawable();
        this.imageView.setImageAlpha(200);
        Intent intent = getIntent();
        if (intent == null) {
            HwLog.e(TAG, "onCreate() intent is null.");
            finish();
            return;
        }
        this.mScanLoadingView.setVisibility(0);
        AnimationDrawable animationDrawable = this.mLoadingAnimation;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        try {
            stringExtra = intent.getStringExtra("sourceImagePath");
            stringExtra2 = intent.getStringExtra("sourceImageUri");
        } catch (Exception unused) {
            HwLog.e(TAG, "onCreate() ClassCastException.");
            stringExtra = null;
            stringExtra2 = null;
        }
        if (l2.b(stringExtra) != 0) {
            HwLog.i(TAG, "checkSearchFilePath is not support");
            this.isShowNotLegalDialog = true;
        }
        this.mHwButton.setWidth(w1.d());
        ThreadPoolManager.getInstance().execute(new Runnable() { // from class: com.huawei.watchface.mvp.ui.activity.ScanImageActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.lambda$onCreate$0(stringExtra2, stringExtra);
            }
        });
        this.mHwButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.activity.ScanImageActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$1(view);
            }
        });
    }

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HwLog.i(TAG, "onDestroy() enter.");
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        Bitmap bitmap = this.scanBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.scanBitmap.recycle();
        this.scanBitmap = null;
    }

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        w1.a(getResources().getConfiguration(), BaseDialog.LIFE_CYCLE_ON_RESUME);
        HwLog.i(TAG, "onResume() enter.");
        HwButton hwButton = this.mHwButton;
        if (hwButton != null) {
            hwButton.setWidth(w1.d());
        }
        super.onResume();
    }
}
