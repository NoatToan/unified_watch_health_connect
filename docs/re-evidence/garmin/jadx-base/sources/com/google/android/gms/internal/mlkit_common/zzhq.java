package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzhq implements ObjectEncoder {
    static final zzhq zza = new zzhq();

    static {
        a.g(7, a.c(6, a.c(5, a.c(4, a.c(3, a.c(2, a.c(1, FieldDescriptor.builder("inferenceCommonLogEvent"), "options"), "imageInfo"), "documentPresenceConfidence"), "documentCornerConfidence"), "documentRotationSuggestionDegrees"), "documentRotationSuggestionConfidence"));
    }

    private zzhq() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
