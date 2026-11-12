package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzkj implements ObjectEncoder {
    static final zzkj zza = new zzkj();

    static {
        com.google.android.gms.internal.measurement.a.p(2, com.google.android.gms.internal.measurement.a.n(1, FieldDescriptor.builder("scoreType"), FirebaseAnalytics.Param.SCORE));
    }

    private zzkj() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
