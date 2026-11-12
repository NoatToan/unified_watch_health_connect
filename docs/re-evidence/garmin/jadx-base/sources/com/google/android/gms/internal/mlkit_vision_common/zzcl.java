package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzcl implements ObjectEncoder {
    static final zzcl zza = new zzcl();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("options"));

    private zzcl() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
