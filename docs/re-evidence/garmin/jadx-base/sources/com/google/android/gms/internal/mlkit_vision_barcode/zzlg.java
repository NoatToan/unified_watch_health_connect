package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzlg implements ObjectEncoder {
    static final zzlg zza = new zzlg();
    private static final FieldDescriptor zzb = com.google.android.gms.internal.measurement.a.o(1, FieldDescriptor.builder("errorCode"));

    private zzlg() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(zzb, ((zzru) obj).zza());
    }
}
