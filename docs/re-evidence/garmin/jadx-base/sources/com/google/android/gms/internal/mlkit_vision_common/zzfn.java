package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzfn implements ObjectEncoder {
    static final zzfn zza = new zzfn();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("labelCount"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("highestConfidence"));

    private zzfn() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
