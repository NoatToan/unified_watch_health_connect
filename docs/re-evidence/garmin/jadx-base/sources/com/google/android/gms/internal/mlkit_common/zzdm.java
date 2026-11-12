package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzdm implements ObjectEncoder {
    static final zzdm zza = new zzdm();

    static {
        a.g(3, a.c(2, a.c(1, FieldDescriptor.builder("logEventKey"), "eventCount"), "inferenceDurationStats"));
    }

    private zzdm() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
