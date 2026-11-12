package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzeq implements ObjectEncoder {
    static final zzeq zza = new zzeq();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("hash"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = a.s(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = a.s(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = a.s(9, FieldDescriptor.builder("isManifestModel"));

    private zzeq() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
