package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzcs implements ObjectEncoder {
    static final zzcs zza = new zzcs();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("logEventKey"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("eventCount"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("inferenceDurationStats"));

    private zzcs() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
