package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.nimbusds.jose.jwk.JWKParameterNames;

/* JADX INFO: loaded from: classes14.dex */
final class zzjw implements ObjectEncoder {
    static final zzjw zza = new zzjw();

    static {
        a.g(2, a.c(1, FieldDescriptor.builder("x"), JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE));
    }

    private zzjw() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
