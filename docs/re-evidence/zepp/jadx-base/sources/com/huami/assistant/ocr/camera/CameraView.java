package com.huami.assistant.ocr.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.huami.assistant.R;
import com.huami.assistant.ocr.idcardquality.IDcardQualityProcess;
import com.huami.assistant.ocr.util.ImageUtil;
import com.huami.watch.util.DensityUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class CameraView extends FrameLayout {
    public static final int NATIVE_AUTH_FAIL = 11;
    public static final int NATIVE_AUTH_INIT_SUCCESS = 0;
    public static final int NATIVE_INIT_FAIL = 12;
    public static final int NATIVE_SOLOAD_FAIL = 10;
    public static final int ORIENTATION_HORIZONTAL = 90;
    public static final int ORIENTATION_INVERT = 270;
    public static final int ORIENTATION_PORTRAIT = 0;
    private final int a;
    public Handler b;
    private int c;
    private int d;
    private a e;
    private ICameraControl f;
    private View g;
    private MaskView h;
    private ImageView i;
    private TextView j;
    private LinearLayout k;
    private boolean l;
    private b m;

    public @interface Orientation {
    }

    public class a implements ICameraControl.OnTakePictureCallback {
        private File a;
        private b b;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(byte[] bArr) {
            this.b.a(CameraView.this.d(this.a, bArr, ImageUtil.getOrientation(bArr)));
        }

        @Override // com.huami.assistant.ocr.camera.ICameraControl.OnTakePictureCallback
        public void onPictureTaken(final byte[] data) {
            CameraThreadPool.execute(new Runnable() { // from class: com.huami.assistant.ocr.camera.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(data);
                }
            });
        }
    }

    public interface b {
        void a(Bitmap bitmap);
    }

    public CameraView(Context context) {
        super(context);
        this.a = 0;
        this.b = new Handler(Looper.getMainLooper());
        this.d = 0;
        this.e = new a();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap d(File outputFile, byte[] data, int rotation) {
        try {
            Rect previewFrame = this.f.getPreviewFrame();
            if (this.h.getWidth() != 0 && this.h.getHeight() != 0 && previewFrame.width() != 0 && previewFrame.height() != 0) {
                BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(data, 0, data.length, true);
                int width = rotation % 180 == 0 ? bitmapRegionDecoderNewInstance.getWidth() : bitmapRegionDecoderNewInstance.getHeight();
                int height = rotation % 180 == 0 ? bitmapRegionDecoderNewInstance.getHeight() : bitmapRegionDecoderNewInstance.getWidth();
                Rect frameRect = this.h.getFrameRect();
                int width2 = (frameRect.left * width) / this.h.getWidth();
                int height2 = (frameRect.top * height) / this.h.getHeight();
                int width3 = (frameRect.right * width) / this.h.getWidth();
                int height3 = (frameRect.bottom * height) / this.h.getHeight();
                if (previewFrame.top < 0) {
                    int iHeight = (previewFrame.height() * getWidth()) / previewFrame.width();
                    int iHeight2 = (((iHeight - frameRect.height()) / 2) * getWidth()) / previewFrame.width();
                    int iHeight3 = (((iHeight + frameRect.height()) / 2) * getWidth()) / previewFrame.width();
                    height2 = (iHeight2 * height) / previewFrame.height();
                    height3 = (iHeight3 * height) / previewFrame.height();
                } else if (previewFrame.left < 0) {
                    int iWidth = (previewFrame.width() * getHeight()) / previewFrame.height();
                    int iWidth2 = (((iWidth - this.h.getFrameRect().width()) / 2) * getHeight()) / previewFrame.height();
                    int iWidth3 = (((iWidth + this.h.getFrameRect().width()) / 2) * getHeight()) / previewFrame.height();
                    width2 = (iWidth2 * width) / previewFrame.width();
                    width3 = (iWidth3 * width) / previewFrame.width();
                }
                Rect rect = new Rect();
                rect.left = width2;
                rect.top = height2;
                rect.right = width3;
                rect.bottom = height3;
                if (rotation % 180 == 90) {
                    int width4 = bitmapRegionDecoderNewInstance.getWidth() / 2;
                    int height4 = bitmapRegionDecoderNewInstance.getHeight() / 2;
                    int iHeight4 = rect.height();
                    int iWidth4 = rect.width();
                    rect.left = width4 - (iHeight4 / 2);
                    rect.top = height4 - (iWidth4 / 2);
                    rect.right = width4 + (iHeight4 / 2);
                    rect.bottom = height4 + (iWidth4 / 2);
                    rect.sort();
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                int iMin = Math.min(Math.min(bitmapRegionDecoderNewInstance.getWidth(), bitmapRegionDecoderNewInstance.getHeight()), RaceId.RACE_NVKEY_READFULLKEY);
                options.inSampleSize = ImageUtil.calculateInSampleSize(options, iMin, iMin);
                options.inScaled = true;
                options.inDensity = Math.max(options.outWidth, options.outHeight);
                options.inTargetDensity = iMin;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                if (rotation != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(rotation);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeRegion, 0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight(), matrix, false);
                    if (bitmapDecodeRegion != bitmapCreateBitmap) {
                        bitmapDecodeRegion.recycle();
                    }
                    bitmapDecodeRegion = bitmapCreateBitmap;
                }
                try {
                    if (!outputFile.exists()) {
                        outputFile.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
                    bitmapDecodeRegion.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return bitmapDecodeRegion;
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(byte[] data, final int rotation) {
        int iIdcardQualityDetectionImg;
        int i = this.d;
        if (i != 0) {
            i(i);
            return 1;
        }
        if (this.f.getAbortingScan().get()) {
            return 0;
        }
        Rect previewFrame = this.f.getPreviewFrame();
        if (this.h.getWidth() == 0 || this.h.getHeight() == 0 || previewFrame.width() == 0 || previewFrame.height() == 0) {
            return 0;
        }
        BitmapRegionDecoder bitmapRegionDecoderNewInstance = null;
        try {
            bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(data, 0, data.length, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i2 = rotation % 180;
        int width = i2 == 0 ? bitmapRegionDecoderNewInstance.getWidth() : bitmapRegionDecoderNewInstance.getHeight();
        int height = i2 == 0 ? bitmapRegionDecoderNewInstance.getHeight() : bitmapRegionDecoderNewInstance.getWidth();
        Rect frameRectExtend = this.h.getFrameRectExtend();
        int width2 = (frameRectExtend.left * width) / this.h.getWidth();
        int height2 = (frameRectExtend.top * height) / this.h.getHeight();
        int width3 = (frameRectExtend.right * width) / this.h.getWidth();
        int height3 = (frameRectExtend.bottom * height) / this.h.getHeight();
        if (previewFrame.top < 0) {
            int iHeight = (previewFrame.height() * getWidth()) / previewFrame.width();
            int iHeight2 = (((iHeight - frameRectExtend.height()) / 2) * getWidth()) / previewFrame.width();
            int iHeight3 = (((iHeight + frameRectExtend.height()) / 2) * getWidth()) / previewFrame.width();
            height2 = (iHeight2 * height) / previewFrame.height();
            height3 = (iHeight3 * height) / previewFrame.height();
        } else if (previewFrame.left < 0) {
            int iWidth = (previewFrame.width() * getHeight()) / previewFrame.height();
            int iWidth2 = (((iWidth - this.h.getFrameRect().width()) / 2) * getHeight()) / previewFrame.height();
            int iWidth3 = (((iWidth + this.h.getFrameRect().width()) / 2) * getHeight()) / previewFrame.height();
            width2 = (iWidth2 * width) / previewFrame.width();
            width3 = (iWidth3 * width) / previewFrame.width();
        }
        Rect rect = new Rect();
        rect.left = width2;
        rect.top = height2;
        rect.right = width3;
        rect.bottom = height3;
        if (i2 == 90) {
            int width4 = bitmapRegionDecoderNewInstance.getWidth() / 2;
            int height4 = bitmapRegionDecoderNewInstance.getHeight() / 2;
            int iHeight4 = rect.height();
            int iWidth4 = rect.width();
            int i3 = iHeight4 / 2;
            rect.left = width4 - i3;
            int i4 = iWidth4 / 2;
            rect.top = height4 - i4;
            rect.right = width4 + i3;
            rect.bottom = height4 + i4;
            rect.sort();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int iMin = Math.min(Math.min(bitmapRegionDecoderNewInstance.getWidth(), bitmapRegionDecoderNewInstance.getHeight()), RaceId.RACE_NVKEY_READFULLKEY);
        options.inSampleSize = ImageUtil.calculateInSampleSize(options, iMin, iMin);
        options.inScaled = true;
        options.inDensity = Math.max(options.outWidth, options.outHeight);
        options.inTargetDensity = iMin;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
        if (rotation != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(rotation);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeRegion, 0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight(), matrix, false);
            if (bitmapDecodeRegion != bitmapCreateBitmap) {
                bitmapDecodeRegion.recycle();
            }
            bitmapDecodeRegion = bitmapCreateBitmap;
        }
        int i5 = this.c;
        if (i5 != 1) {
            iIdcardQualityDetectionImg = i5 != 2 ? 1 : IDcardQualityProcess.getInstance().idcardQualityDetectionImg(bitmapDecodeRegion, false);
        } else {
            iIdcardQualityDetectionImg = IDcardQualityProcess.getInstance().idcardQualityDetectionImg(bitmapDecodeRegion, true);
        }
        if (iIdcardQualityDetectionImg == 0) {
            if (!this.f.getAbortingScan().compareAndSet(false, true)) {
                bitmapDecodeRegion.recycle();
                return 0;
            }
            this.m.a(bitmapDecodeRegion);
        }
        i(iIdcardQualityDetectionImg);
        return iIdcardQualityDetectionImg;
    }

    private String f(int status) {
        switch (status) {
            case 0:
                return "";
            case 1:
            case 8:
            case 9:
            default:
                return getResources().getString(R.string.error_idcard_not_in);
            case 2:
                return getResources().getString(R.string.error_idcard_blur);
            case 3:
                return getResources().getString(R.string.error_idcard_reflective);
            case 4:
                return getResources().getString(R.string.error_idcard_reverse);
            case 5:
                return getResources().getString(R.string.error_idcard_shake);
            case 6:
                return getResources().getString(R.string.error_idcard_too_far);
            case 7:
                return getResources().getString(R.string.error_idcard_not_in);
            case 10:
                return getResources().getString(R.string.error_native_soload_fail);
            case 11:
                return getResources().getString(R.string.error_native_auth_fail);
            case 12:
                return getResources().getString(R.string.error_native_init_fail);
        }
    }

    private void g() {
        Camera1Control camera1Control = new Camera1Control(getContext());
        this.f = camera1Control;
        View displayView = camera1Control.getDisplayView();
        this.g = displayView;
        addView(displayView);
        MaskView maskView = new MaskView(getContext());
        this.h = maskView;
        addView(maskView);
        ImageView imageView = new ImageView(getContext());
        this.i = imageView;
        addView(imageView);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.k = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) DensityUtil.dpToPx(getContext(), 25.0f));
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        this.j = textView;
        textView.setBackgroundResource(R.drawable.bd_ocr_round_corner);
        this.j.setAlpha(0.5f);
        this.j.setPadding((int) DensityUtil.dpToPx(getContext(), 10.0f), 0, (int) DensityUtil.dpToPx(getContext(), 10.0f), 0);
        this.k.addView(this.j, layoutParams);
        this.j.setGravity(17);
        this.j.setTextColor(-1);
        this.j.setTextSize(2, 14.0f);
        this.j.setText(f(-1));
        addView(this.k, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(int i) {
        if (i == 0) {
            this.j.setVisibility(4);
        } else {
            if (this.f.getAbortingScan().get()) {
                return;
            }
            this.j.setVisibility(0);
            this.j.setText(f(i));
        }
    }

    private void i(final int status) {
        this.b.post(new Runnable() { // from class: vj0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h(status);
            }
        });
    }

    public ICameraControl getCameraControl() {
        return this.f;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i = bottom - top;
        this.g.layout(left, 0, right, i);
        this.h.layout(left, 0, right, i);
        int iDpToPx = (int) DensityUtil.dpToPx(getContext(), 250.0f);
        int iDpToPx2 = (int) DensityUtil.dpToPx(getContext(), 25.0f);
        int width = (getWidth() - iDpToPx) / 2;
        int iDpToPx3 = (int) (this.h.getFrameRect().bottom + DensityUtil.dpToPx(getContext(), 16.0f));
        int i2 = iDpToPx + width;
        int i3 = iDpToPx2 + iDpToPx3;
        this.k.layout(width, iDpToPx3, i2, i3);
        this.i.layout(width, iDpToPx3, i2, i3);
    }

    public void release() {
        IDcardQualityProcess.getInstance().releaseModel();
    }

    public void setAutoPictureCallback(b callback) {
        this.m = callback;
    }

    public void setEnableScan(boolean enableScan) {
        this.l = enableScan;
    }

    public void setInitNativeStatus(int initNativeStatus) {
        this.d = initNativeStatus;
    }

    public void setMaskType(@MaskView.MaskType int maskType, final Context ctx) {
        this.h.setMaskType(maskType);
        boolean z = false;
        this.h.setVisibility(0);
        this.i.setVisibility(0);
        int i = R.drawable.bd_ocr_hint_align_id_card;
        this.c = maskType;
        if (maskType == 1 || maskType == 2) {
            i = R.drawable.bd_ocr_round_corner;
        } else {
            if (maskType == 11) {
                i = R.drawable.bd_ocr_hint_align_bank_card;
            } else if (maskType != 21) {
                this.h.setVisibility(4);
                this.i.setVisibility(4);
            } else {
                this.i.setVisibility(4);
            }
            z = true;
        }
        if (z) {
            this.i.setImageResource(i);
            this.k.setVisibility(4);
        }
        if (maskType == 1 && this.l) {
            this.f.setDetectCallback(new ICameraControl.OnDetectPictureCallback() { // from class: uj0
                @Override // com.huami.assistant.ocr.camera.ICameraControl.OnDetectPictureCallback
                public final int onDetect(byte[] bArr, int i2) {
                    return this.a.e(bArr, i2);
                }
            });
        }
        if (maskType == 2 && this.l) {
            this.f.setDetectCallback(new ICameraControl.OnDetectPictureCallback() { // from class: uj0
                @Override // com.huami.assistant.ocr.camera.ICameraControl.OnDetectPictureCallback
                public final int onDetect(byte[] bArr, int i2) {
                    return this.a.e(bArr, i2);
                }
            });
        }
    }

    public void setOrientation(@Orientation int orientation) {
        this.f.setDisplayOrientation(orientation);
    }

    public void start() {
        this.f.start();
        setKeepScreenOn(true);
    }

    public void stop() {
        this.f.stop();
        setKeepScreenOn(false);
    }

    public void takePicture(final File file, final b callback) {
        this.e.a = file;
        this.e.b = callback;
        this.f.takePicture(this.e);
    }

    public CameraView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.a = 0;
        this.b = new Handler(Looper.getMainLooper());
        this.d = 0;
        this.e = new a();
        g();
    }

    public CameraView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = 0;
        this.b = new Handler(Looper.getMainLooper());
        this.d = 0;
        this.e = new a();
        g();
    }
}
