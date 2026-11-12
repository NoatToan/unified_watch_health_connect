package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzbt implements ObjectEncoder {
    static final zzbt zza = new zzbt();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("handledErrors"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("partiallyHandledErrors"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("unhandledErrors"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("modelNamespace"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("delegateFilter"));
    private static final FieldDescriptor zzh = a.s(7, FieldDescriptor.builder("httpResponseCode"));

    private zzbt() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
