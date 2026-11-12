package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzgp implements ObjectEncoder {
    static final zzgp zza = new zzgp();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("deviceInfo"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("nnapiInfo"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("gpuInfo"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("pipelineIdentifier"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("acceptedConfigurations"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("action"));
    private static final FieldDescriptor zzh = a.s(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = a.s(8, FieldDescriptor.builder("customErrors"));
    private static final FieldDescriptor zzj = a.s(9, FieldDescriptor.builder("benchmarkStatus"));
    private static final FieldDescriptor zzk = a.s(10, FieldDescriptor.builder("validationTestResult"));
    private static final FieldDescriptor zzl = a.s(11, FieldDescriptor.builder("timestampUs"));
    private static final FieldDescriptor zzm = a.s(12, FieldDescriptor.builder("elapsedUs"));

    private zzgp() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
