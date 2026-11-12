package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzfk implements ObjectEncoder {
    static final zzfk zza = new zzfk();
    private static final FieldDescriptor zzb = a.d(1, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzc = a.d(2, FieldDescriptor.builder("isSuccessful"));
    private static final FieldDescriptor zzd = a.d(3, FieldDescriptor.builder("modelName"));

    private zzfk() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzlo zzloVar = (zzlo) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzloVar.zza());
        objectEncoderContext2.add(zzc, zzloVar.zzb());
        objectEncoderContext2.add(zzd, (Object) null);
    }
}
