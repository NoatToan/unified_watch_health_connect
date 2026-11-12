package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzex implements ObjectEncoder {
    static final zzex zza = new zzex();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("category"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("classificationConfidence"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("trackingId"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("labelCount"));

    private zzex() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
