package com.google.mlkit.vision.common.internal;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.common.InputImage;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class BitmapInStreamingChecker {
    private static final GmsLogger zza = new GmsLogger("StreamingFormatChecker", "");
    private final LinkedList zzb = new LinkedList();
    private long zzc = -1;

    @KeepForSdk
    public void check(InputImage inputImage) {
        if (inputImage.getFormat() != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.zzb.add(Long.valueOf(jElapsedRealtime));
        if (this.zzb.size() > 5) {
            this.zzb.removeFirst();
        }
        if (this.zzb.size() != 5 || jElapsedRealtime - ((Long) Preconditions.checkNotNull((Long) this.zzb.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j8 = this.zzc;
        if (j8 == -1 || jElapsedRealtime - j8 >= 5000) {
            this.zzc = jElapsedRealtime;
            zza.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
