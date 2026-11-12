package com.google.androidbrowserhelper.trusted.splashscreens;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.browser.trusted.i;
import cd0.f;
import com.google.androidbrowserhelper.trusted.Utils;
import r.g;

/* JADX INFO: loaded from: classes14.dex */
public class PwaWrapperSplashScreenStrategy implements SplashScreenStrategy {
    private static final String TAG = "SplashScreenStrategy";
    private static SystemBarColorPredictor sSystemBarColorPredictor = new SystemBarColorPredictor();
    private final Activity mActivity;
    private final int mBackgroundColor;
    private final int mDrawableId;
    private boolean mEnterAnimationComplete = false;
    private final int mFadeOutDurationMillis;
    private final String mFileProviderAuthority;
    private Runnable mOnEnterAnimationCompleteRunnable;
    private String mProviderPackage;
    private boolean mProviderSupportsSplashScreens;
    private final ImageView.ScaleType mScaleType;
    private Bitmap mSplashImage;
    private SplashImageTransferTask mSplashImageTransferTask;
    private final Matrix mTransformationMatrix;

    public PwaWrapperSplashScreenStrategy(Activity activity, int i14, int i15, ImageView.ScaleType scaleType, Matrix matrix, int i16, String str) {
        this.mDrawableId = i14;
        this.mBackgroundColor = i15;
        this.mScaleType = scaleType;
        this.mTransformationMatrix = matrix;
        this.mActivity = activity;
        this.mFileProviderAuthority = str;
        this.mFadeOutDurationMillis = i16;
    }

    private void customizeStatusAndNavBarDuringSplashScreen(String str, i iVar) {
        Integer expectedNavbarColor = sSystemBarColorPredictor.getExpectedNavbarColor(this.mActivity, str, iVar);
        if (expectedNavbarColor != null) {
            Utils.setNavigationBarColor(this.mActivity, expectedNavbarColor.intValue());
        }
        Integer expectedStatusBarColor = sSystemBarColorPredictor.getExpectedStatusBarColor(this.mActivity, str, iVar);
        if (expectedStatusBarColor != null) {
            Utils.setStatusBarColor(this.mActivity, expectedStatusBarColor.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSplashImageTransferred$1(Runnable runnable) {
        runnable.run();
        this.mActivity.overridePendingTransition(0, 0);
    }

    private Bundle makeSplashScreenParamsBundle() {
        Bundle bundleD = b71.i.d("androidx.browser.trusted.KEY_SPLASH_SCREEN_VERSION", "androidx.browser.trusted.category.TrustedWebActivitySplashScreensV1");
        bundleD.putInt("androidx.browser.trusted.KEY_SPLASH_SCREEN_FADE_OUT_DURATION", this.mFadeOutDurationMillis);
        bundleD.putInt("androidx.browser.trusted.trusted.KEY_SPLASH_SCREEN_BACKGROUND_COLOR", this.mBackgroundColor);
        bundleD.putInt("androidx.browser.trusted.KEY_SPLASH_SCREEN_SCALE_TYPE", this.mScaleType.ordinal());
        Matrix matrix = this.mTransformationMatrix;
        if (matrix != null) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            bundleD.putFloatArray("androidx.browser.trusted.KEY_SPLASH_SCREEN_TRANSFORMATION_MATRIX", fArr);
        }
        return bundleD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSplashImageTransferred, reason: merged with bridge method [inline-methods] */
    public void lambda$configureTwaBuilder$0(i iVar, boolean z14, Runnable runnable) {
        if (!z14) {
            runnable.run();
        } else {
            iVar.f5329d = makeSplashScreenParamsBundle();
            runWhenEnterAnimationComplete(new f(16, this, runnable));
        }
    }

    private void runWhenEnterAnimationComplete(Runnable runnable) {
        if (this.mEnterAnimationComplete) {
            runnable.run();
        } else {
            this.mOnEnterAnimationCompleteRunnable = runnable;
        }
    }

    private void showSplashScreen() {
        Bitmap bitmapConvertDrawableToBitmap = Utils.convertDrawableToBitmap(this.mActivity, this.mDrawableId);
        this.mSplashImage = bitmapConvertDrawableToBitmap;
        if (bitmapConvertDrawableToBitmap == null) {
            return;
        }
        ImageView imageView = new ImageView(this.mActivity);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView.setImageBitmap(this.mSplashImage);
        imageView.setBackgroundColor(this.mBackgroundColor);
        imageView.setScaleType(this.mScaleType);
        if (this.mScaleType == ImageView.ScaleType.MATRIX) {
            imageView.setImageMatrix(this.mTransformationMatrix);
        }
        this.mActivity.setContentView(imageView);
    }

    @Override // com.google.androidbrowserhelper.trusted.splashscreens.SplashScreenStrategy
    public void configureTwaBuilder(i iVar, g gVar, Runnable runnable) {
        if (!this.mProviderSupportsSplashScreens || this.mSplashImage == null) {
            runnable.run();
        } else {
            if (TextUtils.isEmpty(this.mFileProviderAuthority)) {
                runnable.run();
                return;
            }
            SplashImageTransferTask splashImageTransferTask = new SplashImageTransferTask(this.mActivity, this.mSplashImage, this.mFileProviderAuthority, gVar, this.mProviderPackage);
            this.mSplashImageTransferTask = splashImageTransferTask;
            splashImageTransferTask.execute(new a73.f(this, 8, iVar, runnable));
        }
    }

    public void destroy() {
        SplashImageTransferTask splashImageTransferTask = this.mSplashImageTransferTask;
        if (splashImageTransferTask != null) {
            splashImageTransferTask.cancel();
        }
    }

    public void onActivityEnterAnimationComplete() {
        this.mEnterAnimationComplete = true;
        Runnable runnable = this.mOnEnterAnimationCompleteRunnable;
        if (runnable != null) {
            runnable.run();
            this.mOnEnterAnimationCompleteRunnable = null;
        }
    }

    @Override // com.google.androidbrowserhelper.trusted.splashscreens.SplashScreenStrategy
    public void onTwaLaunchInitiated(String str, i iVar) {
        IntentFilter intentFilter;
        this.mProviderPackage = str;
        ResolveInfo resolveInfoResolveService = this.mActivity.getPackageManager().resolveService(new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(str), 64);
        boolean zHasCategory = (resolveInfoResolveService == null || (intentFilter = resolveInfoResolveService.filter) == null) ? false : intentFilter.hasCategory("androidx.browser.trusted.category.TrustedWebActivitySplashScreensV1");
        this.mProviderSupportsSplashScreens = zHasCategory;
        if (zHasCategory) {
            showSplashScreen();
            if (this.mSplashImage != null) {
                customizeStatusAndNavBarDuringSplashScreen(str, iVar);
            }
        }
    }
}
