package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzdo implements ObjectEncoder {
    static final zzdo zza = new zzdo();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("errorCode"));

    private zzdo() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
