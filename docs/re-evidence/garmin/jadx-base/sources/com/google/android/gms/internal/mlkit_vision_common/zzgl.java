package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzgl implements ObjectEncoder {
    static final zzgl zza = new zzgl();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("inputLength"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("outputLength"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("loadDictionaryErrorCode"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("translateResultStatusCode"));
    private static final FieldDescriptor zzh = a.s(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = a.s(8, FieldDescriptor.builder("downloadHttpResponseCode"));

    private zzgl() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
