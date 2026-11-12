package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzgh implements ObjectEncoder {
    static final zzgh zza = new zzgh();
    private static final FieldDescriptor zzb = a.d(1, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzc = a.d(2, FieldDescriptor.builder("isDownloaded"));
    private static final FieldDescriptor zzd = a.d(3, FieldDescriptor.builder("modelName"));

    private zzgh() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        zzmj zzmjVar = (zzmj) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzmjVar.zza());
        objectEncoderContext2.add(zzc, zzmjVar.zzb());
        objectEncoderContext2.add(zzd, (Object) null);
    }
}
