package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzec implements ObjectEncoder {
    static final zzec zza = new zzec();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("renderer"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("vendor"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("maxImages"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("maxSsbo"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("workGroupSizes"));
    private static final FieldDescriptor zzh = a.s(7, FieldDescriptor.builder("errorCode"));

    private zzec() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
