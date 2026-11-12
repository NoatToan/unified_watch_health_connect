package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzfs implements ObjectEncoder {
    static final zzfs zza = new zzfs();

    static {
        a.g(15, a.c(14, a.c(13, a.c(12, a.c(11, a.c(10, a.c(9, a.c(8, a.c(7, a.c(6, a.c(5, a.c(4, a.c(3, a.c(2, a.c(1, FieldDescriptor.builder("initialImageUriCount"), "defaultCaptureMode"), "flashModeChangeAllowed"), "galleryImportAllowed"), "multiPageAllowed"), "filterAllowed"), "targetResolutionWidth"), "targetResolutionHeight"), "resultFormats"), "pageEditListenerSet"), "shadowRemovalAllowed"), "stainRemovalAllowed"), "enableAllNewFeaturesByDefault"), "pageLimitMax"), "enableGalleryImportAutoTransform"));
    }

    private zzfs() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
