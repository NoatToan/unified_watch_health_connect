package com.yalantis.ucrop.task;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import com.yalantis.ucrop.model.CropParameters;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.model.ImageState;
import com.yalantis.ucrop.util.FileUtils;
import com.yalantis.ucrop.util.ImageHeaderParser;
import defpackage.gh8;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapCropTask extends AsyncTask<Void, Void, Throwable> {
    private static final String TAG = "BitmapCropTask";
    private int cropOffsetX;
    private int cropOffsetY;
    private final Bitmap.CompressFormat mCompressFormat;
    private final int mCompressQuality;
    private final BitmapCropCallback mCropCallback;
    private final RectF mCropRect;
    private int mCroppedImageHeight;
    private int mCroppedImageWidth;
    private float mCurrentAngle;
    private final RectF mCurrentImageRect;
    private float mCurrentScale;
    private final ExifInfo mExifInfo;
    private final String mImageInputPath;
    private final String mImageOutputPath;
    private final int mMaxResultImageSizeX;
    private final int mMaxResultImageSizeY;
    private Bitmap mViewBitmap;

    static {
        System.loadLibrary("ucrop");
    }

    public BitmapCropTask(Bitmap bitmap, ImageState imageState, CropParameters cropParameters, BitmapCropCallback bitmapCropCallback) {
        this.mViewBitmap = bitmap;
        this.mCropRect = imageState.getCropRect();
        this.mCurrentImageRect = imageState.getCurrentImageRect();
        this.mCurrentScale = imageState.getCurrentScale();
        this.mCurrentAngle = imageState.getCurrentAngle();
        this.mMaxResultImageSizeX = cropParameters.getMaxResultImageSizeX();
        this.mMaxResultImageSizeY = cropParameters.getMaxResultImageSizeY();
        this.mCompressFormat = cropParameters.getCompressFormat();
        this.mCompressQuality = cropParameters.getCompressQuality();
        this.mImageInputPath = cropParameters.getImageInputPath();
        this.mImageOutputPath = cropParameters.getImageOutputPath();
        this.mExifInfo = cropParameters.getExifInfo();
        this.mCropCallback = bitmapCropCallback;
    }

    private boolean crop(float f) throws Throwable {
        gh8 gh8Var = new gh8(this.mImageInputPath);
        this.cropOffsetX = Math.round((this.mCropRect.left - this.mCurrentImageRect.left) / this.mCurrentScale);
        this.cropOffsetY = Math.round((this.mCropRect.top - this.mCurrentImageRect.top) / this.mCurrentScale);
        this.mCroppedImageWidth = Math.round(this.mCropRect.width() / this.mCurrentScale);
        int iRound = Math.round(this.mCropRect.height() / this.mCurrentScale);
        this.mCroppedImageHeight = iRound;
        boolean zShouldCrop = shouldCrop(this.mCroppedImageWidth, iRound);
        StringBuilder sb = new StringBuilder();
        sb.append("Should crop: ");
        sb.append(zShouldCrop);
        if (!zShouldCrop) {
            FileUtils.copyFile(this.mImageInputPath, this.mImageOutputPath);
            return false;
        }
        boolean zCropCImg = cropCImg(this.mImageInputPath, this.mImageOutputPath, this.cropOffsetX, this.cropOffsetY, this.mCroppedImageWidth, this.mCroppedImageHeight, this.mCurrentAngle, f, this.mCompressFormat.ordinal(), this.mCompressQuality, this.mExifInfo.getExifDegrees(), this.mExifInfo.getExifTranslation());
        if (zCropCImg && this.mCompressFormat.equals(Bitmap.CompressFormat.JPEG)) {
            ImageHeaderParser.copyExif(gh8Var, this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageOutputPath);
        }
        return zCropCImg;
    }

    public static native boolean cropCImg(String str, String str2, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8) throws IOException, OutOfMemoryError;

    private float resize() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.mImageInputPath, options);
        if (this.mExifInfo.getExifDegrees() != 90 && this.mExifInfo.getExifDegrees() != 270) {
            z = false;
        }
        this.mCurrentScale /= Math.min((z ? options.outHeight : options.outWidth) / this.mViewBitmap.getWidth(), (z ? options.outWidth : options.outHeight) / this.mViewBitmap.getHeight());
        if (this.mMaxResultImageSizeX > 0 && this.mMaxResultImageSizeY > 0) {
            float fWidth = this.mCropRect.width() / this.mCurrentScale;
            float fHeight = this.mCropRect.height() / this.mCurrentScale;
            int i = this.mMaxResultImageSizeX;
            if (fWidth > i || fHeight > this.mMaxResultImageSizeY) {
                float fMin = Math.min(i / fWidth, this.mMaxResultImageSizeY / fHeight);
                this.mCurrentScale /= fMin;
                return fMin;
            }
        }
        return 1.0f;
    }

    private boolean shouldCrop(int i, int i2) {
        int iRound = Math.round(Math.max(i, i2) / 1000.0f) + 1;
        if (this.mMaxResultImageSizeX > 0 && this.mMaxResultImageSizeY > 0) {
            return true;
        }
        float f = iRound;
        return Math.abs(this.mCropRect.left - this.mCurrentImageRect.left) > f || Math.abs(this.mCropRect.top - this.mCurrentImageRect.top) > f || Math.abs(this.mCropRect.bottom - this.mCurrentImageRect.bottom) > f || Math.abs(this.mCropRect.right - this.mCurrentImageRect.right) > f || this.mCurrentAngle != 0.0f;
    }

    @Override // android.os.AsyncTask
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.mViewBitmap;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.mCurrentImageRect.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            crop(resize());
            this.mViewBitmap = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Throwable th) {
        BitmapCropCallback bitmapCropCallback = this.mCropCallback;
        if (bitmapCropCallback != null) {
            if (th != null) {
                bitmapCropCallback.onCropFailure(th);
            } else {
                this.mCropCallback.onBitmapCropped(Uri.fromFile(new File(this.mImageOutputPath)), this.cropOffsetX, this.cropOffsetY, this.mCroppedImageWidth, this.mCroppedImageHeight);
            }
        }
    }
}
