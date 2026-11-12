package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzcz implements ObjectEncoder {
    static final zzcz zza = new zzcz();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("cameraSource"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("eventType"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("requestedPreviewHeight"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("requestedPreviewWidth"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("actualPreviewHeight"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("actualPreviewWidth"));

    private zzcz() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
