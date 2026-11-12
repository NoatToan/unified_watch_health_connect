package com.google.mlkit.vision.barcode;

import com.google.android.gms.common.internal.Objects;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class BarcodeScannerOptions {
    private final int zza;
    private final boolean zzb;
    private final Executor zzc;
    private final ZoomSuggestionOptions zzd;

    public static class Builder {
        private int zza = 0;
        private boolean zzb;
        private Executor zzc;
        private ZoomSuggestionOptions zzd;

        public BarcodeScannerOptions build() {
            return new BarcodeScannerOptions(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        public Builder enableAllPotentialBarcodes() {
            this.zzb = true;
            return this;
        }

        public Builder setBarcodeFormats(@Barcode.BarcodeFormat int i14, @Barcode.BarcodeFormat int... iArr) {
            this.zza = i14;
            if (iArr != null) {
                for (int i15 : iArr) {
                    this.zza = i15 | this.zza;
                }
            }
            return this;
        }

        public Builder setExecutor(Executor executor) {
            this.zzc = executor;
            return this;
        }

        public Builder setZoomSuggestionOptions(ZoomSuggestionOptions zoomSuggestionOptions) {
            this.zzd = zoomSuggestionOptions;
            return this;
        }
    }

    public /* synthetic */ BarcodeScannerOptions(int i14, boolean z14, Executor executor, ZoomSuggestionOptions zoomSuggestionOptions, zza zzaVar) {
        this.zza = i14;
        this.zzb = z14;
        this.zzc = executor;
        this.zzd = zoomSuggestionOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BarcodeScannerOptions)) {
            return false;
        }
        BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
        return this.zza == barcodeScannerOptions.zza && this.zzb == barcodeScannerOptions.zzb && Objects.equal(this.zzc, barcodeScannerOptions.zzc) && Objects.equal(this.zzd, barcodeScannerOptions.zzd);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Boolean.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zza;
    }

    public final ZoomSuggestionOptions zzb() {
        return this.zzd;
    }

    public final Executor zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzb;
    }
}
