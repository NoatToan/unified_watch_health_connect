package com.huawei.watchface.mvp.ui.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.media3.common.C;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.skinner.base.SkinBaseFragmentActivity;
import com.huawei.watchface.R;
import com.huawei.watchface.l2;
import com.huawei.watchface.mvp.model.datatype.ClipOptions;
import com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager;
import com.huawei.watchface.mvp.ui.widget.ClipImageView;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.SafeHandler;
import com.huawei.watchface.videoedit.utils.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class ClipImageActivity extends SkinBaseFragmentActivity implements View.OnClickListener {
    public static final String CLIP_RESULT_PATH = "clippedImagePath";
    public static final String CLIP_TARGET_HEIGHT = "clipTargetHeight";
    public static final String CLIP_TARGET_SHAPE = "clipTargetShape";
    public static final String CLIP_TARGET_WIDTH = "clipTargetWidth";
    public static final int DEFAULT_CLICK_TIME = 3000;
    public static final int DEFAULT_TARGET_HEIGHT = 454;
    public static final int DEFAULT_TARGET_WIDTH = 454;
    public static final String IMAGE_SUFFIX = "imageSuffix";
    public static final String IMAGE_SUFFIX_IS_NOT_SUPPORT = "imageSuffixIsNotSupport";
    public static final int IMAGE_TYPE_NOT_SUPPORT = 2000;
    public static final String ORG_IMAGE_PATH = "orgImagePath";
    public static final String ORG_WINDOWS_HEIGHT = "orgWindowsHeight";
    public static final String ORG_WINDOWS_WIDTH = "orgWindowsWidth";
    public static final int REFRESH_IMAGE_VIEW_MESSAGE = 1000;
    public static final String SOURCE_IMAGE_PATH = "sourceImagePath";
    public static final String SOURCE_IMAGE_SCALE_X = "scaleX";
    public static final String SOURCE_IMAGE_SCALE_Y = "scaleY";
    public static final String SOURCE_IMAGE_TRANS_X = "transX";
    public static final String SOURCE_IMAGE_TRANS_Y = "transY";
    public static final String SOURCE_IMAGE_URI = "sourceImageUri";
    private static final String TAG = "ClipImageActivity";
    private ImageView confirmButton;
    private long lastSaveAlbumClick;
    private Bitmap mClipBitmap;
    private ImageView mClipLoadingView;
    private ClipOptions mClipOptions;
    private Handler mHandler;
    private ClipImageView mImageView;
    private AnimationDrawable mLoadingAnimation;
    private Bitmap mOriginBitmap;

    public static class a extends SafeHandler {
        public a(ClipImageActivity clipImageActivity) {
            super(clipImageActivity);
        }

        @Override // com.huawei.watchface.utils.SafeHandler
        public void handlerMessageAction(Message message) {
            if (message == null) {
                return;
            }
            HwLog.i(ClipImageActivity.TAG, "handlerMessageAction() message.what: " + message.what);
            int i = message.what;
            if (i == 1000) {
                ((ClipImageActivity) getObj()).mLoadingAnimation.stop();
                ((ClipImageActivity) getObj()).mClipLoadingView.setVisibility(8);
                ((ClipImageActivity) getObj()).confirmButton.setEnabled(true);
                if (((ClipImageActivity) getObj()).mClipBitmap != null && ((ClipImageActivity) getObj()).mImageView != null) {
                    ((ClipImageActivity) getObj()).mImageView.setClipOptions(((ClipImageActivity) getObj()).mClipOptions);
                    ((ClipImageActivity) getObj()).mImageView.setImageBitmap(((ClipImageActivity) getObj()).mClipBitmap);
                    return;
                } else {
                    ((ClipImageActivity) getObj()).setResult(0, null);
                    ((ClipImageActivity) getObj()).finish();
                    HwLog.w(ClipImageActivity.TAG, "handlerMessageAction() mClipBitmap or mImageView is null.");
                    return;
                }
            }
            if (i != 2000) {
                HwLog.w(ClipImageActivity.TAG, "handlerMessageAction() Handler default.");
                return;
            }
            Object obj = message.obj;
            String str = obj instanceof String ? (String) obj : "";
            HwLog.e(ClipImageActivity.TAG, "IMAGE_TYPE_NOT_SUPPORT suffix:" + str);
            ((ClipImageActivity) getObj()).mLoadingAnimation.stop();
            ((ClipImageActivity) getObj()).mClipLoadingView.setVisibility(8);
            ((ClipImageActivity) getObj()).confirmButton.setEnabled(true);
            SafeIntent safeIntent = new SafeIntent(new Intent());
            safeIntent.putExtra(ClipImageActivity.IMAGE_SUFFIX_IS_NOT_SUPPORT, 1);
            safeIntent.putExtra(ClipImageActivity.IMAGE_SUFFIX, str);
            ((ClipImageActivity) getObj()).setResult(0, safeIntent);
            ((ClipImageActivity) getObj()).finish();
            HwLog.w(ClipImageActivity.TAG, "handlerMessageAction() image type is not support.");
        }
    }

    private void displayClipBitmap(final String str, final boolean z, Intent intent) {
        final String stringExtra;
        int intExtra;
        int intExtra2;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        ClipOptions clipOptions = new ClipOptions(this);
        this.mClipOptions = clipOptions;
        clipOptions.setSourcePaths(arrayList);
        try {
            if (!TextUtils.isEmpty(intent.getStringExtra(CLIP_RESULT_PATH))) {
                this.mClipOptions.setOutputDirectory(intent.getStringExtra(CLIP_RESULT_PATH));
            }
            intExtra = intent.getIntExtra(CLIP_TARGET_WIDTH, 454);
            intExtra2 = intent.getIntExtra(CLIP_TARGET_HEIGHT, 454);
            boolean booleanExtra = intent.getBooleanExtra(CLIP_TARGET_SHAPE, false);
            float fFloatValue = intent.getStringExtra("scaleX") == null ? 0.0f : Float.valueOf(intent.getStringExtra("scaleX")).floatValue();
            float fFloatValue2 = intent.getStringExtra("scaleY") == null ? 0.0f : Float.valueOf(intent.getStringExtra("scaleY")).floatValue();
            float fFloatValue3 = intent.getStringExtra(SOURCE_IMAGE_TRANS_X) == null ? 0.0f : Float.valueOf(intent.getStringExtra(SOURCE_IMAGE_TRANS_X)).floatValue();
            float fFloatValue4 = intent.getStringExtra(SOURCE_IMAGE_TRANS_Y) == null ? 0.0f : Float.valueOf(intent.getStringExtra(SOURCE_IMAGE_TRANS_Y)).floatValue();
            int[] iArrK = CommonUtils.k();
            if (iArrK != null && iArrK.length > 1 && intent.getStringExtra(ORG_WINDOWS_HEIGHT) != null && Integer.valueOf(intent.getStringExtra(ORG_WINDOWS_HEIGHT)).intValue() != iArrK[0] && intent.getStringExtra(ORG_WINDOWS_WIDTH) != null && Integer.valueOf(intent.getStringExtra(ORG_WINDOWS_WIDTH)).intValue() != iArrK[1]) {
                HwLog.d(TAG, "second edit windows size is not same");
                fFloatValue2 = 0.0f;
                fFloatValue = 0.0f;
            }
            this.mClipOptions.setScaleX(fFloatValue);
            this.mClipOptions.setScaleY(fFloatValue2);
            this.mClipOptions.setTransX(fFloatValue3);
            this.mClipOptions.setTransY(fFloatValue4);
            this.mClipOptions.setOutputSize(intExtra, intExtra2);
            this.mClipOptions.setClipRectangleAnyway(booleanExtra);
            try {
                this.mClipOptions.setSecondEdit(z);
                stringExtra = intent.getStringExtra("sourceImageUri");
            } catch (ClassCastException e) {
                e = e;
                HwLog.e(TAG, "displayClipBitmap() e: " + HwLog.printException((Exception) e));
                stringExtra = null;
                intExtra = 0;
                intExtra2 = 0;
            } catch (Exception e2) {
                e = e2;
                HwLog.e(TAG, "displayClipBitmap() Exception e: " + HwLog.printException(e));
                stringExtra = null;
                intExtra = 0;
                intExtra2 = 0;
            }
        } catch (ClassCastException e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        }
        if (stringExtra == null || intExtra == 0 || intExtra2 == 0) {
            HwLog.e(TAG, "displayClipBitmap() params is empty.");
            setResult(0, null);
            finish();
        } else {
            this.mClipLoadingView.setVisibility(0);
            this.mLoadingAnimation.start();
            this.confirmButton.setEnabled(false);
            ThreadPoolManager.getInstance().execute(new Runnable() { // from class: com.huawei.watchface.mvp.ui.activity.ClipImageActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$displayClipBitmap$0(z, str, stringExtra, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$displayClipBitmap$0(boolean z, String str, String str2, String str3) {
        HwLog.i(TAG, "start load bitmap isSecondEdit:" + z);
        if (z) {
            this.mClipBitmap = Utils.getPicture(str);
            this.mClipOptions.setClipOrgFilePath(str);
        } else {
            Uri uri = Uri.parse(str2);
            if (l2.a(str3) == 0) {
                this.mClipBitmap = l2.d(this, str3, uri);
            } else {
                if (l2.a(str3) == 1) {
                    this.mClipBitmap = null;
                    Message messageObtainMessage = this.mHandler.obtainMessage();
                    messageObtainMessage.what = 2000;
                    messageObtainMessage.obj = l2.f(str3);
                    this.mHandler.sendMessage(messageObtainMessage);
                    return;
                }
                this.mClipBitmap = null;
            }
        }
        HwLog.i(TAG, "end load bitmap");
        Message messageObtainMessage2 = this.mHandler.obtainMessage();
        messageObtainMessage2.what = 1000;
        this.mHandler.sendMessage(messageObtainMessage2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.cancel_clip) {
            setResult(0, null);
        } else {
            HwLog.i(TAG, "onClick() ConfirmButton Click!");
            if (Math.abs(System.currentTimeMillis() - this.lastSaveAlbumClick) < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                HwLog.i(TAG, "onClick disabled Click");
                return;
            }
            this.lastSaveAlbumClick = System.currentTimeMillis();
            ClipOptions resultClipOptions = this.mImageView.getResultClipOptions();
            if (resultClipOptions == null) {
                HwLog.e(TAG, "onClick() options is null!");
                setResult(0, null);
                finish();
                return;
            }
            this.mOriginBitmap = null;
            if (this.mImageView.getDrawable() instanceof BitmapDrawable) {
                this.mOriginBitmap = ((BitmapDrawable) this.mImageView.getDrawable()).getBitmap();
            }
            Bitmap bitmap = this.mOriginBitmap;
            if (bitmap == null) {
                setResult(0, null);
                finish();
                return;
            }
            l2.b(bitmap, resultClipOptions);
            Intent intent = new Intent();
            if (resultClipOptions.getResultPaths().isEmpty()) {
                setResult(0, null);
            } else {
                intent.putExtra(CLIP_RESULT_PATH, resultClipOptions.getResultPaths().get(0));
                setResult(-1, intent);
            }
        }
        finish();
    }

    @Override // com.huawei.skinner.base.SkinBaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean booleanExtra;
        String stringExtra;
        super.onCreate(bundle);
        setContentView(R.layout.watchface_activity_watch_face_photo_album_image_clip);
        setRequestedOrientation(1);
        this.mHandler = new a(this);
        this.mImageView = (ClipImageView) findViewById(R.id.clip_image_view);
        CommonUtils.a(getWindow(), 0, false);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.action_button_layout);
        if (relativeLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) relativeLayout.getLayoutParams();
            marginLayoutParams.topMargin = CommonUtils.h(this);
            relativeLayout.setLayoutParams(marginLayoutParams);
        }
        ImageView imageView = (ImageView) findViewById(R.id.clip_image_loading);
        this.mClipLoadingView = imageView;
        this.mLoadingAnimation = (AnimationDrawable) imageView.getDrawable();
        ImageView imageView2 = (ImageView) findViewById(R.id.cancel_clip);
        this.confirmButton = (ImageView) findViewById(R.id.confirm_clip);
        imageView2.setOnClickListener(this);
        this.confirmButton.setOnClickListener(this);
        Intent intent = getIntent();
        if (intent == null) {
            HwLog.e(TAG, "onCreate() intent is null.");
            setResult(0, null);
            finish();
            return;
        }
        try {
            stringExtra = intent.getStringExtra("sourceImagePath");
            booleanExtra = intent.getBooleanExtra("isSecondEdit", false);
        } catch (ClassCastException unused) {
            HwLog.e(TAG, "onCreate() ClassCastException.");
            booleanExtra = false;
            stringExtra = null;
        }
        if (stringExtra != null) {
            displayClipBitmap(stringExtra, booleanExtra, intent);
            return;
        }
        HwLog.e(TAG, "onCreate() sourcePath is null.");
        setResult(0, null);
        finish();
    }

    @Override // com.huawei.skinner.base.SkinBaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HwLog.i(TAG, "onDestroy() enter.");
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        Bitmap bitmap = this.mClipBitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.mClipBitmap.recycle();
            this.mClipBitmap = null;
        }
        Bitmap bitmap2 = this.mOriginBitmap;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        HwLog.i(TAG, "onDestroy() mOriginBitmap recycle");
        this.mOriginBitmap.recycle();
        this.mOriginBitmap = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
