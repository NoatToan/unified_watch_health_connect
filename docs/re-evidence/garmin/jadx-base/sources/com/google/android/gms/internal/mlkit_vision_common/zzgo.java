package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzgo implements ObjectEncoder {
    static final zzgo zza = new zzgo();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("pipelineNamespace"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("clientLibraryName"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("clientLibraryVersion"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("minClientLibraryVersion"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("maxClientLibraryVersion"));
    private static final FieldDescriptor zzh = a.s(7, FieldDescriptor.builder("sourceProduct"));

    private zzgo() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
