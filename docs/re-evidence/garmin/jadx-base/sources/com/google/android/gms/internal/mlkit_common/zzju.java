package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzju implements ObjectEncoder {
    static final zzju zza = new zzju();

    static {
        a.g(12, a.c(11, a.c(10, a.c(9, a.c(8, a.c(7, a.c(6, a.c(5, a.c(4, a.c(3, a.c(2, a.c(1, FieldDescriptor.builder("deviceInfo"), "nnapiInfo"), "gpuInfo"), "pipelineIdentifier"), "acceptedConfigurations"), "action"), "status"), "customErrors"), "benchmarkStatus"), "validationTestResult"), "timestampUs"), "elapsedUs"));
    }

    private zzju() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
