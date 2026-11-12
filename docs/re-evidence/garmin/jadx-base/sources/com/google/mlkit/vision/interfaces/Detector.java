package com.google.mlkit.vision.interfaces;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.lifecycle.m0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface Detector<DetectionResultT> extends Closeable, m0 {

    @KeepForSdk
    public static final int TYPE_BARCODE_SCANNING = 1;

    @KeepForSdk
    public static final int TYPE_DOCUMENT_DETECTION = 10;

    @KeepForSdk
    public static final int TYPE_FACE_DETECTION = 2;

    @KeepForSdk
    public static final int TYPE_IMAGE_CAPTIONING = 9;

    @KeepForSdk
    public static final int TYPE_IMAGE_LABELING = 3;

    @KeepForSdk
    public static final int TYPE_OBJECT_DETECTION = 5;

    @KeepForSdk
    public static final int TYPE_POSE_DETECTION = 6;

    @KeepForSdk
    public static final int TYPE_SEGMENTATION = 7;

    @KeepForSdk
    public static final int TYPE_SELFIE_FACE_DETECTION = 8;

    @KeepForSdk
    public static final int TYPE_SUBJECT_SEGMENTATION = 11;

    @KeepForSdk
    public static final int TYPE_TEXT_RECOGNITION = 4;

    @KeepForSdk
    @Retention(RetentionPolicy.CLASS)
    public @interface DetectorType {
    }

    @DetectorType
    @KeepForSdk
    int getDetectorType();

    @KeepForSdk
    Task<DetectionResultT> process(Bitmap bitmap, int i14);

    @KeepForSdk
    Task<DetectionResultT> process(Image image, int i14);

    @KeepForSdk
    Task<DetectionResultT> process(Image image, int i14, Matrix matrix);

    @KeepForSdk
    Task<DetectionResultT> process(ByteBuffer byteBuffer, int i14, int i15, int i16, int i17);
}
