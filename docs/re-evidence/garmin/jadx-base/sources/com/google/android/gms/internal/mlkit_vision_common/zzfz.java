package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzfz implements ObjectEncoder {
    static final zzfz zza = new zzfz();
    private static final FieldDescriptor zzb = a.s(1, FieldDescriptor.builder("detectorMode"));
    private static final FieldDescriptor zzc = a.s(2, FieldDescriptor.builder("multipleObjectsEnabled"));
    private static final FieldDescriptor zzd = a.s(3, FieldDescriptor.builder("classificationEnabled"));
    private static final FieldDescriptor zze = a.s(4, FieldDescriptor.builder("maxPerObjectLabelCount"));
    private static final FieldDescriptor zzf = a.s(5, FieldDescriptor.builder("classificationConfidenceThreshold"));
    private static final FieldDescriptor zzg = a.s(6, FieldDescriptor.builder("customLocalModelOptions"));

    private zzfz() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
