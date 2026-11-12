package com.huawei.operation.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewUtils;
import com.huawei.ui.commonui.R;
import defpackage.gxt;
import defpackage.lrp;
import defpackage.ltg;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.text.Normalizer;
import java.util.HashMap;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes13.dex */
public class CaptureUtils {
    private static final int CODE_ERROR = 2;
    private static final int CODE_NO_PERMISSION = -1;
    private static final int CODE_SUCCESS = 1;
    private static final int HTTP_OK = 200;
    private static final int QUALITY = 80;
    private static final String TAG = "PluginOperation_CaptureUtils";
    private Context mContext;
    private Toast mToast;
    private SocialShareCenterApi mSocialShareCenterApi = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
    private Looper mLooper = Looper.myLooper();

    public CaptureUtils(Context context) {
        this.mContext = context;
    }

    public void captureNoPermission(WebView webView, String str) {
        doResponse(webView, str, -1, null);
    }

    public void capture(final WebView webView, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.operation.share.CaptureUtils.1
            @Override // java.lang.Runnable
            public void run() {
                if (CaptureUtils.this.mContext != null) {
                    if (CaptureUtils.this.mToast == null) {
                        CaptureUtils captureUtils = CaptureUtils.this;
                        captureUtils.mToast = Toast.makeText(captureUtils.mContext, CaptureUtils.this.mContext.getString(R.string.IDS_sns_waiting), 1);
                    }
                    CaptureUtils.this.mToast.show();
                }
            }
        });
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.huawei.operation.share.CaptureUtils.2
            @Override // java.lang.Runnable
            public void run() {
                CaptureUtils.this.capture(webView, new IBaseResponseCallback() { // from class: com.huawei.operation.share.CaptureUtils.2.1
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) throws Throwable {
                        if (i == 2) {
                            CaptureUtils.this.doResponse(webView, str, i, null);
                        } else if (obj instanceof Bitmap) {
                            CaptureUtils.this.saveCapture(webView, i, (Bitmap) obj, str);
                        } else {
                            LogUtil.a(CaptureUtils.TAG, "objData is null || objData not instanceof bitmap");
                        }
                    }
                });
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void capture(WebView webView, IBaseResponseCallback iBaseResponseCallback) {
        int contentHeight = (int) (webView.getContentHeight() * webView.getScale());
        int measuredWidth = webView.getMeasuredWidth();
        LogUtil.a(TAG, "webView.height = ", Integer.valueOf(contentHeight), " webView.width = ", Integer.valueOf(measuredWidth));
        if (contentHeight <= 0 || measuredWidth <= 0) {
            LogUtil.a(TAG, "(height<=0) || (width<=0)");
            return;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, contentHeight, Bitmap.Config.ARGB_8888);
            webView.draw(new Canvas(bitmapCreateBitmap));
            iBaseResponseCallback.a(1, bitmapCreateBitmap);
        } catch (IllegalArgumentException | OutOfMemoryError unused) {
            LogUtil.e(TAG, "capture exception");
            iBaseResponseCallback.a(2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    public void saveCapture(WebView webView, int i, Bitmap bitmap, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        Bitmap bitmapScaleBitmapBySize;
        String canonicalPath;
        FileOutputStream fileOutputStreamOpenOutputStream;
        String str2 = null;
        String str3 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        str2 = null;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        try {
            try {
                bitmapScaleBitmapBySize = scaleBitmapBySize(bitmap);
                try {
                    if (Environment.getExternalStorageState().equals("mounted")) {
                        File file = new File(lrp.g);
                        if (!file.exists() && !file.mkdirs()) {
                            doResponse(webView, str, 2, null);
                            doResponse(webView, str, i, null);
                            if (bitmapScaleBitmapBySize != null) {
                                bitmapScaleBitmapBySize.recycle();
                            }
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            ltg.b((OutputStream) null);
                            return;
                        }
                        File file2 = new File(file, "webView_capture.jpg");
                        canonicalPath = file2.getCanonicalPath();
                        try {
                            if (!validateFileName(file2, canonicalPath)) {
                                doResponse(webView, str, 2, null);
                                doResponse(webView, str, i, canonicalPath);
                                if (bitmapScaleBitmapBySize != null) {
                                    bitmapScaleBitmapBySize.recycle();
                                }
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                ltg.b((OutputStream) null);
                                return;
                            }
                            fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(new File(canonicalPath));
                            try {
                                if (bitmapScaleBitmapBySize == null) {
                                    LogUtil.e(TAG, "bitmap is null.");
                                    doResponse(webView, str, 2, null);
                                    doResponse(webView, str, i, canonicalPath);
                                    if (bitmapScaleBitmapBySize != null) {
                                        bitmapScaleBitmapBySize.recycle();
                                    }
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                    }
                                    ltg.b(fileOutputStreamOpenOutputStream);
                                    return;
                                }
                                bitmapScaleBitmapBySize.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStreamOpenOutputStream);
                                str3 = canonicalPath;
                            } catch (IOException unused) {
                                fileOutputStream3 = fileOutputStreamOpenOutputStream;
                                LogUtil.e(TAG, "saveCapture fail.");
                                doResponse(webView, str, 2, canonicalPath);
                                if (bitmapScaleBitmapBySize != null) {
                                    bitmapScaleBitmapBySize.recycle();
                                }
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                ltg.b(fileOutputStream3);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream2 = fileOutputStreamOpenOutputStream;
                                fileOutputStream = fileOutputStream2;
                                str2 = canonicalPath;
                                doResponse(webView, str, i, str2);
                                if (bitmapScaleBitmapBySize != null) {
                                    bitmapScaleBitmapBySize.recycle();
                                }
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                ltg.b(fileOutputStream);
                                throw th;
                            }
                        } catch (IOException unused2) {
                        }
                    } else {
                        doResponse(webView, str, 2, null);
                        fileOutputStreamOpenOutputStream = null;
                    }
                    doResponse(webView, str, i, str3);
                    if (bitmapScaleBitmapBySize != null) {
                        bitmapScaleBitmapBySize.recycle();
                    }
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    ltg.b(fileOutputStreamOpenOutputStream);
                } catch (IOException unused3) {
                    canonicalPath = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    doResponse(webView, str, i, str2);
                    if (bitmapScaleBitmapBySize != null) {
                        bitmapScaleBitmapBySize.recycle();
                    }
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    ltg.b(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused4) {
            bitmapScaleBitmapBySize = null;
            canonicalPath = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            bitmapScaleBitmapBySize = null;
        }
    }

    private Bitmap scaleBitmapBySize(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        float fSqrt = (float) Math.sqrt((1.012E7f / bitmap.getHeight()) / bitmap.getWidth());
        LogUtil.a(TAG, "scale = ", Float.valueOf(fSqrt));
        if (fSqrt > 1.0f) {
            return bitmap;
        }
        matrix.setScale(fSqrt, fSqrt);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doResponse(WebView webView, String str, int i, String str2) {
        LogUtil.a(TAG, "code = ", Integer.valueOf(i));
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.operation.share.CaptureUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1621lambda$doResponse$0$comhuaweioperationshareCaptureUtils();
            }
        });
        if (this.mLooper != null) {
            new Handler(this.mLooper).post(new DoResponseRunnable(webView, WebViewUtils.getUrlForHtml(str, i + " ,  ' " + str2 + " ' ")));
            return;
        }
        LogUtil.a(TAG, "mLooper = null");
    }

    /* JADX INFO: renamed from: lambda$doResponse$0$com-huawei-operation-share-CaptureUtils, reason: not valid java name */
    /* synthetic */ void m1621lambda$doResponse$0$comhuaweioperationshareCaptureUtils() {
        Toast toast = this.mToast;
        if (toast != null) {
            toast.cancel();
        }
    }

    public void share(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            str = str.trim();
        }
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j(TAG, "share: untrusted -> " + str);
        } else {
            gxt gxtVar = new gxt(5);
            gxtVar.c(str);
            gxtVar.c(i);
            gxtVar.d(3);
            gxtVar.e(false);
            this.mSocialShareCenterApi.exeShare(gxtVar, BaseApplication.getContext());
        }
    }

    public void share(String str) {
        share(str, "10", new HashMap<>());
    }

    public void share(String str, String str2, HashMap<String, Object> map) {
        gxt gxtVar = new gxt(4);
        if (!TextUtils.isEmpty(str)) {
            str = str.trim();
        }
        gxtVar.c(str);
        gxtVar.d(3);
        gxtVar.d(str2);
        if (map != null && !map.isEmpty()) {
            gxtVar.c(map);
        }
        gxtVar.e(false);
        SocialShareCenterApi socialShareCenterApi = this.mSocialShareCenterApi;
        if (socialShareCenterApi == null) {
            LogUtil.j(TAG, "share: mSocialShareCenterApi is null");
        } else {
            socialShareCenterApi.exeShare(gxtVar, BaseApplication.getContext());
        }
    }

    private static boolean validateFileName(File file, String str) throws IOException {
        if (Normalizer.normalize(CommonUtil.c(file.getCanonicalPath()), Normalizer.Form.NFKC).startsWith(Normalizer.normalize(new File(str).getCanonicalPath(), Normalizer.Form.NFKC))) {
            return true;
        }
        LogUtil.e(TAG, "File is outside extraction target directory.");
        return false;
    }

    static class DoResponseRunnable implements Runnable {
        private final String url;
        private final WeakReference<WebView> wrWebView;

        DoResponseRunnable(WebView webView, String str) {
            this.wrWebView = new WeakReference<>(webView);
            this.url = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.a(CaptureUtils.TAG, "DoResponseRunnable: loadUrl");
            WebView webView = this.wrWebView.get();
            if (webView == null) {
                LogUtil.a(CaptureUtils.TAG, "DoResponseRunnable: webView is null");
            } else {
                webView.loadUrl(this.url);
            }
        }
    }
}
