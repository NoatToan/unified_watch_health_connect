package com.google.android.gms.internal.mlkit_vision_barcode;

import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzjn implements ObjectEncoder {
    static final zzjn zza = new zzjn();

    static {
        com.google.android.gms.internal.measurement.a.p(2, com.google.android.gms.internal.measurement.a.n(1, FieldDescriptor.builder(NotificationConstants.KEY_DATA_MIME_TYPE), "dims"));
    }

    private zzjn() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
