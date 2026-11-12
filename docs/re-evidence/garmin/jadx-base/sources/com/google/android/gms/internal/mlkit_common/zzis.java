package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzis implements ObjectEncoder {
    static final zzis zza = new zzis();

    static {
        a.g(4, a.c(3, a.c(2, a.c(1, FieldDescriptor.builder("inferenceCommonLogEvent"), "options"), "identifyLanguageResult"), "identifyPossibleLanguagesResult"));
    }

    private zzis() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
