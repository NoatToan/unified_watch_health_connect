package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzhv implements ObjectEncoder {
    static final zzhv zza = new zzhv();

    static {
        a.g(4, a.c(3, a.c(2, a.c(1, FieldDescriptor.builder("durationMs"), "errorCode"), "options"), "pageCount"));
    }

    private zzhv() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
