package com.yalantis.ucrop.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import com.yalantis.ucrop.model.CropParameters;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.model.ImageState;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import com.yalantis.ucrop.util.FileUtils;
import com.yalantis.ucrop.util.ImageHeaderParser;
import d8.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class BitmapCropTask extends AsyncTask<Void, Void, Throwable> {
    private static final String TAG = "BitmapCropTask";
    private int cropOffsetX;
    private int cropOffsetY;
    private final Bitmap.CompressFormat mCompressFormat;
    private final int mCompressQuality;
    private final WeakReference<Context> mContext;
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

    public BitmapCropTask(Context context, Bitmap bitmap, ImageState imageState, CropParameters cropParameters, BitmapCropCallback bitmapCropCallback) {
        this.mContext = new WeakReference<>(context);
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

    private boolean crop() throws Throwable {
        if (this.mMaxResultImageSizeX > 0 && this.mMaxResultImageSizeY > 0) {
            float fWidth = this.mCropRect.width() / this.mCurrentScale;
            float fHeight = this.mCropRect.height() / this.mCurrentScale;
            int i14 = this.mMaxResultImageSizeX;
            if (fWidth > i14 || fHeight > this.mMaxResultImageSizeY) {
                float fMin = Math.min(i14 / fWidth, this.mMaxResultImageSizeY / fHeight);
                Bitmap bitmap = this.mViewBitmap;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * fMin), Math.round(this.mViewBitmap.getHeight() * fMin), false);
                Bitmap bitmap2 = this.mViewBitmap;
                if (bitmap2 != bitmapCreateScaledBitmap) {
                    bitmap2.recycle();
                }
                this.mViewBitmap = bitmapCreateScaledBitmap;
                this.mCurrentScale /= fMin;
            }
        }
        if (this.mCurrentAngle != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.mCurrentAngle, this.mViewBitmap.getWidth() / 2, this.mViewBitmap.getHeight() / 2);
            Bitmap bitmap3 = this.mViewBitmap;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), this.mViewBitmap.getHeight(), matrix, true);
            Bitmap bitmap4 = this.mViewBitmap;
            if (bitmap4 != bitmapCreateBitmap) {
                bitmap4.recycle();
            }
            this.mViewBitmap = bitmapCreateBitmap;
        }
        this.cropOffsetX = Math.round((this.mCropRect.left - this.mCurrentImageRect.left) / this.mCurrentScale);
        this.cropOffsetY = Math.round((this.mCropRect.top - this.mCurrentImageRect.top) / this.mCurrentScale);
        this.mCroppedImageWidth = Math.round(this.mCropRect.width() / this.mCurrentScale);
        int iRound = Math.round(this.mCropRect.height() / this.mCurrentScale);
        this.mCroppedImageHeight = iRound;
        if (!shouldCrop(this.mCroppedImageWidth, iRound)) {
            FileUtils.copyFile(this.mImageInputPath, this.mImageOutputPath);
            return false;
        }
        a aVar = new a(this.mImageInputPath);
        saveImage(Bitmap.createBitmap(this.mViewBitmap, this.cropOffsetX, this.cropOffsetY, this.mCroppedImageWidth, this.mCroppedImageHeight));
        if (!this.mCompressFormat.equals(Bitmap.CompressFormat.JPEG)) {
            return true;
        }
        ImageHeaderParser.copyExif(aVar, this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageOutputPath);
        return true;
    }

    private void saveImage(Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (this.mContext.get() == null) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(this.mImageOutputPath), false);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(this.mCompressFormat, this.mCompressQuality, byteArrayOutputStream);
                    fileOutputStream2.write(byteArrayOutputStream.toByteArray());
                    bitmap.recycle();
                    BitmapLoadUtils.close(fileOutputStream2);
                } catch (IOException e4) {
                    e = e4;
                    fileOutputStream = fileOutputStream2;
                    try {
                        e.getLocalizedMessage();
                        BitmapLoadUtils.close(fileOutputStream);
                    } catch (Throwable th3) {
                        th = th3;
                        BitmapLoadUtils.close(fileOutputStream);
                        BitmapLoadUtils.close(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = fileOutputStream2;
                    BitmapLoadUtils.close(fileOutputStream);
                    BitmapLoadUtils.close(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e14) {
                e = e14;
                byteArrayOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
            }
        } catch (IOException e15) {
            e = e15;
            byteArrayOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            byteArrayOutputStream = null;
        }
        BitmapLoadUtils.close(byteArrayOutputStream);
    }

    private boolean shouldCrop(int i14, int i15) {
        int iRound = Math.round(Math.max(i14, i15) / 1000.0f) + 1;
        if (this.mMaxResultImageSizeX <= 0 || this.mMaxResultImageSizeY <= 0) {
            float f14 = iRound;
            if (Math.abs(this.mCropRect.left - this.mCurrentImageRect.left) <= f14 && Math.abs(this.mCropRect.top - this.mCurrentImageRect.top) <= f14 && Math.abs(this.mCropRect.bottom - this.mCurrentImageRect.bottom) <= f14 && Math.abs(this.mCropRect.right - this.mCurrentImageRect.right) <= f14 && this.mCurrentAngle == 0.0f) {
                return false;
            }
        }
        return true;
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
            crop();
            this.mViewBitmap = null;
            return null;
        } catch (Throwable th3) {
            return th3;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Throwable th3) {
        BitmapCropCallback bitmapCropCallback = this.mCropCallback;
        if (bitmapCropCallback != null) {
            if (th3 != null) {
                bitmapCropCallback.onCropFailure(th3);
            } else {
                this.mCropCallback.onBitmapCropped(Uri.fromFile(new File(this.mImageOutputPath)), this.cropOffsetX, this.cropOffsetY, this.mCroppedImageWidth, this.mCroppedImageHeight);
            }
        }
    }
}
