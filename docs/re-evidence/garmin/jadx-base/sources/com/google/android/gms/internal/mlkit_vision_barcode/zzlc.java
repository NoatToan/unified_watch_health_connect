package com.google.android.gms.internal.mlkit_vision_barcode;

import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes14.dex */
final class zzlc implements ObjectEncoder {
    static final zzlc zza = new zzlc();

    static {
        com.google.android.gms.internal.measurement.a.p(4, com.google.android.gms.internal.measurement.a.n(3, com.google.android.gms.internal.measurement.a.n(2, com.google.android.gms.internal.measurement.a.n(1, FieldDescriptor.builder("name"), NotificationConstants.KEY_DATA_MIME_TYPE), "version"), "featureLevel"));
    }

    private zzlc() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw null;
    }
}
