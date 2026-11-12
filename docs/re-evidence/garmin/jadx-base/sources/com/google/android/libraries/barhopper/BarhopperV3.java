package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import com.airbnb.lottie.animation.keyframe.a;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import com.google.barhopper.deeplearning.BarhopperV3Options;
import com.google.photos.vision.barhopper.BarhopperProto$BarhopperResponse;
import java.io.Closeable;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class BarhopperV3 implements Closeable {
    private static final long NULLPTR = 0;
    private static final String TAG = "BarhopperV3";
    private long nativePointer;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j8);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j8, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j8, int i14, int i15, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j8, int i14, int i15, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j8, int i14, int i15, int i16, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j8, int i14, int i15, int i16, byte[] bArr, RecognitionOptions recognitionOptions);

    private static BarhopperProto$BarhopperResponse toProto(byte[] bArr) {
        bArr.getClass();
        try {
            return BarhopperProto$BarhopperResponse.zzb(bArr, zzds.zza());
        } catch (zzer e4) {
            a.x("Received unexpected BarhopperResponse buffer: {0}", e4);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j8 = this.nativePointer;
        if (j8 != 0) {
            closeNative(j8);
            this.nativePointer = 0L;
        }
    }

    public void create(BarhopperV3Options barhopperV3Options) {
        if (this.nativePointer != 0) {
            return;
        }
        long jCreateNativeWithClientOptions = createNativeWithClientOptions(barhopperV3Options.zzD());
        this.nativePointer = jCreateNativeWithClientOptions;
        if (jCreateNativeWithClientOptions != 0) {
            return;
        }
        h.s("Failed to create native pointer with client options.");
    }

    public BarhopperProto$BarhopperResponse recognize(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.nativePointer == 0) {
            h.z("Native pointer does not exist.");
            return null;
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig()));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return toProto(recognizeBitmapNative(this.nativePointer, bitmap, recognitionOptions));
    }

    public void create() {
        if (this.nativePointer != 0) {
            return;
        }
        long jCreateNative = createNative();
        this.nativePointer = jCreateNative;
        if (jCreateNative != 0) {
            return;
        }
        h.z("Failed to create native pointer.");
    }

    public BarhopperProto$BarhopperResponse recognize(int i14, int i15, int i16, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j8 = this.nativePointer;
        if (j8 != 0) {
            return toProto(recognizeStridedNative(j8, i14, i15, i16, bArr, recognitionOptions));
        }
        h.z("Native pointer does not exist.");
        return null;
    }

    public BarhopperProto$BarhopperResponse recognize(int i14, int i15, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j8 = this.nativePointer;
        if (j8 != 0) {
            return toProto(recognizeBufferNative(j8, i14, i15, byteBuffer, recognitionOptions));
        }
        h.z("Native pointer does not exist.");
        return null;
    }

    public BarhopperProto$BarhopperResponse recognize(int i14, int i15, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j8 = this.nativePointer;
        if (j8 != 0) {
            return toProto(recognizeNative(j8, i14, i15, bArr, recognitionOptions));
        }
        h.z("Native pointer does not exist.");
        return null;
    }

    public BarhopperProto$BarhopperResponse recognize(int i14, int i15, int i16, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j8 = this.nativePointer;
        if (j8 != 0) {
            return toProto(recognizeStridedBufferNative(j8, i14, i15, i16, byteBuffer, recognitionOptions));
        }
        h.z("Native pointer does not exist.");
        return null;
    }
}
