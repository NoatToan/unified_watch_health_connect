package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzhu implements ObjectEncoder {
    static final zzhu zza = new zzhu();

    static {
        a.g(3, a.c(2, a.c(1, FieldDescriptor.builder("textEnhancementParam"), "autoWhiteBalanceEnabled"), "lightnessEnhancementParam"));
    }

    private zzhu() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
