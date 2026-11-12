package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzge implements ObjectEncoder {
    static final zzge zza = new zzge();

    static {
        a.g(10, a.c(9, a.c(8, a.c(7, a.c(6, a.c(5, a.c(4, a.c(3, a.c(2, a.c(1, FieldDescriptor.builder("durationMs"), "errorCode"), "isColdCall"), "autoManageModelOnBackground"), "autoManageModelOnLowMemory"), "isNnApiEnabled"), "eventsCount"), "otherErrors"), "remoteConfigValueForAcceleration"), "isAccelerated"));
    }

    private zzge() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
