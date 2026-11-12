package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.lifecycle.a1;
import androidx.lifecycle.b0;
import androidx.lifecycle.m0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.vision.common.InputImage;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class MobileVisionBase<DetectionResultT> implements Closeable, m0 {
    public static final /* synthetic */ int zza = 0;
    private static final GmsLogger zzb = new GmsLogger("MobileVisionBase", "");
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private final MLTask zzd;
    private final CancellationTokenSource zze;
    private final Executor zzf;
    private final Task zzg;

    @KeepForSdk
    public MobileVisionBase(MLTask<DetectionResultT, InputImage> mLTask, Executor executor) {
        this.zzd = mLTask;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.zze = cancellationTokenSource;
        this.zzf = executor;
        mLTask.pin();
        this.zzg = mLTask.callAfterLoad(executor, new Callable() { // from class: com.google.mlkit.vision.common.internal.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i14 = MobileVisionBase.zza;
                return null;
            }
        }, cancellationTokenSource.getToken()).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.vision.common.internal.zzc
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                MobileVisionBase.zzb.e("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    @KeepForSdk
    @a1(b0.a.ON_DESTROY)
    public synchronized void close() {
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zze.cancel();
        this.zzd.unpin(this.zzf);
    }

    @KeepForSdk
    public synchronized Task<Void> closeWithTask() {
        if (this.zzc.getAndSet(true)) {
            return Tasks.forResult(null);
        }
        this.zze.cancel();
        return this.zzd.unpinWithTask(this.zzf);
    }

    @KeepForSdk
    public synchronized Task<Void> getInitTaskBase() {
        return this.zzg;
    }

    @KeepForSdk
    public Task<DetectionResultT> process(Bitmap bitmap, int i14) {
        return processBase(InputImage.fromBitmap(bitmap, i14));
    }

    @KeepForSdk
    public synchronized Task<DetectionResultT> processBase(final MlImage mlImage) {
        Preconditions.checkNotNull(mlImage, "MlImage can not be null");
        if (this.zzc.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        }
        if (mlImage.getWidth() < 32 || mlImage.getHeight() < 32) {
            return Tasks.forException(new MlKitException("MlImage width and height should be at least 32!", 3));
        }
        mlImage.getInternal().acquire();
        return this.zzd.callAfterLoad(this.zzf, new Callable() { // from class: com.google.mlkit.vision.common.internal.zzd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb(mlImage);
            }
        }, this.zze.getToken()).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.mlkit.vision.common.internal.zze
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                MlImage mlImage2 = mlImage;
                int i14 = MobileVisionBase.zza;
                mlImage2.close();
            }
        });
    }

    public final /* synthetic */ Object zza(InputImage inputImage) {
        zzlx zzlxVarZze = zzlx.zze("detectorTaskWithResource#run");
        zzlxVarZze.zzb();
        try {
            Object objRun = this.zzd.run(inputImage);
            zzlxVarZze.close();
            return objRun;
        } catch (Throwable th3) {
            try {
                zzlxVarZze.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    public final /* synthetic */ Object zzb(MlImage mlImage) throws MlKitException {
        InputImage inputImageConvertMlImagetoInputImage = CommonConvertUtils.convertMlImagetoInputImage(mlImage);
        if (inputImageConvertMlImagetoInputImage != null) {
            return this.zzd.run(inputImageConvertMlImagetoInputImage);
        }
        throw new MlKitException("Current type of MlImage is not supported.", 13);
    }

    @KeepForSdk
    public Task<DetectionResultT> process(Image image, int i14) {
        return processBase(InputImage.fromMediaImage(image, i14));
    }

    @KeepForSdk
    public Task<DetectionResultT> process(Image image, int i14, Matrix matrix) {
        return processBase(InputImage.fromMediaImage(image, i14, matrix));
    }

    @KeepForSdk
    public Task<DetectionResultT> process(ByteBuffer byteBuffer, int i14, int i15, int i16, int i17) {
        return processBase(InputImage.fromByteBuffer(byteBuffer, i14, i15, i16, i17));
    }

    @KeepForSdk
    public synchronized Task<DetectionResultT> processBase(final InputImage inputImage) {
        Preconditions.checkNotNull(inputImage, "InputImage can not be null");
        if (this.zzc.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        }
        if (inputImage.getWidth() >= 32 && inputImage.getHeight() >= 32) {
            return this.zzd.callAfterLoad(this.zzf, new Callable() { // from class: com.google.mlkit.vision.common.internal.zza
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zza(inputImage);
                }
            }, this.zze.getToken());
        }
        return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
    }
}
