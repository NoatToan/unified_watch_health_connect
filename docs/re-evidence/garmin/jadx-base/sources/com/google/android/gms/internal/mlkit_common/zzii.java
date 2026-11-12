package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzii implements ObjectEncoder {
    static final zzii zza = new zzii();

    static {
        a.g(6, a.c(5, a.c(4, a.c(2, a.c(1, FieldDescriptor.builder("inferenceCommonLogEvent"), "imageInfo"), "captionCount"), "highestScore"), "imageType"));
    }

    private zzii() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
